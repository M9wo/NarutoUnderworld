package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.village.Village;
import net.minecraft.world.World;

public class EarthReleaseEarthGolemEntity extends EntityTameable {
  private int homeCheckTimer;
  
  Village villageObj;
  
  private int attackTimer;
  
  private int holdRoseTick;
  
  private static final String __OBFID = "CL_00001652";
  
  public EarthReleaseEarthGolemEntity(World p_i1694_1_) {
    super(p_i1694_1_);
    setSize(1.4F, 2.9F);
    getNavigator().setAvoidsWater(true);
    this.tasks.addTask(1, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, 1.0D, true));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIMoveTowardsTarget((EntityCreature)this, 0.9D, 32.0F));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 0.6D, true));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIMoveTowardsRestriction((EntityCreature)this, 1.0D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWander((EntityCreature)this, 0.6D));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 6.0F));
    this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.tasks.addTask(9, (EntityAIBase)new EntityAILeapAtTarget((EntityLiving)this, 0.4F));
    this.tasks.addTask(10, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, 2.0D, true));
    this.tasks.addTask(11, (EntityAIBase)new EntityAIFollowOwner(this, 1.0D, 10.0F, 5.0F));
    this.targetTasks.addTask(2, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(6, (EntityAIBase)new EntityAIOwnerHurtByTarget(this));
    this.targetTasks.addTask(7, (EntityAIBase)new EntityAIOwnerHurtTarget(this));
  }
  
  protected void entityInit() {
    super.entityInit();
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  protected void updateAITick() {
    if (--this.homeCheckTimer <= 0) {
      this.homeCheckTimer = 70 + this.rand.nextInt(50);
      this.villageObj = this.worldObj.villageCollectionObj.findNearestVillage(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ), 32);
      if (this.villageObj == null) {
        detachHome();
      } else {
        ChunkCoordinates chunkcoordinates = this.villageObj.getCenter();
        setHomeArea(chunkcoordinates.posX, chunkcoordinates.posY, chunkcoordinates.posZ, (int)(this.villageObj.getVillageRadius() * 0.6F));
      } 
    } 
    super.updateAITick();
  }
  
  public void onKillEntity(EntityLivingBase p_70074_1_) {
    super.onKillEntity(p_70074_1_);
    if (getOwner() != null && getOwner() instanceof EntityPlayer && !(p_70074_1_ instanceof EntityCreature)) {
      EntityPlayer owner = (EntityPlayer)getOwner();
      ExtendedPlayer props = ExtendedPlayer.get(owner);
      props.setChakraExperience(props.getChakraExperience() + 1);
      PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage(owner), (EntityPlayerMP)owner);
    } 
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(60.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.45D);
  }
  
  protected int decreaseAirSupply(int p_70682_1_) {
    return p_70682_1_;
  }
  
  protected void collideWithEntity(Entity p_82167_1_) {
    if (p_82167_1_ instanceof net.minecraft.entity.monster.IMob && getRNG().nextInt(20) == 0)
      setAttackTarget((EntityLivingBase)p_82167_1_); 
    super.collideWithEntity(p_82167_1_);
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
    if (this.attackTimer > 0)
      this.attackTimer--; 
    if (this.holdRoseTick > 0)
      this.holdRoseTick--; 
    if (this.ticksExisted == 6000)
      setDead(); 
    if (this.motionX * this.motionX + this.motionZ * this.motionZ > 2.500000277905201E-7D && this.rand.nextInt(5) == 0) {
      int i = MathHelper.floor_double(this.posX);
      int j = MathHelper.floor_double(this.posY - 0.20000000298023224D - this.yOffset);
      int k = MathHelper.floor_double(this.posZ);
      Block block = this.worldObj.getBlock(i, j, k);
      if (block.getMaterial() != Material.air)
        this.worldObj.spawnParticle("blockcrack_" + Block.getIdFromBlock(block) + "_" + this.worldObj.getBlockMetadata(i, j, k), this.posX + (this.rand.nextFloat() - 0.5D) * this.width, this.boundingBox.minY + 0.1D, this.posZ + (this.rand.nextFloat() - 0.5D) * this.width, 4.0D * (this.rand.nextFloat() - 0.5D), 0.5D, (this.rand.nextFloat() - 0.5D) * 4.0D); 
    } 
  }
  
  public boolean canAttackClass(Class p_70686_1_) {
    return (isPlayerCreated() && EntityPlayer.class.isAssignableFrom(p_70686_1_)) ? false : super.canAttackClass(p_70686_1_);
  }
  
  public void writeEntityToNBT(NBTTagCompound p_70014_1_) {
    super.writeEntityToNBT(p_70014_1_);
    p_70014_1_.setBoolean("PlayerCreated", isPlayerCreated());
  }
  
  public void readEntityFromNBT(NBTTagCompound p_70037_1_) {
    super.readEntityFromNBT(p_70037_1_);
    setPlayerCreated(p_70037_1_.getBoolean("PlayerCreated"));
  }
  
  public boolean attackEntityAsMob(Entity p_70652_1_) {
    this.attackTimer = 10;
    this.worldObj.setEntityState((Entity)this, (byte)4);
    boolean flag = p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), (3 + this.rand.nextInt(1)));
    if (flag)
      p_70652_1_.motionY += 0.4000000059604645D; 
    playSound("mob.irongolem.throw", 1.0F, 1.0F);
    return flag;
  }
  
  @SideOnly(Side.CLIENT)
  public void handleHealthUpdate(byte p_70103_1_) {
    if (p_70103_1_ == 4) {
      this.attackTimer = 10;
      playSound("mob.irongolem.throw", 1.0F, 1.0F);
    } else if (p_70103_1_ == 11) {
      this.holdRoseTick = 400;
    } else {
      super.handleHealthUpdate(p_70103_1_);
    } 
  }
  
  public Village getVillage() {
    return this.villageObj;
  }
  
  @SideOnly(Side.CLIENT)
  public int getAttackTimer() {
    return this.attackTimer;
  }
  
  public void setHoldingRose(boolean p_70851_1_) {
    this.holdRoseTick = p_70851_1_ ? 400 : 0;
    this.worldObj.setEntityState((Entity)this, (byte)11);
  }
  
  protected String getHurtSound() {
    return "mob.irongolem.hit";
  }
  
  protected String getDeathSound() {
    return "mob.irongolem.death";
  }
  
  protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_) {
    playSound("mob.irongolem.walk", 1.0F, 1.0F);
  }
  
  protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {}
  
  public boolean isPlayerCreated() {
    return ((this.dataWatcher.getWatchableObjectByte(16) & 0x1) != 0);
  }
  
  public void setPlayerCreated(boolean p_70849_1_) {
    byte b0 = this.dataWatcher.getWatchableObjectByte(16);
    if (p_70849_1_) {
      this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 | 0x1)));
    } else {
      this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 & 0xFFFFFFFE)));
    } 
  }
  
  public void onDeath(DamageSource p_70645_1_) {
    if (!isPlayerCreated() && this.attackingPlayer != null && this.villageObj != null)
      this.villageObj.setReputationForPlayer(this.attackingPlayer.getCommandSenderName(), -5); 
    super.onDeath(p_70645_1_);
  }
  
  public EntityAgeable createChild(EntityAgeable p_90011_1_) {
    return null;
  }
}

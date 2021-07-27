package alcoholmod.Mathioks.Jutsu;

import java.util.Calendar;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityCrowDisguiseJutsu extends EntityTameable {
  private ChunkCoordinates spawnPosition;
  
  private static final String __OBFID = "CL_00001637";
  
  public EntityCrowDisguiseJutsu(World p_i1680_1_) {
    super(p_i1680_1_);
    this.tasks.addTask(4, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, 1.0D, true));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWander((EntityCreature)this, 1.0D));
    this.tasks.addTask(9, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIOwnerHurtByTarget(this));
    this.targetTasks.addTask(2, (EntityAIBase)new EntityAIOwnerHurtTarget(this));
    this.targetTasks.addTask(3, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
    setSize(0.5F, 0.9F);
    setIsBatHanging(true);
  }
  
  protected void entityInit() {
    super.entityInit();
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    if (par1Entity instanceof EntityLivingBase) {
      int i = 1;
      ((EntityLivingBase)par1Entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 20, 2));
      return par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), i);
    } 
    return this.hasAttacked;
  }
  
  protected float getSoundVolume() {
    return 0.1F;
  }
  
  protected float getSoundPitch() {
    return super.getSoundPitch() * 0.95F;
  }
  
  protected String getLivingSound() {
    return (getIsBatHanging() && this.rand.nextInt(4) != 0) ? null : "mob.bat.idle";
  }
  
  protected String getHurtSound() {
    return "mob.bat.hurt";
  }
  
  protected String getDeathSound() {
    return "mob.bat.death";
  }
  
  public boolean canBePushed() {
    return false;
  }
  
  protected void collideWithEntity(Entity p_82167_1_) {}
  
  protected void collideWithNearbyEntities() {}
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(2.0D);
  }
  
  public boolean getIsBatHanging() {
    return ((this.dataWatcher.getWatchableObjectByte(16) & 0x1) != 0);
  }
  
  public void setIsBatHanging(boolean p_82236_1_) {
    byte b0 = this.dataWatcher.getWatchableObjectByte(16);
    if (p_82236_1_) {
      this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 | 0x1)));
    } else {
      this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 & 0xFFFFFFFE)));
    } 
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onUpdate() {
    if (this.ticksExisted >= 130)
      setDead(); 
    super.onUpdate();
    this.motionX = this.motionY = this.motionZ = 0.0D;
    this.posY = MathHelper.floor_double(this.posY) + 1.0D - this.height;
    this.motionY *= 0.6000000238418579D;
  }
  
  protected void updateAITasks() {
    super.updateAITasks();
    if (getIsBatHanging()) {
      if (!this.worldObj.getBlock(MathHelper.floor_double(this.posX), (int)this.posY + 1, MathHelper.floor_double(this.posZ)).isNormalCube()) {
        setIsBatHanging(false);
        this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1015, (int)this.posX, (int)this.posY, (int)this.posZ, 0);
      } else {
        if (this.rand.nextInt(200) == 0)
          this.rotationYawHead = this.rand.nextInt(360); 
        if (this.worldObj.getClosestPlayerToEntity((Entity)this, 4.0D) != null) {
          setIsBatHanging(false);
          this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1015, (int)this.posX, (int)this.posY, (int)this.posZ, 0);
        } 
      } 
    } else {
      if (this.spawnPosition != null && (!this.worldObj.isAirBlock(this.spawnPosition.posX, this.spawnPosition.posY, this.spawnPosition.posZ) || this.spawnPosition.posY < 1))
        this.spawnPosition = null; 
      if (this.spawnPosition == null || this.rand.nextInt(30) == 0 || this.spawnPosition.getDistanceSquared((int)this.posX, (int)this.posY, (int)this.posZ) < 4.0F)
        this.spawnPosition = new ChunkCoordinates((int)this.posX + this.rand.nextInt(7) - this.rand.nextInt(7), (int)this.posY + this.rand.nextInt(6) - 2, (int)this.posZ + this.rand.nextInt(7) - this.rand.nextInt(7)); 
      double d0 = this.spawnPosition.posX + 0.5D - this.posX;
      double d1 = this.spawnPosition.posY + 0.1D - this.posY;
      double d2 = this.spawnPosition.posZ + 0.5D - this.posZ;
      this.motionX += (Math.signum(d0) * 0.5D - this.motionX) * 0.10000000149011612D;
      this.motionY += (Math.signum(d1) * 0.699999988079071D - this.motionY) * 0.10000000149011612D;
      this.motionZ += (Math.signum(d2) * 0.5D - this.motionZ) * 0.10000000149011612D;
      float f = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
      float f1 = MathHelper.wrapAngleTo180_float(f - this.rotationYaw);
      this.moveForward = 0.5F;
      this.rotationYaw += f1;
      if (this.rand.nextInt(100) == 0 && this.worldObj.getBlock(MathHelper.floor_double(this.posX), (int)this.posY + 1, MathHelper.floor_double(this.posZ)).isNormalCube())
        setIsBatHanging(true); 
    } 
  }
  
  protected boolean canTriggerWalking() {
    return false;
  }
  
  protected void fall(float p_70069_1_) {}
  
  protected void updateFallState(double p_70064_1_, boolean p_70064_3_) {}
  
  public boolean doesEntityNotTriggerPressurePlate() {
    return true;
  }
  
  public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
    if (isEntityInvulnerable())
      return false; 
    if (!this.worldObj.isRemote && getIsBatHanging())
      setIsBatHanging(false); 
    return super.attackEntityFrom(p_70097_1_, p_70097_2_);
  }
  
  public void readEntityFromNBT(NBTTagCompound p_70037_1_) {
    super.readEntityFromNBT(p_70037_1_);
    this.dataWatcher.updateObject(16, Byte.valueOf(p_70037_1_.getByte("BatFlags")));
  }
  
  public void writeEntityToNBT(NBTTagCompound p_70014_1_) {
    super.writeEntityToNBT(p_70014_1_);
    p_70014_1_.setByte("BatFlags", this.dataWatcher.getWatchableObjectByte(16));
  }
  
  public boolean getCanSpawnHere() {
    int i = MathHelper.floor_double(this.boundingBox.minY);
    if (i >= 63)
      return false; 
    int j = MathHelper.floor_double(this.posX);
    int k = MathHelper.floor_double(this.posZ);
    int l = this.worldObj.getBlockLightValue(j, i, k);
    byte b0 = 4;
    Calendar calendar = this.worldObj.getCurrentDate();
    if ((calendar.get(2) + 1 == 10 && calendar.get(5) >= 20) || (calendar.get(2) + 1 == 11 && calendar.get(5) <= 3)) {
      b0 = 7;
    } else if (this.rand.nextBoolean()) {
      return false;
    } 
    return (l > this.rand.nextInt(b0)) ? false : super.getCanSpawnHere();
  }
  
  public EntityAgeable createChild(EntityAgeable p_90011_1_) {
    return null;
  }
  
  public boolean canAttackClass(Class par1Class) {
    return true;
  }
}

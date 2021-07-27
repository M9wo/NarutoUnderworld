package alcoholmod.Mathioks.FinalBijuu;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.Final.CT.BijuuBombEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntitySonGoku extends EntityMob implements IMob, IBossDisplayData {
  public int courseChangeCooldown;
  
  public double waypointX;
  
  public double waypointY;
  
  public double waypointZ;
  
  private Entity targetedEntity;
  
  private int aggroCooldown;
  
  public int prevAttackCounter;
  
  public int attackCounter;
  
  private int explosionStrength = 1;
  
  public int deathTicks;
  
  private boolean Susanoo = false;
  
  private boolean SusanooBuffs = false;
  
  private static final String __OBFID = "CL_00001689";
  
  Random rand = new Random();
  
  public EntitySonGoku(World p_i1735_1_) {
    super(p_i1735_1_);
    setSize(10.6F, 7.8F);
    this.experienceValue = 500;
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, EntityPlayer.class, 0.4D, false));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIMoveTowardsRestriction((EntityCreature)this, 0.4D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWander((EntityCreature)this, 0.4D));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(7, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
    this.targetTasks.addTask(2, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityPlayer.class, 0, true));
  }
  
  @SideOnly(Side.CLIENT)
  public boolean func_110182_bF() {
    return (this.dataWatcher.getWatchableObjectByte(16) != 0);
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
    return isEntityInvulnerable() ? false : super.attackEntityFrom(p_70097_1_, p_70097_2_);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(16, Byte.valueOf((byte)0));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10000.0D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(45.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.7D);
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
    float var4 = 1.0F;
    int i = (int)(par2EntityLivingBase.prevPosX + (par2EntityLivingBase.posX - par2EntityLivingBase.prevPosX) * var4);
    int j = (int)(par2EntityLivingBase.prevPosY + (par2EntityLivingBase.posY - par2EntityLivingBase.prevPosY) * var4 + 1.62D - par2EntityLivingBase.yOffset);
    int k = (int)(par2EntityLivingBase.prevPosZ + (par2EntityLivingBase.posZ - par2EntityLivingBase.prevPosZ) * var4);
    par1ItemStack.damageItem(1, par3EntityLivingBase);
    par2EntityLivingBase.addVelocity((-MathHelper.sin(par3EntityLivingBase.rotationYaw * 3.141593F / 180.0F) * j * 0.5F) / 8.0D, 0.1D, (MathHelper.cos(par3EntityLivingBase.rotationYaw * 3.141593F / 180.0F) * j * 0.5F) / 8.0D);
    return true;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.rand.nextInt(100) == 0 && !this.worldObj.isRemote && this.attackingPlayer != null)
      this.attackingPlayer.addVelocity(this.rand.nextFloat() - 0.5D, 0.8D, this.rand.nextFloat() - 0.5D); 
    this.prevAttackCounter = this.attackCounter;
    if (this.targetedEntity != null && this.targetedEntity.isDead)
      this.targetedEntity = null; 
    if (this.targetedEntity == null || this.aggroCooldown-- <= 0) {
      this.targetedEntity = (Entity)this.worldObj.getClosestVulnerablePlayerToEntity((Entity)this, 100.0D);
      if (this.targetedEntity != null)
        this.aggroCooldown = 20; 
    } 
    double d4 = 64.0D;
    if (this.targetedEntity != null && this.targetedEntity.getDistanceSqToEntity((Entity)this) < d4 * d4) {
      double d5 = this.targetedEntity.posX - this.posX;
      double d6 = this.targetedEntity.boundingBox.minY + (this.targetedEntity.height / 2.0F) - this.posY + (this.height / 2.0F);
      double d7 = this.targetedEntity.posZ - this.posZ;
      this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(d5, d7)) * 180.0F / 3.1415927F;
      if (canEntityBeSeen(this.targetedEntity)) {
        if (this.attackCounter == 10);
        this.attackCounter++;
        if (this.attackCounter == 100) {
          BijuuBombEntity entitylargefireball = new BijuuBombEntity(this.worldObj, (EntityLivingBase)this);
          entitylargefireball.level = 1;
          double d8 = 4.0D;
          Vec3 vec3 = getLook(1.0F);
          entitylargefireball.posX = this.posX + vec3.xCoord * d8;
          entitylargefireball.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitylargefireball.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitylargefireball);
        } 
        if (this.attackCounter == 400) {
          BijuuBombEntity entitylargefireball = new BijuuBombEntity(this.worldObj, (EntityLivingBase)this);
          entitylargefireball.level = 2;
          double d8 = 4.0D;
          Vec3 vec3 = getLook(1.0F);
          entitylargefireball.posX = this.posX + vec3.xCoord * d8;
          entitylargefireball.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitylargefireball.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitylargefireball);
        } 
        if (this.attackCounter == 700) {
          BijuuBombEntity entitylargefireball = new BijuuBombEntity(this.worldObj, (EntityLivingBase)this);
          entitylargefireball.level = 3;
          double d8 = 4.0D;
          Vec3 vec3 = getLook(1.0F);
          entitylargefireball.posX = this.posX + vec3.xCoord * d8;
          entitylargefireball.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitylargefireball.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitylargefireball);
        } 
        if (this.attackCounter == 1000);
        if (this.attackCounter == 1300);
        if (this.attackCounter == 1700) {
          BijuuBombEntity entitylargefireball = new BijuuBombEntity(this.worldObj, (EntityLivingBase)this);
          entitylargefireball.level = 3;
          double d8 = 4.0D;
          Vec3 vec3 = getLook(1.0F);
          entitylargefireball.posX = this.posX + vec3.xCoord * d8;
          entitylargefireball.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitylargefireball.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitylargefireball);
          this.attackCounter = -40;
        } 
      } else if (this.attackCounter > 0) {
        this.attackCounter--;
      } 
    } else {
      this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(this.motionX, this.motionZ)) * 180.0F / 3.1415927F;
      if (this.attackCounter > 0)
        this.attackCounter--; 
    } 
    if (!this.worldObj.isRemote) {
      byte b1 = this.dataWatcher.getWatchableObjectByte(16);
      byte b0 = (byte)((this.attackCounter > 10) ? 1 : 0);
      if (b1 != b0)
        this.dataWatcher.updateObject(16, Byte.valueOf(b0)); 
    } 
  }
  
  private boolean isCourseTraversable(double p_70790_1_, double p_70790_3_, double p_70790_5_, double p_70790_7_) {
    double d4 = (this.waypointX - this.posX) / p_70790_7_;
    double d5 = (this.waypointY - this.posY) / p_70790_7_;
    double d6 = (this.waypointZ - this.posZ) / p_70790_7_;
    AxisAlignedBB axisalignedbb = this.boundingBox.copy();
    for (int i = 1; i < p_70790_7_; i++) {
      axisalignedbb.offset(d4, d5, d6);
      if (!this.worldObj.getCollidingBoundingBoxes((Entity)this, axisalignedbb).isEmpty())
        return false; 
    } 
    return true;
  }
  
  protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
    dropItem(AlcoholMod.DefeatSonGoku, 1);
  }
  
  public boolean getCanSpawnHere() {
    return (this.rand.nextInt(20) == 0 && super.getCanSpawnHere() && this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL);
  }
  
  public int getMaxSpawnedInChunk() {
    return 1;
  }
  
  public void writeEntityToNBT(NBTTagCompound p_70014_1_) {
    super.writeEntityToNBT(p_70014_1_);
    p_70014_1_.setInteger("ExplosionPower", this.explosionStrength);
  }
  
  public void readEntityFromNBT(NBTTagCompound p_70037_1_) {
    super.readEntityFromNBT(p_70037_1_);
    if (p_70037_1_.hasKey("ExplosionPower", 99))
      this.explosionStrength = p_70037_1_.getInteger("ExplosionPower"); 
  }
  
  @SideOnly(Side.CLIENT)
  public void onLivingUpdate() {
    super.onLivingUpdate();
    BossStatus.setBossStatus(this, true);
  }
  
  protected void onDeathUpdate() {
    this.deathTicks++;
    if (this.deathTicks >= 180 && this.deathTicks <= 200) {
      float f = (this.rand.nextFloat() - 0.5F) * 8.0F;
      float f1 = (this.rand.nextFloat() - 0.5F) * 4.0F;
      float f2 = (this.rand.nextFloat() - 0.5F) * 8.0F;
      this.worldObj.spawnParticle("hugeexplosion", this.posX + f, this.posY + 2.0D + f1, this.posZ + f2, 0.0D, 0.0D, 0.0D);
    } 
    if (!this.worldObj.isRemote) {
      if (this.deathTicks > 150 && this.deathTicks % 5 == 0) {
        int i = 1000;
        while (i > 0) {
          int j = EntityXPOrb.getXPSplit(i);
          i -= j;
          this.worldObj.spawnEntityInWorld((Entity)new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, j));
        } 
      } 
      if (this.deathTicks == 1)
        this.worldObj.playBroadcastSound(1018, (int)this.posX, (int)this.posY, (int)this.posZ, 0); 
    } 
    moveEntity(0.0D, 0.10000000149011612D, 0.0D);
    this.renderYawOffset = this.rotationYaw += 20.0F;
    if (this.deathTicks == 200 && !this.worldObj.isRemote) {
      int i = 2000;
      while (i > 0) {
        int j = EntityXPOrb.getXPSplit(i);
        i -= j;
        this.worldObj.spawnEntityInWorld((Entity)new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, j));
      } 
      setDead();
    } 
  }
  
  protected boolean canDespawn() {
    return false;
  }
  
  protected void fall() {}
  
  public EnumCreatureAttribute getCreatureAttribute() {
    return EnumCreatureAttribute.UNDEAD;
  }
  
  @SideOnly(Side.CLIENT)
  public boolean isInRangeToRenderDist(double p_70112_1_) {
    double d1 = this.boundingBox.getAverageEdgeLength() * 12.0D;
    d1 *= 64.0D;
    return (p_70112_1_ < d1 * d1);
  }
}

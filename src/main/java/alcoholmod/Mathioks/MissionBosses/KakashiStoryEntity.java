package alcoholmod.Mathioks.MissionBosses;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncStorylineMessage;
import alcoholmod.Mathioks.Final.CT.GreatFireBallEntity;
import alcoholmod.Mathioks.NPC.EntityNinja;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
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
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class KakashiStoryEntity extends EntityNinja {
  private EntityAIAttackOnCollide aiAttackOnCollide = new EntityAIAttackOnCollide((EntityCreature)this, EntityPlayer.class, 1.2D, false);
  
  private EntityAIAttackOnCollide aiAttackOnCollide2 = new EntityAIAttackOnCollide((EntityCreature)this, EntityTameable.class, 1.2D, false);
  
  public int deathTicks;
  
  Random rand = new Random();
  
  public KakashiStoryEntity(World par1World) {
    super(par1World);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIMoveTowardsRestriction((EntityCreature)this, 1.0D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWander((EntityCreature)this, 1.0D));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(11, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityTameable.class, 8.0F));
    this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
    this.targetTasks.addTask(2, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityPlayer.class, 0, true));
    this.tasks.addTask(12, (EntityAIBase)new EntityAILeapAtTarget((EntityLiving)this, 1.0F));
    setCurrentItemOrArmor(0, new ItemStack(AlcoholMod.kunai));
    setCombatTask();
    setSize(0.6F, 1.8F);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(18, Byte.valueOf((byte)0));
    setTameSkin(this.worldObj.rand.nextInt(4));
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(50.0D);
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(250.0D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4D);
  }
  
  public void writeEntityToNBT(NBTTagCompound p_70014_1_) {
    super.writeEntityToNBT(p_70014_1_);
    p_70014_1_.setInteger("CatType", getTameSkin());
  }
  
  public void readEntityFromNBT(NBTTagCompound p_70037_1_) {
    super.readEntityFromNBT(p_70037_1_);
    setTameSkin(p_70037_1_.getInteger("CatType"));
  }
  
  public int getTameSkin() {
    return this.dataWatcher.getWatchableObjectByte(18);
  }
  
  public void setTameSkin(int p_70912_1_) {
    this.dataWatcher.updateObject(18, Byte.valueOf((byte)p_70912_1_));
  }
  
  public void setCombatTask() {
    this.tasks.removeTask((EntityAIBase)this.aiAttackOnCollide);
    this.tasks.removeTask((EntityAIBase)this.aiAttackOnCollide2);
    this.tasks.addTask(4, (EntityAIBase)this.aiAttackOnCollide);
    this.tasks.addTask(5, (EntityAIBase)this.aiAttackOnCollide2);
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.ticksExisted >= 25000)
      setDead(); 
  }
  
  protected float getSoundPitch() {
    return 0.7F;
  }
  
  protected String getHurtSound() {
    return "";
  }
  
  protected void fall() {}
  
  public EnumCreatureAttribute getCreatureAttribute() {
    return EnumCreatureAttribute.UNDEAD;
  }
  
  public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
    if (isEntityInvulnerable())
      return false; 
    Entity entity = p_70097_1_.getEntity();
    if (entity != null && !(entity instanceof EntityPlayer) && !(entity instanceof net.minecraft.entity.projectile.EntityArrow))
      p_70097_2_ = (p_70097_2_ + 1.0F) / 2.0F; 
    return super.attackEntityFrom(p_70097_1_, p_70097_2_);
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    Random rand = new Random();
    int randomNumber = rand.nextInt(1800);
    int damage = 3;
    int i = 0;
    if (randomNumber >= 1002 && randomNumber <= 1020) {
      GreatFireBallEntity entitysnowball = new GreatFireBallEntity(this.worldObj, (EntityLivingBase)this);
      double d0 = par1Entity.posX - this.posX;
      double d1 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
      double d2 = par1Entity.posZ - this.posZ;
      float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
      entitysnowball.setThrowableHeading(d0, d1 + f1, d2, 1.6F, 12.0F);
      playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
      this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
    } 
    if (randomNumber >= 200 && randomNumber <= 217) {
      ((EntityLivingBase)par1Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 25, 2));
      damage = 11;
    } 
    if (randomNumber >= 0 && randomNumber <= 20) {
      addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1000, 0));
      addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1000, 3));
      addPotionEffect(new PotionEffect(Potion.jump.id, 1000, 0));
      addPotionEffect(new PotionEffect(Potion.resistance.id, 1000, 0));
    } 
    float f = damage;
    boolean flag = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), f);
    if (flag && i > 0) {
      par1Entity.addVelocity((-MathHelper.sin(this.rotationYaw * 3.1415927F / 180.0F) * i * 0.5F), 0.1D, (MathHelper.cos(this.rotationYaw * 3.1415927F / 180.0F) * i * 0.5F));
      this.motionX *= 0.3D;
      this.motionZ *= 0.3D;
    } 
    return flag;
  }
  
  protected void onDeathUpdate() {
    this.deathTicks++;
    if (this.deathTicks >= 0 && this.deathTicks <= 1) {
      double d2 = this.rand.nextGaussian() * 0.02D;
      double d0 = this.rand.nextGaussian() * 0.02D;
      double d1 = this.rand.nextGaussian() * 0.02D;
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + 1.0D + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + 1.0D + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + 1.0D + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + 1.0D + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + 1.0D + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + 1.0D + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + 1.0D + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + 1.0D + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
      this.worldObj.spawnParticle("explode", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + 1.0D + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d2, d0, d1);
    } 
    if (this.deathTicks == 1 && !this.worldObj.isRemote)
      setDead(); 
  }
  
  public void onDeath(DamageSource par1DamageSource) {
    super.onDeath(par1DamageSource);
    if (!this.worldObj.isRemote) {
      if (par1DamageSource.getEntity() instanceof EntityPlayer) {
        if (!this.worldObj.isRemote)
          ((EntityPlayer)par1DamageSource.getEntity()).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Kakashi: Time's up, you only managed to beat my clone!")); 
        ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par1DamageSource.getEntity());
        if (props.getStoryline() == 4) {
          props.setStoryline(5);
          PacketDispatcher.sendTo((IMessage)new SyncStorylineMessage((EntityPlayer)par1DamageSource.getEntity()), (EntityPlayerMP)par1DamageSource.getEntity());
        } 
      } 
      if (par1DamageSource.getEntity() != null && par1DamageSource.getEntity() instanceof EntityTameable && ((EntityTameable)par1DamageSource.getEntity()).getOwner() != null) {
        EntityLivingBase entityTamer = ((EntityTameable)par1DamageSource.getEntity()).getOwner();
        if (entityTamer instanceof EntityPlayer) {
          if (!this.worldObj.isRemote)
            ((EntityPlayer)entityTamer).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GRAY + "Kakashi: Time's up, you only managed to beat my clone!")); 
          ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityTamer);
          if (props.getStoryline() == 4) {
            props.setStoryline(5);
            PacketDispatcher.sendTo((IMessage)new SyncStorylineMessage((EntityPlayer)entityTamer), (EntityPlayerMP)entityTamer);
          } 
        } 
      } 
    } 
  }
}

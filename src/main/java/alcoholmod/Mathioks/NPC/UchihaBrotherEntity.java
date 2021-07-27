package alcoholmod.Mathioks.NPC;

import alcoholmod.Mathioks.AddedItems;
import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.Entity.EntityGenjutsuCrows;
import alcoholmod.Mathioks.Entity.EntityTsukuyomi;
import alcoholmod.Mathioks.Final.CT.GreatFireBallEntity;
import alcoholmod.Mathioks.item.ShurikenEntity;
import alcoholmod.Mathioks.item.ShurikenSmallEntity;
import java.util.Random;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
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
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class UchihaBrotherEntity extends EntityNinja implements IRangedAttackMob {
  private EntityAIArrowAttack aiArrowAttack = new EntityAIArrowAttack(this, 1.25D, 20, 60, 15.0F);
  
  private EntityAIAttackOnCollide aiAttackOnCollide = new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.2D, false);
  
  private EntityAIAttackOnCollide aiAttackOnCollide2 = new EntityAIAttackOnCollide(this, EntityTameable.class, 1.2D, false);
  
  private int timer;
  
  Random rand = new Random();
  
  public UchihaBrotherEntity(World par1World) {
    super(par1World);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIMoveTowardsRestriction(this, 1.0D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWander(this, 1.0D));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityTameable.class, 8.0F));
    this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget(this, true));
    this.targetTasks.addTask(2, (EntityAIBase)new EntityAINearestAttackableTarget(this, EntityPlayer.class, 10, true));
    this.targetTasks.addTask(3, (EntityAIBase)new EntityAINearestAttackableTarget(this, EntityTameable.class, 10, true));
    this.tasks.addTask(12, (EntityAIBase)new EntityAILeapAtTarget((EntityLiving)this, 1.0F));
    setCurrentItemOrArmor(0, new ItemStack(AddedItems.UchihaKusanagi2));
    if (par1World != null && !par1World.isRemote)
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
    getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(60.0D);
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(500.0D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0D);
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
    this.tasks.removeTask((EntityAIBase)this.aiArrowAttack);
    ItemStack itemstack = getHeldItem();
    if ((itemstack == null || itemstack.getItem() != Items.bow) && (itemstack == null || itemstack.getItem() != AlcoholMod.ShurikenItem) && (itemstack == null || itemstack.getItem() != AlcoholMod.ShurikenSmallItem) && itemstack != null) {
      this.tasks.addTask(4, (EntityAIBase)this.aiAttackOnCollide);
      this.tasks.addTask(5, (EntityAIBase)this.aiAttackOnCollide2);
    } else {
      this.tasks.addTask(4, (EntityAIBase)this.aiArrowAttack);
    } 
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.timer > 0)
      this.timer--; 
  }
  
  protected float getSoundPitch() {
    return 0.7F;
  }
  
  protected String getHurtSound() {
    return "";
  }
  
  public void onDeath(DamageSource par1DamageSource) {
    super.onDeath(par1DamageSource);
    if (!this.worldObj.isRemote);
  }
  
  protected void fall() {}
  
  public EnumCreatureAttribute getCreatureAttribute() {
    return EnumCreatureAttribute.UNDEAD;
  }
  
  protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
    dropItem(AlcoholMod.DefeatUchihaBrother, 1);
  }
  
  public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
    if (isEntityInvulnerable())
      return false; 
    Entity entity = p_70097_1_.getEntity();
    if (entity != null && !(entity instanceof EntityPlayer) && !(entity instanceof EntityArrow))
      p_70097_2_ = (p_70097_2_ + 1.0F) / 2.0F; 
    return super.attackEntityFrom(p_70097_1_, p_70097_2_);
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    float f = (float)getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
    int i = 0;
    if (par1Entity instanceof EntityLivingBase) {
      f += EnchantmentHelper.getEnchantmentModifierLiving((EntityLivingBase)this, (EntityLivingBase)par1Entity);
      i += EnchantmentHelper.getKnockbackModifier((EntityLivingBase)this, (EntityLivingBase)par1Entity);
    } 
    if (this.timer == 0) {
      int rand = par1Entity.worldObj.rand.nextInt(3) + 1;
      if (rand == 1) {
        EntityTsukuyomi entitysnowball = new EntityTsukuyomi(this.worldObj, (EntityLivingBase)this);
        double d0 = par1Entity.posX - this.posX;
        double d1 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
        double d2 = par1Entity.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitysnowball.setThrowableHeading(d0, d1 + f1, d2, 1.6F, 12.0F);
        playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
        this.timer = 200;
      } 
      if (rand == 2) {
        EntityGenjutsuCrows entitysnowball = new EntityGenjutsuCrows(this.worldObj, (EntityLivingBase)this);
        double d0 = par1Entity.posX - this.posX;
        double d1 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
        double d2 = par1Entity.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitysnowball.setThrowableHeading(d0, d1 + f1, d2, 1.6F, 12.0F);
        playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
        this.timer = 200;
      } 
      if (rand == 3) {
        GreatFireBallEntity entitysnowball = new GreatFireBallEntity(this.worldObj, (EntityLivingBase)this);
        double d0 = par1Entity.posX - this.posX;
        double d1 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
        double d2 = par1Entity.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitysnowball.setThrowableHeading(d0, d1 + f1, d2, 1.6F, 12.0F);
        playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
        this.timer = 200;
      } 
    } 
    boolean flag = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), f);
    if (flag && i > 0) {
      par1Entity.addVelocity((-MathHelper.sin(this.rotationYaw * 3.1415927F / 180.0F) * i * 0.5F), 0.1D, (MathHelper.cos(this.rotationYaw * 3.1415927F / 180.0F) * i * 0.5F));
      this.motionX *= 0.6D;
      this.motionZ *= 0.6D;
    } 
    return flag;
  }
  
  public void attackEntityWithRangedAttack(EntityLivingBase p_82196_1_, float p_82196_2_) {
    ItemStack itemstack = getHeldItem();
    if (itemstack != null && itemstack.getItem() == Items.bow) {
      EntityArrow entityarrow = new EntityArrow(this.worldObj, (EntityLivingBase)this, p_82196_1_, 1.6F, (14 - this.worldObj.difficultySetting.getDifficultyId() * 4));
      int i = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, getHeldItem());
      int j = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, getHeldItem());
      entityarrow.setDamage((p_82196_2_ * 2.0F) + this.rand.nextGaussian() * 0.25D + (this.worldObj.difficultySetting.getDifficultyId() * 0.11F));
      if (i > 0)
        entityarrow.setDamage(entityarrow.getDamage() + i * 0.5D + 0.5D); 
      if (j > 0)
        entityarrow.setKnockbackStrength(j); 
      if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, getHeldItem()) > 0)
        entityarrow.setFire(100); 
      playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
      this.worldObj.spawnEntityInWorld((Entity)entityarrow);
    } 
    if (itemstack != null && itemstack.getItem() == AlcoholMod.ShurikenItem) {
      ShurikenEntity entityarrow = new ShurikenEntity(this.worldObj, (EntityLivingBase)this, p_82196_1_, 2.0F, (14 - this.worldObj.difficultySetting.getDifficultyId() * 4));
      int i = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, getHeldItem());
      int j = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, getHeldItem());
      entityarrow.setDamage((p_82196_2_ * 2.0F) + this.rand.nextGaussian() * 0.25D + (this.worldObj.difficultySetting.getDifficultyId() * 0.11F));
      if (i > 0)
        entityarrow.setDamage(entityarrow.getDamage() + i * 0.5D + 0.5D); 
      if (j > 0)
        entityarrow.setKnockbackStrength(j); 
      if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, getHeldItem()) > 0)
        entityarrow.setFire(100); 
      playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
      this.worldObj.spawnEntityInWorld((Entity)entityarrow);
    } 
    if (itemstack != null && itemstack.getItem() == AlcoholMod.ShurikenSmallItem) {
      ShurikenSmallEntity entityarrow = new ShurikenSmallEntity(this.worldObj, (EntityLivingBase)this, p_82196_1_, 2.0F, (14 - this.worldObj.difficultySetting.getDifficultyId() * 4));
      int i = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, getHeldItem());
      int j = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, getHeldItem());
      entityarrow.setDamage((p_82196_2_ * 2.0F) + this.rand.nextGaussian() * 0.25D + (this.worldObj.difficultySetting.getDifficultyId() * 0.11F));
      if (i > 0)
        entityarrow.setDamage(entityarrow.getDamage() + i * 0.5D + 0.5D); 
      if (j > 0)
        entityarrow.setKnockbackStrength(j); 
      if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, getHeldItem()) > 0)
        entityarrow.setFire(100); 
      playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
      this.worldObj.spawnEntityInWorld((Entity)entityarrow);
    } 
    if (this.timer == 0) {
      EntityGenjutsuCrows entitysnowball = new EntityGenjutsuCrows(this.worldObj, (EntityLivingBase)this);
      double d0 = p_82196_1_.posX - this.posX;
      double d1 = p_82196_1_.posY + p_82196_1_.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
      double d2 = p_82196_1_.posZ - this.posZ;
      float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
      entitysnowball.setThrowableHeading(d0, d1 + f1, d2, 1.6F, 12.0F);
      playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
      this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
      this.timer = 200;
    } 
  }
  
  protected void collideWithEntity(Entity par1Entity) {
    attackEntityAsMob(par1Entity);
  }
}

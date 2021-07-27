package alcoholmod.Mathioks.NPC;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.Entity.EntityWindVacuumSerialWaves;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.GreatFireBallEntity;
import alcoholmod.Mathioks.Final.CT.LightningBallEntity;
import alcoholmod.Mathioks.Final.CT.WaterBulletEntity;
import alcoholmod.Mathioks.Final.EntityYangReleaseFlashOfLight;
import alcoholmod.Mathioks.item.ShurikenEntity;
import alcoholmod.Mathioks.item.ShurikenSmallEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
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
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.village.Village;
import net.minecraft.world.World;

public class EntityJiraiya extends EntitySage implements IRangedAttackMob {
  private EntityAIArrowAttack aiArrowAttack = new EntityAIArrowAttack(this, 1.25D, 20, 60, 15.0F);
  
  private int timer;
  
  private int timer2;
  
  private int homeCheckTimer;
  
  Village villageObj;
  
  private int attackTimer;
  
  private int giveCounter = 0;
  
  private boolean Talkative = false;
  
  private EntityLivingBase beaten = null;
  
  private boolean Follow = false;
  
  private boolean SageTraining = false;
  
  Random rand = new Random();
  
  public EntityJiraiya(World par1World) {
    super(par1World);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIMoveTowardsRestriction((EntityCreature)this, 1.0D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWander((EntityCreature)this, 1.0D));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
    this.targetTasks.addTask(3, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityLiving.class, 0, false, true, IMob.mobSelector));
    this.tasks.addTask(11, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityTameable.class, 8.0F));
    this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.tasks.addTask(12, (EntityAIBase)new EntityAILeapAtTarget((EntityLiving)this, 0.4F));
    this.tasks.addTask(14, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
    this.tasks.addTask(15, (EntityAIBase)new EntityAIOpenDoor((EntityLiving)this, true));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, EntityPlayer.class, 1.0D, false));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, EntityTameable.class, 1.0D, true));
    setSize(0.6F, 1.8F);
  }
  
  public boolean isOnLadder() {
    return isBesideClimbableBlock();
  }
  
  public boolean isBesideClimbableBlock() {
    return ((this.dataWatcher.getWatchableObjectByte(16) & 0x1) != 0);
  }
  
  public void setBesideClimbableBlock(boolean p_70839_1_) {
    byte b0 = this.dataWatcher.getWatchableObjectByte(16);
    if (p_70839_1_) {
      b0 = (byte)(b0 | 0x1);
    } else {
      b0 = (byte)(b0 & 0xFFFFFFFE);
    } 
    this.dataWatcher.updateObject(16, Byte.valueOf(b0));
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(18, Byte.valueOf((byte)0));
    this.dataWatcher.addObject(16, new Byte((byte)0));
    setTameSkin(0);
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(50.0D);
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(500.0D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(8.0D);
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
  
  public boolean interact(EntityPlayer p_70085_1_) {
    if (!this.worldObj.isRemote && p_70085_1_ != null && p_70085_1_.getHeldItem() != null) {
      ItemStack itemstack = p_70085_1_.inventory.getCurrentItem();
      ExtendedPlayer props = ExtendedPlayer.get(p_70085_1_);
      if (itemstack.getItem() == AlcoholMod.SealedSageScroll)
        if (this.Talkative) {
          if (this.beaten != null && this.SageTraining && !this.beaten.toString().equals(p_70085_1_.toString()))
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("§6Джирайя: §rТы должен показать мне свое мастерство, если хочешь встретиться с Фукасаку")); 
        } else {
          this.SageTraining = true;
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("§6Джирайя: §rО, свиток мудреца..!"));
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("§6Джирайя: §rХммм, я сниму его, если сможешь."));
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("§6Джирайя: §rдоказать мне, что ты достоин его!"));
          setHealth(1000.0F);
        }  
    } 
    return super.interact(p_70085_1_);
  }
  
  protected void collideWithEntity(Entity p_82167_1_) {
    if (p_82167_1_ instanceof IMob && getRNG().nextInt(20) == 0)
      setAttackTarget((EntityLivingBase)p_82167_1_); 
    super.collideWithEntity(p_82167_1_);
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
  
  public void onUpdate() {
    super.onUpdate();
    if (this.timer > 0)
      this.timer--; 
    if (this.timer2 > 0)
      this.timer2--; 
    if (this.giveCounter > 0)
      this.giveCounter--; 
    if (this.Talkative) {
      this.entityToAttack = null;
      setAttackTarget((EntityLivingBase)null);
      if (this.ticksExisted >= 2100)
        this.ticksExisted = 0; 
      if (this.ticksExisted >= 2000 && this.ticksExisted < 2100)
        setDead(); 
    } 
  }
  
  public Village getVillage() {
    return this.villageObj;
  }
  
  @SideOnly(Side.CLIENT)
  public int getAttackTimer() {
    return this.attackTimer;
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
      int randomNumber = this.rand.nextInt(6);
      if (randomNumber == 1) {
        GreatFireBallEntity entitysnowball = new GreatFireBallEntity(this.worldObj, (EntityLivingBase)this);
        double d0 = par1Entity.posX - this.posX;
        double d1 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
        double d2 = par1Entity.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitysnowball.setThrowableHeading(d0, d1 + f1, d2, 1.6F, 12.0F);
        playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
        this.timer = 150;
      } 
      if (randomNumber == 2) {
        EntityWindVacuumSerialWaves entitysnowball = new EntityWindVacuumSerialWaves(this.worldObj, (EntityLivingBase)this);
        double d0 = par1Entity.posX - this.posX;
        double d1 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
        double d2 = par1Entity.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitysnowball.setThrowableHeading(d0, d1 + f1, d2, 1.6F, 12.0F);
        playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
        this.timer = 150;
      } 
      if (randomNumber == 3) {
        WaterBulletEntity entitysnowball = new WaterBulletEntity(this.worldObj, (EntityLivingBase)this);
        double d0 = par1Entity.posX - this.posX;
        double d1 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
        double d2 = par1Entity.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitysnowball.setThrowableHeading(d0, d1 + f1, d2, 1.6F, 12.0F);
        playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
        this.timer = 150;
      } 
      if (randomNumber == 4) {
        EntityYangReleaseFlashOfLight entitysnowball = new EntityYangReleaseFlashOfLight(this.worldObj, (EntityLivingBase)this);
        double d0 = par1Entity.posX - this.posX;
        double d1 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
        double d2 = par1Entity.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitysnowball.setThrowableHeading(d0, d1 + f1, d2, 1.6F, 12.0F);
        playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
        this.timer = 150;
      } 
      if (randomNumber == 5) {
        LightningBallEntity entitysnowball = new LightningBallEntity(this.worldObj, (EntityLivingBase)this);
        double d0 = par1Entity.posX - this.posX;
        double d1 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
        double d2 = par1Entity.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitysnowball.setThrowableHeading(d0, d1 + f1, d2, 1.6F, 12.0F);
        playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
        this.timer = 150;
      } 
    } 
    boolean flag = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), f);
    if (flag && i > 0)
      par1Entity.addVelocity((-MathHelper.sin(this.rotationYaw * 3.1415927F / 180.0F) * i * 0.5F), 0.1D, (MathHelper.cos(this.rotationYaw * 3.1415927F / 180.0F) * i * 0.5F)); 
    return flag;
  }
  
  public void attackEntityWithRangedAttack(EntityLivingBase par1Entity, float p_82196_2_) {
    ItemStack itemstack = getHeldItem();
    if (itemstack != null && itemstack.getItem() == Items.bow) {
      EntityArrow entityarrow = new EntityArrow(this.worldObj, (EntityLivingBase)this, par1Entity, 1.6F, (14 - this.worldObj.difficultySetting.getDifficultyId() * 4));
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
      ShurikenEntity entityarrow = new ShurikenEntity(this.worldObj, (EntityLivingBase)this, par1Entity, 2.0F, (14 - this.worldObj.difficultySetting.getDifficultyId() * 4));
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
      ShurikenSmallEntity entityarrow = new ShurikenSmallEntity(this.worldObj, (EntityLivingBase)this, par1Entity, 2.0F, (14 - this.worldObj.difficultySetting.getDifficultyId() * 4));
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
      int randomNumber = this.rand.nextInt(6);
      if (randomNumber == 1) {
        GreatFireBallEntity entitysnowball = new GreatFireBallEntity(this.worldObj, (EntityLivingBase)this);
        double d0 = par1Entity.posX - this.posX;
        double d1 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
        double d2 = par1Entity.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitysnowball.setThrowableHeading(d0, d1 + f1, d2, 1.6F, 12.0F);
        playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
        this.timer = 150;
      } 
      if (randomNumber == 2) {
        EntityWindVacuumSerialWaves entitysnowball = new EntityWindVacuumSerialWaves(this.worldObj, (EntityLivingBase)this);
        double d0 = par1Entity.posX - this.posX;
        double d1 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
        double d2 = par1Entity.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitysnowball.setThrowableHeading(d0, d1 + f1, d2, 1.6F, 12.0F);
        playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
        this.timer = 150;
      } 
      if (randomNumber == 3) {
        WaterBulletEntity entitysnowball = new WaterBulletEntity(this.worldObj, (EntityLivingBase)this);
        double d0 = par1Entity.posX - this.posX;
        double d1 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
        double d2 = par1Entity.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitysnowball.setThrowableHeading(d0, d1 + f1, d2, 1.6F, 12.0F);
        playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
        this.timer = 150;
      } 
      if (randomNumber == 4) {
        EntityYangReleaseFlashOfLight entitysnowball = new EntityYangReleaseFlashOfLight(this.worldObj, (EntityLivingBase)this);
        double d0 = par1Entity.posX - this.posX;
        double d1 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
        double d2 = par1Entity.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitysnowball.setThrowableHeading(d0, d1 + f1, d2, 1.6F, 12.0F);
        playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
        this.timer = 150;
      } 
      if (randomNumber == 5) {
        LightningBallEntity entitysnowball = new LightningBallEntity(this.worldObj, (EntityLivingBase)this);
        double d0 = par1Entity.posX - this.posX;
        double d1 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
        double d2 = par1Entity.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitysnowball.setThrowableHeading(d0, d1 + f1, d2, 1.6F, 12.0F);
        playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
        this.timer = 150;
      } 
    } 
  }
  
  public void onDeath(DamageSource par1DamageSource) {
    super.onDeath(par1DamageSource);
    if (!this.worldObj.isRemote) {
      if (par1DamageSource.getEntity() instanceof EntityPlayer) {
        ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par1DamageSource.getEntity());
        if (this.beaten == null) {
          this.beaten = (EntityLivingBase)par1DamageSource.getEntity();
          setHealth(5.0F);
          this.Talkative = true;
        } 
      } 
      if (par1DamageSource.getEntity() != null) {
        if (par1DamageSource.getEntity() instanceof EntityTameable && ((EntityTameable)par1DamageSource.getEntity()).getOwner() != null) {
          EntityLivingBase entityTamer = ((EntityTameable)par1DamageSource.getEntity()).getOwner();
          if (entityTamer instanceof EntityPlayer) {
            ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityTamer);
            if (this.beaten == null) {
              this.beaten = entityTamer;
              setHealth(5.0F);
              this.Talkative = true;
            } 
          } 
        } 
      } else if (par1DamageSource.getEntity() != null && par1DamageSource.getEntity() instanceof EntityTameable) {
        this.beaten = (EntityLivingBase)par1DamageSource.getEntity();
      } 
    } 
    setHealth(5.0F);
    this.Talkative = true;
  }
  
  public boolean isEntityInvulnerable() {
    return this.Talkative;
  }
  
  protected void fall(float distance) {}
}

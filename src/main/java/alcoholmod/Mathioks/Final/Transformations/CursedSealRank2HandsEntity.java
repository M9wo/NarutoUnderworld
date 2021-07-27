package alcoholmod.Mathioks.Final.Transformations;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
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
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class CursedSealRank2HandsEntity extends EntityTameable {
  private float field_70926_e;
  
  private float field_70924_f;
  
  private boolean isShaking;
  
  private boolean field_70928_h;
  
  private float timeWolfIsShaking;
  
  private float prevTimeWolfIsShaking;
  
  private static final String __OBFID = "CL_00001654";
  
  public CursedSealRank2HandsEntity(World p_i1696_1_) {
    super(p_i1696_1_);
    setSize(0.6F, 1.8F);
    getNavigator().setAvoidsWater(true);
    this.tasks.addTask(1, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(2, (EntityAIBase)this.aiSit);
    this.tasks.addTask(3, (EntityAIBase)new EntityAILeapAtTarget((EntityLiving)this, 0.4F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, 2.0D, true));
    this.tasks.addTask(5, (EntityAIBase)new EntityAIFollowOwner(this, 1.0D, 6.0F, 2.0F));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWander((EntityCreature)this, 1.0D));
    this.tasks.addTask(9, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 18.0F));
    this.tasks.addTask(9, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIOwnerHurtByTarget(this));
    this.targetTasks.addTask(2, (EntityAIBase)new EntityAIOwnerHurtTarget(this));
    this.targetTasks.addTask(3, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
    this.targetTasks.addTask(4, (EntityAIBase)new EntityAITargetNonTamed(this, EntitySheep.class, 200, false));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896D);
    if (isTamed()) {
      getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(450.0D);
    } else {
      getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(450.0D);
    } 
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  public void setAttackTarget(EntityLivingBase p_70624_1_) {
    super.setAttackTarget(p_70624_1_);
    if (p_70624_1_ == null) {
      setAngry(false);
    } else if (!isTamed()) {
      setAngry(true);
    } 
  }
  
  protected void updateAITick() {
    this.dataWatcher.updateObject(18, Float.valueOf(getHealth()));
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(18, new Float(getHealth()));
    this.dataWatcher.addObject(19, new Byte((byte)0));
    this.dataWatcher.addObject(20, new Byte((byte)BlockColored.func_150032_b(1)));
  }
  
  protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_) {
    playSound("mob.wolf.step", 0.15F, 1.0F);
  }
  
  public void writeEntityToNBT(NBTTagCompound p_70014_1_) {
    super.writeEntityToNBT(p_70014_1_);
    p_70014_1_.setBoolean("Angry", isAngry());
    p_70014_1_.setByte("CollarColor", (byte)getCollarColor());
  }
  
  public void readEntityFromNBT(NBTTagCompound p_70037_1_) {
    super.readEntityFromNBT(p_70037_1_);
    setAngry(p_70037_1_.getBoolean("Angry"));
    if (p_70037_1_.hasKey("CollarColor", 99))
      setCollarColor(p_70037_1_.getByte("CollarColor")); 
  }
  
  protected String getLivingSound() {
    return isAngry() ? "" : ((this.rand.nextInt(3) == 0) ? ((isTamed() && this.dataWatcher.getWatchableObjectFloat(18) < 10.0F) ? "" : "") : "");
  }
  
  protected String getHurtSound() {
    return "";
  }
  
  protected String getDeathSound() {
    return "";
  }
  
  protected float getSoundVolume() {
    return 0.2F;
  }
  
  protected Item getDropItem() {
    return Item.getItemById(-1);
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
    if (!this.worldObj.isRemote && this.isShaking && !this.field_70928_h && !hasPath() && this.onGround) {
      this.field_70928_h = true;
      this.timeWolfIsShaking = 0.0F;
      this.prevTimeWolfIsShaking = 0.0F;
      this.worldObj.setEntityState((Entity)this, (byte)8);
    } 
  }
  
  public void onUpdate() {
    super.onUpdate();
    this.field_70924_f = this.field_70926_e;
    if (this.ticksExisted >= 3600)
      setDead(); 
    if (getHealth() > 0.0F && getHealth() < getMaxHealth())
      heal(1.0F); 
    if (func_70922_bv()) {
      this.field_70926_e += (1.0F - this.field_70926_e) * 0.4F;
    } else {
      this.field_70926_e += (0.0F - this.field_70926_e) * 0.4F;
    } 
    if (func_70922_bv())
      this.numTicksToChaseTarget = 10; 
    if (isWet()) {
      this.isShaking = true;
      this.field_70928_h = false;
      this.timeWolfIsShaking = 0.0F;
      this.prevTimeWolfIsShaking = 0.0F;
    } else if ((this.isShaking || this.field_70928_h) && this.field_70928_h) {
      if (this.timeWolfIsShaking == 0.0F)
        playSound("mob.wolf.shake", getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F); 
      this.prevTimeWolfIsShaking = this.timeWolfIsShaking;
      this.timeWolfIsShaking += 0.05F;
      if (this.prevTimeWolfIsShaking >= 2.0F) {
        this.isShaking = false;
        this.field_70928_h = false;
        this.prevTimeWolfIsShaking = 0.0F;
        this.timeWolfIsShaking = 0.0F;
      } 
      if (this.timeWolfIsShaking > 0.4F) {
        float f = (float)this.boundingBox.minY;
        int i = (int)(MathHelper.sin((this.timeWolfIsShaking - 0.4F) * 3.1415927F) * 7.0F);
        for (int j = 0; j < i; j++) {
          float f1 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width * 0.5F;
          float f2 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width * 0.5F;
          this.worldObj.spawnParticle("splash", this.posX + f1, (f + 0.8F), this.posZ + f2, this.motionX, this.motionY, this.motionZ);
        } 
      } 
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public boolean getWolfShaking() {
    return this.isShaking;
  }
  
  @SideOnly(Side.CLIENT)
  public float getShadingWhileShaking(float p_70915_1_) {
    return 0.75F + (this.prevTimeWolfIsShaking + (this.timeWolfIsShaking - this.prevTimeWolfIsShaking) * p_70915_1_) / 2.0F * 0.25F;
  }
  
  @SideOnly(Side.CLIENT)
  public float getShakeAngle(float p_70923_1_, float p_70923_2_) {
    float f2 = (this.prevTimeWolfIsShaking + (this.timeWolfIsShaking - this.prevTimeWolfIsShaking) * p_70923_1_ + p_70923_2_) / 1.8F;
    if (f2 < 0.0F) {
      f2 = 0.0F;
    } else if (f2 > 1.0F) {
      f2 = 1.0F;
    } 
    return MathHelper.sin(f2 * 3.1415927F) * MathHelper.sin(f2 * 3.1415927F * 11.0F) * 0.15F * 3.1415927F;
  }
  
  public float getEyeHeight() {
    return this.height * 0.8F;
  }
  
  @SideOnly(Side.CLIENT)
  public float getInterestedAngle(float p_70917_1_) {
    return (this.field_70924_f + (this.field_70926_e - this.field_70924_f) * p_70917_1_) * 0.15F * 3.1415927F;
  }
  
  public int getVerticalFaceSpeed() {
    return isSitting() ? 20 : super.getVerticalFaceSpeed();
  }
  
  public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
    if (isEntityInvulnerable())
      return false; 
    Entity entity = p_70097_1_.getEntity();
    this.aiSit.setSitting(false);
    if (entity != null && !(entity instanceof EntityPlayer) && !(entity instanceof net.minecraft.entity.projectile.EntityArrow))
      p_70097_2_ = (p_70097_2_ + 1.0F) / 2.0F; 
    return super.attackEntityFrom(p_70097_1_, p_70097_2_);
  }
  
  public boolean attackEntityAsMob(Entity p_70652_1_) {
    int i = isTamed() ? 4 : 2;
    return p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), i);
  }
  
  public void setTamed(boolean p_70903_1_) {
    super.setTamed(p_70903_1_);
    if (p_70903_1_) {
      getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(450.0D);
    } else {
      getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(450.0D);
    } 
  }
  
  public boolean interact(EntityPlayer p_70085_1_) {
    ItemStack itemstack = p_70085_1_.inventory.getCurrentItem();
    if (isTamed()) {
      if (itemstack != null)
        if (itemstack.getItem() instanceof ItemFood) {
          ItemFood itemfood = (ItemFood)itemstack.getItem();
          if (itemfood.isWolfsFavoriteMeat() && this.dataWatcher.getWatchableObjectFloat(18) < 450.0F) {
            if (!p_70085_1_.capabilities.isCreativeMode)
              itemstack.stackSize--; 
            heal(itemfood.func_150905_g(itemstack));
            if (itemstack.stackSize <= 0)
              p_70085_1_.inventory.setInventorySlotContents(p_70085_1_.inventory.currentItem, (ItemStack)null); 
            return true;
          } 
        } else if (itemstack.getItem() == Items.dye) {
          int i = BlockColored.func_150032_b(itemstack.getItemDamage());
          if (i != getCollarColor()) {
            setCollarColor(i);
            if (!p_70085_1_.capabilities.isCreativeMode && --itemstack.stackSize <= 0)
              p_70085_1_.inventory.setInventorySlotContents(p_70085_1_.inventory.currentItem, (ItemStack)null); 
            return true;
          } 
        }  
      if (func_152114_e((EntityLivingBase)p_70085_1_) && !this.worldObj.isRemote && !isBreedingItem(itemstack)) {
        this.aiSit.setSitting(!isSitting());
        this.isJumping = false;
        setPathToEntity((PathEntity)null);
        setTarget((Entity)null);
        setAttackTarget((EntityLivingBase)null);
      } 
    } else if (itemstack != null && itemstack.getItem() == Items.diamond_sword && !isAngry()) {
      if (!p_70085_1_.capabilities.isCreativeMode)
        itemstack.stackSize--; 
      if (itemstack.stackSize <= 0)
        p_70085_1_.inventory.setInventorySlotContents(p_70085_1_.inventory.currentItem, (ItemStack)null); 
      if (!this.worldObj.isRemote)
        if (this.rand.nextInt(3) == 0) {
          setTamed(true);
          setPathToEntity((PathEntity)null);
          setAttackTarget((EntityLivingBase)null);
          this.aiSit.setSitting(true);
          setHealth(450.0F);
          func_152115_b(p_70085_1_.getUniqueID().toString());
          playTameEffect(true);
          this.worldObj.setEntityState((Entity)this, (byte)7);
        } else {
          playTameEffect(false);
          this.worldObj.setEntityState((Entity)this, (byte)6);
        }  
      return true;
    } 
    return super.interact(p_70085_1_);
  }
  
  @SideOnly(Side.CLIENT)
  public void handleHealthUpdate(byte p_70103_1_) {
    if (p_70103_1_ == 8) {
      this.field_70928_h = true;
      this.timeWolfIsShaking = 0.0F;
      this.prevTimeWolfIsShaking = 0.0F;
    } else {
      super.handleHealthUpdate(p_70103_1_);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public float getTailRotation() {
    return isAngry() ? 1.5393804F : (isTamed() ? ((0.55F - (20.0F - this.dataWatcher.getWatchableObjectFloat(18)) * 0.02F) * 3.1415927F) : 0.62831855F);
  }
  
  public boolean isBreedingItem(ItemStack p_70877_1_) {
    return (p_70877_1_ == null) ? false : (!(p_70877_1_.getItem() instanceof ItemFood) ? false : ((ItemFood)p_70877_1_.getItem()).isWolfsFavoriteMeat());
  }
  
  public int getMaxSpawnedInChunk() {
    return 1;
  }
  
  public boolean isAngry() {
    return ((this.dataWatcher.getWatchableObjectByte(16) & 0x2) != 0);
  }
  
  public void setAngry(boolean p_70916_1_) {
    byte b0 = this.dataWatcher.getWatchableObjectByte(16);
    if (p_70916_1_) {
      this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 | 0x2)));
    } else {
      this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 & 0xFFFFFFFD)));
    } 
  }
  
  public int getCollarColor() {
    return this.dataWatcher.getWatchableObjectByte(20) & 0xF;
  }
  
  public void setCollarColor(int p_82185_1_) {
    this.dataWatcher.updateObject(20, Byte.valueOf((byte)(p_82185_1_ & 0xF)));
  }
  
  public EntityWolf createChild(EntityAgeable p_90011_1_) {
    EntityWolf entitywolf = new EntityWolf(this.worldObj);
    String s = func_152113_b();
    if (s != null && s.trim().length() > 0) {
      entitywolf.func_152115_b(s);
      entitywolf.setTamed(true);
    } 
    return entitywolf;
  }
  
  public void func_70918_i(boolean p_70918_1_) {
    if (p_70918_1_) {
      this.dataWatcher.updateObject(19, Byte.valueOf((byte)1));
    } else {
      this.dataWatcher.updateObject(19, Byte.valueOf((byte)0));
    } 
  }
  
  public boolean canMateWith(EntityAnimal p_70878_1_) {
    if (p_70878_1_ == this)
      return false; 
    if (!isTamed())
      return false; 
    if (!(p_70878_1_ instanceof EntityWolf))
      return false; 
    EntityWolf entitywolf = (EntityWolf)p_70878_1_;
    return !entitywolf.isTamed() ? false : (entitywolf.isSitting() ? false : ((isInLove() && entitywolf.isInLove())));
  }
  
  public boolean func_70922_bv() {
    return (this.dataWatcher.getWatchableObjectByte(19) == 1);
  }
  
  protected boolean canDespawn() {
    return (!isTamed() && this.ticksExisted > 2400);
  }
  
  public boolean func_142018_a(EntityLivingBase p_142018_1_, EntityLivingBase p_142018_2_) {
    if (!(p_142018_1_ instanceof net.minecraft.entity.monster.EntityCreeper) && !(p_142018_1_ instanceof net.minecraft.entity.monster.EntityGhast)) {
      if (p_142018_1_ instanceof EntityWolf) {
        EntityWolf entitywolf = (EntityWolf)p_142018_1_;
        if (entitywolf.isTamed() && entitywolf.getOwner() == p_142018_2_)
          return false; 
      } 
      return (p_142018_1_ instanceof EntityPlayer && p_142018_2_ instanceof EntityPlayer && !((EntityPlayer)p_142018_2_).canAttackPlayer((EntityPlayer)p_142018_1_)) ? false : ((!(p_142018_1_ instanceof EntityHorse) || !((EntityHorse)p_142018_1_).isTame()));
    } 
    return false;
  }
}

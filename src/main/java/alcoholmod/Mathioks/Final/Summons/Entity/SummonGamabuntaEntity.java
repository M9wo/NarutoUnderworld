package alcoholmod.Mathioks.Final.Summons.Entity;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.Final.CT.ToadOilEntity;
import alcoholmod.Mathioks.Final.CT.WaterGunshotEntity;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.UUID;
import lc208.nam.entity.EntityAbilityExtended;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;

public class SummonGamabuntaEntity extends EntityAnimal implements EntityAbilityExtended {
  private static final IAttribute horseJumpStrength = (IAttribute)(new RangedAttribute("horse.jumpStrength", 3.0D, 0.0D, 6.0D)).setDescription("Jump Strength").setShouldWatch(true);
  
  private static final String[] field_110273_bx = new String[] { "", "meo", "goo", "dio" };
  
  private static final int[] armorValues = new int[] { 0, 5, 7, 11 };
  
  private static final String[] field_110269_bA = new String[] { "hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb" };
  
  private static final String[] field_110292_bC = new String[] { "", "wo_", "wmo", "wdo", "bdo" };
  
  private int jumpRearingCounter;
  
  public int field_110278_bp;
  
  public int field_110279_bq;
  
  protected boolean horseJumping;
  
  protected int temper;
  
  protected float jumpPower;
  
  private boolean field_110294_bI;
  
  private float rearingAmount;
  
  private float prevRearingAmount;
  
  private int field_110285_bP;
  
  private String field_110286_bQ;
  
  private String[] field_110280_bR = new String[3];
  
  private int Cooldown_BigFireBall = 0;
  
  private boolean Jumped = false;
  
  private int cooldown_Jump = 0;
  
  private boolean Low = false;
  
  private int LowCounter = 0;
  
  public boolean Boss = false;
  
  private static final String __OBFID = "CL_00001641";
  
  public SummonGamabuntaEntity(World p_i1685_1_) {
    super(p_i1685_1_);
    setSize(3.0F, 13.8F);
    this.isImmuneToFire = true;
    getNavigator().setAvoidsWater(true);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWander((EntityCreature)this, 0.7D));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, 1.0D, true));
    this.tasks.addTask(5, new EntityAIFollowOwnerCustomGamabunta(this, 1.0D, 10.0F, 6.0F));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIOwnerHurtByTargetCustomGamabunta(this));
    this.targetTasks.addTask(2, (EntityAIBase)new EntityAIOwnerHurtTargetCustomGamabunta(this));
    this.targetTasks.addTask(3, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
    this.tasks.addTask(3, (EntityAIBase)new EntityAILeapAtTarget((EntityLiving)this, 0.4F));
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(16, Integer.valueOf(0));
    this.dataWatcher.addObject(19, Byte.valueOf((byte)0));
    this.dataWatcher.addObject(20, Integer.valueOf(0));
    this.dataWatcher.addObject(21, String.valueOf(""));
    this.dataWatcher.addObject(22, Integer.valueOf(0));
  }
  
  private boolean getHorseWatchableBoolean(int p_110233_1_) {
    return ((this.dataWatcher.getWatchableObjectInt(16) & p_110233_1_) != 0);
  }
  
  private void setHorseWatchableBoolean(int p_110208_1_, boolean p_110208_2_) {
    int j = this.dataWatcher.getWatchableObjectInt(16);
    if (p_110208_2_) {
      this.dataWatcher.updateObject(16, Integer.valueOf(j | p_110208_1_));
    } else {
      this.dataWatcher.updateObject(16, Integer.valueOf(j & (p_110208_1_ ^ 0xFFFFFFFF)));
    } 
  }
  
  protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
    dropItem(AlcoholMod.DefeatGamakichi, 1);
  }
  
  public void onKillEntity(EntityLivingBase p_70074_1_) {
    super.onKillEntity(p_70074_1_);
    if (getOwner() != null && getOwner() instanceof EntityPlayer && !(p_70074_1_ instanceof EntityAnimal) && !(p_70074_1_ instanceof net.minecraft.entity.passive.EntityWaterMob)) {
      EntityPlayer owner = (EntityPlayer)getOwner();
      ExtendedPlayer props = ExtendedPlayer.get(owner);
      props.setChakraExperience(props.getChakraExperience() + 1);
      PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage(owner), (EntityPlayerMP)owner);
    } 
  }
  
  protected void dropRareDrop(int p_70600_1_) {
    int j = this.rand.nextInt(5);
    if (j == 1)
      entityDropItem(new ItemStack(AlcoholMod.SummonGamabunta, 1, 1), 0.0F); 
  }
  
  public boolean isTame() {
    return getHorseWatchableBoolean(2);
  }
  
  public String func_152119_ch() {
    return this.dataWatcher.getWatchableObjectString(21);
  }
  
  public void func_152120_b(String p_152120_1_) {
    this.dataWatcher.updateObject(21, p_152120_1_);
  }
  
  public boolean isHorseJumping() {
    return this.horseJumping;
  }
  
  public void setHorseTamed(boolean p_110234_1_) {
    setHorseWatchableBoolean(2, p_110234_1_);
  }
  
  public void setHorseJumping(boolean p_110255_1_) {
    this.horseJumping = p_110255_1_;
  }
  
  public EntityLivingBase getOwner() {
    try {
      UUID uuid = UUID.fromString(func_152119_ch());
      return (uuid == null) ? null : (EntityLivingBase)this.worldObj.func_152378_a(uuid);
    } catch (IllegalArgumentException var2) {
      return null;
    } 
  }
  
  public Team getTeam() {
    if (isTame()) {
      EntityLivingBase entitylivingbase = getOwner();
      if (entitylivingbase != null)
        return entitylivingbase.getTeam(); 
    } 
    return super.getTeam();
  }
  
  public boolean isOnSameTeam(EntityLivingBase p_142014_1_) {
    if (isTame()) {
      EntityLivingBase entitylivingbase1 = getOwner();
      if (p_142014_1_ == entitylivingbase1)
        return true; 
      if (entitylivingbase1 != null)
        return entitylivingbase1.isOnSameTeam(p_142014_1_); 
    } 
    return super.isOnSameTeam(p_142014_1_);
  }
  
  public boolean func_142018_a(EntityLivingBase p_142018_1_, EntityLivingBase p_142018_2_) {
    if (!(p_142018_1_ instanceof net.minecraft.entity.monster.EntityCreeper) && !(p_142018_1_ instanceof net.minecraft.entity.monster.EntityGhast)) {
      if (p_142018_1_ instanceof SummonGamabuntaEntity) {
        SummonGamabuntaEntity entitywolf = (SummonGamabuntaEntity)p_142018_1_;
        if (entitywolf.isTame() && entitywolf.getOwner() == p_142018_2_)
          return false; 
      } 
      return (p_142018_1_ instanceof EntityPlayer && p_142018_2_ instanceof EntityPlayer && !((EntityPlayer)p_142018_2_).canAttackPlayer((EntityPlayer)p_142018_1_)) ? false : ((!(p_142018_1_ instanceof EntityHorse) || !((EntityHorse)p_142018_1_).isTame()));
    } 
    return false;
  }
  
  public int func_110241_cb() {
    return this.dataWatcher.getWatchableObjectInt(22);
  }
  
  private int getHorseArmorIndex(ItemStack p_110260_1_) {
    return 4;
  }
  
  public boolean isRearing() {
    return getHorseWatchableBoolean(64);
  }
  
  public boolean func_110205_ce() {
    return getHorseWatchableBoolean(16);
  }
  
  public void func_146086_d(ItemStack p_146086_1_) {
    this.dataWatcher.updateObject(22, Integer.valueOf(getHorseArmorIndex(p_146086_1_)));
    func_110230_cF();
  }
  
  public void func_110242_l(boolean p_110242_1_) {
    setHorseWatchableBoolean(16, p_110242_1_);
  }
  
  public void setChested(boolean p_110207_1_) {
    setHorseWatchableBoolean(8, p_110207_1_);
  }
  
  public int getTemper() {
    return this.temper;
  }
  
  public void setTemper(int p_110238_1_) {
    this.temper = p_110238_1_;
  }
  
  public int increaseTemper(int p_110198_1_) {
    int j = MathHelper.clamp_int(getTemper() + p_110198_1_, 0, getMaxTemper());
    setTemper(j);
    return j;
  }
  
  public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
    Entity entity = p_70097_1_.getEntity();
    if (entity == getOwner())
      return false; 
    return (this.riddenByEntity != null && this.riddenByEntity.equals(entity)) ? false : super.attackEntityFrom(p_70097_1_, p_70097_2_);
  }
  
  public int getTotalArmorValue() {
    return armorValues[func_110241_cb()];
  }
  
  public boolean canBePushed() {
    return (this.riddenByEntity == null);
  }
  
  protected void fall(float p_70069_1_) {
    int i = MathHelper.ceiling_float_int(p_70069_1_ * 0.5F - 3.0F);
    if (i > 0) {
      attackEntityFrom(DamageSource.fall, i);
      if (this.riddenByEntity != null)
        this.riddenByEntity.attackEntityFrom(DamageSource.fall, i); 
      Block block = this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY - 0.2D - this.prevRotationYaw), MathHelper.floor_double(this.posZ));
      if (block.getMaterial() != Material.air) {
        Block.SoundType soundtype = block.stepSound;
        this.worldObj.playSoundAtEntity((Entity)this, soundtype.getStepResourcePath(), soundtype.getVolume() * 0.5F, soundtype.getPitch() * 0.75F);
      } 
    } 
  }
  
  public double getHorseJumpStrength() {
    return getEntityAttribute(horseJumpStrength).getAttributeValue();
  }
  
  protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_) {
    Block.SoundType soundtype = p_145780_4_.stepSound;
    if (this.worldObj.getBlock(p_145780_1_, p_145780_2_ + 1, p_145780_3_) == Blocks.snow_layer)
      soundtype = Blocks.snow_layer.stepSound; 
    if (!p_145780_4_.getMaterial().isLiquid())
      if (this.riddenByEntity != null) {
        this.field_110285_bP++;
        if (this.field_110285_bP > 5 && this.field_110285_bP % 3 == 0) {
          playSound("mob.horse.gallop", soundtype.getVolume() * 0.15F, soundtype.getPitch());
        } else if (this.field_110285_bP <= 5) {
          playSound("mob.horse.wood", soundtype.getVolume() * 0.15F, soundtype.getPitch());
        } 
      } else if (soundtype == Block.soundTypeWood) {
        playSound("mob.horse.wood", soundtype.getVolume() * 0.15F, soundtype.getPitch());
      } else {
        playSound("mob.horse.soft", soundtype.getVolume() * 0.15F, soundtype.getPitch());
      }  
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getAttributeMap().registerAttribute(horseJumpStrength);
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5249999940395356D);
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    int i = 9;
    return (getOwner() != null) ? par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), i) : par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), i);
  }
  
  public int getMaxTemper() {
    return 100;
  }
  
  public void setAttackTarget(EntityLivingBase p_70624_1_) {
    super.setAttackTarget(p_70624_1_);
  }
  
  @SideOnly(Side.CLIENT)
  public boolean func_110239_cn() {
    return (func_110241_cb() > 0);
  }
  
  private void func_110230_cF() {
    this.field_110286_bQ = null;
  }
  
  public boolean interact(EntityPlayer p_70085_1_) {
    ItemStack itemstack = p_70085_1_.inventory.getCurrentItem();
    if (p_70085_1_ != getOwner())
      return false; 
    if (this.riddenByEntity != null)
      return super.interact(p_70085_1_); 
    if (itemstack != null) {
      boolean flag = false;
      if (!flag) {
        float f = 0.0F;
        byte b1 = 0;
        if (getHealth() < getMaxHealth() && f > 0.0F) {
          heal(f);
          flag = true;
        } 
        if (b1 > 0 && (flag || !isTame()) && b1 < getMaxTemper()) {
          flag = true;
          increaseTemper(b1);
        } 
        if (flag);
      } 
      if (!isTame() && !flag) {
        if (itemstack != null && itemstack.interactWithEntity(p_70085_1_, (EntityLivingBase)this))
          return true; 
        return true;
      } 
      if (flag) {
        if (!p_70085_1_.capabilities.isCreativeMode && --itemstack.stackSize == 0)
          p_70085_1_.inventory.setInventorySlotContents(p_70085_1_.inventory.currentItem, (ItemStack)null); 
        return true;
      } 
    } 
    if (this.riddenByEntity == null) {
      if (itemstack != null && itemstack.interactWithEntity(p_70085_1_, (EntityLivingBase)this))
        return true; 
      func_110237_h(p_70085_1_);
      return true;
    } 
    return super.interact(p_70085_1_);
  }
  
  private void func_110237_h(EntityPlayer p_110237_1_) {
    p_110237_1_.rotationYaw = this.rotationYaw;
    p_110237_1_.rotationPitch = this.rotationPitch;
    setRearing(false);
    if (!this.worldObj.isRemote)
      p_110237_1_.mountEntity((Entity)this); 
  }
  
  protected boolean isMovementBlocked() {
    return (this.riddenByEntity != null) ? true : isRearing();
  }
  
  private void func_110210_cH() {
    this.field_110278_bp = 1;
  }
  
  public void onLivingUpdate() {
    if (this.rand.nextInt(200) == 0)
      func_110210_cH(); 
    if (!this.worldObj.isRemote && this.rand.nextInt(900) == 0 && this.deathTime == 0)
      heal(1.0F); 
    if (!this.worldObj.isRemote && this.Low) {
      setSize(0.72F, 2.34F);
      this.ySize = 15.0F;
    } else if (!this.worldObj.isRemote && !this.Low) {
      setSize(3.4F, 11.2F);
    } 
    super.onLivingUpdate();
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.worldObj.isRemote && this.dataWatcher.hasChanges()) {
      this.dataWatcher.func_111144_e();
      func_110230_cF();
    } 
    if (!this.worldObj.isRemote && this.jumpRearingCounter > 0 && ++this.jumpRearingCounter > 20) {
      this.jumpRearingCounter = 0;
      setRearing(false);
    } 
    if (this.cooldown_Jump > 0)
      this.cooldown_Jump--; 
    if (this.Cooldown_BigFireBall > 0)
      this.Cooldown_BigFireBall--; 
    if (this.LowCounter > 0)
      this.LowCounter--; 
    if (this.field_110278_bp > 0 && ++this.field_110278_bp > 8)
      this.field_110278_bp = 0; 
    if (this.field_110279_bq > 0) {
      this.field_110279_bq++;
      if (this.field_110279_bq > 300)
        this.field_110279_bq = 0; 
    } 
    this.prevRearingAmount = this.rearingAmount;
    if (isRearing()) {
      this.rearingAmount += (1.0F - this.rearingAmount) * 0.4F + 0.05F;
      if (this.rearingAmount > 1.0F)
        this.rearingAmount = 1.0F; 
    } else {
      this.field_110294_bI = false;
      this.rearingAmount += (0.8F * this.rearingAmount * this.rearingAmount * this.rearingAmount - this.rearingAmount) * 0.6F - 0.05F;
      if (this.rearingAmount < 0.0F)
        this.rearingAmount = 0.0F; 
    } 
  }
  
  private boolean func_110200_cJ() {
    return (this.riddenByEntity == null && this.ridingEntity == null && isTame() && getHealth() >= getMaxHealth());
  }
  
  public void setRearing(boolean p_110219_1_) {
    setHorseWatchableBoolean(64, p_110219_1_);
  }
  
  private void makeHorseRear() {
    if (!this.worldObj.isRemote) {
      this.jumpRearingCounter = 1;
      setRearing(true);
    } 
  }
  
  public boolean setTamedBy(EntityPlayer p_110263_1_) {
    func_152120_b(p_110263_1_.getUniqueID().toString());
    setHorseTamed(true);
    return true;
  }
  
  public void moveEntityWithHeading(float p_70612_1_, float p_70612_2_) {
    if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityLivingBase) {
      this.prevRotationYaw = this.rotationYaw = this.riddenByEntity.rotationYaw;
      this.rotationPitch = this.riddenByEntity.rotationPitch * 0.5F;
      setRotation(this.rotationYaw, this.rotationPitch);
      this.rotationYawHead = this.renderYawOffset = this.rotationYaw;
      p_70612_1_ = ((EntityLivingBase)this.riddenByEntity).moveStrafing * 0.5F;
      p_70612_2_ = ((EntityLivingBase)this.riddenByEntity).moveForward;
      if (p_70612_2_ <= 0.0F) {
        p_70612_2_ *= 0.25F;
        this.field_110285_bP = 0;
      } 
      if (this.onGround && this.jumpPower == 0.0F && isRearing() && !this.field_110294_bI) {
        p_70612_1_ = 0.0F;
        p_70612_2_ = 0.0F;
      } 
      if (this.jumpPower > 0.0F && !isHorseJumping() && this.onGround) {
        this.motionY = getHorseJumpStrength() * this.jumpPower;
        if (isPotionActive(Potion.jump))
          this.motionY += ((getActivePotionEffect(Potion.jump).getAmplifier() + 1) * 0.1F); 
        setHorseJumping(true);
        this.isAirBorne = true;
        if (p_70612_2_ > 0.0F) {
          float f2 = MathHelper.sin(this.rotationYaw * 3.1415927F / 180.0F);
          float f3 = MathHelper.cos(this.rotationYaw * 3.1415927F / 180.0F);
          this.motionX += (-0.4F * f2 * this.jumpPower);
          this.motionZ += (0.4F * f3 * this.jumpPower);
        } 
        this.jumpPower = 0.0F;
        ForgeHooks.onLivingJump((EntityLivingBase)this);
      } 
      this.stepHeight = 4.0F;
      this.jumpMovementFactor = getAIMoveSpeed() * 1.1F;
      if (!this.worldObj.isRemote) {
        setAIMoveSpeed((float)getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue());
        super.moveEntityWithHeading(p_70612_1_, p_70612_2_);
      } 
      if (this.onGround) {
        this.jumpPower = 0.0F;
        setHorseJumping(false);
      } 
      this.prevLimbSwingAmount = this.limbSwingAmount;
      double d1 = this.posX - this.prevPosX;
      double d0 = this.posZ - this.prevPosZ;
      float f4 = MathHelper.sqrt_double(d1 * d1 + d0 * d0) * 4.0F;
      if (f4 > 1.0F)
        f4 = 1.0F; 
      this.limbSwingAmount += (f4 - this.limbSwingAmount) * 0.4F;
      this.limbSwing += this.limbSwingAmount;
    } else {
      this.stepHeight = 0.5F;
      this.jumpMovementFactor = 1.02F;
      super.moveEntityWithHeading(p_70612_1_, p_70612_2_);
    } 
  }
  
  public void writeEntityToNBT(NBTTagCompound p_70014_1_) {
    super.writeEntityToNBT(p_70014_1_);
    p_70014_1_.setInteger("Temper", getTemper());
    p_70014_1_.setBoolean("Tame", isTame());
    p_70014_1_.setString("OwnerUUID", func_152119_ch());
  }
  
  public void readEntityFromNBT(NBTTagCompound p_70037_1_) {
    super.readEntityFromNBT(p_70037_1_);
    setTemper(p_70037_1_.getInteger("Temper"));
    setHorseTamed(p_70037_1_.getBoolean("Tame"));
    if (p_70037_1_.hasKey("OwnerUUID", 8))
      func_152120_b(p_70037_1_.getString("OwnerUUID")); 
    IAttributeInstance iattributeinstance = getAttributeMap().getAttributeInstanceByName("Speed");
    if (iattributeinstance != null)
      getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(iattributeinstance.getBaseValue() * 1.0D); 
  }
  
  @SideOnly(Side.CLIENT)
  public float getRearingAmount(float p_110223_1_) {
    return this.prevRearingAmount + (this.rearingAmount - this.prevRearingAmount) * p_110223_1_;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void setJumpPower(int p_110206_1_) {
    if (p_110206_1_ < 0) {
      p_110206_1_ = 0;
    } else {
      this.field_110294_bI = true;
      makeHorseRear();
    } 
    if (p_110206_1_ >= 90) {
      this.jumpPower = 1.0F;
    } else {
      this.jumpPower = 0.4F + 0.4F * p_110206_1_ / 90.0F;
    } 
  }
  
  public void updateRiderPosition() {
    super.updateRiderPosition();
    if (this.prevRearingAmount > 0.0F) {
      float f = MathHelper.sin(this.renderYawOffset * 3.1415927F / 180.0F);
      float f1 = MathHelper.cos(this.renderYawOffset * 3.1415927F / 180.0F);
      float f2 = 0.7F * this.prevRearingAmount;
      float f3 = 0.15F * this.prevRearingAmount;
      this.riddenByEntity.setPosition(this.posX, this.posY + getMountedYOffset() + this.riddenByEntity.getYOffset(), this.posZ);
      if (this.riddenByEntity instanceof EntityLivingBase)
        ((EntityLivingBase)this.riddenByEntity).renderYawOffset = this.renderYawOffset; 
    } 
  }
  
  private float func_110267_cL() {
    return 15.0F + this.rand.nextInt(8) + this.rand.nextInt(9);
  }
  
  private double func_110245_cM() {
    return 0.4000000059604645D + this.rand.nextDouble() * 0.2D + this.rand.nextDouble() * 0.2D + this.rand.nextDouble() * 0.2D;
  }
  
  private double func_110203_cN() {
    return (0.44999998807907104D + this.rand.nextDouble() * 0.3D + this.rand.nextDouble() * 0.3D + this.rand.nextDouble() * 0.3D) * 0.25D;
  }
  
  public boolean isOnLadder() {
    return true;
  }
  
  public EntityAgeable createChild(EntityAgeable p_90011_1_) {
    return null;
  }
  
  public boolean canAttackClass(Class par1Class) {
    return true;
  }
  
  public void ability1(EntityPlayer Par3EntityPlayer) {
    if (!this.worldObj.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 30 + props.getNinjutsu() / 600) {
        ToadOilEntity oilEntity = new ToadOilEntity(this.worldObj, (EntityLivingBase)this);
        Vec3 look = Par3EntityPlayer.getLookVec();
        oilEntity.setPosition(Par3EntityPlayer.posX + look.xCoord * 5.0D, Par3EntityPlayer.posY + look.yCoord * 5.0D, Par3EntityPlayer.posZ + look.zCoord * 5.0D);
        oilEntity.motionX = look.xCoord * 1.2D;
        oilEntity.motionY = look.yCoord * 1.2D;
        oilEntity.motionZ = look.zCoord * 1.2D;
        this.worldObj.spawnEntityInWorld((Entity)oilEntity);
        props.consumeMana(30 + props.getNinjutsu() / 600);
      } 
    } 
  }
  
  public void ability2(EntityPlayer Par3EntityPlayer) {
    if (!this.worldObj.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 20 + props.getNinjutsu() / 600) {
        WaterGunshotEntity gunshotEntity = new WaterGunshotEntity(this.worldObj, (EntityLivingBase)Par3EntityPlayer);
        Vec3 look = Par3EntityPlayer.getLookVec();
        gunshotEntity.setPosition(Par3EntityPlayer.posX + look.xCoord * 5.0D, Par3EntityPlayer.posY + look.yCoord * 5.0D, Par3EntityPlayer.posZ + look.zCoord * 5.0D);
        gunshotEntity.motionX = look.xCoord * 1.2D;
        gunshotEntity.motionY = look.yCoord * 1.2D;
        gunshotEntity.motionZ = look.zCoord * 1.2D;
        this.worldObj.spawnEntityInWorld((Entity)gunshotEntity);
        props.consumeMana(20 + props.getNinjutsu() / 600);
      } 
    } 
  }
  
  public static class GroupData implements IEntityLivingData {
    public int field_111107_a;
    
    public int field_111106_b;
    
    private static final String __OBFID = "CL_00001643";
    
    public GroupData(int p_i1684_1_, int p_i1684_2_) {
      this.field_111107_a = p_i1684_1_;
      this.field_111106_b = p_i1684_2_;
    }
  }
}

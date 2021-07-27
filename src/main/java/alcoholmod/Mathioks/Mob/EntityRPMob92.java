package alcoholmod.Mathioks.Mob;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.Entity.EntityPhoenixFlowerJutsu;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.Final.CT.GreatFireBallEntity;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.BlockColored;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
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
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityRPMob92 extends EntityTameable {
  private float field_70926_e;
  
  private float field_70924_f;
  
  private boolean isShaking;
  
  private boolean field_70928_h;
  
  private float timeWolfIsShaking;
  
  private float prevTimeWolfIsShaking;
  
  private static final String __OBFID = "CL_00001654";
  
  private boolean Invul = false;
  
  private boolean FirstTamed = false;
  
  private boolean SittingTalk = false;
  
  private int TalkInt = 0;
  
  public EntityRPMob92(World p_i1696_1_) {
    super(p_i1696_1_);
    setSize(0.6F, 2.1F);
    getNavigator().setAvoidsWater(true);
    this.tasks.addTask(1, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(2, (EntityAIBase)this.aiSit);
    this.tasks.addTask(3, (EntityAIBase)new EntityAILeapAtTarget((EntityLiving)this, 0.4F));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, 2.0D, true));
    this.tasks.addTask(5, (EntityAIBase)new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIMate((EntityAnimal)this, 1.0D));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWander((EntityCreature)this, 1.0D));
    this.tasks.addTask(9, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 18.0F));
    this.tasks.addTask(9, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIOwnerHurtByTarget(this));
    this.targetTasks.addTask(2, (EntityAIBase)new EntityAIOwnerHurtTarget(this));
    this.targetTasks.addTask(3, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
    this.targetTasks.addTask(4, (EntityAIBase)new EntityAITargetNonTamed(this, EntityZombie.class, 200, false));
    setTamed(false);
    this.isImmuneToFire = true;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.31000001192092896D);
    if (isTamed()) {
      getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(250.0D);
    } else {
      getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(600.0D);
    } 
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  public void onKillEntity(EntityLivingBase p_70074_1_) {
    super.onKillEntity(p_70074_1_);
    if (getOwner() != null && getOwner() instanceof EntityPlayer && !(p_70074_1_ instanceof EntityAnimal)) {
      EntityPlayer owner = (EntityPlayer)getOwner();
      ExtendedPlayer props = ExtendedPlayer.get(owner);
      props.setChakraExperience(props.getChakraExperience() + 1);
      PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage(owner), (EntityPlayerMP)owner);
    } 
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
  
  public void writeEntityToNBT(NBTTagCompound p_70014_1_) {
    super.writeEntityToNBT(p_70014_1_);
    p_70014_1_.setBoolean("Angry", isAngry());
  }
  
  public void readEntityFromNBT(NBTTagCompound p_70037_1_) {
    super.readEntityFromNBT(p_70037_1_);
    setAngry(p_70037_1_.getBoolean("Angry"));
  }
  
  protected String getLivingSound() {
    return isAngry() ? "" : ((this.rand.nextInt(3) == 0) ? ((isTamed() && this.dataWatcher.getWatchableObjectFloat(18) < 10.0F) ? "" : "") : "");
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
    if (this.Invul) {
      this.entityToAttack = null;
      setAttackTarget((EntityLivingBase)null);
      setAngry(false);
      this.aiSit.setSitting(true);
    } 
    EntityClientPlayerMP entityClientPlayerMP = (Minecraft.getMinecraft()).thePlayer;
    if (this.TalkInt == 10) {
      entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : I have my own goal!"));
      this.TalkInt = 0;
    } 
    if (this.TalkInt == 11) {
      entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : You can't give me enough power!"));
      this.TalkInt = 0;
    } 
    if (this.TalkInt == 12) {
      entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : I have but one goal!"));
      this.TalkInt = 0;
    } 
    if (this.TalkInt == 13) {
      entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : I don't know what powers you posses to have beaten me,"));
      entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : But don't think I'll join you on your little D-rank missions..."));
      this.TalkInt = 0;
    } 
    if (this.TalkInt == 14) {
      entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : I'll help you out, until I can no"));
      entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : longer learn anything from you.."));
      this.TalkInt = 0;
    } 
    if (this.TalkInt == 1) {
      entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : Fire Style: Phoenix Flower Jutsu!"));
      this.TalkInt = 0;
    } 
    if (this.TalkInt == 2) {
      entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : Lightning Style: Chidori!"));
      this.TalkInt = 0;
    } 
    if (this.TalkInt == 3) {
      entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : Fire Style: Great Fireball Jutsu!"));
      this.TalkInt = 0;
    } 
    if (this.TalkInt == 4) {
      entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : Lion Combo!"));
      this.TalkInt = 0;
    } 
    if (this.TalkInt == 19) {
      entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : Sharingan!!"));
      this.TalkInt = 0;
    } 
    if (getOwner() != null) {
      if (isSitting() && this.SittingTalk)
        if (!this.Invul) {
          entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : Good, We're heading out!"));
          this.SittingTalk = false;
        } else {
          entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : Can't you do anything on your own?!"));
          entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : I still need more time!"));
          this.SittingTalk = false;
        }  
      if (!isSitting() && this.SittingTalk) {
        entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : I'll wait here, don't go dying on me.."));
        this.SittingTalk = false;
      } 
      if (this.FirstTamed) {
        entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : Alright " + getAttackTarget().getCommandSenderName() + " I'll join you!"));
        this.FirstTamed = false;
      } 
      if (getAttackTarget() != null) {
        new Random();
        int i = this.rand.nextInt(500);
        if (i == 1) {
          Random rand = new Random();
          int randomNumber = rand.nextInt(7);
          if (randomNumber == 0)
            entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : Over here " + getAttackTarget().getCommandSenderName() + "!")); 
          if (randomNumber == 1)
            entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : " + getAttackTarget().getCommandSenderName() + "!! I'll destroy you!")); 
          if (randomNumber == 2)
            entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : Hey " + getAttackTarget().getCommandSenderName() + " let me sever your ties with the earth!!")); 
          if (randomNumber == 3)
            entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : " + getAttackTarget().getCommandSenderName() + " my sharingan can see your every move!")); 
          if (randomNumber == 4)
            entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : " + getAttackTarget().getCommandSenderName() + " don't underestimate the Uchiha!!")); 
          if (randomNumber == 5)
            entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : " + getAttackTarget().getCommandSenderName() + " feel my hatred!!")); 
          if (randomNumber == 6)
            entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : " + getAttackTarget().getCommandSenderName() + " this is the power of the Uchiha!!")); 
          if (randomNumber == 7)
            entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : Hey " + getOwner().getCommandSenderName() + " Back me up!")); 
        } 
      } 
    } 
    if (this.Invul && getHealth() < getMaxHealth() && getHealth() > 0.0F && getHealth() < getMaxHealth()) {
      new Random();
      int i = this.rand.nextInt(30);
      if (i == 1)
        heal(1.0F); 
    } 
    if (this.Invul && getHealth() == getMaxHealth()) {
      this.Invul = false;
      this.aiSit.setSitting(false);
    } 
    super.onUpdate();
    this.field_70924_f = this.field_70926_e;
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
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    Random rand = new Random();
    int randomNumber = rand.nextInt(1800);
    int damage = 1;
    int i = 0;
    if (randomNumber >= 1499 && randomNumber <= 1515) {
      EntityPhoenixFlowerJutsu entitysnowball = new EntityPhoenixFlowerJutsu(this.worldObj, (EntityLivingBase)this);
      EntityPhoenixFlowerJutsu entitysnowball2 = new EntityPhoenixFlowerJutsu(this.worldObj, (EntityLivingBase)this);
      EntityPhoenixFlowerJutsu entitysnowball3 = new EntityPhoenixFlowerJutsu(this.worldObj, (EntityLivingBase)this);
      double d1 = par1Entity.posX - this.posX;
      double d2 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
      float f1 = MathHelper.sqrt_double(d1 * d1 + d2 * d2) * 0.2F;
      entitysnowball.setThrowableHeading(d1, d2 + f1, d2, 1.6F, 12.0F);
      playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
      double var10000 = par1Entity.posX - this.posX;
      double d12 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball2.posY;
      var10000 = par1Entity.posZ - this.posZ;
      float f12 = MathHelper.sqrt_double(d1 * d1 + d2 * d2) * 0.2F;
      entitysnowball2.setThrowableHeading(d1, d2 + f1, d2, 1.6F, 12.0F);
      playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
      var10000 = par1Entity.posX - this.posX;
      double d13 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball3.posY;
      var10000 = par1Entity.posZ - this.posZ;
      float f13 = MathHelper.sqrt_double(d1 * d1 + d2 * d2) * 0.2F;
      entitysnowball3.setThrowableHeading(d1, d2 + f1, d2, 1.6F, 12.0F);
      playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
      this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
      this.worldObj.spawnEntityInWorld((Entity)entitysnowball2);
      this.worldObj.spawnEntityInWorld((Entity)entitysnowball3);
      this.TalkInt = 1;
    } 
    if (randomNumber >= 100 && randomNumber <= 105) {
      addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 50, 1));
      addPotionEffect(new PotionEffect(Potion.damageBoost.id, 50, 5));
      damage = 15;
      this.TalkInt = 2;
    } 
    if (randomNumber >= 1002 && randomNumber <= 1006) {
      GreatFireBallEntity entitysnowball = new GreatFireBallEntity(this.worldObj, (EntityLivingBase)this);
      double d0 = par1Entity.posX - this.posX;
      double d1 = par1Entity.posY + par1Entity.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
      double d2 = par1Entity.posZ - this.posZ;
      float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
      entitysnowball.setThrowableHeading(d0, d1 + f1, d2, 1.6F, 12.0F);
      playSound("random.bow", 1.0F, 1.0F / (getRNG().nextFloat() * 0.4F + 0.8F));
      this.worldObj.spawnEntityInWorld((Entity)entitysnowball);
      this.TalkInt = 3;
    } 
    if (randomNumber >= 200 && randomNumber <= 207) {
      damage = 7;
      this.TalkInt = 4;
    } 
    if (randomNumber >= 0 && randomNumber <= 7) {
      addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1000, 0));
      addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1000, 3));
      addPotionEffect(new PotionEffect(Potion.jump.id, 1000, 0));
      addPotionEffect(new PotionEffect(Potion.resistance.id, 1000, 0));
      this.TalkInt = 19;
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
  
  public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
    if (isEntityInvulnerable())
      return false; 
    Entity entity = p_70097_1_.getEntity();
    this.aiSit.setSitting(false);
    if (entity != null && !(entity instanceof EntityPlayer) && !(entity instanceof net.minecraft.entity.projectile.EntityArrow))
      p_70097_2_ = (p_70097_2_ + 1.0F) / 2.0F; 
    return super.attackEntityFrom(p_70097_1_, p_70097_2_);
  }
  
  public void setTamed(boolean p_70903_1_) {
    super.setTamed(p_70903_1_);
    if (p_70903_1_) {
      getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0D);
    } else {
      getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0D);
    } 
  }
  
  public boolean interact(EntityPlayer p_70085_1_) {
    ItemStack itemstack = p_70085_1_.inventory.getCurrentItem();
    if (isTamed()) {
      if (itemstack != null)
        if (itemstack.getItem() instanceof ItemFood) {
          ItemFood itemfood = (ItemFood)itemstack.getItem();
          if (itemfood.isWolfsFavoriteMeat() && this.dataWatcher.getWatchableObjectFloat(18) < 200.0F) {
            if (!p_70085_1_.capabilities.isCreativeMode)
              itemstack.stackSize--; 
            heal(itemfood.func_150905_g(itemstack));
            if (itemstack.stackSize <= 0)
              p_70085_1_.inventory.setInventorySlotContents(p_70085_1_.inventory.currentItem, (ItemStack)null); 
            return true;
          } 
        } else {
          if (itemstack.getItem() instanceof ItemArmor) {
            ItemArmor itemarmor = (ItemArmor)itemstack.getItem();
            if (itemarmor.isValidArmor(itemstack, 2, (Entity)this))
              setCurrentItemOrArmor(1, getOwner().getHeldItem()); 
            if (itemarmor.isValidArmor(itemstack, 1, (Entity)this))
              setCurrentItemOrArmor(3, getOwner().getHeldItem()); 
            if (itemarmor.isValidArmor(itemstack, 0, (Entity)this))
              setCurrentItemOrArmor(4, getOwner().getHeldItem()); 
            return true;
          } 
          if (itemstack.getItem() == Items.shears) {
            setCurrentItemOrArmor(1, (ItemStack)null);
            setCurrentItemOrArmor(2, (ItemStack)null);
            setCurrentItemOrArmor(3, (ItemStack)null);
            setCurrentItemOrArmor(4, (ItemStack)null);
            return true;
          } 
        }  
      if (func_152114_e((EntityLivingBase)p_70085_1_) && !this.worldObj.isRemote) {
        this.aiSit.setSitting(!isSitting());
        this.isJumping = false;
        setPathToEntity((PathEntity)null);
        setTarget((Entity)null);
        setAttackTarget((EntityLivingBase)null);
        this.SittingTalk = true;
      } 
    } else if (itemstack != null && itemstack.getItem() == AlcoholMod.CompanionMedal && !isAngry()) {
      if (itemstack.stackSize <= 0)
        p_70085_1_.inventory.setInventorySlotContents(p_70085_1_.inventory.currentItem, (ItemStack)null); 
      if (!this.worldObj.isRemote && this.Invul) {
        ExtendedPlayer props = ExtendedPlayer.get(p_70085_1_);
        if (props.getRank() >= 4 && props.getRank() <= 20) {
          if (!p_70085_1_.capabilities.isCreativeMode)
            itemstack.stackSize--; 
          if (this.rand.nextInt(3) == 0) {
            setTamed(true);
            setPathToEntity((PathEntity)null);
            setAttackTarget((EntityLivingBase)null);
            this.aiSit.setSitting(true);
            setHealth(200.0F);
            func_152115_b(p_70085_1_.getUniqueID().toString());
            playTameEffect(false);
            this.worldObj.setEntityState((Entity)this, (byte)7);
            this.TalkInt = 14;
          } else {
            setTamed(true);
            setPathToEntity((PathEntity)null);
            setAttackTarget((EntityLivingBase)null);
            this.aiSit.setSitting(true);
            setHealth(500.0F);
            func_152115_b(p_70085_1_.getUniqueID().toString());
            playTameEffect(false);
            this.worldObj.setEntityState((Entity)this, (byte)7);
            this.TalkInt = 14;
          } 
        } 
        if (props.getRank() == 3)
          this.TalkInt = 10; 
        if (props.getRank() == 2)
          this.TalkInt = 11; 
        if (props.getRank() == 1)
          this.TalkInt = 12; 
        if (props.getRank() == 21)
          this.TalkInt = 13; 
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
  
  public void func_70918_i(boolean p_70918_1_) {
    if (p_70918_1_) {
      this.dataWatcher.updateObject(19, Byte.valueOf((byte)1));
    } else {
      this.dataWatcher.updateObject(19, Byte.valueOf((byte)0));
    } 
  }
  
  public boolean func_70922_bv() {
    return (this.dataWatcher.getWatchableObjectByte(19) == 1);
  }
  
  protected boolean canDespawn() {
    return (!isTamed() && this.ticksExisted > 2400);
  }
  
  protected void onDeathUpdate() {
    if (getOwner() != null && !this.worldObj.isRemote) {
      EntityClientPlayerMP entityClientPlayerMP = (Minecraft.getMinecraft()).thePlayer;
      Random rand = new Random();
      int randomNumber = rand.nextInt(3);
      if (randomNumber == 1)
        entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : aaAAARGH!! " + getOwner().getCommandSenderName() + " you're on your own for now!")); 
      if (randomNumber == 2)
        entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : AAAaaAAaARGH, How... Can he be.. So... Strong?!!")); 
      if (randomNumber == 3)
        entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : I'll avenge my clan!!")); 
      if (randomNumber == 0)
        entityClientPlayerMP.addChatComponentMessage((IChatComponent)new ChatComponentText("Sasuke : Hey " + getOwner().getCommandSenderName() + " I'll need you to grant me some time now!")); 
    } 
    setHealth(10.0F);
    this.Invul = true;
  }
  
  public boolean isEntityInvulnerable() {
    return this.Invul;
  }
  
  public EntityAgeable createChild(EntityAgeable p_90011_1_) {
    return null;
  }
}

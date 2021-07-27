package alcoholmod.Mathioks.Mob;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.Entity.NarutoBunshin;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
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

public class EntityRPMob93 extends EntityTameable {
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
  
  public EntityRPMob93(World p_i1696_1_) {
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
      getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0D);
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
    if (getOwner() != null) {
      EntityPlayer Entity = (EntityPlayer)getOwner();
      if (this.TalkInt == 10) {
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : I have my own ideals!"));
        this.TalkInt = 0;
      } 
      if (this.TalkInt == 11) {
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : I'm gonna become the hokage!"));
        this.TalkInt = 0;
      } 
      if (this.TalkInt == 12) {
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : One day, I'll be hokage, BELIEVE IT!!"));
        this.TalkInt = 0;
      } 
      if (this.TalkInt == 13) {
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : If I can't even win against you,"));
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : then how can I ever become hokage?!!"));
        this.TalkInt = 0;
      } 
      if (this.TalkInt == 14) {
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : Alriiight!! Let's go find Ichiraku Ramen!!"));
        this.TalkInt = 0;
      } 
      if (this.TalkInt == 1) {
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : U-ZU-MA-KI --- Naruto Rendan!!"));
        this.TalkInt = 0;
      } 
      if (this.TalkInt == 2) {
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : U-ZU-MA-KI --- 2K BARRAGE!!!"));
        this.TalkInt = 0;
      } 
      if (this.TalkInt == 3) {
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : Rasengan!!"));
        this.TalkInt = 0;
      } 
      if (this.TalkInt == 4) {
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : What is this chakra?.. I'm.. Healing!"));
        this.TalkInt = 0;
      } 
      if (this.TalkInt == 19) {
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : Shadow Clone Jutsu!"));
        this.TalkInt = 0;
      } 
      if (isSitting() && this.SittingTalk)
        if (!this.Invul) {
          Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : Alright!! Are we going to Ichiraku's first?!"));
          Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : Can't start a mission on an empty stomach!"));
          this.SittingTalk = false;
        } else {
          Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : Ughh.. I... Promise I'll be there in no time!"));
          this.SittingTalk = false;
        }  
      if (!isSitting() && this.SittingTalk) {
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : AAWWW, Why can't I come along?!"));
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : You better not be planning a date with Sakura!"));
        this.SittingTalk = false;
      } 
      if (this.FirstTamed) {
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : Alright " + getAttackTarget().getCommandSenderName() + " I'll join you!"));
        this.FirstTamed = false;
      } 
      if (getAttackTarget() != null) {
        new Random();
        int randomNumberSay = this.rand.nextInt(500);
        if (randomNumberSay == 1) {
          Random rand = new Random();
          int randomNumber = rand.nextInt(7);
          if (randomNumber == 0)
            Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : Hey " + getAttackTarget().getCommandSenderName() + " You big fat bully!")); 
          if (randomNumber == 1)
            Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : " + getAttackTarget().getCommandSenderName() + " Let me show you Naruto Uzumakis power!")); 
          if (randomNumber == 2)
            Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : Hey " + getAttackTarget().getCommandSenderName() + " I'll beat you down!")); 
          if (randomNumber == 3)
            Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : " + getAttackTarget().getCommandSenderName() + " bet you can't hit me! HAHAHA!")); 
          if (randomNumber == 4)
            Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : " + getAttackTarget().getCommandSenderName() + " I won't let you hurt my friends! BELIEVE IT!!")); 
          if (randomNumber == 5)
            Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : " + getAttackTarget().getCommandSenderName() + " this is what it means to be a shinobi!")); 
          if (randomNumber == 6)
            Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : " + getAttackTarget().getCommandSenderName() + ", Naruto Uzumaki is the name, Remember it!!")); 
          if (randomNumber == 7)
            Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : " + getOwner().getCommandSenderName() + " Fear not! Naruto Uzumaki is here!")); 
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
        for (int randomNumberSay = 0; randomNumberSay < i; randomNumberSay++) {
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
    if (randomNumber >= 1499 && randomNumber <= 1520) {
      addPotionEffect(new PotionEffect(Potion.jump.id, 25, 2));
      damage = 11;
      this.TalkInt = 1;
    } 
    if (randomNumber >= 100 && randomNumber <= 115) {
      addPotionEffect(new PotionEffect(Potion.jump.id, 25, 2));
      damage = 18;
      addPotionEffect(new PotionEffect(Potion.damageBoost.id, 25, 2));
      this.TalkInt = 2;
    } 
    if (randomNumber >= 1002 && randomNumber <= 1010) {
      damage = 23;
      float f1 = 1.0F;
      int i1 = (int)(par1Entity.prevPosX + (par1Entity.posX - par1Entity.prevPosX) * f1);
      int j = (int)(par1Entity.prevPosY + (par1Entity.posY - par1Entity.prevPosY) * f1 + 1.62D - par1Entity.yOffset);
      int k = (int)(par1Entity.prevPosZ + (par1Entity.posZ - par1Entity.prevPosZ) * f1);
      par1Entity.addVelocity((-MathHelper.sin(par1Entity.rotationYaw * 3.141593F / 180.0F) * j * 0.5F) / 88.0D, 0.1D, (MathHelper.cos(par1Entity.rotationYaw * 3.141593F / 180.0F) * j * 0.5F) / 88.0D);
      this.TalkInt = 3;
    } 
    if (randomNumber >= 200 && randomNumber <= 207) {
      addPotionEffect(new PotionEffect(Potion.heal.id, 50, 1));
      this.TalkInt = 4;
    } 
    if (randomNumber >= 0 && randomNumber <= 50) {
      NarutoBunshin EntityBunshin = new NarutoBunshin(this.worldObj);
      NarutoBunshin EntityBunshin1 = new NarutoBunshin(this.worldObj);
      NarutoBunshin EntityBunshin2 = new NarutoBunshin(this.worldObj);
      EntityBunshin.func_152115_b(getUniqueID().toString());
      EntityBunshin.setTamed(true);
      EntityBunshin.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, this.rotationYaw, 0.0F);
      EntityBunshin.rotationYawHead = EntityBunshin.rotationYaw;
      EntityBunshin.renderYawOffset = EntityBunshin.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)EntityBunshin);
      EntityBunshin1.func_152115_b(getUniqueID().toString());
      EntityBunshin1.setTamed(true);
      EntityBunshin1.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, this.rotationYaw, 0.0F);
      EntityBunshin1.rotationYawHead = EntityBunshin1.rotationYaw;
      EntityBunshin1.renderYawOffset = EntityBunshin1.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)EntityBunshin1);
      EntityBunshin2.func_152115_b(getUniqueID().toString());
      EntityBunshin2.setTamed(true);
      EntityBunshin2.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, this.rotationYaw, 0.0F);
      EntityBunshin2.rotationYawHead = EntityBunshin2.rotationYaw;
      EntityBunshin2.renderYawOffset = EntityBunshin2.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)EntityBunshin2);
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
        if (props.getRank() >= 4 && props.getRank() <= 21) {
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
            setHealth(200.0F);
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
      EntityPlayer Entity = (EntityPlayer)getOwner();
      Random rand = new Random();
      int randomNumber = rand.nextInt(3);
      if (randomNumber == 1)
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : WaaaAAH!! " + getOwner().getCommandSenderName() + " I... Can't... Los...e..")); 
      if (randomNumber == 2)
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : WAAaaAarghh!!")); 
      if (randomNumber == 3)
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : I can't become the hokage.. If I can't.. even protect.. My.. Friends...!")); 
      if (randomNumber == 0)
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Naruto : Hey " + getOwner().getCommandSenderName() + " I... Can't... Go ... On...")); 
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
  
  public boolean canAttackClass(Class par1Class) {
    return true;
  }
}

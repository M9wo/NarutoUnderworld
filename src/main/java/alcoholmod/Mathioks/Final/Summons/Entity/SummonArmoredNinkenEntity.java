package alcoholmod.Mathioks.Final.Summons.Entity;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class SummonArmoredNinkenEntity extends EntityTameable {
  private float field_70926_e;
  
  private float field_70924_f;
  
  private boolean isShaking;
  
  private boolean field_70928_h;
  
  private float timeWolfIsShaking;
  
  private float prevTimeWolfIsShaking;
  
  public int deathTicks;
  
  public SummonArmoredNinkenEntity(World par1World) {
    super(par1World);
    this.tasks.addTask(4, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, 1.0D, true));
    this.tasks.addTask(5, (EntityAIBase)new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWander((EntityCreature)this, 1.0D));
    this.tasks.addTask(8, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(9, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIOwnerHurtByTarget(this));
    this.targetTasks.addTask(2, (EntityAIBase)new EntityAIOwnerHurtTarget(this));
    this.targetTasks.addTask(3, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
    this.tasks.addTask(10, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    setSize(0.9F, 1.2F);
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4D);
  }
  
  protected String getLivingSound() {
    return "mob.wolf.growl";
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(19, new Byte((byte)0));
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    int i = 5;
    return (getOwner() != null) ? par1Entity.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)getOwner()), i) : par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), i);
  }
  
  public void onKillEntity(EntityLivingBase p_70074_1_) {
    super.onKillEntity(p_70074_1_);
    if (getOwner() != null && getOwner() instanceof EntityPlayer && !(p_70074_1_ instanceof net.minecraft.entity.passive.EntityAnimal) && !(p_70074_1_ instanceof net.minecraft.entity.passive.EntityWaterMob)) {
      EntityPlayer owner = (EntityPlayer)getOwner();
      ExtendedPlayer props = ExtendedPlayer.get(owner);
      props.setChakraExperience(props.getChakraExperience() + 1);
      PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage(owner), (EntityPlayerMP)owner);
    } 
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public float getInterestedAngle(float p_70917_1_) {
    return (this.field_70924_f + (this.field_70926_e - this.field_70924_f) * p_70917_1_) * 0.15F * 3.1415927F;
  }
  
  protected void dropRareDrop(int p_70600_1_) {
    entityDropItem(new ItemStack(AlcoholMod.SummonArmoredNinken, 1, 1), 0.0F);
  }
  
  public boolean func_70922_bv() {
    return (this.dataWatcher.getWatchableObjectByte(19) == 1);
  }
  
  public void onUpdate() {
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
        for (int randomNumber = 0; randomNumber < i; randomNumber++) {
          float f1 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width * 0.5F;
          float f2 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width * 0.5F;
          this.worldObj.spawnParticle("splash", this.posX + f1, (f + 0.8F), this.posZ + f2, this.motionX, this.motionY, this.motionZ);
        } 
      } 
    } 
    EntityPlayer Entity = (EntityPlayer)getOwner();
    if (this.ticksExisted >= 6000 && !this.worldObj.isRemote) {
      if (getOwner() != null) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(3);
        if (randomNumber == 1)
          Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Ni-Inu : This is it for me!")); 
        if (randomNumber == 2)
          Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Ni-Inu : I must go now!")); 
        if (randomNumber == 3)
          Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Ni-Inu : My time is over, Till Next Time!")); 
        if (randomNumber == 0)
          Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Ni-Inu : My time is up, See you around!")); 
      } 
      setDead();
    } 
    if (getOwner() != null) {
      if (getAttackTarget() != null && (this.ticksExisted == 500 || this.ticksExisted == 1500 || this.ticksExisted == 2500 || this.ticksExisted == 3500 || this.ticksExisted == 4500 || this.ticksExisted == 5500)) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(3);
        if (randomNumber == 0)
          Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Ni-Inu : I'll get you " + getAttackTarget().getCommandSenderName() + "!!")); 
        if (randomNumber == 1)
          Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Ni-Inu : You picked a fight with the wrong dog " + getAttackTarget().getCommandSenderName() + "!!")); 
        if (randomNumber == 2)
          Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Ni-Inu : I'll wipe that smirk off of your face " + getAttackTarget().getCommandSenderName() + "!!")); 
        if (randomNumber == 3)
          Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Ni-Inu : Hey " + getAttackTarget().getCommandSenderName() + " Let me show you how the big guys fight!")); 
      } 
      if (this.ticksExisted == 20 && !this.worldObj.isRemote) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(3);
        if (randomNumber == 1)
          Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Ni-Inu : Why did you summon me?")); 
        if (randomNumber == 2)
          Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Ni-Inu : What is it?")); 
        if (randomNumber == 3)
          Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Ni-Inu : Another fight huh?")); 
        if (randomNumber == 0)
          Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Ni-Inu : Who are we taking on this time?")); 
      } 
    } 
    super.onUpdate();
  }
  
  public void setAttackTarget(EntityLivingBase p_70624_1_) {
    super.setAttackTarget(p_70624_1_);
    if (p_70624_1_ == null) {
      setAngry(false);
    } else if (!isTamed()) {
      setAngry(true);
    } 
  }
  
  public void setAngry(boolean p_70916_1_) {
    byte b0 = this.dataWatcher.getWatchableObjectByte(16);
    if (p_70916_1_) {
      this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 | 0x2)));
    } else {
      this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 & 0xFFFFFFFD)));
    } 
  }
  
  public EnumCreatureAttribute getCreatureAttribute() {
    return EnumCreatureAttribute.UNDEAD;
  }
  
  protected boolean canDespawn() {
    return false;
  }
  
  public EntityAgeable createChild(EntityAgeable entityageable) {
    return null;
  }
  
  protected void onDeathUpdate() {
    this.deathTicks++;
    if (getOwner() != null && !this.worldObj.isRemote) {
      EntityPlayer Entity = (EntityPlayer)getOwner();
      Random rand = new Random();
      int randomNumber = rand.nextInt(3);
      if (randomNumber == 1)
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Ni-Inu : AAAARGH I'm done for!")); 
      if (randomNumber == 2)
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Ni-Inu : DAMN YOU!!")); 
      if (randomNumber == 3)
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Ni-Inu : You better... Finish this!!")); 
      if (randomNumber == 0)
        Entity.addChatComponentMessage((IChatComponent)new ChatComponentText("Ni-Inu : AARGH! I'LL GET HIM NEXT TIME!")); 
    } 
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
  
  public boolean canAttackClass(Class par1Class) {
    return true;
  }
  
  protected boolean isValidLightLevel() {
    int i = MathHelper.floor_double(this.posX);
    int j = MathHelper.floor_double(this.boundingBox.minY);
    int k = MathHelper.floor_double(this.posZ);
    if (this.worldObj.getSavedLightValue(EnumSkyBlock.Sky, i, j, k) > this.rand.nextInt(32))
      return false; 
    int l = this.worldObj.getBlockLightValue(i, j, k);
    if (this.worldObj.isThundering()) {
      int i1 = this.worldObj.skylightSubtracted;
      this.worldObj.skylightSubtracted = 10;
      l = this.worldObj.getBlockLightValue(i, j, k);
      this.worldObj.skylightSubtracted = i1;
    } 
    return (l <= this.rand.nextInt(8));
  }
  
  public boolean getCanSpawnHere() {
    return (this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && isValidLightLevel() && super.getCanSpawnHere());
  }
}

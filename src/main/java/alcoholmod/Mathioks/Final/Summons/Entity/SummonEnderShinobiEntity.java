package alcoholmod.Mathioks.Final.Summons.Entity;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import java.util.Random;
import net.minecraft.block.Block;
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
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class SummonEnderShinobiEntity extends EntityTameable {
  public int deathTicks;
  
  private static boolean[] carriableBlocks = new boolean[256];
  
  private int teleportDelay;
  
  private int stareTimer;
  
  private Entity lastEntityToAttack;
  
  private boolean isAggressive;
  
  public SummonEnderShinobiEntity(World par1World) {
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
    setSize(0.6F, 2.9F);
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4D);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(18, new Byte((byte)0));
  }
  
  public void onLivingUpdate() {
    if (isWet())
      attackEntityFrom(DamageSource.drown, 1.0F); 
    if (this.lastEntityToAttack != this.entityToAttack) {
      IAttributeInstance iattributeinstance = getEntityAttribute(SharedMonsterAttributes.movementSpeed);
      if (this.entityToAttack != null);
    } 
    this.lastEntityToAttack = this.entityToAttack;
    for (int k = 0; k < 2; k++)
      this.worldObj.spawnParticle("portal", this.posX + (this.rand.nextDouble() - 0.5D) * this.width, this.posY + this.rand.nextDouble() * this.height - 0.25D, this.posZ + (this.rand.nextDouble() - 0.5D) * this.width, (this.rand.nextDouble() - 0.5D) * 2.0D, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5D) * 2.0D); 
    if (this.worldObj.isDaytime() && !this.worldObj.isRemote) {
      float f = getBrightness(1.0F);
      if (f > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) {
        this.entityToAttack = null;
        setScreaming(false);
        this.isAggressive = false;
        teleportRandomly();
      } 
    } 
    if (isWet() || isBurning()) {
      this.entityToAttack = null;
      setScreaming(false);
      this.isAggressive = false;
      teleportRandomly();
    } 
    if (isScreaming() && !this.isAggressive && this.rand.nextInt(100) == 0)
      setScreaming(false); 
    this.isJumping = false;
    if (this.entityToAttack != null)
      faceEntity(this.entityToAttack, 100.0F, 100.0F); 
    if (!this.worldObj.isRemote && isEntityAlive())
      if (this.entityToAttack != null) {
        if (this.entityToAttack.getDistanceSqToEntity((Entity)this) < 16.0D)
          teleportRandomly(); 
        if (this.entityToAttack != null) {
          this.teleportDelay = 0;
        } else if (this.entityToAttack.getDistanceSqToEntity((Entity)this) > 256.0D && this.teleportDelay++ >= 30 && teleportToEntity(this.entityToAttack)) {
          this.teleportDelay = 0;
        } 
      } else {
        setScreaming(false);
        this.teleportDelay = 0;
      }  
    super.onLivingUpdate();
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
  
  protected void dropRareDrop(int p_70600_1_) {
    entityDropItem(new ItemStack(AlcoholMod.SummonEnderShinobi, 1, 1), 0.0F);
  }
  
  protected boolean teleportRandomly() {
    double d0 = this.posX + (this.rand.nextDouble() - 0.5D) * 64.0D;
    double d1 = this.posY + (this.rand.nextInt(64) - 32);
    double d2 = this.posZ + (this.rand.nextDouble() - 0.5D) * 64.0D;
    return teleportTo(d0, d1, d2);
  }
  
  public boolean isScreaming() {
    return (this.dataWatcher.getWatchableObjectByte(18) > 0);
  }
  
  public void setScreaming(boolean p_70819_1_) {
    this.dataWatcher.updateObject(18, Byte.valueOf((byte)(p_70819_1_ ? 1 : 0)));
  }
  
  protected boolean teleportToEntity(Entity p_70816_1_) {
    Vec3 vec3 = Vec3.createVectorHelper(this.posX - p_70816_1_.posX, this.boundingBox.minY + (this.height / 2.0F) - p_70816_1_.posY + p_70816_1_.getEyeHeight(), this.posZ - p_70816_1_.posZ);
    vec3 = vec3.normalize();
    double d0 = 16.0D;
    double d1 = this.posX + (this.rand.nextDouble() - 0.5D) * 8.0D - vec3.xCoord * d0;
    double d2 = this.posY + (this.rand.nextInt(16) - 8) - vec3.yCoord * d0;
    double d3 = this.posZ + (this.rand.nextDouble() - 0.5D) * 8.0D - vec3.zCoord * d0;
    return teleportTo(d1, d2, d3);
  }
  
  protected boolean teleportTo(double p_70825_1_, double p_70825_3_, double p_70825_5_) {
    EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)this, p_70825_1_, p_70825_3_, p_70825_5_, 0.0F);
    if (MinecraftForge.EVENT_BUS.post((Event)event))
      return false; 
    double d3 = this.posX;
    double d4 = this.posY;
    double d5 = this.posZ;
    this.posX = event.targetX;
    this.posY = event.targetY;
    this.posZ = event.targetZ;
    boolean flag = false;
    int i = MathHelper.floor_double(this.posX);
    int j = MathHelper.floor_double(this.posY);
    int k = MathHelper.floor_double(this.posZ);
    if (this.worldObj.blockExists(i, j, k)) {
      boolean flag1 = false;
      while (!flag1 && j > 0) {
        Block block = this.worldObj.getBlock(i, j - 1, k);
        if (block.getMaterial().blocksMovement()) {
          flag1 = true;
          continue;
        } 
        this.posY--;
        j--;
      } 
      if (flag1) {
        setPosition(this.posX, this.posY, this.posZ);
        if (this.worldObj.getCollidingBoundingBoxes((Entity)this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox))
          flag = true; 
      } 
    } 
    if (!flag) {
      setPosition(d3, d4, d5);
      return false;
    } 
    short short1 = 128;
    for (int l = 0; l < short1; l++) {
      double d6 = l / (short1 - 1.0D);
      float f = (this.rand.nextFloat() - 0.5F) * 0.2F;
      float f1 = (this.rand.nextFloat() - 0.5F) * 0.2F;
      float f2 = (this.rand.nextFloat() - 0.5F) * 0.2F;
      double d7 = d3 + (this.posX - d3) * d6 + (this.rand.nextDouble() - 0.5D) * this.width * 2.0D;
      double d8 = d4 + (this.posY - d4) * d6 + this.rand.nextDouble() * this.height;
      double d9 = d5 + (this.posZ - d5) * d6 + (this.rand.nextDouble() - 0.5D) * this.width * 2.0D;
      this.worldObj.spawnParticle("portal", d7, d8, d9, f, f1, f2);
    } 
    this.worldObj.playSoundEffect(d3, d4, d5, "mob.endermen.portal", 1.0F, 1.0F);
    playSound("mob.endermen.portal", 1.0F, 1.0F);
    return true;
  }
  
  protected String getLivingSound() {
    return isScreaming() ? "mob.endermen.scream" : "mob.endermen.idle";
  }
  
  protected String getHurtSound() {
    return "mob.endermen.hit";
  }
  
  protected String getDeathSound() {
    return "mob.endermen.death";
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    int i = 7;
    return (getOwner() != null) ? par1Entity.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)getOwner()), i) : par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), i);
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
    if (isEntityInvulnerable())
      return false; 
    setScreaming(true);
    if (p_70097_1_ instanceof net.minecraft.util.EntityDamageSource && p_70097_1_.getEntity() instanceof EntityPlayer)
      this.isAggressive = true; 
    if (p_70097_1_ instanceof net.minecraft.util.EntityDamageSourceIndirect) {
      this.isAggressive = false;
      for (int i = 0; i < 64; i++) {
        if (teleportRandomly())
          return true; 
      } 
      return super.attackEntityFrom(p_70097_1_, p_70097_2_);
    } 
    return super.attackEntityFrom(p_70097_1_, p_70097_2_);
  }
  
  public void onUpdate() {
    EntityPlayer entityPlayer = (EntityPlayer)getOwner();
    if (this.ticksExisted >= 6000 && !this.worldObj.isRemote) {
      if (getOwner() != null) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(3);
        if (randomNumber == 1)
          entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Slendobi : My time is up, see yah")); 
        if (randomNumber == 2)
          entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Slendobi : I gotta bro, *Fistbump*")); 
        if (randomNumber == 3)
          entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Slendobi : My time is over, don't worry, I'll beam myself up!")); 
        if (randomNumber == 0)
          entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Slendobi : Listen up " + getOwner().getCommandSenderName() + " My time is up, good luck and see ya later!")); 
      } 
      setDead();
    } 
    if (getOwner() != null) {
      if (getAttackTarget() != null && (this.ticksExisted == 500 || this.ticksExisted == 1500 || this.ticksExisted == 2500 || this.ticksExisted == 3500 || this.ticksExisted == 4500 || this.ticksExisted == 5500)) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(3);
        if (randomNumber == 0)
          entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Slendobi : DIE " + getAttackTarget().getCommandSenderName() + "!!")); 
        if (randomNumber == 1)
          entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Slendobi : I'll haunt your dreams " + getAttackTarget().getCommandSenderName() + "!!")); 
        if (randomNumber == 2)
          entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Slendobi : Come here " + getAttackTarget().getCommandSenderName() + "!!")); 
        if (randomNumber == 3)
          entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Slendobi : heh heh, " + getAttackTarget().getCommandSenderName() + ", Let's finish this HAHAHA!")); 
      } 
      if (this.ticksExisted == 20 && !this.worldObj.isRemote) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(3);
        if (randomNumber == 1)
          entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Slendobi : Why did you summon me " + getOwner().getCommandSenderName())); 
        if (randomNumber == 2)
          entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Slendobi : What will we do this time friend?")); 
        if (randomNumber == 3)
          entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Slendobi : Need some a hand bro?")); 
        if (randomNumber == 0) {
          entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Slendobi : Different time, different place."));
          entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("But you still need Slendobis help!"));
          entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("It's good to see ya buddy!"));
        } 
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
      EntityPlayer entityPlayer = (EntityPlayer)getOwner();
      Random rand = new Random();
      int randomNumber = rand.nextInt(3);
      if (randomNumber == 1)
        entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Slendobi : aaargh DAMNIT! I'll leave it to you " + getOwner().getCommandSenderName())); 
      if (randomNumber == 2)
        entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Slendobi : AAaaAAaaAAARGH")); 
      if (randomNumber == 3)
        entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Slendobi : I'm down for the count bro, good luck!")); 
      if (randomNumber == 0)
        entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Slendobi : I gave it all I got, but this is it, see you later friend!")); 
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

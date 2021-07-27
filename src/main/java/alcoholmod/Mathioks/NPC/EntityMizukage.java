package alcoholmod.Mathioks.NPC;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.item.ShurikenEntity;
import alcoholmod.Mathioks.item.ShurikenSmallEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
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

public class EntityMizukage extends EntityKage implements IRangedAttackMob {
  private EntityAIArrowAttack aiArrowAttack = new EntityAIArrowAttack(this, 1.25D, 20, 60, 15.0F);
  
  private EntityAIAttackOnCollide aiAttackOnCollide3 = new EntityAIAttackOnCollide(this, EntityMob.class, 1.2D, false);
  
  private int timer;
  
  private int timer2;
  
  private int homeCheckTimer;
  
  Village villageObj;
  
  private int attackTimer;
  
  private int giveCounter = 0;
  
  Random rand = new Random();
  
  public EntityMizukage(World par1World) {
    super(par1World);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIMoveTowardsRestriction(this, 1.0D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWander(this, 1.0D));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget(this, true));
    this.targetTasks.addTask(3, (EntityAIBase)new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, true, IMob.mobSelector));
    this.tasks.addTask(11, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityMob.class, 8.0F));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIMoveThroughVillage(this, 0.6D, true));
    this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.tasks.addTask(12, (EntityAIBase)new EntityAILeapAtTarget((EntityLiving)this, 1.0F));
    this.tasks.addTask(14, (EntityAIBase)new EntityAIMoveIndoors(this));
    this.tasks.addTask(13, (EntityAIBase)new EntityAIRestrictOpenDoor(this));
    this.tasks.addTask(15, (EntityAIBase)new EntityAIOpenDoor((EntityLiving)this, true));
    this.tasks.addTask(16, (EntityAIBase)new EntityAIMoveThroughVillage(this, 0.6D, true));
    this.tasks.addTask(4, (EntityAIBase)this.aiAttackOnCollide3);
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
    setTameSkin(this.worldObj.rand.nextInt(4));
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(100.0D);
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(800.0D);
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
    ItemStack itemstack = p_70085_1_.inventory.getCurrentItem();
    if (p_70085_1_ != null) {
      ExtendedPlayer props = ExtendedPlayer.get(p_70085_1_);
      if (props.getAffiliation() == 1 && props.getRank() == 13 && !this.worldObj.isRemote) {
        p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: How dare you show your face here Akatsuki!!"));
        attackEntityAsMob((Entity)p_70085_1_);
      } 
      if (props.getAffiliation() == 1 && props.getRank() == 14 && !this.worldObj.isRemote) {
        p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: An Akatsuki Leader.. Let me take care of you!!"));
        attackEntityAsMob((Entity)p_70085_1_);
      } 
      if (props.getLevel() < 25 && props.getRank() == 21) {
        if (props.getAffiliation() == 8 && !this.worldObj.isRemote)
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: Welcome to the village Academy Student")); 
        if (props.getAffiliation() == 8 && this.giveCounter == 0) {
          if (!this.worldObj.isRemote) {
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("please take this armor as a gift from your Mizukage"));
            dropItem(AlcoholMod.chestplateGenin, 1);
            dropItem(AlcoholMod.bootsGenin, 1);
            dropItem(AlcoholMod.legsGenin, 1);
            this.giveCounter = 30000;
          } 
        } else if (!this.worldObj.isRemote) {
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: What is your business in the Hidden Mist?"));
        } 
      } 
      if (props.getLevel() >= 25 && props.getRank() == 21)
        if (props.getAffiliation() == 8) {
          if (!this.worldObj.isRemote) {
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: Are you ready to take the Genin Exams?"));
            dropItem(AlcoholMod.GeninExam, 1);
          } 
        } else if (!this.worldObj.isRemote) {
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: What is your business in the Hidden Mist?"));
        }  
      if (props.getLevel() >= 250 && props.getRank() == 1)
        if (props.getAffiliation() == 8) {
          if (!this.worldObj.isRemote) {
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: Are you ready to take the Chunin Exams?"));
            dropItem(AlcoholMod.ChuninExams, 1);
          } 
        } else if (!this.worldObj.isRemote) {
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: What is your business in the Hidden Mist?"));
        }  
      if (props.getLevel() >= 350 && props.getRank() == 2)
        if (props.getAffiliation() == 8) {
          if (!this.worldObj.isRemote)
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: Are you ready to take the Tokubetsu Jonin Exams?")); 
        } else if (!this.worldObj.isRemote) {
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: What is your business in the Hidden Mist?"));
        }  
      if (props.getLevel() >= 500 && props.getRank() == 3)
        if (props.getAffiliation() == 8) {
          if (!this.worldObj.isRemote)
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: Are you ready to take the Jonin Exams?")); 
        } else if (!this.worldObj.isRemote) {
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: What is your business in the Hidden Mist?"));
        }  
      if (props.getLevel() >= 700 && props.getRank() == 4)
        if (props.getAffiliation() == 8) {
          if (!this.worldObj.isRemote) {
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: Because of your outstanding achievements"));
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("you are now allowed to take one of these 3 exams."));
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Given you have the needed skills, Choose wisely!"));
          } 
        } else if (!this.worldObj.isRemote) {
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: What is your business in the Hidden Mist?"));
        }  
      if (props.getLevel() >= 850 && props.getRank() == 5)
        if (props.getAffiliation() == 8) {
          if (!this.worldObj.isRemote) {
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: Your achievements in the Anbu has made us"));
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("believe you would be an outstanding Anbu Captain."));
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Now prove yourself!"));
          } 
        } else if (!this.worldObj.isRemote) {
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: What is your business in the Hidden Mist?"));
        }  
      if (props.getLevel() >= 850 && props.getRank() == 6)
        if (props.getAffiliation() == 8) {
          if (!this.worldObj.isRemote) {
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: Your achievements in the Medical team has made"));
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("us believe you would be an outstanding Medical Captain."));
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Now prove yourself!"));
          } 
        } else if (!this.worldObj.isRemote) {
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: What is your business in the Hidden Mist?"));
        }  
      if (props.getLevel() >= 850 && props.getRank() == 7)
        if (props.getAffiliation() == 8) {
          if (!this.worldObj.isRemote) {
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: Your achievements in the Intel department has"));
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("made us believe you would be an outstanding Intel Captain."));
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Now prove yourself!"));
          } 
        } else if (!this.worldObj.isRemote) {
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: What is your business in the Hidden Mist?"));
        }  
      if ((props.getLevel() >= 1000 && props.getRank() == 8) || props.getRank() == 9 || props.getRank() == 10)
        if (props.getAffiliation() == 8) {
          if (!this.worldObj.isRemote) {
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: Your growth from an academy student up till"));
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("now has been remarkable. Apart from that you have shown"));
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("a lot of love and determination for the village."));
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("If you can show me your resolve in this last test,"));
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("I will gladly bestow upon you the title of Mizukage!"));
          } 
        } else if (!this.worldObj.isRemote) {
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: What is your business in the Hidden Mist?"));
        }  
      if ((props.getLevel() < 850 || props.getAffiliation() != 16 || props.getRank() != 8) && props.getRank() != 9 && props.getRank() != 10) {
        if (!this.worldObj.isRemote)
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: What is your business in the Hidden Mist?")); 
      } else if (props.getKenjutsu() == 8.0D) {
        if (!this.worldObj.isRemote) {
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: As you possess such great skill"));
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("with swords, we'd like to invite you to the"));
          p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Kirigakure 7 Ninja Swordsmen Team."));
        } 
      } else if (!this.worldObj.isRemote) {
        p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Mizukage: What is your business in the Hidden Mist?"));
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
  
  public void onDeath(DamageSource par1DamageSource) {
    super.onDeath(par1DamageSource);
    if (!this.worldObj.isRemote);
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
    boolean flag = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), f);
    if (flag && i > 0)
      par1Entity.addVelocity((-MathHelper.sin(this.rotationYaw * 3.1415927F / 180.0F) * i * 0.5F), 0.1D, (MathHelper.cos(this.rotationYaw * 3.1415927F / 180.0F) * i * 0.5F)); 
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
  }
}

package alcoholmod.Mathioks.NPC;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import java.util.Random;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public class EntityQuestGiver extends EntityTameable {
  private int timer;
  
  private int timer2;
  
  private int homeCheckTimer;
  
  private int attackTimer;
  
  private int giveCounter = 0;
  
  private boolean quested;
  
  private int questTimer;
  
  Random rand = new Random();
  
  public EntityQuestGiver(World par1World) {
    super(par1World);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIMoveTowardsRestriction((EntityCreature)this, 1.0D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWander((EntityCreature)this, 1.0D));
    this.tasks.addTask(2, (EntityAIBase)this.aiSit);
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.tasks.addTask(5, (EntityAIBase)new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
    setSize(0.6F, 1.8F);
  }
  
  public boolean isBesideClimbableBlock() {
    return ((this.dataWatcher.getWatchableObjectByte(16) & 0x1) != 0);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(18, Byte.valueOf((byte)0));
    setTameSkin(this.worldObj.rand.nextInt(6));
    this.quested = false;
    getEntityData().setBoolean("quested", this.quested);
    this.questTimer = 0;
    getEntityData().setInteger("questTimer", this.questTimer);
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3D);
  }
  
  public void writeEntityToNBT(NBTTagCompound p_70014_1_) {
    super.writeEntityToNBT(p_70014_1_);
    p_70014_1_.setInteger("CatType", getTameSkin());
    p_70014_1_.setInteger("questTimer", this.questTimer);
    p_70014_1_.setBoolean("quested", this.quested);
  }
  
  public void readEntityFromNBT(NBTTagCompound p_70037_1_) {
    super.readEntityFromNBT(p_70037_1_);
    setTameSkin(p_70037_1_.getInteger("CatType"));
    this.quested = p_70037_1_.getBoolean("quested");
    this.questTimer = p_70037_1_.getInteger("questTimer");
  }
  
  public int getTameSkin() {
    return this.dataWatcher.getWatchableObjectByte(18);
  }
  
  public void setTameSkin(int p_70912_1_) {
    this.dataWatcher.updateObject(18, Byte.valueOf((byte)p_70912_1_));
  }
  
  public boolean interact(EntityPlayer p_70085_1_) {
    ItemStack itemstack = p_70085_1_.inventory.getCurrentItem();
    this.questTimer = getEntityData().getInteger("questTimer");
    this.quested = getEntityData().getBoolean("quested");
    if (p_70085_1_ != null) {
      ExtendedPlayer props = ExtendedPlayer.get(p_70085_1_);
      if (!this.worldObj.isRemote && 
        !isTamed()) {
        if (getTameSkin() == 0) {
          if (props.getRank() == 21)
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Tazuna: A ninja! thank goodness! oh... You're just an academy student.. I need at least a Chunin..")); 
          if (props.getRank() == 1)
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Tazuna: A ninja! thank goodness! oh... You're just a Genin.. I need at least a Chunin..")); 
        } 
        if (getTameSkin() == 1) {
          getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.0D);
          if (itemstack != null) {
            if (itemstack.getItem() != AlcoholMod.DQuestBabysitting)
              if (!this.quested) {
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Woman: Could you please watch over my baby for a bit?"));
                dropItem(AlcoholMod.DQuestBabysitting, 1);
                this.aiSit.setSitting(true);
                getEntityData().setInteger("questTimer", 24000);
                getEntityData().setBoolean("quested", true);
              } else if (this.quested) {
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Woman: I don't need any help right now hun"));
              }  
          } else if (!this.quested) {
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Woman: Could you please watch over my baby for a bit?"));
            dropItem(AlcoholMod.DQuestBabysitting, 1);
            this.aiSit.setSitting(true);
            getEntityData().setInteger("questTimer", 24000);
            getEntityData().setBoolean("quested", true);
          } else if (this.quested) {
            p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Woman: I don't need any help right now hun"));
          } 
        } 
        if (getTameSkin() == 2) {
          getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.0D);
          if (!this.quested)
            if (props.getRank() == 21) {
              p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Ichiraku's helper: Oh man, Oh man, I need some ingredients, quick!"));
              p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Ichiraku's helper: Could you please help me out?"));
              dropItem(AlcoholMod.DQuest, 1);
              this.aiSit.setSitting(true);
              getEntityData().setInteger("questTimer", 24000);
              getEntityData().setBoolean("quested", true);
            } else if (props.getRank() != 21) {
              int rand = p_70085_1_.worldObj.rand.nextInt(5);
              if (rand == 1) {
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Ichiraku's helper: Oh man, Oh man, I need some ingredients, quick!"));
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Ichiraku's helper: They will require some fighthing to be acquired though!"));
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Ichiraku's helper: Could you please help me out?"));
                dropItem(AlcoholMod.CQuest, 1);
                this.aiSit.setSitting(true);
                getEntityData().setInteger("questTimer", 24000);
                getEntityData().setBoolean("quested", true);
              } else {
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Ichiraku's helper: Oh man, Oh man, I need some ingredients, quick!"));
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Ichiraku's helper: Could you please help me out?"));
                dropItem(AlcoholMod.DQuest, 1);
                this.aiSit.setSitting(true);
                getEntityData().setInteger("questTimer", 24000);
                getEntityData().setBoolean("quested", true);
              } 
            } else if (this.quested) {
              p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Ichiraku's helper: Thank you! I'll probably need your help again tomorrow!"));
            }  
        } 
        if (getTameSkin() == 3) {
          getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.0D);
          if (!this.quested)
            if (props.getRank() != 21 && props.getRank() != 1) {
              if (props.getRank() >= 2 && props.getRank() != 21)
                setDead(); 
            } else {
              p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Hiruzen: I've got a mission for a Chunin or higher"));
              p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Hiruzen: I'm sorry, but you're not cut out for it!"));
              setDead();
            }  
        } 
        if (getTameSkin() == 5) {
          getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.0D);
          if (!this.quested)
            if (props.getRank() == 21) {
              if (props.getLevel() >= 50) {
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Exam Proctor: Oh, an Academy Student eh?"));
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Exam Proctor: You seem strong enough to take on the Genin exams, here you go!"));
                dropItem(AlcoholMod.GeninExam, 1);
                setDead();
              } else {
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Exam Proctor: Oh, an Academy Student eh?"));
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Exam Proctor: hehe, keep at it young shinobi, one day you'll be able to participate in the exams!"));
              } 
            } else if (props.getRank() == 1) {
              if (props.getLevel() >= 200) {
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Exam Proctor: Oh, a Genin eh?"));
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Exam Proctor: You seem strong enough to take on the Chunin exams, here you go!"));
                dropItem(AlcoholMod.ChuninExams, 1);
                setDead();
              } else {
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Exam Proctor: Oh, a Genin eh?"));
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Exam Proctor: hehe, keep at it young shinobi, one day you'll be able to participate in the Chuunin exams!"));
              } 
            } else if (props.getRank() == 2) {
              if (props.getLevel() >= 350) {
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Exam Proctor: Oh, a Chuunin eh?"));
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Exam Proctor: You seem strong enough to take on the Tokubetsu Jonin exams..."));
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Exam Proctor: oh, it looks like they aren't coded in yet..."));
                setDead();
              } else {
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Exam Proctor: Oh, a Chuunin eh?"));
                p_70085_1_.addChatMessage((IChatComponent)new ChatComponentText("Exam Proctor: hehe, keep at it young shinobi, one day you'll be able to participate in the Tokubetsu Jonin exams!"));
              } 
            }  
        } 
      } 
    } 
    return super.interact(p_70085_1_);
  }
  
  public boolean attackEntityFrom(DamageSource source, float amount) {
    if (source != null && getOwner() != null && !this.worldObj.isRemote)
      ((ICommandSender)getOwner()).addChatMessage((IChatComponent)new ChatComponentText("Tazuna: AAUUW I'm Hurt!")); 
    return super.attackEntityFrom(source, amount);
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.quested) {
      this.questTimer--;
      getEntityData().setInteger("questTimer", this.questTimer);
    } 
    if (this.questTimer == 0) {
      getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3D);
      this.quested = false;
      getEntityData().setBoolean("quested", this.quested);
      this.questTimer = 1;
      getEntityData().setInteger("questTimer", this.questTimer);
    } 
  }
  
  public void onDeath(DamageSource par1DamageSource) {
    super.onDeath(par1DamageSource);
    if (!this.worldObj.isRemote && getOwner() != null) {
      ((ICommandSender)getOwner()).addChatMessage((IChatComponent)new ChatComponentText("Tazuna: UWAAaaAaaahh!!!"));
      ((ICommandSender)getOwner()).addChatMessage((IChatComponent)new ChatComponentText("Your Client died"));
      ((ICommandSender)getOwner()).addChatMessage((IChatComponent)new ChatComponentText("Mission Failed"));
    } 
  }
  
  protected void fall() {}
  
  public EnumCreatureAttribute getCreatureAttribute() {
    return EnumCreatureAttribute.UNDEFINED;
  }
  
  public EntityAgeable createChild(EntityAgeable p_90011_1_) {
    return null;
  }
  
  public int getVerticalFaceSpeed() {
    return isSitting() ? 20 : super.getVerticalFaceSpeed();
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
    return super.getCanSpawnHere();
  }
  
  protected boolean canDespawn() {
    return true;
  }
}

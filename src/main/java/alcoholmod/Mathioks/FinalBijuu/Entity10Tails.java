package alcoholmod.Mathioks.FinalBijuu;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class Entity10Tails extends EntityMob {
  protected static final IAttribute field_110186_bp = (IAttribute)(new RangedAttribute("zombie.spawnReinforcements", 0.0D, 0.0D, 1.0D)).setDescription("Spawn Reinforcements Chance");
  
  private static final UUID babySpeedBoostUUID = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
  
  private final EntityAIBreakDoor field_146075_bs = new EntityAIBreakDoor((EntityLiving)this);
  
  private boolean field_146076_bu = false;
  
  private float field_146074_bv = -1.0F;
  
  public Entity10Tails(World p_i1745_1_) {
    super(p_i1745_1_);
    getNavigator().setBreakDoors(true);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, EntityPlayer.class, 1.0D, false));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, EntityVillager.class, 1.0D, true));
    this.tasks.addTask(5, (EntityAIBase)new EntityAIMoveTowardsRestriction((EntityCreature)this, 1.0D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWander((EntityCreature)this, 1.0D));
    this.tasks.addTask(8, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
    this.targetTasks.addTask(2, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityPlayer.class, 0, true));
    this.targetTasks.addTask(2, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityVillager.class, 0, false));
    setSize(6.0F, 6.0F);
    this.isImmuneToFire = true;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3300000041723251D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(45.0D);
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30000.0D);
  }
  
  protected void entityInit() {
    super.entityInit();
    getDataWatcher().addObject(12, Byte.valueOf((byte)0));
    getDataWatcher().addObject(13, Byte.valueOf((byte)0));
    getDataWatcher().addObject(14, Byte.valueOf((byte)0));
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public boolean func_146072_bX() {
    return this.field_146076_bu;
  }
  
  public void func_146070_a(boolean p_146070_1_) {
    if (this.field_146076_bu != p_146070_1_) {
      this.field_146076_bu = p_146070_1_;
      if (p_146070_1_) {
        this.tasks.addTask(1, (EntityAIBase)this.field_146075_bs);
      } else {
        this.tasks.removeTask((EntityAIBase)this.field_146075_bs);
      } 
    } 
  }
  
  protected int getExperiencePoints(EntityPlayer p_70693_1_) {
    if (isChild())
      this.experienceValue = (int)(this.experienceValue * 2.5F); 
    return super.getExperiencePoints(p_70693_1_);
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
  }
  
  public boolean attackEntityAsMob(Entity p_70652_1_) {
    boolean flag = super.attackEntityAsMob(p_70652_1_);
    if (flag) {
      int i = this.worldObj.difficultySetting.getDifficultyId();
      if (getHeldItem() == null && isBurning() && this.rand.nextFloat() < i * 0.3F)
        p_70652_1_.setFire(2 * i); 
    } 
    return flag;
  }
  
  protected String getHurtSound() {
    return "mob.zombie.hurt";
  }
  
  protected String getDeathSound() {
    return "mob.zombie.death";
  }
  
  protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_) {
    playSound("mob.zombie.step", 0.15F, 1.0F);
  }
  
  protected Item getDropItem() {
    return Items.rotten_flesh;
  }
  
  public EnumCreatureAttribute getCreatureAttribute() {
    return EnumCreatureAttribute.UNDEAD;
  }
  
  protected void dropRareDrop(int p_70600_1_) {
    switch (this.rand.nextInt(3)) {
      case 0:
        dropItem(Items.iron_ingot, 1);
        break;
      case 1:
        dropItem(Items.carrot, 1);
        break;
      case 2:
        dropItem(Items.potato, 1);
        break;
    } 
  }
  
  protected void addRandomArmor() {
    super.addRandomArmor();
    if (this.rand.nextFloat() < ((this.worldObj.difficultySetting == EnumDifficulty.HARD) ? 0.05F : 0.01F)) {
      int i = this.rand.nextInt(3);
      if (i == 0) {
        setCurrentItemOrArmor(0, new ItemStack(Items.iron_sword));
      } else {
        setCurrentItemOrArmor(0, new ItemStack(Items.iron_shovel));
      } 
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void handleHealthUpdate(byte p_70103_1_) {
    if (p_70103_1_ == 16) {
      this.worldObj.playSound(this.posX + 0.5D, this.posY + 0.5D, this.posZ + 0.5D, "mob.zombie.remedy", 1.0F + this.rand.nextFloat(), this.rand.nextFloat() * 0.7F + 0.3F, false);
    } else {
      super.handleHealthUpdate(p_70103_1_);
    } 
  }
  
  protected boolean canDespawn() {
    return false;
  }
  
  public void func_146071_k(boolean p_146071_1_) {
    func_146069_a(p_146071_1_ ? 0.5F : 1.0F);
  }
  
  protected final void setSize(float p_70105_1_, float p_70105_2_) {
    boolean flag = (this.field_146074_bv > 0.0F && this.field_146073_bw > 0.0F);
    this.field_146074_bv = p_70105_1_;
    this.field_146073_bw = p_70105_2_;
    if (!flag)
      func_146069_a(1.0F); 
  }
  
  protected final void func_146069_a(float p_146069_1_) {
    super.setSize(this.field_146074_bv * p_146069_1_, this.field_146073_bw * p_146069_1_);
  }
  
  private static final AttributeModifier babySpeedBoostModifier = new AttributeModifier(babySpeedBoostUUID, "Baby speed boost", 0.5D, 1);
  
  private int conversionTime;
  
  private float field_146073_bw;
  
  private static final String __OBFID = "CL_00001702";
  
  class GroupData implements IEntityLivingData {
    public boolean field_142048_a;
    
    public boolean field_142046_b;
    
    private static final String __OBFID = "CL_00001704";
    
    private GroupData(boolean p_i2348_2_, boolean p_i2348_3_) {
      this.field_142048_a = false;
      this.field_142046_b = false;
      this.field_142048_a = p_i2348_2_;
      this.field_142046_b = p_i2348_3_;
    }
    
    GroupData(boolean p_i2349_2_, boolean p_i2349_3_, Object p_i2349_4_) {
      this(p_i2349_2_, p_i2349_3_);
    }
  }
}

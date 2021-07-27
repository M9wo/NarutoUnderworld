package alcoholmod.Mathioks.Entity;

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
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityYamanakaFool extends EntityTameable {
  public EntityLivingBase jutsusha;
  
  public int deathTicks;
  
  public boolean killed = false;
  
  public double i = 0.0D;
  
  public double j = 0.0D;
  
  public double k = 0.0D;
  
  public float y = 0.0F;
  
  public float p = 0.0F;
  
  private ItemStack[] equipment = new ItemStack[5];
  
  public EntityYamanakaFool(World par1World) {
    super(par1World);
    this.experienceValue = 0;
    this.tasks.addTask(4, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, 1.0D, true));
    this.tasks.addTask(5, (EntityAIBase)new EntityAIFollowOwner(this, 1.0D, 10.0F, 2.0F));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWander((EntityCreature)this, 1.0D));
    this.tasks.addTask(8, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(9, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIOwnerHurtByTarget(this));
    this.targetTasks.addTask(2, (EntityAIBase)new EntityAIOwnerHurtTarget(this));
    this.targetTasks.addTask(3, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
    this.tasks.addTask(10, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    for (int i = 0; i < this.equipmentDropChances.length; i++)
      this.equipmentDropChances[i] = 0.0F; 
    setSize(0.6F, 1.8F);
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(2.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.0D);
    getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0D);
  }
  
  protected boolean isAIEnabled() {
    return false;
  }
  
  protected int getDropItemId() {
    return -1;
  }
  
  public void onUpdate() {
    if (getOwner() != null) {
      if ((this.i != 0.0D || this.j != 0.0D || this.k != 0.0D || this.y != 0.0F || this.p != 0.0F) && (this.posX != this.i || this.posY != this.j || this.posZ != this.k))
        setPositionAndRotation(this.i, this.j, this.k, this.y, this.p); 
      EntityPlayer Entity = (EntityPlayer)getOwner();
      if (!hasCustomNameTag())
        setCustomNameTag(Entity.getDisplayName()); 
      if (Entity != null) {
        if (Entity.inventory.armorItemInSlot(3) != null)
          setCurrentItemOrArmor(4, Entity.getCurrentArmor(3)); 
        if (Entity.inventory.armorItemInSlot(2) != null)
          setCurrentItemOrArmor(3, Entity.getCurrentArmor(2)); 
        if (Entity.inventory.armorItemInSlot(1) != null)
          setCurrentItemOrArmor(2, Entity.getCurrentArmor(1)); 
        if (Entity.inventory.armorItemInSlot(0) != null)
          setCurrentItemOrArmor(1, Entity.getCurrentArmor(0)); 
        if (Entity.inventory.getCurrentItem() != null)
          setCurrentItemOrArmor(0, Entity.getCurrentEquippedItem()); 
        if (Entity.inventory.getCurrentItem() == null)
          setCurrentItemOrArmor(0, (ItemStack)null); 
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
    return EnumCreatureAttribute.UNDEFINED;
  }
  
  protected boolean canDespawn() {
    return false;
  }
  
  public EntityAgeable createChild(EntityAgeable entityageable) {
    return null;
  }
  
  protected void onDeathUpdate() {
    if (!this.killed) {
      if (getOwner() != null) {
        getOwner().setHealth(0.0F);
        setDead();
      } 
      if (getOwner() == null)
        setDead(); 
    } 
    if (this.killed)
      setDead(); 
  }
}

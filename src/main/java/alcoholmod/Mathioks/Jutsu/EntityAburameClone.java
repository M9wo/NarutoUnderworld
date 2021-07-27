package alcoholmod.Mathioks.Jutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.NPC.EntityBunshinAttackFilter;
import alcoholmod.Mathioks.NickModels.KikaichuEntity;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import net.minecraft.command.IEntitySelector;
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
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityAburameClone extends EntityTameable {
  public int deathTicks;
  
  private static final IEntitySelector attackEntitySelector = (IEntitySelector)new EntityBunshinAttackFilter();
  
  public boolean Death = false;
  
  private ItemStack[] equipment = new ItemStack[5];
  
  public EntityAburameClone(World par1World) {
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
    this.targetTasks.addTask(3, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityLivingBase.class, 0, false, false, attackEntitySelector));
    this.tasks.addTask(10, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    for (int i = 0; i < this.equipmentDropChances.length; i++)
      this.equipmentDropChances[i] = 0.0F; 
    setSize(0.6F, 1.8F);
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
    getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0D);
  }
  
  public void onKillEntity(EntityLivingBase p_70074_1_) {
    super.onKillEntity(p_70074_1_);
    if (getOwner() != null && getOwner() instanceof EntityPlayer && !(p_70074_1_ instanceof net.minecraft.entity.passive.EntityAnimal) && !(p_70074_1_ instanceof net.minecraft.entity.passive.EntityWaterMob) && !(p_70074_1_ instanceof net.minecraft.entity.passive.EntityAmbientCreature)) {
      EntityPlayer owner = (EntityPlayer)getOwner();
      ExtendedPlayer props = ExtendedPlayer.get(owner);
      props.setChakraExperience(props.getChakraExperience() + 1);
      PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage(owner), (EntityPlayerMP)owner);
    } 
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    int i = 5;
    if (getOwner() != null) {
      EntityPlayer owner = (EntityPlayer)getOwner();
      ExtendedPlayer props = ExtendedPlayer.get(owner);
      return par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), (float)(2.0D + props.getTaijutsu() / 4.0D));
    } 
    return par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), i);
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  protected int getDropItemId() {
    return -1;
  }
  
  public void onUpdate() {
    if (this.Death && this.ticksExisted >= 20)
      setDead(); 
    if (this.ticksExisted >= 1200)
      setDead(); 
    if (getOwner() != null) {
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
    if (!this.worldObj.isRemote) {
      if (getOwner() != null) {
        KikaichuEntity KikaichuEntity = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity1 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity2 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity10 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity11 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity21 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity20 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity12 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity22 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity3 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity13 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity23 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity4 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity14 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity24 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity5 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity15 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity25 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity6 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity16 = new KikaichuEntity(this.worldObj);
        KikaichuEntity KikaichuEntity26 = new KikaichuEntity(this.worldObj);
        KikaichuEntity.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity.setTamed(true);
        KikaichuEntity.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, this.rotationYaw, 0.0F);
        KikaichuEntity.rotationYawHead = KikaichuEntity.rotationYaw;
        KikaichuEntity.renderYawOffset = KikaichuEntity.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity);
        KikaichuEntity1.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity1.setTamed(true);
        KikaichuEntity1.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, this.rotationYaw, 0.0F);
        KikaichuEntity1.rotationYawHead = KikaichuEntity1.rotationYaw;
        KikaichuEntity1.renderYawOffset = KikaichuEntity1.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity1);
        KikaichuEntity2.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity2.setTamed(true);
        KikaichuEntity2.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ - 1.0D, this.rotationYaw, 0.0F);
        KikaichuEntity2.rotationYawHead = KikaichuEntity2.rotationYaw;
        KikaichuEntity2.renderYawOffset = KikaichuEntity2.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity2);
        KikaichuEntity10.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity10.setTamed(true);
        KikaichuEntity10.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ - 1.0D, this.rotationYaw, 0.0F);
        KikaichuEntity10.rotationYawHead = KikaichuEntity10.rotationYaw;
        KikaichuEntity10.renderYawOffset = KikaichuEntity10.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity10);
        KikaichuEntity11.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity11.setTamed(true);
        KikaichuEntity11.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, this.rotationYaw, 0.0F);
        KikaichuEntity11.rotationYawHead = KikaichuEntity11.rotationYaw;
        KikaichuEntity11.renderYawOffset = KikaichuEntity11.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity11);
        KikaichuEntity21.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity21.setTamed(true);
        KikaichuEntity21.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ - 1.0D, this.rotationYaw, 0.0F);
        KikaichuEntity21.rotationYawHead = KikaichuEntity21.rotationYaw;
        KikaichuEntity21.renderYawOffset = KikaichuEntity21.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity21);
        KikaichuEntity20.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity20.setTamed(true);
        KikaichuEntity20.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, this.rotationYaw, 0.0F);
        KikaichuEntity20.rotationYawHead = KikaichuEntity20.rotationYaw;
        KikaichuEntity20.renderYawOffset = KikaichuEntity20.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity20);
        KikaichuEntity12.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity12.setTamed(true);
        KikaichuEntity12.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, this.rotationYaw, 0.0F);
        KikaichuEntity12.rotationYawHead = KikaichuEntity12.rotationYaw;
        KikaichuEntity12.renderYawOffset = KikaichuEntity12.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity12);
        KikaichuEntity22.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity22.setTamed(true);
        KikaichuEntity22.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ + 1.0D, this.rotationYaw, 0.0F);
        KikaichuEntity22.rotationYawHead = KikaichuEntity22.rotationYaw;
        KikaichuEntity22.renderYawOffset = KikaichuEntity22.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity22);
        KikaichuEntity3.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity3.setTamed(true);
        KikaichuEntity3.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ + 1.0D, this.rotationYaw, 0.0F);
        KikaichuEntity3.rotationYawHead = KikaichuEntity3.rotationYaw;
        KikaichuEntity3.renderYawOffset = KikaichuEntity3.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity3);
        KikaichuEntity13.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity13.setTamed(true);
        KikaichuEntity13.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ + 1.0D, this.rotationYaw, 0.0F);
        KikaichuEntity13.rotationYawHead = KikaichuEntity13.rotationYaw;
        KikaichuEntity13.renderYawOffset = KikaichuEntity13.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity13);
        KikaichuEntity23.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity23.setTamed(true);
        KikaichuEntity23.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, this.rotationYaw, 0.0F);
        KikaichuEntity23.rotationYawHead = KikaichuEntity23.rotationYaw;
        KikaichuEntity23.renderYawOffset = KikaichuEntity23.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity23);
        KikaichuEntity4.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity4.setTamed(true);
        KikaichuEntity4.setPositionAndRotation(this.posX + 1.0D, this.posY + 1.0D, this.posZ - 1.0D, this.rotationYaw, 0.0F);
        KikaichuEntity4.rotationYawHead = KikaichuEntity4.rotationYaw;
        KikaichuEntity4.renderYawOffset = KikaichuEntity4.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity4);
        KikaichuEntity14.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity14.setTamed(true);
        KikaichuEntity14.setPositionAndRotation(this.posX + 1.0D, this.posY + 1.0D, this.posZ, this.rotationYaw, 0.0F);
        KikaichuEntity14.rotationYawHead = KikaichuEntity14.rotationYaw;
        KikaichuEntity14.renderYawOffset = KikaichuEntity14.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity14);
        KikaichuEntity24.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity24.setTamed(true);
        KikaichuEntity24.setPositionAndRotation(this.posX + 1.0D, this.posY + 1.0D, this.posZ - 1.0D, this.rotationYaw, 0.0F);
        KikaichuEntity24.rotationYawHead = KikaichuEntity24.rotationYaw;
        KikaichuEntity24.renderYawOffset = KikaichuEntity24.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity24);
        KikaichuEntity5.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity5.setTamed(true);
        KikaichuEntity5.setPositionAndRotation(this.posX + 2.0D, this.posY + 1.0D, this.posZ, this.rotationYaw, 0.0F);
        KikaichuEntity5.rotationYawHead = KikaichuEntity5.rotationYaw;
        KikaichuEntity5.renderYawOffset = KikaichuEntity5.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity5);
        KikaichuEntity15.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity15.setTamed(true);
        KikaichuEntity15.setPositionAndRotation(this.posX - 1.0D, this.posY + 1.0D, this.posZ + 1.0D, this.rotationYaw, 0.0F);
        KikaichuEntity15.rotationYawHead = KikaichuEntity15.rotationYaw;
        KikaichuEntity15.renderYawOffset = KikaichuEntity15.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity15);
        KikaichuEntity25.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity25.setTamed(true);
        KikaichuEntity25.setPositionAndRotation(this.posX - 1.0D, this.posY + 1.0D, this.posZ + 1.0D, this.rotationYaw, 0.0F);
        KikaichuEntity25.rotationYawHead = KikaichuEntity25.rotationYaw;
        KikaichuEntity25.renderYawOffset = KikaichuEntity25.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity25);
        KikaichuEntity6.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity6.setTamed(true);
        KikaichuEntity6.setPositionAndRotation(this.posX + 1.0D, this.posY + 1.0D, this.posZ, this.rotationYaw, 0.0F);
        KikaichuEntity6.rotationYawHead = KikaichuEntity6.rotationYaw;
        KikaichuEntity6.renderYawOffset = KikaichuEntity6.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity6);
        KikaichuEntity16.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity16.setTamed(true);
        KikaichuEntity16.setPositionAndRotation(this.posX + 1.0D, this.posY + 1.0D, this.posZ + 1.0D, this.rotationYaw, 0.0F);
        KikaichuEntity16.rotationYawHead = KikaichuEntity16.rotationYaw;
        KikaichuEntity16.renderYawOffset = KikaichuEntity16.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity16);
        KikaichuEntity26.func_152115_b(getOwner().getUniqueID().toString());
        KikaichuEntity26.setTamed(true);
        KikaichuEntity26.setPositionAndRotation(this.posX + 1.0D, this.posY + 1.0D, this.posZ + 1.0D, this.rotationYaw, 0.0F);
        KikaichuEntity26.rotationYawHead = KikaichuEntity26.rotationYaw;
        KikaichuEntity26.renderYawOffset = KikaichuEntity26.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)KikaichuEntity26);
      } 
      setDead();
    } 
  }
  
  public boolean canAttackClass(Class par1Class) {
    return true;
  }
}

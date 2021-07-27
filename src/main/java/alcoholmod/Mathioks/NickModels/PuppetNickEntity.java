package alcoholmod.Mathioks.NickModels;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.NPC.EntityBunshinAttackFilter;
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

public class PuppetNickEntity extends EntityTameable {
  public int deathTicks;
  
  private static final IEntitySelector attackEntitySelector = (IEntitySelector)new EntityBunshinAttackFilter();
  
  public boolean Attack;
  
  private ItemStack[] equipment = new ItemStack[5];
  
  public PuppetNickEntity(World par1World) {
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
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
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
    int i = 12;
    return par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), i);
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  protected int getDropItemId() {
    return -1;
  }
  
  public void onUpdate() {
    if (getOwner() != null) {
      EntityPlayer Entity = (EntityPlayer)getOwner();
      if (Entity != null && !this.worldObj.isRemote)
        if (Entity.inventory.getCurrentItem() != null) {
          if (!(Entity.inventory.getCurrentItem().getItem() instanceof alcoholmod.Mathioks.Puppet.PuppetJutsuItem))
            setDead(); 
        } else {
          setDead();
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
    this.deathTicks++;
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
}

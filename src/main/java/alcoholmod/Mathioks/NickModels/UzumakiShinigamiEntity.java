package alcoholmod.Mathioks.NickModels;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.NPC.EntityBunshinAttackFilter;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import java.util.List;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class UzumakiShinigamiEntity extends EntityTameable {
  public EntityLivingBase jutsusha;
  
  public int deathTicks;
  
  private static final IEntitySelector attackEntitySelector = (IEntitySelector)new EntityBunshinAttackFilter();
  
  public boolean Death = false;
  
  private ItemStack[] equipment = new ItemStack[5];
  
  public UzumakiShinigamiEntity(World par1World) {
    super(par1World);
    this.experienceValue = 0;
    setSize(0.6F, 1.8F);
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10000.0D);
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
  
  protected boolean isAIEnabled() {
    return false;
  }
  
  protected int getDropItemId() {
    return -1;
  }
  
  public void onUpdate() {
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    super.onUpdate();
    if (getOwner() != null) {
      this.posX = (getOwner()).posX;
      this.posY = (getOwner()).posY;
      this.posZ = (getOwner()).posZ;
      this.rotationYaw = (getOwner()).rotationYaw;
      setPosition(this.posX, this.posY, this.posZ);
      setRotation(this.rotationYaw, this.rotationPitch);
    } 
    if (this.ticksExisted >= 115)
      setDead(); 
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 10.0D, this.posY - 3.0D, this.posZ - 10.0D, this.posX + 10.0D, this.posY + 3.0D, this.posZ + 10.0D));
    if (this != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = getUniqueID().toString();
          entity.getDistance(this.posX, this.posY, this.posZ);
          if (entity instanceof net.minecraft.entity.EntityLiving && entity instanceof EntityLivingBase && entity != this) {
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 100));
            if (this.ticksExisted >= 100)
              entity.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)getOwner()), 50.0F); 
          } 
          if (entity instanceof EntityPlayer && getOwner() != null && entity.getUniqueID() != null && getOwner().getUniqueID() != null)
            if (entity.getUniqueID().toString().equals(getOwner().getUniqueID().toString())) {
              ((EntityPlayer)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 100));
              if (this.ticksExisted >= 105)
                entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 10000.0F); 
            } else {
              ((EntityPlayer)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 100));
              if (this.ticksExisted >= 100) {
                entity.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)getOwner()), 50.0F);
                EntityPlayer player = (EntityPlayer)entity;
                ExtendedPlayer props = ExtendedPlayer.get(player);
                props.consumeMana(100);
              } 
            }  
        } 
      }  
  }
  
  public boolean isEntityInvulnerable() {
    return true;
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
    setDead();
  }
  
  public boolean canAttackClass(Class par1Class) {
    return true;
  }
}

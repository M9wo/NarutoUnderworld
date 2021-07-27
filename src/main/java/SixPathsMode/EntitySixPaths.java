package SixPathsMode;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

public class EntitySixPaths extends EntityLiving {
  public EntityLivingBase jutsusha;
  
  private boolean disableDamage;
  
  public EntitySixPaths(World par1World) {
    super(par1World);
    this.ignoreFrustumCheck = true;
    this.isImmuneToFire = true;
    this.noClip = true;
  }
  
  public EntitySixPaths(World par1World, EntityLivingBase par2Entity) {
    super(par1World);
    this.jutsusha = par2Entity;
    setSize(0.0F, 0.0F);
    this.yOffset = this.height / 2.0F;
    this.motionX = 0.0D;
    this.motionY = 0.0D;
    this.motionZ = 0.0D;
  }
  
  public boolean isAIEnabled() {
    return false;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1000.0D);
  }
  
  protected void entityInit() {
    super.entityInit();
  }
  
  protected void fall(float par1) {}
  
  protected void updateFallState(double par1, boolean par3) {}
  
  public boolean isOnLadder() {
    return false;
  }
  
  protected void updateAITasks() {}
  
  protected void updateEntityActionState() {}
  
  public void readEntityFromNBT(NBTTagCompound nbttagcompound) {
    super.readEntityFromNBT(nbttagcompound);
  }
  
  public void writeEntityToNBT(NBTTagCompound nbttagcompound) {
    super.writeEntityToNBT(nbttagcompound);
  }
  
  public void setJutsushaItem(ItemStack par1) {
    setCurrentItemOrArmor(0, par1);
  }
  
  public ItemStack getJutsushaItem() {
    return getHeldItem();
  }
  
  protected boolean canTriggerWalking() {
    return false;
  }
  
  public boolean canBeCollidedWith() {
    return !this.isDead;
  }
  
  public boolean canBePushed() {
    return false;
  }
  
  public void onUpdate() {
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    super.onUpdate();
    if (!this.worldObj.isRemote && (this.jutsusha == null || Keyboard.isKeyDown(181)))
      setDead(); 
    if (this.jutsusha != null) {
      this.posX = this.jutsusha.posX;
      this.posY = this.jutsusha.posY + 6.0D;
      this.posZ = this.jutsusha.posZ;
      this.rotationYaw = this.jutsusha.rotationYaw;
      setPosition(this.posX, this.posY, this.posZ);
      setRotation(this.rotationYaw, this.rotationPitch);
    } 
  }
  
  public void moveEntityWithHeading(float par1, float par2) {
    if (this.jutsusha != null)
      moveEntity(this.jutsusha.motionX, this.jutsusha.motionY, this.jutsusha.motionZ); 
  }
  
  public void onDeath(DamageSource par1DamageSource) {
    super.onDeath(par1DamageSource);
  }
}

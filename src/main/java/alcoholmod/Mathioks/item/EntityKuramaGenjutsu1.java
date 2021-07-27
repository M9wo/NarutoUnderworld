package alcoholmod.Mathioks.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityKuramaGenjutsu1 extends EntityThrowable {
  private int ticksInGround;
  
  public int ticks;
  
  public EntityKuramaGenjutsu1(World par1World) {
    super(par1World);
    this.motionX *= 3.0D;
    this.motionY *= 3.0D;
    this.motionZ *= 3.0D;
    this.ticks = 20;
  }
  
  public EntityKuramaGenjutsu1(World par1World, EntityPlayer par3EntityPlayer) {
    super(par1World, (EntityLivingBase)par3EntityPlayer);
    this.motionX *= 3.0D;
    this.motionY *= 3.0D;
    this.motionZ *= 3.0D;
    this.ticks = 20;
  }
  
  public EntityKuramaGenjutsu1(World par1World, double par2, double par4, double par6) {
    super(par1World, par2, par4, par6);
    this.motionX *= 3.0D;
    this.motionY *= 3.0D;
    this.motionZ *= 3.0D;
    this.ticks = 20;
  }
  
  public void onEntityUpdate() {
    if (this.ticks <= 0) {
      this.ticks = 20;
      setDead();
    } else {
      this.ticks--;
    } 
    if (this.ticksExisted >= 140)
      setDead(); 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 10.0F);
      EntityBat entitybat = new EntityBat(this.worldObj);
      EntityBat entitybat1 = new EntityBat(this.worldObj);
      EntityBat entitybat2 = new EntityBat(this.worldObj);
      EntityBat entitybat3 = new EntityBat(this.worldObj);
      EntityBat entitybat4 = new EntityBat(this.worldObj);
      EntityBat entitybat5 = new EntityBat(this.worldObj);
      EntityBat entitybat6 = new EntityBat(this.worldObj);
      EntityBat entitybat7 = new EntityBat(this.worldObj);
      EntityBat entitybat8 = new EntityBat(this.worldObj);
      EntityBat entitybat9 = new EntityBat(this.worldObj);
      EntityBat entitybat10 = new EntityBat(this.worldObj);
      EntityBat entitybat11 = new EntityBat(this.worldObj);
      EntityBat entitybat12 = new EntityBat(this.worldObj);
      EntityBat entitybat13 = new EntityBat(this.worldObj);
      EntityBat entitybat14 = new EntityBat(this.worldObj);
      EntityBat entitybat15 = new EntityBat(this.worldObj);
      EntityBat entitybat16 = new EntityBat(this.worldObj);
      EntityBat entitybat17 = new EntityBat(this.worldObj);
      EntityBat entitybat18 = new EntityBat(this.worldObj);
      EntityBat entitybat19 = new EntityBat(this.worldObj);
      EntityBat entitybat20 = new EntityBat(this.worldObj);
      EntityBat entitybat21 = new EntityBat(this.worldObj);
      EntityBat entitybat22 = new EntityBat(this.worldObj);
      EntityBat entitybat23 = new EntityBat(this.worldObj);
      entitybat.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat.rotationYawHead = entitybat.rotationYaw;
      entitybat.renderYawOffset = entitybat.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat);
      entitybat1.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat1.rotationYawHead = entitybat1.rotationYaw;
      entitybat1.renderYawOffset = entitybat1.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat1);
      entitybat2.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat2.rotationYawHead = entitybat2.rotationYaw;
      entitybat2.renderYawOffset = entitybat2.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat2);
      entitybat3.setPositionAndRotation(this.posX, this.posY, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat3.rotationYawHead = entitybat3.rotationYaw;
      entitybat3.renderYawOffset = entitybat3.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat3);
      entitybat4.setPositionAndRotation(this.posX, this.posY, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat4.rotationYawHead = entitybat4.rotationYaw;
      entitybat4.renderYawOffset = entitybat4.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat4);
      entitybat5.setPositionAndRotation(this.posX, this.posY, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat5.rotationYawHead = entitybat5.rotationYaw;
      entitybat5.renderYawOffset = entitybat5.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat5);
      entitybat6.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat6.rotationYawHead = entitybat6.rotationYaw;
      entitybat6.renderYawOffset = entitybat6.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat6);
      entitybat7.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat7.rotationYawHead = entitybat7.rotationYaw;
      entitybat7.renderYawOffset = entitybat7.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat7);
      entitybat8.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat8.rotationYawHead = entitybat8.rotationYaw;
      entitybat8.renderYawOffset = entitybat8.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat8);
      entitybat9.setPositionAndRotation(this.posX, this.posY, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat9.rotationYawHead = entitybat9.rotationYaw;
      entitybat9.renderYawOffset = entitybat9.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat9);
      entitybat10.setPositionAndRotation(this.posX, this.posY, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat10.rotationYawHead = entitybat10.rotationYaw;
      entitybat10.renderYawOffset = entitybat10.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat10);
      entitybat11.setPositionAndRotation(this.posX, this.posY, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat11.rotationYawHead = entitybat11.rotationYaw;
      entitybat11.renderYawOffset = entitybat11.rotationYaw;
      entitybat23.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat23.rotationYawHead = entitybat23.rotationYaw;
      entitybat23.renderYawOffset = entitybat23.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat23);
      entitybat12.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat12.rotationYawHead = entitybat12.rotationYaw;
      entitybat12.renderYawOffset = entitybat12.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat12);
      entitybat13.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat13.rotationYawHead = entitybat13.rotationYaw;
      entitybat13.renderYawOffset = entitybat13.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat13);
      entitybat14.setPositionAndRotation(this.posX, this.posY, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat14.rotationYawHead = entitybat14.rotationYaw;
      entitybat14.renderYawOffset = entitybat14.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat14);
      entitybat15.setPositionAndRotation(this.posX, this.posY, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat15.rotationYawHead = entitybat15.rotationYaw;
      entitybat15.renderYawOffset = entitybat15.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat15);
      entitybat16.setPositionAndRotation(this.posX, this.posY, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat16.rotationYawHead = entitybat16.rotationYaw;
      entitybat16.renderYawOffset = entitybat16.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat16);
      entitybat17.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat17.rotationYawHead = entitybat17.rotationYaw;
      entitybat17.renderYawOffset = entitybat17.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat17);
      entitybat18.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat18.rotationYawHead = entitybat18.rotationYaw;
      entitybat18.renderYawOffset = entitybat18.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat18);
      entitybat19.setPositionAndRotation(this.posX, this.posY + 1.0D, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat19.rotationYawHead = entitybat19.rotationYaw;
      entitybat19.renderYawOffset = entitybat19.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat19);
      entitybat20.setPositionAndRotation(this.posX, this.posY, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat20.rotationYawHead = entitybat20.rotationYaw;
      entitybat20.renderYawOffset = entitybat20.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat20);
      entitybat21.setPositionAndRotation(this.posX, this.posY, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat21.rotationYawHead = entitybat21.rotationYaw;
      entitybat21.renderYawOffset = entitybat21.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat21);
      entitybat22.setPositionAndRotation(this.posX, this.posY, this.posZ, 0.0F, this.distanceWalkedModified);
      entitybat22.rotationYawHead = entitybat22.rotationYaw;
      entitybat22.renderYawOffset = entitybat22.rotationYaw;
      this.worldObj.spawnEntityInWorld((Entity)entitybat22);
      ((EntityLivingBase)par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.weakness.id, 150, 10));
      ((EntityLivingBase)par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.blindness.id, 50, 10));
      entitybat.setDead();
      entitybat1.setDead();
      entitybat2.setDead();
      entitybat3.setDead();
      entitybat4.setDead();
      entitybat5.setDead();
      entitybat6.setDead();
      entitybat7.setDead();
      entitybat8.setDead();
      entitybat9.setDead();
      entitybat10.setDead();
      entitybat11.setDead();
      entitybat12.setDead();
      entitybat13.setDead();
      entitybat14.setDead();
      entitybat15.setDead();
      entitybat16.setDead();
      entitybat17.setDead();
      entitybat18.setDead();
      entitybat19.setDead();
      entitybat20.setDead();
      entitybat21.setDead();
      entitybat22.setDead();
    } 
    if (!this.worldObj.isRemote)
      setDead(); 
  }
  
  protected float getGravityVelocity() {
    return 0.001F;
  }
  
  public void onUpdate() {
    super.onUpdate();
  }
}

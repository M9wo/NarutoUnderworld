package alcoholmod.Mathioks.Final.CT;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class MagnetReleaseGoldDust2Entity2 extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 1;
  
  private int ticksInGround;
  
  public MagnetReleaseGoldDust2Entity2(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.8D;
    this.motionY *= 1.0D;
    this.motionZ *= 0.8D;
    setSize(1.0F, 1.0F);
  }
  
  public MagnetReleaseGoldDust2Entity2(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.8D;
    this.motionY *= 1.0D;
    this.motionZ *= 0.8D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    super.onUpdate();
    for (int i = 0; i < 8; i++)
      this.worldObj.spawnParticle("crit", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D); 
    if (!this.worldObj.isRemote) {
      this.posX += this.motionX;
      this.posY += this.motionY;
      this.posZ += this.motionZ;
      if (this.ticksExisted >= 30)
        setDead(); 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 4.0F);
      par1MovingObjectPosition.entityHit.motionX = this.motionX;
      par1MovingObjectPosition.entityHit.motionY = this.motionY;
      par1MovingObjectPosition.entityHit.motionZ = this.motionZ;
      if (par1MovingObjectPosition.entityHit == getThrower());
    } 
  }
  
  public boolean canBeCollidedWith() {
    return false;
  }
  
  public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
    return false;
  }
  
  protected void entityInit() {
    this.dataWatcher.addObject(10, Byte.valueOf((byte)0));
  }
  
  public boolean isInvulnerable() {
    return (this.dataWatcher.getWatchableObjectByte(10) == 1);
  }
  
  public void setInvulnerable(boolean p_82343_1_) {
    this.dataWatcher.updateObject(10, Byte.valueOf((byte)(p_82343_1_ ? 1 : 0)));
  }
}

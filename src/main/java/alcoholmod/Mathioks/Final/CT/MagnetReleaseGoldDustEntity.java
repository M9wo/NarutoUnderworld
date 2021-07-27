package alcoholmod.Mathioks.Final.CT;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class MagnetReleaseGoldDustEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 7;
  
  private int ticksInGround;
  
  public MagnetReleaseGoldDustEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.5D;
    this.motionY *= 0.5D;
    this.motionZ *= 0.5D;
    setSize(10.0F, 10.0F);
  }
  
  public MagnetReleaseGoldDustEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.5D;
    this.motionY *= 0.5D;
    this.motionZ *= 0.5D;
  }
  
  protected float getGravityVelocity() {
    return 0.04F;
  }
  
  public void onUpdate() {
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    super.onUpdate();
    if (!this.worldObj.isRemote) {
      this.posX += this.motionX;
      this.posY += this.motionY;
      this.posZ += this.motionZ;
      if (this.ticksExisted >= 200)
        setDead(); 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && this.ticksExisted >= 2) {
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 17.0F);
        this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, true);
        if (par1MovingObjectPosition.entityHit == getThrower());
      } 
      this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, true);
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

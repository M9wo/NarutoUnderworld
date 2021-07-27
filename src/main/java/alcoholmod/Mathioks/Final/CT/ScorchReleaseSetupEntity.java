package alcoholmod.Mathioks.Final.CT;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ScorchReleaseSetupEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 1;
  
  private int ticksInGround;
  
  public ScorchReleaseSetupEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.1D;
    this.motionY *= 0.1D;
    this.motionZ *= 0.1D;
    setSize(0.5F, 0.5F);
  }
  
  public ScorchReleaseSetupEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.1D;
    this.motionY *= 0.1D;
    this.motionZ *= 0.1D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    super.onUpdate();
    if (!this.worldObj.isRemote) {
      if (this.ticksExisted <= 20) {
        this.motionY = 0.1D;
        this.posX += this.motionX * 0.0D;
        this.posY += this.motionY;
        this.posZ += this.motionZ * 0.0D;
      } 
      if (this.ticksExisted >= 21 && this.ticksExisted <= 41) {
        this.motionY = -0.1D;
        this.motionX *= 1.15D;
        this.motionZ *= 1.15D;
        this.posX += this.motionX;
        this.posY += this.motionY;
        this.posZ += this.motionZ;
      } 
      if (this.ticksExisted >= 42)
        this.motionY = 0.0D; 
      if (this.ticksExisted >= 120)
        setDead(); 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase && !(par1MovingObjectPosition.entityHit instanceof ScorchReleaseSetupEntity)) {
      par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 7.0F);
      par1MovingObjectPosition.entityHit.setFire(30);
      this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, true);
      if (par1MovingObjectPosition.entityHit == getThrower());
      setDead();
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

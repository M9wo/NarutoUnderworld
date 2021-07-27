package alcoholmod.Mathioks.Final.CT;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BoilReleaseMeltdownEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 2;
  
  private int ticksInGround;
  
  public BoilReleaseMeltdownEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.7D;
    this.motionY *= 0.7D;
    this.motionZ *= 0.7D;
    setSize(0.8F, 0.8F);
  }
  
  public BoilReleaseMeltdownEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.7D;
    this.motionY *= 0.7D;
    this.motionZ *= 0.7D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.ticksExisted >= 200)
      setDead(); 
    float f3 = 3.25F;
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 13.0F);
        par1MovingObjectPosition.entityHit.setFire(35);
        this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, false);
        ((EntityLivingBase)par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.poison.id, 60, 1));
      } 
      if (!this.worldObj.isRemote)
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

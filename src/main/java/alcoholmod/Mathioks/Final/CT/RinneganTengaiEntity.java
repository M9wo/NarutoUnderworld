package alcoholmod.Mathioks.Final.CT;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class RinneganTengaiEntity extends EntityThrowable {
  public int explosionRadius = 200;
  
  private int counter;
  
  public boolean startCounter = false;
  
  private int ticksInGround;
  
  public RinneganTengaiEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.0D;
    this.motionY *= 0.35D;
    this.motionZ *= 0.0D;
    setSize(40.3125F, 40.3125F);
  }
  
  public RinneganTengaiEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.0D;
    this.motionY *= 0.35D;
    this.motionZ *= 0.0D;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (!this.worldObj.isRemote)
      this.motionY = -0.18D; 
    if (this.ticksExisted >= 5000)
      setDead(); 
    if (this.startCounter) {
      this.counter++;
      if (this.counter >= 165)
        setDead(); 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      this.counter++;
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 999.0F);
        ((EntityLivingBase)par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.weakness.id, 300, 10));
        ((EntityLivingBase)par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 300, 10));
        ((EntityLivingBase)par1MovingObjectPosition.entityHit).setFire(500);
      } 
      if (par1MovingObjectPosition.entityHit instanceof RinneganTengaiEntity);
      this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, false);
      if (!this.startCounter)
        this.startCounter = true; 
    } 
  }
  
  public boolean canBeCollidedWith() {
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public boolean isInRangeToRenderDist(double p_70112_1_) {
    double d1 = this.boundingBox.getAverageEdgeLength() * 12.0D;
    d1 *= 64.0D;
    return (p_70112_1_ < d1 * d1);
  }
  
  @SideOnly(Side.CLIENT)
  public float getShadowSize() {
    return 100.0F;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
}

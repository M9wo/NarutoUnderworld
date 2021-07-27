package alcoholmod.Mathioks.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class SixPathsOrbs extends EntityThrowable {
  private static final String __OBFID = "CL_00001850";
  
  int deathcounter;
  
  private int ticksInGround;
  
  public SixPathsOrbs(World Par1World) {
    super(Par1World);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    setSize(0.7F, 0.7F);
  }
  
  public SixPathsOrbs(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public SixPathsOrbs(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public void onUpdate() {
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    super.onUpdate();
    this.posX += this.motionX * 1.2D;
    this.posY += this.motionY * 1.2D;
    this.posZ += this.motionZ * 1.2D;
    float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
    this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);
    float f3 = 5.25F;
    for (int i = 0; i < 38; i++)
      this.worldObj.spawnParticle("spell", this.posX - this.motionX * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.posY - this.motionY * f3 - 0.5D, this.posZ - this.motionZ * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.motionX, this.motionY, this.motionZ); 
    this.deathcounter++;
    if (this.deathcounter >= 120)
      setDead(); 
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (Par1MovingObjectPosition.entityHit != null) {
      Par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 50.0F);
      ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 150, 250));
      ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.jump.id, 150, 129));
      setDead();
    } else {
      setDead();
    } 
  }
}

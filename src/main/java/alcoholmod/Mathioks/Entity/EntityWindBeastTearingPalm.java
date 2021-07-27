package alcoholmod.Mathioks.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityWindBeastTearingPalm extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private boolean Water;
  
  int deathcounter;
  
  public int explosionRadius = 5;
  
  private int ticksInGround;
  
  public EntityWindBeastTearingPalm(World Par1World) {
    super(Par1World);
    this.motionX *= 0.6D;
    this.motionY *= 0.6D;
    this.motionZ *= 0.6D;
    setSize(9.75F, 0.75F);
  }
  
  public EntityWindBeastTearingPalm(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.6D;
    this.motionY *= 0.6D;
    this.motionZ *= 0.6D;
    setSize(9.75F, 0.75F);
  }
  
  public EntityWindBeastTearingPalm(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 0.6D;
    this.motionY *= 0.6D;
    this.motionZ *= 0.6D;
    setSize(9.75F, 0.75F);
  }
  
  public void onUpdate() {
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    super.onUpdate();
    this.posX += this.motionX;
    this.posY += this.motionY;
    this.posZ += this.motionZ;
    float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
    this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);
    float f3 = 5.25F;
    for (int i = 0; i < 38; i++) {
      this.worldObj.spawnParticle("witchMagic", this.posX - this.motionX * f3 + this.rand.nextDouble() * 2.6D - 0.3D, this.posY - this.motionY * f3 - 0.5D, this.posZ - this.motionZ * f3 + this.rand.nextDouble() * 2.6D - 0.3D, this.motionX, this.motionY, this.motionZ);
      this.worldObj.spawnParticle("witchMagic", this.posX - this.motionX * f3 + this.rand.nextDouble() * 2.6D - 0.3D, this.posY - this.motionY * f3 - 0.5D, this.posZ - this.motionZ * f3 + this.rand.nextDouble() * 2.6D - 0.3D, this.motionX, this.motionY, this.motionZ);
    } 
    this.deathcounter++;
    if (this.deathcounter >= 200)
      setDead(); 
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (!this.worldObj.isRemote)
      if (Par1MovingObjectPosition.entityHit != null) {
        Par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 13.0F);
        this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, false);
        float var4 = 1.0F;
        int i = (int)(Par1MovingObjectPosition.entityHit.prevPosX + (Par1MovingObjectPosition.entityHit.posX - Par1MovingObjectPosition.entityHit.prevPosX) * var4);
        int j = (int)(Par1MovingObjectPosition.entityHit.prevPosY + (Par1MovingObjectPosition.entityHit.posY - Par1MovingObjectPosition.entityHit.prevPosY) * var4 + 1.62D - Par1MovingObjectPosition.entityHit.yOffset);
        int k = (int)(Par1MovingObjectPosition.entityHit.prevPosZ + (Par1MovingObjectPosition.entityHit.posZ - Par1MovingObjectPosition.entityHit.prevPosZ) * var4);
        Par1MovingObjectPosition.entityHit.addVelocity((-MathHelper.sin(this.rotationYaw * 3.141593F / -180.0F) * j * 0.5F) / 21.0D, 0.1D, (MathHelper.cos(this.rotationYaw * 3.141593F / -180.0F) * j * 0.5F) / 21.0D);
      } else {
        this.worldObj.newExplosion((Entity)this, this.posX, this.posY, this.posZ, this.explosionRadius, false, false);
      }  
  }
}
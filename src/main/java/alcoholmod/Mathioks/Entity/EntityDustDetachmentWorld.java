package alcoholmod.Mathioks.Entity;

import alcoholmod.Mathioks.Final.CT.DustReleaseDetachmentWorldEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityDustDetachmentWorld extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private boolean Water;
  
  int deathcounter;
  
  public int explosionRadius = 5;
  
  private int ticksInGround;
  
  public EntityDustDetachmentWorld(World Par1World) {
    super(Par1World);
    this.motionX *= 0.7D;
    this.motionY *= 0.7D;
    this.motionZ *= 0.7D;
  }
  
  public EntityDustDetachmentWorld(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.7D;
    this.motionY *= 0.7D;
    this.motionZ *= 0.7D;
  }
  
  public EntityDustDetachmentWorld(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 0.7D;
    this.motionY *= 0.7D;
    this.motionZ *= 0.7D;
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
      int i = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posX);
      int j = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posY);
      int k = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posZ);
      DustReleaseDetachmentWorldEntity fireball2 = new DustReleaseDetachmentWorldEntity((getThrower()).worldObj);
      fireball2.setPosition(i, j, k);
      (getThrower()).worldObj.spawnEntityInWorld((Entity)fireball2);
    } else {
      setDead();
    } 
  }
}

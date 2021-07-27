package alcoholmod.Mathioks.Final.CT;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityShootMeteor extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private int ticksInGround;
  
  public EntityShootMeteor(World Par1World) {
    super(Par1World);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityShootMeteor(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityShootMeteor(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (Par1MovingObjectPosition.entityHit != null && Par1MovingObjectPosition.entityHit instanceof EntityLivingBase && 
      !this.worldObj.isRemote) {
      RinneganTengaiEntity fireball2 = new RinneganTengaiEntity(this.worldObj);
      fireball2.setPosition(this.posX, this.posY + 35.0D, this.posZ);
      this.worldObj.spawnEntityInWorld((Entity)fireball2);
    } 
    if (!this.worldObj.isRemote)
      setDead(); 
  }
}

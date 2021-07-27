package alcoholmod.Mathioks.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityKnocking extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private int ticksInGround;
  
  public EntityKnocking(World Par1World) {
    super(Par1World);
    this.motionX *= 0.5D;
    this.motionY *= 0.5D;
    this.motionZ *= 0.5D;
  }
  
  public EntityKnocking(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.5D;
    this.motionY *= 0.5D;
    this.motionZ *= 0.5D;
  }
  
  public EntityKnocking(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 0.5D;
    this.motionY *= 0.5D;
    this.motionZ *= 0.5D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (Par1MovingObjectPosition.entityHit != null && Par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      byte knockingDamage = 30;
      Par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), knockingDamage);
      ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 300, 20));
      ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.confusion.id, 300, 5));
      ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.weakness.id, 300, 5));
    } 
    if (!this.worldObj.isRemote)
      setDead(); 
  }
}

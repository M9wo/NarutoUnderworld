package alcoholmod.Mathioks.Final.CT;

import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class WaterGunshotEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  public boolean Water;
  
  private int ticksInGround;
  
  public WaterGunshotEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 1.5D;
    this.motionY *= 1.5D;
    this.motionZ *= 1.5D;
  }
  
  public WaterGunshotEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.5D;
    this.motionY *= 1.5D;
    this.motionZ *= 1.5D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    float f3 = 5.25F;
    for (int i = 0; i < 4; i++);
    List<Entity> list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)getThrower(), AxisAlignedBB.getBoundingBox(this.posX - 7.0D, this.posY - 7.0D, this.posZ - 7.0D, this.posX + 7.0D, this.posY + 7.0D, this.posZ + 7.0D));
    for (int k2 = 0; k2 < list.size(); k2++) {
      if (!this.worldObj.isRemote) {
        Entity entity = list.get(k2);
        if (entity instanceof net.minecraft.entity.EntityLiving && entity != getThrower()) {
          entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 14.0F);
          entity.extinguish();
        } 
      } 
    } 
    if (this.ticksExisted >= 200)
      setDead(); 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        if (par1MovingObjectPosition.entityHit != getThrower())
          if (this.Water) {
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 20.0F);
            par1MovingObjectPosition.entityHit.extinguish();
          } else {
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 14.0F);
            par1MovingObjectPosition.entityHit.extinguish();
          }  
        if (!this.worldObj.isRemote)
          setDead(); 
      } 
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

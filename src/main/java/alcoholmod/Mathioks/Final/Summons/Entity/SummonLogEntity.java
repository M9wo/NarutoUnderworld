package alcoholmod.Mathioks.Final.Summons.Entity;

import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class SummonLogEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 2;
  
  private int ticksInGround;
  
  public SummonLogEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.5D;
    this.motionY *= 0.0D;
    this.motionZ *= 0.5D;
    setSize(1.0F, 1.0F);
  }
  
  public SummonLogEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.5D;
    this.motionY *= 0.0D;
    this.motionZ *= 0.5D;
  }
  
  protected float getGravityVelocity() {
    return 0.007F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.ticksExisted >= 200)
      setDead(); 
    List<Entity> list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)getThrower(), AxisAlignedBB.getBoundingBox(this.posX - 1.0D, this.posY - 1.0D, this.posZ - 2.0D, this.posX + 1.0D, this.posY + 1.0D, this.posZ + 2.0D));
    for (int k2 = 0; k2 < list.size(); k2++) {
      if (!this.worldObj.isRemote) {
        Entity entity = list.get(k2);
        if (entity instanceof net.minecraft.entity.EntityLiving && entity != getThrower()) {
          entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 2.0F);
          entity.motionY += this.motionY;
          entity.motionX += this.motionX;
          entity.motionZ += this.motionZ;
        } 
      } 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && par1MovingObjectPosition.entityHit != getThrower()) {
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.EntityLiving) {
        par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 2.0F);
        Entity var10000 = par1MovingObjectPosition.entityHit;
        var10000.motionY += this.motionY;
        var10000 = par1MovingObjectPosition.entityHit;
        var10000.motionX += this.motionX;
        var10000 = par1MovingObjectPosition.entityHit;
        var10000.motionZ += this.motionZ;
      } 
      if (!this.worldObj.isRemote);
      this.posY += 2.0D;
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

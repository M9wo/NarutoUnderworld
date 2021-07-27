package alcoholmod.Mathioks.Final.CT;

import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class WaterDragonEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 2;
  
  private int ticksInGround;
  
  public WaterDragonEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 1.2D;
    this.motionY *= 1.2D;
    this.motionZ *= 1.2D;
    float f = 0.4F;
    setSize(0.5F, 0.5F);
  }
  
  public WaterDragonEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.2D;
    this.motionY *= 1.2D;
    this.motionZ *= 1.2D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.ticksExisted >= 200)
      setDead(); 
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 13.0D, this.posY - 3.0D, this.posZ - 3.0D, this.posX + 1.0D, this.posY + 3.0D, this.posZ + 3.0D));
    if (getThrower() != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = getThrower().getUniqueID().toString();
          if (entity instanceof net.minecraft.entity.EntityLiving) {
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 18.0F);
            setDead();
          } 
          if (entity instanceof net.minecraft.entity.player.EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 18.0F);
            setDead();
          } 
        } 
      }  
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 30.0F);
        ((EntityLivingBase)par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 200, -10));
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

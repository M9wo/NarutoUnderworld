package alcoholmod.Mathioks.Final.CT;

import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ScorchReleaseHeathEntity2 extends EntityThrowable implements IMob {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 3;
  
  private EntityLivingBase thrower;
  
  private String throwerName;
  
  private int ticksInGround;
  
  public ScorchReleaseHeathEntity2(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.4D;
    this.motionY *= 0.4D;
    this.motionZ *= 0.4D;
    setSize(4.0F, 4.0F);
  }
  
  public ScorchReleaseHeathEntity2(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.4D;
    this.motionY *= 0.4D;
    this.motionZ *= 0.4D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (!this.worldObj.isRemote && this.ticksExisted >= 270)
      setDead(); 
    List<Entity> list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)getThrower(), AxisAlignedBB.getBoundingBox(this.posX - 2.0D, this.posY - 2.0D, this.posZ - 2.0D, this.posX + 2.0D, this.posY + 2.0D, this.posZ + 2.0D));
    for (int k2 = 0; k2 < list.size(); k2++) {
      if (!this.worldObj.isRemote) {
        Entity entity = list.get(k2);
        if (!(entity instanceof ScorchReleaseHeathEntity2) && !(entity instanceof ScorchReleaseHeathEntity) && entity != getThrower()) {
          entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 10.0F);
          this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, true);
          setDead();
        } 
      } 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 10.0F);
        par1MovingObjectPosition.entityHit.setFire(30);
        this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, true);
        setDead();
        ((EntityLivingBase)par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.hunger.id, -200, 100));
      } 
      if (!this.worldObj.isRemote);
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

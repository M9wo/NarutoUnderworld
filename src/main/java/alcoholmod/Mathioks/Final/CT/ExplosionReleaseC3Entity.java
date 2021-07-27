package alcoholmod.Mathioks.Final.CT;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ExplosionReleaseC3Entity extends EntityThrowable implements IMob {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 20;
  
  private int ticksInGround;
  
  public ExplosionReleaseC3Entity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.8D;
    this.motionY *= 0.8D;
    this.motionZ *= 0.8D;
    setSize(4.3125F, 4.3125F);
  }
  
  public ExplosionReleaseC3Entity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.8D;
    this.motionY *= 0.8D;
    this.motionZ *= 0.8D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (!this.worldObj.isRemote) {
      this.motionY = -0.7D;
      this.motionX = 0.0D;
      this.motionZ = 0.0D;
      if (this.ticksExisted >= 270)
        setDead(); 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, 100.0F, false, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"));
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        if (par1MovingObjectPosition.entityHit != getThrower())
          par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 10.0F); 
        ((EntityLivingBase)par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.hunger.id, -200, 100));
      } 
      if (!this.worldObj.isRemote) {
        int i = par1MovingObjectPosition.blockX;
        int j = par1MovingObjectPosition.blockY;
        int k = par1MovingObjectPosition.blockZ;
        setDead();
      } 
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

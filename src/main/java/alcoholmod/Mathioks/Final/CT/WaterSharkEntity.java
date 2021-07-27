package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.ExtendedPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class WaterSharkEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 2;
  
  private int ticksInGround;
  
  public WaterSharkEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.7D;
    this.motionY *= 0.7D;
    this.motionZ *= 0.7D;
    float f = 0.4F;
    setSize(1.3125F, 1.3125F);
  }
  
  public WaterSharkEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.7D;
    this.motionY *= 0.7D;
    this.motionZ *= 0.7D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.ticksExisted >= 200)
      setDead(); 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        float Damage = 15.0F;
        if (getThrower() instanceof EntityPlayer) {
          EntityPlayer player = (EntityPlayer)getThrower();
          ExtendedPlayer props = ExtendedPlayer.get(player);
          float DamagePlayer = (float)(Damage + Damage * 0.001D * props.getLevel());
          par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), DamagePlayer);
        } else {
          par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), Damage);
        } 
        setDead();
      } 
      if (par1MovingObjectPosition.entityHit == null)
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

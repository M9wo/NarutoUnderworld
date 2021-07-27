package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.ExtendedPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class LavaReleaseStreamRockTechniqueEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 3;
  
  private int ticksInGround;
  
  public LavaReleaseStreamRockTechniqueEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    setSize(2.3125F, 2.3125F);
  }
  
  public LavaReleaseStreamRockTechniqueEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.ticksExisted >= 150)
      setDead(); 
    float f3 = 3.25F;
    for (int i = 0; i < 24; i++)
      this.worldObj.spawnParticle("lava", this.posX - this.motionX * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.posY - this.motionY * f3 - 0.5D, this.posZ - this.motionZ * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.motionX, this.motionY, this.motionZ); 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        float Damage = 10.0F;
        EntityPlayer player = (EntityPlayer)getThrower();
        ExtendedPlayer props = ExtendedPlayer.get(player);
        if (getThrower() instanceof EntityPlayer) {
          float DamagePlayer = (float)(Damage + Damage * 0.001D * props.getLevel());
          par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), DamagePlayer);
        } else {
          par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), Damage);
        } 
        par1MovingObjectPosition.entityHit.setFire(30);
      } 
      if (!this.worldObj.isRemote)
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

package alcoholmod.Mathioks.Final.CT.Menma;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityDevastationBeam extends EntityThrowable {
  private float damage = 100.0F;
  
  public EntityDevastationBeam(World p_i1703_1_, double p_i1703_2_, double p_i1703_4_, double p_i1703_6_) {
    super(p_i1703_1_);
  }
  
  public EntityDevastationBeam(World par1World) {
    super(par1World);
  }
  
  public EntityDevastationBeam(World par1World, EntityLivingBase par2EntityLivingBase) {
    super(par1World, par2EntityLivingBase);
  }
  
  protected void onImpact(MovingObjectPosition movingobjectposition) {
    if (movingobjectposition.entityHit != null && movingobjectposition.entityHit instanceof net.minecraft.entity.EntityLiving) {
      movingobjectposition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), this.damage);
      for (int var3 = 0; var3 < 8; var3++)
        this.worldObj.spawnParticle("magicCrit", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D); 
      if (!this.worldObj.isRemote)
        setDead(); 
    } 
  }
  
  protected float getGravityVelocity() {
    return 1.5E-4F;
  }
  
  protected float func_70182_d() {
    return 4.5F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.ticksExisted >= 500)
      setDead(); 
    int var1;
    for (var1 = 0; var1 < 10; var1++) {
      double motionX = this.rand.nextGaussian() * 0.02D;
      double motionY = this.rand.nextGaussian() * 0.02D;
      double motionZ = this.rand.nextGaussian() * 0.02D;
      this.worldObj.spawnParticle("fireworksSpark", this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + 0.0D + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, motionX, motionY, motionZ);
    } 
    for (var1 = 0; var1 < 1.0E-4D; var1++)
      this.worldObj.playSoundAtEntity((Entity)this, "stormarmory:boss.dropship.fire3", 1.0F, 1.0F); 
  }
}

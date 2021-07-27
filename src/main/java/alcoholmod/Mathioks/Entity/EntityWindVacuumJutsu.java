package alcoholmod.Mathioks.Entity;

import alcoholmod.Mathioks.ExtendedPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityWindVacuumJutsu extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private boolean Water;
  
  int deathcounter;
  
  public int explosionRadius = 5;
  
  private int ticksInGround;
  
  public EntityWindVacuumJutsu(World Par1World) {
    super(Par1World);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public EntityWindVacuumJutsu(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public EntityWindVacuumJutsu(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public void onUpdate() {
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    super.onUpdate();
    this.posX += this.motionX;
    this.posY += this.motionY;
    this.posZ += this.motionZ;
    float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
    this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);
    float f3 = 5.25F;
    for (int i = 0; i < 38; i++)
      this.worldObj.spawnParticle("spell", this.posX - this.motionX * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.posY - this.motionY * f3 - 0.5D, this.posZ - this.motionZ * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.motionX, this.motionY, this.motionZ); 
    this.deathcounter++;
    if (this.deathcounter >= 120)
      setDead(); 
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (Par1MovingObjectPosition.entityHit != null) {
      float Damage = 4.0F;
      if (getThrower() instanceof EntityPlayer) {
        EntityPlayer player = (EntityPlayer)getThrower();
        ExtendedPlayer props = ExtendedPlayer.get(player);
        float DamagePlayer = (float)(Damage + Damage * 0.001D * props.getLevel());
        Par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), DamagePlayer);
      } else {
        Par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), Damage);
      } 
      float var4 = 1.0F;
      int i = (int)(Par1MovingObjectPosition.entityHit.prevPosX + (Par1MovingObjectPosition.entityHit.posX - Par1MovingObjectPosition.entityHit.prevPosX) * var4);
      int j = (int)(Par1MovingObjectPosition.entityHit.prevPosY + (Par1MovingObjectPosition.entityHit.posY - Par1MovingObjectPosition.entityHit.prevPosY) * var4 + 1.62D - Par1MovingObjectPosition.entityHit.yOffset);
      int k = (int)(Par1MovingObjectPosition.entityHit.prevPosZ + (Par1MovingObjectPosition.entityHit.posZ - Par1MovingObjectPosition.entityHit.prevPosZ) * var4);
      Par1MovingObjectPosition.entityHit.addVelocity((-MathHelper.sin(this.rotationYaw * 3.141593F / -180.0F) * j * 0.5F) / 8.0D, 0.1D, (MathHelper.cos(this.rotationYaw * 3.141593F / -180.0F) * j * 0.5F) / 6.0D);
    } else {
      setDead();
    } 
  }
}

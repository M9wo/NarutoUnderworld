package alcoholmod.Mathioks.Final;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityYangReleaseFlashOfLight extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private int ticksInGround;
  
  public EntityYangReleaseFlashOfLight(World Par1World) {
    super(Par1World);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public EntityYangReleaseFlashOfLight(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public EntityYangReleaseFlashOfLight(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    for (int i = 0; i < 10; i++) {
      super.onUpdate();
      this.worldObj.spawnParticle("fireworksSpark", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("fireworksSpark", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("fireworksSpark", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("fireworksSpark", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("fireworksSpark", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("fireworksSpark", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("fireworksSpark", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("fireworksSpark", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
    } 
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (Par1MovingObjectPosition.entityHit != null) {
      if (Par1MovingObjectPosition.entityHit instanceof EntityLivingBase)
        ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.blindness.id, 200, 100)); 
      if (!this.worldObj.isRemote)
        setDead(); 
    } 
  }
}

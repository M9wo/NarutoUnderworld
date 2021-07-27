package alcoholmod.Mathioks.Entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class HiddenMistEntity extends EntityThrowable {
  private boolean Hit = false;
  
  private int counter = 0;
  
  private static final String __OBFID = "CL_00001722";
  
  private int ticksInGround;
  
  public HiddenMistEntity(World Par1World) {
    super(Par1World);
    this.motionX *= 0.0D;
    this.motionY *= 0.0D;
    this.motionZ *= 0.0D;
  }
  
  public HiddenMistEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.0D;
    this.motionY *= 0.0D;
    this.motionZ *= 0.0D;
  }
  
  public HiddenMistEntity(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 0.0D;
    this.motionY *= 0.0D;
    this.motionZ *= 0.0D;
  }
  
  public void onUpdate() {
    super.onUpdate();
    float f3 = 3.25F;
    if (this.Hit) {
      this.counter++;
      for (int i = 0; i < 32; i++) {
        this.worldObj.spawnParticle("cloud", this.posX, this.posY + this.worldObj.rand.nextDouble() * 1.0D, this.posZ, this.worldObj.rand.nextGaussian(), 0.0D, this.worldObj.rand.nextGaussian());
        this.worldObj.spawnParticle("cloud", this.posX, this.posY + this.worldObj.rand.nextDouble() * 1.0D, this.posZ - 1.0D, this.worldObj.rand.nextGaussian(), 0.0D, this.worldObj.rand.nextGaussian());
      } 
      if (this.counter == 1000)
        setDead(); 
    } 
  }
  
  protected float getGravityVelocity() {
    return 100.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (!this.worldObj.isRemote)
      this.Hit = true; 
  }
}

package alcoholmod.Mathioks.Final.Summons.Entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class SummonFallingLogEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 2;
  
  private boolean hit2 = false;
  
  private int ticksInGround;
  
  public SummonFallingLogEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.005D;
    this.motionY *= 0.005D;
    this.motionZ *= 0.005D;
    setSize(1.0F, 1.0F);
  }
  
  public SummonFallingLogEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.005D;
    this.motionY *= 0.005D;
    this.motionZ *= 0.005D;
  }
  
  protected float getGravityVelocity() {
    float falling = 0.0F;
    if (this.onGround)
      falling = 0.0F; 
    if (!this.onGround)
      falling = 0.1F; 
    return falling;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.ticksExisted >= 370)
      setDead(); 
    if (this.onGround) {
      this.motionX = 0.0D;
      this.motionY = 0.0D;
      this.motionZ = 0.0D;
    } 
    if (this.hit2) {
      this.motionX = 0.0D;
      this.motionY = 0.0D;
      this.motionZ = 0.0D;
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    this.hit2 = true;
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

package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.Mob.EntityNarutoMob03_3;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EdoCageEntity_2 extends EntityThrowable {
  private static final String __OBFID = "CL_00001806";
  
  private int explosionRadius = 1;
  
  private int ticksInGround;
  
  Random rand = new Random();
  
  public EdoCageEntity_2(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.1D;
    this.motionY *= 0.1D;
    this.motionZ *= 0.1D;
    this.noClip = true;
    setSize(0.5F, 0.5F);
  }
  
  public EdoCageEntity_2(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.1D;
    this.motionY *= 0.1D;
    this.motionZ *= 0.1D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    super.onUpdate();
    if (!this.worldObj.isRemote) {
      if (this.ticksExisted <= 5) {
        this.posX += this.motionX;
        this.posY += this.motionY;
        this.posZ += this.motionZ;
      } 
      if (this.ticksExisted >= 21 && this.ticksExisted <= 75) {
        this.motionY = 0.05D;
        this.motionX = 0.0D;
        this.motionZ = 0.0D;
        this.posX += this.motionX;
        this.posY += this.motionY;
        this.posZ += this.motionZ;
      } 
      if (this.ticksExisted >= 76)
        this.motionY = 0.0D; 
      if (this.ticksExisted >= 125) {
        if (getThrower() != null) {
          EntityNarutoMob03_3 entitychameleon = new EntityNarutoMob03_3((getThrower()).worldObj);
          entitychameleon.func_152115_b(((EntityPlayer)getThrower()).getUniqueID().toString());
          entitychameleon.setTamed(true);
          entitychameleon.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationPitch, this.rotationYaw);
          entitychameleon.rotationYawHead = entitychameleon.rotationYaw;
          entitychameleon.renderYawOffset = entitychameleon.rotationYaw;
          (getThrower()).worldObj.spawnEntityInWorld((Entity)entitychameleon);
        } 
        setDead();
      } 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote);
  }
  
  public boolean canBeCollidedWith() {
    return true;
  }
  
  public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
    return true;
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

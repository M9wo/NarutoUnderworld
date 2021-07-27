package alcoholmod.Mathioks.Final.CT;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BijuuBombEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private boolean hit2 = false;
  
  private int i = 4;
  
  private int counter = 0;
  
  public int level;
  
  private int ticksInGround;
  
  public BijuuBombEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    setSize(1.3125F, 1.3125F);
  }
  
  public BijuuBombEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
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
    if (this.ticksExisted >= 400)
      setDead(); 
    if (this.hit2) {
      this.motionX = 0.0D;
      this.motionY = 0.0D;
      this.motionZ = 0.0D;
      this.counter++;
      if (this.level == 1) {
        if (this.ticksExisted >= 150)
          setDead(); 
        if (this.counter == 25) {
          this.i++;
          this.counter = 0;
        } 
        if (getThrower() instanceof net.minecraft.entity.player.EntityPlayer) {
          this.worldObj.newExplosion((Entity)this, this.posX, this.posY, this.posZ, (this.i + 2), false, false);
        } else {
          this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, (this.i + 2), false, false);
        } 
      } 
      if (this.level == 2) {
        if (this.ticksExisted >= 250)
          setDead(); 
        if (this.counter == 20) {
          this.i++;
          this.counter = 0;
        } 
        if (getThrower() instanceof net.minecraft.entity.player.EntityPlayer) {
          this.worldObj.newExplosion((Entity)this, this.posX, this.posY, this.posZ, (this.i + 2), false, false);
        } else {
          this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, (this.i + 2), false, false);
        } 
      } 
      if (this.level == 3) {
        if (this.ticksExisted >= 350)
          setDead(); 
        if (this.counter == 15) {
          this.i++;
          this.counter = 0;
        } 
        if (getThrower() instanceof net.minecraft.entity.player.EntityPlayer) {
          this.worldObj.newExplosion((Entity)this, this.posX, this.posY, this.posZ, (this.i + 2), false, false);
        } else {
          this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, (this.i + 2), false, false);
        } 
      } 
      if (this.level == 4) {
        if (this.counter == 5) {
          this.i++;
          this.counter = 0;
        } 
        if (getThrower() instanceof net.minecraft.entity.player.EntityPlayer) {
          this.worldObj.newExplosion((Entity)this, this.posX, this.posY, this.posZ, (this.i + 2), false, false);
        } else {
          this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, (this.i + 2), false, false);
        } 
      } 
      if (this.level == 5) {
        if (this.counter == 2) {
          this.i++;
          this.counter = 0;
        } 
        if (getThrower() instanceof net.minecraft.entity.player.EntityPlayer) {
          this.worldObj.newExplosion((Entity)this, this.posX, this.posY, this.posZ, (this.i + 2), false, false);
        } else {
          this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, (this.i + 2), false, false);
        } 
      } 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase && par1MovingObjectPosition.entityHit != getThrower()) {
        switch (this.level) {
          case 1:
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 30.0F);
            break;
          case 2:
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 2000.0F);
            break;
          case 3:
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 4000.0F);
            break;
          case 4:
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 6000.0F);
            break;
          case 5:
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 8000.0F);
            break;
        } 
        this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, 10.0F, false, false);
      } 
      this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, 10.0F, false, false);
    } 
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

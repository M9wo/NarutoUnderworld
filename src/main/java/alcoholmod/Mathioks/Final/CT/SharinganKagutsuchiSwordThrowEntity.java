package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.block.Blockss;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class SharinganKagutsuchiSwordThrowEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 1;
  
  private boolean start = false;
  
  private int counter = 0;
  
  private int ticksInGround;
  
  public SharinganKagutsuchiSwordThrowEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.5D;
    this.motionY *= 0.5D;
    this.motionZ *= 0.5D;
    setSize(0.5F, 0.5F);
  }
  
  public SharinganKagutsuchiSwordThrowEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.5D;
    this.motionY *= 0.5D;
    this.motionZ *= 0.5D;
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
      this.posX += this.motionX;
      this.posY += this.motionY;
      this.posZ += this.motionZ;
      if (this.ticksExisted >= 25)
        setDead(); 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 6.0F);
      par1MovingObjectPosition.entityHit.setFire(30);
      setDead();
      if (par1MovingObjectPosition.entityHit == getThrower());
      int i = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posX);
      int j = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posY);
      int k = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posZ);
      int p_77648_7_ = MathHelper.floor_double(par1MovingObjectPosition.sideHit);
      if (p_77648_7_ == 0)
        j--; 
      if (p_77648_7_ == 1)
        j++; 
      if (p_77648_7_ == 2)
        k--; 
      if (p_77648_7_ == 3)
        k++; 
      if (p_77648_7_ == 4)
        i--; 
      if (p_77648_7_ == 5)
        i++; 
      if (this.worldObj.isAirBlock(i, j, k))
        this.worldObj.setBlock(i, j, k, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i, j - 1, k))
        this.worldObj.setBlock(i, j - 1, k, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i, j + 1, k))
        this.worldObj.setBlock(i, j + 1, k, (Block)Blockss.blockAmaterasu); 
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

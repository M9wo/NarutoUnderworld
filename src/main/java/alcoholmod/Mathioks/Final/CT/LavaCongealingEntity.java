package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.block.Blockss;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class LavaCongealingEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 4;
  
  private int ticksInGround;
  
  public LavaCongealingEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    float f = 0.4F;
    setSize(2.3125F, 2.3125F);
  }
  
  public LavaCongealingEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  protected float getGravityVelocity() {
    return 0.02F;
  }
  
  public void onUpdate() {
    super.onUpdate();
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 10.0F);
        int m = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posX - 2.0D);
        int n = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posY);
        int i1 = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posZ - 2.0D);
        this.worldObj.setBlock(m, n, i1, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(m + 1, n, i1, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(m, n, i1 + 1, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(m + 1, n, i1 + 1, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(m, n, i1 + 2, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(m + 1, n, i1 + 2, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(m + 2, n, i1, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(m + 2, n, i1 + 1, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(m + 2, n, i1 + 2, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(m, n, i1 + 3, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(m + 1, n, i1 + 3, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(m + 2, n, i1 + 3, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(m + 3, n, i1 + 3, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(m + 3, n, i1, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(m + 3, n, i1 + 1, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(m + 3, n, i1 + 2, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(m + 3, n, i1 + 3, (Block)Blockss.blockCongealing);
      } 
      int i = par1MovingObjectPosition.blockX;
      int j = par1MovingObjectPosition.blockY;
      int k = par1MovingObjectPosition.blockZ;
      this.worldObj.setBlock(i, j + 1, k, (Block)Blockss.blockCongealing);
      this.worldObj.setBlock(i + 1, j + 1, k, (Block)Blockss.blockCongealing);
      this.worldObj.setBlock(i, j + 1, k + 1, (Block)Blockss.blockCongealing);
      this.worldObj.setBlock(i + 1, j + 1, k + 1, (Block)Blockss.blockCongealing);
      this.worldObj.setBlock(i, j + 1, k + 2, (Block)Blockss.blockCongealing);
      this.worldObj.setBlock(i + 1, j + 1, k + 2, (Block)Blockss.blockCongealing);
      this.worldObj.setBlock(i + 2, j + 1, k, (Block)Blockss.blockCongealing);
      this.worldObj.setBlock(i + 2, j + 1, k + 1, (Block)Blockss.blockCongealing);
      this.worldObj.setBlock(i + 2, j + 1, k + 2, (Block)Blockss.blockCongealing);
      this.worldObj.setBlock(i, j + 1, k + 3, (Block)Blockss.blockCongealing);
      this.worldObj.setBlock(i + 1, j + 1, k + 3, (Block)Blockss.blockCongealing);
      this.worldObj.setBlock(i + 2, j + 1, k + 3, (Block)Blockss.blockCongealing);
      this.worldObj.setBlock(i + 3, j + 1, k + 3, (Block)Blockss.blockCongealing);
      this.worldObj.setBlock(i + 3, j + 1, k, (Block)Blockss.blockCongealing);
      this.worldObj.setBlock(i + 3, j + 1, k + 1, (Block)Blockss.blockCongealing);
      this.worldObj.setBlock(i + 3, j + 1, k + 2, (Block)Blockss.blockCongealing);
      this.worldObj.setBlock(i + 3, j + 1, k + 3, (Block)Blockss.blockCongealing);
      if (this.worldObj.getBlock(i, j + 1, k) == Blocks.air) {
        this.worldObj.setBlock(i, j, k, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(i + 1, j, k, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(i, j, k + 1, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(i + 1, j, k + 1, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(i, j, k + 2, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(i + 1, j, k + 2, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(i + 2, j, k, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(i + 2, j, k + 1, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(i + 2, j, k + 2, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(i, j, k + 3, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(i + 1, j, k + 3, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(i + 2, j, k + 3, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(i + 3, j, k + 3, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(i + 3, j, k, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(i + 3, j, k + 1, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(i + 3, j, k + 2, (Block)Blockss.blockCongealing);
        this.worldObj.setBlock(i + 3, j, k + 3, (Block)Blockss.blockCongealing);
      } 
      setDead();
    } 
  }
  
  public boolean canBeCollidedWith() {
    return true;
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

package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.block.Blockss;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class SharinganKagutsuchiFallingSwordsEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 5;
  
  private boolean start = false;
  
  private int counter = 0;
  
  private int ticksInGround;
  
  public SharinganKagutsuchiFallingSwordsEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    setSize(1.0F, 1.0F);
  }
  
  public SharinganKagutsuchiFallingSwordsEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  protected float getGravityVelocity() {
    return 0.004F;
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
      if (this.ticksExisted >= 35 && !this.start)
        setDead(); 
      if (this.start) {
        this.counter++;
        this.motionX = 0.0D;
        this.motionY = 0.0D;
        this.motionZ = 0.0D;
        if (this.counter >= 30)
          this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, false); 
        if (this.counter >= 40)
          setDead(); 
      } 
    } 
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 1.0D, this.posY - 1.0D, this.posZ - 1.0D, this.posX + 1.0D, this.posY + 1.0D, this.posZ + 1.0D));
    if (getThrower() != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = getThrower().getUniqueID().toString();
          if (entity instanceof net.minecraft.entity.EntityLiving) {
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 20.0F);
            entity.setFire(120);
          } 
          if (entity instanceof net.minecraft.entity.player.EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 20.0F);
            entity.setFire(120);
          } 
        } 
      }  
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 20.0F);
        par1MovingObjectPosition.entityHit.setFire(200);
        if (!this.start)
          this.start = true; 
        if (par1MovingObjectPosition.entityHit == getThrower());
        int m = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posX);
        int n = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posY);
        int i1 = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posZ);
        int i2 = MathHelper.floor_double(par1MovingObjectPosition.sideHit);
        if (i2 == 0)
          n--; 
        if (i2 == 1)
          n++; 
        if (i2 == 2)
          i1--; 
        if (i2 == 3)
          i1++; 
        if (i2 == 4)
          m--; 
        if (i2 == 5)
          m++; 
        if (this.worldObj.isAirBlock(m, n, i1))
          this.worldObj.setBlock(m, n, i1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m, n, i1 + 1))
          this.worldObj.setBlock(m, n, i1 + 1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m, n, i1 - 1))
          this.worldObj.setBlock(m, n, i1 - 1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m + 1, n, i1))
          this.worldObj.setBlock(m + 1, n, i1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m - 1, n, i1))
          this.worldObj.setBlock(m - 1, n, i1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m, n + 1, i1))
          this.worldObj.setBlock(m, n + 1, i1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m, n + 1, i1 + 1))
          this.worldObj.setBlock(m, n + 1, i1 + 1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m, n + 1, i1 - 1))
          this.worldObj.setBlock(m, n + 1, i1 - 1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m + 1, n + 1, i1))
          this.worldObj.setBlock(m + 1, n + 1, i1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m - 1, n + 1, i1))
          this.worldObj.setBlock(m - 1, n + 1, i1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m, n - 1, i1))
          this.worldObj.setBlock(m, n - 1, i1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m, n - 1, i1 + 1))
          this.worldObj.setBlock(m, n - 1, i1 + 1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m, n - 1, i1 - 1))
          this.worldObj.setBlock(m, n - 1, i1 - 1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m + 1, n - 1, i1))
          this.worldObj.setBlock(m + 1, n - 1, i1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m - 1, n - 1, i1))
          this.worldObj.setBlock(m - 1, n - 1, i1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m, n + 2, i1))
          this.worldObj.setBlock(m, n + 2, i1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m, n + 2, i1 + 1))
          this.worldObj.setBlock(m, n + 2, i1 + 1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m, n + 2, i1 - 1))
          this.worldObj.setBlock(m, n + 2, i1 - 1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m + 1, n + 2, i1))
          this.worldObj.setBlock(m + 1, n + 2, i1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m - 1, n + 2, i1))
          this.worldObj.setBlock(m - 1, n + 2, i1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m, n - 2, i1))
          this.worldObj.setBlock(m, n - 2, i1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m, n - 2, i1 + 1))
          this.worldObj.setBlock(m, n - 2, i1 + 1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m, n - 2, i1 - 1))
          this.worldObj.setBlock(m, n - 2, i1 - 1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m + 1, n - 2, i1))
          this.worldObj.setBlock(m + 1, n - 2, i1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m - 1, n - 2, i1))
          this.worldObj.setBlock(m - 1, n - 2, i1, (Block)Blockss.blockAmaterasu); 
      } 
      int i = par1MovingObjectPosition.blockX;
      int j = par1MovingObjectPosition.blockY;
      int k = par1MovingObjectPosition.blockZ;
      if (!this.start)
        this.start = true; 
      int p_77648_7_ = par1MovingObjectPosition.sideHit;
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
      if (this.worldObj.isAirBlock(i, j, k + 1))
        this.worldObj.setBlock(i, j, k + 1, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i, j, k - 1))
        this.worldObj.setBlock(i, j, k - 1, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i + 1, j, k))
        this.worldObj.setBlock(i + 1, j, k, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i - 1, j, k))
        this.worldObj.setBlock(i - 1, j, k, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i, j + 1, k))
        this.worldObj.setBlock(i, j + 1, k, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i, j + 1, k + 1))
        this.worldObj.setBlock(i, j + 1, k + 1, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i, j + 1, k - 1))
        this.worldObj.setBlock(i, j + 1, k - 1, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i + 1, j + 1, k))
        this.worldObj.setBlock(i + 1, j + 1, k, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i - 1, j + 1, k))
        this.worldObj.setBlock(i - 1, j + 1, k, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i, j - 1, k))
        this.worldObj.setBlock(i, j - 1, k, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i, j - 1, k + 1))
        this.worldObj.setBlock(i, j - 1, k + 1, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i, j - 1, k - 1))
        this.worldObj.setBlock(i, j - 1, k - 1, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i + 1, j - 1, k))
        this.worldObj.setBlock(i + 1, j - 1, k, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i - 1, j - 1, k))
        this.worldObj.setBlock(i - 1, j - 1, k, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i, j + 2, k))
        this.worldObj.setBlock(i, j + 2, k, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i, j + 2, k + 1))
        this.worldObj.setBlock(i, j + 2, k + 1, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i, j + 2, k - 1))
        this.worldObj.setBlock(i, j + 2, k - 1, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i + 1, j + 2, k))
        this.worldObj.setBlock(i + 1, j + 2, k, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i - 1, j + 2, k))
        this.worldObj.setBlock(i - 1, j + 2, k, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i, j - 2, k))
        this.worldObj.setBlock(i, j - 2, k, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i, j - 2, k + 1))
        this.worldObj.setBlock(i, j - 2, k + 1, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i, j - 2, k - 1))
        this.worldObj.setBlock(i, j - 2, k - 1, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i + 1, j - 2, k))
        this.worldObj.setBlock(i + 1, j - 2, k, (Block)Blockss.blockAmaterasu); 
      if (this.worldObj.isAirBlock(i - 1, j - 2, k))
        this.worldObj.setBlock(i - 1, j - 2, k, (Block)Blockss.blockAmaterasu); 
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

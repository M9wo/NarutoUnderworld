package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.ExtendedPlayer;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class MatatabiFlameDragonEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 4;
  
  private int ticksInGround;
  
  public MatatabiFlameDragonEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    float f = 0.4F;
    setSize(2.3125F, 2.3125F);
  }
  
  public MatatabiFlameDragonEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
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
    if (this.ticksExisted >= 350)
      setDead(); 
    if (isInWater())
      setDead(); 
    if (this.posY >= 110.0D) {
      if (!this.worldObj.getWorldInfo().isRaining())
        this.worldObj.getWorldInfo().setRaining(true); 
      if (!this.worldObj.getWorldInfo().isThundering())
        this.worldObj.getWorldInfo().setThundering(true); 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && getThrower() != null) {
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        EntityPlayer player = (EntityPlayer)getThrower();
        ExtendedPlayer props = ExtendedPlayer.get(player);
        par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 20.0F + (props.getNinjutsu() / 300));
        par1MovingObjectPosition.entityHit.setFire(200);
        this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, false);
        int m = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posX);
        int n = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posY);
        m = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posZ);
        int p_77648_7_ = MathHelper.floor_double(par1MovingObjectPosition.sideHit);
        if (p_77648_7_ == 0)
          n--; 
        if (p_77648_7_ == 1)
          n++; 
        if (p_77648_7_ == 2)
          m--; 
        if (p_77648_7_ == 3)
          m++; 
        if (p_77648_7_ == 4)
          m--; 
        if (p_77648_7_ == 5)
          m++; 
        if (this.worldObj.isAirBlock(m, n, m))
          this.worldObj.setBlock(m, n, m, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m, n, m + 1))
          this.worldObj.setBlock(m, n, m + 1, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m, n, m - 1))
          this.worldObj.setBlock(m, n, m - 1, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m + 1, n, m))
          this.worldObj.setBlock(m + 1, n, m, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m - 1, n, m))
          this.worldObj.setBlock(m - 1, n, m, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m, n + 1, m))
          this.worldObj.setBlock(m, n + 1, m, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m, n + 1, m + 1))
          this.worldObj.setBlock(m, n + 1, m + 1, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m, n + 1, m - 1))
          this.worldObj.setBlock(m, n + 1, m - 1, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m + 1, n + 1, m))
          this.worldObj.setBlock(m + 1, n + 1, m, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m - 1, n + 1, m))
          this.worldObj.setBlock(m - 1, n + 1, m, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m, n - 1, m))
          this.worldObj.setBlock(m, n - 1, m, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m, n - 1, m + 1))
          this.worldObj.setBlock(m, n - 1, m + 1, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m, n - 1, m - 1))
          this.worldObj.setBlock(m, n - 1, m - 1, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m + 1, n - 1, m))
          this.worldObj.setBlock(m + 1, n - 1, m, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m - 1, n - 1, m))
          this.worldObj.setBlock(m - 1, n - 1, m, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m, n + 2, m))
          this.worldObj.setBlock(m, n + 2, m, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m, n + 2, m + 1))
          this.worldObj.setBlock(m, n + 2, m + 1, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m, n + 2, m - 1))
          this.worldObj.setBlock(m, n + 2, m - 1, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m + 1, n + 2, m))
          this.worldObj.setBlock(m + 1, n + 2, m, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m - 1, n + 2, m))
          this.worldObj.setBlock(m - 1, n + 2, m, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m, n - 2, m))
          this.worldObj.setBlock(m, n - 2, m, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m, n - 2, m + 1))
          this.worldObj.setBlock(m, n - 2, m + 1, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m, n - 2, m - 1))
          this.worldObj.setBlock(m, n - 2, m - 1, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m + 1, n - 2, m))
          this.worldObj.setBlock(m + 1, n - 2, m, (Block)Blocks.fire); 
        if (this.worldObj.isAirBlock(m - 1, n - 2, m))
          this.worldObj.setBlock(m - 1, n - 2, m, (Block)Blocks.fire); 
        setDead();
      } 
      int i = par1MovingObjectPosition.blockX;
      int j = par1MovingObjectPosition.blockY;
      int k = par1MovingObjectPosition.blockZ;
      if (j == 0)
        j--; 
      if (j == 1)
        j++; 
      if (j == 2)
        k--; 
      if (j == 3)
        k++; 
      if (j == 4)
        i--; 
      if (j == 5)
        i++; 
      if (this.worldObj.isAirBlock(i, j, k))
        this.worldObj.setBlock(i, j, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j, k + 1))
        this.worldObj.setBlock(i, j, k + 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j, k - 1))
        this.worldObj.setBlock(i, j, k - 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i + 1, j, k))
        this.worldObj.setBlock(i + 1, j, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i - 1, j, k))
        this.worldObj.setBlock(i - 1, j, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j + 1, k))
        this.worldObj.setBlock(i, j + 1, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j + 1, k + 1))
        this.worldObj.setBlock(i, j + 1, k + 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j + 1, k - 1))
        this.worldObj.setBlock(i, j + 1, k - 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i + 1, j + 1, k))
        this.worldObj.setBlock(i + 1, j + 1, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i - 1, j + 1, k))
        this.worldObj.setBlock(i - 1, j + 1, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j - 1, k))
        this.worldObj.setBlock(i, j - 1, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j - 1, k + 1))
        this.worldObj.setBlock(i, j - 1, k + 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j - 1, k - 1))
        this.worldObj.setBlock(i, j - 1, k - 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i + 1, j - 1, k))
        this.worldObj.setBlock(i + 1, j - 1, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i - 1, j - 1, k))
        this.worldObj.setBlock(i - 1, j - 1, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j + 2, k))
        this.worldObj.setBlock(i, j + 2, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j + 2, k + 1))
        this.worldObj.setBlock(i, j + 2, k + 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j + 2, k - 1))
        this.worldObj.setBlock(i, j + 2, k - 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i + 1, j + 2, k))
        this.worldObj.setBlock(i + 1, j + 2, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i - 1, j + 2, k))
        this.worldObj.setBlock(i - 1, j + 2, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j - 2, k))
        this.worldObj.setBlock(i, j - 2, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j - 2, k + 1))
        this.worldObj.setBlock(i, j - 2, k + 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j - 2, k - 1))
        this.worldObj.setBlock(i, j - 2, k - 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i + 1, j - 2, k))
        this.worldObj.setBlock(i + 1, j - 2, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i - 1, j - 2, k))
        this.worldObj.setBlock(i - 1, j - 2, k, (Block)Blocks.fire); 
      this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, false);
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

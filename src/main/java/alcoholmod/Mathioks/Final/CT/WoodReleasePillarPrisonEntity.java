package alcoholmod.Mathioks.Final.CT;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class WoodReleasePillarPrisonEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 1;
  
  private int count = 0;
  
  private boolean start = false;
  
  int i = 0;
  
  int j = 0;
  
  int k = 0;
  
  public EntityLivingBase hit;
  
  private int ticksInGround;
  
  public WoodReleasePillarPrisonEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.8D;
    this.motionY *= 0.8D;
    this.motionZ *= 0.8D;
    setSize(0.5F, 0.5F);
  }
  
  public WoodReleasePillarPrisonEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.8D;
    this.motionY *= 0.8D;
    this.motionZ *= 0.8D;
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
      if (this.ticksExisted >= 300 && !this.start)
        setDead(); 
      if (this.start) {
        this.count++;
        if (!(getThrower()).worldObj.isRemote)
          for (int o = 0; o < 40; o++) {
            if (this.count == 1) {
              if (this.worldObj.isAirBlock(this.i + 1, this.j - 1, this.k + 1))
                this.worldObj.setBlock(this.i + 1, this.j - 1, this.k + 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i + 1, this.j - 1, this.k))
                this.worldObj.setBlock(this.i + 1, this.j - 1, this.k, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i + 1, this.j - 1, this.k - 1))
                this.worldObj.setBlock(this.i + 1, this.j - 1, this.k - 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i, this.j - 1, this.k + 1))
                this.worldObj.setBlock(this.i, this.j - 1, this.k + 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i, this.j - 1, this.k))
                this.worldObj.setBlock(this.i, this.j - 1, this.k, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i, this.j - 1, this.k - 1))
                this.worldObj.setBlock(this.i, this.j - 1, this.k - 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i - 1, this.j - 1, this.k + 1))
                this.worldObj.setBlock(this.i - 1, this.j - 1, this.k + 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i - 1, this.j - 1, this.k))
                this.worldObj.setBlock(this.i - 1, this.j - 1, this.k, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i - 1, this.j - 1, this.k - 1))
                this.worldObj.setBlock(this.i - 1, this.j - 1, this.k - 1, Blocks.log); 
            } 
            if (this.count == 10) {
              if (this.worldObj.isAirBlock(this.i + 1, this.j, this.k + 1))
                this.worldObj.setBlock(this.i + 1, this.j, this.k + 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i + 1, this.j, this.k))
                this.worldObj.setBlock(this.i + 1, this.j, this.k, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i + 1, this.j, this.k - 1))
                this.worldObj.setBlock(this.i + 1, this.j, this.k - 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i, this.j, this.k + 1))
                this.worldObj.setBlock(this.i, this.j, this.k + 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i, this.j, this.k - 1))
                this.worldObj.setBlock(this.i, this.j, this.k - 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i - 1, this.j, this.k + 1))
                this.worldObj.setBlock(this.i - 1, this.j, this.k + 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i - 1, this.j, this.k))
                this.worldObj.setBlock(this.i - 1, this.j, this.k, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i - 1, this.j, this.k - 1))
                this.worldObj.setBlock(this.i - 1, this.j, this.k - 1, Blocks.log); 
            } 
            if (this.count == 20) {
              if (this.worldObj.isAirBlock(this.i + 1, this.j + 1, this.k + 1))
                this.worldObj.setBlock(this.i + 1, this.j + 1, this.k + 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i + 1, this.j + 1, this.k))
                this.worldObj.setBlock(this.i + 1, this.j + 1, this.k, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i + 1, this.j + 1, this.k - 1))
                this.worldObj.setBlock(this.i + 1, this.j + 1, this.k - 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i, this.j + 1, this.k + 1))
                this.worldObj.setBlock(this.i, this.j + 1, this.k + 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i, this.j + 1, this.k - 1))
                this.worldObj.setBlock(this.i, this.j + 1, this.k - 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i - 1, this.j + 1, this.k + 1))
                this.worldObj.setBlock(this.i - 1, this.j + 1, this.k + 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i - 1, this.j + 1, this.k))
                this.worldObj.setBlock(this.i - 1, this.j + 1, this.k, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i - 1, this.j + 1, this.k - 1))
                this.worldObj.setBlock(this.i - 1, this.j + 1, this.k - 1, Blocks.log); 
            } 
            if (this.count == 30) {
              if (this.worldObj.isAirBlock(this.i + 1, this.j + 2, this.k + 1))
                this.worldObj.setBlock(this.i + 1, this.j + 2, this.k + 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i + 1, this.j + 2, this.k))
                this.worldObj.setBlock(this.i + 1, this.j + 2, this.k, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i + 1, this.j + 2, this.k - 1))
                this.worldObj.setBlock(this.i + 1, this.j + 2, this.k - 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i, this.j + 2, this.k + 1))
                this.worldObj.setBlock(this.i, this.j + 2, this.k + 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i, this.j + 2, this.k))
                this.worldObj.setBlock(this.i, this.j + 2, this.k, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i, this.j + 2, this.k - 1))
                this.worldObj.setBlock(this.i, this.j + 2, this.k - 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i - 1, this.j + 2, this.k + 1))
                this.worldObj.setBlock(this.i - 1, this.j + 2, this.k + 1, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i - 1, this.j + 2, this.k))
                this.worldObj.setBlock(this.i - 1, this.j + 2, this.k, Blocks.log); 
              if (this.worldObj.isAirBlock(this.i - 1, this.j + 2, this.k - 1))
                this.worldObj.setBlock(this.i - 1, this.j + 2, this.k - 1, Blocks.log); 
            } 
            if (this.count >= 70)
              setDead(); 
          }  
      } 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      if (par1MovingObjectPosition.entityHit == getThrower());
      if (!this.start) {
        this.hit = (EntityLivingBase)par1MovingObjectPosition.entityHit;
        this.i = (int)par1MovingObjectPosition.entityHit.posX;
        this.j = (int)par1MovingObjectPosition.entityHit.posY;
        this.k = (int)par1MovingObjectPosition.entityHit.posZ;
        this.start = true;
      } 
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

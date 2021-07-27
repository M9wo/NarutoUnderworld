package alcoholmod.Mathioks.Entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityWaterPrisonJutsu extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private boolean Water;
  
  private int ticksInGround;
  
  public EntityWaterPrisonJutsu(World Par1World) {
    super(Par1World);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public EntityWaterPrisonJutsu(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public EntityWaterPrisonJutsu(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public void onUpdate() {
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    super.onUpdate();
    this.posX += this.motionX;
    this.posY += this.motionY;
    this.posZ += this.motionZ;
    float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
    this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);
    float f3 = 3.25F;
    for (int i = 0; i < 24; i++)
      this.worldObj.spawnParticle("splash", this.posX - this.motionX * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.posY - this.motionY * f3 - 0.5D, this.posZ - this.motionZ * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.motionX, this.motionY, this.motionZ); 
  }
  
  protected float getGravityVelocity() {
    return 1.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (Par1MovingObjectPosition.entityHit != null && Par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      int i = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posX);
      int j = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posY);
      int k = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posZ);
      if (this.worldObj.isAirBlock(i + 1, j + 2, k + 1))
        this.worldObj.setBlock(i + 1, j + 2, k + 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i + 1, j + 2, k))
        this.worldObj.setBlock(i + 1, j + 2, k, Blocks.ice); 
      if (this.worldObj.isAirBlock(i + 1, j + 2, k - 1))
        this.worldObj.setBlock(i + 1, j + 2, k - 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i, j + 2, k + 1))
        this.worldObj.setBlock(i, j + 2, k + 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i, j + 2, k))
        this.worldObj.setBlock(i, j + 2, k, Blocks.ice); 
      if (this.worldObj.isAirBlock(i, j + 2, k - 1))
        this.worldObj.setBlock(i, j + 2, k - 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i - 1, j + 2, k + 1))
        this.worldObj.setBlock(i - 1, j + 2, k + 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i - 1, j + 2, k))
        this.worldObj.setBlock(i - 1, j + 2, k, Blocks.ice); 
      if (this.worldObj.isAirBlock(i - 1, j + 2, k - 1))
        this.worldObj.setBlock(i - 1, j + 2, k - 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i + 1, j + 1, k + 1))
        this.worldObj.setBlock(i + 1, j + 1, k + 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i + 1, j + 1, k))
        this.worldObj.setBlock(i + 1, j + 1, k, Blocks.ice); 
      if (this.worldObj.isAirBlock(i + 1, j + 1, k - 1))
        this.worldObj.setBlock(i + 1, j + 1, k - 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i, j + 1, k + 1))
        this.worldObj.setBlock(i, j + 1, k + 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i, j + 1, k))
        this.worldObj.setBlock(i, j + 1, k, Blocks.water); 
      if (this.worldObj.isAirBlock(i, j + 1, k - 1))
        this.worldObj.setBlock(i, j + 1, k - 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i - 1, j + 1, k + 1))
        this.worldObj.setBlock(i - 1, j + 1, k + 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i - 1, j + 1, k))
        this.worldObj.setBlock(i - 1, j + 1, k, Blocks.ice); 
      if (this.worldObj.isAirBlock(i - 1, j + 1, k - 1))
        this.worldObj.setBlock(i - 1, j + 1, k - 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i + 1, j - 1, k + 1))
        this.worldObj.setBlock(i + 1, j - 1, k + 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i + 1, j - 1, k))
        this.worldObj.setBlock(i + 1, j - 1, k, Blocks.ice); 
      if (this.worldObj.isAirBlock(i + 1, j - 1, k - 1))
        this.worldObj.setBlock(i + 1, j - 1, k - 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i, j - 1, k + 1))
        this.worldObj.setBlock(i, j - 1, k + 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i, j - 1, k))
        this.worldObj.setBlock(i, j - 1, k, Blocks.ice); 
      if (this.worldObj.isAirBlock(i, j - 1, k - 1))
        this.worldObj.setBlock(i, j - 1, k - 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i - 1, j - 1, k + 1))
        this.worldObj.setBlock(i - 1, j - 1, k + 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i - 1, j - 1, k))
        this.worldObj.setBlock(i - 1, j - 1, k, Blocks.ice); 
      if (this.worldObj.isAirBlock(i - 1, j - 1, k - 1))
        this.worldObj.setBlock(i - 1, j - 1, k - 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i + 1, j, k + 1))
        this.worldObj.setBlock(i + 1, j, k + 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i + 1, j, k))
        this.worldObj.setBlock(i + 1, j, k, Blocks.ice); 
      if (this.worldObj.isAirBlock(i + 1, j, k - 1))
        this.worldObj.setBlock(i + 1, j, k - 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i, j, k + 1))
        this.worldObj.setBlock(i, j, k + 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i, j, k))
        this.worldObj.setBlock(i, j, k, Blocks.water); 
      if (this.worldObj.isAirBlock(i, j, k - 1))
        this.worldObj.setBlock(i, j, k - 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i - 1, j, k + 1))
        this.worldObj.setBlock(i - 1, j, k + 1, Blocks.ice); 
      if (this.worldObj.isAirBlock(i - 1, j, k))
        this.worldObj.setBlock(i - 1, j, k, Blocks.ice); 
      if (this.worldObj.isAirBlock(i - 1, j, k - 1))
        this.worldObj.setBlock(i - 1, j, k - 1, Blocks.ice); 
    } 
  }
}

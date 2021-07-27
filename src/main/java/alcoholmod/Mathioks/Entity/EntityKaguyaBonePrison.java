package alcoholmod.Mathioks.Entity;

import alcoholmod.Mathioks.block.Blockss;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityKaguyaBonePrison extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private int ticksInGround;
  
  public EntityKaguyaBonePrison(World Par1World) {
    super(Par1World);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityKaguyaBonePrison(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityKaguyaBonePrison(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (Par1MovingObjectPosition.entityHit != null && Par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      byte BonePrisonDamage = 8;
      Par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), BonePrisonDamage);
      int j = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posX);
      int k = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posY);
      k = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posZ);
      if (this.worldObj.isAirBlock(j + 1, k + 4, k - 1))
        this.worldObj.setBlock(j + 1, k + 4, k - 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j - 3, k + 4, k - 1))
        this.worldObj.setBlock(j - 3, k + 4, k - 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j - 1, k + 4, k + 1))
        this.worldObj.setBlock(j - 1, k + 4, k + 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j - 1, k + 4, k - 3))
        this.worldObj.setBlock(j - 1, k + 4, k - 3, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j + 1, k + 3, k - 1))
        this.worldObj.setBlock(j + 1, k + 3, k - 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j - 3, k + 3, k - 1))
        this.worldObj.setBlock(j - 3, k + 3, k - 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j - 1, k + 3, k + 1))
        this.worldObj.setBlock(j - 1, k + 3, k + 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j - 1, k + 3, k - 3))
        this.worldObj.setBlock(j - 1, k + 3, k - 3, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j + 1, k + 2, k - 1))
        this.worldObj.setBlock(j + 1, k + 2, k - 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j - 3, k + 2, k - 1))
        this.worldObj.setBlock(j - 3, k + 2, k - 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j - 1, k + 2, k + 1))
        this.worldObj.setBlock(j - 1, k + 2, k + 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j - 1, k + 2, k - 3))
        this.worldObj.setBlock(j - 1, k + 2, k - 3, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j + 1, k + 1, k - 1))
        this.worldObj.setBlock(j + 1, k + 1, k - 1, (Block)Blockss.blockBoneDown); 
      if (this.worldObj.isAirBlock(j - 3, k + 1, k - 1))
        this.worldObj.setBlock(j - 3, k + 1, k - 1, (Block)Blockss.blockBoneDown); 
      if (this.worldObj.isAirBlock(j - 1, k + 1, k + 1))
        this.worldObj.setBlock(j - 1, k + 1, k + 1, (Block)Blockss.blockBoneDown); 
      if (this.worldObj.isAirBlock(j - 1, k + 1, k - 3))
        this.worldObj.setBlock(j - 1, k + 1, k - 3, (Block)Blockss.blockBoneDown); 
      this.worldObj.setBlock(j + 1, k, k - 1, (Block)Blockss.blockBoneLowest);
      this.worldObj.setBlock(j - 3, k, k - 1, (Block)Blockss.blockBoneLowest);
      this.worldObj.setBlock(j - 1, k, k + 1, (Block)Blockss.blockBoneLowest);
      this.worldObj.setBlock(j - 1, k, k - 3, (Block)Blockss.blockBoneLowest);
      setDead();
    } 
    if (!this.worldObj.isRemote) {
      int i = Par1MovingObjectPosition.blockX;
      int j = Par1MovingObjectPosition.blockY;
      int k = Par1MovingObjectPosition.blockZ;
      if (this.worldObj.isAirBlock(i + 1, j + 4, k - 1))
        this.worldObj.setBlock(i + 1, j + 4, k - 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i - 3, j + 4, k - 1))
        this.worldObj.setBlock(i - 3, j + 4, k - 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i - 1, j + 4, k + 1))
        this.worldObj.setBlock(i - 1, j + 4, k + 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i - 1, j + 4, k - 3))
        this.worldObj.setBlock(i - 1, j + 4, k - 3, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i + 1, j + 3, k - 1))
        this.worldObj.setBlock(i + 1, j + 3, k - 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i - 3, j + 3, k - 1))
        this.worldObj.setBlock(i - 3, j + 3, k - 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i - 1, j + 3, k + 1))
        this.worldObj.setBlock(i - 1, j + 3, k + 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i - 1, j + 3, k - 3))
        this.worldObj.setBlock(i - 1, j + 3, k - 3, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i + 1, j + 2, k - 1))
        this.worldObj.setBlock(i + 1, j + 2, k - 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i - 3, j + 2, k - 1))
        this.worldObj.setBlock(i - 3, j + 2, k - 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i - 1, j + 2, k + 1))
        this.worldObj.setBlock(i - 1, j + 2, k + 1, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i - 1, j + 2, k - 3))
        this.worldObj.setBlock(i - 1, j + 2, k - 3, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i + 1, j + 1, k - 1))
        this.worldObj.setBlock(i + 1, j + 1, k - 1, (Block)Blockss.blockBoneDown); 
      if (this.worldObj.isAirBlock(i - 3, j + 1, k - 1))
        this.worldObj.setBlock(i - 3, j + 1, k - 1, (Block)Blockss.blockBoneDown); 
      if (this.worldObj.isAirBlock(i - 1, j + 1, k + 1))
        this.worldObj.setBlock(i - 1, j + 1, k + 1, (Block)Blockss.blockBoneDown); 
      if (this.worldObj.isAirBlock(i - 1, j + 1, k - 3))
        this.worldObj.setBlock(i - 1, j + 1, k - 3, (Block)Blockss.blockBoneDown); 
      this.worldObj.setBlock(i + 1, j, k - 1, (Block)Blockss.blockBoneLowest);
      this.worldObj.setBlock(i - 3, j, k - 1, (Block)Blockss.blockBoneLowest);
      this.worldObj.setBlock(i - 1, j, k + 1, (Block)Blockss.blockBoneLowest);
      this.worldObj.setBlock(i - 1, j, k - 3, (Block)Blockss.blockBoneLowest);
      setDead();
    } 
  }
}

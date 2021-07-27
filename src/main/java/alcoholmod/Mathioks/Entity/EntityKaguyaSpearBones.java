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

public class EntityKaguyaSpearBones extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private int ticksInGround;
  
  public EntityKaguyaSpearBones(World Par1World) {
    super(Par1World);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityKaguyaSpearBones(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityKaguyaSpearBones(World Par6World, double Par7double, double Par8double, double Par9double) {
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
      byte BonePrisonDamage = 10;
      Par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), BonePrisonDamage);
      int j = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posX);
      int k = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posY);
      k = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posZ);
      if (this.worldObj.isAirBlock(j, k + 7, k))
        this.worldObj.setBlock(j, k + 7, k, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j, k + 6, k))
        this.worldObj.setBlock(j, k + 6, k, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j, k + 5, k))
        this.worldObj.setBlock(j, k + 5, k, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j, k + 4, k))
        this.worldObj.setBlock(j, k + 4, k, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j, k + 3, k))
        this.worldObj.setBlock(j, k + 3, k, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j, k + 2, k))
        this.worldObj.setBlock(j, k + 2, k, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(j, k + 1, k))
        this.worldObj.setBlock(j, k + 1, k, (Block)Blockss.blockBoneTop); 
      setDead();
    } 
    if (!this.worldObj.isRemote) {
      int i = Par1MovingObjectPosition.blockX;
      int j = Par1MovingObjectPosition.blockY;
      int k = Par1MovingObjectPosition.blockZ;
      if (this.worldObj.isAirBlock(i, j + 7, k))
        this.worldObj.setBlock(i, j + 7, k, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i, j + 6, k))
        this.worldObj.setBlock(i, j + 6, k, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i, j + 5, k))
        this.worldObj.setBlock(i, j + 5, k, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i, j + 4, k))
        this.worldObj.setBlock(i, j + 4, k, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i, j + 3, k))
        this.worldObj.setBlock(i, j + 3, k, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i, j + 2, k))
        this.worldObj.setBlock(i, j + 2, k, (Block)Blockss.blockBoneTop); 
      if (this.worldObj.isAirBlock(i, j + 1, k))
        this.worldObj.setBlock(i, j + 1, k, (Block)Blockss.blockBoneTop); 
      setDead();
    } 
  }
}

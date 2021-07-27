package alcoholmod.Mathioks.Entity;

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

public class EntityAmaterasu extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private int ticksInGround;
  
  public EntityAmaterasu(World Par1World) {
    super(Par1World);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityAmaterasu(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityAmaterasu(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      if (Par1MovingObjectPosition.entityHit != null && Par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        byte amaterasuDamage = 15;
        Par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), amaterasuDamage);
        Par1MovingObjectPosition.entityHit.setFire(10000000);
        int m = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posX);
        int n = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posY);
        int i1 = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posZ);
        int p_77648_7_ = MathHelper.floor_double(Par1MovingObjectPosition.sideHit);
        if (p_77648_7_ == 0)
          n--; 
        if (p_77648_7_ == 1)
          n++; 
        if (p_77648_7_ == 2)
          i1--; 
        if (p_77648_7_ == 3)
          i1++; 
        if (p_77648_7_ == 4)
          m--; 
        if (p_77648_7_ == 5)
          m++; 
        if (this.worldObj.isAirBlock(m, n, i1))
          this.worldObj.setBlock(m, n, i1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m, n - 1, i1))
          this.worldObj.setBlock(m, n - 1, i1, (Block)Blockss.blockAmaterasu); 
        if (this.worldObj.isAirBlock(m, n + 1, i1))
          this.worldObj.setBlock(m, n + 1, i1, (Block)Blockss.blockAmaterasu); 
      } 
      int k = Par1MovingObjectPosition.blockX;
      int i = Par1MovingObjectPosition.blockY;
      int j = Par1MovingObjectPosition.blockZ;
      if (this.worldObj.getBlock(k, i + 1, j) == Blocks.air)
        this.worldObj.setBlock(k, i + 1, j, (Block)Blockss.blockAmaterasu); 
      setDead();
    } 
  }
}

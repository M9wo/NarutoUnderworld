package alcoholmod.Mathioks.Entity;

import alcoholmod.Mathioks.block.Blockss;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityCrystalReleaseJutsu extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private boolean Water;
  
  private int counter = 0;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private boolean hit = false;
  
  private int ticksInGround;
  
  private int deleter = 0;
  
  public EntityCrystalReleaseJutsu(World Par1World) {
    super(Par1World);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public EntityCrystalReleaseJutsu(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public EntityCrystalReleaseJutsu(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public void onUpdate() {
    if (getEntityData() != null && 
      this.hit) {
      this.deleter++;
      if (this.deleter == 23) {
        deleter(this);
        this.deleter = 0;
      } 
    } 
  }
  
  protected float getGravityVelocity() {
    return 0.1F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (Par1MovingObjectPosition.entityHit != null && Par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      this.i = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posX);
      this.j = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posY);
      this.k = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posZ);
      this.hit = true;
    } 
  }
  
  public void deleter(EntityCrystalReleaseJutsu cf) {
    for (int i2 = 2; i2 > -2; i2--) {
      for (int j2 = 2; j2 > -2; j2--) {
        for (int k2 = 2; k2 > -2; k2--) {
          Block block = cf.worldObj.getBlock(this.i + i2, this.j + j2, this.k + k2);
          if (block == Blockss.crystalBlockLowest || block == Blockss.crystalTopBlock || block == Blockss.crystalBlockDown)
            cf.worldObj.setBlockToAir(this.i + i2, this.j + j2, this.k + k2); 
        } 
      } 
    } 
  }
}

package alcoholmod.Mathioks.Final.CT;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class IceReleaseIcePrison extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 1;
  
  private int count = 0;
  
  private boolean start = false;
  
  public EntityLivingBase hit;
  
  public int[][] blockPos = new int[40][3];
  
  private int ticksInGround;
  
  public IceReleaseIcePrison(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    setSize(1.0F, 1.0F);
  }
  
  public IceReleaseIcePrison(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
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
      if (this.ticksExisted >= 120 && !this.start)
        setDead(); 
      if (this.ticksExisted >= 120 && this.start)
        setDead(); 
      if (this.start) {
        this.count++;
        if (!(getThrower()).worldObj.isRemote)
          for (int i = 0; i < 40; i++) {
            if (this.count >= 6)
              setDead(); 
            if (this.count <= 1) {
              int i0 = MathHelper.floor_double(this.hit.posX);
              int i1 = MathHelper.floor_double(this.hit.posY);
              int i2;
              for (i2 = MathHelper.floor_double(this.hit.posZ); (getThrower()).worldObj.isAirBlock(i0, i1, i2); i1--);
              this.blockPos[i][0] = i0;
              this.blockPos[i][1] = i1;
              this.blockPos[i][2] = i2;
            } 
            if (this.count >= 2) {
              int i0 = this.blockPos[i][0];
              int i1 = this.blockPos[i][1];
              int i2 = this.blockPos[i][2];
              switch ((getThrower()).worldObj.rand.nextInt(13)) {
                case 0:
                  i1--;
                  break;
                case 1:
                  i1--;
                  break;
                case 2:
                  i0++;
                  break;
                case 3:
                  i1++;
                  break;
                case 4:
                  i0--;
                  break;
                case 5:
                  i1--;
                  break;
                case 6:
                  i2++;
                  break;
                case 7:
                  i1++;
                  break;
                case 8:
                  i2--;
                  break;
                case 9:
                  i1--;
                  break;
                case 10:
                  i1++;
                  break;
                case 11:
                  i1++;
                  break;
                case 12:
                  i1++;
                  break;
              } 
              this.blockPos[i][0] = i0;
              this.blockPos[i][1] = i1;
              this.blockPos[i][2] = i2;
            } 
            int var10001 = this.blockPos[i][0];
            int var10002 = this.blockPos[i][1];
            int var10003 = this.blockPos[i][2];
            (getThrower()).worldObj.setBlock(var10001, var10002, var10003, Blocks.packed_ice, 0, 2);
            var10001 = this.blockPos[i][0] + 1;
            var10002 = this.blockPos[i][1];
            var10003 = this.blockPos[i][2];
            (getThrower()).worldObj.setBlock(var10001, var10002, var10003, Blocks.packed_ice, 0, 2);
            var10001 = this.blockPos[i][0];
            var10002 = this.blockPos[i][1];
            var10003 = this.blockPos[i][2];
            (getThrower()).worldObj.setBlock(var10001, var10002, var10003 + 1, Blocks.packed_ice, 0, 2);
            var10001 = this.blockPos[i][0] + 1;
            var10002 = this.blockPos[i][1];
            var10003 = this.blockPos[i][2];
            (getThrower()).worldObj.setBlock(var10001, var10002, var10003 + 1, Blocks.packed_ice, 0, 2);
            if ((getThrower()).worldObj.rand.nextInt(7) == 0)
              for (int i0 = 0; i0 < 6; i0++) {
                for (int i1 = 0; i1 < 6; i1++) {
                  for (int i2 = 0; i2 < 6; i2++) {
                    if ((getThrower()).worldObj.rand.nextBoolean()) {
                      var10001 = this.blockPos[i][0] - 2 + i0;
                      var10002 = this.blockPos[i][1] - 2 + i1;
                      var10003 = this.blockPos[i][2];
                      if ((getThrower()).worldObj.isAirBlock(var10001, var10002, var10003 - 2 + i2)) {
                        var10001 = this.blockPos[i][0] - 2 + i0;
                        var10002 = this.blockPos[i][1] - 2 + i1;
                        var10003 = this.blockPos[i][2];
                        (getThrower()).worldObj.setBlock(var10001, var10002, var10003 - 2 + i2, Blocks.ice, 0, 2);
                      } 
                    } 
                  } 
                } 
              }  
          }  
      } 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 2.0F);
      if (par1MovingObjectPosition.entityHit == getThrower());
      this.start = true;
      this.hit = (EntityLivingBase)par1MovingObjectPosition.entityHit;
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

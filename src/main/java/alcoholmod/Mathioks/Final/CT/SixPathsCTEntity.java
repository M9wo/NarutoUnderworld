package alcoholmod.Mathioks.Final.CT;

import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class SixPathsCTEntity extends EntityThrowable {
  private int lifetime;
  
  private int size = 1;
  
  public int dis = 105;
  
  private int counter = 0;
  
  private EntityLivingBase jutsusha;
  
  private boolean canFly;
  
  private Object EntityCT;
  
  public SixPathsCTEntity(World par1World) {
    super(par1World);
  }
  
  public SixPathsCTEntity(World par1World, EntityLivingBase par2Entity, double par3, double par4, double par5) {
    super(par1World);
    this.jutsusha = par2Entity;
    this.lifetime = 0;
    this.canFly = true;
    setSize(0.5F, 0.5F);
    setPosition(par3, par4, par5);
    this.yOffset = this.height / 2.0F;
    this.motionX = 0.0D;
    this.motionY = 0.0D;
    this.motionZ = 0.0D;
    this.prevPosX = par3;
    this.prevPosY = par4;
    this.prevPosZ = par5;
  }
  
  protected void entityInit() {}
  
  public void readEntityFromNBT(NBTTagCompound nbttagcompound) {
    this.lifetime = nbttagcompound.getInteger("LifeTime");
  }
  
  public void writeEntityToNBT(NBTTagCompound nbttagcompound) {
    nbttagcompound.setInteger("LifeTime", this.lifetime);
  }
  
  protected boolean canTriggerWalking() {
    return false;
  }
  
  public boolean canBeCollidedWith() {
    return !this.isDead;
  }
  
  public boolean canBePushed() {
    return true;
  }
  
  public void onUpdate() {
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    super.onUpdate();
    this.counter++;
    if (!this.worldObj.isRemote) {
      if (this.ticksExisted >= 350 && this.ticksExisted <= 2500)
        this.size += 2; 
      if (this.ticksExisted >= 2501 && this.ticksExisted <= 4200)
        this.size += 4; 
      if (this.ticksExisted >= 4201 && this.ticksExisted <= 6000)
        this.size += 7; 
    } 
    if ((!this.worldObj.isRemote && this.jutsusha == null) || this.ticksExisted >= 7000)
      setDead(); 
    if (this.canFly) {
      this.motionX += 0.003D * Math.sin(-this.jutsusha.rotationYaw / 180.0D * Math.PI);
      this.motionY += 0.013D;
      this.motionZ += 0.003D * Math.cos(-this.jutsusha.rotationYaw / 180.0D * Math.PI);
      moveEntity(this.motionX, this.motionY, this.motionZ);
      if (this.posY - this.jutsusha.posY >= this.dis - 10.0D)
        this.canFly = false; 
    } else {
      this.motionX = 0.0D;
      this.motionY = 0.0D;
      this.motionZ = 0.0D;
      List<Entity> list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, AxisAlignedBB.getBoundingBox(this.posX - this.dis, this.posY - this.dis, this.posZ - this.dis, this.posX + this.dis, this.posY + this.dis, this.posZ + this.dis));
      for (int k2 = 0; k2 < list.size(); k2++) {
        Entity entity = list.get(k2);
        if (!(entity instanceof net.minecraft.entity.player.EntityPlayer) && !(entity instanceof EntityCT) && !(entity instanceof SixPathsCTEntity) && !(entity instanceof RinneganUnivPullEntity)) {
          double d0 = entity.getDistance(this.posX, this.posY, this.posZ);
          if (d0 <= this.dis) {
            double d1 = this.posX - entity.posX;
            double dy = this.posY - entity.posY;
            double dz = this.posZ - entity.posZ;
            entity.motionX += d1 * 0.175D / d0;
            entity.motionY += dy * 0.175D / d0;
            entity.motionZ += dz * 0.175D / d0;
          } 
          double r = Math.cbrt(this.size);
          if (entity.getDistance(this.posX, this.posY, this.posZ) <= r * 2.3D && entity instanceof net.minecraft.entity.item.EntityFallingBlock) {
            if (!this.worldObj.isRemote || this.ticksExisted >= 7000)
              entity.setDead(); 
            this.size++;
          } 
        } 
      } 
      if (this.size > 0) {
        double r = Math.cbrt(this.size) * 0.6D;
        double d0 = Math.cbrt(this.size) * 6.0D;
        r = Math.cbrt(this.size) * 5.0D;
        double dy = Math.cbrt(this.size) * 4.0D;
        double dz = Math.cbrt(this.size) * 3.0D;
        double r6 = Math.cbrt(this.size) * 2.0D;
        double r7 = Math.cbrt(this.size) * 1.0D;
        double r1 = Math.cbrt(this.size) * 0.1D;
        for (int i = 0; i <= MathHelper.floor_double(r); i++) {
          int ang0 = this.worldObj.rand.nextInt(360);
          int ang1 = this.worldObj.rand.nextInt(360);
          int x = MathHelper.floor_double(this.posX + r * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y = MathHelper.floor_double(this.posY + r * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z = MathHelper.floor_double(this.posZ + r * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          int x1 = MathHelper.floor_double(this.posX + 0.6D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y1 = MathHelper.floor_double(this.posY + 0.6D * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z1 = MathHelper.floor_double(this.posZ + 0.6D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          int x2 = MathHelper.floor_double(this.posX + 2.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.sin(ang1 / 180.0D * 15.707963267948966D));
          int y2 = MathHelper.floor_double(this.posY + 2.0D * Math.cos(ang0 / 180.0D * 15.707963267948966D));
          int z2 = MathHelper.floor_double(this.posZ + 2.0D * Math.sin(ang0 / 180.0D * 15.707963267948966D) * Math.cos(ang1 / 180.0D * 15.707963267948966D));
          if (!this.worldObj.isRemote) {
            if (this.ticksExisted <= 500)
              this.worldObj.setBlock(x, y, z, Blocks.bedrock, 0, 2); 
            if (this.ticksExisted >= 501)
              this.worldObj.setBlock(x, y, z, Blocks.stone, 0, 2); 
            this.worldObj.setBlock(x1, y1, z1, Blocks.bedrock, 0, 2);
            this.worldObj.setBlock(x2, y2, z2, Blocks.bedrock, 0, 2);
          } 
        } 
      } 
    } 
  }
  
  protected void onImpact(MovingObjectPosition p_70184_1_) {}
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
}

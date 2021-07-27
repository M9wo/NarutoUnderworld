package alcoholmod.Mathioks.Entity;

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

public class EntitySharinganKagutsuchiFlameControl extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private int ticksInGround;
  
  public EntitySharinganKagutsuchiFlameControl(World Par1World) {
    super(Par1World);
    this.motionX *= 0.1D;
    this.motionY *= 0.1D;
    this.motionZ *= 0.1D;
  }
  
  public EntitySharinganKagutsuchiFlameControl(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.1D;
    this.motionY *= 0.1D;
    this.motionZ *= 0.1D;
  }
  
  public EntitySharinganKagutsuchiFlameControl(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 0.1D;
    this.motionY *= 0.1D;
    this.motionZ *= 0.1D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 7.0D, this.posY - 7.0D, this.posZ - 7.0D, this.posX + 7.0D, this.posY + 7.0D, this.posZ + 7.0D));
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    super.onUpdate();
    this.posX += this.motionX;
    this.posY += this.motionY;
    this.posZ += this.motionZ;
    float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
    this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);
    float f3 = 5.25F;
    if (getThrower() == null) {
      setDead();
    } else if (getThrower().getUniqueID() == null) {
      setDead();
    } 
    int k2;
    for (k2 = 0; k2 < 10; k2++) {
      super.onUpdate();
      this.worldObj.spawnParticle("smoke", this.posX - this.motionX * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.posY + 0.3D - this.motionY * f3 - 0.5D, this.posZ - this.motionZ * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.motionX, this.motionY, this.motionZ);
    } 
    for (k2 = 0; k2 < list.size(); k2++) {
      if (!this.worldObj.isRemote && getThrower() != null && getThrower().getUniqueID() != null) {
        Entity entity = list.get(k2);
        String user = getThrower().getUniqueID().toString();
        if (entity instanceof net.minecraft.entity.EntityLiving) {
          double d0 = entity.getDistance(this.posX, this.posY, this.posZ);
          if (d0 <= 10.0D) {
            double dx = entity.posX - this.posX;
            double dy = entity.posY - this.posY;
            double dz = entity.posZ - this.posZ;
            this.motionX += dx * 0.075D / d0;
            this.motionY += dy * 0.075D / d0;
            this.motionZ += dz * 0.075D / d0;
          } 
        } 
        if (entity instanceof net.minecraft.entity.player.EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
          double d0 = entity.getDistance(this.posX, this.posY, this.posZ);
          if (d0 <= 10.0D) {
            double dx = entity.posX - this.posX;
            double dy = entity.posY - this.posY;
            double dz = entity.posZ - this.posZ;
            this.motionX += dx * 0.075D / d0;
            this.motionY += dy * 0.075D / d0;
            this.motionZ += dz * 0.075D / d0;
          } 
        } 
      } 
    } 
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && Par1MovingObjectPosition.entityHit != null && Par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      byte BonePrisonDamage = 5;
      Par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), BonePrisonDamage);
      int i = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posX);
      int j = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posY);
      int k = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posZ);
      int p_77648_7_ = MathHelper.floor_double(Par1MovingObjectPosition.sideHit);
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
      setDead();
    } 
  }
}

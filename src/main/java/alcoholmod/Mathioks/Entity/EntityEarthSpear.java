package alcoholmod.Mathioks.Entity;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.block.Blockss;
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

public class EntityEarthSpear extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private int ticksInGround;
  
  public EntityEarthSpear(World Par1World) {
    super(Par1World);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public EntityEarthSpear(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public EntityEarthSpear(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
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
    this.posX += this.motionX;
    this.posY += this.motionY;
    this.posZ += this.motionZ;
    float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
    this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);
    float f3 = 3.25F;
    for (int i = 0; i < 24; i++)
      this.worldObj.spawnParticle("crit", this.posX - this.motionX * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.posY - this.motionY * f3 - 0.5D, this.posZ - this.motionZ * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.motionX, this.motionY, this.motionZ); 
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (Par1MovingObjectPosition.entityHit != null) {
      float Damage = 5.0F;
      if (getThrower() instanceof EntityPlayer) {
        EntityPlayer player = (EntityPlayer)getThrower();
        ExtendedPlayer props = ExtendedPlayer.get(player);
        float DamagePlayer = (float)(Damage + Damage * 0.001D * props.getLevel());
        Par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), DamagePlayer);
      } else {
        Par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), Damage);
      } 
      int i = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posX);
      int j = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posY);
      int k = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posZ);
      if (this.worldObj.isAirBlock(i, j + 2, k))
        this.worldObj.setBlock(i, j + 2, k, (Block)Blockss.blockSandTop); 
      if (this.worldObj.isAirBlock(i, j + 1, k))
        this.worldObj.setBlock(i, j + 1, k, (Block)Blockss.blockSandDown); 
      if (this.worldObj.isAirBlock(i, j, k))
        this.worldObj.setBlock(i, j, k, (Block)Blocks.sand); 
      setDead();
    } 
    if (!this.worldObj.isRemote) {
      int i = Par1MovingObjectPosition.blockX;
      i = Par1MovingObjectPosition.blockY;
      int j = Par1MovingObjectPosition.blockZ;
      if (this.worldObj.isAirBlock(i, i + 3, j))
        this.worldObj.setBlock(i, i + 3, j, (Block)Blockss.blockSandTop); 
      if (this.worldObj.isAirBlock(i, i + 2, j))
        this.worldObj.setBlock(i, i + 2, j, (Block)Blockss.blockSandDown); 
      if (this.worldObj.isAirBlock(i, i + 1, j))
        this.worldObj.setBlock(i, i + 1, j, (Block)Blocks.sand); 
      setDead();
    } 
  }
}

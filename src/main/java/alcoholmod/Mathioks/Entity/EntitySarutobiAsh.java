package alcoholmod.Mathioks.Entity;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySarutobiAsh extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private boolean Water;
  
  int deathcounter;
  
  public int explosionRadius = 5;
  
  private EntityLivingBase thrower;
  
  private String throwerName;
  
  private int field_145788_c = -1;
  
  private int field_145786_d = -1;
  
  private int field_145787_e = -1;
  
  private Block field_145785_f;
  
  int deathcount = 0;
  
  private int ticksInGround;
  
  public EntitySarutobiAsh(World Par1World) {
    super(Par1World);
    this.motionX *= 0.03D;
    this.motionY *= 0.03D;
    this.motionZ *= 0.03D;
    setSize(0.25F, 0.25F);
    setSize(0.25F, 0.25F);
  }
  
  public EntitySarutobiAsh(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.03D;
    this.motionY *= 0.03D;
    this.motionZ *= 0.03D;
    setSize(0.25F, 0.25F);
    this.thrower = Par5EntityLivingBase;
  }
  
  public EntitySarutobiAsh(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 0.03D;
    this.motionY *= 0.03D;
    this.motionZ *= 0.03D;
    setSize(0.25F, 0.25F);
    setSize(0.25F, 0.25F);
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
    float f3 = 5.25F;
    int rand = this.worldObj.rand.nextInt(12);
    int i;
    for (i = 0; i < 10; i++) {
      super.onUpdate();
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY + 1.0D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY + 1.0D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + 1.0D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + 1.0D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
    } 
    for (i = 0; i < 4; i++) {
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY + 1.0D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + 1.0D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
    } 
    for (i = 0; i < 10; i++) {
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY + this.rand.nextGaussian() * 0.25D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY + 1.0D + this.rand.nextGaussian() * 0.25D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + this.rand.nextGaussian() * 0.25D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + 1.0D + this.rand.nextGaussian() * 0.25D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
    } 
    this.deathcounter++;
    if (this.deathcounter >= 500)
      setDead(); 
    if (this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY - this.yOffset), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY - 1.0D), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY - 1.0D), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY - 1.0D), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY - 1.0D), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY - 1.0D - this.yOffset), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY - 1.0D), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY - 1.0D), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY - 1.0D), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY - 1.0D), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY + 1.0D), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY + 1.0D), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY + 1.0D), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY + 1.0D), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY + 1.0D - this.yOffset), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY + 1.0D), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY + 1.0D), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY + 1.0D), MathHelper.floor_double(this.posZ)) == Blocks.fire || this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY + 1.0D), MathHelper.floor_double(this.posZ)) == Blocks.fire) {
      this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, 5.0F, true, false);
      this.deathcount++;
      if (this.deathcount == 40)
        setDead(); 
    } 
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 7.0D, this.posY - 7.0D, this.posZ - 7.0D, this.posX + 7.0D, this.posY + 7.0D, this.posZ + 7.0D));
    if (getThrower() != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = getThrower().getUniqueID().toString();
          if (entity instanceof net.minecraft.entity.EntityLiving);
          if (!(entity instanceof net.minecraft.entity.player.EntityPlayer) || entity.getUniqueID().toString().equals(user));
        } 
      }  
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      int i = par1MovingObjectPosition.blockX;
      int j = par1MovingObjectPosition.blockY;
      int k = par1MovingObjectPosition.blockZ;
    } 
  }
}

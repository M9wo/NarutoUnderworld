package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.ExtendedPlayer;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class GreatFireBallEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 3;
  
  private boolean hit;
  
  private boolean hit2 = false;
  
  private int ticksInGround;
  
  public GreatFireBallEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    setSize(1.0F, 1.0F);
  }
  
  public GreatFireBallEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.ticksExisted >= 150)
      setDead(); 
    if (isInWater())
      setDead(); 
    if (this.hit2) {
      this.motionX = 0.0D;
      this.motionY = 0.0D;
      this.motionZ = 0.0D;
    } 
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 3.0D, this.posY - 3.0D, this.posZ - 3.0D, this.posX + 1.0D, this.posY + 3.0D, this.posZ + 3.0D));
    if (getThrower() != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = getThrower().getUniqueID().toString();
          if (entity instanceof net.minecraft.entity.EntityLiving) {
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 3.0F);
            entity.setFire(20);
            int i = MathHelper.floor_double(entity.posX);
            int j = MathHelper.floor_double(entity.posY);
            int k = MathHelper.floor_double(entity.posZ);
          } 
          if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 3.0F);
            entity.setFire(20);
            int i = MathHelper.floor_double(entity.posX);
            int j = MathHelper.floor_double(entity.posY);
            int k = MathHelper.floor_double(entity.posZ);
          } 
        } 
      }  
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        float Damage = 3.0F;
        if (getThrower() instanceof EntityPlayer) {
          EntityPlayer player = (EntityPlayer)getThrower();
          ExtendedPlayer props = ExtendedPlayer.get(player);
          float DamagePlayer = (float)(Damage + Damage * 0.001D * props.getLevel());
          par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), DamagePlayer);
        } else {
          par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), Damage);
        } 
        par1MovingObjectPosition.entityHit.setFire(3);
        this.hit2 = true;
        int m = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posX);
        int n = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posY);
        int i1 = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posZ);
        if (i1 == 0)
          n--; 
        if (i1 == 1)
          n++; 
        if (i1 == 2)
          i1--; 
        if (i1 == 3)
          i1++; 
        if (i1 == 4)
          m--; 
        if (i1 == 5)
          m++; 
      } 
      int i = par1MovingObjectPosition.blockX;
      int j = par1MovingObjectPosition.blockY;
      int k = par1MovingObjectPosition.blockZ;
      int p_77648_7_ = par1MovingObjectPosition.sideHit;
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
        this.worldObj.setBlock(i, j, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j, k + 1))
        this.worldObj.setBlock(i, j, k + 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j, k - 1))
        this.worldObj.setBlock(i, j, k - 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i + 1, j, k))
        this.worldObj.setBlock(i + 1, j, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i - 1, j, k))
        this.worldObj.setBlock(i - 1, j, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j + 1, k))
        this.worldObj.setBlock(i, j + 1, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j + 1, k + 1))
        this.worldObj.setBlock(i, j + 1, k + 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j + 1, k - 1))
        this.worldObj.setBlock(i, j + 1, k - 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i + 1, j + 1, k))
        this.worldObj.setBlock(i + 1, j + 1, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i - 1, j + 1, k))
        this.worldObj.setBlock(i - 1, j + 1, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j - 1, k))
        this.worldObj.setBlock(i, j - 1, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j - 1, k + 1))
        this.worldObj.setBlock(i, j - 1, k + 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j - 1, k - 1))
        this.worldObj.setBlock(i, j - 1, k - 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i + 1, j - 1, k))
        this.worldObj.setBlock(i + 1, j - 1, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i - 1, j - 1, k))
        this.worldObj.setBlock(i - 1, j - 1, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j + 2, k))
        this.worldObj.setBlock(i, j + 2, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j + 2, k + 1))
        this.worldObj.setBlock(i, j + 2, k + 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j + 2, k - 1))
        this.worldObj.setBlock(i, j + 2, k - 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i + 1, j + 2, k))
        this.worldObj.setBlock(i + 1, j + 2, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i - 1, j + 2, k))
        this.worldObj.setBlock(i - 1, j + 2, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j - 2, k))
        this.worldObj.setBlock(i, j - 2, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j - 2, k + 1))
        this.worldObj.setBlock(i, j - 2, k + 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i, j - 2, k - 1))
        this.worldObj.setBlock(i, j - 2, k - 1, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i + 1, j - 2, k))
        this.worldObj.setBlock(i + 1, j - 2, k, (Block)Blocks.fire); 
      if (this.worldObj.isAirBlock(i - 1, j - 2, k))
        this.worldObj.setBlock(i - 1, j - 2, k, (Block)Blocks.fire); 
      this.hit2 = true;
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

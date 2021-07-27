package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.block.Blockss;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ToadOilEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 3;
  
  private boolean hit;
  
  private int ticksInGround;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int x;
  
  private int y;
  
  private int z;
  
  public ToadOilEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 1.2D;
    this.motionY *= 1.2D;
    this.motionZ *= 1.2D;
    setSize(1.0F, 1.0F);
  }
  
  public ToadOilEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.2D;
    this.motionY *= 1.2D;
    this.motionZ *= 1.2D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 3.0D, this.posY - 3.0D, this.posZ - 3.0D, this.posX + 1.0D, this.posY + 3.0D, this.posZ + 3.0D));
    if (getThrower() != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity1 = list.get(k2);
          if (entity1 instanceof net.minecraft.entity.EntityLiving) {
            this.i = MathHelper.floor_double(this.posX);
            this.j = MathHelper.floor_double(this.posY);
            this.k = MathHelper.floor_double(this.posZ);
          } 
        } 
      }  
    if (this.hit) {
      this.ticksInGround++;
      if (this.ticksInGround >= 100) {
        deleter(this);
        setDead();
      } 
    } 
    if (this.ticksExisted >= 600)
      setDead(); 
  }
  
  public void deleter(ToadOilEntity entity) {
    for (int i2 = 3; i2 > -3; i2--) {
      for (int j2 = 3; j2 > -3; j2--) {
        for (int k2 = 3; k2 > -3; k2--) {
          Block block = entity.worldObj.getBlock(this.x + i2, this.y + j2, this.z + k2);
          if (block == Blockss.oilBlock)
            entity.worldObj.setBlockToAir(this.x + i2, this.y + j2, this.z + k2); 
        } 
      } 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && !this.hit)
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase && par1MovingObjectPosition.entityHit != getThrower()) {
        par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 8.0F);
        ((EntityLivingBase)par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 300, -10));
        int i = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posX);
        int j = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posY);
        int k = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posZ);
        int p_77648_7_ = MathHelper.floor_double(par1MovingObjectPosition.sideHit);
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
        this.x = i;
        this.y = j;
        this.z = k;
        if (this.worldObj.isAirBlock(i, j, k))
          this.worldObj.setBlock(i, j, k, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i, j, k + 1))
          this.worldObj.setBlock(i, j, k + 1, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i, j, k - 1))
          this.worldObj.setBlock(i, j, k - 1, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i + 1, j, k))
          this.worldObj.setBlock(i + 1, j, k, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i - 1, j, k))
          this.worldObj.setBlock(i - 1, j, k, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i, j + 1, k))
          this.worldObj.setBlock(i, j + 1, k, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i, j + 1, k + 1))
          this.worldObj.setBlock(i, j + 1, k + 1, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i, j + 1, k - 1))
          this.worldObj.setBlock(i, j + 1, k - 1, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i + 1, j + 1, k))
          this.worldObj.setBlock(i + 1, j + 1, k, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i - 1, j + 1, k))
          this.worldObj.setBlock(i - 1, j + 1, k, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i, j - 1, k))
          this.worldObj.setBlock(i, j - 1, k, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i, j - 1, k + 1))
          this.worldObj.setBlock(i, j - 1, k + 1, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i, j - 1, k - 1))
          this.worldObj.setBlock(i, j - 1, k - 1, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i + 1, j - 1, k))
          this.worldObj.setBlock(i + 1, j - 1, k, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i - 1, j - 1, k))
          this.worldObj.setBlock(i - 1, j - 1, k, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i, j + 2, k))
          this.worldObj.setBlock(i, j + 2, k, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i, j + 2, k + 1))
          this.worldObj.setBlock(i, j + 2, k + 1, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i, j + 2, k - 1))
          this.worldObj.setBlock(i, j + 2, k - 1, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i + 1, j + 2, k))
          this.worldObj.setBlock(i + 1, j + 2, k, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i - 1, j + 2, k))
          this.worldObj.setBlock(i - 1, j + 2, k, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i, j - 2, k))
          this.worldObj.setBlock(i, j - 2, k, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i, j - 2, k + 1))
          this.worldObj.setBlock(i, j - 2, k + 1, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i, j - 2, k - 1))
          this.worldObj.setBlock(i, j - 2, k - 1, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i + 1, j - 2, k))
          this.worldObj.setBlock(i + 1, j - 2, k, (Block)Blockss.oilBlock); 
        if (this.worldObj.isAirBlock(i - 1, j - 2, k))
          this.worldObj.setBlock(i - 1, j - 2, k, (Block)Blockss.oilBlock); 
        this.hit = true;
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

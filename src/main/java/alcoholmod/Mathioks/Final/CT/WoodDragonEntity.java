package alcoholmod.Mathioks.Final.CT;

import java.util.List;
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

public class WoodDragonEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 2;
  
  private int explosionCounter;
  
  private int ticksInGround;
  
  public WoodDragonEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 1.5D;
    this.motionY *= 1.5D;
    this.motionZ *= 1.5D;
    float f = 0.4F;
    setSize(0.5F, 0.5F);
  }
  
  public WoodDragonEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.5D;
    this.motionY *= 1.5D;
    this.motionZ *= 1.5D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.ticksExisted >= 250)
      setDead(); 
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 13.0D, this.posY - 3.0D, this.posZ - 3.0D, this.posX + 1.0D, this.posY + 3.0D, this.posZ + 3.0D));
    if (getThrower() != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = getThrower().getUniqueID().toString();
          if (entity instanceof net.minecraft.entity.EntityLiving) {
            float var4 = 1.0F;
            int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * var4);
            int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * var4 + 1.62D - entity.yOffset);
            int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * var4);
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 18.0F);
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40, 10));
            entity.addVelocity((-MathHelper.sin(this.rotationYaw * 3.141593F / -180.0F) * j * 0.5F) / 12.0D, 0.1D, (MathHelper.cos(this.rotationYaw * 3.141593F / -180.0F) * j * 0.5F) / 12.0D);
            setDead();
          } 
          if (entity instanceof net.minecraft.entity.player.EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
            float var4 = 1.0F;
            int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * var4);
            int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * var4 + 1.62D - entity.yOffset);
            int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * var4);
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 18.0F);
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40, 10));
            entity.addVelocity((-MathHelper.sin(this.rotationYaw * 3.141593F / -180.0F) * j * 0.5F) / 12.0D, 0.1D, (MathHelper.cos(this.rotationYaw * 3.141593F / -180.0F) * j * 0.5F) / 12.0D);
            setDead();
          } 
        } 
      }  
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 18.0F);
        float var4 = 1.0F;
        int i = (int)(par1MovingObjectPosition.entityHit.prevPosX + (par1MovingObjectPosition.entityHit.posX - par1MovingObjectPosition.entityHit.prevPosX) * var4);
        int j = (int)(par1MovingObjectPosition.entityHit.prevPosY + (par1MovingObjectPosition.entityHit.posY - par1MovingObjectPosition.entityHit.prevPosY) * var4 + 1.62D - par1MovingObjectPosition.entityHit.yOffset);
        int k = (int)(par1MovingObjectPosition.entityHit.prevPosZ + (par1MovingObjectPosition.entityHit.posZ - par1MovingObjectPosition.entityHit.prevPosZ) * var4);
        ((EntityLivingBase)par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40, 10));
        par1MovingObjectPosition.entityHit.addVelocity((-MathHelper.sin(this.rotationYaw * 3.141593F / -180.0F) * j * 0.5F) / 12.0D, 0.1D, (MathHelper.cos(this.rotationYaw * 3.141593F / -180.0F) * j * 0.5F) / 12.0D);
        setDead();
      } 
      if (this.explosionCounter == 0) {
        this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, true);
        this.explosionCounter = 1;
      } 
      if (this.explosionCounter == 1) {
        this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, true);
        this.explosionCounter = 2;
      } 
      setDead();
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

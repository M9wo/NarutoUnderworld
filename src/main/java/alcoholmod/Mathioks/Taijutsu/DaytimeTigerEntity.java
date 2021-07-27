package alcoholmod.Mathioks.Taijutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class DaytimeTigerEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 10;
  
  private int explosionCounter;
  
  private int ticksInGround;
  
  public DaytimeTigerEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.4D;
    this.motionY *= 0.4D;
    this.motionZ *= 0.4D;
    float f = 0.4F;
    setSize(2.5F, 2.5F);
  }
  
  public DaytimeTigerEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.4D;
    this.motionY *= 0.4D;
    this.motionZ *= 0.4D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.ticksExisted >= 250)
      setDead(); 
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 3.0D, this.posY - 3.0D, this.posZ - 3.0D, this.posX + 1.0D, this.posY + 3.0D, this.posZ + 3.0D));
    if (getThrower() != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = getThrower().getUniqueID().toString();
          EntityPlayer player = (EntityPlayer)getThrower();
          ExtendedPlayer props = ExtendedPlayer.get(player);
          if (entity instanceof net.minecraft.entity.EntityLiving) {
            float var4 = 1.0F;
            int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * var4);
            int var10000 = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * var4 + 1.62D - entity.yOffset);
            int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * var4);
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), (float)(50.0D + props.getTaijutsu()));
            this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, true);
            setDead();
          } 
          if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
            float var4 = 1.0F;
            int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * var4);
            int var10000 = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * var4 + 1.62D - entity.yOffset);
            int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * var4);
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), (float)(50.0D + props.getTaijutsu()));
            this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, true);
            setDead();
          } 
        } 
      }  
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && getThrower() != null) {
      EntityPlayer player = (EntityPlayer)getThrower();
      if (ExtendedPlayer.get(player) != null) {
        ExtendedPlayer props = ExtendedPlayer.get(player);
        if (par1MovingObjectPosition.entityHit instanceof EntityLivingBase)
          par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), (float)(50.0D + props.getTaijutsu())); 
        this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, true);
        setDead();
      } 
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

package alcoholmod.Mathioks.Final.CT;

import cpw.mods.fml.common.eventhandler.Event;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class RinneganUnivPullEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  public String ownerOfThis;
  
  public int dis = 40;
  
  private int ticksInGround;
  
  public RinneganUnivPullEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.05D;
    this.motionY *= 0.05D;
    this.motionZ *= 0.05D;
    setSize(1.7125F, 1.7125F);
  }
  
  public RinneganUnivPullEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.05D;
    this.motionY *= 0.05D;
    this.motionZ *= 0.05D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.ticksExisted >= 300)
      setDead(); 
    float f3 = 5.25F;
    for (int j = 0; j < 36; j++)
      this.worldObj.spawnParticle("smoke", this.posX - this.motionX * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.posY + 0.3D - this.motionY * f3 - 0.5D, this.posZ - this.motionZ * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.motionX, this.motionY, this.motionZ); 
    List<Entity> list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, AxisAlignedBB.getBoundingBox(this.posX - this.dis, this.posY - this.dis, this.posZ - this.dis, this.posX + this.dis, this.posY + this.dis, this.posZ + this.dis));
    for (int k2 = 0; k2 < list.size(); k2++) {
      Entity entity = list.get(k2);
      if (!(entity instanceof EntityCT) && !(entity instanceof RinneganUnivPullEntity) && !(entity instanceof SixPathsCTEntity)) {
        if (entity instanceof net.minecraft.entity.EntityLiving) {
          double d0 = entity.getDistance(this.posX, this.posY, this.posZ);
          if (d0 <= this.dis) {
            double dx = this.posX - entity.posX;
            double dy = this.posY - entity.posY;
            double dz = this.posZ - entity.posZ;
            entity.motionX += dx * 0.675D / d0;
            entity.motionY += dy * 0.675D / d0;
            entity.motionZ += dz * 0.675D / d0;
            entity.fallDistance = 0.0F;
          } 
        } 
        if (entity instanceof net.minecraft.entity.player.EntityPlayer && getThrower() != null) {
          double d0 = entity.getDistance(this.posX, this.posY, this.posZ);
          if (!entity.getUniqueID().toString().equals(getThrower().getUniqueID().toString()))
            if (d0 <= this.dis) {
              EntityPlayerMP entityplayermp2 = (EntityPlayerMP)entity;
              if (entityplayermp2.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp2.worldObj == this.worldObj) {
                EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)entityplayermp2, this.posX, this.posY + 1.0D, this.posZ, 5.0F);
                if (!MinecraftForge.EVENT_BUS.post((Event)event)) {
                  if (entity.isRiding())
                    entity.mountEntity((Entity)null); 
                  EntityLivingBase hitentity = (EntityLivingBase)entity;
                  hitentity.setPositionAndUpdate(this.posX, this.posY, this.posZ);
                  hitentity.fallDistance = 0.0F;
                } 
              } 
            }  
        } 
      } 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      if (par1MovingObjectPosition.entityHit == null || par1MovingObjectPosition.entityHit instanceof net.minecraft.entity.EntityLiving);
      if (!this.worldObj.isRemote);
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

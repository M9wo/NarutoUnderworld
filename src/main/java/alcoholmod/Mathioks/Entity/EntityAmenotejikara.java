package alcoholmod.Mathioks.Entity;

import cpw.mods.fml.common.eventhandler.Event;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class EntityAmenotejikara extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private int ticksInGround;
  
  public EntityAmenotejikara(World Par1World) {
    super(Par1World);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityAmenotejikara(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityAmenotejikara(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
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
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 10.0D, this.posY - 10.0D, this.posZ - 1.0D, this.posX + 10.0D, this.posY + 10.0D, this.posZ + 10.0D));
    if (getThrower() != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = getThrower().getUniqueID().toString();
          if (!(entity instanceof EntityAmenotejikara)) {
            if (entity instanceof Entity) {
              int i = MathHelper.floor_double(entity.posX);
              int j = MathHelper.floor_double(entity.posY);
              int k = MathHelper.floor_double(entity.posZ);
              int i3 = MathHelper.floor_double((getThrower()).posX);
              int j3 = MathHelper.floor_double((getThrower()).posY);
              int k3 = MathHelper.floor_double((getThrower()).posZ);
              entity.setPosition(i3, j3, k3);
              if (getThrower() != null && getThrower() instanceof EntityPlayerMP) {
                EntityPlayerMP entityplayermp = (EntityPlayerMP)getThrower();
                if (entityplayermp.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp.worldObj == this.worldObj) {
                  EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)entityplayermp, i, (j + 1), k, 5.0F);
                  if (!MinecraftForge.EVENT_BUS.post((Event)event)) {
                    if (getThrower().isRiding())
                      getThrower().mountEntity((Entity)null); 
                    getThrower().setPositionAndUpdate(i, j, k);
                    (getThrower()).fallDistance = 0.0F;
                  } 
                } 
              } 
              setDead();
            } 
            if (entity instanceof net.minecraft.entity.player.EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
              int i = MathHelper.floor_double(entity.posX);
              int j = MathHelper.floor_double(entity.posY);
              int k = MathHelper.floor_double(entity.posZ);
              int i3 = MathHelper.floor_double((getThrower()).posX);
              int j3 = MathHelper.floor_double((getThrower()).posY);
              int k3 = MathHelper.floor_double((getThrower()).posZ);
              entity.setPosition(i3, j3, k3);
              if (getThrower() != null && getThrower() instanceof EntityPlayerMP) {
                EntityPlayerMP entityplayermp = (EntityPlayerMP)getThrower();
                if (entityplayermp.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp.worldObj == this.worldObj) {
                  EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)entityplayermp, i, (j + 1), k, 5.0F);
                  if (!MinecraftForge.EVENT_BUS.post((Event)event)) {
                    if (getThrower().isRiding())
                      getThrower().mountEntity((Entity)null); 
                    getThrower().setPositionAndUpdate(i, j, k);
                    (getThrower()).fallDistance = 0.0F;
                  } 
                } 
              } 
              setDead();
            } 
          } 
        } 
      }  
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && Par1MovingObjectPosition.entityHit != null) {
      int i = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posX);
      int j = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posY);
      int k = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posZ);
      float dp = Par1MovingObjectPosition.entityHit.rotationPitch;
      float dy = Par1MovingObjectPosition.entityHit.rotationYaw;
      int i2 = MathHelper.floor_double((getThrower()).posX);
      int j2 = MathHelper.floor_double((getThrower()).posY);
      int k2 = MathHelper.floor_double((getThrower()).posZ);
      float dp2 = (getThrower()).rotationPitch;
      float dy2 = (getThrower()).rotationYaw;
      if (Par1MovingObjectPosition.entityHit instanceof EntityPlayerMP && Par1MovingObjectPosition.entityHit != null) {
        EntityPlayerMP entityplayermp = (EntityPlayerMP)Par1MovingObjectPosition.entityHit;
        if (entityplayermp.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp.worldObj == this.worldObj) {
          EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)entityplayermp, i2, (j2 + 1), k2, 5.0F);
          if (!MinecraftForge.EVENT_BUS.post((Event)event)) {
            if (Par1MovingObjectPosition.entityHit.isRiding())
              Par1MovingObjectPosition.entityHit.mountEntity((Entity)null); 
            EntityLivingBase hitentity = (EntityLivingBase)Par1MovingObjectPosition.entityHit;
            hitentity.setPositionAndRotation(i2, j2, k2, dy2, dp2);
            hitentity.setPositionAndUpdate(i2, j2, k2);
            hitentity.fallDistance = 0.0F;
          } 
        } 
      } else if (!(Par1MovingObjectPosition.entityHit instanceof EntityPlayerMP)) {
        Par1MovingObjectPosition.entityHit.setPositionAndRotation(i2, j2, k2, dy2, dp2);
        Par1MovingObjectPosition.entityHit.setPosition(i2, j2, k2);
        Par1MovingObjectPosition.entityHit.fallDistance = 0.0F;
      } 
      if (getThrower() != null && getThrower() instanceof EntityPlayerMP) {
        EntityPlayerMP entityplayermp = (EntityPlayerMP)getThrower();
        if (entityplayermp.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp.worldObj == this.worldObj) {
          EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)entityplayermp, i, (j + 1), k, 5.0F);
          if (!MinecraftForge.EVENT_BUS.post((Event)event)) {
            if (getThrower().isRiding())
              getThrower().mountEntity((Entity)null); 
            getThrower().setPositionAndRotation(i, j, k, dy, dp);
            getThrower().setPositionAndUpdate(i, j, k);
            (getThrower()).fallDistance = 0.0F;
          } 
        } 
      } 
      setDead();
    } 
  }
}

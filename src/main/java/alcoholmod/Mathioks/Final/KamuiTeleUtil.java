package alcoholmod.Mathioks.Final;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class KamuiTeleUtil extends EntityThrowable {
  private static final String __OBFID = "CL_00001725";
  
  private int ticksInGround;
  
  public KamuiTeleUtil(World p_i1782_1_) {
    super(p_i1782_1_);
    this.motionX *= 5.0D;
    this.motionY *= 5.0D;
    this.motionZ *= 5.0D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public KamuiTeleUtil(World p_i1783_1_, EntityLivingBase p_i1783_2_) {
    super(p_i1783_1_, p_i1783_2_);
    this.motionX *= 5.0D;
    this.motionY *= 5.0D;
    this.motionZ *= 5.0D;
  }
  
  @SideOnly(Side.CLIENT)
  public KamuiTeleUtil(World p_i1784_1_, double p_i1784_2_, double p_i1784_4_, double p_i1784_6_) {
    super(p_i1784_1_, p_i1784_2_, p_i1784_4_, p_i1784_6_);
    this.motionX *= 5.0D;
    this.motionY *= 5.0D;
    this.motionZ *= 5.0D;
  }
  
  protected void onImpact(MovingObjectPosition p_70184_1_) {
    if (p_70184_1_.entityHit != null) {
      if (!this.worldObj.isRemote) {
        double i = p_70184_1_.entityHit.posX;
        double j = p_70184_1_.entityHit.posY;
        double k = p_70184_1_.entityHit.posZ;
        if (getThrower() != null && getThrower() instanceof EntityPlayerMP) {
          EntityPlayerMP entityplayermp = (EntityPlayerMP)getThrower();
          if (entityplayermp.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp.worldObj == this.worldObj) {
            EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)entityplayermp, i, j + 1.0D, k, 5.0F);
            if (!MinecraftForge.EVENT_BUS.post((Event)event)) {
              if (getThrower().isRiding())
                getThrower().mountEntity((Entity)null); 
              getThrower().setPositionAndUpdate(event.targetX, event.targetY, event.targetZ);
              (getThrower()).fallDistance = 0.0F;
            } 
          } 
        } 
        setDead();
      } 
    } else if (!this.worldObj.isRemote) {
      int i = p_70184_1_.blockX;
      int j = p_70184_1_.blockY;
      int k = p_70184_1_.blockZ;
      if (getThrower() != null && getThrower() instanceof EntityPlayerMP) {
        EntityPlayerMP entityplayermp = (EntityPlayerMP)getThrower();
        if (entityplayermp.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp.worldObj == this.worldObj) {
          EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)entityplayermp, i, (j + 1), k, 5.0F);
          if (!MinecraftForge.EVENT_BUS.post((Event)event)) {
            if (getThrower().isRiding())
              getThrower().mountEntity((Entity)null); 
            getThrower().setPositionAndUpdate(event.targetX, event.targetY, event.targetZ);
            (getThrower()).fallDistance = 0.0F;
          } 
        } 
      } 
      setDead();
    } 
  }
}

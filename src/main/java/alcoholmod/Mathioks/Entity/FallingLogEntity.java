package alcoholmod.Mathioks.Entity;

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

public class FallingLogEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001725";
  
  private int ticksInGround;
  
  public FallingLogEntity(World p_i1782_1_) {
    super(p_i1782_1_);
    this.motionX *= 5.0D;
    this.motionY *= 5.0D;
    this.motionZ *= 5.0D;
  }
  
  public FallingLogEntity(World p_i1783_1_, EntityLivingBase p_i1783_2_) {
    super(p_i1783_1_, p_i1783_2_);
    this.motionX *= 5.0D;
    this.motionY *= 5.0D;
    this.motionZ *= 5.0D;
  }
  
  protected float getGravityVelocity() {
    return 1.0F;
  }
  
  @SideOnly(Side.CLIENT)
  public FallingLogEntity(World p_i1784_1_, double p_i1784_2_, double p_i1784_4_, double p_i1784_6_) {
    super(p_i1784_1_, p_i1784_2_, p_i1784_4_, p_i1784_6_);
    this.motionX *= 5.0D;
    this.motionY *= 5.0D;
    this.motionZ *= 5.0D;
  }
  
  protected void onImpact(MovingObjectPosition p_70184_1_) {
    if (!this.worldObj.isRemote) {
      if (getThrower() != null && getThrower() instanceof EntityPlayerMP) {
        EntityPlayerMP entityplayermp = (EntityPlayerMP)getThrower();
        if (entityplayermp.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp.worldObj == this.worldObj) {
          EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)entityplayermp, this.posX, this.posY, this.posZ, 5.0F);
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

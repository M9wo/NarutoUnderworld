package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.AlcoholMod;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class FlyingThunderUtilTele extends EntityThrowable {
  private static final String __OBFID = "CL_00001725";
  
  private int ticksInGround;
  
  public FlyingThunderUtilTele(World p_i1782_1_) {
    super(p_i1782_1_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  protected float getGravityVelocity() {
    return 0.02F;
  }
  
  public FlyingThunderUtilTele(World p_i1783_1_, EntityLivingBase p_i1783_2_) {
    super(p_i1783_1_, p_i1783_2_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  @SideOnly(Side.CLIENT)
  public FlyingThunderUtilTele(World p_i1784_1_, double p_i1784_2_, double p_i1784_4_, double p_i1784_6_) {
    super(p_i1784_1_, p_i1784_2_, p_i1784_4_, p_i1784_6_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  protected void onImpact(MovingObjectPosition p_70184_1_) {
    if (p_70184_1_.entityHit != null) {
      if (!this.worldObj.isRemote) {
        double i = p_70184_1_.entityHit.posX;
        double j = p_70184_1_.entityHit.posY;
        double k = p_70184_1_.entityHit.posZ;
        EntityPlayerMP entityPlayerMP = (EntityPlayerMP)getThrower();
        if (getThrower() != null && getThrower() instanceof EntityPlayerMP) {
          EntityPlayerMP entityplayermp = (EntityPlayerMP)getThrower();
          if (!entityplayermp.capabilities.isCreativeMode)
            entityplayermp.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.FlyingThunderKunaiItem, 1)); 
          if (entityplayermp.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp.worldObj == this.worldObj) {
            EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)entityplayermp, i, j + 2.0D, k, 5.0F);
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
      EntityPlayerMP entityPlayerMP = (EntityPlayerMP)getThrower();
      if (getThrower() != null && getThrower() instanceof EntityPlayerMP) {
        EntityPlayerMP entityplayermp = (EntityPlayerMP)getThrower();
        if (entityplayermp.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp.worldObj == this.worldObj) {
          if (!entityplayermp.capabilities.isCreativeMode)
            entityplayermp.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.FlyingThunderKunaiItem, 1)); 
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

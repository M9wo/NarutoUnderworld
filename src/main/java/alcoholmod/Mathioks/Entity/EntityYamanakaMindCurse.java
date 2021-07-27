package alcoholmod.Mathioks.Entity;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class EntityYamanakaMindCurse extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private boolean hit2 = false;
  
  private double i2;
  
  private double j2;
  
  private double k2;
  
  private float dy2;
  
  private float dp2;
  
  private int deadtest = 0;
  
  public EntityLivingBase hit;
  
  public EntityLivingBase puppet;
  
  private int ticksInGround;
  
  public EntityYamanakaMindCurse(World Par1World) {
    super(Par1World);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityYamanakaMindCurse(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityYamanakaMindCurse(World Par6World, double Par7double, double Par8double, double Par9double) {
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
    if (getThrower() instanceof EntityPlayer && getThrower().getHeldItem() != null && getThrower().getHeldItem().getItem() == AlcoholMod.YamanakaCurse && (getThrower().getHeldItem()).stackTagCompound.getBoolean("Shot")) {
      EntityPlayer player = (EntityPlayer)getThrower();
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (this.hit2 && getThrower() != null && this.hit != null)
        if (this.puppet != null) {
          if (!this.worldObj.isRemote) {
            Entity entityLivingBase = this.hit;
            String user = getThrower().getUniqueID().toString();
            if (!(entityLivingBase instanceof EntityYamanakaMindCurse)) {
              if (entityLivingBase instanceof Entity) {
                setPosition(this.puppet.posX, this.puppet.posY, this.puppet.posZ);
                setRotation(this.puppet.rotationYaw, this.puppet.rotationPitch);
                this.puppet.fallDistance = 0.0F;
                entityLivingBase.setPositionAndRotation(this.puppet.posX, this.puppet.posY, this.puppet.posZ, this.puppet.rotationYaw, this.puppet.rotationPitch);
                entityLivingBase.setPosition(this.puppet.posX, this.puppet.posY, this.puppet.posZ);
                ((Entity)entityLivingBase).fallDistance = 0.0F;
              } 
              if (entityLivingBase instanceof EntityPlayer && !entityLivingBase.getUniqueID().toString().equals(user)) {
                entityLivingBase.setPosition(this.posX, this.posY, this.posZ);
                if (getThrower() != null && getThrower() instanceof EntityPlayerMP) {
                  EntityPlayerMP entityplayermp = (EntityPlayerMP)getThrower();
                  if (entityplayermp.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp.worldObj == this.worldObj) {
                    EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)entityplayermp, this.puppet.posX, this.puppet.posY + 1.0D, this.puppet.posZ, 5.0F);
                    if (!MinecraftForge.EVENT_BUS.post((Event)event)) {
                      if (entityLivingBase.isRiding())
                        entityLivingBase.mountEntity((Entity)null); 
                      ((EntityPlayer)entityLivingBase).setPositionAndRotation(this.puppet.posX, this.puppet.posY, this.puppet.posZ, this.puppet.rotationYaw, this.puppet.rotationPitch);
                      ((EntityPlayer)entityLivingBase).setPositionAndUpdate(this.puppet.posX, this.puppet.posY, this.puppet.posZ);
                    } 
                  } 
                } 
              } 
            } 
          } 
        } else {
          this.puppet.setDead();
          setDead();
        }  
    } 
    if (this.hit == null && this.puppet != null) {
      this.puppet.setDead();
      setDead();
    } 
    if (this.hit != null && this.hit.isDead) {
      this.puppet.setDead();
      setDead();
    } 
    if (this.ticksExisted >= 1200) {
      this.puppet.setDead();
      setDead();
    } 
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && !this.hit2 && Par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      this.hit = (EntityLivingBase)Par1MovingObjectPosition.entityHit;
      if (Par1MovingObjectPosition.entityHit != null) {
        this.hit2 = true;
        int i = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posX);
        int j = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posY);
        int k = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posZ);
        float dp = Par1MovingObjectPosition.entityHit.rotationPitch;
        float dy = Par1MovingObjectPosition.entityHit.rotationYaw;
        this.i2 = MathHelper.floor_double((getThrower()).posX);
        this.j2 = MathHelper.floor_double((getThrower()).posY);
        this.k2 = MathHelper.floor_double((getThrower()).posZ);
        this.dy2 = (getThrower()).rotationYaw;
        this.dp2 = (getThrower()).rotationPitch;
        EntityYamanakaCurse EntityBunshin = new EntityYamanakaCurse(this.worldObj);
        EntityBunshin.setLocationAndAngles(i, j + 1.0D, k, dy, dp);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)EntityBunshin);
        this.puppet = (EntityLivingBase)EntityBunshin;
      } 
    } 
  }
}

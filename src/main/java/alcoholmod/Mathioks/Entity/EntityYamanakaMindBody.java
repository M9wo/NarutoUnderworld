package alcoholmod.Mathioks.Entity;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.common.eventhandler.Event;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class EntityYamanakaMindBody extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private boolean hit2 = false;
  
  private double i2;
  
  private double j2;
  
  private double k2;
  
  private float dy2;
  
  private float dp2;
  
  private int deadtest = 0;
  
  public EntityLivingBase hit;
  
  private int ticksInGround;
  
  public EntityYamanakaMindBody(World Par1World) {
    super(Par1World);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityYamanakaMindBody(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityYamanakaMindBody(World Par6World, double Par7double, double Par8double, double Par9double) {
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
    if (getThrower().getHeldItem() != null && getThrower().getHeldItem().getItem() == AlcoholMod.YamanakaMindBody && getThrower() instanceof EntityPlayer) {
      EntityPlayer player = (EntityPlayer)getThrower();
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getCurrentMana() >= 0 && this.hit2 && getThrower() != null)
        if (this.hit != null) {
          if (!this.worldObj.isRemote) {
            Entity entityLivingBase = this.hit;
            String user = getThrower().getUniqueID().toString();
            if (!(entityLivingBase instanceof EntityYamanakaMindBody)) {
              if (entityLivingBase instanceof Entity) {
                setPosition((getThrower()).posX, (getThrower()).posY, (getThrower()).posZ);
                setRotation((getThrower()).rotationYaw, (getThrower()).rotationPitch);
                (getThrower()).fallDistance = 0.0F;
                entityLivingBase.setPositionAndRotation((getThrower()).posX, (getThrower()).posY, (getThrower()).posZ, (getThrower()).rotationYaw, (getThrower()).rotationPitch);
                entityLivingBase.setPosition((getThrower()).posX, (getThrower()).posY, (getThrower()).posZ);
                ((Entity)entityLivingBase).fallDistance = 0.0F;
              } 
              if (entityLivingBase instanceof EntityPlayer && !entityLivingBase.getUniqueID().toString().equals(user)) {
                entityLivingBase.setPosition(this.posX, this.posY, this.posZ);
                if (getThrower() != null && getThrower() instanceof EntityPlayerMP) {
                  EntityPlayerMP entityplayermp = (EntityPlayerMP)getThrower();
                  if (entityplayermp.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp.worldObj == this.worldObj) {
                    EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)entityplayermp, (getThrower()).posX, (getThrower()).posY + 1.0D, (getThrower()).posZ, 5.0F);
                    if (!MinecraftForge.EVENT_BUS.post((Event)event)) {
                      if (entityLivingBase.isRiding())
                        entityLivingBase.mountEntity((Entity)null); 
                      ((EntityPlayer)entityLivingBase).setPositionAndRotation((getThrower()).posX, (getThrower()).posY, (getThrower()).posZ, (getThrower()).rotationYaw, (getThrower()).rotationPitch);
                      ((EntityPlayer)entityLivingBase).setPositionAndUpdate((getThrower()).posX, (getThrower()).posY, (getThrower()).posZ);
                    } 
                  } 
                } 
              } 
            } 
          } 
        } else {
          getThrower().setPositionAndRotation(this.i2, this.j2, this.k2, this.dy2, this.dp2);
          getThrower().setPositionAndUpdate(this.i2, this.j2, this.k2);
          (getThrower()).fallDistance = 0.0F;
          setDead();
        }  
    } 
    if (getThrower().getHeldItem() != null && getThrower().getHeldItem().getItem() != AlcoholMod.YamanakaMindBody) {
      getThrower().setPositionAndRotation(this.i2, this.j2, this.k2, this.dy2, this.dp2);
      getThrower().setPositionAndUpdate(this.i2, this.j2, this.k2);
      (getThrower()).fallDistance = 0.0F;
      this.deadtest++;
      List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox((getThrower()).posX - 1.0D, (getThrower()).posY - 1.0D, (getThrower()).posZ - 1.0D, (getThrower()).posX + 1.0D, (getThrower()).posY + 1.0D, (getThrower()).posZ + 1.0D));
      if (getThrower() != null)
        for (int k2 = 0; k2 < list.size(); k2++) {
          if (!this.worldObj.isRemote) {
            Entity entity = list.get(k2);
            String user = getThrower().getUniqueID().toString();
            if (entity instanceof EntityYamanakaFool) {
              ((EntityYamanakaFool)entity).killed = true;
              entity.setDead();
            } 
          } 
        }  
      if (this.deadtest == 60)
        setDead(); 
    } 
    if (getThrower().getHeldItem() == null) {
      getThrower().setPositionAndRotation(this.i2, this.j2, this.k2, this.dy2, this.dp2);
      getThrower().setPositionAndUpdate(this.i2, this.j2, this.k2);
      (getThrower()).fallDistance = 0.0F;
      this.deadtest++;
      List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox((getThrower()).posX - 1.0D, (getThrower()).posY - 1.0D, (getThrower()).posZ - 1.0D, (getThrower()).posX + 1.0D, (getThrower()).posY + 1.0D, (getThrower()).posZ + 1.0D));
      if (getThrower() != null)
        for (int k2 = 0; k2 < list.size(); k2++) {
          if (!this.worldObj.isRemote) {
            Entity entity = list.get(k2);
            String user = getThrower().getUniqueID().toString();
            if (entity instanceof EntityYamanakaFool) {
              ((EntityYamanakaFool)entity).killed = true;
              entity.setDead();
            } 
          } 
        }  
      if (this.deadtest == 60)
        setDead(); 
    } 
    if (getThrower() instanceof EntityPlayer) {
      EntityPlayer player = (EntityPlayer)getThrower();
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getCurrentMana() <= 0) {
        getThrower().setPositionAndRotation(this.i2, this.j2, this.k2, this.dy2, this.dp2);
        getThrower().setPositionAndUpdate(this.i2, this.j2, this.k2);
        (getThrower()).fallDistance = 0.0F;
        this.deadtest++;
        List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox((getThrower()).posX - 1.0D, (getThrower()).posY - 1.0D, (getThrower()).posZ - 1.0D, (getThrower()).posX + 1.0D, (getThrower()).posY + 1.0D, (getThrower()).posZ + 1.0D));
        if (getThrower() != null)
          for (int k2 = 0; k2 < list.size(); k2++) {
            if (!this.worldObj.isRemote) {
              Entity entity = list.get(k2);
              String user = getThrower().getUniqueID().toString();
              if (entity instanceof EntityYamanakaFool) {
                ((EntityYamanakaFool)entity).killed = true;
                entity.setDead();
              } 
            } 
          }  
      } 
      if (this.deadtest == 60)
        setDead(); 
    } 
    if (this.hit != null && this.hit.isDead) {
      this.deadtest++;
      getThrower().setPositionAndRotation(this.i2, this.j2, this.k2, this.dy2, this.dp2);
      getThrower().setPositionAndUpdate(this.i2, this.j2, this.k2);
      (getThrower()).fallDistance = 0.0F;
      List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox((getThrower()).posX - 1.0D, (getThrower()).posY - 1.0D, (getThrower()).posZ - 1.0D, (getThrower()).posX + 1.0D, (getThrower()).posY + 1.0D, (getThrower()).posZ + 1.0D));
      if (getThrower() != null)
        for (int k2 = 0; k2 < list.size(); k2++) {
          if (!this.worldObj.isRemote) {
            Entity entity = list.get(k2);
            String user = getThrower().getUniqueID().toString();
            if (entity instanceof EntityYamanakaFool) {
              ((EntityYamanakaFool)entity).killed = true;
              entity.setDead();
              getThrower().setHealth(0.0F);
            } 
            if (this.ticksExisted >= 600)
              entity.setDead(); 
          } 
        }  
      if (this.deadtest == 60)
        setDead(); 
    } 
    if (this.ticksExisted >= 600)
      setDead(); 
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && !this.hit2 && Par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      this.hit = (EntityLivingBase)Par1MovingObjectPosition.entityHit;
      if (Par1MovingObjectPosition.entityHit != null) {
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
              this.hit2 = true;
              EntityYamanakaFool EntityBunshin = new EntityYamanakaFool(this.worldObj);
              EntityBunshin.func_152115_b(((EntityPlayer)getThrower()).getUniqueID().toString());
              EntityBunshin.setTamed(true);
              EntityBunshin.setLocationAndAngles(this.i2, this.j2 + 1.0D, this.k2, this.dy2, this.dp2);
              EntityBunshin.i = this.i2;
              EntityBunshin.j = this.j2;
              EntityBunshin.k = this.k2;
              EntityBunshin.y = this.dy2;
              EntityBunshin.p = this.dp2;
              (getThrower()).worldObj.spawnEntityInWorld((Entity)EntityBunshin);
            } 
          } 
        } 
      } 
    } else if (!(Par1MovingObjectPosition.entityHit instanceof EntityLivingBase) && !this.worldObj.isRemote && !this.hit2 && 
      getThrower() != null && getThrower().getHeldItem() != null && getThrower().getHeldItem().getItem() != null && getThrower().getHeldItem().getItem() == AlcoholMod.YamanakaMindBody) {
      (getThrower().getHeldItem()).stackTagCompound.setBoolean("Shot", false);
    } 
  }
}

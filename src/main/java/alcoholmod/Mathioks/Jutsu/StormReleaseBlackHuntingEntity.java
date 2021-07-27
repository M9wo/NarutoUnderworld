package alcoholmod.Mathioks.Jutsu;

import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class StormReleaseBlackHuntingEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 6;
  
  private boolean SetTimer = false;
  
  private int Timer = 0;
  
  EntityLivingBase hit;
  
  private int ticksInGround;
  
  public StormReleaseBlackHuntingEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    setSize(0.3125F, 0.3125F);
  }
  
  public StormReleaseBlackHuntingEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.ticksExisted >= 600)
      setDead(); 
    if (this.hit != null)
      if (this.hit instanceof EntityPlayerMP && this.hit != null) {
        EntityPlayerMP entityplayermp2 = (EntityPlayerMP)this.hit;
        if (entityplayermp2.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp2.worldObj == this.worldObj) {
          EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)entityplayermp2, this.posX, this.posY + 1.0D, this.posZ, 5.0F);
          if (!MinecraftForge.EVENT_BUS.post((Event)event)) {
            if (this.hit.isRiding())
              this.hit.mountEntity((Entity)null); 
            EntityLivingBase hitentity = this.hit;
            hitentity.setPositionAndUpdate(this.posX, this.posY, this.posZ);
            hitentity.fallDistance = 0.0F;
          } 
        } 
      } else if (!(this.hit instanceof EntityPlayerMP) && this.hit instanceof EntityLivingBase && this.hit != null) {
        this.hit.setPosition(this.posX, this.posY, this.posZ);
        this.hit.fallDistance = 0.0F;
      }  
    if (this.SetTimer) {
      this.Timer++;
      if (this.Timer >= 30) {
        this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, this.explosionRadius, false, true);
        this.worldObj.spawnParticle("cloud", this.posX - this.motionX * 0.25D, this.posY - this.motionY * 0.25D, this.posZ - this.motionZ * 0.25D, this.motionX, this.motionY, this.motionZ);
        this.worldObj.spawnParticle("cloud", this.posX - this.motionX * 0.25D, this.posY - this.motionY * 0.25D, this.posZ - this.motionZ * 0.25D, this.motionX, this.motionY, this.motionZ);
        this.worldObj.spawnParticle("cloud", this.posX - this.motionX * 0.25D, this.posY - this.motionY * 0.25D, this.posZ - this.motionZ * 0.25D, this.motionX, this.motionY, this.motionZ);
        this.worldObj.spawnParticle("cloud", this.posX - this.motionX * 0.25D, this.posY - this.motionY * 0.25D, this.posZ - this.motionZ * 0.25D, this.motionX, this.motionY, this.motionZ);
        this.worldObj.spawnParticle("cloud", this.posX - this.motionX * 0.25D, this.posY - this.motionY * 0.25D, this.posZ - this.motionZ * 0.25D, this.motionX, this.motionY, this.motionZ);
        this.worldObj.spawnParticle("cloud", this.posX - this.motionX * 0.25D, this.posY - this.motionY * 0.25D, this.posZ - this.motionZ * 0.25D, this.motionX, this.motionY, this.motionZ);
        this.worldObj.spawnParticle("cloud", this.posX - this.motionX * 0.25D, this.posY - this.motionY * 0.25D, this.posZ - this.motionZ * 0.25D, this.motionX, this.motionY, this.motionZ);
        setDead();
      } 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote)
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        this.hit = (EntityLivingBase)par1MovingObjectPosition.entityHit;
        par1MovingObjectPosition.entityHit.motionX = this.motionX * 1.8D;
        par1MovingObjectPosition.entityHit.motionY = this.motionY - 0.5D;
        par1MovingObjectPosition.entityHit.motionZ = this.motionZ * 1.8D;
        Entity var10000 = par1MovingObjectPosition.entityHit;
        var10000.rotationYaw += 30.0F * this.ticksExisted;
        par1MovingObjectPosition.entityHit.setPositionAndRotation(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
        par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 3.0F);
        ((EntityLivingBase)par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 30, 10));
        ((EntityLivingBase)par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.jump.id, 30, -2));
        if (par1MovingObjectPosition.entityHit instanceof EntityPlayerMP && par1MovingObjectPosition.entityHit != null) {
          EntityPlayerMP entityplayermp2 = (EntityPlayerMP)par1MovingObjectPosition.entityHit;
          if (entityplayermp2.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp2.worldObj == this.worldObj) {
            EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)entityplayermp2, this.posX, this.posY + 1.0D, this.posZ, 5.0F);
            if (!MinecraftForge.EVENT_BUS.post((Event)event)) {
              if (par1MovingObjectPosition.entityHit.isRiding())
                par1MovingObjectPosition.entityHit.mountEntity((Entity)null); 
              EntityLivingBase hitentity = (EntityLivingBase)par1MovingObjectPosition.entityHit;
              hitentity.setPositionAndUpdate(this.posX, this.posY, this.posZ);
              hitentity.fallDistance = 0.0F;
            } 
          } 
        } 
        this.SetTimer = true;
      } else {
        this.worldObj.newExplosion((Entity)getThrower(), this.posX, this.posY, this.posZ, 4.0F, false, true);
        this.worldObj.spawnParticle("cloud", this.posX - this.motionX * 0.25D, this.posY - this.motionY * 0.25D, this.posZ - this.motionZ * 0.25D, this.motionX, this.motionY, this.motionZ);
        this.worldObj.spawnParticle("cloud", this.posX - this.motionX * 0.25D, this.posY - this.motionY * 0.25D, this.posZ - this.motionZ * 0.25D, this.motionX, this.motionY, this.motionZ);
        this.worldObj.spawnParticle("cloud", this.posX - this.motionX * 0.25D, this.posY - this.motionY * 0.25D, this.posZ - this.motionZ * 0.25D, this.motionX, this.motionY, this.motionZ);
        this.worldObj.spawnParticle("cloud", this.posX - this.motionX * 0.25D, this.posY - this.motionY * 0.25D, this.posZ - this.motionZ * 0.25D, this.motionX, this.motionY, this.motionZ);
        this.worldObj.spawnParticle("cloud", this.posX - this.motionX * 0.25D, this.posY - this.motionY * 0.25D, this.posZ - this.motionZ * 0.25D, this.motionX, this.motionY, this.motionZ);
        this.worldObj.spawnParticle("cloud", this.posX - this.motionX * 0.25D, this.posY - this.motionY * 0.25D, this.posZ - this.motionZ * 0.25D, this.motionX, this.motionY, this.motionZ);
        this.worldObj.spawnParticle("cloud", this.posX - this.motionX * 0.25D, this.posY - this.motionY * 0.25D, this.posZ - this.motionZ * 0.25D, this.motionX, this.motionY, this.motionZ);
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

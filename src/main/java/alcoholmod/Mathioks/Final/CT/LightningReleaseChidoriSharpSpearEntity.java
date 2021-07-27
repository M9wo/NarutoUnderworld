package alcoholmod.Mathioks.Final.CT;

import cpw.mods.fml.common.eventhandler.Event;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class LightningReleaseChidoriSharpSpearEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  public boolean Storm = false;
  
  private int explosionRadius = 1;
  
  private int ticksInGround;
  
  public LightningReleaseChidoriSharpSpearEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    setSize(0.2F, 0.2F);
  }
  
  public LightningReleaseChidoriSharpSpearEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    super.onUpdate();
    if (!this.worldObj.isRemote) {
      this.posX += this.motionX;
      this.posY += this.motionY;
      this.posZ += this.motionZ;
      if (this.ticksExisted >= 13)
        setDead(); 
    } 
    if (isInWater()) {
      List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 20.0D, this.posY - 3.0D, this.posZ - 20.0D, this.posX + 20.0D, this.posY + 3.0D, this.posZ + 20.0D));
      if (getThrower() != null)
        for (int j = 0; j < list.size(); j++) {
          if (!this.worldObj.isRemote) {
            Entity entity = list.get(j);
            String user = getThrower().getUniqueID().toString();
            if (entity instanceof net.minecraft.entity.EntityLiving && entity.isInWater()) {
              entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 4.0F);
              ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40, 10));
              ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.jump.id, 40, -5));
            } 
            if (entity instanceof net.minecraft.entity.player.EntityPlayer && !entity.getUniqueID().toString().equals(user) && entity.isInWater()) {
              entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 4.0F);
              ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40, 10));
              ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.jump.id, 40, -5));
            } 
            if (entity instanceof LightningReleaseChidoriSharpSpearEntity)
              setDead(); 
            if (entity instanceof alcoholmod.Mathioks.Final.ClanJutsu.UzumakiAdamantineChainsEntity)
              setDead(); 
          } 
        }  
      int k2 = this.worldObj.rand.nextInt(12);
      int i;
      for (i = 0; i < 10; i++) {
        super.onUpdate();
        this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian(), this.posY, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian(), this.posY, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian(), this.posY + 1.0D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian(), this.posY + 1.0D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian() * 2.0D, this.posY, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian() * 2.0D, this.posY, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + 1.0D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + 1.0D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
      } 
      for (i = 0; i < 4; i++) {
        this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian(), this.posY, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian(), this.posY + 1.0D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian() * 2.0D, this.posY, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + 1.0D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
      } 
      for (i = 0; i < 10; i++) {
        this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian(), this.posY + this.rand.nextGaussian() * 0.25D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian(), this.posY + 1.0D + this.rand.nextGaussian() * 0.25D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + this.rand.nextGaussian() * 0.25D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + 1.0D + this.rand.nextGaussian() * 0.25D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
      } 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      float amaterasuDamage = 0.5F;
      if (this.Storm)
        amaterasuDamage = 2.0F; 
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), amaterasuDamage);
        ((EntityLivingBase)par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 60, 10));
        par1MovingObjectPosition.entityHit.setPositionAndRotation(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
        par1MovingObjectPosition.entityHit.fallDistance = 0.0F;
        if (par1MovingObjectPosition.entityHit instanceof EntityPlayerMP && par1MovingObjectPosition.entityHit != null) {
          EntityPlayerMP entityplayermp2 = (EntityPlayerMP)par1MovingObjectPosition.entityHit;
          if (entityplayermp2.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp2.worldObj == this.worldObj) {
            String user = getThrower().getUniqueID().toString();
            if (!par1MovingObjectPosition.entityHit.getUniqueID().toString().equals(user)) {
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
        } 
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

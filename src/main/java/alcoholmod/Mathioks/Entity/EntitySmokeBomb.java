package alcoholmod.Mathioks.Entity;

import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySmokeBomb extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private int timer = 0;
  
  private double X = 0.0D;
  
  private double Y = 0.0D;
  
  private double Z = 0.0D;
  
  private int ticksInGround;
  
  protected boolean inGround;
  
  public EntitySmokeBomb(World Par1World) {
    super(Par1World);
    setSize(1.25F, 1.25F);
  }
  
  public EntitySmokeBomb(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    setSize(1.25F, 1.25F);
  }
  
  public EntitySmokeBomb(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    setSize(1.25F, 1.25F);
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
    if (this.X != 0.0D || this.Y != 0.0D || this.Z != 0.0D) {
      this.posX = this.X;
      this.posY = this.Y;
      this.posZ = this.Z;
      this.timer++;
      if (this.timer >= 500)
        setDead(); 
    } 
    for (this.rotationPitch = (float)(Math.atan2(this.motionY, f) * 180.0D / Math.PI); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F);
    while (this.rotationPitch - this.prevRotationPitch >= 180.0F)
      this.prevRotationPitch += 360.0F; 
    while (this.rotationYaw - this.prevRotationYaw < -180.0F)
      this.prevRotationYaw -= 360.0F; 
    while (this.rotationYaw - this.prevRotationYaw >= 180.0F)
      this.prevRotationYaw += 360.0F; 
    this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
    this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 5.0D, this.posY - 5.0D, this.posZ - 5.0D, this.posX + 5.0D, this.posY + 5.0D, this.posZ + 5.0D));
    if (getThrower() != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = getThrower().getUniqueID().toString();
          if (entity instanceof EntityLivingBase && !entity.getCommandSenderName().equals(getThrower().getCommandSenderName()))
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 100, 1)); 
        } 
      }  
    float f3 = 3.25F;
    if (isInWater()) {
      for (int i = 0; i < 4; i++)
        this.worldObj.spawnParticle("bubble", this.posX - this.motionX * f3, this.posY - this.motionY * f3, this.posZ - this.motionZ * f3, this.motionX, this.motionY, this.motionZ); 
    } else {
      for (int i = 0; i < 24; i++);
    } 
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (this.X == 0.0D && this.Y == 0.0D && this.Z == 0.0D) {
      this.X = this.posX;
      this.Y = this.posY;
      this.Z = this.posZ;
    } 
    if (Par1MovingObjectPosition.entityHit != null && Par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.blindness.id, 100, 1));
      for (int j = 0; j < 8; j++) {
        this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 2.0D, this.Y, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 2.0D, this.Y, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 1.0D, this.Y, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X, this.Y, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X, this.Y, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X, this.Y, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X, this.Y, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X, this.Y, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 1.0D, this.Y, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X - 1.0D, this.Y, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 1.0D, this.Y, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X - 2.0D, this.Y, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 2.0D, this.Y, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 3.0D, this.Y, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 3.0D, this.Y, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 3.0D, this.Y, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 3.0D, this.Y, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 2.0D, this.Y, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X, this.Y, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X, this.Y, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X - 1.0D, this.Y, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 2.0D, this.Y, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X - 3.0D, this.Y, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 3.0D, this.Y, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X - 3.0D, this.Y, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 3.0D, this.Y, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y + 1.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 3.0D, this.Y + 1.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 3.0D, this.Y + 1.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y + 1.0D, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y + 1.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 3.0D, this.Y + 1.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 3.0D, this.Y + 1.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y + 1.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 2.0D, this.Y + 1.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y + 1.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y + 1.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X, this.Y + 1.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X, this.Y + 1.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X - 1.0D, this.Y + 1.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y + 1.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 2.0D, this.Y + 1.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y + 1.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X - 3.0D, this.Y + 1.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y + 1.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 3.0D, this.Y + 1.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y + 1.0D, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X - 3.0D, this.Y + 1.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y + 1.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 3.0D, this.Y + 1.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y + 1.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 2.0D, this.Y + 1.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 2.0D, this.Y + 1.0D, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y + 1.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y + 1.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y + 1.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y + 1.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 1.0D, this.Y + 1.0D, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y + 1.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y + 1.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X, this.Y + 1.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X, this.Y + 1.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X, this.Y + 1.0D, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X, this.Y + 1.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X, this.Y + 1.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 1.0D, this.Y + 1.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y + 1.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X - 1.0D, this.Y + 1.0D, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y + 1.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 1.0D, this.Y + 1.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y + 1.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X - 2.0D, this.Y + 1.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y + 1.0D, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 2.0D, this.Y + 1.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y + 1.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y + 2.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 3.0D, this.Y + 2.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 3.0D, this.Y + 2.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y + 2.0D, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y + 2.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 3.0D, this.Y + 2.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 3.0D, this.Y + 2.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y + 2.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 2.0D, this.Y + 2.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y + 2.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y + 2.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X, this.Y + 2.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X, this.Y + 2.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X - 1.0D, this.Y + 2.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y + 2.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 2.0D, this.Y + 2.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y + 2.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X - 3.0D, this.Y + 2.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y + 2.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 3.0D, this.Y + 2.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y + 2.0D, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X - 3.0D, this.Y + 2.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y + 2.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 3.0D, this.Y + 2.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y + 2.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 2.0D, this.Y + 2.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 2.0D, this.Y + 2.0D, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y + 2.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y + 2.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y + 2.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y + 2.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X + 1.0D, this.Y + 2.0D, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y + 2.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y + 2.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X, this.Y + 2.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X, this.Y + 2.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X, this.Y + 2.0D, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X, this.Y + 2.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X, this.Y + 2.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 1.0D, this.Y + 2.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y + 2.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X - 1.0D, this.Y + 2.0D, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y + 2.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 1.0D, this.Y + 2.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y + 2.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("snowshovel", this.X - 2.0D, this.Y + 2.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y + 2.0D, this.Z, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("explode", this.X - 2.0D, this.Y + 2.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y + 2.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      } 
    } 
    for (int i = 0; i < 8; i++) {
      this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 2.0D, this.Y, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 2.0D, this.Y, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 1.0D, this.Y, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X, this.Y, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X, this.Y, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X, this.Y, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X, this.Y, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X, this.Y, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 1.0D, this.Y, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X - 1.0D, this.Y, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 1.0D, this.Y, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X - 2.0D, this.Y, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 2.0D, this.Y, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 3.0D, this.Y, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 3.0D, this.Y, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 3.0D, this.Y, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 3.0D, this.Y, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 2.0D, this.Y, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X, this.Y, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X, this.Y, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X - 1.0D, this.Y, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 2.0D, this.Y, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X - 3.0D, this.Y, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 3.0D, this.Y, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X - 3.0D, this.Y, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 3.0D, this.Y, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y + 1.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 3.0D, this.Y + 1.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 3.0D, this.Y + 1.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y + 1.0D, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y + 1.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 3.0D, this.Y + 1.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 3.0D, this.Y + 1.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y + 1.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 2.0D, this.Y + 1.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y + 1.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y + 1.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X, this.Y + 1.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X, this.Y + 1.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X - 1.0D, this.Y + 1.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y + 1.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 2.0D, this.Y + 1.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y + 1.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X - 3.0D, this.Y + 1.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y + 1.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 3.0D, this.Y + 1.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y + 1.0D, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X - 3.0D, this.Y + 1.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y + 1.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 3.0D, this.Y + 1.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y + 1.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 2.0D, this.Y + 1.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 2.0D, this.Y + 1.0D, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y + 1.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y + 1.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y + 1.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y + 1.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 1.0D, this.Y + 1.0D, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y + 1.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y + 1.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X, this.Y + 1.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X, this.Y + 1.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X, this.Y + 1.0D, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X, this.Y + 1.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X, this.Y + 1.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 1.0D, this.Y + 1.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y + 1.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X - 1.0D, this.Y + 1.0D, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y + 1.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 1.0D, this.Y + 1.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y + 1.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X - 2.0D, this.Y + 1.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y + 1.0D, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 2.0D, this.Y + 1.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y + 1.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y + 2.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 3.0D, this.Y + 2.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 3.0D, this.Y + 2.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y + 2.0D, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 3.0D, this.Y + 2.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 3.0D, this.Y + 2.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 3.0D, this.Y + 2.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y + 2.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 2.0D, this.Y + 2.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y + 2.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y + 2.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X, this.Y + 2.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X, this.Y + 2.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X - 1.0D, this.Y + 2.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y + 2.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 2.0D, this.Y + 2.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y + 2.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X - 3.0D, this.Y + 2.0D, this.Z + 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y + 2.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 3.0D, this.Y + 2.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y + 2.0D, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X - 3.0D, this.Y + 2.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 3.0D, this.Y + 2.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 3.0D, this.Y + 2.0D, this.Z - 3.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y + 2.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 2.0D, this.Y + 2.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 2.0D, this.Y + 2.0D, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y + 2.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 2.0D, this.Y + 2.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y + 2.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y + 2.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X + 1.0D, this.Y + 2.0D, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X + 1.0D, this.Y + 2.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X + 1.0D, this.Y + 2.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X, this.Y + 2.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X, this.Y + 2.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X, this.Y + 2.0D, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X, this.Y + 2.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X, this.Y + 2.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 1.0D, this.Y + 2.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y + 2.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X - 1.0D, this.Y + 2.0D, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 1.0D, this.Y + 2.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 1.0D, this.Y + 2.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y + 2.0D, this.Z + 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("snowshovel", this.X - 2.0D, this.Y + 2.0D, this.Z + 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y + 2.0D, this.Z, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("explode", this.X - 2.0D, this.Y + 2.0D, this.Z - 1.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("cloud", this.X - 2.0D, this.Y + 2.0D, this.Z - 2.0D, 0.0D, 0.0D, 0.0D);
    } 
  }
}

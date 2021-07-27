package alcoholmod.Mathioks.Entity;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityStormInnerWave extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private boolean Water;
  
  int deathcounter;
  
  public int explosionRadius = 5;
  
  private EntityLivingBase thrower;
  
  private String throwerName;
  
  private int field_145788_c = -1;
  
  private int field_145786_d = -1;
  
  private int field_145787_e = -1;
  
  private Block field_145785_f;
  
  private int ticksInGround;
  
  public EntityStormInnerWave(World Par1World) {
    super(Par1World);
    this.motionX *= 0.0D;
    this.motionY *= 0.0D;
    this.motionZ *= 0.0D;
    setSize(0.25F, 0.25F);
    setSize(0.25F, 0.25F);
    this.noClip = true;
  }
  
  public EntityStormInnerWave(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.0D;
    this.motionY *= 0.0D;
    this.motionZ *= 0.0D;
    setSize(0.25F, 0.25F);
    this.thrower = Par5EntityLivingBase;
  }
  
  public EntityStormInnerWave(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 0.0D;
    this.motionY *= 0.0D;
    this.motionZ *= 0.0D;
    setSize(0.25F, 0.25F);
    setSize(0.25F, 0.25F);
  }
  
  public void onUpdate() {
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    if (this.ticksExisted >= 300)
      setDead(); 
    super.onUpdate();
    if (!this.worldObj.isRemote && getThrower() == null)
      setDead(); 
    if (!this.worldObj.isRemote) {
      if (getThrower() != null) {
        this.posX = (getThrower()).posX;
        this.posY = (getThrower()).posY;
        this.posZ = (getThrower()).posZ;
        this.rotationYaw = (getThrower()).rotationYaw;
        setPosition(this.posX, this.posY, this.posZ);
        setRotation(this.rotationYaw, this.rotationPitch);
      } 
      if (this.deathcounter >= 350)
        setDead(); 
      List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 5.0D, this.posY - 5.0D, this.posZ - 5.0D, this.posX + 5.0D, this.posY + 5.0D, this.posZ + 5.0D));
      if (getThrower() != null)
        for (int j = 0; j < list.size(); j++) {
          if (!this.worldObj.isRemote) {
            Entity entity = list.get(j);
            String user = getThrower().getUniqueID().toString();
            if (entity instanceof EntityLiving) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 60, 10));
              entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 2.0F);
            } 
            if (entity instanceof net.minecraft.entity.player.EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
              ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 60, 10));
              entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 2.0F);
            } 
          } 
        }  
    } 
    float f3 = 5.25F;
    int k2 = this.worldObj.rand.nextInt(12);
    int i;
    for (i = 0; i < 10; i++) {
      super.onUpdate();
      this.worldObj.spawnParticle("magicCrit", this.posX + this.rand.nextGaussian(), this.posY, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY + 1.0D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY + 1.0D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + 1.0D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + 1.0D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
    } 
    for (i = 0; i < 4; i++) {
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY + 1.0D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + 1.0D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
    } 
    for (i = 0; i < 10; i++) {
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY + this.rand.nextGaussian() * 0.25D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY + 1.0D + this.rand.nextGaussian() * 0.25D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + this.rand.nextGaussian() * 0.25D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + 1.0D + this.rand.nextGaussian() * 0.25D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
    } 
    this.deathcounter++;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      int i = par1MovingObjectPosition.blockX;
      int j = par1MovingObjectPosition.blockY;
      int k = par1MovingObjectPosition.blockZ;
    } 
  }
}

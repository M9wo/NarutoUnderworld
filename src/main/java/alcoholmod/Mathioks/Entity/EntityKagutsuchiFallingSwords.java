package alcoholmod.Mathioks.Entity;

import alcoholmod.Mathioks.Final.CT.SharinganKagutsuchiFallingSwordsEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityKagutsuchiFallingSwords extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private int ticksInGround;
  
  public EntityKagutsuchiFallingSwords(World Par1World) {
    super(Par1World);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public EntityKagutsuchiFallingSwords(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public EntityKagutsuchiFallingSwords(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
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
    this.posX += this.motionX;
    this.posY += this.motionY;
    this.posZ += this.motionZ;
    float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
    this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);
    float f3 = 3.25F;
    for (int i = 0; i < 24; i++)
      this.worldObj.spawnParticle("smoke", this.posX - this.motionX * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.posY - this.motionY * f3 - 0.5D, this.posZ - this.motionZ * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.motionX, this.motionY, this.motionZ); 
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && Par1MovingObjectPosition.entityHit != null && Par1MovingObjectPosition.entityHit != null && Par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 150, 10));
      ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.jump.id, 150, -10));
      if (!this.worldObj.isRemote) {
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull1 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull2 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull3 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull4 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull5 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull6 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull7 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull8 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull9 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull10 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull11 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull12 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull13 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull14 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull15 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull16 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull17 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull18 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull19 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull20 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull21 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull22 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull23 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull24 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        SharinganKagutsuchiFallingSwordsEntity entitywitherskull25 = new SharinganKagutsuchiFallingSwordsEntity(this.worldObj);
        entitywitherskull1.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ, this.rotationYaw, 0.0F);
        entitywitherskull2.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ + 1.0D, this.rotationYaw, 0.0F);
        entitywitherskull3.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ - 1.0D, this.rotationYaw, 0.0F);
        entitywitherskull4.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX + 1.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ, this.rotationYaw, 0.0F);
        entitywitherskull5.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX - 1.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ, this.rotationYaw, 0.0F);
        entitywitherskull6.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX - 1.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ + 1.0D, this.rotationYaw, 0.0F);
        entitywitherskull7.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX - 1.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ - 1.0D, this.rotationYaw, 0.0F);
        entitywitherskull8.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX + 1.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ + 1.0D, this.rotationYaw, 0.0F);
        entitywitherskull9.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX + 1.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ - 1.0D, this.rotationYaw, 0.0F);
        entitywitherskull10.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX - 2.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ + 2.0D, this.rotationYaw, 0.0F);
        entitywitherskull11.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX - 2.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ + 1.0D, this.rotationYaw, 0.0F);
        entitywitherskull12.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX - 2.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ, this.rotationYaw, 0.0F);
        entitywitherskull13.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX - 2.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ - 1.0D, this.rotationYaw, 0.0F);
        entitywitherskull14.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX - 2.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ - 2.0D, this.rotationYaw, 0.0F);
        entitywitherskull15.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX - 1.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ - 2.0D, this.rotationYaw, 0.0F);
        entitywitherskull16.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX - 1.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ + 2.0D, this.rotationYaw, 0.0F);
        entitywitherskull17.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ - 2.0D, this.rotationYaw, 0.0F);
        entitywitherskull18.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ + 2.0D, this.rotationYaw, 0.0F);
        entitywitherskull19.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX + 1.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ - 2.0D, this.rotationYaw, 0.0F);
        entitywitherskull20.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX + 1.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ + 2.0D, this.rotationYaw, 0.0F);
        entitywitherskull21.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX + 2.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ - 2.0D, this.rotationYaw, 0.0F);
        entitywitherskull22.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX + 2.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ - 1.0D, this.rotationYaw, 0.0F);
        entitywitherskull23.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX + 2.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ, this.rotationYaw, 0.0F);
        entitywitherskull24.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX + 2.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ + 1.0D, this.rotationYaw, 0.0F);
        entitywitherskull25.setLocationAndAngles(Par1MovingObjectPosition.entityHit.posX + 2.0D, Par1MovingObjectPosition.entityHit.posY + 30.0D, Par1MovingObjectPosition.entityHit.posZ + 2.0D, this.rotationYaw, 0.0F);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull1);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull2);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull3);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull4);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull5);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull6);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull7);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull8);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull9);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull10);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull11);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull12);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull13);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull14);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull15);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull16);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull17);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull18);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull19);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull20);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull21);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull22);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull23);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull24);
        (getThrower()).worldObj.spawnEntityInWorld((Entity)entitywitherskull25);
        entitywitherskull1.motionY = -1.0D;
        entitywitherskull2.motionY = -1.0D;
        entitywitherskull3.motionY = -1.0D;
        entitywitherskull4.motionY = -1.0D;
        entitywitherskull5.motionY = -1.0D;
        entitywitherskull6.motionY = -1.0D;
        entitywitherskull7.motionY = -1.0D;
        entitywitherskull8.motionY = -1.0D;
        entitywitherskull9.motionY = -1.0D;
        entitywitherskull10.motionY = -1.0D;
        entitywitherskull11.motionY = -1.0D;
        entitywitherskull12.motionY = -1.0D;
        entitywitherskull13.motionY = -1.0D;
        entitywitherskull14.motionY = -1.0D;
        entitywitherskull15.motionY = -1.0D;
        entitywitherskull16.motionY = -1.0D;
        entitywitherskull17.motionY = -1.0D;
        entitywitherskull18.motionY = -1.0D;
        entitywitherskull19.motionY = -1.0D;
        entitywitherskull20.motionY = -1.0D;
        entitywitherskull21.motionY = -1.0D;
        entitywitherskull22.motionY = -1.0D;
        entitywitherskull23.motionY = -1.0D;
        entitywitherskull24.motionY = -1.0D;
        entitywitherskull25.motionY = -1.0D;
        setDead();
      } 
    } 
  }
}

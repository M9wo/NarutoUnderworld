package alcoholmod.Mathioks.Entity;

import alcoholmod.Mathioks.Jutsu.EntityCrowDisguiseJutsu;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGenjutsuCrows extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private boolean start;
  
  private int counter = 0;
  
  public EntityLivingBase hit;
  
  private int ticksInGround;
  
  public EntityGenjutsuCrows(World Par1World) {
    super(Par1World);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityGenjutsuCrows(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityGenjutsuCrows(World Par6World, double Par7double, double Par8double, double Par9double) {
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
    if (this.start) {
      this.counter++;
      if (!this.worldObj.isRemote) {
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu1 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu2 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu3 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu4 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu5 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu6 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu7 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu8 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu9 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu10 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu11 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu12 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu13 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu14 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu15 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu16 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu17 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu18 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu19 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu20 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu21 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu22 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu23 = new EntityCrowDisguiseJutsu(this.worldObj);
        EntityLivingBase entityLivingBase = getThrower();
        EntityCrowDisguiseJutsu.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu.setTamed(true);
        EntityCrowDisguiseJutsu1.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu1.setTamed(true);
        EntityCrowDisguiseJutsu2.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu2.setTamed(true);
        EntityCrowDisguiseJutsu3.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu3.setTamed(true);
        EntityCrowDisguiseJutsu4.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu4.setTamed(true);
        EntityCrowDisguiseJutsu5.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu5.setTamed(true);
        EntityCrowDisguiseJutsu6.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu6.setTamed(true);
        EntityCrowDisguiseJutsu7.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu7.setTamed(true);
        EntityCrowDisguiseJutsu8.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu8.setTamed(true);
        EntityCrowDisguiseJutsu9.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu9.setTamed(true);
        EntityCrowDisguiseJutsu10.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu10.setTamed(true);
        EntityCrowDisguiseJutsu11.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu11.setTamed(true);
        EntityCrowDisguiseJutsu12.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu12.setTamed(true);
        EntityCrowDisguiseJutsu13.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu13.setTamed(true);
        EntityCrowDisguiseJutsu14.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu14.setTamed(true);
        EntityCrowDisguiseJutsu15.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu15.setTamed(true);
        EntityCrowDisguiseJutsu16.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu16.setTamed(true);
        EntityCrowDisguiseJutsu17.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu17.setTamed(true);
        EntityCrowDisguiseJutsu18.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu18.setTamed(true);
        EntityCrowDisguiseJutsu19.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu19.setTamed(true);
        EntityCrowDisguiseJutsu20.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu20.setTamed(true);
        EntityCrowDisguiseJutsu21.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu21.setTamed(true);
        EntityCrowDisguiseJutsu22.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu22.setTamed(true);
        EntityCrowDisguiseJutsu23.func_152115_b(entityLivingBase.getUniqueID().toString());
        EntityCrowDisguiseJutsu23.setTamed(true);
        EntityCrowDisguiseJutsu.setPositionAndRotation(this.hit.posX, this.hit.posY + 1.0D, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu.rotationYawHead = EntityCrowDisguiseJutsu.rotationYaw;
        EntityCrowDisguiseJutsu.renderYawOffset = EntityCrowDisguiseJutsu.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu);
        EntityCrowDisguiseJutsu1.setPositionAndRotation(this.hit.posX, this.hit.posY + 1.0D, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu1.rotationYawHead = EntityCrowDisguiseJutsu1.rotationYaw;
        EntityCrowDisguiseJutsu1.renderYawOffset = EntityCrowDisguiseJutsu1.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu1);
        EntityCrowDisguiseJutsu2.setPositionAndRotation(this.hit.posX, this.hit.posY + 1.0D, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu2.rotationYawHead = EntityCrowDisguiseJutsu2.rotationYaw;
        EntityCrowDisguiseJutsu2.renderYawOffset = EntityCrowDisguiseJutsu2.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu2);
        EntityCrowDisguiseJutsu3.setPositionAndRotation(this.hit.posX, this.hit.posY, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu3.rotationYawHead = EntityCrowDisguiseJutsu3.rotationYaw;
        EntityCrowDisguiseJutsu3.renderYawOffset = EntityCrowDisguiseJutsu3.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu3);
        EntityCrowDisguiseJutsu4.setPositionAndRotation(this.hit.posX, this.hit.posY, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu4.rotationYawHead = EntityCrowDisguiseJutsu4.rotationYaw;
        EntityCrowDisguiseJutsu4.renderYawOffset = EntityCrowDisguiseJutsu4.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu4);
        EntityCrowDisguiseJutsu5.setPositionAndRotation(this.hit.posX, this.hit.posY, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu5.rotationYawHead = EntityCrowDisguiseJutsu5.rotationYaw;
        EntityCrowDisguiseJutsu5.renderYawOffset = EntityCrowDisguiseJutsu5.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu5);
        EntityCrowDisguiseJutsu6.setPositionAndRotation(this.hit.posX, this.hit.posY + 1.0D, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu6.rotationYawHead = EntityCrowDisguiseJutsu6.rotationYaw;
        EntityCrowDisguiseJutsu6.renderYawOffset = EntityCrowDisguiseJutsu6.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu6);
        EntityCrowDisguiseJutsu7.setPositionAndRotation(this.hit.posX, this.hit.posY + 1.0D, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu7.rotationYawHead = EntityCrowDisguiseJutsu7.rotationYaw;
        EntityCrowDisguiseJutsu7.renderYawOffset = EntityCrowDisguiseJutsu7.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu7);
        EntityCrowDisguiseJutsu8.setPositionAndRotation(this.hit.posX, this.hit.posY + 1.0D, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu8.rotationYawHead = EntityCrowDisguiseJutsu8.rotationYaw;
        EntityCrowDisguiseJutsu8.renderYawOffset = EntityCrowDisguiseJutsu8.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu8);
        EntityCrowDisguiseJutsu9.setPositionAndRotation(this.hit.posX, this.hit.posY, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu9.rotationYawHead = EntityCrowDisguiseJutsu9.rotationYaw;
        EntityCrowDisguiseJutsu9.renderYawOffset = EntityCrowDisguiseJutsu9.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu9);
        EntityCrowDisguiseJutsu10.setPositionAndRotation(this.hit.posX, this.hit.posY, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu10.rotationYawHead = EntityCrowDisguiseJutsu10.rotationYaw;
        EntityCrowDisguiseJutsu10.renderYawOffset = EntityCrowDisguiseJutsu10.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu10);
        EntityCrowDisguiseJutsu11.setPositionAndRotation(this.hit.posX, this.hit.posY, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu11.rotationYawHead = EntityCrowDisguiseJutsu11.rotationYaw;
        EntityCrowDisguiseJutsu11.renderYawOffset = EntityCrowDisguiseJutsu11.rotationYaw;
        EntityCrowDisguiseJutsu23.setPositionAndRotation(this.hit.posX, this.hit.posY + 1.0D, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu23.rotationYawHead = EntityCrowDisguiseJutsu23.rotationYaw;
        EntityCrowDisguiseJutsu23.renderYawOffset = EntityCrowDisguiseJutsu23.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu23);
        EntityCrowDisguiseJutsu12.setPositionAndRotation(this.hit.posX, this.hit.posY + 1.0D, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu12.rotationYawHead = EntityCrowDisguiseJutsu12.rotationYaw;
        EntityCrowDisguiseJutsu12.renderYawOffset = EntityCrowDisguiseJutsu12.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu12);
        EntityCrowDisguiseJutsu13.setPositionAndRotation(this.hit.posX, this.hit.posY + 1.0D, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu13.rotationYawHead = EntityCrowDisguiseJutsu13.rotationYaw;
        EntityCrowDisguiseJutsu13.renderYawOffset = EntityCrowDisguiseJutsu13.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu13);
        EntityCrowDisguiseJutsu14.setPositionAndRotation(this.hit.posX, this.hit.posY, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu14.rotationYawHead = EntityCrowDisguiseJutsu14.rotationYaw;
        EntityCrowDisguiseJutsu14.renderYawOffset = EntityCrowDisguiseJutsu14.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu14);
        EntityCrowDisguiseJutsu15.setPositionAndRotation(this.hit.posX, this.hit.posY, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu15.rotationYawHead = EntityCrowDisguiseJutsu15.rotationYaw;
        EntityCrowDisguiseJutsu15.renderYawOffset = EntityCrowDisguiseJutsu15.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu15);
        EntityCrowDisguiseJutsu16.setPositionAndRotation(this.hit.posX, this.hit.posY, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu16.rotationYawHead = EntityCrowDisguiseJutsu16.rotationYaw;
        EntityCrowDisguiseJutsu16.renderYawOffset = EntityCrowDisguiseJutsu16.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu16);
        EntityCrowDisguiseJutsu17.setPositionAndRotation(this.hit.posX, this.hit.posY + 1.0D, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu17.rotationYawHead = EntityCrowDisguiseJutsu17.rotationYaw;
        EntityCrowDisguiseJutsu17.renderYawOffset = EntityCrowDisguiseJutsu17.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu17);
        EntityCrowDisguiseJutsu18.setPositionAndRotation(this.hit.posX, this.hit.posY + 1.0D, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu18.rotationYawHead = EntityCrowDisguiseJutsu18.rotationYaw;
        EntityCrowDisguiseJutsu18.renderYawOffset = EntityCrowDisguiseJutsu18.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu18);
        EntityCrowDisguiseJutsu19.setPositionAndRotation(this.hit.posX, this.hit.posY + 1.0D, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu19.rotationYawHead = EntityCrowDisguiseJutsu19.rotationYaw;
        EntityCrowDisguiseJutsu19.renderYawOffset = EntityCrowDisguiseJutsu19.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu19);
        EntityCrowDisguiseJutsu20.setPositionAndRotation(this.hit.posX, this.hit.posY, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu20.rotationYawHead = EntityCrowDisguiseJutsu20.rotationYaw;
        EntityCrowDisguiseJutsu20.renderYawOffset = EntityCrowDisguiseJutsu20.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu20);
        EntityCrowDisguiseJutsu21.setPositionAndRotation(this.hit.posX, this.hit.posY, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu21.rotationYawHead = EntityCrowDisguiseJutsu21.rotationYaw;
        EntityCrowDisguiseJutsu21.renderYawOffset = EntityCrowDisguiseJutsu21.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu21);
        EntityCrowDisguiseJutsu22.setPositionAndRotation(this.hit.posX, this.hit.posY, this.hit.posZ, this.rotationYaw, 0.0F);
        EntityCrowDisguiseJutsu22.rotationYawHead = EntityCrowDisguiseJutsu22.rotationYaw;
        EntityCrowDisguiseJutsu22.renderYawOffset = EntityCrowDisguiseJutsu22.rotationYaw;
        this.worldObj.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu22);
        if (this.counter == 4)
          setDead(); 
      } 
    } 
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (!this.worldObj.isRemote)
      if (Par1MovingObjectPosition.entityHit != null && Par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        byte amaterasuDamage = 1;
        ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 60, 1));
        Par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), amaterasuDamage);
        if (!this.start) {
          this.start = true;
          this.hit = (EntityLivingBase)Par1MovingObjectPosition.entityHit;
          this.motionX = 0.0D;
          this.motionY = 0.0D;
          this.motionZ = 0.0D;
        } 
      } else {
        setDead();
      }  
  }
}

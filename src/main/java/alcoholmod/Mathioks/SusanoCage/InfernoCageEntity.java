package alcoholmod.Mathioks.SusanoCage;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class InfernoCageEntity extends EntityThrowable {
  public final float scale = 4.0F;
  
  private int ticksInGround;
  
  public InfernoCageEntity(World par1World) {
    super(par1World);
    this.motionX *= 0.0D;
    this.motionY *= 0.0D;
    this.motionZ *= 0.0D;
    this.noClip = true;
    setFire(1000000);
  }
  
  public InfernoCageEntity(World par1World, EntityLivingBase par2Entity) {
    super(par1World, par2Entity);
    this.motionX *= 0.0D;
    this.motionY *= 0.0D;
    this.motionZ *= 0.0D;
    setSize(3.0F, 7.0F);
  }
  
  public InfernoCageEntity(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 0.0D;
    this.motionY *= 0.0D;
    this.motionZ *= 0.0D;
  }
  
  public void onUpdate() {
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    if (this.ticksExisted >= 200)
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
      for (int i = 0; i < 20; i++)
        this.worldObj.spawnParticle("smoke", this.posX + (this.rand.nextDouble() - 0.5D) * this.width, this.posY + this.rand.nextDouble() * this.height - 0.25D, this.posZ + (this.rand.nextDouble() - 0.5D) * this.width, (this.rand.nextDouble() - 0.5D) * 2.0D, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5D) * 2.0D); 
    } 
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 1.0D, this.posY - 0.0D, this.posZ - 1.0D, this.posX + 1.0D, this.posY + 2.0D, this.posZ + 1.0D));
    if (getThrower() != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = getThrower().getUniqueID().toString();
          if (entity instanceof net.minecraft.entity.EntityLiving) {
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 1.0F);
            entity.setFire(80);
          } 
          if (entity instanceof net.minecraft.entity.player.EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 1.0F);
            entity.setFire(30);
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.poison.id, 100, 1));
          } 
        } 
      }  
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  @SideOnly(Side.CLIENT)
  public int getBrightnessForRender(float par1) {
    return 15728880;
  }
  
  public float getBrightness(float par1) {
    return 1.0F;
  }
  
  public boolean canBeCollidedWith() {
    return false;
  }
  
  public boolean canBePushed() {
    return false;
  }
  
  protected void onImpact(MovingObjectPosition p_70184_1_) {}
}

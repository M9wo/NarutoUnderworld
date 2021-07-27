package alcoholmod.Mathioks.HolidayEvents.Easter2018;

import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class Easter2018UnoeufEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 3;
  
  private boolean hit;
  
  private boolean hit2 = false;
  
  private int ticksInGround;
  
  public Easter2018UnoeufEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    setSize(1.0F, 1.0F);
  }
  
  public Easter2018UnoeufEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
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
    if (this.ticksExisted >= 300)
      setDead(); 
    if (this.ticksExisted == 20) {
      this.motionX = 0.0D;
      this.motionY = 0.0D;
      this.motionZ = 0.0D;
    } 
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 5.0D, this.posY - 5.0D, this.posZ - 5.0D, this.posX + 5.0D, this.posY + 5.0D, this.posZ + 5.0D));
    if (getThrower() != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = getThrower().getUniqueID().toString();
          if (entity instanceof EntityLiving) {
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 10.0F);
            ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 400, 2));
            ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 300, 2));
            setDead();
          } 
          if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 10.0F);
            ((EntityPlayer)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 400, 2));
            ((EntityPlayer)entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 300, 2));
            setDead();
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
  
  protected void onImpact(MovingObjectPosition p_70184_1_) {}
}

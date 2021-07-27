package alcoholmod.Mathioks.HolidayEvents.Easter2018;

import java.util.List;
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

public class Easter2018EggsorcismEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 3;
  
  private boolean hit;
  
  private boolean hit2 = false;
  
  private int ticksInGround;
  
  public Easter2018EggsorcismEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    setSize(1.0F, 1.0F);
  }
  
  public Easter2018EggsorcismEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
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
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 5.0D, this.posY - 5.0D, this.posZ - 5.0D, this.posX + 5.0D, this.posY + 5.0D, this.posZ + 5.0D));
    if (getThrower() != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = getThrower().getUniqueID().toString();
          if (entity instanceof EntityLiving) {
            if (getThrower().isPotionActive(Potion.blindness)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 100, 0));
              getThrower().removePotionEffect(Potion.blindness.id);
              setDead();
            } 
            if (getThrower().isPotionActive(Potion.confusion)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 100, 0));
              getThrower().removePotionEffect(Potion.confusion.id);
              setDead();
            } 
            if (getThrower().isPotionActive(Potion.digSlowdown)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 100, 0));
              getThrower().removePotionEffect(Potion.digSlowdown.id);
              setDead();
            } 
            if (getThrower().isPotionActive(Potion.harm)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 100, 0));
              getThrower().removePotionEffect(Potion.harm.id);
              setDead();
            } 
            if (getThrower().isPotionActive(Potion.moveSlowdown)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 0));
              getThrower().removePotionEffect(Potion.moveSlowdown.id);
              setDead();
            } 
            if (getThrower().isPotionActive(Potion.hunger)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.hunger.id, 100, 0));
              getThrower().removePotionEffect(Potion.hunger.id);
              setDead();
            } 
            if (getThrower().isPotionActive(Potion.poison)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.poison.id, 100, 0));
              getThrower().removePotionEffect(Potion.poison.id);
              setDead();
            } 
            if (getThrower().isPotionActive(Potion.weakness)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 100, 0));
              getThrower().removePotionEffect(Potion.weakness.id);
              setDead();
            } 
            if (getThrower().isPotionActive(Potion.wither)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.wither.id, 100, 0));
              getThrower().removePotionEffect(Potion.wither.id);
              setDead();
            } 
          } 
          if (entity instanceof net.minecraft.entity.player.EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
            if (getThrower().isPotionActive(Potion.blindness)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 100, 0));
              getThrower().removePotionEffect(Potion.blindness.id);
              setDead();
            } 
            if (getThrower().isPotionActive(Potion.confusion)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 100, 0));
              getThrower().removePotionEffect(Potion.confusion.id);
              setDead();
            } 
            if (getThrower().isPotionActive(Potion.digSlowdown)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 100, 0));
              getThrower().removePotionEffect(Potion.digSlowdown.id);
              setDead();
            } 
            if (getThrower().isPotionActive(Potion.harm)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 100, 0));
              getThrower().removePotionEffect(Potion.harm.id);
              setDead();
            } 
            if (getThrower().isPotionActive(Potion.moveSlowdown)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 0));
              getThrower().removePotionEffect(Potion.moveSlowdown.id);
              setDead();
            } 
            if (getThrower().isPotionActive(Potion.hunger)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.hunger.id, 100, 0));
              getThrower().removePotionEffect(Potion.hunger.id);
              setDead();
            } 
            if (getThrower().isPotionActive(Potion.poison)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.poison.id, 100, 0));
              getThrower().removePotionEffect(Potion.poison.id);
              setDead();
            } 
            if (getThrower().isPotionActive(Potion.weakness)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 100, 0));
              getThrower().removePotionEffect(Potion.weakness.id);
              setDead();
            } 
            if (getThrower().isPotionActive(Potion.wither)) {
              ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.wither.id, 100, 0));
              getThrower().removePotionEffect(Potion.wither.id);
              setDead();
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
  
  protected void onImpact(MovingObjectPosition p_70184_1_) {}
}

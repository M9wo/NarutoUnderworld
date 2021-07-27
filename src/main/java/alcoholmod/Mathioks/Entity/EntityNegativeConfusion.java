package alcoholmod.Mathioks.Entity;

import alcoholmod.Mathioks.ExtendedPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityNegativeConfusion extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private int ticksInGround;
  
  public EntityNegativeConfusion(World Par1World) {
    super(Par1World);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityNegativeConfusion(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityNegativeConfusion(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (getThrower() instanceof EntityPlayer) {
      EntityPlayer player = (EntityPlayer)getThrower();
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (Par1MovingObjectPosition.entityHit != null) {
        if (Par1MovingObjectPosition.entityHit instanceof EntityPlayer) {
          ExtendedPlayer propsSource = ExtendedPlayer.get((EntityPlayer)Par1MovingObjectPosition.entityHit);
          if (propsSource.getGenjutsu() < props.getGenjutsu() + 30 && 
            propsSource.getSharingan() >= 1 && 
            propsSource.getGenjutsu() < props.getGenjutsu() + 5)
            ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.confusion.id, 1000, 2500)); 
        } 
        if (!this.worldObj.isRemote)
          setDead(); 
      } 
    } else if (Par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.confusion.id, 200, 10));
      Par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 6.0F);
    } 
  }
}

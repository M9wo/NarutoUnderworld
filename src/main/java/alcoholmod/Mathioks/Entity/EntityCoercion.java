package alcoholmod.Mathioks.Entity;

import alcoholmod.Mathioks.ExtendedPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityCoercion extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private int ticksInGround;
  
  public EntityCoercion(World Par1World) {
    super(Par1World);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityCoercion(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  public EntityCoercion(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 100.0D;
    this.motionY *= 100.0D;
    this.motionZ *= 100.0D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    EntityPlayer player = (EntityPlayer)getThrower();
    ExtendedPlayer props = ExtendedPlayer.get(player);
    if (Par1MovingObjectPosition.entityHit != null) {
      if (Par1MovingObjectPosition.entityHit instanceof EntityPlayer) {
        ExtendedPlayer propsSource = ExtendedPlayer.get((EntityPlayer)Par1MovingObjectPosition.entityHit);
        if (propsSource.getGenjutsu() >= props.getGenjutsu() + 30) {
          System.out.print("IT WORKS, IS BIGGER");
        } else if (propsSource.getSharingan() >= 1) {
          if (propsSource.getGenjutsu() >= props.getGenjutsu() + 5) {
            System.out.print("IT WORKS, IS BIGGER");
          } else {
            ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 60, 100));
            ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.blindness.id, 20, 100));
            ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.weakness.id, 60, 4));
          } 
        } else {
          ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 60, 100));
          ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.blindness.id, 20, 100));
          ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.weakness.id, 60, 4));
        } 
      } else {
        ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 60, 100));
        ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.blindness.id, 20, 100));
        ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.weakness.id, 60, 4));
      } 
      if (!this.worldObj.isRemote)
        setDead(); 
    } 
  }
}

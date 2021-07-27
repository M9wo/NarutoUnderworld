package alcoholmod.Mathioks.item;

import alcoholmod.Mathioks.ExtendedPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySmokeGun extends EntityThrowable {
  public EntitySmokeGun(World par1World) {
    super(par1World);
  }
  
  public EntitySmokeGun(World par1World, EntityPlayer par3EntityPlayer) {
    super(par1World, (EntityLivingBase)par3EntityPlayer);
  }
  
  public EntitySmokeGun(World par1World, double par2, double par4, double par6) {
    super(par1World, par2, par4, par6);
  }
  
  public void onEntityUpdate() {
    if (this.ticksExisted == 100)
      setDead(); 
    for (int i = 0; i < 10; i++)
      this.worldObj.spawnParticle("cloud", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D); 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (getThrower() != null) {
      EntityPlayer player = (EntityPlayer)getThrower();
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (par1MovingObjectPosition.entityHit != null)
        par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 12.0F + (props.getNinjutsu() / 300)); 
    } 
    if (!this.worldObj.isRemote)
      setDead(); 
  }
  
  protected float getGravityVelocity() {
    return 0.001F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    this.worldObj.spawnParticle("explode", this.posX + 0.2D, this.posY, this.posZ, 0.0D, 0.2D, 0.0D);
    this.worldObj.spawnParticle("explode", this.posX - 0.2D, this.posY, this.posZ, 0.0D, 0.0D, 0.2D);
    this.worldObj.spawnParticle("explode", this.posX, this.posY + 0.3D, this.posZ, 0.0D, 0.2D, 0.0D);
    this.worldObj.spawnParticle("explode", this.posX, this.posY - 0.4D, this.posZ, 0.2D, 0.0D, 0.0D);
    this.worldObj.spawnParticle("explode", this.posX + 0.1D, this.posY, this.posZ, 0.2D, 0.0D, 0.0D);
    this.worldObj.spawnParticle("explode", this.posX + 0.2D, this.posY - 0.3D, this.posZ, 0.0D, 0.2D, 0.0D);
    this.worldObj.spawnParticle("explode", this.posX - 0.2D, this.posY + 0.1D, this.posZ, 0.0D, 0.0D, 0.2D);
    this.worldObj.spawnParticle("explode", this.posX - 0.4D, this.posY + 0.2D, this.posZ, 0.0D, 0.2D, 0.0D);
    this.worldObj.spawnParticle("explode", this.posX - 0.1D, this.posY - 0.2D, this.posZ, 0.2D, 0.0D, 0.0D);
    this.worldObj.spawnParticle("explode", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
    this.worldObj.spawnParticle("explode", this.posX + 0.5D, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
    this.worldObj.spawnParticle("explode", this.posX - 0.5D, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
    this.worldObj.spawnParticle("explode", this.posX, this.posY, this.posZ - 0.5D, 0.0D, 0.0D, 0.0D);
  }
}

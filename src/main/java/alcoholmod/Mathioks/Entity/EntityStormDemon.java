package alcoholmod.Mathioks.Entity;

import alcoholmod.Mathioks.ExtendedPlayer;
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

public class EntityStormDemon extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private int counter = 0;
  
  private int ticksInGround;
  
  public EntityStormDemon(World Par1World) {
    super(Par1World);
    this.motionX *= 0.2D;
    this.motionY *= 0.2D;
    this.motionZ *= 0.2D;
    setSize(0.25F, 0.25F);
    setSize(0.25F, 0.25F);
  }
  
  public EntityStormDemon(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.2D;
    this.motionY *= 0.2D;
    this.motionZ *= 0.2D;
    setSize(0.25F, 0.25F);
  }
  
  public EntityStormDemon(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 0.2D;
    this.motionY *= 0.2D;
    this.motionZ *= 0.2D;
    setSize(0.25F, 0.25F);
    setSize(0.25F, 0.25F);
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.ticksExisted >= 100)
      setDead(); 
    if (this.ticksExisted % 20 == 0 && !this.isDead && 
      getThrower() instanceof EntityPlayer) {
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)getThrower());
      if (props.getCurrentMana() >= 25) {
        props.consumeMana(25);
      } else {
        props.consumeMana(props.getCurrentMana());
        setDead();
      } 
    } 
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 6.0D, this.posY - 12.0D, this.posZ - 6.0D, this.posX + 6.0D, this.posY + 6.0D, this.posZ + 6.0D));
    if (getThrower() != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = getThrower().getUniqueID().toString();
          if (entity instanceof EntityLiving) {
            ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40, 5));
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 1.0F);
          } 
          if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40, 5));
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 1.0F);
          } 
        } 
      }  
    float f3 = 5.25F;
    int i;
    for (i = 0; i < 30; i++) {
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
    for (i = 0; i < 6; i++) {
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY + 1.0D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + 1.0D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
    } 
    for (i = 0; i < 400; i++) {
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY + this.rand.nextGaussian() * 0.25D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian(), this.posY + 1.0D + this.rand.nextGaussian() * 0.25D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + this.rand.nextGaussian() * 0.25D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("smoke", this.posX + this.rand.nextGaussian() * 2.0D, this.posY + 1.0D + this.rand.nextGaussian() * 0.25D, this.posZ + this.rand.nextGaussian() * 2.0D, 0.0D, 0.0D, 0.0D);
    } 
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && par1MovingObjectPosition.entityHit != null)
      par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 8.0F); 
  }
}

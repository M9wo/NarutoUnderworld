package alcoholmod.Mathioks.Final.ClanJutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class UzumakiAdamantineChainsEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  public boolean Storm = false;
  
  private int explosionRadius = 1;
  
  private int ticksInGround;
  
  public UzumakiAdamantineChainsEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    setSize(0.2F, 0.2F);
  }
  
  public UzumakiAdamantineChainsEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
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
    this.ticksInGround++;
    if (!this.worldObj.isRemote) {
      this.posX += this.motionX;
      this.posY += this.motionY;
      this.posZ += this.motionZ;
      if (this.ticksExisted >= 50)
        setDead(); 
    } 
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 1.0D, this.posY - 1.0D, this.posZ - 1.0D, this.posX + 1.0D, this.posY + 1.0D, this.posZ + 1.0D));
    if (getThrower() != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = getThrower().getUniqueID().toString();
          if (entity instanceof net.minecraft.entity.EntityLiving && entity instanceof EntityLivingBase) {
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 100));
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.jump.id, 100, -5));
          } 
          if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 100));
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.jump.id, 100, -5));
            EntityPlayer player = (EntityPlayer)entity;
            ExtendedPlayer props = ExtendedPlayer.get(player);
            if (this.ticksInGround >= 20) {
              props.consumeMana(1);
              this.ticksInGround = 0;
            } 
          } 
          if (entity instanceof alcoholmod.Mathioks.Final.CT.LightningReleaseChidoriSharpSpearEntity)
            setDead(); 
          if (entity instanceof UzumakiAdamantineChainsEntity)
            setDead(); 
        } 
      }  
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote);
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
}

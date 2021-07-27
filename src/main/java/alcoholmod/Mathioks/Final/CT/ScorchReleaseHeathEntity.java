package alcoholmod.Mathioks.Final.CT;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ScorchReleaseHeathEntity extends EntityThrowable implements IMob {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 20;
  
  private int ticksInGround;
  
  public ScorchReleaseHeathEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.4D;
    this.motionY *= 0.4D;
    this.motionZ *= 0.4D;
    setSize(1.0F, 1.0F);
  }
  
  public ScorchReleaseHeathEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.4D;
    this.motionY *= 0.4D;
    this.motionZ *= 0.4D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (!this.worldObj.isRemote && this.ticksExisted >= 270)
      setDead(); 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        par1MovingObjectPosition.entityHit.setPositionAndRotation(this.posX, this.posY + 10.0D, this.posZ, this.rotationYaw, this.rotationPitch);
        float var4 = 1.0F;
        par1MovingObjectPosition.entityHit.setFire(40);
        if (par1MovingObjectPosition.entityHit instanceof EntityPlayerMP && !this.worldObj.isRemote)
          ((EntityPlayerMP)par1MovingObjectPosition.entityHit).playerNetServerHandler.sendPacket((Packet)new S12PacketEntityVelocity(par1MovingObjectPosition.entityHit)); 
        ((EntityLivingBase)par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 150, 300));
        ((EntityLivingBase)par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.jump.id, 150, -300));
        ((EntityLivingBase)par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.hunger.id, -200, 100));
        setDead();
      } 
      if (!this.worldObj.isRemote);
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
}

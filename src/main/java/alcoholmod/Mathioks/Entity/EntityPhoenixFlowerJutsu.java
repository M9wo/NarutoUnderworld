package alcoholmod.Mathioks.Entity;

import alcoholmod.Mathioks.ExtendedPlayer;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityPhoenixFlowerJutsu extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private boolean Water;
  
  int deathcounter;
  
  public int explosionRadius = 5;
  
  private EntityLivingBase thrower;
  
  private String throwerName;
  
  private int field_145788_c = -1;
  
  private int field_145786_d = -1;
  
  private int field_145787_e = -1;
  
  private Block field_145785_f;
  
  private int ticksInGround;
  
  public EntityPhoenixFlowerJutsu(World Par1World) {
    super(Par1World);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    setSize(0.5F, 0.5F);
  }
  
  public EntityPhoenixFlowerJutsu(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    this.thrower = Par5EntityLivingBase;
  }
  
  public EntityPhoenixFlowerJutsu(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
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
    float f3 = 5.25F;
    if (isInWater())
      setDead(); 
    if (isWet())
      setDead(); 
    for (int i = 0; i < 36; i++) {
      super.onUpdate();
      this.worldObj.spawnParticle("flame", this.posX + 0.2D, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("flame", this.posX - 0.2D, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("flame", this.posX, this.posY + 0.3D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("flame", this.posX, this.posY - 0.4D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("flame", this.posX + 0.1D, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("flame", this.posX - 0.1D, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("flame", this.posX + 0.2D, this.posY - 0.3D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("flame", this.posX + 0.4D, this.posY - 0.2D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("flame", this.posX + 0.4D, this.posY - 0.2D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("flame", this.posX - 0.2D, this.posY + 0.1D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("flame", this.posX - 0.4D, this.posY + 0.2D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("flame", this.posX - 0.1D, this.posY - 0.2D, this.posZ, 0.0D, 0.0D, 0.0D);
    } 
    this.deathcounter++;
    if (this.deathcounter >= 120)
      setDead(); 
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (Par1MovingObjectPosition.entityHit != null && Par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      float Damage = 5.0F;
      if (getThrower() instanceof EntityPlayer) {
        EntityPlayer player = (EntityPlayer)getThrower();
        ExtendedPlayer props = ExtendedPlayer.get(player);
        float DamagePlayer = (float)(Damage + Damage * 0.001D * props.getLevel());
        Par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), DamagePlayer);
      } else {
        Par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), Damage);
      } 
      setDead();
    } else {
      int i = Par1MovingObjectPosition.blockX;
      int j = Par1MovingObjectPosition.blockY;
      int k = Par1MovingObjectPosition.blockZ;
      if (this.worldObj.getBlock(i, j, k) == Blocks.water)
        setDead(); 
    } 
    setDead();
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
  
  public EntityLivingBase getThrower() {
    if (this.thrower == null && this.throwerName != null && this.throwerName.length() > 0)
      this.thrower = (EntityLivingBase)this.worldObj.getPlayerEntityByName(this.throwerName); 
    return this.thrower;
  }
}

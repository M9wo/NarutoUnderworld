package alcoholmod.Mathioks.Entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityLavaAshStone extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private boolean Water;
  
  int deathcounter;
  
  private boolean Hit;
  
  public int explosionRadius = 5;
  
  private EntityLivingBase thrower;
  
  private String throwerName;
  
  private int field_145788_c = -1;
  
  private int field_145786_d = -1;
  
  private int field_145787_e = -1;
  
  private Block field_145785_f;
  
  private int ticksInGround;
  
  public EntityLavaAshStone(World Par1World) {
    super(Par1World);
    this.motionX *= 0.6D;
    this.motionY *= 0.6D;
    this.motionZ *= 0.6D;
  }
  
  public EntityLavaAshStone(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.6D;
    this.motionY *= 0.6D;
    this.motionZ *= 0.6D;
    this.thrower = Par5EntityLivingBase;
  }
  
  public EntityLavaAshStone(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 0.6D;
    this.motionY *= 0.6D;
    this.motionZ *= 0.6D;
  }
  
  public void onUpdate() {
    super.onUpdate();
    float f3 = 5.25F;
    for (int i = 0; i < 40; i++) {
      super.onUpdate();
      this.worldObj.spawnParticle("largesmoke", this.posX + 0.2D, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX - 0.2D, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX, this.posY + 0.3D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX, this.posY - 0.4D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX + 0.1D, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX - 0.1D, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX + 0.2D, this.posY - 0.3D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX + 0.4D, this.posY - 0.2D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX + 0.4D, this.posY - 0.2D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX - 0.2D, this.posY + 0.1D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX - 0.4D, this.posY + 0.2D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX - 0.1D, this.posY - 0.2D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX + 0.2D, this.posY + 1.0D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX - 0.2D, this.posY + 1.0D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX, this.posY + 1.0D + 0.3D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX, this.posY + 1.0D - 0.4D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX + 0.1D, this.posY + 1.0D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX - 0.1D, this.posY + 1.0D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX + 0.2D, this.posY + 1.0D - 0.3D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX + 0.4D, this.posY + 1.0D - 0.2D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX + 0.4D, this.posY + 1.0D - 0.2D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX - 0.2D, this.posY + 1.0D + 0.1D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX - 0.4D, this.posY + 1.0D + 0.2D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("largesmoke", this.posX - 0.1D, this.posY + 1.0D - 0.2D, this.posZ, 0.0D, 0.0D, 0.0D);
    } 
    this.deathcounter++;
    if (this.deathcounter >= 200)
      setDead(); 
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (Par1MovingObjectPosition.entityHit != null && Par1MovingObjectPosition.entityHit instanceof EntityLivingBase && Par1MovingObjectPosition.entityHit != getThrower()) {
      ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 200, 10));
      ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.jump.id, -200, 10));
    } else {
      setDead();
    } 
  }
  
  public void writeEntityToNBT(NBTTagCompound p_70014_1_) {
    p_70014_1_.setShort("xTile", (short)this.field_145788_c);
    p_70014_1_.setShort("yTile", (short)this.field_145786_d);
    p_70014_1_.setShort("zTile", (short)this.field_145787_e);
    p_70014_1_.setByte("inTile", (byte)Block.getIdFromBlock(this.field_145785_f));
    p_70014_1_.setByte("shake", (byte)this.throwableShake);
    p_70014_1_.setByte("inGround", (byte)(this.inGround ? 1 : 0));
    if ((this.throwerName == null || this.throwerName.length() == 0) && this.thrower != null && this.thrower instanceof net.minecraft.entity.player.EntityPlayer)
      this.throwerName = this.thrower.getCommandSenderName(); 
    p_70014_1_.setString("ownerName", (this.throwerName == null) ? "" : this.throwerName);
  }
  
  public void readEntityFromNBT(NBTTagCompound p_70037_1_) {
    this.field_145788_c = p_70037_1_.getShort("xTile");
    this.field_145786_d = p_70037_1_.getShort("yTile");
    this.field_145787_e = p_70037_1_.getShort("zTile");
    this.field_145785_f = Block.getBlockById(p_70037_1_.getByte("inTile") & 0xFF);
    this.throwableShake = p_70037_1_.getByte("shake") & 0xFF;
    this.inGround = (p_70037_1_.getByte("inGround") == 1);
    this.throwerName = p_70037_1_.getString("ownerName");
    if (this.throwerName != null && this.throwerName.length() == 0)
      this.throwerName = null; 
  }
  
  public EntityLivingBase getThrower() {
    if (this.thrower == null && this.throwerName != null && this.throwerName.length() > 0)
      this.thrower = (EntityLivingBase)this.worldObj.getPlayerEntityByName(this.throwerName); 
    return this.thrower;
  }
}

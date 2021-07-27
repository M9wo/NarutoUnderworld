package alcoholmod.Mathioks.Kinjutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityCurseMandala extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private boolean Water;
  
  int deathcounter;
  
  public int explosionRadius = 10;
  
  private EntityLivingBase thrower;
  
  private String throwerName;
  
  private int field_145788_c = -1;
  
  private int field_145786_d = -1;
  
  private int field_145787_e = -1;
  
  private Block field_145785_f;
  
  private boolean start = false;
  
  public EntityLivingBase hit;
  
  private int count = 0;
  
  private int ticksInGround;
  
  public EntityCurseMandala(World Par1World) {
    super(Par1World);
    this.motionX *= 0.3D;
    this.motionY *= 0.3D;
    this.motionZ *= 0.3D;
    setSize(0.25F, 0.25F);
    setSize(0.25F, 0.25F);
  }
  
  public EntityCurseMandala(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.3D;
    this.motionY *= 0.3D;
    this.motionZ *= 0.3D;
    setSize(0.25F, 0.25F);
    this.thrower = Par5EntityLivingBase;
  }
  
  public EntityCurseMandala(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 0.3D;
    this.motionY *= 0.3D;
    this.motionZ *= 0.3D;
    setSize(0.25F, 0.25F);
    setSize(0.25F, 0.25F);
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
    if (this.start) {
      this.posX = this.hit.posX;
      this.posY = this.hit.posY;
      this.posZ = this.hit.posZ;
      this.motionX = 0.0D;
      this.motionY = 0.0D;
      this.motionZ = 0.0D;
      this.count++;
      if (getThrower() != null && !(getThrower()).worldObj.isRemote) {
        this.hit.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 11, 100));
        this.hit.addPotionEffect(new PotionEffect(Potion.jump.id, 11, -3));
        getThrower().addPotionEffect(new PotionEffect(Potion.jump.id, 11, -3));
        if (this.count >= 250)
          if (this.hit instanceof EntityPlayer) {
            ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)getThrower());
            ExtendedPlayer props2 = ExtendedPlayer.get((EntityPlayer)this.hit);
            int i = props.getHealth() + (int)(props.getSpeed() * 200.0D - 20.0D) + (int)(props.getKenjutsu() * 50.0D - 50.0D) + props.getShurikenjutsu() + (int)(props.getTaijutsu() * 50.0D - 50.0D) + props.getGenjutsu() + props.getSummoning() + props.getIntelligence() + props.getKinjutsu() + props.getMaxMana() / 5 - 5 + props.getMaxSenjutsu() / 5;
            int b = props2.getHealth() + (int)(props2.getSpeed() * 200.0D - 20.0D) + (int)(props2.getKenjutsu() * 50.0D - 50.0D) + props2.getShurikenjutsu() + (int)(props2.getTaijutsu() * 50.0D - 50.0D) + props2.getGenjutsu() + props2.getSummoning() + props2.getIntelligence() + props2.getKinjutsu() + props2.getMaxMana() / 5 - 5 + props2.getMaxSenjutsu() / 5;
            if (i - b >= -30) {
              this.hit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 25.0F);
              setDead();
            } else {
              this.worldObj.newExplosion((Entity)this.hit, this.posX, this.posY, this.posZ, this.explosionRadius, false, false);
              setDead();
            } 
          } else {
            ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)getThrower());
            int i = props.getHealth() + (int)(props.getSpeed() * 200.0D - 20.0D) + (int)(props.getKenjutsu() * 50.0D - 50.0D) + props.getShurikenjutsu() + (int)(props.getTaijutsu() * 50.0D - 50.0D) + props.getGenjutsu() + props.getSummoning() + props.getIntelligence() + props.getKinjutsu() + props.getMaxMana() / 5 - 5 + props.getMaxSenjutsu() / 5;
            if (i - 80 >= -30) {
              this.hit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 25.0F);
              setDead();
            } else {
              this.worldObj.newExplosion((Entity)this.hit, this.posX, this.posY, this.posZ, this.explosionRadius, false, false);
              setDead();
            } 
          }  
      } 
    } 
    int rand = this.worldObj.rand.nextInt(12);
    for (int a = 0; a < 10; a++) {
      super.onUpdate();
      this.worldObj.spawnParticle("crit", this.posX + this.rand.nextGaussian(), this.posY, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("crit", this.posX + this.rand.nextGaussian(), this.posY, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("crit", this.posX + this.rand.nextGaussian(), this.posY + 1.0D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("crit", this.posX + this.rand.nextGaussian(), this.posY + 1.0D, this.posZ + this.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
    } 
    this.deathcounter++;
    if (this.deathcounter >= 350)
      setDead(); 
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase && par1MovingObjectPosition.entityHit != getThrower()) {
      this.start = true;
      this.hit = (EntityLivingBase)par1MovingObjectPosition.entityHit;
    } 
    if (!this.worldObj.isRemote) {
      int i = par1MovingObjectPosition.blockX;
      int j = par1MovingObjectPosition.blockY;
      int k = par1MovingObjectPosition.blockZ;
    } 
  }
}

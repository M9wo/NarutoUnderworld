package alcoholmod.Mathioks.Final.ClanJutsu;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class AburameInsectBogEntity extends EntityThrowable {
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
  
  public AburameInsectBogEntity(World Par1World) {
    super(Par1World);
    this.motionX *= 0.06D;
    this.motionY *= 0.06D;
    this.motionZ *= 0.06D;
    setSize(0.25F, 0.25F);
    setSize(0.25F, 0.25F);
  }
  
  public AburameInsectBogEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.06D;
    this.motionY *= 0.06D;
    this.motionZ *= 0.06D;
    setSize(0.25F, 0.25F);
    this.thrower = Par5EntityLivingBase;
  }
  
  public AburameInsectBogEntity(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 0.06D;
    this.motionY *= 0.06D;
    this.motionZ *= 0.06D;
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
    int rand = this.worldObj.rand.nextInt(12);
    this.deathcounter++;
    if (this.deathcounter >= 200)
      setDead(); 
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 3.0D, this.posY - 3.0D, this.posZ - 3.0D, this.posX + 3.0D, this.posY + 3.0D, this.posZ + 3.0D));
    if (getThrower() != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = getThrower().getUniqueID().toString();
          if (entity instanceof EntityLiving) {
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 5.0F);
            ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.poison.id, 200, 0));
          } 
          if (entity instanceof net.minecraft.entity.player.EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 5.0F);
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.poison.id, 200, 0));
          } 
        } 
      }  
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      int i = par1MovingObjectPosition.blockX;
      int j = par1MovingObjectPosition.blockY;
      int k = par1MovingObjectPosition.blockZ;
    } 
  }
}

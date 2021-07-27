package alcoholmod.Mathioks.Entity;

import alcoholmod.Mathioks.block.Blockss;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityNaraNeckBind extends EntityThrowable {
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
  
  int deathcount = 0;
  
  private int ticksInGround;
  
  public EntityNaraNeckBind(World Par1World) {
    super(Par1World);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    setSize(0.25F, 0.25F);
    setSize(0.25F, 0.25F);
  }
  
  public EntityNaraNeckBind(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
    setSize(0.25F, 0.25F);
    this.thrower = Par5EntityLivingBase;
  }
  
  public EntityNaraNeckBind(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
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
    this.deathcounter++;
    if (this.deathcounter >= 100)
      setDead(); 
    List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 1.0D, this.posY - 1.0D, this.posZ - 1.0D, this.posX + 1.0D, this.posY + 1.0D, this.posZ + 1.0D));
    if (getThrower() != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!this.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = getThrower().getUniqueID().toString();
          if (entity instanceof net.minecraft.entity.EntityLiving && (
            this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset - this.yOffset), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset - this.yOffset), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset - 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset - 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset - 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset - 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset - 1.0D - this.yOffset), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset - 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset - 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset - 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset - 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset + 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset + 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset + 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset + 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset + 1.0D - this.yOffset), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset + 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset + 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset + 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset + 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock))
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)getThrower(), (Entity)getThrower()), 2.0F); 
          if (entity instanceof net.minecraft.entity.player.EntityPlayer && !entity.getUniqueID().toString().equals(user) && (this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - this.yOffset), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - 1.0D - this.yOffset), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY - 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY + 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY + 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY + 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY + 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY + 1.0D - this.yOffset), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY + 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY + 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY + 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock || this.worldObj.getBlock(MathHelper.floor_double(entity.posX), MathHelper.floor_double(entity.posY + 1.0D), MathHelper.floor_double(entity.posZ)) == Blockss.naraShadowBlock))
            entity.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), 1.0F); 
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

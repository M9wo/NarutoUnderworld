package alcoholmod.Mathioks.FinalUtilities;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class SubstitutionUtil extends EntityThrowable {
  private EntityPlayer player;
  
  private static final String __OBFID = "CL_00001725";
  
  public SubstitutionUtil(World p_i1782_1_) {
    super(p_i1782_1_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  protected float getGravityVelocity() {
    return 4.0F;
  }
  
  public SubstitutionUtil(World p_i1783_1_, EntityLivingBase p_i1783_2_) {
    super(p_i1783_1_, p_i1783_2_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  @SideOnly(Side.CLIENT)
  public SubstitutionUtil(World p_i1784_1_, double p_i1784_2_, double p_i1784_4_, double p_i1784_6_) {
    super(p_i1784_1_, p_i1784_2_, p_i1784_4_, p_i1784_6_);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  protected void onImpact(MovingObjectPosition p_70184_1_) {
    if (p_70184_1_.entityHit != null);
    if (!this.worldObj.isRemote && getThrower() != null && getThrower() instanceof EntityPlayerMP) {
      EntityPlayerMP entityplayermp = (EntityPlayerMP)getThrower();
      if (entityplayermp.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp.worldObj == this.worldObj) {
        Vec3 vec3 = Vec3.createVectorHelper(this.posX - entityplayermp.posX, this.boundingBox.minY + (this.height / 2.0F) - entityplayermp.posY + entityplayermp.getEyeHeight(), this.posZ - entityplayermp.posZ);
        vec3 = vec3.normalize();
        double d0 = 16.0D;
        double d1 = entityplayermp.posX + (entityplayermp.worldObj.rand.nextDouble() - 0.5D) * 64.0D;
        double d2 = entityplayermp.posY + (entityplayermp.worldObj.rand.nextInt(64) - 32);
        double d3 = entityplayermp.posZ + (entityplayermp.worldObj.rand.nextDouble() - 0.5D) * 64.0D;
        teleportTo(d1, d2, d3);
      } 
    } 
    setDead();
  }
  
  protected boolean teleportTo(double p_70825_1_, double p_70825_3_, double p_70825_5_) {
    EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)this.player, p_70825_1_, p_70825_3_, p_70825_5_, 0.0F);
    if (MinecraftForge.EVENT_BUS.post((Event)event))
      return false; 
    double d3 = this.posX;
    double d4 = this.posY;
    double d5 = this.posZ;
    this.posX = event.targetX;
    this.posY = event.targetY;
    this.posZ = event.targetZ;
    boolean flag = false;
    int i = MathHelper.floor_double(this.posX);
    int j = MathHelper.floor_double(this.posY);
    int k = MathHelper.floor_double(this.posZ);
    if (this.worldObj.blockExists(i, j, k)) {
      boolean flag1 = false;
      while (!flag1 && j > 0) {
        Block block = this.worldObj.getBlock(i, j - 1, k);
        if (block.getMaterial().blocksMovement()) {
          flag1 = true;
          continue;
        } 
        this.posY--;
        j--;
      } 
      if (flag1) {
        setPosition(this.posX, this.posY, this.posZ);
        if (this.worldObj.getCollidingBoundingBoxes((Entity)this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox))
          flag = true; 
      } 
    } 
    if (!flag) {
      setPosition(d3, d4, d5);
      return false;
    } 
    short short1 = 128;
    for (int l = 0; l < short1; l++) {
      double d6 = l / (short1 - 1.0D);
      float f = (this.rand.nextFloat() - 0.5F) * 0.2F;
      float f1 = (this.rand.nextFloat() - 0.5F) * 0.2F;
      float f2 = (this.rand.nextFloat() - 0.5F) * 0.2F;
      double d7 = d3 + (this.posX - d3) * d6 + (this.rand.nextDouble() - 0.5D) * this.width * 2.0D;
      double d8 = d4 + (this.posY - d4) * d6 + this.rand.nextDouble() * this.height;
      double d9 = d5 + (this.posZ - d5) * d6 + (this.rand.nextDouble() - 0.5D) * this.width * 2.0D;
      this.worldObj.spawnParticle("portal", d7, d8, d9, f, f1, f2);
    } 
    this.worldObj.playSoundEffect(d3, d4, d5, "mob.endermen.portal", 1.0F, 1.0F);
    playSound("mob.endermen.portal", 1.0F, 1.0F);
    return true;
  }
}

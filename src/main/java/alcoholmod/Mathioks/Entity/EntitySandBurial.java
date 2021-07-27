package alcoholmod.Mathioks.Entity;

import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

public class EntitySandBurial extends EntityThrowable {
  private static final String __OBFID = "CL_00001722";
  
  private boolean Falling = false;
  
  private int Fall = 0;
  
  EntityLivingBase hit;
  
  private int ticksInGround;
  
  public EntitySandBurial(World Par1World) {
    super(Par1World);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public EntitySandBurial(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 1.0D;
    this.motionY *= 1.0D;
    this.motionZ *= 1.0D;
  }
  
  public EntitySandBurial(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
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
    this.posX += this.motionX;
    this.posY += this.motionY;
    this.posZ += this.motionZ;
    float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
    this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);
    float f3 = 3.25F;
    if (this.ticksExisted >= 500)
      setDead(); 
    int i;
    for (i = 0; i < 24; i++)
      this.worldObj.spawnParticle("crit", this.posX - this.motionX * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.posY - this.motionY * f3 - 0.5D, this.posZ - this.motionZ * f3 + this.rand.nextDouble() * 0.6D - 0.3D, this.motionX, this.motionY, this.motionZ); 
    if (this.Fall >= 98 && this.hit != null)
      if (this.hit instanceof EntityPlayerMP && this.hit != null) {
        EntityPlayerMP entityplayermp2 = (EntityPlayerMP)this.hit;
        if (entityplayermp2.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp2.worldObj == this.worldObj) {
          EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)entityplayermp2, this.posX, this.posY + 1.0D, this.posZ, 5.0F);
          if (!MinecraftForge.EVENT_BUS.post((Event)event)) {
            if (this.hit.isRiding())
              this.hit.mountEntity((Entity)null); 
            EntityLivingBase hitentity = this.hit;
            hitentity.setPositionAndUpdate(this.posX, this.posY - 3.0D, this.posZ);
            hitentity.fallDistance = 0.0F;
          } 
        } 
      } else if (!(this.hit instanceof EntityPlayerMP) && this.hit instanceof EntityLivingBase && this.hit != null) {
        this.hit.setPosition(this.posX, this.posY - 3.0D, this.posZ);
        this.hit.fallDistance = 0.0F;
      }  
    if (this.Falling)
      this.Fall++; 
    if (this.Fall == 5) {
      i = MathHelper.floor_double(this.posX);
      int j = MathHelper.floor_double(this.posY);
      int k = MathHelper.floor_double(this.posZ);
      this.worldObj.setBlock(i, j + 7, k, Blocks.sandstone);
      this.worldObj.setBlock(i, j + 7, k + 1, Blocks.sandstone);
      this.worldObj.setBlock(i, j + 7, k - 1, Blocks.sandstone);
      this.worldObj.setBlock(i + 1, j + 7, k, Blocks.sandstone);
      this.worldObj.setBlock(i - 1, j + 7, k, Blocks.sandstone);
      this.worldObj.setBlock(i + 1, j + 7, k + 1, Blocks.sandstone);
      this.worldObj.setBlock(i - 1, j + 7, k - 1, Blocks.sandstone);
      this.worldObj.setBlock(i + 1, j + 7, k - 1, Blocks.sandstone);
      this.worldObj.setBlock(i - 1, j + 7, k + 1, Blocks.sandstone);
      this.worldObj.setBlock(i, j + 8, k + 0, Blocks.sandstone);
      this.worldObj.setBlock(i, j + 8, k + 1, Blocks.sandstone);
      this.worldObj.setBlock(i, j + 8, k - 1, Blocks.sandstone);
      this.worldObj.setBlock(i + 1, j + 8, k, Blocks.sandstone);
      this.worldObj.setBlock(i - 1, j + 8, k, Blocks.sandstone);
      this.worldObj.setBlock(i + 1, j + 8, k + 1, Blocks.sandstone);
      this.worldObj.setBlock(i - 1, j + 8, k - 1, Blocks.sandstone);
      this.worldObj.setBlock(i + 1, j + 8, k - 1, Blocks.sandstone);
      this.worldObj.setBlock(i - 1, j + 8, k + 1, Blocks.sandstone);
      this.worldObj.setBlock(i, j + 9, k + 0, Blocks.sandstone);
      this.worldObj.setBlock(i, j + 9, k + 1, Blocks.sandstone);
      this.worldObj.setBlock(i, j + 9, k - 1, Blocks.sandstone);
      this.worldObj.setBlock(i + 1, j + 9, k, Blocks.sandstone);
      this.worldObj.setBlock(i - 1, j + 9, k, Blocks.sandstone);
      this.worldObj.setBlock(i + 1, j + 9, k + 1, Blocks.sandstone);
      this.worldObj.setBlock(i - 1, j + 9, k - 1, Blocks.sandstone);
      this.worldObj.setBlock(i + 1, j + 9, k - 1, Blocks.sandstone);
      this.worldObj.setBlock(i - 1, j + 9, k + 1, Blocks.sandstone);
      this.worldObj.setBlock(i - 2, j + 9, k + 2, Blocks.sandstone);
      this.worldObj.setBlock(i - 2, j + 9, k + 1, Blocks.sandstone);
      this.worldObj.setBlock(i - 2, j + 9, k, Blocks.sandstone);
      this.worldObj.setBlock(i - 2, j + 9, k - 1, Blocks.sandstone);
      this.worldObj.setBlock(i - 2, j + 9, k - 2, Blocks.sandstone);
      this.worldObj.setBlock(i + 2, j + 9, k + 2, Blocks.sandstone);
      this.worldObj.setBlock(i + 2, j + 9, k + 1, Blocks.sandstone);
      this.worldObj.setBlock(i + 2, j + 9, k, Blocks.sandstone);
      this.worldObj.setBlock(i + 2, j + 9, k - 1, Blocks.sandstone);
      this.worldObj.setBlock(i + 2, j + 9, k - 2, Blocks.sandstone);
      this.worldObj.setBlock(i - 1, j + 9, k + 2, Blocks.sandstone);
      this.worldObj.setBlock(i, j + 9, k + 2, Blocks.sandstone);
      this.worldObj.setBlock(i + 1, j + 9, k + 2, Blocks.sandstone);
      this.worldObj.setBlock(i - 1, j + 9, k - 2, Blocks.sandstone);
      this.worldObj.setBlock(i, j + 9, k - 2, Blocks.sandstone);
      this.worldObj.setBlock(i + 1, j + 9, k - 2, Blocks.sandstone);
      this.worldObj.setBlock(i - 2, j + 8, k + 2, Blocks.sandstone);
      this.worldObj.setBlock(i - 2, j + 8, k + 1, Blocks.sandstone);
      this.worldObj.setBlock(i - 2, j + 8, k, Blocks.sandstone);
      this.worldObj.setBlock(i - 2, j + 8, k - 1, Blocks.sandstone);
      this.worldObj.setBlock(i - 2, j + 8, k - 2, Blocks.sandstone);
      this.worldObj.setBlock(i + 2, j + 8, k + 2, Blocks.sandstone);
      this.worldObj.setBlock(i + 2, j + 8, k + 1, Blocks.sandstone);
      this.worldObj.setBlock(i + 2, j + 8, k, Blocks.sandstone);
      this.worldObj.setBlock(i + 2, j + 8, k - 1, Blocks.sandstone);
      this.worldObj.setBlock(i + 2, j + 8, k - 2, Blocks.sandstone);
      this.worldObj.setBlock(i - 1, j + 8, k + 2, Blocks.sandstone);
      this.worldObj.setBlock(i, j + 8, k + 2, Blocks.sandstone);
      this.worldObj.setBlock(i + 1, j + 8, k + 2, Blocks.sandstone);
      this.worldObj.setBlock(i - 1, j + 8, k - 2, Blocks.sandstone);
      this.worldObj.setBlock(i, j + 8, k - 2, Blocks.sandstone);
      this.worldObj.setBlock(i + 1, j + 8, k - 2, Blocks.sandstone);
      this.worldObj.setBlock(i - 2, j + 7, k + 2, Blocks.sandstone);
      this.worldObj.setBlock(i - 2, j + 7, k + 1, Blocks.sandstone);
      this.worldObj.setBlock(i - 2, j + 7, k, Blocks.sandstone);
      this.worldObj.setBlock(i - 2, j + 7, k - 1, Blocks.sandstone);
      this.worldObj.setBlock(i - 2, j + 7, k - 2, Blocks.sandstone);
      this.worldObj.setBlock(i + 2, j + 7, k + 2, Blocks.sandstone);
      this.worldObj.setBlock(i + 2, j + 7, k + 1, Blocks.sandstone);
      this.worldObj.setBlock(i + 2, j + 7, k, Blocks.sandstone);
      this.worldObj.setBlock(i + 2, j + 7, k - 1, Blocks.sandstone);
      this.worldObj.setBlock(i + 2, j + 7, k - 2, Blocks.sandstone);
      this.worldObj.setBlock(i - 1, j + 7, k + 2, Blocks.sandstone);
      this.worldObj.setBlock(i, j + 7, k + 2, Blocks.sandstone);
      this.worldObj.setBlock(i + 1, j + 7, k + 2, Blocks.sandstone);
      this.worldObj.setBlock(i - 1, j + 7, k - 2, Blocks.sandstone);
      this.worldObj.setBlock(i, j + 7, k - 2, Blocks.sandstone);
      this.worldObj.setBlock(i + 1, j + 7, k - 2, Blocks.sandstone);
    } 
    if (this.Fall == 100) {
      i = MathHelper.floor_double(this.posX);
      int j = MathHelper.floor_double(this.posY);
      int k = MathHelper.floor_double(this.posZ);
      this.worldObj.setBlock(i, j + 7, k, (Block)Blocks.sand);
      this.worldObj.setBlock(i, j + 7, k + 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i, j + 7, k - 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 1, j + 7, k, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 1, j + 7, k, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 1, j + 7, k + 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 1, j + 7, k - 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 1, j + 7, k - 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 1, j + 7, k + 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i, j + 8, k + 0, (Block)Blocks.sand);
      this.worldObj.setBlock(i, j + 8, k + 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i, j + 8, k - 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 1, j + 8, k, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 1, j + 8, k, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 1, j + 8, k + 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 1, j + 8, k - 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 1, j + 8, k - 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 1, j + 8, k + 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i, j + 9, k + 0, (Block)Blocks.sand);
      this.worldObj.setBlock(i, j + 9, k + 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i, j + 9, k - 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 1, j + 9, k, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 1, j + 9, k, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 1, j + 9, k + 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 1, j + 9, k - 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 1, j + 9, k - 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 1, j + 9, k + 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 2, j + 9, k + 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 2, j + 9, k + 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 2, j + 9, k, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 2, j + 9, k - 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 2, j + 9, k - 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 2, j + 9, k + 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 2, j + 9, k + 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 2, j + 9, k, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 2, j + 9, k - 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 2, j + 9, k - 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 1, j + 9, k + 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i, j + 9, k + 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 1, j + 9, k + 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 1, j + 9, k - 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i, j + 9, k - 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 1, j + 9, k - 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 2, j + 8, k + 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 2, j + 8, k + 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 2, j + 8, k, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 2, j + 8, k - 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 2, j + 8, k - 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 2, j + 8, k + 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 2, j + 8, k + 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 2, j + 8, k, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 2, j + 8, k - 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 2, j + 8, k - 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 1, j + 8, k + 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i, j + 8, k + 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 1, j + 8, k + 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 1, j + 8, k - 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i, j + 8, k - 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 1, j + 8, k - 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 2, j + 7, k + 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 2, j + 7, k + 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 2, j + 7, k, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 2, j + 7, k - 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 2, j + 7, k - 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 2, j + 7, k + 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 2, j + 7, k + 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 2, j + 7, k, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 2, j + 7, k - 1, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 2, j + 7, k - 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 1, j + 7, k + 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i, j + 7, k + 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 1, j + 7, k + 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i - 1, j + 7, k - 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i, j + 7, k - 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i + 1, j + 7, k - 2, (Block)Blocks.sand);
      this.worldObj.setBlock(i, j - 2, k, Blocks.air);
      this.worldObj.setBlock(i, j - 2, k + 1, Blocks.air);
      this.worldObj.setBlock(i, j - 2, k - 1, Blocks.air);
      this.worldObj.setBlock(i + 1, j - 2, k, Blocks.air);
      this.worldObj.setBlock(i - 1, j - 2, k, Blocks.air);
      this.worldObj.setBlock(i + 1, j - 2, k + 1, Blocks.air);
      this.worldObj.setBlock(i - 1, j - 2, k - 1, Blocks.air);
      this.worldObj.setBlock(i + 1, j - 2, k - 1, Blocks.air);
      this.worldObj.setBlock(i - 1, j - 2, k + 1, Blocks.air);
      this.worldObj.setBlock(i, j - 4, k, Blocks.air);
      this.worldObj.setBlock(i, j - 4, k + 1, Blocks.air);
      this.worldObj.setBlock(i, j - 4, k - 1, Blocks.air);
      this.worldObj.setBlock(i + 1, j - 4, k, Blocks.air);
      this.worldObj.setBlock(i - 1, j - 4, k, Blocks.air);
      this.worldObj.setBlock(i + 1, j - 4, k + 1, Blocks.air);
      this.worldObj.setBlock(i - 1, j - 4, k - 1, Blocks.air);
      this.worldObj.setBlock(i + 1, j - 4, k - 1, Blocks.air);
      this.worldObj.setBlock(i - 1, j - 4, k + 1, Blocks.air);
      this.worldObj.setBlock(i, j - 3, k, Blocks.air);
      this.worldObj.setBlock(i, j - 3, k + 1, Blocks.air);
      this.worldObj.setBlock(i, j - 3, k - 1, Blocks.air);
      this.worldObj.setBlock(i + 1, j - 3, k, Blocks.air);
      this.worldObj.setBlock(i - 1, j - 3, k, Blocks.air);
      this.worldObj.setBlock(i + 1, j - 3, k + 1, Blocks.air);
      this.worldObj.setBlock(i - 1, j - 3, k - 1, Blocks.air);
      this.worldObj.setBlock(i + 1, j - 3, k - 1, Blocks.air);
      this.worldObj.setBlock(i - 1, j - 3, k + 1, Blocks.air);
      this.worldObj.setBlock(i - 2, j - 2, k + 2, Blocks.air);
      this.worldObj.setBlock(i - 2, j - 2, k + 1, Blocks.air);
      this.worldObj.setBlock(i - 2, j - 2, k, Blocks.air);
      this.worldObj.setBlock(i - 2, j - 2, k - 1, Blocks.air);
      this.worldObj.setBlock(i - 2, j - 2, k - 2, Blocks.air);
      this.worldObj.setBlock(i + 2, j - 2, k + 2, Blocks.air);
      this.worldObj.setBlock(i + 2, j - 2, k + 1, Blocks.air);
      this.worldObj.setBlock(i + 2, j - 2, k, Blocks.air);
      this.worldObj.setBlock(i + 2, j - 2, k - 1, Blocks.air);
      this.worldObj.setBlock(i + 2, j - 2, k - 2, Blocks.air);
      this.worldObj.setBlock(i - 1, j - 2, k + 2, Blocks.air);
      this.worldObj.setBlock(i, j - 2, k + 2, Blocks.air);
      this.worldObj.setBlock(i + 1, j - 2, k + 2, Blocks.air);
      this.worldObj.setBlock(i - 1, j - 2, k - 2, Blocks.air);
      this.worldObj.setBlock(i, j - 2, k - 2, Blocks.air);
      this.worldObj.setBlock(i + 1, j - 2, k - 2, Blocks.air);
      this.worldObj.setBlock(i - 2, j - 3, k + 2, Blocks.air);
      this.worldObj.setBlock(i - 2, j - 3, k + 1, Blocks.air);
      this.worldObj.setBlock(i - 2, j - 3, k, Blocks.air);
      this.worldObj.setBlock(i - 2, j - 3, k - 1, Blocks.air);
      this.worldObj.setBlock(i - 2, j - 3, k - 2, Blocks.air);
      this.worldObj.setBlock(i + 2, j - 3, k + 2, Blocks.air);
      this.worldObj.setBlock(i + 2, j - 3, k + 1, Blocks.air);
      this.worldObj.setBlock(i + 2, j - 3, k, Blocks.air);
      this.worldObj.setBlock(i + 2, j - 3, k - 1, Blocks.air);
      this.worldObj.setBlock(i + 2, j - 3, k - 2, Blocks.air);
      this.worldObj.setBlock(i - 1, j - 3, k + 2, Blocks.air);
      this.worldObj.setBlock(i, j - 3, k + 2, Blocks.air);
      this.worldObj.setBlock(i + 1, j - 3, k + 2, Blocks.air);
      this.worldObj.setBlock(i - 1, j - 3, k - 2, Blocks.air);
      this.worldObj.setBlock(i, j - 3, k - 2, Blocks.air);
      this.worldObj.setBlock(i + 1, j - 3, k - 2, Blocks.air);
      this.worldObj.setBlock(i - 2, j - 4, k + 2, Blocks.air);
      this.worldObj.setBlock(i - 2, j - 4, k + 1, Blocks.air);
      this.worldObj.setBlock(i - 2, j - 4, k, Blocks.air);
      this.worldObj.setBlock(i - 2, j - 4, k - 1, Blocks.air);
      this.worldObj.setBlock(i - 2, j - 4, k - 2, Blocks.air);
      this.worldObj.setBlock(i + 2, j - 4, k + 2, Blocks.air);
      this.worldObj.setBlock(i + 2, j - 4, k + 1, Blocks.air);
      this.worldObj.setBlock(i + 2, j - 4, k, Blocks.air);
      this.worldObj.setBlock(i + 2, j - 4, k - 1, Blocks.air);
      this.worldObj.setBlock(i + 2, j - 4, k - 2, Blocks.air);
      this.worldObj.setBlock(i - 1, j - 4, k + 2, Blocks.air);
      this.worldObj.setBlock(i, j - 4, k + 2, Blocks.air);
      this.worldObj.setBlock(i + 1, j - 4, k + 2, Blocks.air);
      this.worldObj.setBlock(i - 1, j - 4, k - 2, Blocks.air);
      this.worldObj.setBlock(i, j - 4, k - 2, Blocks.air);
      this.worldObj.setBlock(i + 1, j - 4, k - 2, Blocks.air);
      setDead();
    } 
  }
  
  protected void onImpact(MovingObjectPosition Par1MovingObjectPosition) {
    if (!this.worldObj.isRemote && Par1MovingObjectPosition.entityHit != null && Par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
      this.hit = (EntityLivingBase)Par1MovingObjectPosition.entityHit;
      this.Falling = true;
      byte BonePrisonDamage = 4;
      Par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage((Entity)this, (Entity)getThrower()), BonePrisonDamage);
      this.motionX = 0.0D;
      this.motionY = 0.0D;
      this.motionZ = 0.0D;
      if (this.Fall < 100) {
        Par1MovingObjectPosition.entityHit.setPositionAndRotation(this.posX, this.posY + 7.0D, this.posZ, this.rotationYaw, this.rotationPitch);
        if (Par1MovingObjectPosition.entityHit instanceof EntityPlayerMP && Par1MovingObjectPosition.entityHit != null) {
          EntityPlayerMP entityplayermp2 = (EntityPlayerMP)Par1MovingObjectPosition.entityHit;
          if (entityplayermp2.playerNetServerHandler.func_147362_b().isChannelOpen() && entityplayermp2.worldObj == this.worldObj) {
            EnderTeleportEvent event = new EnderTeleportEvent((EntityLivingBase)entityplayermp2, this.posX, this.posY + 1.0D, this.posZ, 5.0F);
            if (!MinecraftForge.EVENT_BUS.post((Event)event)) {
              if (Par1MovingObjectPosition.entityHit.isRiding())
                Par1MovingObjectPosition.entityHit.mountEntity((Entity)null); 
              EntityLivingBase hitentity = (EntityLivingBase)Par1MovingObjectPosition.entityHit;
              hitentity.setPositionAndUpdate(this.posX, this.posY + 7.0D, this.posZ);
              hitentity.fallDistance = 0.0F;
            } 
          } 
        } 
      } 
      ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 150, 300));
      ((EntityLivingBase)Par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.jump.id, 150, -300));
      int i = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posX);
      int j = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posY);
      int k = MathHelper.floor_double(Par1MovingObjectPosition.entityHit.posZ);
    } 
  }
}

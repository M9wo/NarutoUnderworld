package alcoholmod.Mathioks.item;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SenbonEntity extends EntityArrow {
  private int field_145791_d = -1;
  
  private int field_145792_e = -1;
  
  private int field_145789_f = -1;
  
  private Block field_145790_g;
  
  private int inData;
  
  private boolean inGround;
  
  public int canBePickedUp;
  
  public int arrowShake;
  
  public Entity shootingEntity;
  
  private int ticksInGround;
  
  private int ticksInAir;
  
  private double damage = 0.5D;
  
  private int knockbackStrength;
  
  private static final String __OBFID = "CL_00001715";
  
  public SenbonEntity(World par1World) {
    super(par1World);
  }
  
  public SenbonEntity(World par1World, double par2, double par4, double par6) {
    super(par1World, par2, par4, par6);
  }
  
  public SenbonEntity(World par1World, EntityLivingBase par2EntityLiving, EntityLiving par3EntityLiving, float par4, float par5) {
    super(par1World, par2EntityLiving, (EntityLivingBase)par3EntityLiving, par4, par5);
  }
  
  public SenbonEntity(World par1World, EntityLivingBase par2EntityLiving, float par3) {
    super(par1World, par2EntityLiving, par3);
  }
  
  public void setDamage(double p_70239_1_) {
    this.damage = p_70239_1_;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F) {
      float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
      this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);
      this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(this.motionY, f) * 180.0D / Math.PI);
    } 
    Block block = this.worldObj.getBlock(this.field_145791_d, this.field_145792_e, this.field_145789_f);
    if (block.getMaterial() != Material.air) {
      block.setBlockBoundsBasedOnState((IBlockAccess)this.worldObj, this.field_145791_d, this.field_145792_e, this.field_145789_f);
      AxisAlignedBB axisalignedbb = block.getCollisionBoundingBoxFromPool(this.worldObj, this.field_145791_d, this.field_145792_e, this.field_145789_f);
      if (axisalignedbb != null && axisalignedbb.isVecInside(Vec3.createVectorHelper(this.posX, this.posY, this.posZ)))
        this.inGround = true; 
    } 
    if (this.arrowShake > 0)
      this.arrowShake--; 
    if (this.inGround) {
      int j = this.worldObj.getBlockMetadata(this.field_145791_d, this.field_145792_e, this.field_145789_f);
      if (block == this.field_145790_g && j == this.inData) {
        this.ticksInGround++;
        if (this.ticksInGround == 1200)
          setDead(); 
      } else {
        this.inGround = false;
        this.motionX *= (this.rand.nextFloat() * 0.2F);
        this.motionY *= (this.rand.nextFloat() * 0.2F);
        this.motionZ *= (this.rand.nextFloat() * 0.2F);
        this.ticksInGround = 0;
        this.ticksInAir = 0;
      } 
    } else {
      this.ticksInAir++;
      Vec3 vec31 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
      Vec3 vec3 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
      MovingObjectPosition movingobjectposition = this.worldObj.func_147447_a(vec31, vec3, false, true, false);
      vec31 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
      vec3 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
      if (movingobjectposition != null)
        vec3 = Vec3.createVectorHelper(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord); 
      Entity entity = null;
      List<Entity> list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
      double d0 = 0.0D;
      int i;
      for (i = 0; i < list.size(); i++) {
        Entity entity1 = list.get(i);
        if (entity1.canBeCollidedWith() && (entity1 != this.shootingEntity || this.ticksInAir >= 5)) {
          float f = 0.3F;
          AxisAlignedBB axisalignedbb1 = entity1.boundingBox.expand(f, f, f);
          MovingObjectPosition movingobjectposition1 = axisalignedbb1.calculateIntercept(vec31, vec3);
          if (movingobjectposition1 != null) {
            double d1 = vec31.distanceTo(movingobjectposition1.hitVec);
            if (d1 < d0 || d0 == 0.0D) {
              entity = entity1;
              d0 = d1;
            } 
          } 
        } 
      } 
      if (entity != null)
        movingobjectposition = new MovingObjectPosition(entity); 
      if (movingobjectposition != null && movingobjectposition.entityHit != null && movingobjectposition.entityHit instanceof EntityPlayer) {
        EntityPlayer entityplayer = (EntityPlayer)movingobjectposition.entityHit;
        if (entityplayer.capabilities.disableDamage || (this.shootingEntity instanceof EntityPlayer && !((EntityPlayer)this.shootingEntity).canAttackPlayer(entityplayer)))
          movingobjectposition = null; 
      } 
      if (movingobjectposition != null)
        if (movingobjectposition.entityHit != null) {
          float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
          int k = MathHelper.ceiling_double_int(f * this.damage);
          if (getIsCritical())
            k += this.rand.nextInt(k / 2 + 2); 
          DamageSource damagesource = null;
          if (this.shootingEntity == null) {
            damagesource = DamageSource.causeArrowDamage(this, (Entity)this);
          } else {
            damagesource = DamageSource.causeArrowDamage(this, this.shootingEntity);
          } 
          if (isBurning() && !(movingobjectposition.entityHit instanceof net.minecraft.entity.monster.EntityEnderman))
            movingobjectposition.entityHit.setFire(5); 
          if (movingobjectposition.entityHit.attackEntityFrom(damagesource, k)) {
            if (movingobjectposition.entityHit instanceof EntityLivingBase) {
              EntityLivingBase entitylivingbase = (EntityLivingBase)movingobjectposition.entityHit;
              if (!this.worldObj.isRemote)
                entitylivingbase.setArrowCountInEntity(entitylivingbase.getArrowCountInEntity() + 1); 
              if (this.knockbackStrength > 0) {
                float f4 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
                if (f4 > 0.0F)
                  movingobjectposition.entityHit.addVelocity(this.motionX * this.knockbackStrength * 0.6000000238418579D / f4, 0.1D, this.motionZ * this.knockbackStrength * 0.6000000238418579D / f4); 
              } 
              if (this.shootingEntity != null && this.shootingEntity instanceof EntityLivingBase) {
                EnchantmentHelper.func_151384_a(entitylivingbase, this.shootingEntity);
                EnchantmentHelper.func_151385_b((EntityLivingBase)this.shootingEntity, (Entity)entitylivingbase);
              } 
              if (this.shootingEntity != null && movingobjectposition.entityHit != this.shootingEntity && movingobjectposition.entityHit instanceof EntityPlayer && this.shootingEntity instanceof EntityPlayerMP)
                ((EntityPlayerMP)this.shootingEntity).playerNetServerHandler.sendPacket((Packet)new S2BPacketChangeGameState(6, 0.0F)); 
            } 
            playSound("random.bowhit", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
            if (!(movingobjectposition.entityHit instanceof net.minecraft.entity.monster.EntityEnderman))
              setDead(); 
          } else {
            this.motionX *= -0.10000000149011612D;
            this.motionY *= -0.10000000149011612D;
            this.motionZ *= -0.10000000149011612D;
            this.rotationYaw += 180.0F;
            this.prevRotationYaw += 180.0F;
            this.ticksInAir = 0;
          } 
        } else {
          this.field_145791_d = movingobjectposition.blockX;
          this.field_145792_e = movingobjectposition.blockY;
          this.field_145789_f = movingobjectposition.blockZ;
          this.field_145790_g = this.worldObj.getBlock(this.field_145791_d, this.field_145792_e, this.field_145789_f);
          this.inData = this.worldObj.getBlockMetadata(this.field_145791_d, this.field_145792_e, this.field_145789_f);
          this.motionX = (float)(movingobjectposition.hitVec.xCoord - this.posX);
          this.motionY = (float)(movingobjectposition.hitVec.yCoord - this.posY);
          this.motionZ = (float)(movingobjectposition.hitVec.zCoord - this.posZ);
          float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
          this.posX -= this.motionX / f * 0.05000000074505806D;
          this.posY -= this.motionY / f * 0.05000000074505806D;
          this.posZ -= this.motionZ / f * 0.05000000074505806D;
          playSound("random.bowhit", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
          this.inGround = true;
          this.arrowShake = 7;
          setIsCritical(false);
          if (this.field_145790_g.getMaterial() != Material.air)
            this.field_145790_g.onEntityCollidedWithBlock(this.worldObj, this.field_145791_d, this.field_145792_e, this.field_145789_f, (Entity)this); 
        }  
      if (getIsCritical())
        for (i = 0; i < 4; i++)
          this.worldObj.spawnParticle("crit", this.posX + this.motionX * i / 4.0D, this.posY + this.motionY * i / 4.0D, this.posZ + this.motionZ * i / 4.0D, -this.motionX, -this.motionY + 0.2D, -this.motionZ);  
      this.posX += this.motionX;
      this.posY += this.motionY;
      this.posZ += this.motionZ;
      float f2 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
      this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);
      for (this.rotationPitch = (float)(Math.atan2(this.motionY, f2) * 180.0D / Math.PI); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F);
      while (this.rotationPitch - this.prevRotationPitch >= 180.0F)
        this.prevRotationPitch += 360.0F; 
      while (this.rotationYaw - this.prevRotationYaw < -180.0F)
        this.prevRotationYaw -= 360.0F; 
      while (this.rotationYaw - this.prevRotationYaw >= 180.0F)
        this.prevRotationYaw += 360.0F; 
      this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
      this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
      float f3 = 0.99F;
      float f1 = 0.05F;
      if (isInWater()) {
        for (int l = 0; l < 4; l++) {
          float f4 = 0.25F;
          this.worldObj.spawnParticle("bubble", this.posX - this.motionX * f4, this.posY - this.motionY * f4, this.posZ - this.motionZ * f4, this.motionX, this.motionY, this.motionZ);
        } 
        f3 = 0.8F;
      } 
      if (isWet())
        extinguish(); 
      this.motionX *= f3;
      this.motionY *= f3;
      this.motionZ *= f3;
      this.motionY -= f1;
      setPosition(this.posX, this.posY, this.posZ);
      func_145775_I();
    } 
  }
  
  public void onCollideWithPlayer(EntityPlayer par1EntityPlayer) {
    if (!this.worldObj.isRemote);
  }
}

package alcoholmod.Mathioks.Final.CT;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class IceReleaseDemonicMirrorEntity extends EntityThrowable {
  private static final String __OBFID = "CL_00001728";
  
  private int explosionRadius = 2;
  
  private int count = 0;
  
  private boolean start = false;
  
  private int ticksInGround;
  
  public IceReleaseDemonicMirrorEntity(World p_i1793_1_) {
    super(p_i1793_1_);
    this.motionX *= 0.8D;
    this.motionY *= 0.8D;
    this.motionZ *= 0.8D;
    setSize(1.0F, 1.0F);
  }
  
  public IceReleaseDemonicMirrorEntity(World Par4World, EntityLivingBase Par5EntityLivingBase) {
    super(Par4World, Par5EntityLivingBase);
    this.motionX *= 0.8D;
    this.motionY *= 0.8D;
    this.motionZ *= 0.8D;
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.ticksExisted >= 110)
      setDead(); 
    if (!this.worldObj.isRemote && this.start) {
      this.count++;
      this.motionX = 0.0D;
      this.motionY = 0.0D;
      this.motionZ = 0.0D;
      if (this.count >= 20 && getThrower() != null) {
        IceReleaseIceNeedleseEntity fireball1 = new IceReleaseIceNeedleseEntity(this.worldObj, getThrower());
        fireball1.setPosition(this.posX, this.posY + 2.0D, this.posZ);
        this.worldObj.spawnEntityInWorld((Entity)fireball1);
        IceReleaseIceNeedleseEntity fireball2 = new IceReleaseIceNeedleseEntity(this.worldObj, getThrower());
        fireball2.setPosition(this.posX + 1.0D, this.posY + 2.0D, this.posZ);
        this.worldObj.spawnEntityInWorld((Entity)fireball2);
        IceReleaseIceNeedleseEntity fireball3 = new IceReleaseIceNeedleseEntity(this.worldObj, getThrower());
        fireball3.setPosition(this.posX, this.posY + 2.0D, this.posZ + 1.0D);
        this.worldObj.spawnEntityInWorld((Entity)fireball3);
        IceReleaseIceNeedleseEntity fireball4 = new IceReleaseIceNeedleseEntity(this.worldObj, getThrower());
        fireball4.setPosition(this.posX - 1.0D, this.posY + 2.0D, this.posZ);
        this.worldObj.spawnEntityInWorld((Entity)fireball4);
        IceReleaseIceNeedleseEntity fireball5 = new IceReleaseIceNeedleseEntity(this.worldObj, getThrower());
        fireball5.setPosition(this.posX, this.posY + 2.0D, this.posZ - 1.0D);
        this.worldObj.spawnEntityInWorld((Entity)fireball5);
        IceReleaseIceNeedleseEntity fireball6 = new IceReleaseIceNeedleseEntity(this.worldObj, getThrower());
        fireball6.setPosition(this.posX - 1.0D, this.posY + 2.0D, this.posZ - 1.0D);
        this.worldObj.spawnEntityInWorld((Entity)fireball6);
        IceReleaseIceNeedleseEntity fireball7 = new IceReleaseIceNeedleseEntity(this.worldObj, getThrower());
        fireball7.setPosition(this.posX + 1.0D, this.posY + 2.0D, this.posZ - 1.0D);
        this.worldObj.spawnEntityInWorld((Entity)fireball7);
        IceReleaseIceNeedleseEntity fireball8 = new IceReleaseIceNeedleseEntity(this.worldObj, getThrower());
        fireball8.setPosition(this.posX + 1.0D, this.posY + 2.0D, this.posZ + 1.0D);
        this.worldObj.spawnEntityInWorld((Entity)fireball8);
        IceReleaseIceNeedleseEntity fireball9 = new IceReleaseIceNeedleseEntity(this.worldObj, getThrower());
        fireball9.setPosition(this.posX - 1.0D, this.posY + 2.0D, this.posZ + 1.0D);
        this.worldObj.spawnEntityInWorld((Entity)fireball9);
        IceReleaseIceNeedleseEntity fireball12 = new IceReleaseIceNeedleseEntity(this.worldObj, getThrower());
        fireball1.setPosition(this.posX, this.posY + 1.0D, this.posZ);
        this.worldObj.spawnEntityInWorld((Entity)fireball1);
        IceReleaseIceNeedleseEntity fireball22 = new IceReleaseIceNeedleseEntity(this.worldObj, getThrower());
        fireball2.setPosition(this.posX + 1.0D, this.posY + 1.0D, this.posZ);
        this.worldObj.spawnEntityInWorld((Entity)fireball2);
        IceReleaseIceNeedleseEntity fireball32 = new IceReleaseIceNeedleseEntity(this.worldObj, getThrower());
        fireball3.setPosition(this.posX, this.posY + 1.0D, this.posZ + 1.0D);
        this.worldObj.spawnEntityInWorld((Entity)fireball3);
        IceReleaseIceNeedleseEntity fireball42 = new IceReleaseIceNeedleseEntity(this.worldObj, getThrower());
        fireball4.setPosition(this.posX - 1.0D, this.posY + 1.0D, this.posZ);
        this.worldObj.spawnEntityInWorld((Entity)fireball4);
        IceReleaseIceNeedleseEntity fireball52 = new IceReleaseIceNeedleseEntity(this.worldObj, getThrower());
        fireball5.setPosition(this.posX, this.posY + 1.0D, this.posZ - 1.0D);
        this.worldObj.spawnEntityInWorld((Entity)fireball5);
        fireball1.motionY = -1.0D;
        fireball2.motionY = -1.0D;
        fireball3.motionY = -1.0D;
        fireball4.motionY = -1.0D;
        fireball5.motionY = -1.0D;
        fireball6.motionY = -1.0D;
        fireball7.motionY = -1.0D;
        fireball8.motionY = -1.0D;
        fireball9.motionY = -1.0D;
        fireball12.motionY = -0.6D;
        fireball22.motionY = -0.6D;
        fireball32.motionY = -0.6D;
        fireball42.motionY = -0.6D;
        fireball52.motionY = -0.6D;
        if (fireball1.ticksExisted >= 5)
          fireball1.setDead(); 
        if (fireball2.ticksExisted >= 5)
          fireball2.setDead(); 
        if (fireball3.ticksExisted >= 5)
          fireball3.setDead(); 
        if (fireball4.ticksExisted >= 5)
          fireball4.setDead(); 
        if (fireball5.ticksExisted >= 5)
          fireball5.setDead(); 
        if (fireball6.ticksExisted >= 5)
          fireball6.setDead(); 
        if (fireball7.ticksExisted >= 5)
          fireball7.setDead(); 
        if (fireball8.ticksExisted >= 5)
          fireball8.setDead(); 
        if (fireball9.ticksExisted >= 5)
          fireball9.setDead(); 
        if (fireball12.ticksExisted >= 5)
          fireball12.setDead(); 
        if (fireball22.ticksExisted >= 5)
          fireball22.setDead(); 
        if (fireball32.ticksExisted >= 5)
          fireball32.setDead(); 
        if (fireball42.ticksExisted >= 5)
          fireball42.setDead(); 
        if (fireball52.ticksExisted >= 5)
          fireball52.setDead(); 
        this.count = 0;
      } 
    } 
  }
  
  protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
    if (!this.worldObj.isRemote) {
      if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
        int i = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posX);
        int j = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posY);
        int k = MathHelper.floor_double(par1MovingObjectPosition.entityHit.posZ);
        if (!this.start)
          this.start = true; 
        this.motionX = 0.0D;
        this.motionY = 0.0D;
        this.motionZ = 0.0D;
        this.worldObj.setBlock(i + 2, j, k + 2, Blocks.ice);
        this.worldObj.setBlock(i + 2, j, k + 1, Blocks.ice);
        this.worldObj.setBlock(i + 2, j, k, Blocks.ice);
        this.worldObj.setBlock(i + 2, j, k - 1, Blocks.ice);
        this.worldObj.setBlock(i + 2, j, k - 2, Blocks.ice);
        this.worldObj.setBlock(i + 1, j, k + 2, Blocks.ice);
        this.worldObj.setBlock(i + 1, j, k - 2, Blocks.ice);
        this.worldObj.setBlock(i, j, k + 2, Blocks.ice);
        this.worldObj.setBlock(i, j, k - 2, Blocks.ice);
        this.worldObj.setBlock(i - 1, j, k + 2, Blocks.ice);
        this.worldObj.setBlock(i - 1, j, k - 2, Blocks.ice);
        this.worldObj.setBlock(i - 2, j, k + 2, Blocks.ice);
        this.worldObj.setBlock(i - 2, j, k + 1, Blocks.ice);
        this.worldObj.setBlock(i - 2, j, k, Blocks.ice);
        this.worldObj.setBlock(i - 2, j, k - 1, Blocks.ice);
        this.worldObj.setBlock(i - 2, j, k - 2, Blocks.ice);
        this.worldObj.setBlock(i + 2, j + 1, k + 2, Blocks.ice);
        this.worldObj.setBlock(i + 2, j + 1, k + 1, Blocks.ice);
        this.worldObj.setBlock(i + 2, j + 1, k, Blocks.ice);
        this.worldObj.setBlock(i + 2, j + 1, k - 1, Blocks.ice);
        this.worldObj.setBlock(i + 2, j + 1, k - 2, Blocks.ice);
        this.worldObj.setBlock(i + 1, j + 1, k + 2, Blocks.ice);
        this.worldObj.setBlock(i + 1, j + 1, k - 2, Blocks.ice);
        this.worldObj.setBlock(i, j + 1, k + 2, Blocks.ice);
        this.worldObj.setBlock(i, j + 1, k - 2, Blocks.ice);
        this.worldObj.setBlock(i - 1, j + 1, k + 2, Blocks.ice);
        this.worldObj.setBlock(i - 1, j + 1, k - 2, Blocks.ice);
        this.worldObj.setBlock(i - 2, j + 1, k + 2, Blocks.ice);
        this.worldObj.setBlock(i - 2, j + 1, k + 1, Blocks.ice);
        this.worldObj.setBlock(i - 2, j + 1, k, Blocks.ice);
        this.worldObj.setBlock(i - 2, j + 1, k - 1, Blocks.ice);
        this.worldObj.setBlock(i - 2, j + 1, k - 2, Blocks.ice);
        this.worldObj.setBlock(i + 2, j + 2, k + 2, Blocks.ice);
        this.worldObj.setBlock(i + 2, j + 2, k + 1, Blocks.ice);
        this.worldObj.setBlock(i + 2, j + 2, k, Blocks.ice);
        this.worldObj.setBlock(i + 2, j + 2, k - 1, Blocks.ice);
        this.worldObj.setBlock(i + 2, j + 2, k - 2, Blocks.ice);
        this.worldObj.setBlock(i + 1, j + 2, k + 2, Blocks.ice);
        this.worldObj.setBlock(i + 1, j + 2, k - 2, Blocks.ice);
        this.worldObj.setBlock(i, j + 2, k + 2, Blocks.ice);
        this.worldObj.setBlock(i, j + 2, k - 2, Blocks.ice);
        this.worldObj.setBlock(i - 1, j + 2, k + 2, Blocks.ice);
        this.worldObj.setBlock(i - 1, j + 2, k - 2, Blocks.ice);
        this.worldObj.setBlock(i - 2, j + 2, k + 2, Blocks.ice);
        this.worldObj.setBlock(i - 2, j + 2, k + 1, Blocks.ice);
        this.worldObj.setBlock(i - 2, j + 2, k, Blocks.ice);
        this.worldObj.setBlock(i - 2, j + 2, k - 1, Blocks.ice);
        this.worldObj.setBlock(i - 2, j + 2, k - 2, Blocks.ice);
        this.worldObj.setBlock(i, j - 1, k, Blocks.ice);
        this.worldObj.setBlock(i + 1, j - 1, k + 1, Blocks.ice);
        this.worldObj.setBlock(i + 1, j - 1, k, Blocks.ice);
        this.worldObj.setBlock(i + 1, j - 1, k - 1, Blocks.ice);
        this.worldObj.setBlock(i, j - 1, k + 1, Blocks.ice);
        this.worldObj.setBlock(i, j - 1, k - 1, Blocks.ice);
        this.worldObj.setBlock(i - 1, j - 1, k + 1, Blocks.ice);
        this.worldObj.setBlock(i - 1, j - 1, k, Blocks.ice);
        this.worldObj.setBlock(i - 1, j - 1, k - 1, Blocks.ice);
        this.worldObj.setBlock(i + 2, j + 3, k + 2, Blocks.ice);
        this.worldObj.setBlock(i + 2, j + 3, k + 1, Blocks.ice);
        this.worldObj.setBlock(i + 2, j + 3, k, Blocks.ice);
        this.worldObj.setBlock(i + 2, j + 3, k - 1, Blocks.ice);
        this.worldObj.setBlock(i + 2, j + 3, k - 2, Blocks.ice);
        this.worldObj.setBlock(i + 1, j + 3, k + 2, Blocks.ice);
        this.worldObj.setBlock(i + 1, j + 3, k - 2, Blocks.ice);
        this.worldObj.setBlock(i, j + 3, k + 2, Blocks.ice);
        this.worldObj.setBlock(i, j + 3, k - 2, Blocks.ice);
        this.worldObj.setBlock(i - 1, j + 3, k + 2, Blocks.ice);
        this.worldObj.setBlock(i - 1, j + 3, k - 2, Blocks.ice);
        this.worldObj.setBlock(i - 2, j + 3, k + 2, Blocks.ice);
        this.worldObj.setBlock(i - 2, j + 3, k + 1, Blocks.ice);
        this.worldObj.setBlock(i - 2, j + 3, k, Blocks.ice);
        this.worldObj.setBlock(i - 2, j + 3, k - 1, Blocks.ice);
        this.worldObj.setBlock(i - 2, j + 3, k - 2, Blocks.ice);
        this.worldObj.setBlock(i, j + 3, k, Blocks.ice);
        this.worldObj.setBlock(i + 1, j + 3, k + 1, Blocks.ice);
        this.worldObj.setBlock(i + 1, j + 3, k, Blocks.ice);
        this.worldObj.setBlock(i + 1, j + 3, k - 1, Blocks.ice);
        this.worldObj.setBlock(i, j + 3, k + 1, Blocks.ice);
        this.worldObj.setBlock(i, j + 3, k - 1, Blocks.ice);
        this.worldObj.setBlock(i - 1, j + 3, k + 1, Blocks.ice);
        this.worldObj.setBlock(i - 1, j + 3, k, Blocks.ice);
        this.worldObj.setBlock(i - 1, j + 3, k - 1, Blocks.ice);
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

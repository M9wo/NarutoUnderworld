package alcoholmod.Mathioks.SusanoCage;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class SusakeSusanoCageEntity extends EntityThrowable {
  public final float scale = 4.0F;
  
  private int ticksInGround;
  
  public SusakeSusanoCageEntity(World par1World) {
    super(par1World);
    this.motionX *= 0.0D;
    this.motionY *= 0.0D;
    this.motionZ *= 0.0D;
    this.ignoreFrustumCheck = true;
    this.noClip = true;
    setFire(1000000);
  }
  
  public SusakeSusanoCageEntity(World par1World, EntityLivingBase par2Entity) {
    super(par1World, par2Entity);
    this.motionX *= 0.0D;
    this.motionY *= 0.0D;
    this.motionZ *= 0.0D;
    setSize(3.0F, 7.0F);
  }
  
  public SusakeSusanoCageEntity(World Par6World, double Par7double, double Par8double, double Par9double) {
    super(Par6World, Par7double, Par8double, Par9double);
    this.motionX *= 0.0D;
    this.motionY *= 0.0D;
    this.motionZ *= 0.0D;
  }
  
  public void onUpdate() {
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    super.onUpdate();
    if (!this.worldObj.isRemote && getThrower() == null)
      setDead(); 
    if (!this.worldObj.isRemote) {
      if (getThrower() != null) {
        this.posX = (getThrower()).posX;
        this.posY = (getThrower()).posY;
        this.posZ = (getThrower()).posZ;
        this.rotationYaw = (getThrower()).rotationYaw;
        setPosition(this.posX, this.posY, this.posZ);
        setRotation(this.rotationYaw, this.rotationPitch);
      } 
      for (int i = 0; i < 2; i++)
        this.worldObj.spawnParticle("smoke", this.posX + (this.rand.nextDouble() - 0.5D) * this.width, this.posY + this.rand.nextDouble() * this.height - 0.25D, this.posZ + (this.rand.nextDouble() - 0.5D) * this.width, (this.rand.nextDouble() - 0.5D) * 2.0D, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5D) * 2.0D); 
    } 
  }
  
  protected float getGravityVelocity() {
    return 0.0F;
  }
  
  @SideOnly(Side.CLIENT)
  public int getBrightnessForRender(float par1) {
    return 15728880;
  }
  
  public float getBrightness(float par1) {
    return 1.0F;
  }
  
  public boolean canBeCollidedWith() {
    return false;
  }
  
  public boolean canBePushed() {
    return false;
  }
  
  protected void onImpact(MovingObjectPosition p_70184_1_) {}
}

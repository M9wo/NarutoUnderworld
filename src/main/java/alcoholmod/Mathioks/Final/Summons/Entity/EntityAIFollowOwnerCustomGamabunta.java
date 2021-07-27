package alcoholmod.Mathioks.Final.Summons.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EntityAIFollowOwnerCustomGamabunta extends EntityAIBase {
  private SummonGamabuntaEntity thePet;
  
  private EntityLivingBase theOwner;
  
  World theWorld;
  
  private double field_75336_f;
  
  private PathNavigate petPathfinder;
  
  private int field_75343_h;
  
  float maxDist;
  
  float minDist;
  
  private boolean field_75344_i;
  
  private static final String __OBFID = "CL_00001585";
  
  public EntityAIFollowOwnerCustomGamabunta(SummonGamabuntaEntity p_i1625_1_, double p_i1625_2_, float p_i1625_4_, float p_i1625_5_) {
    this.thePet = p_i1625_1_;
    this.theWorld = p_i1625_1_.worldObj;
    this.field_75336_f = p_i1625_2_;
    this.petPathfinder = p_i1625_1_.getNavigator();
    this.minDist = p_i1625_4_;
    this.maxDist = p_i1625_5_;
    setMutexBits(3);
  }
  
  public boolean shouldExecute() {
    EntityLivingBase entitylivingbase = this.thePet.getOwner();
    if (entitylivingbase == null)
      return false; 
    if (this.thePet.getDistanceSqToEntity((Entity)entitylivingbase) < (this.minDist * this.minDist))
      return false; 
    this.theOwner = entitylivingbase;
    return true;
  }
  
  public boolean continueExecuting() {
    return (!this.petPathfinder.noPath() && this.thePet.getDistanceSqToEntity((Entity)this.theOwner) > (this.maxDist * this.maxDist));
  }
  
  public void startExecuting() {
    this.field_75343_h = 0;
    this.field_75344_i = this.thePet.getNavigator().getAvoidsWater();
    this.thePet.getNavigator().setAvoidsWater(false);
  }
  
  public void resetTask() {
    this.theOwner = null;
    this.petPathfinder.clearPathEntity();
    this.thePet.getNavigator().setAvoidsWater(this.field_75344_i);
  }
  
  public void updateTask() {
    this.thePet.getLookHelper().setLookPositionWithEntity((Entity)this.theOwner, 10.0F, this.thePet.getVerticalFaceSpeed());
    if (--this.field_75343_h <= 0) {
      this.field_75343_h = 10;
      if (!this.petPathfinder.tryMoveToEntityLiving((Entity)this.theOwner, this.field_75336_f) && !this.thePet.getLeashed() && this.thePet.getDistanceSqToEntity((Entity)this.theOwner) >= 144.0D) {
        int i = MathHelper.floor_double(this.theOwner.posX) - 2;
        int j = MathHelper.floor_double(this.theOwner.posZ) - 2;
        int k = MathHelper.floor_double(this.theOwner.boundingBox.minY);
        for (int l = 0; l <= 4; l++) {
          for (int i1 = 0; i1 <= 4; i1++) {
            if ((l < 1 || i1 < 1 || l > 3 || i1 > 3) && World.doesBlockHaveSolidTopSurface((IBlockAccess)this.theWorld, i + l, k - 1, j + i1) && !this.theWorld.getBlock(i + l, k, j + i1).isNormalCube() && !this.theWorld.getBlock(i + l, k + 1, j + i1).isNormalCube()) {
              this.thePet.setLocationAndAngles(((i + l) + 0.5F), k, ((j + i1) + 0.5F), this.thePet.rotationYaw, this.thePet.rotationPitch);
              this.petPathfinder.clearPathEntity();
              return;
            } 
          } 
        } 
      } 
    } 
  }
}

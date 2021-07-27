package alcoholmod.Mathioks.NPC;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAITarget;
import net.minecraft.village.Village;

public class KageDefendVillageAI extends EntityAITarget {
  EntityKage irongolem;
  
  EntityLivingBase villageAgressorTarget;
  
  private static final String __OBFID = "CL_00001618";
  
  public KageDefendVillageAI(EntityKage p_i1659_1_) {
    super(p_i1659_1_, false, true);
    this.irongolem = p_i1659_1_;
    setMutexBits(1);
  }
  
  public boolean shouldExecute() {
    Village village = this.irongolem.getVillage();
    if (village == null)
      return false; 
    this.villageAgressorTarget = village.findNearestVillageAggressor((EntityLivingBase)this.irongolem);
    if (!isSuitableTarget(this.villageAgressorTarget, false)) {
      if (this.taskOwner.getRNG().nextInt(20) == 0) {
        this.villageAgressorTarget = (EntityLivingBase)village.func_82685_c((EntityLivingBase)this.irongolem);
        return isSuitableTarget(this.villageAgressorTarget, false);
      } 
      return false;
    } 
    return true;
  }
  
  public void startExecuting() {
    this.irongolem.setAttackTarget(this.villageAgressorTarget);
    super.startExecuting();
  }
}

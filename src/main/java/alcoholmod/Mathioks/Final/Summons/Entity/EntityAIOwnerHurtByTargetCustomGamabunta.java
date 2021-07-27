package alcoholmod.Mathioks.Final.Summons.Entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAITarget;

public class EntityAIOwnerHurtByTargetCustomGamabunta extends EntityAITarget {
  SummonGamabuntaEntity theDefendingTameable;
  
  EntityLivingBase theOwnerAttacker;
  
  private int field_142051_e;
  
  private static final String __OBFID = "CL_00001624";
  
  public EntityAIOwnerHurtByTargetCustomGamabunta(SummonGamabuntaEntity p_i1667_1_) {
    super((EntityCreature)p_i1667_1_, false);
    this.theDefendingTameable = p_i1667_1_;
    setMutexBits(1);
  }
  
  public boolean shouldExecute() {
    if (!this.theDefendingTameable.isTame())
      return false; 
    EntityLivingBase entitylivingbase = this.theDefendingTameable.getOwner();
    if (entitylivingbase == null)
      return false; 
    this.theOwnerAttacker = entitylivingbase.getAITarget();
    int i = entitylivingbase.func_142015_aE();
    return (i != this.field_142051_e && isSuitableTarget(this.theOwnerAttacker, false) && this.theDefendingTameable.func_142018_a(this.theOwnerAttacker, entitylivingbase));
  }
  
  public void startExecuting() {
    this.taskOwner.setAttackTarget(this.theOwnerAttacker);
    EntityLivingBase entitylivingbase = this.theDefendingTameable.getOwner();
    if (entitylivingbase != null)
      this.field_142051_e = entitylivingbase.func_142015_aE(); 
    super.startExecuting();
  }
}

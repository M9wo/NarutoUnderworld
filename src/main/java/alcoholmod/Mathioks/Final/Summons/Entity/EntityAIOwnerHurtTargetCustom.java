package alcoholmod.Mathioks.Final.Summons.Entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAITarget;

public class EntityAIOwnerHurtTargetCustom extends EntityAITarget {
  SummonMandaEntity theEntityTameable;
  
  EntityLivingBase theTarget;
  
  private int field_142050_e;
  
  private static final String __OBFID = "CL_00001625";
  
  public EntityAIOwnerHurtTargetCustom(SummonMandaEntity p_i1668_1_) {
    super((EntityCreature)p_i1668_1_, false);
    this.theEntityTameable = p_i1668_1_;
    setMutexBits(1);
  }
  
  public boolean shouldExecute() {
    if (!this.theEntityTameable.isTame())
      return false; 
    EntityLivingBase entitylivingbase = this.theEntityTameable.getOwner();
    if (entitylivingbase == null)
      return false; 
    this.theTarget = entitylivingbase.getLastAttacker();
    int i = entitylivingbase.getLastAttackerTime();
    return (i != this.field_142050_e && isSuitableTarget(this.theTarget, false) && this.theEntityTameable.func_142018_a(this.theTarget, entitylivingbase));
  }
  
  public void startExecuting() {
    this.taskOwner.setAttackTarget(this.theTarget);
    EntityLivingBase entitylivingbase = this.theEntityTameable.getOwner();
    if (entitylivingbase != null)
      this.field_142050_e = entitylivingbase.getLastAttackerTime(); 
    super.startExecuting();
  }
}

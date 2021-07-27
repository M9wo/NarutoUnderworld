package alcoholmod.Mathioks.Final.CT;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class RashomonEntity extends EntityMob {
  public RashomonEntity(World p_i1696_1_) {
    super(p_i1696_1_);
    setSize(10.0F, 10.0F);
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.0D);
  }
  
  public boolean isAIEnabled() {
    return false;
  }
  
  public void onUpdate() {
    this.lastTickPosX = this.posX;
    this.lastTickPosY = this.posY;
    this.lastTickPosZ = this.posZ;
    super.onUpdate();
    if (!this.worldObj.isRemote) {
      this.motionX = 0.0D;
      this.motionY = -1.0D;
      this.motionZ = 0.0D;
      setRotation(0.0F, 0.0F);
    } 
  }
  
  public void moveEntityWithHeading(float par1, float par2) {
    moveEntity(0.0D, 0.0D, 0.0D);
  }
  
  protected boolean canDespawn() {
    return (this.ticksExisted > 2400);
  }
}

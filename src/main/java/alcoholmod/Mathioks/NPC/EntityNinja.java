package alcoholmod.Mathioks.NPC;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

public abstract class EntityNinja extends EntityCreature implements IMob {
  private static final String __OBFID = "CL_00001692";
  
  public EntityNinja(World p_i1738_1_) {
    super(p_i1738_1_);
    this.experienceValue = 5;
  }
  
  public void onLivingUpdate() {
    updateArmSwingProgress();
    float f = getBrightness(1.0F);
    if (f > 0.5F)
      this.entityAge += 2; 
    super.onLivingUpdate();
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (!this.worldObj.isRemote && this.worldObj.difficultySetting == EnumDifficulty.PEACEFUL)
      setDead(); 
  }
  
  protected Entity findPlayerToAttack() {
    EntityPlayer entityplayer = this.worldObj.getClosestVulnerablePlayerToEntity((Entity)this, 16.0D);
    return (entityplayer != null && canEntityBeSeen((Entity)entityplayer)) ? (Entity)entityplayer : null;
  }
  
  public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
    if (isEntityInvulnerable())
      return false; 
    if (super.attackEntityFrom(p_70097_1_, p_70097_2_)) {
      Entity entity = p_70097_1_.getEntity();
      if (this.riddenByEntity != entity && this.ridingEntity != entity) {
        if (entity != this)
          this.entityToAttack = entity; 
        return true;
      } 
      return true;
    } 
    return false;
  }
  
  protected void attackEntity(Entity p_70785_1_, float p_70785_2_) {
    if (this.attackTime <= 0 && p_70785_2_ < 2.0F && p_70785_1_.boundingBox.maxY > this.boundingBox.minY && p_70785_1_.boundingBox.minY < this.boundingBox.maxY) {
      this.attackTime = 20;
      attackEntityAsMob(p_70785_1_);
    } 
  }
  
  public float getBlockPathWeight(int p_70783_1_, int p_70783_2_, int p_70783_3_) {
    return 0.5F - this.worldObj.getLightBrightness(p_70783_1_, p_70783_2_, p_70783_3_);
  }
  
  protected boolean isValidLightLevel() {
    int i = MathHelper.floor_double(this.posX);
    int j = MathHelper.floor_double(this.boundingBox.minY);
    int k = MathHelper.floor_double(this.posZ);
    if (this.worldObj.getSavedLightValue(EnumSkyBlock.Sky, i, j, k) > this.rand.nextInt(32))
      return false; 
    int l = this.worldObj.getBlockLightValue(i, j, k);
    if (this.worldObj.isThundering()) {
      int i1 = this.worldObj.skylightSubtracted;
      this.worldObj.skylightSubtracted = 10;
      l = this.worldObj.getBlockLightValue(i, j, k);
      this.worldObj.skylightSubtracted = i1;
    } 
    return (l <= this.rand.nextInt(8));
  }
  
  public boolean getCanSpawnHere() {
    return (this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL && isValidLightLevel() && super.getCanSpawnHere());
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
  }
  
  protected boolean func_146066_aG() {
    return true;
  }
}

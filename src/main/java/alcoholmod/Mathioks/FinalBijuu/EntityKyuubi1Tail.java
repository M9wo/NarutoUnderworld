package alcoholmod.Mathioks.FinalBijuu;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityKyuubi1Tail extends EntityMob {
  private float moveSpeed = 0.25F;
  
  public EntityKyuubi1Tail(World par1World) {
    super(par1World);
    setSize(0.5F, 1.25F);
    getNavigator().setAvoidsWater(true);
    this.experienceValue = 30;
    this.fireResistance = 1000;
    this.isImmuneToFire = true;
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.350000023841858D));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIMoveThroughVillage((EntityCreature)this, 1.0D, false));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIWander((EntityCreature)this, 1.0D));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 10.0F));
    this.tasks.addTask(5, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, false));
  }
  
  protected void entityInit() {
    super.entityInit();
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0D);
  }
  
  protected boolean canDespawn() {
    return !isNoDespawnRequired();
  }
  
  public void onUpdate() {
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.moveSpeed);
    super.onUpdate();
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
    if (this.worldObj.rand.nextInt(10) == 1) {
      this.worldObj.spawnParticle("reddust", this.posX, this.posY + 2.0D, this.posZ, 0.0D, 0.0D, 0.0D);
      this.worldObj.spawnParticle("lava", this.posX, this.posY + 2.0D, this.posZ, 0.0D, 0.0D, 0.0D);
      setFire(5);
      if (isInWater()) {
        attackEntityAsMob((Entity)this);
        this.worldObj.spawnParticle("smoke", this.posX, this.posY + 1.75D, this.posZ, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("largesmoke", this.posX, this.posY + 1.75D, this.posZ, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("smoke", this.posX, this.posY + 2.0D, this.posZ, 0.0D, 0.0D, 0.0D);
        this.worldObj.spawnParticle("largesmoke", this.posX, this.posY + 2.0D, this.posZ, 0.0D, 0.0D, 0.0D);
      } 
    } 
  }
  
  public int getAttackStrength(Entity par1Entity) {
    return 3;
  }
  
  protected String getLivingSound() {
    return "orespawn:kyuubi_living";
  }
  
  protected String getHurtSound() {
    return "orespawn:alo_hurt";
  }
  
  protected String getDeathSound() {
    return "orespawn:alo_death";
  }
  
  protected float getSoundVolume() {
    return 0.75F;
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  protected Item getDropItem() {
    int i = this.worldObj.rand.nextInt(6);
    return (i == 0) ? Items.gold_nugget : null;
  }
  
  public void initCreature() {}
  
  public boolean interact(EntityPlayer par1EntityPlayer) {
    return false;
  }
  
  protected void updateAITasks() {
    if (!this.isDead && 
      this.worldObj.rand.nextInt(200) == 1)
      setRevengeTarget((EntityLivingBase)null); 
  }
  
  private boolean isSuitableTarget(EntityLivingBase par1EntityLiving, boolean par2) {
    if (par1EntityLiving == null)
      return false; 
    if (par1EntityLiving == this)
      return false; 
    if (!par1EntityLiving.isEntityAlive())
      return false; 
    if (!getEntitySenses().canSee((Entity)par1EntityLiving))
      return false; 
    if (par1EntityLiving instanceof EntityMob)
      return false; 
    if (par1EntityLiving instanceof net.minecraft.entity.monster.EntityPigZombie)
      return false; 
    if (par1EntityLiving instanceof EntityPlayer) {
      EntityPlayer p = (EntityPlayer)par1EntityLiving;
      if (p.capabilities.isCreativeMode)
        return false; 
    } 
    return true;
  }
  
  public boolean getCanSpawnHere() {
    return true;
  }
}

package alcoholmod.Mathioks.Entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityYamanakaCurse extends EntityVillager {
  public EntityLivingBase jutsusha;
  
  public int deathTicks;
  
  public boolean killed = false;
  
  private ItemStack[] equipment = new ItemStack[5];
  
  public EntityYamanakaCurse(World par1World) {
    super(par1World);
    this.experienceValue = 0;
    getNavigator().setBreakDoors(true);
    getNavigator().setAvoidsWater(true);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityZombie.class, 8.0F, 0.6D, 0.6D));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIRestrictOpenDoor((EntityCreature)this));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIOpenDoor((EntityLiving)this, true));
    this.tasks.addTask(5, (EntityAIBase)new EntityAIMoveTowardsRestriction((EntityCreature)this, 0.6D));
    this.tasks.addTask(9, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, EntityPlayer.class, 3.0F, 1.0F));
    this.tasks.addTask(9, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, EntityVillager.class, 5.0F, 0.02F));
    this.tasks.addTask(9, (EntityAIBase)new EntityAIWander((EntityCreature)this, 0.6D));
    this.tasks.addTask(10, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 8.0F));
    setInvisible(true);
    setSize(0.6F, 1.8F);
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
    getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0D);
  }
  
  public boolean isEntityInvulnerable() {
    return true;
  }
  
  protected String getLivingSound() {
    return null;
  }
  
  protected String getHurtSound() {
    return null;
  }
  
  protected String getDeathSound() {
    return null;
  }
  
  public boolean isMating() {
    return false;
  }
  
  protected void onDeathUpdate() {
    setDead();
  }
}

package alcoholmod.Mathioks.Jinshuriki;

import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class JinshurikiYugito extends EntityMob implements IBossDisplayData {
  Random rand = new Random();
  
  public JinshurikiYugito(World par1World) {
    super(par1World);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, EntityPlayer.class, 0.4D, false));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIMoveTowardsRestriction((EntityCreature)this, 0.4D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWander((EntityCreature)this, 0.4D));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(7, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
    setSize(0.6F, 1.8F);
    this.isImmuneToFire = true;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(3000.0D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(17.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.8D);
    getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.2D);
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.rand.nextInt(100) == 0 && !this.worldObj.isRemote) {
      if (this.attackingPlayer != null)
        this.attackingPlayer.addVelocity(this.rand.nextFloat() - 0.5D, 0.8D, this.rand.nextFloat() - 0.5D); 
    } else if (this.rand.nextInt(100) == 0 && !this.worldObj.isRemote && this.attackingPlayer != null) {
      this.attackingPlayer.addPotionEffect(new PotionEffect(Potion.wither.id, 100, 6));
    } 
  }
  
  protected float getSoundPitch() {
    return 0.7F;
  }
  
  protected String getHurtSound() {
    return "";
  }
  
  public void onDeath(DamageSource par1DamageSource) {
    super.onDeath(par1DamageSource);
    if (!this.worldObj.isRemote) {
      JinshurikiUnleashed unleash = new JinshurikiUnleashed(this.worldObj);
      unleash.setPosition(this.posX, this.posY, this.posZ);
      this.worldObj.spawnEntityInWorld((Entity)unleash);
    } 
  }
  
  protected void fall() {}
  
  public EnumCreatureAttribute getCreatureAttribute() {
    return EnumCreatureAttribute.UNDEAD;
  }
}

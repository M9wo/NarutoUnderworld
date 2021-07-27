package alcoholmod.Mathioks.Boss;

import alcoholmod.Mathioks.SixPaths.EntityGiantBird;
import alcoholmod.Mathioks.SixPaths.EntityGiantCentipede;
import alcoholmod.Mathioks.SixPaths.EntityGiantCrustacean;
import alcoholmod.Mathioks.SixPaths.EntityGiantDog;
import alcoholmod.Mathioks.SixPaths.EntityGiantPanda;
import alcoholmod.Mathioks.SixPaths.EntityGiantRhino;
import alcoholmod.Mathioks.SixPaths.EntityGiantSnakeTailedChameleon;
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
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class SixPathsOfPain1 extends EntityMob {
  public boolean spawned;
  
  public int spawnedCounter;
  
  Random rand = new Random();
  
  public SixPathsOfPain1(World par1World) {
    super(par1World);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, EntityPlayer.class, 0.4D, false));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIMoveTowardsRestriction((EntityCreature)this, 0.4D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWander((EntityCreature)this, 0.4D));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(7, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
    this.targetTasks.addTask(2, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityPlayer.class, 0, true));
    setSize(0.6F, 1.8F);
    this.isImmuneToFire = true;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(7000.0D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.6D);
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.rand.nextInt(100) == 0 && !this.worldObj.isRemote) {
      if (this.attackingPlayer != null)
        this.attackingPlayer.addVelocity(this.rand.nextFloat() - 0.5D, 0.8D, this.rand.nextFloat() - 0.5D); 
    } else if (this.rand.nextInt(300) == 0 && !this.worldObj.isRemote) {
      if (this.attackingPlayer != null) {
        this.attackingPlayer.addPotionEffect(new PotionEffect(Potion.weakness.id, 200, 10));
        this.attackingPlayer.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 200, 10));
        this.attackingPlayer.addPotionEffect(new PotionEffect(Potion.harm.id, 200, 0));
        this.attackingPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 200, -10));
      } 
    } else if (this.rand.nextInt(480) == 0 && !this.worldObj.isRemote) {
      if (this.spawnedCounter == 0) {
        EntityGiantBird giantbird = new EntityGiantBird(this.worldObj);
        EntityGiantPanda giantpanda = new EntityGiantPanda(this.worldObj);
        EntityGiantCentipede giantcentipede = new EntityGiantCentipede(this.worldObj);
        EntityGiantDog giantdog = new EntityGiantDog(this.worldObj);
        EntityGiantCrustacean giantcrustacean = new EntityGiantCrustacean(this.worldObj);
        EntityGiantSnakeTailedChameleon giantchameleaon = new EntityGiantSnakeTailedChameleon(this.worldObj);
        EntityGiantRhino giantrhino = new EntityGiantRhino(this.worldObj);
        giantbird.setPosition(this.posX, this.posY + 6.0D, this.posZ);
        this.worldObj.spawnEntityInWorld((Entity)giantbird);
        giantpanda.setPosition(this.posX + 6.0D, this.posY + 2.0D, this.posZ);
        this.worldObj.spawnEntityInWorld((Entity)giantpanda);
        giantcentipede.setPosition(this.posX - 6.0D, this.posY + 2.0D, this.posZ);
        this.worldObj.spawnEntityInWorld((Entity)giantcentipede);
        giantdog.setPosition(this.posX, this.posY + 2.0D, this.posZ + 6.0D);
        this.worldObj.spawnEntityInWorld((Entity)giantdog);
        giantcrustacean.setPosition(this.posX, this.posY + 2.0D, this.posZ - 6.0D);
        this.worldObj.spawnEntityInWorld((Entity)giantcrustacean);
        giantchameleaon.setPosition(this.posX - 12.0D, this.posY + 2.0D, this.posZ);
        this.worldObj.spawnEntityInWorld((Entity)giantchameleaon);
        giantrhino.setPosition(this.posX, this.posY + 2.0D, this.posZ - 12.0D);
        this.worldObj.spawnEntityInWorld((Entity)giantrhino);
        this.spawnedCounter += 840000000;
      } 
      if (this.spawnedCounter > 0)
        this.spawnedCounter--; 
    } 
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  public void onDeath(DamageSource par1DamageSource) {
    super.onDeath(par1DamageSource);
    if (!this.worldObj.isRemote);
  }
  
  protected void fall() {}
  
  public EnumCreatureAttribute getCreatureAttribute() {
    return EnumCreatureAttribute.UNDEAD;
  }
}

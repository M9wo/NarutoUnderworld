package alcoholmod.Mathioks.Boss;

import java.util.Random;
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

public class AkatsukiKakuzu extends EntityMob {
  Random rand = new Random();
  
  public AkatsukiKakuzu(World par1World) {
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
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8000.0D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(30.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.8D);
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.rand.nextInt(100) == 0 && !this.worldObj.isRemote) {
      if (this.attackingPlayer != null)
        this.attackingPlayer.addVelocity(this.rand.nextFloat() - 0.5D, 0.8D, this.rand.nextFloat() - 0.5D); 
    } else if (this.rand.nextInt(100) == 0 && !this.worldObj.isRemote && this.attackingPlayer != null) {
      this.attackingPlayer.addPotionEffect(new PotionEffect(Potion.poison.id, 200, 10));
      this.attackingPlayer.addPotionEffect(new PotionEffect(Potion.weakness.id, 200, 3));
      this.attackingPlayer.addPotionEffect(new PotionEffect(Potion.hunger.id, 200, 3));
      this.attackingPlayer.setFire(200);
    } 
  }
  
  public void onLivingUpdate() {
    super.onLivingUpdate();
  }
  
  protected float getSoundPitch() {
    return 0.7F;
  }
  
  protected String getLivingSound() {
    return "tm:KakuzuTheme";
  }
  
  public int getTalkInterval() {
    return 2360;
  }
  
  protected String getHurtSound() {
    return "mob.enderdragon.hit";
  }
  
  public void onDeath(DamageSource par1DamageSource) {
    super.onDeath(par1DamageSource);
    if (!this.worldObj.isRemote);
  }
  
  protected void fall() {}
  
  public EnumCreatureAttribute getCreatureAttribute() {
    return EnumCreatureAttribute.ARTHROPOD;
  }
}

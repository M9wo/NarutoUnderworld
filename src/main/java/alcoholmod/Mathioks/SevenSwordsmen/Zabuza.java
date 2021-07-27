package alcoholmod.Mathioks.SevenSwordsmen;

import alcoholmod.Mathioks.AddedItems;
import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.Entity.EntityWaterPrisonJutsu;
import alcoholmod.Mathioks.Entity.EntityWaterPrisonJutsu2;
import alcoholmod.Mathioks.Final.CT.WaterDragonEntity;
import alcoholmod.Mathioks.Final.CT.WaterGunshotEntity;
import alcoholmod.Mathioks.NPC.EntityQuestGiver;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
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
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class Zabuza extends EntityMob {
  public int WaterDragon = 0;
  
  public int WaterGunshot = 0;
  
  public int WaterPrison = 0;
  
  public int SwordSlash = 0;
  
  public int Sword = 0;
  
  Random rand = new Random();
  
  public Zabuza(World par1World) {
    super(par1World);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, EntityPlayer.class, 0.4D, false));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIMoveTowardsRestriction((EntityCreature)this, 0.4D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWander((EntityCreature)this, 0.4D));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityQuestGiver.class, 16.0F));
    this.tasks.addTask(8, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 16.0F));
    this.tasks.addTask(9, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityTameable.class, 16.0F));
    this.tasks.addTask(10, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
    this.targetTasks.addTask(2, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityPlayer.class, 0, true));
    setCurrentItemOrArmor(0, new ItemStack(AddedItems.kubikiri));
    setSize(0.6F, 1.8F);
    this.isImmuneToFire = false;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(70.0D);
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(4000.0D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (!hasCustomNameTag())
      setCustomNameTag("Zabuza"); 
    if (!this.worldObj.isRemote) {
      if (this.WaterDragon < 700)
        this.WaterDragon++; 
      if (this.WaterGunshot < 350)
        this.WaterGunshot++; 
      if (this.WaterPrison < 250)
        this.WaterPrison++; 
      if (this.Sword < 111)
        this.Sword++; 
      if (this.WaterDragon == 700) {
        WaterDragonEntity entitylargefireball = new WaterDragonEntity(this.worldObj, (EntityLivingBase)this);
        double d8 = 4.0D;
        Vec3 vec3 = getLook(1.0F);
        entitylargefireball.posX = this.posX + vec3.xCoord * d8;
        entitylargefireball.posY = this.posY + (this.height / 2.0F) + 0.5D;
        entitylargefireball.posZ = this.posZ + vec3.zCoord * d8;
        this.worldObj.spawnEntityInWorld((Entity)entitylargefireball);
        this.WaterDragon = 0;
      } 
      if (this.WaterGunshot == 350) {
        WaterGunshotEntity entitylargefireball = new WaterGunshotEntity(this.worldObj, (EntityLivingBase)this);
        double d8 = 4.0D;
        Vec3 vec3 = getLook(1.0F);
        entitylargefireball.posX = this.posX + vec3.xCoord * d8;
        entitylargefireball.posY = this.posY + (this.height / 2.0F) + 0.5D;
        entitylargefireball.posZ = this.posZ + vec3.zCoord * d8;
        this.worldObj.spawnEntityInWorld((Entity)entitylargefireball);
        this.WaterGunshot = 0;
      } 
      if (this.WaterPrison == 250) {
        EntityWaterPrisonJutsu entitylargefireball = new EntityWaterPrisonJutsu(this.worldObj, (EntityLivingBase)this);
        double d8 = 4.0D;
        Vec3 vec3 = getLook(1.0F);
        entitylargefireball.posX = this.posX + vec3.xCoord * d8;
        entitylargefireball.posY = this.posY + (this.height / 2.0F) + 0.5D;
        entitylargefireball.posZ = this.posZ + vec3.zCoord * d8;
        this.worldObj.spawnEntityInWorld((Entity)entitylargefireball);
        this.WaterPrison = 0;
        EntityWaterPrisonJutsu2 entitylargefireball2 = new EntityWaterPrisonJutsu2(this.worldObj, (EntityLivingBase)this);
        entitylargefireball2.posX = this.posX + vec3.xCoord * d8;
        entitylargefireball2.posY = this.posY + (this.height / 2.0F) + 0.5D;
        entitylargefireball2.posZ = this.posZ + vec3.zCoord * d8;
        this.worldObj.spawnEntityInWorld((Entity)entitylargefireball2);
        this.WaterPrison = 0;
      } 
      if (this.Sword == 111) {
        List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 2.0D, this.posY - 2.0D, this.posZ - 2.0D, this.posX + 2.0D, this.posY + 2.0D, this.posZ + 2.0D));
        if (this != null)
          for (int k2 = 0; k2 < list.size(); k2++) {
            if (!this.worldObj.isRemote) {
              Entity entity = list.get(k2);
              String user = getUniqueID().toString();
              double d0 = entity.getDistance(this.posX, this.posY, this.posZ);
              if (entity instanceof EntityLiving && entity instanceof EntityLivingBase && !entity.getUniqueID().toString().equals(user)) {
                entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 6.0F);
                if (d0 <= 10.0D) {
                  entity.setPositionAndRotation(entity.posX, entity.posY + 5.0D, entity.posZ, entity.rotationYaw, entity.rotationPitch);
                  ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.jump.id, 50, -1));
                } 
              } 
              if (entity instanceof EntityPlayer) {
                entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 6.0F);
                if (d0 <= 10.0D) {
                  entity.setPositionAndRotation(entity.posX, entity.posY + 5.0D, entity.posZ, entity.rotationYaw, entity.rotationPitch);
                  ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.jump.id, 50, -1));
                } 
              } 
            } 
          }  
        this.Sword = 0;
      } 
    } 
  }
  
  protected float getSoundPitch() {
    return 0.7F;
  }
  
  public int getTalkInterval() {
    return 3120;
  }
  
  protected String getHurtSound() {
    return "";
  }
  
  public void onDeath(DamageSource par1DamageSource) {
    super.onDeath(par1DamageSource);
    if (!this.worldObj.isRemote);
  }
  
  protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
    dropItem(AlcoholMod.BeatZabuza, 1);
  }
  
  protected void dropRareDrop(int p_70600_1_) {
    entityDropItem(new ItemStack(AddedItems.kubikiri, 1, 1), 0.0F);
  }
  
  protected void fall() {}
  
  public EnumCreatureAttribute getCreatureAttribute() {
    return EnumCreatureAttribute.ARTHROPOD;
  }
}

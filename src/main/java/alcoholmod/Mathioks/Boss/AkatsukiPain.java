package alcoholmod.Mathioks.Boss;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.Entity.EntityWindBeastTearingPalm;
import alcoholmod.Mathioks.Final.CT.ShuraBlastEntity;
import alcoholmod.Mathioks.Final.CT.WaterGunshotEntity;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
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
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class AkatsukiPain extends EntityMob implements IRangedAttackMob {
  public boolean spawned;
  
  public int spawnedCounter;
  
  public int AlmightyPushCounter = 0;
  
  public int AlmightyPullCounter = 0;
  
  public int WindCounter = 0;
  
  public int WaterCounter = 0;
  
  public int ShuraBlast = 0;
  
  public boolean summoned = false;
  
  private EntityAIArrowAttack aiArrowAttack = new EntityAIArrowAttack(this, 1.0D, 20, 60, 15.0F);
  
  private EntityAIAttackOnCollide aiAttackOnCollide = new EntityAIAttackOnCollide((EntityCreature)this, EntityPlayer.class, 1.2D, false);
  
  Random rand = new Random();
  
  public AkatsukiPain(World par1World) {
    super(par1World);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, EntityPlayer.class, 0.4D, false));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, EntityTameable.class, 0.4D, false));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIMoveTowardsRestriction((EntityCreature)this, 0.4D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWander((EntityCreature)this, 0.4D));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(8, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
    this.targetTasks.addTask(2, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityPlayer.class, 0, true));
    this.targetTasks.addTask(3, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityTameable.class, 0, true));
    setCurrentItemOrArmor(0, new ItemStack(AlcoholMod.RinneganChakraRod));
    setSize(0.6F, 1.8F);
    this.isImmuneToFire = true;
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(50.0D);
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(9000.0D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.0D);
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (!hasCustomNameTag())
      setCustomNameTag("Pain"); 
    if (!this.worldObj.isRemote) {
      if (this.AlmightyPullCounter < 500)
        this.AlmightyPullCounter++; 
      if (this.AlmightyPushCounter < 80)
        this.AlmightyPushCounter++; 
      if (this.WindCounter < 350)
        this.WindCounter++; 
      if (this.WaterCounter < 650)
        this.WaterCounter++; 
      if (this.AlmightyPullCounter >= 460 && this.AlmightyPullCounter <= 501) {
        this.AlmightyPushCounter = 60;
        List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 70.0D, this.posY - 70.0D, this.posZ - 70.0D, this.posX + 70.0D, this.posY + 70.0D, this.posZ + 70.0D));
        if (this != null)
          for (int k2 = 0; k2 < list.size(); k2++) {
            Entity entity = list.get(k2);
            String user = getUniqueID().toString();
            if (entity instanceof EntityLiving && 
              !entity.getUniqueID().toString().equals(user)) {
              double d0 = entity.getDistance(this.posX, this.posY, this.posZ);
              if (d0 <= 70.0D && d0 > 3.0D) {
                double dx = -entity.posX + this.posX;
                double dy = -entity.posY + this.posY;
                double dz = -entity.posZ + this.posZ;
                entity.motionX += dx * 3.0D / d0;
                entity.motionY += dy * 3.0D / d0 + 0.2D;
                entity.motionZ += dz * 3.0D / d0;
              } 
              if (d0 <= 3.0D) {
                entity.motionX = 0.0D;
                entity.motionY = 0.0D;
                entity.motionZ = 0.0D;
                ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 30, 4));
                ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 30, 4));
              } 
            } 
            if (entity instanceof EntityPlayer && 
              !entity.getUniqueID().toString().equals(user)) {
              if (this.AlmightyPullCounter == 460)
                ((EntityPlayer)entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Pain: Almighty Pull!!")); 
              double d0 = entity.getDistance(this.posX, this.posY, this.posZ);
              if (d0 <= 70.0D && d0 > 3.0D) {
                double dx = -entity.posX + this.posX;
                double dy = -entity.posY + this.posY;
                double dz = -entity.posZ + this.posZ;
                entity.motionX += dx * 3.0D / d0;
                entity.motionY += dy * 3.0D / d0 + 0.2D;
                entity.motionZ += dz * 3.0D / d0;
              } 
              if (d0 <= 3.0D) {
                entity.motionX = 0.0D;
                entity.motionY = 0.0D;
                entity.motionZ = 0.0D;
                ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 30, 4));
                ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 30, 4));
              } 
            } 
          }  
        if (this.AlmightyPullCounter == 500)
          this.AlmightyPullCounter = 0; 
      } 
      if (this.AlmightyPushCounter == 80) {
        if (!this.worldObj.isRemote) {
          List<Entity> list = this.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(this.posX - 20.0D, this.posY - 20.0D, this.posZ - 20.0D, this.posX + 20.0D, this.posY + 20.0D, this.posZ + 20.0D));
          if (this != null)
            for (int k2 = 0; k2 < list.size(); k2++) {
              Entity entity = list.get(k2);
              String user = getUniqueID().toString();
              if (entity instanceof EntityLiving)
                if (entity instanceof AkatsukiPain) {
                  if (entity.getUniqueID().toString().equals(user));
                } else {
                  double d0 = entity.getDistance(this.posX, this.posY, this.posZ);
                  entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 10.0F);
                  if (d0 <= 20.0D) {
                    double dx = entity.posX - this.posX;
                    double dy = entity.posY - this.posY;
                    double dz = entity.posZ - this.posZ;
                    entity.motionX += dx * 4.75D / d0;
                    entity.motionY += dy * 4.75D / d0 + 0.2D;
                    entity.motionZ += dz * 4.75D / d0;
                  } 
                }  
              if (entity instanceof EntityPlayer) {
                ((EntityPlayer)entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Pain: Almighty Push!!"));
                if (!entity.getUniqueID().toString().equals(user)) {
                  double d0 = entity.getDistance(this.posX, this.posY, this.posZ);
                  entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), 10.0F);
                  if (d0 <= 20.0D) {
                    double dx = entity.posX - this.posX;
                    double dy = entity.posY - this.posY;
                    double dz = entity.posZ - this.posZ;
                    entity.motionX += dx * 4.75D / d0;
                    entity.motionY += dy * 4.75D / d0 + 0.2D;
                    entity.motionZ += dz * 4.75D / d0;
                  } 
                } 
              } 
            }  
        } 
        this.AlmightyPushCounter = 0;
      } 
      if (this.WindCounter == 350) {
        EntityWindBeastTearingPalm entitylargefireball = new EntityWindBeastTearingPalm(this.worldObj, (EntityLivingBase)this);
        double d8 = 4.0D;
        Vec3 vec3 = getLook(1.0F);
        entitylargefireball.posX = this.posX + vec3.xCoord * d8;
        entitylargefireball.posY = this.posY + (this.height / 2.0F) + 0.5D;
        entitylargefireball.posZ = this.posZ + vec3.zCoord * d8;
        this.worldObj.spawnEntityInWorld((Entity)entitylargefireball);
        this.WindCounter = 0;
      } 
      if (this.WindCounter == 350) {
        EntityWindBeastTearingPalm entitylargefireball = new EntityWindBeastTearingPalm(this.worldObj, (EntityLivingBase)this);
        double d8 = 4.0D;
        Vec3 vec3 = getLook(1.0F);
        entitylargefireball.posX = this.posX + vec3.xCoord * d8;
        entitylargefireball.posY = this.posY + (this.height / 2.0F) + 0.5D;
        entitylargefireball.posZ = this.posZ + vec3.zCoord * d8;
        this.worldObj.spawnEntityInWorld((Entity)entitylargefireball);
        this.WindCounter = 0;
      } 
      if (this.WaterCounter == 650) {
        WaterGunshotEntity entityWaterGunshot = new WaterGunshotEntity(this.worldObj, (EntityLivingBase)this);
        double d8 = 4.0D;
        Vec3 vec3 = getLook(1.0F);
        entityWaterGunshot.posX = this.posX + vec3.xCoord * d8;
        entityWaterGunshot.posY = this.posY + (this.height / 2.0F) + 0.5D;
        entityWaterGunshot.posZ = this.posZ + vec3.zCoord * d8;
        this.worldObj.spawnEntityInWorld((Entity)entityWaterGunshot);
        this.WaterCounter = 0;
      } 
      if (getHealth() <= getMaxHealth() / 6.0F && !this.summoned) {
        SixPathsOfPain1 pain1 = new SixPathsOfPain1(this.worldObj);
        pain1.setPosition(this.posX + 3.0D, this.posY + 2.0D, this.posZ);
        this.worldObj.spawnEntityInWorld((Entity)pain1);
        this.summoned = true;
      } 
      if (getHealth() <= getMaxHealth() / 10.0F) {
        if (this.ShuraBlast < 70)
          this.ShuraBlast++; 
        if (this.ShuraBlast == 70) {
          ShuraBlastEntity entityShuraBlast = new ShuraBlastEntity(this.worldObj, (EntityLivingBase)this);
          double d8 = 4.0D;
          Vec3 vec3 = getLook(1.0F);
          entityShuraBlast.posX = this.posX + vec3.xCoord * d8;
          entityShuraBlast.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entityShuraBlast.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entityShuraBlast);
          this.ShuraBlast = 0;
        } 
      } 
    } 
  }
  
  protected float getSoundPitch() {
    return 1.0F;
  }
  
  public int getTalkInterval() {
    return 2600;
  }
  
  public void onDeath(DamageSource par1DamageSource) {
    super.onDeath(par1DamageSource);
    if (!this.worldObj.isRemote);
  }
  
  protected void fall() {}
  
  public EnumCreatureAttribute getCreatureAttribute() {
    return EnumCreatureAttribute.UNDEAD;
  }
  
  public void attackEntityWithRangedAttack(EntityLivingBase p_82196_1_, float p_82196_2_) {}
}

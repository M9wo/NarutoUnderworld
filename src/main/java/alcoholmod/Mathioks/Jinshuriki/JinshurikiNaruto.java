package alcoholmod.Mathioks.Jinshuriki;

import alcoholmod.Mathioks.item.ShurikenSmallEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class JinshurikiNaruto extends EntityMob implements IMob, IBossDisplayData {
  public int courseChangeCooldown;
  
  public double waypointX;
  
  public double waypointY;
  
  public double waypointZ;
  
  private Entity targetedEntity;
  
  private int aggroCooldown;
  
  public int prevAttackCounter;
  
  public int attackCounter;
  
  private int explosionStrength = 1;
  
  public int deathTicks;
  
  private boolean Susanoo = false;
  
  private boolean SusanooBuffs = false;
  
  private static final String __OBFID = "CL_00001689";
  
  Random rand = new Random();
  
  public JinshurikiNaruto(World p_i1735_1_) {
    super(p_i1735_1_);
    setSize(0.6F, 1.8F);
    this.experienceValue = 100;
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIAttackOnCollide((EntityCreature)this, EntityPlayer.class, 0.4D, false));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIMoveTowardsRestriction((EntityCreature)this, 0.4D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIWander((EntityCreature)this, 0.4D));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(7, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
  }
  
  @SideOnly(Side.CLIENT)
  public boolean func_110182_bF() {
    return (this.dataWatcher.getWatchableObjectByte(16) != 0);
  }
  
  protected boolean isAIEnabled() {
    return true;
  }
  
  public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
    return isEntityInvulnerable() ? false : super.attackEntityFrom(p_70097_1_, p_70097_2_);
  }
  
  protected void entityInit() {
    super.entityInit();
    this.dataWatcher.addObject(16, Byte.valueOf((byte)0));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(7000.0D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(25.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.0D);
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (this.rand.nextInt(100) == 0 && !this.worldObj.isRemote && this.attackingPlayer != null)
      this.attackingPlayer.addVelocity(this.rand.nextFloat() - 0.5D, 0.8D, this.rand.nextFloat() - 0.5D); 
    despawnEntity();
    this.prevAttackCounter = this.attackCounter;
    if (this.targetedEntity != null && this.targetedEntity.isDead)
      this.targetedEntity = null; 
    if (this.targetedEntity == null || this.aggroCooldown-- <= 0) {
      this.targetedEntity = (Entity)this.worldObj.getClosestVulnerablePlayerToEntity((Entity)this, 100.0D);
      if (this.targetedEntity != null)
        this.aggroCooldown = 20; 
    } 
    double d4 = 64.0D;
    if (this.targetedEntity != null && this.targetedEntity.getDistanceSqToEntity((Entity)this) < d4 * d4) {
      double d5 = this.targetedEntity.posX - this.posX;
      double d6 = this.targetedEntity.boundingBox.minY + (this.targetedEntity.height / 2.0F) - this.posY + (this.height / 2.0F);
      double d7 = this.targetedEntity.posZ - this.posZ;
      this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(d5, d7)) * 180.0F / 3.1415927F;
      if (canEntityBeSeen(this.targetedEntity) && !this.Susanoo) {
        if (this.attackCounter == 10)
          this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1007, (int)this.posX, (int)this.posY, (int)this.posZ, 0); 
        this.attackCounter++;
        if (this.attackCounter == 20);
        if (this.attackCounter == 70);
        if (this.attackCounter == 100);
        if (this.attackCounter == 120) {
          this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1008, (int)this.posX, (int)this.posY, (int)this.posZ, 0);
          ShurikenSmallEntity entitybat = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat1 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat2 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat3 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat4 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat5 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat6 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat7 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat8 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat9 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat10 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat11 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat12 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat13 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat14 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat15 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat16 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat17 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat18 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat19 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat20 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat21 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat22 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat23 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitycrow = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitycrow1 = new ShurikenSmallEntity(this.worldObj);
          double d8 = 4.0D;
          Vec3 vec3 = getLook(1.0F);
          entitybat.posX = this.posX + vec3.xCoord * d8;
          entitybat.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat);
          entitybat1.posX = this.posX + vec3.xCoord * d8;
          entitybat1.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat1.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat1);
          entitybat2.posX = this.posX + vec3.xCoord * d8;
          entitybat2.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat2.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat2);
          entitybat3.posX = this.posX + vec3.xCoord * d8;
          entitybat3.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat3.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat3);
          entitybat4.posX = this.posX + vec3.xCoord * d8;
          entitybat4.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat4.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat4);
          entitybat5.posX = this.posX + vec3.xCoord * d8;
          entitybat5.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat5.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat5);
          entitybat6.posX = this.posX + vec3.xCoord * d8;
          entitybat6.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat6.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat6);
          entitybat7.posX = this.posX + vec3.xCoord * d8;
          entitybat7.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat7.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat7);
          entitybat8.posX = this.posX + vec3.xCoord * d8;
          entitybat8.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat8.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat8);
          entitybat9.posX = this.posX + vec3.xCoord * d8;
          entitybat9.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat9.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat9);
          entitybat10.posX = this.posX + vec3.xCoord * d8;
          entitybat10.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat10.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat10);
          entitybat11.posX = this.posX + vec3.xCoord * d8;
          entitybat11.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat11.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat11);
          entitybat12.posX = this.posX + vec3.xCoord * d8;
          entitybat12.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat12.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat12);
          entitybat13.posX = this.posX + vec3.xCoord * d8;
          entitybat13.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat13.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat13);
          entitybat14.posX = this.posX + vec3.xCoord * d8;
          entitybat14.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat14.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat14);
          entitybat15.posX = this.posX + vec3.xCoord * d8;
          entitybat15.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat15.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat15);
          entitybat16.posX = this.posX + vec3.xCoord * d8;
          entitybat16.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat16.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat16);
          entitybat17.posX = this.posX + vec3.xCoord * d8;
          entitybat17.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat17.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat17);
          entitybat18.posX = this.posX + vec3.xCoord * d8;
          entitybat18.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat18.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat18);
          entitybat19.posX = this.posX + vec3.xCoord * d8;
          entitybat19.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat19.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat19);
          entitybat20.posX = this.posX + vec3.xCoord * d8;
          entitybat20.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat20.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat20);
          entitybat21.posX = this.posX + vec3.xCoord * d8;
          entitybat21.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat21.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat21);
          entitybat22.posX = this.posX + vec3.xCoord * d8;
          entitybat22.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat22.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat22);
          entitybat23.posX = this.posX + vec3.xCoord * d8;
          entitybat23.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat23.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat23);
          entitycrow.posX = this.posX + vec3.xCoord * d8;
          entitycrow.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitycrow.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitycrow);
          entitycrow1.posX = this.posX + vec3.xCoord * d8;
          entitycrow1.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitycrow1.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitycrow1);
        } 
        if (this.attackCounter == 150);
        if (this.attackCounter == 180) {
          this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1008, (int)this.posX, (int)this.posY, (int)this.posZ, 0);
          ShurikenSmallEntity entitybat = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat1 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat2 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat3 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat4 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat5 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat6 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat7 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat8 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat9 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat10 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat11 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat12 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat13 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat14 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat15 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat16 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat17 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat18 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat19 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat20 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat21 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat22 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitybat23 = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitycrow = new ShurikenSmallEntity(this.worldObj);
          ShurikenSmallEntity entitycrow1 = new ShurikenSmallEntity(this.worldObj);
          double d8 = 4.0D;
          Vec3 vec3 = getLook(1.0F);
          entitybat.posX = this.posX + vec3.xCoord * d8;
          entitybat.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat);
          entitybat1.posX = this.posX + vec3.xCoord * d8;
          entitybat1.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat1.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat1);
          entitybat2.posX = this.posX + vec3.xCoord * d8;
          entitybat2.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat2.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat2);
          entitybat3.posX = this.posX + vec3.xCoord * d8;
          entitybat3.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat3.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat3);
          entitybat4.posX = this.posX + vec3.xCoord * d8;
          entitybat4.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat4.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat4);
          entitybat5.posX = this.posX + vec3.xCoord * d8;
          entitybat5.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat5.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat5);
          entitybat6.posX = this.posX + vec3.xCoord * d8;
          entitybat6.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat6.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat6);
          entitybat7.posX = this.posX + vec3.xCoord * d8;
          entitybat7.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat7.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat7);
          entitybat8.posX = this.posX + vec3.xCoord * d8;
          entitybat8.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat8.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat8);
          entitybat9.posX = this.posX + vec3.xCoord * d8;
          entitybat9.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat9.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat9);
          entitybat10.posX = this.posX + vec3.xCoord * d8;
          entitybat10.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat10.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat10);
          entitybat11.posX = this.posX + vec3.xCoord * d8;
          entitybat11.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat11.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat11);
          entitybat12.posX = this.posX + vec3.xCoord * d8;
          entitybat12.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat12.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat12);
          entitybat13.posX = this.posX + vec3.xCoord * d8;
          entitybat13.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat13.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat13);
          entitybat14.posX = this.posX + vec3.xCoord * d8;
          entitybat14.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat14.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat14);
          entitybat15.posX = this.posX + vec3.xCoord * d8;
          entitybat15.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat15.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat15);
          entitybat16.posX = this.posX + vec3.xCoord * d8;
          entitybat16.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat16.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat16);
          entitybat17.posX = this.posX + vec3.xCoord * d8;
          entitybat17.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat17.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat17);
          entitybat18.posX = this.posX + vec3.xCoord * d8;
          entitybat18.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat18.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat18);
          entitybat19.posX = this.posX + vec3.xCoord * d8;
          entitybat19.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat19.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat19);
          entitybat20.posX = this.posX + vec3.xCoord * d8;
          entitybat20.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat20.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat20);
          entitybat21.posX = this.posX + vec3.xCoord * d8;
          entitybat21.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat21.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat21);
          entitybat22.posX = this.posX + vec3.xCoord * d8;
          entitybat22.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat22.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat22);
          entitybat23.posX = this.posX + vec3.xCoord * d8;
          entitybat23.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitybat23.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitybat23);
          entitycrow.posX = this.posX + vec3.xCoord * d8;
          entitycrow.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitycrow.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitycrow);
          entitycrow1.posX = this.posX + vec3.xCoord * d8;
          entitycrow1.posY = this.posY + (this.height / 2.0F) + 0.5D;
          entitycrow1.posZ = this.posZ + vec3.zCoord * d8;
          this.worldObj.spawnEntityInWorld((Entity)entitycrow1);
        } 
        if (this.attackCounter == 200);
        if (this.attackCounter == 230);
        if (this.attackCounter == 250);
        if (this.attackCounter == 300);
        if (this.attackCounter == 350);
        if (this.attackCounter == 400)
          this.attackCounter = -40; 
      } else if (this.attackCounter > 0) {
        this.attackCounter--;
      } 
    } else {
      this.renderYawOffset = this.rotationYaw = -((float)Math.atan2(this.motionX, this.motionZ)) * 180.0F / 3.1415927F;
      if (this.attackCounter > 0)
        this.attackCounter--; 
    } 
    if (!this.worldObj.isRemote) {
      byte b1 = this.dataWatcher.getWatchableObjectByte(16);
      byte b0 = (byte)((this.attackCounter > 10) ? 1 : 0);
      if (b1 != b0)
        this.dataWatcher.updateObject(16, Byte.valueOf(b0)); 
    } 
  }
  
  private boolean isCourseTraversable(double p_70790_1_, double p_70790_3_, double p_70790_5_, double p_70790_7_) {
    double d4 = (this.waypointX - this.posX) / p_70790_7_;
    double d5 = (this.waypointY - this.posY) / p_70790_7_;
    double d6 = (this.waypointZ - this.posZ) / p_70790_7_;
    AxisAlignedBB axisalignedbb = this.boundingBox.copy();
    for (int i = 1; i < p_70790_7_; i++) {
      axisalignedbb.offset(d4, d5, d6);
      if (!this.worldObj.getCollidingBoundingBoxes((Entity)this, axisalignedbb).isEmpty())
        return false; 
    } 
    return true;
  }
  
  protected Item getDropItem() {
    return Items.gunpowder;
  }
  
  protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
    int j = this.rand.nextInt(2) + this.rand.nextInt(1 + p_70628_2_);
    int k;
    for (k = 0; k < j; k++)
      dropItem(Items.ghast_tear, 1); 
    j = this.rand.nextInt(3) + this.rand.nextInt(1 + p_70628_2_);
    for (k = 0; k < j; k++)
      dropItem(Items.gunpowder, 1); 
  }
  
  public boolean getCanSpawnHere() {
    return (this.rand.nextInt(20) == 0 && super.getCanSpawnHere() && this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL);
  }
  
  public int getMaxSpawnedInChunk() {
    return 1;
  }
  
  public void writeEntityToNBT(NBTTagCompound p_70014_1_) {
    super.writeEntityToNBT(p_70014_1_);
    p_70014_1_.setInteger("ExplosionPower", this.explosionStrength);
  }
  
  public void readEntityFromNBT(NBTTagCompound p_70037_1_) {
    super.readEntityFromNBT(p_70037_1_);
    if (p_70037_1_.hasKey("ExplosionPower", 99))
      this.explosionStrength = p_70037_1_.getInteger("ExplosionPower"); 
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

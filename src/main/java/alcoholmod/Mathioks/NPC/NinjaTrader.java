package alcoholmod.Mathioks.NPC;

import alcoholmod.Mathioks.AddedItems;
import alcoholmod.Mathioks.AlcoholMod;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.INpc;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIFollowGolem;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookAtTradePlayer;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPlay;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITradePlayer;
import net.minecraft.entity.ai.EntityAIVillagerMate;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Tuple;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.village.Village;
import net.minecraft.world.World;

public class NinjaTrader extends EntityVillager implements IMerchant, INpc {
  private int randomTickDivider;
  
  private boolean isMating;
  
  private boolean isPlaying;
  
  Village villageObj;
  
  private EntityPlayer buyingPlayer;
  
  private MerchantRecipeList buyingList;
  
  private int timeUntilReset;
  
  private boolean needsInitilization;
  
  private int wealth;
  
  private String lastBuyingPlayer;
  
  private boolean isLookingForHome;
  
  private float field_82191_bN;
  
  public static final Map villagersSellingList = new HashMap<Object, Object>();
  
  public static final Map blacksmithSellingList = new HashMap<Object, Object>();
  
  private static final String __OBFID = "CL_00001707";
  
  public NinjaTrader(World p_i1747_1_) {
    this(p_i1747_1_, 0);
  }
  
  public NinjaTrader(World p_i1748_1_, int p_i1748_2_) {
    super(p_i1748_1_);
    setProfession(p_i1748_2_);
    setSize(0.6F, 1.8F);
    getNavigator().setBreakDoors(true);
    getNavigator().setAvoidsWater(true);
    this.tasks.addTask(0, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityZombie.class, 8.0F, 0.6D, 0.6D));
    this.tasks.addTask(1, (EntityAIBase)new EntityAITradePlayer(this));
    this.tasks.addTask(1, (EntityAIBase)new EntityAILookAtTradePlayer(this));
    this.tasks.addTask(2, (EntityAIBase)new EntityAIMoveIndoors((EntityCreature)this));
    this.tasks.addTask(3, (EntityAIBase)new EntityAIRestrictOpenDoor((EntityCreature)this));
    this.tasks.addTask(4, (EntityAIBase)new EntityAIOpenDoor((EntityLiving)this, true));
    this.tasks.addTask(5, (EntityAIBase)new EntityAIMoveTowardsRestriction((EntityCreature)this, 0.6D));
    this.tasks.addTask(6, (EntityAIBase)new EntityAIVillagerMate(this));
    this.tasks.addTask(7, (EntityAIBase)new EntityAIFollowGolem(this));
    this.tasks.addTask(8, (EntityAIBase)new EntityAIPlay(this, 0.32D));
    this.tasks.addTask(9, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, EntityPlayer.class, 3.0F, 1.0F));
    this.tasks.addTask(9, (EntityAIBase)new EntityAIWatchClosest2((EntityLiving)this, NinjaTrader.class, 5.0F, 0.02F));
    this.tasks.addTask(9, (EntityAIBase)new EntityAIWander((EntityCreature)this, 0.6D));
    this.tasks.addTask(10, (EntityAIBase)new EntityAIWatchClosest((EntityLiving)this, EntityLiving.class, 8.0F));
    this.targetTasks.addTask(1, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true));
    this.tasks.addTask(12, (EntityAIBase)new EntityAILeapAtTarget((EntityLiving)this, 1.0F));
  }
  
  protected void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
  }
  
  public boolean isAIEnabled() {
    return true;
  }
  
  protected void updateAITick() {
    if (--this.randomTickDivider <= 0) {
      this.worldObj.villageCollectionObj.addVillagerPosition(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ));
      this.randomTickDivider = 70 + this.rand.nextInt(50);
      this.villageObj = this.worldObj.villageCollectionObj.findNearestVillage(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ), 32);
      if (this.villageObj == null) {
        detachHome();
      } else {
        ChunkCoordinates chunkcoordinates = this.villageObj.getCenter();
        setHomeArea(chunkcoordinates.posX, chunkcoordinates.posY, chunkcoordinates.posZ, (int)(this.villageObj.getVillageRadius() * 0.6F));
        if (this.isLookingForHome) {
          this.isLookingForHome = false;
          this.villageObj.setDefaultPlayerReputation(5);
        } 
      } 
    } 
    if (!isTrading() && this.timeUntilReset > 0) {
      this.timeUntilReset--;
      if (this.timeUntilReset <= 0) {
        if (this.needsInitilization) {
          if (this.buyingList.size() > 1) {
            Iterator<MerchantRecipe> iterator = this.buyingList.iterator();
            while (iterator.hasNext()) {
              MerchantRecipe merchantrecipe = iterator.next();
              if (merchantrecipe.isRecipeDisabled())
                merchantrecipe.func_82783_a(this.rand.nextInt(6) + this.rand.nextInt(6) + 2); 
            } 
          } 
          addDefaultEquipmentAndRecipies(1);
          this.needsInitilization = false;
          if (this.villageObj != null && this.lastBuyingPlayer != null) {
            this.worldObj.setEntityState((Entity)this, (byte)14);
            this.villageObj.setReputationForPlayer(this.lastBuyingPlayer, 1);
          } 
        } 
        addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 0));
      } 
    } 
    super.updateAITick();
  }
  
  public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_) {
    if (isEntityInvulnerable())
      return false; 
    Entity entity = p_70097_1_.getEntity();
    if (entity != null && !(entity instanceof EntityPlayer) && !(entity instanceof net.minecraft.entity.projectile.EntityArrow))
      p_70097_2_ = (p_70097_2_ + 1.0F) / 2.0F; 
    return super.attackEntityFrom(p_70097_1_, 5.0F);
  }
  
  public boolean attackEntityAsMob(Entity par1Entity) {
    int i = 5;
    i += EnchantmentHelper.getKnockbackModifier((EntityLivingBase)this, (EntityLivingBase)par1Entity);
    boolean flag = par1Entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this), i);
    if (flag && i > 0) {
      par1Entity.addVelocity((-MathHelper.sin(this.rotationYaw * 3.1415927F / 180.0F) * i * 0.5F), 0.1D, (MathHelper.cos(this.rotationYaw * 3.1415927F / 180.0F) * i * 0.5F));
      this.motionX *= 0.6D;
      this.motionZ *= 0.6D;
    } 
    return flag;
  }
  
  public int getMaxSpawnedInChunk() {
    return 1;
  }
  
  public boolean interact(EntityPlayer p_70085_1_) {
    ItemStack itemstack = p_70085_1_.inventory.getCurrentItem();
    boolean flag = (itemstack != null && itemstack.getItem() == Items.spawn_egg);
    if (!flag && isEntityAlive() && !isTrading() && !isChild() && !p_70085_1_.isSneaking()) {
      if (!this.worldObj.isRemote) {
        setCustomer(p_70085_1_);
        p_70085_1_.displayGUIMerchant(this, getCustomNameTag());
      } 
      return true;
    } 
    return super.interact(p_70085_1_);
  }
  
  protected void entityInit() {
    super.entityInit();
  }
  
  public void writeEntityToNBT(NBTTagCompound p_70014_1_) {
    super.writeEntityToNBT(p_70014_1_);
    p_70014_1_.setInteger("Profession", getProfession());
    p_70014_1_.setInteger("Riches", this.wealth);
    if (this.buyingList != null)
      p_70014_1_.setTag("Offers", (NBTBase)this.buyingList.getRecipiesAsTags()); 
  }
  
  public void readEntityFromNBT(NBTTagCompound p_70037_1_) {
    super.readEntityFromNBT(p_70037_1_);
    setProfession(p_70037_1_.getInteger("Profession"));
    this.wealth = p_70037_1_.getInteger("Riches");
    if (p_70037_1_.hasKey("Offers", 10)) {
      NBTTagCompound nbttagcompound1 = p_70037_1_.getCompoundTag("Offers");
      this.buyingList = new MerchantRecipeList(nbttagcompound1);
    } 
  }
  
  protected boolean canDespawn() {
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
  
  public void setProfession(int p_70938_1_) {
    this.dataWatcher.updateObject(16, Integer.valueOf(p_70938_1_));
  }
  
  public int getProfession() {
    return this.dataWatcher.getWatchableObjectInt(16);
  }
  
  public boolean isMating() {
    return this.isMating;
  }
  
  public void setMating(boolean p_70947_1_) {
    this.isMating = p_70947_1_;
  }
  
  public void setPlaying(boolean p_70939_1_) {
    this.isPlaying = p_70939_1_;
  }
  
  public boolean isPlaying() {
    return this.isPlaying;
  }
  
  protected float getSoundVolume() {
    return 0.0F;
  }
  
  public void setRevengeTarget(EntityLivingBase p_70604_1_) {
    super.setRevengeTarget(p_70604_1_);
    if (this.villageObj != null && p_70604_1_ != null) {
      this.villageObj.addOrRenewAgressor(p_70604_1_);
      if (p_70604_1_ instanceof EntityPlayer) {
        byte b0 = -1;
        if (isChild())
          b0 = -3; 
        this.villageObj.setReputationForPlayer(p_70604_1_.getCommandSenderName(), b0);
        if (isEntityAlive())
          this.worldObj.setEntityState((Entity)this, (byte)13); 
      } 
    } 
  }
  
  public void onDeath(DamageSource p_70645_1_) {
    if (this.villageObj != null) {
      Entity entity = p_70645_1_.getEntity();
      if (entity != null) {
        if (entity instanceof EntityPlayer) {
          this.villageObj.setReputationForPlayer(entity.getCommandSenderName(), -2);
        } else if (entity instanceof net.minecraft.entity.monster.IMob) {
          this.villageObj.endMatingSeason();
        } 
      } else if (entity == null) {
        EntityPlayer entityplayer = this.worldObj.getClosestPlayerToEntity((Entity)this, 16.0D);
        if (entityplayer != null)
          this.villageObj.endMatingSeason(); 
      } 
    } 
    super.onDeath(p_70645_1_);
  }
  
  public void setCustomer(EntityPlayer p_70932_1_) {
    this.buyingPlayer = p_70932_1_;
  }
  
  public EntityPlayer getCustomer() {
    return this.buyingPlayer;
  }
  
  public boolean isTrading() {
    return (this.buyingPlayer != null);
  }
  
  public void useRecipe(MerchantRecipe p_70933_1_) {
    p_70933_1_.incrementToolUses();
    this.livingSoundTime = -getTalkInterval();
    playSound("mob.villager.yes", getSoundVolume(), getSoundPitch());
    if (p_70933_1_.hasSameIDsAs((MerchantRecipe)this.buyingList.get(this.buyingList.size() - 1))) {
      this.timeUntilReset = 40;
      this.needsInitilization = true;
      if (this.buyingPlayer != null) {
        this.lastBuyingPlayer = this.buyingPlayer.getCommandSenderName();
      } else {
        this.lastBuyingPlayer = null;
      } 
    } 
    if (p_70933_1_.getItemToBuy().getItem() == AlcoholMod.RyoGold)
      this.wealth += (p_70933_1_.getItemToBuy()).stackSize; 
  }
  
  public void func_110297_a_(ItemStack p_110297_1_) {
    if (!this.worldObj.isRemote && this.livingSoundTime > -getTalkInterval() + 20) {
      this.livingSoundTime = -getTalkInterval();
      if (p_110297_1_ != null) {
        playSound("mob.villager.yes", getSoundVolume(), getSoundPitch());
      } else {
        playSound("mob.villager.no", getSoundVolume(), getSoundPitch());
      } 
    } 
  }
  
  public MerchantRecipeList getRecipes(EntityPlayer p_70934_1_) {
    if (this.buyingList == null)
      addDefaultEquipmentAndRecipies(1); 
    return this.buyingList;
  }
  
  private float adjustProbability(float p_82188_1_) {
    float f1 = p_82188_1_ + this.field_82191_bN;
    return (f1 > 0.9F) ? (0.9F - f1 - 0.9F) : f1;
  }
  
  private void addDefaultEquipmentAndRecipies(int p_70950_1_) {
    if (this.buyingList != null) {
      this.field_82191_bN = MathHelper.sqrt_float(this.buyingList.size()) * 0.2F;
    } else {
      this.field_82191_bN = 0.0F;
    } 
    MerchantRecipeList merchantrecipelist = new MerchantRecipeList();
    VillagerRegistry.manageVillagerTrades(merchantrecipelist, this, getProfession(), this.rand);
    switch (getProfession()) {
      case 0:
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 60), new ItemStack(AlcoholMod.RegularJutsuItem, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.5F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoGold, 50), new ItemStack(AlcoholMod.RareJutsuItem, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.1F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoGold, 50), new ItemStack(AlcoholMod.RyoGold, 50), new ItemStack(AlcoholMod.UltimateJutsuItem, 1, 0))); 
        break;
      case 1:
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 1), new ItemStack(AlcoholMod.MilitaryPillPurple, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.9F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 3), new ItemStack(AlcoholMod.MilitaryPillGreen, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.8F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 5), new ItemStack(AlcoholMod.MilitaryPillBrown, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.4F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 12), new ItemStack(AlcoholMod.MilitaryPillBlue, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.4F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 12), new ItemStack(AlcoholMod.MilitaryPillOrange, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.2F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 25), new ItemStack(AlcoholMod.MilitaryPillRed, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.1F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 40), new ItemStack(AlcoholMod.MilitaryPillYellow, 1, 0))); 
        break;
      case 2:
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsshisui, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsshisui, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateshisui, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetshisui, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootssasuketaka2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legssasuketaka2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatesasuketaka2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetsasuketaka2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootszabuza, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legszabuza, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatezabuza, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetzabuza, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootszabuza3, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legszabuza3, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatezabuza3, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetzabuza3, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsboruto, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsboruto, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateboruto, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetboruto, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsgaara, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsgaara, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplategaara, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootshikari, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legshikari, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatehikari, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmethikari, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootskabuto, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legskabuto, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatekabuto, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetkabuto, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootschoji, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legschoji, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatechoji, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootstsuchikage, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legstsuchikage, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatetsuchikage, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmettsuchikage, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsYaguro, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsYaguro, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateYaguro, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsYugito, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsYugito, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateYugito, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsObitoYoung, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsObitoYoung, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateObitoYoung, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetObitoYoung, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsobito3, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsobito3, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateobito3, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetobito3, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootslee, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legslee, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatelee, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootshinata, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legshinata, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatehinata, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmethinata, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsneji2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsneji2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateneji2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootssakura, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legssakura, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatesakura, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetsakura, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootssasori, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legssasori, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatesasori, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetsasori, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootssasuke2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legssasuke2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatesasuke2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetsasuke2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootstobirama, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legstobirama, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatetobirama, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmettobirama, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootssasukertr, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legssasukertr, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatesasukertr, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetsasukertr, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsshikamaruyoung, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsshikamaruyoung, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateshikamaruyoung, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootssakura2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legssakura2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatesakura2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootssarada, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legssarada, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatesarada, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetsarada, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootssasukethelast, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legssasukethelast, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatesasukethelast, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetsasukethelast, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsnarutothelast, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsnarutothelast, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatenarutothelast, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetnarutothelast, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootshinatathelast, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legshinatathelast, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatehinatathelast, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsHaku, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsHaku, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateHaku, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsHan2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsHan2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateHan2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetHan2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsino, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsino, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateino, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsdeidara, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsdeidara, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatedeidara, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetdeidara, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsRoshi, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsRoshi, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateRoshi, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetRoshi, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsrin, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsrin, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplaterin, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsNaruto, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsNaruto, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateNaruto, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsminatogenin, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsminatogenin, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateminatogenin, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsmenma, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsmenma, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatemenma, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetmenma, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsKillerB, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsKillerB, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateKillerB, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetKillerB, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsSamurai, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsSamurai, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateSamurai, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetSamurai, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootskimimaro, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legskimimaro, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplatekimimaro, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsSasuke, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsSasuke, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateSasuke, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetSasuke, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsGenin, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsGenin, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateGenin, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetGenin, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsSixPaths, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsSixPaths, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateSixPaths, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetSixPaths, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.bootsJounin, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.legsJounin, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.chestplateJounin, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.helmetJounin, 1, 0))); 
        break;
      case 3:
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 5), new ItemStack(AlcoholMod.SmokeBomb, 5 + this.rand.nextInt(10), 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.PoisonBomb, 5 + this.rand.nextInt(10), 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 5), new ItemStack(AlcoholMod.kunai, 10 + this.rand.nextInt(10), 0))); 
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 5), new ItemStack(AlcoholMod.ShurikenSmallItem, 10 + this.rand.nextInt(10), 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.5F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AlcoholMod.ShurikenItem, 10 + this.rand.nextInt(10), 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.7F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 15), new ItemStack(AddedItems.TantoStone, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.7F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 20), new ItemStack(AddedItems.Tanto, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.7F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 10), new ItemStack(AddedItems.WoodKatana, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.5F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 30), new ItemStack(Items.gold_ingot, 3), new ItemStack(AddedItems.KatanaGold, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.5F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 30), new ItemStack(Items.iron_ingot, 3), new ItemStack(AddedItems.KatanaSilver, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.5F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 30), new ItemStack(Items.emerald, 3), new ItemStack(AddedItems.KatanaEmerald, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.5F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 30), new ItemStack(Items.diamond, 3), new ItemStack(AddedItems.KatanaDiamond, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.5F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 30), new ItemStack(AddedItems.Katana, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.5F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 50), new ItemStack(AddedItems.Katana3, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.5F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 50), new ItemStack(AddedItems.Katana7, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.5F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 50), new ItemStack(AddedItems.Katana5, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.5F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 50), new ItemStack(AddedItems.Katana4, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.5F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 50), new ItemStack(AddedItems.SNDKatana, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.5F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 50), new ItemStack(AddedItems.SNDKatana2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.1F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoGold, 10), new ItemStack(AddedItems.Katana2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.1F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoGold, 64), new ItemStack(AddedItems.Cleaver, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.1F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoGold, 64), new ItemStack(AddedItems.LightningBlade, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.1F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoGold, 64), new ItemStack(AddedItems.Kusanagi, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.1F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoGold, 64), new ItemStack(AddedItems.UchihaKusanagi, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.1F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoGold, 64), new ItemStack(AddedItems.UchihaKusanagi2, 1, 0))); 
        if (this.rand.nextFloat() < adjustProbability(0.1F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoGold, 64), new ItemStack(AlcoholMod.RyoGold, 64), new ItemStack(AlcoholMod.FlyingThunderKunaiItem, 1, 0))); 
        break;
      case 4:
        if (this.rand.nextFloat() < adjustProbability(1.0F))
          merchantrecipelist.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoBronze, 1), new ItemStack(AlcoholMod.Ramen, 1, 0))); 
        break;
    } 
    if (merchantrecipelist.isEmpty())
      func_146091_a(merchantrecipelist, Items.gold_ingot, this.rand, 1.0F); 
    Collections.shuffle((List<?>)merchantrecipelist);
    if (this.buyingList == null)
      this.buyingList = new MerchantRecipeList(); 
    for (int l = 0; l < p_70950_1_ && l < merchantrecipelist.size(); l++)
      this.buyingList.addToListWithCheck((MerchantRecipe)merchantrecipelist.get(l)); 
  }
  
  @SideOnly(Side.CLIENT)
  public void setRecipes(MerchantRecipeList p_70930_1_) {}
  
  public static void func_146091_a(MerchantRecipeList p_146091_0_, Item p_146091_1_, Random p_146091_2_, float p_146091_3_) {
    if (p_146091_2_.nextFloat() < 0.0F)
      p_146091_0_.add(new MerchantRecipe(func_146088_a(p_146091_1_, p_146091_2_), Items.emerald)); 
  }
  
  private static ItemStack func_146088_a(Item p_146088_0_, Random p_146088_1_) {
    return new ItemStack(p_146088_0_, func_146092_b(p_146088_0_, p_146088_1_), 0);
  }
  
  private static int func_146092_b(Item p_146092_0_, Random p_146092_1_) {
    Tuple tuple = (Tuple)villagersSellingList.get(p_146092_0_);
    return (tuple == null) ? 1 : ((((Integer)tuple.getFirst()).intValue() >= ((Integer)tuple.getSecond()).intValue()) ? ((Integer)tuple.getFirst()).intValue() : (((Integer)tuple.getFirst()).intValue() + p_146092_1_.nextInt(((Integer)tuple.getSecond()).intValue() - ((Integer)tuple.getFirst()).intValue())));
  }
  
  public static void func_146089_b(MerchantRecipeList p_146089_0_, Item p_146089_1_, Random p_146089_2_, float p_146089_3_) {
    if (p_146089_2_.nextFloat() < p_146089_3_) {
      ItemStack itemstack, itemstack1;
      int i = func_146090_c(p_146089_1_, p_146089_2_);
      if (i < 0) {
        itemstack = new ItemStack(AlcoholMod.RyoGold, 8, 0);
        itemstack1 = new ItemStack(p_146089_1_, -i, 0);
      } else {
        itemstack = new ItemStack(AlcoholMod.RyoGold, i, 0);
        itemstack1 = new ItemStack(p_146089_1_, 1, 0);
      } 
      p_146089_0_.add(new MerchantRecipe(itemstack, itemstack1));
    } 
  }
  
  private static int func_146090_c(Item p_146090_0_, Random p_146090_1_) {
    Tuple tuple = (Tuple)blacksmithSellingList.get(p_146090_0_);
    return (tuple == null) ? 1 : ((((Integer)tuple.getFirst()).intValue() >= ((Integer)tuple.getSecond()).intValue()) ? ((Integer)tuple.getFirst()).intValue() : (((Integer)tuple.getFirst()).intValue() + p_146090_1_.nextInt(((Integer)tuple.getSecond()).intValue() - ((Integer)tuple.getFirst()).intValue())));
  }
  
  @SideOnly(Side.CLIENT)
  public void handleHealthUpdate(byte p_70103_1_) {
    if (p_70103_1_ == 12) {
      generateRandomParticles("heart");
    } else if (p_70103_1_ == 13) {
      generateRandomParticles("angryVillager");
    } else if (p_70103_1_ == 14) {
      generateRandomParticles("happyVillager");
    } else {
      super.handleHealthUpdate(p_70103_1_);
    } 
  }
  
  public IEntityLivingData onSpawnWithEgg(IEntityLivingData p_110161_1_) {
    p_110161_1_ = super.onSpawnWithEgg(p_110161_1_);
    VillagerRegistry.applyRandomTrade(this, this.worldObj.rand);
    return p_110161_1_;
  }
  
  @SideOnly(Side.CLIENT)
  private void generateRandomParticles(String p_70942_1_) {
    for (int i = 0; i < 5; i++) {
      double d0 = this.rand.nextGaussian() * 0.02D;
      double d1 = this.rand.nextGaussian() * 0.02D;
      double d2 = this.rand.nextGaussian() * 0.02D;
      this.worldObj.spawnParticle(p_70942_1_, this.posX + (this.rand.nextFloat() * this.width * 2.0F) - this.width, this.posY + 1.0D + (this.rand.nextFloat() * this.height), this.posZ + (this.rand.nextFloat() * this.width * 2.0F) - this.width, d0, d1, d2);
    } 
  }
  
  public void setLookingForHome() {
    this.isLookingForHome = true;
  }
  
  public NinjaTrader createChild(EntityAgeable p_90011_1_) {
    return null;
  }
  
  public boolean allowLeashing() {
    return false;
  }
  
  public boolean getCanSpawnHere() {
    return super.getCanSpawnHere();
  }
  
  static {
    villagersSellingList.put(Items.coal, new Tuple(Integer.valueOf(16), Integer.valueOf(24)));
    villagersSellingList.put(Items.iron_ingot, new Tuple(Integer.valueOf(8), Integer.valueOf(10)));
    villagersSellingList.put(Items.gold_ingot, new Tuple(Integer.valueOf(8), Integer.valueOf(10)));
    villagersSellingList.put(Items.diamond, new Tuple(Integer.valueOf(4), Integer.valueOf(6)));
    villagersSellingList.put(Items.paper, new Tuple(Integer.valueOf(24), Integer.valueOf(36)));
    villagersSellingList.put(Items.book, new Tuple(Integer.valueOf(11), Integer.valueOf(13)));
    villagersSellingList.put(Items.written_book, new Tuple(Integer.valueOf(1), Integer.valueOf(1)));
    villagersSellingList.put(Items.ender_pearl, new Tuple(Integer.valueOf(3), Integer.valueOf(4)));
    villagersSellingList.put(Items.ender_eye, new Tuple(Integer.valueOf(2), Integer.valueOf(3)));
    villagersSellingList.put(Items.porkchop, new Tuple(Integer.valueOf(14), Integer.valueOf(18)));
    villagersSellingList.put(Items.beef, new Tuple(Integer.valueOf(14), Integer.valueOf(18)));
    villagersSellingList.put(Items.chicken, new Tuple(Integer.valueOf(14), Integer.valueOf(18)));
    villagersSellingList.put(Items.cooked_fished, new Tuple(Integer.valueOf(9), Integer.valueOf(13)));
    villagersSellingList.put(Items.wheat_seeds, new Tuple(Integer.valueOf(34), Integer.valueOf(48)));
    villagersSellingList.put(Items.melon_seeds, new Tuple(Integer.valueOf(30), Integer.valueOf(38)));
    villagersSellingList.put(Items.pumpkin_seeds, new Tuple(Integer.valueOf(30), Integer.valueOf(38)));
    villagersSellingList.put(Items.wheat, new Tuple(Integer.valueOf(18), Integer.valueOf(22)));
    villagersSellingList.put(Item.getItemFromBlock(Blocks.wool), new Tuple(Integer.valueOf(14), Integer.valueOf(22)));
    villagersSellingList.put(Items.rotten_flesh, new Tuple(Integer.valueOf(36), Integer.valueOf(64)));
    blacksmithSellingList.put(Items.flint_and_steel, new Tuple(Integer.valueOf(3), Integer.valueOf(4)));
    blacksmithSellingList.put(Items.shears, new Tuple(Integer.valueOf(3), Integer.valueOf(4)));
    blacksmithSellingList.put(Items.iron_sword, new Tuple(Integer.valueOf(7), Integer.valueOf(11)));
    blacksmithSellingList.put(Items.diamond_sword, new Tuple(Integer.valueOf(12), Integer.valueOf(14)));
    blacksmithSellingList.put(Items.iron_axe, new Tuple(Integer.valueOf(6), Integer.valueOf(8)));
    blacksmithSellingList.put(Items.diamond_axe, new Tuple(Integer.valueOf(9), Integer.valueOf(12)));
    blacksmithSellingList.put(Items.iron_pickaxe, new Tuple(Integer.valueOf(7), Integer.valueOf(9)));
    blacksmithSellingList.put(Items.diamond_pickaxe, new Tuple(Integer.valueOf(10), Integer.valueOf(12)));
    blacksmithSellingList.put(Items.iron_shovel, new Tuple(Integer.valueOf(4), Integer.valueOf(6)));
    blacksmithSellingList.put(Items.diamond_shovel, new Tuple(Integer.valueOf(7), Integer.valueOf(8)));
    blacksmithSellingList.put(Items.iron_hoe, new Tuple(Integer.valueOf(4), Integer.valueOf(6)));
    blacksmithSellingList.put(Items.diamond_hoe, new Tuple(Integer.valueOf(7), Integer.valueOf(8)));
    blacksmithSellingList.put(Items.iron_boots, new Tuple(Integer.valueOf(4), Integer.valueOf(6)));
    blacksmithSellingList.put(Items.diamond_boots, new Tuple(Integer.valueOf(7), Integer.valueOf(8)));
    blacksmithSellingList.put(Items.iron_helmet, new Tuple(Integer.valueOf(4), Integer.valueOf(6)));
    blacksmithSellingList.put(Items.diamond_helmet, new Tuple(Integer.valueOf(7), Integer.valueOf(8)));
    blacksmithSellingList.put(Items.iron_chestplate, new Tuple(Integer.valueOf(10), Integer.valueOf(14)));
    blacksmithSellingList.put(Items.diamond_chestplate, new Tuple(Integer.valueOf(16), Integer.valueOf(19)));
    blacksmithSellingList.put(Items.iron_leggings, new Tuple(Integer.valueOf(8), Integer.valueOf(10)));
    blacksmithSellingList.put(Items.diamond_leggings, new Tuple(Integer.valueOf(11), Integer.valueOf(14)));
    blacksmithSellingList.put(Items.chainmail_boots, new Tuple(Integer.valueOf(5), Integer.valueOf(7)));
    blacksmithSellingList.put(Items.chainmail_helmet, new Tuple(Integer.valueOf(5), Integer.valueOf(7)));
    blacksmithSellingList.put(Items.chainmail_chestplate, new Tuple(Integer.valueOf(11), Integer.valueOf(15)));
    blacksmithSellingList.put(Items.chainmail_leggings, new Tuple(Integer.valueOf(9), Integer.valueOf(11)));
    blacksmithSellingList.put(Items.bread, new Tuple(Integer.valueOf(-4), Integer.valueOf(-2)));
    blacksmithSellingList.put(Items.melon, new Tuple(Integer.valueOf(-8), Integer.valueOf(-4)));
    blacksmithSellingList.put(Items.apple, new Tuple(Integer.valueOf(-8), Integer.valueOf(-4)));
    blacksmithSellingList.put(Items.cookie, new Tuple(Integer.valueOf(-10), Integer.valueOf(-7)));
    blacksmithSellingList.put(Item.getItemFromBlock(Blocks.glass), new Tuple(Integer.valueOf(-5), Integer.valueOf(-3)));
    blacksmithSellingList.put(Item.getItemFromBlock(Blocks.bookshelf), new Tuple(Integer.valueOf(3), Integer.valueOf(4)));
    blacksmithSellingList.put(Items.leather_chestplate, new Tuple(Integer.valueOf(4), Integer.valueOf(5)));
    blacksmithSellingList.put(Items.leather_boots, new Tuple(Integer.valueOf(2), Integer.valueOf(4)));
    blacksmithSellingList.put(Items.leather_helmet, new Tuple(Integer.valueOf(2), Integer.valueOf(4)));
    blacksmithSellingList.put(Items.leather_leggings, new Tuple(Integer.valueOf(2), Integer.valueOf(4)));
    blacksmithSellingList.put(Items.saddle, new Tuple(Integer.valueOf(6), Integer.valueOf(8)));
    blacksmithSellingList.put(Items.experience_bottle, new Tuple(Integer.valueOf(-4), Integer.valueOf(-1)));
    blacksmithSellingList.put(Items.redstone, new Tuple(Integer.valueOf(-4), Integer.valueOf(-1)));
    blacksmithSellingList.put(Items.compass, new Tuple(Integer.valueOf(10), Integer.valueOf(12)));
    blacksmithSellingList.put(Items.clock, new Tuple(Integer.valueOf(10), Integer.valueOf(12)));
    blacksmithSellingList.put(Item.getItemFromBlock(Blocks.glowstone), new Tuple(Integer.valueOf(-3), Integer.valueOf(-1)));
    blacksmithSellingList.put(Items.cooked_porkchop, new Tuple(Integer.valueOf(-7), Integer.valueOf(-5)));
    blacksmithSellingList.put(Items.cooked_beef, new Tuple(Integer.valueOf(-7), Integer.valueOf(-5)));
    blacksmithSellingList.put(Items.cooked_chicken, new Tuple(Integer.valueOf(-8), Integer.valueOf(-6)));
    blacksmithSellingList.put(Items.ender_eye, new Tuple(Integer.valueOf(7), Integer.valueOf(11)));
    blacksmithSellingList.put(Items.arrow, new Tuple(Integer.valueOf(-12), Integer.valueOf(-8)));
  }
}

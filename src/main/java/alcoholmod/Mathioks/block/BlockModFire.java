package alcoholmod.Mathioks.block;

import com.google.common.collect.Maps;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.block.material.MapColor;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockModFire extends BlockFire {
  @Deprecated
  private int[] field_149849_a = new int[4096];
  
  @Deprecated
  private int[] field_149848_b = new int[4096];
  
  @SideOnly(Side.CLIENT)
  private IIcon[] field_149850_M;
  
  private static final String __OBFID = "CL_00000245";
  
  private IdentityHashMap blockInfo = Maps.newIdentityHashMap();
  
  private int ticksExisted;
  
  protected BlockModFire(String name) {
    setTickRandomly(true);
    setBlockName(name);
    setBlockTextureName("tm:" + name);
    setLightLevel(1.0F);
    this.ticksExisted = 0;
  }
  
  public static void func_149843_e() {}
  
  @Deprecated
  public void func_149842_a(int p_149842_1_, int p_149842_2_, int p_149842_3_) {
    setFireInfo((Block)Block.blockRegistry.getObjectById(p_149842_1_), p_149842_2_, p_149842_3_);
  }
  
  public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
    return null;
  }
  
  public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
    if (entity instanceof net.minecraft.entity.EntityLivingBase) {
      entity.setFire(20);
      entity.attackEntityFrom(DamageSource.inFire, 4.0F);
    } 
  }
  
  public boolean isOpaqueCube() {
    return false;
  }
  
  public boolean renderAsNormalBlock() {
    return false;
  }
  
  public int getRenderType() {
    return 3;
  }
  
  public int quantityDropped(Random p_149745_1_) {
    return 0;
  }
  
  public int tickRate(World p_149738_1_) {
    return 30;
  }
  
  public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_) {
    if (p_149674_1_.getGameRules().getGameRuleBooleanValue("doFireTick")) {
      this.ticksExisted++;
      if (this.ticksExisted >= 1) {
        p_149674_1_.setBlockToAir(p_149674_2_, p_149674_3_, p_149674_4_);
        this.ticksExisted = 0;
      } 
    } 
  }
  
  public boolean func_149698_L() {
    return false;
  }
  
  @Deprecated
  private void tryCatchFire(World p_149841_1_, int p_149841_2_, int p_149841_3_, int p_149841_4_, int p_149841_5_, Random p_149841_6_, int p_149841_7_) {
    tryCatchFire(p_149841_1_, p_149841_2_, p_149841_3_, p_149841_4_, p_149841_5_, p_149841_6_, p_149841_7_, ForgeDirection.UP);
  }
  
  private void tryCatchFire(World p_149841_1_, int p_149841_2_, int p_149841_3_, int p_149841_4_, int p_149841_5_, Random p_149841_6_, int p_149841_7_, ForgeDirection face) {
    int j1 = p_149841_1_.getBlock(p_149841_2_, p_149841_3_, p_149841_4_).getFlammability((IBlockAccess)p_149841_1_, p_149841_2_, p_149841_3_, p_149841_4_, face);
    if (p_149841_6_.nextInt(p_149841_5_) < j1) {
      boolean flag = (p_149841_1_.getBlock(p_149841_2_, p_149841_3_, p_149841_4_) == Blocks.tnt);
      if (p_149841_6_.nextInt(p_149841_7_ + 10) < 5 && !p_149841_1_.canLightningStrikeAt(p_149841_2_, p_149841_3_, p_149841_4_)) {
        int k1 = p_149841_7_ + p_149841_6_.nextInt(5) / 4;
        if (k1 > 15)
          k1 = 15; 
      } else {
        p_149841_1_.setBlockToAir(p_149841_2_, p_149841_3_ + 1, p_149841_4_);
      } 
      if (flag)
        Blocks.tnt.onBlockDestroyedByPlayer(p_149841_1_, p_149841_2_, p_149841_3_, p_149841_4_, 1); 
    } 
  }
  
  private boolean canNeighborBurn(World p_149847_1_, int p_149847_2_, int p_149847_3_, int p_149847_4_) {
    return (canCatchFire((IBlockAccess)p_149847_1_, p_149847_2_ + 1, p_149847_3_, p_149847_4_, ForgeDirection.WEST) || canCatchFire((IBlockAccess)p_149847_1_, p_149847_2_ - 1, p_149847_3_, p_149847_4_, ForgeDirection.EAST) || canCatchFire((IBlockAccess)p_149847_1_, p_149847_2_, p_149847_3_ - 1, p_149847_4_, ForgeDirection.UP) || canCatchFire((IBlockAccess)p_149847_1_, p_149847_2_, p_149847_3_ + 1, p_149847_4_, ForgeDirection.DOWN) || canCatchFire((IBlockAccess)p_149847_1_, p_149847_2_, p_149847_3_, p_149847_4_ - 1, ForgeDirection.SOUTH) || canCatchFire((IBlockAccess)p_149847_1_, p_149847_2_, p_149847_3_, p_149847_4_ + 1, ForgeDirection.NORTH));
  }
  
  private int getChanceOfNeighborsEncouragingFire(World p_149845_1_, int p_149845_2_, int p_149845_3_, int p_149845_4_) {
    byte b0 = 0;
    if (!p_149845_1_.isAirBlock(p_149845_2_, p_149845_3_, p_149845_4_))
      return 0; 
    int l = getChanceToEncourageFire((IBlockAccess)p_149845_1_, p_149845_2_ + 1, p_149845_3_, p_149845_4_, b0, ForgeDirection.WEST);
    l = getChanceToEncourageFire((IBlockAccess)p_149845_1_, p_149845_2_ - 1, p_149845_3_, p_149845_4_, l, ForgeDirection.EAST);
    l = getChanceToEncourageFire((IBlockAccess)p_149845_1_, p_149845_2_, p_149845_3_ - 1, p_149845_4_, l, ForgeDirection.UP);
    l = getChanceToEncourageFire((IBlockAccess)p_149845_1_, p_149845_2_, p_149845_3_ + 1, p_149845_4_, l, ForgeDirection.DOWN);
    l = getChanceToEncourageFire((IBlockAccess)p_149845_1_, p_149845_2_, p_149845_3_, p_149845_4_ - 1, l, ForgeDirection.SOUTH);
    l = getChanceToEncourageFire((IBlockAccess)p_149845_1_, p_149845_2_, p_149845_3_, p_149845_4_ + 1, l, ForgeDirection.NORTH);
    return l;
  }
  
  public boolean isCollidable() {
    return false;
  }
  
  @Deprecated
  public boolean canBlockCatchFire(IBlockAccess p_149844_1_, int p_149844_2_, int p_149844_3_, int p_149844_4_) {
    return canCatchFire(p_149844_1_, p_149844_2_, p_149844_3_, p_149844_4_, ForgeDirection.UP);
  }
  
  @Deprecated
  public int func_149846_a(World p_149846_1_, int p_149846_2_, int p_149846_3_, int p_149846_4_, int p_149846_5_) {
    return getChanceToEncourageFire((IBlockAccess)p_149846_1_, p_149846_2_, p_149846_3_, p_149846_4_, p_149846_5_, ForgeDirection.UP);
  }
  
  public boolean canPlaceBlockAt(World p_149742_1_, int p_149742_2_, int p_149742_3_, int p_149742_4_) {
    return (World.doesBlockHaveSolidTopSurface((IBlockAccess)p_149742_1_, p_149742_2_, p_149742_3_ - 1, p_149742_4_) || canNeighborBurn(p_149742_1_, p_149742_2_, p_149742_3_, p_149742_4_));
  }
  
  public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_) {
    if (!World.doesBlockHaveSolidTopSurface((IBlockAccess)p_149695_1_, p_149695_2_, p_149695_3_ - 1, p_149695_4_) && !canNeighborBurn(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_))
      p_149695_1_.setBlockToAir(p_149695_2_, p_149695_3_, p_149695_4_); 
  }
  
  public void onBlockAdded(World p_149726_1_, int p_149726_2_, int p_149726_3_, int p_149726_4_) {
    if (p_149726_1_.provider.dimensionId > 0 || !Blocks.portal.func_150000_e(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_))
      if (!World.doesBlockHaveSolidTopSurface((IBlockAccess)p_149726_1_, p_149726_2_, p_149726_3_ - 1, p_149726_4_) && !canNeighborBurn(p_149726_1_, p_149726_2_, p_149726_3_, p_149726_4_)) {
        p_149726_1_.setBlockToAir(p_149726_2_, p_149726_3_, p_149726_4_);
      } else {
        p_149726_1_.scheduleBlockUpdate(p_149726_2_, p_149726_3_, p_149726_4_, (Block)this, tickRate(p_149726_1_) + p_149726_1_.rand.nextInt(10));
      }  
  }
  
  @SideOnly(Side.CLIENT)
  public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_) {
    if (p_149734_5_.nextInt(24) == 0)
      p_149734_1_.playSound((p_149734_2_ + 0.5F), (p_149734_3_ + 0.5F), (p_149734_4_ + 0.5F), "tm:AmaterasuSound2", 1.0F + p_149734_5_.nextFloat(), p_149734_5_.nextFloat() * 0.7F + 0.3F, false); 
    if (!World.doesBlockHaveSolidTopSurface((IBlockAccess)p_149734_1_, p_149734_2_, p_149734_3_ - 1, p_149734_4_) && !Blocks.fire.canCatchFire((IBlockAccess)p_149734_1_, p_149734_2_, p_149734_3_ - 1, p_149734_4_, ForgeDirection.UP)) {
      if (Blocks.fire.canCatchFire((IBlockAccess)p_149734_1_, p_149734_2_ - 1, p_149734_3_, p_149734_4_, ForgeDirection.EAST))
        for (int l = 0; l < 2; l++) {
          float f = p_149734_2_ + p_149734_5_.nextFloat() * 0.1F;
          float f1 = p_149734_3_ + p_149734_5_.nextFloat();
          float f2 = p_149734_4_ + p_149734_5_.nextFloat();
        }  
      if (Blocks.fire.canCatchFire((IBlockAccess)p_149734_1_, p_149734_2_ + 1, p_149734_3_, p_149734_4_, ForgeDirection.WEST))
        for (int l = 0; l < 2; l++) {
          float f = (p_149734_2_ + 1) - p_149734_5_.nextFloat() * 0.1F;
          float f1 = p_149734_3_ + p_149734_5_.nextFloat();
          float f2 = p_149734_4_ + p_149734_5_.nextFloat();
        }  
      if (Blocks.fire.canCatchFire((IBlockAccess)p_149734_1_, p_149734_2_, p_149734_3_, p_149734_4_ - 1, ForgeDirection.SOUTH))
        for (int l = 0; l < 2; l++) {
          float f = p_149734_2_ + p_149734_5_.nextFloat();
          float f1 = p_149734_3_ + p_149734_5_.nextFloat();
          float f2 = p_149734_4_ + p_149734_5_.nextFloat() * 0.1F;
        }  
      if (Blocks.fire.canCatchFire((IBlockAccess)p_149734_1_, p_149734_2_, p_149734_3_, p_149734_4_ + 1, ForgeDirection.NORTH))
        for (int l = 0; l < 2; l++) {
          float f = p_149734_2_ + p_149734_5_.nextFloat();
          float f1 = p_149734_3_ + p_149734_5_.nextFloat();
          float f2 = (p_149734_4_ + 1) - p_149734_5_.nextFloat() * 0.1F;
        }  
      if (Blocks.fire.canCatchFire((IBlockAccess)p_149734_1_, p_149734_2_, p_149734_3_ + 1, p_149734_4_, ForgeDirection.DOWN))
        for (int l = 0; l < 2; l++) {
          float f = p_149734_2_ + p_149734_5_.nextFloat();
          float f1 = (p_149734_3_ + 1) - p_149734_5_.nextFloat() * 0.1F;
          float f2 = p_149734_4_ + p_149734_5_.nextFloat();
        }  
    } else {
      for (int l = 0; l < 3; l++) {
        float f = p_149734_2_ + p_149734_5_.nextFloat();
        float f1 = p_149734_3_ + p_149734_5_.nextFloat() * 0.5F + 0.5F;
        float f2 = p_149734_4_ + p_149734_5_.nextFloat();
      } 
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister p_149651_1_) {
    this.field_149850_M = new IIcon[] { p_149651_1_.registerIcon(getTextureName() + "_layer_0"), p_149651_1_.registerIcon(getTextureName() + "_layer_1") };
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon getFireIcon(int p_149840_1_) {
    return this.field_149850_M[p_149840_1_];
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
    return this.field_149850_M[0];
  }
  
  public MapColor getMapColor(int p_149728_1_) {
    return MapColor.tntColor;
  }
  
  public void setFireInfo(Block block, int encouragement, int flammibility) {
    if (block == Blocks.air)
      throw new IllegalArgumentException("Tried to set air on fire... This is bad."); 
    int id = Block.getIdFromBlock(block);
    this.field_149849_a[id] = encouragement;
    this.field_149848_b[id] = flammibility;
    FireInfo info = getInfo(block, true);
    info.encouragement = encouragement;
    info.flammibility = flammibility;
  }
  
  private FireInfo getInfo(Block block, boolean garentee) {
    FireInfo ret = (FireInfo)this.blockInfo.get(block);
    if (ret == null && garentee) {
      ret = new FireInfo();
      this.blockInfo.put(block, ret);
    } 
    return ret;
  }
  
  public void rebuildFireInfo() {
    for (int x = 0; x < 4096; x++) {
      this.field_149849_a[x] = 0;
      this.field_149848_b[x] = 0;
    } 
    Iterator<Map.Entry> var4 = this.blockInfo.entrySet().iterator();
    while (var4.hasNext()) {
      Map.Entry e = var4.next();
      int id = Block.getIdFromBlock((Block)e.getKey());
      if (id >= 0 && id < 4096) {
        this.field_149849_a[id] = ((FireInfo)e.getValue()).encouragement;
        this.field_149848_b[id] = ((FireInfo)e.getValue()).flammibility;
      } 
    } 
  }
  
  public int getFlammability(Block block) {
    int id = Block.getIdFromBlock(block);
    return (id >= 0 && id < 4096) ? this.field_149848_b[id] : 0;
  }
  
  public int getEncouragement(Block block) {
    int id = Block.getIdFromBlock(block);
    return (id >= 0 && id < 4096) ? this.field_149849_a[id] : 0;
  }
  
  public boolean canCatchFire(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
    return world.getBlock(x, y, z).isFlammable(world, x, y, z, face);
  }
  
  public int getChanceToEncourageFire(IBlockAccess world, int x, int y, int z, int oldChance, ForgeDirection face) {
    int newChance = world.getBlock(x, y, z).getFireSpreadSpeed(world, x, y, z, face);
    return (newChance > oldChance) ? newChance : oldChance;
  }
  
  private static class FireInfo {
    private int encouragement = 0;
    
    private int flammibility = 0;
    
    FireInfo(Object x0) {
      this();
    }
    
    private FireInfo() {}
  }
}

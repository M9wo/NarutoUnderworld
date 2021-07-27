package alcoholmod.Mathioks.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class BoneBlockTop extends Block implements IPlantable {
  @SideOnly(Side.CLIENT)
  private IIcon field_150041_a;
  
  @SideOnly(Side.CLIENT)
  private IIcon field_150040_b;
  
  private static final String __OBFID = "CL_00000210";
  
  protected BoneBlockTop() {
    super(Material.cactus);
    setTickRandomly(true);
    setBlockTextureName("tm:blockAmaterasu_layer_0");
    setHardness(2.0F);
    setResistance(6.0F);
    setBlockName("Top");
  }
  
  public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_) {
    if (p_149674_1_.isAirBlock(p_149674_2_, p_149674_3_ + 1, p_149674_4_)) {
      int l;
      for (l = 1; p_149674_1_.getBlock(p_149674_2_, p_149674_3_ - l, p_149674_4_) == this; l++);
      if (l < 3) {
        int i1 = p_149674_1_.getBlockMetadata(p_149674_2_, p_149674_3_, p_149674_4_);
        if (i1 == 15) {
          p_149674_1_.setBlock(p_149674_2_, p_149674_3_ + 1, p_149674_4_, this);
          p_149674_1_.setBlockMetadataWithNotify(p_149674_2_, p_149674_3_, p_149674_4_, 0, 4);
          onNeighborBlockChange(p_149674_1_, p_149674_2_, p_149674_3_ + 1, p_149674_4_, this);
        } else {
          p_149674_1_.setBlockMetadataWithNotify(p_149674_2_, p_149674_3_, p_149674_4_, i1 + 1, 4);
        } 
      } 
    } 
    p_149674_1_.setBlockToAir(p_149674_2_, p_149674_3_, p_149674_4_);
  }
  
  public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
    float f = 0.0625F;
    return AxisAlignedBB.getBoundingBox((p_149668_2_ + f), p_149668_3_, (p_149668_4_ + f), ((p_149668_2_ + 1) - f), ((p_149668_3_ + 1) - f), ((p_149668_4_ + 1) - f));
  }
  
  public int quantityDropped(Random p_149745_1_) {
    return 0;
  }
  
  public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
    return null;
  }
  
  @SideOnly(Side.CLIENT)
  public AxisAlignedBB getSelectedBoundingBoxFromPool(World p_149633_1_, int p_149633_2_, int p_149633_3_, int p_149633_4_) {
    float f = 0.0625F;
    return AxisAlignedBB.getBoundingBox((p_149633_2_ + f), p_149633_3_, (p_149633_4_ + f), ((p_149633_2_ + 1) - f), (p_149633_3_ + 1), ((p_149633_4_ + 1) - f));
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
    return (p_149691_1_ == 1) ? this.field_150041_a : ((p_149691_1_ == 0) ? this.field_150040_b : this.blockIcon);
  }
  
  public boolean renderAsNormalBlock() {
    return false;
  }
  
  public boolean isOpaqueCube() {
    return false;
  }
  
  public int getRenderType() {
    return 13;
  }
  
  public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_) {
    if (!canBlockStay(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_))
      p_149695_1_.func_147480_a(p_149695_2_, p_149695_3_, p_149695_4_, true); 
  }
  
  public boolean canBlockStay(World p_149718_1_, int p_149718_2_, int p_149718_3_, int p_149718_4_) {
    Block block = p_149718_1_.getBlock(p_149718_2_, p_149718_3_ - 1, p_149718_4_);
    return (block == Blockss.blockBoneLowest || block == Blockss.blockBoneDown || block == Blockss.blockBoneTop);
  }
  
  public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_) {
    p_149670_5_.attackEntityFrom(DamageSource.cactus, 3.0F);
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister p_149651_1_) {
    this.blockIcon = p_149651_1_.registerIcon("tm:BoneTop");
    this.field_150041_a = p_149651_1_.registerIcon("tm:boneTopTop");
    this.field_150040_b = p_149651_1_.registerIcon("tm:boneBottomTop");
  }
  
  public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
    return EnumPlantType.Desert;
  }
  
  public Block getPlant(IBlockAccess world, int x, int y, int z) {
    return this;
  }
  
  public int getPlantMetadata(IBlockAccess world, int x, int y, int z) {
    return -1;
  }
}

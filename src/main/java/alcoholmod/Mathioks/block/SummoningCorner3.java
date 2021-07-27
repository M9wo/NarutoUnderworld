package alcoholmod.Mathioks.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SummoningCorner3 extends Block {
  private static final String __OBFID = "CL_00000309";
  
  protected SummoningCorner3() {
    super(Material.web);
    setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    setBlockTextureName("tm:SummoningCorner3");
    setBlockName("SummoningCorner3");
    setHardness(10.0F);
    setResistance(100.0F);
    func_150154_b(0);
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister p_149651_1_) {
    this.blockIcon = p_149651_1_.registerIcon("tm:SummoningCorner3");
  }
  
  public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
    return null;
  }
  
  public boolean isOpaqueCube() {
    return false;
  }
  
  public boolean renderAsNormalBlock() {
    return false;
  }
  
  public void setBlockBoundsForItemRender() {
    func_150154_b(0);
  }
  
  public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_) {
    func_150154_b(p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_));
  }
  
  protected void func_150154_b(int p_150154_1_) {
    int j = p_150154_1_ & 0x7;
    float f = (2 * (1 + j)) / 16.0F;
    setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
  }
  
  @SideOnly(Side.CLIENT)
  public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_) {
    return (p_149646_5_ == 1) ? true : super.shouldSideBeRendered(p_149646_1_, p_149646_2_, p_149646_3_, p_149646_4_, p_149646_5_);
  }
  
  public boolean isReplaceable(IBlockAccess world, int x, int y, int z) {
    int meta = world.getBlockMetadata(x, y, z);
    return (meta >= 7) ? false : this.blockMaterial.isReplaceable();
  }
}

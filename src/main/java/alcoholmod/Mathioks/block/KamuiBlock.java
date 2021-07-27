package alcoholmod.Mathioks.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockStone;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class KamuiBlock extends BlockStone {
  @SideOnly(Side.CLIENT)
  private IIcon field_150041_a;
  
  @SideOnly(Side.CLIENT)
  private IIcon field_150040_b;
  
  private static final String __OBFID = "CL_00000210";
  
  protected KamuiBlock() {
    setCreativeTab(CreativeTabs.tabDecorations);
    setBlockTextureName("tm:KamuiBlockTex");
    setHardness(2.0F);
    setResistance(6.0F);
    setBlockName("Bottom");
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
    return (p_149691_1_ == 1) ? this.field_150041_a : ((p_149691_1_ == 0) ? this.field_150040_b : this.blockIcon);
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister p_149651_1_) {
    this.blockIcon = p_149651_1_.registerIcon("tm:KamuiBlockTex");
    this.field_150041_a = p_149651_1_.registerIcon("tm:KamuiBlockTex");
    this.field_150040_b = p_149651_1_.registerIcon("tm:KamuiBlockTex");
  }
}

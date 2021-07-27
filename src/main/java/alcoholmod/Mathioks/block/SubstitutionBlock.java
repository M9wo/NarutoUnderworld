package alcoholmod.Mathioks.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class SubstitutionBlock extends BlockFalling {
  public static final String[] field_149838_a = new String[] { "default", "red" };
  
  @SideOnly(Side.CLIENT)
  private static IIcon field_149837_b;
  
  @SideOnly(Side.CLIENT)
  private static IIcon field_149839_N;
  
  private static final String __OBFID = "CL_00000303";
  
  protected SubstitutionBlock() {
    super(Material.wood);
    setTickRandomly(true);
    setBlockTextureName("tm:blockAmaterasu_layer_0");
    setBlockName("Lowest");
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister p_149651_1_) {
    this.blockIcon = p_149651_1_.registerIcon("tm:Wood");
    field_149837_b = p_149651_1_.registerIcon("tm:Wood");
    field_149839_N = p_149651_1_.registerIcon("tm:Woodt");
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
    return (p_149691_2_ == 1) ? field_149839_N : field_149837_b;
  }
}

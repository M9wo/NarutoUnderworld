package alcoholmod.Mathioks.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class UchihaCloth extends Block {
  @SideOnly(Side.CLIENT)
  private IIcon field_150041_a;
  
  @SideOnly(Side.CLIENT)
  private IIcon field_150040_b;
  
  private static final String __OBFID = "CL_00000210";
  
  protected UchihaCloth() {
    super(Material.wood);
    setBlockTextureName("tm:UchihaCloth");
    setBlockName("UchihaCloth");
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister p_149651_1_) {
    this.blockIcon = p_149651_1_.registerIcon("tm:UchihaCloth");
    this.field_150041_a = p_149651_1_.registerIcon("tm:UchihaCloth");
    this.field_150040_b = p_149651_1_.registerIcon("tm:UchihaCloth");
  }
}

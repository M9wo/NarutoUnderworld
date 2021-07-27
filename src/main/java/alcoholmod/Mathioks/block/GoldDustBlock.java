package alcoholmod.Mathioks.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class GoldDustBlock extends BlockFalling {
  @SideOnly(Side.CLIENT)
  private static IIcon field_149837_b;
  
  @SideOnly(Side.CLIENT)
  private static IIcon field_149839_N;
  
  @SideOnly(Side.CLIENT)
  public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
    return (p_149691_2_ == 1) ? field_149839_N : field_149837_b;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister p_149651_1_) {
    field_149837_b = p_149651_1_.registerIcon("tm:goldDust");
    field_149839_N = p_149651_1_.registerIcon("tm:goldDust");
  }
  
  protected GoldDustBlock() {
    super(Material.sand);
    setTickRandomly(true);
    setBlockTextureName("tm:blockAmaterasu_layer_0");
    setHardness(2.0F);
    setResistance(6.0F);
    setBlockName("Bottom");
  }
  
  public int damageDropped(int p_149692_1_) {
    return p_149692_1_;
  }
  
  public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_) {
    p_149674_1_.scheduleBlockUpdate(p_149674_2_, p_149674_3_, p_149674_4_, (Block)this, tickRate(p_149674_1_) + p_149674_5_.nextInt(1));
    p_149674_1_.setBlockToAir(p_149674_2_, p_149674_3_, p_149674_4_);
  }
}

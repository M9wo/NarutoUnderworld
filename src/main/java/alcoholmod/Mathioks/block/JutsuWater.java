package alcoholmod.Mathioks.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class JutsuWater extends BlockLiquid {
  protected JutsuWater() {
    super(Material.water);
    setTickRandomly(true);
    setBlockName("JutsuStone");
    setBlockTextureName("stone");
  }
  
  public int tickRate() {
    return 5;
  }
  
  private void setNotStationary(World par1World, int par2, int par3, int par4) {}
  
  public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_) {
    p_149674_1_.scheduleBlockUpdate(p_149674_2_, p_149674_3_, p_149674_4_, (Block)this, tickRate(p_149674_1_) + p_149674_5_.nextInt(1));
    p_149674_1_.setBlockToAir(p_149674_2_, p_149674_3_, p_149674_4_);
  }
}

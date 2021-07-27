package alcoholmod.Mathioks.block;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.world.World;

public class JutsuStone extends BlockStone {
  protected JutsuStone() {
    setTickRandomly(true);
    setBlockName("JutsuStone");
    setBlockTextureName("stone");
  }
  
  public int tickRate() {
    return 1;
  }
  
  public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_) {
    p_149674_1_.scheduleBlockUpdate(p_149674_2_, p_149674_3_, p_149674_4_, (Block)this, tickRate(p_149674_1_) + p_149674_5_.nextInt(10));
    p_149674_1_.setBlockToAir(p_149674_2_, p_149674_3_, p_149674_4_);
  }
}

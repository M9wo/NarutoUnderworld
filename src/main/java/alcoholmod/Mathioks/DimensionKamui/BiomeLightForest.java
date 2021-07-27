package alcoholmod.Mathioks.DimensionKamui;

import alcoholmod.Mathioks.block.Blockss;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeLightForest extends ModBiomes {
  public static int treesPerChunk;
  
  protected BiomeDecoratorMod decorator;
  
  public BiomeLightForest(int biomeId) {
    super(biomeId);
    treesPerChunk = 2;
    this.topBlock = (Block)Blockss.kamuiBlock;
    this.fillerBlock = (Block)Blockss.kamuiBlock;
  }
  
  public WorldGenerator getRandomWorldGenForGrass(Random random) {
    return (random.nextInt(2) == 0) ? (WorldGenerator)new WorldGenTallGrass((Block)Blockss.kamuiBlock, 1) : (WorldGenerator)new WorldGenTallGrass((Block)Blockss.kamuiBlock, 2);
  }
  
  public void decorate(World world, Random random, int par3, int par4) {
    super.decorate(world, random, par3, par4);
  }
}

package alcoholmod.Mathioks.DimensionKamui;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeDecoratorMod extends BiomeDecorator {
  public static World currentWorld;
  
  public static Random randomGenerator;
  
  public static int chunk_X;
  
  public static int chunk_Z;
  
  public static int howMenyTrees;
  
  private static final String __OBFID = "CL_00000164";
  
  public void decorateChunk(World world, Random random, BiomeGenBase biomeGenBase, int chunkX, int chunkZ) {
    if (currentWorld != null)
      throw new RuntimeException("Already decorating!!"); 
    currentWorld = world;
    randomGenerator = random;
    chunk_X = chunkX;
    chunk_Z = chunkZ;
    genDecorationsForBiome(biomeGenBase);
    currentWorld = null;
    randomGenerator = null;
  }
  
  protected void genDecorationsForBiome(BiomeGenBase biome) {
    BiomeDecoratorHelper.decorateBiome(biome);
  }
}

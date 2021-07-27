package alcoholmod.Mathioks.DimensionKamui;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class LightForestGenLayerBiomes extends GenLayer {
  protected BiomeGenBase[] allowedBiomes;
  
  public LightForestGenLayerBiomes(long seed) {
    super(seed);
    this.allowedBiomes = new BiomeGenBase[] { ModBiomes.forestLight };
  }
  
  public LightForestGenLayerBiomes(long seed, GenLayer genlayer) {
    super(seed);
    this.allowedBiomes = new BiomeGenBase[] { ModBiomes.forestLight };
    this.parent = genlayer;
  }
  
  public int[] getInts(int x, int z, int width, int depth) {
    int[] dest = IntCache.getIntCache(width * depth);
    for (int dz = 0; dz < depth; dz++) {
      for (int dx = 0; dx < width; dx++) {
        initChunkSeed((dx + x), (dz + z));
        dest[dx + dz * width] = (this.allowedBiomes[nextInt(this.allowedBiomes.length)]).biomeID;
      } 
    } 
    return dest;
  }
}

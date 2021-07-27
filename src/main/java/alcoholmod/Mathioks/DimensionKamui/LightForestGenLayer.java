package alcoholmod.Mathioks.DimensionKamui;

import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerVoronoiZoom;
import net.minecraft.world.gen.layer.GenLayerZoom;

public class LightForestGenLayer extends GenLayer {
  public LightForestGenLayer(long seed) {
    super(seed);
  }
  
  public static GenLayer[] makeTheWorld(long seed, WorldType type) {
    GenLayer biomes1 = new LightForestGenLayerBiomes(1L);
    GenLayerZoom genLayerZoom = new GenLayerZoom(1000L, biomes1);
    genLayerZoom = new GenLayerZoom(1001L, (GenLayer)genLayerZoom);
    genLayerZoom = new GenLayerZoom(1002L, (GenLayer)genLayerZoom);
    genLayerZoom = new GenLayerZoom(1003L, (GenLayer)genLayerZoom);
    genLayerZoom = new GenLayerZoom(1004L, (GenLayer)genLayerZoom);
    genLayerZoom = new GenLayerZoom(1005L, (GenLayer)genLayerZoom);
    GenLayerVoronoiZoom genLayerVoronoiZoom = new GenLayerVoronoiZoom(10L, (GenLayer)genLayerZoom);
    genLayerZoom.initWorldGenSeed(seed);
    genLayerVoronoiZoom.initWorldGenSeed(seed);
    return new GenLayer[] { (GenLayer)genLayerZoom, (GenLayer)genLayerVoronoiZoom };
  }
  
  public int[] getInts(int p_75904_1_, int p_75904_2_, int p_75904_3_, int p_75904_4_) {
    return null;
  }
}

package alcoholmod.Mathioks.DimensionKamui;

import alcoholmod.Mathioks.block.Blockss;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeDecoratorHelper {
  private static WorldGenerator glowStone;
  
  protected static void decorateBiome(BiomeGenBase biome) {
    MinecraftForge.EVENT_BUS.post((Event)new DecorateBiomeEvent.Pre(BiomeDecoratorMod.currentWorld, BiomeDecoratorMod.randomGenerator, BiomeDecoratorMod.chunk_X, BiomeDecoratorMod.chunk_Z));
    initOres();
    generateOreInBiome(biome);
    if (biome == ModBiomes.forestLight) {
      BiomeDecoratorMod.howMenyTrees = BiomeLightForest.treesPerChunk;
      int i = BiomeDecoratorMod.howMenyTrees;
      for (int a = 0; a < i; a++) {
        if (i == BiomeDecoratorMod.randomGenerator.nextInt(8)) {
          int chunkX = BiomeDecoratorMod.chunk_X + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
          int chunkZ = BiomeDecoratorMod.chunk_Z + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
          int y = BiomeDecoratorMod.currentWorld.getTopSolidOrLiquidBlock(chunkX, chunkZ);
          Block block = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y, chunkZ);
          Block blockA = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y - 1, chunkZ);
          if ((block == Blocks.air && block == Blocks.water) || blockA != Blocks.air || blockA != Blocks.water);
        } 
        if (i == BiomeDecoratorMod.randomGenerator.nextInt(15)) {
          int chunkX = BiomeDecoratorMod.chunk_X + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
          int chunkZ = BiomeDecoratorMod.chunk_Z + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
          int y = BiomeDecoratorMod.currentWorld.getTopSolidOrLiquidBlock(chunkX, chunkZ);
          Block block = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y, chunkZ);
          Block blockA = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y - 1, chunkZ);
          if ((block == Blocks.air && block == Blocks.water) || blockA != Blocks.air || blockA != Blocks.water);
        } 
      } 
      if (biome == ModBiomes.forestDark);
    } 
  }
  
  private static void initOres() {
    glowStone = (WorldGenerator)new WorldGenMinable((Block)Blockss.kamuiBlock, 30, (Block)Blockss.kamuiBlock);
  }
  
  private static void generateOreInBiome(BiomeGenBase biome) {
    if (biome == ModBiomes.forestLight)
      genStandardOre(20, glowStone, 0, 128); 
  }
  
  private static void genStandardOre(int spawnWeight, WorldGenerator generatorToSpawn, int minSpawnHeight, int maxYSpawnHeight) {
    for (int l = 0; l < spawnWeight; l++) {
      int i1 = BiomeDecoratorMod.chunk_X + BiomeDecoratorMod.randomGenerator.nextInt(16);
      int j1 = BiomeDecoratorMod.randomGenerator.nextInt(maxYSpawnHeight - minSpawnHeight) + minSpawnHeight;
      int k1 = BiomeDecoratorMod.chunk_Z + BiomeDecoratorMod.randomGenerator.nextInt(16);
      generatorToSpawn.generate(BiomeDecoratorMod.currentWorld, BiomeDecoratorMod.randomGenerator, i1, j1, k1);
    } 
  }
}

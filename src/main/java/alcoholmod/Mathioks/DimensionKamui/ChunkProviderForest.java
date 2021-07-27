package alcoholmod.Mathioks.DimensionKamui;

import alcoholmod.Mathioks.block.Blockss;
import cpw.mods.fml.common.eventhandler.Event;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCaves;
import net.minecraft.world.gen.MapGenRavine;
import net.minecraft.world.gen.NoiseGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.ChunkProviderEvent;
import net.minecraftforge.event.terraingen.InitMapGenEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class ChunkProviderForest implements IChunkProvider {
  private Random rand;
  
  private NoiseGeneratorOctaves noiseGen1;
  
  private NoiseGeneratorOctaves noiseGen2;
  
  private NoiseGeneratorOctaves noiseGen3;
  
  private NoiseGeneratorPerlin noisePerl;
  
  public NoiseGeneratorOctaves noiseGen5;
  
  public NoiseGeneratorOctaves noiseGen6;
  
  public NoiseGeneratorOctaves mobSpawnerNoise;
  
  private World worldObj;
  
  private final boolean mapFeaturesEnabled;
  
  private WorldType worldType;
  
  private final double[] noiseArray;
  
  private final float[] parabolicField;
  
  private double[] stoneNoise = new double[256];
  
  private MapGenBase caveGenerator = (MapGenBase)new MapGenCaves();
  
  private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();
  
  private MapGenBase ravineGenerator = (MapGenBase)new MapGenRavine();
  
  private BiomeGenBase[] biomesForGeneration;
  
  double[] noise3;
  
  double[] noise1;
  
  double[] noise2;
  
  double[] noise5;
  
  int[][] field_73219_j = new int[32][32];
  
  public ChunkProviderForest(World world, long seed, boolean mapFeaturesEnabled) {
    this.caveGenerator = TerrainGen.getModdedMapGen(this.caveGenerator, InitMapGenEvent.EventType.CAVE);
    this.scatteredFeatureGenerator = (MapGenScatteredFeature)TerrainGen.getModdedMapGen((MapGenBase)this.scatteredFeatureGenerator, InitMapGenEvent.EventType.SCATTERED_FEATURE);
    this.ravineGenerator = TerrainGen.getModdedMapGen(this.ravineGenerator, InitMapGenEvent.EventType.RAVINE);
    GameLogHelper.writeToLog(Level.INFO, "Loading Chunk Provider for dmension.");
    this.worldObj = world;
    this.mapFeaturesEnabled = mapFeaturesEnabled;
    this.worldType = world.getWorldInfo().getTerrainType();
    this.rand = new Random(seed);
    this.noiseGen1 = new NoiseGeneratorOctaves(this.rand, 16);
    this.noiseGen2 = new NoiseGeneratorOctaves(this.rand, 16);
    this.noiseGen3 = new NoiseGeneratorOctaves(this.rand, 8);
    this.noisePerl = new NoiseGeneratorPerlin(this.rand, 4);
    this.noiseGen5 = new NoiseGeneratorOctaves(this.rand, 10);
    this.noiseGen6 = new NoiseGeneratorOctaves(this.rand, 16);
    this.mobSpawnerNoise = new NoiseGeneratorOctaves(this.rand, 8);
    this.noiseArray = new double[825];
    this.parabolicField = new float[25];
    for (int j = -2; j <= 2; j++) {
      for (int k = -2; k <= 2; k++) {
        float f = 10.0F / MathHelper.sqrt_float((j * j + k * k) + 0.2F);
        this.parabolicField[j + 2 + (k + 2) * 5] = f;
      } 
    } 
    NoiseGenerator[] noiseGens = { (NoiseGenerator)this.noiseGen1, (NoiseGenerator)this.noiseGen2, (NoiseGenerator)this.noiseGen3, (NoiseGenerator)this.noisePerl, (NoiseGenerator)this.noiseGen5, (NoiseGenerator)this.noiseGen6, (NoiseGenerator)this.mobSpawnerNoise };
    noiseGens = TerrainGen.getModdedNoiseGenerators(world, this.rand, noiseGens);
    this.noiseGen1 = (NoiseGeneratorOctaves)noiseGens[0];
    this.noiseGen2 = (NoiseGeneratorOctaves)noiseGens[1];
    this.noiseGen3 = (NoiseGeneratorOctaves)noiseGens[2];
    this.noisePerl = (NoiseGeneratorPerlin)noiseGens[3];
    this.noiseGen5 = (NoiseGeneratorOctaves)noiseGens[4];
    this.noiseGen6 = (NoiseGeneratorOctaves)noiseGens[5];
    this.mobSpawnerNoise = (NoiseGeneratorOctaves)noiseGens[6];
  }
  
  public void func_147424_a(int par1, int par2, Block[] blocks) {
    byte b0 = 63;
    this.biomesForGeneration = this.worldObj.getWorldChunkManager().getBiomesForGeneration(this.biomesForGeneration, par1 * 4 - 2, par2 * 4 - 2, 10, 10);
    func_147423_a(par1 * 4, 0, par2 * 4);
    for (int k = 0; k < 4; k++) {
      int l = k * 5;
      int i1 = (k + 1) * 5;
      for (int j1 = 0; j1 < 4; j1++) {
        int k1 = (l + j1) * 33;
        int l1 = (l + j1 + 1) * 33;
        int i2 = (i1 + j1) * 33;
        int j2 = (i1 + j1 + 1) * 33;
        for (int k2 = 0; k2 < 32; k2++) {
          double d0 = 0.125D;
          double d1 = this.noiseArray[k1 + k2];
          double d2 = this.noiseArray[l1 + k2];
          double d3 = this.noiseArray[i2 + k2];
          double d4 = this.noiseArray[j2 + k2];
          double d5 = (this.noiseArray[k1 + k2 + 1] - d1) * d0;
          double d6 = (this.noiseArray[l1 + k2 + 1] - d2) * d0;
          double d7 = (this.noiseArray[i2 + k2 + 1] - d3) * d0;
          double d8 = (this.noiseArray[j2 + k2 + 1] - d4) * d0;
          for (int l2 = 0; l2 < 8; l2++) {
            double d9 = 0.25D;
            double d10 = d1;
            double d11 = d2;
            double d12 = (d3 - d1) * d9;
            double d13 = (d4 - d2) * d9;
            for (int i3 = 0; i3 < 4; i3++) {
              int j3 = i3 + k * 4 << 12 | 0 + j1 * 4 << 8 | k2 * 8 + l2;
              short short1 = 256;
              j3 -= short1;
              double d14 = 0.25D;
              double d16 = (d11 - d10) * d14;
              double d15 = d10 - d16;
              for (int k3 = 0; k3 < 4; k3++) {
                if ((d15 += d16) > 0.0D) {
                  blocks[j3 += short1] = (Block)Blockss.kamuiBlock;
                } else if (k2 * 8 + l2 < b0) {
                  blocks[j3 += short1] = Blocks.water;
                } else {
                  blocks[j3 += short1] = null;
                } 
              } 
              d10 += d12;
              d11 += d13;
            } 
            d1 += d5;
            d2 += d6;
            d3 += d7;
            d4 += d8;
          } 
        } 
      } 
    } 
  }
  
  public void replaceBlocksForBiome(int par1, int par2, Block[] blocks, byte[] par3ArrayOfByte, BiomeGenBase[] par4ArrayOfBiomeGenBase) {
    GameLogHelper.writeToLog(Level.INFO, "Replacing block for biome.");
    ChunkProviderEvent.ReplaceBiomeBlocks event = new ChunkProviderEvent.ReplaceBiomeBlocks(this, par1, par2, blocks, par3ArrayOfByte, par4ArrayOfBiomeGenBase);
    MinecraftForge.EVENT_BUS.post((Event)event);
    if (event.getResult() != Event.Result.DENY) {
      double d0 = 0.03125D;
      this.stoneNoise = this.noisePerl.func_151599_a(this.stoneNoise, (par1 * 16), (par2 * 16), 16, 16, d0 * 2.0D, d0 * 2.0D, 1.0D);
      for (int k = 0; k < 16; k++) {
        for (int l = 0; l < 16; l++) {
          ModBiomes biomegenbase = (ModBiomes)par4ArrayOfBiomeGenBase[l + k * 16];
          biomegenbase.genTerrainBlocks(this.worldObj, this.rand, blocks, par3ArrayOfByte, par1 * 16 + k, par2 * 16 + l, this.stoneNoise[l + k * 16]);
        } 
      } 
    } 
  }
  
  public Chunk loadChunk(int par1, int par2) {
    return provideChunk(par1, par2);
  }
  
  public Chunk provideChunk(int par1, int par2) {
    this.rand.setSeed(par1 * 341873128712L + par2 * 132897987541L);
    Block[] ablock = new Block[65536];
    byte[] abyte = new byte[65536];
    func_147424_a(par1, par2, ablock);
    this.biomesForGeneration = this.worldObj.getWorldChunkManager().loadBlockGeneratorData(this.biomesForGeneration, par1 * 16, par2 * 16, 16, 16);
    replaceBlocksForBiome(par1, par2, ablock, abyte, this.biomesForGeneration);
    this.caveGenerator.func_151539_a(this, this.worldObj, par1, par2, ablock);
    this.ravineGenerator.func_151539_a(this, this.worldObj, par1, par2, ablock);
    if (this.mapFeaturesEnabled)
      this.scatteredFeatureGenerator.func_151539_a(this, this.worldObj, par1, par2, ablock); 
    Chunk chunk = new Chunk(this.worldObj, ablock, abyte, par1, par2);
    byte[] abyte1 = chunk.getBiomeArray();
    for (int k = 0; k < abyte1.length; k++)
      abyte1[k] = (byte)(this.biomesForGeneration[k]).biomeID; 
    chunk.generateSkylightMap();
    return chunk;
  }
  
  private void func_147423_a(int p_147423_1_, int p_147423_2_, int p_147423_3_) {
    this.noise5 = this.noiseGen6.generateNoiseOctaves(this.noise5, p_147423_1_, p_147423_3_, 5, 5, 200.0D, 200.0D, 0.5D);
    this.noise3 = this.noiseGen3.generateNoiseOctaves(this.noise3, p_147423_1_, p_147423_2_, p_147423_3_, 5, 33, 5, 8.555150000000001D, 4.277575000000001D, 8.555150000000001D);
    this.noise1 = this.noiseGen1.generateNoiseOctaves(this.noise1, p_147423_1_, p_147423_2_, p_147423_3_, 5, 33, 5, 684.412D, 684.412D, 684.412D);
    this.noise2 = this.noiseGen2.generateNoiseOctaves(this.noise2, p_147423_1_, p_147423_2_, p_147423_3_, 5, 33, 5, 684.412D, 684.412D, 684.412D);
    int l = 0;
    int i1 = 0;
    for (int j1 = 0; j1 < 5; j1++) {
      for (int k1 = 0; k1 < 5; k1++) {
        float f = 0.0F;
        float f1 = 0.0F;
        float f2 = 0.0F;
        byte b0 = 2;
        BiomeGenBase biomegenbase = this.biomesForGeneration[j1 + 2 + (k1 + 2) * 10];
        for (int l1 = -b0; l1 <= b0; l1++) {
          for (int i2 = -b0; i2 <= b0; i2++) {
            BiomeGenBase biomegenbase1 = this.biomesForGeneration[j1 + l1 + 2 + (k1 + i2 + 2) * 10];
            float f3 = biomegenbase1.rootHeight;
            float f4 = biomegenbase1.heightVariation;
            if (this.worldType == WorldType.AMPLIFIED && f3 > 0.0F) {
              f3 = 1.0F + f3 * 2.0F;
              f4 = 1.0F + f4 * 4.0F;
            } 
            float f5 = this.parabolicField[l1 + 2 + (i2 + 2) * 5] / (f3 + 2.0F);
            if (biomegenbase1.rootHeight > biomegenbase.rootHeight)
              f5 /= 2.0F; 
            f += f4 * f5;
            f1 += f3 * f5;
            f2 += f5;
          } 
        } 
        f /= f2;
        f1 /= f2;
        f = f * 0.9F + 0.1F;
        f1 = (f1 * 4.0F - 1.0F) / 8.0F;
        double d12 = this.noise5[i1] / 8000.0D;
        if (d12 < 0.0D)
          d12 = -d12 * 0.3D; 
        d12 = d12 * 3.0D - 2.0D;
        if (d12 < 0.0D) {
          d12 /= 2.0D;
          if (d12 < -1.0D)
            d12 = -1.0D; 
          d12 /= 1.4D;
          d12 /= 2.0D;
        } else {
          if (d12 > 1.0D)
            d12 = 1.0D; 
          d12 /= 8.0D;
        } 
        i1++;
        double d13 = f1;
        double d14 = f;
        d13 += d12 * 0.2D;
        d13 = d13 * 8.5D / 8.0D;
        double d5 = 8.5D + d13 * 4.0D;
        for (int j2 = 0; j2 < 33; j2++) {
          double d6 = (j2 - d5) * 12.0D * 128.0D / 256.0D / d14;
          if (d6 < 0.0D)
            d6 *= 4.0D; 
          double d7 = this.noise1[l] / 512.0D;
          double d8 = this.noise2[l] / 512.0D;
          double d9 = (this.noise3[l] / 10.0D + 1.0D) / 2.0D;
          double d10 = MathHelper.denormalizeClamp(d7, d8, d9) - d6;
          if (j2 > 29) {
            double d11 = ((j2 - 29) / 3.0F);
            d10 = d10 * (1.0D - d11) + -10.0D * d11;
          } 
          this.noiseArray[l] = d10;
          l++;
        } 
      } 
    } 
  }
  
  public boolean chunkExists(int par1, int par2) {
    return true;
  }
  
  public void populate(IChunkProvider par1IChunkProvider, int par2, int par3) {
    BlockFalling.fallInstantly = true;
    int k = par2 * 16;
    int l = par3 * 16;
    BiomeGenBase biomegenbase = this.worldObj.getBiomeGenForCoords(k + 16, l + 16);
    this.rand.setSeed(this.worldObj.getSeed());
    long i1 = this.rand.nextLong() / 2L * 2L + 1L;
    long j1 = this.rand.nextLong() / 2L * 2L + 1L;
    this.rand.setSeed(par2 * i1 + par3 * j1 ^ this.worldObj.getSeed());
    boolean flag = false;
    MinecraftForge.EVENT_BUS.post((Event)new PopulateChunkEvent.Pre(par1IChunkProvider, this.worldObj, this.rand, par2, par3, flag));
    if (this.mapFeaturesEnabled)
      this.scatteredFeatureGenerator.generateStructuresInChunk(this.worldObj, this.rand, par2, par3); 
    if (biomegenbase != BiomeGenBase.desert && biomegenbase != BiomeGenBase.desertHills && !flag && this.rand.nextInt(4) == 0 && TerrainGen.populate(par1IChunkProvider, this.worldObj, this.rand, par2, par3, flag, PopulateChunkEvent.Populate.EventType.LAKE)) {
      int i = k + this.rand.nextInt(16) + 8;
      int l1 = this.rand.nextInt(256);
      int i2 = l + this.rand.nextInt(16) + 8;
      (new WorldGenLakes(Blocks.water)).generate(this.worldObj, this.rand, i, l1, i2);
    } 
    if (TerrainGen.populate(par1IChunkProvider, this.worldObj, this.rand, par2, par3, flag, PopulateChunkEvent.Populate.EventType.LAVA) && !flag && this.rand.nextInt(8) == 0) {
      int i = k + this.rand.nextInt(16) + 8;
      int l1 = this.rand.nextInt(this.rand.nextInt(248) + 8);
      int i2 = l + this.rand.nextInt(16) + 8;
      if (l1 < 63 || this.rand.nextInt(10) == 0)
        (new WorldGenLakes(Blocks.lava)).generate(this.worldObj, this.rand, i, l1, i2); 
    } 
    boolean doGen = TerrainGen.populate(par1IChunkProvider, this.worldObj, this.rand, par2, par3, flag, PopulateChunkEvent.Populate.EventType.DUNGEON);
    int k1;
    for (k1 = 0; doGen && k1 < 8; k1++) {
      int l1 = k + this.rand.nextInt(16) + 8;
      int i2 = this.rand.nextInt(256);
      int j2 = l + this.rand.nextInt(16) + 8;
      (new WorldGenDungeons()).generate(this.worldObj, this.rand, l1, i2, j2);
    } 
    biomegenbase.decorate(this.worldObj, this.rand, k, l);
    k += 8;
    l += 8;
    doGen = TerrainGen.populate(par1IChunkProvider, this.worldObj, this.rand, par2, par3, flag, PopulateChunkEvent.Populate.EventType.ICE);
    for (k1 = 0; doGen && k1 < 16; k1++) {
      for (int l1 = 0; l1 < 16; l1++) {
        int i2 = this.worldObj.getPrecipitationHeight(k + k1, l + l1);
        if (this.worldObj.isBlockFreezable(k1 + k, i2 - 1, l1 + l))
          this.worldObj.setBlock(k1 + k, i2 - 1, l1 + l, Blocks.ice, 0, 2); 
        if (this.worldObj.func_147478_e(k1 + k, i2, l1 + l, true))
          this.worldObj.setBlock(k1 + k, i2, l1 + l, Blocks.snow_layer, 0, 2); 
      } 
    } 
    MinecraftForge.EVENT_BUS.post((Event)new PopulateChunkEvent.Post(par1IChunkProvider, this.worldObj, this.rand, par2, par3, flag));
    BlockFalling.fallInstantly = false;
  }
  
  public boolean saveChunks(boolean par1, IProgressUpdate par2IProgressUpdate) {
    return true;
  }
  
  public void saveExtraData() {}
  
  public boolean unloadQueuedChunks() {
    return false;
  }
  
  public boolean canSave() {
    return true;
  }
  
  public String makeString() {
    return "RandomLevelSource";
  }
  
  public int getLoadedChunkCount() {
    return 0;
  }
  
  public void recreateStructures(int par1, int par2) {
    if (this.mapFeaturesEnabled);
  }
  
  public ChunkPosition func_147416_a(World world, String arg1, int arg2, int arg3, int arg4) {
    return null;
  }
  
  public List getPossibleCreatures(EnumCreatureType p_73155_1_, int p_73155_2_, int p_73155_3_, int p_73155_4_) {
    return null;
  }
}

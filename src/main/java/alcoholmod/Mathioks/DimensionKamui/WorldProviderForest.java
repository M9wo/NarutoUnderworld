package alcoholmod.Mathioks.DimensionKamui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.common.DimensionManager;

public class WorldProviderForest extends WorldProvider {
  public IChunkProvider createChunkGenerator() {
    return new ChunkProviderForest(this.worldObj, this.worldObj.getSeed(), false);
  }
  
  public void registerWorldChunkManager() {
    this.worldChunkMgr = new WorldChunkManagerForest(this.worldObj.getSeed(), this.terrainType);
    this.dimensionId = DimensionIDs.LIGHTFORESTDIMENSION;
  }
  
  public static WorldProvider getProviderForDimension(int id) {
    return DimensionManager.createProviderFor(DimensionIDs.LIGHTFORESTDIMENSION);
  }
  
  public String getDimensionName() {
    return "Light Forest";
  }
  
  public String getSaveFolder() {
    return "DIM" + DimensionIDs.LIGHTFORESTDIMENSION;
  }
  
  @SideOnly(Side.CLIENT)
  public boolean renderStars() {
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public double getMovementFactor() {
    return 0.1D;
  }
  
  @SideOnly(Side.CLIENT)
  public float getStarBrightness(World world, float f) {
    return 1.0F;
  }
  
  @SideOnly(Side.CLIENT)
  public boolean renderClouds() {
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public boolean renderVoidFog() {
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public boolean renderEndSky() {
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public float setSunSize() {
    return 0.25F;
  }
  
  @SideOnly(Side.CLIENT)
  public float setMoonSize() {
    return 4.0F;
  }
  
  @SideOnly(Side.CLIENT)
  public Vec3 getSkyColor(Entity cameraEntity, float partialTicks) {
    return this.worldObj.getSkyColorBody(cameraEntity, partialTicks);
  }
  
  @SideOnly(Side.CLIENT)
  public boolean isSkyColored() {
    return true;
  }
  
  public boolean canRespawnHere() {
    return true;
  }
  
  public boolean isSurfaceWorld() {
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public float getCloudHeight() {
    return this.terrainType.getCloudHeight();
  }
  
  public ChunkCoordinates getEntrancePortalLocation() {
    return new ChunkCoordinates(50, 5, 0);
  }
  
  protected void generateLightBrightnessTable() {
    float f = 0.0F;
    for (int i = 0; i <= 15; i++) {
      float f1 = 1.0F - i / 15.0F;
      this.lightBrightnessTable[i] = (1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f;
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public String getWelcomeMessage() {
    return "Entering the Forest";
  }
  
  @SideOnly(Side.CLIENT)
  public String getDepartMessage() {
    return "Leaving the Forest";
  }
  
  public IRenderHandler getSkyRenderer() {
    return new SkyRenderer();
  }
  
  public IRenderHandler getCloudRenderer() {
    return new CloudRenderer();
  }
  
  public IRenderHandler getWeatherRenderer() {
    return new WeatherRenderer();
  }
  
  public Vec3 drawClouds(float partialTicks) {
    return super.drawClouds(partialTicks);
  }
  
  @SideOnly(Side.CLIENT)
  public Vec3 getFogColor(float par1, float par2) {
    float f2 = MathHelper.cos(par1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
    if (f2 < 0.0F)
      f2 = 0.0F; 
    if (f2 > 1.0F)
      f2 = 1.0F; 
    float f3 = 0.7529412F;
    float f4 = 0.84705883F;
    float f5 = 1.0F;
    f3 *= f2 * 0.94F + 0.06F;
    f4 *= f2 * 0.94F + 0.06F;
    f5 *= f2 * 0.91F + 0.09F;
    return Vec3.createVectorHelper(f3, f4, f5);
  }
}

package alcoholmod.Mathioks.DimensionKamui;

import net.minecraftforge.common.DimensionManager;

public class Dimension {
  public static void registerDimensions() {
    DimensionManager.registerDimension(DimensionIDs.LIGHTFORESTDIMENSION, DimensionIDs.LIGHTFORESTDIMENSION);
  }
  
  public static void registerWorldProvider() {
    DimensionManager.registerProviderType(DimensionIDs.LIGHTFORESTDIMENSION, WorldProviderForest.class, true);
  }
}

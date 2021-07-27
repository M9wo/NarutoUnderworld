package alcoholmod.Mathioks.DimensionKamui;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.LongHashMap;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class LightDimensionTeleporter extends Teleporter {
  private final WorldServer worldServerInstance;
  
  private final Random random;
  
  private final LongHashMap destinationCoordinateCache = new LongHashMap();
  
  private final List destinationCoordinateKeys = new ArrayList();
  
  private static final String __OBFID = "CL_00000153";
  
  public LightDimensionTeleporter(WorldServer p_i1963_1_) {
    super(p_i1963_1_);
    this.worldServerInstance = p_i1963_1_;
    this.random = new Random(p_i1963_1_.getSeed());
  }
  
  public void placeInPortal(Entity p_77185_1_, double p_77185_2_, double p_77185_4_, double p_77185_6_, float p_77185_8_) {}
  
  public boolean makePortal(Entity p_85188_1_) {
    return false;
  }
  
  public void removeStalePortalLocations(long p_85189_1_) {}
  
  public boolean placeInExistingPortal(Entity p_77184_1_, double p_77184_2_, double p_77184_4_, double p_77184_6_, float p_77184_8_) {
    return false;
  }
  
  public class PortalPosition extends ChunkCoordinates {
    public long lastUpdateTime;
    
    private static final String __OBFID = "CL_00000154";
    
    public PortalPosition(int p_i1962_2_, int p_i1962_3_, int p_i1962_4_, long p_i1962_5_) {
      super(p_i1962_2_, p_i1962_3_, p_i1962_4_);
      this.lastUpdateTime = p_i1962_5_;
    }
  }
}

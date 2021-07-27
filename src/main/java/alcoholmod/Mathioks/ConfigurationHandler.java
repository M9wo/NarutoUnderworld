package alcoholmod.Mathioks;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import java.io.File;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
  public static Configuration configuration;
  
  public static int expMultiplier;
  
  public static boolean expMultiplierEnable;
  
  public static String CATEGORY_EXP = "Experience Command";
  
  public static void init(String configDir) {
    if (configuration == null) {
      File path = new File(configDir + "/NarutoMod.cfg");
      configuration = new Configuration(path);
      loadConfiguration();
    } 
  }
  
  public static void loadConfiguration() {
    expMultiplierEnable = configuration.getBoolean("Enable Multiplier?", CATEGORY_EXP, false, "Should the multiplier be enabled");
    expMultiplier = configuration.getInt("Multiplier", CATEGORY_EXP, 1, 1, 1000, "How much the exp given by the /narutoexp command is multiplied");
    if (configuration.hasChanged())
      configuration.save(); 
  }
  
  @SubscribeEvent
  public void onConfigurationChangeEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
    if (event.modID.equalsIgnoreCase("AM"))
      loadConfiguration(); 
  }
  
  public static Configuration getConfiguration() {
    return configuration;
  }
}

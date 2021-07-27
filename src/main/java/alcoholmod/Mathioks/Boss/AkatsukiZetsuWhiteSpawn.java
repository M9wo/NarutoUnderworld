package alcoholmod.Mathioks.Boss;

import alcoholmod.Mathioks.AlcoholMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class AkatsukiZetsuWhiteSpawn {
  public static void mainRegistry() {
    registerEntity();
  }
  
  public static void registerEntity() {
    createEntity(AkatsukiZetsuWhite.class, "AkatsukiZetsuWhiteModel Mob", 328965, 11207941);
  }
  
  public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
    int randomId = EntityRegistry.findGlobalUniqueEntityId();
    EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
    EntityRegistry.registerModEntity(entityClass, entityName, randomId, AlcoholMod.modInstance, 64, 1, true);
    EntityRegistry.addSpawn(entityClass, 1, 0, 1, EnumCreatureType.monster, new BiomeGenBase[] { BiomeGenBase.birchForest, BiomeGenBase.ocean, BiomeGenBase.birchForestHills, BiomeGenBase.deepOcean, BiomeGenBase.extremeHills, BiomeGenBase.jungle, BiomeGenBase.roofedForest, BiomeGenBase.megaTaiga });
    createEgg(randomId, solidColor, spotColor);
  }
  
  private static void createEgg(int randomid, int solidColor, int spotColor) {
    EntityList.entityEggs.put(Integer.valueOf(randomid), new EntityList.EntityEggInfo(randomid, solidColor, spotColor));
  }
}

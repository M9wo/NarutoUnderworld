package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.AlcoholMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;

public class LavaCongealingSpawn {
  public static void mainRegistry() {
    registerEntity();
  }
  
  public static void registerEntity() {
    createEntity(LavaCongealingEntity.class, "LavaCongealingModel Mob", 328965, 11207941);
  }
  
  public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor) {
    int randomId = EntityRegistry.findGlobalUniqueEntityId();
    EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
    EntityRegistry.registerModEntity(entityClass, entityName, randomId, AlcoholMod.modInstance, 64, 1, true);
  }
  
  private static void createEgg(int randomid, int solidColor, int spotColor) {
    EntityList.entityEggs.put(Integer.valueOf(randomid), new EntityList.EntityEggInfo(randomid, solidColor, spotColor));
  }
}

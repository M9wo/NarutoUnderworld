package alcoholmod.Mathioks.NPC;

import net.minecraft.village.Village;
import net.minecraft.world.World;

public class EntityKage extends EntityNinja {
  Village villageObj;
  
  public EntityKage(World p_i1738_1_) {
    super(p_i1738_1_);
  }
  
  public Village getVillage() {
    return this.villageObj;
  }
}

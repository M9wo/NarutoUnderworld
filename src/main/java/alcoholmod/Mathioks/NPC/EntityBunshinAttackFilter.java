package alcoholmod.Mathioks.NPC;

import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;

public final class EntityBunshinAttackFilter implements IEntitySelector {
  public boolean isEntityApplicable(Entity par1Entity) {
    return (par1Entity instanceof net.minecraft.entity.monster.EntityMob && !(par1Entity instanceof net.minecraft.entity.player.EntityPlayer) && !(par1Entity instanceof alcoholmod.Mathioks.Jutsu.EntityBunshin));
  }
}

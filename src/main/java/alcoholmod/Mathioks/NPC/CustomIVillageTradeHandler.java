package alcoholmod.Mathioks.NPC;

import alcoholmod.Mathioks.AlcoholMod;
import cpw.mods.fml.common.registry.VillagerRegistry;
import java.util.Random;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class CustomIVillageTradeHandler implements VillagerRegistry.IVillageTradeHandler {
  public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random) {
    switch (villager.getProfession()) {
      case 3:
        recipeList.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 5), new ItemStack(AlcoholMod.kunai, 10)));
        recipeList.add(new MerchantRecipe(new ItemStack(AlcoholMod.RyoSilver, 5), new ItemStack(AlcoholMod.ShurikenSmallItem, 10)));
        break;
    } 
  }
}

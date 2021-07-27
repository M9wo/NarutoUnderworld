package alcoholmod.Mathioks.NinjaItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RyoSilver extends Item {
  private boolean isinair;
  
  public RyoSilver() {
    setMaxDamage(12001);
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.uncommon;
  }
}

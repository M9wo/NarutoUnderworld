package alcoholmod.Mathioks.HolidayEvents.Easter2018;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class Easter2018CrackedEasterEggOrange extends Item {
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.GOLD + "An Orange cracked Easter Egg...");
    par3List.add(EnumChatFormatting.GOLD + "It somehow seems very Sharp");
    par3List.add(EnumChatFormatting.GOLD + "Put 9 together to form a complete one!");
  }
}

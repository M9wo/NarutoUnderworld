package alcoholmod.Mathioks.SageMode;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class SageInsect extends Item {
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.DARK_GREEN + "A huge insect said to be full of Sage Energy");
    par3List.add(EnumChatFormatting.DARK_GREEN + "it looks so nasty that just holding it");
    par3List.add(EnumChatFormatting.DARK_GREEN + "makes one go nauseous");
  }
}

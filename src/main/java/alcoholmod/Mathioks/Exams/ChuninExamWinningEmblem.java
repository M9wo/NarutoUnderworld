package alcoholmod.Mathioks.Exams;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ChuninExamWinningEmblem extends Item {
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.DARK_RED + "Proof you won against the");
    par3List.add(EnumChatFormatting.DARK_RED + "opposing Genin in the Chunin");
    par3List.add(EnumChatFormatting.DARK_RED + "Exams.");
  }
}

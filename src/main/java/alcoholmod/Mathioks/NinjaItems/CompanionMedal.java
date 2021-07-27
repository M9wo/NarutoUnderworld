package alcoholmod.Mathioks.NinjaItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class CompanionMedal extends Item {
  private boolean isinair;
  
  public CompanionMedal() {
    setMaxDamage(12001);
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.common;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.GOLD + "A Medal given to a Jonin to commemorate");
    par3List.add(EnumChatFormatting.GOLD + "him/her passing the 'Team Captain' Mission");
    par3List.add(EnumChatFormatting.GOLD + "Give this to certain ninja after defeating");
    par3List.add(EnumChatFormatting.GOLD + "them in battle to form your own Shinobi-Team.");
  }
}

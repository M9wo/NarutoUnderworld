package alcoholmod.Mathioks.NinjaItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class BloodlineAwakening extends Item {
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    if (!par2World.isRemote)
      if ((Minecraft.getMinecraft()).thePlayer.getDisplayName().equals("Superkami_Popo")) {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are A Contributor!! Thank you so much"));
      } else {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("Sorry, You Are Not A Contributor"));
      }  
    return par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.RED + "Awakens Special Jutsu for Contributors ");
  }
}

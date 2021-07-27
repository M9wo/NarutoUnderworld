package alcoholmod.Mathioks.SageMode;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncSenjutsuMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class SageInsectSoup extends Item {
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {}
  
  public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
    if (!world.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      props.setSenjutsu(props.getSenjutsu() + 25);
      PacketDispatcher.sendTo((IMessage)new SyncSenjutsuMessage(player), (EntityPlayerMP)player);
      player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "As you eat the soup, you feel yourself getting"));
      player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "nauseous, while you can also feel your Senjutsu growing!"));
      player.addPotionEffect(new PotionEffect(Potion.confusion.id, 500, 20));
      itemstack.stackSize--;
    } 
    return itemstack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.DARK_GREEN + "Sage Insect soup, said to be the initiation");
    par3List.add(EnumChatFormatting.DARK_GREEN + "of Sage Mode... The Insect doesn't look good");
    par3List.add(EnumChatFormatting.DARK_GREEN + "though...");
  }
}

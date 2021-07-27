package alcoholmod.Mathioks.NinjaItems;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncJutsuPointsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncRankMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSkillPointsMessage;
import alcoholmod.Mathioks.Final.JutsuItem;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class Pizza extends JutsuItem {
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par3EntityPlayer.getCommandSenderName().equals("snopdizzle")) {
        props.setSkillPoints(props.getSkillPoints() - 155);
        PacketDispatcher.sendTo((IMessage)new SyncSkillPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        props.setJutsuPoints(props.getJutsuPoints() + 155);
        PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Lost 155 Skill Points"));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Gained 155 Jutsu Points"));
      } else if (Par3EntityPlayer.getCommandSenderName().equals("Mathioks")) {
        props.setRank(1);
        PacketDispatcher.sendTo((IMessage)new SyncRankMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
      } else if (Par3EntityPlayer.getCommandSenderName().equals("_BROOKLYNRAGE_")) {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Got yer shoit back NOOOGIIIIT now learn it again huehue"));
        props.setJutsuPoints(props.getJutsuPoints() + 5);
        PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
      } 
      Par1ItemStack.stackSize--;
    } 
    return Par1ItemStack;
  }
}

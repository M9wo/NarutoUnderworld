package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncKarmaSealSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKarmaSealTypeMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import java.util.List;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;

public class CommandKarmaSeal extends CommandBase {
  public String getCommandName() {
    return "karmaseal";
  }
  
  public String getCommandUsage(ICommandSender args) {
    return "/karmaseal <type/size> <TYPE/SIZE> <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    if (args.length == 3) {
      new NBTTagCompound();
      EntityPlayerMP entityplayermp = getPlayer(sender, args[2]);
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
      if (args[0].equals("type")) {
        if (args[1].equals("Boruto")) {
          props.setKarmaSealType(1);
          PacketDispatcher.sendTo((IMessage)new SyncKarmaSealTypeMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + "'s Karma Seal to " + entityplayermp.getDisplayName()));
        } 
        if (args[1].equals("Kawaki")) {
          props.setKarmaSealType(2);
          PacketDispatcher.sendTo((IMessage)new SyncKarmaSealTypeMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + "'s Karma Seal to " + entityplayermp.getDisplayName()));
        } 
        if (args[1].equals("Jigen")) {
          props.setKarmaSealType(3);
          PacketDispatcher.sendTo((IMessage)new SyncKarmaSealTypeMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + "'s Karma Seal to " + entityplayermp.getDisplayName()));
        } 
      } 
      if (args[0].equals("size")) {
        if (args[1].equals("1")) {
          props.setKarmaSealSize(1);
          PacketDispatcher.sendTo((IMessage)new SyncKarmaSealSizeMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Unlocked the Karma Seal for " + entityplayermp.getDisplayName()));
        } 
        if (args[1].equals("2")) {
          props.setKarmaSealSize(2);
          PacketDispatcher.sendTo((IMessage)new SyncKarmaSealSizeMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Unlocked the second stage of the Karma Seal for " + entityplayermp.getDisplayName()));
        } 
      } 
    } else {
      throw new WrongUsageException("Not enough or too many arguments.", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, new String[] { "size", "type" }) : ((args.length == 2 && args[0].equals("type")) ? getListOfStringsMatchingLastWord(args, new String[] { "Boruto", "Kawaki", "Jigen" }) : ((args.length == 2 && args[0].equals("size")) ? getListOfStringsMatchingLastWord(args, new String[] { "1", "2" }) : ((args.length == 3) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null)));
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

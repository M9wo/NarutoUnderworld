package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import java.util.List;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;

public class CommandSixPaths extends CommandBase {
  public String getCommandName() {
    return "sixpaths";
  }
  
  public String getCommandUsage(ICommandSender args) {
    return "/sixpaths <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    new NBTTagCompound();
    EntityPlayerMP entityplayermp = (args.length == 1) ? getPlayer(sender, args[0]) : getCommandSenderAsPlayer(sender);
    ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
    if (!props.getSixPaths()) {
      props.setSixPaths(true);
      PacketDispatcher.sendTo((IMessage)new SyncSixPathsMessage((EntityPlayer)entityplayermp), entityplayermp);
      sender.addChatMessage((IChatComponent)new ChatComponentText("Given Six Paths Mode to " + entityplayermp.getDisplayName()));
    } else {
      props.setSixPaths(false);
      PacketDispatcher.sendTo((IMessage)new SyncSixPathsMessage((EntityPlayer)entityplayermp), entityplayermp);
      sender.addChatMessage((IChatComponent)new ChatComponentText("Taken Six Paths Mode from " + entityplayermp.getDisplayName()));
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null;
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

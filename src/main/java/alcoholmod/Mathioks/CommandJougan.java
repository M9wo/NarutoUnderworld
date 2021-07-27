package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncJouganMessage;
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

public class CommandJougan extends CommandBase {
  public String getCommandName() {
    return "jougan";
  }
  
  public String getCommandUsage(ICommandSender args) {
    return "/jougan <PATH> <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    if (args.length == 2) {
      new NBTTagCompound();
      EntityPlayerMP entityplayermp = getPlayer(sender, args[1]);
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
      if (args[0].equals("Ashura")) {
        props.setJougan(1);
        PacketDispatcher.sendTo((IMessage)new SyncJouganMessage((EntityPlayer)entityplayermp), entityplayermp);
        sender.addChatMessage((IChatComponent)new ChatComponentText("Given the " + args[0] + " path Jougan to " + entityplayermp.getDisplayName()));
      } 
      if (args[0].equals("Indra")) {
        props.setJougan(2);
        PacketDispatcher.sendTo((IMessage)new SyncJouganMessage((EntityPlayer)entityplayermp), entityplayermp);
        sender.addChatMessage((IChatComponent)new ChatComponentText("Given the " + args[0] + " path Jougan to " + entityplayermp.getDisplayName()));
      } 
    } else {
      throw new WrongUsageException("Not enough or too many arguments.", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, new String[] { "Ashura", "Indra" }) : ((args.length == 2) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null);
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

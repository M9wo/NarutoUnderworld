package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncByakugouMessage;
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

public class CommandByakugou extends CommandBase {
  public String getCommandName() {
    return "givebyakugou";
  }
  
  public String getCommandUsage(ICommandSender sender) {
    return "/givebyakugou <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    new NBTTagCompound();
    EntityPlayerMP entityplayermp = getPlayer(sender, args[0]);
    ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
    if (args.length == 1) {
      props.setByakugou(1);
      PacketDispatcher.sendTo((IMessage)new SyncByakugouMessage((EntityPlayer)entityplayermp), entityplayermp);
      sender.addChatMessage((IChatComponent)new ChatComponentText("Unlocked the Byakugou for " + entityplayermp.getDisplayName() + "."));
    } else {
      throw new WrongUsageException("Specify a player. Usage: /givebyakugou <PLAYER>", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null;
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

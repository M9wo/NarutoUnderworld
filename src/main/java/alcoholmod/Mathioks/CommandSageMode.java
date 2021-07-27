package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncSageVersionMessage;
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

public class CommandSageMode extends CommandBase {
  String[] sages = new String[] { "None", "Snake", "JiraiyaToad", "Slug", "NarutoToad" };
  
  public int getRequiredPermissionLevel() {
    return 2;
  }
  
  public String getCommandName() {
    return "setsage";
  }
  
  public String getCommandUsage(ICommandSender p_71518_1_) {
    return "/setsage <TYPE> <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    if (args.length == 2) {
      new NBTTagCompound();
      EntityPlayerMP entityplayermp = getPlayer(sender, args[1]);
      EntityPlayerMP entityPlayerMP1 = entityplayermp;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
      for (int k = 0; k < this.sages.length; k++) {
        if (args[0].equals(this.sages[k])) {
          int i = props.getSageVersion();
          sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp.getDisplayName() + "'s Sage Mode Type to " + args[0] + ". " + entityplayermp.getDisplayName() + "'s previous Sage Mode Type: " + this.sages[i]));
          props.setSageVersion(k);
          PacketDispatcher.sendTo((IMessage)new SyncSageVersionMessage((EntityPlayer)entityPlayerMP1), entityplayermp);
        } 
      } 
    } else {
      throw new WrongUsageException("Too many or not enough arguments. Usage: /setsage <TYPE> <PLAYER>", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, new String[] { "None", "Snake", "JiraiyaToad", "Slug", "NarutoToad" }) : ((args.length == 2) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null);
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

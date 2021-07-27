package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncmangekyouSharinganMessage;
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

public class CommandSharingan extends CommandBase {
  String[] mstypes = new String[] { 
      "Sasuke", "Itachi", "Shisui", "Obito", "Izuna", "Naori", "Indra", "Madara", "Baru", "Rai", 
      "Naka", "Shin", "Mentroz", "Dragozai", "CoralSensei", "McNASTY", "Charlie", "Grimbite", "ha1den", "janglolroflmao", 
      "JORDAN", "L0rdMadaraUchiha", "Tomtomcaty", "Fujimoto", "Yunus", "Candrom" };
  
  int[] msids = new int[] { 
      3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 
      13, 14, 20, 21, 22, 23, 24, 25, 26, 27, 
      28, 29, 30, 31, 32, 50 };
  
  public String getCommandName() {
    return "setms";
  }
  
  public String getCommandUsage(ICommandSender sender) {
    return "/setms <MS> <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    if (args.length == 2) {
      new NBTTagCompound();
      EntityPlayerMP entityplayermp = getPlayer(sender, args[1]);
      EntityPlayerMP entityPlayerMP1 = entityplayermp;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
      for (int k = 0; k < this.mstypes.length; k++) {
        if (args[0].equals(this.mstypes[k])) {
          props.setmangekyouSharingan(this.msids[k]);
          PacketDispatcher.sendTo((IMessage)new SyncmangekyouSharinganMessage((EntityPlayer)entityPlayerMP1), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp.getCommandSenderName() + "'s Mangekyou Sharingan to " + this.mstypes[k]));
        } 
      } 
    } else {
      throw new WrongUsageException("Not enough or too many arguments.", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, new String[] { 
          "Sasuke", "Itachi", "Shisui", "Obito", "Izuna", "Naori", "Indra", "Madara", "Baru", "Rai", 
          "Naka", "Shin", "Mentroz", "Dragozai", "CoralSensei", "McNASTY", "Charlie", "Grimbite", "ha1den", "janglolroflmao", 
          "JORDAN", "L0rdMadaraUchiha", "Tomtomcaty", "Fujimoto", "Yunus", "Candrom" }) : ((args.length == 2) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null);
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

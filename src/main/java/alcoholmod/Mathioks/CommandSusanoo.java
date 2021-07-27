package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncSusanoAMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSusanoMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSusanoSizeMessage;
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

public class CommandSusanoo extends CommandBase {
  String[] susanooType = new String[] { "cage", "skeleton", "complete", "armor", "perfect" };
  
  int[] susanooTypeID = new int[] { 1, 2, 3, 4, 5 };
  
  public int getRequiredPermissionLevel() {
    return 2;
  }
  
  public String getCommandName() {
    return "sstage";
  }
  
  public String getCommandUsage(ICommandSender sender) {
    return "/sstage <STAGE> <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    if (args.length < 1)
      throw new WrongUsageException("Usage: /sstage <STAGE> <PLAYER>", new Object[0]); 
    new NBTTagCompound();
    EntityPlayerMP entityplayermp = (!args[0].equals("size") && args.length == 2) ? getPlayer(sender, args[1]) : ((args[0].equals("size") && args.length == 3) ? getPlayer(sender, args[2]) : getCommandSenderAsPlayer(sender));
    EntityPlayerMP entityPlayerMP1 = entityplayermp;
    ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
    for (int k = 0; k < this.susanooType.length; k++) {
      if (args[0].equals(this.susanooType[k])) {
        props.setSusanoA(false);
        PacketDispatcher.sendTo((IMessage)new SyncSusanoAMessage((EntityPlayer)entityPlayerMP1), entityplayermp);
        PacketDispatcher.sendToServer((IMessage)new SyncSusanoAMessage((EntityPlayer)entityPlayerMP1));
        props.setSusanoActive(this.susanooTypeID[k]);
        PacketDispatcher.sendTo((IMessage)new SyncSusanoMessage((EntityPlayer)entityPlayerMP1), entityplayermp);
        PacketDispatcher.sendToServer((IMessage)new SyncSusanoMessage((EntityPlayer)entityPlayerMP1));
        props.setSusanoA(true);
        PacketDispatcher.sendTo((IMessage)new SyncSusanoAMessage((EntityPlayer)entityPlayerMP1), entityplayermp);
        PacketDispatcher.sendToServer((IMessage)new SyncSusanoAMessage((EntityPlayer)entityPlayerMP1));
        sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp.getDisplayName() + "'s Susanoo Type to " + this.susanooType[k]));
      } else if (args[0].equals("size") && !args[1].equals("perfect") && args[1].equals(this.susanooType[k])) {
        props.setSusanoSize(k + 1);
        PacketDispatcher.sendTo((IMessage)new SyncSusanoSizeMessage((EntityPlayer)entityPlayerMP1), entityplayermp);
        PacketDispatcher.sendToServer((IMessage)new SyncSusanoSizeMessage((EntityPlayer)entityPlayerMP1));
        sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp.getDisplayName() + "'s Susanoo Size to " + this.susanooType[k]));
      } 
    } 
    if (args[0].equals("off")) {
      props.setSusanoA(false);
      PacketDispatcher.sendTo((IMessage)new SyncSusanoAMessage((EntityPlayer)entityPlayerMP1), entityplayermp);
      props.setSusanoActive(0);
      PacketDispatcher.sendTo((IMessage)new SyncSusanoMessage((EntityPlayer)entityPlayerMP1), entityplayermp);
      sender.addChatMessage((IChatComponent)new ChatComponentText("Turned " + entityplayermp.getDisplayName() + "'s Susanoo off"));
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    if (args.length == 1)
      return getListOfStringsMatchingLastWord(args, new String[] { "off", "cage", "skeleton", "complete", "armor", "perfect" }); 
    return ((args[0].equals("size") || args.length != 2) && (!args[0].equals("size") || args.length != 3)) ? null : getListOfStringsMatchingLastWord(args, getPlayers());
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

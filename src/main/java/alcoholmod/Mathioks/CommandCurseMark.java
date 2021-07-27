package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncCurseSealMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCurseSizeMessage;
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

public class CommandCurseMark extends CommandBase {
  boolean isInteger(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException var3) {
      return false;
    } 
  }
  
  public int getRequiredPermissionLevel() {
    return 2;
  }
  
  public String getCommandName() {
    return "setcm";
  }
  
  public String getCommandUsage(ICommandSender p_71518_1_) {
    return "/setcm <stage/type> <STAGE/TYPE> <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    if (args.length == 3) {
      new NBTTagCompound();
      EntityPlayerMP entityplayermp = getPlayer(sender, args[2]);
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
      if (args[0].equals("type")) {
        if (args[1].equals("Sasuke")) {
          props.setCurseSeal(1);
          PacketDispatcher.sendTo((IMessage)new SyncCurseSealMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp.getCommandSenderName() + "'s Curse Seal to " + args[2]));
        } else if (args[1].equals("Kimimaro")) {
          props.setCurseSeal(4);
          PacketDispatcher.sendTo((IMessage)new SyncCurseSealMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp.getCommandSenderName() + "'s Curse Seal to " + args[2]));
        } else if (args[1].equals("Tayuya")) {
          props.setCurseSeal(7);
          PacketDispatcher.sendTo((IMessage)new SyncCurseSealMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp.getCommandSenderName() + "'s Curse Seal to " + args[2]));
        } else if (args[1].equals("Kidomaru")) {
          props.setCurseSeal(10);
          PacketDispatcher.sendTo((IMessage)new SyncCurseSealMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp.getCommandSenderName() + "'s Curse Seal to " + args[2]));
        } else if (args[1].equals("Jirobo")) {
          props.setCurseSeal(13);
          PacketDispatcher.sendTo((IMessage)new SyncCurseSealMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp.getCommandSenderName() + "'s Curse Seal to " + args[2]));
        } else {
          if (!args[1].equals("SakonUkon"))
            throw new WrongUsageException("Usage: /setcm type <TYPE> <PLAYER>", new Object[0]); 
          props.setCurseSeal(16);
          PacketDispatcher.sendTo((IMessage)new SyncCurseSealMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp.getCommandSenderName() + "'s Curse Seal to " + args[2]));
        } 
      } else if (args[0].equals("stage")) {
        if (!isInteger(args[1]))
          throw new WrongUsageException("Wrong arguments. Usage: /setcm stage <1/2> <PLAYER>", new Object[0]); 
        if (Integer.valueOf(args[1]).intValue() == 1) {
          props.setCurseSize(1);
          PacketDispatcher.sendTo((IMessage)new SyncCurseSizeMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp.getCommandSenderName() + "'s Curse Seal Stage to " + args[2]));
        } else {
          if (Integer.valueOf(args[1]).intValue() != 2)
            throw new WrongUsageException(args[1] + " is not a stage.", new Object[0]); 
          props.setCurseSize(2);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp.getCommandSenderName() + "'s Curse Seal Stage to " + args[2]));
          PacketDispatcher.sendTo((IMessage)new SyncCurseSizeMessage((EntityPlayer)entityplayermp), entityplayermp);
        } 
      } 
    } else {
      throw new WrongUsageException("Too many or not enough arguments. Usage: /setcm <stage/type> <STAGE/TYPE> <PLAYER>", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, new String[] { "stage", "type" }) : ((args.length == 2 && args[0].equals("stage")) ? getListOfStringsMatchingLastWord(args, new String[] { "1", "2" }) : ((args.length == 2 && args[0].equals("type")) ? getListOfStringsMatchingLastWord(args, new String[] { "Sasuke", "Kimimaro", "Tayuya", "Kidomaru", "Jirobo", "SakonUkon" }) : ((args.length == 3) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null)));
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

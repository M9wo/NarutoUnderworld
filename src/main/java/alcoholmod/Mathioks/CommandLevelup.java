package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncJutsuPointsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncLevelMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSkillPointsMessage;
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

public class CommandLevelup extends CommandBase {
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
    return "levelup";
  }
  
  public String getCommandUsage(ICommandSender p_71518_1_) {
    return "/levelup <AMOUNT> [PLAYER]";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    new NBTTagCompound();
    EntityPlayerMP entityplayermp = (isInteger(args[0]) && args.length == 2) ? getPlayer(sender, args[1]) : getCommandSenderAsPlayer(sender);
    ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
    if (args.length >= 1 && args.length < 3) {
      if (isInteger(args[0])) {
        int currL = props.getLevel();
        int currS = props.getSkillPoints();
        int currJ = props.getJutsuPoints();
        int newL = currL + Integer.valueOf(args[0]).intValue();
        int newS = currS + Integer.valueOf(args[0]).intValue();
        int newJ = currJ + Integer.valueOf(args[0]).intValue();
        if (args.length == 1) {
          sender.addChatMessage((IChatComponent)new ChatComponentText("Setting your Level to: " + newL + "(Previously: " + currL + ")"));
          sender.addChatMessage((IChatComponent)new ChatComponentText("Setting your Skill Points to: " + newS + "(Previously: " + currS + ")"));
          sender.addChatMessage((IChatComponent)new ChatComponentText("Setting your Jutsu Points to: " + newJ + "(Previously: " + currJ + ")"));
        } 
        if (args.length == 2) {
          sender.addChatMessage((IChatComponent)new ChatComponentText("Setting " + entityplayermp.getDisplayName() + "'s Level to: " + newL + "(Previously: " + currL + ")"));
          sender.addChatMessage((IChatComponent)new ChatComponentText("Setting " + entityplayermp.getDisplayName() + "'s Skill Points to: " + newS + "(Previously: " + currS + ")"));
          sender.addChatMessage((IChatComponent)new ChatComponentText("Setting " + entityplayermp.getDisplayName() + "'S Jutsu Points to: " + newJ + "(Previously: " + currJ + ")"));
        } 
        props.setLevel(newL);
        PacketDispatcher.sendTo((IMessage)new SyncLevelMessage((EntityPlayer)entityplayermp), entityplayermp);
        props.setSkillPoints(newS);
        PacketDispatcher.sendTo((IMessage)new SyncSkillPointsMessage((EntityPlayer)entityplayermp), entityplayermp);
        props.setJutsuPoints(newJ);
        PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage((EntityPlayer)entityplayermp), entityplayermp);
      } else {
        throw new WrongUsageException("AMOUNT must be a number. Usage: /levelup <AMOUNT> [PLAYER]", new Object[0]);
      } 
    } else {
      throw new WrongUsageException("Too many arguments. Usage: /levelup <AMOUNT> [PLAYER]", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 2) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null;
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

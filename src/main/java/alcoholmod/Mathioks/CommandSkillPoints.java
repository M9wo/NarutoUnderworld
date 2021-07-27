package alcoholmod.Mathioks;

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

public class CommandSkillPoints extends CommandBase {
  boolean isInteger(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException var3) {
      return false;
    } 
  }
  
  public String getCommandName() {
    return "skp";
  }
  
  public String getCommandUsage(ICommandSender sender) {
    return "/skp <give/set> <AMOUNT> <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    if (args.length == 3) {
      new NBTTagCompound();
      EntityPlayerMP entityplayermp = getPlayer(sender, args[2]);
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
      if (args[0].equals("give")) {
        if (!isInteger(args[1]))
          throw new WrongUsageException(args[1] + " is not a number. Usage: /skp give <AMOUNT> <PLAYER>", new Object[0]); 
        int currentPoints = props.getSkillPoints();
        int setPoints = Integer.valueOf(args[1]).intValue();
        int after = currentPoints + setPoints;
        sender.addChatMessage((IChatComponent)new ChatComponentText("Giving " + setPoints + " Skill Points to " + entityplayermp.getDisplayName() + "(Now: " + after + ", previously: " + currentPoints + ")"));
        props.setSkillPoints(currentPoints + setPoints);
        PacketDispatcher.sendTo((IMessage)new SyncSkillPointsMessage((EntityPlayer)entityplayermp), entityplayermp);
      } else {
        if (!args[0].equals("set"))
          throw new WrongUsageException("Wrong arguments. Usage: /skp <give/set> <AMOUNT> <PLAYER>", new Object[0]); 
        if (!isInteger(args[1]))
          throw new WrongUsageException(args[1] + " is not a number. Usage: /skp set <AMOUNT> <PLAYER>", new Object[0]); 
        int currentPoints = props.getSkillPoints();
        int setPoints = Integer.valueOf(args[1]).intValue();
        sender.addChatMessage((IChatComponent)new ChatComponentText("Setting " + entityplayermp.getDisplayName() + "'s Skill Points to " + setPoints));
        props.setSkillPoints(setPoints);
        PacketDispatcher.sendTo((IMessage)new SyncSkillPointsMessage((EntityPlayer)entityplayermp), entityplayermp);
      } 
    } else {
      throw new WrongUsageException("Too many or not enough arguments. Usage: /skp <give/set> <AMOUNT> <PLAYER>", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, new String[] { "give", "set" }) : ((args.length == 3) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null);
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}
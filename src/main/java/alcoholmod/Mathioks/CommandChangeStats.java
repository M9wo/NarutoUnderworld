package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncKinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSkillPointsMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncHealthMessage;
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

public class CommandChangeStats extends CommandBase {
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
    return "changestats";
  }
  
  public String getCommandUsage(ICommandSender sender) {
    return "/changestats <STAT> <add/set> <AMOUNT> <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    if (args.length == 4) {
      new NBTTagCompound();
      EntityPlayerMP entityplayermp = getPlayer(sender, args[3]);
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
      if (args[0].equals("Medical")) {
        if (args[1].equals("add") && isInteger(args[2]))
          if (Integer.valueOf(args[2]).intValue() + props.getHealth() <= 500) {
            props.setHealth(props.getHealth() + Integer.valueOf(args[2]).intValue());
            PacketDispatcher.sendTo((IMessage)new SyncHealthMessage((EntityPlayer)entityplayermp), entityplayermp);
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[2] + " points in " + args[0] + " to " + entityplayermp.getDisplayName() + "."));
          } else {
            int result1 = Integer.valueOf(args[2]).intValue() - Math.abs(500 - props.getHealth() + Integer.valueOf(args[2]).intValue());
            int result2 = Math.abs(500 - props.getHealth() + Integer.valueOf(args[2]).intValue());
            props.setHealth(props.getHealth() + result1);
            PacketDispatcher.sendTo((IMessage)new SyncHealthMessage((EntityPlayer)entityplayermp), entityplayermp);
            props.setSkillPoints(props.getSkillPoints() + result2);
            PacketDispatcher.sendTo((IMessage)new SyncSkillPointsMessage((EntityPlayer)entityplayermp), entityplayermp);
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + result1 + " " + args[0] + " points and " + result2 + " Skill Points to " + entityplayermp.getDisplayName() + "."));
          }  
        if (args[1].equals("set") && isInteger(args[2]) && Integer.valueOf(args[2]).intValue() <= 500) {
          props.setHealth(Integer.valueOf(args[2]).intValue());
          PacketDispatcher.sendTo((IMessage)new SyncHealthMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Setting " + entityplayermp.getDisplayName() + "'s points in " + args[0] + " to " + args[2] + "."));
        } 
      } 
      if (args[0].equals("Kinjutsu")) {
        if (args[1].equals("add") && isInteger(args[2]))
          if (Integer.valueOf(args[2]).intValue() + props.getKinjutsu() <= 100) {
            props.setKinjutsu(props.getKinjutsu() + Integer.valueOf(args[2]).intValue());
            PacketDispatcher.sendTo((IMessage)new SyncKinjutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[2] + " points in " + args[0] + " to " + entityplayermp.getDisplayName() + "."));
          } else {
            int result1 = Integer.valueOf(args[2]).intValue() - Math.abs(100 - props.getKinjutsu() + Integer.valueOf(args[2]).intValue());
            int result2 = Math.abs(100 - props.getKinjutsu() + Integer.valueOf(args[2]).intValue());
            props.setKinjutsu(props.getKinjutsu() + result1);
            PacketDispatcher.sendTo((IMessage)new SyncKinjutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
            props.setSkillPoints(props.getSkillPoints() + result2);
            PacketDispatcher.sendTo((IMessage)new SyncSkillPointsMessage((EntityPlayer)entityplayermp), entityplayermp);
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + result1 + " " + args[0] + " points and " + result2 + " Skill Points to " + entityplayermp.getDisplayName() + "."));
          }  
        if (args[1].equals("set") && isInteger(args[2]) && Integer.valueOf(args[2]).intValue() <= 100) {
          props.setKinjutsu(Integer.valueOf(args[2]).intValue());
          PacketDispatcher.sendTo((IMessage)new SyncKinjutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Setting " + entityplayermp.getDisplayName() + "'s points in " + args[0] + " to " + args[2] + "."));
        } 
      } 
      if (args[0].equals("Senjutsu")) {
        if (args[1].equals("add") && isInteger(args[2]))
          if (Integer.valueOf(args[2]).intValue() * 5 + props.getSenjutsu() <= 3000) {
            props.setSenjutsu(props.getSenjutsu() + Integer.valueOf(args[2]).intValue() * 5);
            PacketDispatcher.sendTo((IMessage)new SyncSenjutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[2] + " points in " + args[0] + " to " + entityplayermp.getDisplayName() + "."));
          } else {
            int result1 = Integer.valueOf(args[2]).intValue() * 5 - Math.abs(3000 - props.getSenjutsu() + Integer.valueOf(args[2]).intValue() * 5);
            props.setSenjutsu(props.getSenjutsu() + result1);
            PacketDispatcher.sendTo((IMessage)new SyncSenjutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + result1 + " " + args[0] + " points to " + entityplayermp.getDisplayName() + "."));
          }  
        if (args[1].equals("set") && isInteger(args[2]) && Integer.valueOf(args[2]).intValue() * 5 <= 3000) {
          props.setSenjutsu(Integer.valueOf(args[2]).intValue() * 5);
          PacketDispatcher.sendTo((IMessage)new SyncSenjutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Setting " + entityplayermp.getDisplayName() + "'s points in " + args[0] + " to " + args[2] + "."));
        } 
      } 
      if (args[0].equals("Ninjutsu")) {
        if (args[1].equals("add") && isInteger(args[2])) {
          props.setNinjutsu(props.getNinjutsu() + Integer.valueOf(args[2]).intValue());
          PacketDispatcher.sendTo((IMessage)new SyncSenjutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[2] + " points in " + args[0] + " to " + entityplayermp.getDisplayName() + "."));
        } 
        if (args[1].equals("set") && isInteger(args[2])) {
          props.setNinjutsu(Integer.valueOf(args[2]).intValue());
          PacketDispatcher.sendTo((IMessage)new SyncSenjutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Setting " + entityplayermp.getDisplayName() + "'s points in " + args[0] + " to " + args[2] + "."));
        } 
      } 
      if (args[0].equals("Intelligence")) {
        if (args[1].equals("add") && isInteger(args[2]))
          if (Integer.valueOf(args[2]).intValue() + props.getIntelligence() <= 100) {
            props.setIntelligence(props.getIntelligence() + Integer.valueOf(args[2]).intValue());
            PacketDispatcher.sendTo((IMessage)new SyncSenjutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[2] + " points in " + args[0] + " to " + entityplayermp.getDisplayName() + "."));
          } else {
            int result1 = 100 - props.getIntelligence();
            props.setIntelligence(props.getIntelligence() + result1);
            PacketDispatcher.sendTo((IMessage)new SyncSenjutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + result1 + " " + args[0] + " points to " + entityplayermp.getDisplayName() + "."));
          }  
        if (args[1].equals("set") && isInteger(args[2]) && Integer.valueOf(args[2]).intValue() <= 100) {
          props.setIntelligence(Integer.valueOf(args[2]).intValue());
          PacketDispatcher.sendTo((IMessage)new SyncSenjutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText("Setting " + entityplayermp.getDisplayName() + "'s points in " + args[0] + " to " + args[2] + "."));
        } 
      } 
    } else {
      throw new WrongUsageException("Too many or not enough arguments. Usage: /changestats <STAT> <add/set> <AMOUNT> <PLAYER>", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, new String[] { "Medical", "Kinjutsu", "Senjutsu", "Ninjutsu", "Intelligence" }) : ((args.length == 2) ? getListOfStringsMatchingLastWord(args, new String[] { "add", "set" }) : ((args.length == 5) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null));
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

package alcoholmod.Mathioks;

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

public class CommandTakeChakra extends CommandBase {
  boolean isInteger(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException var3) {
      return false;
    } 
  }
  
  public String getCommandName() {
    return "takechakra";
  }
  
  public String getCommandUsage(ICommandSender sender) {
    return "/takechakra <AMOUNT> <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    if (args.length == 2) {
      new NBTTagCompound();
      EntityPlayerMP entityplayermp = getPlayer(sender, args[1]);
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
      if (isInteger(args[0])) {
        if (props.getCurrentMana() < Integer.valueOf(args[0]).intValue())
          throw new WrongUsageException(entityplayermp.getDisplayName() + " doesn't have enough chakra", new Object[0]); 
        props.consumeMana(Integer.valueOf(args[0]).intValue());
        sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[0] + " chakra from " + entityplayermp.getDisplayName()));
      } else {
        sender.addChatMessage((IChatComponent)new ChatComponentText(args[0] + " is not a number"));
      } 
    } else {
      throw new WrongUsageException("Not enough or too many arguments", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 2) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null;
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

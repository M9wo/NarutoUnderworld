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

public class CommandCheckSharingan extends CommandBase {
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
    return "sharcheck";
  }
  
  public String getCommandUsage(ICommandSender sender) {
    return "/sharcheck <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    if (args.length == 1) {
      new NBTTagCompound();
      EntityPlayerMP entityplayermp = getPlayer(sender, args[0]);
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
      if (props.getSharingan() == 0 && props.getsharinganicon() == 1) {
        entityplayermp.addChatComponentMessage((IChatComponent)new ChatComponentText("1 Томое разблокировано на " + (props.getSharinganUnlock() / 2.5D)));
      } else if ((props.getSharingan() == 3 || props.getSharingan() == 102) && props.getSharinganSize() == 0.0D) {
        entityplayermp.addChatComponentMessage((IChatComponent)new ChatComponentText("МШ разблокирован на " + (props.getSharinganUnlock() / 4.0D)));
      } else if (props.getSharinganSize() == 1.0D && props.getmangekyouSharingan() >= 1) {
        entityplayermp.addChatComponentMessage((IChatComponent)new ChatComponentText("ВМШ разблокирован на " + (props.getSharinganUnlock() / 13.0D)));
      } else if (props.getSharinganSize() == 2.0D && props.getmangekyouSharingan() >= 1 && props.getYinRelease() == 1 && props.getYangRelease() == 1 && props.getFireRelease() == 1 && props.getWindRelease() == 1 && props.getLightningRelease() == 1 && props.getLevel() >= 500) {
        entityplayermp.addChatComponentMessage((IChatComponent)new ChatComponentText("Риннеган разблокирован на " + (props.getSharinganUnlock() / 40.0D)));
      } else {
        entityplayermp.addChatComponentMessage((IChatComponent)new ChatComponentText("Вы не удовлетворяете требованиям"));
      } 
    } else {
      throw new WrongUsageException("Too many or not enough arguments. Usage: /sharcheck <PLAYER>", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null;
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncLandMessage;
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

public class CommandLand extends CommandBase {
  String[] lands = new String[] { "None", "Earth", "Fire", "Iron", "Lightning", "Sky", "Snow", "Sound", "Water", "Wind" };
  
  public int getRequiredPermissionLevel() {
    return 2;
  }
  
  public String getCommandName() {
    return "setland";
  }
  
  public String getCommandUsage(ICommandSender p_71518_1_) {
    return "/setland <LAND> <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    if (args.length == 2) {
      new NBTTagCompound();
      EntityPlayerMP entityplayermp = getPlayer(sender, args[1]);
      EntityPlayerMP entityPlayerMP1 = entityplayermp;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
      for (int k = 0; k < this.lands.length; k++) {
        if (args[0].equals(this.lands[k])) {
          if (this.lands[k] == this.lands[props.getLand()])
            throw new WrongUsageException(entityplayermp.getDisplayName() + "'s Land is already what you're trying to set it to.", new Object[0]); 
          int i = props.getLand();
          sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp.getDisplayName() + "'s Land to " + args[0] + ". " + entityplayermp.getDisplayName() + "'s previous Land: " + this.lands[i]));
          props.setLand(k);
          PacketDispatcher.sendTo((IMessage)new SyncLandMessage((EntityPlayer)entityPlayerMP1), entityplayermp);
        } 
      } 
    } else {
      throw new WrongUsageException("Too many or not enough arguments. Usage: /setland <LAND> <PLAYER>", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, new String[] { "None", "Earth", "Fire", "Iron", "Lightning", "Sky", "Snow", "Sound", "Water", "Wind" }) : ((args.length == 2) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null);
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

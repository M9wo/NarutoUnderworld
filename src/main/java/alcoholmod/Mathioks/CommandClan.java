package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncClanMessage;
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

public class CommandClan extends CommandBase {
  String[] clans = new String[] { 
      "None", "Uchiha", "Uzumaki", "Aburame", "Akimichi", "Hatake", "Hozuki", "Hyuga", "Iburi", "Inuzuka", 
      "Jugo", "Kaguya", "Kurama", "Tsuchigumo", "Nara", "Otsutsuki", "Hagoromo", "Sarutobi", "Fuma", "Neko", 
      "Yuki", "Yamanaka", "Lee", "Chinoike", "Shirogane" };
  
  public int getRequiredPermissionLevel() {
    return 2;
  }
  
  public String getCommandName() {
    return "setclan";
  }
  
  public String getCommandUsage(ICommandSender p_71518_1_) {
    return "/setclan <CLAN> <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    if (args.length == 2) {
      new NBTTagCompound();
      EntityPlayerMP entityplayermp = getPlayer(sender, args[1]);
      EntityPlayerMP entityPlayerMP1 = entityplayermp;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
      for (int k = 0; k < this.clans.length; k++) {
        if (args[0].equals(this.clans[k])) {
          if (this.clans[k] == this.clans[props.getClan()])
            throw new WrongUsageException(entityplayermp.getDisplayName() + "'s Clan is already what you're trying to set it to.", new Object[0]); 
          int i = props.getClan();
          sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp.getDisplayName() + "'s Clan to " + args[0] + ". " + entityplayermp.getDisplayName() + "'s previous clan: " + this.clans[i]));
          props.setClan(k);
          PacketDispatcher.sendTo((IMessage)new SyncClanMessage((EntityPlayer)entityPlayerMP1), entityplayermp);
        } 
      } 
    } else {
      throw new WrongUsageException("Too many or not enough arguments. Usage: /setclan <CLAN> <PLAYER>", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, new String[] { 
          "None", "Uchiha", "Uzumaki", "Aburame", "Akimichi", "Hatake", "Hozuki", "Hyuga", "Iburi", "Inuzuka", 
          "Jugo", "Kaguya", "Kurama", "Tsuchigumo", "Nara", "Otsutsuki", "Hagoromo", "Sarutobi", "Fuma", "Senju", 
          "Yuki", "Yamanaka", "Lee", "Chinoike", "Shirogane" }) : ((args.length == 2) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null);
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

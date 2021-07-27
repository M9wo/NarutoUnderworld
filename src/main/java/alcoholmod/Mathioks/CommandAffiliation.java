package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncAffiliationMessage;
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

public class CommandAffiliation extends CommandBase {
  String[] affiliations = new String[] { 
      "None", "Akatsuki", "Amegakure", "Getsugakure", "Hoshigakure", "Ishigakure", "Iwagakure", "Jomae", "Kirigakure", "Konohagakure", 
      "Kumogakure", "Kusagakure", "Nadeshiko", "Otogakure", "RyuchiCave", "Shimogakure", "Sunagakure", "Takigakure", "Takumi", "Tanigakure", 
      "MountMyoboku", "Yugagakure", "Yukigakure", "Yumegakure", "Shikotsu" };
  
  public int getRequiredPermissionLevel() {
    return 2;
  }
  
  public String getCommandName() {
    return "setaff";
  }
  
  public String getCommandUsage(ICommandSender p_71518_1_) {
    return "/setaff <AFFILIATION> <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    if (args.length == 2) {
      new NBTTagCompound();
      EntityPlayerMP entityplayermp = getPlayer(sender, args[1]);
      EntityPlayerMP entityPlayerMP1 = entityplayermp;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
      for (int k = 0; k < this.affiliations.length; k++) {
        if (args[0].equals(this.affiliations[k])) {
          if (this.affiliations[k] == this.affiliations[props.getAffiliation()])
            throw new WrongUsageException(entityplayermp.getDisplayName() + "'s Affiliation is already what you're trying to set it to.", new Object[0]); 
          int i = props.getAffiliation();
          sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp.getDisplayName() + "'s Affiliation to " + args[0] + ". " + entityplayermp.getDisplayName() + "'s previous clan: " + this.affiliations[i]));
          props.setAffiliation(k);
          PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage((EntityPlayer)entityPlayerMP1), entityplayermp);
        } 
      } 
    } else {
      throw new WrongUsageException("Too many or not enough arguments. Usage: /setaff <AFFILIATION> <PLAYER>", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, new String[] { 
          "None", "Akatsuki", "Amegakure", "Getsugakure", "Hoshigakure", "Ishigakure", "Iwagakure", "Jomae", "Kirigakure", "Konohagakure", 
          "Kumogakure", "Kusagakure", "Nadeshiko", "Otogakure", "RyuchiCave", "Shimogakure", "Sunagakure", "Takigakure", "Takumi", "Tanigakure", 
          "MountMyoboku", "Yugagakure", "Yukigakure", "Yumegakure", "Shikotsu" }) : ((args.length == 2) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null);
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

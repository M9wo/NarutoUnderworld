package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncRankMessage;
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

public class CommandRank extends CommandBase {
  String[] ranks = new String[] { 
      "Villager", "Genin", "Chunin", "TokubetsuJonin", "Jonin", "Missing-Nin", "ExplosionCorps", "Taka", "Hebi", "oftheBloodyMist", 
      "Samurai", "Anbu", "MedicalTeam", "IntelTeam", "AnbuCaptain", "MedicalCaptain", "IntelCaptain", "Akatsuki", "KinkakuForce", "12GuardianNinja", 
      "PuppetBrigade", "AcademyStudent", "7NinjaSwordsmen", "Kage", "AkatsukiLeader", "Sannin", "D-Rank", "C-Rank", "B-Rank", "A-Rank", 
      "S-Rank", "TailedBeast" };
  
  public int getRequiredPermissionLevel() {
    return 2;
  }
  
  public String getCommandName() {
    return "setrank";
  }
  
  public String getCommandUsage(ICommandSender p_71518_1_) {
    return "/setrank <RANK> <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    if (args.length == 2) {
      new NBTTagCompound();
      EntityPlayerMP entityplayermp = getPlayer(sender, args[1]);
      EntityPlayerMP entityPlayerMP1 = entityplayermp;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
      for (int k = 0; k < this.ranks.length; k++) {
        if (args[0].equals(this.ranks[k])) {
          if (this.ranks[k] == this.ranks[props.getRank()])
            throw new WrongUsageException(entityplayermp.getDisplayName() + "'s Rank is already what you're trying to set it to.", new Object[0]); 
          int i = props.getRank();
          sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp.getDisplayName() + "'s Rank to " + args[0] + ". " + entityplayermp.getDisplayName() + "'s previous Rank: " + this.ranks[i]));
          props.setRank(k);
          PacketDispatcher.sendTo((IMessage)new SyncRankMessage((EntityPlayer)entityPlayerMP1), entityplayermp);
        } 
      } 
    } else {
      throw new WrongUsageException("Too many or not enough arguments. Usage: /setrank <RANK> <PLAYER>", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, new String[] { 
          "Villager", "Genin", "Chunin", "TokubetsuJonin", "Jonin", "Missing-Nin", "ExplosionCorps", "Taka", "Hebi", "oftheBloodyMist", 
          "Samurai", "Anbu", "MedicalTeam", "IntelTeam", "AnbuCaptain", "MedicalCaptain", "IntelCaptain", "Akatsuki", "KinkakuForce", "12GuardianNinja", 
          "PuppetBrigade", "AcademyStudent", "7NinjaSwordsmen", "Kage", "AkatsukiLeader", "Sannin", "D-Rank", "C-Rank", "B-Rank", "A-Rank", 
          "S-Rank", "TailedBeast" }) : ((args.length == 2) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null);
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

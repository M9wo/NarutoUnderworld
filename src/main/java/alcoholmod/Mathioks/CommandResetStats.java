package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncGenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncNinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncShurikenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSkillPointsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSpeedMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSummoningMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncTaijutsuMessage;
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

public class CommandResetStats extends CommandBase {
  public int getRequiredPermissionLevel() {
    return 2;
  }
  
  public String getCommandName() {
    return "resetstats";
  }
  
  public String getCommandUsage(ICommandSender p_71518_1_) {
    return "Usage: /resetstats <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    new NBTTagCompound();
    EntityPlayerMP entityplayermp = getPlayer(sender, args[0]);
    ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
    if ((int)(props.getTaijutsu() * 50.0D) - 50 <= 0 && (int)(props.getKenjutsu() * 50.0D) - 50 <= 0 && (int)(props.getSpeed() * 200.0D) - 20 <= 0 && props.getHealth() <= 0 && props.getKinjutsu() <= 0 && props.getNinjutsu() / 5 - 5 <= 0 && props.getGenjutsu() <= 0 && props.getSenjutsu() <= 0 && props.getShurikenjutsu() <= 0 && props.getSummoning() <= 0)
      throw new WrongUsageException(entityplayermp.getDisplayName() + " must spend at least one Skill Point to be able to use this command on them.", new Object[0]); 
    int newpoints = props.getSkillPoints() + (int)(props.getTaijutsu() * 50.0D) - 50 + (int)(props.getKenjutsu() * 50.0D) - 50 + (int)(props.getSpeed() * 200.0D) - 20 + props.getHealth() + props.getKinjutsu() + props.getNinjutsu() / 5 - 5 + props.getShurikenjutsu() + props.getSummoning() + props.getGenjutsu();
    sender.addChatMessage((IChatComponent)new ChatComponentText("Successfully reset " + entityplayermp.getDisplayName() + "'s stats."));
    sender.addChatMessage((IChatComponent)new ChatComponentText(entityplayermp.getDisplayName() + " now has " + newpoints + " Skill Points. (Previously " + props.getSkillPoints() + ")"));
    props.setSkillPoints(newpoints);
    PacketDispatcher.sendTo((IMessage)new SyncSkillPointsMessage((EntityPlayer)entityplayermp), entityplayermp);
    props.setTaijutsu(1.0D);
    PacketDispatcher.sendTo((IMessage)new SyncTaijutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
    props.setKenjutsu(1.0D);
    PacketDispatcher.sendTo((IMessage)new SyncKenjutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
    props.setSpeed(0.1D);
    PacketDispatcher.sendTo((IMessage)new SyncSpeedMessage((EntityPlayer)entityplayermp), entityplayermp);
    props.setHealth(0);
    PacketDispatcher.sendTo((IMessage)new SyncHealthMessage((EntityPlayer)entityplayermp), entityplayermp);
    props.setKinjutsu(0);
    PacketDispatcher.sendTo((IMessage)new SyncKinjutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
    props.setNinjutsu(25);
    PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
    props.setShurikenjutsu(0);
    PacketDispatcher.sendTo((IMessage)new SyncShurikenjutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
    props.setSummoning(0);
    PacketDispatcher.sendTo((IMessage)new SyncSummoningMessage((EntityPlayer)entityplayermp), entityplayermp);
    props.setGenjutsu(0);
    PacketDispatcher.sendTo((IMessage)new SyncGenjutsuMessage((EntityPlayer)entityplayermp), entityplayermp);
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null;
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

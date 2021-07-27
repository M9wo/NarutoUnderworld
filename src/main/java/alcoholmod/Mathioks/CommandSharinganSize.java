package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncrinneganMessage;
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

public class CommandSharinganSize extends CommandBase {
  public String getCommandName() {
    return "sharingansize";
  }
  
  public String getCommandUsage(ICommandSender args) {
    return "/sharingansize <SIZE> <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    if (args.length == 2) {
      new NBTTagCompound();
      EntityPlayerMP entityplayermp = getPlayer(sender, args[1]);
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
      if (args[0].equals("1-Tomoe")) {
        props.setSharingan(1);
        PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage((EntityPlayer)entityplayermp), entityplayermp);
        props.setSharinganSize(0.0D);
        PacketDispatcher.sendTo((IMessage)new SyncSharinganSizeMessage((EntityPlayer)entityplayermp), entityplayermp);
        sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp + "'s Sharingan Size to " + args[0]));
      } 
      if (args[0].equals("2-Tomoe")) {
        props.setSharingan(2);
        PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage((EntityPlayer)entityplayermp), entityplayermp);
        props.setSharinganSize(0.0D);
        PacketDispatcher.sendTo((IMessage)new SyncSharinganSizeMessage((EntityPlayer)entityplayermp), entityplayermp);
        sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp + "'s Sharingan Size to " + args[0]));
      } 
      if (args[0].equals("3-Tomoe")) {
        props.setSharingan(3);
        PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage((EntityPlayer)entityplayermp), entityplayermp);
        props.setSharinganSize(0.0D);
        PacketDispatcher.sendTo((IMessage)new SyncSharinganSizeMessage((EntityPlayer)entityplayermp), entityplayermp);
        sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp + "'s Sharingan Size to " + args[0]));
      } 
      if (args[0].equals("MS")) {
        props.setSharinganSize(1.0D);
        PacketDispatcher.sendTo((IMessage)new SyncSharinganSizeMessage((EntityPlayer)entityplayermp), entityplayermp);
        sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp + "'s Sharingan Size to " + args[0]));
      } 
      if (args[0].equals("EMS")) {
        props.setSharinganSize(2.0D);
        PacketDispatcher.sendTo((IMessage)new SyncSharinganSizeMessage((EntityPlayer)entityplayermp), entityplayermp);
        sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp + "'s Sharingan Size to " + args[0]));
      } 
      if (args[0].equals("Rinnegan")) {
        props.setrinnegan(1);
        PacketDispatcher.sendTo((IMessage)new SyncrinneganMessage((EntityPlayer)entityplayermp), entityplayermp);
        props.setSharinganSize(3.0D);
        PacketDispatcher.sendTo((IMessage)new SyncSharinganSizeMessage((EntityPlayer)entityplayermp), entityplayermp);
        if (props.getmangekyouSharingan() == 50) {
          props.setSharingan(151);
          PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage((EntityPlayer)entityplayermp), entityplayermp);
        } else if (props.getmangekyouSharingan() == 7) {
          props.setSharingan(161);
          PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage((EntityPlayer)entityplayermp), entityplayermp);
        } else if (props.getmangekyouSharingan() == 10) {
          props.setSharingan(165);
          PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage((EntityPlayer)entityplayermp), entityplayermp);
        } else {
          props.setSharingan(150);
          PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage((EntityPlayer)entityplayermp), entityplayermp);
        } 
        sender.addChatMessage((IChatComponent)new ChatComponentText("Set " + entityplayermp + "'s Sharingan Size to " + args[0]));
      } 
    } else {
      throw new WrongUsageException("Not enough or too many arguments.", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, new String[] { "1-Tomoe", "2-Tomoe", "3-Tomoe", "MS", "EMS", "Rinnegan" }) : ((args.length == 2) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null);
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

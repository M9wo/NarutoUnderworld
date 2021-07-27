package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuKindMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuScaleMessage;
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

public class CommandTailedBeast extends CommandBase {
  public String getCommandName() {
    return "tailedbeast";
  }
  
  public String getCommandUsage(ICommandSender sender) {
    return "/tailedbeast <TAILED BEAST> <PLAYER>";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    if (args.length == 2) {
      new NBTTagCompound();
      EntityPlayerMP entityplayermp = getPlayer(sender, args[1]);
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
      if (!args[0].equals("1") && !args[0].equalsIgnoreCase("Shukaku") && !args[0].equalsIgnoreCase("onetail")) {
        if (!args[0].equals("2") && !args[0].equalsIgnoreCase("Matatabi") && !args[0].equalsIgnoreCase("twotails")) {
          if (!args[0].equals("3") && !args[0].equalsIgnoreCase("Isobu") && !args[0].equalsIgnoreCase("threetails")) {
            if (!args[0].equals("4") && !args[0].equalsIgnoreCase("SonGoku") && !args[0].equalsIgnoreCase("fourtails")) {
              if (!args[0].equals("5") && !args[0].equalsIgnoreCase("Kokuo") && !args[0].equalsIgnoreCase("fivetails")) {
                if (!args[0].equals("6") && !args[0].equalsIgnoreCase("Saiken") && !args[0].equalsIgnoreCase("sixtails")) {
                  if (!args[0].equals("7") && !args[0].equalsIgnoreCase("Chomei") && !args[0].equalsIgnoreCase("seventails")) {
                    if (!args[0].equals("8") && !args[0].equalsIgnoreCase("Gyuki") && !args[0].equalsIgnoreCase("eighttails")) {
                      if (!args[0].equals("9") && !args[0].equalsIgnoreCase("Kurama") && !args[0].equalsIgnoreCase("ninetails")) {
                        if (!args[0].equals("10") && !args[0].equalsIgnoreCase("Juubi") && !args[0].equalsIgnoreCase("tentails"))
                          throw new WrongUsageException(args[0] + " is not a Tailed Beast.", new Object[0]); 
                        props.setBijuuKind(10);
                        PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage((EntityPlayer)entityplayermp), entityplayermp);
                        props.setBijuuScale(1);
                        PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage((EntityPlayer)entityplayermp), entityplayermp);
                        sender.addChatMessage((IChatComponent)new ChatComponentText(entityplayermp.getDisplayName() + " is now the Jinchuuriki of Juubi."));
                      } else {
                        props.setBijuuKind(9);
                        PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage((EntityPlayer)entityplayermp), entityplayermp);
                        props.setBijuuScale(1);
                        PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage((EntityPlayer)entityplayermp), entityplayermp);
                        sender.addChatMessage((IChatComponent)new ChatComponentText(entityplayermp.getDisplayName() + " is now the Jinchuuriki of Kurama."));
                      } 
                    } else {
                      props.setBijuuKind(8);
                      PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage((EntityPlayer)entityplayermp), entityplayermp);
                      props.setBijuuScale(1);
                      PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage((EntityPlayer)entityplayermp), entityplayermp);
                      sender.addChatMessage((IChatComponent)new ChatComponentText(entityplayermp.getDisplayName() + " is now the Jinchuuriki of Gyuki."));
                    } 
                  } else {
                    props.setBijuuKind(7);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage((EntityPlayer)entityplayermp), entityplayermp);
                    props.setBijuuScale(1);
                    PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage((EntityPlayer)entityplayermp), entityplayermp);
                    sender.addChatMessage((IChatComponent)new ChatComponentText(entityplayermp.getDisplayName() + " is now the Jinchuuriki of Chomei."));
                  } 
                } else {
                  props.setBijuuKind(6);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage((EntityPlayer)entityplayermp), entityplayermp);
                  props.setBijuuScale(1);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage((EntityPlayer)entityplayermp), entityplayermp);
                  sender.addChatMessage((IChatComponent)new ChatComponentText(entityplayermp.getDisplayName() + " is now the Jinchuuriki of Saiken."));
                } 
              } else {
                props.setBijuuKind(5);
                PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage((EntityPlayer)entityplayermp), entityplayermp);
                props.setBijuuScale(1);
                PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage((EntityPlayer)entityplayermp), entityplayermp);
                sender.addChatMessage((IChatComponent)new ChatComponentText(entityplayermp.getDisplayName() + " is now the Jinchuuriki of Kokuo."));
              } 
            } else {
              props.setBijuuKind(4);
              PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage((EntityPlayer)entityplayermp), entityplayermp);
              props.setBijuuScale(1);
              PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage((EntityPlayer)entityplayermp), entityplayermp);
              sender.addChatMessage((IChatComponent)new ChatComponentText(entityplayermp.getDisplayName() + " is now the Jinchuuriki of Son Goku."));
            } 
          } else {
            props.setBijuuKind(3);
            PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage((EntityPlayer)entityplayermp), entityplayermp);
            props.setBijuuScale(1);
            PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage((EntityPlayer)entityplayermp), entityplayermp);
            sender.addChatMessage((IChatComponent)new ChatComponentText(entityplayermp.getDisplayName() + " is now the Jinchuuriki of Isobu."));
          } 
        } else {
          props.setBijuuKind(2);
          PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage((EntityPlayer)entityplayermp), entityplayermp);
          props.setBijuuScale(1);
          PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage((EntityPlayer)entityplayermp), entityplayermp);
          sender.addChatMessage((IChatComponent)new ChatComponentText(entityplayermp.getDisplayName() + " is now the Jinchuuriki of Matatabi."));
        } 
      } else {
        props.setBijuuKind(1);
        PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage((EntityPlayer)entityplayermp), entityplayermp);
        props.setBijuuScale(1);
        PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage((EntityPlayer)entityplayermp), entityplayermp);
        sender.addChatMessage((IChatComponent)new ChatComponentText(entityplayermp.getDisplayName() + " is now the Jinchuuriki of Shukaku."));
      } 
    } else {
      if (args.length < 2)
        throw new WrongUsageException("Not enough arguments.", new Object[0]); 
      if (args.length > 2)
        throw new WrongUsageException("Too much arguments.", new Object[0]); 
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    return (args.length == 1) ? getListOfStringsMatchingLastWord(args, new String[] { "Shukaku", "Matatabi", "Isobu", "SonGoku", "Kokuo", "Saiken", "Chomei", "Gyuki", "Kurama", "Juubi" }) : ((args.length == 2) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null);
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

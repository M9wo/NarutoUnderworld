package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncByakuganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncByakuganSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncDrunkenFistMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncEarthReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncFireReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncIburiMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKetsuryuganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKetsuryuganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKuramaMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncLightningReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganUnlockMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncWaterReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncWindReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncYangReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncYinReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncYinyangReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncboilReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncbyakuganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynccrystalReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncdustReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncexplosionReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynciceReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynclavaReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncmagnetReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncmangekyouSharinganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncscorchReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncsharinganiconMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncshikotsumyakuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncsteelReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncstormReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncwoodReleaseMessage;
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

public class CommandRelease extends CommandBase {
  public int getRequiredPermissionLevel() {
    return 2;
  }
  
  public String getCommandName() {
    return "kg";
  }
  
  public String getCommandUsage(ICommandSender sender) {
    return "/kg <give/take> <RELEASE/KG> [PLAYER]";
  }
  
  public void processCommand(ICommandSender sender, String[] args) {
    new NBTTagCompound();
    EntityPlayerMP entityplayermp = ((args[0].equals("give") || args[0].equals("take")) && args.length == 3) ? getPlayer(sender, args[2]) : getCommandSenderAsPlayer(sender);
    ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityplayermp);
    if (args.length >= 2 && args.length <= 3) {
      if (args[0].equals("give")) {
        if (args[1].equals("Wind")) {
          props.setWindRelease(1);
          PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Water")) {
          props.setWaterRelease(1);
          PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Earth")) {
          props.setEarthRelease(1);
          PacketDispatcher.sendTo((IMessage)new SyncEarthReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Fire")) {
          props.setFireRelease(1);
          PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Lightning")) {
          props.setLightningRelease(1);
          PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Yin")) {
          props.setYinRelease(1);
          PacketDispatcher.sendTo((IMessage)new SyncYinReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Yang")) {
          props.setYangRelease(1);
          PacketDispatcher.sendTo((IMessage)new SyncYangReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Yin-Yang")) {
          props.setYinyangRelease(1);
          PacketDispatcher.sendTo((IMessage)new SyncYinyangReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Wood")) {
          props.setwoodRelease(1);
          PacketDispatcher.sendTo((IMessage)new SyncwoodReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Lava")) {
          props.setlavaRelease(1);
          PacketDispatcher.sendTo((IMessage)new SynclavaReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Scorch")) {
          props.setscorchRelease(1);
          PacketDispatcher.sendTo((IMessage)new SyncscorchReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Boil")) {
          props.setboilRelease(1);
          PacketDispatcher.sendTo((IMessage)new SyncboilReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Magnet")) {
          props.setmagnetRelease(1);
          PacketDispatcher.sendTo((IMessage)new SyncmagnetReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Storm")) {
          props.setstormRelease(1);
          PacketDispatcher.sendTo((IMessage)new SyncstormReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Ice")) {
          props.seticeRelease(1);
          PacketDispatcher.sendTo((IMessage)new SynciceReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Explosion")) {
          props.setexplosionRelease(1);
          PacketDispatcher.sendTo((IMessage)new SyncexplosionReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Steel")) {
          props.setsteelRelease(1);
          PacketDispatcher.sendTo((IMessage)new SyncsteelReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Crystal")) {
          props.setcrystalRelease(1);
          PacketDispatcher.sendTo((IMessage)new SynccrystalReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Dust")) {
          props.setdustRelease(1);
          PacketDispatcher.sendTo((IMessage)new SyncdustReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Release to you")); 
        } else if (args[1].equals("Kurama")) {
          props.setKurama(1);
          PacketDispatcher.sendTo((IMessage)new SyncKuramaMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " KG to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " KG to you")); 
        } else if (args[1].equals("Iburi")) {
          props.setIburi(1);
          PacketDispatcher.sendTo((IMessage)new SyncIburiMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " KG to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " KG to you")); 
        } else if (args[1].equals("Shikotsumyaku")) {
          props.setshikotsumyaku(1);
          PacketDispatcher.sendTo((IMessage)new SyncshikotsumyakuMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " KG to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " KG to you")); 
        } else if (args[1].equals("Sharingan")) {
          props.setsharinganicon(1);
          PacketDispatcher.sendTo((IMessage)new SyncsharinganiconMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Dojutsu to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Dojutsu to you")); 
        } else if (args[1].equals("Byakugan")) {
          props.setbyakugan(1);
          PacketDispatcher.sendTo((IMessage)new SyncbyakuganMessage((EntityPlayer)entityplayermp), entityplayermp);
          props.setByakuganSize(1);
          PacketDispatcher.sendTo((IMessage)new SyncByakuganSizeMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Dojutsu to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Dojutsu to you")); 
        } else if (args[1].equals("Ketsuryugan")) {
          props.setKetsuryugan(1);
          PacketDispatcher.sendTo((IMessage)new SyncKetsuryuganMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Dojutsu to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Dojutsu to you")); 
        } else {
          if (!args[1].equals("DrunkenFist"))
            throw new WrongUsageException(args[1] + "is neither a KG nor a Release. Usage: /kg <give/take> <RELEASE/KG> [PLAYER]", new Object[0]); 
          props.setDrunkenFist(true);
          PacketDispatcher.sendTo((IMessage)new SyncDrunkenFistMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Technique to " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Given " + args[1] + " Technique to you")); 
        } 
      } else {
        if (!args[0].equals("take"))
          throw new WrongUsageException("Wrong argument. Usage: /kg <give/take> <RELEASE/KG> [PLAYER]", new Object[0]); 
        if (args[1].equals("Wind")) {
          props.setWindRelease(0);
          PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Water")) {
          props.setWaterRelease(0);
          PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Earth")) {
          props.setEarthRelease(0);
          PacketDispatcher.sendTo((IMessage)new SyncEarthReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Fire")) {
          props.setFireRelease(0);
          PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Lightning")) {
          props.setLightningRelease(0);
          PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Yin")) {
          props.setYinRelease(0);
          PacketDispatcher.sendTo((IMessage)new SyncYinReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Yang")) {
          props.setYangRelease(0);
          PacketDispatcher.sendTo((IMessage)new SyncYangReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Yin-Yang")) {
          props.setYinyangRelease(0);
          PacketDispatcher.sendTo((IMessage)new SyncYinyangReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Wood")) {
          props.setwoodRelease(0);
          PacketDispatcher.sendTo((IMessage)new SyncwoodReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Lava")) {
          props.setlavaRelease(0);
          PacketDispatcher.sendTo((IMessage)new SynclavaReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Scorch")) {
          props.setscorchRelease(0);
          PacketDispatcher.sendTo((IMessage)new SyncscorchReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Boil")) {
          props.setboilRelease(0);
          PacketDispatcher.sendTo((IMessage)new SyncboilReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Magnet")) {
          props.setmagnetRelease(0);
          PacketDispatcher.sendTo((IMessage)new SyncmagnetReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Storm")) {
          props.setstormRelease(0);
          PacketDispatcher.sendTo((IMessage)new SyncstormReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Ice")) {
          props.seticeRelease(0);
          PacketDispatcher.sendTo((IMessage)new SynciceReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Explosion")) {
          props.setexplosionRelease(0);
          PacketDispatcher.sendTo((IMessage)new SyncexplosionReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Steel")) {
          props.setsteelRelease(0);
          PacketDispatcher.sendTo((IMessage)new SyncsteelReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Crystal")) {
          props.setcrystalRelease(0);
          PacketDispatcher.sendTo((IMessage)new SynccrystalReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Dust")) {
          props.setdustRelease(0);
          PacketDispatcher.sendTo((IMessage)new SyncdustReleaseMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Release from you")); 
        } else if (args[1].equals("Kurama")) {
          props.setKurama(0);
          PacketDispatcher.sendTo((IMessage)new SyncKuramaMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " KG from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " KG from you")); 
        } else if (args[1].equals("Iburi")) {
          props.setIburi(0);
          PacketDispatcher.sendTo((IMessage)new SyncIburiMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " KG from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " KG from you")); 
        } else if (args[1].equals("Shikotsumyaku")) {
          props.setshikotsumyaku(0);
          PacketDispatcher.sendTo((IMessage)new SyncshikotsumyakuMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " KG from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " KG from you")); 
        } else if (args[1].equals("Sharingan")) {
          props.setsharinganicon(0);
          PacketDispatcher.sendTo((IMessage)new SyncsharinganiconMessage((EntityPlayer)entityplayermp), entityplayermp);
          props.setmangekyouSharingan(0);
          PacketDispatcher.sendTo((IMessage)new SyncmangekyouSharinganMessage((EntityPlayer)entityplayermp), entityplayermp);
          props.setSharinganActive(false);
          PacketDispatcher.sendTo((IMessage)new SyncSharinganActiveMessage((EntityPlayer)entityplayermp), entityplayermp);
          props.setSharinganSize(0.0D);
          PacketDispatcher.sendTo((IMessage)new SyncSharinganSizeMessage((EntityPlayer)entityplayermp), entityplayermp);
          props.setSharinganUnlock(0.0D);
          PacketDispatcher.sendTo((IMessage)new SyncSharinganUnlockMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Dojutsu from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Dojutsu from you")); 
        } else if (args[1].equals("Byakugan")) {
          props.setbyakugan(0);
          PacketDispatcher.sendTo((IMessage)new SyncbyakuganMessage((EntityPlayer)entityplayermp), entityplayermp);
          props.setByakuganSize(0);
          PacketDispatcher.sendTo((IMessage)new SyncByakuganSizeMessage((EntityPlayer)entityplayermp), entityplayermp);
          props.setByakuganActive(false);
          PacketDispatcher.sendTo((IMessage)new SyncByakuganActiveMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Dojutsu from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Dojutsu from you")); 
        } else if (args[1].equals("Ketsuryugan")) {
          props.setKetsuryugan(0);
          PacketDispatcher.sendTo((IMessage)new SyncKetsuryuganMessage((EntityPlayer)entityplayermp), entityplayermp);
          props.setKetsuryuganActive(false);
          PacketDispatcher.sendTo((IMessage)new SyncKetsuryuganActiveMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Dojutsu from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Dojutsu from you")); 
        } else {
          if (!args[1].equals("DrunkenFist"))
            throw new WrongUsageException(args[1] + "is neither a KG nor a Release. Usage: /kg <give/take> <RELEASE/KG> [PLAYER]", new Object[0]); 
          props.setDrunkenFist(false);
          PacketDispatcher.sendTo((IMessage)new SyncDrunkenFistMessage((EntityPlayer)entityplayermp), entityplayermp);
          if (args.length == 3)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Technique from " + entityplayermp.getDisplayName())); 
          if (args.length == 2)
            sender.addChatMessage((IChatComponent)new ChatComponentText("Taken " + args[1] + " Technique from you")); 
        } 
      } 
    } else {
      throw new WrongUsageException("Too many or not enough arguments. Usage: /kg <give/take> <RELEASE/KG> [PLAYER]", new Object[0]);
    } 
  }
  
  public List addTabCompletionOptions(ICommandSender sender, String[] args) {
    if (!args[0].equals("give") && (!args[0].equals("take") || args.length != 2))
      return (args.length == 3) ? getListOfStringsMatchingLastWord(args, getPlayers()) : null; 
    return getListOfStringsMatchingLastWord(args, new String[] { 
          "Wind", "Water", "Lightning", "Earth", "Fire", "Yin", "Yang", "Yin-Yang", "Wood", "Lava", 
          "Scorch", "Boil", "Magnet", "Storm", "Ice", "Explosion", "Steel", "Crystal", "Dust", "Kurama", 
          "Iburi", "Shikotsumyaku", "Sharingan", "Byakugan", "Ketsuryugan", "DrunkenFist" });
  }
  
  public String[] getPlayers() {
    return MinecraftServer.getServer().getAllUsernames();
  }
}

package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.GuiTest;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuBombMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuFormActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuScaleMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuSlashMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncByakuganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncByakuganSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncByakugouMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraControlMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCurseSealActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCurseSealMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncJouganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKarmaSealActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsu1Message;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsu2Message;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsu4Message;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsu5Message;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsu6Message;
import alcoholmod.Mathioks.ExtraFunctions.SyncKetsuryuganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSageActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsModeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsStateMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSusanoAMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSusanoMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynctrackAllMessage;
import alcoholmod.Mathioks.proxys.ClientProxy;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import lc208.nam.packets.SyncAbility1Message;
import lc208.nam.packets.SyncAbility2Message;
import lc208.nam.packets.SyncJumpPowerMessage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

public class KeyHandler {
  public World world;
  
  private int ManUses = 0;
  
  private int counterBijuu;
  
  private int counterBijuuSlash;
  
  private boolean Jumped = false;
  
  private final Minecraft mc = Minecraft.getMinecraft();
  
  @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
  public void onEvent(InputEvent.KeyInputEvent event) {
    KeyBinding[] keyBindings = ClientProxy.keyBindings;
    if (keyBindings[0].isPressed());
  }
  
  @SubscribeEvent
  public void onPlayerEvent(TickEvent.PlayerTickEvent event) {
    int SubstitutionCounter = 0;
    Minecraft mc = Minecraft.getMinecraft();
    int KenjutsuCounter = 0;
    EntityPlayer player = event.player;
    ExtendedPlayer props = ExtendedPlayer.get(player);
    KeyBinding[] keyBindings = ClientProxy.keyBindings;
    if (keyBindings[22].isPressed() && mc.inGameHasFocus && 
      player.ridingEntity != null && 
      player.ridingEntity instanceof lc208.nam.entity.EntityAbilityExtended)
      PacketDispatcher.sendToServer((IMessage)new SyncAbility1Message(false, player)); 
    if (keyBindings[23].isPressed() && mc.inGameHasFocus && 
      player.ridingEntity != null && 
      player.ridingEntity instanceof lc208.nam.entity.EntityAbilityExtended)
      PacketDispatcher.sendToServer((IMessage)new SyncAbility2Message(false, player)); 
    if ((Minecraft.getMinecraft()).gameSettings.keyBindJump.isPressed() && mc.inGameHasFocus && 
      player.ridingEntity != null && 
      player.ridingEntity instanceof alcoholmod.Mathioks.Final.Summons.Entity.SummonGamabuntaEntity)
      PacketDispatcher.sendToServer((IMessage)new SyncJumpPowerMessage(3)); 
    if (props.getChakraControl() && mc.inGameHasFocus) {
      if (Keyboard.isKeyDown(57) && !player.onGround && player.motionY < 0.07D + ExtendedPlayer.get((EntityPlayer)mc.thePlayer).getSpeed() * 2.0D - 0.2D && !this.Jumped && !player.capabilities.isCreativeMode) {
        player.motionY += 0.5D + ExtendedPlayer.get((EntityPlayer)mc.thePlayer).getSpeed() * 2.0D - 0.2D;
        this.Jumped = true;
      } 
      if (player.onGround && this.Jumped)
        this.Jumped = false; 
    } 
    if (keyBindings[1].isPressed() && mc.inGameHasFocus)
      if (props.getBijuuScale() >= 2 && props.getBijuuScale() != 15) {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "You are in Tailed beast Mode!"));
      } else if (props.getsharinganicon() == 1 && props.getSharingan() >= 1) {
        if (props.getSharinganSize() == 0.0D)
          if (!props.getSharinganActive()) {
            props.setSharinganActive(true);
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Sharingan!"));
            PacketDispatcher.sendToServer((IMessage)new SyncSharinganActiveMessage(player));
          } else if (props.getSharinganActive()) {
            props.setSharinganActive(false);
            PacketDispatcher.sendToServer((IMessage)new SyncSharinganActiveMessage(player));
            if (props.getSusanoA()) {
              props.setSusanoActive(0);
              PacketDispatcher.sendToServer((IMessage)new SyncSusanoMessage(player));
              props.setSusanoA(false);
              PacketDispatcher.sendToServer((IMessage)new SyncSusanoAMessage(player));
            } 
          }  
        if (props.getSharinganSize() == 1.0D)
          if (Keyboard.isKeyDown(42)) {
            if (props.getSharingan() != 3 && props.getSharingan() != 102) {
              if (props.getSharingan() >= 4)
                if (props.getmangekyouSharingan() == 50) {
                  props.setSharingan(102);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } else {
                  props.setSharingan(3);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                }  
            } else {
              if (props.getmangekyouSharingan() == 1) {
                props.setSharingan(48);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 2) {
                props.setSharingan(35);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 3) {
                props.setSharingan(4);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 4) {
                props.setSharingan(7);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 5) {
                props.setSharingan(10);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 6) {
                props.setSharingan(13);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 7) {
                props.setSharingan(18);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 8) {
                props.setSharingan(24);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 9) {
                props.setSharingan(20);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 10) {
                props.setSharingan(16);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 11) {
                props.setSharingan(26);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 12) {
                props.setSharingan(28);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 13) {
                props.setSharingan(30);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 14) {
                props.setSharingan(0);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 15) {
                props.setSharingan(22);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 16) {
                props.setSharingan(32);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 17) {
                props.setSharingan(35);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 20) {
                props.setSharingan(60);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 21) {
                props.setSharingan(62);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 22) {
                props.setSharingan(64);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 23) {
                props.setSharingan(66);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 24) {
                props.setSharingan(68);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 25) {
                props.setSharingan(70);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 26) {
                props.setSharingan(72);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 27) {
                props.setSharingan(74);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 28) {
                props.setSharingan(76);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 29) {
                props.setSharingan(78);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 30) {
                props.setSharingan(80);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 31) {
                props.setSharingan(82);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 32) {
                props.setSharingan(84);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 33) {
                props.setSharingan(86);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 34) {
                props.setSharingan(88);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 35) {
                props.setSharingan(90);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 36) {
                props.setSharingan(92);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 50) {
                props.setSharingan(103);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              this.ManUses++;
              if (this.ManUses == 10) {
                this.ManUses = 0;
                player.addPotionEffect(new PotionEffect(Potion.blindness.id, 200, 2));
              } 
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mangekyou Sharingan!"));
            } 
          } else if (props.getSharinganActive()) {
            if (props.getSharinganActive()) {
              props.setSharinganActive(false);
              PacketDispatcher.sendToServer((IMessage)new SyncSharinganActiveMessage(player));
              if (props.getSusanoA()) {
                props.setSusanoActive(0);
                PacketDispatcher.sendToServer((IMessage)new SyncSusanoMessage(player));
                props.setSusanoA(false);
                PacketDispatcher.sendToServer((IMessage)new SyncSusanoAMessage(player));
              } 
            } 
          } else {
            props.setSharinganActive(true);
            if (props.getSharingan() != 3 && props.getSharingan() != 102) {
              this.ManUses++;
              if (this.ManUses == 10) {
                this.ManUses = 0;
                player.addPotionEffect(new PotionEffect(Potion.blindness.id, 200, 2));
              } 
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mangekyou Sharingan!"));
            } else {
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Sharingan!"));
            } 
            PacketDispatcher.sendToServer((IMessage)new SyncSharinganActiveMessage(player));
          }  
        if (props.getSharinganSize() == 2.0D)
          if (Keyboard.isKeyDown(42)) {
            if (props.getSharingan() != 3 && props.getSharingan() != 102) {
              if (props.getSharingan() >= 5)
                if (props.getmangekyouSharingan() == 50) {
                  props.setSharingan(102);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } else {
                  props.setSharingan(3);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                }  
            } else {
              if (props.getmangekyouSharingan() == 1) {
                props.setSharingan(49);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 2) {
                props.setSharingan(36);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 3) {
                props.setSharingan(5);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 4) {
                props.setSharingan(8);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 5) {
                props.setSharingan(11);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 6) {
                props.setSharingan(14);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 7) {
                props.setSharingan(19);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 8) {
                props.setSharingan(25);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 9) {
                props.setSharingan(21);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 10) {
                props.setSharingan(17);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 11) {
                props.setSharingan(27);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 12) {
                props.setSharingan(29);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 13) {
                props.setSharingan(31);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 14) {
                props.setSharingan(0);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 15) {
                props.setSharingan(23);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 16) {
                props.setSharingan(33);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 17) {
                props.setSharingan(36);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 20) {
                props.setSharingan(61);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 21) {
                props.setSharingan(63);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 22) {
                props.setSharingan(65);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 23) {
                props.setSharingan(67);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 24) {
                props.setSharingan(69);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 25) {
                props.setSharingan(71);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 26) {
                props.setSharingan(73);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 27) {
                props.setSharingan(75);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 28) {
                props.setSharingan(77);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 29) {
                props.setSharingan(79);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 30) {
                props.setSharingan(81);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 31) {
                props.setSharingan(83);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 32) {
                props.setSharingan(85);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 33) {
                props.setSharingan(87);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 34) {
                props.setSharingan(89);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 35) {
                props.setSharingan(91);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 36) {
                props.setSharingan(93);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              if (props.getmangekyouSharingan() == 50) {
                props.setSharingan(104);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Eternal Mangekyou Sharingan!"));
            } 
          } else if (props.getSharinganActive()) {
            if (props.getSharinganActive()) {
              props.setSharinganActive(false);
              PacketDispatcher.sendToServer((IMessage)new SyncSharinganActiveMessage(player));
              if (props.getSusanoA()) {
                props.setSusanoActive(0);
                PacketDispatcher.sendToServer((IMessage)new SyncSusanoMessage(player));
                props.setSusanoA(false);
                PacketDispatcher.sendToServer((IMessage)new SyncSusanoAMessage(player));
              } 
            } 
          } else {
            props.setSharinganActive(true);
            if (props.getSharingan() != 3 && props.getSharingan() != 102) {
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Eternal Mangekyou Sharingan!"));
            } else {
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Sharingan!"));
            } 
            PacketDispatcher.sendToServer((IMessage)new SyncSharinganActiveMessage(player));
          }  
        if (props.getSharinganSize() == 3.0D)
          if (Keyboard.isKeyDown(42)) {
            if (props.getSharingan() != 150 && props.getSharingan() != 151) {
              if (props.getSharingan() != 17 && props.getSharingan() != 19) {
                if (props.getSharingan() == 3) {
                  if (props.getmangekyouSharingan() == 7) {
                    props.setSharingan(19);
                    PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                  } 
                  if (props.getmangekyouSharingan() == 10) {
                    props.setSharingan(17);
                    PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                  } 
                  player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Eternal Mangekyou Sharingan!"));
                } else if (props.getSharingan() >= 152 || props.getSharingan() == 3) {
                  if (props.getmangekyouSharingan() == 50) {
                    props.setSharingan(151);
                  } else if (props.getmangekyouSharingan() != 7 && props.getmangekyouSharingan() != 10) {
                    props.setSharingan(150);
                  } else {
                    props.setSharingan(3);
                  } 
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                  if (props.getSusanoA()) {
                    props.setSusanoActive(0);
                    PacketDispatcher.sendToServer((IMessage)new SyncSusanoMessage(player));
                    props.setSusanoA(false);
                    PacketDispatcher.sendToServer((IMessage)new SyncSusanoAMessage(player));
                  } 
                } 
              } else if (Keyboard.isKeyDown(56)) {
                if (props.getmangekyouSharingan() == 7) {
                  props.setSharingan(161);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                if (props.getmangekyouSharingan() == 10) {
                  props.setSharingan(165);
                  PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
                } 
                player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Rinnegan!"));
              } 
            } else {
              if (props.getmangekyouSharingan() == 1) {
                props.setSharingan(50);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 2) {
                props.setSharingan(170);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 3) {
                props.setSharingan(174);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 4) {
                props.setSharingan(160);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 5) {
                props.setSharingan(176);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 6) {
                props.setSharingan(171);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 8) {
                props.setSharingan(169);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 9) {
                props.setSharingan(159);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 11) {
                props.setSharingan(152);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 12) {
                props.setSharingan(172);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 13) {
                props.setSharingan(168);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 14) {
                props.setSharingan(0);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 15) {
                props.setSharingan(175);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 16) {
                props.setSharingan(173);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 17) {
                props.setSharingan(170);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 20) {
                props.setSharingan(167);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 21) {
                props.setSharingan(156);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 22) {
                props.setSharingan(155);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 23) {
                props.setSharingan(166);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 24) {
                props.setSharingan(154);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 25) {
                props.setSharingan(157);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 26) {
                props.setSharingan(158);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 27) {
                props.setSharingan(162);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 28) {
                props.setSharingan(163);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 29) {
                props.setSharingan(164);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 30) {
                props.setSharingan(177);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 31) {
                props.setSharingan(178);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 32) {
                props.setSharingan(179);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 33) {
                props.setSharingan(180);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 34) {
                props.setSharingan(181);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 35) {
                props.setSharingan(182);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 36) {
                props.setSharingan(183);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } else if (props.getmangekyouSharingan() == 50) {
                props.setSharingan(153);
                PacketDispatcher.sendToServer((IMessage)new SyncSharinganMessage(player));
              } 
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Eternal Mangekyou Sharingan!"));
            } 
          } else if (!props.getSharinganActive()) {
            props.setSharinganActive(true);
            if (props.getSharingan() != 3 && props.getSharingan() != 150 && props.getSharingan() != 151) {
              if (props.getSharingan() != 161 && props.getSharingan() != 165 && props.getSharingan() != 50) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Eternal Mangekyou Sharingan!"));
              } else {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Rinnegan!"));
              } 
            } else {
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Sharingan!"));
            } 
            PacketDispatcher.sendToServer((IMessage)new SyncSharinganActiveMessage(player));
          } else if (props.getSharinganActive()) {
            props.setSharinganActive(false);
            PacketDispatcher.sendToServer((IMessage)new SyncSharinganActiveMessage(player));
            if (props.getSusanoA()) {
              props.setSusanoActive(0);
              PacketDispatcher.sendToServer((IMessage)new SyncSusanoMessage(player));
              props.setSusanoA(false);
              PacketDispatcher.sendToServer((IMessage)new SyncSusanoAMessage(player));
            } 
          }  
      }  
    if (KenjutsuCounter > 0)
      KenjutsuCounter--; 
    if (SubstitutionCounter > 0)
      SubstitutionCounter--; 
    if (this.counterBijuu > 0)
      this.counterBijuu--; 
    if (keyBindings[10].isPressed() && mc.inGameHasFocus && this.counterBijuu == 0) {
      if (event.player.posX >= 8787.7626D && event.player.posX <= 9258.59667D && event.player.posZ >= 10173.88296D && event.player.posZ <= 10590.44079D) {
        event.player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_RED + "Вы не можете использовать техники на спавне"));
      } else {
        PacketDispatcher.sendToServer((IMessage)new SyncBijuuBombMessage(true, player));
      } 
      this.counterBijuu = 6000;
    } 
    if (keyBindings[2].isPressed() && mc.inGameHasFocus)
      if (props.getBijuuScale() >= 2 && props.getBijuuScale() != 15) {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "You are in Tailed beast Mode!"));
      } else if (props.getbyakugan() >= 1) {
        if (props.getByakuganSize() == 1) {
          if (!props.getByakuganActive()) {
            props.setByakuganActive(true);
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "Byakugan!"));
            PacketDispatcher.sendToServer((IMessage)new SyncByakuganActiveMessage(player));
            props.settrackAll(true);
            PacketDispatcher.sendToServer((IMessage)new SynctrackAllMessage(player));
          } else {
            props.setByakuganActive(false);
            PacketDispatcher.sendToServer((IMessage)new SyncByakuganActiveMessage(player));
            props.settrackAll(false);
            PacketDispatcher.sendToServer((IMessage)new SynctrackAllMessage(player));
          } 
        } else if (props.getByakuganSize() == 2) {
          if (!props.getByakuganActive()) {
            props.setByakuganActive(true);
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Tenseigan!"));
            PacketDispatcher.sendToServer((IMessage)new SyncByakuganActiveMessage(player));
            props.settrackAll(true);
            PacketDispatcher.sendToServer((IMessage)new SynctrackAllMessage(player));
          } else if (Keyboard.isKeyDown(42)) {
            props.setByakuganSize(3);
            PacketDispatcher.sendToServer((IMessage)new SyncByakuganSizeMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "" + EnumChatFormatting.BOLD + "Tenseigan Chakra Mode!"));
          } else {
            props.setByakuganActive(false);
            PacketDispatcher.sendToServer((IMessage)new SyncByakuganActiveMessage(player));
            props.settrackAll(false);
            PacketDispatcher.sendToServer((IMessage)new SynctrackAllMessage(player));
          } 
        } else if (props.getByakuganSize() == 3) {
          if (!props.getByakuganActive()) {
            props.setByakuganSize(2);
            PacketDispatcher.sendToServer((IMessage)new SyncByakuganSizeMessage(player));
            props.setByakuganActive(true);
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Tenseigan!"));
            PacketDispatcher.sendToServer((IMessage)new SyncByakuganActiveMessage(player));
            props.settrackAll(true);
            PacketDispatcher.sendToServer((IMessage)new SynctrackAllMessage(player));
          } else {
            props.setByakuganActive(false);
            PacketDispatcher.sendToServer((IMessage)new SyncByakuganActiveMessage(player));
            props.settrackAll(false);
            PacketDispatcher.sendToServer((IMessage)new SynctrackAllMessage(player));
            props.setByakuganSize(2);
            PacketDispatcher.sendToServer((IMessage)new SyncByakuganSizeMessage(player));
          } 
        } 
      }  
    if (keyBindings[3].isPressed() && mc.inGameHasFocus)
      if (props.getIzanagi() != 1) {
        if (props.getsharinganicon() == 1 && props.getSharinganActive() && props.getmangekyouSharingan() >= 1) {
          if (props.getSusanoActive() == 0) {
            if (props.getSusanoSize() >= 1 && !Keyboard.isKeyDown(42)) {
              props.setSusanoActive(1);
              PacketDispatcher.sendToServer((IMessage)new SyncSusanoMessage(player));
              props.setSusanoA(true);
              PacketDispatcher.sendToServer((IMessage)new SyncSusanoAMessage(player));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Susano'o Cage!!"));
            } 
          } else if (props.getSusanoActive() == 1) {
            if (props.getSusanoSize() >= 2 && !Keyboard.isKeyDown(42)) {
              props.setSusanoActive(2);
              PacketDispatcher.sendToServer((IMessage)new SyncSusanoMessage(player));
              props.setSusanoA(true);
              PacketDispatcher.sendToServer((IMessage)new SyncSusanoAMessage(player));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Susano'o Skeleton!!"));
            } 
          } else if (props.getSusanoActive() == 2) {
            if (props.getSusanoSize() >= 3 && !Keyboard.isKeyDown(42)) {
              props.setSusanoActive(3);
              PacketDispatcher.sendToServer((IMessage)new SyncSusanoMessage(player));
              props.setSusanoA(true);
              PacketDispatcher.sendToServer((IMessage)new SyncSusanoAMessage(player));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Complete Susano'o!!"));
            } 
          } else if (props.getSusanoActive() == 3 && props.getSusanoSize() >= 4 && !Keyboard.isKeyDown(42)) {
            props.setSusanoActive(4);
            PacketDispatcher.sendToServer((IMessage)new SyncSusanoMessage(player));
            props.setSusanoA(true);
            PacketDispatcher.sendToServer((IMessage)new SyncSusanoAMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Susano'o Armor!!"));
          } 
          if (Keyboard.isKeyDown(42) && props.getSusanoA()) {
            if ((props.getSharinganActive() && props.getSusanoTransformed() && props.getSusanoActive() == 5 && (props.getSharingan() == 5 || props.getSharingan() == 6 || props.getSharingan() == 4)) || (props.getBijuuKind() == 7 && props.getSize() == 4.0D))
              player.capabilities.allowFlying = false; 
            props.setSusanoActive(0);
            PacketDispatcher.sendToServer((IMessage)new SyncSusanoMessage(player));
            props.setSusanoA(false);
            PacketDispatcher.sendToServer((IMessage)new SyncSusanoAMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Susano'o Deactivate"));
          } 
        } 
      } else {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Your Sharingan needs to recover from Izanagi"));
      }  
    if (keyBindings[7].isPressed() && mc.inGameHasFocus) {
      System.out.println(props.isNekomode());
      if (!props.getChakraControl()) {
        props.setChakraControl(true);
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Activate Chakra Control"));
        PacketDispatcher.sendToServer((IMessage)new SyncChakraControlMessage(player));
      } else if (props.getChakraControl()) {
        props.setChakraControl(false);
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "De-Activate Chakra Control"));
        PacketDispatcher.sendToServer((IMessage)new SyncChakraControlMessage(player));
      } 
    } 
    if (keyBindings[8].isPressed() && mc.inGameHasFocus && props.getCurrentSenjutsu() > 0)
      if (props.getBijuuScale() >= 2 && props.getBijuuScale() != 15) {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "You are in Tailed beast Mode!"));
      } else {
        if (props.getCurseSeal() == 1) {
          if (props.getCurseSize() >= 1) {
            props.setCurseSeal(2);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            props.setCurseSealActive(true);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Stage 1"));
          } 
        } else if (props.getCurseSeal() == 2) {
          if (props.getCurseSize() >= 2) {
            props.setCurseSeal(3);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Stage 2"));
            if (Keyboard.isKeyDown(42)) {
              props.setCurseSeal(1);
              PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
              props.setCurseSealActive(false);
              PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
            } 
          } else if (Keyboard.isKeyDown(42)) {
            props.setCurseSeal(1);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            props.setCurseSealActive(false);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
          } 
        } else if (props.getCurseSeal() == 3 && Keyboard.isKeyDown(42)) {
          props.setCurseSeal(1);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
          props.setCurseSealActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
        } 
        if (props.getCurseSeal() == 4) {
          if (props.getCurseSize() >= 1) {
            props.setCurseSeal(5);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            props.setCurseSealActive(true);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Stage 1"));
          } 
        } else if (props.getCurseSeal() == 5) {
          if (props.getCurseSize() >= 2) {
            props.setCurseSeal(6);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Stage 2"));
            if (Keyboard.isKeyDown(42)) {
              props.setCurseSeal(4);
              PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
              props.setCurseSealActive(false);
              PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
            } 
          } else if (Keyboard.isKeyDown(42)) {
            props.setCurseSeal(4);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            props.setCurseSealActive(false);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
          } 
        } else if (props.getCurseSeal() == 6 && Keyboard.isKeyDown(42)) {
          props.setCurseSeal(4);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
          props.setCurseSealActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
        } 
        if (props.getCurseSeal() == 7) {
          if (props.getCurseSize() >= 1) {
            props.setCurseSeal(8);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            props.setCurseSealActive(true);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Stage 1"));
          } 
        } else if (props.getCurseSeal() == 8) {
          if (props.getCurseSize() >= 2) {
            props.setCurseSeal(9);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Stage 2"));
            if (Keyboard.isKeyDown(42)) {
              props.setCurseSeal(7);
              PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
              props.setCurseSealActive(false);
              PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
            } 
          } else if (Keyboard.isKeyDown(42)) {
            props.setCurseSeal(7);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            props.setCurseSealActive(false);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
          } 
        } else if (props.getCurseSeal() == 9 && Keyboard.isKeyDown(42)) {
          props.setCurseSeal(7);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
          props.setCurseSealActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
        } 
        if (props.getCurseSeal() == 10) {
          if (props.getCurseSize() >= 1) {
            props.setCurseSeal(11);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            props.setCurseSealActive(true);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Stage 1"));
          } 
        } else if (props.getCurseSeal() == 11) {
          if (props.getCurseSize() >= 2) {
            props.setCurseSeal(12);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Stage 2"));
            if (Keyboard.isKeyDown(42)) {
              props.setCurseSeal(10);
              PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
              props.setCurseSealActive(false);
              PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
            } 
          } else if (Keyboard.isKeyDown(42)) {
            props.setCurseSeal(10);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            props.setCurseSealActive(false);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
          } 
        } else if (props.getCurseSeal() == 12 && Keyboard.isKeyDown(42)) {
          props.setCurseSeal(10);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
          props.setCurseSealActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
        } 
        if (props.getCurseSeal() == 13) {
          if (props.getCurseSize() >= 1) {
            props.setCurseSeal(14);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            props.setCurseSealActive(true);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Stage 1"));
          } 
        } else if (props.getCurseSeal() == 14) {
          if (props.getCurseSize() >= 2) {
            props.setCurseSeal(15);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Stage 2"));
            if (Keyboard.isKeyDown(42)) {
              props.setCurseSeal(13);
              PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
              props.setCurseSealActive(false);
              PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
            } 
          } else if (Keyboard.isKeyDown(42)) {
            props.setCurseSeal(13);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            props.setCurseSealActive(false);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
          } 
        } else if (props.getCurseSeal() == 15 && Keyboard.isKeyDown(42)) {
          props.setCurseSeal(13);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
          props.setCurseSealActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
        } 
        if (props.getCurseSeal() == 16) {
          if (props.getCurseSize() >= 1) {
            props.setCurseSeal(17);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            props.setCurseSealActive(true);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Stage 1"));
          } 
        } else if (props.getCurseSeal() == 17) {
          if (props.getCurseSize() >= 2) {
            props.setCurseSeal(18);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Stage 2"));
            if (Keyboard.isKeyDown(42)) {
              props.setCurseSeal(16);
              PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
              props.setCurseSealActive(false);
              PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
              player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
            } 
          } else if (Keyboard.isKeyDown(42)) {
            props.setCurseSeal(16);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
            props.setCurseSealActive(false);
            PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
          } 
        } else if (props.getCurseSeal() == 18 && Keyboard.isKeyDown(42)) {
          props.setCurseSeal(16);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
          props.setCurseSealActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Curse Seal Deactivate"));
        } 
      }  
    if (keyBindings[9].isPressed() && mc.inGameHasFocus)
      if (props.getBijuuScale() == 1) {
        if (props.getSize() >= 1.0D) {
          props.setBijuuScale(2);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
          props.setBijuuFormActive(true);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Bijuu Chakra Transformation"));
        } 
        if (Keyboard.isKeyDown(42)) {
          props.setBijuuScale(1);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
          props.setBijuuFormActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Bijuu Deactivate"));
        } 
      } else if (props.getBijuuScale() == 2) {
        if (props.getSize() >= 2.0D) {
          props.setBijuuScale(3);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
          props.setBijuuFormActive(true);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Bijuu Chakra Transformation"));
        } 
        if (Keyboard.isKeyDown(42)) {
          props.setBijuuScale(1);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
          props.setBijuuFormActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Bijuu Deactivate"));
        } 
      } else if (props.getBijuuScale() == 3) {
        if (props.getSize() >= 3.0D) {
          props.setBijuuScale(4);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
          props.setBijuuFormActive(true);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Bijuu Transformation"));
        } 
        if (Keyboard.isKeyDown(42)) {
          props.setBijuuScale(1);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
          props.setBijuuFormActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Bijuu Deactivate"));
        } 
      } else if (props.getBijuuScale() == 4) {
        if (props.getSize() >= 4.0D)
          if (props.BijuuKind == 1) {
            props.setBijuuScale(5);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
            props.setBijuuFormActive(true);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Shukaku: Let's go!"));
          } else if (props.BijuuKind == 2) {
            props.setBijuuScale(6);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
            props.setBijuuFormActive(true);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Matatabi: Let's go!"));
          } else if (props.BijuuKind == 3) {
            props.setBijuuScale(7);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
            props.setBijuuFormActive(true);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Isobu: Let's go!"));
          } else if (props.BijuuKind == 4) {
            props.setBijuuScale(8);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
            props.setBijuuFormActive(true);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Son Goku: Let's go!"));
          } else if (props.BijuuKind == 5) {
            props.setBijuuScale(9);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
            props.setBijuuFormActive(true);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Kokuo: Let's go!"));
          } else if (props.BijuuKind == 6) {
            props.setBijuuScale(10);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
            props.setBijuuFormActive(true);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Saiken: Let's go!"));
          } else if (props.BijuuKind == 7) {
            props.setBijuuScale(11);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
            props.setBijuuFormActive(true);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Chomei: Let's go!"));
          } else if (props.BijuuKind == 8) {
            props.setBijuuScale(12);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
            props.setBijuuFormActive(true);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Gyuki: Let's go!"));
          } else if (props.BijuuKind == 9) {
            props.setBijuuScale(13);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
            props.setBijuuFormActive(true);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Kurama: Let's go!"));
          } else if (props.BijuuKind == 10) {
            props.setBijuuScale(14);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
            props.setBijuuFormActive(true);
            PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Ten Tails"));
          }  
        if (Keyboard.isKeyDown(42)) {
          props.setBijuuScale(1);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
          props.setBijuuFormActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
          props.setBijuuScale(2);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
          props.setBijuuFormActive(true);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
          props.setBijuuScale(1);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
          props.setBijuuFormActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Bijuu Deactivate"));
        } 
      } else if (props.getBijuuScale() >= 5) {
        if (props.getBijuuScale() == 14) {
          props.setBijuuScale(15);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
          props.setBijuuFormActive(true);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
        } else if (props.getBijuuScale() == 15) {
          props.setBijuuScale(14);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
          props.setBijuuFormActive(true);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Ten Tails"));
        } 
        if (Keyboard.isKeyDown(42)) {
          props.setBijuuScale(1);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
          props.setBijuuFormActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
          props.setBijuuScale(2);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
          props.setBijuuFormActive(true);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
          props.setBijuuScale(1);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
          props.setBijuuFormActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Bijuu Deactivate"));
        } 
      }  
    ItemStack heldItem = player.getCurrentEquippedItem();
    if (this.counterBijuuSlash > 0)
      this.counterBijuuSlash--; 
    if (heldItem == null && mc.inGameHasFocus && props.getBijuuScale() >= 5 && keyBindings[16].isPressed() && this.counterBijuuSlash == 0) {
      PacketDispatcher.sendToServer((IMessage)new SyncBijuuSlashMessage(true, player));
      this.counterBijuuSlash = 200;
    } 
    if (heldItem != null && mc.inGameHasFocus)
      if (!Keyboard.isKeyDown(42)) {
        if (props.KenjutsuSkills >= 1) {
          if (keyBindings[11].isPressed() && heldItem.getItem() instanceof net.minecraft.item.ItemSword && KenjutsuCounter == 0) {
            PacketDispatcher.sendToServer((IMessage)new SyncKenjutsu2Message(true, player));
            KenjutsuCounter = 100;
          } 
          if (props.KenjutsuSkills >= 3 && props.KenjutsuSkills >= 5 && keyBindings[13].isPressed() && heldItem.getItem() instanceof net.minecraft.item.ItemSword)
            if (props.getCurrentMana() >= 20) {
              PacketDispatcher.sendToServer((IMessage)new SyncKenjutsu5Message(true, player));
            } else {
              player.addChatMessage((IChatComponent)new ChatComponentText("You do not have enough Chakra, 20 Needed"));
            }  
        } 
      } else if (Keyboard.isKeyDown(42) && props.KenjutsuSkills >= 2) {
        if (keyBindings[11].isPressed() && heldItem.getItem() instanceof net.minecraft.item.ItemSword && KenjutsuCounter == 0) {
          PacketDispatcher.sendToServer((IMessage)new SyncKenjutsu1Message(true, player));
          KenjutsuCounter = 100;
        } 
        if (props.KenjutsuSkills >= 4) {
          if (keyBindings[12].isPressed() && heldItem.getItem() instanceof net.minecraft.item.ItemSword && KenjutsuCounter == 0) {
            PacketDispatcher.sendToServer((IMessage)new SyncKenjutsu6Message(true, player));
            KenjutsuCounter = 100;
          } 
          if (props.KenjutsuSkills >= 6 && keyBindings[13].isPressed() && heldItem.getItem() instanceof net.minecraft.item.ItemSword)
            if (props.getCurrentMana() >= 40) {
              PacketDispatcher.sendToServer((IMessage)new SyncKenjutsu4Message(true, player));
            } else {
              player.addChatMessage((IChatComponent)new ChatComponentText("You do not have enough Chakra, 40 Needed"));
            }  
        } 
      }  
    if (keyBindings[14].isPressed() && mc.inGameHasFocus)
      if (props.getBijuuScale() >= 2 && props.getBijuuScale() != 15 && props.getBijuuScale() != 15) {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "You are in Tailed Beast mode!"));
      } else if (props.getKetsuryugan() == 1) {
        if (!props.getKetsuryuganActive()) {
          props.setKetsuryuganActive(true);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_RED + "Ketsuryugan!"));
          PacketDispatcher.sendToServer((IMessage)new SyncKetsuryuganActiveMessage(player));
        } else if (props.getKetsuryuganActive()) {
          props.setKetsuryuganActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncKetsuryuganActiveMessage(player));
        } 
      }  
    if (keyBindings[15].isPressed() && mc.inGameHasFocus && (props.getBijuuScale() < 2 || props.getBijuuScale() == 15) && props.getSageVersion() >= 1 && props.getCurrentSenjutsu() > 0)
      if (!props.getSageActive()) {
        props.setSageActive(true);
        PacketDispatcher.sendToServer((IMessage)new SyncSageActiveMessage(player));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Sage Mode Activate"));
      } else if (props.getSageActive()) {
        props.setSageActive(false);
        PacketDispatcher.sendToServer((IMessage)new SyncSageActiveMessage(player));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN + "Sage Mode De-Activate"));
      }  
    if (keyBindings[17].isPressed() && props.getByakugou() >= 1 && props.getByakugou() <= 2 && mc.inGameHasFocus && props.getHealth() >= 150)
      if (props.getMaxMana() >= 1000) {
        if (props.getByakugou() == 1) {
          props.setByakugou(2);
          PacketDispatcher.sendToServer((IMessage)new SyncByakugouMessage(player));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BLUE + "Ninja Art: Creation Rebirth!"));
        } else {
          props.setByakugou(1);
          PacketDispatcher.sendToServer((IMessage)new SyncByakugouMessage(player));
        } 
      } else {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "You must have at least 1000 Chakra to use block form."));
      }  
    if (keyBindings[18].isPressed() && mc.inGameHasFocus && props.getJougan() >= 1)
      if (!props.getJouganActive()) {
        props.setJouganActive(true);
        PacketDispatcher.sendToServer((IMessage)new SyncJouganActiveMessage(player));
        if (props.getJougan() == 1)
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "Jougan!")); 
        if (props.getJougan() == 2)
          player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Jougan!")); 
        props.settrackAll(true);
        PacketDispatcher.sendToServer((IMessage)new SynctrackAllMessage(player));
      } else {
        props.setJouganActive(false);
        PacketDispatcher.sendToServer((IMessage)new SyncJouganActiveMessage(player));
        props.settrackAll(false);
        PacketDispatcher.sendToServer((IMessage)new SynctrackAllMessage(player));
      }  
    if (keyBindings[19].isPressed() && mc.inGameHasFocus && props.getKarmaSealType() >= 1) {
      if (props.getKarmaSealSize() == 2)
        if (!props.getKarmaSealActive()) {
          props.setKarmaSealActive(true);
          PacketDispatcher.sendToServer((IMessage)new SyncKarmaSealActiveMessage(player));
          if (props.getKarmaSealType() == 1) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.BLUE + "Karma Seal Activate!"));
          } else {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Karma Seal Activate!"));
          } 
        } else {
          props.setKarmaSealActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncKarmaSealActiveMessage(player));
        }  
      if (props.getKarmaSealSize() == 1 && props.getKarmaSealActive()) {
        props.setKarmaSealActive(false);
        PacketDispatcher.sendToServer((IMessage)new SyncKarmaSealActiveMessage(player));
        player.addPotionEffect(new PotionEffect(Potion.confusion.id, 50, 0));
        player.addPotionEffect(new PotionEffect(Potion.blindness.id, 25, 0));
      } 
    } 
    if (keyBindings[20].isPressed() && mc.inGameHasFocus && props.getSixPaths())
      if (!props.getSixPathsMode()) {
        props.setSixPathsMode(true);
        PacketDispatcher.sendToServer((IMessage)new SyncSixPathsModeMessage(player));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_GRAY + "Truth-Seeking Orbs Activate!"));
      } else {
        props.setSixPathsMode(false);
        PacketDispatcher.sendToServer((IMessage)new SyncSixPathsModeMessage(player));
      }  
    if (keyBindings[21].isPressed() && mc.inGameHasFocus && props.getSixPathsSage())
      if (props.getSixPathsState()) {
        props.setSixPathsState(false);
        PacketDispatcher.sendToServer((IMessage)new SyncSixPathsStateMessage(player));
      } else {
        props.setSixPathsState(true);
        PacketDispatcher.sendToServer((IMessage)new SyncSixPathsStateMessage(player));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Six Paths Sage Mode Activated!"));
      }  
  }
  
  @SubscribeEvent
  public void OnEvent2(TickEvent event) {
    KeyBinding[] keyBindings = ClientProxy.keyBindings;
    if (keyBindings[0].getIsKeyPressed() && this.mc.inGameHasFocus)
      Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new GuiTest()); 
    if (keyBindings[1].getIsKeyPressed());
  }
}

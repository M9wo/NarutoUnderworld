package alcoholmod.Mathioks.TransformationsRealPackage;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SetPlayerHitBox;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuFormActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuScaleMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncByakuganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCurseSealActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCurseSealMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKetsuryuganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSageActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSusanoAMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSusanoMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import net.minecraft.entity.player.EntityPlayer;

public class ChakraTick {
  @SubscribeEvent
  public void playerTick(TickEvent.PlayerTickEvent event) {
    if (event.phase == TickEvent.Phase.START && !event.player.worldObj.isRemote) {
      EntityPlayer player = event.player;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (!props.getSharinganActive() && !props.getByakuganActive() && !props.getCurseSealActive() && !props.getBijuuFormActive() && !props.getKetsuryuganActive() && !props.getSageActive() && props.getDeathPossession() == 1 && !props.getJouganActive() && props.getByakugou() == 0 && props.getEightGatesStage() == 0 && props.getKarmaSealSize() == 0 && props.getSharinganSize() != 3.0D && !props.getSixPathsState() && props.getTransformed())
        props.tryTransformed(); 
      if ((props.getSharinganActive() || props.getCurseSealActive() || props.getByakuganActive() || props.getBijuuFormActive() || props.getKetsuryuganActive() || props.getSageActive() || props.getJouganActive() || props.getDeathPossession() == 2 || props.getKarmaSealSize() >= 1 || props.getByakugou() >= 1 || props.getEightGatesStage() >= 1 || props.getSixPathsState() || props.isNekomode() || (props.getSharinganSize() == 3.0D && props.getmangekyouSharingan() != 7 && props.getmangekyouSharingan() != 10)) && !props.getTransformed())
        props.setTransformed(true, event.side); 
      if (props.getSusanoA() && !props.getSusanoTransformed())
        props.setSusanoTransformed(true, event.side); 
      if (!props.getSusanoA() && props.getSusanoTransformed())
        props.setSusanoTransformed(false, event.side); 
      if (props.getCurrentMana() == 0 && props.getSharinganActive()) {
        props.setSharinganActive(false, event.side);
        PacketDispatcher.sendToServer((IMessage)new SyncSharinganActiveMessage(player));
        if (props.getSusanoA()) {
          props.setSusanoA(false);
          PacketDispatcher.sendToServer((IMessage)new SyncSusanoAMessage(player));
          props.setSusanoActive(0);
          PacketDispatcher.sendToServer((IMessage)new SyncSusanoMessage(player));
        } 
      } 
      if (props.getCurrentMana() == 0 && props.getByakuganActive()) {
        props.setByakuganActive(false, event.side);
        PacketDispatcher.sendToServer((IMessage)new SyncByakuganActiveMessage(player));
      } 
      if (props.getCurrentMana() == 0 && props.getKetsuryuganActive()) {
        props.setKetsuryuganActive(false, event.side);
        PacketDispatcher.sendToServer((IMessage)new SyncKetsuryuganActiveMessage(player));
      } 
      if (props.getCurrentSenjutsu() <= 0 && props.getCurseSealActive()) {
        props.setCurseSealActive(false);
        PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
        if (props.getCurseSeal() >= 1 && props.getCurseSeal() <= 3) {
          props.setCurseSeal(1);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
          props.setCurseSealActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
        } else if (props.getCurseSeal() >= 4 && props.getCurseSeal() <= 6) {
          props.setCurseSeal(4);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
          props.setCurseSealActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
        } else if (props.getCurseSeal() >= 7 && props.getCurseSeal() <= 9) {
          props.setCurseSeal(7);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
          props.setCurseSealActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
        } else if (props.getCurseSeal() >= 10 && props.getCurseSeal() <= 12) {
          props.setCurseSeal(10);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
          props.setCurseSealActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
        } else if (props.getCurseSeal() >= 13 && props.getCurseSeal() <= 15) {
          props.setCurseSeal(13);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
          props.setCurseSealActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
        } else if (props.getCurseSeal() >= 16 && props.getCurseSeal() <= 18) {
          props.setCurseSeal(16);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealMessage(player));
          props.setCurseSealActive(false);
          PacketDispatcher.sendToServer((IMessage)new SyncCurseSealActiveMessage(player));
        } 
      } 
      if (props.getCurrentSenjutsu() <= 0 && props.getSageActive()) {
        props.setSageActive(false);
        PacketDispatcher.sendToServer((IMessage)new SyncSageActiveMessage(player));
      } 
      if (props.getBijuuFormActive() && props.getCurrentMana() == 0) {
        props.setBijuuScale(1);
        PacketDispatcher.sendToServer((IMessage)new SyncBijuuScaleMessage(player));
        props.setBijuuFormActive(false);
        PacketDispatcher.sendToServer((IMessage)new SyncBijuuFormActiveMessage(player));
      } 
      if (event.player instanceof EntityPlayer && (!props.getTransformed() || props.getBijuuScale() < 5)) {
        player.stepHeight = 0.0F;
      } else {
        player.stepHeight = 4.0F;
      } 
      if (props.getTransformed() && props.getSusanoActive() >= 5) {
        if (player.height < 3.0F)
          PacketDispatcher.sendToServer((IMessage)new SetPlayerHitBox(player, 10.0F)); 
      } else if (props.getTransformed() && props.getBijuuScale() == 5) {
        if (player.height < 3.0F)
          PacketDispatcher.sendToServer((IMessage)new SetPlayerHitBox(player, 9.0F)); 
      } else if (props.getTransformed() && props.getBijuuScale() == 6) {
        if (player.height < 3.0F)
          PacketDispatcher.sendToServer((IMessage)new SetPlayerHitBox(player, 5.0F)); 
      } else if (props.getTransformed() && props.getBijuuScale() == 7) {
        if (player.height < 3.0F)
          PacketDispatcher.sendToServer((IMessage)new SetPlayerHitBox(player, 3.5F)); 
      } else if (props.getTransformed() && props.getBijuuScale() == 8) {
        if (player.height < 3.0F)
          PacketDispatcher.sendToServer((IMessage)new SetPlayerHitBox(player, 8.5F)); 
      } else if (props.getTransformed() && props.getBijuuScale() == 9) {
        if (player.height < 3.0F)
          PacketDispatcher.sendToServer((IMessage)new SetPlayerHitBox(player, 5.5F)); 
      } else if (props.getTransformed() && props.getBijuuScale() == 10) {
        if (player.height < 3.0F)
          PacketDispatcher.sendToServer((IMessage)new SetPlayerHitBox(player, 7.0F)); 
      } else if (props.getTransformed() && props.getBijuuScale() == 11) {
        if (player.height < 3.0F)
          PacketDispatcher.sendToServer((IMessage)new SetPlayerHitBox(player, 11.0F)); 
      } else if (props.getTransformed() && props.getBijuuScale() == 12) {
        if (player.height < 3.0F)
          PacketDispatcher.sendToServer((IMessage)new SetPlayerHitBox(player, 8.0F)); 
      } else if (props.getTransformed() && props.getBijuuScale() == 13) {
        if (player.height < 3.0F)
          PacketDispatcher.sendToServer((IMessage)new SetPlayerHitBox(player, 5.0F)); 
      } else if (props.getTransformed() && props.getBijuuScale() == 14) {
        if (player.height < 3.0F)
          PacketDispatcher.sendToServer((IMessage)new SetPlayerHitBox(player, 11.0F)); 
      } else if (!props.getBijuuFormActive() && player.height >= 3.0F) {
        PacketDispatcher.sendToServer((IMessage)new SetPlayerHitBox(player, 1.8F));
      } 
    } 
  }
}

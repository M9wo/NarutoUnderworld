package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.AddGenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.AddHealthMessage;
import alcoholmod.Mathioks.ExtraFunctions.AddKinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.AddNinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.AddSenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.AddShurikenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.AddSpeedMessage;
import alcoholmod.Mathioks.ExtraFunctions.AddSummoningMessage;
import alcoholmod.Mathioks.ExtraFunctions.AddTaijutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SetPlayerHitBox;
import alcoholmod.Mathioks.ExtraFunctions.SetPlayerHitBox2;
import alcoholmod.Mathioks.ExtraFunctions.SubtractSkillPointMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncAQuestsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncAffiliationMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncAodaFireballMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBQuestsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuBombMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuFormActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuKindMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuScaleMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuSlashMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuUnlockMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncByakuganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncByakuganSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncByakugouMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCQuestsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraControlMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncClanMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCurseSealActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCurseSealMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCurseSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncDQuestsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncDeathPossessionMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncDrunkenFistMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncEarthReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncEightGatesStageMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncFireReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncGenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncIburiMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncIntelligenceMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncIzanagiMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncJouganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncJouganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncJutsuPointsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKarmaSealActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKarmaSealSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKarmaSealTypeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsu1Message;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsu2Message;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsu3Message;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsu4Message;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsu5Message;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsu6Message;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsuSkillsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKetsuryuganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKetsuryuganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKuramaMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncLandMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncLavaChakraModeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncLevelMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncLightningReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncNinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncParticleMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncRankMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSQuestsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSSQuestsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSageActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSageModeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSageVersionMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSenChakraMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSenjutsuRealMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganUnlockMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncShurikenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsModeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsOrbsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsSageMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsShieldMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsStateMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSkillPointsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSpeedMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncStorylineMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSubstitutionMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSummoningMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSusanoAMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSusanoMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSusanoSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncTaijutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncTaijutsuModeMessage;
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
import alcoholmod.Mathioks.ExtraFunctions.SyncrinneganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncscorchReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncsharinganiconMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncshikotsumyakuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncsteelReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncstormReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynctenseiganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynctrackAllMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncwoodReleaseMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.ByakuganTrackMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncBijuuModelMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncBijuuTextureMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncBijuuTransformMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncChakraServerMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncCurseSealModelMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncCurseSealTextureMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncCurseSealTransformMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncHealthMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncSharinganTransformPropsMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncSharinganTransformServerMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncSusanoTransformMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncTransformBijuuServerMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncTransformCurseSealServerMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncTransformMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncTransformPropsMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncTransformServerMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.TransformCurseServerMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.TransformServerMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.TryTransformBijuuMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.TryTransformCurseSealMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.TryTransformServerMessage;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import java.util.Iterator;
import java.util.Set;
import lc208.nam.packets.SyncAbility1Message;
import lc208.nam.packets.SyncAbility2Message;
import lc208.nam.packets.SyncJumpPowerMessage;
import lc208.nam.packets.SyncNekoMessage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketDispatcher {
  private static int packetId = 0;
  
  public static final void registerPackets() {
    registerMessage(SyncPlayerPropsMessage.Handler.class, SyncPlayerPropsMessage.class, Side.CLIENT);
    registerMessage(SyncTransformPropsMessage.class);
    registerMessage(AddGenjutsuMessage.class);
    registerMessage(AddHealthMessage.class);
    registerMessage(AddKinjutsuMessage.class);
    registerMessage(AddNinjutsuMessage.class);
    registerMessage(AddSenjutsuMessage.class);
    registerMessage(AddShurikenjutsuMessage.class);
    registerMessage(AddSpeedMessage.class);
    registerMessage(AddSummoningMessage.class);
    registerMessage(AddTaijutsuMessage.class);
    registerMessage(SubtractSkillPointMessage.class);
    registerMessage(TrackingMessage.class);
    registerMessage(SyncChakraServerMessage.class);
    registerMessage(SyncTransformServerMessage.class);
    registerMessage(TryTransformServerMessage.class);
    registerMessage(SyncTransformMessage.class);
    registerMessage(ByakuganTrackMessage.class);
    registerMessage(SyncHealthMessage.class);
    registerMessage(SyncSpeedMessage.class);
    registerMessage(SyncKenjutsuMessage.class);
    registerMessage(SyncTaijutsuMessage.class);
    registerMessage(SyncGenjutsuMessage.class);
    registerMessage(SyncIntelligenceMessage.class);
    registerMessage(SyncKinjutsuMessage.class);
    registerMessage(SyncSageModeMessage.class);
    registerMessage(SyncClanMessage.class);
    registerMessage(SyncRankMessage.class);
    registerMessage(SyncNinjutsuMessage.class);
    registerMessage(SyncSenjutsuMessage.class);
    registerMessage(SyncWindReleaseMessage.class);
    registerMessage(SyncFireReleaseMessage.class);
    registerMessage(SyncWaterReleaseMessage.class);
    registerMessage(SyncLightningReleaseMessage.class);
    registerMessage(SyncEarthReleaseMessage.class);
    registerMessage(SyncYinReleaseMessage.class);
    registerMessage(SyncYangReleaseMessage.class);
    registerMessage(SyncYinyangReleaseMessage.class);
    registerMessage(SyncShurikenjutsuMessage.class);
    registerMessage(SyncSummoningMessage.class);
    registerMessage(SyncAffiliationMessage.class);
    registerMessage(SyncLandMessage.class);
    registerMessage(SyncDrunkenFistMessage.class);
    registerMessage(SyncTaijutsuModeMessage.class);
    registerMessage(SyncSharinganMessage.class);
    registerMessage(SyncLevelMessage.class);
    registerMessage(SyncChakraExperienceMessage.class);
    registerMessage(SyncSkillPointsMessage.class);
    registerMessage(SyncwoodReleaseMessage.class);
    registerMessage(SynclavaReleaseMessage.class);
    registerMessage(SyncscorchReleaseMessage.class);
    registerMessage(SyncboilReleaseMessage.class);
    registerMessage(SyncmagnetReleaseMessage.class);
    registerMessage(SyncstormReleaseMessage.class);
    registerMessage(SynciceReleaseMessage.class);
    registerMessage(SyncexplosionReleaseMessage.class);
    registerMessage(SyncsteelReleaseMessage.class);
    registerMessage(SynccrystalReleaseMessage.class);
    registerMessage(SyncdustReleaseMessage.class);
    registerMessage(SyncshikotsumyakuMessage.class);
    registerMessage(SyncbyakuganMessage.class);
    registerMessage(SynctenseiganMessage.class);
    registerMessage(SyncsharinganiconMessage.class);
    registerMessage(SyncmangekyouSharinganMessage.class);
    registerMessage(SyncrinneganMessage.class);
    registerMessage(SyncSharinganActiveMessage.class);
    registerMessage(SyncSharinganTransformServerMessage.class);
    registerMessage(SyncSharinganTransformPropsMessage.class);
    registerMessage(SyncByakuganActiveMessage.class);
    registerMessage(SyncSusanoMessage.class);
    registerMessage(SyncSusanoTransformMessage.class);
    registerMessage(SyncSusanoAMessage.class);
    registerMessage(SyncIzanagiMessage.class);
    registerMessage(SyncLavaChakraModeMessage.class);
    registerMessage(SyncChakraControlMessage.class);
    registerMessage(SyncDQuestsMessage.class);
    registerMessage(SyncCQuestsMessage.class);
    registerMessage(SyncBQuestsMessage.class);
    registerMessage(SyncAQuestsMessage.class);
    registerMessage(SyncSQuestsMessage.class);
    registerMessage(SyncSSQuestsMessage.class);
    registerMessage(SyncIburiMessage.class);
    registerMessage(SyncKuramaMessage.class);
    registerMessage(SyncCurseSealMessage.class);
    registerMessage(SyncCurseSealTransformMessage.class);
    registerMessage(TryTransformCurseSealMessage.class);
    registerMessage(SyncCurseSealModelMessage.class);
    registerMessage(SyncCurseSealTextureMessage.class);
    registerMessage(SyncTransformCurseSealServerMessage.class);
    registerMessage(SyncCurseSealActiveMessage.class);
    registerMessage(SyncBijuuFormActiveMessage.class);
    registerMessage(SyncBijuuTransformMessage.class);
    registerMessage(SyncBijuuModelMessage.class);
    registerMessage(SyncBijuuTextureMessage.class);
    registerMessage(SyncTransformBijuuServerMessage.class);
    registerMessage(TryTransformBijuuMessage.class);
    registerMessage(SyncBijuuScaleMessage.class);
    registerMessage(SyncSizeMessage.class);
    registerMessage(SyncJutsuPointsMessage.class);
    registerMessage(SyncBijuuKindMessage.class);
    registerMessage(SyncKenjutsuSkillsMessage.class);
    registerMessage(SetPlayerHitBox.class);
    registerMessage(SetPlayerHitBox2.class);
    registerMessage(SyncStorylineMessage.class);
    registerMessage(TransformServerMessage.class);
    registerMessage(TransformCurseServerMessage.class);
    registerMessage(SyncSubstitutionMessage.class);
    registerMessage(SyncByakuganSizeMessage.class);
    registerMessage(SyncSixPathsMessage.class);
    registerMessage(SyncChakraMessage.class);
    registerMessage(SyncBijuuBombMessage.class);
    registerMessage(SyncSenjutsuRealMessage.class);
    registerMessage(SyncKenjutsu1Message.class);
    registerMessage(SyncKenjutsu2Message.class);
    registerMessage(SyncKenjutsu3Message.class);
    registerMessage(SyncKenjutsu4Message.class);
    registerMessage(SyncKenjutsu5Message.class);
    registerMessage(SyncKenjutsu6Message.class);
    registerMessage(SynctrackAllMessage.class);
    registerMessage(SyncParticleMessage.class);
    registerMessage(SyncKetsuryuganMessage.class);
    registerMessage(SyncKetsuryuganActiveMessage.class);
    registerMessage(SyncCurseSizeMessage.class);
    registerMessage(SyncSusanoSizeMessage.class);
    registerMessage(SyncSenChakraMessage.class);
    registerMessage(SyncSageVersionMessage.class);
    registerMessage(SyncSageActiveMessage.class);
    registerMessage(SyncDeathPossessionMessage.class);
    registerMessage(SyncSharinganUnlockMessage.class);
    registerMessage(SyncBijuuUnlockMessage.class);
    registerMessage(SyncSharinganSizeMessage.class);
    registerMessage(SyncAodaFireballMessage.class);
    registerMessage(SyncBijuuSlashMessage.class);
    registerMessage(SyncEightGatesStageMessage.class);
    registerMessage(SyncByakugouMessage.class);
    registerMessage(SyncJouganMessage.class);
    registerMessage(SyncJouganActiveMessage.class);
    registerMessage(SyncKarmaSealSizeMessage.class);
    registerMessage(SyncKarmaSealTypeMessage.class);
    registerMessage(SyncKarmaSealActiveMessage.class);
    registerMessage(SyncSixPathsModeMessage.class);
    registerMessage(SyncSixPathsOrbsMessage.class);
    registerMessage(SyncSixPathsShieldMessage.class);
    registerMessage(SyncSixPathsSageMessage.class);
    registerMessage(SyncSixPathsStateMessage.class);
    registerMessage(SyncNekoMessage.class);
    registerMessage(SyncAbility1Message.class);
    registerMessage(SyncAbility2Message.class);
    registerMessage(SyncJumpPowerMessage.class);
  }
  
  private static final void registerMessage(Class handlerClass, Class messageClass, Side side) {
    packetId = ++packetId;
    dispatcher.registerMessage(handlerClass, messageClass, packetId, side);
  }
  
  private static final void registerMessage(Class clazz) {
    if (AbstractMessage.AbstractClientMessage.class.isAssignableFrom(clazz)) {
      packetId = ++packetId;
      dispatcher.registerMessage(clazz, clazz, packetId, Side.CLIENT);
    } else if (AbstractMessage.AbstractServerMessage.class.isAssignableFrom(clazz)) {
      packetId = ++packetId;
      dispatcher.registerMessage(clazz, clazz, packetId, Side.SERVER);
    } else {
      packetId = ++packetId;
      dispatcher.registerMessage(clazz, clazz, packetId, Side.CLIENT);
      dispatcher.registerMessage(clazz, clazz, packetId, Side.SERVER);
    } 
  }
  
  public static final void sendTo(IMessage message, EntityPlayerMP player) {
    dispatcher.sendTo(message, player);
  }
  
  public static void sendToAll(IMessage message) {
    dispatcher.sendToAll(message);
  }
  
  public static final void sendToAllAround(IMessage message, NetworkRegistry.TargetPoint point) {
    dispatcher.sendToAllAround(message, point);
  }
  
  public static final void sendToAllAround(IMessage message, int dimension, double x, double y, double z, double range) {
    sendToAllAround(message, new NetworkRegistry.TargetPoint(dimension, x, y, z, range));
  }
  
  public static final void sendToAllAround(IMessage message, EntityPlayer player, double range) {
    sendToAllAround(message, player.worldObj.provider.dimensionId, player.posX, player.posY, player.posZ, range);
  }
  
  public static final void sendToDimension(IMessage message, int dimensionId) {
    dispatcher.sendToDimension(message, dimensionId);
  }
  
  public static final void sendToServer(IMessage message) {
    dispatcher.sendToServer(message);
  }
  
  public static final void sendToPlayers(IMessage message, Set players) {
    Iterator<EntityPlayer> var2 = players.iterator();
    while (var2.hasNext()) {
      EntityPlayer player = var2.next();
      dispatcher.sendTo(message, (EntityPlayerMP)player);
    } 
  }
  
  private static final SimpleNetworkWrapper dispatcher = AlcoholMod.dispatcher;
}

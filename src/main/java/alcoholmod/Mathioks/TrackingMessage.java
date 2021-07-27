package alcoholmod.Mathioks;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;

public class TrackingMessage extends AbstractMessage.AbstractClientMessage {
  private boolean data;
  
  private int playerID;
  
  private int texture;
  
  private int model;
  
  private boolean sharinganActive;
  
  private int Sharingan;
  
  private boolean ByakuganActive;
  
  private int ByakuganSize;
  
  private int SusanoActive;
  
  private boolean susano;
  
  private boolean susanoa;
  
  private int CurseSeal;
  
  private boolean CurseSealTransformed;
  
  private boolean CurseSealActive;
  
  private boolean BijuuTransformed;
  
  private boolean BijuuFormActive;
  
  private int BijuuScale;
  
  private double Size;
  
  private int BijuuKind;
  
  private float height;
  
  private int Ketsuryugan;
  
  private boolean KetsuryuganActive;
  
  private boolean SageMode;
  
  private int SageVersion;
  
  private boolean SageActive;
  
  private int DeathPossession;
  
  private double SharinganSize;
  
  private int EightGatesStage;
  
  private int Byakugou;
  
  private int Jougan;
  
  private boolean JouganActive;
  
  private int KarmaSealType;
  
  private int KarmaSealSize;
  
  private boolean KarmaSealActive;
  
  private boolean SixPathsMode;
  
  private int SixPathsOrbs;
  
  private boolean SixPathsShield;
  
  private boolean SixPathsSage;
  
  private boolean SixPathsState;
  
  private boolean nekomode;
  
  public TrackingMessage() {}
  
  public TrackingMessage(EntityPlayer player) {
    this.data = ExtendedPlayer.get(player).getTransformed();
    this.playerID = player.getEntityId();
    this.sharinganActive = ExtendedPlayer.get(player).getSharinganActive();
    this.Sharingan = ExtendedPlayer.get(player).getSharingan();
    this.ByakuganActive = ExtendedPlayer.get(player).getByakuganActive();
    this.ByakuganSize = ExtendedPlayer.get(player).getByakuganSize();
    this.SusanoActive = ExtendedPlayer.get(player).getSusanoActive();
    this.susano = ExtendedPlayer.get(player).getSusanoTransformed();
    this.susanoa = ExtendedPlayer.get(player).getSusanoA();
    this.CurseSeal = ExtendedPlayer.get(player).getCurseSeal();
    this.CurseSealActive = ExtendedPlayer.get(player).getCurseSealActive();
    this.CurseSealTransformed = ExtendedPlayer.get(player).getCurseSealTransformed();
    this.BijuuTransformed = ExtendedPlayer.get(player).getBijuuTransformed();
    this.BijuuFormActive = ExtendedPlayer.get(player).getBijuuFormActive();
    this.BijuuScale = ExtendedPlayer.get(player).getBijuuScale();
    this.Size = ExtendedPlayer.get(player).getSize();
    this.BijuuKind = ExtendedPlayer.get(player).getBijuuKind();
    this.height = player.height;
    this.Ketsuryugan = ExtendedPlayer.get(player).getKetsuryugan();
    this.KetsuryuganActive = ExtendedPlayer.get(player).getKetsuryuganActive();
    this.SageMode = ExtendedPlayer.get(player).getSageMode();
    this.SageVersion = ExtendedPlayer.get(player).getSageVersion();
    this.SageActive = ExtendedPlayer.get(player).getSageActive();
    this.DeathPossession = ExtendedPlayer.get(player).getDeathPossession();
    this.SharinganSize = ExtendedPlayer.get(player).getSharinganSize();
    this.EightGatesStage = ExtendedPlayer.get(player).getEightGatesStage();
    this.Byakugou = ExtendedPlayer.get(player).getByakugou();
    this.Jougan = ExtendedPlayer.get(player).getJougan();
    this.JouganActive = ExtendedPlayer.get(player).getJouganActive();
    this.KarmaSealType = ExtendedPlayer.get(player).getKarmaSealType();
    this.KarmaSealSize = ExtendedPlayer.get(player).getKarmaSealSize();
    this.KarmaSealActive = ExtendedPlayer.get(player).getKarmaSealActive();
    this.SixPathsMode = ExtendedPlayer.get(player).getSixPathsMode();
    this.SixPathsOrbs = ExtendedPlayer.get(player).getSixPathsOrbs();
    this.SixPathsShield = ExtendedPlayer.get(player).getSixPathsShield();
    this.SixPathsSage = ExtendedPlayer.get(player).getSixPathsSage();
    this.SixPathsState = ExtendedPlayer.get(player).getSixPathsState();
    this.nekomode = ExtendedPlayer.get(player).isNekomode();
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.data = buffer.readBoolean();
    this.playerID = buffer.readInt();
    this.texture = buffer.readInt();
    this.model = buffer.readInt();
    this.sharinganActive = buffer.readBoolean();
    this.Sharingan = buffer.readInt();
    this.ByakuganActive = buffer.readBoolean();
    this.ByakuganSize = buffer.readInt();
    this.SusanoActive = buffer.readInt();
    this.susano = buffer.readBoolean();
    this.susanoa = buffer.readBoolean();
    this.CurseSeal = buffer.readInt();
    this.CurseSealActive = buffer.readBoolean();
    this.CurseSealTransformed = buffer.readBoolean();
    this.BijuuTransformed = buffer.readBoolean();
    this.BijuuFormActive = buffer.readBoolean();
    this.BijuuScale = buffer.readInt();
    this.Size = buffer.readDouble();
    this.BijuuKind = buffer.readInt();
    this.height = buffer.readFloat();
    this.Ketsuryugan = buffer.readInt();
    this.KetsuryuganActive = buffer.readBoolean();
    this.SageMode = buffer.readBoolean();
    this.SageVersion = buffer.readInt();
    this.SageActive = buffer.readBoolean();
    this.DeathPossession = buffer.readInt();
    this.SharinganSize = buffer.readDouble();
    this.EightGatesStage = buffer.readInt();
    this.Byakugou = buffer.readInt();
    this.Jougan = buffer.readInt();
    this.JouganActive = buffer.readBoolean();
    this.KarmaSealSize = buffer.readInt();
    this.KarmaSealType = buffer.readInt();
    this.KarmaSealActive = buffer.readBoolean();
    this.SixPathsMode = buffer.readBoolean();
    this.SixPathsOrbs = buffer.readInt();
    this.SixPathsShield = buffer.readBoolean();
    this.SixPathsSage = buffer.readBoolean();
    this.SixPathsState = buffer.readBoolean();
    this.nekomode = buffer.readBoolean();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeBoolean(this.data);
    buffer.writeInt(this.playerID);
    buffer.writeInt(this.texture);
    buffer.writeInt(this.model);
    buffer.writeBoolean(this.sharinganActive);
    buffer.writeInt(this.Sharingan);
    buffer.writeBoolean(this.ByakuganActive);
    buffer.writeInt(this.ByakuganSize);
    buffer.writeInt(this.SusanoActive);
    buffer.writeBoolean(this.susano);
    buffer.writeBoolean(this.susanoa);
    buffer.writeInt(this.CurseSeal);
    buffer.writeBoolean(this.CurseSealActive);
    buffer.writeBoolean(this.CurseSealTransformed);
    buffer.writeBoolean(this.BijuuTransformed);
    buffer.writeBoolean(this.BijuuFormActive);
    buffer.writeInt(this.BijuuScale);
    buffer.writeDouble(this.Size);
    buffer.writeInt(this.BijuuKind);
    buffer.writeFloat(this.height);
    buffer.writeInt(this.Ketsuryugan);
    buffer.writeBoolean(this.KetsuryuganActive);
    buffer.writeBoolean(this.SageMode);
    buffer.writeInt(this.SageVersion);
    buffer.writeBoolean(this.SageActive);
    buffer.writeInt(this.DeathPossession);
    buffer.writeDouble(this.SharinganSize);
    buffer.writeInt(this.EightGatesStage);
    buffer.writeInt(this.Byakugou);
    buffer.writeInt(this.Jougan);
    buffer.writeBoolean(this.JouganActive);
    buffer.writeInt(this.KarmaSealSize);
    buffer.writeInt(this.KarmaSealType);
    buffer.writeBoolean(this.KarmaSealActive);
    buffer.writeBoolean(this.SixPathsMode);
    buffer.writeInt(this.SixPathsOrbs);
    buffer.writeBoolean(this.SixPathsShield);
    buffer.writeBoolean(this.SixPathsSage);
    buffer.writeBoolean(this.SixPathsState);
    buffer.writeBoolean(this.nekomode);
  }
  
  public void process(EntityPlayer player, Side side) {
    if ((Minecraft.getMinecraft()).theWorld != null) {
      EntityPlayer playerC = (EntityPlayer)(Minecraft.getMinecraft()).theWorld.getEntityByID(this.playerID);
      if (playerC != null) {
        ExtendedPlayer.get(playerC).setTransformed(this.data, side);
        ExtendedPlayer.get(playerC).setSharinganActive(this.sharinganActive, side);
        ExtendedPlayer.get(playerC).setSharingan(this.Sharingan, side);
        ExtendedPlayer.get(playerC).setByakuganActive(this.ByakuganActive, side);
        ExtendedPlayer.get(playerC).setByakuganSize(this.ByakuganSize, side);
        ExtendedPlayer.get(playerC).setSusanoActive(this.SusanoActive, side);
        ExtendedPlayer.get(playerC).setSusanoTransformed(this.susano, side);
        ExtendedPlayer.get(playerC).setSusanoA(this.susanoa, side);
        ExtendedPlayer.get(playerC).setCurseSeal(this.CurseSeal, side);
        ExtendedPlayer.get(playerC).setCurseSealActive(this.CurseSealActive, side);
        ExtendedPlayer.get(playerC).setCurseSealTransformed(this.CurseSealTransformed, side);
        ExtendedPlayer.get(playerC).setBijuuTransformed(this.BijuuTransformed, side);
        ExtendedPlayer.get(playerC).setBijuuFormActive(this.BijuuFormActive, side);
        ExtendedPlayer.get(playerC).setBijuuScale(this.BijuuScale, side);
        ExtendedPlayer.get(playerC).setSize(this.Size, side);
        ExtendedPlayer.get(playerC).setBijuuKind(this.BijuuKind, side);
        ExtendedPlayer.get(playerC).setKetsuryugan(this.Ketsuryugan, side);
        ExtendedPlayer.get(playerC).setKetsuryuganActive(this.KetsuryuganActive, side);
        ExtendedPlayer.get(playerC).setSageMode(this.SageMode, side);
        ExtendedPlayer.get(playerC).setSageVersion(this.SageVersion, side);
        ExtendedPlayer.get(playerC).setSageActive(this.SageActive, side);
        ExtendedPlayer.get(playerC).setDeathPossession(this.DeathPossession, side);
        ExtendedPlayer.get(playerC).setSharinganSize(this.SharinganSize, side);
        ExtendedPlayer.get(playerC).setEightGatesStage(this.EightGatesStage, side);
        ExtendedPlayer.get(playerC).setByakugou(this.Byakugou, side);
        ExtendedPlayer.get(playerC).setJougan(this.Jougan, side);
        ExtendedPlayer.get(playerC).setJouganActive(this.JouganActive, side);
        ExtendedPlayer.get(playerC).setKarmaSealSize(this.KarmaSealSize, side);
        ExtendedPlayer.get(playerC).setKarmaSealType(this.KarmaSealType, side);
        ExtendedPlayer.get(playerC).setKarmaSealActive(this.KarmaSealActive, side);
        ExtendedPlayer.get(playerC).setSixPathsMode(this.SixPathsMode, side);
        ExtendedPlayer.get(playerC).setSixPathsOrbs(this.SixPathsOrbs, side);
        ExtendedPlayer.get(playerC).setSixPathsShield(this.SixPathsShield, side);
        ExtendedPlayer.get(playerC).setSixPathsSage(this.SixPathsSage, side);
        ExtendedPlayer.get(playerC).setSixPathsState(this.SixPathsState, side);
        ExtendedPlayer.get(playerC).setNekomode(this.nekomode, side);
        playerC.height = this.height;
      } 
    } 
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

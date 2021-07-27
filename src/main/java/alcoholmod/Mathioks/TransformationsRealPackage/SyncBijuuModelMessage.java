package alcoholmod.Mathioks.TransformationsRealPackage;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;

public class SyncBijuuModelMessage extends AbstractMessage {
  private int BijuuTransformed;
  
  public SyncBijuuModelMessage() {}
  
  public SyncBijuuModelMessage(EntityPlayer player) {
    this.BijuuTransformed = ExtendedPlayer.get(player).getBijuuModel();
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.BijuuTransformed = buffer.readInt();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeInt(this.BijuuTransformed);
  }
  
  public void process(EntityPlayer player, Side side) {
    ExtendedPlayer.get(player).setBijuuModel(this.BijuuTransformed, side);
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

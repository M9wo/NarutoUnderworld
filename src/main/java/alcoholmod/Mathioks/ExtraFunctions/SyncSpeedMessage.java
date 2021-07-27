package alcoholmod.Mathioks.ExtraFunctions;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;

public class SyncSpeedMessage extends AbstractMessage {
  private double data;
  
  public SyncSpeedMessage() {}
  
  public SyncSpeedMessage(EntityPlayer player) {
    this.data = ExtendedPlayer.get(player).getSpeed();
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.data = buffer.readDouble();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeDouble(this.data);
  }
  
  public void process(EntityPlayer player, Side side) {
    ExtendedPlayer.get(player).setSpeed(this.data, side);
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

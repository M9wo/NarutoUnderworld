package alcoholmod.Mathioks.TransformationsRealPackage;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;

public class SyncCurseSealTransformMessage extends AbstractMessage {
  private boolean data;
  
  public SyncCurseSealTransformMessage() {}
  
  public SyncCurseSealTransformMessage(EntityPlayer player) {
    this.data = ExtendedPlayer.get(player).getCurseSealTransformed();
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.data = buffer.readBoolean();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeBoolean(this.data);
  }
  
  public void process(EntityPlayer player, Side side) {
    ExtendedPlayer.get(player).setCurseSealTransformed(this.data, side);
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
  
  public static class Handler implements IMessageHandler {
    public IMessage onMessage(IMessage message, MessageContext ctx) {
      return null;
    }
  }
}

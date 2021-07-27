package alcoholmod.Mathioks.TransformationsRealPackage;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;

public class SyncCurseSealTextureMessage extends AbstractMessage {
  private int CurseSealTransformed;
  
  public SyncCurseSealTextureMessage() {}
  
  public SyncCurseSealTextureMessage(EntityPlayer player) {
    this.CurseSealTransformed = ExtendedPlayer.get(player).getCurseSealTexture();
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.CurseSealTransformed = buffer.readInt();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeInt(this.CurseSealTransformed);
  }
  
  public void process(EntityPlayer player, Side side) {
    ExtendedPlayer.get(player).setCurseSealTexture(this.CurseSealTransformed, side);
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

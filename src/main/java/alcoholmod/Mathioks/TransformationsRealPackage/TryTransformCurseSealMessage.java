package alcoholmod.Mathioks.TransformationsRealPackage;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;

public class TryTransformCurseSealMessage extends AbstractMessage.AbstractServerMessage {
  public TryTransformCurseSealMessage() {}
  
  public TryTransformCurseSealMessage(EntityPlayer player) {}
  
  protected void read(PacketBuffer buffer) throws IOException {}
  
  protected void write(PacketBuffer buffer) throws IOException {}
  
  public void process(EntityPlayer player, Side side) {
    ExtendedPlayer.get(player).tryCurseSealTransformed();
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}
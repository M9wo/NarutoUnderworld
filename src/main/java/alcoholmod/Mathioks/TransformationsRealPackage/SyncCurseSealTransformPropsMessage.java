package alcoholmod.Mathioks.TransformationsRealPackage;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;

public class SyncCurseSealTransformPropsMessage extends AbstractMessage.AbstractClientMessage {
  private NBTTagCompound data2;
  
  public SyncCurseSealTransformPropsMessage() {}
  
  public SyncCurseSealTransformPropsMessage(EntityPlayer player) {
    this.data2 = new NBTTagCompound();
    ExtendedPlayer.get(player).saveNBTData(this.data2);
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.data2 = buffer.readNBTTagCompoundFromBuffer();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeNBTTagCompoundToBuffer(this.data2);
  }
  
  public void process(EntityPlayer player, Side side) {
    ExtendedPlayer.get(player).loadNBTData(this.data2);
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

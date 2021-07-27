package alcoholmod.Mathioks;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public class SyncPlayerPropsMessage implements IMessage {
  private NBTTagCompound data;
  
  public SyncPlayerPropsMessage() {}
  
  public SyncPlayerPropsMessage(EntityPlayer player) {
    this.data = new NBTTagCompound();
    ExtendedPlayer.get(player).saveNBTData(this.data);
  }
  
  public void fromBytes(ByteBuf buffer) {
    this.data = ByteBufUtils.readTag(buffer);
  }
  
  public void toBytes(ByteBuf buffer) {
    ByteBufUtils.writeTag(buffer, this.data);
  }
  
  public static class Handler extends AbstractClientMessageHandler {
    public IMessage handleClientMessage(EntityPlayer player, IMessage message, MessageContext ctx) {
      ExtendedPlayer.get(player).loadNBTData(((SyncPlayerPropsMessage)message).data);
      return null;
    }
  }
}

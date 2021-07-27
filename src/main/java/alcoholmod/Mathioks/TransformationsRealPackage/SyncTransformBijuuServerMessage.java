package alcoholmod.Mathioks.TransformationsRealPackage;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;

public class SyncTransformBijuuServerMessage extends AbstractMessage.AbstractServerMessage {
  private NBTTagCompound BijuuTransformed;
  
  public SyncTransformBijuuServerMessage() {}
  
  public SyncTransformBijuuServerMessage(EntityPlayer player) {
    this.BijuuTransformed = new NBTTagCompound();
    ExtendedPlayer.get(player).saveNBTData(this.BijuuTransformed);
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.BijuuTransformed = buffer.readNBTTagCompoundFromBuffer();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeNBTTagCompoundToBuffer(this.BijuuTransformed);
  }
  
  public void process(EntityPlayer player, Side side) {
    ExtendedPlayer.get(player).loadNBTData(this.BijuuTransformed);
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

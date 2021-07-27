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

public class SyncChakraServerMessage extends AbstractMessage.AbstractServerMessage {
  private NBTTagCompound data;
  
  public SyncChakraServerMessage() {}
  
  public SyncChakraServerMessage(EntityPlayer player) {
    this.data = new NBTTagCompound();
    ExtendedPlayer.get(player).saveNBTData(this.data);
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.data = buffer.readNBTTagCompoundFromBuffer();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeNBTTagCompoundToBuffer(this.data);
  }
  
  public void process(EntityPlayer player, Side side) {
    ExtendedPlayer.get(player).loadNBTData(this.data);
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

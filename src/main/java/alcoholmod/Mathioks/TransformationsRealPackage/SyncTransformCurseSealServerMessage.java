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

public class SyncTransformCurseSealServerMessage extends AbstractMessage.AbstractServerMessage {
  private NBTTagCompound CurseSealTransformed;
  
  public SyncTransformCurseSealServerMessage() {}
  
  public SyncTransformCurseSealServerMessage(EntityPlayer player) {
    this.CurseSealTransformed = new NBTTagCompound();
    ExtendedPlayer.get(player).saveNBTData(this.CurseSealTransformed);
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.CurseSealTransformed = buffer.readNBTTagCompoundFromBuffer();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeNBTTagCompoundToBuffer(this.CurseSealTransformed);
  }
  
  public void process(EntityPlayer player, Side side) {
    ExtendedPlayer.get(player).loadNBTData(this.CurseSealTransformed);
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

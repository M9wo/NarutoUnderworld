package alcoholmod.Mathioks.ExtraFunctions;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.AlcoholMod;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;

public class OpenGuiMessage extends AbstractMessage.AbstractServerMessage {
  private int id;
  
  public OpenGuiMessage() {}
  
  public OpenGuiMessage(int id) {
    this.id = id;
  }
  
  protected void read(PacketBuffer buffer) {
    this.id = buffer.readInt();
  }
  
  protected void write(PacketBuffer buffer) {
    buffer.writeInt(this.id);
  }
  
  public void process(EntityPlayer player, Side side) {
    player.openGui(AlcoholMod.modInstance, this.id, player.worldObj, (int)player.posX, (int)player.posY, (int)player.posZ);
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    return null;
  }
}

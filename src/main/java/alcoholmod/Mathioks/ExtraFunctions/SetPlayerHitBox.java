package alcoholmod.Mathioks.ExtraFunctions;

import alcoholmod.Mathioks.AbstractMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.AxisAlignedBB;

public class SetPlayerHitBox extends AbstractMessage {
  private float data;
  
  public SetPlayerHitBox() {}
  
  public SetPlayerHitBox(EntityPlayer player, float height) {
    this.data = height;
    player.height = height;
    player.boundingBox.setBB(AxisAlignedBB.getBoundingBox(player.boundingBox.minX, player.boundingBox.minY, player.boundingBox.minZ, player.boundingBox.minX + player.width, player.boundingBox.minY + height, player.boundingBox.minZ + player.width));
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.data = buffer.readFloat();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeFloat(this.data);
  }
  
  public void process(EntityPlayer player, Side side) {
    player.height = this.data;
    player.boundingBox.setBB(AxisAlignedBB.getBoundingBox(player.boundingBox.minX, player.boundingBox.minY, player.boundingBox.minZ, player.boundingBox.minX + player.width, player.boundingBox.minY + this.data, player.boundingBox.minZ + player.width));
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

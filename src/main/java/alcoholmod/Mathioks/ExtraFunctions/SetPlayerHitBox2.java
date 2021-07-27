package alcoholmod.Mathioks.ExtraFunctions;

import alcoholmod.Mathioks.AbstractMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.AxisAlignedBB;

public class SetPlayerHitBox2 extends AbstractMessage {
  private float data;
  
  public SetPlayerHitBox2() {}
  
  public SetPlayerHitBox2(EntityPlayer player, float width) {
    this.data = width;
    player.height = width;
    player.boundingBox.setBB(AxisAlignedBB.getBoundingBox(player.boundingBox.minX, player.boundingBox.minY, player.boundingBox.minZ, player.boundingBox.minX + width, player.boundingBox.minY + player.height, player.boundingBox.minZ + width));
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.data = buffer.readFloat();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeFloat(this.data);
  }
  
  public void process(EntityPlayer player, Side side) {
    player.width = this.data;
    player.boundingBox.setBB(AxisAlignedBB.getBoundingBox(player.boundingBox.minX, player.boundingBox.minY, player.boundingBox.minZ, player.boundingBox.minX + this.data, player.boundingBox.minY + player.height, player.boundingBox.minZ + this.data));
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

package alcoholmod.Mathioks.ExtraFunctions;

import alcoholmod.Mathioks.AbstractMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;

public class SyncParticleMessage extends AbstractMessage {
  private boolean data;
  
  public SyncParticleMessage() {}
  
  public SyncParticleMessage(boolean data, EntityPlayer player) {
    this.data = data;
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.data = buffer.readBoolean();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeBoolean(this.data);
  }
  
  public void process(EntityPlayer player, Side side) {
    player.worldObj.spawnParticle("magicCrit", player.posX + player.worldObj.rand.nextGaussian(), player.posY + player.worldObj.rand.nextGaussian() * 0.25D, player.posZ + player.worldObj.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

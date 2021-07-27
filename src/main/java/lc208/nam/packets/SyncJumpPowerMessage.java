package lc208.nam.packets;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.Final.Summons.Entity.SummonGamabuntaEntity;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;

public class SyncJumpPowerMessage extends AbstractMessage {
  private int data;
  
  public SyncJumpPowerMessage() {}
  
  public SyncJumpPowerMessage(int data) {
    this.data = data;
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.data = buffer.readInt();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeInt(this.data);
  }
  
  public void process(EntityPlayer player, Side side) {
    if (player.ridingEntity != null && 
      player.ridingEntity instanceof SummonGamabuntaEntity)
      ((SummonGamabuntaEntity)player.ridingEntity).setJumpPower(this.data); 
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

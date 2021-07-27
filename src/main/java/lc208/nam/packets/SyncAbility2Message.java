package lc208.nam.packets;

import alcoholmod.Mathioks.AbstractMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import lc208.nam.entity.EntityAbilityExtended;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;

public class SyncAbility2Message extends AbstractMessage {
  private boolean data;
  
  public SyncAbility2Message() {}
  
  public SyncAbility2Message(boolean data, EntityPlayer player) {
    this.data = data;
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.data = buffer.readBoolean();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeBoolean(this.data);
  }
  
  public void process(EntityPlayer var1, Side var2) {
    if (var1.ridingEntity != null)
      ((EntityAbilityExtended)var1.ridingEntity).ability2(var1); 
    this.data = false;
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

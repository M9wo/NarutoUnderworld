package alcoholmod.Mathioks.ExtraFunctions;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;

public class AddGenjutsuMessage extends AbstractMessage {
  protected void read(PacketBuffer packetBuffer) throws IOException {}
  
  protected void write(PacketBuffer packetBuffer) throws IOException {}
  
  public void process(EntityPlayer entityPlayer, Side side) {
    if (ExtendedPlayer.get(entityPlayer).getSkillPoints() >= 1) {
      ExtendedPlayer.get(entityPlayer).setGenjutsu(ExtendedPlayer.get(entityPlayer).getGenjutsu() + 1, side);
    } else {
      ExtendedPlayer.get(entityPlayer).setGenjutsu(ExtendedPlayer.get(entityPlayer).getGenjutsu(), side);
    } 
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

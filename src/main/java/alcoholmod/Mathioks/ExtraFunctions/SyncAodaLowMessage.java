package alcoholmod.Mathioks.ExtraFunctions;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.GreatFireBallEntity;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;

public class SyncAodaLowMessage extends AbstractMessage {
  private boolean data;
  
  public SyncAodaLowMessage() {}
  
  public SyncAodaLowMessage(boolean data, EntityPlayer player) {
    this.data = ExtendedPlayer.get(player).getChakraControl();
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.data = buffer.readBoolean();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeBoolean(this.data);
  }
  
  public void process(EntityPlayer player, Side side) {
    ExtendedPlayer props = ExtendedPlayer.get(player);
    player.addChatComponentMessage((IChatComponent)new ChatComponentText("Aoda : Great Fireball Jutsu!"));
    player.worldObj.spawnEntityInWorld((Entity)new GreatFireBallEntity(player.worldObj, (EntityLivingBase)player));
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

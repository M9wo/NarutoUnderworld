package alcoholmod.Mathioks.ExtraFunctions;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Jutsu.EntityMoonBunshin;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;

public class SyncKenjutsu3Message extends AbstractMessage {
  private boolean data;
  
  public SyncKenjutsu3Message() {}
  
  public SyncKenjutsu3Message(boolean data, EntityPlayer player) {
    this.data = data;
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.data = buffer.readBoolean();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeBoolean(this.data);
  }
  
  public void process(EntityPlayer player, Side side) {
    ExtendedPlayer props = ExtendedPlayer.get(player);
    player.addChatMessage((IChatComponent)new ChatComponentText("Kenjutsu: Dance of the Crescent Moon!"));
    EntityMoonBunshin EntityBunshin = new EntityMoonBunshin(player.worldObj);
    EntityBunshin.func_152115_b(player.getUniqueID().toString());
    EntityBunshin.setTamed(true);
    EntityBunshin.setPositionAndRotation(player.posX, player.posY, player.posZ, player.rotationYaw, 0.0F);
    EntityBunshin.rotationYawHead = EntityBunshin.rotationYaw;
    EntityBunshin.renderYawOffset = EntityBunshin.rotationYaw;
    player.worldObj.spawnEntityInWorld((Entity)EntityBunshin);
    EntityMoonBunshin EntityBunshin2 = new EntityMoonBunshin(player.worldObj);
    EntityBunshin2.func_152115_b(player.getUniqueID().toString());
    EntityBunshin2.setTamed(true);
    EntityBunshin2.setPositionAndRotation(player.posX, player.posY, player.posZ, player.rotationYaw, 0.0F);
    EntityBunshin2.rotationYawHead = EntityBunshin2.rotationYaw;
    EntityBunshin2.renderYawOffset = EntityBunshin2.rotationYaw;
    player.worldObj.spawnEntityInWorld((Entity)EntityBunshin2);
    props.consumeMana(30);
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

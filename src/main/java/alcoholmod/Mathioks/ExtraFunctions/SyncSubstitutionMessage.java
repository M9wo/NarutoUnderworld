package alcoholmod.Mathioks.ExtraFunctions;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.Entity.FallingLogEntity;
import alcoholmod.Mathioks.Final.Summons.Entity.SummonFallingLogEntity;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;

public class SyncSubstitutionMessage extends AbstractMessage {
  private boolean data;
  
  public SyncSubstitutionMessage() {}
  
  public SyncSubstitutionMessage(boolean data, EntityPlayer player) {
    this.data = data;
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.data = buffer.readBoolean();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeBoolean(this.data);
  }
  
  public void process(EntityPlayer player, Side side) {
    player.worldObj.spawnEntityInWorld((Entity)new SummonFallingLogEntity(player.worldObj, (EntityLivingBase)player));
    player.worldObj.spawnEntityInWorld((Entity)new FallingLogEntity(player.worldObj, (EntityLivingBase)player));
    this.data = false;
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

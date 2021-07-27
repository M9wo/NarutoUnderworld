package alcoholmod.Mathioks.ExtraFunctions;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;

public class SyncKenjutsu4Message extends AbstractMessage {
  private boolean data;
  
  public SyncKenjutsu4Message() {}
  
  public SyncKenjutsu4Message(boolean data, EntityPlayer player) {
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
    player.addChatMessage((IChatComponent)new ChatComponentText("Kenjutsu: Chakra Shockwave Slash!"));
    List<Entity> list = player.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(player.posX - 8.0D, player.posY - 1.0D, player.posZ - 8.0D, player.posX + 8.0D, player.posY + 1.0D, player.posZ + 8.0D));
    if (player != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!player.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = player.getUniqueID().toString();
          entity.getDistance(player.posX, player.posY, player.posZ);
          if (entity instanceof net.minecraft.entity.EntityLiving && entity instanceof net.minecraft.entity.EntityLivingBase)
            entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 9.0F + (int)props.getKenjutsu()); 
          if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user))
            entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 9.0F + (int)props.getKenjutsu()); 
        } 
      }  
    props.consumeMana(40);
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

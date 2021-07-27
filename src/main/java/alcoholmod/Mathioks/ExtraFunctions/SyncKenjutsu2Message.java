package alcoholmod.Mathioks.ExtraFunctions;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;

public class SyncKenjutsu2Message extends AbstractMessage {
  private boolean data;
  
  public SyncKenjutsu2Message() {}
  
  public SyncKenjutsu2Message(boolean data, EntityPlayer player) {
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
    List<Entity> list = player.worldObj.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(player.posX - 2.0D, player.posY - 2.0D, player.posZ - 2.0D, player.posX + 2.0D, player.posY + 2.0D, player.posZ + 2.0D));
    if (player != null)
      for (int k2 = 0; k2 < list.size(); k2++) {
        if (!player.worldObj.isRemote) {
          Entity entity = list.get(k2);
          String user = player.getUniqueID().toString();
          double d0 = entity.getDistance(player.posX, player.posY, player.posZ);
          if (entity instanceof net.minecraft.entity.EntityLiving && entity instanceof EntityLivingBase) {
            entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 6.0F);
            if (d0 <= 10.0D) {
              entity.setPositionAndRotation(entity.posX, entity.posY + 5.0D, entity.posZ, entity.rotationYaw, entity.rotationPitch);
              ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.jump.id, 50, -1));
              player.addChatMessage((IChatComponent)new ChatComponentText("Kenjutsu: Heaven Cutter!"));
            } 
          } 
          if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
            entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 6.0F);
            if (d0 <= 10.0D) {
              entity.setPositionAndRotation(entity.posX, entity.posY + 5.0D, entity.posZ, entity.rotationYaw, entity.rotationPitch);
              ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.jump.id, 50, -1));
              player.addChatMessage((IChatComponent)new ChatComponentText("Kenjutsu: Heaven Cutter!"));
            } 
          } 
        } 
      }  
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

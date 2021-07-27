package alcoholmod.Mathioks.ExtraFunctions;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.PacketBuffer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class SyncChakraMessage extends AbstractMessage {
  private int data;
  
  public SyncChakraMessage() {}
  
  public SyncChakraMessage(EntityPlayer player) {
    this.data = ExtendedPlayer.get(player).getCurrentMana();
  }
  
  protected void read(PacketBuffer buffer) throws IOException {
    this.data = buffer.readInt();
  }
  
  protected void write(PacketBuffer buffer) throws IOException {
    buffer.writeInt(this.data);
  }
  
  public void process(EntityPlayer player, Side side) {
    if (ExtendedPlayer.get(player).getMaxMana() >= 200) {
      ExtendedPlayer.get(player).regenMana(1 + ExtendedPlayer.get(player).getMaxMana() / 200);
      for (int i = 0; i < 1; i++)
        player.worldObj.spawnParticle("magicCrit", player.posX + (player.worldObj.rand.nextDouble() - 0.5D) * player.width, player.posY - 2.0D + player.worldObj.rand.nextDouble() * player.height, player.posZ + (player.worldObj.rand.nextDouble() - 0.5D) * player.width, 0.0D, 0.0D, 0.0D); 
      player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 30, 10));
      player.addPotionEffect(new PotionEffect(Potion.jump.id, 30, -2));
    } else {
      ExtendedPlayer.get(player).regenMana(1);
      for (int i = 0; i < 1; i++)
        player.worldObj.spawnParticle("magicCrit", player.posX + (player.worldObj.rand.nextDouble() - 0.5D) * player.width, player.posY - 2.0D + player.worldObj.rand.nextDouble() * player.height, player.posZ + (player.worldObj.rand.nextDouble() - 0.5D) * player.width, 0.0D, 0.0D, 0.0D); 
      player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 30, 10));
      player.addPotionEffect(new PotionEffect(Potion.jump.id, 30, -2));
    } 
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

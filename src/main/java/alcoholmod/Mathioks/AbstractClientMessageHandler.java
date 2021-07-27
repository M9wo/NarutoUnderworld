package alcoholmod.Mathioks;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import net.minecraft.entity.player.EntityPlayer;

public abstract class AbstractClientMessageHandler extends AbstractMessageHandler {
  public final IMessage handleServerMessage(EntityPlayer player, IMessage message, MessageContext ctx) {
    return null;
  }
}

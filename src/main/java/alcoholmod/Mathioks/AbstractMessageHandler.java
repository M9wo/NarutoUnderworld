package alcoholmod.Mathioks;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;

public abstract class AbstractMessageHandler implements IMessageHandler {
  @SideOnly(Side.CLIENT)
  public abstract IMessage handleClientMessage(EntityPlayer paramEntityPlayer, IMessage paramIMessage, MessageContext paramMessageContext);
  
  public abstract IMessage handleServerMessage(EntityPlayer paramEntityPlayer, IMessage paramIMessage, MessageContext paramMessageContext);
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    return ctx.side.isClient() ? handleClientMessage(AlcoholMod.proxy.getPlayerEntity(ctx), message, ctx) : handleServerMessage(AlcoholMod.proxy.getPlayerEntity(ctx), message, ctx);
  }
}

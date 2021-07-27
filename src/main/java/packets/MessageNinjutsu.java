package packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;

public class MessageNinjutsu implements IMessageHandler {
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    if (ctx.side.isClient()) {
      int integer = ((NinjutsuMessage)message).simpleInt;
      boolean bool = ((NinjutsuMessage)message).simpleBool;
    } 
    return message;
  }
  
  public static class NinjutsuMessage implements IMessage {
    private int simpleInt;
    
    private boolean simpleBool;
    
    public NinjutsuMessage() {}
    
    public NinjutsuMessage(int simpleInt, boolean simpleBool) {
      this.simpleInt = simpleInt;
      this.simpleBool = simpleBool;
    }
    
    public void fromBytes(ByteBuf buf) {
      this.simpleInt = buf.readInt();
      this.simpleBool = buf.readBoolean();
    }
    
    public void toBytes(ByteBuf buf) {
      buf.writeInt(this.simpleInt);
      buf.writeBoolean(this.simpleBool);
    }
  }
}

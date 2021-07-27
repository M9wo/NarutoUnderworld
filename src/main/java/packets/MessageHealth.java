package packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;

public class MessageHealth implements IMessageHandler {
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    if (ctx.side.isClient()) {
      int integer = ((HealthMessage)message).simpleInt;
      boolean bool = ((HealthMessage)message).simpleBool;
    } 
    return message;
  }
  
  public static class HealthMessage implements IMessage {
    private int simpleInt;
    
    private boolean simpleBool;
    
    public HealthMessage() {}
    
    public HealthMessage(int simpleInt, boolean simpleBool) {
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

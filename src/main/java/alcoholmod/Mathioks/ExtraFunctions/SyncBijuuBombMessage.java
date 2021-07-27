package alcoholmod.Mathioks.ExtraFunctions;

import alcoholmod.Mathioks.AbstractMessage;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.BijuuBombEntity;
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
import net.minecraft.util.Vec3;

public class SyncBijuuBombMessage extends AbstractMessage {
  private boolean data;
  
  public SyncBijuuBombMessage() {}
  
  public SyncBijuuBombMessage(boolean data, EntityPlayer player) {
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
    if (props.getCurrentMana() >= 200) {
      if (props.getBijuuScale() > 2) {
        if (props.getBijuuScale() == 3) {
          BijuuBombEntity fireball2 = new BijuuBombEntity(player.worldObj, (EntityLivingBase)player);
          fireball2.level = 1;
          player.worldObj.spawnEntityInWorld((Entity)fireball2);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Bijuudama!!!"));
        } 
        if (props.getBijuuScale() == 4) {
          BijuuBombEntity fireball2 = new BijuuBombEntity(player.worldObj, (EntityLivingBase)player);
          fireball2.level = 2;
          player.worldObj.spawnEntityInWorld((Entity)fireball2);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Bijuudama!!!"));
        } 
        if (props.getBijuuScale() == 5) {
          Vec3 look = player.getLookVec();
          BijuuBombEntity fireball2 = new BijuuBombEntity(player.worldObj, (EntityLivingBase)player);
          fireball2.level = 3;
          fireball2.setPosition(player.posX + look.xCoord * 5.0D, player.posY + 9.8D + look.yCoord * 5.0D, player.posZ + look.zCoord * 5.0D);
          player.worldObj.spawnEntityInWorld((Entity)fireball2);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Bijuudama!!!"));
        } else if (props.getBijuuScale() == 6) {
          Vec3 look = player.getLookVec();
          BijuuBombEntity fireball2 = new BijuuBombEntity(player.worldObj, (EntityLivingBase)player);
          fireball2.level = 3;
          fireball2.setPosition(player.posX + look.xCoord * 5.0D, player.posY + 5.8D + look.yCoord * 5.0D, player.posZ + look.zCoord * 5.0D);
          player.worldObj.spawnEntityInWorld((Entity)fireball2);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Bijuudama!!!"));
        } else if (props.getBijuuScale() == 7) {
          Vec3 look = player.getLookVec();
          BijuuBombEntity fireball2 = new BijuuBombEntity(player.worldObj, (EntityLivingBase)player);
          fireball2.level = 3;
          fireball2.setPosition(player.posX + look.xCoord * 5.0D, player.posY + 3.3D + look.yCoord * 5.0D, player.posZ + look.zCoord * 5.0D);
          player.worldObj.spawnEntityInWorld((Entity)fireball2);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Bijuudama!!!"));
        } else if (props.getBijuuScale() == 8) {
          Vec3 look = player.getLookVec();
          BijuuBombEntity fireball2 = new BijuuBombEntity(player.worldObj, (EntityLivingBase)player);
          fireball2.level = 3;
          fireball2.setPosition(player.posX + look.xCoord * 5.0D, player.posY + 9.3D + look.yCoord * 5.0D, player.posZ + look.zCoord * 5.0D);
          player.worldObj.spawnEntityInWorld((Entity)fireball2);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Bijuudama!!!"));
        } else if (props.getBijuuScale() == 9) {
          Vec3 look = player.getLookVec();
          BijuuBombEntity fireball2 = new BijuuBombEntity(player.worldObj, (EntityLivingBase)player);
          fireball2.level = 3;
          fireball2.setPosition(player.posX + look.xCoord * 5.0D, player.posY + 6.3D + look.yCoord * 5.0D, player.posZ + look.zCoord * 5.0D);
          player.worldObj.spawnEntityInWorld((Entity)fireball2);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Bijuudama!!!"));
        } else if (props.getBijuuScale() == 10) {
          Vec3 look = player.getLookVec();
          BijuuBombEntity fireball2 = new BijuuBombEntity(player.worldObj, (EntityLivingBase)player);
          fireball2.level = 2;
          fireball2.setPosition(player.posX + look.xCoord * 5.0D, player.posY + 7.8D + look.yCoord * 5.0D, player.posZ + look.zCoord * 5.0D);
          player.worldObj.spawnEntityInWorld((Entity)fireball2);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Bijuudama!!!"));
        } else if (props.getBijuuScale() == 11) {
          Vec3 look = player.getLookVec();
          BijuuBombEntity fireball2 = new BijuuBombEntity(player.worldObj, (EntityLivingBase)player);
          fireball2.level = 2;
          fireball2.setPosition(player.posX + look.xCoord * 5.0D, player.posY + 11.8D + look.yCoord * 5.0D, player.posZ + look.zCoord * 5.0D);
          player.worldObj.spawnEntityInWorld((Entity)fireball2);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Bijuudama!!!"));
        } else if (props.getBijuuScale() == 12) {
          Vec3 look = player.getLookVec();
          BijuuBombEntity fireball2 = new BijuuBombEntity(player.worldObj, (EntityLivingBase)player);
          fireball2.level = 4;
          fireball2.setPosition(player.posX + look.xCoord * 5.0D, player.posY + 8.8D + look.yCoord * 5.0D, player.posZ + look.zCoord * 5.0D);
          player.worldObj.spawnEntityInWorld((Entity)fireball2);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Bijuudama!!!"));
        } else if (props.getBijuuScale() == 13) {
          Vec3 look = player.getLookVec();
          BijuuBombEntity fireball2 = new BijuuBombEntity(player.worldObj, (EntityLivingBase)player);
          fireball2.level = 4;
          fireball2.setPosition(player.posX + look.xCoord * 5.0D, player.posY + 5.8D + look.yCoord * 5.0D, player.posZ + look.zCoord * 5.0D);
          player.worldObj.spawnEntityInWorld((Entity)fireball2);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Bijuudama!!!"));
        } else if (props.getBijuuScale() == 14) {
          Vec3 look = player.getLookVec();
          BijuuBombEntity fireball2 = new BijuuBombEntity(player.worldObj, (EntityLivingBase)player);
          fireball2.level = 5;
          fireball2.setPosition(player.posX + look.xCoord * 5.0D, player.posY + 11.8D + look.yCoord * 5.0D, player.posZ + look.zCoord * 5.0D);
          player.worldObj.spawnEntityInWorld((Entity)fireball2);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Bijuudama!!!"));
        } 
        if (props.getBijuuScale() != 15)
          props.consumeMana(props.getCurrentMana()); 
      } 
    } else {
      player.addChatComponentMessage((IChatComponent)new ChatComponentText("You need 200 chakra"));
    } 
    this.data = false;
  }
  
  public IMessage onMessage(IMessage message, MessageContext ctx) {
    onMessage((AbstractMessage)message, ctx);
    return null;
  }
}

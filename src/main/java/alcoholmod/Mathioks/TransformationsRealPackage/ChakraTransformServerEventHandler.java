package alcoholmod.Mathioks.TransformationsRealPackage;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.PacketDispatcher;
import alcoholmod.Mathioks.SyncPlayerPropsMessage;
import alcoholmod.Mathioks.TrackingMessage;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import java.util.ArrayList;
import java.util.List;
import lc208.tools;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.common.IExtendedEntityProperties;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class ChakraTransformServerEventHandler {
  public static List transformedPlayers = new ArrayList();
  
  @SubscribeEvent
  public void onEntityConstructing(EntityEvent.EntityConstructing event) {
    if (event.entity instanceof EntityPlayer && ExtendedPlayer.get((EntityPlayer)event.entity) == null)
      ExtendedPlayer.register((EntityPlayer)event.entity); 
    if (event.entity instanceof EntityPlayer && event.entity.getExtendedProperties("ChakraPlayer") == null)
      event.entity.registerExtendedProperties("ChakraPlayer", (IExtendedEntityProperties)new ExtendedPlayer((EntityPlayer)event.entity)); 
  }
  
  @SubscribeEvent
  public void onEntityJoinWorld(EntityJoinWorldEvent event) {
    if (event.entity instanceof EntityPlayer && !event.entity.worldObj.isRemote) {
      PacketDispatcher.sendTo((IMessage)new SyncPlayerPropsMessage((EntityPlayer)event.entity), (EntityPlayerMP)event.entity);
      if (ExtendedPlayer.get((EntityPlayer)event.entity).getClan() == 22 && !ExtendedPlayer.get((EntityPlayer)event.entity).getDrunkenFist()) {
        (ExtendedPlayer.get((EntityPlayer)event.entity)).DrunkenFist = true;
        ((EntityPlayer)event.entity).addChatComponentMessage((IChatComponent)new ChatComponentText("As a member of the Lee clan you have"));
        ((EntityPlayer)event.entity).addChatComponentMessage((IChatComponent)new ChatComponentText("the passive trait of 'Drunken Fist'"));
        ((EntityPlayer)event.entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Being nauseous will give you boosts."));
      } 
      if (!(ExtendedPlayer.get((EntityPlayer)event.entity)).got1500Present) {
        EntityPlayer player = (EntityPlayer)event.entity;
        ExtendedPlayer props = ExtendedPlayer.get(player);
        int EmptySpaces = tools.freeSpace(player.inventory.mainInventory);
        if (EmptySpaces > 3) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ChakraNaturePaper));
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.Ramen, 16));
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.Episode1));
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.bootsGenin));
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.chestplateGenin));
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.legsGenin));
          (ExtendedPlayer.get((EntityPlayer)event.entity)).got1500Present = true;
        } else {
          ((EntityPlayer)event.entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Please make room in your inventory"));
          ((EntityPlayer)event.entity).addChatComponentMessage((IChatComponent)new ChatComponentText("and rejoin the world"));
          ((EntityPlayer)event.entity).addChatComponentMessage((IChatComponent)new ChatComponentText("-Mathioks"));
        } 
      } 
    } 
  }
  
  @SubscribeEvent
  public void TrackHandler(PlayerEvent.StartTracking event) {
    if (event.target instanceof EntityPlayer && !event.entityPlayer.worldObj.isRemote && (ExtendedPlayer.get((EntityPlayer)event.target).getTransformed() || ExtendedPlayer.get((EntityPlayer)event.target).getCurseSealTransformed() || ExtendedPlayer.get((EntityPlayer)event.target).getBijuuTransformed()))
      PacketDispatcher.sendTo((IMessage)new TrackingMessage((EntityPlayer)event.target), (EntityPlayerMP)event.entityPlayer); 
  }
  
  @SubscribeEvent
  public void onClonePlayer(PlayerEvent.Clone event) {
    ExtendedPlayer.get(event.entityPlayer).copy(ExtendedPlayer.get(event.original));
  }
  
  private boolean isPlayerTransformed(EntityPlayer player) {
    ExtendedPlayer props = ExtendedPlayer.get(player);
    return props.getTransformed();
  }
  
  private boolean isPlayerCurseTransformed(EntityPlayer player) {
    ExtendedPlayer props = ExtendedPlayer.get(player);
    return props.getCurseSealTransformed();
  }
  
  private boolean isPlayerBijuuTransformed(EntityPlayer player) {
    ExtendedPlayer props = ExtendedPlayer.get(player);
    return props.getBijuuTransformed();
  }
  
  @SubscribeEvent
  public void clawAttack(LivingHurtEvent event) {
    if (event.entity instanceof EntityPlayer) {
      EntityPlayer player = (EntityPlayer)event.entity;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getTransformed() && props.getSusanoActive() == 1) {
        props.consumeMana((int)(event.ammount * 0.3D));
        event.ammount *= 0.7F;
      } 
      if (props.getTransformed() && props.getSusanoActive() == 2) {
        props.consumeMana((int)(event.ammount * 0.4D));
        event.ammount *= 0.6F;
      } 
      if (props.getTransformed() && props.getSusanoActive() == 3) {
        props.consumeMana((int)(event.ammount * 0.5D));
        event.ammount *= 0.5F;
      } 
      if (props.getTransformed() && props.getSusanoActive() == 4) {
        props.consumeMana((int)(event.ammount * 0.6D));
        event.ammount *= 0.4F;
      } 
      if (props.getTransformed() && props.getSusanoActive() == 5) {
        props.consumeMana((int)(event.ammount * 0.7D));
        event.ammount *= 0.3F;
      } 
    } 
    if (event.source.getEntity() instanceof EntityPlayer) {
      EntityPlayer player = (EntityPlayer)event.source.getEntity();
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getTransformed() && (props.getCurseSeal() == 2 || props.getCurseSeal() == 5 || props.getCurseSeal() == 8 || props.getCurseSeal() == 11 || props.getCurseSeal() == 14 || props.getCurseSeal() == 17))
        event.ammount++; 
      if (props.getTransformed() && (props.getCurseSeal() == 3 || props.getCurseSeal() == 6 || props.getCurseSeal() == 9 || props.getCurseSeal() == 12 || props.getCurseSeal() == 15 || props.getCurseSeal() == 18))
        event.ammount += 2.0F; 
      if (props.getTransformed() && props.getBijuuScale() == 2)
        event.ammount += 2.0F; 
      if (props.getTransformed() && props.getBijuuScale() >= 3)
        event.ammount += 6.0F; 
      if (props.getTransformed() && props.getBijuuScale() >= 4)
        event.ammount += 5.0F; 
      if (props.getTransformed() && props.getBijuuScale() >= 5)
        event.ammount += 7.0F; 
      if (props.getTransformed() && props.getSageVersion() >= 1 && props.getSageActive())
        event.ammount += 3.0F; 
    } 
  }
  
  @SubscribeEvent
  public void updateStep(LivingEvent.LivingUpdateEvent event) {
    if (event.entityLiving instanceof EntityPlayer) {
      EntityPlayer player = (EntityPlayer)event.entityLiving;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (player.moveForward > 0.0F) {
        float sharinganadditional = 0.0F;
        float cursesealadditional = 0.0F;
        float sageModeadditional = 0.0F;
        float bijuuaditional = 0.0F;
        float basicBoost = (float)(props.getSpeed() / 10.0D);
        if ((player.onGround || player.capabilities.isFlying) && !player.isInsideOfMaterial(Material.water) && props.getTransformed()) {
          if (props.getSharinganActive()) {
            if (props.getSharingan() == 1)
              sharinganadditional = 0.005F; 
            if (props.getSharingan() == 2)
              sharinganadditional = 0.01F; 
            if (props.getSharingan() == 3)
              sharinganadditional = 0.015F; 
            if (props.getSharingan() >= 4)
              sharinganadditional = 0.02F; 
          } 
          if (props.getCurseSealActive()) {
            if (props.getCurseSeal() == 2 || props.getCurseSeal() == 5 || props.getCurseSeal() == 8 || props.getCurseSeal() == 11 || props.getCurseSeal() == 14 || props.getCurseSeal() == 15)
              cursesealadditional = 0.035F; 
            if (props.getCurseSeal() == 3 || props.getCurseSeal() == 6 || props.getCurseSeal() == 9 || props.getCurseSeal() == 12)
              cursesealadditional = 0.07F; 
          } 
          if (props.getTransformed() && props.getSageActive()) {
            if (props.getSageVersion() == 1)
              sageModeadditional = 0.15F; 
            if (props.getSageVersion() >= 2)
              sageModeadditional = 0.1F; 
          } 
          if (props.getBijuuFormActive()) {
            if (props.getBijuuScale() == 2)
              bijuuaditional = 0.02F; 
            if (props.getBijuuScale() == 3) {
              if (props.getBijuuKind() == 10) {
                player.stepHeight = 2.0F;
              } else {
                player.stepHeight = 1.0F;
              } 
              bijuuaditional = 0.05F;
            } 
            if (props.getBijuuScale() == 4) {
              if (props.getBijuuKind() == 10) {
                player.stepHeight = 2.0F;
              } else {
                player.stepHeight = 1.0F;
              } 
              bijuuaditional = 0.06F;
            } 
            if (props.getBijuuScale() >= 5 && props.getBijuuScale() != 7) {
              if (props.getBijuuKind() == 10) {
                player.stepHeight = 6.0F;
              } else {
                player.stepHeight = 3.0F;
              } 
              bijuuaditional = 0.06F;
            } 
            if (props.getBijuuScale() == 7) {
              player.stepHeight = 1.0F;
              bijuuaditional = 0.001F;
            } 
          } 
        } 
        if (player.isInsideOfMaterial(Material.water) && props.getBijuuFormActive() && props.getBijuuScale() == 7)
          bijuuaditional = 0.05F; 
        if (player.isSprinting()) {
          sharinganadditional *= 2.5F;
          cursesealadditional *= 2.5F;
          sageModeadditional *= 2.5F;
          bijuuaditional *= 2.5F;
          basicBoost *= 2.5F;
        } 
        player.moveFlying(0.0F, 1.0F, sharinganadditional + cursesealadditional + sageModeadditional + bijuuaditional + basicBoost);
      } 
    } 
  }
  
  @SubscribeEvent
  public void jumpHeight(LivingEvent.LivingJumpEvent event) {
    if (event.entityLiving instanceof EntityPlayer) {
      EntityPlayer player = (EntityPlayer)event.entityLiving;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (!player.worldObj.isRemote);
    } 
  }
}

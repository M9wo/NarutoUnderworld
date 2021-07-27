package alcoholmod.Mathioks.ExtraFunctions;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import java.util.UUID;
import net.minecraft.block.material.Material;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.GameRules;

public class JutsuTick {
  private static UUID ChakraHealthBoost = UUID.fromString("a9359d8e-4077-11e6-beb8-9e71128cae77");
  
  private static UUID SpeedBoost = UUID.fromString("70f971d4-af53-11e6-80f5-76304dec7eb7");
  
  private int SageModeCounter = 0;
  
  @SubscribeEvent
  public void ItemPickup(PlayerEvent.ItemPickupEvent event) {
    EntityPlayer player = event.player;
    ExtendedPlayer props = ExtendedPlayer.get(player);
    ItemStack heldItem = player.getCurrentEquippedItem();
    if (props.getTaijutsuMode() && event.player instanceof EntityPlayer)
      if (props.equippedItem == null && props.equippedItem != player.getCurrentEquippedItem()) {
        if (props.getTaijutsu() >= 2.5D && player.inventory.getFirstEmptyStack() != -1)
          if (player.getCurrentEquippedItem().isStackable()) {
            if (player.inventory.addItemStackToInventory(new ItemStack(player.getCurrentEquippedItem().getItem(), player.getCurrentEquippedItem().getMaxStackSize(), player.getCurrentEquippedItem().getItemDamage())))
              player.destroyCurrentEquippedItem(); 
          } else if (player.inventory.addItemStackToInventory(player.getCurrentEquippedItem())) {
            player.destroyCurrentEquippedItem();
          }  
      } else if (props.equippedItem == null || props.equippedItem != player.getCurrentEquippedItem()) {
      
      }  
  }
  
  @SubscribeEvent
  public void playerTick(TickEvent.PlayerTickEvent event) {
    if (event.phase == TickEvent.Phase.START) {
      EntityPlayer player = event.player;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getmangekyouSharingan() == 50) {
        if (props.getSharingan() == 1)
          props.setSharingan(100); 
        if (props.getSharingan() == 2)
          props.setSharingan(101); 
        if (props.getSharingan() == 3)
          props.setSharingan(102); 
      } 
      if (props.getBijuuKind() == 3 && player.isInsideOfMaterial(Material.water))
        player.setAir(300); 
      ItemStack heldItem = player.getCurrentEquippedItem();
      if (!player.worldObj.isRemote)
        props.setTaijutsuMode((heldItem == null)); 
      AttributeModifier ChakraHealthBoostModifier = new AttributeModifier(ChakraHealthBoost, "Chakra Health Boost", (props.getHealth() - props.getHealth() % 2.0D) / 20.0D, 1);
      IAttributeInstance iattributeinstance = player.getEntityAttribute(SharedMonsterAttributes.maxHealth);
      iattributeinstance.removeModifier(ChakraHealthBoostModifier);
      iattributeinstance.applyModifier(ChakraHealthBoostModifier);
      AttributeModifier SpeedBoostModifier = new AttributeModifier(SpeedBoost, "Speed Boost", props.getSpeed() / 2.0D, 1);
      IAttributeInstance iattributeinstanceSpeed = player.getEntityAttribute(SharedMonsterAttributes.movementSpeed);
      iattributeinstance.removeModifier(SpeedBoostModifier);
      iattributeinstance.applyModifier(SpeedBoostModifier);
    } 
  }
  
  @SubscribeEvent
  public void playerRespawn(PlayerEvent.PlayerRespawnEvent event) {
    EntityPlayer player = event.player;
    ExtendedPlayer props = ExtendedPlayer.get(player);
    int health = props.getHealth() / 2 + 20;
    AttributeModifier ChakraHealthBoostModifier = new AttributeModifier(ChakraHealthBoost, "Chakra Health Boost", props.getHealth() / 20.0D, 1);
    IAttributeInstance iattributeinstance = player.getEntityAttribute(SharedMonsterAttributes.maxHealth);
    iattributeinstance.removeModifier(ChakraHealthBoostModifier);
    iattributeinstance.applyModifier(ChakraHealthBoostModifier);
    player.setHealth(player.getMaxHealth());
    props.replenishMana();
    if (props.getIzanagi() == 1) {
      props.setIzanagi(2);
      PacketDispatcher.sendTo((IMessage)new SyncIzanagiMessage(player), (EntityPlayerMP)player);
    } 
  }
  
  @SubscribeEvent
  public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
    GameRules gameRules = MinecraftServer.getServer().worldServerForDimension(0).getGameRules();
    gameRules.setOrCreateGameRule("keepInventory", "true");
  }
}

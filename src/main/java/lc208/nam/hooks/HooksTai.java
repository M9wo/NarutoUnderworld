package lc208.nam.hooks;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncClanMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCurseSealMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCurseSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncDrunkenFistMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncIntelligenceMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncNinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSpeedMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncTaijutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncshikotsumyakuMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import lc208.nam.hooklib.asm.Hook;
import lc208.nam.hooklib.asm.ReturnCondition;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import nhm.coffee.NarutoHelperMod.ExAddedItems;
import nhm.coffee.NarutoHelperMod.items.Clans.SetHatake;
import nhm.coffee.NarutoHelperMod.items.Clans.SetHyuga;
import nhm.coffee.NarutoHelperMod.items.Clans.SetInuzuka;
import nhm.coffee.NarutoHelperMod.items.Clans.SetKaguya;
import nhm.coffee.NarutoHelperMod.items.Clans.SetLee;
import nhm.coffee.NarutoHelperMod.util.EXExtendedProperties;

public class HooksTai {
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static ItemStack onItemRightClick(SetHatake h, ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      EXExtendedProperties props2 = EXExtendedProperties.get(Par3EntityPlayer);
      props.setClan(5);
      PacketDispatcher.sendTo((IMessage)new SyncClanMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
      Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You are part of the Hatake Clan"));
      if (props2.Hatake == 0) {
        props2.setHatake(1);
        props.Kenjutsu++;
        PacketDispatcher.sendTo((IMessage)new SyncKenjutsuMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        props.Ninjutsu += 50;
        PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        props.Intelligence += 5;
        PacketDispatcher.sendTo((IMessage)new SyncIntelligenceMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        props.Speed += 0.125D;
        PacketDispatcher.sendTo((IMessage)new SyncSpeedMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkilllearnerTaijutsu));
        Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("As a Hatake you have natural affinity for Kenjutsu"));
        Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You received the Clan Item 'White Light Chakra Sabre'"));
      } else {
        Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You already have the Clan Item 'White Light Chakra Sabre'"));
      } 
      if (Par3EntityPlayer.inventory.hasItem(ExAddedItems.SetHatake)) {
        Par3EntityPlayer.inventory.consumeInventoryItem(ExAddedItems.SetHatake);
        Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
      } 
    } 
    return Par1ItemStack;
  }
  
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static ItemStack onItemRightClick(SetLee h, ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      EXExtendedProperties props2 = EXExtendedProperties.get(Par3EntityPlayer);
      props.setClan(22);
      PacketDispatcher.sendTo((IMessage)new SyncClanMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
      Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You are part of the Lee Clan"));
      if (!props.DrunkenFist) {
        props.setDrunkenFist(true);
        props.Taijutsu++;
        Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkilllearnerTaijutsu));
        Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLee));
        props.Speed = 0.2D;
        PacketDispatcher.sendTo((IMessage)new SyncSpeedMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        PacketDispatcher.sendTo((IMessage)new SyncTaijutsuMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        PacketDispatcher.sendTo((IMessage)new SyncDrunkenFistMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("As a member of the Lee clan you have"));
        Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("Being nauseous will give you boosts."));
      } else {
        Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You have the trait 'Drunken Fist!'"));
      } 
      if (Par3EntityPlayer.inventory.hasItem(ExAddedItems.SetLee)) {
        Par3EntityPlayer.inventory.consumeInventoryItem(ExAddedItems.SetLee);
        Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
      } 
    } 
    return Par1ItemStack;
  }
  
  @Hook
  public static void onItemRightClick(SetInuzuka h, ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      EXExtendedProperties props2 = EXExtendedProperties.get(Par3EntityPlayer);
      if (props2.Inuzuka == 0)
        Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkilllearnerTaijutsu)); 
    } 
  }
  
  @Hook
  public static void onItemRightClick(SetHyuga h, ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.byakugan == 0)
        Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkilllearnerTaijutsu)); 
    } 
  }
  
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static ItemStack onItemRightClick(SetKaguya h, ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      EXExtendedProperties props2 = EXExtendedProperties.get(Par3EntityPlayer);
      props.setClan(11);
      PacketDispatcher.sendTo((IMessage)new SyncClanMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
      Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You are part of the Kaguya Clan"));
      if (props.shikotsumyaku == 0) {
        props.setshikotsumyaku(1);
        props.Kenjutsu++;
        PacketDispatcher.sendTo((IMessage)new SyncKenjutsuMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        props.Ninjutsu += 50;
        PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        props.Speed += 0.125D;
        PacketDispatcher.sendTo((IMessage)new SyncSpeedMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        PacketDispatcher.sendTo((IMessage)new SyncshikotsumyakuMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        props.setCurseSize(1);
        PacketDispatcher.sendTo((IMessage)new SyncCurseSizeMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        props.setCurseSeal(4);
        PacketDispatcher.sendTo((IMessage)new SyncCurseSealMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You unlocked the Kimmimaro Curse Sage!"));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Shikotsumyaku!"));
        Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkilllearnerTaijutsu));
        Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerKaguya));
        Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ItemKaguyaBone2));
        Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
      } else {
        Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You already have the Kimimaro Curse Sage!"));
        Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You already have the Shikotsumyaku!"));
      } 
      if (Par3EntityPlayer.inventory.hasItem(ExAddedItems.SetKaguya)) {
        Par3EntityPlayer.inventory.consumeInventoryItem(ExAddedItems.SetKaguya);
        Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
      } 
    } 
    return Par1ItemStack;
  }
}

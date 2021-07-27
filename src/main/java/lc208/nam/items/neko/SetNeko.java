package lc208.nam.items.neko;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncClanMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncNinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSummoningMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import nhm.coffee.NarutoHelperMod.NHMMain;
import nhm.coffee.NarutoHelperMod.libs.EXPacketDispatcher;
import nhm.coffee.NarutoHelperMod.libs.sync.SyncAburameMessage;

public class SetNeko extends Item {
  public SetNeko() {
    setUnlocalizedName("SetNeko");
    setCreativeTab(NHMMain.tabNHM);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (!props.getClanName().contains("Neko")) {
        props.setClan(19);
        PacketDispatcher.sendTo((IMessage)new SyncClanMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("You are part of the Neko Clan"));
        props.Ninjutsu += 100;
        PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        props.Summoning += 10;
        PacketDispatcher.sendTo((IMessage)new SyncSummoningMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        props.Kinjutsu += 5;
        PacketDispatcher.sendTo((IMessage)new SyncKinjutsuMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerNeko));
        Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
        EXPacketDispatcher.sendTo((IMessage)new SyncAburameMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
      } else {
        Par3EntityPlayer.addChatMessage((IChatComponent)new ChatComponentText("you already know the ways of the Neko"));
      } 
      if (Par3EntityPlayer.inventory.hasItem(AlcoholMod.SetNeko)) {
        Par3EntityPlayer.inventory.consumeInventoryItem(AlcoholMod.SetNeko);
        Par3EntityPlayer.inventoryContainer.detectAndSendChanges();
      } 
    } 
    return Par1ItemStack;
  }
}

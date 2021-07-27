package alcoholmod.Mathioks.Quests;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncDQuestsMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class DQuest extends Item {
  public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3Player) {
    par1ItemStack.stackTagCompound = new NBTTagCompound();
    par1ItemStack.stackTagCompound.setInteger("Owner", par2World.rand.nextInt(17));
    par1ItemStack.stackTagCompound.setInteger("Code", par2World.rand.nextInt(9) + 1);
  }
  
  public DQuest() {
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (!par2World.isRemote && (EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Receiver", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setInteger("Owner", par2World.rand.nextInt(10));
        par1ItemStack.stackTagCompound.setInteger("Code", par2World.rand.nextInt(10) + 10);
        par1ItemStack.stackTagCompound.setBoolean("Cheated", false);
      } 
      if (par1ItemStack.stackTagCompound != null) {
        Item item = Items.apple;
        int owner = par1ItemStack.stackTagCompound.getInteger("Owner");
        if (owner == 0)
          item = Item.getItemFromBlock(Blocks.wool); 
        if (owner == 1)
          item = Items.apple; 
        if (owner == 2)
          item = Items.fish; 
        if (owner == 3)
          item = Items.cooked_beef; 
        if (owner == 4)
          item = Items.beef; 
        if (owner == 5)
          item = Items.coal; 
        if (owner == 6)
          item = Items.chicken; 
        if (owner == 7)
          item = Items.cooked_chicken; 
        if (owner == 8)
          item = Items.cooked_fished; 
        if (owner == 9)
          item = Items.cooked_porkchop; 
        if (owner == 10)
          item = Items.egg; 
        if (owner == 11)
          item = Items.feather; 
        if (owner == 12)
          item = Items.leather; 
        if (owner == 13)
          item = Items.paper; 
        if (owner == 14)
          item = Items.snowball; 
        if (owner == 15)
          item = Items.sugar; 
        if (owner == 16)
          item = Items.wheat; 
        par1ItemStack.stackTagCompound.setString("item", item.getItemStackDisplayName(par1ItemStack).toString());
        par1ItemStack.stackTagCompound.setInteger("itemget", Item.getIdFromItem(item));
        if (((EntityPlayer)par3Entity).capabilities.isCreativeMode && !par1ItemStack.stackTagCompound.getBoolean("Cheated")) {
          ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "You cannot go into creative mode while doing a Mission"));
          ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mission Failed"));
          par1ItemStack.stackTagCompound.setBoolean("Cheated", true);
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    if (par1ItemStack.getItemDamage() >= 0 && !par2World.isRemote && par1ItemStack.stackTagCompound != null) {
      if (!par1ItemStack.stackTagCompound.getBoolean("Cheated") && !player.capabilities.isCreativeMode && par1ItemStack.stackTagCompound.getString("Receiver").equals(player.getCommandSenderName())) {
        if (par1ItemStack.stackSize != 1)
          par1ItemStack.setItemDamage(500); 
        if (par1ItemStack.getItemDamage() == 500) {
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Computer says no"));
        } else {
          int code = par1ItemStack.stackTagCompound.getInteger("Code");
          int owner = par1ItemStack.stackTagCompound.getInteger("Owner");
          String item = par1ItemStack.stackTagCompound.getString("item");
          Item here = Item.getItemById(par1ItemStack.stackTagCompound.getInteger("itemget"));
          if (player.inventory.hasItem(here)) {
            if (code > 1) {
              player.inventory.consumeInventoryItem(here);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("Still " + (code - 1) + " " + item + " to go"));
              par1ItemStack.stackTagCompound.setInteger("Code", par1ItemStack.stackTagCompound.getInteger("Code") - 1);
              par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() + 1);
              return par1ItemStack;
            } 
            if (code == 1) {
              player.inventory.consumeInventoryItem(here);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("D-Mission Completed"));
              par1ItemStack.stackSize--;
              int c = par2World.rand.nextInt(4) + 2;
              int a = par2World.rand.nextInt(10) + 5;
              for (int b = 0; b < a; b++)
                player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.RyoBronze)); 
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("Received " + a + " Bronze Ryo"));
              ExtendedPlayer props = ExtendedPlayer.get(player);
              props.setDQuests(props.getDQuests() + 1);
              PacketDispatcher.sendTo((IMessage)new SyncDQuestsMessage(player), (EntityPlayerMP)player);
              props.setChakraExperience(props.getChakraExperience() + c);
              PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage(player), (EntityPlayerMP)player);
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("Gained " + c + " Experience"));
              return par1ItemStack;
            } 
          } 
        } 
      } 
      if (par1ItemStack.stackTagCompound.getBoolean("Cheated"))
        par1ItemStack.stackSize--; 
    } 
    return par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    if (par1ItemStack.stackTagCompound != null) {
      ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Receiver"));
      int code = par1ItemStack.stackTagCompound.getInteger("Code");
      int owner = par1ItemStack.stackTagCompound.getInteger("Owner");
      String item = par1ItemStack.stackTagCompound.getString("item");
      par3List.add(EnumChatFormatting.DARK_AQUA + "Needed: " + code + " " + item);
    } 
  }
}

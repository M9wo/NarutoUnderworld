package alcoholmod.Mathioks.Quests;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncAQuestsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class AQuest extends Item {
  public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3Player) {
    par1ItemStack.stackTagCompound = new NBTTagCompound();
    par1ItemStack.stackTagCompound.setInteger("Owner", par2World.rand.nextInt(19));
    par1ItemStack.stackTagCompound.setInteger("Code", par2World.rand.nextInt(6) + 4);
  }
  
  public AQuest() {
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (!par2World.isRemote && par1ItemStack.stackTagCompound != null) {
      int code = par1ItemStack.stackTagCompound.getInteger("Code");
      Item item = Items.apple;
      int owner = par1ItemStack.stackTagCompound.getInteger("Owner");
      if (owner == 0)
        item = Items.ghast_tear; 
      if (owner == 1)
        item = Items.clock; 
      if (owner == 2)
        item = Items.brewing_stand; 
      if (owner == 3)
        item = Items.fire_charge; 
      if (owner == 4)
        item = Items.magma_cream; 
      if (owner == 6)
        item = Items.fermented_spider_eye; 
      if (owner == 7)
        item = Items.golden_axe; 
      if (owner == 8)
        item = Items.golden_apple; 
      if (owner == 9)
        item = Items.golden_carrot; 
      if (owner == 10)
        item = Items.golden_hoe; 
      if (owner == 11)
        item = Items.golden_pickaxe; 
      if (owner == 12)
        item = Items.golden_shovel; 
      if (owner == 13)
        item = Items.golden_sword; 
      if (owner == 14)
        item = Items.golden_boots;
      if (owner == 15)
        item= Items.golden_chestplate;
      if (owner == 16)
        item= Items.golden_leggings;
      if (owner == 17)
        item= Items.golden_helmet;
      if (owner == 18)
        item = Items.blaze_powder; 
      if (owner == 5)
        item = Items.blaze_rod; 
      par1ItemStack.stackTagCompound.setString("item", item.getItemStackDisplayName(par1ItemStack).toString());
      par1ItemStack.stackTagCompound.setInteger("itemget", Item.getIdFromItem(item));
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    if (par1ItemStack.getItemDamage() >= 0 && !par2World.isRemote && par1ItemStack.stackTagCompound != null) {
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
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("A-Mission Completed"));
          par1ItemStack.stackSize--;
          int c = par2World.rand.nextInt(100) + 25;
          int a = par2World.rand.nextInt(13) + 5;
          for (int b = 0; b < a; b++)
            player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.RyoSilver)); 
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Received " + a + " Silver Ryo"));
          ExtendedPlayer props = ExtendedPlayer.get(player);
          props.setAQuests(props.getAQuests() + 1);
          PacketDispatcher.sendTo((IMessage)new SyncAQuestsMessage(player), (EntityPlayerMP)player);
          props.setChakraExperience(props.getChakraExperience() + 4);
          PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage(player), (EntityPlayerMP)player);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Gained " + c + " Experience"));
          return par1ItemStack;
        } 
      } 
    } 
    return par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    if (par1ItemStack.stackTagCompound != null) {
      ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
      int code = par1ItemStack.stackTagCompound.getInteger("Code");
      int owner = par1ItemStack.stackTagCompound.getInteger("Owner");
      String item = par1ItemStack.stackTagCompound.getString("item");
      par3List.add(EnumChatFormatting.DARK_AQUA + "Needed: " + code + " " + item);
    } 
  }
}

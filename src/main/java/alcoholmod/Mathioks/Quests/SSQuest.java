package alcoholmod.Mathioks.Quests;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSSQuestsMessage;
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
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class SSQuest extends Item {
  public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3Player) {
    par1ItemStack.stackTagCompound = new NBTTagCompound();
    par1ItemStack.stackTagCompound.setInteger("Owner", par2World.rand.nextInt(3));
    par1ItemStack.stackTagCompound.setInteger("Code", par2World.rand.nextInt(2) + 2);
  }
  
  public SSQuest() {
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (!par2World.isRemote && par1ItemStack.stackTagCompound != null) {
      int code = par1ItemStack.stackTagCompound.getInteger("Code");
      Item item = Items.apple;
      int owner = par1ItemStack.stackTagCompound.getInteger("Owner");
      if (owner == 0)
        item = AlcoholMod.undefinedDNA; 
      if (owner == 1)
        item = AlcoholMod.WorldMystery; 
      if (owner == 2)
        item = Items.nether_star; 
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
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("SS-Mission Completed"));
          par1ItemStack.stackSize--;
          int c = par2World.rand.nextInt(175) + 75;
          int a = par2World.rand.nextInt(38) + 17;
          for (int b = 0; b < a; b++)
            player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.RyoSilver)); 
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Received " + a + " Silver Ryo"));
          ExtendedPlayer props = ExtendedPlayer.get(player);
          props.setSSQuests(props.getSSQuests() + 1);
          PacketDispatcher.sendTo((IMessage)new SyncSSQuestsMessage(player), (EntityPlayerMP)player);
          props.setChakraExperience(props.getChakraExperience() + c);
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

package alcoholmod.Mathioks.PresentBoxes;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import lc208.tools;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class SubsPresent5000 extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public SubsPresent5000() {
    setMaxDamage(600);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        if (!Par3EntityPlayer.capabilities.isCreativeMode) {
          ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
          int EmptySpaces = tools.freeSpace(Par3EntityPlayer.inventory.mainInventory);
          if (EmptySpaces > 5) {
            Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.BrooklynrageRamen, 15));
            Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.RegularJutsuItem, 1));
            Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.RareJutsuItem, 1));
            Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.RyoGold, 16));
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mathioks: Thank you " + Par3EntityPlayer.getCommandSenderName() + " for the support"));
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mathioks: both on the mod, aswell as on the channel once again!"));
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mathioks: Since we reached 5000 subscribers, I wanted"));
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mathioks: to give you another package with some items to"));
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mathioks: aid you in your adventure to becoming the"));
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Mathioks: greatest shinobi of all time!"));
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "-Mathioks"));
            Par1ItemStack.stackSize--;
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You need 6 free spaces in your Inventory"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You cannot use this item in Creative Mode"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
      }  
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    if (par1ItemStack.getItemDamage() == 0) {
      par3List.add(EnumChatFormatting.GOLD + "A package containing some useful items");
      par3List.add(EnumChatFormatting.GOLD + "for any shinobi.");
      par3List.add(EnumChatFormatting.GOLD + "Put together by BrooklynRage and Mathioks");
      par3List.add(EnumChatFormatting.GOLD + "to commemorate 5000 Subscribers on");
      par3List.add(EnumChatFormatting.GOLD + "the 'Mathioks Youtube Channel'");
    } 
  }
}

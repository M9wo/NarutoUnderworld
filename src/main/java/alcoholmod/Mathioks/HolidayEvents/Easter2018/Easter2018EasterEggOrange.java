package alcoholmod.Mathioks.HolidayEvents.Easter2018;

import alcoholmod.Mathioks.AddedItems;
import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Calendar;
import java.util.List;
import lc208.tools;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class Easter2018EasterEggOrange extends Item {
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      Calendar calendar = par3Entity.worldObj.getCurrentDate();
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      if (calendar.get(2) + 1 == 3 && calendar.get(5) >= 30)
        par1ItemStack.stackTagCompound.setInteger("Obtained", 1); 
      if (calendar.get(2) + 1 == 4 && calendar.get(5) >= 1 && calendar.get(5) <= 9)
        par1ItemStack.stackTagCompound.setInteger("Obtained", 1); 
    } 
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      int EmptySpaces = tools.freeSpace(Par3EntityPlayer.inventory.mainInventory);
      if (EmptySpaces > 0) {
        Calendar calendar = Par3EntityPlayer.worldObj.getCurrentDate();
        if (calendar.get(2) + 1 == 3 && calendar.get(5) >= 30) {
          if (Par1ItemStack.stackTagCompound.getInteger("Obtained") == 1) {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You open the Easter Egg..."));
            int rand = Par2World.rand.nextInt(20) + 1;
            if (rand >= 0 && rand <= 9) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.Easter2018EasterEgg));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You found a Chocolate Easter Egg inside!"));
            } 
            if (rand >= 10 && rand <= 18) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.RyoSilver));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You found a Silver Ryo inside!"));
            } 
            if (rand == 19) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.Easter2018EasterToken));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "You found an Easter Token inside..."));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Best hold on to this for later!"));
            } 
            if (rand == 20) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AddedItems.Easter2018Weapon));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You open the Easter Egg..."));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "CONGRATULATIONS! You found the Secret Item:"));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Kurousagi's Blade!"));
            } 
            Par1ItemStack.stackSize--;
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You try to open the egg, but it won't budge"));
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Seems like you can only open Easter eggs during Easter."));
          } 
        } else if (calendar.get(2) + 1 == 4 && calendar.get(5) >= 1 && calendar.get(5) <= 9) {
          if (Par1ItemStack.stackTagCompound.getInteger("Obtained") == 1) {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You open the Easter Egg..."));
            int rand = Par2World.rand.nextInt(20) + 1;
            if (rand >= 0 && rand <= 9) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.Easter2018EasterEgg));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You found a Chocolate Easter Egg inside!"));
            } 
            if (rand >= 10 && rand <= 18) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.RyoSilver));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You found a Silver Ryo inside!"));
            } 
            if (rand == 19) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.Easter2018EasterToken));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "You found an Easter Token inside..."));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.RED + "Best hold on to this for later!"));
            } 
            if (rand == 20) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AddedItems.Easter2018Weapon));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You open the Easter Egg..."));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "CONGRATULATIONS! You found the Secret Item:"));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Kurousagi's Blade!"));
            } 
            Par1ItemStack.stackSize--;
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You try to open the egg, but it won't budge"));
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Seems like you can only open Easter eggs during Easter."));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You try to open the egg, but it won't budge"));
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Seems like you can only open Easter eggs during Easter."));
        } 
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.GOLD + "A Orange Easter Egg...");
    par3List.add(EnumChatFormatting.GOLD + "Right click it to find out what's inside!");
    par3List.add(EnumChatFormatting.ITALIC + "BE SURE TO OPEN IT BEFORE 9 APRIL!");
  }
}

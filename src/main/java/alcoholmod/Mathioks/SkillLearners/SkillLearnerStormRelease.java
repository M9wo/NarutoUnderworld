package alcoholmod.Mathioks.SkillLearners;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncJutsuPointsMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import lc208.tools;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class SkillLearnerStormRelease extends Item {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public SkillLearnerStormRelease() {
    setMaxDamage(500);
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
          if (EmptySpaces > 0) {
            if (props.getJutsuPoints() >= 20 && Par1ItemStack.getItemDamage() == 0) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.StormReleaseDemon));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Storm Release: Demon Storm!"));
              props.setJutsuPoints(props.getJutsuPoints() - 20);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(300);
            } else if (props.getJutsuPoints() >= 50 && Par1ItemStack.getItemDamage() == 300) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.StormReleaseInnerWave));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Storm Release: Thunder Cloud Inner Wave!"));
              props.setJutsuPoints(props.getJutsuPoints() - 50);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(400);
            } else if (props.getJutsuPoints() >= 50 && Par1ItemStack.getItemDamage() == 400) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.StormReleaseDemonStorm));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Storm Release: Demon Dragon Storm!"));
              props.setJutsuPoints(props.getJutsuPoints() - 50);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.stackSize--;
            } else {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough Jutsu Points (JP)"));
            } 
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You need an extra free space in your Inventory"));
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
      par3List.add(EnumChatFormatting.GOLD + "Learn Storm Release: Demon Storm");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 20 JP");
    } 
    if (par1ItemStack.getItemDamage() == 100) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Storm Release: Laser Circus");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 30 JP");
    } 
    if (par1ItemStack.getItemDamage() == 200) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Storm Release: Black Hunting");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
    } 
    if (par1ItemStack.getItemDamage() == 300) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Storm Release: Thunder Cloud Inner Wave");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 50 JP");
    } 
    if (par1ItemStack.getItemDamage() == 400) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Storm Release: Demon Dragon Storm");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 50 JP");
    } 
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
  }
}

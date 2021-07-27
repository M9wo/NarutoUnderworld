package lc208.nam.items;

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

public class SkillLearnerLee extends Item {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public SkillLearnerLee() {
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
          if (props.getClanName().contains("Lee")) {
            int EmptySpaces = tools.freeSpace(Par3EntityPlayer.inventory.mainInventory);
            if (EmptySpaces > 0) {
              if (props.getJutsuPoints() >= 30 && Par1ItemStack.getItemDamage() == 0) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.EightGates));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Taijutsu: Eight Inner Gates!"));
                props.setJutsuPoints(props.getJutsuPoints() - 30);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(100);
              } else if (props.getJutsuPoints() >= 35 && Par1ItemStack.getItemDamage() == 100) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.EveningElephant));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Taijutsu: Evening Elephant!"));
                props.setJutsuPoints(props.getJutsuPoints() - 35);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(200);
              } else if (props.getJutsuPoints() >= 40 && Par1ItemStack.getItemDamage() == 200) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.DaytimeTiger));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Taijutsu: Daytime Tiger!"));
                props.setJutsuPoints(props.getJutsuPoints() - 40);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(300);
              } else if (props.getJutsuPoints() >= 50 && Par1ItemStack.getItemDamage() == 300) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.LeafDragonGodItem));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Taijutsu: Leaf Dragon God!"));
                props.setJutsuPoints(props.getJutsuPoints() - 50);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(400);
              } else if (props.getJutsuPoints() >= 50 && Par1ItemStack.getItemDamage() == 400) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.NightGuy));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Taijutsu: Night Guy!"));
                props.setJutsuPoints(props.getJutsuPoints() - 50);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.stackSize--;
              } else {
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough Jutsu Points (JP)"));
              } 
            } else {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You need an extra free space in your Inventory"));
            } 
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
      par3List.add(EnumChatFormatting.GOLD + "Learn Taijutsu: Eight Inner Gates");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 30 JP");
    } 
    if (par1ItemStack.getItemDamage() == 100) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Taijutsu: Evening Elephant");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 35 JP");
    } 
    if (par1ItemStack.getItemDamage() == 200) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Taijutsu: Daytime Tiger");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
    } 
    if (par1ItemStack.getItemDamage() == 300) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Taijutsu: Leaf Dragon God");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 50 JP");
    } 
    if (par1ItemStack.getItemDamage() == 400) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Taijutsu: Night Guy");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 50 JP");
    } 
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
  }
}

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

public class SkillLearnerInuzuka extends Item {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public SkillLearnerInuzuka() {
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
            if (props.getJutsuPoints() >= 5 && Par1ItemStack.getItemDamage() == 0) {
              int rand = Par2World.rand.nextInt(2);
              if (rand == 1) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.InuzukaSpawnAkamaru));
              } else {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.InuzukaSpawnKuromaru));
              } 
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You have acquired your own Dog Companion!"));
              props.setJutsuPoints(props.getJutsuPoints() - 5);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(100);
            } else if (props.getJutsuPoints() >= 15 && Par1ItemStack.getItemDamage() == 100) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.InuzukaBeastHumanClone));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Inuzuka: Beast Human Clone!"));
              props.setJutsuPoints(props.getJutsuPoints() - 15);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(200);
            } else if (props.getJutsuPoints() >= 20 && Par1ItemStack.getItemDamage() == 200) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.InuzukaPassingFangOverFang));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Inuzuka: Fang Passing Fang!"));
              props.setJutsuPoints(props.getJutsuPoints() - 20);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.stackSize--;
            } else if (props.getJutsuPoints() >= 25 && Par1ItemStack.getItemDamage() == 300) {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Four Legs Technique is not available yet"));
            } else if (props.getJutsuPoints() >= 25 && Par1ItemStack.getItemDamage() == 400) {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Inuzuka: Tail Chasing Fang Fang Rotating Fang!"));
              props.setJutsuPoints(props.getJutsuPoints() - 25);
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
      par3List.add(EnumChatFormatting.GOLD + "Acquire your own Dog Companion!");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 5 JP");
    } 
    if (par1ItemStack.getItemDamage() == 100) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Inuzuka: Beast Human Clone");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 15 JP");
    } 
    if (par1ItemStack.getItemDamage() == 200) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Inuzuka: Passing Fang Over Fang");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 20 JP");
    } 
    if (par1ItemStack.getItemDamage() == 300) {
      par3List.add(EnumChatFormatting.STRIKETHROUGH + "Not yet available");
      par3List.add(EnumChatFormatting.GOLD + "Learn Inuzuka: Four Legs Technique");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 25 JP");
    } 
    if (par1ItemStack.getItemDamage() == 400) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Inuzuka: Tail Chasing Fang Fang Rotating Fang");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 25 JP");
    } 
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
  }
}

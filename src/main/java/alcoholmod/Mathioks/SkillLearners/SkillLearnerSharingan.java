package alcoholmod.Mathioks.SkillLearners;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncIzanagiMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncJutsuPointsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganMessage;
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

public class SkillLearnerSharingan extends Item {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public SkillLearnerSharingan() {
    setMaxDamage(800);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setDouble("Unlock", 0.1D);
        par1ItemStack.stackTagCompound.setBoolean("Letter1", false);
        par1ItemStack.stackTagCompound.setBoolean("Letter2", false);
      } 
      if (par1ItemStack.stackTagCompound != null);
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        if (!Par3EntityPlayer.capabilities.isCreativeMode) {
          ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
          int EmptySpaces = tools.freeSpace(Par3EntityPlayer.inventory.mainInventory);
          if (EmptySpaces > 0) {
            if (props.getSharingan() >= 1) {
              if (props.getJutsuPoints() >= 10 && Par1ItemStack.getItemDamage() == 0) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SharinganCrows));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Sharingan: Genjutsu Crows!"));
                props.setJutsuPoints(props.getJutsuPoints() - 10);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(100);
              } else if (props.getJutsuPoints() >= 10 && Par1ItemStack.getItemDamage() == 100) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SharinganGenjutsuCrows));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Sharingan: Genjutsu Crow Diffuse!"));
                props.setJutsuPoints(props.getJutsuPoints() - 10);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(200);
              } else if (props.getJutsuPoints() >= 15 && Par1ItemStack.getItemDamage() == 200) {
                props.setSharingan(2);
                PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your Sharingan gained a Tomoe!"));
                props.setJutsuPoints(props.getJutsuPoints() - 15);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(300);
              } else if (props.getJutsuPoints() >= 20 && Par1ItemStack.getItemDamage() == 300) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SharinganNegativeConfusion));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Sharingan: Demonic Illusion Nail Paralysis!"));
                props.setJutsuPoints(props.getJutsuPoints() - 20);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(400);
              } else if (props.getJutsuPoints() >= 20 && Par1ItemStack.getItemDamage() == 400) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SharinganCoercion));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Sharingan: Coercion Sharingan!"));
                props.setSharingan(3);
                Par1ItemStack.stackTagCompound.setBoolean("Letter1", true);
                Par1ItemStack.stackTagCompound.setDouble("Unlock", 0.1D);
                PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your Sharingan gained a Tomoe!"));
                props.setJutsuPoints(props.getJutsuPoints() - 20);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(500);
              } else if (props.getJutsuPoints() >= 30 && Par1ItemStack.getItemDamage() == 500) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SharinganShacklingStakesTechnique));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Sharingan: Demonic Illusion Shackling Stakes Technique!"));
                props.setJutsuPoints(props.getJutsuPoints() - 30);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(600);
              } else if (props.getJutsuPoints() >= 40 && Par1ItemStack.getItemDamage() == 600) {
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Sharingan: Izanagi!"));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("This is a Passive Jutsu that will take effect on its own"));
                props.setIzanagi(2);
                PacketDispatcher.sendTo((IMessage)new SyncIzanagiMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                props.setJutsuPoints(props.getJutsuPoints() - 40);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.stackSize--;
              } else {
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough Jutsu Points (JP)"));
              } 
            } else {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You have not unlocked the Sharingan yet"));
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
      par3List.add(EnumChatFormatting.GOLD + "Learn Sharingan: Genjutsu Crows");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 10 JP");
    } 
    if (par1ItemStack.getItemDamage() == 100) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Sharingan: Genjutsu Crow Diffuse");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 10 JP");
    } 
    if (par1ItemStack.getItemDamage() == 200) {
      par3List.add(EnumChatFormatting.GOLD + "Gain an extra Tomoe!");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 15 JP");
    } 
    if (par1ItemStack.getItemDamage() == 300) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Sharingan: Negative Confusion");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 20 JP");
    } 
    if (par1ItemStack.getItemDamage() == 400) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Sharingan: Coercion Sharingan");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 20 JP");
    } 
    if (par1ItemStack.getItemDamage() == 500) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Sharingan: Demonic Illusion Shackling Stakes Technique");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 30 JP");
    } 
    if (par1ItemStack.getItemDamage() == 600) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Sharingan: Izanagi");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
    } 
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
  }
}

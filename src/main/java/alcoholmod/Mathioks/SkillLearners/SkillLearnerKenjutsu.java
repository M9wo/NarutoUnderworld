package alcoholmod.Mathioks.SkillLearners;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncJutsuPointsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsuSkillsMessage;
import alcoholmod.Mathioks.Final.JutsuItem;
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
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class SkillLearnerKenjutsu extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public SkillLearnerKenjutsu() {
    setMaxDamage(800);
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
            if (props.getKenjutsu() >= 2.0D) {
              if (props.getJutsuPoints() >= 5 && Par1ItemStack.getItemDamage() == 0) {
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Kenjutsu: Heaven Cutter!"));
                props.setJutsuPoints(props.getJutsuPoints() - 5);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                props.setKenjutsuSkills(1);
                PacketDispatcher.sendTo((IMessage)new SyncKenjutsuSkillsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(100);
              } else if (props.getJutsuPoints() >= 7 && Par1ItemStack.getItemDamage() == 100) {
                props.setKenjutsuSkills(2);
                PacketDispatcher.sendTo((IMessage)new SyncKenjutsuSkillsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Kenjutsu: Moonlight!"));
                props.setJutsuPoints(props.getJutsuPoints() - 7);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(300);
              } else if (props.getJutsuPoints() >= 20 && Par1ItemStack.getItemDamage() == 300) {
                props.setKenjutsuSkills(4);
                PacketDispatcher.sendTo((IMessage)new SyncKenjutsuSkillsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Kenjutsu: Crescent Moon Beheading!"));
                props.setJutsuPoints(props.getJutsuPoints() - 20);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(400);
              } else if (props.getJutsuPoints() >= 25 && Par1ItemStack.getItemDamage() == 400) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.HeavenCutter));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Kenjutsu: Samurai Sabre Technique!"));
                props.setJutsuPoints(props.getJutsuPoints() - 25);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(500);
              } else if (props.getJutsuPoints() >= 30 && Par1ItemStack.getItemDamage() == 500) {
                props.setKenjutsuSkills(5);
                PacketDispatcher.sendTo((IMessage)new SyncKenjutsuSkillsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Kenjutsu: Flash!"));
                props.setJutsuPoints(props.getJutsuPoints() - 30);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(600);
              } else if (props.getJutsuPoints() >= 30 && Par1ItemStack.getItemDamage() == 600) {
                props.setKenjutsuSkills(6);
                PacketDispatcher.sendTo((IMessage)new SyncKenjutsuSkillsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Kenjutsu: Chakra Shockwave Slash!"));
                props.setJutsuPoints(props.getJutsuPoints() - 30);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.stackSize--;
              } else {
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough Jutsu Points (JP)"));
              } 
            } else {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your Kenjutsu needs to at least be 50"));
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
      par3List.add(EnumChatFormatting.GOLD + "Learn Kenjutsu: Heaven Cutter");
      par3List.add(EnumChatFormatting.YELLOW + "Sword + Hold Kenjutsu Button 1");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 5 JP");
    } 
    if (par1ItemStack.getItemDamage() == 100) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Kenjutsu: Moonlight");
      par3List.add(EnumChatFormatting.YELLOW + "Sword + Shift + Hold Kenjutsu Button 1");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 7 JP");
    } 
    if (par1ItemStack.getItemDamage() == 200) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Kenjutsu: Dance of the Crescent Moon");
      par3List.add(EnumChatFormatting.YELLOW + "Sword + Hold Kenjutsu Button 2");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 15 JP");
    } 
    if (par1ItemStack.getItemDamage() == 300) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Kenjutsu: Crescent Moon Beheading");
      par3List.add(EnumChatFormatting.YELLOW + "Sword + Shift + Hold Kenjutsu Button 2");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 15 JP");
    } 
    if (par1ItemStack.getItemDamage() == 400) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Kenjutsu: Samurai Sabre Technique");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 20 JP");
    } 
    if (par1ItemStack.getItemDamage() == 500) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Kenjutsu: Flash");
      par3List.add(EnumChatFormatting.YELLOW + "Sword + Hold Kenjutsu Button 3");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 30 JP");
    } 
    if (par1ItemStack.getItemDamage() == 600) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Kenjutsu: Chakra Shockwave Slash");
      par3List.add(EnumChatFormatting.YELLOW + "Sword + Shift + Hold Kenjutsu Button 3");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 25 JP");
    } 
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.RED + "All Kenjutsu except for Samurai");
    par3List.add(EnumChatFormatting.RED + "Sabre Technique need you to press");
    par3List.add(EnumChatFormatting.RED + "A button while holding a sword!!");
  }
}

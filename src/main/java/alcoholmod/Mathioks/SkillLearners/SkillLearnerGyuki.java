package alcoholmod.Mathioks.SkillLearners;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import lc208.tools;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class SkillLearnerGyuki extends Item {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public SkillLearnerGyuki() {
    setMaxDamage(800);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setDouble("Unlock", 0.1D);
      par1ItemStack.stackTagCompound.setBoolean("Ready", false);
      par1ItemStack.stackTagCompound.setBoolean("Ready2", false);
      par1ItemStack.stackTagCompound.setBoolean("Ready3", false);
      par1ItemStack.stackTagCompound.setBoolean("Ready4", false);
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && !Par3EntityPlayer.capabilities.isCreativeMode) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      int EmptySpaces = tools.freeSpace(Par3EntityPlayer.inventory.mainInventory);
      if (props.getSize() == 4.0D)
        if (props.getJutsuPoints() >= 40 && Par1ItemStack.getItemDamage() == 0) {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Not Available Yet"));
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough Jutsu Points (JP)"));
        }  
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (props.getBijuuKind() == 0) {
      par3List.add(EnumChatFormatting.GOLD + "Medical needed: 300");
      par3List.add(EnumChatFormatting.GOLD + "Kinjutsu needed: 80");
    } 
    if (props.getSize() == 0.0D && props.getBijuuKind() != 0) {
      par3List.add(EnumChatFormatting.GOLD + "Achieve Bijuu cloak");
      par3List.add(EnumChatFormatting.DARK_RED + "JP you should keep around: 20 JP");
    } 
    if (props.getSize() == 1.0D) {
      par3List.add(EnumChatFormatting.GOLD + "Achieve Bijuu Form");
      par3List.add(EnumChatFormatting.DARK_RED + "JP you should keep around: 30 JP");
    } 
    if (props.getSize() == 2.0D) {
      par3List.add(EnumChatFormatting.GOLD + "Achieve Bijuu Form");
      par3List.add(EnumChatFormatting.DARK_RED + "JP you should keep around: 40 JP");
    } 
    if (props.getSize() == 3.0D) {
      par3List.add(EnumChatFormatting.GOLD + "Achieve Full Bijuu Transformation");
      par3List.add(EnumChatFormatting.DARK_RED + "JP you should keep around: 50 JP");
    } 
    if (props.getSize() == 4.0D) {
      if (par1ItemStack.getItemDamage() == 0) {
        par3List.add(EnumChatFormatting.OBFUSCATED + "Learn Bijuu Arms");
        par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
      } 
      if (par1ItemStack.getItemDamage() == 100) {
        par3List.add(EnumChatFormatting.GOLD + "Learn Sharingan: Coercion Sharingan");
        par3List.add(EnumChatFormatting.DARK_RED + "Cost: 20 JP");
      } 
      if (par1ItemStack.getItemDamage() == 200) {
        par3List.add(EnumChatFormatting.GOLD + "Learn Sharingan: Demonic Illusion Shackling Stakes Technique");
        par3List.add(EnumChatFormatting.DARK_RED + "Cost: 30 JP");
      } 
      if (par1ItemStack.getItemDamage() == 300) {
        par3List.add(EnumChatFormatting.GOLD + "Learn Sharingan: Izanagi");
        par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
      } 
      if (par1ItemStack.getItemDamage() == 400) {
        par3List.add(EnumChatFormatting.GOLD + "Unlock the Mangekyou Sharingan!");
        par3List.add(EnumChatFormatting.DARK_RED + "Cost: 50 JP");
      } 
    } 
  }
}

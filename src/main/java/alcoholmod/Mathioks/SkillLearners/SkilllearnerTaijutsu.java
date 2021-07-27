package alcoholmod.Mathioks.SkillLearners;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncJutsuPointsMessage;
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

public class SkilllearnerTaijutsu extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public SkilllearnerTaijutsu() {
    setMaxDamage(1300);
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
            if (props.getTaijutsu() >= 2.0D) {
              if (props.getJutsuPoints() >= 5 && Par1ItemStack.getItemDamage() == 0) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.OneThousandMetrePunch));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Taijutsu: One Thousand Meter Punch!"));
                props.setJutsuPoints(props.getJutsuPoints() - 5);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(200);
              } else if (props.getJutsuPoints() >= 15 && Par1ItemStack.getItemDamage() == 200) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.StrongFist));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Taijutsu: Strong Fist!"));
                props.setJutsuPoints(props.getJutsuPoints() - 15);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(500);
              } else if (props.getJutsuPoints() >= 25 && Par1ItemStack.getItemDamage() == 500) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.FrontLotus));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Taijutsu: Front Lotus!"));
                props.setJutsuPoints(props.getJutsuPoints() - 25);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(600);
              } else if (props.getJutsuPoints() >= 30 && Par1ItemStack.getItemDamage() == 600) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.NightPhoenix));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Taijutsu: Night Phoenix!"));
                props.setJutsuPoints(props.getJutsuPoints() - 30);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(700);
              } else if (props.getJutsuPoints() >= 30 && Par1ItemStack.getItemDamage() == 700) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ReverseLotus));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Taijutsu: Reverse Lotus!"));
                props.setJutsuPoints(props.getJutsuPoints() - 30);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.stackSize--;
              } else {
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough Jutsu Points (JP)"));
              } 
            } else {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your Taijutsu needs to at least be 50"));
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
      par3List.add(EnumChatFormatting.GOLD + "Learn Taijutsu: One Thousand Meter Punch");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 5 JP");
    } 
    if (par1ItemStack.getItemDamage() == 200) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Taijutsu: Strong Fist");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 15 JP");
    } 
    if (par1ItemStack.getItemDamage() == 500) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Taijutsu: Front Lotus");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 25 JP");
    } 
    if (par1ItemStack.getItemDamage() == 600) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Taijutsu: Night Phoenix");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 30 JP");
    } 
    if (par1ItemStack.getItemDamage() == 700) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Taijutsu: Reverse Lotus");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 30 JP");
    } 
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
  }
}

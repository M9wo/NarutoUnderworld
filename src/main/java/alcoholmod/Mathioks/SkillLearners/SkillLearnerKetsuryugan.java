package alcoholmod.Mathioks.SkillLearners;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncJutsuPointsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKetsuryuganMessage;
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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class SkillLearnerKetsuryugan extends Item {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public SkillLearnerKetsuryugan() {
    setMaxDamage(800);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setDouble("Unlock", 0.1D);
      } 
      if (par1ItemStack.stackTagCompound != null && !par2World.isRemote) {
        EntityPlayer player = (EntityPlayer)par3Entity;
        ExtendedPlayer props = ExtendedPlayer.get(player);
        if (par1ItemStack.stackTagCompound.getString("Owner").equals(((EntityPlayer)par3Entity).getCommandSenderName()) && props.getKetsuryugan() == 0 && par2World.getWorldTime() % 10L == 0L) {
          int randTime = par2World.rand.nextInt(1000) * 10;
          if (par2World.getWorldTime() != 0L && randTime != 0 && par2World.getWorldTime() % randTime == 0L) {
            double Unlock = par1ItemStack.stackTagCompound.getDouble("Unlock");
            double UnlockAdditional = Unlock + 0.5D;
            par1ItemStack.stackTagCompound.setDouble("Unlock", UnlockAdditional);
            if (par1ItemStack.stackTagCompound.getDouble("Unlock") >= 100.0D) {
              props.setKetsuryugan(1);
              PacketDispatcher.sendTo((IMessage)new SyncKetsuryuganMessage(player), (EntityPlayerMP)player);
              ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 150, 10));
              ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 250, 10));
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("You suddenly feel a surge of power through you as you unlock the Ketsuryugan!"));
            } 
          } 
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        if (!Par3EntityPlayer.capabilities.isCreativeMode) {
          ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
          int EmptySpaces = tools.freeSpace(Par3EntityPlayer.inventory.mainInventory);
          if (EmptySpaces > 0) {
            if (props.getKetsuryugan() >= 1) {
              if (props.getJutsuPoints() >= 20 && Par1ItemStack.getItemDamage() == 0) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.KetsuryuganGenjutsu2));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Ketsuryugan: Genjutsu!"));
                props.setJutsuPoints(props.getJutsuPoints() - 20);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(100);
              } else if (props.getJutsuPoints() >= 25 && Par1ItemStack.getItemDamage() == 100) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.KetsuryuganGenjutsu));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Ketsuryugan: Genjutsu Mind Destruction!"));
                props.setJutsuPoints(props.getJutsuPoints() - 25);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(200);
              } else if (props.getJutsuPoints() >= 30 && Par1ItemStack.getItemDamage() == 200) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.KetsuryuganExpodingBloodTouch));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your Learned Ketsuryugan: Exploding Blood Touch!"));
                props.setJutsuPoints(props.getJutsuPoints() - 30);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(300);
              } else if (props.getJutsuPoints() >= 40 && Par1ItemStack.getItemDamage() == 300) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ChinoikeGenjutsu));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Ketsuryugan: Genjutsu Exploding Human Technique!"));
                props.setJutsuPoints(props.getJutsuPoints() - 40);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.stackSize--;
              } else if (props.getJutsuPoints() >= 50 && Par1ItemStack.getItemDamage() == 400) {
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Not Available Yet!"));
              } else {
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough Jutsu Points (JP)"));
              } 
            } else {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You have not unlocked the Ketsuryugan yet"));
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
      par3List.add(EnumChatFormatting.GOLD + "Learn Ketsuryugan: Genjutsu");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 20 JP");
    } 
    if (par1ItemStack.getItemDamage() == 100) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Ketsuryugan: Genjutsu Mind Destruction");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 25 JP");
    } 
    if (par1ItemStack.getItemDamage() == 200) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Ketsuryugan: Exploding Blood Touch!");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 30 JP");
    } 
    if (par1ItemStack.getItemDamage() == 300) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Ketsuryugan: Genjutsu Exploding Human Technique");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
    } 
    if (par1ItemStack.getItemDamage() == 400) {
      par3List.add(EnumChatFormatting.STRIKETHROUGH + "Not yet available");
      par3List.add(EnumChatFormatting.GOLD + "Learn Ketsuryugan: Blood Dragon Ascension");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 50 JP");
    } 
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
  }
}

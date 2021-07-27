package alcoholmod.Mathioks.SkillLearners;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncByakuganSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncJutsuPointsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncbyakuganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynctenseiganMessage;
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

public class SkillLearnerByakugan extends Item {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public SkillLearnerByakugan() {
    setMaxDamage(1800);
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
            if (props.getJutsuPoints() >= 10 && Par1ItemStack.getItemDamage() == 0) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ByakuganGentleFist));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Byakugan: Gentle Fist!"));
              props.setJutsuPoints(props.getJutsuPoints() - 10);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(100);
            } else if (props.getJutsuPoints() >= 10 && Par1ItemStack.getItemDamage() == 100) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ByakuganEightTrigramsVacuumPalm));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Byakugan: Eight Trigrams Vacuum Palm!"));
              props.setJutsuPoints(props.getJutsuPoints() - 10);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(200);
            } else if (props.getJutsuPoints() >= 250 && Par1ItemStack.getItemDamage() == 200) {
              props.setJutsuPoints(props.getJutsuPoints() - 250);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              props.settenseigan(1);
              PacketDispatcher.sendTo((IMessage)new SynctenseiganMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              props.setByakuganSize(2);
              PacketDispatcher.sendTo((IMessage)new SyncByakuganSizeMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You unlocked the Tenseigan!"));
              Par1ItemStack.stackSize--;
            } else if (props.getJutsuPoints() >= 20 && Par1ItemStack.getItemDamage() == 300) {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Not Yet Available"));
            } else if (props.getJutsuPoints() >= 20 && Par1ItemStack.getItemDamage() == 400) {
              props.setJutsuPoints(props.getJutsuPoints() - 20);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(500);
            } else if (props.getJutsuPoints() >= 30 && Par1ItemStack.getItemDamage() == 500) {
              props.setJutsuPoints(props.getJutsuPoints() - 30);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(600);
            } else if (props.getJutsuPoints() >= 40 && Par1ItemStack.getItemDamage() == 600) {
              props.setJutsuPoints(props.getJutsuPoints() - 40);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(700);
            } else if (props.getJutsuPoints() >= 40 && Par1ItemStack.getItemDamage() == 700) {
              props.setJutsuPoints(props.getJutsuPoints() - 40);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(800);
            } else if (props.getJutsuPoints() >= 40 && Par1ItemStack.getItemDamage() == 800) {
              props.setJutsuPoints(props.getJutsuPoints() - 40);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(900);
            } else if (props.getJutsuPoints() >= 40 && Par1ItemStack.getItemDamage() == 900) {
              props.setJutsuPoints(props.getJutsuPoints() - 40);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(1000);
            } else if (props.getJutsuPoints() >= 40 && Par1ItemStack.getItemDamage() == 1000) {
              props.setJutsuPoints(props.getJutsuPoints() - 40);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(1100);
            } else if (props.getJutsuPoints() >= 50 && Par1ItemStack.getItemDamage() == 1100 && props.getLevel() >= 1000) {
              props.setbyakugan(2);
              PacketDispatcher.sendTo((IMessage)new SyncbyakuganMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              props.setJutsuPoints(props.getJutsuPoints() - 50);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(1200);
            } else if (props.getJutsuPoints() >= 40 && Par1ItemStack.getItemDamage() == 1200) {
              props.setJutsuPoints(props.getJutsuPoints() - 40);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(1300);
            } else if (props.getJutsuPoints() >= 40 && Par1ItemStack.getItemDamage() == 1300) {
              props.setJutsuPoints(props.getJutsuPoints() - 40);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(1400);
            } else if (props.getJutsuPoints() >= 40 && Par1ItemStack.getItemDamage() == 1400) {
              props.setJutsuPoints(props.getJutsuPoints() - 40);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(1500);
            } else if (props.getJutsuPoints() >= 50 && Par1ItemStack.getItemDamage() == 1500) {
              props.setbyakugan(3);
              PacketDispatcher.sendTo((IMessage)new SyncbyakuganMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              props.setJutsuPoints(props.getJutsuPoints() - 50);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(1600);
            } else if (props.getJutsuPoints() >= 40 && Par1ItemStack.getItemDamage() == 1600) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.RinneganAlmightyPush));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Tenseigan: Almighty Push!"));
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.RinneganAlmightyPull));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Tenseigan: Almighty Pull!"));
              props.setJutsuPoints(props.getJutsuPoints() - 40);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(1700);
            } else if (props.getJutsuPoints() >= 40 && Par1ItemStack.getItemDamage() == 1700) {
              props.setJutsuPoints(props.getJutsuPoints() - 40);
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
      par3List.add(EnumChatFormatting.GOLD + "Learn Byakugan: Gentle Fist");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 10 JP");
    } 
    if (par1ItemStack.getItemDamage() == 100) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Byakugan: Eight Trigrams Vacuum Palm");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 10 JP");
    } 
    if (par1ItemStack.getItemDamage() == 200) {
      par3List.add(EnumChatFormatting.GOLD + "Unlock Tenseigan");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 250 JP");
    } 
    if (par1ItemStack.getItemDamage() == 300) {
      par3List.add(EnumChatFormatting.DARK_RED + "Not yet available");
      par3List.add(EnumChatFormatting.STRIKETHROUGH + "Learn Byakugan: Lions Fist");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 15 JP");
    } 
    if (par1ItemStack.getItemDamage() == 400) {
      par3List.add(EnumChatFormatting.STRIKETHROUGH + "Learn Byakugan: Eight trigrams Air Palm");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 20 JP");
    } 
    if (par1ItemStack.getItemDamage() == 500) {
      par3List.add(EnumChatFormatting.STRIKETHROUGH + "Learn Byakugan: Gentle Fist Art One Blow Body");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 20 JP");
    } 
    if (par1ItemStack.getItemDamage() == 600) {
      par3List.add(EnumChatFormatting.STRIKETHROUGH + "Learn Byakugan: Eight trigrams palm rotation");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 30 JP");
    } 
    if (par1ItemStack.getItemDamage() == 700) {
      par3List.add(EnumChatFormatting.STRIKETHROUGH + "Learn Byakugan: Gentle Step Twin Lion Fists");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
    } 
    if (par1ItemStack.getItemDamage() == 800) {
      par3List.add(EnumChatFormatting.STRIKETHROUGH + "Learn Byakugan: Eight trigrams 64 Palms");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
    } 
    if (par1ItemStack.getItemDamage() == 900) {
      par3List.add(EnumChatFormatting.STRIKETHROUGH + "Learn Byakugan: Eight Trigrams Palms Revolving Heaven");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
    } 
    if (par1ItemStack.getItemDamage() == 1000) {
      par3List.add(EnumChatFormatting.STRIKETHROUGH + "Learn Byakugan: Eight Trigrams Palms Revolving Heaven");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
    } 
    if (par1ItemStack.getItemDamage() == 1100) {
      par3List.add(EnumChatFormatting.STRIKETHROUGH + "Learn Byakugan: Twin Lions Crumbling Attack");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
    } 
    if (par1ItemStack.getItemDamage() == 1200) {
      par3List.add(EnumChatFormatting.GOLD + "Unlock The Tenseigan");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 50 JP");
    } 
    if (par1ItemStack.getItemDamage() == 1300) {
      par3List.add(EnumChatFormatting.STRIKETHROUGH + "Learn Tenseigan: Silver Wheel Reincarnation Explosion");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
    } 
    if (par1ItemStack.getItemDamage() == 1400) {
      par3List.add(EnumChatFormatting.STRIKETHROUGH + "Learn Tenseigan: Golden Wheel Reincarnation Explosion");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
    } 
    if (par1ItemStack.getItemDamage() == 1500) {
      par3List.add(EnumChatFormatting.STRIKETHROUGH + "Learn Tenseigan: Localised Reincarnation Explosion");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
    } 
    if (par1ItemStack.getItemDamage() == 1600) {
      par3List.add(EnumChatFormatting.GOLD + "Unlock Tenseigan-Chakra Mode!");
      par3List.add(EnumChatFormatting.STRIKETHROUGH + "Learn Six Paths: Truth Seeking Balls");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 50 JP");
    } 
    if (par1ItemStack.getItemDamage() == 1700) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Tenseigan: Almighty Push & Tenseigan: Almighty Pull");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
    } 
    if (par1ItemStack.getItemDamage() == 1800) {
      par3List.add(EnumChatFormatting.STRIKETHROUGH + "Learn Tenseigan: Statue of the Otsutsuki Clan");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
    } 
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
  }
}

package alcoholmod.Mathioks.SkillLearners;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncJutsuPointsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSusanoSizeMessage;
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

public class SkillLearnerMangekyouKagutsuchi extends Item {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public SkillLearnerMangekyouKagutsuchi() {
    setMaxDamage(900);
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
            if (props.getmangekyouSharingan() != 3 && props.getmangekyouSharingan() != 4 && props.getmangekyouSharingan() != 11 && props.getmangekyouSharingan() != 12 && props.getmangekyouSharingan() != 9 && props.getmangekyouSharingan() != 8 && props.getmangekyouSharingan() != 26 && props.getmangekyouSharingan() != 31 && props.getmangekyouSharingan() != 28 && props.getmangekyouSharingan() != 29 && props.getmangekyouSharingan() != 33 && props.getmangekyouSharingan() != 34) {
              if (props.getmangekyouSharingan() != 24 && props.getmangekyouSharingan() != 22 && props.getmangekyouSharingan() != 21 && props.getmangekyouSharingan() != 25 && props.getmangekyouSharingan() != 7 && props.getmangekyouSharingan() != 6 && props.getmangekyouSharingan() != 13) {
                if (props.getmangekyouSharingan() == 20 || props.getmangekyouSharingan() == 23 || props.getmangekyouSharingan() == 10 || props.getmangekyouSharingan() == 14 || props.getmangekyouSharingan() == 5 || props.getmangekyouSharingan() == 30 || props.getmangekyouSharingan() == 32 || props.getmangekyouSharingan() == 27 || props.getmangekyouSharingan() == 50 || props.getmangekyouSharingan() == 35 || props.getmangekyouSharingan() == 36)
                  if (props.getJutsuPoints() >= 35 && Par1ItemStack.getItemDamage() == 0) {
                    Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.itemTsukuyomi));
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Tsukuyomi!"));
                    props.setJutsuPoints(props.getJutsuPoints() - 35);
                    PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                    Par1ItemStack.setItemDamage(100);
                  } else if (props.getJutsuPoints() >= 50 && Par1ItemStack.getItemDamage() == 100) {
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Susano'o Skeleton!"));
                    props.setJutsuPoints(props.getJutsuPoints() - 50);
                    PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                    props.setSusanoSize(2);
                    PacketDispatcher.sendTo((IMessage)new SyncSusanoSizeMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                    Par1ItemStack.setItemDamage(200);
                  } else if (props.getJutsuPoints() >= 65 && Par1ItemStack.getItemDamage() == 200) {
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Complete Susano'o!"));
                    props.setJutsuPoints(props.getJutsuPoints() - 65);
                    PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                    props.setSusanoSize(3);
                    PacketDispatcher.sendTo((IMessage)new SyncSusanoSizeMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                    Par1ItemStack.setItemDamage(300);
                  } else if (props.getJutsuPoints() >= 75 && Par1ItemStack.getItemDamage() == 300) {
                    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Susano'o Armor!"));
                    props.setJutsuPoints(props.getJutsuPoints() - 75);
                    PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                    props.setSusanoSize(4);
                    PacketDispatcher.sendTo((IMessage)new SyncSusanoSizeMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                    Par1ItemStack.stackSize--;
                  }  
              } else if (props.getJutsuPoints() >= 20 && Par1ItemStack.getItemDamage() == 0) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.KamuiTeleport));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Kamui: Teleportation!"));
                props.setJutsuPoints(props.getJutsuPoints() - 20);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(100);
              } else if (props.getJutsuPoints() >= 40 && Par1ItemStack.getItemDamage() == 100) {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.KamuiTeleportDimensions));
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Kamui:Teleport Dimensions!"));
                props.setJutsuPoints(props.getJutsuPoints() - 40);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(200);
              } else if (props.getJutsuPoints() >= 50 && Par1ItemStack.getItemDamage() == 200) {
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Susano'o Skeleton!"));
                props.setJutsuPoints(props.getJutsuPoints() - 50);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                props.setSusanoSize(2);
                PacketDispatcher.sendTo((IMessage)new SyncSusanoSizeMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(300);
              } else if (props.getJutsuPoints() >= 65 && Par1ItemStack.getItemDamage() == 300) {
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Complete Susano'o!"));
                props.setJutsuPoints(props.getJutsuPoints() - 65);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                props.setSusanoSize(3);
                PacketDispatcher.sendTo((IMessage)new SyncSusanoSizeMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.setItemDamage(400);
              } else if (props.getJutsuPoints() >= 85 && Par1ItemStack.getItemDamage() == 400) {
                Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Susano'o Armor!"));
                props.setJutsuPoints(props.getJutsuPoints() - 85);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                props.setSusanoSize(4);
                PacketDispatcher.sendTo((IMessage)new SyncSusanoSizeMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
                Par1ItemStack.stackSize--;
              } 
            } else if (props.getJutsuPoints() >= 30 && Par1ItemStack.getItemDamage() == 0) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.itemAmaterasu));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Amaterasu!"));
              props.setJutsuPoints(props.getJutsuPoints() - 30);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(100);
            } else if (props.getJutsuPoints() >= 45 && Par1ItemStack.getItemDamage() == 100) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SharinganKagutsuchiFlameControl));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Inferno Release: Flame Control!"));
              props.setJutsuPoints(props.getJutsuPoints() - 45);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(200);
            } else if (props.getJutsuPoints() >= 55 && Par1ItemStack.getItemDamage() == 200) {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Susano'o Skeleton!"));
              props.setJutsuPoints(props.getJutsuPoints() - 55);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              props.setSusanoSize(2);
              PacketDispatcher.sendTo((IMessage)new SyncSusanoSizeMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(300);
            } else if (props.getJutsuPoints() >= 65 && Par1ItemStack.getItemDamage() == 300) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.InfernoGreatFireItem));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Inferno Release: Great Fireball!"));
              props.setJutsuPoints(props.getJutsuPoints() - 65);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(400);
            } else if (props.getJutsuPoints() >= 75 && Par1ItemStack.getItemDamage() == 400) {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Complete Susano'o!"));
              props.setJutsuPoints(props.getJutsuPoints() - 75);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              props.setSusanoSize(3);
              PacketDispatcher.sendTo((IMessage)new SyncSusanoSizeMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(500);
            } else if (props.getJutsuPoints() >= 85 && Par1ItemStack.getItemDamage() == 500) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SharinganKagutsuchiFlameWrappingFire));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Inferno Release: Flame Wrapping Fire!"));
              props.setJutsuPoints(props.getJutsuPoints() - 85);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(600);
            } else if (props.getJutsuPoints() >= 90 && Par1ItemStack.getItemDamage() == 600) {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Susano'o Armor!"));
              props.setJutsuPoints(props.getJutsuPoints() - 90);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              props.setSusanoSize(4);
              PacketDispatcher.sendTo((IMessage)new SyncSusanoSizeMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.setItemDamage(700);
            } else if (props.getJutsuPoints() >= 95 && Par1ItemStack.getItemDamage() == 700) {
              Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SharinganKagutsuchiFallingSwordsItem));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Inferno Release: Susano'o Flame Control!"));
              props.setJutsuPoints(props.getJutsuPoints() - 95);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
              Par1ItemStack.stackSize--;
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
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (props.getmangekyouSharingan() != 3 && props.getmangekyouSharingan() != 4 && props.getmangekyouSharingan() != 11 && props.getmangekyouSharingan() != 12 && props.getmangekyouSharingan() != 9 && props.getmangekyouSharingan() != 8 && props.getmangekyouSharingan() != 26 && props.getmangekyouSharingan() != 31 && props.getmangekyouSharingan() != 28 && props.getmangekyouSharingan() != 29 && props.getmangekyouSharingan() != 33 && props.getmangekyouSharingan() != 34) {
      if (props.getmangekyouSharingan() != 24 && props.getmangekyouSharingan() != 22 && props.getmangekyouSharingan() != 21 && props.getmangekyouSharingan() != 25 && props.getmangekyouSharingan() != 7 && props.getmangekyouSharingan() != 6 && props.getmangekyouSharingan() != 13) {
        if (props.getmangekyouSharingan() == 20 || props.getmangekyouSharingan() == 23 || props.getmangekyouSharingan() == 10 || props.getmangekyouSharingan() == 14 || props.getmangekyouSharingan() == 5 || props.getmangekyouSharingan() == 30 || props.getmangekyouSharingan() == 32 || props.getmangekyouSharingan() == 27 || props.getmangekyouSharingan() == 50 || props.getmangekyouSharingan() == 35 || props.getmangekyouSharingan() == 36)
          if (par1ItemStack.getItemDamage() == 0) {
            par3List.add(EnumChatFormatting.GOLD + "Learn Tsukuyomi");
            par3List.add(EnumChatFormatting.DARK_RED + "Cost: 20 JP");
          } else if (par1ItemStack.getItemDamage() == 100) {
            par3List.add(EnumChatFormatting.GOLD + "Learn Susano'o Skeleton");
            par3List.add(EnumChatFormatting.DARK_RED + "Cost: 50 JP");
          } else if (par1ItemStack.getItemDamage() == 200) {
            par3List.add(EnumChatFormatting.GOLD + "Learn Complete Susano'o");
            par3List.add(EnumChatFormatting.DARK_RED + "Cost: 65 JP");
          } else if (par1ItemStack.getItemDamage() == 300) {
            par3List.add(EnumChatFormatting.GOLD + "Learn Susano'o Armor");
            par3List.add(EnumChatFormatting.DARK_RED + "Cost: 75 JP");
          }  
      } else if (par1ItemStack.getItemDamage() == 0) {
        par3List.add(EnumChatFormatting.GOLD + "Learn Kamui: Teleport ");
        par3List.add(EnumChatFormatting.DARK_RED + "Cost: 20 JP");
      } else if (par1ItemStack.getItemDamage() == 100) {
        par3List.add(EnumChatFormatting.GOLD + "Learn Kamui: Teleport Dimensions");
        par3List.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
      } else if (par1ItemStack.getItemDamage() == 200) {
        par3List.add(EnumChatFormatting.GOLD + "Learn Susano'o Skeleton");
        par3List.add(EnumChatFormatting.DARK_RED + "Cost: 50 JP");
      } else if (par1ItemStack.getItemDamage() == 300) {
        par3List.add(EnumChatFormatting.GOLD + "Learn Complete Susano'o");
        par3List.add(EnumChatFormatting.DARK_RED + "Cost: 65 JP");
      } else if (par1ItemStack.getItemDamage() == 400) {
        par3List.add(EnumChatFormatting.GOLD + "Learn Susano'o Armor");
        par3List.add(EnumChatFormatting.DARK_RED + "Cost: 85 JP");
      } 
    } else if (par1ItemStack.getItemDamage() == 0) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Amaterasu");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 30 JP");
    } else if (par1ItemStack.getItemDamage() == 100) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Inferno Release: Flame Control");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 45 JP");
    } else if (par1ItemStack.getItemDamage() == 200) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Susano'o Skeleton");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 55 JP");
    } else if (par1ItemStack.getItemDamage() == 300) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Inferno Release: Great Fireball");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 65 JP");
    } else if (par1ItemStack.getItemDamage() == 400) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Complete Susano'o");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 75 JP");
    } else if (par1ItemStack.getItemDamage() == 500) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Inferno Release: Flame Wrapping Fire");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 85 JP");
    } else if (par1ItemStack.getItemDamage() == 600) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Susano'o Armor");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 90 JP");
    } else if (par1ItemStack.getItemDamage() == 700) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Inferno Release: Susano'o Flame Control");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 95 JP");
    } else if (par1ItemStack.getItemDamage() == 800) {
      par3List.add(EnumChatFormatting.GOLD + "Learn Totsuka Blade");
      par3List.add(EnumChatFormatting.DARK_RED + "Cost: 100 JP");
    } 
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
  }
}

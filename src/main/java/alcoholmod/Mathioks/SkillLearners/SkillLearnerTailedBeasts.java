package alcoholmod.Mathioks.SkillLearners;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuFormActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuScaleMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuUnlockMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncEarthReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncFireReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncJutsuPointsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncNinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncWaterReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncWindReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncYangReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncYinReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncboilReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynclavaReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncmagnetReleaseMessage;
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

public class SkillLearnerTailedBeasts extends Item {
  public SkillLearnerTailedBeasts() {
    setMaxDamage(400);
    this.maxStackSize = 1;
  }
  
  public EnumRarity getRarity(ItemStack p_77613_1_) {
    return EnumRarity.epic;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public void onUpdate(ItemStack stack, World world, Entity entity, int p_77663_4_, boolean p_77663_5_) {
    if ((EntityPlayer)entity != null && stack.stackTagCompound == null) {
      stack.stackTagCompound = new NBTTagCompound();
      stack.stackTagCompound.setString("Owner", ((EntityPlayer)entity).getCommandSenderName());
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer pplayer) {
    if (!world.isRemote)
      if (stack.stackTagCompound.getString("Owner").equals(pplayer.getCommandSenderName())) {
        if (!pplayer.capabilities.isCreativeMode) {
          ExtendedPlayer props = ExtendedPlayer.get(pplayer);
          int EmptySpaces = tools.freeSpace(pplayer.inventory.mainInventory);
          if (EmptySpaces > 0) {
            if (stack.getItemDamage() == 0) {
              if (props.getSize() == 0.0D && props.getJutsuPoints() >= 20) {
                props.setSize(1.0D);
                PacketDispatcher.sendTo((IMessage)new SyncSizeMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setBijuuScale(2);
                PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setBijuuFormActive(true);
                PacketDispatcher.sendTo((IMessage)new SyncBijuuFormActiveMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setNinjutsu(props.getNinjutsu() + 50);
                PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setBijuuUnlock(0.0D);
                PacketDispatcher.sendTo((IMessage)new SyncBijuuUnlockMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setJutsuPoints(props.getJutsuPoints() - 20);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(pplayer), (EntityPlayerMP)pplayer);
                pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You have unlocked the Bijuu Cloak"));
              } else if (props.getSize() == 1.0D && props.getJutsuPoints() >= 30) {
                props.setSize(2.0D);
                PacketDispatcher.sendTo((IMessage)new SyncSizeMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setBijuuScale(3);
                PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setBijuuFormActive(true);
                PacketDispatcher.sendTo((IMessage)new SyncBijuuFormActiveMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setNinjutsu(props.getNinjutsu() + 150);
                PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setBijuuUnlock(0.0D);
                PacketDispatcher.sendTo((IMessage)new SyncBijuuUnlockMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setJutsuPoints(props.getJutsuPoints() - 30);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(pplayer), (EntityPlayerMP)pplayer);
                pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You have unlocked the Bijuu Form"));
              } else if (props.getSize() == 2.0D && props.getJutsuPoints() >= 40) {
                props.setSize(3.0D);
                PacketDispatcher.sendTo((IMessage)new SyncSizeMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setBijuuScale(4);
                PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setBijuuFormActive(true);
                PacketDispatcher.sendTo((IMessage)new SyncBijuuFormActiveMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setNinjutsu(props.getNinjutsu() + 300);
                PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setBijuuUnlock(0.0D);
                PacketDispatcher.sendTo((IMessage)new SyncBijuuUnlockMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setJutsuPoints(props.getJutsuPoints() - 40);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(pplayer), (EntityPlayerMP)pplayer);
                pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You have unlocked the Bijuu Form (Skeleton)"));
              } else if (props.getSize() == 3.0D && props.getJutsuPoints() >= 50) {
                props.setSize(4.0D);
                PacketDispatcher.sendTo((IMessage)new SyncSizeMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setBijuuFormActive(true);
                PacketDispatcher.sendTo((IMessage)new SyncBijuuFormActiveMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setNinjutsu(props.getNinjutsu() + 500);
                PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setBijuuUnlock(0.0D);
                PacketDispatcher.sendTo((IMessage)new SyncBijuuUnlockMessage(pplayer), (EntityPlayerMP)pplayer);
                props.setJutsuPoints(props.getJutsuPoints() - 50);
                PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(pplayer), (EntityPlayerMP)pplayer);
                pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You have unlocked the Bijuu Transformation"));
                if (props.getBijuuKind() == 1) {
                  props.setBijuuScale(5);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(pplayer), (EntityPlayerMP)pplayer);
                  if (props.getWindRelease() == 0) {
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Shukaku's Wind nature release!"));
                    props.setWindRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                    pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                    if (props.getEarthRelease() == 0) {
                      pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Shukaku's Earth nature release!"));
                      props.setEarthRelease(1);
                      PacketDispatcher.sendTo((IMessage)new SyncEarthReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                      pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerEarthRelease));
                    } 
                    if (props.getmagnetRelease() == 0) {
                      pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Shukaku's Magnet nature release!"));
                      props.setmagnetRelease(1);
                      PacketDispatcher.sendTo((IMessage)new SyncmagnetReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                      pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerMagnetRelease));
                    } 
                  } 
                } 
                if (props.getBijuuKind() == 2) {
                  props.setBijuuScale(6);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(pplayer), (EntityPlayerMP)pplayer);
                  if (props.getFireRelease() == 0) {
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Matatabi's Fire nature release!"));
                    props.setFireRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                    pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerMatatabiFireRelease));
                  } 
                } 
                if (props.getBijuuKind() == 3) {
                  props.setBijuuScale(7);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(pplayer), (EntityPlayerMP)pplayer);
                  if (props.getWaterRelease() == 0) {
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Isobu's Water nature release!"));
                    props.setWaterRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                    pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Isobu: I'll also allow you to breath underwater!"));
                  } 
                } 
                if (props.getBijuuKind() == 4) {
                  props.setBijuuScale(8);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(pplayer), (EntityPlayerMP)pplayer);
                  if (props.getFireRelease() == 0) {
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Son Goku's Fire nature release!"));
                    props.setFireRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                    pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                  } 
                  if (props.getEarthRelease() == 0) {
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Son Goku's Earth nature release!"));
                    props.setEarthRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncEarthReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                    pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerEarthRelease));
                  } 
                  if (props.getlavaRelease() == 0) {
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Son Goku's Lava nature release!"));
                    props.setlavaRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SynclavaReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                    pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerLavaRelease));
                  } 
                } 
                if (props.getBijuuKind() == 5) {
                  props.setBijuuScale(9);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(pplayer), (EntityPlayerMP)pplayer);
                  if (props.getWaterRelease() == 0) {
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Kokuo's Water nature release!"));
                    props.setWaterRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                    pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                  } 
                  if (props.getFireRelease() == 0) {
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Kokuo's Fire nature release!"));
                    props.setFireRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                    pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerFireRelease));
                  } 
                  if (props.getboilRelease() == 0) {
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Kokuo's Boil nature release!"));
                    props.setboilRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncboilReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                    pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerBoilRelease));
                  } 
                } 
                if (props.getBijuuKind() == 6) {
                  props.setBijuuScale(10);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(pplayer), (EntityPlayerMP)pplayer);
                  if (props.getWaterRelease() == 0) {
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Saiken's Water nature release!"));
                    props.setWaterRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                    pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                  } 
                } 
                if (props.getBijuuKind() == 7) {
                  props.setBijuuScale(11);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(pplayer), (EntityPlayerMP)pplayer);
                  if (props.getWindRelease() == 0) {
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Chomei's Wind nature release!"));
                    props.setWindRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                    pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GOLD + "Chomei: I'll also allow you to fly!"));
                  } 
                } 
                if (props.getBijuuKind() == 8) {
                  props.setBijuuScale(12);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(pplayer), (EntityPlayerMP)pplayer);
                  if (props.getWaterRelease() == 0) {
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Gyuki's Water nature release!"));
                    props.setWaterRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                    pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWaterRelease));
                  } 
                } 
                if (props.getBijuuKind() == 9) {
                  props.setBijuuScale(13);
                  PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(pplayer), (EntityPlayerMP)pplayer);
                  if (props.getWindRelease() == 0) {
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Kurama's Wind nature release!"));
                    props.setWindRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                    pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerWindRelease));
                  } 
                  if (props.getYinRelease() == 0) {
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Kurama's Yin nature release!"));
                    props.setYinRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncYinReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                    pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerYinRelease));
                  } 
                  if (props.getYangRelease() == 0) {
                    pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.AQUA + "You have acquired Kurama's Yang nature release!"));
                    props.setYangRelease(1);
                    PacketDispatcher.sendTo((IMessage)new SyncYangReleaseMessage(pplayer), (EntityPlayerMP)pplayer);
                    pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SkillLearnerYangRelease));
                  } 
                } 
                stack.setItemDamage(100);
              } 
            } else if (stack.getItemDamage() == 100 && props.getJutsuPoints() >= 25) {
              props.setJutsuPoints(props.getJutsuPoints() - 25);
              PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(pplayer), (EntityPlayerMP)pplayer);
              pplayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.TailedBeastContinuousJutsuItem));
              pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned Tailed Beast Continuous Bombs!"));
              stack.setItemDamage(200);
            } 
          } else {
            pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You need an extra free space in your Inventory"));
          } 
        } else {
          pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You cannot use this item in Creative Mode"));
        } 
      } else {
        pplayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
      }  
    return stack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack stack, EntityPlayer pplayer, List list, boolean b) {
    ExtendedPlayer props = ExtendedPlayer.get(pplayer);
    if (stack.getItemDamage() == 0) {
      if (props.getSize() == 0.0D) {
        list.add(EnumChatFormatting.GOLD + "Unlock Bijuu Cloak");
        list.add(EnumChatFormatting.DARK_RED + "Cost: 20 JP");
      } else if (props.getSize() == 1.0D) {
        list.add(EnumChatFormatting.GOLD + "Unlock Bijuu Form");
        list.add(EnumChatFormatting.DARK_RED + "Cost: 30 JP");
      } else if (props.getSize() == 2.0D) {
        list.add(EnumChatFormatting.GOLD + "Unlock Bijuu Form (Skeleton)");
        list.add(EnumChatFormatting.DARK_RED + "Cost: 40 JP");
      } else if (props.getSize() == 3.0D) {
        list.add(EnumChatFormatting.GOLD + "Unlock Bijuu Transformation");
        list.add(EnumChatFormatting.DARK_RED + "Cost: 50 JP");
      } 
    } else if (stack.getItemDamage() == 100) {
      list.add(EnumChatFormatting.GOLD + "Learn Tailed Beast Continuous Bombs");
      list.add(EnumChatFormatting.DARK_RED + "Cost: 25 JP");
    } else if (stack.getItemDamage() == 200) {
      list.add(EnumChatFormatting.DARK_RED + "" + EnumChatFormatting.STRIKETHROUGH + "Coming Soon... probably...");
    } 
    if (stack.stackTagCompound != null)
      list.add(EnumChatFormatting.AQUA + "Owner: " + stack.stackTagCompound.getString("Owner")); 
  }
}

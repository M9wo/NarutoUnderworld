package alcoholmod.Mathioks.Exams;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncRankMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class GeninExam extends Item {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public GeninExam() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (Par1ItemStack.getItemDamage() == 0) {
      if (!Par2World.isRemote) {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Начался экзамен на §6Генина!"));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Читайте описания предмета, чтобы понять, что делать дальше!"));
        Par1ItemStack.setItemDamage(50);
        return Par1ItemStack;
      } 
    } else if (Par1ItemStack.getItemDamage() == 50) {
      if (!Par2World.isRemote && Par3EntityPlayer.inventory.hasItem(Items.bone) && Par3EntityPlayer.inventory.hasItem(Items.spider_eye)) {
        Par3EntityPlayer.inventory.consumeInventoryItem(Items.bone);
        Par3EntityPlayer.inventory.consumeInventoryItem(Items.spider_eye);
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Поздравляем, вы прошли 1 часть"));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Экзамена на Генина!"));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Читайте описания предмета"));
        Par1ItemStack.setItemDamage(150);
        return Par1ItemStack;
      } 
    } else if (Par1ItemStack.getItemDamage() == 150 && !Par2World.isRemote && Par3EntityPlayer.inventory.hasItem(Items.wheat)) {
      Par3EntityPlayer.inventory.consumeInventoryItem(Items.wheat);
      Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Поздравляем, вы прошли экзамен на Генина!"));
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getRank() == 21) {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Теперь вы Генин!"));
        props.setRank(1);
        PacketDispatcher.sendTo((IMessage)new SyncRankMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        Par1ItemStack.stackSize--;
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Вы не студент Академии ,"));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("это, то почему вы не можете подняться в звании до Генина"));
      } 
      return Par1ItemStack;
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    if (par1ItemStack.getItemDamage() == 0) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "Нажмите §nRight Click §3по предмету, чтобы начать");
      par3List.add(EnumChatFormatting.DARK_AQUA + "экзамен на Генина.");
    } 
    if (par1ItemStack.getItemDamage() == 50) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "Докажите ваши силы по сбору костей ");
      par3List.add(EnumChatFormatting.DARK_AQUA + "и паучего глаза");
    } 
    if (par1ItemStack.getItemDamage() == 150) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "Докажите вашу живучесть, вырастив пшеницу");
      par3List.add(EnumChatFormatting.DARK_AQUA + "§6Нажмите Right Click по предмету, если у тебя есть пшеница");
    } 
  }
}

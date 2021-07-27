package alcoholmod.Mathioks.Exams;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncRankMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
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

public class MedicalLeaderExam extends Item {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public MedicalLeaderExam() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (par1ItemStack.getItemDamage() == 100);
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    if (stack.getItemDamage() == 100 && entity instanceof net.minecraft.entity.passive.EntityOcelot) {
      stack.setItemDamage(150);
      player.addChatComponentMessage((IChatComponent)new ChatComponentText("Congratulations, You passed part 2"));
      player.addChatComponentMessage((IChatComponent)new ChatComponentText("of the Genin Exam!"));
      player.addChatComponentMessage((IChatComponent)new ChatComponentText("Read the Item Description for more info"));
      return true;
    } 
    return false;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (Par1ItemStack.getItemDamage() == 0) {
      if (!Par2World.isRemote) {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Start of the Genin Exam"));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Read the Item Description for info"));
        Par1ItemStack.setItemDamage(50);
        return Par1ItemStack;
      } 
    } else if (Par1ItemStack.getItemDamage() == 50) {
      if (!Par2World.isRemote && Par3EntityPlayer.inventory.hasItem(Items.bone) && Par3EntityPlayer.inventory.hasItem(Items.spider_eye)) {
        Par3EntityPlayer.inventory.consumeInventoryItem(Items.bone);
        Par3EntityPlayer.inventory.consumeInventoryItem(Items.spider_eye);
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Congratulations, You passed part 1"));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("of the Genin Exam!"));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Read the Item Description for more info"));
        Par1ItemStack.setItemDamage(100);
        return Par1ItemStack;
      } 
    } else if (Par1ItemStack.getItemDamage() == 150 && !Par2World.isRemote && Par3EntityPlayer.inventory.hasItem(Items.wheat)) {
      Par3EntityPlayer.inventory.consumeInventoryItem(Items.wheat);
      Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Congratulations, You passed the genin Exam!"));
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getRank() == 21) {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are now a genin!"));
        props.setRank(1);
        PacketDispatcher.sendTo((IMessage)new SyncRankMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
        Par1ItemStack.stackSize--;
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not an academy student,"));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("thus, you cannot rank up to Genin!"));
      } 
      return Par1ItemStack;
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    if (par1ItemStack.getItemDamage() == 0) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "Right Click this Item to start your Genin");
      par3List.add(EnumChatFormatting.DARK_AQUA + "Exam.");
    } 
    if (par1ItemStack.getItemDamage() == 50) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "Prove your strength by gathering a bone and");
      par3List.add(EnumChatFormatting.DARK_AQUA + "a spider eye.");
    } 
    if (par1ItemStack.getItemDamage() == 100) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "Prove your agility by grabbing an ocelot");
      par3List.add(EnumChatFormatting.DARK_AQUA + "Left Click it with this item in hand.");
    } 
    if (par1ItemStack.getItemDamage() == 150) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "Prove your survivability by attaining");
      par3List.add(EnumChatFormatting.DARK_AQUA + "a piece of wheat.");
    } 
  }
}

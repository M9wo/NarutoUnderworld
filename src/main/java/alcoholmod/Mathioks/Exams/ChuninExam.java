package alcoholmod.Mathioks.Exams;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncRankMessage;
import alcoholmod.Mathioks.NPC.ChuninExamGeninEntity;
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
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ChuninExam extends Item {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ChuninExam() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {}
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
    if (Par1ItemStack.getItemDamage() == 0) {
      if (!Par2World.isRemote) {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Start of the Chunin Exam"));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Read the Item Description for info"));
        Par1ItemStack.setItemDamage(50);
        return Par1ItemStack;
      } 
    } else if (Par1ItemStack.getItemDamage() == 50) {
      if (!Par2World.isRemote && Par3EntityPlayer.inventory.hasItem(Items.ender_eye) && Par3EntityPlayer.inventory.hasItem(Items.gunpowder)) {
        Par3EntityPlayer.inventory.consumeInventoryItem(Items.ender_eye);
        Par3EntityPlayer.inventory.consumeInventoryItem(Items.gunpowder);
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Congratulations, You passed part 1"));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("of the Chunin Exam!"));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Read the Item Description for more info"));
        Par1ItemStack.setItemDamage(100);
        return Par1ItemStack;
      } 
    } else if (Par1ItemStack.getItemDamage() == 100) {
      if (!Par2World.isRemote) {
        if (Par3EntityPlayer.inventory.hasItem(AlcoholMod.HeavenScroll) && Par3EntityPlayer.inventory.hasItem(AlcoholMod.EarthScroll)) {
          Par3EntityPlayer.inventory.consumeInventoryItem(AlcoholMod.HeavenScroll);
          Par3EntityPlayer.inventory.consumeInventoryItem(AlcoholMod.EarthScroll);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Congratulations, You passed part 2"));
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("of the Chunin Exam!"));
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Read the Item Description for more info"));
          Par1ItemStack.setItemDamage(150);
          return Par1ItemStack;
        } 
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You don't have both scrolls yet"));
      } 
    } else if (Par1ItemStack.getItemDamage() == 150 && !Par2World.isRemote && props.getRank() != 5) {
      if (Par3EntityPlayer.inventory.hasItem(AlcoholMod.ChuninExamWinningEmblem)) {
        Par3EntityPlayer.inventory.consumeInventoryItem(AlcoholMod.ChuninExamWinningEmblem);
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Congratulations, You passed the Chunin Exams!"));
        if (props.getRank() == 1) {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are now a Chunin!"));
          props.setRank(2);
          PacketDispatcher.sendTo((IMessage)new SyncRankMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
          Par1ItemStack.stackSize--;
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not a Genin,"));
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("thus, you cannot rank up to Chunin!"));
        } 
        return Par1ItemStack;
      } 
      ChuninExamGeninEntity fireball2 = new ChuninExamGeninEntity(Par2World);
      double i = MathHelper.floor_double(Par3EntityPlayer.posX + 5.0D);
      double j = MathHelper.floor_double(Par3EntityPlayer.posY + 2.0D);
      double k = MathHelper.floor_double(Par3EntityPlayer.posZ + 5.0D);
      fireball2.setPosition(i, j, k);
      Par2World.spawnEntityInWorld((Entity)fireball2);
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    if (par1ItemStack.getItemDamage() == 0) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "Right Click this Item to start your");
      par3List.add(EnumChatFormatting.DARK_AQUA + "Chunin Exam.");
    } 
    if (par1ItemStack.getItemDamage() == 50)
      par3List.add(EnumChatFormatting.DARK_AQUA + "Gather an ender eye and gunpowder"); 
    if (par1ItemStack.getItemDamage() == 100) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "Prove your cunning by acquiring");
      par3List.add(EnumChatFormatting.DARK_AQUA + "both an Earth Scroll and Heaven");
      par3List.add(EnumChatFormatting.DARK_AQUA + "Scroll, Other Genin throughout the");
      par3List.add(EnumChatFormatting.DARK_AQUA + "World sometimes have them.");
      par3List.add(EnumChatFormatting.DARK_AQUA + "Defeat them to acquire it from them.");
    } 
    if (par1ItemStack.getItemDamage() == 150) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "Prove your strength by defeating");
      par3List.add(EnumChatFormatting.DARK_AQUA + "the opposing Genin and acquiring a");
      par3List.add(EnumChatFormatting.DARK_AQUA + "Chunin winning emblem");
    } 
  }
}

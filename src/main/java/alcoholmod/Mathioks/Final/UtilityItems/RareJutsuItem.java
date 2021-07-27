package alcoholmod.Mathioks.Final.UtilityItems;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncJutsuPointsMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import lc208.tools;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class RareJutsuItem extends Item {
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3Entity);
        if (props.getLightningRelease() == 0) {
          int rand = par2World.rand.nextInt(15);
          par1ItemStack.stackTagCompound = new NBTTagCompound();
          if (rand == 0 || rand == 1 || rand == 2 || rand == 3)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Kage Fuhma Shuriken Technique"); 
          if (rand == 14)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Rasengan"); 
        } 
        if (props.getLightningRelease() == 1) {
          int rand = par2World.rand.nextInt(16);
          par1ItemStack.stackTagCompound = new NBTTagCompound();
          if (rand == 0 || rand == 1 || rand == 2 || rand == 3)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Kage Fuhma Shuriken Technique"); 
          if (rand == 14)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Rasengan"); 
          if (rand == 15)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Chidori"); 
        } 
      } 
      if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getString("Jutsu").equals("")) {
        ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3Entity);
        if (props.getLightningRelease() == 0) {
          int rand = par2World.rand.nextInt(15);
          par1ItemStack.stackTagCompound = new NBTTagCompound();
          if (rand == 0 || rand == 1 || rand == 2 || rand == 3)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Kage Fuhma Shuriken Technique"); 
          if (rand == 14)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Rasengan"); 
        } 
        if (props.getLightningRelease() == 1) {
          int rand = par2World.rand.nextInt(16);
          par1ItemStack.stackTagCompound = new NBTTagCompound();
          if (rand == 0 || rand == 1 || rand == 2 || rand == 3)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Kage Fuhma Shuriken Technique"); 
          if (rand == 14)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Rasengan"); 
          if (rand == 15)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Chidori"); 
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    if (!par2World.isRemote && !player.capabilities.isCreativeMode && tools.freeSpace(player.inventory.mainInventory) > 0) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getJutsuPoints() >= 20) {
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Kage Fuhma Shuriken Technique")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.KageShurikenJutsu, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You learned the Kage Fuhma Shuriken Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Summoning: Rashomon")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.RashomonItem, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You learned the Summoning: Rashomon Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Super Explosion Clone")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SuperCloneExplosion, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You learned the Super Explosion Clone Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Multi Kage Bunshin")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.KageBunshinMulti, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned the Chakra for Multi Kage Bunshin Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Rasengan")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ItemRasengan, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You learned the Rasengan!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Chidori")) {
          if (props.getLightningRelease() != 1) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You cannot learn this jutsu as you do not"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("have the Lightning chakra nature type!"));
            return par1ItemStack;
          } 
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ItemChidori, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned the Chidori!"));
        } 
        props.setJutsuPoints(props.getJutsuPoints() - 20);
        PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(player), (EntityPlayerMP)player);
        par1ItemStack.stackSize--;
      } else {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough Jutsu Points!"));
      } 
    } else if (tools.freeSpace(player.inventory.mainInventory) <= 0) {
      player.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough free space"));
    } 
    return par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.RED + "Learn an A rank Jutsu");
    par3List.add(EnumChatFormatting.RED + "JP Cost: 20");
    if (par1ItemStack.stackTagCompound == null) {
      ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
      if (props.getLightningRelease() == 0) {
        par3List.add(EnumChatFormatting.GREEN + "Possible Jutsu:");
        par3List.add(EnumChatFormatting.BLUE + "- Kage Fuhma Shuriken Technique");
        par3List.add(EnumChatFormatting.BLUE + "- Summoning: Rashomon");
        par3List.add(EnumChatFormatting.DARK_PURPLE + "- Super Explosion Clone");
        par3List.add(EnumChatFormatting.DARK_PURPLE + "- Multi Kage Bunshin");
        par3List.add(EnumChatFormatting.RED + "- Rasengan");
      } 
      if (props.getLightningRelease() == 1) {
        par3List.add(EnumChatFormatting.GREEN + "Possible Jutsu:");
        par3List.add(EnumChatFormatting.BLUE + "- Kage Fuhma Shuriken Technique");
        par3List.add(EnumChatFormatting.BLUE + "- Summoning: Rashomon");
        par3List.add(EnumChatFormatting.DARK_PURPLE + "- Super Explosion Clone");
        par3List.add(EnumChatFormatting.DARK_PURPLE + "- Multi Kage Bunshin");
        par3List.add(EnumChatFormatting.RED + "- Rasengan");
        par3List.add(EnumChatFormatting.RED + "- Chidori");
      } 
    } 
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Jutsu")); 
  }
}

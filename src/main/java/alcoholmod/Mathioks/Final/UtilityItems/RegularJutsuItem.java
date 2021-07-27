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

public class RegularJutsuItem extends Item {
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3Entity);
        if (props.getWaterRelease() == 0) {
          int rand = par2World.rand.nextInt(20);
          par1ItemStack.stackTagCompound = new NBTTagCompound();
          if (rand == 4 || rand == 5 || rand == 6 || rand == 7)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Kage Shuriken Technique"); 
          if (rand == 8 || rand == 9 || rand == 10 || rand == 11)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Kage Kunai Technique"); 
          if (rand == 17 || rand == 18)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Summoning: Rolling Log"); 
        } 
        if (props.getWaterRelease() == 1) {
          int rand = par2World.rand.nextInt(22);
          par1ItemStack.stackTagCompound = new NBTTagCompound();
          if (rand == 4 || rand == 5 || rand == 6 || rand == 7)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Kage Shuriken Technique"); 
          if (rand == 8 || rand == 9 || rand == 10 || rand == 11)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Kage Kunai Technique"); 
          if (rand == 17 || rand == 18)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Water Release: Takigakure Sword"); 
          if (rand == 19 || rand == 20)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Summoning: Rolling Log"); 
        } 
      } 
      if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getString("Jutsu").equals("")) {
        ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3Entity);
        if (props.getWaterRelease() == 0) {
          int rand = par2World.rand.nextInt(20);
          par1ItemStack.stackTagCompound = new NBTTagCompound();
          if (rand == 4 || rand == 5 || rand == 6 || rand == 7)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Kage Shuriken Technique"); 
          if (rand == 8 || rand == 9 || rand == 10 || rand == 11)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Kage Kunai Technique"); 
          if (rand == 17 || rand == 18)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Summoning: Rolling Log"); 
        } 
        if (props.getWaterRelease() == 1) {
          int rand = par2World.rand.nextInt(22);
          par1ItemStack.stackTagCompound = new NBTTagCompound();
          if (rand == 4 || rand == 5 || rand == 6 || rand == 7)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Kage Shuriken Technique"); 
          if (rand == 8 || rand == 9 || rand == 10 || rand == 11)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Kage Kunai Technique"); 
          if (rand == 17 || rand == 18)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Water Release: Takigakure Sword"); 
          if (rand == 19 || rand == 20)
            par1ItemStack.stackTagCompound.setString("Jutsu", "Summoning: Rolling Log"); 
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    if (!par2World.isRemote && !player.capabilities.isCreativeMode && tools.freeSpace(player.inventory.mainInventory) > 0) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getJutsuPoints() >= 5) {
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Sexy Technique")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.KageBunshinSexy, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You learned the Sexy Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Kage Shuriken Technique")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.KageSmallShurikenJutsu, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You learned the Kage Shuriken Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Kage Kunai Technique")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.KageKunaiJutsu, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You learned the Kage Kunai Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Chakra for Health Charge")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ChakraRechargeUltimate, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned the Chakra for Health Charge Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Explosion Clone")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SuperExplosionItem, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You learned the Explosion Clone Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Mist Servant Technique")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.MistServantTechnique, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned the Mist Servant Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Summoning: Rolling Log")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.SummonLog, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned the Summoning: Rolling Log Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Water Release: Takigakure Sword")) {
          if (props.getWaterRelease() != 1) {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You cannot learn this jutsu as you do not"));
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("have the Water chakra nature type!"));
            return par1ItemStack;
          } 
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ItemWatercuttingSword, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned the Takigakure: WaterCutting Sword Technique!"));
        } 
        if (par1ItemStack.stackTagCompound.getString("Jutsu").equals("Bind Clone")) {
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.GenjutsuBindClone, 1, 0));
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Learned the Genjutsu: Bind Clone!"));
        } 
        props.setJutsuPoints(props.getJutsuPoints() - 5);
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
    par3List.add(EnumChatFormatting.RED + "Learn a D-B rank Jutsu");
    par3List.add(EnumChatFormatting.RED + "JP Cost: 5");
    if (par1ItemStack.stackTagCompound == null) {
      ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
      if (props.getWaterRelease() == 0) {
        par3List.add(EnumChatFormatting.GREEN + "Possible Jutsu:");
        par3List.add(EnumChatFormatting.BLUE + "- Sexy Technique");
        par3List.add(EnumChatFormatting.BLUE + "- Kage Shuriken Technique");
        par3List.add(EnumChatFormatting.BLUE + "- Kage Kunai Technique");
        par3List.add(EnumChatFormatting.DARK_PURPLE + "- Chakra for Health Charge");
        par3List.add(EnumChatFormatting.DARK_PURPLE + "- Summoning: Rolling Log");
        par3List.add(EnumChatFormatting.RED + "- Bind Clone");
        par3List.add(EnumChatFormatting.RED + "- Explosion Clone");
        par3List.add(EnumChatFormatting.RED + "- Mist Servant Technique");
      } 
      if (props.getWaterRelease() == 1) {
        par3List.add(EnumChatFormatting.GREEN + "Possible Jutsu:");
        par3List.add(EnumChatFormatting.BLUE + "- Sexy Technique");
        par3List.add(EnumChatFormatting.BLUE + "- Kage Shuriken Technique");
        par3List.add(EnumChatFormatting.BLUE + "- Kage Kunai Technique");
        par3List.add(EnumChatFormatting.DARK_PURPLE + "- Chakra for Health Charge");
        par3List.add(EnumChatFormatting.DARK_PURPLE + "- Summoning: Rolling Log");
        par3List.add(EnumChatFormatting.DARK_PURPLE + "- Water Release: Takigakure Sword");
        par3List.add(EnumChatFormatting.RED + "- Bind Clone");
        par3List.add(EnumChatFormatting.RED + "- Explosion Clone");
        par3List.add(EnumChatFormatting.RED + "- Mist Servant Technique");
      } 
    } 
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.GREEN + par1ItemStack.stackTagCompound.getString("Jutsu")); 
  }
}

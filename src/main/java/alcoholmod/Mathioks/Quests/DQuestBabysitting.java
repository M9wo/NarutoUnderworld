package alcoholmod.Mathioks.Quests;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncDQuestsMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class DQuestBabysitting extends Item {
  public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer player, EntityLivingBase target) {
    if (target instanceof alcoholmod.Mathioks.NPC.EntityQuestGiver && stack.stackTagCompound != null) {
      if (stack.getItemDamage() == 0 && !player.worldObj.isRemote) {
        stack.stackTagCompound.setString("Giver", target.getUniqueID().toString());
        stack.stackTagCompound.setString("Owner", player.getUniqueID().toString());
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("Woman: Please keep my baby safe while I"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("Woman: do my chores!"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("Woman: don't move far away please!"));
        stack.setItemDamage(50);
      } 
      if (stack.getItemDamage() == 100 && stack.stackTagCompound.getString("Giver").equals(target.getUniqueID().toString()) && !player.worldObj.isRemote) {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("Woman: Awww, who's a good baby? Come to momy"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("Woman: Thank you!"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("D-Mission Completed"));
        ExtendedPlayer props = ExtendedPlayer.get(player);
        props.setDQuests(props.getDQuests() + 1);
        int c = player.worldObj.rand.nextInt(4) + 2;
        props.setChakraExperience(props.getChakraExperience() + c);
        int a = player.worldObj.rand.nextInt(10) + 5;
        for (int b = 0; b < a; b++)
          player.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.RyoBronze)); 
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("Received " + a + " Bronze Ryo"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("Gained " + c + " Experience"));
        PacketDispatcher.sendTo((IMessage)new SyncDQuestsMessage(player), (EntityPlayerMP)player);
        PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage(player), (EntityPlayerMP)player);
        stack.stackSize--;
        return true;
      } 
      if (stack.getItemDamage() == 500 && !player.worldObj.isRemote) {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("Woman: What were you thinking trying to take away my baby?!"));
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("Woman: I'm never hiring a ninja again!"));
        stack.stackSize--;
      } 
    } 
    return false;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Receiver", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setInteger("Time", 1000);
        par1ItemStack.stackTagCompound.setDouble("Xposition", ((EntityPlayer)par3Entity).posX);
        par1ItemStack.stackTagCompound.setDouble("Yposition", ((EntityPlayer)par3Entity).posY);
        par1ItemStack.stackTagCompound.setDouble("Zposition", ((EntityPlayer)par3Entity).posZ);
      } 
      if (par1ItemStack.stackTagCompound != null) {
        double Xposition = par1ItemStack.stackTagCompound.getDouble("Xposition");
        double Yposition = par1ItemStack.stackTagCompound.getDouble("Yposition");
        double Zposition = par1ItemStack.stackTagCompound.getDouble("Zposition");
        int timeremaining = par1ItemStack.stackTagCompound.getInteger("Time");
        if (par1ItemStack.getItemDamage() == 50) {
          if ((Math.abs(((EntityPlayer)par3Entity).posX - Xposition) > 10.0D || Math.abs(((EntityPlayer)par3Entity).posY - Yposition) > 10.0D || Math.abs(((EntityPlayer)par3Entity).posZ - Zposition) > 10.0D) && !par2World.isRemote) {
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Woman: Where do you think you're going with my baby??!"));
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Woman: Give her back!"));
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("You strayed too far from the original location"));
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Mission Failed"));
            par1ItemStack.setItemDamage(500);
          } 
          timeremaining--;
          par1ItemStack.stackTagCompound.setInteger("Time", timeremaining);
          if (timeremaining == 0 && !par2World.isRemote) {
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Time is up, you fulfilled the mission"));
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Hand the baby back to the client"));
            par1ItemStack.setItemDamage(100);
          } 
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    if (!par2World.isRemote)
      player.addChatComponentMessage((IChatComponent)new ChatComponentText("Baby: WHEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE")); 
    return par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Receiver"));
      if (par1ItemStack.getItemDamage() == 0)
        par3List.add(EnumChatFormatting.DARK_AQUA + "Right click the client to start the mission"); 
      if (par1ItemStack.getItemDamage() == 50) {
        int Time = par1ItemStack.stackTagCompound.getInteger("Time");
        par3List.add(EnumChatFormatting.DARK_AQUA + "Time left: " + (Time / 1200) + ":" + (Time / 20 % 60));
      } 
    } 
  }
}

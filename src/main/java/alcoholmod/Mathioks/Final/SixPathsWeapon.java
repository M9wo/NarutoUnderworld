package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.AddedItems;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsOrbsMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import lc208.tools;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class SixPathsWeapon extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public SixPathsWeapon() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
        par1ItemStack.stackTagCompound.setString("currWeapon", "Shakujo (Rings)");
      } 
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter > 0) {
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      if (Par3EntityPlayer.isSneaking()) {
        String currWeapon = Par1ItemStack.stackTagCompound.getString("currWeapon");
        int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
        if (currWeapon == "Shakujo (Rings)" && counter == 0) {
          currWeapon = "Shakujo (Half)";
          Par1ItemStack.stackTagCompound.setString("currWeapon", currWeapon);
          counter = 5;
          Par1ItemStack.stackTagCompound.setInteger("counter", counter);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Selected Weapon: " + currWeapon));
        } 
        if (currWeapon == "Shakujo (Half)" && counter == 0) {
          currWeapon = "Shakujo (Rings)";
          Par1ItemStack.stackTagCompound.setString("currWeapon", currWeapon);
          counter = 5;
          Par1ItemStack.stackTagCompound.setInteger("counter", counter);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Selected Weapon: " + currWeapon));
        } 
      } 
      int EmptySpaces = tools.freeSpace(Par3EntityPlayer.inventory.mainInventory);
      if (EmptySpaces >= 1) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
          if (props.getSixPathsOrbs() >= 1 && props.getSixPaths() && props.getSixPathsMode()) {
            int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
            if (counter == 0) {
              props.setSixPathsOrbs(props.getSixPathsOrbs() - 1);
              PacketDispatcher.sendToServer((IMessage)new SyncSixPathsOrbsMessage(Par3EntityPlayer));
              if (Par1ItemStack.stackTagCompound.getString("currWeapon") == "Shakujo (Rings)") {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AddedItems.ShakujoObito));
              } else {
                Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AddedItems.ShakujoMadara));
              } 
              counter = 5;
              Par1ItemStack.stackTagCompound.setInteger("counter", counter);
            } 
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You must have at least one Truth-Seeking Orb to use this"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this jutsu"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You need at least one free space in your inventory to use this"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.AQUA + "Selected Weapon: " + par1ItemStack.stackTagCompound.getString("currWeapon"));
    } 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create a weapon out of a Truth-Seeking Orb");
  }
}

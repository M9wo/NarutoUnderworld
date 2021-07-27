package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsOrbsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsShieldMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class SixPathsShield extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public SixPathsShield() {
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
        par1ItemStack.stackTagCompound.setInteger("activeCounter", 0);
      } 
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      int activeCounter = par1ItemStack.stackTagCompound.getInteger("activeCounter");
      if (counter > 0 && activeCounter == 0) {
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
      if (activeCounter > 0) {
        activeCounter--;
        par1ItemStack.stackTagCompound.setInteger("activeCounter", activeCounter);
      } 
      EntityPlayer player = (EntityPlayer)par3Entity;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (activeCounter == 0 && props.getSixPathsShield()) {
        props.setSixPathsShield(false);
        PacketDispatcher.sendToServer((IMessage)new SyncSixPathsShieldMessage(player));
        props.setSixPathsOrbs(6);
        PacketDispatcher.sendToServer((IMessage)new SyncSixPathsOrbsMessage(player));
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        if (props.getSixPathsOrbs() >= 6 && props.getSixPaths() && props.getSixPathsMode()) {
          int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
          int activeCounter = Par1ItemStack.stackTagCompound.getInteger("activeCounter");
          if (counter == 0 && activeCounter == 0) {
            props.setSixPathsShield(true);
            PacketDispatcher.sendToServer((IMessage)new SyncSixPathsShieldMessage(Par3EntityPlayer));
            props.setSixPathsOrbs(0);
            PacketDispatcher.sendToServer((IMessage)new SyncSixPathsOrbsMessage(Par3EntityPlayer));
            activeCounter = 400;
            Par1ItemStack.stackTagCompound.setInteger("activeCounter", activeCounter);
            counter = 1600;
            Par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You must have six Truth-Seeking Orbs to use this"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this jutsu"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.AQUA + "Counter: " + par1ItemStack.stackTagCompound.getInteger("counter"));
      par3List.add(EnumChatFormatting.AQUA + "Active Counter: " + par1ItemStack.stackTagCompound.getInteger("activeCounter"));
    } 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create a shield out of six Truth-Seeking Orbs");
  }
}

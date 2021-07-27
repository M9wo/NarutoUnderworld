package alcoholmod.Mathioks.Intelligence;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class NinjaInfoCard extends JutsuItem {
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Player", "");
      par1ItemStack.stackTagCompound.setInteger("Land", 0);
      par1ItemStack.stackTagCompound.setInteger("Affiliation", 0);
      par1ItemStack.stackTagCompound.setInteger("Clan", 0);
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (Par1ItemStack.stackTagCompound.getInteger("Land") == 0) {
      if (!Par2World.isRemote) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        Par1ItemStack.stackTagCompound.setString("Player", Par3EntityPlayer.getCommandSenderName());
        Par1ItemStack.stackTagCompound.setInteger("Land", props.getLand());
        Par1ItemStack.stackTagCompound.setInteger("Affiliation", props.getAffiliation());
        Par1ItemStack.stackTagCompound.setInteger("Clan", props.getClan());
      } 
    } else if (Par2World.isRemote) {
      new alcoholmod.Mathioks.ExtraFunctions.NinjaInfoCard();
      Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new alcoholmod.Mathioks.ExtraFunctions.NinjaInfoCard());
    } 
    return Par1ItemStack;
  }
}

package alcoholmod.Mathioks.Final;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class JutsuItem extends Item {
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("counter") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      par1ItemStack.stackTagCompound.setInteger("counter", --counter);
    } 
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
}

package alcoholmod.Mathioks.Quests;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class KeyTestNBT extends Item {
  public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3Player) {
    par1ItemStack.stackTagCompound = new NBTTagCompound();
    par1ItemStack.stackTagCompound.setString("Owner", par3Player.getCommandSenderName());
    par1ItemStack.stackTagCompound.setInteger("Code", (int)(Math.random() * 2.147483647E9D));
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    if (par1ItemStack.stackTagCompound != null) {
      String owner = par1ItemStack.stackTagCompound.getString("Owner");
      int code = par1ItemStack.stackTagCompound.getInteger("Code");
      par3List.add("owner: " + owner);
      if (owner.equals(par2EntityPlayer.getCommandSenderName())) {
        par3List.add(EnumChatFormatting.GREEN + "code: " + code);
      } else {
        par3List.add(EnumChatFormatting.RED + "code: " + EnumChatFormatting.OBFUSCATED + code);
      } 
    } 
  }
}

package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Jutsu.JutsuLogic;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class EarthReleaseSandWaterfallFuneral extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public EarthReleaseSandWaterfallFuneral() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getEarthRelease() == 1 && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        boolean FireMode = Par1ItemStack.stackTagCompound.getBoolean("FireMode");
        int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
        if (props.getCurrentMana() >= 10) {
          JutsuLogic.makeBlockWall(Par2World, (EntityLivingBase)Par3EntityPlayer, (Block)Blocks.sand, counter);
          if (counter == 0) {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Sand Waterfall Funeral!"));
            props.consumeMana(10);
          } 
          counter++;
          Par1ItemStack.stackTagCompound.setInteger("counter", counter);
          if (counter == 20) {
            counter = 0;
            Par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
        } 
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create a wall of sand");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + '\n');
  }
}

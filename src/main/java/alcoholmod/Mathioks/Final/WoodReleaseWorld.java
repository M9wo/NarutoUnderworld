package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Jutsu.JutsuLogic;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class WoodReleaseWorld extends JutsuItem {
  private boolean isinair;
  
  public int[][] blockPos = new int[40][3];
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World Par2World, Entity Par3EntityPlayer, int par4, boolean par5) {
    if ((EntityPlayer)Par3EntityPlayer != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)Par3EntityPlayer).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setInteger("counter1", 0);
      par1ItemStack.stackTagCompound.setInteger("counter2", 0);
      par1ItemStack.stackTagCompound.setInteger("counter3", 0);
    } 
  }
  
  public WoodReleaseWorld() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
        int counter1 = Par1ItemStack.stackTagCompound.getInteger("counter1");
        int counter2 = Par1ItemStack.stackTagCompound.getInteger("counter2");
        int counter3 = Par1ItemStack.stackTagCompound.getInteger("counter3");
        if (props.getwoodRelease() == 1 && props.getCurrentMana() >= 100) {
          JutsuLogic.makeBlockWall(Par2World, (EntityLivingBase)Par3EntityPlayer, Blocks.log, counter);
          if (counter == 0)
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Wood Release: World of Trees Wall!!")); 
          counter++;
          Par1ItemStack.stackTagCompound.setInteger("counter", counter);
          if (counter == 10) {
            counter = 0;
            Par1ItemStack.stackTagCompound.setInteger("counter", counter);
            props.consumeMana(20);
          } 
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create a forest");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 100");
  }
}

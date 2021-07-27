package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntityEarthSpear;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class EarthReleaseEarthSpear extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public EarthReleaseEarthSpear() {
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getEarthRelease() == 1)
        if (props.getCurrentMana() >= 15.0D + 0.015D * props.getLevel()) {
          EntityEarthSpear EntityEarthSpear = new EntityEarthSpear(Par2World, (EntityLivingBase)Par3EntityPlayer);
          Par2World.spawnEntityInWorld((Entity)EntityEarthSpear);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Earth Release: Earth Flow Spear!!"));
          props.consumeMana((int)(15.0D + 0.015D * props.getLevel()));
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
        }  
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Shoots sand that creates");
    par3List.add(EnumChatFormatting.DARK_AQUA + "a sand spear wherever it hits");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (15.0D + 0.015D * props.getLevel()));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (5.0D + 0.005D * props.getLevel()));
  }
}

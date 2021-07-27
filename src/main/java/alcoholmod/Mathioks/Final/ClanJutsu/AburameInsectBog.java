package alcoholmod.Mathioks.Final.ClanJutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class AburameInsectBog extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public AburameInsectBog() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getClanName().contains("Aburame"))
        if (props.getCurrentMana() >= 50) {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Hidden Jutsu: Insect Bog!"));
          AburameInsectBogEntity fireball2 = new AburameInsectBogEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball2.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 2.0D, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball2);
          Par1ItemStack.stackTagCompound.setInteger("counter", 140);
          props.consumeMana(50);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create a sphere of Rinkaichu");
    par3List.add(EnumChatFormatting.DARK_AQUA + "that slowly move forward, poisoning");
    par3List.add(EnumChatFormatting.DARK_AQUA + "and damaging anything in their path");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 50");
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: 5/s + Poison");
  }
}

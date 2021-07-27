package alcoholmod.Mathioks.Final.CT;

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

public class InfernoGreatFireItem extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public InfernoGreatFireItem() {
    setMaxDamage(5100);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getmangekyouSharingan() >= 1 && props.getCurrentMana() >= 40 && !Par2World.isRemote) {
        Par2World.spawnEntityInWorld((Entity)new InfernoGreatFireEntity(Par2World, (EntityLivingBase)Par3EntityPlayer));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Blaze Release: Great Fireball Jutsu!!"));
        Par1ItemStack.stackTagCompound.setInteger("counter", 98);
        props.consumeMana(40);
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    par3List.add(EnumChatFormatting.DARK_AQUA + "An enhanced version of the Fireball Jutsu");
    par3List.add(EnumChatFormatting.DARK_AQUA + "by infusing Amaterasu fire through Kagutsuchi");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 40");
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: 25");
  }
}

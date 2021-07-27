package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntitySharinganKagutsuchiFlameControl;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class SharinganKagutsuchiFlameControl extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public SharinganKagutsuchiFlameControl() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && !Par2World.isRemote && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getmangekyouSharingan() >= 1 && props.getCurrentMana() >= 60) {
        Par2World.spawnEntityInWorld((Entity)new EntitySharinganKagutsuchiFlameControl(Par2World, (EntityLivingBase)Par3EntityPlayer));
        Par1ItemStack.stackTagCompound.setInteger("counter", 600);
        props.consumeMana(60);
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "bends amaterasu through kagutsuchi to");
    par3List.add(EnumChatFormatting.DARK_AQUA + "follow the opponent");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 60");
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: 25");
  }
}

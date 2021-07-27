package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntityKagutsuchiFallingSwords;
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

public class SharinganKagutsuchiFallingSwordsItem extends JutsuItem {
  private boolean isinair;
  
  private boolean FireMode;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public SharinganKagutsuchiFallingSwordsItem() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && !Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getSusanoTransformed() && props.getCurrentMana() >= 80) {
        Par2World.spawnEntityInWorld((Entity)new EntityKagutsuchiFallingSwords(Par2World, (EntityLivingBase)Par3EntityPlayer));
        this.isinair = true;
        props.consumeMana(80);
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    par3List.add(EnumChatFormatting.DARK_AQUA + "The ultimate kagutsuchi jutsu");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Needs susano'o to be active");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 80");
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: 40");
  }
}

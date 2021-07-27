package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.SusanoCage.InfernoCageEntity;
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

public class SharinganKagutsuchiFlameWrappingFire extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public SharinganKagutsuchiFlameWrappingFire() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && !Par2World.isRemote && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getmangekyouSharingan() >= 1 && props.getCurrentMana() >= 30) {
        InfernoCageEntity fireball2 = new InfernoCageEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
        fireball2.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ);
        Par2World.spawnEntityInWorld((Entity)fireball2);
        Par1ItemStack.stackTagCompound.setInteger("counter", 600);
        props.consumeMana(30);
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    par3List.add(EnumChatFormatting.DARK_AQUA + "creates a susano'o ribcage with");
    par3List.add(EnumChatFormatting.DARK_AQUA + "amaterasu flames around the user");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 30");
  }
}

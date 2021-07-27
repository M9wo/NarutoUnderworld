package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntityLavaAshStone;
import alcoholmod.Mathioks.ExtendedPlayer;
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

public class LavaReleaseAshStone extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public LavaReleaseAshStone() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getlavaRelease() == 1 && props.getCurrentMana() >= 20 && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
        Par2World.spawnEntityInWorld((Entity)new EntityLavaAshStone(Par2World, (EntityLivingBase)Par3EntityPlayer));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Lava Release: Ash Stone Sealing!"));
        Par1ItemStack.stackTagCompound.setInteger("counter", 40);
        props.consumeMana(20);
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Seal your opponent");
    par3List.add(EnumChatFormatting.DARK_AQUA + "with ash stone");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 20");
  }
}

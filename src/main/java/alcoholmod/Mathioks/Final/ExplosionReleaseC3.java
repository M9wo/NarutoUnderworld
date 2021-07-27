package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.ExplosionReleaseC3Entity;
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

public class ExplosionReleaseC3 extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ExplosionReleaseC3() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getCurrentMana() >= 200 && props.explosionRelease == 1) {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Explosion Release : C3!!"));
        ExplosionReleaseC3Entity fireball2 = new ExplosionReleaseC3Entity(Par2World, (EntityLivingBase)Par3EntityPlayer);
        fireball2.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 100.0D, Par3EntityPlayer.posZ);
        Par2World.spawnEntityInWorld((Entity)fireball2);
        props.consumeMana(200);
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "The Strongest Explosive Clay Jutsu");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 200");
  }
}

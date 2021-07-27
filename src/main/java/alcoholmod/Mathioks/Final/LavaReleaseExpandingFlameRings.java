package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntityLavaRing;
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

public class LavaReleaseExpandingFlameRings extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public LavaReleaseExpandingFlameRings() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getlavaRelease() == 1 && props.getCurrentMana() >= 30) {
        Par2World.spawnEntityInWorld((Entity)new EntityLavaRing(Par2World, (EntityLivingBase)Par3EntityPlayer));
        int i;
        for (i = 0; i < 8; i++) {
          Par2World.spawnParticle("lava", Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 0.0D, 0.0D, 0.0D);
          Par2World.spawnParticle("flame", Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 0.0D, 0.0D, 0.0D);
        } 
        for (i = 0; i < 800; i++) {
          Par2World.spawnParticle("lava", Par3EntityPlayer.posX + Par2World.rand.nextGaussian(), Par3EntityPlayer.posY + Par2World.rand.nextGaussian() * 0.25D, Par3EntityPlayer.posZ + Par2World.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
          Par2World.spawnParticle("flame", Par3EntityPlayer.posX + Par2World.rand.nextGaussian(), Par3EntityPlayer.posY + Par2World.rand.nextGaussian() * 0.25D, Par3EntityPlayer.posZ + Par2World.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
        } 
        props.consumeMana(30);
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Creates a ring of lava");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Explodes on impact and sets the enemy on fire");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + '\036');
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + '\f');
  }
}

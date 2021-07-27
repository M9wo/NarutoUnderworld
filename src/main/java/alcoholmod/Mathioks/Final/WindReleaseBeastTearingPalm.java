package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntityWindBeastTearingPalm;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class WindReleaseBeastTearingPalm extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public WindReleaseBeastTearingPalm() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getWindRelease() == 1 && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.stackTagCompound.getInteger("counter") == 0)
        if (props.getCurrentMana() >= 33 + props.getNinjutsu() / 600) {
          Par1ItemStack.stackTagCompound.setInteger("counter", 98);
          Par2World.spawnEntityInWorld((Entity)new EntityWindBeastTearingPalm(Par2World, (EntityLivingBase)Par3EntityPlayer));
          Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 25, 2));
          props.consumeMana(33 + props.getNinjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Shoot a vicious colored wind towards your");
    par3List.add(EnumChatFormatting.DARK_AQUA + "opponent, exploding on impact,");
    par3List.add(EnumChatFormatting.DARK_AQUA + "pushing them back, and giving you a short");
    par3List.add(EnumChatFormatting.DARK_AQUA + "resistance");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (33 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (13 + props.getNinjutsu() / 600));
  }
}

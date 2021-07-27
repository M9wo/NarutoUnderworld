package alcoholmod.Mathioks.NinjaItems;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class MilitaryPillRed extends ItemFood {
  public MilitaryPillRed(int p_i45340_1_, boolean p_i45340_2_) {
    super(p_i45340_1_, p_i45340_2_);
  }
  
  protected void onFoodEaten(ItemStack p_77849_1_, World world, EntityPlayer player) {
    if (!world.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      props.setCurrentMana(props.getCurrentMana() + 50);
      player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 600, 1));
      player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 1));
      player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 600, 1));
      player.addPotionEffect(new PotionEffect(Potion.resistance.id, 600, 0));
      player.addPotionEffect(new PotionEffect(Potion.hunger.id, 600, 0));
      player.addPotionEffect(new PotionEffect(Potion.jump.id, 600, 1));
      player.addPotionEffect(new PotionEffect(Potion.harm.id, 120, 0));
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.BLUE + "A Pressure-Increasing pill that Pushes the");
    par3List.add(EnumChatFormatting.BLUE + "user to its limits for a short time");
    par3List.add(EnumChatFormatting.BLUE + "This does however hurt the users body");
    par3List.add(EnumChatFormatting.BLUE + "considerably and make him very hungry");
  }
}

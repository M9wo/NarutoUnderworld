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

public class MilitaryPillBrown extends ItemFood {
  public MilitaryPillBrown(int p_i45340_1_, boolean p_i45340_2_) {
    super(p_i45340_1_, p_i45340_2_);
  }
  
  protected void onFoodEaten(ItemStack p_77849_1_, World world, EntityPlayer player) {
    if (!world.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getCurrentMana() >= 600) {
        props.setCurrentMana(0);
        player.addPotionEffect(new PotionEffect(Potion.heal.id, 100, 10));
      } 
      if (props.getCurrentMana() >= 350) {
        props.setCurrentMana(0);
        player.addPotionEffect(new PotionEffect(Potion.heal.id, 30, 5));
      } 
      if (props.getCurrentMana() >= 100) {
        props.setCurrentMana(0);
        player.addPotionEffect(new PotionEffect(Potion.heal.id, 10, 1));
      } 
      if (props.getCurrentMana() >= 50) {
        props.setCurrentMana(0);
        player.addPotionEffect(new PotionEffect(Potion.heal.id, 3, 0));
      } 
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.BLUE + "A Food pill that converts all chakra into");
    par3List.add(EnumChatFormatting.BLUE + "health. Recovery is based on chakra amount");
    par3List.add(EnumChatFormatting.BLUE + "Has no effect under 50 Chakra");
  }
}

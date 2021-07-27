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

public class MilitaryPillOrange extends ItemFood {
  public MilitaryPillOrange(int p_i45340_1_, boolean p_i45340_2_) {
    super(p_i45340_1_, p_i45340_2_);
  }
  
  protected void onFoodEaten(ItemStack p_77849_1_, World world, EntityPlayer player) {
    if (!world.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      props.setCurrentMana(props.getCurrentMana() + 75);
      player.addPotionEffect(new PotionEffect(Potion.hunger.id, 1000, 20));
      player.addPotionEffect(new PotionEffect(Potion.heal.id, 20, 4));
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.BLUE + "A Food pill that converts all the users");
    par3List.add(EnumChatFormatting.BLUE + "fibers into instant healing.");
    par3List.add(EnumChatFormatting.BLUE + "makes the user very hungry for a long period");
    par3List.add(EnumChatFormatting.BLUE + "of time");
  }
}

package alcoholmod.Mathioks.NinjaItems;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class MilitaryPillYellow extends ItemFood {
  public MilitaryPillYellow(int p_i45340_1_, boolean p_i45340_2_) {
    super(p_i45340_1_, p_i45340_2_);
  }
  
  protected void onFoodEaten(ItemStack p_77849_1_, World world, EntityPlayer player) {
    if (!world.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      props.setCurrentMana(props.getCurrentMana() + 400);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.BLUE + "A Military Rations pill, replenishes 400 chakra");
  }
}

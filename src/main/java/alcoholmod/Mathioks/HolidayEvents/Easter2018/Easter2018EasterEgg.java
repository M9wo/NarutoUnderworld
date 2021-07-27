package alcoholmod.Mathioks.HolidayEvents.Easter2018;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class Easter2018EasterEgg extends ItemFood {
  public Easter2018EasterEgg(int p_i45340_1_, boolean p_i45340_2_) {
    super(p_i45340_1_, p_i45340_2_);
    this.maxStackSize = 64;
  }
  
  protected void onFoodEaten(ItemStack p_77849_1_, World world, EntityPlayer player) {
    if (!world.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      props.setCurrentMana(props.getCurrentMana() + 10);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.BLUE + "A chocolate Easter Egg.");
    par3List.add(EnumChatFormatting.BLUE + "It seems to recover some chakra!");
    par3List.add(EnumChatFormatting.BLUE + "Happy Easter!");
    par3List.add(EnumChatFormatting.BLUE + "- Mathioks");
  }
}

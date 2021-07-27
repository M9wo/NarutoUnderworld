package alcoholmod.Mathioks.NinjaItems;

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

public class MilitaryPillGreen extends ItemFood {
  public MilitaryPillGreen(int p_i45340_1_, boolean p_i45340_2_) {
    super(p_i45340_1_, p_i45340_2_);
  }
  
  protected void onFoodEaten(ItemStack p_77849_1_, World world, EntityPlayer player) {
    if (!world.isRemote) {
      player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 500, 0));
      player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 500, 0));
      player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 50, 0));
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.BLUE + "A Blood-Increasing pill that replenishes lost");
    par3List.add(EnumChatFormatting.BLUE + "blood so the user can keep going in battle");
  }
}

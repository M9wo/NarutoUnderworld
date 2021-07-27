package alcoholmod.Mathioks.FoodItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class Ramen extends ItemFood {
  public Ramen(int p_i45340_1_, boolean p_i45340_2_) {
    super(p_i45340_1_, p_i45340_2_);
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.BLUE + "Ichiraku's famous ramen");
    par3List.add(EnumChatFormatting.BLUE + "the 7th Hokage claims this is the");
    par3List.add(EnumChatFormatting.BLUE + "best food in the world!");
    par3List.add(EnumChatFormatting.BLUE + "Itadakimasu! Eat up and fill your hunger!");
  }
}

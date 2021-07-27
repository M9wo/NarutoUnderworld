package alcoholmod.Mathioks.FinalUtilities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStore extends Item {
  public ItemStore(int par1) {
    setMaxStackSize(1);
    setCreativeTab(CreativeTabs.tabMisc);
  }
  
  public int getMaxItemUseDuration(ItemStack stack) {
    return 1;
  }
  
  public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
    if (!world.isRemote);
    return itemstack;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister) {
    this.itemIcon = iconRegister.registerIcon("inventoryitemmod:" + getUnlocalizedName().substring(5));
  }
}

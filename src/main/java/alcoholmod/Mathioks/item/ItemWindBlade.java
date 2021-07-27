package alcoholmod.Mathioks.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemWindBlade extends ItemSword {
  public ItemWindBlade(Item.ToolMaterial p_i45356_1_) {
    super(p_i45356_1_);
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
    par2EntityLivingBase.motionY++;
    return true;
  }
}

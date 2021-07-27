package alcoholmod.Mathioks.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemHitCombo extends ItemSword {
  private boolean isinair;
  
  public ItemHitCombo(Item.ToolMaterial p_i45356_1_) {
    super(p_i45356_1_);
    setMaxDamage(10);
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
    par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.jump.id, 30, -10));
    par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 30, 100));
    return true;
  }
}

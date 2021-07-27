package alcoholmod.Mathioks.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemIntimidation extends Item {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ItemIntimidation() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (Par1ItemStack.getItemDamage() == 0) {
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 550000, 2));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 550000, 1));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 550000, 2));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 550000, 1));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 550000, 1));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 550000, 0));
      Par1ItemStack.setItemDamage(50);
      return Par1ItemStack;
    } 
    if (Par1ItemStack.getItemDamage() == 50) {
      Par3EntityPlayer.removePotionEffect(Potion.moveSpeed.id);
      Par3EntityPlayer.removePotionEffect(Potion.jump.id);
      Par3EntityPlayer.removePotionEffect(Potion.damageBoost.id);
      Par3EntityPlayer.removePotionEffect(Potion.resistance.id);
      Par3EntityPlayer.removePotionEffect(Potion.fireResistance.id);
      Par3EntityPlayer.removePotionEffect(Potion.regeneration.id);
      Par1ItemStack.setItemDamage(0);
    } 
    return Par1ItemStack;
  }
}

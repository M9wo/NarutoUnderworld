package alcoholmod.Mathioks.Armor;

import alcoholmod.Mathioks.AlcoholMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ExtraArmor14 extends ItemArmor {
  private String[] armorTypes = new String[] { "helmetMizuJounin", "chestplateMizuJounin", "legsMizuJounin", "bootsMizuJounin" };
  
  public ExtraArmor14(ItemArmor.ArmorMaterial armorMaterial_, int i, int armorType) {
    super(armorMaterial_, i, armorType);
  }
  
  public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer) {
    return (!stack.getItem().equals(AlcoholMod.helmetMizuJounin) && !stack.getItem().equals(AlcoholMod.chestplateMizuJounin) && !stack.getItem().equals(AlcoholMod.bootsMizuJounin) && !stack.getItem().equals(AlcoholMod.legsMizuJounin)) ? "tm:textures/armor/mizukage jounin.png" : "tm:textures/armor/mizukage jounin.png";
  }
  
  public void registerIcons(IIconRegister reg) {
    if (this == AlcoholMod.helmetMizuJounin)
      this.itemIcon = reg.registerIcon("tm:helmetMizuJounin"); 
    if (this == AlcoholMod.chestplateMizuJounin)
      this.itemIcon = reg.registerIcon("tm:chestplateMizuJounin"); 
    if (this == AlcoholMod.legsMizuJounin)
      this.itemIcon = reg.registerIcon("tm:legsMizuJounin"); 
    if (this == AlcoholMod.bootsMizuJounin)
      this.itemIcon = reg.registerIcon("tm:bootsMizuJounin"); 
  }
}

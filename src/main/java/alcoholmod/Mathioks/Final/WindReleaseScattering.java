package alcoholmod.Mathioks.Final;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class WindReleaseScattering extends Item {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public WindReleaseScattering() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, 10));
    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 100, 7));
    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 100, 3));
    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("wind infused speeded up scattering slash!"));
    return Par1ItemStack;
  }
}

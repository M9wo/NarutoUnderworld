package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.AlcoholMod;
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

public class LightningRelease10HitCombo extends Item {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public LightningRelease10HitCombo() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    Par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(AlcoholMod.ItemHitCombo, 1));
    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 400, 10));
    Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 400, 6));
    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("10 Hit-Combo Jutsu!"));
    return Par1ItemStack;
  }
}

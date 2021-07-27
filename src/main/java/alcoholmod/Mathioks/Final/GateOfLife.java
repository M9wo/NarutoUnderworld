package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntityKaguyaBonePrison;
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

public class GateOfLife extends Item {
  private boolean isinair;
  
  public int counter = 0;
  
  public int counter1 = 0;
  
  public int counter2 = 0;
  
  private EntityKaguyaBonePrison EntityKaguyBonePrison;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public GateOfLife() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.getItemDamage() == 0) {
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 400000000, 2));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 400000000, 3));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 400000000, 3));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 400000000, 3));
      if (this.counter2 == 0) {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Gate of Life: OPEN!!"));
        this.counter2 = 1;
      } 
      Par1ItemStack.setItemDamage(50);
      this.counter += 30;
      return Par1ItemStack;
    } 
    if (!Par2World.isRemote && Par1ItemStack.getItemDamage() == 50) {
      Par3EntityPlayer.removePotionEffect(Potion.resistance.id);
      Par3EntityPlayer.removePotionEffect(Potion.jump.id);
      Par3EntityPlayer.removePotionEffect(Potion.moveSpeed.id);
      Par3EntityPlayer.removePotionEffect(Potion.damageBoost.id);
      Par1ItemStack.setItemDamage(0);
      if (this.counter2 == 1) {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Closed The Gate Of Life"));
        this.counter2 = 0;
      } 
      return Par1ItemStack;
    } 
    return Par1ItemStack;
  }
}

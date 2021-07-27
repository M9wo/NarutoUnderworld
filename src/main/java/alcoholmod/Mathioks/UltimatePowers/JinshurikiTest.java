package alcoholmod.Mathioks.UltimatePowers;

import alcoholmod.Mathioks.AlcoholMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class JinshurikiTest extends Item {
  private EntityPlayer player;
  
  private ItemStack ironHelmet;
  
  private ItemStack ironPlate;
  
  private ItemStack ironLegs;
  
  private ItemStack ironBoots;
  
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public JinshurikiTest() {
    setMaxDamage(18000);
    isDamageable();
    this.ironHelmet = new ItemStack(AlcoholMod.helmetJounin);
    this.ironPlate = new ItemStack(AlcoholMod.chestplateJounin);
    this.ironLegs = new ItemStack(AlcoholMod.legsJounin);
    this.ironBoots = new ItemStack(AlcoholMod.bootsJounin);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (Par1ItemStack.getItemDamage() == 0) {
      if (Par3EntityPlayer.inventory.armorItemInSlot(3) != null || Par3EntityPlayer.inventory.armorItemInSlot(2) != null || Par3EntityPlayer.inventory.armorItemInSlot(1) != null || Par3EntityPlayer.inventory.armorItemInSlot(0) != null) {
        Par3EntityPlayer.inventory.addItemStackToInventory(Par3EntityPlayer.inventory.armorItemInSlot(3));
        Par3EntityPlayer.inventory.addItemStackToInventory(Par3EntityPlayer.inventory.armorItemInSlot(2));
        Par3EntityPlayer.inventory.addItemStackToInventory(Par3EntityPlayer.inventory.armorItemInSlot(1));
        Par3EntityPlayer.inventory.addItemStackToInventory(Par3EntityPlayer.inventory.armorItemInSlot(0));
      } 
      Par3EntityPlayer.inventoryContainer.putStackInSlot(5, this.ironHelmet);
      Par3EntityPlayer.inventoryContainer.putStackInSlot(6, this.ironPlate);
      Par3EntityPlayer.inventoryContainer.putStackInSlot(7, this.ironLegs);
      Par3EntityPlayer.inventoryContainer.putStackInSlot(8, this.ironBoots);
      Par2World.playSoundAtEntity((Entity)Par3EntityPlayer, "tm:TailedScream", 5.0F, 1.0F);
      Par1ItemStack.setItemDamage(17900);
    } 
    return Par1ItemStack;
  }
}
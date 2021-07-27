package alcoholmod.Mathioks.FinalUtilities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerItem extends Container {
  final JutsuBook inventory;
  
  private static final int INV_START = 8;
  
  private static final int INV_END = 34;
  
  private static final int HOTBAR_START = 35;
  
  private static final int HOTBAR_END = 43;
  
  public ContainerItem(EntityPlayer par1Player, InventoryPlayer inventoryPlayer, JutsuBook jutsuBook) {
    this.inventory = jutsuBook;
    int i;
    for (i = 0; i < 8; i++)
      addSlotToContainer(new Slot(this.inventory, i, 80 + 18 * i / 4, 8 + 18 * i % 4)); 
    for (i = 0; i < 3; i++) {
      for (int j = 0; j < 9; j++)
        addSlotToContainer(new Slot((IInventory)inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18)); 
    } 
    for (i = 0; i < 9; i++)
      addSlotToContainer(new Slot((IInventory)inventoryPlayer, i, 8 + i * 18, 142)); 
  }
  
  public boolean canInteractWith(EntityPlayer entityplayer) {
    return this.inventory.isUseableByPlayer(entityplayer);
  }
  
  public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int index) {
    ItemStack itemstack = null;
    Slot slot = (Slot) this.inventorySlots.get(index);
    if (slot != null && slot.getHasStack()) {
      ItemStack itemstack1 = slot.getStack();
      itemstack = itemstack1.copy();
      if (index < 8) {
        if (!mergeItemStack(itemstack1, 8, 44, true))
          return null; 
        slot.onSlotChange(itemstack1, itemstack);
      } else {
        if (index >= 8 && !mergeItemStack(itemstack1, 0, 8, false))
          return null; 
        if (index >= 8 && index < 35) {
          if (!mergeItemStack(itemstack1, 35, 44, false))
            return null; 
        } else if (index >= 35 && index < 44 && !mergeItemStack(itemstack1, 8, 35, false)) {
          return null;
        } 
      } 
      if (itemstack1.stackSize == 0) {
        slot.putStack((ItemStack)null);
      } else {
        slot.onSlotChanged();
      } 
      if (itemstack1.stackSize == itemstack.stackSize)
        return null; 
      slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
    } 
    return itemstack;
  }
  
  public ItemStack slotClick(int slot, int button, int flag, EntityPlayer player) {
    return (slot >= 0 && getSlot(slot) != null && getSlot(slot).getStack() == player.getHeldItem()) ? null : super.slotClick(slot, button, flag, player);
  }
}

package alcoholmod.Mathioks.FinalUtilities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class JutsuBook implements IInventory {
  private String name = "Inventory Item";
  
  private final ItemStack invItem;
  
  public static final int INV_SIZE = 8;
  
  private ItemStack[] inventory = new ItemStack[8];
  
  public JutsuBook(ItemStack stack) {
    this.invItem = stack;
    if (!stack.hasTagCompound())
      stack.setTagCompound(new NBTTagCompound()); 
    readFromNBT(stack.getTagCompound());
  }
  
  public int getSizeInventory() {
    return this.inventory.length;
  }
  
  public ItemStack getStackInSlot(int slot) {
    return this.inventory[slot];
  }
  
  public ItemStack decrStackSize(int slot, int amount) {
    ItemStack stack = getStackInSlot(slot);
    if (stack != null)
      if (stack.stackSize > amount) {
        stack = stack.splitStack(amount);
        onInventoryChanged();
      } else {
        setInventorySlotContents(slot, (ItemStack)null);
      }  
    return stack;
  }
  
  public ItemStack getStackInSlotOnClosing(int slot) {
    ItemStack stack = getStackInSlot(slot);
    setInventorySlotContents(slot, (ItemStack)null);
    return stack;
  }
  
  public void setInventorySlotContents(int slot, ItemStack stack) {
    this.inventory[slot] = stack;
    if (stack != null && stack.stackSize > getInventoryStackLimit())
      stack.stackSize = getInventoryStackLimit(); 
    onInventoryChanged();
  }
  
  public String getInvName() {
    return this.name;
  }
  
  public boolean isInvNameLocalized() {
    return (this.name.length() > 0);
  }
  
  public int getInventoryStackLimit() {
    return 64;
  }
  
  public void onInventoryChanged() {
    for (int i = 0; i < getSizeInventory(); i++) {
      if (getStackInSlot(i) != null && (getStackInSlot(i)).stackSize == 0)
        this.inventory[i] = null; 
    } 
    writeToNBT(this.invItem.getTagCompound());
  }
  
  public boolean isUseableByPlayer(EntityPlayer entityplayer) {
    return true;
  }
  
  public void openChest() {}
  
  public void closeChest() {}
  
  public boolean isItemValidForSlot(int slot, ItemStack itemstack) {
    return !(itemstack.getItem() instanceof ItemStore);
  }
  
  public void readFromNBT(NBTTagCompound compound) {
    NBTTagList items = compound.getTagList("ItemInventory", 10);
    for (int i = 0; i < items.tagCount(); i++) {
      NBTTagCompound item = items.getCompoundTagAt(i);
      int slot = item.getInteger("Slot");
      if (slot >= 0 && slot < getSizeInventory())
        this.inventory[slot] = ItemStack.loadItemStackFromNBT(item); 
    } 
  }
  
  public void writeToNBT(NBTTagCompound tagcompound) {
    NBTTagList items = new NBTTagList();
    for (int i = 0; i < getSizeInventory(); i++) {
      if (getStackInSlot(i) != null) {
        NBTTagCompound item = new NBTTagCompound();
        item.setInteger("Slot", i);
        getStackInSlot(i).writeToNBT(item);
        items.appendTag((NBTBase)item);
      } 
    } 
    tagcompound.setTag("ItemInventory", (NBTBase)items);
  }
  
  public String getInventoryName() {
    return null;
  }
  
  public boolean hasCustomInventoryName() {
    return false;
  }
  
  public void markDirty() {}
  
  public void openInventory() {}
  
  public void closeInventory() {}
}

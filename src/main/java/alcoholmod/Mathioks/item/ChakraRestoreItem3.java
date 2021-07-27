package alcoholmod.Mathioks.item;

import alcoholmod.Mathioks.ExtendedPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ChakraRestoreItem3 extends Item {
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      props.setCurrentMana(props.getCurrentMana() + 105);
      Par1ItemStack.stackSize--;
    } 
    return Par1ItemStack;
  }
}

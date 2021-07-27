package alcoholmod.Mathioks.SpawnEggs;

import alcoholmod.Mathioks.NPC.NinjaTrader;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SpawnShopKeeper extends Item {
  public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
    if (!world.isRemote) {
      NinjaTrader entitygiantrhino = new NinjaTrader(world);
      entitygiantrhino.setLocationAndAngles(player.posX, player.posY, player.posZ, player.rotationYaw, player.rotationPitch);
      int rand = world.rand.nextInt(5);
      entitygiantrhino.setProfession(rand);
      world.spawnEntityInWorld((Entity)entitygiantrhino);
    } 
    itemstack.stackSize--;
    return itemstack;
  }
}

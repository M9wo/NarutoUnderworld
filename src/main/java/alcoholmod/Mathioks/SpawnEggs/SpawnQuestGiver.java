package alcoholmod.Mathioks.SpawnEggs;

import alcoholmod.Mathioks.NPC.EntityQuestGiver;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SpawnQuestGiver extends Item {
  public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
    if (!world.isRemote) {
      EntityQuestGiver entitygiantrhino = new EntityQuestGiver(world);
      entitygiantrhino.setLocationAndAngles(player.posX, player.posY, player.posZ, player.rotationYaw, player.rotationPitch);
      world.spawnEntityInWorld((Entity)entitygiantrhino);
    } 
    itemstack.stackSize--;
    return itemstack;
  }
}

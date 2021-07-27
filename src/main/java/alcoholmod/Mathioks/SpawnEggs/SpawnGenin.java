package alcoholmod.Mathioks.SpawnEggs;

import alcoholmod.Mathioks.NPC.EntityNPC;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SpawnGenin extends Item {
  public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
    if (!world.isRemote) {
      int rand = world.rand.nextInt(10);
      EntityNPC entitygiantrhino = new EntityNPC(world);
      entitygiantrhino.setTameSkin(rand);
      entitygiantrhino.setLocationAndAngles(player.posX, player.posY, player.posZ, player.rotationYaw, player.rotationPitch);
      world.spawnEntityInWorld((Entity)entitygiantrhino);
      itemstack.stackSize--;
    } 
    return itemstack;
  }
}

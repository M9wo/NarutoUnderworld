package alcoholmod.Mathioks.SpawnEggs;

import alcoholmod.Mathioks.NPC.EntityMizukage;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SpawnMizukage extends Item {
  public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
    if (!world.isRemote) {
      EntityMizukage entitygiantrhino = new EntityMizukage(world);
      entitygiantrhino.setLocationAndAngles(player.posX, player.posY, player.posZ, player.rotationYaw, player.rotationPitch);
      world.spawnEntityInWorld((Entity)entitygiantrhino);
    } 
    itemstack.stackSize--;
    return itemstack;
  }
}

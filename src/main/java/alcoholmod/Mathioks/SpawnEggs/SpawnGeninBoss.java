package alcoholmod.Mathioks.SpawnEggs;

import alcoholmod.Mathioks.NPC.EntityNPC;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SpawnGeninBoss extends Item {
  public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
    if (!world.isRemote) {
      EntityNPC entitygiantrhino = new EntityNPC(world);
      entitygiantrhino.setTameSkin(10);
      entitygiantrhino.setLocationAndAngles(player.posX, player.posY, player.posZ, player.rotationYaw, player.rotationPitch);
      world.spawnEntityInWorld((Entity)entitygiantrhino);
      EntityNPC entitygiantrhino2 = new EntityNPC(world);
      entitygiantrhino2.setTameSkin(11);
      entitygiantrhino2.setLocationAndAngles(player.posX, player.posY, player.posZ, player.rotationYaw, player.rotationPitch);
      world.spawnEntityInWorld((Entity)entitygiantrhino2);
      EntityNPC entitygiantrhino3 = new EntityNPC(world);
      entitygiantrhino3.setTameSkin(12);
      entitygiantrhino3.setLocationAndAngles(player.posX, player.posY, player.posZ, player.rotationYaw, player.rotationPitch);
      world.spawnEntityInWorld((Entity)entitygiantrhino3);
      itemstack.stackSize--;
    } 
    return itemstack;
  }
}

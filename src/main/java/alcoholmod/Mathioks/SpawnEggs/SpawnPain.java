package alcoholmod.Mathioks.SpawnEggs;

import alcoholmod.Mathioks.Boss.AkatsukiPain;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SpawnPain extends Item {
  public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
    if (!world.isRemote) {
      AkatsukiPain entitygiantrhino = new AkatsukiPain(world);
      entitygiantrhino.setLocationAndAngles(player.posX, player.posY, player.posZ, player.rotationYaw, player.rotationPitch);
      world.spawnEntityInWorld((Entity)entitygiantrhino);
      itemstack.stackSize--;
    } 
    return itemstack;
  }
}

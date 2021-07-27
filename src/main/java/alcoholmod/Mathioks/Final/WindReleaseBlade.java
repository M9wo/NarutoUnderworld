package alcoholmod.Mathioks.Final;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class WindReleaseBlade extends Item {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public WindReleaseBlade() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    List<Entity> list = Par2World.getEntitiesWithinAABBExcludingEntity((Entity)Par3EntityPlayer, AxisAlignedBB.getBoundingBox(Par3EntityPlayer.posX - 10.0D, Par3EntityPlayer.posY - 10.0D, Par3EntityPlayer.posZ - 10.0D, Par3EntityPlayer.posX + 10.0D, Par3EntityPlayer.posY + 10.0D, Par3EntityPlayer.posZ + 10.0D));
    for (int k2 = 0; k2 < list.size(); k2++) {
      Entity entity = list.get(k2);
      if (!(entity instanceof EntityPlayer)) {
        double d0 = entity.getDistance(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ);
        if (d0 <= 10.0D) {
          double dx = entity.posX - Par3EntityPlayer.posX;
          double dy = entity.posY - Par3EntityPlayer.posY;
          double dz = entity.posZ - Par3EntityPlayer.posZ;
          entity.motionX += dx * 1.75D / d0;
          entity.motionY += dy * 1.75D / d0 + 0.2D;
          entity.motionZ += dz * 1.75D / d0;
        } 
      } 
    } 
    Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Blade of Wind Jutsu!"));
    return Par1ItemStack;
  }
}

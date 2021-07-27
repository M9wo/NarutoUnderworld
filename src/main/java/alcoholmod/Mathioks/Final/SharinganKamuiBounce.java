package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class SharinganKamuiBounce extends Item {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public SharinganKamuiBounce() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      EntityPlayer player = Par3EntityPlayer;
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      List<Entity> list = Par2World.getEntitiesWithinAABBExcludingEntity((Entity)Par3EntityPlayer, AxisAlignedBB.getBoundingBox(Par3EntityPlayer.posX - 10.0D, Par3EntityPlayer.posY - 10.0D, Par3EntityPlayer.posZ - 10.0D, Par3EntityPlayer.posX + 10.0D, Par3EntityPlayer.posY + 10.0D, Par3EntityPlayer.posZ + 10.0D));
      for (int k2 = 0; k2 < list.size(); k2++) {
        Entity entity = list.get(k2);
        if (!(entity instanceof alcoholmod.Mathioks.Final.CT.EntityCT) && !(entity instanceof alcoholmod.Mathioks.Final.CT.SixPathsCTEntity) && !(entity instanceof alcoholmod.Mathioks.Final.CT.RinneganUnivPullEntity) && (entity instanceof net.minecraft.entity.projectile.EntityThrowable || entity instanceof EntityArrow || entity instanceof net.minecraft.entity.projectile.EntityFireball)) {
          double d0 = entity.getDistance(player.posX, player.posY, player.posZ);
          if (d0 <= 10.0D) {
            if (entity instanceof net.minecraft.entity.projectile.EntityThrowable);
            if (entity instanceof EntityArrow && ((EntityArrow)entity).shootingEntity != null) {
              double I = ((EntityArrow)entity).shootingEntity.posX;
              double J = ((EntityArrow)entity).shootingEntity.posY;
              double K = ((EntityArrow)entity).shootingEntity.posZ;
              float Y = entity.rotationYaw *= -1.0F;
              float P = entity.rotationPitch *= -1.0F;
              ((EntityArrow)entity).posX = I;
              ((EntityArrow)entity).posY = J;
              ((EntityArrow)entity).posZ = K;
            } 
            if (entity instanceof net.minecraft.entity.projectile.EntityFireball);
          } 
        } 
      } 
    } 
    return Par1ItemStack;
  }
}

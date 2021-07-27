package alcoholmod.Mathioks.item;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ChidoriSenbonEntity extends EntityArrow {
  public ChidoriSenbonEntity(World par1World) {
    super(par1World);
  }
  
  public ChidoriSenbonEntity(World par1World, double par2, double par4, double par6) {
    super(par1World, par2, par4, par6);
  }
  
  public ChidoriSenbonEntity(World par1World, EntityLivingBase par2EntityLiving, EntityLiving par3EntityLiving, float par4, float par5) {
    super(par1World, par2EntityLiving, (EntityLivingBase)par3EntityLiving, par4, par5);
  }
  
  public ChidoriSenbonEntity(World par1World, EntityLivingBase par2EntityLiving, float par3) {
    super(par1World, par2EntityLiving, par3);
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
    par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.jump.id, 30, -5));
    par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 30, 100));
    return true;
  }
  
  public void onCollideWithPlayer(EntityPlayer par1EntityPlayer) {
    if (!this.worldObj.isRemote);
  }
}

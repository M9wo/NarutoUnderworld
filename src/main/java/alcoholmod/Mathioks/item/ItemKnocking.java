package alcoholmod.Mathioks.item;

import alcoholmod.Mathioks.Entity.EntityKnocking;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemKnocking extends Item {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (par1ItemStack.getItemDamage() < par1ItemStack.getMaxDamage())
      par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() - 1); 
    if (par5 && par3Entity instanceof EntityPlayer) {
      EntityPlayer entityplayer = (EntityPlayer)par3Entity;
      if (par1ItemStack.getItemDamage() > 0);
    } 
    if (par1ItemStack.getItemDamage() < par1ItemStack.getMaxDamage() && par3Entity instanceof EntityPlayer) {
      EntityPlayer entityplayer = (EntityPlayer)par3Entity;
      if (this.isinair)
        for (int cp = 0; cp <= 10; cp++) {
          double d0 = itemRand.nextGaussian() * 0.02D;
          double d1 = itemRand.nextGaussian() * 0.02D;
          double d2 = itemRand.nextGaussian() * 0.02D;
          double dx = entityplayer.posX;
          double dy = entityplayer.posY - 1.8D;
          double d3 = entityplayer.posZ;
        }  
    } 
  }
  
  public ItemKnocking() {
    setMaxDamage(3700);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (Par1ItemStack.getItemDamage() <= 3040 && !Par2World.isRemote) {
      Par2World.spawnEntityInWorld((Entity)new EntityKnocking(Par2World, (EntityLivingBase)Par3EntityPlayer));
      Par1ItemStack.damageItem(600, (EntityLivingBase)Par3EntityPlayer);
      this.isinair = true;
    } 
    return Par1ItemStack;
  }
}

package alcoholmod.Mathioks.Jutsu;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class PuppetCrow1Summon extends Item {
  private boolean isinair;
  
  private Entity p_70085_1_;
  
  private Object worldObj;
  
  public PuppetCrow1Summon() {
    setMaxDamage(9600);
    isDamageable();
    this.maxStackSize = 1;
  }
  
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
  
  public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
    if (par1ItemStack.getItemDamage() <= 0) {
      PuppetCrow1Entity entityPuppet1 = new PuppetCrow1Entity(par3World);
      if (!par3World.isRemote) {
        entityPuppet1.func_152115_b(par2EntityPlayer.getUniqueID().toString());
        entityPuppet1.setTamed(true);
        entityPuppet1.setLocationAndAngles(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, MathHelper.wrapAngleTo180_float(par3World.rand.nextFloat() * 360.0F), 0.0F);
        entityPuppet1.rotationYawHead = entityPuppet1.rotationYaw;
        entityPuppet1.renderYawOffset = entityPuppet1.rotationYaw;
        par3World.spawnEntityInWorld((Entity)entityPuppet1);
        par1ItemStack.damageItem(9500, (EntityLivingBase)par2EntityPlayer);
        this.isinair = true;
      } 
      return true;
    } 
    return true;
  }
}

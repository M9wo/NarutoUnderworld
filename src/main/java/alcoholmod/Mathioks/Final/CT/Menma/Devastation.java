package alcoholmod.Mathioks.Final.CT.Menma;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Devastation extends ItemBow {
  private int firetick;
  
  private int firemax;
  
  public Devastation() {
    setUnlocalizedName("Origination");
    setMaxStackSize(1);
    setMaxDamage(150);
    this.firemax = 10;
    this.firetick = this.firemax;
  }
  
  @SideOnly(Side.CLIENT)
  public boolean isFull3D() {
    return true;
  }
  
  public int getBrightnessForRender(float p_70070_1_) {
    return 15728880;
  }
  
  public float getBrightness(float p_70013_1_) {
    return 1.0F;
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    if (!par2World.isRemote) {
      if (this.firetick == this.firemax && this.firemax != 0) {
        if (!par2World.isRemote) {
          par3EntityPlayer.setItemInUse(par1ItemStack, getMaxItemUseDuration(par1ItemStack));
          par2World.playSoundAtEntity((Entity)par3EntityPlayer, "stormarmory:boss.dropship.fire3", 10.0F, 1.0F);
          par2World.spawnEntityInWorld((Entity)new EntityDevastationBeam(par2World, (EntityLivingBase)par3EntityPlayer));
          par1ItemStack.damageItem(1, (EntityLivingBase)par3EntityPlayer);
        } 
        this.firetick = 0;
      } else {
        this.firetick++;
      } 
      if (this.firemax == 0) {
        par2World.playSoundAtEntity((Entity)par3EntityPlayer, "stormarmory:boss.dropship.fire3", 10.0F, 1.0F);
        par2World.spawnEntityInWorld((Entity)new EntityDevastationBeam(par2World, (EntityLivingBase)par3EntityPlayer));
      } 
    } 
    return par1ItemStack;
  }
  
  public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4) {
    this.firetick = this.firemax;
  }
  
  public static void mainRegistry() {}
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister reg) {}
}

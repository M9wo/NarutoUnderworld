package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class KamuiIntangibility extends JutsuItem {
  private boolean isinair;
  
  private boolean Intangibility = false;
  
  private int counter = 0;
  
  private int counter2 = 0;
  
  private int CheckCounter = 0;
  
  private boolean Check = false;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public KamuiIntangibility() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (this.counter2 > 0) {
      this.counter2--;
      if (!this.Intangibility)
        this.Intangibility = true; 
    } 
    if (this.counter2 <= 0 && this.Intangibility) {
      this.Intangibility = false;
      this.Check = true;
    } 
    if (this.Intangibility) {
      ((EntityPlayer)par3Entity).capabilities.allowFlying = true;
      ((EntityPlayer)par3Entity).fallDistance = 0.0F;
      ((EntityPlayer)par3Entity).capabilities.isFlying = true;
      ((EntityPlayer)par3Entity).noClip = true;
      ((EntityPlayer)par3Entity).capabilities.disableDamage = true;
    } 
    if (!this.Intangibility && this.Check) {
      ((EntityPlayer)par3Entity).capabilities.allowFlying = false;
      ((EntityPlayer)par3Entity).noClip = false;
      ((EntityPlayer)par3Entity).fallDistance = 1.0F;
      ((EntityPlayer)par3Entity).capabilities.isFlying = false;
      ((EntityPlayer)par3Entity).capabilities.disableDamage = false;
      this.CheckCounter++;
      if (this.CheckCounter == 20) {
        this.Check = false;
        this.CheckCounter = 0;
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getmangekyouSharingan() > 1)
        this.counter2 = 15; 
    } 
    return Par1ItemStack;
  }
}

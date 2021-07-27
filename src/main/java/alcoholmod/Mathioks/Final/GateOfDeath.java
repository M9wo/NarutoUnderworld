package alcoholmod.Mathioks.Final;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class GateOfDeath extends Item {
  private boolean isinair;
  
  public int counter = 0;
  
  public int counter1 = 0;
  
  public int counter2 = 0;
  
  public int counter3 = 0;
  
  private boolean GateOfDeath = false;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public GateOfDeath() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (this.GateOfDeath)
      this.counter3--; 
    super.onUpdate(par1ItemStack, par2World, par3Entity, par4, par5);
    if (this.counter == 3600 && this.GateOfDeath)
      ((EntityLivingBase)par3Entity).addPotionEffect(new PotionEffect(Potion.harm.id, 60, 32)); 
    if (this.counter == 2200 && this.GateOfDeath)
      ((EntityLivingBase)par3Entity).addPotionEffect(new PotionEffect(Potion.harm.id, 60, 32)); 
    if (this.counter == 1000 && this.GateOfDeath) {
      ((EntityLivingBase)par3Entity).addPotionEffect(new PotionEffect(Potion.harm.id, 60, 32));
      ((EntityLivingBase)par3Entity).addPotionEffect(new PotionEffect(Potion.hunger.id, 150, 20));
    } 
    if (this.counter == 400 && this.GateOfDeath) {
      ((EntityLivingBase)par3Entity).addPotionEffect(new PotionEffect(Potion.harm.id, 1500000000, 45));
      ((EntityLivingBase)par3Entity).addPotionEffect(new PotionEffect(Potion.hunger.id, 1500000000, 20));
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.getItemDamage() == 0) {
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.harm.id, 60, 0));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 400000000, 2));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 400000000, 15));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 400000000, 40));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 400000000, 40));
      if (this.counter2 == 0) {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Gate of Death: OPEN!!!!"));
        this.counter2 = 1;
      } 
      this.GateOfDeath = true;
      this.counter3 = 4800;
      Par1ItemStack.setItemDamage(50);
      this.counter += 30;
      return Par1ItemStack;
    } 
    if (!Par2World.isRemote && Par1ItemStack.getItemDamage() == 50) {
      Par3EntityPlayer.removePotionEffect(Potion.resistance.id);
      Par3EntityPlayer.removePotionEffect(Potion.jump.id);
      Par3EntityPlayer.removePotionEffect(Potion.moveSpeed.id);
      Par3EntityPlayer.removePotionEffect(Potion.damageBoost.id);
      Par1ItemStack.setItemDamage(0);
      if (this.counter2 == 1) {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Closed The Gate Of Death"));
        this.counter2 = 0;
        this.GateOfDeath = false;
      } 
      return Par1ItemStack;
    } 
    return Par1ItemStack;
  }
}

package alcoholmod.Mathioks.Final;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class ItemSharingan1 extends Item {
  private boolean isinair;
  
  private boolean Sharingan;
  
  private boolean IzanagiBool = true;
  
  private int IzanagiCounter;
  
  private boolean IzanagiRestore = false;
  
  private int IzanagiHealingCounter = 0;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ItemSharingan1() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (this.Sharingan && !par2World.isRemote) {
      if (this.IzanagiBool && (Minecraft.getMinecraft()).thePlayer.getHealth() <= 5.0F) {
        this.IzanagiRestore = true;
        this.IzanagiBool = false;
        this.IzanagiCounter = 0;
        ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("IZANAGI!!"));
      } else if (this.IzanagiRestore) {
        (Minecraft.getMinecraft()).thePlayer.setHealth(20.0F);
        ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.heal.id, 10, 50));
        this.IzanagiHealingCounter++;
        if (this.IzanagiHealingCounter == 20) {
          this.IzanagiRestore = false;
          this.IzanagiHealingCounter = 0;
        } 
      } 
      if (!this.IzanagiBool && this.IzanagiCounter <= 3000)
        this.IzanagiCounter++; 
      if (!this.IzanagiBool && this.IzanagiCounter == 2999)
        this.IzanagiBool = true; 
    } 
    if (this.Sharingan && !par2World.isRemote) {
      if (!((EntityPlayer)par3Entity).isPotionActive(Potion.moveSpeed.id))
        ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5500000, 2)); 
      if (!((EntityPlayer)par3Entity).isPotionActive(Potion.jump.id))
        ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.jump.id, 5500000, 2)); 
      if (!((EntityPlayer)par3Entity).isPotionActive(Potion.damageBoost.id))
        ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5500000, 1)); 
      if (!((EntityPlayer)par3Entity).isPotionActive(Potion.resistance.id))
        ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.resistance.id, 5500000, 0)); 
      if (!((EntityPlayer)par3Entity).isPotionActive(Potion.nightVision.id))
        ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.nightVision.id, 5500000, 1)); 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (Par1ItemStack.getItemDamage() == 0) {
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5500000, 2));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 5500000, 2));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5500000, 1));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 5500000, 0));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 5500000, 1));
      this.Sharingan = true;
      Par1ItemStack.setItemDamage(50);
      return Par1ItemStack;
    } 
    if (Par1ItemStack.getItemDamage() == 50) {
      Par3EntityPlayer.removePotionEffect(Potion.moveSpeed.id);
      Par3EntityPlayer.removePotionEffect(Potion.jump.id);
      Par3EntityPlayer.removePotionEffect(Potion.damageBoost.id);
      Par3EntityPlayer.removePotionEffect(Potion.resistance.id);
      Par3EntityPlayer.removePotionEffect(Potion.nightVision.id);
      this.Sharingan = false;
      Par1ItemStack.setItemDamage(0);
    } 
    return Par1ItemStack;
  }
}

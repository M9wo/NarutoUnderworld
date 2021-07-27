package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class KetsuryuganExpodingBloodTouch extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("counter") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      par1ItemStack.stackTagCompound.setInteger("counter", --counter);
    } 
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
    EntityPlayer player = (EntityPlayer)par3EntityLivingBase;
    ExtendedPlayer props = ExtendedPlayer.get(player);
    if (props.getKetsuryuganActive() && props.getCurrentMana() >= 25 + props.getNinjutsu() / 300 && par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      if (props.getLevel() < 250)
        player.worldObj.createExplosion((Entity)player, par2EntityLivingBase.posX, par2EntityLivingBase.posY, par2EntityLivingBase.posZ, 1.0F, false); 
      if (props.getLevel() >= 250 && props.getLevel() < 500)
        player.worldObj.createExplosion((Entity)player, par2EntityLivingBase.posX, par2EntityLivingBase.posY, par2EntityLivingBase.posZ, 2.0F, false); 
      if (props.getLevel() >= 500 && props.getLevel() < 750)
        player.worldObj.createExplosion((Entity)player, par2EntityLivingBase.posX, par2EntityLivingBase.posY, par2EntityLivingBase.posZ, 3.0F, false); 
      if (props.getLevel() >= 750)
        player.worldObj.createExplosion((Entity)player, par2EntityLivingBase.posX, par2EntityLivingBase.posY, par2EntityLivingBase.posZ, 4.0F, false); 
      par1ItemStack.stackTagCompound.setInteger("counter", 60);
      props.consumeMana(25 + props.getNinjutsu() / 300);
    } 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    par3List.add(EnumChatFormatting.DARK_AQUA + "By controlling your opponents");
    par3List.add(EnumChatFormatting.DARK_AQUA + "blood, you can make them");
    par3List.add(EnumChatFormatting.DARK_AQUA + "explode on contact");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + '\031');
    if (props.getLevel() < 250)
      par3List.add(EnumChatFormatting.DARK_AQUA + "Next Powerboost : Lvl 250"); 
    if (props.getLevel() >= 250 && props.getLevel() < 500)
      par3List.add(EnumChatFormatting.DARK_AQUA + "Next Powerboost : Lvl 500"); 
    if (props.getLevel() >= 500 && props.getLevel() < 750)
      par3List.add(EnumChatFormatting.DARK_AQUA + "Next Powerboost : Lvl 750"); 
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    ExtendedPlayer props = ExtendedPlayer.get(player);
    boolean canAttack = false;
    if (props.getCurrentMana() < 25)
      canAttack = true; 
    if (props.getCurrentMana() >= 25)
      canAttack = false; 
    return canAttack;
  }
  
  public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
    if (entityLiving instanceof EntityPlayer) {
      boolean canSwing = false;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityLiving);
      if (props.getCurrentMana() < 25)
        canSwing = true; 
      if (props.getCurrentMana() >= 25)
        canSwing = false; 
      return canSwing;
    } 
    return false;
  }
}

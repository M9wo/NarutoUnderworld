package alcoholmod.Mathioks.item;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemRasengan extends Item {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ItemRasengan() {
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World Par2World, Entity Par3EntityPlayer, int par4, boolean par5) {
    if ((EntityPlayer)Par3EntityPlayer != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)Par3EntityPlayer).getCommandSenderName());
        par1ItemStack.stackTagCompound.setBoolean("FireMode", false);
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
      } 
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter > 0) {
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
    } 
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
    if (par1ItemStack.stackTagCompound.getString("Owner").equals(((EntityPlayer)par3EntityLivingBase).getCommandSenderName())) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter == 0) {
        EntityPlayer player = (EntityPlayer)par3EntityLivingBase;
        ExtendedPlayer props = ExtendedPlayer.get(player);
        if (props.getCurrentMana() >= 100 && props.getCurrentSenjutsu() >= 90 + props.getSenjutsu() / 300) {
          float var4 = 1.0F;
          int i = (int)(par2EntityLivingBase.prevPosX + (par2EntityLivingBase.posX - par2EntityLivingBase.prevPosX) * var4);
          int j = (int)(par2EntityLivingBase.prevPosY + (par2EntityLivingBase.posY - par2EntityLivingBase.prevPosY) * var4 + 1.62D - par2EntityLivingBase.yOffset);
          int k = (int)(par2EntityLivingBase.prevPosZ + (par2EntityLivingBase.posZ - par2EntityLivingBase.prevPosZ) * var4);
          par1ItemStack.damageItem(1, par3EntityLivingBase);
          par2EntityLivingBase.addVelocity((-MathHelper.sin(par3EntityLivingBase.rotationYaw * 3.141593F / 180.0F) * j * 0.5F) / 11.0D, 0.1D, (MathHelper.cos(par3EntityLivingBase.rotationYaw * 3.141593F / 180.0F) * j * 0.5F) / 11.0D);
          par2EntityLivingBase.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)par3EntityLivingBase), 100.0F);
          props.consumeMana(100);
          par1ItemStack.stackTagCompound.setInteger("counter", 200);
        } 
      } 
      return false;
    } 
    return this.bFull3D;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.AQUA + "Counter: " + par1ItemStack.stackTagCompound.getString("counter"));
    } 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A jutsu used by the 4th and 7th ");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Hokage, throws the enemy back");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + 'd');
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + 'd');
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    ExtendedPlayer props = ExtendedPlayer.get(player);
    boolean canAttack = false;
    if (props.getCurrentMana() < 90)
      canAttack = true; 
    if (props.getCurrentMana() >= 90)
      canAttack = false; 
    return canAttack;
  }
  
  public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
    if (entityLiving instanceof EntityPlayer) {
      boolean canSwing = false;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityLiving);
      if (props.getCurrentMana() < 90)
        canSwing = true; 
      if (props.getCurrentMana() >= 90)
        canSwing = false; 
      return canSwing;
    } 
    return false;
  }
}

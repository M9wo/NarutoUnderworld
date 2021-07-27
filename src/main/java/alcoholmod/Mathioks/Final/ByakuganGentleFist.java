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
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;

public class ByakuganGentleFist extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
    if (par3EntityLivingBase instanceof EntityPlayer) {
      EntityPlayer player = (EntityPlayer)par3EntityLivingBase;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (par1ItemStack.stackTagCompound.getString("Owner").equals(par3EntityLivingBase.getCommandSenderName()) && props.getbyakugan() == 1 && props.getCurrentMana() >= 5 + props.getNinjutsu() / 300) {
        if (par2EntityLivingBase instanceof EntityPlayer) {
          ExtendedPlayer propsSource = ExtendedPlayer.get((EntityPlayer)par2EntityLivingBase);
          int MinusMana = (int)(10.0D + (props.getTaijutsu() - 1.0D) * 2.5D);
          propsSource.setCurrentMana(propsSource.getCurrentMana() - MinusMana);
        } 
        par2EntityLivingBase.attackEntityFrom(DamageSource.magic, (int)(props.getTaijutsu() / 1.3D));
        props.consumeMana(5 + props.getNinjutsu() / 300);
      } 
    } 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A jutsu used by members of the Hyuuga");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Clan, Takes away the opponents chakra");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (5 + props.getNinjutsu() / 300));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (props.getTaijutsu() / 1.3D));
    par3List.add(EnumChatFormatting.AQUA + "Chakra Taken Away: " + (10.0D + (props.getTaijutsu() - 1.0D) * 2.5D));
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    ExtendedPlayer props = ExtendedPlayer.get(player);
    boolean canAttack = false;
    if (props.getCurrentMana() < 5)
      canAttack = true; 
    if (props.getCurrentMana() >= 5)
      canAttack = false; 
    return canAttack;
  }
  
  public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
    if (entityLiving instanceof EntityPlayer) {
      boolean canSwing = false;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityLiving);
      if (props.getCurrentMana() < 5)
        canSwing = true; 
      if (props.getCurrentMana() >= 5)
        canSwing = false; 
      return canSwing;
    } 
    return false;
  }
}

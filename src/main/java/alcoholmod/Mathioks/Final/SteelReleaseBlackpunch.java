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
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class SteelReleaseBlackpunch extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
    } 
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
    EntityPlayer player = (EntityPlayer)par3EntityLivingBase;
    ExtendedPlayer props = ExtendedPlayer.get(player);
    if (par1ItemStack.stackTagCompound.getString("Owner").equals(((EntityPlayer)par3EntityLivingBase).getCommandSenderName())) {
      if (props.getCurrentMana() >= 10 + props.getNinjutsu() / 300) {
        par1ItemStack.damageItem(1, par3EntityLivingBase);
        byte amaterasuDamage = 7;
        par2EntityLivingBase.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)par3EntityLivingBase), amaterasuDamage + (props.getNinjutsu() / 300));
        props.consumeMana(10 + props.getNinjutsu() / 300);
      } else {
        ((EntityPlayer)par3EntityLivingBase).addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra!"));
      } 
    } else {
      ((EntityPlayer)par3EntityLivingBase).addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this jutsu"));
    } 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Engulf your fist in black steel to punch");
    par3List.add(EnumChatFormatting.DARK_AQUA + "your opponent causing heavy blunt damage");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (10 + props.getNinjutsu() / 300));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (7 + props.getNinjutsu() / 300));
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    ExtendedPlayer props = ExtendedPlayer.get(player);
    boolean canAttack = false;
    if (props.getCurrentMana() < 10)
      canAttack = true; 
    if (props.getCurrentMana() >= 10)
      canAttack = false; 
    return canAttack;
  }
  
  public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
    boolean canSwing = false;
    ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityLiving);
    if (props.getCurrentMana() < 10)
      canSwing = true; 
    if (props.getCurrentMana() >= 10)
      canSwing = false; 
    return canSwing;
  }
}

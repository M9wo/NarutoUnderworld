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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ExplosionReleaseExplodingPalm extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
    EntityPlayer player = (EntityPlayer)par3EntityLivingBase;
    ExtendedPlayer props = ExtendedPlayer.get(player);
    if (props.getCurrentMana() >= 25 + props.getNinjutsu() / 300 && par1ItemStack.stackTagCompound.getString("Owner").equals(par3EntityLivingBase.getCommandSenderName()) && props.explosionRelease == 1) {
      par3EntityLivingBase.addPotionEffect(new PotionEffect(Potion.resistance.id, 10, 10));
      boolean Explode = par1ItemStack.stackTagCompound.getBoolean("Explode");
      if (!Explode) {
        Explode = true;
        par1ItemStack.stackTagCompound.setBoolean("Explode", Explode);
      } 
      byte amaterasuDamage = 8;
      par2EntityLivingBase.attackEntityFrom(DamageSource.magic, amaterasuDamage + (props.getNinjutsu() / 300));
      props.consumeMana(25 + props.getNinjutsu() / 300);
    } 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    par3List.add(EnumChatFormatting.DARK_AQUA + "Creates a small explosion");
    par3List.add(EnumChatFormatting.DARK_AQUA + "in the user's palm");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (25 + props.getNinjutsu() / 300));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (8 + props.getNinjutsu() / 300));
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
    boolean canSwing = false;
    ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityLiving);
    if (props.getCurrentMana() < 25)
      canSwing = true; 
    if (props.getCurrentMana() >= 25)
      canSwing = false; 
    return canSwing;
  }
  
  public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) {
    if ((EntityPlayer)p_77663_3_ != null && p_77663_1_.stackTagCompound == null) {
      p_77663_1_.stackTagCompound = new NBTTagCompound();
      p_77663_1_.stackTagCompound.setString("Owner", ((EntityPlayer)p_77663_3_).getCommandSenderName());
      p_77663_1_.stackTagCompound.setBoolean("Explode", false);
    } 
    boolean Explode = p_77663_1_.stackTagCompound.getBoolean("Explode");
    if (Explode) {
      p_77663_2_.createExplosion(p_77663_3_, p_77663_3_.posX, p_77663_3_.posY, p_77663_3_.posZ, 1.0F, false);
      Explode = false;
      p_77663_1_.stackTagCompound.setBoolean("Explode", false);
    } 
  }
}

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
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BoilReleasePropulsionFist extends JutsuItem {
  private boolean start;
  
  private int counter;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setBoolean("start", false);
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    boolean start = par1ItemStack.stackTagCompound.getBoolean("start");
    int counter = par1ItemStack.stackTagCompound.getInteger("counter");
    if (start) {
      counter++;
      par1ItemStack.stackTagCompound.setInteger("counter", counter);
      if (counter <= 5)
        for (int i = 0; i < 800; i++)
          ((EntityPlayer)par3Entity).worldObj.spawnParticle("cloud", ((EntityPlayer)par3Entity).posX + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian(), ((EntityPlayer)par3Entity).posY + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.25D, ((EntityPlayer)par3Entity).posZ + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);  
      if (counter >= 6) {
        counter = 0;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
        start = false;
        par1ItemStack.stackTagCompound.setBoolean("start", start);
      } 
    } 
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
    if (par1ItemStack.stackTagCompound.getString("Owner").equals(((EntityPlayer)par3EntityLivingBase).getCommandSenderName())) {
      EntityPlayer player = (EntityPlayer)par3EntityLivingBase;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getboilRelease() == 1 && props.getCurrentMana() >= 25) {
        this.start = true;
        float var4 = 1.0F;
        int i = (int)(par2EntityLivingBase.prevPosX + (par2EntityLivingBase.posX - par2EntityLivingBase.prevPosX) * var4);
        int j = (int)(par2EntityLivingBase.prevPosY + (par2EntityLivingBase.posY - par2EntityLivingBase.prevPosY) * var4 + 1.62D - par2EntityLivingBase.yOffset);
        int k = (int)(par2EntityLivingBase.prevPosZ + (par2EntityLivingBase.posZ - par2EntityLivingBase.prevPosZ) * var4);
        par1ItemStack.damageItem(1, par3EntityLivingBase);
        par2EntityLivingBase.addVelocity((-MathHelper.sin(par3EntityLivingBase.rotationYaw * 3.141593F / 180.0F) * j * 0.5F) / 11.0D, 0.1D, (MathHelper.cos(par3EntityLivingBase.rotationYaw * 3.141593F / 180.0F) * j * 0.5F) / 11.0D);
        byte amaterasuDamage = 8;
        par2EntityLivingBase.attackEntityFrom(DamageSource.magic, amaterasuDamage + (props.getNinjutsu() / 300));
        props.consumeMana(25);
      } 
    } 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    par3List.add(EnumChatFormatting.DARK_AQUA + "Punches the opponent with");
    par3List.add(EnumChatFormatting.DARK_AQUA + "steam propulsion");
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
}

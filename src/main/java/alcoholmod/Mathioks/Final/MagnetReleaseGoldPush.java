package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.MagnetReleaseGoldDust2Entity2;
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
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class MagnetReleaseGoldPush extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public MagnetReleaseGoldPush() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setInteger("counter2", 0);
      par1ItemStack.stackTagCompound.setBoolean("StartCounting", false);
      par1ItemStack.stackTagCompound.setBoolean("FireMode", false);
      par1ItemStack.stackTagCompound.setInteger("kd", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("kd") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("kd");
      par1ItemStack.stackTagCompound.setInteger("kd", --counter);
    } 
    if (!par2World.isRemote) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      int counter2 = par1ItemStack.stackTagCompound.getInteger("counter2");
      boolean StartCounting = par1ItemStack.stackTagCompound.getBoolean("StartCounting");
      boolean FireMode = par1ItemStack.stackTagCompound.getBoolean("FireMode");
      if (StartCounting) {
        counter++;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
        if (counter >= 1) {
          FireMode = true;
          par1ItemStack.stackTagCompound.setBoolean("FireMode", FireMode);
          StartCounting = false;
          par1ItemStack.stackTagCompound.setBoolean("StartCounting", StartCounting);
          counter = 0;
          par1ItemStack.stackTagCompound.setInteger("counter", counter);
        } 
      } 
      if (FireMode) {
        counter2++;
        par1ItemStack.stackTagCompound.setInteger("counter2", counter2);
        if (counter2 >= 10) {
          FireMode = false;
          par1ItemStack.stackTagCompound.setBoolean("FireMode", FireMode);
          counter2 = 0;
          par1ItemStack.stackTagCompound.setInteger("counter2", counter2);
        } 
        MagnetReleaseGoldDust2Entity2 fireball1 = new MagnetReleaseGoldDust2Entity2(par2World, (EntityLivingBase)par3Entity);
        fireball1.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY + 1.0D, ((EntityPlayer)par3Entity).posZ);
        par2World.spawnEntityInWorld((Entity)fireball1);
        MagnetReleaseGoldDust2Entity2 fireball2 = new MagnetReleaseGoldDust2Entity2(par2World, (EntityLivingBase)par3Entity);
        fireball2.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY + 1.0D, ((EntityPlayer)par3Entity).posZ + 1.0D);
        par2World.spawnEntityInWorld((Entity)fireball2);
        MagnetReleaseGoldDust2Entity2 fireball3 = new MagnetReleaseGoldDust2Entity2(par2World, (EntityLivingBase)par3Entity);
        fireball3.setPosition(((EntityPlayer)par3Entity).posX + 1.0D, ((EntityPlayer)par3Entity).posY + 1.0D, ((EntityPlayer)par3Entity).posZ);
        par2World.spawnEntityInWorld((Entity)fireball3);
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.stackTagCompound.getInteger("kd") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getmagnetRelease() == 1 && props.getCurrentMana() >= 25 + props.getNinjutsu() / 600) {
        Par1ItemStack.stackTagCompound.setInteger("kd", 400);
        int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
        int counter2 = Par1ItemStack.stackTagCompound.getInteger("counter2");
        boolean StartCounting = Par1ItemStack.stackTagCompound.getBoolean("StartCounting");
        boolean FireMode = Par1ItemStack.stackTagCompound.getBoolean("FireMode");
        if (!StartCounting && !FireMode) {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Magnet Release: Gold Push!"));
          StartCounting = true;
          Par1ItemStack.stackTagCompound.setBoolean("StartCounting", StartCounting);
        } 
        props.consumeMana(25);
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Shoot out Magnet inbued Sand to");
    par3List.add(EnumChatFormatting.DARK_AQUA + "damage the opponent");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (25 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (15 + props.getNinjutsu() / 600));
  }
}

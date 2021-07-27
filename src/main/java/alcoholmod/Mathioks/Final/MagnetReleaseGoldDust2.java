package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.MagnetReleaseGoldDust2Entity;
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

public class MagnetReleaseGoldDust2 extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public MagnetReleaseGoldDust2() {
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
      par1ItemStack.stackTagCompound.setBoolean("FireMde", false);
    } 
    if (!par2World.isRemote) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      int counter2 = par1ItemStack.stackTagCompound.getInteger("counter2");
      boolean StartCounting = par1ItemStack.stackTagCompound.getBoolean("StartCounting");
      boolean FireMode = par1ItemStack.stackTagCompound.getBoolean("FireMode");
      if (StartCounting) {
        counter++;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
        if (counter >= 10) {
          FireMode = true;
          StartCounting = false;
          counter = 0;
          par1ItemStack.stackTagCompound.setBoolean("FireMode", FireMode);
          par1ItemStack.stackTagCompound.setBoolean("StartCounting", StartCounting);
          par1ItemStack.stackTagCompound.setInteger("counter", counter);
        } 
      } 
      if (FireMode) {
        counter2++;
        par1ItemStack.stackTagCompound.setInteger("counter2", counter2);
        if (counter2 >= 80) {
          FireMode = false;
          counter2 = 0;
          par1ItemStack.stackTagCompound.setBoolean("FireMode", FireMode);
          par1ItemStack.stackTagCompound.setInteger("counter2", counter2);
        } 
        MagnetReleaseGoldDust2Entity fireball1 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball1.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ);
        par2World.spawnEntityInWorld((Entity)fireball1);
        MagnetReleaseGoldDust2Entity fireball2 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball2.setPosition(((EntityPlayer)par3Entity).posX + 1.0D, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ);
        par2World.spawnEntityInWorld((Entity)fireball2);
        MagnetReleaseGoldDust2Entity fireball3 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball3.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ + 1.0D);
        par2World.spawnEntityInWorld((Entity)fireball3);
        MagnetReleaseGoldDust2Entity fireball4 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball4.setPosition(((EntityPlayer)par3Entity).posX - 1.0D, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ);
        par2World.spawnEntityInWorld((Entity)fireball4);
        MagnetReleaseGoldDust2Entity fireball5 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball5.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ - 1.0D);
        par2World.spawnEntityInWorld((Entity)fireball5);
        MagnetReleaseGoldDust2Entity fireball6 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball6.setPosition(((EntityPlayer)par3Entity).posX + 1.0D, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ + 1.0D);
        par2World.spawnEntityInWorld((Entity)fireball6);
        MagnetReleaseGoldDust2Entity fireball7 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball7.setPosition(((EntityPlayer)par3Entity).posX - 1.0D, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ + 1.0D);
        par2World.spawnEntityInWorld((Entity)fireball7);
        MagnetReleaseGoldDust2Entity fireball8 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball8.setPosition(((EntityPlayer)par3Entity).posX - 1.0D, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ - 1.0D);
        par2World.spawnEntityInWorld((Entity)fireball8);
        MagnetReleaseGoldDust2Entity fireball9 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball9.setPosition(((EntityPlayer)par3Entity).posX + 1.0D, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ - 1.0D);
        par2World.spawnEntityInWorld((Entity)fireball9);
        MagnetReleaseGoldDust2Entity fireball26 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball26.setPosition(((EntityPlayer)par3Entity).posX + 2.0D, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ);
        par2World.spawnEntityInWorld((Entity)fireball26);
        MagnetReleaseGoldDust2Entity fireball27 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball27.setPosition(((EntityPlayer)par3Entity).posX - 2.0D, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ);
        par2World.spawnEntityInWorld((Entity)fireball27);
        MagnetReleaseGoldDust2Entity fireball28 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball28.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ - 2.0D);
        par2World.spawnEntityInWorld((Entity)fireball28);
        MagnetReleaseGoldDust2Entity fireball29 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball29.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ + 2.0D);
        par2World.spawnEntityInWorld((Entity)fireball29);
        MagnetReleaseGoldDust2Entity fireball36 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball36.setPosition(((EntityPlayer)par3Entity).posX + 3.0D, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ);
        par2World.spawnEntityInWorld((Entity)fireball36);
        MagnetReleaseGoldDust2Entity fireball37 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball37.setPosition(((EntityPlayer)par3Entity).posX - 3.0D, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ);
        par2World.spawnEntityInWorld((Entity)fireball37);
        MagnetReleaseGoldDust2Entity fireball38 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball38.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ - 3.0D);
        par2World.spawnEntityInWorld((Entity)fireball38);
        MagnetReleaseGoldDust2Entity fireball39 = new MagnetReleaseGoldDust2Entity(par2World, (EntityLivingBase)par3Entity);
        fireball39.setPosition(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY - 6.0D, ((EntityPlayer)par3Entity).posZ + 3.0D);
        par2World.spawnEntityInWorld((Entity)fireball39);
        fireball1.motionY = 1.7D;
        fireball2.motionY = 1.7D;
        fireball3.motionY = 1.7D;
        fireball4.motionY = 1.7D;
        fireball5.motionY = 1.7D;
        fireball6.motionY = 1.7D;
        fireball7.motionY = 1.7D;
        fireball8.motionY = 1.7D;
        fireball9.motionY = 1.7D;
        fireball26.motionY = 1.7D;
        fireball27.motionY = 1.7D;
        fireball28.motionY = 1.7D;
        fireball29.motionY = 1.7D;
        fireball36.motionY = 1.7D;
        fireball37.motionY = 1.7D;
        fireball38.motionY = 1.7D;
        fireball39.motionY = 1.7D;
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
    ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        if (props.getCurrentMana() >= 70) {
          if (props.getmagnetRelease() == 1) {
            int counter2 = Par1ItemStack.stackTagCompound.getInteger("counter2");
            boolean StartCounting = Par1ItemStack.stackTagCompound.getBoolean("StartCounting");
            boolean FireMode = Par1ItemStack.stackTagCompound.getBoolean("FireMode");
            if (!StartCounting && !FireMode) {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Magnet Release: Gold Dust Imperial Funeral!"));
              StartCounting = true;
              Par1ItemStack.stackTagCompound.setBoolean("StartCounting", StartCounting);
            } 
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
      }  
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Shoots lethal iron sand towards the opponent");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (70 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (40 + props.getNinjutsu() / 600));
  }
}

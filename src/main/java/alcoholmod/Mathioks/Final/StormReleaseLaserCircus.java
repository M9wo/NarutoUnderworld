package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.LightningReleaseChidoriSharpSpearEntity;
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

public class StormReleaseLaserCircus extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World Par2World, Entity Par3EntityPlayer, int par4, boolean par5) {
    if ((EntityPlayer)Par3EntityPlayer != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)Par3EntityPlayer).getCommandSenderName());
      par1ItemStack.stackTagCompound.setBoolean("SharpSpearStart", false);
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    boolean SharpSpearStart = par1ItemStack.stackTagCompound.getBoolean("SharpSpearStart");
    if (!Par2World.isRemote && SharpSpearStart) {
      EntityPlayer player = (EntityPlayer)Par3EntityPlayer;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      for (int counter = 0; counter < 10; counter++) {
        LightningReleaseChidoriSharpSpearEntity fireball1 = new LightningReleaseChidoriSharpSpearEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
        fireball1.setPosition(((EntityPlayer)Par3EntityPlayer).posX + 1.0D, ((EntityPlayer)Par3EntityPlayer).posY + 1.0D, ((EntityPlayer)Par3EntityPlayer).posZ);
        fireball1.Storm = true;
        Par2World.spawnEntityInWorld((Entity)fireball1);
        LightningReleaseChidoriSharpSpearEntity fireball2 = new LightningReleaseChidoriSharpSpearEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
        fireball2.setPosition(((EntityPlayer)Par3EntityPlayer).posX - 1.0D, ((EntityPlayer)Par3EntityPlayer).posY + 1.0D, ((EntityPlayer)Par3EntityPlayer).posZ);
        fireball2.Storm = true;
        Par2World.spawnEntityInWorld((Entity)fireball2);
        LightningReleaseChidoriSharpSpearEntity fireball3 = new LightningReleaseChidoriSharpSpearEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
        fireball3.setPosition(((EntityPlayer)Par3EntityPlayer).posX, ((EntityPlayer)Par3EntityPlayer).posY + 2.0D, ((EntityPlayer)Par3EntityPlayer).posZ + 1.0D);
        fireball3.Storm = true;
        Par2World.spawnEntityInWorld((Entity)fireball3);
        LightningReleaseChidoriSharpSpearEntity fireball4 = new LightningReleaseChidoriSharpSpearEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
        fireball4.setPosition(((EntityPlayer)Par3EntityPlayer).posX, ((EntityPlayer)Par3EntityPlayer).posY + 2.0D, ((EntityPlayer)Par3EntityPlayer).posZ - 1.0D);
        fireball4.Storm = true;
        Par2World.spawnEntityInWorld((Entity)fireball4);
      } 
      int counter2 = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter2 > 0) {
        counter2--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter2);
      } 
      if (counter2 < 1) {
        counter2 = 2;
        par1ItemStack.stackTagCompound.setInteger("counter", counter2);
        props.consumeMana(1);
      } 
      if (props.getCurrentMana() < 1) {
        SharpSpearStart = false;
        par1ItemStack.stackTagCompound.setBoolean("SharpSpearStart", SharpSpearStart);
        ((EntityPlayer)Par3EntityPlayer).addChatComponentMessage((IChatComponent)new ChatComponentText("Storm Release: Laser Circus-Stop"));
      } 
    } 
  }
  
  public StormReleaseLaserCircus() {
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        boolean SharpSpearStart = Par1ItemStack.stackTagCompound.getBoolean("SharpSpearStart");
        if (!SharpSpearStart) {
          if (props.getstormRelease() == 1)
            if (props.getCurrentMana() >= 10) {
              SharpSpearStart = true;
              Par1ItemStack.stackTagCompound.setBoolean("SharpSpearStart", SharpSpearStart);
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Storm Release: Laser Circus!"));
            } else {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You don't have enough chakra"));
            }  
        } else if (SharpSpearStart) {
          SharpSpearStart = false;
          Par1ItemStack.stackTagCompound.setBoolean("SharpSpearStart", SharpSpearStart);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Storm Release: Laser Circus-Stop"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this Jutsu"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A storm release jutsu that");
    par3List.add(EnumChatFormatting.DARK_AQUA + "shoots beams of storm chakra");
    par3List.add(EnumChatFormatting.DARK_AQUA + "in front of the user, catching");
    par3List.add(EnumChatFormatting.DARK_AQUA + "and paralyzing any entity in its way");
    par3List.add(EnumChatFormatting.GOLD + "initial needed Chakra: " + '\n');
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost/sec: " + '\n');
    par3List.add(EnumChatFormatting.DARK_RED + "Damage/sec: " + '\005');
  }
}

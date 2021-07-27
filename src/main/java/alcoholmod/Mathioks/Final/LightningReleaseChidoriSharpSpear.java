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

public class LightningReleaseChidoriSharpSpear extends JutsuItem {
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
      par1ItemStack.stackTagCompound.setInteger("k", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("k") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("k");
      par1ItemStack.stackTagCompound.setInteger("k", --counter);
    } 
    boolean SharpSpearStart = par1ItemStack.stackTagCompound.getBoolean("SharpSpearStart");
    if (!Par2World.isRemote && SharpSpearStart) {
      EntityPlayer player = (EntityPlayer)Par3EntityPlayer;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      for (int counter = 0; counter < 10; counter++)
        Par2World.spawnEntityInWorld((Entity)new LightningReleaseChidoriSharpSpearEntity(Par2World, (EntityLivingBase)Par3EntityPlayer)); 
      int counter2 = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter2 > 0) {
        counter2--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter2);
      } 
      if (counter2 < 1) {
        counter2 = 5;
        par1ItemStack.stackTagCompound.setInteger("counter", counter2);
        props.consumeMana(1);
      } 
      if (props.getCurrentMana() < 1) {
        SharpSpearStart = false;
        par1ItemStack.stackTagCompound.setBoolean("SharpSpearStart", SharpSpearStart);
        ((EntityPlayer)Par3EntityPlayer).addChatComponentMessage((IChatComponent)new ChatComponentText("Chidori Sharp Spear-Stop"));
      } 
      int kd = par1ItemStack.stackTagCompound.getInteger("kd");
      if (kd > 0)
        par1ItemStack.stackTagCompound.setInteger("kd", kd - 1); 
      if (kd <= 0) {
        par1ItemStack.stackTagCompound.setBoolean("SharpSpearStart", false);
        ((EntityPlayer)Par3EntityPlayer).addChatComponentMessage((IChatComponent)new ChatComponentText("Adamantine Sealing Chains-Stop"));
        par1ItemStack.stackTagCompound.setInteger("kd", 0);
      } 
    } 
  }
  
  public LightningReleaseChidoriSharpSpear() {
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getInteger("k") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        if (props.getLightningRelease() == 1) {
          boolean SharpSpearStart = Par1ItemStack.stackTagCompound.getBoolean("SharpSpearStart");
          if (!SharpSpearStart) {
            if (props.getCurrentMana() >= 10) {
              SharpSpearStart = true;
              Par1ItemStack.stackTagCompound.setBoolean("SharpSpearStart", SharpSpearStart);
              Par1ItemStack.stackTagCompound.setInteger("k", 1200);
              Par1ItemStack.stackTagCompound.setInteger("kd", 600);
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Chidori Sharp Spear!!"));
            } else {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You don't have enough chakra"));
            } 
          } else if (SharpSpearStart) {
            SharpSpearStart = false;
            Par1ItemStack.stackTagCompound.setBoolean("SharpSpearStart", SharpSpearStart);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Chidori Sharp Spear-Stop"));
          } 
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "A nature transformation of the Chidori");
    par3List.add(EnumChatFormatting.DARK_AQUA + "technique. This justu shoots the chidori");
    par3List.add(EnumChatFormatting.DARK_AQUA + "in a straight line, piercing through objects");
    par3List.add(EnumChatFormatting.DARK_AQUA + "and moving your opponent with the beam.");
    par3List.add(EnumChatFormatting.GOLD + "initial needed Chakra: " + '\n');
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost/sec: " + '\005');
    par3List.add(EnumChatFormatting.DARK_RED + "Damage/sec: " + '\005');
  }
}

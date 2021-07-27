package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntityGreatAnnihilation;
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
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class FireReleaseGreatFireAnnihilation extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setBoolean("FireMode", false);
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setInteger("kd", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("kd") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("kd");
      par1ItemStack.stackTagCompound.setInteger("kd", --counter);
    } 
    boolean FireMode = par1ItemStack.stackTagCompound.getBoolean("FireMode");
    if (FireMode) {
      EntityPlayer player = (EntityPlayer)par3Entity;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      counter++;
      if (counter == 5) {
        par2World.spawnEntityInWorld((Entity)new EntityGreatAnnihilation(par2World, (EntityLivingBase)par3Entity));
        props.consumeMana(15);
      } 
      if (counter == 35) {
        par2World.spawnEntityInWorld((Entity)new EntityGreatAnnihilation(par2World, (EntityLivingBase)par3Entity));
        props.consumeMana(15);
      } 
      if (counter == 65) {
        par2World.spawnEntityInWorld((Entity)new EntityGreatAnnihilation(par2World, (EntityLivingBase)par3Entity));
        props.consumeMana(15);
      } 
      if (counter == 95) {
        par2World.spawnEntityInWorld((Entity)new EntityGreatAnnihilation(par2World, (EntityLivingBase)par3Entity));
        props.consumeMana(15);
      } 
      if (counter >= 100) {
        FireMode = false;
        par1ItemStack.stackTagCompound.setBoolean("FireMode", FireMode);
        boolean bool = false;
      } 
    } 
  }
  
  public FireReleaseGreatFireAnnihilation() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getFireRelease() == 1 && props.getCurrentMana() >= 25 + props.getNinjutsu() / 600 && Par1ItemStack.stackTagCompound.getInteger("kd") == 0) {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Great Fire Annihilation!"));
        Par1ItemStack.stackTagCompound.setInteger("kd", 140);
        Par2World.spawnEntityInWorld((Entity)new EntityGreatAnnihilation(Par2World, (EntityLivingBase)Par3EntityPlayer));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "The ultimate Fire Release Jutsu");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Sets everything in front of you ablaze");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost/second: " + '\031');
    par3List.add(EnumChatFormatting.DARK_RED + "Damage/second: " + '\017');
  }
}

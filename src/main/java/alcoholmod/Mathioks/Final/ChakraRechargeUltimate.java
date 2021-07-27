package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class ChakraRechargeUltimate extends JutsuItem {
  private int counter;
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ChakraRechargeUltimate() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public boolean onLeftClickEntity(ItemStack Par1ItemStack, EntityPlayer Par3EntityPlayer, Entity entity) {
    if (!Par3EntityPlayer.worldObj.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 5) {
        counter++;
        Par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
      if (counter >= 10 && entity instanceof EntityPlayer) {
        ExtendedPlayer props2 = ExtendedPlayer.get((EntityPlayer)entity);
        counter = 0;
        Par1ItemStack.stackTagCompound.setInteger("counter", counter);
        props2.regenMana(10);
        Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.harm.id, 20, 1));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Chakra for Health Technique!"));
      } 
    } 
    return true;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 5) {
        counter++;
        Par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
      if (counter >= 10) {
        counter = 0;
        Par1ItemStack.stackTagCompound.setInteger("counter", counter);
        props.regenMana(10);
        Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.harm.id, 20, 1));
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Medical jutsu: Nourishment Jutsu!"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.AQUA + "Counter: " + par1ItemStack.stackTagCompound.getInteger("counter"));
    } 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A ninjutsu that lies close to");
    par3List.add(EnumChatFormatting.DARK_AQUA + "medical ninjutsu, replenishing");
    par3List.add(EnumChatFormatting.DARK_AQUA + "chakra of either the user or target");
    par3List.add(EnumChatFormatting.DARK_AQUA + "at the cost of health");
  }
}

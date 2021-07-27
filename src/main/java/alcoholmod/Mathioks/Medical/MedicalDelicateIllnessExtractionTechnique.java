package alcoholmod.Mathioks.Medical;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
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
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class MedicalDelicateIllnessExtractionTechnique extends JutsuItem {
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
  
  public MedicalDelicateIllnessExtractionTechnique() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public boolean onLeftClickEntity(ItemStack Par1ItemStack, EntityPlayer Par3EntityPlayer, Entity entity) {
    if (!Par3EntityPlayer.worldObj.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter < 50) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getCurrentMana() >= 5) {
          counter++;
          Par1ItemStack.stackTagCompound.setInteger("counter", counter);
        } 
        if (counter == 50) {
          ((EntityLivingBase)entity).removePotionEffect(Potion.poison.id);
          counter = 0;
          Par1ItemStack.stackTagCompound.setInteger("counter", counter);
          props.consumeMana(5);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Medical jutsu: Delicate Illness Extraction Technique!"));
        } 
      } 
    } 
    return true;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter < 50) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getCurrentMana() >= 5) {
          counter++;
          Par1ItemStack.stackTagCompound.setInteger("counter", counter);
        } 
        if (counter == 50) {
          Par3EntityPlayer.removePotionEffect(Potion.poison.id);
          counter = 0;
          Par1ItemStack.stackTagCompound.setInteger("counter", counter);
          props.consumeMana(5);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Medical jutsu: Delicate Illness Extraction Technique!"));
        } 
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "A medical ninjutsu that");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Removes poison from the");
    par3List.add(EnumChatFormatting.DARK_AQUA + "user or target");
  }
}

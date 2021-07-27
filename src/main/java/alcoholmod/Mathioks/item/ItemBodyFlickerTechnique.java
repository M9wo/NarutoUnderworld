package alcoholmod.Mathioks.item;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
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

public class ItemBodyFlickerTechnique extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ItemBodyFlickerTechnique() {
    setMaxDamage(6001);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (!par2World.isRemote && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setInteger("kd", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("kd") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("kd");
      par1ItemStack.stackTagCompound.setInteger("kd", --counter);
    } 
    if (par1ItemStack.stackTagCompound != null)
      par1ItemStack.stackTagCompound.getInteger("counter"); 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par3EntityPlayer.worldObj.isRemote && Par1ItemStack.stackTagCompound.getInteger("kd") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 15) {
        if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
          Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, 90));
          Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 140, 5));
          Par1ItemStack.stackTagCompound.setInteger("kd", 100);
          props.consumeMana(15);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Body Flicker Technique!"));
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A high-class jutsu, using");
    par3List.add(EnumChatFormatting.DARK_AQUA + "chakra to increase the users");
    par3List.add(EnumChatFormatting.DARK_AQUA + "speed to absolute heights!");
    par3List.add(EnumChatFormatting.DARK_RED + "Chakra: 15");
  }
}

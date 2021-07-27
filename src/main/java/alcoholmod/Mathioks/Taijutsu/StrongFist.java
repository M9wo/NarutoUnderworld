package alcoholmod.Mathioks.Taijutsu;

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

public class StrongFist extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public StrongFist() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
        par1ItemStack.stackTagCompound.setInteger("kd", 0);
      } 
      if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("kd") > 0) {
        int counter = par1ItemStack.stackTagCompound.getInteger("kd");
        par1ItemStack.stackTagCompound.setInteger("kd", --counter);
      } 
      if (par1ItemStack.stackTagCompound != null && par1ItemStack.getItemDamage() == 100) {
        EntityPlayer player = (EntityPlayer)par3Entity;
        ExtendedPlayer props = ExtendedPlayer.get(player);
        if (!par2World.isRemote) {
          int counter = par1ItemStack.stackTagCompound.getInteger("counter");
          if (counter == 20) {
            props.consumeMana(3);
            counter = 0;
          } 
          counter++;
          par1ItemStack.stackTagCompound.setInteger("counter", counter);
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20, 0));
          if (props.getCurrentMana() == 0)
            par1ItemStack.setItemDamage(0); 
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getInteger("kd") == 0)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        if (Par1ItemStack.getItemDamage() == 0) {
          ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
          if (props.getCurrentMana() >= 20) {
            Par1ItemStack.setItemDamage(100);
            props.setCurrentMana(props.getCurrentMana() - 20);
            Par1ItemStack.stackTagCompound.setInteger("kd", 200);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You don't have enough chakra"));
          } 
        } else if (Par1ItemStack.getItemDamage() == 100) {
          Par1ItemStack.setItemDamage(0);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "An aggressive fighting style that");
    par3List.add(EnumChatFormatting.DARK_AQUA + "is the opposite of the Gentle Fist");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Costs 20 chakra to activate");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Costs 3 chakra per 1 seconds");
  }
}

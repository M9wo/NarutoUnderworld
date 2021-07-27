package alcoholmod.Mathioks.Kenjutsu;

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

public class HeavenCutter extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setBoolean("active", false);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getBoolean("active") && ((EntityPlayer)par3Entity).getHeldItem() != null) {
      if (((EntityPlayer)par3Entity).getHeldItem().getItem() instanceof net.minecraft.item.ItemSword)
        ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 10, 0)); 
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3Entity);
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter > 0) {
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
      if (counter == 0) {
        counter = 50;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
        props.consumeMana(1);
      } 
      if (props.getCurrentMana() == 0) {
        par1ItemStack.stackTagCompound.setBoolean("active", false);
        ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Kenjutsu: Samurai Sabre Technique! De-Activate"));
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
    ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
    if (!Par3EntityPlayer.worldObj.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        if (!Par1ItemStack.stackTagCompound.getBoolean("active")) {
          if (props.getCurrentMana() >= 10) {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Kenjutsu: Samurai Sabre Technique!"));
            props.consumeMana(10);
            counter = 50;
            Par1ItemStack.stackTagCompound.setInteger("counter", counter);
            Par1ItemStack.stackTagCompound.setBoolean("active", true);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
          } 
        } else if (Par1ItemStack.stackTagCompound.getBoolean("active")) {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Kenjutsu: Samurai Sabre Technique! De-Activate"));
          Par1ItemStack.stackTagCompound.setBoolean("active", false);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "A Technique created by the samurai");
    par3List.add(EnumChatFormatting.DARK_AQUA + "increases the damage of swords");
  }
}

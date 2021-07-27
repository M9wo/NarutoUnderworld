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

public class KuramaMind extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
  }
  
  public KuramaMind() {
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 20) {
        if (props.getGenjutsu() >= 10) {
          if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getClanName().contains("Kurama")) {
            Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.harm.id, 10, 0));
            Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 500, 0));
            Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 500, 0));
            Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 500, 0));
            Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 500, 0));
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Kurama-Style: Genjutsu mind-Reality!"));
            props.consumeMana(20);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You need at least 10 Genjutsu"));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "A Genjutsu that crosses into reality");
    par3List.add(EnumChatFormatting.DARK_AQUA + "giving the user jump, movespeed");
    par3List.add(EnumChatFormatting.DARK_AQUA + "nightvision and digspeed");
    par3List.add(EnumChatFormatting.DARK_AQUA + "at the cost of mental pain");
    par3List.add(EnumChatFormatting.DARK_RED + "Chakra: 20");
  }
}

package alcoholmod.Mathioks.Kinjutsu;

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
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class CurseMandala extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public CurseMandala() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
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
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getInteger("kd") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 35) {
        if (props.getKinjutsu() >= 30)
          if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
            Par2World.spawnEntityInWorld((Entity)new EntityCurseMandala(Par2World, (EntityLivingBase)Par3EntityPlayer));
            props.consumeMana(35);
            Par1ItemStack.stackTagCompound.setInteger("kd", 500);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Forbidden Jutsu: Curse Mandala!"));
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
          }  
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your chakra is not high enough"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A Kinjutsu passed down by");
    par3List.add(EnumChatFormatting.DARK_AQUA + "the Fuhma clan.");
    par3List.add(EnumChatFormatting.DARK_AQUA + "if the target's total");
    par3List.add(EnumChatFormatting.DARK_AQUA + "power is more than the");
    par3List.add(EnumChatFormatting.DARK_AQUA + "user's by 30, it will break");
    par3List.add(EnumChatFormatting.DARK_AQUA + "and cause a huge explosion");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + '#');
    par3List.add(EnumChatFormatting.GOLD + "Kinjutsu needed: " + '\036');
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + '\031');
  }
}

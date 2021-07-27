package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntityWaterPrisonJutsu;
import alcoholmod.Mathioks.Entity.EntityWaterPrisonJutsu2;
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

public class WaterReleaseWaterPrisonJutsu extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
    } 
  }
  
  public WaterReleaseWaterPrisonJutsu() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getWaterRelease() == 1)
        if (props.getCurrentMana() >= 20 + props.getNinjutsu() / 600) {
          EntityWaterPrisonJutsu x = new EntityWaterPrisonJutsu(Par2World, (EntityLivingBase)Par3EntityPlayer);
          Par2World.spawnEntityInWorld((Entity)x);
          EntityWaterPrisonJutsu2 y = new EntityWaterPrisonJutsu2(Par2World, (EntityLivingBase)Par3EntityPlayer);
          Par2World.spawnEntityInWorld((Entity)y);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Water Release: Water Prison Jutsu"));
          props.consumeMana(20 + props.getNinjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Trap your opponent in a");
    par3List.add(EnumChatFormatting.DARK_AQUA + "bubble of ice filled with water");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (20 + props.getNinjutsu() / 600));
  }
}

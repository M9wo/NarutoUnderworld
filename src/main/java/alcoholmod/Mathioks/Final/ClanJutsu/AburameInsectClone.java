package alcoholmod.Mathioks.Final.ClanJutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import alcoholmod.Mathioks.Jutsu.EntityAburameClone;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class AburameInsectClone extends JutsuItem {
  public AburameInsectClone() {
    setMaxDamage(9600);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World Par2World, Entity Par3EntityPlayer, int par4, boolean par5) {
    if ((EntityPlayer)Par3EntityPlayer != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)Par3EntityPlayer).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    int counter = par1ItemStack.stackTagCompound.getInteger("counter");
    if (counter > 0) {
      counter--;
      par1ItemStack.stackTagCompound.setInteger("counter", counter);
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getClanName().contains("Aburame")) {
        int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
        if (counter == 0 && props.getCurrentMana() >= 40) {
          EntityAburameClone EntityBunshin = new EntityAburameClone(Par2World);
          if (!Par2World.isRemote) {
            EntityBunshin.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
            EntityBunshin.setTamed(true);
            EntityBunshin.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 2.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
            EntityBunshin.rotationYawHead = EntityBunshin.rotationYaw;
            EntityBunshin.renderYawOffset = EntityBunshin.rotationYaw;
            Par2World.spawnEntityInWorld((Entity)EntityBunshin);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Hidden Jutsu: Insect Clone Technique!"));
            props.consumeMana(40);
            counter = 300;
            Par1ItemStack.stackTagCompound.setInteger("counter", counter);
            return Par1ItemStack;
          } 
        } 
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create A clone of yourself");
    par3List.add(EnumChatFormatting.DARK_AQUA + "through Kikaichu, spreading");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Into Kikaichu after death");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + '(');
  }
}

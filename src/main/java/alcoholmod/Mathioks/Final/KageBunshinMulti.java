package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Jutsu.EntityBunshin;
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

public class KageBunshinMulti extends JutsuItem {
  public KageBunshinMulti() {
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
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter == 0) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getCurrentMana() >= 25 + props.getGenjutsu() / 600) {
          counter = 300;
          Par1ItemStack.stackTagCompound.setInteger("counter", counter);
          EntityBunshin EntityBunshin = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin1 = new EntityBunshin(Par2World);
          EntityBunshin EntityBunshin2 = new EntityBunshin(Par2World);
          EntityBunshin.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin.setTamed(true);
          EntityBunshin.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin.rotationYawHead = EntityBunshin.rotationYaw;
          EntityBunshin.renderYawOffset = EntityBunshin.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin);
          EntityBunshin1.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin1.setTamed(true);
          EntityBunshin1.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin1.rotationYawHead = EntityBunshin1.rotationYaw;
          EntityBunshin1.renderYawOffset = EntityBunshin1.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin1);
          EntityBunshin2.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin2.setTamed(true);
          EntityBunshin2.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin2.rotationYawHead = EntityBunshin2.rotationYaw;
          EntityBunshin2.renderYawOffset = EntityBunshin2.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin2);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Multiple Kage Bunshin No Jutsu!!"));
          props.consumeMana(25 + props.getGenjutsu() / 600);
          return Par1ItemStack;
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create 3 clones of yourself");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (25 + props.getGenjutsu() / 600));
  }
}

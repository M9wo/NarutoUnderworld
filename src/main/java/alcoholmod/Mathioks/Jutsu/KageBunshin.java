package alcoholmod.Mathioks.Jutsu;

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
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class KageBunshin extends JutsuItem {
  public KageBunshin() {
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
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
        if (counter == 0 && props.getCurrentMana() >= 10 + props.getGenjutsu() / 600) {
          EntityBunshin EntityBunshin = new EntityBunshin(Par2World);
          if (!Par2World.isRemote) {
            EntityBunshin.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
            EntityBunshin.setTamed(true);
            EntityBunshin.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 2.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
            EntityBunshin.rotationYawHead = EntityBunshin.rotationYaw;
            EntityBunshin.renderYawOffset = EntityBunshin.rotationYaw;
            Par2World.spawnEntityInWorld((Entity)EntityBunshin);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Kage Bunshin No Jutsu!"));
            props.consumeMana(10 + props.getGenjutsu() / 600);
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
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (10 + props.getGenjutsu() / 600));
  }
}

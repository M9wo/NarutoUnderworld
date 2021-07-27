package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Jutsu.EntityCloneBunshin;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class KageBunshinSexy extends JutsuItem {
  public KageBunshinSexy() {
    setMaxDamage(9600);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 10 + props.getGenjutsu() / 600) {
        EntityCloneBunshin EntityCloneBunshin = new EntityCloneBunshin(Par2World);
        Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.invisibility.id, 100, 1));
        EntityCloneBunshin.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
        EntityCloneBunshin.setTamed(true);
        EntityCloneBunshin.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
        EntityCloneBunshin.rotationYawHead = EntityCloneBunshin.rotationYaw;
        EntityCloneBunshin.renderYawOffset = EntityCloneBunshin.rotationYaw;
        Par2World.spawnEntityInWorld((Entity)EntityCloneBunshin);
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Kage Bunshin: Sexy No Jutsu!"));
        props.consumeMana(10 + props.getGenjutsu() / 600);
        Par1ItemStack.stackTagCompound.setInteger("counter", 300);
        return Par1ItemStack;
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create a clone of a naked female");
    par3List.add(EnumChatFormatting.DARK_AQUA + "to throw off your opponent");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (10 + props.getGenjutsu() / 600));
  }
}

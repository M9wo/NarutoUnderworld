package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntityCoercion;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class SharinganCoercion extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public SharinganCoercion() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getSharinganActive()) {
        if (props.getGenjutsu() >= 35) {
          if (props.getCurrentMana() >= 20 + props.getNinjutsu() / 600) {
            Par2World.spawnEntityInWorld((Entity)new EntityCoercion(Par2World, (EntityLivingBase)Par3EntityPlayer));
            Par1ItemStack.stackTagCompound.setInteger("counter", 200);
            props.consumeMana(20 + props.getNinjutsu() / 600);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough Genjutsu"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Sharingan needs to be active"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Cast a Genjutsu that engulfs the opponent");
    par3List.add(EnumChatFormatting.DARK_AQUA + "in a dark space, rendering them unable to move");
    par3List.add(EnumChatFormatting.DARK_AQUA + "for a short amount of time");
    par3List.add(EnumChatFormatting.RED + "Can only be used when Sharingan is active");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (20 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.GOLD + "Genjutsu: " + '#');
  }
}

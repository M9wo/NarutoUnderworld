package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntityGenjutsuCrows;
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

public class SharinganGenjutsuCrows extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public SharinganGenjutsuCrows() {
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getSharinganActive()) {
        if (props.getGenjutsu() >= 15) {
          if (props.getCurrentMana() >= 10) {
            Par2World.spawnEntityInWorld((Entity)new EntityGenjutsuCrows(Par2World, (EntityLivingBase)Par3EntityPlayer));
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Sharingan: Genjutsu Crows!"));
            Par1ItemStack.stackTagCompound.setInteger("counter", 300);
            props.consumeMana(10);
            return Par1ItemStack;
          } 
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Cast a Genjutsu that engulfs the opponent in crows");
    par3List.add(EnumChatFormatting.RED + "Can only be used when Sharingan is active");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (10 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.GOLD + "Genjutsu: " + '\017');
  }
}

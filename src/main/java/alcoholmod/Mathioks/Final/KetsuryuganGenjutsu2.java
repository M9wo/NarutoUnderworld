package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.KetsuryuganGenjutsuEntity2;
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

public class KetsuryuganGenjutsu2 extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public KetsuryuganGenjutsu2() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getKetsuryuganActive()) {
        if (props.getGenjutsu() >= 35) {
          if (props.getCurrentMana() >= 20) {
            Par2World.spawnEntityInWorld((Entity)new KetsuryuganGenjutsuEntity2(Par2World, (EntityLivingBase)Par3EntityPlayer));
            Par1ItemStack.stackTagCompound.setInteger("counter", 100);
            props.consumeMana(20);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough Genjutsu"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ketsuryugan needs to be active"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    par3List.add(EnumChatFormatting.DARK_AQUA + "Cast a Genjutsu that interferes with");
    par3List.add(EnumChatFormatting.DARK_AQUA + "the opponents nerve system, making them");
    par3List.add(EnumChatFormatting.DARK_AQUA + "nauseaus and slow");
    par3List.add(EnumChatFormatting.RED + "Can only be used when Ketsuryugan is active");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + '\024');
    par3List.add(EnumChatFormatting.GOLD + "Genjutsu: " + '#');
    par3List.add(EnumChatFormatting.DARK_RED + "Genjutsu Time: " + (50 + props.getGenjutsu() / 20));
  }
}

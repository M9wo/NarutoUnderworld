package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.ScorchReleaseIncineratingEntity;
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

public class ScorchReleaseIncineratingFlare extends JutsuItem {
  private boolean isinair;
  
  private boolean FireMode;
  
  int counter;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ScorchReleaseIncineratingFlare() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getscorchRelease() == 1)
        if (props.getCurrentMana() >= 175 + props.getNinjutsu() / 600) {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Incinerating Flare Technique!"));
          Par2World.spawnEntityInWorld((Entity)new ScorchReleaseIncineratingEntity(Par2World, (EntityLivingBase)Par3EntityPlayer));
          props.consumeMana(175 + props.getNinjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "The ultimate Scorch release jutsu,");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Concentrates wind until it explodes");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (175 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Extreme Explosion + Damage: " + (15 + props.getNinjutsu() / 600));
  }
}

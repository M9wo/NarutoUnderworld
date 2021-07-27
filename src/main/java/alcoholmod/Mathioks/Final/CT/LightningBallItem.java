package alcoholmod.Mathioks.Final.CT;

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
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class LightningBallItem extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public LightningBallItem() {
    setMaxDamage(5100);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getLightningRelease() == 1)
        if (props.getCurrentMana() >= 50 + props.getNinjutsu() / 600) {
          Par1ItemStack.stackTagCompound.setInteger("counter", 78);
          Par2World.spawnEntityInWorld((Entity)new LightningBallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer));
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Lightning Ball!!"));
          props.consumeMana(50 + props.getNinjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "A ball big ball made completely");
    par3List.add(EnumChatFormatting.DARK_AQUA + "out of lightning nature chakra");
    par3List.add(EnumChatFormatting.DARK_AQUA + "thrown at the opponent");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (50 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (13 + props.getNinjutsu() / 600));
  }
}

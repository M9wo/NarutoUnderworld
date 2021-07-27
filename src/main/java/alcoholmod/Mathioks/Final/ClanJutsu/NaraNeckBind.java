package alcoholmod.Mathioks.Final.ClanJutsu;

import alcoholmod.Mathioks.Entity.EntityNaraNeckBind;
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

public class NaraNeckBind extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public NaraNeckBind() {
    this.maxStackSize = 1;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getClanName().contains("Nara"))
        if (props.getCurrentMana() >= 1) {
          Par2World.spawnEntityInWorld((Entity)new EntityNaraNeckBind(Par2World, (EntityLivingBase)Par3EntityPlayer));
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Nara Neck Bind Strangling!"));
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You need at least 1 chakra"));
        }  
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Strangles an immobilized opponent through");
    par3List.add(EnumChatFormatting.DARK_AQUA + "the shadows of the shadow immitation technique");
    par3List.add(EnumChatFormatting.DARK_AQUA + "does not cost any chakra");
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + '\002');
  }
}

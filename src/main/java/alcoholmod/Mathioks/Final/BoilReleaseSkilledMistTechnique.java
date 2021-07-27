package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntitySkilledMistTechnique;
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

public class BoilReleaseSkilledMistTechnique extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public BoilReleaseSkilledMistTechnique() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getboilRelease() == 1 && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.stackTagCompound.getInteger("counter") == 0)
        if (props.getCurrentMana() >= 40.0D + 0.04D * props.getLevel()) {
          Par1ItemStack.stackTagCompound.setInteger("counter", 400);
          Par2World.spawnEntityInWorld((Entity)new EntitySkilledMistTechnique(Par2World, (EntityLivingBase)Par3EntityPlayer));
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Boil release: Skilled mist technique!"));
          props.consumeMana((int)(40.0D + 0.04D * props.getLevel()));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Creates a thick mist that burns");
    par3List.add(EnumChatFormatting.DARK_AQUA + "anything inside of it");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (35 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (15 + props.getNinjutsu() / 600));
  }
}

package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntitySandBurial;
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

public class EarthReleaseSandBurial extends JutsuItem {
  private boolean isinair;
  
  private EntitySandBurial EntityEarthSpear;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public EarthReleaseSandBurial() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getEarthRelease() == 1)
        if (props.getCurrentMana() >= 60 + props.getNinjutsu() / 600) {
          this.EntityEarthSpear = new EntitySandBurial(Par2World, (EntityLivingBase)Par3EntityPlayer);
          Par2World.spawnEntityInWorld((Entity)this.EntityEarthSpear);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Earth Release: Sand Burial!!"));
          props.consumeMana(60 + props.getNinjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Trap your opponent in a sand Coffin");
    par3List.add(EnumChatFormatting.DARK_AQUA + "crushing them, then dropping them");
    par3List.add(EnumChatFormatting.DARK_AQUA + "into the ground, burrowing them.");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (60 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: 4 + Suffocation");
  }
}

package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class GreatFireballFastItem extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public GreatFireballFastItem() {
    setMaxDamage(5100);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 40 + props.getNinjutsu() / 600 && !Par2World.isRemote) {
        Vec3 look = Par3EntityPlayer.getLookVec();
        GreatFireBallEntity fireball2 = new GreatFireBallEntity(Par2World);
        fireball2.setPosition(Par3EntityPlayer.posX + look.xCoord * 5.0D, Par3EntityPlayer.posY + look.yCoord * 5.0D, Par3EntityPlayer.posZ + look.zCoord * 5.0D);
        fireball2.motionX = look.xCoord * 1.2D;
        fireball2.motionY = look.yCoord * 1.2D;
        fireball2.motionZ = look.zCoord * 1.2D;
        Par2World.spawnEntityInWorld((Entity)fireball2);
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Fire Release: Great Fireball Jutsu!!"));
        this.isinair = true;
        props.consumeMana(35 + props.getNinjutsu() / 600);
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "An enhanced version of the Fireball Jutsu");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Explodes on impact and sets the enemy on fire");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (40 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (17 + props.getNinjutsu() / 600));
  }
}

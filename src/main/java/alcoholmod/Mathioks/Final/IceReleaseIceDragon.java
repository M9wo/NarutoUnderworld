package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.IceReleaseIceDragonEntity;
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

public class IceReleaseIceDragon extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public IceReleaseIceDragon() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.geticeRelease() == 1 && props.getCurrentMana() >= 60 + props.getNinjutsu() / 600 && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ice Release : twin dragon blizzard!"));
        IceReleaseIceDragonEntity fireball1 = new IceReleaseIceDragonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
        fireball1.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ);
        Par2World.spawnEntityInWorld((Entity)fireball1);
        IceReleaseIceDragonEntity fireball2 = new IceReleaseIceDragonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
        fireball2.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 6.0D, Par3EntityPlayer.posZ);
        Par2World.spawnEntityInWorld((Entity)fireball2);
        Par1ItemStack.stackTagCompound.setInteger("counter", 54);
        props.consumeMana(60);
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "create a dragon out of ice");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 60");
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: 25");
  }
}

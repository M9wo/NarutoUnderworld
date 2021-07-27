package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
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
import net.minecraft.world.World;

public class EarthReleaseEarthGolemItem extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public EarthReleaseEarthGolemItem() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getEarthRelease() == 1)
        if (props.getCurrentMana() >= 40 + props.getNinjutsu() / 600) {
          Par1ItemStack.stackTagCompound.setInteger("counter", 1200);
          EarthReleaseEarthGolemEntity ExplosiveClaySpidersEntity = new EarthReleaseEarthGolemEntity(Par2World);
          ExplosiveClaySpidersEntity.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          ExplosiveClaySpidersEntity.setTamed(true);
          ExplosiveClaySpidersEntity.setPositionAndRotation(Par3EntityPlayer.posX + 2.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          ExplosiveClaySpidersEntity.rotationYawHead = ExplosiveClaySpidersEntity.rotationYaw;
          ExplosiveClaySpidersEntity.renderYawOffset = ExplosiveClaySpidersEntity.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)ExplosiveClaySpidersEntity);
          props.consumeMana(40 + props.getNinjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create a Rock Golem");
    par3List.add(EnumChatFormatting.DARK_AQUA + "that fights for you");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (40 + props.getNinjutsu() / 600));
  }
}

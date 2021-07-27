package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.WoodReleaseCuttingEntity;
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

public class WoodReleaseCutting extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public WoodReleaseCutting() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
        int counter1 = Par1ItemStack.stackTagCompound.getInteger("counter1");
        int counter2 = Par1ItemStack.stackTagCompound.getInteger("counter2");
        int counter3 = Par1ItemStack.stackTagCompound.getInteger("counter3");
        if (props.getwoodRelease() == 1 && props.getCurrentMana() >= 100) {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Wood Release : Cutting Technique!"));
          Par2World.spawnEntityInWorld((Entity)new WoodReleaseCuttingEntity(Par2World, (EntityLivingBase)Par3EntityPlayer));
          props.consumeMana(100);
        } 
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Shoot a wooden stick that");
    par3List.add(EnumChatFormatting.DARK_AQUA + "creates a tree when it hits an entity");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 100");
  }
}

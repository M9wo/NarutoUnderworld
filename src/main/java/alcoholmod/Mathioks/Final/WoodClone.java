package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Jutsu.EntityWoodBunshin;
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

public class WoodClone extends JutsuItem {
  private boolean isinair;
  
  private Entity p_70085_1_;
  
  private Object worldObj;
  
  public WoodClone() {
    setMaxDamage(9600);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 35 + props.getGenjutsu() / 600) {
        EntityWoodBunshin EntityBunshin = new EntityWoodBunshin(Par2World);
        if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getwoodRelease() == 1) {
          EntityBunshin.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          EntityBunshin.setTamed(true);
          EntityBunshin.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 2.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
          EntityBunshin.rotationYawHead = EntityBunshin.rotationYaw;
          EntityBunshin.renderYawOffset = EntityBunshin.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)EntityBunshin);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Wood Clone Jutsu!"));
          props.consumeMana(35 + props.getGenjutsu() / 600);
          return Par1ItemStack;
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create A wood clone of yourself");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (35 + props.getGenjutsu() / 600));
  }
}

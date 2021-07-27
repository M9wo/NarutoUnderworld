package alcoholmod.Mathioks.Jutsu;

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
import net.minecraft.world.World;

public class BodyReplacementTechnique extends JutsuItem {
  public BodyReplacementTechnique() {
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
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()))
        if (props.getCurrentMana() >= 250) {
          EntityBunshin EntityBunshin = new EntityBunshin(Par2World);
          if (!Par2World.isRemote) {
            Par3EntityPlayer.setHealth(Par3EntityPlayer.getMaxHealth());
            EntityBunshin.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
            EntityBunshin.setTamed(true);
            EntityBunshin.Death = true;
            EntityBunshin.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 2.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
            EntityBunshin.rotationYawHead = EntityBunshin.rotationYaw;
            EntityBunshin.renderYawOffset = EntityBunshin.rotationYaw;
            Par2World.spawnEntityInWorld((Entity)EntityBunshin);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Body-Replacement Technique"));
            props.consumeMana(250);
            return Par1ItemStack;
          } 
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Substitute your own body for");
    par3List.add(EnumChatFormatting.DARK_AQUA + "a new one by shedding your skin");
    par3List.add(EnumChatFormatting.DARK_AQUA + "fully healing the user");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + 'ú');
  }
}

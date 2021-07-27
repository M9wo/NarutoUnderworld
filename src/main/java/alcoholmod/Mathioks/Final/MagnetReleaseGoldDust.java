package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.MagnetReleaseGoldDustEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class MagnetReleaseGoldDust extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public MagnetReleaseGoldDust() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("kd", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("kd") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("kd");
      par1ItemStack.stackTagCompound.setInteger("kd", --counter);
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getmagnetRelease() == 1 && Par1ItemStack.stackTagCompound.getInteger("kd") == 0)
          if (props.getCurrentMana() >= 50 + props.getNinjutsu() / 600) {
            Par1ItemStack.stackTagCompound.setInteger("kd", 400);
            MagnetReleaseGoldDustEntity fireball9 = new MagnetReleaseGoldDustEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
            fireball9.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 20.0D, Par3EntityPlayer.posZ - 10.0D);
            Par2World.spawnEntityInWorld((Entity)fireball9);
            MagnetReleaseGoldDustEntity fireball59 = new MagnetReleaseGoldDustEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
            fireball59.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 20.0D, Par3EntityPlayer.posZ + 10.0D);
            Par2World.spawnEntityInWorld((Entity)fireball59);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Magnet Release: Iron Sand Gathering Assault!"));
            props.consumeMana(50 + props.getNinjutsu() / 600);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra!"));
          }  
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this jutsu"));
      }  
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Creates massive objects out of");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Iron sand that explode on impact");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (50 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (30 + props.getNinjutsu() / 600));
  }
}

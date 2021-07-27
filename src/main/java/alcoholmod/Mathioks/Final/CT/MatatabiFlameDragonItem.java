package alcoholmod.Mathioks.Final.CT;

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
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class MatatabiFlameDragonItem extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public MatatabiFlameDragonItem() {
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("counter") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      par1ItemStack.stackTagCompound.setInteger("counter", --counter);
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getBijuuKind() == 2)
          if (props.getCurrentMana() >= 60 + props.getNinjutsu() / 300) {
            if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
              int d = MathHelper.floor_double((Par3EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 0x3;
              Vec3 look = Par3EntityPlayer.getLookVec();
              MatatabiFlameDragonEntity fireball2 = new MatatabiFlameDragonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
              Par2World.spawnEntityInWorld((Entity)fireball2);
              Par1ItemStack.stackTagCompound.setInteger("counter", 84);
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Fire Release: Dragon Flame Jutsu!!"));
              props.consumeMana(60 + props.getNinjutsu() / 300);
            } 
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "A fireball in the shape of a dragon's head");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Sets the ground on fire on impact");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (60 + props.getNinjutsu() / 300));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (20 + props.getNinjutsu() / 300));
  }
}

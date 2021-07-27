package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntityMatatabiBulletJutsu;
import alcoholmod.Mathioks.ExtendedPlayer;
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

public class MatatabiReleaseFireBulletJutsu extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public MatatabiReleaseFireBulletJutsu() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    if (par1ItemStack.stackTagCompound != null)
      par1ItemStack.stackTagCompound.getInteger("counter"); 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 35 + props.getNinjutsu() / 600) {
        if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
          Par2World.spawnEntityInWorld((Entity)new EntityMatatabiBulletJutsu(Par2World, (EntityLivingBase)Par3EntityPlayer));
          props.consumeMana(35 + props.getNinjutsu() / 600);
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "An enhanced version of the Fireball Jutsu");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Explodes on impact and sets the enemy on fire");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (35 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (15 + props.getNinjutsu() / 600));
  }
}

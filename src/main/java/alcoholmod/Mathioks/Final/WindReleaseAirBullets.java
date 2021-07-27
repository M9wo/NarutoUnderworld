package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntityWindAirBullets;
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

public class WindReleaseAirBullets extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public WindReleaseAirBullets() {
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
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("counter") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      par1ItemStack.stackTagCompound.setInteger("counter", --counter);
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getWindRelease() == 1 && Par1ItemStack.stackTagCompound.getInteger("counter") == 0)
          if (props.getCurrentMana() >= 15.0D + 0.015D * props.getLevel()) {
            Par2World.spawnEntityInWorld((Entity)new EntityWindAirBullets(Par2World, (EntityLivingBase)Par3EntityPlayer));
            Par3EntityPlayer.posY++;
            Par2World.spawnEntityInWorld((Entity)new EntityWindAirBullets(Par2World, (EntityLivingBase)Par3EntityPlayer));
            Par3EntityPlayer.posY -= 2.0D;
            Par2World.spawnEntityInWorld((Entity)new EntityWindAirBullets(Par2World, (EntityLivingBase)Par3EntityPlayer));
            Par3EntityPlayer.posY++;
            Par3EntityPlayer.posX--;
            Par2World.spawnEntityInWorld((Entity)new EntityWindAirBullets(Par2World, (EntityLivingBase)Par3EntityPlayer));
            Par3EntityPlayer.posX += 2.0D;
            Par2World.spawnEntityInWorld((Entity)new EntityWindAirBullets(Par2World, (EntityLivingBase)Par3EntityPlayer));
            Par3EntityPlayer.posX--;
            Par3EntityPlayer.posZ++;
            Par2World.spawnEntityInWorld((Entity)new EntityWindAirBullets(Par2World, (EntityLivingBase)Par3EntityPlayer));
            Par3EntityPlayer.posZ -= 2.0D;
            Par2World.spawnEntityInWorld((Entity)new EntityWindAirBullets(Par2World, (EntityLivingBase)Par3EntityPlayer));
            Par1ItemStack.stackTagCompound.setInteger("counter", 48);
            props.consumeMana((int)(15.0D + 0.015D * props.getLevel()));
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Shoot 7 Airbullets at your opponent");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Pushing them back");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (15.0D + 0.015D * props.getLevel()));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (6.0D + 0.005D * props.getLevel()));
  }
}

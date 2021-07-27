package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntityStormDemonStorm;
import alcoholmod.Mathioks.ExtendedPlayer;
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

public class StormReleaseDemonStorm extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public StormReleaseDemonStorm() {
    setMaxDamage(400);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getCurrentMana() >= 60 && props.getstormRelease() == 1 && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Storm Release Secret Technique: Demon Dragon Storm!"));
        EntityStormDemonStorm fireball2 = new EntityStormDemonStorm(Par2World, (EntityLivingBase)Par3EntityPlayer);
        fireball2.setPosition(Par3EntityPlayer.posX + 8.0D, Par3EntityPlayer.posY + 10.0D, Par3EntityPlayer.posZ);
        Par2World.spawnEntityInWorld((Entity)fireball2);
        EntityStormDemonStorm fireball3 = new EntityStormDemonStorm(Par2World, (EntityLivingBase)Par3EntityPlayer);
        fireball3.setPosition(Par3EntityPlayer.posX - 8.0D, Par3EntityPlayer.posY + 10.0D, Par3EntityPlayer.posZ);
        Par2World.spawnEntityInWorld((Entity)fireball3);
        EntityStormDemonStorm fireball1 = new EntityStormDemonStorm(Par2World, (EntityLivingBase)Par3EntityPlayer);
        fireball1.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 10.0D, Par3EntityPlayer.posZ + 8.0D);
        Par2World.spawnEntityInWorld((Entity)fireball1);
        EntityStormDemonStorm fireball4 = new EntityStormDemonStorm(Par2World, (EntityLivingBase)Par3EntityPlayer);
        fireball4.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 10.0D, Par3EntityPlayer.posZ - 8.0D);
        Par2World.spawnEntityInWorld((Entity)fireball4);
        EntityStormDemonStorm fireball5 = new EntityStormDemonStorm(Par2World, (EntityLivingBase)Par3EntityPlayer);
        fireball5.setPosition(Par3EntityPlayer.posX + 8.0D, Par3EntityPlayer.posY + 10.0D, Par3EntityPlayer.posZ + 8.0D);
        Par2World.spawnEntityInWorld((Entity)fireball5);
        EntityStormDemonStorm fireball6 = new EntityStormDemonStorm(Par2World, (EntityLivingBase)Par3EntityPlayer);
        fireball6.setPosition(Par3EntityPlayer.posX - 8.0D, Par3EntityPlayer.posY + 10.0D, Par3EntityPlayer.posZ + 8.0D);
        Par2World.spawnEntityInWorld((Entity)fireball6);
        EntityStormDemonStorm fireball7 = new EntityStormDemonStorm(Par2World, (EntityLivingBase)Par3EntityPlayer);
        fireball7.setPosition(Par3EntityPlayer.posX - 8.0D, Par3EntityPlayer.posY + 10.0D, Par3EntityPlayer.posZ - 8.0D);
        Par2World.spawnEntityInWorld((Entity)fireball7);
        EntityStormDemonStorm fireball8 = new EntityStormDemonStorm(Par2World, (EntityLivingBase)Par3EntityPlayer);
        fireball8.setPosition(Par3EntityPlayer.posX + 8.0D, Par3EntityPlayer.posY + 10.0D, Par3EntityPlayer.posZ - 8.0D);
        Par2World.spawnEntityInWorld((Entity)fireball8);
        Par1ItemStack.stackTagCompound.setInteger("counter", 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "creates thunder clouds that zap any");
    par3List.add(EnumChatFormatting.DARK_AQUA + "enemy coming nearby");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 60");
  }
}

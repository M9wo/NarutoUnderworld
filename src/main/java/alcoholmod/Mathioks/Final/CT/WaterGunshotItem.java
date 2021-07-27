package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class WaterGunshotItem extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public WaterGunshotItem() {
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
        if (props.getWaterRelease() == 1 && Par1ItemStack.stackTagCompound.getInteger("counter") == 0)
          if (props.getCurrentMana() >= 20 + props.getNinjutsu() / 600) {
            if (!Par3EntityPlayer.isInWater() && Par3EntityPlayer.worldObj.getBlock(MathHelper.floor_double(Par3EntityPlayer.posX), MathHelper.floor_double(Par3EntityPlayer.posY - 0.2D - Par3EntityPlayer.yOffset), MathHelper.floor_double(Par3EntityPlayer.posZ)) != Blocks.water) {
              Vec3 look = Par3EntityPlayer.getLookVec();
              WaterGunshotEntity fireball2 = new WaterGunshotEntity(Par2World);
              fireball2.setPosition(Par3EntityPlayer.posX + look.xCoord * 5.0D, Par3EntityPlayer.posY + look.yCoord * 5.0D, Par3EntityPlayer.posZ + look.zCoord * 5.0D);
              fireball2.motionX = look.xCoord * 1.2D;
              fireball2.motionY = look.yCoord * 1.2D;
              fireball2.motionZ = look.zCoord * 1.2D;
              Par2World.spawnEntityInWorld((Entity)fireball2);
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Water Release: Water Gunshot Jutsu!"));
              props.consumeMana(20 + props.getNinjutsu() / 600);
            } else {
              Vec3 look = Par3EntityPlayer.getLookVec();
              WaterGunshotEntity fireball2 = new WaterGunshotEntity(Par2World);
              fireball2.setPosition(Par3EntityPlayer.posX + look.xCoord * 5.0D, Par3EntityPlayer.posY + look.yCoord * 5.0D, Par3EntityPlayer.posZ + look.zCoord * 5.0D);
              fireball2.motionX = look.xCoord * 1.2D;
              fireball2.motionY = look.yCoord * 1.2D;
              fireball2.motionZ = look.zCoord * 1.2D;
              fireball2.Water = true;
              Par2World.spawnEntityInWorld((Entity)fireball2);
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Water Release: Enhanced Water Gunshot Jutsu!"));
              props.consumeMana(20 + props.getNinjutsu() / 600);
            } 
            Par1ItemStack.stackTagCompound.setInteger("counter", 78);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "An enhanced version of the Waterbullet Jutsu");
    par3List.add(EnumChatFormatting.DARK_AQUA + "extinguishes any fire it hits");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (20 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (14 + props.getNinjutsu() / 600));
  }
}

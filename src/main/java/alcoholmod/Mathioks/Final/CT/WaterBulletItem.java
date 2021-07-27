package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
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

public class WaterBulletItem extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public WaterBulletItem() {
    setMaxDamage(5100);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("Counter", 0);
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("counter") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      par1ItemStack.stackTagCompound.setInteger("counter", --counter);
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getWaterRelease() == 1)
        if (props.getCurrentMana() >= 25 + props.getNinjutsu() / 600) {
          Par1ItemStack.stackTagCompound.setInteger("counter", 30);
          if (!Par3EntityPlayer.isInWater() && Par3EntityPlayer.worldObj.getBlock(MathHelper.floor_double(Par3EntityPlayer.posX), MathHelper.floor_double(Par3EntityPlayer.posY - 0.2D - Par3EntityPlayer.yOffset), MathHelper.floor_double(Par3EntityPlayer.posZ)) != Blocks.water) {
            Vec3 look = Par3EntityPlayer.getLookVec();
            WaterBulletEntity fireball3 = new WaterBulletEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
            WaterBulletEntity fireball4 = new WaterBulletEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
            WaterBulletEntity fireball5 = new WaterBulletEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
            fireball3.setPosition(Par3EntityPlayer.posX + look.xCoord * 5.0D, Par3EntityPlayer.posY + 1.0D + look.yCoord * 6.0D, Par3EntityPlayer.posZ + look.zCoord * 5.0D);
            fireball3.lastTickPosX = look.xCoord * 0.2D;
            fireball3.lastTickPosY = look.yCoord * 0.2D;
            fireball3.lastTickPosZ = look.zCoord * 0.2D;
            Par2World.spawnEntityInWorld((Entity)fireball3);
            fireball4.setPosition(Par3EntityPlayer.posX + look.xCoord * 1.0D, Par3EntityPlayer.posY + 1.0D + look.yCoord * 1.0D, Par3EntityPlayer.posZ + look.zCoord * 5.0D);
            fireball4.lastTickPosX = look.xCoord * 0.2D;
            fireball4.lastTickPosY = look.yCoord * 0.2D;
            fireball4.lastTickPosZ = look.zCoord * 0.2D;
            Par2World.spawnEntityInWorld((Entity)fireball4);
            fireball5.setPosition(Par3EntityPlayer.posX + look.xCoord * 9.0D, Par3EntityPlayer.posY + 1.0D + look.yCoord * 12.0D, Par3EntityPlayer.posZ + look.zCoord * 5.0D);
            fireball5.lastTickPosX = look.xCoord * 0.2D;
            fireball5.lastTickPosY = look.yCoord * 0.2D;
            fireball5.lastTickPosZ = look.zCoord * 0.2D;
            Par2World.spawnEntityInWorld((Entity)fireball5);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Water Release: Water Bullet Jutsu!!!"));
            props.consumeMana(25 + props.getNinjutsu() / 600);
          } else {
            Vec3 look = Par3EntityPlayer.getLookVec();
            WaterBulletEntity fireball3 = new WaterBulletEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
            WaterBulletEntity fireball4 = new WaterBulletEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
            WaterBulletEntity fireball5 = new WaterBulletEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
            fireball3.setPosition(Par3EntityPlayer.posX + look.xCoord * 5.0D, Par3EntityPlayer.posY + 1.0D + look.yCoord * 6.0D, Par3EntityPlayer.posZ + look.zCoord * 5.0D);
            fireball3.lastTickPosX = look.xCoord * 0.2D;
            fireball3.lastTickPosY = look.yCoord * 0.2D;
            fireball3.lastTickPosZ = look.zCoord * 0.2D;
            Par2World.spawnEntityInWorld((Entity)fireball3);
            fireball4.setPosition(Par3EntityPlayer.posX + look.xCoord * 1.0D, Par3EntityPlayer.posY + 1.0D + look.yCoord * 1.0D, Par3EntityPlayer.posZ + look.zCoord * 5.0D);
            fireball4.lastTickPosX = look.xCoord * 0.2D;
            fireball4.lastTickPosY = look.yCoord * 0.2D;
            fireball4.lastTickPosZ = look.zCoord * 0.2D;
            Par2World.spawnEntityInWorld((Entity)fireball4);
            fireball5.setPosition(Par3EntityPlayer.posX + look.xCoord * 9.0D, Par3EntityPlayer.posY + 1.0D + look.yCoord * 12.0D, Par3EntityPlayer.posZ + look.zCoord * 5.0D);
            fireball5.lastTickPosX = look.xCoord * 0.2D;
            fireball5.lastTickPosY = look.yCoord * 0.2D;
            fireball5.lastTickPosZ = look.zCoord * 0.2D;
            Par2World.spawnEntityInWorld((Entity)fireball5);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Water Release: Water Bullet Jutsu!!!"));
            props.consumeMana(25 + props.getNinjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Shoot 3 Water Bullets at");
    par3List.add(EnumChatFormatting.DARK_AQUA + "at high speed towards your opponent");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (25 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (9 + props.getNinjutsu() / 600));
  }
}

package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.YangReleaseSwordsEntity;
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

public class YangReleaseMultipleSwordsOfLight extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public YangReleaseMultipleSwordsOfLight() {
    this.maxStackSize = 1;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setInteger("stage", 0);
      par1ItemStack.stackTagCompound.setInteger("particles", 0);
      par1ItemStack.stackTagCompound.setInteger("damageCounter", 0);
      par1ItemStack.stackTagCompound.setInteger("kd", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("kd") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("kd");
      par1ItemStack.stackTagCompound.setInteger("kd", --counter);
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getInteger("kd") == 0) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getCurrentMana() >= 60 + props.getNinjutsu() / 600) {
          YangReleaseSwordsEntity fireball1 = new YangReleaseSwordsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball1.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball1);
          YangReleaseSwordsEntity fireball2 = new YangReleaseSwordsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball2.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 1.0D);
          Par2World.spawnEntityInWorld((Entity)fireball2);
          YangReleaseSwordsEntity fireball3 = new YangReleaseSwordsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball3.setPosition(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball3);
          YangReleaseSwordsEntity fireball4 = new YangReleaseSwordsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball4.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 1.0D);
          Par2World.spawnEntityInWorld((Entity)fireball4);
          YangReleaseSwordsEntity fireball5 = new YangReleaseSwordsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball5.setPosition(Par3EntityPlayer.posX - 1.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball5);
          YangReleaseSwordsEntity fireball6 = new YangReleaseSwordsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball6.setPosition(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball6);
          YangReleaseSwordsEntity fireball7 = new YangReleaseSwordsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball7.setPosition(Par3EntityPlayer.posX - 1.0D, Par3EntityPlayer.posY, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball7);
          YangReleaseSwordsEntity fireball8 = new YangReleaseSwordsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball8.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ - 1.0D);
          Par2World.spawnEntityInWorld((Entity)fireball8);
          YangReleaseSwordsEntity fireball9 = new YangReleaseSwordsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball9.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ + 1.0D);
          Par2World.spawnEntityInWorld((Entity)fireball9);
          YangReleaseSwordsEntity fireball16 = new YangReleaseSwordsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball16.setPosition(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 2.0D, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball16);
          YangReleaseSwordsEntity fireball17 = new YangReleaseSwordsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball17.setPosition(Par3EntityPlayer.posX - 1.0D, Par3EntityPlayer.posY + 2.0D, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball17);
          YangReleaseSwordsEntity fireball18 = new YangReleaseSwordsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball18.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 2.0D, Par3EntityPlayer.posZ - 1.0D);
          Par2World.spawnEntityInWorld((Entity)fireball18);
          YangReleaseSwordsEntity fireball19 = new YangReleaseSwordsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball19.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 2.0D, Par3EntityPlayer.posZ + 1.0D);
          Par2World.spawnEntityInWorld((Entity)fireball19);
          Par1ItemStack.stackTagCompound.setInteger("kd", 76);
          props.consumeMana(60 + props.getNinjutsu() / 600);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Yang Release: Multiple Swords of Light"));
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
        } 
      } 
    } else {
      Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A Yang Release jutsu that multiplies the");
    par3List.add(EnumChatFormatting.DARK_AQUA + "effect of the 'Sword of Light' jutsu by 10");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (60 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage per sword: " + '\017');
  }
}

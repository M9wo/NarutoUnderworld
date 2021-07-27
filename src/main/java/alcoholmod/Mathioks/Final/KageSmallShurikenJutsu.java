package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.item.ShurikenSmallEntity;
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

public class KageSmallShurikenJutsu extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public KageSmallShurikenJutsu() {
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
        if (props.getShurikenjutsu() >= 35) {
          if (props.getCurrentMana() >= 25 + props.getNinjutsu() / 600) {
            if (Par1ItemStack.stackTagCompound.getInteger("kd") == 0) {
              Par1ItemStack.stackTagCompound.setInteger("kd", 400);
              ShurikenSmallEntity entitybat = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenSmallEntity entitybat1 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenSmallEntity entitybat2 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 3.0F);
              ShurikenSmallEntity entitybat3 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 3.0F);
              ShurikenSmallEntity entitybat4 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 3.0F);
              ShurikenSmallEntity entitybat5 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 3.0F);
              ShurikenSmallEntity entitybat6 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 3.0F);
              ShurikenSmallEntity entitybat7 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenSmallEntity entitybat8 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenSmallEntity entitybat9 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenSmallEntity entitybat10 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 4.0F);
              ShurikenSmallEntity entitybat11 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 4.0F);
              ShurikenSmallEntity entitybat12 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 4.0F);
              ShurikenSmallEntity entitybat13 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 4.0F);
              ShurikenSmallEntity entitybat14 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 4.0F);
              ShurikenSmallEntity entitybat15 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 5.0F);
              ShurikenSmallEntity entitybat16 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 5.0F);
              ShurikenSmallEntity entitybat17 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 5.0F);
              ShurikenSmallEntity entitybat18 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 5.0F);
              ShurikenSmallEntity entitybat19 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenSmallEntity entitybat20 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenSmallEntity entitybat21 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenSmallEntity entitybat22 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenSmallEntity entitybat23 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenSmallEntity entitycrow = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenSmallEntity entitycrow1 = new ShurikenSmallEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              entitybat.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat);
              entitybat1.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat1);
              entitybat2.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat2);
              entitybat3.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat3);
              entitybat4.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat4);
              entitybat5.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat5);
              entitybat6.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat6);
              entitybat7.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat7);
              entitybat8.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat8);
              entitybat9.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat9);
              entitybat10.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat10);
              entitybat11.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
              entitybat23.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat23);
              entitybat12.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat12);
              entitybat13.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 4.0D, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat13);
              entitybat14.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ + 4.0D, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat14);
              entitybat15.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ - 4.0D, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat15);
              entitybat16.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ - 4.0D, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat16);
              entitybat17.setPositionAndRotation(Par3EntityPlayer.posX - 5.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 3.0D, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat17);
              entitybat18.setPositionAndRotation(Par3EntityPlayer.posX - 5.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 3.0D, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat18);
              entitybat19.setPositionAndRotation(Par3EntityPlayer.posX - 6.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ - 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat19);
              entitybat20.setPositionAndRotation(Par3EntityPlayer.posX - 6.0D, Par3EntityPlayer.posY, Par3EntityPlayer.posZ - 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat20);
              entitybat21.setPositionAndRotation(Par3EntityPlayer.posX + 6.0D, Par3EntityPlayer.posY, Par3EntityPlayer.posZ + 3.0D, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat21);
              entitybat22.setPositionAndRotation(Par3EntityPlayer.posX + 6.0D, Par3EntityPlayer.posY, Par3EntityPlayer.posZ + 3.0D, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitybat22);
              entitycrow.setPositionAndRotation(Par3EntityPlayer.posX + 5.0D, Par3EntityPlayer.posY, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitycrow);
              entitycrow1.setPositionAndRotation(Par3EntityPlayer.posX + 5.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
              Par2World.spawnEntityInWorld((Entity)entitycrow1);
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Kage ShurikenSmall Technique!"));
              props.consumeMana(25 + props.getNinjutsu() / 600);
            } 
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra!"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough ShurikenJutsu!"));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "A Shurikenjutsu that creates shadow");
    par3List.add(EnumChatFormatting.DARK_AQUA + "clones of a thrown Shuriken");
    par3List.add(EnumChatFormatting.DARK_PURPLE + "Shurikenjutsu needed: 35");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (25 + props.getNinjutsu() / 600));
  }
}

package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.item.ShurikenEntity;
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

public class KageShurikenJutsu extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public KageShurikenJutsu() {
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
        if (props.getShurikenjutsu() >= 50) {
          if (props.getCurrentMana() >= 35 + props.getNinjutsu() / 600) {
            if (Par1ItemStack.stackTagCompound.getInteger("kd") == 0) {
              Par1ItemStack.stackTagCompound.setInteger("kd", 400);
              ShurikenEntity entitybat = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenEntity entitybat1 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenEntity entitybat2 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 3.0F);
              ShurikenEntity entitybat3 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 3.0F);
              ShurikenEntity entitybat4 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 3.0F);
              ShurikenEntity entitybat5 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 3.0F);
              ShurikenEntity entitybat6 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 3.0F);
              ShurikenEntity entitybat7 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenEntity entitybat8 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenEntity entitybat9 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenEntity entitybat10 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 4.0F);
              ShurikenEntity entitybat11 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 4.0F);
              ShurikenEntity entitybat12 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 4.0F);
              ShurikenEntity entitybat13 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 4.0F);
              ShurikenEntity entitybat14 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 4.0F);
              ShurikenEntity entitybat15 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 5.0F);
              ShurikenEntity entitybat16 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 5.0F);
              ShurikenEntity entitybat17 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 5.0F);
              ShurikenEntity entitybat18 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 5.0F);
              ShurikenEntity entitybat19 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenEntity entitybat20 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenEntity entitybat21 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenEntity entitybat22 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenEntity entitybat23 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenEntity entitycrow = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
              ShurikenEntity entitycrow1 = new ShurikenEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
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
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Kage Shuriken Technique!"));
              props.consumeMana(35 + props.getNinjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "clones of a thrown Fuhma Shuriken");
    par3List.add(EnumChatFormatting.DARK_PURPLE + "Shurikenjutsu needed: 50");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (35 + props.getNinjutsu() / 600));
  }
}

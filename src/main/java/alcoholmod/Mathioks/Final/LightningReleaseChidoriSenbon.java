package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.item.ChidoriSenbonEntity;
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

public class LightningReleaseChidoriSenbon extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public LightningReleaseChidoriSenbon() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getLightningRelease() == 1 && Par1ItemStack.stackTagCompound.getInteger("counter") == 0)
        if (props.getCurrentMana() >= 40 + props.getNinjutsu() / 600) {
          ChidoriSenbonEntity entitybat = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
          ChidoriSenbonEntity entitybat1 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
          ChidoriSenbonEntity entitybat2 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 3.0F);
          ChidoriSenbonEntity entitybat3 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 3.0F);
          ChidoriSenbonEntity entitybat4 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 3.0F);
          ChidoriSenbonEntity entitybat5 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 3.0F);
          ChidoriSenbonEntity entitybat6 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 3.0F);
          ChidoriSenbonEntity entitybat7 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
          ChidoriSenbonEntity entitybat8 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
          ChidoriSenbonEntity entitybat9 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
          ChidoriSenbonEntity entitybat10 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 4.0F);
          ChidoriSenbonEntity entitybat11 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 4.0F);
          ChidoriSenbonEntity entitybat12 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 4.0F);
          ChidoriSenbonEntity entitybat13 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 4.0F);
          ChidoriSenbonEntity entitybat14 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 4.0F);
          ChidoriSenbonEntity entitybat15 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 5.0F);
          ChidoriSenbonEntity entitybat16 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 5.0F);
          ChidoriSenbonEntity entitybat17 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 5.0F);
          ChidoriSenbonEntity entitybat18 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 5.0F);
          ChidoriSenbonEntity entitybat19 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
          ChidoriSenbonEntity entitybat20 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
          ChidoriSenbonEntity entitybat21 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
          ChidoriSenbonEntity entitybat22 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
          ChidoriSenbonEntity entitybat23 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
          ChidoriSenbonEntity entitycrow = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
          ChidoriSenbonEntity entitycrow1 = new ChidoriSenbonEntity(Par2World, (EntityLivingBase)Par3EntityPlayer, 2.0F);
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
          Par1ItemStack.stackTagCompound.setInteger("counter", 60);
          props.consumeMana(40 + props.getNinjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "A shape transformation of Lightning,");
    par3List.add(EnumChatFormatting.DARK_AQUA + "throwing it at the opponent");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (40 + props.getNinjutsu() / 600));
  }
}

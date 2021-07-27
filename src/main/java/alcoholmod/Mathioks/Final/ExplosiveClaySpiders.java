package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class ExplosiveClaySpiders extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ExplosiveClaySpiders() {
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
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getCurrentMana() >= 25 + props.getNinjutsu() / 600) {
          Par1ItemStack.stackTagCompound.setInteger("counter", 200);
          ExplosiveClaySpidersEntity ExplosiveClaySpidersEntity = new ExplosiveClaySpidersEntity(Par2World);
          ExplosiveClaySpidersEntity ExplosiveClaySpidersEntity1 = new ExplosiveClaySpidersEntity(Par2World);
          ExplosiveClaySpidersEntity ExplosiveClaySpidersEntity2 = new ExplosiveClaySpidersEntity(Par2World);
          ExplosiveClaySpidersEntity.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          ExplosiveClaySpidersEntity.setTamed(true);
          ExplosiveClaySpidersEntity.setPositionAndRotation(Par3EntityPlayer.posX + 2.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          ExplosiveClaySpidersEntity.rotationYawHead = ExplosiveClaySpidersEntity.rotationYaw;
          ExplosiveClaySpidersEntity.renderYawOffset = ExplosiveClaySpidersEntity.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)ExplosiveClaySpidersEntity);
          ExplosiveClaySpidersEntity1.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          ExplosiveClaySpidersEntity1.setTamed(true);
          ExplosiveClaySpidersEntity1.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          ExplosiveClaySpidersEntity1.rotationYawHead = ExplosiveClaySpidersEntity1.rotationYaw;
          ExplosiveClaySpidersEntity1.renderYawOffset = ExplosiveClaySpidersEntity1.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)ExplosiveClaySpidersEntity1);
          ExplosiveClaySpidersEntity2.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
          ExplosiveClaySpidersEntity2.setTamed(true);
          ExplosiveClaySpidersEntity2.setPositionAndRotation(Par3EntityPlayer.posX - 2.0D, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
          ExplosiveClaySpidersEntity2.rotationYawHead = ExplosiveClaySpidersEntity2.rotationYaw;
          ExplosiveClaySpidersEntity2.renderYawOffset = ExplosiveClaySpidersEntity2.rotationYaw;
          Par2World.spawnEntityInWorld((Entity)ExplosiveClaySpidersEntity2);
          props.consumeMana(25 + props.getNinjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "An Explosion Release jutsu that creates 3");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Clay spiders that attack your enemies by exploding");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (25 + props.getNinjutsu() / 600));
  }
}

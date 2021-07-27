package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Jutsu.EntityMistServant;
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

public class MistServantTechnique extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getGenjutsu() < 20)
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your Genjutsu is too low")); 
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        if (props.getCurrentMana() >= 35 + props.getGenjutsu() / 600) {
          if (props.getGenjutsu() >= 20) {
            EntityMistServant EntityBunshin23 = new EntityMistServant(Par2World);
            EntityMistServant EntityBunshin1 = new EntityMistServant(Par2World);
            EntityMistServant EntityBunshin2 = new EntityMistServant(Par2World);
            EntityBunshin23.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
            EntityBunshin23.setTamed(true);
            EntityBunshin23.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
            EntityBunshin23.rotationYawHead = EntityBunshin23.rotationYaw;
            EntityBunshin23.renderYawOffset = EntityBunshin23.rotationYaw;
            Par2World.spawnEntityInWorld((Entity)EntityBunshin23);
            EntityBunshin1.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
            EntityBunshin1.setTamed(true);
            EntityBunshin1.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
            EntityBunshin1.rotationYawHead = EntityBunshin1.rotationYaw;
            EntityBunshin1.renderYawOffset = EntityBunshin1.rotationYaw;
            Par2World.spawnEntityInWorld((Entity)EntityBunshin1);
            EntityBunshin2.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
            EntityBunshin2.setTamed(true);
            EntityBunshin2.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
            EntityBunshin2.rotationYawHead = EntityBunshin2.rotationYaw;
            EntityBunshin2.renderYawOffset = EntityBunshin2.rotationYaw;
            Par2World.spawnEntityInWorld((Entity)EntityBunshin2);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Multiple Kage Bunshin No Jutsu!!"));
            props.consumeMana(35 + props.getGenjutsu() / 600);
          } 
          if (props.getGenjutsu() >= 40) {
            EntityMistServant EntityBunshin23 = new EntityMistServant(Par2World);
            EntityBunshin23.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
            EntityBunshin23.setTamed(true);
            EntityBunshin23.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
            EntityBunshin23.rotationYawHead = EntityBunshin23.rotationYaw;
            EntityBunshin23.renderYawOffset = EntityBunshin23.rotationYaw;
            Par2World.spawnEntityInWorld((Entity)EntityBunshin23);
          } 
          if (props.getGenjutsu() >= 60) {
            EntityMistServant EntityBunshin23 = new EntityMistServant(Par2World);
            EntityBunshin23.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
            EntityBunshin23.setTamed(true);
            EntityBunshin23.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
            EntityBunshin23.rotationYawHead = EntityBunshin23.rotationYaw;
            EntityBunshin23.renderYawOffset = EntityBunshin23.rotationYaw;
            Par2World.spawnEntityInWorld((Entity)EntityBunshin23);
          } 
          if (props.getGenjutsu() >= 80) {
            EntityMistServant EntityBunshin23 = new EntityMistServant(Par2World);
            EntityBunshin23.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
            EntityBunshin23.setTamed(true);
            EntityBunshin23.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
            EntityBunshin23.rotationYawHead = EntityBunshin23.rotationYaw;
            EntityBunshin23.renderYawOffset = EntityBunshin23.rotationYaw;
            Par2World.spawnEntityInWorld((Entity)EntityBunshin23);
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this jutsu"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    if (props.getGenjutsu() < 40 && props.getGenjutsu() >= 20) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "A Genjutsu that creates 3 clones");
      par3List.add(EnumChatFormatting.DARK_AQUA + "that move rather slowly and");
      par3List.add(EnumChatFormatting.DARK_AQUA + "recreate upon dying");
      par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (35 + props.getGenjutsu() / 600));
      par3List.add(EnumChatFormatting.DARK_RED + "Genjutsu for next stage: 40");
    } 
    if (props.getGenjutsu() < 60 && props.getGenjutsu() >= 40) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "A Genjutsu that creates 4 clones");
      par3List.add(EnumChatFormatting.DARK_AQUA + "that move rather slowly and");
      par3List.add(EnumChatFormatting.DARK_AQUA + "recreate upon dying");
      par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (35 + props.getGenjutsu() / 600));
      par3List.add(EnumChatFormatting.DARK_RED + "Genjutsu for next stage: 60");
    } 
    if (props.getGenjutsu() < 80 && props.getGenjutsu() >= 60) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "A Genjutsu that creates 5 clones");
      par3List.add(EnumChatFormatting.DARK_AQUA + "that move rather slowly and");
      par3List.add(EnumChatFormatting.DARK_AQUA + "recreate upon dying");
      par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (35 + props.getGenjutsu() / 600));
      par3List.add(EnumChatFormatting.DARK_RED + "Genjutsu for next stage: 80");
    } 
    if (props.getGenjutsu() < 100 && props.getGenjutsu() >= 80) {
      par3List.add(EnumChatFormatting.DARK_AQUA + "A Genjutsu that creates 6 clones");
      par3List.add(EnumChatFormatting.DARK_AQUA + "that move rather slowly and");
      par3List.add(EnumChatFormatting.DARK_AQUA + "recreate upon dying");
      par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (35 + props.getGenjutsu() / 600));
    } 
  }
}

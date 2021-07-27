package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Jutsu.EntityIllusionWolfKurama;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class KuramaClanHerd extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
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
  
  public KuramaClanHerd() {
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter == 0) {
        counter = 200;
        Par1ItemStack.stackTagCompound.setInteger("counter", counter);
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getCurrentMana() >= 45) {
          if (props.getGenjutsu() >= 50) {
            if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getClanName().contains("Kurama")) {
              EntityIllusionWolfKurama entityIllusionWolfKurama = new EntityIllusionWolfKurama(Par2World);
              EntityIllusionWolfKurama entityIllusionWolfKurama1 = new EntityIllusionWolfKurama(Par2World);
              EntityIllusionWolfKurama entityIllusionWolfKurama2 = new EntityIllusionWolfKurama(Par2World);
              entityIllusionWolfKurama.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
              entityIllusionWolfKurama.setTamed(true);
              entityIllusionWolfKurama.setPositionAndRotation(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
              entityIllusionWolfKurama.rotationYawHead = entityIllusionWolfKurama.rotationYaw;
              entityIllusionWolfKurama.renderYawOffset = entityIllusionWolfKurama.rotationYaw;
              Par2World.spawnEntityInWorld((Entity)entityIllusionWolfKurama);
              entityIllusionWolfKurama1.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
              entityIllusionWolfKurama1.setTamed(true);
              entityIllusionWolfKurama1.setPositionAndRotation(Par3EntityPlayer.posX - 1.0D, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
              entityIllusionWolfKurama1.rotationYawHead = entityIllusionWolfKurama1.rotationYaw;
              entityIllusionWolfKurama1.renderYawOffset = entityIllusionWolfKurama1.rotationYaw;
              Par2World.spawnEntityInWorld((Entity)entityIllusionWolfKurama1);
              entityIllusionWolfKurama2.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
              entityIllusionWolfKurama2.setTamed(true);
              entityIllusionWolfKurama2.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ + 1.0D, Par3EntityPlayer.rotationYaw, 0.0F);
              entityIllusionWolfKurama2.rotationYawHead = entityIllusionWolfKurama2.rotationYaw;
              entityIllusionWolfKurama2.renderYawOffset = entityIllusionWolfKurama2.rotationYaw;
              Par2World.spawnEntityInWorld((Entity)entityIllusionWolfKurama2);
              Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.harm.id, 50, 0));
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Kurama-Style: Illusion Wolves-Herd!!"));
              props.consumeMana(45);
            } else {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of entity Item"));
            } 
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You need at least 50 Genjutsu"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
        } 
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A Genjutsu that crosses into reality");
    par3List.add(EnumChatFormatting.DARK_AQUA + "creating 3 illusion dogs");
    par3List.add(EnumChatFormatting.DARK_AQUA + "at the cost of extreme mental pain");
    par3List.add(EnumChatFormatting.DARK_RED + "Chakra: 50");
  }
}

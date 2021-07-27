package alcoholmod.Mathioks.SealingJutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
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

public class ChakraSeal extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
    } 
    if (par1ItemStack.stackTagCompound != null) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter > 0) {
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
    } 
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    int counter = stack.stackTagCompound.getInteger("counter");
    if (counter == 0 && !player.worldObj.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getKinjutsu() >= 50) {
        if (stack.stackTagCompound.getString("Owner").equals(player.getCommandSenderName())) {
          if (props.getCurrentMana() >= 25) {
            if (entity instanceof EntityLivingBase) {
              if (((EntityLivingBase)entity).getHealth() <= ((EntityLivingBase)entity).getMaxHealth() / 10.0F) {
                player.addChatComponentMessage((IChatComponent)new ChatComponentText("Fuinjutsu: Chakra Seal!!"));
                ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 10));
                if (entity instanceof EntityPlayer) {
                  EntityPlayer hitPlayer = (EntityPlayer)entity;
                  ExtendedPlayer hitProps = ExtendedPlayer.get(hitPlayer);
                  hitProps.setCurrentMana(0);
                } 
                props.consumeMana(25);
              } 
            } else {
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("Sealing Resisted!"));
            } 
          } else {
            player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Do Not Have Enough Chakra"));
          } 
        } else {
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
        } 
      } else {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("You need at least 50 Kinjutsu"));
      } 
    } 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A High class Sealing Jutsu");
    par3List.add(EnumChatFormatting.DARK_AQUA + "that seals the enemies chakra");
    par3List.add(EnumChatFormatting.DARK_AQUA + "if the enemy is at 1/10 of its health");
    par3List.add(EnumChatFormatting.DARK_RED + "Cost: 25");
    par3List.add(EnumChatFormatting.DARK_RED + "Kinjutsu: 50");
  }
}

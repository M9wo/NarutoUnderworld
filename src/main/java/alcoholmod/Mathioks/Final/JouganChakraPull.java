package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
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
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class JouganChakraPull extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
      } 
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter > 0) {
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
    } 
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
    if (par3EntityLivingBase instanceof EntityPlayer) {
      EntityPlayer player = (EntityPlayer)par3EntityLivingBase;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (par1ItemStack.stackTagCompound.getString("Owner").equals(par3EntityLivingBase.getCommandSenderName())) {
        if (props.getJougan() >= 1 && props.getJouganActive()) {
          int counter = par1ItemStack.stackTagCompound.getInteger("counter");
          if (counter == 0)
            if (props.getCurrentMana() >= 40 + props.getNinjutsu() / 300) {
              if (par2EntityLivingBase instanceof EntityPlayer) {
                ExtendedPlayer propsSource = ExtendedPlayer.get((EntityPlayer)par2EntityLivingBase);
                int MinusMana = (int)((20.0D + (props.getTaijutsu() - 1.5D) * 3.0D) * 2.5D);
                propsSource.setCurrentMana(propsSource.getCurrentMana() - MinusMana);
              } 
              par2EntityLivingBase.attackEntityFrom(DamageSource.magic, (int)(props.getTaijutsu() / 1.1D));
              props.consumeMana(40 + props.getNinjutsu() / 300);
              counter = 20;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
            } else {
              player.addChatComponentMessage((IChatComponent)new ChatComponentText("You don't have enough chakra"));
            }  
        } else {
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You must have the Jougan active to use this"));
        } 
      } else {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this jutsu"));
      } 
    } 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.AQUA + "Counter: " + par1ItemStack.stackTagCompound.getInteger("counter"));
    } 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Takes away the opponents chakra");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (40 + props.getNinjutsu() / 300));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (props.getTaijutsu() / 1.1D));
    par3List.add(EnumChatFormatting.AQUA + "Chakra Taken Away: " + ((20.0D + (props.getTaijutsu() - 1.5D) * 3.0D) * 2.5D));
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    ExtendedPlayer props = ExtendedPlayer.get(player);
    boolean canAttack = false;
    if (props.getCurrentMana() < 40)
      canAttack = true; 
    if (props.getCurrentMana() >= 40)
      canAttack = false; 
    return canAttack;
  }
  
  public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
    if (entityLiving instanceof EntityPlayer) {
      boolean canSwing = false;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityLiving);
      if (props.getCurrentMana() < 40)
        canSwing = true; 
      if (props.getCurrentMana() >= 40)
        canSwing = false; 
      return canSwing;
    } 
    return false;
  }
}

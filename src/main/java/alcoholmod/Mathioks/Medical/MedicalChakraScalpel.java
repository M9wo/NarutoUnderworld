package alcoholmod.Mathioks.Medical;

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
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class MedicalChakraScalpel extends JutsuItem {
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
    if (par1ItemStack.stackTagCompound != null)
      par1ItemStack.stackTagCompound.getInteger("counter");
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    int counter = stack.stackTagCompound.getInteger("counter");
    if (counter == 0 && !player.worldObj.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getCurrentMana() >= 7) {
        if (stack.stackTagCompound.getString("Owner").equals(player.getCommandSenderName())) {
          entity.attackEntityFrom(DamageSource.causePlayerDamage(player), (props.getHealth() / 40 - 1));
          if (entity instanceof EntityLivingBase)
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 10, 5)); 
          props.consumeMana(7);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Chakra Scalpel!"));
        } else {
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
        } 
      } else {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
      } 
    } 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A medical jutsu that can only");
    par3List.add(EnumChatFormatting.DARK_AQUA + "be used for combat by very");
    par3List.add(EnumChatFormatting.DARK_AQUA + "experienced medical-nin");
    par3List.add(EnumChatFormatting.DARK_AQUA + "attacks the target's muscles");
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (props.getHealth() / 40));
  }
}

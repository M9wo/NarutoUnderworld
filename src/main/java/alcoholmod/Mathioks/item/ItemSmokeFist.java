package alcoholmod.Mathioks.item;

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

public class ItemSmokeFist extends JutsuItem {
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
    if (par3Entity != null) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter > 0) {
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
    } 
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    if (!player.worldObj.isRemote && stack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (stack.stackTagCompound.getString("Owner").equals(player.getCommandSenderName()) && props.getClanName().contains("Iburi")) {
        if (props.getCurrentMana() >= 40 + props.getNinjutsu() / 600) {
          entity.attackEntityFrom(DamageSource.causePlayerDamage(player), (13 + props.getNinjutsu() / 200));
          if (entity instanceof EntityLivingBase)
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 2, 100)); 
          stack.stackTagCompound.setInteger("counter", 200);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Smoke Fist!"));
          props.consumeMana(30 + props.getNinjutsu() / 600);
        } else {
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You don't have enough chakra"));
        } 
      } else {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
      } 
    } 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A jutsu used by members of the");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Iburi clan by changing their hands");
    par3List.add(EnumChatFormatting.DARK_AQUA + "into smoke that enters the opponents body,");
    par3List.add(EnumChatFormatting.DARK_AQUA + "slowing them down for a short amount of time");
    par3List.add(EnumChatFormatting.DARK_RED + "Chakra Cost: " + (30 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (13 + props.getNinjutsu() / 60));
  }
}

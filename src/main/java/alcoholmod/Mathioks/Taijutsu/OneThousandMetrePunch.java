package alcoholmod.Mathioks.Taijutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class OneThousandMetrePunch extends JutsuItem {
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
      if (props.getTaijutsu() >= 2.0D) {
        if (stack.stackTagCompound.getString("Owner").equals(player.getCommandSenderName())) {
          entity.addVelocity(-Math.sin(Math.toRadians(player.rotationYawHead)) * 8.0D, 0.0D, Math.cos(Math.toRadians(player.rotationYawHead)) * 8.0D);
          entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 1.0F + (int)props.getTaijutsu());
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("1000 Metre Punch!"));
          counter = 500;
          stack.stackTagCompound.setInteger("counter", counter);
        } else {
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
        } 
      } else {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("You need at least 50 Taijutsu"));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "A powerful punch that throws");
    par3List.add(EnumChatFormatting.DARK_AQUA + "the opponent far back");
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (1 + (int)props.getTaijutsu()));
  }
}

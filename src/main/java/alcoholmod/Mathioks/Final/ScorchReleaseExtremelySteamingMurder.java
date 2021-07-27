package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.ScorchReleaseSteamingEntity;
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

public class ScorchReleaseExtremelySteamingMurder extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World Par2World, Entity Par3EntityPlayer, int par4, boolean par5) {
    if ((EntityPlayer)Par3EntityPlayer != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)Par3EntityPlayer).getCommandSenderName());
      par1ItemStack.stackTagCompound.setBoolean("FireMode", false);
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    boolean FireMode = par1ItemStack.stackTagCompound.getBoolean("FireMode");
    int counter = par1ItemStack.stackTagCompound.getInteger("counter");
    if (FireMode) {
      counter++;
      par1ItemStack.stackTagCompound.setInteger("counter", counter);
      if (counter == 5)
        Par2World.spawnEntityInWorld((Entity)new ScorchReleaseSteamingEntity(Par2World, (EntityLivingBase)Par3EntityPlayer)); 
      if (counter == 30)
        Par2World.spawnEntityInWorld((Entity)new ScorchReleaseSteamingEntity(Par2World, (EntityLivingBase)Par3EntityPlayer)); 
      if (counter == 55)
        Par2World.spawnEntityInWorld((Entity)new ScorchReleaseSteamingEntity(Par2World, (EntityLivingBase)Par3EntityPlayer)); 
      if (counter >= 60) {
        FireMode = false;
        counter = 0;
        par1ItemStack.stackTagCompound.setBoolean("FireMode", FireMode);
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
    } 
  }
  
  public ScorchReleaseExtremelySteamingMurder() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getscorchRelease() == 1) {
        boolean FireMode = Par1ItemStack.stackTagCompound.getBoolean("FireMode");
        int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
        if (props.getCurrentMana() >= 25 + props.getNinjutsu() / 600 && !FireMode) {
          FireMode = true;
          Par1ItemStack.stackTagCompound.setBoolean("FireMode", FireMode);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Extremely Steaming Murder!"));
          props.consumeMana(25 + props.getNinjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Shoot 3 Scorching Fireballs");
    par3List.add(EnumChatFormatting.DARK_AQUA + "That dry the opponent out on hit");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (25 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (9 + props.getNinjutsu() / 600));
  }
}

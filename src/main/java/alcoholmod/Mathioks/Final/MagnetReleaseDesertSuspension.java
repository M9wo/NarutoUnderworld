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

public class MagnetReleaseDesertSuspension extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public MagnetReleaseDesertSuspension() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("Counter", 0);
      par1ItemStack.stackTagCompound.setBoolean("Active", false);
    } 
    if (!((EntityPlayer)par3Entity).inventory.hasItemStack(par1ItemStack))
      par1ItemStack.stackTagCompound.setBoolean("Active", false); 
    if (par1ItemStack.stackTagCompound.getBoolean("Active")) {
      int i;
      for (i = 0; i < 8; i++)
        par2World.spawnParticle("crit", ((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY - 1.6D, ((EntityPlayer)par3Entity).posZ, 0.0D, 0.0D, 0.0D); 
      for (i = 0; i < 400; i++)
        par2World.spawnParticle("crit", ((EntityPlayer)par3Entity).posX + par2World.rand.nextGaussian(), ((EntityPlayer)par3Entity).posY - 1.6D + par2World.rand.nextGaussian() * 0.5D, ((EntityPlayer)par3Entity).posZ + par2World.rand.nextGaussian(), 0.0D, 0.0D, 0.0D); 
    } 
    if (!((EntityPlayer)par3Entity).capabilities.isCreativeMode) {
      if (par1ItemStack.stackTagCompound.getBoolean("Active")) {
        if (!((EntityPlayer)par3Entity).capabilities.allowFlying && par1ItemStack.stackTagCompound.getString("Owner").equals(par3Entity.getCommandSenderName())) {
          ((EntityPlayer)par3Entity).capabilities.allowFlying = true;
          ((EntityPlayer)par3Entity).capabilities.isFlying = true;
          ((EntityPlayer)par3Entity).fallDistance = 0.0F;
        } 
        ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3Entity);
        int counter = par1ItemStack.stackTagCompound.getInteger("counter");
        if (counter > 0) {
          counter--;
          par1ItemStack.stackTagCompound.setInteger("counter", counter);
        } 
        if (counter == 0) {
          counter = 10;
          par1ItemStack.stackTagCompound.setInteger("counter", counter);
          props.consumeMana(4);
        } 
        if (props.getCurrentMana() == 0) {
          par1ItemStack.stackTagCompound.setBoolean("Active", false);
          if (!par2World.isRemote)
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Desert Suspension De-Activate")); 
        } 
      } 
      if (!par1ItemStack.stackTagCompound.getBoolean("Active") && ((EntityPlayer)par3Entity).capabilities.allowFlying) {
        ((EntityPlayer)par3Entity).capabilities.allowFlying = false;
        ((EntityPlayer)par3Entity).capabilities.isFlying = false;
        ((EntityPlayer)par3Entity).fallDistance = 0.0F;
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
    ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        if (!Par1ItemStack.stackTagCompound.getBoolean("Active")) {
          if (props.getmagnetRelease() == 1) {
            if (props.getCurrentMana() >= 10) {
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Desert Suspension!"));
              props.consumeMana(10);
              counter = 10;
              Par1ItemStack.stackTagCompound.setInteger("counter", counter);
              Par1ItemStack.stackTagCompound.setBoolean("Active", true);
            } 
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
          } 
        } else if (Par1ItemStack.stackTagCompound.getBoolean("Active")) {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Desert Suspension De-Activate"));
          Par1ItemStack.stackTagCompound.setBoolean("Active", false);
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
      }  
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A utility Magnet Release Technique");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Allows the user to fly at the cost of chakra");
  }
}

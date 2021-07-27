package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.LavaReleaseStreamRockTechniqueEntity;
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

public class LavaReleaseStreamRockTechnique extends JutsuItem {
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
      if (counter == 5 && !Par2World.isRemote)
        Par2World.spawnEntityInWorld((Entity)new LavaReleaseStreamRockTechniqueEntity(Par2World, (EntityLivingBase)Par3EntityPlayer)); 
      if (counter == 20 && !Par2World.isRemote)
        Par2World.spawnEntityInWorld((Entity)new LavaReleaseStreamRockTechniqueEntity(Par2World, (EntityLivingBase)Par3EntityPlayer)); 
      if (counter == 35 && !Par2World.isRemote)
        Par2World.spawnEntityInWorld((Entity)new LavaReleaseStreamRockTechniqueEntity(Par2World, (EntityLivingBase)Par3EntityPlayer)); 
      if (counter == 50 && !Par2World.isRemote)
        Par2World.spawnEntityInWorld((Entity)new LavaReleaseStreamRockTechniqueEntity(Par2World, (EntityLivingBase)Par3EntityPlayer)); 
      if (counter == 65 && !Par2World.isRemote)
        Par2World.spawnEntityInWorld((Entity)new LavaReleaseStreamRockTechniqueEntity(Par2World, (EntityLivingBase)Par3EntityPlayer)); 
      if (counter >= 70) {
        FireMode = false;
        counter = 0;
        par1ItemStack.stackTagCompound.setBoolean("FireMode", FireMode);
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
    } 
  }
  
  public LavaReleaseStreamRockTechnique() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getlavaRelease() == 1) {
        boolean FireMode = Par1ItemStack.stackTagCompound.getBoolean("FireMode");
        int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
        if (props.getCurrentMana() >= 20.0D + 0.02D * props.getLevel() && !FireMode) {
          FireMode = true;
          Par1ItemStack.stackTagCompound.setBoolean("FireMode", FireMode);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Scorching Stream Rock Technique!"));
          props.consumeMana((int)(20.0D + 0.02D * props.getLevel()));
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You don't have enough chakra"));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Shoot 5 Scorching Lava rocks");
    par3List.add(EnumChatFormatting.DARK_AQUA + "that set anything it hits on fire");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (20.0D + 0.02D * props.getLevel()));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (10.0D + 0.005D * props.getLevel()));
  }
}

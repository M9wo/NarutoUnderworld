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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class BoilReleaseUnrivalledStrength extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public BoilReleaseUnrivalledStrength() {
    setMaxDamage(100);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setBoolean("EarthMode", false);
    } 
    if (par1ItemStack.stackTagCompound != null) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      boolean EarthMode = par1ItemStack.stackTagCompound.getBoolean("EarthMode");
      if (EarthMode) {
        EntityPlayer player = (EntityPlayer)par3Entity;
        ExtendedPlayer props = ExtendedPlayer.get(player);
        for (int i = 0; i < 1; i++) {
          par2World.spawnParticle("cloud", par3Entity.posX, par3Entity.posY + 1.0D, par3Entity.posZ, 0.0D, 0.0D, 0.0D);
          if (!par2World.isRemote) {
            counter++;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
            if (counter >= 40) {
              props.consumeMana(1);
              counter = 0;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
            } 
          } 
          if (!((EntityPlayer)par3Entity).isPotionActive(Potion.moveSpeed.id))
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2)); 
          if (!((EntityPlayer)par3Entity).isPotionActive(Potion.jump.id))
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.jump.id, 5, 2)); 
          if (!((EntityPlayer)par3Entity).isPotionActive(Potion.damageBoost.id))
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 0)); 
        } 
        if (props.getCurrentMana() == 0) {
          EarthMode = false;
          par1ItemStack.stackTagCompound.setBoolean("EarthMode", EarthMode);
          par1ItemStack.setItemDamage(0);
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getboilRelease() == 1)
        if (props.getCurrentMana() >= 10) {
          if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
            boolean EarthMode = Par1ItemStack.stackTagCompound.getBoolean("EarthMode");
            if (Par1ItemStack.getItemDamage() == 0) {
              EarthMode = true;
              Par1ItemStack.stackTagCompound.setBoolean("EarthMode", EarthMode);
              Par1ItemStack.setItemDamage(50);
              int i;
              for (i = 0; i < 8; i++)
                Par2World.spawnParticle("smoke", Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 0.0D, 0.0D, 0.0D); 
              for (i = 0; i < 800; i++)
                Par2World.spawnParticle("cloud", Par3EntityPlayer.posX + Par2World.rand.nextGaussian(), Par3EntityPlayer.posY + Par2World.rand.nextGaussian() * 0.25D, Par3EntityPlayer.posZ + Par2World.rand.nextGaussian(), 0.0D, 0.0D, 0.0D); 
              props.consumeMana(10);
              return Par1ItemStack;
            } 
            if (Par1ItemStack.getItemDamage() == 50) {
              EarthMode = false;
              Par1ItemStack.stackTagCompound.setBoolean("EarthMode", EarthMode);
              Par1ItemStack.setItemDamage(0);
            } 
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
        }  
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Raising the temperature of your chakra");
    par3List.add(EnumChatFormatting.DARK_AQUA + "to the boiling point, you heavily increase");
    par3List.add(EnumChatFormatting.DARK_AQUA + "your speed, jump and damage output");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 10");
    par3List.add(EnumChatFormatting.DARK_RED + "Chakra per Second: 0.5");
  }
}

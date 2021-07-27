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

public class CrystalReleaseCrystalArmor extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public CrystalReleaseCrystalArmor() {
    setMaxDamage(70);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setBoolean("On", false);
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setInteger("counter2", 0);
    } 
    int counter = par1ItemStack.stackTagCompound.getInteger("counter");
    int counter2 = par1ItemStack.stackTagCompound.getInteger("counter2");
    boolean On = par1ItemStack.stackTagCompound.getBoolean("On");
    if (counter2 > 0) {
      counter2--;
      par1ItemStack.stackTagCompound.setInteger("counter2", counter2);
    } 
    ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3Entity);
    if (par1ItemStack.getItemDamage() == 50 && !On) {
      On = true;
      par1ItemStack.stackTagCompound.setBoolean("On", On);
    } 
    if (par1ItemStack.getItemDamage() == 0 && On) {
      On = false;
      par1ItemStack.stackTagCompound.setBoolean("On", On);
    } 
    if (props.getCurrentMana() == 0 && On) {
      par1ItemStack.setItemDamage(0);
      On = false;
      par1ItemStack.stackTagCompound.setBoolean("On", On);
      ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Crystal Release: Crystal Armor - Deactivate!"));
    } 
    if (On && !par2World.isRemote) {
      if (!par2World.isRemote) {
        if (!((EntityPlayer)par3Entity).isPotionActive(Potion.resistance.id))
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.resistance.id, 200, 0)); 
        if (!((EntityPlayer)par3Entity).isPotionActive(Potion.damageBoost.id))
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 200, 0)); 
      } 
      counter++;
      if (counter == 20) {
        props.setCurrentMana(props.getCurrentMana() - 1);
        counter = 0;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
      int counter2 = Par1ItemStack.stackTagCompound.getInteger("counter2");
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getCurrentMana() >= 35 + props.getNinjutsu() / 600) {
          if (props.crystalRelease == 1 && Par1ItemStack.getItemDamage() == 0 && counter2 == 0) {
            Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 200, 0));
            Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 200, 0));
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Crystal Release: Crystal Armor!!"));
            counter2 = 100;
            Par1ItemStack.setItemDamage(50);
          } 
          if (Par1ItemStack.getItemDamage() == 50 && counter2 == 0 && !Par2World.isRemote) {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Crystal Release: Crystal Armor - Deactivate!"));
            Par1ItemStack.setItemDamage(0);
          } 
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create a crystal armor");
  }
}

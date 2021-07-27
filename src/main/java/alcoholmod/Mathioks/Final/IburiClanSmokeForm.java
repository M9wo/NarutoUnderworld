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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class IburiClanSmokeForm extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setBoolean("SmokeForm", false);
    } 
    if (par1ItemStack.stackTagCompound != null) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (par1ItemStack.stackTagCompound.getBoolean("SmokeForm")) {
        EntityPlayer players = (EntityPlayer)par3Entity;
        ExtendedPlayer props = ExtendedPlayer.get(players);
        if (props.getCurrentMana() >= 1) {
          counter = par1ItemStack.stackTagCompound.getInteger("counter");
          counter++;
          par1ItemStack.stackTagCompound.setInteger("counter", counter);
          if (counter == 50) {
            props.consumeMana(1);
            counter = 0;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
        } else if (props.getCurrentMana() == 0 && !par2World.isRemote) {
          par1ItemStack.stackTagCompound.setBoolean("SmokeForm", false);
          ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Cloud Form-Deactivate!"));
          par1ItemStack.stackTagCompound.setInteger("counter", 0);
        } 
        for (int i = 0; i < 2; i++) {
          par2World.spawnParticle("cloud", par3Entity.posX, par3Entity.posY - 1.0D, par3Entity.posZ, 0.0D, 0.0D, 0.0D);
          par2World.spawnParticle("cloud", par3Entity.posX, par3Entity.posY, par3Entity.posZ, 0.0D, 0.0D, 0.0D);
        } 
        ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.resistance.id, 10, 1));
        ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.fireResistance.id, 10, 1));
        ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 10, 0));
        ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.jump.id, 10, 0));
        ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.invisibility.id, 10, 1));
      } 
    } 
  }
  
  public IburiClanSmokeForm() {
    this.maxStackSize = 1;
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    if (stack.stackTagCompound.getBoolean("SmokeForm") && !player.worldObj.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getCurrentMana() >= 10) {
        if (stack.stackTagCompound.getString("Owner").equals(player.getCommandSenderName()) && props.getClanName().contains("Iburi")) {
          entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 20.0F);
          if (entity instanceof EntityLivingBase) {
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 200, 5));
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.jump.id, 200, 0));
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 200, 5));
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 200, 5));
          } 
          props.consumeMana(10);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Smoke Form Entering!"));
          stack.stackTagCompound.setBoolean("SmokeForm", false);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Cloud Form-Deactivate!"));
          stack.stackTagCompound.setInteger("counter", 0);
        } else {
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
        } 
      } else {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
      } 
    } 
    return false;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        if (!Par1ItemStack.stackTagCompound.getBoolean("SmokeForm")) {
          if (props.getCurrentMana() >= 10) {
            Par1ItemStack.stackTagCompound.setBoolean("SmokeForm", true);
            props.consumeMana(10);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Cloud Form!!"));
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your chakra is not high enough"));
          } 
        } else if (Par1ItemStack.stackTagCompound.getBoolean("SmokeForm")) {
          Par1ItemStack.stackTagCompound.setBoolean("SmokeForm", false);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Cloud Form-Deactivate!"));
          Par1ItemStack.stackTagCompound.setInteger("counter", 0);
          return Par1ItemStack;
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "The main jutsu used by the");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Iburi clan, gives the user");
    par3List.add(EnumChatFormatting.DARK_AQUA + "a big increase in defense");
    par3List.add(EnumChatFormatting.DARK_AQUA + "while in smoke form, the user can");
    par3List.add(EnumChatFormatting.DARK_AQUA + "make the smoke enter someones body");
    par3List.add(EnumChatFormatting.DARK_RED + "Chakra: 10");
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: 20");
  }
}

package lc208.nam.items.neko;

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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class NekoDex extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public NekoDex() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setBoolean("EarthMode", false);
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
      } 
      if (par1ItemStack.stackTagCompound != null) {
        EntityPlayer player = (EntityPlayer)par3Entity;
        ExtendedPlayer props = ExtendedPlayer.get(player);
        boolean EarthMode = par1ItemStack.stackTagCompound.getBoolean("EarthMode");
        int counter = par1ItemStack.stackTagCompound.getInteger("counter");
        if (EarthMode) {
          for (int i = 0; i < 1; i++) {
            par2World.spawnParticle("explode", par3Entity.posX, par3Entity.posY - 1.0D, par3Entity.posZ, 0.0D, 0.0D, 0.0D);
            if (!par2World.isRemote) {
              counter++;
              par1ItemStack.stackTagCompound.setInteger("counter", counter);
              if (counter >= 20) {
                props.consumeMana(4 + props.getNinjutsu() / 600);
                counter = 0;
                par1ItemStack.stackTagCompound.setInteger("counter", counter);
              } 
            } 
            if (!((EntityPlayer)par3Entity).isPotionActive(Potion.moveSpeed.id))
              ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5, 2)); 
            if (!((EntityPlayer)par3Entity).isPotionActive(Potion.jump.id))
              ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.jump.id, 5, 7)); 
            if (!((EntityPlayer)par3Entity).isPotionActive(Potion.resistance.id))
              ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0)); 
            if (!((EntityPlayer)par3Entity).isPotionActive(Potion.digSpeed.id))
              ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.digSpeed.id, 5, 2)); 
          } 
          if (props.getCurrentMana() < 1 && EarthMode) {
            EarthMode = false;
            par1ItemStack.setItemDamage(0);
            par1ItemStack.stackTagCompound.setBoolean("EarthMode", EarthMode);
            if (!par2World.isRemote)
              ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Neko Dexterity de-Activate!")); 
          } 
        } 
        if (props.getCurrentMana() < 1 && EarthMode) {
          EarthMode = false;
          par1ItemStack.setItemDamage(0);
          par1ItemStack.stackTagCompound.setBoolean("EarthMode", EarthMode);
          if (!par2World.isRemote)
            ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Neko Dexterity de-Activate!")); 
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getClanName().contains("Neko"))
          if (props.getCurrentMana() >= 5 + props.getNinjutsu() / 600) {
            boolean EarthMode = Par1ItemStack.stackTagCompound.getBoolean("EarthMode");
            int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
            if (Par1ItemStack.getItemDamage() == 0) {
              EarthMode = true;
              Par1ItemStack.stackTagCompound.setBoolean("EarthMode", EarthMode);
              Par1ItemStack.setItemDamage(50);
              props.consumeMana(5 + props.getNinjutsu() / 600);
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Neko Dexterity Activate!"));
              return Par1ItemStack;
            } 
            if (Par1ItemStack.getItemDamage() == 50) {
              EarthMode = false;
              Par1ItemStack.stackTagCompound.setBoolean("EarthMode", EarthMode);
              Par1ItemStack.setItemDamage(0);
              Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Neko Dexterity de-Activate!"));
            } 
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra!"));
          }  
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this jutsu"));
      }  
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Activate Dex mode to increase your");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Speed, Jump, Resistance and Digspeed");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (5 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.GOLD + "Chakra Upkeep: 1");
  }
}

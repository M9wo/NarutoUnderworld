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
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class NineLifes extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public NineLifes() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
      } 
      if (par1ItemStack.stackTagCompound != null && par1ItemStack.getItemDamage() == 100) {
        EntityPlayer player = (EntityPlayer)par3Entity;
        ExtendedPlayer props = ExtendedPlayer.get(player);
        int counter = par1ItemStack.stackTagCompound.getInteger("counter");
        if (counter == 20) {
          if (player.getMaxHealth() != player.getHealth())
            if (props.getCurrentMana() >= 25) {
              player.setHealth(player.getHealth() + 5.0F);
              props.consumeMana(25);
            } else {
              player.setHealth(player.getHealth() + props.getCurrentMana() / 24.0F);
              props.consumeMana(props.getCurrentMana());
            }  
          counter = 0;
        } 
        counter++;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
        if (props.getCurrentMana() == 0) {
          par1ItemStack.setItemDamage(0);
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Neko Clan Jutsu: Nine Lifes De-Activate"));
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        if (Par1ItemStack.getItemDamage() == 0) {
          ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
          if (props.getCurrentMana() >= 200) {
            Par1ItemStack.setItemDamage(100);
            props.setCurrentMana(props.getCurrentMana() - 200);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Neko Clan Jutsu: Nine Lifes!"));
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You don't have enough chakra"));
          } 
        } else if (Par1ItemStack.getItemDamage() == 100) {
          Par1ItemStack.setItemDamage(0);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Neko Clan Jutsu: Nine Lifes De-Activate"));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "The absolute pinacle of");
    par3List.add(EnumChatFormatting.DARK_AQUA + "medical ninjutsu");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Heals the user at frequent");
    par3List.add(EnumChatFormatting.DARK_AQUA + "intervals using chakra");
    par3List.add(EnumChatFormatting.LIGHT_PURPLE + "Costs 200 chakra initially");
    par3List.add(EnumChatFormatting.LIGHT_PURPLE + "Costs 120 Chakra per 5 health");
    par3List.add(EnumChatFormatting.LIGHT_PURPLE + "Heals every 1 seconds");
  }
}

package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.Entity.EntityYamanakaMindCurse;
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
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class YamanakaCurse extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public YamanakaCurse() {
    this.maxStackSize = 1;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (!par2World.isRemote && (EntityPlayer)par3Entity != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setBoolean("Shot", false);
        par1ItemStack.stackTagCompound.setBoolean("Mid", false);
        par1ItemStack.stackTagCompound.setDouble("locX", 0.0D);
        par1ItemStack.stackTagCompound.setDouble("locY", 0.0D);
        par1ItemStack.stackTagCompound.setDouble("locZ", 0.0D);
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
      } 
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3Entity);
      if (par1ItemStack.stackTagCompound != null && 
        par1ItemStack.stackTagCompound.getBoolean("Shot")) {
        props.consumeMana(1);
        if (props.getCurrentMana() <= 0) {
          par1ItemStack.stackTagCompound.setBoolean("Shot", false);
          ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Mind Body Curse Puppet Jutsu-Deactivate"));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 600, 25));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 25));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 600, 25));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 25));
        } else if (((EntityPlayer)par3Entity).getHeldItem() != null && ((EntityPlayer)par3Entity).getHeldItem().getItem() != AlcoholMod.YamanakaCurse) {
          par1ItemStack.stackTagCompound.setBoolean("Shot", false);
          ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Mind Body Curse Puppet Jutsu-Deactivate"));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 600, 25));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 25));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 600, 25));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 25));
        } else if (((EntityPlayer)par3Entity).getHeldItem() == null) {
          par1ItemStack.stackTagCompound.setBoolean("Shot", false);
          ((EntityPlayer)par3Entity).addChatComponentMessage((IChatComponent)new ChatComponentText("Mind Body Curse Puppet Jutsu-Deactivate"));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 600, 25));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 25));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.weakness.id, 600, 25));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 25));
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getClanName().contains("Yamanaka")) {
        if (!Par1ItemStack.stackTagCompound.getBoolean("Shot") && !Par1ItemStack.stackTagCompound.getBoolean("Mid"))
          if (props.getCurrentMana() >= 70) {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Mind Body Curse Puppet Jutsu!!"));
            Par2World.spawnEntityInWorld((Entity)new EntityYamanakaMindCurse(Par2World, (EntityLivingBase)Par3EntityPlayer));
            Par1ItemStack.stackTagCompound.setBoolean("Shot", true);
            props.consumeMana(70);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
          }  
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this item"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.DARK_AQUA + "The main jutsu of the Yamanaka Clan.");
      par3List.add(EnumChatFormatting.DARK_AQUA + "By focusing your chakra the user extends");
      par3List.add(EnumChatFormatting.DARK_AQUA + "their spirit and takes over the enemies body.");
      par3List.add(EnumChatFormatting.DARK_AQUA + "When the users body that is left behind gets");
      par3List.add(EnumChatFormatting.DARK_AQUA + "killed or the body that's being taken over dies");
      par3List.add(EnumChatFormatting.DARK_AQUA + "the user of this jutsu dies with it");
      par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + 'F');
      par3List.add(EnumChatFormatting.DARK_RED + "Chakra Upkeep/Sec: " + '\001');
      par3List.add(EnumChatFormatting.AQUA + "Counter: " + par1ItemStack.stackTagCompound.getInteger("counter"));
    } 
  }
}

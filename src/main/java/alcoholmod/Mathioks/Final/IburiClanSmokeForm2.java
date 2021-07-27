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

public class IburiClanSmokeForm2 extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setBoolean("SmokeForm", false);
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    boolean SmokeForm = par1ItemStack.stackTagCompound.getBoolean("SmokeForm");
    if (SmokeForm) {
      for (int i = 0; i < 32; i++) {
        par2World.spawnParticle("cloud", par3Entity.posX, par3Entity.posY + par2World.rand.nextDouble() * 1.0D, par3Entity.posZ, par2World.rand.nextGaussian(), 0.0D, par2World.rand.nextGaussian());
        par2World.spawnParticle("cloud", par3Entity.posX, par3Entity.posY + par2World.rand.nextDouble() * 1.0D, par3Entity.posZ - 1.0D, par2World.rand.nextGaussian(), 0.0D, par2World.rand.nextGaussian());
      } 
      EntityPlayer player = (EntityPlayer)par3Entity;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter > 0) {
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
      if (counter == 0) {
        par1ItemStack.stackTagCompound.setInteger("counter", 30);
        props.consumeMana(1);
      } 
      if (props.getCurrentMana() == 0) {
        ((EntityPlayer)par3Entity).removePotionEffect(Potion.resistance.id);
        ((EntityPlayer)par3Entity).removePotionEffect(Potion.fireResistance.id);
        ((EntityPlayer)par3Entity).removePotionEffect(Potion.moveSlowdown.id);
        ((EntityPlayer)par3Entity).removePotionEffect(Potion.invisibility.id);
        ((EntityPlayer)par3Entity).removePotionEffect(Potion.weakness.id);
        par1ItemStack.stackTagCompound.setBoolean("SmokeForm", false);
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
      } 
    } 
  }
  
  public IburiClanSmokeForm2() {
    setMaxDamage(3700);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 10 + props.getNinjutsu() / 600 && props.getClanName().contains("Iburi")) {
        boolean SmokeForm = Par1ItemStack.stackTagCompound.getBoolean("SmokeForm");
        if (!SmokeForm) {
          Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 100000000, 2));
          Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 100000000, 5));
          Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100000000, 2));
          Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.weakness.id, 100000000, 5));
          Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.invisibility.id, 100000000, 1));
          Par1ItemStack.stackTagCompound.setBoolean("SmokeForm", true);
          Par1ItemStack.stackTagCompound.setInteger("counter", 30);
          props.consumeMana(10 + props.getNinjutsu() / 600);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Cloud Form 2!!"));
          return Par1ItemStack;
        } 
        if (SmokeForm) {
          Par3EntityPlayer.removePotionEffect(Potion.resistance.id);
          Par3EntityPlayer.removePotionEffect(Potion.fireResistance.id);
          Par3EntityPlayer.removePotionEffect(Potion.moveSlowdown.id);
          Par3EntityPlayer.removePotionEffect(Potion.weakness.id);
          Par3EntityPlayer.removePotionEffect(Potion.invisibility.id);
          Par1ItemStack.stackTagCompound.setBoolean("SmokeForm", false);
          Par1ItemStack.stackTagCompound.setInteger("counter", 0);
          return Par1ItemStack;
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "A jutsu of the Iburi clan");
    par3List.add(EnumChatFormatting.DARK_AQUA + "By transforming their bodies into");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Smoke, the user gets extreme defenses");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (10 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Chakra Cost/Sec: 1");
  }
}

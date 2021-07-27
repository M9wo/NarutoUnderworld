package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EarthReleaseShieldOfSand extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public EarthReleaseShieldOfSand() {
    setMaxDamage(200);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World Par2World, Entity Par3EntityPlayer, int par4, boolean par5) {
    if ((EntityPlayer)Par3EntityPlayer != null) {
      if (par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)Par3EntityPlayer).getCommandSenderName());
        par1ItemStack.stackTagCompound.setBoolean("on", false);
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
        par1ItemStack.stackTagCompound.setInteger("counter2", 0);
        par1ItemStack.stackTagCompound.setInteger("i", 0);
        par1ItemStack.stackTagCompound.setInteger("j", 0);
        par1ItemStack.stackTagCompound.setInteger("k", 0);
      } 
      if (par1ItemStack.stackTagCompound != null && !Par2World.isRemote) {
        boolean on = par1ItemStack.stackTagCompound.getBoolean("on");
        int counter = par1ItemStack.stackTagCompound.getInteger("counter");
        int counter2 = par1ItemStack.stackTagCompound.getInteger("counter2");
        int i = par1ItemStack.stackTagCompound.getInteger("i");
        int j = par1ItemStack.stackTagCompound.getInteger("j");
        int k = par1ItemStack.stackTagCompound.getInteger("k");
        if (on) {
          ((EntityPlayer)Par3EntityPlayer).addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 0));
          ((EntityPlayer)Par3EntityPlayer).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 5));
          ((EntityPlayer)Par3EntityPlayer).addPotionEffect(new PotionEffect(Potion.jump.id, 5, -1));
          if (Par2World.isAirBlock(i + 2, j, k + 2))
            Par2World.setBlock(i + 2, j, k + 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 2, j, k + 1))
            Par2World.setBlock(i + 2, j, k + 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 2, j, k))
            Par2World.setBlock(i + 2, j, k, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 2, j, k - 1))
            Par2World.setBlock(i + 2, j, k - 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 2, j, k - 2))
            Par2World.setBlock(i + 2, j, k - 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 1, j, k + 2))
            Par2World.setBlock(i + 1, j, k + 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 1, j, k - 2))
            Par2World.setBlock(i + 1, j, k - 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i, j, k + 2))
            Par2World.setBlock(i, j, k + 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i, j, k - 2))
            Par2World.setBlock(i, j, k - 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 1, j, k + 2))
            Par2World.setBlock(i - 1, j, k + 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 1, j, k - 2))
            Par2World.setBlock(i - 1, j, k - 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 2, j, k + 2))
            Par2World.setBlock(i - 2, j, k + 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 2, j, k + 1))
            Par2World.setBlock(i - 2, j, k + 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 2, j, k))
            Par2World.setBlock(i - 2, j, k, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 2, j, k - 1))
            Par2World.setBlock(i - 2, j, k - 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 2, j, k - 2))
            Par2World.setBlock(i - 2, j, k - 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 2, j + 1, k + 2))
            Par2World.setBlock(i + 2, j + 1, k + 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 2, j + 1, k + 1))
            Par2World.setBlock(i + 2, j + 1, k + 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 2, j + 1, k))
            Par2World.setBlock(i + 2, j + 1, k, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 2, j + 1, k - 1))
            Par2World.setBlock(i + 2, j + 1, k - 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 2, j + 1, k - 2))
            Par2World.setBlock(i + 2, j + 1, k - 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 1, j + 1, k + 2))
            Par2World.setBlock(i + 1, j + 1, k + 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 1, j + 1, k - 2))
            Par2World.setBlock(i + 1, j + 1, k - 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i, j + 1, k + 2))
            Par2World.setBlock(i, j + 1, k + 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i, j + 1, k - 2))
            Par2World.setBlock(i, j + 1, k - 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 1, j + 1, k + 2))
            Par2World.setBlock(i - 1, j + 1, k + 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 1, j + 1, k - 2))
            Par2World.setBlock(i - 1, j + 1, k - 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 2, j + 1, k + 2))
            Par2World.setBlock(i - 2, j + 1, k + 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 2, j + 1, k + 1))
            Par2World.setBlock(i - 2, j + 1, k + 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 2, j + 1, k))
            Par2World.setBlock(i - 2, j + 1, k, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 2, j + 1, k - 1))
            Par2World.setBlock(i - 2, j + 1, k - 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 2, j + 1, k - 2))
            Par2World.setBlock(i - 2, j + 1, k - 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 2, j + 2, k + 2))
            Par2World.setBlock(i + 2, j + 2, k + 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 2, j + 2, k + 1))
            Par2World.setBlock(i + 2, j + 2, k + 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 2, j + 2, k))
            Par2World.setBlock(i + 2, j + 2, k, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 2, j + 2, k - 1))
            Par2World.setBlock(i + 2, j + 2, k - 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 2, j + 2, k - 2))
            Par2World.setBlock(i + 2, j + 2, k - 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 1, j + 2, k + 2))
            Par2World.setBlock(i + 1, j + 2, k + 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 1, j + 2, k - 2))
            Par2World.setBlock(i + 1, j + 2, k - 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i, j + 2, k + 2))
            Par2World.setBlock(i, j + 2, k + 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i, j + 2, k - 2))
            Par2World.setBlock(i, j + 2, k - 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 1, j + 2, k + 2))
            Par2World.setBlock(i - 1, j + 2, k + 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 1, j + 2, k - 2))
            Par2World.setBlock(i - 1, j + 2, k - 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 2, j + 2, k + 2))
            Par2World.setBlock(i - 2, j + 2, k + 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 2, j + 2, k + 1))
            Par2World.setBlock(i - 2, j + 2, k + 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 2, j + 2, k))
            Par2World.setBlock(i - 2, j + 2, k, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 2, j + 2, k - 1))
            Par2World.setBlock(i - 2, j + 2, k - 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 2, j + 2, k - 2))
            Par2World.setBlock(i - 2, j + 2, k - 2, Blocks.sandstone); 
          if (Par2World.isAirBlock(i, j - 1, k))
            Par2World.setBlock(i, j - 1, k, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 1, j - 1, k + 1))
            Par2World.setBlock(i + 1, j - 1, k + 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 1, j - 1, k))
            Par2World.setBlock(i + 1, j - 1, k, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 1, j - 1, k - 1))
            Par2World.setBlock(i + 1, j - 1, k - 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i, j - 1, k + 1))
            Par2World.setBlock(i, j - 1, k + 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i, j - 1, k - 1))
            Par2World.setBlock(i, j - 1, k - 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 1, j - 1, k + 1))
            Par2World.setBlock(i - 1, j - 1, k + 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 1, j - 1, k))
            Par2World.setBlock(i - 1, j - 1, k, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 1, j - 1, k - 1))
            Par2World.setBlock(i - 1, j - 1, k - 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i, j + 2, k))
            Par2World.setBlock(i, j + 2, k, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 1, j + 2, k + 1))
            Par2World.setBlock(i + 1, j + 2, k + 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 1, j + 2, k))
            Par2World.setBlock(i + 1, j + 2, k, Blocks.sandstone); 
          if (Par2World.isAirBlock(i + 1, j + 2, k - 1))
            Par2World.setBlock(i + 1, j + 2, k - 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i, j + 2, k + 1))
            Par2World.setBlock(i, j + 2, k + 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i, j + 2, k - 1))
            Par2World.setBlock(i, j + 2, k - 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 1, j + 2, k + 1))
            Par2World.setBlock(i - 1, j + 2, k + 1, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 1, j + 2, k))
            Par2World.setBlock(i - 1, j + 2, k, Blocks.sandstone); 
          if (Par2World.isAirBlock(i - 1, j + 2, k - 1))
            Par2World.setBlock(i - 1, j + 2, k - 1, Blocks.sandstone); 
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      if (Par1ItemStack.getItemDamage() == 0) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getEarthRelease() == 1 && props.getCurrentMana() >= 10 + props.getNinjutsu() / 600) {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Earth Release: Shield Of Sand!"));
          int k = Par1ItemStack.stackTagCompound.getInteger("i");
          int j = Par1ItemStack.stackTagCompound.getInteger("j");
          k = Par1ItemStack.stackTagCompound.getInteger("k");
          k = MathHelper.floor_double(Par3EntityPlayer.posX);
          j = MathHelper.floor_double(Par3EntityPlayer.posY);
          k = MathHelper.floor_double(Par3EntityPlayer.posZ);
          Par1ItemStack.stackTagCompound.setInteger("i", k);
          Par1ItemStack.stackTagCompound.setInteger("j", j);
          Par1ItemStack.stackTagCompound.setInteger("k", k);
          Par2World.setBlock(k + 2, j, k + 2, Blocks.sandstone);
          Par2World.setBlock(k + 2, j, k + 1, Blocks.sandstone);
          Par2World.setBlock(k + 2, j, k, Blocks.sandstone);
          Par2World.setBlock(k + 2, j, k - 1, Blocks.sandstone);
          Par2World.setBlock(k + 2, j, k - 2, Blocks.sandstone);
          Par2World.setBlock(k + 1, j, k + 2, Blocks.sandstone);
          Par2World.setBlock(k + 1, j, k - 2, Blocks.sandstone);
          Par2World.setBlock(k, j, k + 2, Blocks.sandstone);
          Par2World.setBlock(k, j, k - 2, Blocks.sandstone);
          Par2World.setBlock(k - 1, j, k + 2, Blocks.sandstone);
          Par2World.setBlock(k - 1, j, k - 2, Blocks.sandstone);
          Par2World.setBlock(k - 2, j, k + 2, Blocks.sandstone);
          Par2World.setBlock(k - 2, j, k + 1, Blocks.sandstone);
          Par2World.setBlock(k - 2, j, k, Blocks.sandstone);
          Par2World.setBlock(k - 2, j, k - 1, Blocks.sandstone);
          Par2World.setBlock(k - 2, j, k - 2, Blocks.sandstone);
          Par2World.setBlock(k + 2, j + 1, k + 2, Blocks.sandstone);
          Par2World.setBlock(k + 2, j + 1, k + 1, Blocks.sandstone);
          Par2World.setBlock(k + 2, j + 1, k, Blocks.sandstone);
          Par2World.setBlock(k + 2, j + 1, k - 1, Blocks.sandstone);
          Par2World.setBlock(k + 2, j + 1, k - 2, Blocks.sandstone);
          Par2World.setBlock(k + 1, j + 1, k + 2, Blocks.sandstone);
          Par2World.setBlock(k + 1, j + 1, k - 2, Blocks.sandstone);
          Par2World.setBlock(k, j + 1, k + 2, Blocks.sandstone);
          Par2World.setBlock(k, j + 1, k - 2, Blocks.sandstone);
          Par2World.setBlock(k - 1, j + 1, k + 2, Blocks.sandstone);
          Par2World.setBlock(k - 1, j + 1, k - 2, Blocks.sandstone);
          Par2World.setBlock(k - 2, j + 1, k + 2, Blocks.sandstone);
          Par2World.setBlock(k - 2, j + 1, k + 1, Blocks.sandstone);
          Par2World.setBlock(k - 2, j + 1, k, Blocks.sandstone);
          Par2World.setBlock(k - 2, j + 1, k - 1, Blocks.sandstone);
          Par2World.setBlock(k - 2, j + 1, k - 2, Blocks.sandstone);
          Par2World.setBlock(k + 2, j + 2, k + 2, Blocks.sandstone);
          Par2World.setBlock(k + 2, j + 2, k + 1, Blocks.sandstone);
          Par2World.setBlock(k + 2, j + 2, k, Blocks.sandstone);
          Par2World.setBlock(k + 2, j + 2, k - 1, Blocks.sandstone);
          Par2World.setBlock(k + 2, j + 2, k - 2, Blocks.sandstone);
          Par2World.setBlock(k + 1, j + 2, k + 2, Blocks.sandstone);
          Par2World.setBlock(k + 1, j + 2, k - 2, Blocks.sandstone);
          Par2World.setBlock(k, j + 2, k + 2, Blocks.sandstone);
          Par2World.setBlock(k, j + 2, k - 2, Blocks.sandstone);
          Par2World.setBlock(k - 1, j + 2, k + 2, Blocks.sandstone);
          Par2World.setBlock(k - 1, j + 2, k - 2, Blocks.sandstone);
          Par2World.setBlock(k - 2, j + 2, k + 2, Blocks.sandstone);
          Par2World.setBlock(k - 2, j + 2, k + 1, Blocks.sandstone);
          Par2World.setBlock(k - 2, j + 2, k, Blocks.sandstone);
          Par2World.setBlock(k - 2, j + 2, k - 1, Blocks.sandstone);
          Par2World.setBlock(k - 2, j + 2, k - 2, Blocks.sandstone);
          Par2World.setBlock(k, j + 2, k, Blocks.sandstone);
          Par2World.setBlock(k + 1, j + 2, k + 1, Blocks.sandstone);
          Par2World.setBlock(k + 1, j + 2, k, Blocks.sandstone);
          Par2World.setBlock(k + 1, j + 2, k - 1, Blocks.sandstone);
          Par2World.setBlock(k, j + 2, k + 1, Blocks.sandstone);
          Par2World.setBlock(k, j + 2, k - 1, Blocks.sandstone);
          Par2World.setBlock(k - 1, j + 2, k + 1, Blocks.sandstone);
          Par2World.setBlock(k - 1, j + 2, k, Blocks.sandstone);
          Par2World.setBlock(k - 1, j + 2, k - 1, Blocks.sandstone);
          Par1ItemStack.stackTagCompound.setBoolean("on", true);
          Par1ItemStack.setItemDamage(50);
          props.consumeMana(10 + props.getNinjutsu() / 600);
          return Par1ItemStack;
        } 
      } 
      if (Par1ItemStack.getItemDamage() == 50) {
        Par1ItemStack.stackTagCompound.setBoolean("on", false);
        int i = Par1ItemStack.stackTagCompound.getInteger("i");
        int j = Par1ItemStack.stackTagCompound.getInteger("j");
        int k = Par1ItemStack.stackTagCompound.getInteger("k");
        Par2World.setBlock(i + 2, j, k + 2, Blocks.air);
        Par2World.setBlock(i + 2, j, k + 1, Blocks.air);
        Par2World.setBlock(i + 2, j, k, Blocks.air);
        Par2World.setBlock(i + 2, j, k - 1, Blocks.air);
        Par2World.setBlock(i + 2, j, k - 2, Blocks.air);
        Par2World.setBlock(i + 1, j, k + 2, Blocks.air);
        Par2World.setBlock(i + 1, j, k - 2, Blocks.air);
        Par2World.setBlock(i, j, k + 2, Blocks.air);
        Par2World.setBlock(i, j, k - 2, Blocks.air);
        Par2World.setBlock(i - 1, j, k + 2, Blocks.air);
        Par2World.setBlock(i - 1, j, k - 2, Blocks.air);
        Par2World.setBlock(i - 2, j, k + 2, Blocks.air);
        Par2World.setBlock(i - 2, j, k + 1, Blocks.air);
        Par2World.setBlock(i - 2, j, k, Blocks.air);
        Par2World.setBlock(i - 2, j, k - 1, Blocks.air);
        Par2World.setBlock(i - 2, j, k - 2, Blocks.air);
        Par2World.setBlock(i + 2, j + 1, k + 2, Blocks.air);
        Par2World.setBlock(i + 2, j + 1, k + 1, Blocks.air);
        Par2World.setBlock(i + 2, j + 1, k, Blocks.air);
        Par2World.setBlock(i + 2, j + 1, k - 1, Blocks.air);
        Par2World.setBlock(i + 2, j + 1, k - 2, Blocks.air);
        Par2World.setBlock(i + 1, j + 1, k + 2, Blocks.air);
        Par2World.setBlock(i + 1, j + 1, k - 2, Blocks.air);
        Par2World.setBlock(i, j + 1, k + 2, Blocks.air);
        Par2World.setBlock(i, j + 1, k - 2, Blocks.air);
        Par2World.setBlock(i - 1, j + 1, k + 2, Blocks.air);
        Par2World.setBlock(i - 1, j + 1, k - 2, Blocks.air);
        Par2World.setBlock(i - 2, j + 1, k + 2, Blocks.air);
        Par2World.setBlock(i - 2, j + 1, k + 1, Blocks.air);
        Par2World.setBlock(i - 2, j + 1, k, Blocks.air);
        Par2World.setBlock(i - 2, j + 1, k - 1, Blocks.air);
        Par2World.setBlock(i - 2, j + 1, k - 2, Blocks.air);
        Par2World.setBlock(i + 2, j + 2, k + 2, Blocks.air);
        Par2World.setBlock(i + 2, j + 2, k + 1, Blocks.air);
        Par2World.setBlock(i + 2, j + 2, k, Blocks.air);
        Par2World.setBlock(i + 2, j + 2, k - 1, Blocks.air);
        Par2World.setBlock(i + 2, j + 2, k - 2, Blocks.air);
        Par2World.setBlock(i + 1, j + 2, k + 2, Blocks.air);
        Par2World.setBlock(i + 1, j + 2, k - 2, Blocks.air);
        Par2World.setBlock(i, j + 2, k + 2, Blocks.air);
        Par2World.setBlock(i, j + 2, k - 2, Blocks.air);
        Par2World.setBlock(i - 1, j + 2, k + 2, Blocks.air);
        Par2World.setBlock(i - 1, j + 2, k - 2, Blocks.air);
        Par2World.setBlock(i - 2, j + 2, k + 2, Blocks.air);
        Par2World.setBlock(i - 2, j + 2, k + 1, Blocks.air);
        Par2World.setBlock(i - 2, j + 2, k, Blocks.air);
        Par2World.setBlock(i - 2, j + 2, k - 1, Blocks.air);
        Par2World.setBlock(i - 2, j + 2, k - 2, Blocks.air);
        Par2World.setBlock(i, j + 2, k, Blocks.air);
        Par2World.setBlock(i + 1, j + 2, k + 1, Blocks.air);
        Par2World.setBlock(i + 1, j + 2, k, Blocks.air);
        Par2World.setBlock(i + 1, j + 2, k - 1, Blocks.air);
        Par2World.setBlock(i, j + 2, k + 1, Blocks.air);
        Par2World.setBlock(i, j + 2, k - 1, Blocks.air);
        Par2World.setBlock(i - 1, j + 2, k + 1, Blocks.air);
        Par2World.setBlock(i - 1, j + 2, k, Blocks.air);
        Par2World.setBlock(i - 1, j + 2, k - 1, Blocks.air);
        Par1ItemStack.setItemDamage(0);
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create a defensive regenerative barrier");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (10 + props.getNinjutsu() / 600));
  }
}

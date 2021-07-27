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
import net.minecraft.world.World;

public class IceReleaseDome extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public IceReleaseDome() {
    setMaxDamage(200);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World Par2World, Entity Par3EntityPlayer, int par4, boolean par5) {
    if (!Par2World.isRemote && (EntityPlayer)Par3EntityPlayer != null) {
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
      if (par1ItemStack.stackTagCompound != null) {
        boolean on = par1ItemStack.stackTagCompound.getBoolean("on");
        int counter = par1ItemStack.stackTagCompound.getInteger("counter");
        int counter2 = par1ItemStack.stackTagCompound.getInteger("counter2");
        int i = par1ItemStack.stackTagCompound.getInteger("i");
        int j = par1ItemStack.stackTagCompound.getInteger("j");
        int k = par1ItemStack.stackTagCompound.getInteger("k");
        if (on) {
          ((EntityPlayer)Par3EntityPlayer).addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 1));
          ((EntityPlayer)Par3EntityPlayer).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5, 30));
          if (Par2World.isAirBlock(i + 2, j, k + 2))
            Par2World.setBlock(i + 2, j, k + 2, Blocks.ice); 
          if (Par2World.isAirBlock(i + 2, j, k + 1))
            Par2World.setBlock(i + 2, j, k + 1, Blocks.ice); 
          if (Par2World.isAirBlock(i + 2, j, k))
            Par2World.setBlock(i + 2, j, k, Blocks.ice); 
          if (Par2World.isAirBlock(i + 2, j, k - 1))
            Par2World.setBlock(i + 2, j, k - 1, Blocks.ice); 
          if (Par2World.isAirBlock(i + 2, j, k - 2))
            Par2World.setBlock(i + 2, j, k - 2, Blocks.ice); 
          if (Par2World.isAirBlock(i + 1, j, k + 2))
            Par2World.setBlock(i + 1, j, k + 2, Blocks.ice); 
          if (Par2World.isAirBlock(i + 1, j, k - 2))
            Par2World.setBlock(i + 1, j, k - 2, Blocks.ice); 
          if (Par2World.isAirBlock(i, j, k + 2))
            Par2World.setBlock(i, j, k + 2, Blocks.ice); 
          if (Par2World.isAirBlock(i, j, k - 2))
            Par2World.setBlock(i, j, k - 2, Blocks.ice); 
          if (Par2World.isAirBlock(i - 1, j, k + 2))
            Par2World.setBlock(i - 1, j, k + 2, Blocks.ice); 
          if (Par2World.isAirBlock(i - 1, j, k - 2))
            Par2World.setBlock(i - 1, j, k - 2, Blocks.ice); 
          if (Par2World.isAirBlock(i - 2, j, k + 2))
            Par2World.setBlock(i - 2, j, k + 2, Blocks.ice); 
          if (Par2World.isAirBlock(i - 2, j, k + 1))
            Par2World.setBlock(i - 2, j, k + 1, Blocks.ice); 
          if (Par2World.isAirBlock(i - 2, j, k))
            Par2World.setBlock(i - 2, j, k, Blocks.ice); 
          if (Par2World.isAirBlock(i - 2, j, k - 1))
            Par2World.setBlock(i - 2, j, k - 1, Blocks.ice); 
          if (Par2World.isAirBlock(i - 2, j, k - 2))
            Par2World.setBlock(i - 2, j, k - 2, Blocks.ice); 
          if (Par2World.isAirBlock(i + 2, j + 1, k + 2))
            Par2World.setBlock(i + 2, j + 1, k + 2, Blocks.ice); 
          if (Par2World.isAirBlock(i + 2, j + 1, k + 1))
            Par2World.setBlock(i + 2, j + 1, k + 1, Blocks.ice); 
          if (Par2World.isAirBlock(i + 2, j + 1, k))
            Par2World.setBlock(i + 2, j + 1, k, Blocks.ice); 
          if (Par2World.isAirBlock(i + 2, j + 1, k - 1))
            Par2World.setBlock(i + 2, j + 1, k - 1, Blocks.ice); 
          if (Par2World.isAirBlock(i + 2, j + 1, k - 2))
            Par2World.setBlock(i + 2, j + 1, k - 2, Blocks.ice); 
          if (Par2World.isAirBlock(i + 1, j + 1, k + 2))
            Par2World.setBlock(i + 1, j + 1, k + 2, Blocks.ice); 
          if (Par2World.isAirBlock(i + 1, j + 1, k - 2))
            Par2World.setBlock(i + 1, j + 1, k - 2, Blocks.ice); 
          if (Par2World.isAirBlock(i, j + 1, k + 2))
            Par2World.setBlock(i, j + 1, k + 2, Blocks.ice); 
          if (Par2World.isAirBlock(i, j + 1, k - 2))
            Par2World.setBlock(i, j + 1, k - 2, Blocks.ice); 
          if (Par2World.isAirBlock(i - 1, j + 1, k + 2))
            Par2World.setBlock(i - 1, j + 1, k + 2, Blocks.ice); 
          if (Par2World.isAirBlock(i - 1, j + 1, k - 2))
            Par2World.setBlock(i - 1, j + 1, k - 2, Blocks.ice); 
          if (Par2World.isAirBlock(i - 2, j + 1, k + 2))
            Par2World.setBlock(i - 2, j + 1, k + 2, Blocks.ice); 
          if (Par2World.isAirBlock(i - 2, j + 1, k + 1))
            Par2World.setBlock(i - 2, j + 1, k + 1, Blocks.ice); 
          if (Par2World.isAirBlock(i - 2, j + 1, k))
            Par2World.setBlock(i - 2, j + 1, k, Blocks.ice); 
          if (Par2World.isAirBlock(i - 2, j + 1, k - 1))
            Par2World.setBlock(i - 2, j + 1, k - 1, Blocks.ice); 
          if (Par2World.isAirBlock(i - 2, j + 1, k - 2))
            Par2World.setBlock(i - 2, j + 1, k - 2, Blocks.ice); 
          if (Par2World.isAirBlock(i + 2, j + 2, k + 2))
            Par2World.setBlock(i + 2, j + 2, k + 2, Blocks.ice); 
          if (Par2World.isAirBlock(i + 2, j + 2, k + 1))
            Par2World.setBlock(i + 2, j + 2, k + 1, Blocks.ice); 
          if (Par2World.isAirBlock(i + 2, j + 2, k))
            Par2World.setBlock(i + 2, j + 2, k, Blocks.ice); 
          if (Par2World.isAirBlock(i + 2, j + 2, k - 1))
            Par2World.setBlock(i + 2, j + 2, k - 1, Blocks.ice); 
          if (Par2World.isAirBlock(i + 2, j + 2, k - 2))
            Par2World.setBlock(i + 2, j + 2, k - 2, Blocks.ice); 
          if (Par2World.isAirBlock(i + 1, j + 2, k + 2))
            Par2World.setBlock(i + 1, j + 2, k + 2, Blocks.ice); 
          if (Par2World.isAirBlock(i + 1, j + 2, k - 2))
            Par2World.setBlock(i + 1, j + 2, k - 2, Blocks.ice); 
          if (Par2World.isAirBlock(i, j + 2, k + 2))
            Par2World.setBlock(i, j + 2, k + 2, Blocks.ice); 
          if (Par2World.isAirBlock(i, j + 2, k - 2))
            Par2World.setBlock(i, j + 2, k - 2, Blocks.ice); 
          if (Par2World.isAirBlock(i - 1, j + 2, k + 2))
            Par2World.setBlock(i - 1, j + 2, k + 2, Blocks.ice); 
          if (Par2World.isAirBlock(i - 1, j + 2, k - 2))
            Par2World.setBlock(i - 1, j + 2, k - 2, Blocks.ice); 
          if (Par2World.isAirBlock(i - 2, j + 2, k + 2))
            Par2World.setBlock(i - 2, j + 2, k + 2, Blocks.ice); 
          if (Par2World.isAirBlock(i - 2, j + 2, k + 1))
            Par2World.setBlock(i - 2, j + 2, k + 1, Blocks.ice); 
          if (Par2World.isAirBlock(i - 2, j + 2, k))
            Par2World.setBlock(i - 2, j + 2, k, Blocks.ice); 
          if (Par2World.isAirBlock(i - 2, j + 2, k - 1))
            Par2World.setBlock(i - 2, j + 2, k - 1, Blocks.ice); 
          if (Par2World.isAirBlock(i - 2, j + 2, k - 2))
            Par2World.setBlock(i - 2, j + 2, k - 2, Blocks.ice); 
          if (Par2World.isAirBlock(i, j + 2, k))
            Par2World.setBlock(i, j + 2, k, Blocks.ice); 
          if (Par2World.isAirBlock(i + 1, j + 2, k + 1))
            Par2World.setBlock(i + 1, j + 2, k + 1, Blocks.ice); 
          if (Par2World.isAirBlock(i + 1, j + 2, k))
            Par2World.setBlock(i + 1, j + 2, k, Blocks.ice); 
          if (Par2World.isAirBlock(i + 1, j + 2, k - 1))
            Par2World.setBlock(i + 1, j + 2, k - 1, Blocks.ice); 
          if (Par2World.isAirBlock(i, j + 2, k + 1))
            Par2World.setBlock(i, j + 2, k + 1, Blocks.ice); 
          if (Par2World.isAirBlock(i, j + 2, k - 1))
            Par2World.setBlock(i, j + 2, k - 1, Blocks.ice); 
          if (Par2World.isAirBlock(i - 1, j + 2, k + 1))
            Par2World.setBlock(i - 1, j + 2, k + 1, Blocks.ice); 
          if (Par2World.isAirBlock(i - 1, j + 2, k))
            Par2World.setBlock(i - 1, j + 2, k, Blocks.ice); 
          if (Par2World.isAirBlock(i - 1, j + 2, k - 1))
            Par2World.setBlock(i - 1, j + 2, k - 1, Blocks.ice); 
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 10 + props.getNinjutsu() / 600) {
        if (Par1ItemStack.getItemDamage() == 0) {
          int i = (int)Par3EntityPlayer.posX - 1;
          int j = (int)Par3EntityPlayer.posY;
          int k = (int)Par3EntityPlayer.posZ;
          Par1ItemStack.stackTagCompound.setInteger("i", (int)Par3EntityPlayer.posX - 1);
          Par1ItemStack.stackTagCompound.setInteger("j", (int)Par3EntityPlayer.posY);
          Par1ItemStack.stackTagCompound.setInteger("k", (int)Par3EntityPlayer.posZ);
          if (Par2World.getBlock(i + 2, j, k + 2) == Blocks.air)
            Par2World.setBlock(i + 2, j, k + 2, Blocks.ice); 
          if (Par2World.getBlock(i + 2, j, k + 1) == Blocks.air)
            Par2World.setBlock(i + 2, j, k + 1, Blocks.ice); 
          if (Par2World.getBlock(i + 2, j, k) == Blocks.air)
            Par2World.setBlock(i + 2, j, k, Blocks.ice); 
          if (Par2World.getBlock(i + 2, j, k - 1) == Blocks.air)
            Par2World.setBlock(i + 2, j, k - 1, Blocks.ice); 
          if (Par2World.getBlock(i + 2, j, k - 2) == Blocks.air)
            Par2World.setBlock(i + 2, j, k - 2, Blocks.ice); 
          if (Par2World.getBlock(i + 1, j, k + 2) == Blocks.air)
            Par2World.setBlock(i + 1, j, k + 2, Blocks.ice); 
          if (Par2World.getBlock(i + 1, j, k - 2) == Blocks.air)
            Par2World.setBlock(i + 1, j, k - 2, Blocks.ice); 
          if (Par2World.getBlock(i, j, k + 2) == Blocks.air)
            Par2World.setBlock(i, j, k + 2, Blocks.ice); 
          if (Par2World.getBlock(i, j, k - 2) == Blocks.air)
            Par2World.setBlock(i, j, k - 2, Blocks.ice); 
          if (Par2World.getBlock(i - 1, j, k + 2) == Blocks.air)
            Par2World.setBlock(i - 1, j, k + 2, Blocks.ice); 
          if (Par2World.getBlock(i - 1, j, k - 2) == Blocks.air)
            Par2World.setBlock(i - 1, j, k - 2, Blocks.ice); 
          if (Par2World.getBlock(i - 2, j, k + 2) == Blocks.air)
            Par2World.setBlock(i - 2, j, k + 2, Blocks.ice); 
          if (Par2World.getBlock(i - 2, j, k + 1) == Blocks.air)
            Par2World.setBlock(i - 2, j, k + 1, Blocks.ice); 
          if (Par2World.getBlock(i - 2, j, k) == Blocks.air)
            Par2World.setBlock(i - 2, j, k, Blocks.ice); 
          if (Par2World.getBlock(i - 2, j, k - 1) == Blocks.air)
            Par2World.setBlock(i - 2, j, k - 1, Blocks.ice); 
          if (Par2World.getBlock(i - 2, j, k - 2) == Blocks.air)
            Par2World.setBlock(i - 2, j, k - 2, Blocks.ice); 
          if (Par2World.getBlock(i + 2, j + 1, k + 2) == Blocks.air)
            Par2World.setBlock(i + 2, j + 1, k + 2, Blocks.ice); 
          if (Par2World.getBlock(i + 2, j + 1, k + 1) == Blocks.air)
            Par2World.setBlock(i + 2, j + 1, k + 1, Blocks.ice); 
          if (Par2World.getBlock(i + 2, j + 1, k) == Blocks.air)
            Par2World.setBlock(i + 2, j + 1, k, Blocks.ice); 
          if (Par2World.getBlock(i + 2, j + 1, k - 1) == Blocks.air)
            Par2World.setBlock(i + 2, j + 1, k - 1, Blocks.ice); 
          if (Par2World.getBlock(i + 2, j + 1, k - 2) == Blocks.air)
            Par2World.setBlock(i + 2, j + 1, k - 2, Blocks.ice); 
          if (Par2World.getBlock(i + 1, j + 1, k + 2) == Blocks.air)
            Par2World.setBlock(i + 1, j + 1, k + 2, Blocks.ice); 
          if (Par2World.getBlock(i + 1, j + 1, k - 2) == Blocks.air)
            Par2World.setBlock(i + 1, j + 1, k - 2, Blocks.ice); 
          if (Par2World.getBlock(i, j + 1, k + 2) == Blocks.air)
            Par2World.setBlock(i, j + 1, k + 2, Blocks.ice); 
          if (Par2World.getBlock(i, j + 1, k - 2) == Blocks.air)
            Par2World.setBlock(i, j + 1, k - 2, Blocks.ice); 
          if (Par2World.getBlock(i - 1, j + 1, k + 2) == Blocks.air)
            Par2World.setBlock(i - 1, j + 1, k + 2, Blocks.ice); 
          if (Par2World.getBlock(i - 1, j + 1, k - 2) == Blocks.air)
            Par2World.setBlock(i - 1, j + 1, k - 2, Blocks.ice); 
          if (Par2World.getBlock(i - 2, j + 1, k + 2) == Blocks.air)
            Par2World.setBlock(i - 2, j + 1, k + 2, Blocks.ice); 
          if (Par2World.getBlock(i - 2, j + 1, k + 1) == Blocks.air)
            Par2World.setBlock(i - 2, j + 1, k + 1, Blocks.ice); 
          if (Par2World.getBlock(i - 2, j + 1, k) == Blocks.air)
            Par2World.setBlock(i - 2, j + 1, k, Blocks.ice); 
          if (Par2World.getBlock(i - 2, j + 1, k - 1) == Blocks.air)
            Par2World.setBlock(i - 2, j + 1, k - 1, Blocks.ice); 
          if (Par2World.getBlock(i - 2, j + 1, k - 2) == Blocks.air)
            Par2World.setBlock(i - 2, j + 1, k - 2, Blocks.ice); 
          if (Par2World.getBlock(i + 2, j + 2, k + 2) == Blocks.air)
            Par2World.setBlock(i + 2, j + 2, k + 2, Blocks.ice); 
          if (Par2World.getBlock(i + 2, j + 2, k + 1) == Blocks.air)
            Par2World.setBlock(i + 2, j + 2, k + 1, Blocks.ice); 
          if (Par2World.getBlock(i + 2, j + 2, k) == Blocks.air)
            Par2World.setBlock(i + 2, j + 2, k, Blocks.ice); 
          if (Par2World.getBlock(i + 2, j + 2, k - 1) == Blocks.air)
            Par2World.setBlock(i + 2, j + 2, k - 1, Blocks.ice); 
          if (Par2World.getBlock(i + 2, j + 2, k - 2) == Blocks.air)
            Par2World.setBlock(i + 2, j + 2, k - 2, Blocks.ice); 
          if (Par2World.getBlock(i + 1, j + 2, k + 2) == Blocks.air)
            Par2World.setBlock(i + 1, j + 2, k + 2, Blocks.ice); 
          if (Par2World.getBlock(i + 1, j + 2, k - 2) == Blocks.air)
            Par2World.setBlock(i + 1, j + 2, k - 2, Blocks.ice); 
          if (Par2World.getBlock(i, j + 2, k + 2) == Blocks.air)
            Par2World.setBlock(i, j + 2, k + 2, Blocks.ice); 
          if (Par2World.getBlock(i, j + 2, k - 2) == Blocks.air)
            Par2World.setBlock(i, j + 2, k - 2, Blocks.ice); 
          if (Par2World.getBlock(i - 1, j + 2, k + 2) == Blocks.air)
            Par2World.setBlock(i - 1, j + 2, k + 2, Blocks.ice); 
          if (Par2World.getBlock(i - 1, j + 2, k - 2) == Blocks.air)
            Par2World.setBlock(i - 1, j + 2, k - 2, Blocks.ice); 
          if (Par2World.getBlock(i - 2, j + 2, k + 2) == Blocks.air)
            Par2World.setBlock(i - 2, j + 2, k + 2, Blocks.ice); 
          if (Par2World.getBlock(i - 2, j + 2, k + 1) == Blocks.air)
            Par2World.setBlock(i - 2, j + 2, k + 1, Blocks.ice); 
          if (Par2World.getBlock(i - 2, j + 2, k) == Blocks.air)
            Par2World.setBlock(i - 2, j + 2, k, Blocks.ice); 
          if (Par2World.getBlock(i - 2, j + 2, k - 1) == Blocks.air)
            Par2World.setBlock(i - 2, j + 2, k - 1, Blocks.ice); 
          if (Par2World.getBlock(i - 2, j + 2, k - 2) == Blocks.air)
            Par2World.setBlock(i - 2, j + 2, k - 2, Blocks.ice); 
          if (Par2World.getBlock(i, j + 2, k) == Blocks.air)
            Par2World.setBlock(i, j + 2, k, Blocks.ice); 
          if (Par2World.getBlock(i + 1, j + 2, k + 1) == Blocks.air)
            Par2World.setBlock(i + 1, j + 2, k + 1, Blocks.ice); 
          if (Par2World.getBlock(i + 1, j + 2, k) == Blocks.air)
            Par2World.setBlock(i + 1, j + 2, k, Blocks.ice); 
          if (Par2World.getBlock(i + 1, j + 2, k - 1) == Blocks.air)
            Par2World.setBlock(i + 1, j + 2, k - 1, Blocks.ice); 
          if (Par2World.getBlock(i, j + 2, k + 1) == Blocks.air)
            Par2World.setBlock(i, j + 2, k + 1, Blocks.ice); 
          if (Par2World.getBlock(i, j + 2, k - 1) == Blocks.air)
            Par2World.setBlock(i, j + 2, k - 1, Blocks.ice); 
          if (Par2World.getBlock(i - 1, j + 2, k + 1) == Blocks.air)
            Par2World.setBlock(i - 1, j + 2, k + 1, Blocks.ice); 
          if (Par2World.getBlock(i - 1, j + 2, k) == Blocks.air)
            Par2World.setBlock(i - 1, j + 2, k, Blocks.ice); 
          if (Par2World.getBlock(i - 1, j + 2, k - 1) == Blocks.air)
            Par2World.setBlock(i - 1, j + 2, k - 1, Blocks.ice); 
          Par1ItemStack.stackTagCompound.setBoolean("on", true);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ice Release: ice rock dome of magnificent nothingness!"));
          props.consumeMana(10);
          Par1ItemStack.setItemDamage(50);
          return Par1ItemStack;
        } 
        if (Par1ItemStack.getItemDamage() == 50) {
          int i = Par1ItemStack.stackTagCompound.getInteger("i");
          int j = Par1ItemStack.stackTagCompound.getInteger("j");
          int k = Par1ItemStack.stackTagCompound.getInteger("k");
          if (Par2World.getBlock(i + 2, j, k + 2) == Blocks.ice)
            Par2World.setBlock(i + 2, j, k + 2, Blocks.air); 
          if (Par2World.getBlock(i + 2, j, k + 1) == Blocks.ice)
            Par2World.setBlock(i + 2, j, k + 1, Blocks.air); 
          if (Par2World.getBlock(i + 2, j, k) == Blocks.ice)
            Par2World.setBlock(i + 2, j, k, Blocks.air); 
          if (Par2World.getBlock(i + 2, j, k - 1) == Blocks.ice)
            Par2World.setBlock(i + 2, j, k - 1, Blocks.air); 
          if (Par2World.getBlock(i + 2, j, k - 2) == Blocks.ice)
            Par2World.setBlock(i + 2, j, k - 2, Blocks.air); 
          if (Par2World.getBlock(i + 1, j, k + 2) == Blocks.ice)
            Par2World.setBlock(i + 1, j, k + 2, Blocks.air); 
          if (Par2World.getBlock(i + 1, j, k - 2) == Blocks.ice)
            Par2World.setBlock(i + 1, j, k - 2, Blocks.air); 
          if (Par2World.getBlock(i, j, k + 2) == Blocks.ice)
            Par2World.setBlock(i, j, k + 2, Blocks.air); 
          if (Par2World.getBlock(i, j, k - 2) == Blocks.ice)
            Par2World.setBlock(i, j, k - 2, Blocks.air); 
          if (Par2World.getBlock(i - 1, j, k + 2) == Blocks.ice)
            Par2World.setBlock(i - 1, j, k + 2, Blocks.air); 
          if (Par2World.getBlock(i - 1, j, k - 2) == Blocks.ice)
            Par2World.setBlock(i - 1, j, k - 2, Blocks.air); 
          if (Par2World.getBlock(i - 2, j, k + 2) == Blocks.ice)
            Par2World.setBlock(i - 2, j, k + 2, Blocks.air); 
          if (Par2World.getBlock(i - 2, j, k + 1) == Blocks.ice)
            Par2World.setBlock(i - 2, j, k + 1, Blocks.air); 
          if (Par2World.getBlock(i - 2, j, k) == Blocks.ice)
            Par2World.setBlock(i - 2, j, k, Blocks.air); 
          if (Par2World.getBlock(i - 2, j, k - 1) == Blocks.ice)
            Par2World.setBlock(i - 2, j, k - 1, Blocks.air); 
          if (Par2World.getBlock(i - 2, j, k - 2) == Blocks.ice)
            Par2World.setBlock(i - 2, j, k - 2, Blocks.air); 
          if (Par2World.getBlock(i + 2, j + 1, k + 2) == Blocks.ice)
            Par2World.setBlock(i + 2, j + 1, k + 2, Blocks.air); 
          if (Par2World.getBlock(i + 2, j + 1, k + 1) == Blocks.ice)
            Par2World.setBlock(i + 2, j + 1, k + 1, Blocks.air); 
          if (Par2World.getBlock(i + 2, j + 1, k) == Blocks.ice)
            Par2World.setBlock(i + 2, j + 1, k, Blocks.air); 
          if (Par2World.getBlock(i + 2, j + 1, k - 1) == Blocks.ice)
            Par2World.setBlock(i + 2, j + 1, k - 1, Blocks.air); 
          if (Par2World.getBlock(i + 2, j + 1, k - 2) == Blocks.ice)
            Par2World.setBlock(i + 2, j + 1, k - 2, Blocks.air); 
          if (Par2World.getBlock(i + 1, j + 1, k + 2) == Blocks.ice)
            Par2World.setBlock(i + 1, j + 1, k + 2, Blocks.air); 
          if (Par2World.getBlock(i + 1, j + 1, k - 2) == Blocks.ice)
            Par2World.setBlock(i + 1, j + 1, k - 2, Blocks.air); 
          if (Par2World.getBlock(i, j + 1, k + 2) == Blocks.ice)
            Par2World.setBlock(i, j + 1, k + 2, Blocks.air); 
          if (Par2World.getBlock(i, j + 1, k - 2) == Blocks.ice)
            Par2World.setBlock(i, j + 1, k - 2, Blocks.air); 
          if (Par2World.getBlock(i - 1, j + 1, k + 2) == Blocks.ice)
            Par2World.setBlock(i - 1, j + 1, k + 2, Blocks.air); 
          if (Par2World.getBlock(i - 1, j + 1, k - 2) == Blocks.ice)
            Par2World.setBlock(i - 1, j + 1, k - 2, Blocks.air); 
          if (Par2World.getBlock(i - 2, j + 1, k + 2) == Blocks.ice)
            Par2World.setBlock(i - 2, j + 1, k + 2, Blocks.air); 
          if (Par2World.getBlock(i - 2, j + 1, k + 1) == Blocks.ice)
            Par2World.setBlock(i - 2, j + 1, k + 1, Blocks.air); 
          if (Par2World.getBlock(i - 2, j + 1, k) == Blocks.ice)
            Par2World.setBlock(i - 2, j + 1, k, Blocks.air); 
          if (Par2World.getBlock(i - 2, j + 1, k - 1) == Blocks.ice)
            Par2World.setBlock(i - 2, j + 1, k - 1, Blocks.air); 
          if (Par2World.getBlock(i - 2, j + 1, k - 2) == Blocks.ice)
            Par2World.setBlock(i - 2, j + 1, k - 2, Blocks.air); 
          if (Par2World.getBlock(i + 2, j + 2, k + 2) == Blocks.ice)
            Par2World.setBlock(i + 2, j + 2, k + 2, Blocks.air); 
          if (Par2World.getBlock(i + 2, j + 2, k + 1) == Blocks.ice)
            Par2World.setBlock(i + 2, j + 2, k + 1, Blocks.air); 
          if (Par2World.getBlock(i + 2, j + 2, k) == Blocks.ice)
            Par2World.setBlock(i + 2, j + 2, k, Blocks.air); 
          if (Par2World.getBlock(i + 2, j + 2, k - 1) == Blocks.ice)
            Par2World.setBlock(i + 2, j + 2, k - 1, Blocks.air); 
          if (Par2World.getBlock(i + 2, j + 2, k - 2) == Blocks.ice)
            Par2World.setBlock(i + 2, j + 2, k - 2, Blocks.air); 
          if (Par2World.getBlock(i + 1, j + 2, k + 2) == Blocks.ice)
            Par2World.setBlock(i + 1, j + 2, k + 2, Blocks.air); 
          if (Par2World.getBlock(i + 1, j + 2, k - 2) == Blocks.ice)
            Par2World.setBlock(i + 1, j + 2, k - 2, Blocks.air); 
          if (Par2World.getBlock(i, j + 2, k + 2) == Blocks.ice)
            Par2World.setBlock(i, j + 2, k + 2, Blocks.air); 
          if (Par2World.getBlock(i, j + 2, k - 2) == Blocks.ice)
            Par2World.setBlock(i, j + 2, k - 2, Blocks.air); 
          if (Par2World.getBlock(i - 1, j + 2, k + 2) == Blocks.ice)
            Par2World.setBlock(i - 1, j + 2, k + 2, Blocks.air); 
          if (Par2World.getBlock(i - 1, j + 2, k - 2) == Blocks.ice)
            Par2World.setBlock(i - 1, j + 2, k - 2, Blocks.air); 
          if (Par2World.getBlock(i - 2, j + 2, k + 2) == Blocks.ice)
            Par2World.setBlock(i - 2, j + 2, k + 2, Blocks.air); 
          if (Par2World.getBlock(i - 2, j + 2, k + 1) == Blocks.ice)
            Par2World.setBlock(i - 2, j + 2, k + 1, Blocks.air); 
          if (Par2World.getBlock(i - 2, j + 2, k) == Blocks.ice)
            Par2World.setBlock(i - 2, j + 2, k, Blocks.air); 
          if (Par2World.getBlock(i - 2, j + 2, k - 1) == Blocks.ice)
            Par2World.setBlock(i - 2, j + 2, k - 1, Blocks.air); 
          if (Par2World.getBlock(i - 2, j + 2, k - 2) == Blocks.ice)
            Par2World.setBlock(i - 2, j + 2, k - 2, Blocks.air); 
          if (Par2World.getBlock(i, j + 2, k) == Blocks.ice)
            Par2World.setBlock(i, j + 2, k, Blocks.air); 
          if (Par2World.getBlock(i + 1, j + 2, k + 1) == Blocks.ice)
            Par2World.setBlock(i + 1, j + 2, k + 1, Blocks.air); 
          if (Par2World.getBlock(i + 1, j + 2, k) == Blocks.ice)
            Par2World.setBlock(i + 1, j + 2, k, Blocks.air); 
          if (Par2World.getBlock(i + 1, j + 2, k - 1) == Blocks.ice)
            Par2World.setBlock(i + 1, j + 2, k - 1, Blocks.air); 
          if (Par2World.getBlock(i, j + 2, k + 1) == Blocks.ice)
            Par2World.setBlock(i, j + 2, k + 1, Blocks.air); 
          if (Par2World.getBlock(i, j + 2, k - 1) == Blocks.ice)
            Par2World.setBlock(i, j + 2, k - 1, Blocks.air); 
          if (Par2World.getBlock(i - 1, j + 2, k + 1) == Blocks.ice)
            Par2World.setBlock(i - 1, j + 2, k + 1, Blocks.air); 
          if (Par2World.getBlock(i - 1, j + 2, k) == Blocks.ice)
            Par2World.setBlock(i - 1, j + 2, k, Blocks.air); 
          if (Par2World.getBlock(i - 1, j + 2, k - 1) == Blocks.ice)
            Par2World.setBlock(i - 1, j + 2, k - 1, Blocks.air); 
          Par1ItemStack.stackTagCompound.setBoolean("on", false);
          Par1ItemStack.setItemDamage(0);
        } 
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null) {
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner"));
      par3List.add(EnumChatFormatting.AQUA + "Counter: " + par1ItemStack.stackTagCompound.getInteger("counter"));
    } 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create an ice dome for protection");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 10");
  }
}

package alcoholmod.Mathioks.Final.ClanJutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import alcoholmod.Mathioks.block.Blockss;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class NaraClanBlackSpiderLily extends JutsuItem {
  public NaraClanBlackSpiderLily() {
    setMaxDamage(602);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setBoolean("startCounter", false);
      par1ItemStack.stackTagCompound.setBoolean("start", false);
      par1ItemStack.stackTagCompound.setBoolean("remove", false);
      par1ItemStack.stackTagCompound.setBoolean("Summoned", false);
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setInteger("counter2", 0);
      par1ItemStack.stackTagCompound.setInteger("useCounter", 0);
      par1ItemStack.stackTagCompound.setInteger("i", 0);
      par1ItemStack.stackTagCompound.setInteger("j", 0);
      par1ItemStack.stackTagCompound.setInteger("k", 0);
      par1ItemStack.stackTagCompound.setInteger("ChakraCounter", 0);
    } 
    EntityPlayer player = (EntityPlayer)par3Entity;
    ExtendedPlayer props = ExtendedPlayer.get(player);
    if (par1ItemStack.getItemDamage() == 600) {
      int ChakraCounter = par1ItemStack.stackTagCompound.getInteger("ChakraCounter");
      if (!((EntityPlayer)par3Entity).isPotionActive(Potion.moveSlowdown.id))
        ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 15, 50)); 
      if (!((EntityPlayer)par3Entity).isPotionActive(Potion.jump.id))
        ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.jump.id, 15, -10)); 
      ChakraCounter++;
      par1ItemStack.stackTagCompound.setInteger("ChakraCounter", ChakraCounter);
      if (ChakraCounter >= 20) {
        par1ItemStack.stackTagCompound.setInteger("ChakraCounter", 0);
        props.consumeMana(4);
      } 
    } 
    boolean startCounter = par1ItemStack.stackTagCompound.getBoolean("startCounter");
    boolean start = par1ItemStack.stackTagCompound.getBoolean("start");
    boolean remove = par1ItemStack.stackTagCompound.getBoolean("remove");
    boolean Summoned = par1ItemStack.stackTagCompound.getBoolean("Summoned");
    int counter = par1ItemStack.stackTagCompound.getInteger("counter");
    int counter2 = par1ItemStack.stackTagCompound.getInteger("counter2");
    int useCounter = par1ItemStack.stackTagCompound.getInteger("useCounter");
    int i = par1ItemStack.stackTagCompound.getInteger("i");
    int j = par1ItemStack.stackTagCompound.getInteger("j");
    int k = par1ItemStack.stackTagCompound.getInteger("k");
    if (useCounter >= 1) {
      useCounter--;
      par1ItemStack.stackTagCompound.setInteger("useCounter", useCounter);
    } 
    if (props.getCurrentMana() == 0) {
      par1ItemStack.stackTagCompound.setBoolean("remove", true);
      par1ItemStack.setItemDamage(0);
      par1ItemStack.stackTagCompound.setInteger("useCounter", 20);
    } 
    if (start && !par2World.isRemote) {
      counter++;
      par1ItemStack.stackTagCompound.setInteger("counter", counter);
      if (counter == 10 && par2World.isAirBlock(i, j, k))
        par2World.setBlock(i, j, k, (Block)Blockss.naraShadowBlock); 
      if (counter == 12) {
        if (par2World.isAirBlock(i + 1, j, k))
          par2World.setBlock(i + 1, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 1, j, k))
          par2World.setBlock(i - 1, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k - 1))
          par2World.setBlock(i, j, k - 1, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k + 1))
          par2World.setBlock(i, j, k + 1, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 1, j, k + 1))
          par2World.setBlock(i + 1, j, k + 1, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 1, j, k + 1))
          par2World.setBlock(i - 1, j, k + 1, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 1, j, k - 1))
          par2World.setBlock(i + 1, j, k - 1, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 1, j, k - 1))
          par2World.setBlock(i - 1, j, k - 1, (Block)Blockss.naraShadowBlock); 
      } 
      if (counter == 14) {
        if (par2World.isAirBlock(i + 2, j, k))
          par2World.setBlock(i + 2, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 2, j, k))
          par2World.setBlock(i - 2, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k - 2))
          par2World.setBlock(i, j, k - 2, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k + 2))
          par2World.setBlock(i, j, k + 2, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 2, j, k + 2))
          par2World.setBlock(i + 2, j, k + 2, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 2, j, k + 2))
          par2World.setBlock(i - 2, j, k + 2, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 2, j, k - 2))
          par2World.setBlock(i + 2, j, k - 2, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 2, j, k - 2))
          par2World.setBlock(i - 2, j, k - 2, (Block)Blockss.naraShadowBlock); 
      } 
      if (counter == 16) {
        if (par2World.isAirBlock(i + 3, j, k))
          par2World.setBlock(i + 3, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 3, j, k))
          par2World.setBlock(i - 3, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k - 3))
          par2World.setBlock(i, j, k - 3, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k + 3))
          par2World.setBlock(i, j, k + 3, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 3, j, k + 3))
          par2World.setBlock(i + 3, j, k + 3, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 3, j, k + 3))
          par2World.setBlock(i - 3, j, k + 3, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 3, j, k - 3))
          par2World.setBlock(i + 3, j, k - 3, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 3, j, k - 3))
          par2World.setBlock(i - 3, j, k - 3, (Block)Blockss.naraShadowBlock); 
      } 
      if (counter == 18) {
        if (par2World.isAirBlock(i + 4, j, k))
          par2World.setBlock(i + 4, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 4, j, k))
          par2World.setBlock(i - 4, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k - 4))
          par2World.setBlock(i, j, k - 4, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k + 4))
          par2World.setBlock(i, j, k + 4, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 4, j, k + 4))
          par2World.setBlock(i + 4, j, k + 4, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 4, j, k + 4))
          par2World.setBlock(i - 4, j, k + 4, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 4, j, k - 4))
          par2World.setBlock(i + 4, j, k - 4, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 4, j, k - 4))
          par2World.setBlock(i - 4, j, k - 4, (Block)Blockss.naraShadowBlock); 
      } 
      if (counter == 20) {
        if (par2World.isAirBlock(i + 5, j, k))
          par2World.setBlock(i + 5, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 5, j, k))
          par2World.setBlock(i - 5, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k - 5))
          par2World.setBlock(i, j, k - 5, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k + 5))
          par2World.setBlock(i, j, k + 5, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 5, j, k + 5))
          par2World.setBlock(i + 5, j, k + 5, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 5, j, k + 5))
          par2World.setBlock(i - 5, j, k + 5, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 5, j, k - 5))
          par2World.setBlock(i + 5, j, k - 5, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 5, j, k - 5))
          par2World.setBlock(i - 5, j, k - 5, (Block)Blockss.naraShadowBlock); 
      } 
      if (counter == 22) {
        if (par2World.isAirBlock(i + 6, j, k))
          par2World.setBlock(i + 6, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 6, j, k))
          par2World.setBlock(i - 6, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k - 6))
          par2World.setBlock(i, j, k - 6, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k + 6))
          par2World.setBlock(i, j, k + 6, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 6, j, k + 6))
          par2World.setBlock(i + 6, j, k + 6, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 6, j, k + 6))
          par2World.setBlock(i - 6, j, k + 6, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 6, j, k - 6))
          par2World.setBlock(i + 6, j, k - 6, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 6, j, k - 6))
          par2World.setBlock(i - 6, j, k - 6, (Block)Blockss.naraShadowBlock); 
      } 
      if (counter == 24) {
        if (par2World.isAirBlock(i + 7, j, k))
          par2World.setBlock(i + 7, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 7, j, k))
          par2World.setBlock(i - 7, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k - 7))
          par2World.setBlock(i, j, k - 7, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k + 7))
          par2World.setBlock(i, j, k + 7, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 7, j, k + 7))
          par2World.setBlock(i + 7, j, k + 7, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 7, j, k + 7))
          par2World.setBlock(i - 7, j, k + 7, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 7, j, k - 7))
          par2World.setBlock(i + 7, j, k - 7, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 7, j, k - 7))
          par2World.setBlock(i - 7, j, k - 7, (Block)Blockss.naraShadowBlock); 
      } 
      if (counter == 26) {
        if (par2World.isAirBlock(i + 8, j, k))
          par2World.setBlock(i + 8, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 8, j, k))
          par2World.setBlock(i - 8, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k - 8))
          par2World.setBlock(i, j, k - 8, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k + 8))
          par2World.setBlock(i, j, k + 8, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 8, j, k + 8))
          par2World.setBlock(i + 8, j, k + 8, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 8, j, k + 8))
          par2World.setBlock(i - 8, j, k + 8, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 8, j, k - 8))
          par2World.setBlock(i + 8, j, k - 8, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 8, j, k - 8))
          par2World.setBlock(i - 8, j, k - 8, (Block)Blockss.naraShadowBlock); 
      } 
      if (counter == 28) {
        if (par2World.isAirBlock(i + 9, j, k))
          par2World.setBlock(i + 9, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 9, j, k))
          par2World.setBlock(i - 9, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k - 9))
          par2World.setBlock(i, j, k - 9, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k + 9))
          par2World.setBlock(i, j, k + 9, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 9, j, k + 9))
          par2World.setBlock(i + 9, j, k + 9, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 9, j, k + 9))
          par2World.setBlock(i - 9, j, k + 9, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 9, j, k - 9))
          par2World.setBlock(i + 9, j, k - 9, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 9, j, k - 9))
          par2World.setBlock(i - 9, j, k - 9, (Block)Blockss.naraShadowBlock); 
      } 
      if (counter == 30) {
        if (par2World.isAirBlock(i + 10, j, k))
          par2World.setBlock(i + 10, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 10, j, k))
          par2World.setBlock(i - 10, j, k, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k - 10))
          par2World.setBlock(i, j, k - 10, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i, j, k + 10))
          par2World.setBlock(i, j, k + 10, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 10, j, k + 10))
          par2World.setBlock(i + 10, j, k + 10, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 10, j, k + 10))
          par2World.setBlock(i - 10, j, k + 10, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i + 10, j, k - 10))
          par2World.setBlock(i + 10, j, k - 10, (Block)Blockss.naraShadowBlock); 
        if (par2World.isAirBlock(i - 10, j, k - 10))
          par2World.setBlock(i - 10, j, k - 10, (Block)Blockss.naraShadowBlock); 
      } 
      if (counter == 35) {
        start = false;
        counter = 0;
        par1ItemStack.stackTagCompound.setBoolean("start", start);
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
    } 
    if (remove && !par2World.isRemote) {
      counter2++;
      par1ItemStack.stackTagCompound.setInteger("counter2", counter2);
      if (counter2 == 10 && par2World.getBlock(i, j, k) == Blockss.naraShadowBlock)
        par2World.setBlock(i, j, k, Blocks.air); 
      if (counter2 >= 12) {
        if (par2World.getBlock(i + 1, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 1, j, k, Blocks.air); 
        if (par2World.getBlock(i - 1, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 1, j, k, Blocks.air); 
        if (par2World.getBlock(i, j, k + 1) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k + 1, Blocks.air); 
        if (par2World.getBlock(i, j, k - 1) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k - 1, Blocks.air); 
        if (par2World.getBlock(i + 1, j, k + 1) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 1, j, k + 1, Blocks.air); 
        if (par2World.getBlock(i - 1, j, k + 1) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 1, j, k + 1, Blocks.air); 
        if (par2World.getBlock(i + 1, j, k - 1) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 1, j, k - 1, Blocks.air); 
        if (par2World.getBlock(i - 1, j, k - 1) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 1, j, k - 1, Blocks.air); 
      } 
      if (counter2 >= 14) {
        if (par2World.getBlock(i + 2, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 2, j, k, Blocks.air); 
        if (par2World.getBlock(i - 2, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 2, j, k, Blocks.air); 
        if (par2World.getBlock(i, j, k + 2) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k + 2, Blocks.air); 
        if (par2World.getBlock(i, j, k - 2) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k - 2, Blocks.air); 
        if (par2World.getBlock(i + 2, j, k + 2) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 2, j, k + 2, Blocks.air); 
        if (par2World.getBlock(i - 2, j, k + 2) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 2, j, k + 2, Blocks.air); 
        if (par2World.getBlock(i + 2, j, k - 2) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 2, j, k - 2, Blocks.air); 
        if (par2World.getBlock(i - 2, j, k - 2) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 2, j, k - 2, Blocks.air); 
      } 
      if (counter2 >= 16) {
        if (par2World.getBlock(i + 3, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 3, j, k, Blocks.air); 
        if (par2World.getBlock(i - 3, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 3, j, k, Blocks.air); 
        if (par2World.getBlock(i, j, k + 3) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k + 3, Blocks.air); 
        if (par2World.getBlock(i, j, k - 3) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k - 3, Blocks.air); 
        if (par2World.getBlock(i + 3, j, k + 3) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 3, j, k + 3, Blocks.air); 
        if (par2World.getBlock(i - 3, j, k + 3) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 3, j, k + 3, Blocks.air); 
        if (par2World.getBlock(i + 3, j, k - 3) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 3, j, k - 3, Blocks.air); 
        if (par2World.getBlock(i - 3, j, k - 3) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 3, j, k - 3, Blocks.air); 
      } 
      if (counter2 >= 18) {
        if (par2World.getBlock(i + 4, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 4, j, k, Blocks.air); 
        if (par2World.getBlock(i - 4, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 4, j, k, Blocks.air); 
        if (par2World.getBlock(i, j, k + 4) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k + 4, Blocks.air); 
        if (par2World.getBlock(i, j, k - 4) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k - 4, Blocks.air); 
        if (par2World.getBlock(i + 4, j, k + 4) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 4, j, k + 4, Blocks.air); 
        if (par2World.getBlock(i - 4, j, k + 4) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 4, j, k + 4, Blocks.air); 
        if (par2World.getBlock(i + 4, j, k - 4) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 4, j, k - 4, Blocks.air); 
        if (par2World.getBlock(i - 4, j, k - 4) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 4, j, k - 4, Blocks.air); 
      } 
      if (counter2 >= 20) {
        if (par2World.getBlock(i + 5, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 5, j, k, Blocks.air); 
        if (par2World.getBlock(i - 5, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 5, j, k, Blocks.air); 
        if (par2World.getBlock(i, j, k + 5) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k + 5, Blocks.air); 
        if (par2World.getBlock(i, j, k - 5) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k - 5, Blocks.air); 
        if (par2World.getBlock(i + 5, j, k + 5) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 5, j, k + 5, Blocks.air); 
        if (par2World.getBlock(i - 5, j, k + 5) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 5, j, k + 5, Blocks.air); 
        if (par2World.getBlock(i + 5, j, k - 5) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 5, j, k - 5, Blocks.air); 
        if (par2World.getBlock(i - 5, j, k - 5) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 5, j, k - 5, Blocks.air); 
      } 
      if (counter2 >= 22) {
        if (par2World.getBlock(i + 6, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 6, j, k, Blocks.air); 
        if (par2World.getBlock(i - 6, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 6, j, k, Blocks.air); 
        if (par2World.getBlock(i, j, k + 6) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k + 6, Blocks.air); 
        if (par2World.getBlock(i, j, k - 6) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k - 6, Blocks.air); 
        if (par2World.getBlock(i + 6, j, k + 6) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 6, j, k + 6, Blocks.air); 
        if (par2World.getBlock(i - 6, j, k + 6) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 6, j, k + 6, Blocks.air); 
        if (par2World.getBlock(i + 6, j, k - 6) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 6, j, k - 6, Blocks.air); 
        if (par2World.getBlock(i - 6, j, k - 6) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 6, j, k - 6, Blocks.air); 
      } 
      if (counter2 >= 24) {
        if (par2World.getBlock(i + 7, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 7, j, k, Blocks.air); 
        if (par2World.getBlock(i - 7, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 7, j, k, Blocks.air); 
        if (par2World.getBlock(i, j, k + 7) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k + 7, Blocks.air); 
        if (par2World.getBlock(i, j, k - 7) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k - 7, Blocks.air); 
        if (par2World.getBlock(i + 7, j, k + 7) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 7, j, k + 7, Blocks.air); 
        if (par2World.getBlock(i - 7, j, k + 7) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 7, j, k + 7, Blocks.air); 
        if (par2World.getBlock(i + 7, j, k - 7) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 7, j, k - 7, Blocks.air); 
        if (par2World.getBlock(i - 7, j, k - 7) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 7, j, k - 7, Blocks.air); 
      } 
      if (counter2 >= 26) {
        if (par2World.getBlock(i + 8, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 8, j, k, Blocks.air); 
        if (par2World.getBlock(i - 8, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 8, j, k, Blocks.air); 
        if (par2World.getBlock(i, j, k + 8) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k + 8, Blocks.air); 
        if (par2World.getBlock(i, j, k - 8) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k - 8, Blocks.air); 
        if (par2World.getBlock(i + 8, j, k + 8) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 8, j, k + 8, Blocks.air); 
        if (par2World.getBlock(i - 8, j, k + 8) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 8, j, k + 8, Blocks.air); 
        if (par2World.getBlock(i + 8, j, k - 8) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 8, j, k - 8, Blocks.air); 
        if (par2World.getBlock(i - 8, j, k - 8) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 8, j, k - 8, Blocks.air); 
      } 
      if (counter2 >= 28) {
        if (par2World.getBlock(i + 9, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 9, j, k, Blocks.air); 
        if (par2World.getBlock(i - 9, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 9, j, k, Blocks.air); 
        if (par2World.getBlock(i, j, k + 9) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k + 9, Blocks.air); 
        if (par2World.getBlock(i, j, k - 9) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k - 9, Blocks.air); 
        if (par2World.getBlock(i + 9, j, k + 9) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 9, j, k + 9, Blocks.air); 
        if (par2World.getBlock(i - 9, j, k + 9) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 9, j, k + 9, Blocks.air); 
        if (par2World.getBlock(i + 9, j, k - 9) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 9, j, k - 9, Blocks.air); 
        if (par2World.getBlock(i - 9, j, k - 9) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 9, j, k - 9, Blocks.air); 
      } 
      if (counter2 >= 30) {
        if (par2World.getBlock(i + 10, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 10, j, k, Blocks.air); 
        if (par2World.getBlock(i - 10, j, k) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 10, j, k, Blocks.air); 
        if (par2World.getBlock(i, j, k + 10) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k + 10, Blocks.air); 
        if (par2World.getBlock(i, j, k - 10) == Blockss.naraShadowBlock)
          par2World.setBlock(i, j, k - 10, Blocks.air); 
        if (par2World.getBlock(i + 10, j, k + 10) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 10, j, k + 10, Blocks.air); 
        if (par2World.getBlock(i - 10, j, k + 10) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 10, j, k + 10, Blocks.air); 
        if (par2World.getBlock(i + 10, j, k - 10) == Blockss.naraShadowBlock)
          par2World.setBlock(i + 10, j, k - 10, Blocks.air); 
        if (par2World.getBlock(i - 10, j, k - 10) == Blockss.naraShadowBlock)
          par2World.setBlock(i - 10, j, k - 10, Blocks.air); 
      } 
      if (counter2 == 35) {
        remove = false;
        counter2 = 0;
        par1ItemStack.stackTagCompound.setBoolean("remove", remove);
        par1ItemStack.stackTagCompound.setInteger("counter2", counter2);
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    boolean startCounter = Par1ItemStack.stackTagCompound.getBoolean("startCounter");
    boolean start = Par1ItemStack.stackTagCompound.getBoolean("start");
    boolean remove = Par1ItemStack.stackTagCompound.getBoolean("remove");
    boolean Summoned = Par1ItemStack.stackTagCompound.getBoolean("Summoned");
    int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
    int counter2 = Par1ItemStack.stackTagCompound.getInteger("counter2");
    int useCounter = Par1ItemStack.stackTagCompound.getInteger("useCounter");
    int i = Par1ItemStack.stackTagCompound.getInteger("i");
    int j = Par1ItemStack.stackTagCompound.getInteger("j");
    int k = Par1ItemStack.stackTagCompound.getInteger("k");
    if (Par1ItemStack.getItemDamage() != 0 || useCounter != 0 || !Par2World.isRemote);
    if (Par1ItemStack.getItemDamage() == 600 && useCounter == 0 && !Par2World.isRemote) {
      remove = true;
      Par1ItemStack.stackTagCompound.setBoolean("remove", remove);
      Par1ItemStack.setItemDamage(0);
      useCounter = 20;
      Par1ItemStack.stackTagCompound.setInteger("useCounter", useCounter);
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create a circle of shadow");
    par3List.add(EnumChatFormatting.DARK_AQUA + "that traps anyone standing in it");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 10 + 1/s");
  }
}

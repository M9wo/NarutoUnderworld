package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import alcoholmod.Mathioks.block.Blockss;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ExplosionReleaseC2 extends JutsuItem {
  public ExplosionReleaseC2() {
    setMaxDamage(10002);
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
      par1ItemStack.stackTagCompound.setBoolean("start", false);
      par1ItemStack.stackTagCompound.setBoolean("startCounter", false);
      par1ItemStack.stackTagCompound.setBoolean("Summoned", false);
      par1ItemStack.stackTagCompound.setInteger("i", 0);
      par1ItemStack.stackTagCompound.setInteger("j", 0);
      par1ItemStack.stackTagCompound.setInteger("k", 0);
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
    } 
    boolean start = par1ItemStack.stackTagCompound.getBoolean("start");
    boolean startCounter = par1ItemStack.stackTagCompound.getBoolean("startCounter");
    boolean Summoned = par1ItemStack.stackTagCompound.getBoolean("Summoned");
    int i = par1ItemStack.stackTagCompound.getInteger("i");
    int j = par1ItemStack.stackTagCompound.getInteger("j");
    int k = par1ItemStack.stackTagCompound.getInteger("k");
    int counter = par1ItemStack.stackTagCompound.getInteger("counter");
    if (start) {
      counter++;
      par1ItemStack.stackTagCompound.setInteger("counter", counter);
      if (counter == 10 && par2World.isAirBlock(i, j, k))
        par2World.setBlock(i, j, k, (Block)Blockss.summoningMiddle); 
      if (counter == 35) {
        if (par2World.isAirBlock(i + 1, j, k))
          par2World.setBlock(i + 1, j, k, (Block)Blockss.summoningSide2); 
        if (par2World.isAirBlock(i + 1, j, k + 1))
          par2World.setBlock(i + 1, j, k + 1, (Block)Blockss.summoningCorner2); 
        if (par2World.isAirBlock(i + 1, j, k - 1))
          par2World.setBlock(i + 1, j, k - 1, (Block)Blockss.summoningCorner1); 
        if (par2World.isAirBlock(i, j, k - 1))
          par2World.setBlock(i, j, k - 1, (Block)Blockss.summoningSide1); 
        if (par2World.isAirBlock(i - 1, j, k - 1))
          par2World.setBlock(i - 1, j, k - 1, (Block)Blockss.summoningCorner4); 
        if (par2World.isAirBlock(i - 1, j, k + 1))
          par2World.setBlock(i - 1, j, k + 1, (Block)Blockss.summoningCorner3); 
        if (par2World.isAirBlock(i, j, k + 1))
          par2World.setBlock(i, j, k + 1, (Block)Blockss.summoningSide3); 
        if (par2World.isAirBlock(i - 1, j, k))
          par2World.setBlock(i - 1, j, k, (Block)Blockss.summoningSide4); 
      } 
      if (counter >= 75) {
        if (par2World.getBlock(i, j, k) == Blockss.summoningMiddle)
          par2World.setBlock(i, j, k, Blocks.air); 
        if (par2World.getBlock(i + 1, j, k) == Blockss.summoningSide2)
          par2World.setBlock(i + 1, j, k, Blocks.air); 
        if (par2World.getBlock(i + 1, j, k + 1) == Blockss.summoningCorner2)
          par2World.setBlock(i + 1, j, k + 1, Blocks.air); 
        if (par2World.getBlock(i + 1, j, k - 1) == Blockss.summoningCorner1)
          par2World.setBlock(i + 1, j, k - 1, Blocks.air); 
        if (par2World.getBlock(i, j, k - 1) == Blockss.summoningSide1)
          par2World.setBlock(i, j, k - 1, Blocks.air); 
        if (par2World.getBlock(i - 1, j, k - 1) == Blockss.summoningCorner4)
          par2World.setBlock(i - 1, j, k - 1, Blocks.air); 
        if (par2World.getBlock(i - 1, j, k + 1) == Blockss.summoningCorner3)
          par2World.setBlock(i - 1, j, k + 1, Blocks.air); 
        if (par2World.getBlock(i, j, k + 1) == Blockss.summoningSide3)
          par2World.setBlock(i, j, k + 1, Blocks.air); 
        if (par2World.getBlock(i - 1, j, k) == Blockss.summoningSide4)
          par2World.setBlock(i - 1, j, k, Blocks.air); 
      } 
      if (counter >= 55 && counter <= 65) {
        EntityC2Dragon fireball2 = new EntityC2Dragon(par2World);
        double d2 = itemRand.nextGaussian() * 0.02D;
        double d0 = itemRand.nextGaussian() * 0.02D;
        double d1 = itemRand.nextGaussian() * 0.02D;
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, j + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, j + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, j + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, j + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, j + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, j + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, j + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, j + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, j + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, j + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, j + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, j + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, j + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, (j + 1) + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, (j + 1) + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, (j + 1) + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, (j + 1) + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, (j + 1) + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, (j + 1) + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, (j + 1) + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, (j + 1) + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        par2World.spawnParticle("explode", i + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, (j + 1) + (itemRand.nextFloat() * fireball2.height), k + (itemRand.nextFloat() * fireball2.width * 2.0F) - fireball2.width, d2, d0, d1);
        for (int o = 0; o < 200; o++)
          par2World.spawnParticle("explode", i, j, k, 0.0D, 0.0D, 0.0D); 
        if (!Summoned && !par2World.isRemote) {
          fireball2.setPosition(i, j, k);
          fireball2.func_152120_b(((EntityPlayer)par3Entity).getUniqueID().toString());
          fireball2.setHorseTamed(true);
          par2World.spawnEntityInWorld((Entity)fireball2);
          Summoned = true;
          par1ItemStack.stackTagCompound.setBoolean("Summoned", Summoned);
        } 
      } 
      if (counter == 80) {
        Summoned = false;
        start = false;
        counter = 0;
        par1ItemStack.stackTagCompound.setBoolean("Summoned", Summoned);
        par1ItemStack.stackTagCompound.setBoolean("start", start);
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
    } 
    if (par1ItemStack.getItemDamage() < par1ItemStack.getMaxDamage())
      par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() - 1); 
    if (par5 && par3Entity instanceof EntityPlayer) {
      EntityPlayer entityplayer = (EntityPlayer)par3Entity;
      if (par1ItemStack.getItemDamage() > 0);
    } 
    if (par1ItemStack.getItemDamage() < par1ItemStack.getMaxDamage() && par3Entity instanceof EntityPlayer) {
      EntityPlayer entityplayer = (EntityPlayer)par3Entity;
      for (int cp = 0; cp <= 10; cp++) {
        double d0 = itemRand.nextGaussian() * 0.02D;
        double d1 = itemRand.nextGaussian() * 0.02D;
        double d2 = itemRand.nextGaussian() * 0.02D;
        double dx = entityplayer.posX;
        double dy = entityplayer.posY - 1.8D;
        double d3 = entityplayer.posZ;
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getCurrentMana() >= 90 + props.getNinjutsu() / 600) {
          if (props.explosionRelease == 1) {
            Par1ItemStack.stackTagCompound.setInteger("i", MathHelper.floor_double(Par3EntityPlayer.posX));
            Par1ItemStack.stackTagCompound.setInteger("j", MathHelper.floor_double(Par3EntityPlayer.posY));
            Par1ItemStack.stackTagCompound.setInteger("k", MathHelper.floor_double(Par3EntityPlayer.posZ));
            Par1ItemStack.stackTagCompound.setBoolean("start", true);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Explosion Release Summoning : C2-Dragon!!"));
            Par1ItemStack.damageItem(10000, (EntityLivingBase)Par3EntityPlayer);
            props.consumeMana(90 + props.getNinjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create A clay Dragon you can ride on");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (90 + props.getNinjutsu() / 600));
  }
}

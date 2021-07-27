package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncDeathPossessionMessage;
import alcoholmod.Mathioks.PacketDispatcher;
import alcoholmod.Mathioks.block.Blockss;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class DeathPossession extends JutsuItem {
  public DeathPossession() {
    setMaxDamage(10002);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (!par2World.isRemote) {
      if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
        par1ItemStack.stackTagCompound = new NBTTagCompound();
        par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
        par1ItemStack.stackTagCompound.setBoolean("start", false);
        par1ItemStack.stackTagCompound.setBoolean("startCounter", false);
        par1ItemStack.stackTagCompound.setBoolean("Standby", false);
        par1ItemStack.stackTagCompound.setInteger("i", 0);
        par1ItemStack.stackTagCompound.setInteger("j", 0);
        par1ItemStack.stackTagCompound.setInteger("k", 0);
        par1ItemStack.stackTagCompound.setInteger("counter", 0);
      } 
      boolean start = par1ItemStack.stackTagCompound.getBoolean("start");
      boolean startCounter = par1ItemStack.stackTagCompound.getBoolean("startCounter");
      boolean Standby = par1ItemStack.stackTagCompound.getBoolean("Standby");
      int i = par1ItemStack.stackTagCompound.getInteger("i");
      int j = par1ItemStack.stackTagCompound.getInteger("j");
      int k = par1ItemStack.stackTagCompound.getInteger("k");
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      EntityPlayer player = (EntityPlayer)par3Entity;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (Standby && !start)
        if (((EntityPlayer)par3Entity).worldObj.getBlock(MathHelper.floor_double(((EntityPlayer)par3Entity).posX), MathHelper.floor_double(((EntityPlayer)par3Entity).posY - ((EntityPlayer)par3Entity).yOffset), MathHelper.floor_double(((EntityPlayer)par3Entity).posZ)) != Blockss.DeathPossessionTR && ((EntityPlayer)par3Entity).worldObj.getBlock(MathHelper.floor_double(((EntityPlayer)par3Entity).posX), MathHelper.floor_double(((EntityPlayer)par3Entity).posY - ((EntityPlayer)par3Entity).yOffset), MathHelper.floor_double(((EntityPlayer)par3Entity).posZ)) != Blockss.DeathPossessionTM && ((EntityPlayer)par3Entity).worldObj.getBlock(MathHelper.floor_double(((EntityPlayer)par3Entity).posX), MathHelper.floor_double(((EntityPlayer)par3Entity).posY - ((EntityPlayer)par3Entity).yOffset), MathHelper.floor_double(((EntityPlayer)par3Entity).posZ)) != Blockss.DeathPossessionTL && ((EntityPlayer)par3Entity).worldObj.getBlock(MathHelper.floor_double(((EntityPlayer)par3Entity).posX), MathHelper.floor_double(((EntityPlayer)par3Entity).posY - ((EntityPlayer)par3Entity).yOffset), MathHelper.floor_double(((EntityPlayer)par3Entity).posZ)) != Blockss.DeathPossessionMR && ((EntityPlayer)par3Entity).worldObj.getBlock(MathHelper.floor_double(((EntityPlayer)par3Entity).posX), MathHelper.floor_double(((EntityPlayer)par3Entity).posY - ((EntityPlayer)par3Entity).yOffset), MathHelper.floor_double(((EntityPlayer)par3Entity).posZ)) != Blockss.DeathPossessionMM && ((EntityPlayer)par3Entity).worldObj.getBlock(MathHelper.floor_double(((EntityPlayer)par3Entity).posX), MathHelper.floor_double(((EntityPlayer)par3Entity).posY - ((EntityPlayer)par3Entity).yOffset), MathHelper.floor_double(((EntityPlayer)par3Entity).posZ)) != Blockss.DeathPossessionML && ((EntityPlayer)par3Entity).worldObj.getBlock(MathHelper.floor_double(((EntityPlayer)par3Entity).posX), MathHelper.floor_double(((EntityPlayer)par3Entity).posY - ((EntityPlayer)par3Entity).yOffset), MathHelper.floor_double(((EntityPlayer)par3Entity).posZ)) != Blockss.DeathPossessionBR && ((EntityPlayer)par3Entity).worldObj.getBlock(MathHelper.floor_double(((EntityPlayer)par3Entity).posX), MathHelper.floor_double(((EntityPlayer)par3Entity).posY - ((EntityPlayer)par3Entity).yOffset), MathHelper.floor_double(((EntityPlayer)par3Entity).posZ)) != Blockss.DeathPossessionBM && ((EntityPlayer)par3Entity).worldObj.getBlock(MathHelper.floor_double(((EntityPlayer)par3Entity).posX), MathHelper.floor_double(((EntityPlayer)par3Entity).posY - ((EntityPlayer)par3Entity).yOffset), MathHelper.floor_double(((EntityPlayer)par3Entity).posZ)) != Blockss.DeathPossessionBL) {
          if (props.getDeathPossession() == 2) {
            props.setDeathPossession(1);
            PacketDispatcher.sendTo((IMessage)new SyncDeathPossessionMessage(player), (EntityPlayerMP)player);
          } 
          if (par2World.getBlock(i, j, k) == Blockss.DeathPossessionMM)
            par2World.setBlock(i, j, k, Blocks.air); 
          if (par2World.getBlock(i + 1, j, k) == Blockss.DeathPossessionMR)
            par2World.setBlock(i + 1, j, k, Blocks.air); 
          if (par2World.getBlock(i + 1, j, k + 1) == Blockss.DeathPossessionBR)
            par2World.setBlock(i + 1, j, k + 1, Blocks.air); 
          if (par2World.getBlock(i + 1, j, k - 1) == Blockss.DeathPossessionTR)
            par2World.setBlock(i + 1, j, k - 1, Blocks.air); 
          if (par2World.getBlock(i, j, k - 1) == Blockss.DeathPossessionTM)
            par2World.setBlock(i, j, k - 1, Blocks.air); 
          if (par2World.getBlock(i - 1, j, k - 1) == Blockss.DeathPossessionTL)
            par2World.setBlock(i - 1, j, k - 1, Blocks.air); 
          if (par2World.getBlock(i - 1, j, k + 1) == Blockss.DeathPossessionBL)
            par2World.setBlock(i - 1, j, k + 1, Blocks.air); 
          if (par2World.getBlock(i, j, k + 1) == Blockss.DeathPossessionBM)
            par2World.setBlock(i, j, k + 1, Blocks.air); 
          if (par2World.getBlock(i - 1, j, k) == Blockss.DeathPossessionML)
            par2World.setBlock(i - 1, j, k, Blocks.air); 
          Standby = false;
          par1ItemStack.stackTagCompound.setBoolean("Standby", Standby);
        } else {
          if (props.getDeathPossession() == 1) {
            props.setDeathPossession(2);
            PacketDispatcher.sendTo((IMessage)new SyncDeathPossessionMessage(player), (EntityPlayerMP)player);
          } 
          if (((EntityPlayer)par3Entity).getHealth() < 10.0F)
            ((EntityPlayer)par3Entity).setHealth(10.0F); 
        }  
      if (start) {
        counter++;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
        if (counter == 10 && (par2World.isAirBlock(i, j, k - 1) || par2World.getBlock(i, j, k - 1) == Blocks.grass))
          par2World.setBlock(i, j, k - 1, (Block)Blockss.DeathPossessionTM); 
        if (counter == 20 && (par2World.isAirBlock(i + 1, j, k - 1) || par2World.getBlock(i + 1, j, k - 1) == Blocks.grass))
          par2World.setBlock(i + 1, j, k - 1, (Block)Blockss.DeathPossessionTR); 
        if (counter == 30 && (par2World.isAirBlock(i + 1, j, k) || par2World.getBlock(i + 1, j, k) == Blocks.grass))
          par2World.setBlock(i + 1, j, k, (Block)Blockss.DeathPossessionMR); 
        if (counter == 40 && (par2World.isAirBlock(i + 1, j, k + 1) || par2World.getBlock(i + 1, j, k + 1) == Blocks.grass))
          par2World.setBlock(i + 1, j, k + 1, (Block)Blockss.DeathPossessionBR); 
        if (counter == 50 && (par2World.isAirBlock(i, j, k + 1) || par2World.getBlock(i, j, k + 1) == Blocks.grass))
          par2World.setBlock(i, j, k + 1, (Block)Blockss.DeathPossessionBM); 
        if (counter == 60 && (par2World.isAirBlock(i - 1, j, k + 1) || par2World.getBlock(i - 1, j, k + 1) == Blocks.grass))
          par2World.setBlock(i - 1, j, k + 1, (Block)Blockss.DeathPossessionBL); 
        if (counter == 70 && (par2World.isAirBlock(i - 1, j, k) || par2World.getBlock(i - 1, j, k) == Blocks.grass))
          par2World.setBlock(i - 1, j, k, (Block)Blockss.DeathPossessionML); 
        if (counter == 80 && (par2World.isAirBlock(i - 1, j, k - 1) || par2World.getBlock(i - 1, j, k - 1) == Blocks.grass))
          par2World.setBlock(i - 1, j, k - 1, (Block)Blockss.DeathPossessionTL); 
        if (counter == 90 && (par2World.isAirBlock(i, j, k) || par2World.getBlock(i, j, k) == Blocks.grass))
          par2World.setBlock(i, j, k, (Block)Blockss.DeathPossessionMM); 
        if (counter == 100) {
          start = false;
          counter = 0;
          par1ItemStack.stackTagCompound.setBoolean("start", start);
          par1ItemStack.stackTagCompound.setInteger("counter", counter);
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getCurrentMana() >= 25) {
          if (Par1ItemStack.getItemDamage() == 0) {
            Par1ItemStack.stackTagCompound.setInteger("i", MathHelper.floor_double(Par3EntityPlayer.posX));
            Par1ItemStack.stackTagCompound.setInteger("j", MathHelper.floor_double(Par3EntityPlayer.posY));
            Par1ItemStack.stackTagCompound.setInteger("k", MathHelper.floor_double(Par3EntityPlayer.posZ));
            Par1ItemStack.stackTagCompound.setBoolean("start", true);
            Par1ItemStack.stackTagCompound.setBoolean("Standby", true);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Curse Technique: Death Controlling Possessed Blood!!"));
            props.consumeMana(25);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You cannot summon this creature yet!"));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "The ultimate cursing technique");
    par3List.add(EnumChatFormatting.DARK_AQUA + "used by members of the Jashin religion");
    par3List.add(EnumChatFormatting.DARK_RED + "Stand in the middle of the circle to become");
    par3List.add(EnumChatFormatting.DARK_RED + "Immortal");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: 25");
  }
}

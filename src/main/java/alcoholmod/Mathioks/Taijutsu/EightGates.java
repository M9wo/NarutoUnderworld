package alcoholmod.Mathioks.Taijutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.SyncEightGatesStageMessage;
import alcoholmod.Mathioks.Final.JutsuItem;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class EightGates extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public EightGates() {
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
        par1ItemStack.stackTagCompound.setInteger("stage", 0);
        par1ItemStack.stackTagCompound.setInteger("particles", 0);
        par1ItemStack.stackTagCompound.setInteger("damageCounter", 0);
      } 
      if (par1ItemStack.stackTagCompound != null) {
        EntityPlayer player = (EntityPlayer)par3Entity;
        ExtendedPlayer props = ExtendedPlayer.get(player);
        if (par1ItemStack.stackTagCompound.getInteger("stage") == 1) {
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 0));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.jump.id, 10, 0));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 10, 1));
          if (par1ItemStack.stackTagCompound.getInteger("particles") >= 1) {
            int i = par1ItemStack.stackTagCompound.getInteger("particles");
            if (i > 0) {
              i--;
              par1ItemStack.stackTagCompound.setInteger("particles", i);
              for (int damageCounter = 0; damageCounter < 40; damageCounter++)
                ((EntityPlayer)par3Entity).worldObj.spawnParticle("cloud", ((EntityPlayer)par3Entity).posX + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian(), ((EntityPlayer)par3Entity).posY - 1.0D + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.25D, ((EntityPlayer)par3Entity).posZ + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian(), 0.0D, 0.0D, 0.0D); 
            } 
          } 
          int counter = par1ItemStack.stackTagCompound.getInteger("damageCounter");
          if (counter >= 1) {
            counter--;
            par1ItemStack.stackTagCompound.setInteger("damageCounter", counter);
          } 
          if (counter == 0) {
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 0));
            int damageCounter = 1500;
            par1ItemStack.stackTagCompound.setInteger("damageCounter", damageCounter);
          } 
        } 
        if (par1ItemStack.stackTagCompound.getInteger("stage") == 2) {
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 0));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.jump.id, 10, 0));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 10, 2));
          if (par1ItemStack.stackTagCompound.getInteger("particles") >= 1) {
            int i = par1ItemStack.stackTagCompound.getInteger("particles");
            if (i > 0) {
              i--;
              par1ItemStack.stackTagCompound.setInteger("particles", i);
              for (int damageCounter = 0; damageCounter < 80; damageCounter++)
                ((EntityPlayer)par3Entity).worldObj.spawnParticle("cloud", ((EntityPlayer)par3Entity).posX + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian(), ((EntityPlayer)par3Entity).posY - 1.0D + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.25D, ((EntityPlayer)par3Entity).posZ + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian(), 0.0D, 0.0D, 0.0D); 
            } 
          } 
          int counter = par1ItemStack.stackTagCompound.getInteger("damageCounter");
          if (counter >= 1) {
            counter--;
            par1ItemStack.stackTagCompound.setInteger("damageCounter", counter);
          } 
          if (counter == 0) {
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 0));
            int damageCounter = 1200;
            par1ItemStack.stackTagCompound.setInteger("damageCounter", damageCounter);
          } 
        } 
        if (par1ItemStack.stackTagCompound.getInteger("stage") == 3) {
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 0));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.jump.id, 10, 0));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 10, 2));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.digSpeed.id, 10, 0));
          int counter = par1ItemStack.stackTagCompound.getInteger("counter");
          if (counter >= 1) {
            counter--;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
          if (counter == 0) {
            double d2 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
            double d0 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
            double d1 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
            ((EntityPlayer)par3Entity).worldObj.spawnParticle("happyVillager", ((EntityPlayer)par3Entity).posX + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, ((EntityPlayer)par3Entity).posY - 1.0D + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).height), ((EntityPlayer)par3Entity).posZ + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, d2, d0, d1);
            ((EntityPlayer)par3Entity).worldObj.spawnParticle("happyVillager", ((EntityPlayer)par3Entity).posX + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, ((EntityPlayer)par3Entity).posY - 2.0D + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).height), ((EntityPlayer)par3Entity).posZ + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, d2, d0, d1);
            counter = 10;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
          if (par1ItemStack.stackTagCompound.getInteger("particles") >= 1) {
            int i = par1ItemStack.stackTagCompound.getInteger("particles");
            if (i > 0) {
              i--;
              par1ItemStack.stackTagCompound.setInteger("particles", i);
              int j;
              for (j = 0; j < 8; j++)
                ((EntityPlayer)par3Entity).worldObj.spawnParticle("smoke", ((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ, 0.0D, 0.0D, 0.0D); 
              for (j = 0; j < 80; j++)
                ((EntityPlayer)par3Entity).worldObj.spawnParticle("cloud", ((EntityPlayer)par3Entity).posX + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian(), ((EntityPlayer)par3Entity).posY + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.25D, ((EntityPlayer)par3Entity).posZ + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian(), 0.0D, 0.0D, 0.0D); 
            } 
          } 
          int damageCounter = par1ItemStack.stackTagCompound.getInteger("damageCounter");
          if (damageCounter >= 1) {
            damageCounter--;
            par1ItemStack.stackTagCompound.setInteger("damageCounter", damageCounter);
          } 
          if (damageCounter == 0) {
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 0));
            damageCounter = 1000;
            par1ItemStack.stackTagCompound.setInteger("damageCounter", damageCounter);
          } 
        } 
        if (par1ItemStack.stackTagCompound.getInteger("stage") == 4) {
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 1));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.jump.id, 10, 1));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 10, 3));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.digSpeed.id, 10, 0));
          int counter = par1ItemStack.stackTagCompound.getInteger("counter");
          if (counter >= 1) {
            counter--;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
          if (counter == 0) {
            double d2 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
            double d0 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
            double d1 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
            ((EntityPlayer)par3Entity).worldObj.spawnParticle("happyVillager", ((EntityPlayer)par3Entity).posX + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, ((EntityPlayer)par3Entity).posY - 1.0D + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).height), ((EntityPlayer)par3Entity).posZ + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, d2, d0, d1);
            ((EntityPlayer)par3Entity).worldObj.spawnParticle("happyVillager", ((EntityPlayer)par3Entity).posX + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, ((EntityPlayer)par3Entity).posY - 2.0D + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).height), ((EntityPlayer)par3Entity).posZ + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, d2, d0, d1);
            counter = 6;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
          if (par1ItemStack.stackTagCompound.getInteger("particles") >= 1) {
            int i = par1ItemStack.stackTagCompound.getInteger("particles");
            if (i > 0) {
              i--;
              par1ItemStack.stackTagCompound.setInteger("particles", i);
              int j;
              for (j = 0; j < 8; j++)
                ((EntityPlayer)par3Entity).worldObj.spawnParticle("smoke", ((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ, 0.0D, 0.0D, 0.0D); 
              for (j = 0; j < 200; j++)
                ((EntityPlayer)par3Entity).worldObj.spawnParticle("cloud", ((EntityPlayer)par3Entity).posX + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian(), ((EntityPlayer)par3Entity).posY + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.25D, ((EntityPlayer)par3Entity).posZ + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian(), 0.0D, 0.0D, 0.0D); 
            } 
          } 
          int damageCounter = par1ItemStack.stackTagCompound.getInteger("damageCounter");
          if (damageCounter >= 1) {
            damageCounter--;
            par1ItemStack.stackTagCompound.setInteger("damageCounter", damageCounter);
          } 
          if (damageCounter == 0) {
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 0));
            damageCounter = 800;
            par1ItemStack.stackTagCompound.setInteger("damageCounter", damageCounter);
          } 
        } 
        if (par1ItemStack.stackTagCompound.getInteger("stage") == 5) {
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 2));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.jump.id, 10, 1));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 10, 3));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.digSpeed.id, 10, 0));
          int counter = par1ItemStack.stackTagCompound.getInteger("counter");
          if (counter >= 1) {
            counter--;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
          if (counter == 0) {
            double d2 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
            double d0 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
            double d1 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
            ((EntityPlayer)par3Entity).worldObj.spawnParticle("happyVillager", ((EntityPlayer)par3Entity).posX + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, ((EntityPlayer)par3Entity).posY - 1.0D + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).height), ((EntityPlayer)par3Entity).posZ + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, d2, d0, d1);
            ((EntityPlayer)par3Entity).worldObj.spawnParticle("happyVillager", ((EntityPlayer)par3Entity).posX + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, ((EntityPlayer)par3Entity).posY - 2.0D + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).height), ((EntityPlayer)par3Entity).posZ + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, d2, d0, d1);
            counter = 3;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
          if (par1ItemStack.stackTagCompound.getInteger("particles") >= 1) {
            int i = par1ItemStack.stackTagCompound.getInteger("particles");
            if (i > 0) {
              i--;
              par1ItemStack.stackTagCompound.setInteger("particles", i);
              int j;
              for (j = 0; j < 8; j++)
                ((EntityPlayer)par3Entity).worldObj.spawnParticle("smoke", ((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ, 0.0D, 0.0D, 0.0D); 
              for (j = 0; j < 16; j++)
                ((EntityPlayer)par3Entity).worldObj.spawnParticle("smoke", ((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY - 1.0D, ((EntityPlayer)par3Entity).posZ, 0.0D, 0.0D, 0.0D); 
              for (j = 0; j < 400; j++)
                ((EntityPlayer)par3Entity).worldObj.spawnParticle("cloud", ((EntityPlayer)par3Entity).posX + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian(), ((EntityPlayer)par3Entity).posY + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.25D, ((EntityPlayer)par3Entity).posZ + ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian(), 0.0D, 0.0D, 0.0D); 
            } 
          } 
          int damageCounter = par1ItemStack.stackTagCompound.getInteger("damageCounter");
          if (damageCounter >= 1) {
            damageCounter--;
            par1ItemStack.stackTagCompound.setInteger("damageCounter", damageCounter);
          } 
          if (damageCounter == 0) {
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 0));
            damageCounter = 600;
            par1ItemStack.stackTagCompound.setInteger("damageCounter", damageCounter);
          } 
        } 
        if (par1ItemStack.stackTagCompound.getInteger("stage") == 6) {
          double d2 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
          double d0 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
          double d1 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
          ((EntityPlayer)par3Entity).worldObj.spawnParticle("happyVillager", ((EntityPlayer)par3Entity).posX + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, ((EntityPlayer)par3Entity).posY - 1.0D + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).height), ((EntityPlayer)par3Entity).posZ + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, d2, d0, d1);
          ((EntityPlayer)par3Entity).worldObj.spawnParticle("happyVillager", ((EntityPlayer)par3Entity).posX + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, ((EntityPlayer)par3Entity).posY - 2.0D + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).height), ((EntityPlayer)par3Entity).posZ + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, d2, d0, d1);
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 3));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.jump.id, 10, 2));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 10, 4));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.digSpeed.id, 10, 0));
          int counter = par1ItemStack.stackTagCompound.getInteger("counter");
          if (counter >= 1) {
            counter--;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
          if (counter == 0) {
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 1));
            counter = 700;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
          int i = par1ItemStack.stackTagCompound.getInteger("damageCounter");
        } 
        if (par1ItemStack.stackTagCompound.getInteger("stage") == 7) {
          double d2 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
          double d0 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
          double d1 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
          ((EntityPlayer)par3Entity).worldObj.spawnParticle("magicCrit", ((EntityPlayer)par3Entity).posX + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, ((EntityPlayer)par3Entity).posY - 1.0D + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).height), ((EntityPlayer)par3Entity).posZ + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, d2, d0, d1);
          ((EntityPlayer)par3Entity).worldObj.spawnParticle("magicCrit", ((EntityPlayer)par3Entity).posX + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, ((EntityPlayer)par3Entity).posY - 2.0D + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).height), ((EntityPlayer)par3Entity).posZ + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, d2, d0, d1);
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 4));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.jump.id, 10, 2));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 10, 4));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.digSpeed.id, 10, 1));
          int counter = par1ItemStack.stackTagCompound.getInteger("counter");
          if (counter >= 1) {
            counter--;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
          if (counter == 0) {
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 2));
            counter = 300;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
        } 
        if (par1ItemStack.stackTagCompound.getInteger("stage") == 8) {
          double d2 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
          double d0 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
          double d1 = ((EntityPlayer)par3Entity).worldObj.rand.nextGaussian() * 0.02D;
          ((EntityPlayer)par3Entity).worldObj.spawnParticle("witchMagic", ((EntityPlayer)par3Entity).posX + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, ((EntityPlayer)par3Entity).posY - 1.0D + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).height), ((EntityPlayer)par3Entity).posZ + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, d2, d0, d1);
          ((EntityPlayer)par3Entity).worldObj.spawnParticle("witchMagic", ((EntityPlayer)par3Entity).posX + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, ((EntityPlayer)par3Entity).posY - 2.0D + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).height), ((EntityPlayer)par3Entity).posZ + (((EntityPlayer)par3Entity).worldObj.rand.nextFloat() * ((EntityPlayer)par3Entity).width * 2.0F) - ((EntityPlayer)par3Entity).width, d2, d0, d1);
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 5));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.jump.id, 10, 3));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.damageBoost.id, 10, 5));
          ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.digSpeed.id, 10, 2));
          int counter = par1ItemStack.stackTagCompound.getInteger("counter");
          if (counter >= 1) {
            counter--;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
          if (counter == 0) {
            ((EntityPlayer)par3Entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 3));
            counter = 300;
            par1ItemStack.stackTagCompound.setInteger("counter", counter);
          } 
        } 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && props.getClanName().contains("Lee")) {
        if (Par1ItemStack.stackTagCompound.getInteger("stage") == 0 && !Par3EntityPlayer.isSneaking()) {
          if (props.getTaijutsu() >= 4.0D) {
            props.setEightGatesStage(1);
            PacketDispatcher.sendTo((IMessage)new SyncEightGatesStageMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
            Par1ItemStack.stackTagCompound.setInteger("stage", 1);
            Par1ItemStack.stackTagCompound.setInteger("particles", 1);
            Par1ItemStack.stackTagCompound.setInteger("damageCounter", 1500);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Gate of Opening: Open!"));
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your Taijutsu needs to be at least 150"));
          } 
        } else if (Par1ItemStack.stackTagCompound.getInteger("stage") == 1 && !Par3EntityPlayer.isSneaking()) {
          if (props.getTaijutsu() >= 5.0D) {
            props.setEightGatesStage(2);
            PacketDispatcher.sendTo((IMessage)new SyncEightGatesStageMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
            Par1ItemStack.stackTagCompound.setInteger("stage", 2);
            Par1ItemStack.stackTagCompound.setInteger("particles", 1);
            Par1ItemStack.stackTagCompound.setInteger("damageCounter", 1200);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Gate of Healing: Open!"));
            Par2World.spawnParticle("smoke", Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 0.0D, 0.0D, 0.0D);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your Taijutsu needs to be at least 200"));
          } 
        } else if (Par1ItemStack.stackTagCompound.getInteger("stage") == 2 && !Par3EntityPlayer.isSneaking()) {
          if (props.getTaijutsu() >= 6.0D) {
            props.setEightGatesStage(3);
            PacketDispatcher.sendTo((IMessage)new SyncEightGatesStageMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
            Par1ItemStack.stackTagCompound.setInteger("stage", 3);
            Par1ItemStack.stackTagCompound.setInteger("particles", 1);
            Par1ItemStack.stackTagCompound.setInteger("counter", 10);
            Par1ItemStack.stackTagCompound.setInteger("damageCounter", 1000);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Gate of Life: Open!"));
            Par3EntityPlayer.worldObj.spawnParticle("smoke", Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 0.0D, 0.0D, 0.0D);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your Taijutsu needs to be at least 250"));
          } 
        } else if (Par1ItemStack.stackTagCompound.getInteger("stage") == 3 && !Par3EntityPlayer.isSneaking()) {
          if (props.getTaijutsu() >= 7.0D) {
            props.setEightGatesStage(4);
            PacketDispatcher.sendTo((IMessage)new SyncEightGatesStageMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
            Par1ItemStack.stackTagCompound.setInteger("stage", 4);
            Par1ItemStack.stackTagCompound.setInteger("particles", 1);
            Par1ItemStack.stackTagCompound.setInteger("counter", 6);
            Par1ItemStack.stackTagCompound.setInteger("damageCounter", 800);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Gate of Pain: Open!!"));
            Par3EntityPlayer.worldObj.spawnParticle("smoke", Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 0.0D, 0.0D, 0.0D);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your Taijutsu needs to be at least 300"));
          } 
        } else if (Par1ItemStack.stackTagCompound.getInteger("stage") == 4 && !Par3EntityPlayer.isSneaking()) {
          if (props.getTaijutsu() >= 8.0D) {
            props.setEightGatesStage(5);
            PacketDispatcher.sendTo((IMessage)new SyncEightGatesStageMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
            Par1ItemStack.stackTagCompound.setInteger("stage", 5);
            Par1ItemStack.stackTagCompound.setInteger("particles", 1);
            Par1ItemStack.stackTagCompound.setInteger("counter", 4);
            Par1ItemStack.stackTagCompound.setInteger("damageCounter", 700);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Gate of Limit: Open!!"));
            Par3EntityPlayer.worldObj.spawnParticle("smoke", Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 0.0D, 0.0D, 0.0D);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your Taijutsu needs to be at least 350"));
          } 
        } else if (Par1ItemStack.stackTagCompound.getInteger("stage") == 5 && !Par3EntityPlayer.isSneaking()) {
          if (props.getTaijutsu() >= 9.0D) {
            props.setEightGatesStage(6);
            PacketDispatcher.sendTo((IMessage)new SyncEightGatesStageMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
            Par1ItemStack.stackTagCompound.setInteger("stage", 6);
            Par1ItemStack.stackTagCompound.setInteger("particles", 1);
            Par1ItemStack.stackTagCompound.setInteger("counter", 500);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Gate of View: Open!!"));
            Par3EntityPlayer.worldObj.spawnParticle("smoke", Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 0.0D, 0.0D, 0.0D);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your Taijutsu needs to be at least 400"));
          } 
        } else if (Par1ItemStack.stackTagCompound.getInteger("stage") == 6 && !Par3EntityPlayer.isSneaking()) {
          if (props.getTaijutsu() >= 10.0D) {
            props.setEightGatesStage(7);
            PacketDispatcher.sendTo((IMessage)new SyncEightGatesStageMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
            Par1ItemStack.stackTagCompound.setInteger("stage", 7);
            Par1ItemStack.stackTagCompound.setInteger("particles", 1);
            Par1ItemStack.stackTagCompound.setInteger("counter", 500);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Gate of Wonder: Open!!!"));
            Par3EntityPlayer.worldObj.spawnParticle("smoke", Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 0.0D, 0.0D, 0.0D);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your Taijutsu needs to be at least 450"));
          } 
        } else if (Par1ItemStack.stackTagCompound.getInteger("stage") == 7 && !Par3EntityPlayer.isSneaking()) {
          if (props.getTaijutsu() >= 11.0D) {
            props.setEightGatesStage(8);
            PacketDispatcher.sendTo((IMessage)new SyncEightGatesStageMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
            Par1ItemStack.stackTagCompound.setInteger("stage", 8);
            Par1ItemStack.stackTagCompound.setInteger("particles", 1);
            Par1ItemStack.stackTagCompound.setInteger("counter", 300);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Gate of Death: Open!!!!"));
            Par3EntityPlayer.worldObj.spawnParticle("smoke", Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 0.0D, 0.0D, 0.0D);
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Your Taijutsu needs to be at least 500"));
          } 
        } 
        if (Par3EntityPlayer.isSneaking()) {
          props.setEightGatesStage(0);
          PacketDispatcher.sendTo((IMessage)new SyncEightGatesStageMessage(Par3EntityPlayer), (EntityPlayerMP)Par3EntityPlayer);
          if (Par1ItemStack.stackTagCompound.getInteger("stage") == 8)
            Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.harm.id, 100, 10)); 
          Par1ItemStack.stackTagCompound.setInteger("stage", 0);
          Par1ItemStack.stackTagCompound.setInteger("counter", 300);
          Par1ItemStack.stackTagCompound.setInteger("damageCounter", 0);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Eight Gates: Close"));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Opens up the Eight Inner gates");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Unleashing immense strength");
    par3List.add(EnumChatFormatting.DARK_AQUA + "at the cost of the user's body");
  }
}

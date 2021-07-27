package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class YinReleaseDomeOfDarkness extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setInteger("stage", 0);
      par1ItemStack.stackTagCompound.setInteger("particles", 0);
      par1ItemStack.stackTagCompound.setInteger("damageCounter", 0);
      par1ItemStack.stackTagCompound.setInteger("kd", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("kd") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("kd");
      par1ItemStack.stackTagCompound.setInteger("kd", --counter);
    } 
  }
  
  public YinReleaseDomeOfDarkness() {
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    for (int i = 0; i < 40; i++) {
      Par2World.spawnParticle("largesmoke", Par3EntityPlayer.posX + Par2World.rand.nextGaussian(), Par3EntityPlayer.posY + Par2World.rand.nextGaussian() * 0.25D, Par3EntityPlayer.posZ + Par2World.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
      Par2World.spawnParticle("largesmoke", Par3EntityPlayer.posX + Par2World.rand.nextGaussian(), Par3EntityPlayer.posY - 1.0D + Par2World.rand.nextGaussian() * 0.25D, Par3EntityPlayer.posZ + Par2World.rand.nextGaussian(), 0.0D, 0.0D, 0.0D);
    } 
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getInteger("kd") == 0)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        EntityPlayer player = Par3EntityPlayer;
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getCurrentMana() >= 1) {
          List<Entity> list = Par2World.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(Par3EntityPlayer.posX - 3.0D, Par3EntityPlayer.posY - 3.0D, Par3EntityPlayer.posZ - 3.0D, Par3EntityPlayer.posX + 3.0D, Par3EntityPlayer.posY + 3.0D, Par3EntityPlayer.posZ + 3.0D));
          if (Par3EntityPlayer != null)
            for (int k2 = 0; k2 < list.size(); k2++) {
              if (!Par2World.isRemote) {
                Entity entity = list.get(k2);
                String user = Par3EntityPlayer.getUniqueID().toString();
                double d0 = entity.getDistance(player.posX, player.posY, player.posZ);
                if (entity instanceof EntityLiving && 
                  entity instanceof EntityLiving) {
                  entity.attackEntityFrom(DamageSource.causePlayerDamage(Par3EntityPlayer), 6.0F);
                  ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.blindness.id, 60, 10));
                  if (d0 <= 10.0D) {
                    double dx = entity.posX - player.posX;
                    double dy = entity.posY - player.posY;
                    double dz = entity.posZ - player.posZ;
                    entity.motionX += dx * 0.75D / d0;
                    entity.motionY += dy * 0.75D / d0 + 0.2D;
                    entity.motionZ += dz * 0.75D / d0;
                  } 
                } 
                if (entity instanceof EntityPlayer && 
                  !entity.getUniqueID().toString().equals(user)) {
                  entity.attackEntityFrom(DamageSource.causePlayerDamage(Par3EntityPlayer), 8.0F);
                  ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 60, 10));
                  if (d0 <= 10.0D) {
                    double dx = entity.posX - player.posX;
                    double dy = entity.posY - player.posY;
                    double dz = entity.posZ - player.posZ;
                    entity.motionX += dx * 0.75D / d0;
                    entity.motionY += dy * 0.75D / d0 + 0.2D;
                    entity.motionZ += dz * 0.75D / d0;
                  } 
                } 
                Par1ItemStack.stackTagCompound.setInteger("kd", 40);
                props.consumeMana(1);
              } 
            }  
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Unleash Yin release around the");
    par3List.add(EnumChatFormatting.DARK_AQUA + "users body to blind and damage");
    par3List.add(EnumChatFormatting.DARK_AQUA + "any close opponent.");
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: 6");
  }
}

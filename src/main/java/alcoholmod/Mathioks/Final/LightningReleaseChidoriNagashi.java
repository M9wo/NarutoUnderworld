package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
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
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class LightningReleaseChidoriNagashi extends JutsuItem {
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
  
  public LightningReleaseChidoriNagashi() {
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    for (int i = 0; i < 100; i++)
      Par3EntityPlayer.worldObj.spawnParticle("magicCrit", Par3EntityPlayer.posX + Par2World.rand.nextGaussian(), Par3EntityPlayer.posY + Par2World.rand.nextGaussian() * 0.25D, Par3EntityPlayer.posZ + Par2World.rand.nextGaussian(), 0.0D, 0.0D, 0.0D); 
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getInteger("kd") == 0)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        EntityPlayer player = Par3EntityPlayer;
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getLightningRelease() == 1)
          if (props.getCurrentMana() >= 1) {
            if (Par3EntityPlayer.isInWater() || Par3EntityPlayer.worldObj.getBlock(MathHelper.floor_double(Par3EntityPlayer.posX), MathHelper.floor_double(Par3EntityPlayer.posY - 0.2D - Par3EntityPlayer.yOffset), MathHelper.floor_double(Par3EntityPlayer.posZ)) == Blocks.water) {
              List<Entity> list1 = Par2World.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(Par3EntityPlayer.posX - 10.0D, Par3EntityPlayer.posY - 3.0D, Par3EntityPlayer.posZ - 10.0D, Par3EntityPlayer.posX + 10.0D, Par3EntityPlayer.posY + 3.0D, Par3EntityPlayer.posZ + 10.0D));
              if (Par3EntityPlayer != null)
                for (int k2 = 0; k2 < list1.size(); k2++) {
                  if (!Par2World.isRemote) {
                    Entity entity = list1.get(k2);
                    String user = Par3EntityPlayer.getUniqueID().toString();
                    entity.getDistance(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ);
                    if (entity instanceof net.minecraft.entity.EntityLiving && entity instanceof EntityLivingBase) {
                      ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 4));
                      entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 1.0F);
                    } 
                    if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
                      ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 4));
                      entity.attackEntityFrom(DamageSource.causePlayerDamage(player), 1.0F);
                    } 
                  } 
                }  
            } 
            List<Entity> list = Par2World.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(player.posX - 3.0D, player.posY - 3.0D, player.posZ - 3.0D, player.posX + 3.0D, player.posY + 3.0D, player.posZ + 3.0D));
            if (Par3EntityPlayer != null)
              for (int k2 = 0; k2 < list.size(); k2++) {
                if (!Par2World.isRemote) {
                  Entity entity = list.get(k2);
                  String user = Par3EntityPlayer.getUniqueID().toString();
                  double d0 = entity.getDistance(player.posX, player.posY, player.posZ);
                  if (entity instanceof net.minecraft.entity.EntityLiving && 
                    entity instanceof EntityLivingBase) {
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
                  if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
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
                  Par1ItemStack.stackTagCompound.setInteger("kd", 80);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "A transformation on the Chidori");
    par3List.add(EnumChatFormatting.DARK_AQUA + "unleashing it in all directions");
    par3List.add(EnumChatFormatting.DARK_AQUA + "to damage and paralyze the opponent");
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: 8");
  }
}

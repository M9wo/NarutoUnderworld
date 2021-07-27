package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class LightningReleaseKirin extends JutsuItem {
  private float explosionRadius = 4.0F;
  
  public LightningReleaseKirin() {
    setMaxStackSize(1);
  }
  
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
      par1ItemStack.stackTagCompound.setBoolean("MistMode", false);
      par1ItemStack.stackTagCompound.setInteger("kd", 0);
    } 
    if (par1ItemStack.stackTagCompound != null && par1ItemStack.stackTagCompound.getInteger("kd") > 0) {
      int counter = par1ItemStack.stackTagCompound.getInteger("kd");
      par1ItemStack.stackTagCompound.setInteger("kd", --counter);
    } 
    boolean MistMode = par1ItemStack.stackTagCompound.getBoolean("MistMode");
    if (MistMode) {
      int counter = par1ItemStack.stackTagCompound.getInteger("counter");
      if (counter > 0) {
        counter--;
        par1ItemStack.stackTagCompound.setInteger("counter", counter);
      } 
      for (int i = 0; i < 10; i++)
        ((EntityPlayer)par3Entity).worldObj.spawnParticle("magicCrit", par3Entity.posX, par3Entity.posY + par2World.rand.nextDouble() * 1.0D, par3Entity.posZ, par2World.rand.nextGaussian(), 0.0D, par2World.rand.nextGaussian()); 
      if (((EntityPlayer)par3Entity).isInWater() || ((EntityPlayer)par3Entity).worldObj.getBlock(MathHelper.floor_double(((EntityPlayer)par3Entity).posX), MathHelper.floor_double(((EntityPlayer)par3Entity).posY - 0.2D - ((EntityPlayer)par3Entity).yOffset), MathHelper.floor_double(((EntityPlayer)par3Entity).posZ)) == Blocks.water) {
        List<Entity> list = par2World.getEntitiesWithinAABB(Entity.class, AxisAlignedBB.getBoundingBox(((EntityPlayer)par3Entity).posX - 20.0D, ((EntityPlayer)par3Entity).posY - 3.0D, ((EntityPlayer)par3Entity).posZ - 20.0D, ((EntityPlayer)par3Entity).posX + 20.0D, ((EntityPlayer)par3Entity).posY + 3.0D, ((EntityPlayer)par3Entity).posZ + 20.0D));
        if ((EntityPlayer)par3Entity != null)
          for (int k2 = 0; k2 < list.size(); k2++) {
            if (!par2World.isRemote) {
              Entity entity = list.get(k2);
              String user = ((EntityPlayer)par3Entity).getUniqueID().toString();
              entity.getDistance(((EntityPlayer)par3Entity).posX, ((EntityPlayer)par3Entity).posY, ((EntityPlayer)par3Entity).posZ);
              if (entity instanceof net.minecraft.entity.EntityLiving && entity instanceof EntityLivingBase) {
                ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 100));
                ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.jump.id, 20, -5));
                MistMode = false;
                par1ItemStack.stackTagCompound.setBoolean("MistMode", MistMode);
              } 
              if (entity instanceof EntityPlayer && !entity.getUniqueID().toString().equals(user)) {
                ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 20, 100));
                ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.jump.id, 20, -5));
                MistMode = false;
                par1ItemStack.stackTagCompound.setBoolean("MistMode", MistMode);
              } 
            } 
          }  
      } 
      if (counter == 0) {
        MistMode = false;
        par1ItemStack.stackTagCompound.setBoolean("MistMode", MistMode);
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
    ExtendedPlayer props = ExtendedPlayer.get(entityplayer);
    if (itemstack.stackTagCompound.getString("Owner").equals(entityplayer.getCommandSenderName()) && props.getLightningRelease() == 1 && props.getCurrentMana() >= 20 && itemstack.stackTagCompound.getInteger("kd") == 0) {
      boolean MistMode = itemstack.stackTagCompound.getBoolean("MistMode");
      itemstack.stackTagCompound.setInteger("kd", 600);
      MistMode = true;
      itemstack.stackTagCompound.setBoolean("MistMode", MistMode);
      if (world.getWorldInfo().isThundering() && world.getWorldInfo().isRaining()) {
        float f = 1.0F;
        float f1 = entityplayer.prevRotationPitch + (entityplayer.rotationPitch - entityplayer.prevRotationPitch) * f;
        float f2 = entityplayer.prevRotationYaw + (entityplayer.rotationYaw - entityplayer.prevRotationYaw) * f;
        double d = entityplayer.prevPosX + (entityplayer.posX - entityplayer.prevPosX) * f;
        double d1 = entityplayer.prevPosY + (entityplayer.posY - entityplayer.prevPosY) * f + 1.62D - entityplayer.yOffset;
        double d2 = entityplayer.prevPosZ + (entityplayer.posZ - entityplayer.prevPosZ) * f;
        Vec3 vec3d = Vec3.createVectorHelper(d, d1, d2);
        float f3 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
        float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
        float f5 = -MathHelper.cos(-f1 * 0.01745329F);
        float f6 = MathHelper.sin(-f1 * 0.01745329F);
        float f7 = f4 * f5;
        float f9 = f3 * f5;
        double d3 = 5000.0D;
        Vec3 vec3d1 = vec3d.addVector(f7 * d3, f6 * d3 + 1.0D, f9 * d3);
        MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3d, vec3d1, false);
        if (movingobjectposition == null)
          return itemstack; 
        if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
          int i = movingobjectposition.blockX;
          int j = movingobjectposition.blockY;
          int k = movingobjectposition.blockZ;
          entityplayer.worldObj.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          entityplayer.worldObj.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          entityplayer.worldObj.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          entityplayer.worldObj.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          entityplayer.worldObj.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          entityplayer.worldObj.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          entityplayer.worldObj.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          entityplayer.worldObj.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, (i + 1), j, k));
          entityplayer.worldObj.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, (k + 1)));
          entityplayer.worldObj.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, (i - 1), j, k));
          entityplayer.worldObj.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, (k - 1)));
          entityplayer.worldObj.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, (i + 2), j, k));
          entityplayer.worldObj.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, (k + 2)));
          entityplayer.worldObj.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, (i + 2), j, (k + 2)));
        } 
        props.consumeMana(4);
      } else if (!world.getWorldInfo().isThundering() && world.getWorldInfo().isRaining()) {
        float f = 1.0F;
        float f1 = entityplayer.prevRotationPitch + (entityplayer.rotationPitch - entityplayer.prevRotationPitch) * f;
        float f2 = entityplayer.prevRotationYaw + (entityplayer.rotationYaw - entityplayer.prevRotationYaw) * f;
        double d = entityplayer.prevPosX + (entityplayer.posX - entityplayer.prevPosX) * f;
        double d1 = entityplayer.prevPosY + (entityplayer.posY - entityplayer.prevPosY) * f + 1.62D - entityplayer.yOffset;
        double d2 = entityplayer.prevPosZ + (entityplayer.posZ - entityplayer.prevPosZ) * f;
        Vec3 vec3d = Vec3.createVectorHelper(d, d1, d2);
        float f3 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
        float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
        float f5 = -MathHelper.cos(-f1 * 0.01745329F);
        float f6 = MathHelper.sin(-f1 * 0.01745329F);
        float f7 = f4 * f5;
        float f9 = f3 * f5;
        double d3 = 5000.0D;
        Vec3 vec3d1 = vec3d.addVector(f7 * d3, f6 * d3 + 1.0D, f9 * d3);
        MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3d, vec3d1, false);
        if (movingobjectposition == null)
          return itemstack; 
        if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
          int i = movingobjectposition.blockX;
          int j = movingobjectposition.blockY;
          int k = movingobjectposition.blockZ;
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          entityplayer.worldObj.newExplosion((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k), i, j, k, 4.0F, false, false);
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, (i + 1), j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, (k + 1)));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, (i - 1), j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, (k - 1)));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, (i + 2), j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, (k + 2)));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, (i + 2), j, (k + 2)));
        } 
        props.consumeMana(15);
      } else if (!world.getWorldInfo().isThundering() && !world.getWorldInfo().isRaining()) {
        float f = 1.0F;
        float f1 = entityplayer.prevRotationPitch + (entityplayer.rotationPitch - entityplayer.prevRotationPitch) * f;
        float f2 = entityplayer.prevRotationYaw + (entityplayer.rotationYaw - entityplayer.prevRotationYaw) * f;
        double d = entityplayer.prevPosX + (entityplayer.posX - entityplayer.prevPosX) * f;
        double d1 = entityplayer.prevPosY + (entityplayer.posY - entityplayer.prevPosY) * f + 1.62D - entityplayer.yOffset;
        double d2 = entityplayer.prevPosZ + (entityplayer.posZ - entityplayer.prevPosZ) * f;
        Vec3 vec3d = Vec3.createVectorHelper(d, d1, d2);
        float f3 = MathHelper.cos(-f2 * 0.01745329F - 3.141593F);
        float f4 = MathHelper.sin(-f2 * 0.01745329F - 3.141593F);
        float f5 = -MathHelper.cos(-f1 * 0.01745329F);
        float f6 = MathHelper.sin(-f1 * 0.01745329F);
        float f7 = f4 * f5;
        float f9 = f3 * f5;
        double d3 = 5000.0D;
        Vec3 vec3d1 = vec3d.addVector(f7 * d3, f6 * d3 + 1.0D, f9 * d3);
        MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3d, vec3d1, false);
        if (movingobjectposition == null)
          return itemstack; 
        if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
          int i = movingobjectposition.blockX;
          int j = movingobjectposition.blockY;
          int k = movingobjectposition.blockZ;
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k));
          entityplayer.worldObj.newExplosion((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, k), i, j, k, 4.0F, false, false);
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, (i + 1), j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, (k + 1)));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, (i - 1), j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, (k - 1)));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, (i + 2), j, k));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, i, j, (k + 2)));
          world.spawnEntityInWorld((Entity)new EntityLightningBolt(entityplayer.worldObj, (i + 2), j, (k + 2)));
        } 
        props.consumeMana(50);
      } 
    } 
    return itemstack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A jutsu that tames lightning");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Costs huge amounts of chakra");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Unless used in a thunderstorm");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Thunder striking down wherever the");
    par3List.add(EnumChatFormatting.DARK_AQUA + "user aims");
    par3List.add(EnumChatFormatting.GOLD + "Minimum Chakra Cost: " + '\024');
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: ??");
  }
}

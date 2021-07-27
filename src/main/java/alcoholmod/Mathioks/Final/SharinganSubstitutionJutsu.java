package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.FinalUtilities.SubstitutionUtil;
import alcoholmod.Mathioks.Jutsu.EntityCrowDisguiseJutsu;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SharinganSubstitutionJutsu extends Item {
  private boolean isinair;
  
  private SubstitutionUtil SubstitutionUtil;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if (par1ItemStack.getItemDamage() < par1ItemStack.getMaxDamage())
      par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() - 1); 
    if (par5 && par3Entity instanceof EntityPlayer) {
      EntityPlayer entityplayer = (EntityPlayer)par3Entity;
      if (par1ItemStack.getItemDamage() > 0);
    } 
    if (par1ItemStack.getItemDamage() < par1ItemStack.getMaxDamage() && par3Entity instanceof EntityPlayer) {
      EntityPlayer entityplayer = (EntityPlayer)par3Entity;
      if (this.isinair)
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
  
  public SharinganSubstitutionJutsu() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      for (int i = 0; i < 32; i++) {
        Par2World.spawnParticle("smoke", Par3EntityPlayer.posX, Par3EntityPlayer.posY + Par2World.rand.nextDouble() * 2.0D, Par3EntityPlayer.posZ, Par2World.rand.nextGaussian(), 0.0D, Par2World.rand.nextGaussian());
        Par2World.spawnParticle("smoke", Par3EntityPlayer.posX, Par3EntityPlayer.posY + Par2World.rand.nextDouble() * 2.0D, Par3EntityPlayer.posZ, Par2World.rand.nextGaussian(), 0.0D, Par2World.rand.nextGaussian());
        Par2World.spawnParticle("smoke", Par3EntityPlayer.posX, Par3EntityPlayer.posY + Par2World.rand.nextDouble() * 2.0D, Par3EntityPlayer.posZ, Par2World.rand.nextGaussian(), 0.0D, Par2World.rand.nextGaussian());
      } 
      this.SubstitutionUtil = new SubstitutionUtil(Par2World, (EntityLivingBase)Par3EntityPlayer);
      Par2World.spawnEntityInWorld((Entity)this.SubstitutionUtil);
      EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu = new EntityCrowDisguiseJutsu(Par2World);
      EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu1 = new EntityCrowDisguiseJutsu(Par2World);
      EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu2 = new EntityCrowDisguiseJutsu(Par2World);
      EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu3 = new EntityCrowDisguiseJutsu(Par2World);
      EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu4 = new EntityCrowDisguiseJutsu(Par2World);
      EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu5 = new EntityCrowDisguiseJutsu(Par2World);
      EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu6 = new EntityCrowDisguiseJutsu(Par2World);
      EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu7 = new EntityCrowDisguiseJutsu(Par2World);
      EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu8 = new EntityCrowDisguiseJutsu(Par2World);
      EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu9 = new EntityCrowDisguiseJutsu(Par2World);
      EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu10 = new EntityCrowDisguiseJutsu(Par2World);
      EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu13 = new EntityCrowDisguiseJutsu(Par2World);
      EntityCrowDisguiseJutsu EntityCrowDisguiseJutsu12 = new EntityCrowDisguiseJutsu(Par2World);
      EntityCrowDisguiseJutsu entitycrow = new EntityCrowDisguiseJutsu(Par2World);
      EntityCrowDisguiseJutsu1.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
      EntityCrowDisguiseJutsu1.setTamed(true);
      EntityCrowDisguiseJutsu2.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
      EntityCrowDisguiseJutsu2.setTamed(true);
      EntityCrowDisguiseJutsu3.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
      EntityCrowDisguiseJutsu3.setTamed(true);
      EntityCrowDisguiseJutsu4.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
      EntityCrowDisguiseJutsu4.setTamed(true);
      EntityCrowDisguiseJutsu5.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
      EntityCrowDisguiseJutsu5.setTamed(true);
      EntityCrowDisguiseJutsu6.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
      EntityCrowDisguiseJutsu6.setTamed(true);
      EntityCrowDisguiseJutsu7.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
      EntityCrowDisguiseJutsu7.setTamed(true);
      EntityCrowDisguiseJutsu8.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
      EntityCrowDisguiseJutsu8.setTamed(true);
      EntityCrowDisguiseJutsu9.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
      EntityCrowDisguiseJutsu9.setTamed(true);
      EntityCrowDisguiseJutsu10.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
      EntityCrowDisguiseJutsu10.setTamed(true);
      EntityCrowDisguiseJutsu12.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
      EntityCrowDisguiseJutsu12.setTamed(true);
      EntityCrowDisguiseJutsu13.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
      EntityCrowDisguiseJutsu13.setTamed(true);
      EntityCrowDisguiseJutsu.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
      EntityCrowDisguiseJutsu.rotationYawHead = EntityCrowDisguiseJutsu.rotationYaw;
      EntityCrowDisguiseJutsu.renderYawOffset = EntityCrowDisguiseJutsu.rotationYaw;
      Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu);
      EntityCrowDisguiseJutsu1.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
      EntityCrowDisguiseJutsu1.rotationYawHead = EntityCrowDisguiseJutsu1.rotationYaw;
      EntityCrowDisguiseJutsu1.renderYawOffset = EntityCrowDisguiseJutsu1.rotationYaw;
      Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu1);
      EntityCrowDisguiseJutsu2.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
      EntityCrowDisguiseJutsu2.rotationYawHead = EntityCrowDisguiseJutsu2.rotationYaw;
      EntityCrowDisguiseJutsu2.renderYawOffset = EntityCrowDisguiseJutsu2.rotationYaw;
      Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu2);
      EntityCrowDisguiseJutsu3.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
      EntityCrowDisguiseJutsu3.rotationYawHead = EntityCrowDisguiseJutsu3.rotationYaw;
      EntityCrowDisguiseJutsu3.renderYawOffset = EntityCrowDisguiseJutsu3.rotationYaw;
      Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu3);
      EntityCrowDisguiseJutsu4.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
      EntityCrowDisguiseJutsu4.rotationYawHead = EntityCrowDisguiseJutsu4.rotationYaw;
      EntityCrowDisguiseJutsu4.renderYawOffset = EntityCrowDisguiseJutsu4.rotationYaw;
      Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu4);
      EntityCrowDisguiseJutsu5.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
      EntityCrowDisguiseJutsu5.rotationYawHead = EntityCrowDisguiseJutsu5.rotationYaw;
      EntityCrowDisguiseJutsu5.renderYawOffset = EntityCrowDisguiseJutsu5.rotationYaw;
      Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu5);
      EntityCrowDisguiseJutsu6.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
      EntityCrowDisguiseJutsu6.rotationYawHead = EntityCrowDisguiseJutsu6.rotationYaw;
      EntityCrowDisguiseJutsu6.renderYawOffset = EntityCrowDisguiseJutsu6.rotationYaw;
      Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu6);
      EntityCrowDisguiseJutsu7.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
      EntityCrowDisguiseJutsu7.rotationYawHead = EntityCrowDisguiseJutsu7.rotationYaw;
      EntityCrowDisguiseJutsu7.renderYawOffset = EntityCrowDisguiseJutsu7.rotationYaw;
      Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu7);
      EntityCrowDisguiseJutsu8.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
      EntityCrowDisguiseJutsu8.rotationYawHead = EntityCrowDisguiseJutsu8.rotationYaw;
      EntityCrowDisguiseJutsu8.renderYawOffset = EntityCrowDisguiseJutsu8.rotationYaw;
      Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu8);
      EntityCrowDisguiseJutsu9.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
      EntityCrowDisguiseJutsu9.rotationYawHead = EntityCrowDisguiseJutsu9.rotationYaw;
      EntityCrowDisguiseJutsu9.renderYawOffset = EntityCrowDisguiseJutsu9.rotationYaw;
      Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu9);
      EntityCrowDisguiseJutsu10.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
      EntityCrowDisguiseJutsu10.rotationYawHead = EntityCrowDisguiseJutsu10.rotationYaw;
      EntityCrowDisguiseJutsu10.renderYawOffset = EntityCrowDisguiseJutsu10.rotationYaw;
      Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu10);
      EntityCrowDisguiseJutsu12.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
      EntityCrowDisguiseJutsu12.rotationYawHead = EntityCrowDisguiseJutsu12.rotationYaw;
      EntityCrowDisguiseJutsu12.renderYawOffset = EntityCrowDisguiseJutsu12.rotationYaw;
      Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu12);
      EntityCrowDisguiseJutsu13.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ + 2.0D, Par3EntityPlayer.rotationYaw, 0.0F);
      EntityCrowDisguiseJutsu13.rotationYawHead = EntityCrowDisguiseJutsu13.rotationYaw;
      EntityCrowDisguiseJutsu13.renderYawOffset = EntityCrowDisguiseJutsu13.rotationYaw;
      Par2World.spawnEntityInWorld((Entity)EntityCrowDisguiseJutsu13);
      entitycrow.func_152115_b(Par3EntityPlayer.getUniqueID().toString());
      entitycrow.setTamed(true);
      entitycrow.setPositionAndRotation(Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, Par3EntityPlayer.rotationYaw, 0.0F);
      entitycrow.rotationYawHead = entitycrow.rotationYaw;
      entitycrow.renderYawOffset = entitycrow.rotationYaw;
      Par2World.spawnEntityInWorld((Entity)entitycrow);
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 40, 7));
      Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.invisibility.id, 40, 1));
    } 
    return Par1ItemStack;
  }
}

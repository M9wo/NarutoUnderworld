package alcoholmod.Mathioks.block;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BloodPrisonBlock extends Block {
  @SideOnly(Side.CLIENT)
  private static IIcon field_149837_b;
  
  @SideOnly(Side.CLIENT)
  private static IIcon field_149839_N;
  
  @SideOnly(Side.CLIENT)
  public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
    return (p_149691_2_ == 1) ? field_149839_N : field_149837_b;
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister p_149651_1_) {
    field_149837_b = p_149651_1_.registerIcon("tm:BloodPrisonBlock");
    field_149839_N = p_149651_1_.registerIcon("tm:BloodPrisonBlock");
  }
  
  protected BloodPrisonBlock() {
    super(Material.iron);
    setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.9F, 1.0F);
    setBlockTextureName("tm:BloodPrisonBlock");
    setHardness(200.0F);
    setResistance(100.0F);
    setBlockName("BloodPrisonBlock");
  }
  
  public int damageDropped(int p_149692_1_) {
    return p_149692_1_;
  }
  
  public void onFallenUpon(World par1World, int par2, int par3, int par4, Entity par5Entity, float par6) {
    par5Entity.fallDistance = 0.0F;
  }
  
  public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_) {
    p_149670_5_.motionX *= 0.0D;
    p_149670_5_.motionY *= 0.0D;
    p_149670_5_.motionZ *= 0.0D;
    if (p_149670_5_ instanceof EntityLivingBase) {
      ((EntityLivingBase)p_149670_5_).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, -5));
      ((EntityLivingBase)p_149670_5_).addPotionEffect(new PotionEffect(Potion.jump.id, 10, -1));
      ((EntityLivingBase)p_149670_5_).addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 10, 20));
      double i = MathHelper.floor_double(p_149670_5_.posX);
      double j = MathHelper.floor_double(p_149670_5_.posY);
      double d1 = MathHelper.floor_double(p_149670_5_.posZ);
    } 
    p_149670_5_.setInWeb();
    p_149670_5_.onGround = true;
    if (p_149670_5_ instanceof EntityPlayer) {
      EntityPlayer player = (EntityPlayer)p_149670_5_;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (props.getCurrentMana() >= 1)
        props.setCurrentMana(0); 
    } 
  }
}

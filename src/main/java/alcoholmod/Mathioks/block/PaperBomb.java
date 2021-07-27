package alcoholmod.Mathioks.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class PaperBomb extends Block {
  private static final String __OBFID = "CL_00000309";
  
  private int counter = 0;
  
  protected PaperBomb() {
    super(Material.cloth);
    setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
    setTickRandomly(true);
    setBlockTextureName("tm:PaperBomb");
    setBlockName("PaperBomb");
    setHardness(1.0F);
    setResistance(1.0F);
    func_150154_b(0);
  }
  
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister p_149651_1_) {
    this.blockIcon = p_149651_1_.registerIcon("tm:PaperBomb");
  }
  
  public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_) {
    if (p_149670_5_ instanceof EntityLivingBase) {
      p_149670_1_.newExplosion((Entity)null, ((EntityLivingBase)p_149670_5_).posX, ((EntityLivingBase)p_149670_5_).posY, ((EntityLivingBase)p_149670_5_).posZ, 1.0F, false, false);
      p_149670_1_.setBlockToAir(p_149670_2_, p_149670_3_, p_149670_4_);
    } 
  }
  
  public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
    int l = p_149668_1_.getBlockMetadata(p_149668_2_, p_149668_3_, p_149668_4_) & 0x7;
    float f = 0.125F;
    return AxisAlignedBB.getBoundingBox(p_149668_2_ + this.minX, p_149668_3_ + this.minY, p_149668_4_ + this.minZ, p_149668_2_ + this.maxX, (p_149668_3_ + l * f), p_149668_4_ + this.maxZ);
  }
  
  public boolean isOpaqueCube() {
    return false;
  }
  
  public boolean renderAsNormalBlock() {
    return false;
  }
  
  public void setBlockBoundsForItemRender() {
    func_150154_b(0);
  }
  
  public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_) {
    func_150154_b(p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_));
  }
  
  protected void func_150154_b(int p_150154_1_) {
    int j = p_150154_1_ & 0x7;
    float f = (2 * (1 + j)) / 16.0F;
    setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
  }
  
  @SideOnly(Side.CLIENT)
  public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_) {
    return (p_149646_5_ == 1) ? true : super.shouldSideBeRendered(p_149646_1_, p_149646_2_, p_149646_3_, p_149646_4_, p_149646_5_);
  }
  
  public int quantityDropped(int meta, int fortune, Random random) {
    return (meta & 0x7) + 1;
  }
  
  public boolean isReplaceable(IBlockAccess world, int x, int y, int z) {
    int meta = world.getBlockMetadata(x, y, z);
    return (meta >= 7) ? false : this.blockMaterial.isReplaceable();
  }
}
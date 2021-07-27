package alcoholmod.Mathioks.Final.Summons.Entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

@SideOnly(Side.CLIENT)
public class SummonGarudaModel extends ModelBiped {
  private static final String __OBFID = "CL_00000869";
  
  public SummonGarudaModel() {
    this(0.0F, false);
  }
  
  protected SummonGarudaModel(float p_i1167_1_, float p_i1167_2_, int p_i1167_3_, int p_i1167_4_) {
    super(p_i1167_1_, p_i1167_2_, p_i1167_3_, p_i1167_4_);
  }
  
  public SummonGarudaModel(float p_i1168_1_, boolean p_i1168_2_) {
    super(p_i1168_1_, 0.0F, 64, p_i1168_2_ ? 32 : 64);
  }
  
  public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_) {
    super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, p_78087_7_);
    float f6 = MathHelper.sin(this.onGround * 3.1415927F);
    float f7 = MathHelper.sin((1.0F - (1.0F - this.onGround) * (1.0F - this.onGround)) * 3.1415927F);
    this.bipedRightArm.rotateAngleZ = 0.0F;
    this.bipedLeftArm.rotateAngleZ = 0.0F;
    this.bipedRightArm.rotateAngleY = -(0.1F - f6 * 0.6F);
    this.bipedLeftArm.rotateAngleY = 0.1F - f6 * 0.6F;
    this.bipedRightArm.rotateAngleX = -1.5707964F;
    this.bipedLeftArm.rotateAngleX = -1.5707964F;
    ModelRenderer var10000 = this.bipedRightArm;
    var10000.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
    var10000 = this.bipedLeftArm;
    var10000.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
    var10000 = this.bipedRightArm;
    var10000.rotateAngleZ += MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
    var10000 = this.bipedLeftArm;
    var10000.rotateAngleZ -= MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
    var10000 = this.bipedRightArm;
    var10000.rotateAngleX += MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
    var10000 = this.bipedLeftArm;
    var10000.rotateAngleX -= MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
  }
}

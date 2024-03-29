package alcoholmod.Mathioks.Final;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

@SideOnly(Side.CLIENT)
public class ExplosiveClaySpidersModel extends ModelBase {
  public ModelRenderer spiderHead;
  
  public ModelRenderer spiderNeck;
  
  public ModelRenderer spiderBody;
  
  public ModelRenderer spiderLeg1;
  
  public ModelRenderer spiderLeg2;
  
  public ModelRenderer spiderLeg3;
  
  public ModelRenderer spiderLeg4;
  
  public ModelRenderer spiderLeg5;
  
  public ModelRenderer spiderLeg6;
  
  public ModelRenderer spiderLeg7;
  
  public ModelRenderer spiderLeg8;
  
  private static final String __OBFID = "CL_00000860";
  
  public ExplosiveClaySpidersModel() {
    float f = 0.0F;
    byte b0 = 15;
    this.spiderHead = new ModelRenderer(this, 32, 4);
    this.spiderHead.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, f);
    this.spiderHead.setRotationPoint(0.0F, b0, -3.0F);
    this.spiderNeck = new ModelRenderer(this, 0, 0);
    this.spiderNeck.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6, f);
    this.spiderNeck.setRotationPoint(0.0F, b0, 0.0F);
    this.spiderBody = new ModelRenderer(this, 0, 12);
    this.spiderBody.addBox(-5.0F, -4.0F, -6.0F, 10, 8, 12, f);
    this.spiderBody.setRotationPoint(0.0F, b0, 9.0F);
    this.spiderLeg1 = new ModelRenderer(this, 18, 0);
    this.spiderLeg1.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, f);
    this.spiderLeg1.setRotationPoint(-4.0F, b0, 2.0F);
    this.spiderLeg2 = new ModelRenderer(this, 18, 0);
    this.spiderLeg2.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, f);
    this.spiderLeg2.setRotationPoint(4.0F, b0, 2.0F);
    this.spiderLeg3 = new ModelRenderer(this, 18, 0);
    this.spiderLeg3.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, f);
    this.spiderLeg3.setRotationPoint(-4.0F, b0, 1.0F);
    this.spiderLeg4 = new ModelRenderer(this, 18, 0);
    this.spiderLeg4.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, f);
    this.spiderLeg4.setRotationPoint(4.0F, b0, 1.0F);
    this.spiderLeg5 = new ModelRenderer(this, 18, 0);
    this.spiderLeg5.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, f);
    this.spiderLeg5.setRotationPoint(-4.0F, b0, 0.0F);
    this.spiderLeg6 = new ModelRenderer(this, 18, 0);
    this.spiderLeg6.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, f);
    this.spiderLeg6.setRotationPoint(4.0F, b0, 0.0F);
    this.spiderLeg7 = new ModelRenderer(this, 18, 0);
    this.spiderLeg7.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, f);
    this.spiderLeg7.setRotationPoint(-4.0F, b0, -1.0F);
    this.spiderLeg8 = new ModelRenderer(this, 18, 0);
    this.spiderLeg8.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, f);
    this.spiderLeg8.setRotationPoint(4.0F, b0, -1.0F);
  }
  
  public void render(Entity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {
    setRotationAngles(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_, p_78088_1_);
    this.spiderHead.render(p_78088_7_);
    this.spiderNeck.render(p_78088_7_);
    this.spiderBody.render(p_78088_7_);
    this.spiderLeg1.render(p_78088_7_);
    this.spiderLeg2.render(p_78088_7_);
    this.spiderLeg3.render(p_78088_7_);
    this.spiderLeg4.render(p_78088_7_);
    this.spiderLeg5.render(p_78088_7_);
    this.spiderLeg6.render(p_78088_7_);
    this.spiderLeg7.render(p_78088_7_);
    this.spiderLeg8.render(p_78088_7_);
  }
  
  public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_) {
    this.spiderHead.rotateAngleY = p_78087_4_ / 57.295776F;
    this.spiderHead.rotateAngleX = p_78087_5_ / 57.295776F;
    float f6 = 0.7853982F;
    this.spiderLeg1.rotateAngleZ = -f6;
    this.spiderLeg2.rotateAngleZ = f6;
    this.spiderLeg3.rotateAngleZ = -f6 * 0.74F;
    this.spiderLeg4.rotateAngleZ = f6 * 0.74F;
    this.spiderLeg5.rotateAngleZ = -f6 * 0.74F;
    this.spiderLeg6.rotateAngleZ = f6 * 0.74F;
    this.spiderLeg7.rotateAngleZ = -f6;
    this.spiderLeg8.rotateAngleZ = f6;
    float f7 = -0.0F;
    float f8 = 0.3926991F;
    this.spiderLeg1.rotateAngleY = f8 * 2.0F + f7;
    this.spiderLeg2.rotateAngleY = -f8 * 2.0F - f7;
    this.spiderLeg3.rotateAngleY = f8 * 1.0F + f7;
    this.spiderLeg4.rotateAngleY = -f8 * 1.0F - f7;
    this.spiderLeg5.rotateAngleY = -f8 * 1.0F + f7;
    this.spiderLeg6.rotateAngleY = f8 * 1.0F - f7;
    this.spiderLeg7.rotateAngleY = -f8 * 2.0F + f7;
    this.spiderLeg8.rotateAngleY = f8 * 2.0F - f7;
    float f9 = -(MathHelper.cos(p_78087_1_ * 0.6662F * 2.0F + 0.0F) * 0.4F) * p_78087_2_;
    float f10 = -(MathHelper.cos(p_78087_1_ * 0.6662F * 2.0F + 3.1415927F) * 0.4F) * p_78087_2_;
    float f11 = -(MathHelper.cos(p_78087_1_ * 0.6662F * 2.0F + 1.5707964F) * 0.4F) * p_78087_2_;
    float f12 = -(MathHelper.cos(p_78087_1_ * 0.6662F * 2.0F + 4.712389F) * 0.4F) * p_78087_2_;
    float f13 = Math.abs(MathHelper.sin(p_78087_1_ * 0.6662F + 0.0F) * 0.4F) * p_78087_2_;
    float f14 = Math.abs(MathHelper.sin(p_78087_1_ * 0.6662F + 3.1415927F) * 0.4F) * p_78087_2_;
    float f15 = Math.abs(MathHelper.sin(p_78087_1_ * 0.6662F + 1.5707964F) * 0.4F) * p_78087_2_;
    float f16 = Math.abs(MathHelper.sin(p_78087_1_ * 0.6662F + 4.712389F) * 0.4F) * p_78087_2_;
    ModelRenderer var10000 = this.spiderLeg1;
    var10000.rotateAngleY += f9;
    var10000 = this.spiderLeg2;
    var10000.rotateAngleY += -f9;
    var10000 = this.spiderLeg3;
    var10000.rotateAngleY += f10;
    var10000 = this.spiderLeg4;
    var10000.rotateAngleY += -f10;
    var10000 = this.spiderLeg5;
    var10000.rotateAngleY += f11;
    var10000 = this.spiderLeg6;
    var10000.rotateAngleY += -f11;
    var10000 = this.spiderLeg7;
    var10000.rotateAngleY += f12;
    var10000 = this.spiderLeg8;
    var10000.rotateAngleY += -f12;
    var10000 = this.spiderLeg1;
    var10000.rotateAngleZ += f13;
    var10000 = this.spiderLeg2;
    var10000.rotateAngleZ += -f13;
    var10000 = this.spiderLeg3;
    var10000.rotateAngleZ += f14;
    var10000 = this.spiderLeg4;
    var10000.rotateAngleZ += -f14;
    var10000 = this.spiderLeg5;
    var10000.rotateAngleZ += f15;
    var10000 = this.spiderLeg6;
    var10000.rotateAngleZ += -f15;
    var10000 = this.spiderLeg7;
    var10000.rotateAngleZ += f16;
    var10000 = this.spiderLeg8;
    var10000.rotateAngleZ += -f16;
  }
}

package alcoholmod.Mathioks.SixPaths;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

public class ModelGiantRhino extends ModelBase {
  ModelRenderer Spike;
  
  ModelRenderer body;
  
  ModelRenderer leg1;
  
  ModelRenderer leg2;
  
  ModelRenderer leg3;
  
  ModelRenderer leg4;
  
  ModelRenderer nose;
  
  ModelRenderer head;
  
  public ModelGiantRhino() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.Spike = new ModelRenderer(this, 0, 0);
    this.Spike.addBox(-4.0F, -3.0F, -6.0F, 8, 7, 6);
    this.Spike.setRotationPoint(0.0F, 4.0F, -8.0F);
    this.Spike.setTextureSize(64, 32);
    this.Spike.mirror = true;
    setRotation(this.Spike, 0.0F, 0.0F, 0.0F);
    this.body = new ModelRenderer(this, 18, 4);
    this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10);
    this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 1.570796F, 0.0F, 0.0F);
    this.leg1 = new ModelRenderer(this, 0, 16);
    this.leg1.addBox(-3.0F, 0.0F, -2.0F, 4, 12, 4);
    this.leg1.setRotationPoint(-3.0F, 12.0F, 7.0F);
    this.leg1.setTextureSize(64, 32);
    this.leg1.mirror = true;
    setRotation(this.leg1, 0.0F, 0.0F, 0.0F);
    this.leg2 = new ModelRenderer(this, 0, 16);
    this.leg2.addBox(-1.0F, 0.0F, -2.0F, 4, 12, 4);
    this.leg2.setRotationPoint(3.0F, 12.0F, 7.0F);
    this.leg2.setTextureSize(64, 32);
    this.leg2.mirror = true;
    setRotation(this.leg2, 0.0F, 0.0F, 0.0F);
    this.leg3 = new ModelRenderer(this, 0, 16);
    this.leg3.addBox(-3.0F, 0.0F, -3.0F, 4, 12, 4);
    this.leg3.setRotationPoint(-3.0F, 12.0F, -5.0F);
    this.leg3.setTextureSize(64, 32);
    this.leg3.mirror = true;
    setRotation(this.leg3, 0.0F, 0.0F, 0.0F);
    this.leg4 = new ModelRenderer(this, 0, 16);
    this.leg4.addBox(-1.0F, 0.0F, -3.0F, 4, 12, 4);
    this.leg4.setRotationPoint(3.0F, 12.0F, -5.0F);
    this.leg4.setTextureSize(64, 32);
    this.leg4.mirror = true;
    setRotation(this.leg4, 0.0F, 0.0F, 0.0F);
    this.nose = new ModelRenderer(this, 0, 0);
    this.nose.addBox(0.0F, 0.0F, 0.0F, 6, 3, 4);
    this.nose.setRotationPoint(-3.0F, 7.0F, -14.0F);
    this.nose.setTextureSize(64, 32);
    this.nose.mirror = true;
    setRotation(this.nose, -3.141593F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(0.0F, -5.0F, 0.0F, 1, 8, 1);
    this.head.setRotationPoint(-1.0F, 3.0F, -16.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, -3.141593F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Spike.render(f5);
    this.body.render(f5);
    this.leg1.render(f5);
    this.leg2.render(f5);
    this.leg3.render(f5);
    this.leg4.render(f5);
    this.nose.render(f5);
    this.head.render(f5);
  }
  
  public void setLivingAnimations(EntityLivingBase p_78086_1_, float p_78086_2_, float p_78086_3_, float p_78086_4_) {
    EntityGiantRhino entityGiantRhino = (EntityGiantRhino)p_78086_1_;
    this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
    this.body.rotateAngleX = 1.5707964F;
    this.leg1.setRotationPoint(-3.0F, 12.0F, 7.0F);
    this.leg2.setRotationPoint(3.0F, 12.0F, 7.0F);
    this.leg3.setRotationPoint(-3.0F, 12.0F, -5.0F);
    this.leg4.setRotationPoint(3.0F, 12.0F, -5.0F);
    this.leg1.rotateAngleX = MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_;
    this.leg2.rotateAngleX = MathHelper.cos(p_78086_2_ * 0.6662F + 3.1415927F) * 1.4F * p_78086_3_;
    this.leg3.rotateAngleX = MathHelper.cos(p_78086_2_ * 0.6662F + 3.1415927F) * 1.4F * p_78086_3_;
    this.leg4.rotateAngleX = MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_;
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
}

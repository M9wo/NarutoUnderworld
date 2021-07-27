package alcoholmod.Mathioks.Jutsu;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

public class StormReleaseBlackHunting2Model extends ModelBase {
  ModelRenderer WolfHead;
  
  ModelRenderer Body;
  
  ModelRenderer Mane;
  
  ModelRenderer Leg1;
  
  ModelRenderer Leg2;
  
  ModelRenderer Leg3;
  
  ModelRenderer Leg4;
  
  ModelRenderer Tail;
  
  ModelRenderer Ear1;
  
  ModelRenderer Ear2;
  
  ModelRenderer Nose;
  
  public StormReleaseBlackHunting2Model() {
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.WolfHead = new ModelRenderer(this, 0, 0);
    this.WolfHead.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4);
    this.WolfHead.setRotationPoint(-1.0F, 13.5F, -7.0F);
    this.WolfHead.setTextureSize(64, 64);
    this.WolfHead.mirror = true;
    setRotation(this.WolfHead, 0.0F, 0.0F, 0.0F);
    this.Body = new ModelRenderer(this, 18, 14);
    this.Body.addBox(-4.0F, -2.0F, -3.0F, 6, 9, 6);
    this.Body.setRotationPoint(0.0F, 14.0F, 2.0F);
    this.Body.setTextureSize(64, 64);
    this.Body.mirror = true;
    setRotation(this.Body, 1.570796F, 0.0F, 0.0F);
    this.Mane = new ModelRenderer(this, 21, 0);
    this.Mane.addBox(-4.0F, -3.0F, -3.0F, 8, 6, 7);
    this.Mane.setRotationPoint(-1.0F, 14.0F, -3.0F);
    this.Mane.setTextureSize(64, 64);
    this.Mane.mirror = true;
    setRotation(this.Mane, 1.570796F, 0.0F, 0.0F);
    this.Leg1 = new ModelRenderer(this, 0, 18);
    this.Leg1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
    this.Leg1.setRotationPoint(-2.5F, 16.0F, 7.0F);
    this.Leg1.setTextureSize(64, 64);
    this.Leg1.mirror = true;
    setRotation(this.Leg1, 0.0F, 0.0F, 0.0F);
    this.Leg2 = new ModelRenderer(this, 0, 18);
    this.Leg2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
    this.Leg2.setRotationPoint(0.5F, 16.0F, 7.0F);
    this.Leg2.setTextureSize(64, 64);
    this.Leg2.mirror = true;
    setRotation(this.Leg2, 0.0F, 0.0F, 0.0F);
    this.Leg3 = new ModelRenderer(this, 0, 18);
    this.Leg3.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
    this.Leg3.setRotationPoint(-2.5F, 16.0F, -4.0F);
    this.Leg3.setTextureSize(64, 64);
    this.Leg3.mirror = true;
    setRotation(this.Leg3, 0.0F, 0.0F, 0.0F);
    this.Leg4 = new ModelRenderer(this, 0, 18);
    this.Leg4.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
    this.Leg4.setRotationPoint(0.5F, 16.0F, -4.0F);
    this.Leg4.setTextureSize(64, 64);
    this.Leg4.mirror = true;
    setRotation(this.Leg4, 0.0F, 0.0F, 0.0F);
    this.Tail = new ModelRenderer(this, 9, 18);
    this.Tail.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
    this.Tail.setRotationPoint(-1.0F, 12.0F, 8.0F);
    this.Tail.setTextureSize(64, 64);
    this.Tail.mirror = true;
    setRotation(this.Tail, 1.130069F, 0.0F, 0.0F);
    this.Ear1 = new ModelRenderer(this, 16, 14);
    this.Ear1.addBox(-3.0F, -5.0F, 0.0F, 2, 2, 1);
    this.Ear1.setRotationPoint(-1.0F, 13.5F, -7.0F);
    this.Ear1.setTextureSize(64, 64);
    this.Ear1.mirror = true;
    setRotation(this.Ear1, 0.0F, 0.0F, 0.0F);
    this.Ear2 = new ModelRenderer(this, 16, 14);
    this.Ear2.addBox(1.0F, -5.0F, 0.0F, 2, 2, 1);
    this.Ear2.setRotationPoint(-1.0F, 13.5F, -7.0F);
    this.Ear2.setTextureSize(64, 64);
    this.Ear2.mirror = true;
    setRotation(this.Ear2, 0.0F, 0.0F, 0.0F);
    this.Nose = new ModelRenderer(this, 0, 10);
    this.Nose.addBox(-2.0F, 0.0F, -5.0F, 3, 3, 4);
    this.Nose.setRotationPoint(-0.5F, 13.5F, -7.0F);
    this.Nose.setTextureSize(64, 64);
    this.Nose.mirror = true;
    setRotation(this.Nose, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.WolfHead.render(f5);
    this.Body.render(f5);
    this.Mane.render(f5);
    this.Leg1.render(f5);
    this.Leg2.render(f5);
    this.Leg3.render(f5);
    this.Leg4.render(f5);
    this.Tail.render(f5);
    this.Ear1.render(f5);
    this.Ear2.render(f5);
    this.Nose.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float f6 = 57.295776F;
  }
  
  public void setLivingAnimations(EntityLivingBase p_78086_1_, float p_78086_2_, float p_78086_3_, float p_78086_4_) {
    StormReleaseBlackHunting2Entity StormReleaseBlackHunting2Entity = (StormReleaseBlackHunting2Entity)p_78086_1_;
    if (StormReleaseBlackHunting2Entity.isAngry()) {
      this.Tail.rotateAngleY = 0.0F;
    } else {
      this.Tail.rotateAngleY = MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_;
    } 
    if (StormReleaseBlackHunting2Entity.isSitting()) {
      this.Mane.setRotationPoint(-1.0F, 16.0F, -3.0F);
      this.Mane.rotateAngleX = 1.2566371F;
      this.Mane.rotateAngleY = 0.0F;
      this.Body.setRotationPoint(0.0F, 18.0F, 0.0F);
      this.Body.rotateAngleX = 0.7853982F;
      this.Tail.setRotationPoint(-1.0F, 21.0F, 6.0F);
      this.Leg1.setRotationPoint(-2.5F, 22.0F, 2.0F);
      this.Leg1.rotateAngleX = 4.712389F;
      this.Leg2.setRotationPoint(0.5F, 22.0F, 2.0F);
      this.Leg2.rotateAngleX = 4.712389F;
      this.Leg3.rotateAngleX = 5.811947F;
      this.Leg3.setRotationPoint(-2.49F, 17.0F, -4.0F);
      this.Leg4.rotateAngleX = 5.811947F;
      this.Leg4.setRotationPoint(0.51F, 17.0F, -4.0F);
    } else {
      this.Body.setRotationPoint(0.0F, 14.0F, 2.0F);
      this.Body.rotateAngleX = 1.5707964F;
      this.Mane.setRotationPoint(-1.0F, 14.0F, -3.0F);
      this.Mane.rotateAngleX = this.Body.rotateAngleX;
      this.Tail.setRotationPoint(-1.0F, 12.0F, 8.0F);
      this.Leg1.setRotationPoint(-2.5F, 16.0F, 7.0F);
      this.Leg2.setRotationPoint(0.5F, 16.0F, 7.0F);
      this.Leg3.setRotationPoint(-2.5F, 16.0F, -4.0F);
      this.Leg4.setRotationPoint(0.5F, 16.0F, -4.0F);
      this.Leg1.rotateAngleX = MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_;
      this.Leg2.rotateAngleX = MathHelper.cos(p_78086_2_ * 0.6662F + 3.1415927F) * 1.4F * p_78086_3_;
      this.Leg3.rotateAngleX = MathHelper.cos(p_78086_2_ * 0.6662F + 3.1415927F) * 1.4F * p_78086_3_;
      this.Leg4.rotateAngleX = MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_;
    } 
  }
}

package alcoholmod.Mathioks.Jutsu;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class StormReleaseBlackHuntingModel extends ModelBase {
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
  
  ModelRenderer WolfHead2;
  
  ModelRenderer Body2;
  
  ModelRenderer Mane2;
  
  ModelRenderer Leg12;
  
  ModelRenderer Leg22;
  
  ModelRenderer Leg32;
  
  ModelRenderer Leg42;
  
  ModelRenderer Tail2;
  
  ModelRenderer Ear12;
  
  ModelRenderer Ear22;
  
  ModelRenderer Nose2;
  
  public StormReleaseBlackHuntingModel() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.WolfHead = new ModelRenderer(this, 0, 0);
    this.WolfHead.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4);
    this.WolfHead.setRotationPoint(9.0F, 13.5F, -7.0F);
    this.WolfHead.setTextureSize(64, 32);
    this.WolfHead.mirror = true;
    setRotation(this.WolfHead, 0.0F, 0.0F, 0.0F);
    this.Body = new ModelRenderer(this, 18, 14);
    this.Body.addBox(-4.0F, -2.0F, -3.0F, 6, 9, 6);
    this.Body.setRotationPoint(10.0F, 14.0F, 2.0F);
    this.Body.setTextureSize(64, 32);
    this.Body.mirror = true;
    setRotation(this.Body, 1.570796F, 0.0F, 0.0F);
    this.Mane = new ModelRenderer(this, 21, 0);
    this.Mane.addBox(-4.0F, -3.0F, -3.0F, 8, 6, 7);
    this.Mane.setRotationPoint(9.0F, 14.0F, -3.0F);
    this.Mane.setTextureSize(64, 32);
    this.Mane.mirror = true;
    setRotation(this.Mane, 1.570796F, 0.0F, 0.0F);
    this.Leg1 = new ModelRenderer(this, 0, 18);
    this.Leg1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
    this.Leg1.setRotationPoint(7.5F, 16.0F, 7.0F);
    this.Leg1.setTextureSize(64, 32);
    this.Leg1.mirror = true;
    setRotation(this.Leg1, 0.0F, 0.0F, 0.0F);
    this.Leg2 = new ModelRenderer(this, 0, 18);
    this.Leg2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
    this.Leg2.setRotationPoint(10.5F, 16.0F, 7.0F);
    this.Leg2.setTextureSize(64, 32);
    this.Leg2.mirror = true;
    setRotation(this.Leg2, 0.0F, 0.0F, 0.0F);
    this.Leg3 = new ModelRenderer(this, 0, 18);
    this.Leg3.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
    this.Leg3.setRotationPoint(7.5F, 16.0F, -4.0F);
    this.Leg3.setTextureSize(64, 32);
    this.Leg3.mirror = true;
    setRotation(this.Leg3, 0.0F, 0.0F, 0.0F);
    this.Leg4 = new ModelRenderer(this, 0, 18);
    this.Leg4.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
    this.Leg4.setRotationPoint(10.5F, 16.0F, -4.0F);
    this.Leg4.setTextureSize(64, 32);
    this.Leg4.mirror = true;
    setRotation(this.Leg4, 0.0F, 0.0F, 0.0F);
    this.Tail = new ModelRenderer(this, 9, 18);
    this.Tail.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
    this.Tail.setRotationPoint(9.0F, 12.0F, 8.0F);
    this.Tail.setTextureSize(64, 32);
    this.Tail.mirror = true;
    setRotation(this.Tail, 1.130069F, 0.0F, 0.0F);
    this.Ear1 = new ModelRenderer(this, 16, 14);
    this.Ear1.addBox(-3.0F, -5.0F, 0.0F, 2, 2, 1);
    this.Ear1.setRotationPoint(9.0F, 13.5F, -7.0F);
    this.Ear1.setTextureSize(64, 32);
    this.Ear1.mirror = true;
    setRotation(this.Ear1, 0.0F, 0.0F, 0.0F);
    this.Ear2 = new ModelRenderer(this, 16, 14);
    this.Ear2.addBox(1.0F, -5.0F, 0.0F, 2, 2, 1);
    this.Ear2.setRotationPoint(9.0F, 13.5F, -7.0F);
    this.Ear2.setTextureSize(64, 32);
    this.Ear2.mirror = true;
    setRotation(this.Ear2, 0.0F, 0.0F, 0.0F);
    this.Nose = new ModelRenderer(this, 0, 10);
    this.Nose.addBox(-2.0F, 0.0F, -5.0F, 3, 3, 4);
    this.Nose.setRotationPoint(9.5F, 13.5F, -7.0F);
    this.Nose.setTextureSize(64, 32);
    this.Nose.mirror = true;
    setRotation(this.Nose, 0.0F, 0.0F, 0.0F);
    this.WolfHead2 = new ModelRenderer(this, 0, 0);
    this.WolfHead2.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4);
    this.WolfHead2.setRotationPoint(-11.0F, 13.5F, -7.0F);
    this.WolfHead2.setTextureSize(64, 32);
    this.WolfHead2.mirror = true;
    setRotation(this.WolfHead2, 0.0F, 0.0F, 0.0F);
    this.Body2 = new ModelRenderer(this, 18, 14);
    this.Body2.addBox(-4.0F, -2.0F, -3.0F, 6, 9, 6);
    this.Body2.setRotationPoint(-10.0F, 14.0F, 2.0F);
    this.Body2.setTextureSize(64, 32);
    this.Body2.mirror = true;
    setRotation(this.Body2, 1.570796F, 0.0F, 0.0F);
    this.Mane2 = new ModelRenderer(this, 21, 0);
    this.Mane2.addBox(-4.0F, -3.0F, -3.0F, 8, 6, 7);
    this.Mane2.setRotationPoint(-11.0F, 14.0F, -3.0F);
    this.Mane2.setTextureSize(64, 32);
    this.Mane2.mirror = true;
    setRotation(this.Mane2, 1.570796F, 0.0F, 0.0F);
    this.Leg12 = new ModelRenderer(this, 0, 18);
    this.Leg12.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
    this.Leg12.setRotationPoint(-12.5F, 16.0F, 7.0F);
    this.Leg12.setTextureSize(64, 32);
    this.Leg12.mirror = true;
    setRotation(this.Leg12, 0.0F, 0.0F, 0.0F);
    this.Leg22 = new ModelRenderer(this, 0, 18);
    this.Leg22.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
    this.Leg22.setRotationPoint(-9.5F, 16.0F, 7.0F);
    this.Leg22.setTextureSize(64, 32);
    this.Leg22.mirror = true;
    setRotation(this.Leg22, 0.0F, 0.0F, 0.0F);
    this.Leg32 = new ModelRenderer(this, 0, 18);
    this.Leg32.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
    this.Leg32.setRotationPoint(-12.5F, 16.0F, -4.0F);
    this.Leg32.setTextureSize(64, 32);
    this.Leg32.mirror = true;
    setRotation(this.Leg32, 0.0F, 0.0F, 0.0F);
    this.Leg42 = new ModelRenderer(this, 0, 18);
    this.Leg42.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
    this.Leg42.setRotationPoint(-9.5F, 16.0F, -4.0F);
    this.Leg42.setTextureSize(64, 32);
    this.Leg42.mirror = true;
    setRotation(this.Leg42, 0.0F, 0.0F, 0.0F);
    this.Tail2 = new ModelRenderer(this, 9, 18);
    this.Tail2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2);
    this.Tail2.setRotationPoint(-11.0F, 12.0F, 8.0F);
    this.Tail2.setTextureSize(64, 32);
    this.Tail2.mirror = true;
    setRotation(this.Tail2, 1.130069F, 0.0F, 0.0F);
    this.Ear12 = new ModelRenderer(this, 16, 14);
    this.Ear12.addBox(-3.0F, -5.0F, 0.0F, 2, 2, 1);
    this.Ear12.setRotationPoint(-11.0F, 13.5F, -7.0F);
    this.Ear12.setTextureSize(64, 32);
    this.Ear12.mirror = true;
    setRotation(this.Ear12, 0.0F, 0.0F, 0.0F);
    this.Ear22 = new ModelRenderer(this, 16, 14);
    this.Ear22.addBox(1.0F, -5.0F, 0.0F, 2, 2, 1);
    this.Ear22.setRotationPoint(-11.0F, 13.5F, -7.0F);
    this.Ear22.setTextureSize(64, 32);
    this.Ear22.mirror = true;
    setRotation(this.Ear22, 0.0F, 0.0F, 0.0F);
    this.Nose2 = new ModelRenderer(this, 0, 10);
    this.Nose2.addBox(-2.0F, 0.0F, -5.0F, 3, 3, 4);
    this.Nose2.setRotationPoint(-10.5F, 13.5F, -7.0F);
    this.Nose2.setTextureSize(64, 32);
    this.Nose2.mirror = true;
    setRotation(this.Nose2, 0.0F, 0.0F, 0.0F);
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
    this.WolfHead2.render(f5);
    this.Body2.render(f5);
    this.Mane2.render(f5);
    this.Leg12.render(f5);
    this.Leg22.render(f5);
    this.Leg32.render(f5);
    this.Leg42.render(f5);
    this.Tail2.render(f5);
    this.Ear12.render(f5);
    this.Ear22.render(f5);
    this.Nose2.render(f5);
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

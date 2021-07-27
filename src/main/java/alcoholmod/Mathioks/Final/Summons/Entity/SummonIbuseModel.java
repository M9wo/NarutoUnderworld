package alcoholmod.Mathioks.Final.Summons.Entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SummonIbuseModel extends ModelBase {
  ModelRenderer Shape1;
  
  ModelRenderer head;
  
  ModelRenderer body;
  
  ModelRenderer leg1;
  
  ModelRenderer leg2;
  
  ModelRenderer leg3;
  
  ModelRenderer leg4;
  
  public SummonIbuseModel() {
    this.textureWidth = 64;
    this.textureHeight = 128;
    this.Shape1 = new ModelRenderer(this, 2, 57);
    this.Shape1.addBox(-5.0F, 0.0F, 0.0F, 10, 7, 8);
    this.Shape1.setRotationPoint(0.0F, 11.0F, 10.0F);
    this.Shape1.setTextureSize(64, 128);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, -0.2094395F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 2, 34);
    this.head.addBox(-4.0F, -4.0F, -6.0F, 12, 10, 10);
    this.head.setRotationPoint(-2.0F, 11.0F, -12.0F);
    this.head.setTextureSize(64, 128);
    this.head.mirror = true;
    setRotation(this.head, -0.0174533F, 0.0F, 0.0F);
    this.body = new ModelRenderer(this, 18, 1);
    this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 19, 10);
    this.body.setRotationPoint(0.0F, 12.0F, 1.0F);
    this.body.setTextureSize(64, 128);
    this.body.mirror = true;
    setRotation(this.body, 1.396263F, 0.0F, 0.0F);
    this.leg1 = new ModelRenderer(this, 0, 16);
    this.leg1.addBox(-3.0F, 0.0F, -2.0F, 4, 8, 4);
    this.leg1.setRotationPoint(-3.0F, 16.0F, 7.0F);
    this.leg1.setTextureSize(64, 128);
    this.leg1.mirror = true;
    setRotation(this.leg1, 0.0F, 0.0F, 0.0F);
    this.leg2 = new ModelRenderer(this, 0, 16);
    this.leg2.addBox(-1.0F, 0.0F, -2.0F, 4, 8, 4);
    this.leg2.setRotationPoint(3.0F, 16.0F, 7.0F);
    this.leg2.setTextureSize(64, 128);
    this.leg2.mirror = true;
    setRotation(this.leg2, 0.0F, 0.0F, 0.0F);
    this.leg3 = new ModelRenderer(this, 0, 16);
    this.leg3.addBox(-3.0F, 0.0F, -3.0F, 4, 8, 4);
    this.leg3.setRotationPoint(-3.0F, 16.0F, -5.0F);
    this.leg3.setTextureSize(64, 128);
    this.leg3.mirror = true;
    setRotation(this.leg3, 0.0F, 0.0F, 0.0F);
    this.leg4 = new ModelRenderer(this, 0, 16);
    this.leg4.addBox(-1.0F, 0.0F, -3.0F, 4, 8, 4);
    this.leg4.setRotationPoint(3.0F, 16.0F, -5.0F);
    this.leg4.setTextureSize(64, 128);
    this.leg4.mirror = true;
    setRotation(this.leg4, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Shape1.render(f5);
    this.head.render(f5);
    this.body.render(f5);
    this.leg1.render(f5);
    this.leg2.render(f5);
    this.leg3.render(f5);
    this.leg4.render(f5);
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

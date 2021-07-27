package alcoholmod.Mathioks.Final.CT;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class WaterSharkModel extends ModelBase {
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
  ModelRenderer Shape3;
  
  ModelRenderer Shape4;
  
  ModelRenderer Shape5;
  
  ModelRenderer Shape6;
  
  ModelRenderer Shape7;
  
  ModelRenderer Shape8;
  
  public WaterSharkModel() {
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(-2.0F, -2.0F, -5.0F, 5, 5, 10);
    this.Shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape1.setTextureSize(64, 64);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 0, 0);
    this.Shape2.addBox(0.0F, -6.0F, -4.0F, 1, 4, 2);
    this.Shape2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape2.setTextureSize(64, 64);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 0, 0);
    this.Shape3.addBox(0.0F, -7.0F, -2.0F, 1, 5, 3);
    this.Shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape3.setTextureSize(64, 64);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
    this.Shape4 = new ModelRenderer(this, 0, 0);
    this.Shape4.addBox(-4.266667F, 1.0F, -3.733333F, 2, 1, 7);
    this.Shape4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape4.setTextureSize(64, 64);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, 0.0F, -0.4363323F, 0.0F);
    this.Shape5 = new ModelRenderer(this, 0, 0);
    this.Shape5.addBox(3.166667F, 1.0F, -3.3F, 2, 1, 7);
    this.Shape5.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape5.setTextureSize(64, 64);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, 0.0F, 0.4363323F, 0.0F);
    this.Shape6 = new ModelRenderer(this, 0, 0);
    this.Shape6.addBox(-2.0F, -1.5F, -8.0F, 5, 4, 3);
    this.Shape6.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape6.setTextureSize(64, 64);
    this.Shape6.mirror = true;
    setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
    this.Shape7 = new ModelRenderer(this, 0, 0);
    this.Shape7.addBox(-0.5F, -0.5F, 5.0F, 2, 2, 3);
    this.Shape7.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape7.setTextureSize(64, 64);
    this.Shape7.mirror = true;
    setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
    this.Shape8 = new ModelRenderer(this, 0, 0);
    this.Shape8.addBox(-0.5F, -2.5F, 0.0F, 2, 6, 2);
    this.Shape8.setRotationPoint(0.0F, 0.0F, 8.0F);
    this.Shape8.setTextureSize(64, 64);
    this.Shape8.mirror = true;
    setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    this.Shape1.render(f5);
    this.Shape2.render(f5);
    this.Shape3.render(f5);
    this.Shape4.render(f5);
    this.Shape5.render(f5);
    this.Shape6.render(f5);
    this.Shape7.render(f5);
    this.Shape8.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    setRotationAngles(f, f1, f2, f3, f4, f5, (Entity)null);
  }
}

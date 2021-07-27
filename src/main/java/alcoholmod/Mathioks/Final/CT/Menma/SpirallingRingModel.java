package alcoholmod.Mathioks.Final.CT.Menma;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SpirallingRingModel extends ModelBase {
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
  ModelRenderer Shape3;
  
  ModelRenderer Shape4;
  
  ModelRenderer Shape5;
  
  ModelRenderer Shape6;
  
  ModelRenderer Shape7;
  
  ModelRenderer Shape8;
  
  ModelRenderer Shape9;
  
  public SpirallingRingModel() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3);
    this.Shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape1.setTextureSize(64, 32);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 0, 0);
    this.Shape2.addBox(0.0F, 0.0F, 0.0F, 1, 0, 4);
    this.Shape2.setRotationPoint(-3.333333F, 1.0F, -0.4666667F);
    this.Shape2.setTextureSize(64, 32);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 0, 0);
    this.Shape3.addBox(0.0F, 0.0F, 0.0F, 1, 0, 4);
    this.Shape3.setRotationPoint(-3.533333F, 1.0F, 3.466667F);
    this.Shape3.setTextureSize(64, 32);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, 0.7772533F, 0.0F);
    this.Shape4 = new ModelRenderer(this, 0, 0);
    this.Shape4.addBox(0.0F, 0.0F, 0.0F, 1, 0, 4);
    this.Shape4.setRotationPoint(2.8F, 1.0F, -2.4F);
    this.Shape4.setTextureSize(64, 32);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, 0.0F, 0.8447394F, 0.0F);
    this.Shape5 = new ModelRenderer(this, 0, 0);
    this.Shape5.addBox(0.0F, 0.0F, 0.0F, 1, 0, 4);
    this.Shape5.setRotationPoint(5.333333F, 1.0F, -0.4666667F);
    this.Shape5.setTextureSize(64, 32);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
    this.Shape6 = new ModelRenderer(this, 0, 0);
    this.Shape6.addBox(0.0F, 0.0F, 0.0F, 4, 0, 1);
    this.Shape6.setRotationPoint(-0.6F, 1.0F, 5.266667F);
    this.Shape6.setTextureSize(64, 32);
    this.Shape6.mirror = true;
    setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
    this.Shape7 = new ModelRenderer(this, 0, 0);
    this.Shape7.addBox(0.0F, 0.0F, 0.0F, 4, 0, 1);
    this.Shape7.setRotationPoint(-0.3333333F, 1.0F, -3.066667F);
    this.Shape7.setTextureSize(64, 32);
    this.Shape7.mirror = true;
    setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
    this.Shape8 = new ModelRenderer(this, 0, 0);
    this.Shape8.addBox(0.0F, 0.0F, 0.0F, 1, 0, 4);
    this.Shape8.setRotationPoint(3.4F, 1.0F, 6.266667F);
    this.Shape8.setTextureSize(64, 32);
    this.Shape8.mirror = true;
    setRotation(this.Shape8, 0.0F, 2.31547F, 0.0F);
    this.Shape9 = new ModelRenderer(this, 0, 0);
    this.Shape9.addBox(0.0F, 0.0F, 0.0F, 1, 0, 4);
    this.Shape9.setRotationPoint(-2.733333F, 1.0F, 0.4F);
    this.Shape9.setTextureSize(64, 32);
    this.Shape9.mirror = true;
    setRotation(this.Shape9, 0.0F, 2.31547F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Shape1.render(f5);
    this.Shape2.render(f5);
    this.Shape3.render(f5);
    this.Shape4.render(f5);
    this.Shape5.render(f5);
    this.Shape6.render(f5);
    this.Shape7.render(f5);
    this.Shape8.render(f5);
    this.Shape9.render(f5);
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

package alcoholmod.Mathioks.Final.Transformations;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CurseMark2Model extends ModelBase {
  ModelRenderer Shape1;
  
  ModelRenderer Shape4;
  
  ModelRenderer Shape5;
  
  ModelRenderer Shape2;
  
  ModelRenderer Shape6;
  
  ModelRenderer Shape3;
  
  ModelRenderer Shape7;
  
  ModelRenderer Shape8;
  
  ModelRenderer Shape9;
  
  ModelRenderer Shape10;
  
  ModelRenderer Shape35;
  
  public CurseMark2Model() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(-3.0F, -2.0F, 0.0F, 4, 3, 8);
    this.Shape1.setRotationPoint(0.7333333F, 10.0F, 0.0F);
    this.Shape1.setTextureSize(64, 32);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, -0.780744F, 0.0F, 0.0F);
    this.Shape4 = new ModelRenderer(this, 0, 0);
    this.Shape4.addBox(-2.0F, 0.0F, 0.0F, 3, 2, 8);
    this.Shape4.setRotationPoint(0.2666667F, 13.86667F, 5.6F);
    this.Shape4.setTextureSize(64, 32);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, -0.5084726F, 0.0F, 0.0F);
    this.Shape5 = new ModelRenderer(this, 0, 0);
    this.Shape5.addBox(0.0F, 0.0F, 0.0F, 2, 1, 5);
    this.Shape5.setRotationPoint(-1.2F, 17.5F, 11.0F);
    this.Shape5.setTextureSize(64, 32);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, -0.4037528F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 0, 0);
    this.Shape2.addBox(0.0F, 0.0F, 0.0F, 8, 8, 2);
    this.Shape2.setRotationPoint(-4.0F, 1.0F, 2.0F);
    this.Shape2.setTextureSize(64, 32);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
    this.Shape6 = new ModelRenderer(this, 0, 0);
    this.Shape6.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1);
    this.Shape6.setRotationPoint(-0.5333334F, 1.0F, 4.0F);
    this.Shape6.setTextureSize(64, 32);
    this.Shape6.mirror = true;
    setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 0, 0);
    this.Shape3.addBox(0.0F, 0.0F, 0.0F, 11, 3, 2);
    this.Shape3.setRotationPoint(2.0F, 0.0F, 2.0F);
    this.Shape3.setTextureSize(64, 32);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, -0.0756309F, -0.2338741F);
    this.Shape7 = new ModelRenderer(this, 0, 0);
    this.Shape7.addBox(0.0F, 0.0F, 0.0F, 11, 3, 2);
    this.Shape7.setRotationPoint(3.0F, 3.666667F, 2.0F);
    this.Shape7.setTextureSize(64, 32);
    this.Shape7.mirror = true;
    setRotation(this.Shape7, 0.0F, -0.1407893F, 0.0F);
    this.Shape8 = new ModelRenderer(this, 0, 0);
    this.Shape8.addBox(0.0F, 0.0F, 0.0F, 11, 3, 2);
    this.Shape8.setRotationPoint(3.0F, 7.0F, 2.0F);
    this.Shape8.setTextureSize(64, 32);
    this.Shape8.mirror = true;
    setRotation(this.Shape8, 0.0F, -0.1419529F, 0.2396919F);
    this.Shape9 = new ModelRenderer(this, 0, 0);
    this.Shape9.addBox(-10.0F, 0.0F, 0.0F, 11, 3, 2);
    this.Shape9.setRotationPoint(-3.0F, 0.0F, 2.0F);
    this.Shape9.setTextureSize(64, 32);
    this.Shape9.mirror = true;
    setRotation(this.Shape9, 0.0F, 0.0523605F, 0.1931498F);
    this.Shape10 = new ModelRenderer(this, 0, 0);
    this.Shape10.addBox(-11.0F, 0.0F, 0.0F, 11, 3, 2);
    this.Shape10.setRotationPoint(-3.0F, 3.7F, 2.0F);
    this.Shape10.setTextureSize(64, 32);
    this.Shape10.mirror = true;
    setRotation(this.Shape10, 0.0F, 0.1454447F, 0.0F);
    this.Shape35 = new ModelRenderer(this, 0, 0);
    this.Shape35.addBox(-11.0F, 0.0F, 0.0F, 11, 3, 2);
    this.Shape35.setRotationPoint(-3.0F, 7.0F, 2.0F);
    this.Shape35.setTextureSize(64, 32);
    this.Shape35.mirror = true;
    setRotation(this.Shape35, 0.0F, 0.1605709F, -0.3607014F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Shape1.render(f5);
    this.Shape4.render(f5);
    this.Shape5.render(f5);
    this.Shape2.render(f5);
    this.Shape6.render(f5);
    this.Shape3.render(f5);
    this.Shape7.render(f5);
    this.Shape8.render(f5);
    this.Shape9.render(f5);
    this.Shape10.render(f5);
    this.Shape35.render(f5);
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
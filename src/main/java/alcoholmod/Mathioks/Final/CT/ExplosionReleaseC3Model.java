package alcoholmod.Mathioks.Final.CT;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ExplosionReleaseC3Model extends ModelBase {
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
  ModelRenderer Shape3;
  
  ModelRenderer Shape4;
  
  ModelRenderer Shape5;
  
  ModelRenderer Shape6;
  
  ModelRenderer Shape7;
  
  ModelRenderer Shape8;
  
  ModelRenderer Shape9;
  
  public ExplosionReleaseC3Model() {
    this.textureWidth = 183;
    this.textureHeight = 128;
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(0.0F, 0.0F, 0.0F, 28, 32, 28);
    this.Shape1.setRotationPoint(-14.0F, -49.0F, -14.0F);
    this.Shape1.setTextureSize(183, 128);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 0, 0);
    this.Shape2.addBox(0.0F, 0.0F, 0.0F, 28, 36, 28);
    this.Shape2.setRotationPoint(-14.0F, -18.0F, -14.0F);
    this.Shape2.setTextureSize(183, 128);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 0, 0);
    this.Shape3.addBox(0.0F, 0.0F, 0.0F, 28, 28, 36);
    this.Shape3.setRotationPoint(-14.0F, -14.0F, -18.0F);
    this.Shape3.setTextureSize(183, 128);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
    this.Shape4 = new ModelRenderer(this, 0, 0);
    this.Shape4.addBox(0.0F, 0.0F, 0.0F, 36, 28, 28);
    this.Shape4.setRotationPoint(-18.0F, -14.0F, -14.0F);
    this.Shape4.setTextureSize(183, 128);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
    this.Shape5 = new ModelRenderer(this, 0, 67);
    this.Shape5.addBox(0.0F, 0.0F, 0.0F, 12, 24, 12);
    this.Shape5.setRotationPoint(-6.0F, -62.0F, -6.0F);
    this.Shape5.setTextureSize(183, 128);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
    this.Shape6 = new ModelRenderer(this, 0, 0);
    this.Shape6.addBox(0.0F, 0.0F, 0.0F, 44, 10, 4);
    this.Shape6.setRotationPoint(-50.0F, -64.8F, -1.0F);
    this.Shape6.setTextureSize(183, 128);
    this.Shape6.mirror = true;
    setRotation(this.Shape6, 0.0F, 0.0F, 0.418879F);
    this.Shape7 = new ModelRenderer(this, 0, 0);
    this.Shape7.addBox(0.0F, 0.0F, -2.0F, 26, 26, 4);
    this.Shape7.setRotationPoint(53.5F, -57.18667F, 1.0F);
    this.Shape7.setTextureSize(183, 128);
    this.Shape7.mirror = true;
    setRotation(this.Shape7, 0.0F, 0.0F, 1.117011F);
    this.Shape8 = new ModelRenderer(this, 0, 0);
    this.Shape8.addBox(0.0F, 0.0F, 0.0F, 44, 10, 4);
    this.Shape8.setRotationPoint(10.0F, -47.0F, -1.0F);
    this.Shape8.setTextureSize(183, 128);
    this.Shape8.mirror = true;
    setRotation(this.Shape8, 0.0F, 0.0F, -0.418879F);
    this.Shape9 = new ModelRenderer(this, 0, 0);
    this.Shape9.addBox(0.0F, 0.0F, -2.0F, 26, 26, 4);
    this.Shape9.setRotationPoint(-64.2F, -35.18667F, 1.0F);
    this.Shape9.setTextureSize(183, 128);
    this.Shape9.mirror = true;
    setRotation(this.Shape9, 0.0F, 0.0F, -1.117011F);
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

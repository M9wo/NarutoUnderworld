package alcoholmod.Mathioks.SevenSwordsmen;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Hiramekarei extends ModelBase {
  ModelRenderer Shape2;
  
  ModelRenderer Shape4;
  
  ModelRenderer Shape5;
  
  ModelRenderer Shape6;
  
  ModelRenderer Shape7;
  
  public Hiramekarei() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.Shape2 = new ModelRenderer(this, 0, 0);
    this.Shape2.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 1);
    this.Shape2.setRotationPoint(0.5F, -11.0F, 0.0F);
    this.Shape2.setTextureSize(64, 32);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.7853982F);
    this.Shape4 = new ModelRenderer(this, 0, 0);
    this.Shape4.addBox(0.0F, 0.0F, 0.0F, 1, 31, 1);
    this.Shape4.setRotationPoint(0.0F, -7.0F, 0.0F);
    this.Shape4.setTextureSize(64, 32);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
    this.Shape5 = new ModelRenderer(this, 0, 0);
    this.Shape5.addBox(-1.0F, -1.0F, 0.0F, 6, 1, 1);
    this.Shape5.setRotationPoint(0.5F, -11.0F, 0.0F);
    this.Shape5.setTextureSize(64, 32);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, 0.0F, 0.0F, 0.7853982F);
    this.Shape6 = new ModelRenderer(this, 0, 0);
    this.Shape6.addBox(1.0F, 4.0F, 0.0F, 3, 1, 1);
    this.Shape6.setRotationPoint(0.5F, -11.0F, 0.0F);
    this.Shape6.setTextureSize(64, 32);
    this.Shape6.mirror = true;
    setRotation(this.Shape6, 0.0F, 0.0F, 0.7853982F);
    this.Shape7 = new ModelRenderer(this, 0, 0);
    this.Shape7.addBox(4.0F, 0.0F, 0.0F, 1, 5, 1);
    this.Shape7.setRotationPoint(0.5F, -11.0F, 0.0F);
    this.Shape7.setTextureSize(64, 32);
    this.Shape7.mirror = true;
    setRotation(this.Shape7, 0.0F, 0.0F, 0.7853982F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Shape2.render(f5);
    this.Shape4.render(f5);
    this.Shape5.render(f5);
    this.Shape6.render(f5);
    this.Shape7.render(f5);
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

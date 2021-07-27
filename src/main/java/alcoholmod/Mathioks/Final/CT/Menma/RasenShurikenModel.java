package alcoholmod.Mathioks.Final.CT.Menma;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class RasenShurikenModel extends ModelBase {
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
  ModelRenderer Shape3;
  
  ModelRenderer Shape4;
  
  ModelRenderer Shape5;
  
  public RasenShurikenModel() {
    this.textureWidth = 256;
    this.textureHeight = 256;
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8);
    this.Shape1.setRotationPoint(-4.0F, 4.0F, -4.0F);
    this.Shape1.setTextureSize(256, 256);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 0, 0);
    this.Shape2.addBox(0.0F, 0.0F, 0.0F, 6, 10, 6);
    this.Shape2.setRotationPoint(-3.0F, 3.0F, -3.0F);
    this.Shape2.setTextureSize(256, 256);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 0, 0);
    this.Shape3.addBox(0.0F, 0.0F, 0.0F, 10, 6, 6);
    this.Shape3.setRotationPoint(-5.0F, 5.0F, -3.0F);
    this.Shape3.setTextureSize(256, 256);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
    this.Shape4 = new ModelRenderer(this, 0, 0);
    this.Shape4.addBox(0.0F, 0.0F, 0.0F, 6, 6, 10);
    this.Shape4.setRotationPoint(-3.0F, 5.0F, -5.0F);
    this.Shape4.setTextureSize(256, 256);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
    this.Shape5 = new ModelRenderer(this, 0, 0);
    this.Shape5.addBox(-40.0F, 0.0F, -40.0F, 80, 0, 80);
    this.Shape5.setRotationPoint(0.0F, 8.0F, 0.0F);
    this.Shape5.setTextureSize(256, 256);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Shape1.render(f5);
    this.Shape2.render(f5);
    this.Shape3.render(f5);
    this.Shape4.render(f5);
    this.Shape5.render(f5);
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

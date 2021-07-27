package alcoholmod.Mathioks.Weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SNDKatanaModel extends ModelBase {
  ModelRenderer Shape2;
  
  ModelRenderer Shape3;
  
  ModelRenderer Shape4;
  
  ModelRenderer Shape5;
  
  ModelRenderer Shape1;
  
  public SNDKatanaModel() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.Shape2 = new ModelRenderer(this, 0, 20);
    this.Shape2.addBox(0.0F, 0.0F, 0.0F, 3, 1, 0);
    this.Shape2.setRotationPoint(-0.4F, 23.4F, 0.0F);
    this.Shape2.setTextureSize(64, 32);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, -1.27409F);
    this.Shape3 = new ModelRenderer(this, 12, 0);
    this.Shape3.addBox(0.0F, 0.0F, 0.0F, 2, 28, 0);
    this.Shape3.setRotationPoint(-0.5F, -7.0F, 0.0F);
    this.Shape3.setTextureSize(64, 32);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
    this.Shape4 = new ModelRenderer(this, 0, 23);
    this.Shape4.addBox(0.0F, 0.0F, 0.0F, 4, 1, 0);
    this.Shape4.setRotationPoint(-0.5F, 24.0F, 0.0F);
    this.Shape4.setTextureSize(64, 32);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, 0.0F, 0.0F, -1.570796F);
    this.Shape5 = new ModelRenderer(this, 0, 0);
    this.Shape5.addBox(0.0F, 0.0F, 0.0F, 3, 11, 2);
    this.Shape5.setRotationPoint(-1.0F, -16.0F, -1.0F);
    this.Shape5.setTextureSize(64, 32);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
    this.Shape1 = new ModelRenderer(this, 18, 14);
    this.Shape1.addBox(0.0F, 0.0F, 0.0F, 5, 1, 4);
    this.Shape1.setRotationPoint(-2.0F, -6.0F, -2.0F);
    this.Shape1.setTextureSize(64, 32);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Shape2.render(f5);
    this.Shape3.render(f5);
    this.Shape4.render(f5);
    this.Shape5.render(f5);
    this.Shape1.render(f5);
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

package alcoholmod.Mathioks.Final.Transformations;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAshuraMode extends ModelBase {
  ModelRenderer leftarm;
  
  ModelRenderer leftarm2;
  
  ModelRenderer rightarm;
  
  ModelRenderer rightarm2;
  
  ModelRenderer Shape1;
  
  ModelRenderer Shape12;
  
  ModelRenderer Shape13;
  
  ModelRenderer Shape14;
  
  ModelRenderer Shape145;
  
  ModelRenderer Shape16;
  
  ModelRenderer Shape17;
  
  public ModelAshuraMode() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.leftarm = new ModelRenderer(this, 40, 16);
    this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
    this.leftarm.setRotationPoint(5.0F, 3.0F, 0.0F);
    this.leftarm.setTextureSize(64, 32);
    this.leftarm.mirror = true;
    setRotation(this.leftarm, 0.0F, 0.0F, -1.026254F);
    this.leftarm2 = new ModelRenderer(this, 40, 16);
    this.leftarm2.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
    this.leftarm2.setRotationPoint(6.0F, 2.0F, 0.0F);
    this.leftarm2.setTextureSize(64, 32);
    this.leftarm2.mirror = true;
    setRotation(this.leftarm2, 0.0F, 0.0F, -2.023418F);
    this.rightarm = new ModelRenderer(this, 40, 16);
    this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
    this.rightarm.setRotationPoint(-6.0F, 2.0F, 0.0F);
    this.rightarm.setTextureSize(64, 32);
    this.rightarm.mirror = true;
    setRotation(this.rightarm, 0.0F, 0.0F, 2.007129F);
    this.rightarm2 = new ModelRenderer(this, 40, 16);
    this.rightarm2.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
    this.rightarm2.setRotationPoint(-5.0F, 3.0F, 0.0F);
    this.rightarm2.setTextureSize(64, 32);
    this.rightarm2.mirror = true;
    setRotation(this.rightarm2, 0.0F, 0.0F, 1.012291F);
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(0.0F, 0.0F, 0.0F, 4, 1, 8);
    this.Shape1.setRotationPoint(-2.0F, 8.0F, 0.0F);
    this.Shape1.setTextureSize(64, 32);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape12 = new ModelRenderer(this, 0, 0);
    this.Shape12.addBox(0.0F, 0.0F, 0.0F, 4, 1, 8);
    this.Shape12.setRotationPoint(-2.0F, 8.0F, 7.0F);
    this.Shape12.setTextureSize(64, 32);
    this.Shape12.mirror = true;
    setRotation(this.Shape12, 0.9052441F, 0.0F, 0.0F);
    this.Shape13 = new ModelRenderer(this, 0, 0);
    this.Shape13.addBox(0.0F, 0.0F, 0.0F, 4, 1, 9);
    this.Shape13.setRotationPoint(-2.0F, 2.0F, 12.0F);
    this.Shape13.setTextureSize(64, 32);
    this.Shape13.mirror = true;
    setRotation(this.Shape13, 1.570796F, 0.0F, 0.0F);
    this.Shape14 = new ModelRenderer(this, 0, 0);
    this.Shape14.addBox(0.0F, 0.0F, 0.0F, 5, 1, 9);
    this.Shape14.setRotationPoint(-2.5F, -7.0F, 12.0F);
    this.Shape14.setTextureSize(64, 32);
    this.Shape14.mirror = true;
    setRotation(this.Shape14, 2.4039F, 0.0F, 0.0F);
    this.Shape145 = new ModelRenderer(this, 0, 0);
    this.Shape145.addBox(0.0F, 0.0F, 0.0F, 6, 1, 15);
    this.Shape145.setRotationPoint(-3.0F, -14.0F, -9.0F);
    this.Shape145.setTextureSize(64, 32);
    this.Shape145.mirror = true;
    setRotation(this.Shape145, 0.0F, 0.0F, 0.0F);
    this.Shape16 = new ModelRenderer(this, 0, 0);
    this.Shape16.addBox(0.0F, 0.0F, -8.0F, 7, 1, 8);
    this.Shape16.setRotationPoint(-3.5F, -14.0F, -9.0F);
    this.Shape16.setTextureSize(64, 32);
    this.Shape16.mirror = true;
    setRotation(this.Shape16, 0.4118977F, 0.0F, 0.0F);
    this.Shape17 = new ModelRenderer(this, 0, 0);
    this.Shape17.addBox(0.0F, 0.0F, -6.0F, 8, 1, 6);
    this.Shape17.setRotationPoint(-4.0F, -11.0F, -16.0F);
    this.Shape17.setTextureSize(64, 32);
    this.Shape17.mirror = true;
    setRotation(this.Shape17, 0.7853982F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.leftarm.render(f5);
    this.leftarm2.render(f5);
    this.rightarm.render(f5);
    this.rightarm2.render(f5);
    this.Shape1.render(f5);
    this.Shape12.render(f5);
    this.Shape13.render(f5);
    this.Shape14.render(f5);
    this.Shape145.render(f5);
    this.Shape16.render(f5);
    this.Shape17.render(f5);
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

package alcoholmod.Mathioks.Final.CT;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class BubblesModel extends ModelBase {
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
  ModelRenderer Shape14;
  
  ModelRenderer Shape15;
  
  ModelRenderer Shape16;
  
  ModelRenderer Shape17;
  
  ModelRenderer Shape18;
  
  ModelRenderer Shape19;
  
  public BubblesModel() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6);
    this.Shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape1.setTextureSize(64, 32);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.5363979F);
    this.Shape2 = new ModelRenderer(this, 0, 0);
    this.Shape2.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6);
    this.Shape2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape2.setTextureSize(64, 32);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.7853982F, 0.7853982F, 0.7853982F);
    this.Shape14 = new ModelRenderer(this, 0, 0);
    this.Shape14.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6);
    this.Shape14.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape14.setTextureSize(64, 32);
    this.Shape14.mirror = true;
    setRotation(this.Shape14, 0.957604F, 0.0F, 0.0F);
    this.Shape15 = new ModelRenderer(this, 0, 0);
    this.Shape15.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6);
    this.Shape15.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape15.setTextureSize(64, 32);
    this.Shape15.mirror = true;
    setRotation(this.Shape15, 0.0F, 0.7481645F, 0.0F);
    this.Shape16 = new ModelRenderer(this, 0, 0);
    this.Shape16.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6);
    this.Shape16.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape16.setTextureSize(64, 32);
    this.Shape16.mirror = true;
    setRotation(this.Shape16, 0.0F, 0.0F, 0.0F);
    this.Shape17 = new ModelRenderer(this, 0, 0);
    this.Shape17.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6);
    this.Shape17.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape17.setTextureSize(64, 32);
    this.Shape17.mirror = true;
    setRotation(this.Shape17, 0.9250245F, 0.0F, 0.7225663F);
    this.Shape18 = new ModelRenderer(this, 0, 0);
    this.Shape18.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6);
    this.Shape18.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape18.setTextureSize(64, 32);
    this.Shape18.mirror = true;
    setRotation(this.Shape18, 0.5014913F, 0.7970337F, 0.0F);
    this.Shape19 = new ModelRenderer(this, 0, 0);
    this.Shape19.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6);
    this.Shape19.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape19.setTextureSize(64, 32);
    this.Shape19.mirror = true;
    setRotation(this.Shape19, 0.0F, 0.5957391F, 0.6318092F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Shape1.render(f5);
    this.Shape2.render(f5);
    this.Shape14.render(f5);
    this.Shape15.render(f5);
    this.Shape16.render(f5);
    this.Shape17.render(f5);
    this.Shape18.render(f5);
    this.Shape19.render(f5);
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

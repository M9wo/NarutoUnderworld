package alcoholmod.Mathioks.Weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class LightningBladeModel extends ModelBase {
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
  ModelRenderer Shape23;
  
  ModelRenderer Shape24;
  
  ModelRenderer Shape25;
  
  ModelRenderer Shape26;
  
  ModelRenderer Shape27;
  
  ModelRenderer Shape28;
  
  ModelRenderer Shape29;
  
  ModelRenderer Shape19;
  
  public LightningBladeModel() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.Shape1 = new ModelRenderer(this, 18, 0);
    this.Shape1.addBox(0.0F, 0.0F, 0.0F, 4, 3, 3);
    this.Shape1.setRotationPoint(-1.5F, -20.0F, -1.5F);
    this.Shape1.setTextureSize(64, 32);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 17, 7);
    this.Shape2.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4);
    this.Shape2.setRotationPoint(-1.5F, -10.5F, -2.0F);
    this.Shape2.setTextureSize(64, 32);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
    this.Shape23 = new ModelRenderer(this, 0, 14);
    this.Shape23.addBox(0.0F, 0.0F, 0.0F, 2, 3, 0);
    this.Shape23.setRotationPoint(0.3F, 0.6F, 0.0F);
    this.Shape23.setTextureSize(64, 32);
    this.Shape23.mirror = true;
    setRotation(this.Shape23, 0.0F, 0.0F, 0.2617994F);
    this.Shape24 = new ModelRenderer(this, 0, 18);
    this.Shape24.addBox(0.0F, 0.0F, 0.0F, 1, 1, 0);
    this.Shape24.setRotationPoint(0.4F, 3.5F, 0.0F);
    this.Shape24.setTextureSize(64, 32);
    this.Shape24.mirror = true;
    setRotation(this.Shape24, 0.0F, 0.0F, 1.204277F);
    this.Shape25 = new ModelRenderer(this, 0, 20);
    this.Shape25.addBox(0.0F, 0.0F, 0.0F, 1, 1, 0);
    this.Shape25.setRotationPoint(0.2F, 4.5F, 0.0F);
    this.Shape25.setTextureSize(64, 32);
    this.Shape25.mirror = true;
    setRotation(this.Shape25, 0.0F, 0.0F, -1.204277F);
    this.Shape26 = new ModelRenderer(this, 0, 22);
    this.Shape26.addBox(0.0F, 0.0F, 0.0F, 1, 1, 0);
    this.Shape26.setRotationPoint(-0.2F, 4.7F, 0.0F);
    this.Shape26.setTextureSize(64, 32);
    this.Shape26.mirror = true;
    setRotation(this.Shape26, 0.0F, 0.0F, -0.7853982F);
    this.Shape27 = new ModelRenderer(this, 6, 14);
    this.Shape27.addBox(0.0F, 0.0F, 0.0F, 2, 11, 0);
    this.Shape27.setRotationPoint(-0.5F, -9.7F, 0.0F);
    this.Shape27.setTextureSize(64, 32);
    this.Shape27.mirror = true;
    setRotation(this.Shape27, 0.0F, 0.0F, -0.0698132F);
    this.Shape28 = new ModelRenderer(this, 12, 14);
    this.Shape28.addBox(0.0F, 0.0F, 0.0F, 2, 11, 0);
    this.Shape28.setRotationPoint(-0.5F, -10.0F, 0.0F);
    this.Shape28.setTextureSize(64, 32);
    this.Shape28.mirror = true;
    setRotation(this.Shape28, 0.0F, 0.0F, 0.0698132F);
    this.Shape29 = new ModelRenderer(this, 12, 4);
    this.Shape29.addBox(0.0F, 0.0F, 0.0F, 2, 3, 0);
    this.Shape29.setRotationPoint(-1.3F, 1.0F, 0.0F);
    this.Shape29.setTextureSize(64, 32);
    this.Shape29.mirror = true;
    setRotation(this.Shape29, 0.0F, 0.0F, -0.2617994F);
    this.Shape19 = new ModelRenderer(this, 0, 0);
    this.Shape19.addBox(0.0F, 0.0F, 0.0F, 3, 9, 2);
    this.Shape19.setRotationPoint(-1.0F, -19.0F, -1.0F);
    this.Shape19.setTextureSize(64, 32);
    this.Shape19.mirror = true;
    setRotation(this.Shape19, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Shape1.render(f5);
    this.Shape2.render(f5);
    this.Shape23.render(f5);
    this.Shape24.render(f5);
    this.Shape25.render(f5);
    this.Shape26.render(f5);
    this.Shape27.render(f5);
    this.Shape28.render(f5);
    this.Shape29.render(f5);
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

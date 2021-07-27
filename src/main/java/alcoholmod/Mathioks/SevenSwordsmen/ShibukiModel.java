package alcoholmod.Mathioks.SevenSwordsmen;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ShibukiModel extends ModelBase {
  ModelRenderer Shibuki2;
  
  ModelRenderer Shibuki7;
  
  ModelRenderer Shibuki6;
  
  ModelRenderer Shibuki5;
  
  ModelRenderer Shibuki1;
  
  ModelRenderer Shibuki3;
  
  ModelRenderer Shibuki8;
  
  ModelRenderer Shibuki4;
  
  public ShibukiModel() {
    this.textureWidth = 128;
    this.textureHeight = 32;
    this.Shibuki2 = new ModelRenderer(this, 92, 0);
    this.Shibuki2.addBox(0.0F, 0.0F, 0.0F, 1, 10, 1);
    this.Shibuki2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shibuki2.setTextureSize(128, 32);
    this.Shibuki2.mirror = true;
    setRotation(this.Shibuki2, 0.0F, 0.0F, 0.0F);
    this.Shibuki7 = new ModelRenderer(this, 35, 0);
    this.Shibuki7.addBox(0.0F, 0.0F, 0.0F, 5, 20, 1);
    this.Shibuki7.setRotationPoint(-5.5F, -20.0F, 0.0F);
    this.Shibuki7.setTextureSize(128, 32);
    this.Shibuki7.mirror = true;
    setRotation(this.Shibuki7, 0.0F, -0.1745329F, 0.0F);
    this.Shibuki6 = new ModelRenderer(this, 52, 0);
    this.Shibuki6.addBox(0.0F, 0.0F, 0.0F, 4, 20, 1);
    this.Shibuki6.setRotationPoint(4.5F, -20.0F, 1.0F);
    this.Shibuki6.setTextureSize(128, 32);
    this.Shibuki6.mirror = true;
    setRotation(this.Shibuki6, 0.0F, 2.96706F, 0.0F);
    this.Shibuki5 = new ModelRenderer(this, 0, 0);
    this.Shibuki5.addBox(0.0F, 0.0F, 0.0F, 5, 20, 1);
    this.Shibuki5.setRotationPoint(-5.5F, -20.0F, 0.0F);
    this.Shibuki5.setTextureSize(128, 32);
    this.Shibuki5.mirror = true;
    setRotation(this.Shibuki5, 0.0F, -0.0258185F, 0.0F);
    this.Shibuki1 = new ModelRenderer(this, 67, 0);
    this.Shibuki1.addBox(0.0F, 0.0F, 0.0F, 4, 20, 1);
    this.Shibuki1.setRotationPoint(4.5F, -20.0F, 1.0F);
    this.Shibuki1.setTextureSize(128, 32);
    this.Shibuki1.mirror = true;
    setRotation(this.Shibuki1, 0.0F, -2.922032F, 0.0F);
    this.Shibuki3 = new ModelRenderer(this, 79, 0);
    this.Shibuki3.addBox(0.0F, 0.0F, 0.0F, 4, 18, 0);
    this.Shibuki3.setRotationPoint(0.5F, -19.0F, 1.0F);
    this.Shibuki3.setTextureSize(128, 32);
    this.Shibuki3.mirror = true;
    setRotation(this.Shibuki3, 0.0F, 0.5585054F, 0.0F);
    this.Shibuki8 = new ModelRenderer(this, 0, 0);
    this.Shibuki8.addBox(0.0F, 0.0F, 0.0F, 4, 20, 4);
    this.Shibuki8.setRotationPoint(-1.5F, -20.0F, -1.5F);
    this.Shibuki8.setTextureSize(128, 32);
    this.Shibuki8.mirror = true;
    setRotation(this.Shibuki8, 0.0F, 0.0F, 0.0F);
    this.Shibuki4 = new ModelRenderer(this, 18, 0);
    this.Shibuki4.addBox(0.0F, 0.0F, 0.0F, 5, 20, 1);
    this.Shibuki4.setRotationPoint(-5.5F, -20.0F, 0.0F);
    this.Shibuki4.setTextureSize(128, 32);
    this.Shibuki4.mirror = true;
    setRotation(this.Shibuki4, 0.0F, 0.122173F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Shibuki2.render(f5);
    this.Shibuki7.render(f5);
    this.Shibuki6.render(f5);
    this.Shibuki5.render(f5);
    this.Shibuki1.render(f5);
    this.Shibuki3.render(f5);
    this.Shibuki8.render(f5);
    this.Shibuki4.render(f5);
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

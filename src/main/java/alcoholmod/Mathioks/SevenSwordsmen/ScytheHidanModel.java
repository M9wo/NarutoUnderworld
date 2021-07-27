package alcoholmod.Mathioks.SevenSwordsmen;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ScytheHidanModel extends ModelBase {
  ModelRenderer Hidan;
  
  ModelRenderer Hidan1;
  
  ModelRenderer Hidan2;
  
  ModelRenderer Hidan3;
  
  ModelRenderer Hidan4;
  
  ModelRenderer Hidan5;
  
  ModelRenderer Hidan6;
  
  ModelRenderer Hidan7;
  
  ModelRenderer Hidan8;
  
  ModelRenderer Hidan9;
  
  ModelRenderer Hidan10;
  
  ModelRenderer Hidan11;
  
  ModelRenderer Hidan12;
  
  public ScytheHidanModel() {
    this.textureWidth = 256;
    this.textureHeight = 128;
    this.Hidan = new ModelRenderer(this, 13, 7);
    this.Hidan.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2);
    this.Hidan.setRotationPoint(-0.5F, -2.0F, -0.5F);
    this.Hidan.setTextureSize(256, 128);
    this.Hidan.mirror = true;
    setRotation(this.Hidan, 0.0F, 0.0F, 0.0F);
    this.Hidan1 = new ModelRenderer(this, 13, 7);
    this.Hidan1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2);
    this.Hidan1.setRotationPoint(-0.5F, -10.0F, -0.5F);
    this.Hidan1.setTextureSize(256, 128);
    this.Hidan1.mirror = true;
    setRotation(this.Hidan1, 0.0F, 0.0F, 0.0F);
    this.Hidan2 = new ModelRenderer(this, 0, 0);
    this.Hidan2.addBox(0.0F, 0.0F, 0.0F, 14, 3, 1);
    this.Hidan2.setRotationPoint(0.5F, -10.0F, 0.0F);
    this.Hidan2.setTextureSize(256, 128);
    this.Hidan2.mirror = true;
    setRotation(this.Hidan2, 0.0F, 0.0F, 0.0F);
    this.Hidan3 = new ModelRenderer(this, 0, 0);
    this.Hidan3.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1);
    this.Hidan3.setRotationPoint(13.5F, -6.0F, 0.0F);
    this.Hidan3.setTextureSize(256, 128);
    this.Hidan3.mirror = true;
    setRotation(this.Hidan3, 0.0F, 0.0F, 0.8103905F);
    this.Hidan4 = new ModelRenderer(this, 0, 0);
    this.Hidan4.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1);
    this.Hidan4.setRotationPoint(14.5F, -5.0F, 0.0F);
    this.Hidan4.setTextureSize(256, 128);
    this.Hidan4.mirror = true;
    setRotation(this.Hidan4, 0.0F, 0.0F, 0.8498411F);
    this.Hidan5 = new ModelRenderer(this, 0, 0);
    this.Hidan5.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1);
    this.Hidan5.setRotationPoint(12.5F, -2.0F, 0.0F);
    this.Hidan5.setTextureSize(256, 128);
    this.Hidan5.mirror = true;
    setRotation(this.Hidan5, 0.0F, 0.0F, 0.8103905F);
    this.Hidan6 = new ModelRenderer(this, 3, 11);
    this.Hidan6.addBox(0.0F, 0.0F, 0.0F, 1, 35, 1);
    this.Hidan6.setRotationPoint(0.0F, -11.0F, 0.0F);
    this.Hidan6.setTextureSize(256, 128);
    this.Hidan6.mirror = true;
    setRotation(this.Hidan6, 0.0F, 0.0F, 0.0F);
    this.Hidan7 = new ModelRenderer(this, 13, 7);
    this.Hidan7.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2);
    this.Hidan7.setRotationPoint(-0.5F, -6.0F, -0.5F);
    this.Hidan7.setTextureSize(256, 128);
    this.Hidan7.mirror = true;
    setRotation(this.Hidan7, 0.0F, 0.0F, 0.0F);
    this.Hidan8 = new ModelRenderer(this, 0, 0);
    this.Hidan8.addBox(0.0F, 0.0F, 0.0F, 13, 3, 1);
    this.Hidan8.setRotationPoint(0.5F, -6.0F, 0.0F);
    this.Hidan8.setTextureSize(256, 128);
    this.Hidan8.mirror = true;
    setRotation(this.Hidan8, 0.0F, 0.0F, 0.0F);
    this.Hidan9 = new ModelRenderer(this, 0, 0);
    this.Hidan9.addBox(0.0F, 0.0F, 0.0F, 5, 2, 1);
    this.Hidan9.setRotationPoint(15.5F, -9.0F, 0.0F);
    this.Hidan9.setTextureSize(256, 128);
    this.Hidan9.mirror = true;
    setRotation(this.Hidan9, 0.0F, 0.0F, 0.8498411F);
    this.Hidan10 = new ModelRenderer(this, 0, 0);
    this.Hidan10.addBox(0.0F, 0.0F, 0.0F, 12, 3, 1);
    this.Hidan10.setRotationPoint(0.5F, -2.0F, 0.0F);
    this.Hidan10.setTextureSize(256, 128);
    this.Hidan10.mirror = true;
    setRotation(this.Hidan10, 0.0F, 0.0F, 0.0F);
    this.Hidan11 = new ModelRenderer(this, 0, 0);
    this.Hidan11.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1);
    this.Hidan11.setRotationPoint(14.5F, -10.0F, 0.0F);
    this.Hidan11.setTextureSize(256, 128);
    this.Hidan11.mirror = true;
    setRotation(this.Hidan11, 0.0F, 0.0F, 0.8103905F);
    this.Hidan12 = new ModelRenderer(this, 0, 0);
    this.Hidan12.addBox(0.0F, 0.0F, 0.0F, 3, 2, 1);
    this.Hidan12.setRotationPoint(13.5F, -1.0F, 0.0F);
    this.Hidan12.setTextureSize(256, 128);
    this.Hidan12.mirror = true;
    setRotation(this.Hidan12, 0.0F, 0.0F, 0.8498411F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Hidan.render(f5);
    this.Hidan1.render(f5);
    this.Hidan2.render(f5);
    this.Hidan3.render(f5);
    this.Hidan4.render(f5);
    this.Hidan5.render(f5);
    this.Hidan6.render(f5);
    this.Hidan7.render(f5);
    this.Hidan8.render(f5);
    this.Hidan9.render(f5);
    this.Hidan10.render(f5);
    this.Hidan11.render(f5);
    this.Hidan12.render(f5);
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

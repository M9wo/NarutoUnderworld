package alcoholmod.Mathioks.SevenSwordsmen;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class KibaModel extends ModelBase {
  ModelRenderer Kiba5;
  
  ModelRenderer Kiba1;
  
  ModelRenderer Kiba2;
  
  ModelRenderer Kiba4;
  
  ModelRenderer Kiba3;
  
  public KibaModel() {
    this.textureWidth = 128;
    this.textureHeight = 64;
    this.Kiba5 = new ModelRenderer(this, 0, 0);
    this.Kiba5.addBox(0.0F, 0.0F, 0.0F, 2, 6, 1);
    this.Kiba5.setRotationPoint(-3.0F, -8.0F, 0.5F);
    this.Kiba5.setTextureSize(128, 64);
    this.Kiba5.mirror = true;
    setRotation(this.Kiba5, 0.0F, 0.0F, -0.5410521F);
    this.Kiba1 = new ModelRenderer(this, 14, 0);
    this.Kiba1.addBox(0.0F, 0.0F, 0.0F, 3, 2, 3);
    this.Kiba1.setRotationPoint(-0.5F, 0.0F, -0.5F);
    this.Kiba1.setTextureSize(128, 64);
    this.Kiba1.mirror = true;
    setRotation(this.Kiba1, 0.0F, 0.0F, 0.0F);
    this.Kiba2 = new ModelRenderer(this, 0, 0);
    this.Kiba2.addBox(0.0F, 0.0F, 0.0F, 2, 6, 1);
    this.Kiba2.setRotationPoint(3.0F, -23.0F, 0.5F);
    this.Kiba2.setTextureSize(128, 64);
    this.Kiba2.mirror = true;
    setRotation(this.Kiba2, 0.0F, 0.0F, 0.5371277F);
    this.Kiba4 = new ModelRenderer(this, 0, 0);
    this.Kiba4.addBox(0.0F, 0.0F, 0.0F, 2, 30, 1);
    this.Kiba4.setRotationPoint(0.0F, -30.0F, 0.5F);
    this.Kiba4.setTextureSize(128, 64);
    this.Kiba4.mirror = true;
    setRotation(this.Kiba4, 0.0F, 0.0F, 0.0F);
    this.Kiba3 = new ModelRenderer(this, 31, 0);
    this.Kiba3.addBox(0.0F, 0.0F, 0.0F, 2, 16, 2);
    this.Kiba3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Kiba3.setTextureSize(128, 64);
    this.Kiba3.mirror = true;
    setRotation(this.Kiba3, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Kiba5.render(f5);
    this.Kiba1.render(f5);
    this.Kiba2.render(f5);
    this.Kiba4.render(f5);
    this.Kiba3.render(f5);
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

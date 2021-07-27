package alcoholmod.Mathioks.SevenSwordsmen;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class KubikiribochoModel extends ModelBase {
  ModelRenderer Kubikribocho9;
  
  ModelRenderer Kubikribocho1;
  
  ModelRenderer Kubikribocho10;
  
  ModelRenderer Kubikribocho2;
  
  ModelRenderer Kubikribocho8;
  
  ModelRenderer Kubikribocho4;
  
  ModelRenderer Kubikribocho3;
  
  ModelRenderer Kubikribocho5;
  
  ModelRenderer Kubikribocho6;
  
  ModelRenderer Kubikribocho7;
  
  public KubikiribochoModel() {
    this.textureWidth = 128;
    this.textureHeight = 64;
    this.Kubikribocho9 = new ModelRenderer(this, 0, 0);
    this.Kubikribocho9.addBox(0.0F, 0.0F, 0.0F, 7, 4, 1);
    this.Kubikribocho9.setRotationPoint(-3.0F, -30.0F, 0.0F);
    this.Kubikribocho9.setTextureSize(128, 64);
    this.Kubikribocho9.mirror = true;
    setRotation(this.Kubikribocho9, 0.0F, 0.0F, 0.0F);
    this.Kubikribocho1 = new ModelRenderer(this, 0, 24);
    this.Kubikribocho1.addBox(0.0F, 0.0F, 0.0F, 4, 10, 1);
    this.Kubikribocho1.setRotationPoint(-3.0F, -17.0F, 0.0F);
    this.Kubikribocho1.setTextureSize(128, 64);
    this.Kubikribocho1.mirror = true;
    setRotation(this.Kubikribocho1, 0.0F, 0.0F, 0.0F);
    this.Kubikribocho10 = new ModelRenderer(this, 0, 0);
    this.Kubikribocho10.addBox(0.0F, 0.0F, 0.0F, 7, 2, 1);
    this.Kubikribocho10.setRotationPoint(-2.7F, -32.0F, 0.0F);
    this.Kubikribocho10.setTextureSize(128, 64);
    this.Kubikribocho10.mirror = true;
    setRotation(this.Kubikribocho10, 0.0F, 0.0F, 0.296706F);
    this.Kubikribocho2 = new ModelRenderer(this, 18, 0);
    this.Kubikribocho2.addBox(0.0F, 0.0F, 0.0F, 1, 18, 1);
    this.Kubikribocho2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Kubikribocho2.setTextureSize(128, 64);
    this.Kubikribocho2.mirror = true;
    setRotation(this.Kubikribocho2, 0.0F, 0.0F, 0.0F);
    this.Kubikribocho8 = new ModelRenderer(this, 0, 0);
    this.Kubikribocho8.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1);
    this.Kubikribocho8.setRotationPoint(-3.0F, -27.0F, 0.0F);
    this.Kubikribocho8.setTextureSize(128, 64);
    this.Kubikribocho8.mirror = true;
    setRotation(this.Kubikribocho8, 0.0F, 0.0F, 0.0F);
    this.Kubikribocho4 = new ModelRenderer(this, 0, 0);
    this.Kubikribocho4.addBox(0.0F, 0.0F, 0.0F, 7, 7, 1);
    this.Kubikribocho4.setRotationPoint(-3.0F, -7.0F, 0.0F);
    this.Kubikribocho4.setTextureSize(128, 64);
    this.Kubikribocho4.mirror = true;
    setRotation(this.Kubikribocho4, 0.0F, 0.0F, 0.0F);
    this.Kubikribocho3 = new ModelRenderer(this, 24, 0);
    this.Kubikribocho3.addBox(0.0F, 0.0F, 0.0F, 3, 6, 2);
    this.Kubikribocho3.setRotationPoint(-1.0F, -5.0F, -0.5F);
    this.Kubikribocho3.setTextureSize(128, 64);
    this.Kubikribocho3.mirror = true;
    setRotation(this.Kubikribocho3, 0.0F, 0.0F, 0.0F);
    this.Kubikribocho5 = new ModelRenderer(this, 0, 15);
    this.Kubikribocho5.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1);
    this.Kubikribocho5.setRotationPoint(2.0F, -27.0F, 0.0F);
    this.Kubikribocho5.setTextureSize(128, 64);
    this.Kubikribocho5.mirror = true;
    setRotation(this.Kubikribocho5, 0.0F, 0.0F, 0.0F);
    this.Kubikribocho6 = new ModelRenderer(this, 0, 0);
    this.Kubikribocho6.addBox(0.0F, 0.0F, 0.0F, 7, 13, 1);
    this.Kubikribocho6.setRotationPoint(-3.0F, -23.0F, 0.0F);
    this.Kubikribocho6.setTextureSize(128, 64);
    this.Kubikribocho6.mirror = true;
    setRotation(this.Kubikribocho6, 0.0F, 0.0F, 0.0F);
    this.Kubikribocho7 = new ModelRenderer(this, 0, 0);
    this.Kubikribocho7.addBox(-1.0F, 0.0F, 0.0F, 1, 2, 1);
    this.Kubikribocho7.setRotationPoint(-2.7F, -32.0F, 0.0F);
    this.Kubikribocho7.setTextureSize(128, 64);
    this.Kubikribocho7.mirror = true;
    setRotation(this.Kubikribocho7, 0.0F, 0.0F, 0.122173F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Kubikribocho9.render(f5);
    this.Kubikribocho1.render(f5);
    this.Kubikribocho10.render(f5);
    this.Kubikribocho2.render(f5);
    this.Kubikribocho8.render(f5);
    this.Kubikribocho4.render(f5);
    this.Kubikribocho3.render(f5);
    this.Kubikribocho5.render(f5);
    this.Kubikribocho6.render(f5);
    this.Kubikribocho7.render(f5);
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

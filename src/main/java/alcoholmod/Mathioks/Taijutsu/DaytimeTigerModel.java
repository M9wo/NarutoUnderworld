package alcoholmod.Mathioks.Taijutsu;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DaytimeTigerModel extends ModelBase {
  ModelRenderer WolfHead;
  
  ModelRenderer Mane;
  
  ModelRenderer Ear1;
  
  ModelRenderer Ear2;
  
  ModelRenderer Nose;
  
  ModelRenderer NosetOP;
  
  public DaytimeTigerModel() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.WolfHead = new ModelRenderer(this, 0, 0);
    this.WolfHead.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4);
    this.WolfHead.setRotationPoint(-1.0F, 13.5F, -7.0F);
    this.WolfHead.setTextureSize(64, 32);
    this.WolfHead.mirror = true;
    setRotation(this.WolfHead, 0.0F, 0.0F, 0.0F);
    this.Mane = new ModelRenderer(this, 21, 0);
    this.Mane.addBox(-4.0F, -3.0F, -3.0F, 10, 4, 9);
    this.Mane.setRotationPoint(-2.0F, 15.0F, -3.0F);
    this.Mane.setTextureSize(64, 32);
    this.Mane.mirror = true;
    setRotation(this.Mane, 1.570796F, 0.0F, 0.0F);
    this.Ear1 = new ModelRenderer(this, 18, 14);
    this.Ear1.addBox(-3.0F, -5.0F, 0.0F, 2, 2, 1);
    this.Ear1.setRotationPoint(-1.0F, 13.5F, -7.0F);
    this.Ear1.setTextureSize(64, 32);
    this.Ear1.mirror = true;
    setRotation(this.Ear1, 0.0F, 0.0F, 0.0F);
    this.Ear2 = new ModelRenderer(this, 18, 14);
    this.Ear2.addBox(1.0F, -5.0F, 0.0F, 2, 2, 1);
    this.Ear2.setRotationPoint(-1.0F, 13.5F, -7.0F);
    this.Ear2.setTextureSize(64, 32);
    this.Ear2.mirror = true;
    setRotation(this.Ear2, 0.0F, 0.0F, 0.0F);
    this.Nose = new ModelRenderer(this, 0, 10);
    this.Nose.addBox(-2.0F, 0.0F, -5.0F, 5, 2, 4);
    this.Nose.setRotationPoint(-1.5F, 14.5F, -7.0F);
    this.Nose.setTextureSize(64, 32);
    this.Nose.mirror = true;
    setRotation(this.Nose, 0.2745985F, 0.0F, 0.0F);
    this.NosetOP = new ModelRenderer(this, 0, 18);
    this.NosetOP.addBox(-2.0F, 0.0F, -5.0F, 5, 2, 4);
    this.NosetOP.setRotationPoint(-1.5F, 11.5F, -7.0F);
    this.NosetOP.setTextureSize(64, 32);
    this.NosetOP.mirror = true;
    setRotation(this.NosetOP, -0.1796526F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.WolfHead.render(f5);
    this.Mane.render(f5);
    this.Ear1.render(f5);
    this.Ear2.render(f5);
    this.Nose.render(f5);
    this.NosetOP.render(f5);
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

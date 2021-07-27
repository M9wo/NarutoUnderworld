package alcoholmod.Mathioks.Final.Summons.Entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SummonClamModel extends ModelBase {
  ModelRenderer MiddleClam;
  
  ModelRenderer BottomClam;
  
  ModelRenderer TopClam;
  
  public SummonClamModel() {
    this.textureWidth = 64;
    this.textureHeight = 128;
    this.MiddleClam = new ModelRenderer(this, 2, 22);
    this.MiddleClam.addBox(0.0F, 0.0F, 0.0F, 17, 3, 13);
    this.MiddleClam.setRotationPoint(-10.0F, 18.0F, -9.0F);
    this.MiddleClam.setTextureSize(64, 128);
    this.MiddleClam.mirror = true;
    setRotation(this.MiddleClam, 0.0F, 0.0F, 0.0F);
    this.BottomClam = new ModelRenderer(this, 0, 0);
    this.BottomClam.addBox(0.0F, 0.0F, 0.0F, 13, 3, 11);
    this.BottomClam.setRotationPoint(-8.0F, 21.0F, -8.0F);
    this.BottomClam.setTextureSize(64, 128);
    this.BottomClam.mirror = true;
    setRotation(this.BottomClam, 0.0F, 0.0F, 0.0F);
    this.TopClam = new ModelRenderer(this, 0, 0);
    this.TopClam.addBox(0.0F, 0.0F, 0.0F, 13, 3, 11);
    this.TopClam.setRotationPoint(-8.0F, 15.0F, -8.0F);
    this.TopClam.setTextureSize(64, 128);
    this.TopClam.mirror = true;
    setRotation(this.TopClam, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.MiddleClam.render(f5);
    this.BottomClam.render(f5);
    this.TopClam.render(f5);
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

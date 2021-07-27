package alcoholmod.Mathioks.SevenSwordsmen;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class GunbaiModel extends ModelBase {
  ModelRenderer Shape4;
  
  ModelRenderer Shape5;
  
  public GunbaiModel() {
    this.textureWidth = 128;
    this.textureHeight = 64;
    this.Shape4 = new ModelRenderer(this, 13, 18);
    this.Shape4.addBox(0.0F, 0.0F, 0.0F, 18, 26, 0);
    this.Shape4.setRotationPoint(-8.5F, -12.0F, 0.5F);
    this.Shape4.setTextureSize(128, 64);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
    this.Shape5 = new ModelRenderer(this, 0, 0);
    this.Shape5.addBox(0.0F, 0.0F, 0.0F, 1, 37, 1);
    this.Shape5.setRotationPoint(0.0F, -13.0F, 0.0F);
    this.Shape5.setTextureSize(128, 64);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Shape4.render(f5);
    this.Shape5.render(f5);
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

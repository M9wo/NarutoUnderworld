package CompleteSusanoo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class EmptyModel extends ModelBase {
  ModelRenderer Susano;
  
  public EmptyModel() {
    this.textureWidth = 256;
    this.textureHeight = 128;
    this.Susano = new ModelRenderer(this, 0, 0);
    this.Susano.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0);
    this.Susano.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Susano.setTextureSize(256, 128);
    this.Susano.mirror = true;
    setRotation(this.Susano, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
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

package alcoholmod.Mathioks.Final.CT;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SharinganKagutsuchiSwordThrowModel extends ModelBase {
  ModelRenderer body;
  
  public SharinganKagutsuchiSwordThrowModel() {
    this.textureWidth = 110;
    this.textureHeight = 98;
    this.body = new ModelRenderer(this, 16, 16);
    this.body.addBox(-4.0F, 0.0F, -2.0F, 2, 1, 38);
    this.body.setRotationPoint(3.0F, 2.0F, -27.0F);
    this.body.setTextureSize(110, 98);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.body.render(f5);
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

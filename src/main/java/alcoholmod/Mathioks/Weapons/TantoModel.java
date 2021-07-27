package alcoholmod.Mathioks.Weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TantoModel extends ModelBase {
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
  public TantoModel() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(0.0F, 0.0F, 0.0F, 3, 10, 2);
    this.Shape1.setRotationPoint(-1.0F, -16.0F, -1.0F);
    this.Shape1.setTextureSize(64, 32);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 12, 0);
    this.Shape2.addBox(0.0F, 0.0F, 0.0F, 2, 16, 0);
    this.Shape2.setRotationPoint(-0.5F, -7.0F, 0.0F);
    this.Shape2.setTextureSize(64, 32);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Shape1.render(f5);
    this.Shape2.render(f5);
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

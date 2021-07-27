package alcoholmod.Mathioks.SevenSwordsmen;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class NuibariModel extends ModelBase {
  ModelRenderer Nuibari_1;
  
  ModelRenderer Nuibari_2;
  
  ModelRenderer Nuibari_3;
  
  ModelRenderer Nuibari_4;
  
  public NuibariModel() {
    this.textureWidth = 128;
    this.textureHeight = 64;
    this.Nuibari_1 = new ModelRenderer(this, 0, 0);
    this.Nuibari_1.addBox(-0.4F, 0.3F, 0.0F, 1, 2, 1);
    this.Nuibari_1.setRotationPoint(-0.6F, -38.0F, 0.5F);
    this.Nuibari_1.setTextureSize(128, 64);
    this.Nuibari_1.mirror = true;
    setRotation(this.Nuibari_1, 0.0F, 0.0F, -0.2094395F);
    this.Nuibari_2 = new ModelRenderer(this, 0, 0);
    this.Nuibari_2.addBox(0.0F, 0.0F, 0.0F, 2, 37, 1);
    this.Nuibari_2.setRotationPoint(-1.5F, -36.0F, 0.5F);
    this.Nuibari_2.setTextureSize(128, 64);
    this.Nuibari_2.mirror = true;
    setRotation(this.Nuibari_2, 0.0F, 0.0F, 0.0F);
    this.Nuibari_3 = new ModelRenderer(this, 9, 0);
    this.Nuibari_3.addBox(0.0F, 0.0F, 0.0F, 3, 19, 2);
    this.Nuibari_3.setRotationPoint(-2.0F, 0.0F, 0.0F);
    this.Nuibari_3.setTextureSize(128, 64);
    this.Nuibari_3.mirror = true;
    setRotation(this.Nuibari_3, 0.0F, 0.0F, 0.0F);
    this.Nuibari_4 = new ModelRenderer(this, 0, 0);
    this.Nuibari_4.addBox(0.0F, 0.2F, 0.0F, 1, 2, 1);
    this.Nuibari_4.setRotationPoint(-1.0F, -38.0F, 0.5F);
    this.Nuibari_4.setTextureSize(128, 64);
    this.Nuibari_4.mirror = true;
    setRotation(this.Nuibari_4, 0.0F, 0.0F, 0.2268928F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Nuibari_1.render(f5);
    this.Nuibari_2.render(f5);
    this.Nuibari_3.render(f5);
    this.Nuibari_4.render(f5);
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

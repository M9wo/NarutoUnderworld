package alcoholmod.Mathioks.Final.CT;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class FlameDragonModel extends ModelBase {
  ModelRenderer hydra5;
  
  ModelRenderer hydra6;
  
  ModelRenderer hydra2;
  
  ModelRenderer hydra4;
  
  ModelRenderer hydra3;
  
  ModelRenderer hydra1;
  
  ModelRenderer hydra56;
  
  ModelRenderer hydra55;
  
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
  public FlameDragonModel() {
    this.textureWidth = 128;
    this.textureHeight = 64;
    this.hydra5 = new ModelRenderer(this, 0, 25);
    this.hydra5.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1);
    this.hydra5.setRotationPoint(-1.7F, -1.266667F, 2.8F);
    this.hydra5.setTextureSize(128, 64);
    this.hydra5.mirror = true;
    setRotation(this.hydra5, -0.7504916F, 0.0F, 0.3676827F);
    this.hydra6 = new ModelRenderer(this, 0, 25);
    this.hydra6.addBox(0.0F, 0.0F, 0.0F, 2, 5, 1);
    this.hydra6.setRotationPoint(-6.0F, -1.0F, 3.0F);
    this.hydra6.setTextureSize(128, 64);
    this.hydra6.mirror = true;
    setRotation(this.hydra6, -0.7504916F, 0.0F, -0.3490659F);
    this.hydra2 = new ModelRenderer(this, 11, 25);
    this.hydra2.addBox(0.0F, 0.0F, -1.0F, 4, 2, 5);
    this.hydra2.setRotationPoint(-5.0F, 1.5F, -3.0F);
    this.hydra2.setTextureSize(128, 64);
    this.hydra2.mirror = true;
    setRotation(this.hydra2, -0.1570796F, 0.0F, 0.0F);
    this.hydra4 = new ModelRenderer(this, 0, 4);
    this.hydra4.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1);
    this.hydra4.setRotationPoint(-1.4F, 1.2F, 0.0F);
    this.hydra4.setTextureSize(128, 64);
    this.hydra4.mirror = true;
    setRotation(this.hydra4, -0.6981317F, 3.141593F, 0.3141593F);
    this.hydra3 = new ModelRenderer(this, 0, 0);
    this.hydra3.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1);
    this.hydra3.setRotationPoint(-4.6F, 1.2F, 0.0F);
    this.hydra3.setTextureSize(128, 64);
    this.hydra3.mirror = true;
    setRotation(this.hydra3, -0.6981317F, 0.0F, 0.3141593F);
    this.hydra1 = new ModelRenderer(this, 11, 33);
    this.hydra1.addBox(0.0F, 0.0F, -1.0F, 4, 2, 5);
    this.hydra1.setRotationPoint(-5.0F, 4.5F, -3.0F);
    this.hydra1.setTextureSize(128, 64);
    this.hydra1.mirror = true;
    setRotation(this.hydra1, 0.1745329F, 0.0F, 0.0F);
    this.hydra56 = new ModelRenderer(this, 0, 25);
    this.hydra56.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1);
    this.hydra56.setRotationPoint(1.866667F, 1.4F, 1.466667F);
    this.hydra56.setTextureSize(128, 64);
    this.hydra56.mirror = true;
    setRotation(this.hydra56, -0.7504916F, 0.3548836F, 1.099557F);
    this.hydra55 = new ModelRenderer(this, 0, 25);
    this.hydra55.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1);
    this.hydra55.setRotationPoint(-8.533334F, 2.8F, 0.6F);
    this.hydra55.setTextureSize(128, 64);
    this.hydra55.mirror = true;
    setRotation(this.hydra55, -0.713313F, -0.334938F, -1.041001F);
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.Shape1.setRotationPoint(-5.0F, 3.0F, -4.0F);
    this.Shape1.setTextureSize(128, 64);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 0, 0);
    this.Shape2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.Shape2.setRotationPoint(-2.0F, 3.0F, -4.0F);
    this.Shape2.setTextureSize(128, 64);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.hydra5.render(f5);
    this.hydra6.render(f5);
    this.hydra2.render(f5);
    this.hydra4.render(f5);
    this.hydra3.render(f5);
    this.hydra1.render(f5);
    this.hydra56.render(f5);
    this.hydra55.render(f5);
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

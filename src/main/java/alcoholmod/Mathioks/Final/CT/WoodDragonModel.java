package alcoholmod.Mathioks.Final.CT;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class WoodDragonModel extends ModelBase {
  ModelRenderer hydra5;
  
  ModelRenderer hydra6;
  
  ModelRenderer hydra2;
  
  ModelRenderer hydra4;
  
  ModelRenderer hydra3;
  
  ModelRenderer hydra1;
  
  ModelRenderer hydra;
  
  ModelRenderer hydra28;
  
  ModelRenderer hydra58;
  
  ModelRenderer hydra59;
  
  ModelRenderer Shape18;
  
  ModelRenderer Shape29;
  
  ModelRenderer Shape21;
  
  ModelRenderer Shape22;
  
  ModelRenderer Shape23;
  
  ModelRenderer Shape24;
  
  ModelRenderer Shape25;
  
  ModelRenderer Shape26;
  
  ModelRenderer Shape27;
  
  ModelRenderer Shape211;
  
  public WoodDragonModel() {
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
    this.hydra = new ModelRenderer(this, 0, 0);
    this.hydra.addBox(0.0F, 0.0F, 0.0F, 4, 4, 46);
    this.hydra.setRotationPoint(-5.0F, 2.0F, 0.0F);
    this.hydra.setTextureSize(128, 64);
    this.hydra.mirror = true;
    setRotation(this.hydra, 0.0F, 0.0F, 0.0F);
    this.hydra28 = new ModelRenderer(this, 11, 25);
    this.hydra28.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
    this.hydra28.setRotationPoint(-4.0F, 0.9333333F, -6.466667F);
    this.hydra28.setTextureSize(128, 64);
    this.hydra28.mirror = true;
    setRotation(this.hydra28, -0.1570796F, 0.0F, 0.0F);
    this.hydra58 = new ModelRenderer(this, 0, 25);
    this.hydra58.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1);
    this.hydra58.setRotationPoint(1.866667F, 1.4F, 1.466667F);
    this.hydra58.setTextureSize(128, 64);
    this.hydra58.mirror = true;
    setRotation(this.hydra58, -0.7504916F, 0.3548836F, 1.099557F);
    this.hydra59 = new ModelRenderer(this, 0, 25);
    this.hydra59.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1);
    this.hydra59.setRotationPoint(-8.533334F, 2.8F, 0.6F);
    this.hydra59.setTextureSize(128, 64);
    this.hydra59.mirror = true;
    setRotation(this.hydra59, -0.713313F, -0.334938F, -1.041001F);
    this.Shape18 = new ModelRenderer(this, 0, 0);
    this.Shape18.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1);
    this.Shape18.setRotationPoint(-4.0F, 2.233333F, -6.7F);
    this.Shape18.setTextureSize(128, 64);
    this.Shape18.mirror = true;
    setRotation(this.Shape18, 0.0F, 0.0F, 0.0F);
    this.Shape29 = new ModelRenderer(this, 0, 0);
    this.Shape29.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1);
    this.Shape29.setRotationPoint(-4.0F, 0.0F, 5.0F);
    this.Shape29.setTextureSize(128, 64);
    this.Shape29.mirror = true;
    setRotation(this.Shape29, -0.4107342F, 0.0F, 0.0F);
    this.Shape21 = new ModelRenderer(this, 0, 0);
    this.Shape21.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1);
    this.Shape21.setRotationPoint(-4.0F, 0.0F, 9.666667F);
    this.Shape21.setTextureSize(128, 64);
    this.Shape21.mirror = true;
    setRotation(this.Shape21, -0.4107342F, 0.0F, 0.0F);
    this.Shape22 = new ModelRenderer(this, 0, 0);
    this.Shape22.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1);
    this.Shape22.setRotationPoint(-4.0F, 0.0F, 13.6F);
    this.Shape22.setTextureSize(128, 64);
    this.Shape22.mirror = true;
    setRotation(this.Shape22, -0.4107342F, 0.0F, 0.0F);
    this.Shape23 = new ModelRenderer(this, 0, 0);
    this.Shape23.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1);
    this.Shape23.setRotationPoint(-4.0F, 0.0F, 18.6F);
    this.Shape23.setTextureSize(128, 64);
    this.Shape23.mirror = true;
    setRotation(this.Shape23, -0.4107342F, 0.0F, 0.0F);
    this.Shape24 = new ModelRenderer(this, 0, 0);
    this.Shape24.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1);
    this.Shape24.setRotationPoint(-4.0F, 0.0F, 24.46667F);
    this.Shape24.setTextureSize(128, 64);
    this.Shape24.mirror = true;
    setRotation(this.Shape24, -0.4107342F, 0.0F, 0.0F);
    this.Shape25 = new ModelRenderer(this, 0, 0);
    this.Shape25.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1);
    this.Shape25.setRotationPoint(-4.0F, 0.0F, 29.46667F);
    this.Shape25.setTextureSize(128, 64);
    this.Shape25.mirror = true;
    setRotation(this.Shape25, -0.4107342F, 0.0F, 0.0F);
    this.Shape26 = new ModelRenderer(this, 0, 0);
    this.Shape26.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1);
    this.Shape26.setRotationPoint(-4.0F, 0.0F, 34.53333F);
    this.Shape26.setTextureSize(128, 64);
    this.Shape26.mirror = true;
    setRotation(this.Shape26, -0.4107342F, 0.0F, 0.0F);
    this.Shape27 = new ModelRenderer(this, 0, 0);
    this.Shape27.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1);
    this.Shape27.setRotationPoint(-4.0F, 0.0F, 39.46667F);
    this.Shape27.setTextureSize(128, 64);
    this.Shape27.mirror = true;
    setRotation(this.Shape27, -0.4107342F, 0.0F, 0.0F);
    this.Shape211 = new ModelRenderer(this, 0, 0);
    this.Shape211.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1);
    this.Shape211.setRotationPoint(-4.0F, 0.0F, 43.73333F);
    this.Shape211.setTextureSize(128, 64);
    this.Shape211.mirror = true;
    setRotation(this.Shape211, -0.4107342F, 0.0F, 0.0F);
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
    this.hydra.render(f5);
    this.hydra28.render(f5);
    this.hydra58.render(f5);
    this.hydra59.render(f5);
    this.Shape18.render(f5);
    this.Shape29.render(f5);
    this.Shape21.render(f5);
    this.Shape22.render(f5);
    this.Shape23.render(f5);
    this.Shape24.render(f5);
    this.Shape25.render(f5);
    this.Shape26.render(f5);
    this.Shape27.render(f5);
    this.Shape211.render(f5);
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

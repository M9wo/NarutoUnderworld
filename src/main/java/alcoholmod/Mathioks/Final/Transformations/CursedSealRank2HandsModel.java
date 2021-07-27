package alcoholmod.Mathioks.Final.Transformations;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CursedSealRank2HandsModel extends ModelBase {
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
  ModelRenderer Shape3;
  
  ModelRenderer Shape4;
  
  ModelRenderer hand1;
  
  ModelRenderer hand2;
  
  ModelRenderer hand3;
  
  ModelRenderer hand4;
  
  ModelRenderer hand5;
  
  ModelRenderer Shape11;
  
  ModelRenderer Shape21;
  
  ModelRenderer Shape31;
  
  ModelRenderer Shape41;
  
  ModelRenderer hand11;
  
  ModelRenderer hand21;
  
  ModelRenderer hand31;
  
  ModelRenderer hand41;
  
  ModelRenderer hand51;
  
  public CursedSealRank2HandsModel() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.Shape1 = new ModelRenderer(this, 36, 14);
    this.Shape1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 6);
    this.Shape1.setRotationPoint(2.0F, 1.0F, 0.0F);
    this.Shape1.setTextureSize(64, 32);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 36, 11);
    this.Shape2.addBox(0.0F, 0.0F, 0.0F, 2, 4, 5);
    this.Shape2.setRotationPoint(2.0F, 0.0F, 5.766667F);
    this.Shape2.setTextureSize(64, 32);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.2920518F, 0.9971648F, -0.2094395F);
    this.Shape3 = new ModelRenderer(this, 36, 17);
    this.Shape3.addBox(0.0F, 0.0F, 0.0F, 12, 10, 2);
    this.Shape3.setRotationPoint(3.0F, -4.0F, 7.866667F);
    this.Shape3.setTextureSize(64, 32);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.1082104F, 0.3234677F, -0.2687807F);
    this.Shape4 = new ModelRenderer(this, 36, 15);
    this.Shape4.addBox(0.0F, 0.0F, 0.0F, 10, 14, 3);
    this.Shape4.setRotationPoint(11.73333F, -8.8F, 6.666667F);
    this.Shape4.setTextureSize(64, 32);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, 0.2583087F, 1.134464F, -0.1582432F);
    this.hand1 = new ModelRenderer(this, 29, 0);
    this.hand1.addBox(0.0F, 0.0F, 0.0F, 14, 2, 3);
    this.hand1.setRotationPoint(15.8F, -5.266667F, -0.06666667F);
    this.hand1.setTextureSize(64, 32);
    this.hand1.mirror = true;
    setRotation(this.hand1, 0.2583087F, 1.64061F, -0.1582432F);
    this.hand2 = new ModelRenderer(this, 33, 0);
    this.hand2.addBox(0.4F, 0.0F, 0.0F, 8, 2, 3);
    this.hand2.setRotationPoint(18.66667F, 1.0F, 0.0F);
    this.hand2.setTextureSize(64, 32);
    this.hand2.mirror = true;
    setRotation(this.hand2, 0.1884956F, 1.689479F, 0.2220734F);
    this.hand3 = new ModelRenderer(this, 32, 0);
    this.hand3.addBox(0.0F, 0.0F, 0.0F, 12, 2, 3);
    this.hand3.setRotationPoint(17.2F, -1.0F, -0.8F);
    this.hand3.setTextureSize(64, 32);
    this.hand3.mirror = true;
    setRotation(this.hand3, 0.2583087F, 1.630137F, -0.1582432F);
    this.hand4 = new ModelRenderer(this, 33, 0);
    this.hand4.addBox(0.0F, 0.0F, 0.0F, 10, 4, 3);
    this.hand4.setRotationPoint(14.0F, -9.2F, 4.933333F);
    this.hand4.setTextureSize(64, 32);
    this.hand4.mirror = true;
    setRotation(this.hand4, -0.4755076F, 2.090353F, -0.3025237F);
    this.hand5 = new ModelRenderer(this, 36, 0);
    this.hand5.addBox(0.0F, 0.0F, 0.0F, 10, 2, 3);
    this.hand5.setRotationPoint(15.73333F, -9.6F, -0.9333333F);
    this.hand5.setTextureSize(64, 32);
    this.hand5.mirror = true;
    setRotation(this.hand5, 0.2583087F, 1.874043F, -0.1582432F);
    this.Shape11 = new ModelRenderer(this, 35, 19);
    this.Shape11.addBox(0.0F, 0.0F, 0.0F, 2, 2, 6);
    this.Shape11.setRotationPoint(-4.0F, 1.0F, 0.0F);
    this.Shape11.setTextureSize(64, 32);
    this.Shape11.mirror = true;
    setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
    this.Shape21 = new ModelRenderer(this, 35, 17);
    this.Shape21.addBox(0.0F, 0.0F, 0.0F, 2, 4, 5);
    this.Shape21.setRotationPoint(-3.266667F, 4.0F, 5.933333F);
    this.Shape21.setTextureSize(64, 32);
    this.Shape21.mirror = true;
    setRotation(this.Shape21, -0.2545702F, 1.022412F, -2.881342F);
    this.Shape31 = new ModelRenderer(this, 34, 17);
    this.Shape31.addBox(0.0F, 0.0F, 0.0F, 12, 10, 2);
    this.Shape31.setRotationPoint(-7.0F, 5.666667F, 10.0F);
    this.Shape31.setTextureSize(64, 32);
    this.Shape31.mirror = true;
    setRotation(this.Shape31, -0.2263971F, 0.5316404F, -2.945641F);
    this.Shape41 = new ModelRenderer(this, 35, 15);
    this.Shape41.addBox(0.0F, 0.0F, 0.0F, 10, 14, 3);
    this.Shape41.setRotationPoint(-15.2F, -9.733334F, 5.533333F);
    this.Shape41.setTextureSize(64, 32);
    this.Shape41.mirror = true;
    setRotation(this.Shape41, -0.3365491F, 1.840858F, 0.0056525F);
    this.hand11 = new ModelRenderer(this, 31, 1);
    this.hand11.addBox(0.0F, 0.0F, 0.0F, 14, 2, 3);
    this.hand11.setRotationPoint(-16.6F, -2.333333F, 0.0F);
    this.hand11.setTextureSize(64, 32);
    this.hand11.mirror = true;
    setRotation(this.hand11, 2.674918F, 1.252313F, 0.1020071F);
    this.hand21 = new ModelRenderer(this, 33, 0);
    this.hand21.addBox(0.0F, 0.0F, 0.0F, 8, 2, 3);
    this.hand21.setRotationPoint(-18.4F, 4.6F, -0.8666667F);
    this.hand21.setTextureSize(64, 32);
    this.hand21.mirror = true;
    setRotation(this.hand21, 2.806985F, 1.094621F, 0.2964306F);
    this.hand31 = new ModelRenderer(this, 33, 0);
    this.hand31.addBox(0.0F, 0.0F, 0.0F, 12, 2, 3);
    this.hand31.setRotationPoint(-16.93333F, 1.0F, 0.0F);
    this.hand31.setTextureSize(64, 32);
    this.hand31.mirror = true;
    setRotation(this.hand31, 2.89799F, 1.183994F, 0.1763643F);
    this.hand41 = new ModelRenderer(this, 33, 0);
    this.hand41.addBox(0.0F, 0.0F, 0.0F, 10, 4, 3);
    this.hand41.setRotationPoint(-16.0F, -8.0F, 2.533333F);
    this.hand41.setTextureSize(64, 32);
    this.hand41.mirror = true;
    setRotation(this.hand41, 0.0356295F, 0.9468497F, -0.2281665F);
    this.hand51 = new ModelRenderer(this, 33, 0);
    this.hand51.addBox(0.0F, 0.0F, 0.0F, 10, 2, 3);
    this.hand51.setRotationPoint(-15.33333F, -6.0F, -1.0F);
    this.hand51.setTextureSize(64, 32);
    this.hand51.mirror = true;
    setRotation(this.hand51, 2.786454F, 1.279185F, -0.0467074F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Shape1.render(f5);
    this.Shape2.render(f5);
    this.Shape3.render(f5);
    this.Shape4.render(f5);
    this.hand1.render(f5);
    this.hand2.render(f5);
    this.hand3.render(f5);
    this.hand4.render(f5);
    this.hand5.render(f5);
    this.Shape11.render(f5);
    this.Shape21.render(f5);
    this.Shape31.render(f5);
    this.Shape41.render(f5);
    this.hand11.render(f5);
    this.hand21.render(f5);
    this.hand31.render(f5);
    this.hand41.render(f5);
    this.hand51.render(f5);
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

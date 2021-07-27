package alcoholmod.Mathioks.Final.Summons.Entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SummonCatModel extends ModelBase {
  ModelRenderer Shape2;
  
  ModelRenderer head;
  
  ModelRenderer body;
  
  ModelRenderer rightarm;
  
  ModelRenderer leftarm;
  
  ModelRenderer rightleg;
  
  ModelRenderer leftleg;
  
  ModelRenderer Shape1;
  
  ModelRenderer Shape12;
  
  public SummonCatModel() {
    this.textureWidth = 64;
    this.textureHeight = 128;
    this.Shape2 = new ModelRenderer(this, 35, 1);
    this.Shape2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 9);
    this.Shape2.setRotationPoint(0.0F, 16.0F, 1.0F);
    this.Shape2.setTextureSize(64, 128);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, -0.2617994F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-3.0F, -6.0F, -4.0F, 7, 6, 6);
    this.head.setRotationPoint(0.0F, 7.0F, 0.0F);
    this.head.setTextureSize(64, 128);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.body = new ModelRenderer(this, 16, 34);
    this.body.addBox(-4.0F, 0.0F, -2.0F, 9, 10, 4);
    this.body.setRotationPoint(0.0F, 7.0F, -2.0F);
    this.body.setTextureSize(64, 128);
    this.body.mirror = true;
    setRotation(this.body, 0.1919862F, 0.0174533F, 0.0F);
    this.rightarm = new ModelRenderer(this, 44, 16);
    this.rightarm.addBox(-4.0F, -2.0F, -2.0F, 3, 12, 3);
    this.rightarm.setRotationPoint(-3.0F, 9.0F, -1.0F);
    this.rightarm.setTextureSize(64, 128);
    this.rightarm.mirror = true;
    setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
    this.leftarm = new ModelRenderer(this, 44, 16);
    this.leftarm.addBox(-1.0F, -2.0F, -3.0F, 3, 12, 3);
    this.leftarm.setRotationPoint(6.0F, 9.0F, 0.0F);
    this.leftarm.setTextureSize(64, 128);
    this.leftarm.mirror = true;
    setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
    this.rightleg = new ModelRenderer(this, 0, 16);
    this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4);
    this.rightleg.setRotationPoint(-2.0F, 16.0F, 0.0F);
    this.rightleg.setTextureSize(64, 128);
    this.rightleg.mirror = true;
    setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
    this.leftleg = new ModelRenderer(this, 0, 16);
    this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4);
    this.leftleg.setRotationPoint(3.0F, 16.0F, 0.0F);
    this.leftleg.setTextureSize(64, 128);
    this.leftleg.mirror = true;
    setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
    this.Shape1 = new ModelRenderer(this, 28, 0);
    this.Shape1.addBox(0.0F, -2.0F, 0.0F, 2, 2, 1);
    this.Shape1.setRotationPoint(2.0F, 1.0F, -3.0F);
    this.Shape1.setTextureSize(64, 128);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.3490659F);
    this.Shape12 = new ModelRenderer(this, 28, 0);
    this.Shape12.addBox(-2.0F, -2.0F, 0.0F, 2, 2, 1);
    this.Shape12.setRotationPoint(-1.0F, 1.0F, -3.0F);
    this.Shape12.setTextureSize(64, 128);
    this.Shape12.mirror = true;
    setRotation(this.Shape12, 0.0F, 0.0F, -0.2443461F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Shape2.render(f5);
    this.head.render(f5);
    this.body.render(f5);
    this.rightarm.render(f5);
    this.leftarm.render(f5);
    this.rightleg.render(f5);
    this.leftleg.render(f5);
    this.Shape1.render(f5);
    this.Shape12.render(f5);
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

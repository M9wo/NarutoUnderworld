package alcoholmod.Mathioks.NickModels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class KikaichuModel extends ModelBase {
  ModelRenderer RightHorn;
  
  ModelRenderer LeftHorn;
  
  ModelRenderer Head;
  
  ModelRenderer Body;
  
  ModelRenderer LegLeftFront;
  
  ModelRenderer LegLeftMiddle;
  
  ModelRenderer LegLeftBack;
  
  ModelRenderer LegRightFront;
  
  ModelRenderer LegRightMiddle;
  
  ModelRenderer LegRightBack;
  
  ModelRenderer Antenna;
  
  public KikaichuModel() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.RightHorn = new ModelRenderer(this, 7, 14);
    this.RightHorn.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.RightHorn.setRotationPoint(0.0F, 12.0F, -10.0F);
    this.RightHorn.setTextureSize(64, 32);
    this.RightHorn.mirror = true;
    setRotation(this.RightHorn, 0.0F, 0.0F, 0.0F);
    this.LeftHorn = new ModelRenderer(this, 7, 14);
    this.LeftHorn.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.LeftHorn.setRotationPoint(-2.0F, 12.0F, -10.0F);
    this.LeftHorn.setTextureSize(64, 32);
    this.LeftHorn.mirror = true;
    setRotation(this.LeftHorn, 0.0F, 0.0F, 0.0F);
    this.Head = new ModelRenderer(this, 1, 1);
    this.Head.addBox(-3.0F, -3.0F, -3.0F, 5, 5, 5);
    this.Head.setRotationPoint(0.0F, 19.0F, -7.0F);
    this.Head.setTextureSize(64, 32);
    this.Head.mirror = true;
    setRotation(this.Head, 0.0F, 0.0F, 0.0F);
    this.Body = new ModelRenderer(this, 20, 12);
    this.Body.addBox(-5.0F, -4.0F, -6.0F, 9, 5, 12);
    this.Body.setRotationPoint(0.0F, 22.0F, 1.0F);
    this.Body.setTextureSize(64, 32);
    this.Body.mirror = true;
    setRotation(this.Body, 0.0F, 0.0F, 0.0F);
    this.LegLeftFront = new ModelRenderer(this, 28, 2);
    this.LegLeftFront.addBox(0.0F, -1.0F, -1.0F, 10, 2, 2);
    this.LegLeftFront.setRotationPoint(3.0F, 21.0F, -3.0F);
    this.LegLeftFront.setTextureSize(64, 32);
    this.LegLeftFront.mirror = true;
    setRotation(this.LegLeftFront, 0.0F, 0.0F, 0.1919862F);
    this.LegLeftMiddle = new ModelRenderer(this, 28, 2);
    this.LegLeftMiddle.addBox(0.0F, -1.0F, -1.0F, 10, 2, 2);
    this.LegLeftMiddle.setRotationPoint(3.0F, 21.0F, 1.0F);
    this.LegLeftMiddle.setTextureSize(64, 32);
    this.LegLeftMiddle.mirror = true;
    setRotation(this.LegLeftMiddle, 0.0F, 0.0F, 0.1919862F);
    this.LegLeftBack = new ModelRenderer(this, 28, 2);
    this.LegLeftBack.addBox(0.0F, -1.0F, -1.0F, 10, 2, 2);
    this.LegLeftBack.setRotationPoint(3.0F, 21.0F, 5.0F);
    this.LegLeftBack.setTextureSize(64, 32);
    this.LegLeftBack.mirror = true;
    setRotation(this.LegLeftBack, 0.0F, 0.0F, 0.1919862F);
    this.LegRightFront = new ModelRenderer(this, 28, 2);
    this.LegRightFront.addBox(-10.0F, -1.0F, -1.0F, 10, 2, 2);
    this.LegRightFront.setRotationPoint(-4.0F, 21.0F, -3.0F);
    this.LegRightFront.setTextureSize(64, 32);
    this.LegRightFront.mirror = true;
    setRotation(this.LegRightFront, 0.0F, 0.0F, -0.1919862F);
    this.LegRightMiddle = new ModelRenderer(this, 28, 2);
    this.LegRightMiddle.addBox(-10.0F, -1.0F, -1.0F, 10, 2, 2);
    this.LegRightMiddle.setRotationPoint(-4.0F, 21.0F, 1.0F);
    this.LegRightMiddle.setTextureSize(64, 32);
    this.LegRightMiddle.mirror = true;
    setRotation(this.LegRightMiddle, 0.0F, 0.0F, -0.1919862F);
    this.LegRightMiddle.mirror = false;
    this.LegRightBack = new ModelRenderer(this, 28, 2);
    this.LegRightBack.addBox(-10.0F, -1.0F, -1.0F, 10, 2, 2);
    this.LegRightBack.setRotationPoint(-4.0F, 21.0F, 5.0F);
    this.LegRightBack.setTextureSize(64, 32);
    this.LegRightBack.mirror = true;
    setRotation(this.LegRightBack, 0.0F, 0.0F, -0.1919862F);
    this.Antenna = new ModelRenderer(this, 9, 20);
    this.Antenna.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1);
    this.Antenna.setRotationPoint(-1.0F, 16.0F, -10.0F);
    this.Antenna.setTextureSize(64, 32);
    this.Antenna.mirror = true;
    setRotation(this.Antenna, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.RightHorn.render(f5);
    this.LeftHorn.render(f5);
    this.Head.render(f5);
    this.Body.render(f5);
    this.LegLeftFront.render(f5);
    this.LegLeftMiddle.render(f5);
    this.LegLeftBack.render(f5);
    this.LegRightFront.render(f5);
    this.LegRightMiddle.render(f5);
    this.LegRightBack.render(f5);
    this.Antenna.render(f5);
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

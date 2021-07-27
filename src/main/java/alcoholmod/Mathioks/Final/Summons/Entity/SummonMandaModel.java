package alcoholmod.Mathioks.Final.Summons.Entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SummonMandaModel extends ModelBase {
  ModelRenderer Neck;
  
  ModelRenderer BodyFront;
  
  ModelRenderer Tail;
  
  ModelRenderer Head;
  
  ModelRenderer HornFarRight;
  
  ModelRenderer HornFarLeft;
  
  public SummonMandaModel() {
    this.textureWidth = 128;
    this.textureHeight = 128;
    setTextureOffset("Tail.BodyTail", 54, 59);
    setTextureOffset("Tail.TailEnd", 46, 39);
    setTextureOffset("Tail.TailMid", 0, 59);
    setTextureOffset("Head.HeadBase", 46, 15);
    setTextureOffset("Head.MouthSnoutWhatever", 38, 0);
    setTextureOffset("Head.HornRight", 0, 0);
    setTextureOffset("Head.HornLeft", 0, 0);
    setTextureOffset("HornFarRight.HornFarRightTop", 24, 0);
    setTextureOffset("HornFarRight.HornFarRight", 8, 0);
    setTextureOffset("HornFarLeft.HornFarLeftTop", 24, 0);
    setTextureOffset("HornFarLeft.HornFarLeft", 8, 0);
    this.Neck = new ModelRenderer(this, 0, 32);
    this.Neck.addBox(-7.0F, -17.0F, 3.0F, 14, 17, 9);
    this.Neck.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Neck.setTextureSize(128, 128);
    this.Neck.mirror = true;
    setRotation(this.Neck, 0.4712389F, 0.0F, 0.0F);
    this.BodyFront = new ModelRenderer(this, 0, 21);
    this.BodyFront.addBox(-8.0F, -17.0F, -3.0F, 14, 29, 9);
    this.BodyFront.setRotationPoint(1.0F, 10.0F, 1.0F);
    this.BodyFront.setTextureSize(128, 128);
    this.BodyFront.mirror = true;
    setRotation(this.BodyFront, -0.2617994F, 0.0F, 0.0F);
    this.Tail = new ModelRenderer(this, "Tail");
    this.Tail.setRotationPoint(0.0F, 16.0F, 0.0F);
    setRotation(this.Tail, 0.0F, 0.0F, 0.0F);
    this.Tail.mirror = true;
    this.Tail.addBox("BodyTail", -6.0F, 0.0F, 0.0F, 12, 8, 17);
    this.Tail.addBox("TailEnd", -3.0F, 2.0F, 32.0F, 6, 6, 14);
    this.Tail.addBox("TailMid", -5.0F, 1.0F, 16.0F, 10, 7, 17);
    this.Head = new ModelRenderer(this, "Head");
    this.Head.setRotationPoint(0.0F, -12.0F, 0.0F);
    setRotation(this.Head, 0.0F, 0.0F, 0.0F);
    this.Head.mirror = true;
    this.Head.addBox("HeadBase", -9.0F, -9.0F, -10.0F, 18, 9, 15);
    this.Head.addBox("MouthSnoutWhatever", -6.0F, -8.0F, -16.0F, 12, 8, 7);
    this.Head.addBox("HornRight", 3.0F, -11.0F, 2.0F, 2, 3, 2);
    this.Head.addBox("HornLeft", -5.0F, -11.0F, 2.0F, 2, 3, 2);
    this.HornFarRight = new ModelRenderer(this, "HornFarRight");
    this.HornFarRight.setRotationPoint(-1.0F, -1.0F, -1.0F);
    setRotation(this.HornFarRight, 0.0F, 0.0F, 0.0F);
    this.HornFarRight.mirror = true;
    this.HornFarRight.addBox("HornFarRightTop", 9.0F, -12.0F, 4.0F, 3, 3, 4);
    this.HornFarRight.addBox("HornFarRight", 7.0F, -10.0F, 3.0F, 4, 4, 4);
    this.Head.addChild(this.HornFarRight);
    this.HornFarLeft = new ModelRenderer(this, "HornFarLeft");
    this.HornFarLeft.setRotationPoint(-17.0F, -1.0F, -1.0F);
    setRotation(this.HornFarLeft, 0.0F, 0.0F, 0.0F);
    this.HornFarLeft.mirror = true;
    this.HornFarLeft.addBox("HornFarLeftTop", 6.0F, -12.0F, 4.0F, 3, 2, 4);
    this.HornFarLeft.addBox("HornFarLeft", 7.0F, -10.0F, 3.0F, 4, 4, 4);
    this.Head.addChild(this.HornFarLeft);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Neck.render(f5);
    this.BodyFront.render(f5);
    this.Tail.render(f5);
    this.Head.render(f5);
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

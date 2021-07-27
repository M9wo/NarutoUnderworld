package alcoholmod.Mathioks.Final.Summons.Entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SummonGamabuntaModel extends ModelBase {
  ModelRenderer Head2;
  
  ModelRenderer LeftEye;
  
  ModelRenderer RightEye;
  
  ModelRenderer Body;
  
  ModelRenderer LeftTopLeg;
  
  ModelRenderer LeftLeg;
  
  ModelRenderer RightLeg;
  
  ModelRenderer RightTopLeg;
  
  ModelRenderer RightArm;
  
  ModelRenderer RightForearm;
  
  ModelRenderer RightHand;
  
  ModelRenderer LeftArm;
  
  ModelRenderer LeftForearm;
  
  ModelRenderer LeftHand;
  
  ModelRenderer Pipe;
  
  ModelRenderer RightFeet;
  
  ModelRenderer LeftFeet;
  
  ModelRenderer Shape1;
  
  ModelRenderer Shape2;
  
  ModelRenderer Shape23;
  
  ModelRenderer Head;
  
  public SummonGamabuntaModel() {
    this.textureWidth = 128;
    this.textureHeight = 128;
    setTextureOffset("Head.Head", 79, 2);
    setTextureOffset("Head.Mouth", 80, 37);
    this.Head2 = new ModelRenderer(this, 58, 7);
    this.Head2.addBox(0.0F, 0.0F, 0.0F, 12, 7, 8);
    this.Head2.setRotationPoint(-6.0F, -9.0F, -4.7F);
    this.Head2.setTextureSize(128, 128);
    this.Head2.mirror = true;
    setRotation(this.Head2, -0.1115358F, 0.0F, 0.0F);
    this.LeftEye = new ModelRenderer(this, 90, 22);
    this.LeftEye.addBox(-6.0F, -7.0F, -6.0F, 5, 2, 2);
    this.LeftEye.setRotationPoint(-2.0F, 1.0F, -1.0F);
    this.LeftEye.setTextureSize(128, 128);
    this.LeftEye.mirror = true;
    setRotation(this.LeftEye, -0.1115358F, 0.0F, 0.1843068F);
    this.RightEye = new ModelRenderer(this, 108, 22);
    this.RightEye.addBox(3.0F, -7.0F, -6.0F, 5, 2, 2);
    this.RightEye.setRotationPoint(0.0F, 1.0F, -1.0F);
    this.RightEye.setTextureSize(128, 128);
    this.RightEye.mirror = true;
    setRotation(this.RightEye, -0.1115358F, 0.0F, -0.1843068F);
    this.Body = new ModelRenderer(this, 2, 94);
    this.Body.addBox(-8.0F, -9.0F, 0.0F, 16, 20, 11);
    this.Body.setRotationPoint(0.0F, 8.0F, 0.0F);
    this.Body.setTextureSize(128, 128);
    this.Body.mirror = true;
    setRotation(this.Body, 0.669215F, 0.0F, 0.0F);
    this.LeftTopLeg = new ModelRenderer(this, 2, 73);
    this.LeftTopLeg.addBox(-4.0F, -2.0F, -7.0F, 5, 5, 11);
    this.LeftTopLeg.setRotationPoint(-8.0F, 11.0F, 7.0F);
    this.LeftTopLeg.setTextureSize(128, 128);
    this.LeftTopLeg.mirror = true;
    setRotation(this.LeftTopLeg, -0.3490659F, 0.7853982F, 0.0F);
    this.LeftLeg = new ModelRenderer(this, 9, 50);
    this.LeftLeg.addBox(-3.0F, -1.0F, 0.0F, 4, 16, 4);
    this.LeftLeg.setRotationPoint(-12.0F, 9.0F, 3.0F);
    this.LeftLeg.setTextureSize(128, 128);
    this.LeftLeg.mirror = true;
    setRotation(this.LeftLeg, -0.3490659F, -0.3490659F, -0.3490659F);
    this.RightLeg = new ModelRenderer(this, 42, 50);
    this.RightLeg.addBox(-3.0F, 0.0F, 0.0F, 4, 16, 4);
    this.RightLeg.setRotationPoint(14.0F, 9.0F, 3.0F);
    this.RightLeg.setTextureSize(128, 128);
    this.RightLeg.mirror = true;
    setRotation(this.RightLeg, -0.3490659F, 0.3490659F, 0.3490659F);
    this.RightTopLeg = new ModelRenderer(this, 37, 73);
    this.RightTopLeg.addBox(0.0F, -2.0F, -7.0F, 5, 5, 11);
    this.RightTopLeg.setRotationPoint(8.0F, 11.0F, 7.0F);
    this.RightTopLeg.setTextureSize(128, 128);
    this.RightTopLeg.mirror = true;
    setRotation(this.RightTopLeg, -0.3490659F, -0.7853982F, 0.1115358F);
    this.RightArm = new ModelRenderer(this, 42, 2);
    this.RightArm.addBox(0.0F, 0.0F, -1.0F, 4, 11, 3);
    this.RightArm.setRotationPoint(6.0F, 3.0F, 4.0F);
    this.RightArm.setTextureSize(128, 128);
    this.RightArm.mirror = true;
    setRotation(this.RightArm, -0.4363323F, 0.0F, -0.9599311F);
    this.RightForearm = new ModelRenderer(this, 44, 18);
    this.RightForearm.addBox(-1.0F, -1.0F, -1.0F, 3, 9, 2);
    this.RightForearm.setRotationPoint(15.0F, 7.0F, 0.0F);
    this.RightForearm.setTextureSize(128, 128);
    this.RightForearm.mirror = true;
    setRotation(this.RightForearm, -1.22173F, 0.3839724F, -0.4363323F);
    this.RightHand = new ModelRenderer(this, 40, 36);
    this.RightHand.addBox(-4.0F, -1.0F, -8.0F, 7, 2, 8);
    this.RightHand.setRotationPoint(14.0F, 9.0F, -7.0F);
    this.RightHand.setTextureSize(128, 128);
    this.RightHand.mirror = true;
    setRotation(this.RightHand, 0.1745329F, 0.2617994F, 0.3490659F);
    this.LeftArm = new ModelRenderer(this, 26, 2);
    this.LeftArm.addBox(-4.0F, 0.0F, -1.0F, 4, 11, 3);
    this.LeftArm.setRotationPoint(-6.0F, 3.0F, 4.0F);
    this.LeftArm.setTextureSize(128, 128);
    this.LeftArm.mirror = true;
    setRotation(this.LeftArm, -0.4363323F, 0.0F, 0.9599311F);
    this.LeftForearm = new ModelRenderer(this, 28, 18);
    this.LeftForearm.addBox(-2.0F, -1.0F, -1.0F, 3, 9, 2);
    this.LeftForearm.setRotationPoint(-15.0F, 7.0F, 0.0F);
    this.LeftForearm.setTextureSize(128, 128);
    this.LeftForearm.mirror = true;
    setRotation(this.LeftForearm, -1.22173F, -0.3839724F, 0.4363323F);
    this.LeftHand = new ModelRenderer(this, 2, 36);
    this.LeftHand.addBox(-2.0F, -1.0F, -8.0F, 7, 2, 8);
    this.LeftHand.setRotationPoint(-14.0F, 9.0F, -7.0F);
    this.LeftHand.setTextureSize(128, 128);
    this.LeftHand.mirror = true;
    setRotation(this.LeftHand, 0.1745329F, -0.0535992F, -1.549946F);
    this.Pipe = new ModelRenderer(this, 71, 25);
    this.Pipe.addBox(2.0F, -2.0F, -15.0F, 1, 1, 6);
    this.Pipe.setRotationPoint(-4.0F, -1.0F, -2.0F);
    this.Pipe.setTextureSize(128, 128);
    this.Pipe.mirror = true;
    setRotation(this.Pipe, 0.1487144F, -0.4615931F, 0.0F);
    this.RightFeet = new ModelRenderer(this, 72, 64);
    this.RightFeet.addBox(-5.0F, 0.0F, -14.0F, 10, 0, 17);
    this.RightFeet.setRotationPoint(8.0F, 23.0F, 2.0F);
    this.RightFeet.setTextureSize(128, 128);
    this.RightFeet.mirror = true;
    setRotation(this.RightFeet, 0.0F, -0.5235988F, 0.0F);
    this.LeftFeet = new ModelRenderer(this, 72, 94);
    this.LeftFeet.addBox(-5.0F, 0.0F, -14.0F, 10, 0, 17);
    this.LeftFeet.setRotationPoint(-8.0F, 23.0F, 2.0F);
    this.LeftFeet.setTextureSize(128, 128);
    this.LeftFeet.mirror = true;
    setRotation(this.LeftFeet, 0.0F, 0.5235988F, 0.0F);
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2);
    this.Shape1.setRotationPoint(4.6F, -1.6F, -16.0F);
    this.Shape1.setTextureSize(128, 128);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.1340413F, -0.454251F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 14, 17);
    this.Shape2.addBox(0.0F, 0.0F, 0.0F, 2, 13, 3);
    this.Shape2.setRotationPoint(-12.0F, -1.0F, -13.0F);
    this.Shape2.setTextureSize(128, 128);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
    this.Shape23 = new ModelRenderer(this, 5, 17);
    this.Shape23.addBox(0.0F, 0.0F, 0.0F, 1, 13, 2);
    this.Shape23.setRotationPoint(-11.5F, 10.0F, -12.65333F);
    this.Shape23.setTextureSize(128, 128);
    this.Shape23.mirror = true;
    setRotation(this.Shape23, 0.0F, 0.0F, 0.0F);
    this.Head = new ModelRenderer(this, "Head");
    this.Head.setRotationPoint(0.0F, -1.0F, 0.0F);
    setRotation(this.Head, -0.1115358F, 0.0F, 0.0F);
    this.Head.mirror = true;
    this.Head.addBox("Head", -7.0F, -5.0F, -6.0F, 14, 7, 9);
    this.Head.addBox("Mouth", -5.0F, -3.0F, -10.0F, 10, 4, 6);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Head2.render(f5);
    this.LeftEye.render(f5);
    this.RightEye.render(f5);
    this.Body.render(f5);
    this.LeftTopLeg.render(f5);
    this.LeftLeg.render(f5);
    this.RightLeg.render(f5);
    this.RightTopLeg.render(f5);
    this.RightArm.render(f5);
    this.RightForearm.render(f5);
    this.RightHand.render(f5);
    this.LeftArm.render(f5);
    this.LeftForearm.render(f5);
    this.LeftHand.render(f5);
    this.Pipe.render(f5);
    this.RightFeet.render(f5);
    this.LeftFeet.render(f5);
    this.Shape1.render(f5);
    this.Shape2.render(f5);
    this.Shape23.render(f5);
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

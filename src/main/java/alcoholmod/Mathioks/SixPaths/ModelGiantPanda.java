package alcoholmod.Mathioks.SixPaths;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGiantPanda extends ModelBase {
  ModelRenderer RightLeg;
  
  ModelRenderer LeftLeg;
  
  ModelRenderer Body;
  
  ModelRenderer LeftArm;
  
  ModelRenderer RightArm;
  
  ModelRenderer Head;
  
  public ModelGiantPanda() {
    this.textureWidth = 128;
    this.textureHeight = 128;
    setTextureOffset("Body.Tail", 54, 23);
    setTextureOffset("Body.SashBodyThingy", 0, 27);
    setTextureOffset("Body.BodyChakraRoadR", 48, 41);
    setTextureOffset("Body.BodyChakraRoadL", 48, 46);
    setTextureOffset("Body.BodyBase", 0, 0);
    setTextureOffset("LeftArm.LeftArm", 1, 53);
    setTextureOffset("LeftArm.LeftHand", 0, 41);
    setTextureOffset("RightArm.RightArm", 21, 53);
    setTextureOffset("RightArm.RightHand", 24, 41);
    setTextureOffset("Head.BottomHead", 62, 16);
    setTextureOffset("Head.TopHead", 62, 31);
    setTextureOffset("Head.LeftEar", 65, 43);
    setTextureOffset("Head.RightEar", 77, 43);
    setTextureOffset("Head.Head_chakra_road", 48, 41);
    this.RightLeg = new ModelRenderer(this, 54, 0);
    this.RightLeg.addBox(-4.0F, 0.0F, -3.0F, 7, 9, 7);
    this.RightLeg.setRotationPoint(5.0F, 15.0F, 0.0F);
    this.RightLeg.setTextureSize(128, 128);
    this.RightLeg.mirror = true;
    setRotation(this.RightLeg, 0.0F, 0.0F, 0.0F);
    this.LeftLeg = new ModelRenderer(this, 82, 0);
    this.LeftLeg.addBox(-3.0F, 0.0F, -3.0F, 7, 9, 7);
    this.LeftLeg.setRotationPoint(-5.0F, 15.0F, 0.0F);
    this.LeftLeg.setTextureSize(128, 128);
    this.LeftLeg.mirror = true;
    setRotation(this.LeftLeg, 0.0F, 0.0F, 0.0F);
    this.Body = new ModelRenderer(this, "Body");
    this.Body.setRotationPoint(-1.0F, 5.0F, 0.0F);
    setRotation(this.Body, 0.0F, 0.0F, 0.0F);
    this.Body.mirror = true;
    this.Body.addBox("Tail", 0.0F, 5.0F, 5.0F, 2, 2, 2);
    this.Body.addBox("SashBodyThingy", -9.0F, 3.0F, -5.0F, 20, 3, 11);
    this.Body.addBox("BodyChakraRoadR", -5.0F, -3.0F, 5.0F, 2, 2, 3);
    this.Body.addBox("BodyChakraRoadL", 3.0F, -6.0F, 5.0F, 4, 4, 6);
    this.Body.addBox("BodyBase", -8.0F, -8.0F, -4.0F, 18, 18, 9);
    this.LeftArm = new ModelRenderer(this, "LeftArm");
    this.LeftArm.setRotationPoint(-9.0F, 0.0F, 0.0F);
    setRotation(this.LeftArm, 0.0F, 0.0F, 0.0F);
    this.LeftArm.mirror = true;
    this.LeftArm.addBox("LeftArm", -6.0F, -2.0F, -1.0F, 6, 4, 3);
    this.LeftArm.addBox("LeftHand", -7.0F, -2.0F, -7.0F, 4, 4, 8);
    this.RightArm = new ModelRenderer(this, "RightArm");
    this.RightArm.setRotationPoint(9.0F, 0.0F, 0.0F);
    setRotation(this.RightArm, 0.0F, 0.0F, 0.0F);
    this.RightArm.mirror = true;
    this.RightArm.addBox("RightArm", 0.0F, -2.0F, -1.0F, 6, 4, 3);
    this.RightArm.addBox("RightHand", 3.0F, -2.0F, -7.0F, 4, 4, 8);
    this.Head = new ModelRenderer(this, "Head");
    this.Head.setRotationPoint(0.0F, -8.0F, 0.0F);
    setRotation(this.Head, 0.0F, 0.0F, 0.0F);
    this.Head.mirror = true;
    this.Head.addBox("BottomHead", -6.0F, -1.0F, -5.0F, 12, 6, 9);
    this.Head.addBox("TopHead", -5.0F, -6.0F, -3.0F, 10, 6, 6);
    this.Head.addBox("LeftEar", -4.0F, -7.0F, -2.0F, 2, 1, 3);
    this.Head.addBox("RightEar", 2.0F, -7.0F, -2.0F, 2, 1, 3);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.RightLeg.render(f5);
    this.LeftLeg.render(f5);
    this.Body.render(f5);
    this.LeftArm.render(f5);
    this.RightArm.render(f5);
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

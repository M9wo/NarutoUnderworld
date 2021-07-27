package alcoholmod.Mathioks.Final.Summons.Entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SummonKatsuyuModel extends ModelBase {
  ModelRenderer Body;
  
  ModelRenderer MainBodyFace;
  
  ModelRenderer TailendBody;
  
  ModelRenderer Head;
  
  public SummonKatsuyuModel() {
    this.textureWidth = 256;
    this.textureHeight = 256;
    setTextureOffset("Body.MidBody", 2, 86);
    setTextureOffset("Body.Base_body", 2, 127);
    setTextureOffset("Body.TopBody", 2, 51);
    setTextureOffset("TailendBody.BodyTail", 2, 27);
    setTextureOffset("TailendBody.Tail", 2, 2);
    setTextureOffset("TailendBody.EndTail", 32, 31);
    setTextureOffset("MainBodyFace.MainBody", 152, 2);
    setTextureOffset("Head.Head", 82, 2);
    setTextureOffset("Head.RightEye", 67, 2);
    setTextureOffset("Head.RightEyeAntler", 58, 2);
    setTextureOffset("Head.LeftEyeAntler", 58, 2);
    setTextureOffset("Head.MouthLeftThingy", 48, 2);
    setTextureOffset("Head.MouthRightThingy", 48, 2);
    setTextureOffset("Head.LeftEye", 67, 2);
    this.Body = new ModelRenderer(this, "Body");
    this.Body.setRotationPoint(0.0F, 16.0F, 7.0F);
    setRotation(this.Body, 0.0F, 0.0F, 0.0F);
    this.Body.mirror = true;
    this.Body.addBox("MidBody", -9.0F, -6.0F, -15.0F, 18, 5, 35);
    this.Body.addBox("Base_body", -11.0F, -1.0F, -18.0F, 22, 9, 40);
    this.Body.addBox("TopBody", -5.0F, -9.0F, -13.0F, 10, 3, 31);
    this.TailendBody = new ModelRenderer(this, "TailendBody");
    this.TailendBody.setRotationPoint(0.0F, 0.0F, 17.0F);
    setRotation(this.TailendBody, 0.0F, 0.0F, 0.0F);
    this.TailendBody.mirror = true;
    this.TailendBody.addBox("BodyTail", -4.0F, -7.0F, 1.0F, 8, 14, 5);
    this.TailendBody.addBox("Tail", -7.0F, -4.0F, 1.0F, 14, 10, 8);
    this.TailendBody.addBox("EndTail", -4.0F, -1.0F, 8.0F, 8, 6, 7);
    this.Body.addChild(this.TailendBody);
    this.MainBodyFace = new ModelRenderer(this, "MainBodyFace");
    this.MainBodyFace.setRotationPoint(0.0F, -4.0F, -10.0F);
    setRotation(this.MainBodyFace, 0.0F, 0.0F, 0.0F);
    this.MainBodyFace.mirror = true;
    this.MainBodyFace.addBox("MainBody", -9.0F, 0.0F, -3.0F, 18, 25, 10);
    this.Head = new ModelRenderer(this, "Head");
    this.Head.setRotationPoint(-1.0F, -1.0F, 0.0F);
    setRotation(this.Head, 0.0F, 0.0F, 0.0F);
    this.Head.mirror = true;
    this.Head.addBox("Head", -9.0F, -8.0F, -7.0F, 20, 11, 14);
    this.Head.addBox("RightEye", 4.0F, -13.0F, -5.0F, 4, 3, 3);
    this.Head.addBox("RightEyeAntler", -5.0F, -12.0F, -4.0F, 2, 4, 2);
    this.Head.addBox("LeftEyeAntler", 5.0F, -12.0F, -4.0F, 2, 4, 2);
    this.Head.addBox("MouthLeftThingy", -5.0F, -2.0F, -9.0F, 2, 2, 2);
    this.Head.addBox("MouthRightThingy", 5.0F, -2.0F, -9.0F, 2, 2, 2);
    this.Head.addBox("LeftEye", -6.0F, -13.0F, -5.0F, 4, 3, 3);
    this.MainBodyFace.addChild(this.Head);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Body.render(f5);
    this.MainBodyFace.render(f5);
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

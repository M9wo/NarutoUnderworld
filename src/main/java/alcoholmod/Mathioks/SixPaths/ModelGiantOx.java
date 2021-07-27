package alcoholmod.Mathioks.SixPaths;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGiantOx extends ModelBase {
  ModelRenderer horn5;
  
  ModelRenderer horn3;
  
  ModelRenderer Fat1;
  
  ModelRenderer Fat;
  
  ModelRenderer Hair1;
  
  ModelRenderer Hair2;
  
  ModelRenderer Hair4;
  
  ModelRenderer Hair3;
  
  ModelRenderer Tail;
  
  ModelRenderer head;
  
  ModelRenderer body;
  
  ModelRenderer leg1;
  
  ModelRenderer leg2;
  
  ModelRenderer leg3;
  
  ModelRenderer leg4;
  
  ModelRenderer horn4;
  
  ModelRenderer horn2;
  
  ModelRenderer udders;
  
  ModelRenderer horn1;
  
  protected void addChildTo(ModelRenderer child, ModelRenderer parent) {
    child.rotationPointX -= parent.rotationPointX;
    child.rotationPointY -= parent.rotationPointY;
    child.rotationPointZ -= parent.rotationPointZ;
    child.rotateAngleX -= parent.rotateAngleX;
    child.rotateAngleY -= parent.rotateAngleY;
    child.rotateAngleZ -= parent.rotateAngleZ;
    parent.addChild(child);
  }
  
  public ModelGiantOx() {
    this.textureWidth = 128;
    this.textureHeight = 256;
    this.horn5 = new ModelRenderer(this, 117, 5);
    this.horn5.addBox(0.0F, 0.0F, -4.0F, 1, 1, 4);
    this.horn5.setRotationPoint(5.3F, 0.3F, -10.0F);
    this.horn5.setTextureSize(128, 256);
    this.horn5.mirror = true;
    setRotation(this.horn5, 0.26025F, -0.3717861F, 0.3346075F);
    this.horn3 = new ModelRenderer(this, 77, 6);
    this.horn3.addBox(0.0F, 0.0F, -4.0F, 1, 1, 4);
    this.horn3.setRotationPoint(-5.3F, -0.5F, -10.0F);
    this.horn3.setTextureSize(128, 256);
    this.horn3.mirror = true;
    setRotation(this.horn3, 0.5576792F, 0.2230717F, 0.4833219F);
    this.Fat1 = new ModelRenderer(this, 0, 72);
    this.Fat1.addBox(0.0F, 0.0F, 0.0F, 10, 2, 6);
    this.Fat1.setRotationPoint(-5.0F, 0.0F, 0.0F);
    this.Fat1.setTextureSize(128, 256);
    this.Fat1.mirror = true;
    setRotation(this.Fat1, 0.0F, 0.0F, 0.0F);
    this.Fat = new ModelRenderer(this, 0, 54);
    this.Fat.addBox(0.0F, 0.0F, 0.0F, 10, 4, 8);
    this.Fat.setRotationPoint(-5.0F, -2.0F, -8.0F);
    this.Fat.setTextureSize(128, 256);
    this.Fat.mirror = true;
    setRotation(this.Fat, 0.0F, 0.0F, 0.0F);
    this.Hair1 = new ModelRenderer(this, 44, 50);
    this.Hair1.addBox(0.0F, 0.0F, 0.0F, 2, 16, 22);
    this.Hair1.setRotationPoint(3.0F, 3.0F, -8.0F);
    this.Hair1.setTextureSize(128, 256);
    this.Hair1.mirror = true;
    setRotation(this.Hair1, 0.0F, 0.0F, -0.185893F);
    this.Hair2 = new ModelRenderer(this, 44, 92);
    this.Hair2.addBox(-1.0F, 0.0F, 0.0F, 2, 16, 22);
    this.Hair2.setRotationPoint(-4.0F, 3.0F, -8.0F);
    this.Hair2.setTextureSize(128, 256);
    this.Hair2.mirror = true;
    setRotation(this.Hair2, 0.0F, 0.0F, 0.185895F);
    this.Hair4 = new ModelRenderer(this, 44, 154);
    this.Hair4.addBox(0.0F, 0.0F, 0.0F, 12, 12, 2);
    this.Hair4.setRotationPoint(-6.0F, 6.0F, 12.0F);
    this.Hair4.setTextureSize(128, 256);
    this.Hair4.mirror = true;
    setRotation(this.Hair4, 0.223071F, 0.0F, 0.0F);
    this.Hair3 = new ModelRenderer(this, 44, 136);
    this.Hair3.addBox(0.0F, 0.0F, 0.0F, 12, 12, 2);
    this.Hair3.setRotationPoint(-6.0F, 6.0F, -7.0F);
    this.Hair3.setTextureSize(128, 256);
    this.Hair3.mirror = true;
    setRotation(this.Hair3, -0.2230717F, 0.0F, 0.0F);
    this.Tail = new ModelRenderer(this, 38, 0);
    this.Tail.addBox(0.0F, 0.0F, 0.0F, 2, 8, 1);
    this.Tail.setRotationPoint(-1.0F, 4.0F, 13.0F);
    this.Tail.setTextureSize(128, 256);
    this.Tail.mirror = true;
    setRotation(this.Tail, 0.4089647F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-4.0F, -4.0F, -6.0F, 8, 8, 6);
    this.head.setRotationPoint(0.0F, 4.0F, -8.0F);
    this.head.setTextureSize(128, 256);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.body = new ModelRenderer(this, 30, 11);
    this.body.addBox(-6.0F, -10.0F, -7.0F, 12, 22, 10);
    this.body.setRotationPoint(0.0F, 5.0F, 2.0F);
    this.body.setTextureSize(128, 256);
    this.body.mirror = true;
    setRotation(this.body, 1.570796F, 0.0F, 0.0F);
    this.leg1 = new ModelRenderer(this, 0, 16);
    this.leg1.addBox(-3.0F, 0.0F, -2.0F, 4, 12, 4);
    this.leg1.setRotationPoint(-3.0F, 12.0F, 11.0F);
    this.leg1.setTextureSize(128, 256);
    this.leg1.mirror = true;
    setRotation(this.leg1, 0.0F, 0.0F, 0.0F);
    this.leg2 = new ModelRenderer(this, 0, 16);
    this.leg2.addBox(-1.0F, 0.0F, -2.0F, 4, 12, 4);
    this.leg2.setRotationPoint(3.0F, 12.0F, 11.0F);
    this.leg2.setTextureSize(128, 256);
    this.leg2.mirror = true;
    setRotation(this.leg2, 0.0F, 0.0F, 0.0F);
    this.leg3 = new ModelRenderer(this, 0, 16);
    this.leg3.addBox(-3.0F, 0.0F, -3.0F, 4, 12, 4);
    this.leg3.setRotationPoint(-3.0F, 12.0F, -5.0F);
    this.leg3.setTextureSize(128, 256);
    this.leg3.mirror = true;
    setRotation(this.leg3, 0.0F, 0.0F, 0.0F);
    this.leg4 = new ModelRenderer(this, 0, 16);
    this.leg4.addBox(-1.0F, 0.0F, -3.0F, 4, 12, 4);
    this.leg4.setRotationPoint(3.0F, 12.0F, -5.0F);
    this.leg4.setTextureSize(128, 256);
    this.leg4.mirror = true;
    setRotation(this.leg4, 0.0F, 0.0F, 0.0F);
    this.horn4 = new ModelRenderer(this, 109, 0);
    this.horn4.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 1);
    this.horn4.setRotationPoint(3.0F, -2.0F, -10.5F);
    this.horn4.setTextureSize(128, 256);
    this.horn4.mirror = true;
    setRotation(this.horn4, 0.0F, 0.0F, -0.8551066F);
    this.horn2 = new ModelRenderer(this, 90, 0);
    this.horn2.addBox(0.0F, 0.0F, 0.0F, 6, 2, 2);
    this.horn2.setRotationPoint(-3.0F, -2.0F, -11.0F);
    this.horn2.setTextureSize(128, 256);
    this.horn2.mirror = true;
    setRotation(this.horn2, 0.0F, 0.0F, 0.0F);
    this.udders = new ModelRenderer(this, 52, 0);
    this.udders.addBox(-2.0F, -3.0F, 0.0F, 4, 6, 2);
    this.udders.setRotationPoint(0.0F, 14.0F, 10.0F);
    this.udders.setTextureSize(128, 256);
    this.udders.mirror = true;
    setRotation(this.udders, 1.570796F, 0.0F, 0.0F);
    this.horn1 = new ModelRenderer(this, 82, 0);
    this.horn1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1);
    this.horn1.setRotationPoint(-3.0F, -2.0F, -10.5F);
    this.horn1.setTextureSize(128, 256);
    this.horn1.mirror = true;
    setRotation(this.horn1, 0.0F, 0.0F, 0.8551081F);
    addChildTo(this.horn1, this.head);
    addChildTo(this.horn2, this.head);
    addChildTo(this.horn3, this.head);
    addChildTo(this.horn4, this.head);
    addChildTo(this.horn5, this.head);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    if (this.isChild) {
      float var8 = 2.0F;
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 5.0F * f5, 2.0F * f5);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
      GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
      this.Fat1.render(f5);
      this.Fat.render(f5);
      this.Hair1.render(f5);
      this.Hair2.render(f5);
      this.Hair4.render(f5);
      this.Hair3.render(f5);
      this.Tail.render(f5);
      this.head.render(f5);
      this.body.render(f5);
      this.leg1.render(f5);
      this.leg2.render(f5);
      this.leg3.render(f5);
      this.leg4.render(f5);
      this.udders.render(f5);
      GL11.glPopMatrix();
    } else {
      this.Fat1.render(f5);
      this.Fat.render(f5);
      this.Hair1.render(f5);
      this.Hair2.render(f5);
      this.Hair4.render(f5);
      this.Hair3.render(f5);
      this.Tail.render(f5);
      this.head.render(f5);
      this.body.render(f5);
      this.leg1.render(f5);
      this.leg2.render(f5);
      this.leg3.render(f5);
      this.leg4.render(f5);
      this.udders.render(f5);
    } 
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    setRotationAngles(f, f1, f2, f3, f4, f5, (Entity)null);
    this.Tail.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.head.rotateAngleX = f4 / 57.295776F;
    this.head.rotateAngleY = f3 / 57.295776F;
    this.body.rotateAngleX = 1.570796F;
    this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1;
    this.leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + 3.141593F) * 1.4F * f1;
    this.leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
  }
}

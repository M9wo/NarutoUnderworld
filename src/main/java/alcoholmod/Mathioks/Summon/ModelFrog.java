package alcoholmod.Mathioks.Summon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFrog extends ModelBase {
  ModelRenderer body;
  
  ModelRenderer eye;
  
  ModelRenderer eye2;
  
  ModelRenderer mouth;
  
  ModelRenderer mouthb;
  
  ModelRenderer backleg;
  
  ModelRenderer bottomleg;
  
  ModelRenderer toe1;
  
  ModelRenderer toe2;
  
  ModelRenderer backleg2;
  
  ModelRenderer bottomleg2;
  
  ModelRenderer toe3;
  
  ModelRenderer toe4;
  
  ModelRenderer frontleg;
  
  ModelRenderer frontleg2;
  
  ModelRenderer toefront;
  
  ModelRenderer toefront2;
  
  ModelRenderer flllow;
  
  ModelRenderer flllow2;
  
  ModelRenderer toefront3;
  
  ModelRenderer toefront4;
  
  public ModelFrog() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.body = new ModelRenderer(this, 39, 0);
    this.body.addBox(0.0F, 0.0F, 0.0F, 5, 2, 3);
    this.body.setRotationPoint(-2.0F, 20.2F, -1.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0872665F);
    this.eye = new ModelRenderer(this, 30, 0);
    this.eye.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.eye.setRotationPoint(-3.0F, 19.7F, -1.5F);
    this.eye.setTextureSize(64, 32);
    this.eye.mirror = true;
    setRotation(this.eye, 0.0F, 0.0F, 0.0F);
    this.eye2 = new ModelRenderer(this, 25, 0);
    this.eye2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.eye2.setRotationPoint(-3.0F, 19.7F, 1.5F);
    this.eye2.setTextureSize(64, 32);
    this.eye2.mirror = true;
    setRotation(this.eye2, 0.0F, 0.0F, 0.0F);
    this.mouth = new ModelRenderer(this, 25, 3);
    this.mouth.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 3);
    this.mouth.setRotationPoint(-2.0F, 20.2F, -1.0F);
    this.mouth.setTextureSize(64, 32);
    this.mouth.mirror = true;
    setRotation(this.mouth, 0.0F, 0.0F, 0.0523599F);
    this.mouthb = new ModelRenderer(this, 25, 8);
    this.mouthb.addBox(-2.0F, 0.0F, 0.0F, 2, 1, 2);
    this.mouthb.setRotationPoint(-1.5F, 21.2F, -0.5F);
    this.mouthb.setTextureSize(64, 32);
    this.mouthb.mirror = true;
    setRotation(this.mouthb, 0.0F, 0.0F, 0.0872665F);
    this.backleg = new ModelRenderer(this, 35, 10);
    this.backleg.addBox(-2.0F, 0.0F, 0.0F, 3, 1, 1);
    this.backleg.setRotationPoint(2.0F, 21.7F, 1.5F);
    this.backleg.setTextureSize(64, 32);
    this.backleg.mirror = true;
    setRotation(this.backleg, 0.0F, 0.5235988F, -0.0523599F);
    this.bottomleg = new ModelRenderer(this, 45, 15);
    this.bottomleg.addBox(-2.0F, 0.0F, 0.0F, 3, 1, 1);
    this.bottomleg.setRotationPoint(2.0F, 22.1F, 1.5F);
    this.bottomleg.setTextureSize(64, 32);
    this.bottomleg.mirror = true;
    setRotation(this.bottomleg, 0.0F, 0.5235988F, -0.453786F);
    this.toe1 = new ModelRenderer(this, 45, 20);
    this.toe1.addBox(-1.0F, 0.0F, -1.0F, 1, 1, 2);
    this.toe1.setRotationPoint(1.2F, 22.9F, 2.6F);
    this.toe1.setTextureSize(64, 32);
    this.toe1.mirror = true;
    setRotation(this.toe1, 0.0F, 0.5235988F, -0.0523599F);
    this.toe2 = new ModelRenderer(this, 45, 25);
    this.toe2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.toe2.setRotationPoint(-0.7F, 23.0F, 3.1F);
    this.toe2.setTextureSize(64, 32);
    this.toe2.mirror = true;
    setRotation(this.toe2, 0.0F, 0.5235988F, -0.0523599F);
    this.backleg2 = new ModelRenderer(this, 45, 10);
    this.backleg2.addBox(-2.0F, 0.0F, -1.0F, 3, 1, 1);
    this.backleg2.setRotationPoint(2.0F, 21.7F, -0.5F);
    this.backleg2.setTextureSize(64, 32);
    this.backleg2.mirror = true;
    setRotation(this.backleg2, 0.0F, -0.5235988F, -0.0523599F);
    this.bottomleg2 = new ModelRenderer(this, 35, 15);
    this.bottomleg2.addBox(-2.0F, 0.0F, -1.0F, 3, 1, 1);
    this.bottomleg2.setRotationPoint(2.0F, 22.1F, -0.5F);
    this.bottomleg2.setTextureSize(64, 32);
    this.bottomleg2.mirror = true;
    setRotation(this.bottomleg2, 0.0F, -0.5235988F, -0.453786F);
    this.toe3 = new ModelRenderer(this, 35, 20);
    this.toe3.addBox(-1.0F, 0.0F, -1.0F, 1, 1, 2);
    this.toe3.setRotationPoint(1.2F, 22.9F, -1.6F);
    this.toe3.setTextureSize(64, 32);
    this.toe3.mirror = true;
    setRotation(this.toe3, 0.0F, -0.5235988F, -0.0523599F);
    this.toe4 = new ModelRenderer(this, 35, 25);
    this.toe4.addBox(0.0F, 0.0F, -1.0F, 1, 1, 1);
    this.toe4.setRotationPoint(-0.7F, 23.0F, -2.1F);
    this.toe4.setTextureSize(64, 32);
    this.toe4.mirror = true;
    setRotation(this.toe4, 0.0F, -0.5235988F, -0.0523599F);
    this.frontleg = new ModelRenderer(this, 10, 10);
    this.frontleg.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.frontleg.setRotationPoint(-1.7F, 21.2F, -1.4F);
    this.frontleg.setTextureSize(64, 32);
    this.frontleg.mirror = true;
    setRotation(this.frontleg, -0.1396263F, 0.0F, 0.10472F);
    this.frontleg2 = new ModelRenderer(this, 0, 10);
    this.frontleg2.addBox(0.0F, 0.0F, -1.0F, 1, 1, 1);
    this.frontleg2.setRotationPoint(-1.7F, 21.2F, 2.4F);
    this.frontleg2.setTextureSize(64, 32);
    this.frontleg2.mirror = true;
    setRotation(this.frontleg2, 0.1396263F, 0.0F, 0.10472F);
    this.toefront = new ModelRenderer(this, 10, 20);
    this.toefront.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
    this.toefront.setRotationPoint(-1.9F, 22.9F, -2.0F);
    this.toefront.setTextureSize(64, 32);
    this.toefront.mirror = true;
    setRotation(this.toefront, 0.0F, 0.0F, 0.0F);
    this.toefront2 = new ModelRenderer(this, 10, 25);
    this.toefront2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.toefront2.setRotationPoint(-2.6F, 22.9F, -1.5F);
    this.toefront2.setTextureSize(64, 32);
    this.toefront2.mirror = true;
    setRotation(this.toefront2, 0.0F, 0.0F, -0.017453F);
    this.flllow = new ModelRenderer(this, 10, 15);
    this.flllow.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.flllow.setRotationPoint(-1.8F, 22.2F, -1.5F);
    this.flllow.setTextureSize(64, 32);
    this.flllow.mirror = true;
    setRotation(this.flllow, 0.0F, 0.0F, 0.0872665F);
    this.flllow2 = new ModelRenderer(this, 0, 15);
    this.flllow2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.flllow2.setRotationPoint(-1.8F, 22.2F, 1.5F);
    this.flllow2.setTextureSize(64, 32);
    this.flllow2.mirror = true;
    setRotation(this.flllow2, 0.0F, 0.0F, 0.0872665F);
    this.toefront3 = new ModelRenderer(this, 0, 20);
    this.toefront3.addBox(0.0F, 0.0F, -2.0F, 1, 1, 2);
    this.toefront3.setRotationPoint(-1.9F, 22.9F, 3.0F);
    this.toefront3.setTextureSize(64, 32);
    this.toefront3.mirror = true;
    setRotation(this.toefront3, 0.0F, 0.0F, 0.0F);
    this.toefront4 = new ModelRenderer(this, 0, 25);
    this.toefront4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
    this.toefront4.setRotationPoint(-2.6F, 22.9F, 1.5F);
    this.toefront4.setTextureSize(64, 32);
    this.toefront4.mirror = true;
    setRotation(this.toefront4, 0.0F, 0.0F, -0.017453F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    this.body.render(f5);
    this.eye.render(f5);
    this.eye2.render(f5);
    this.mouth.render(f5);
    this.mouthb.render(f5);
    this.backleg.render(f5);
    this.bottomleg.render(f5);
    this.toe1.render(f5);
    this.toe2.render(f5);
    this.backleg2.render(f5);
    this.bottomleg2.render(f5);
    this.toe3.render(f5);
    this.toe4.render(f5);
    this.frontleg.render(f5);
    this.frontleg2.render(f5);
    this.toefront.render(f5);
    this.toefront2.render(f5);
    this.flllow.render(f5);
    this.flllow2.render(f5);
    this.toefront3.render(f5);
    this.toefront4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    setRotationAngles(f, f1, f2, f3, f4, f5, (Entity)null);
  }
  
  protected void addChildTo(ModelRenderer child, ModelRenderer parent) {
    child.rotationPointX -= parent.rotationPointX;
    child.rotationPointY -= parent.rotationPointY;
    child.rotationPointZ -= parent.rotationPointZ;
    child.rotateAngleX -= parent.rotateAngleX;
    child.rotateAngleY -= parent.rotateAngleY;
    child.rotateAngleZ -= parent.rotateAngleZ;
    parent.addChild(child);
  }
}

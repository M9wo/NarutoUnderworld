package alcoholmod.Mathioks.Final.CT;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class YinReleaseSwordsModel extends ModelBase {
  ModelRenderer head;
  
  ModelRenderer body;
  
  ModelRenderer rightarm;
  
  ModelRenderer leftarm;
  
  ModelRenderer leftleg;
  
  public YinReleaseSwordsModel() {
    this.textureWidth = 113;
    this.textureHeight = 78;
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-4.0F, -8.0F, -4.0F, 4, 3, 8);
    this.head.setRotationPoint(2.0F, 9.0F, -3.0F);
    this.head.setTextureSize(113, 78);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.body = new ModelRenderer(this, 16, 16);
    this.body.addBox(-4.0F, 0.0F, -2.0F, 2, 1, 41);
    this.body.setRotationPoint(3.0F, 2.0F, -30.0F);
    this.body.setTextureSize(113, 78);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.rightarm = new ModelRenderer(this, 40, 16);
    this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 2, 1, 4);
    this.rightarm.setRotationPoint(-4.0F, 4.0F, 0.0F);
    this.rightarm.setTextureSize(113, 78);
    this.rightarm.mirror = true;
    setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
    this.leftarm = new ModelRenderer(this, 40, 16);
    this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 2, 1, 5);
    this.leftarm.setRotationPoint(6.0F, 4.0F, 0.0F);
    this.leftarm.setTextureSize(113, 78);
    this.leftarm.mirror = true;
    setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
    this.leftleg = new ModelRenderer(this, 0, 16);
    this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 14, 1, 3);
    this.leftleg.setRotationPoint(-5.0F, 2.0F, -2.0F);
    this.leftleg.setTextureSize(113, 78);
    this.leftleg.mirror = true;
    setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.head.render(f5);
    this.body.render(f5);
    this.rightarm.render(f5);
    this.leftarm.render(f5);
    this.leftleg.render(f5);
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

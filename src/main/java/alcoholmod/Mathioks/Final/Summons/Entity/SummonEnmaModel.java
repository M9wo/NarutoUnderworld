package alcoholmod.Mathioks.Final.Summons.Entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SummonEnmaModel extends ModelBase {
  ModelRenderer Staff;
  
  ModelRenderer Tail1;
  
  ModelRenderer Tail2;
  
  ModelRenderer head;
  
  ModelRenderer body;
  
  ModelRenderer rightarm;
  
  ModelRenderer leftarm;
  
  ModelRenderer rightleg;
  
  ModelRenderer leftleg;
  
  public SummonEnmaModel() {
    this.textureWidth = 64;
    this.textureHeight = 128;
    this.Staff = new ModelRenderer(this, 26, 37);
    this.Staff.addBox(-1.0F, -8.0F, 0.0F, 2, 24, 2);
    this.Staff.setRotationPoint(-6.0F, 4.0F, -9.0F);
    this.Staff.setTextureSize(64, 128);
    this.Staff.mirror = true;
    setRotation(this.Staff, 0.0F, 0.0F, 0.0F);
    this.Tail1 = new ModelRenderer(this, 34, 0);
    this.Tail1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 8);
    this.Tail1.setRotationPoint(-1.0F, 10.0F, 2.0F);
    this.Tail1.setTextureSize(64, 128);
    this.Tail1.mirror = true;
    setRotation(this.Tail1, 0.0349066F, 0.0F, 0.0F);
    this.Tail2 = new ModelRenderer(this, 34, 0);
    this.Tail2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 8);
    this.Tail2.setRotationPoint(-1.0F, 10.0F, 9.0F);
    this.Tail2.setTextureSize(64, 128);
    this.Tail2.mirror = true;
    setRotation(this.Tail2, 0.4363323F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
    this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.head.setTextureSize(64, 128);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.body = new ModelRenderer(this, 16, 16);
    this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
    this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.body.setTextureSize(64, 128);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.rightarm = new ModelRenderer(this, 40, 16);
    this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
    this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
    this.rightarm.setTextureSize(64, 128);
    this.rightarm.mirror = true;
    setRotation(this.rightarm, -1.22173F, 0.0F, 0.0F);
    this.leftarm = new ModelRenderer(this, 40, 16);
    this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
    this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
    this.leftarm.setTextureSize(64, 128);
    this.leftarm.mirror = true;
    setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
    this.rightleg = new ModelRenderer(this, 0, 16);
    this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
    this.rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
    this.rightleg.setTextureSize(64, 128);
    this.rightleg.mirror = true;
    setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
    this.leftleg = new ModelRenderer(this, 0, 16);
    this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
    this.leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
    this.leftleg.setTextureSize(64, 128);
    this.leftleg.mirror = true;
    setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Staff.render(f5);
    this.Tail1.render(f5);
    this.Tail2.render(f5);
    this.head.render(f5);
    this.body.render(f5);
    this.rightarm.render(f5);
    this.leftarm.render(f5);
    this.rightleg.render(f5);
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

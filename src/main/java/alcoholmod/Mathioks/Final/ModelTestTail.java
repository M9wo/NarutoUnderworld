package alcoholmod.Mathioks.Final;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTestTail extends ModelBiped {
  ModelRenderer head;
  
  ModelRenderer body;
  
  ModelRenderer rightarm;
  
  ModelRenderer leftarm;
  
  ModelRenderer rightleg;
  
  ModelRenderer leftleg;
  
  ModelRenderer Ear1;
  
  ModelRenderer Ear2;
  
  public ModelRenderer Tail;
  
  ModelRenderer Nose;
  
  public ModelTestTail() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.head = new ModelRenderer((ModelBase)this, 0, 0);
    this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
    this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.body = new ModelRenderer((ModelBase)this, 16, 16);
    this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
    this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.rightarm = new ModelRenderer((ModelBase)this, 40, 16);
    this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
    this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
    this.rightarm.setTextureSize(64, 32);
    this.rightarm.mirror = true;
    setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
    this.leftarm = new ModelRenderer((ModelBase)this, 40, 16);
    this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
    this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
    this.leftarm.setTextureSize(64, 32);
    this.leftarm.mirror = true;
    setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
    this.rightleg = new ModelRenderer((ModelBase)this, 0, 16);
    this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
    this.rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
    this.rightleg.setTextureSize(64, 32);
    this.rightleg.mirror = true;
    setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
    this.leftleg = new ModelRenderer((ModelBase)this, 0, 16);
    this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
    this.leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
    this.leftleg.setTextureSize(64, 32);
    this.leftleg.mirror = true;
    setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
    this.Ear1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Ear1.addBox(0.0F, 0.0F, 0.0F, 3, 7, 3);
    this.Ear1.setRotationPoint(2.0F, -12.0F, -1.0F);
    this.Ear1.setTextureSize(64, 32);
    this.Ear1.mirror = true;
    setRotation(this.Ear1, 0.0F, 0.0F, 0.0F);
    this.Ear2 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Ear2.addBox(0.0F, 0.0F, 0.0F, 3, 7, 3);
    this.Ear2.setRotationPoint(-5.0F, -12.0F, -1.0F);
    this.Ear2.setTextureSize(64, 32);
    this.Ear2.mirror = true;
    setRotation(this.Ear2, 0.0F, 0.0F, 0.0F);
    this.Tail = new ModelRenderer((ModelBase)this, 0, 0);
    this.Tail.addBox(0.0F, 0.0F, 0.0F, 4, 4, 15);
    this.Tail.setRotationPoint(-2.0F, 10.0F, 0.0F);
    this.Tail.setTextureSize(64, 32);
    this.Tail.mirror = true;
    setRotation(this.Tail, 0.715585F, 0.0F, 0.0F);
    this.Nose = new ModelRenderer((ModelBase)this, 0, 0);
    this.Nose.addBox(0.0F, 0.0F, 0.0F, 4, 3, 3);
    this.Nose.setRotationPoint(-2.0F, -4.0F, -6.0F);
    this.Nose.setTextureSize(64, 32);
    this.Nose.mirror = true;
    setRotation(this.Nose, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.head.render(f5);
    this.body.render(f5);
    this.rightarm.render(f5);
    this.leftarm.render(f5);
    this.rightleg.render(f5);
    this.leftleg.render(f5);
    this.Ear1.render(f5);
    this.Ear2.render(f5);
    this.Tail.render(f5);
    this.Nose.render(f5);
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

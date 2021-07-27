package newSusanoo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class NewModelSusanoo extends ModelBiped {
  ModelRenderer head;
  
  ModelRenderer body;
  
  ModelRenderer rightarm;
  
  ModelRenderer leftarm;
  
  public NewModelSusanoo() {
    this.textureWidth = 512;
    this.textureHeight = 512;
    this.head = new ModelRenderer((ModelBase)this, 0, 0);
    this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
    this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.head.setTextureSize(512, 512);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.body = new ModelRenderer((ModelBase)this, 16, 16);
    this.body.addBox(-4.0F, 0.0F, -2.0F, 14, 35, 7);
    this.body.setRotationPoint(-3.0F, 0.0F, -1.0F);
    this.body.setTextureSize(512, 512);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.rightarm = new ModelRenderer((ModelBase)this, 40, 16);
    this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 21, 5);
    this.rightarm.setRotationPoint(-8.0F, 2.0F, 0.0F);
    this.rightarm.setTextureSize(512, 512);
    this.rightarm.mirror = true;
    setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
    this.leftarm = new ModelRenderer((ModelBase)this, 40, 16);
    this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 21, 5);
    this.leftarm.setRotationPoint(8.0F, 2.0F, 0.0F);
    this.leftarm.setTextureSize(512, 512);
    this.leftarm.mirror = true;
    setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f5, f, f1, f2, f3, f4, entity);
    this.head.render(f5);
    this.body.render(f5);
    this.rightarm.render(f5);
    this.leftarm.render(f5);
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

package alcoholmod.Mathioks.UltimatePowers;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTenseigan extends ModelBiped {
  public ModelRenderer head_back;
  
  public ModelRenderer head_left;
  
  public ModelRenderer head_right;
  
  public ModelRenderer cape_back;
  
  public ModelRenderer cape_left;
  
  public ModelRenderer cape_right;
  
  public ModelRenderer head_bottom;
  
  public ModelTenseigan() {
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.head_left = new ModelRenderer((ModelBase)this, 0, 38);
    this.head_left.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.head_left.addBox(5.0F, -3.0F, -5.0F, 1, 4, 11, 0.0F);
    this.cape_back = new ModelRenderer((ModelBase)this, 22, 32);
    this.cape_back.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.cape_back.addBox(-4.0F, 12.0F, -1.0F, 8, 7, 1, 0.0F);
    setRotateAngle(this.cape_back, 0.2268928F, 0.0F, 0.0F);
    this.head_right = new ModelRenderer((ModelBase)this, 0, 38);
    this.head_right.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.head_right.addBox(-6.0F, -3.0F, -5.0F, 1, 4, 11, 0.0F);
    this.cape_right = new ModelRenderer((ModelBase)this, 24, 40);
    this.cape_right.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.cape_right.addBox(-1.8F, 12.5F, -2.0F, 1, 7, 4, 0.0F);
    setRotateAngle(this.cape_right, 0.0F, 0.0F, 0.2268928F);
    this.head_bottom = new ModelRenderer((ModelBase)this, 0, 53);
    this.head_bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.head_bottom.addBox(-5.0F, 1.0F, 2.0F, 10, 1, 3, 0.0F);
    this.head_back = new ModelRenderer((ModelBase)this, 0, 32);
    this.head_back.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.head_back.addBox(-5.0F, -3.0F, 5.0F, 10, 4, 1, 0.0F);
    this.cape_left = new ModelRenderer((ModelBase)this, 24, 40);
    this.cape_left.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.cape_left.addBox(0.8F, 12.5F, -2.0F, 1, 7, 4, 0.0F);
    setRotateAngle(this.cape_left, 0.0F, 0.0F, -0.2268928F);
    this.bipedBody.addChild(this.cape_back);
    this.bipedBody.addChild(this.cape_left);
    this.bipedBody.addChild(this.cape_right);
    this.bipedBody.addChild(this.head_back);
    this.bipedBody.addChild(this.head_left);
    this.bipedBody.addChild(this.head_right);
    this.bipedBody.addChild(this.head_bottom);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    this.head_left.render(f5);
    this.cape_back.render(f5);
    this.head_right.render(f5);
    this.cape_right.render(f5);
    this.head_bottom.render(f5);
    this.head_back.render(f5);
    this.cape_left.render(f5);
  }
  
  public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
  }
}

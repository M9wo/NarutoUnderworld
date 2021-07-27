package FlashModels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SeparateArmTextures extends ModelBiped {
  public SeparateArmTextures(float expand) {
    super(expand, 0.0F, 64, 64);
    this.bipedRightArm = new ModelRenderer((ModelBase)this, 16, 48);
    this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
    this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
    this.bipedRightArm.setTextureSize(64, 64);
    this.bipedRightArm.mirror = true;
    setRotation(this.bipedRightArm, 0.0F, 0.0F, 0.0F);
    this.bipedLeftArm = new ModelRenderer((ModelBase)this, 0, 48);
    this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
    this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
    this.bipedLeftArm.setTextureSize(64, 64);
    this.bipedLeftArm.mirror = true;
    setRotation(this.bipedLeftArm, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
}

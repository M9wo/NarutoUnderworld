package alcoholmod.Mathioks.Rinnegan;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SideOnly(Side.CLIENT)
public class ModelSusanoo3 extends ModelBiped {
  ModelRenderer head2;
  
  ModelRenderer body2;
  
  ModelRenderer body3;
  
  public ModelSusanoo3() {
    this.textureWidth = 128;
    this.textureHeight = 64;
    this.head2 = new ModelRenderer((ModelBase)this, 96, 0);
    this.head2.addBox(-3.0F, -8.0F, -4.0F, 6, 8, 8);
    this.head2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.head2.setTextureSize(128, 64);
    this.head2.mirror = true;
    setRotation(this.head2, 0.0F, 0.0F, 0.0F);
    this.bipedHead = new ModelRenderer((ModelBase)this, 0, 0);
    this.bipedHead.addBox(-4.0F, -10.0F, -5.0F, 8, 9, 10);
    this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.bipedHead.setTextureSize(128, 64);
    this.bipedHead.mirror = true;
    setRotation(this.bipedHead, 0.0F, 0.0F, 0.0F);
    this.bipedHead.addChild(this.head2);
    this.body2 = new ModelRenderer((ModelBase)this, 0, 20);
    this.body2.addBox(-7.0F, 0.0F, -4.0F, 14, 22, 8);
    this.body2.setRotationPoint(0.0F, 6.0F, 0.0F);
    this.body2.setTextureSize(128, 64);
    this.body2.mirror = true;
    setRotation(this.body2, 0.0F, 0.0F, 0.0F);
    this.body3 = new ModelRenderer((ModelBase)this, 60, 18);
    this.body3.addBox(-1.0F, 0.0F, -1.0F, 2, 30, 2);
    this.body3.setRotationPoint(0.0F, -2.0F, 4.0F);
    this.body3.setTextureSize(128, 64);
    this.body3.mirror = true;
    setRotation(this.body3, 0.0F, 0.0F, 0.0F);
    this.bipedRightArm = new ModelRenderer((ModelBase)this, 44, 20);
    this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 22, 4);
    this.bipedRightArm.setRotationPoint(-10.0F, 3.0F, 0.0F);
    this.bipedRightArm.setTextureSize(128, 64);
    this.bipedRightArm.mirror = true;
    setRotation(this.bipedRightArm, 0.0F, 0.0F, 0.0F);
    this.bipedLeftArm = new ModelRenderer((ModelBase)this, 44, 20);
    this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 22, 4);
    this.bipedLeftArm.setRotationPoint(10.0F, 3.0F, 0.0F);
    this.bipedLeftArm.setTextureSize(128, 64);
    this.bipedLeftArm.mirror = true;
    setRotation(this.bipedLeftArm, 0.0F, 0.0F, 0.0F);
    this.bipedBody = new ModelRenderer((ModelBase)this, 36, 0);
    this.bipedBody.addBox(-11.0F, 0.0F, -4.0F, 22, 6, 8);
    this.bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.bipedBody.setTextureSize(128, 64);
    this.bipedBody.mirror = true;
    setRotation(this.bipedBody, 0.0F, 0.0F, 0.0F);
    this.bipedBody.addChild(this.body2);
    this.bipedBody.addChild(this.body3);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.bipedHead.render(f5);
    this.bipedBody.render(f5);
    this.bipedRightArm.render(f5);
    this.bipedLeftArm.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    this.bipedRightArm.rotationPointX = -10.0F;
    this.bipedLeftArm.rotationPointX = 10.0F;
    this.bipedRightArm.rotationPointY = 3.0F;
    this.bipedLeftArm.rotationPointY = 3.0F;
  }
}

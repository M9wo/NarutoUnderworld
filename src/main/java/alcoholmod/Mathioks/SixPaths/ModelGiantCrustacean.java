package alcoholmod.Mathioks.SixPaths;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGiantCrustacean extends ModelBase {
  ModelRenderer body;
  
  ModelRenderer body2;
  
  ModelRenderer leg1;
  
  ModelRenderer leg2;
  
  ModelRenderer leg3;
  
  ModelRenderer leg4;
  
  ModelRenderer leg5;
  
  ModelRenderer leg6;
  
  ModelRenderer leg7;
  
  ModelRenderer leg8;
  
  ModelRenderer shear1;
  
  ModelRenderer shear2;
  
  ModelRenderer shear3;
  
  ModelRenderer shear4;
  
  public ModelGiantCrustacean() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.body = new ModelRenderer(this, 0, 0);
    this.body.addBox(0.0F, 0.0F, 0.0F, 5, 1, 5);
    this.body.setRotationPoint(-2.5F, 17.0F, -2.5F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.body2 = new ModelRenderer(this, 36, 0);
    this.body2.addBox(0.0F, 0.0F, 0.0F, 7, 2, 7);
    this.body2.setRotationPoint(-3.5F, 18.0F, -3.5F);
    this.body2.setTextureSize(64, 32);
    this.body2.mirror = true;
    setRotation(this.body2, 0.0F, 0.0F, 0.0F);
    this.leg1 = new ModelRenderer(this, 0, 10);
    this.leg1.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1);
    this.leg1.setRotationPoint(2.0F, 20.0F, -2.5F);
    this.leg1.setTextureSize(64, 32);
    this.leg1.mirror = true;
    setRotation(this.leg1, -0.261799F, 0.0F, -0.7853982F);
    this.leg2 = new ModelRenderer(this, 6, 10);
    this.leg2.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1);
    this.leg2.setRotationPoint(-2.0F, 20.0F, -2.5F);
    this.leg2.setTextureSize(64, 32);
    this.leg2.mirror = true;
    setRotation(this.leg2, -0.261799F, 0.0F, 0.7853982F);
    this.leg3 = new ModelRenderer(this, 0, 10);
    this.leg3.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1);
    this.leg3.setRotationPoint(2.0F, 20.0F, -1.0F);
    this.leg3.setTextureSize(64, 32);
    this.leg3.mirror = true;
    setRotation(this.leg3, 0.0F, 0.0F, -0.7853982F);
    this.leg4 = new ModelRenderer(this, 6, 10);
    this.leg4.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1);
    this.leg4.setRotationPoint(-2.0F, 20.0F, -1.0F);
    this.leg4.setTextureSize(64, 32);
    this.leg4.mirror = true;
    setRotation(this.leg4, 0.0F, 0.0F, 0.7853982F);
    this.leg5 = new ModelRenderer(this, 0, 10);
    this.leg5.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1);
    this.leg5.setRotationPoint(2.0F, 20.0F, 1.0F);
    this.leg5.setTextureSize(64, 32);
    this.leg5.mirror = true;
    setRotation(this.leg5, 0.261799F, 0.0F, -0.7853982F);
    this.leg6 = new ModelRenderer(this, 6, 10);
    this.leg6.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1);
    this.leg6.setRotationPoint(-2.0F, 20.0F, 1.0F);
    this.leg6.setTextureSize(64, 32);
    this.leg6.mirror = true;
    setRotation(this.leg6, 0.261799F, 0.0F, 0.7853982F);
    this.leg7 = new ModelRenderer(this, 0, 10);
    this.leg7.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1);
    this.leg7.setRotationPoint(1.8F, 20.0F, 2.0F);
    this.leg7.setTextureSize(64, 32);
    this.leg7.mirror = true;
    setRotation(this.leg7, 0.645772F, 0.0F, -0.7853982F);
    this.leg8 = new ModelRenderer(this, 6, 10);
    this.leg8.addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1);
    this.leg8.setRotationPoint(-1.8F, 20.0F, 2.0F);
    this.leg8.setTextureSize(64, 32);
    this.leg8.mirror = true;
    setRotation(this.leg8, 0.645772F, 0.0F, 0.7853982F);
    this.shear1 = new ModelRenderer(this, 24, 0);
    this.shear1.addBox(0.0F, 0.0F, -2.0F, 3, 1, 2);
    this.shear1.setRotationPoint(-3.5F, 19.0F, -3.5F);
    this.shear1.setTextureSize(64, 32);
    this.shear1.mirror = true;
    setRotation(this.shear1, 0.0F, 0.0F, 0.0F);
    this.shear2 = new ModelRenderer(this, 24, 6);
    this.shear2.addBox(-3.0F, 0.0F, -2.0F, 3, 1, 2);
    this.shear2.setRotationPoint(3.5F, 19.0F, -3.5F);
    this.shear2.setTextureSize(64, 32);
    this.shear2.mirror = true;
    setRotation(this.shear2, 0.0F, 0.0F, 0.0F);
    this.shear3 = new ModelRenderer(this, 0, 24);
    this.shear3.addBox(0.0F, 0.0F, -1.0F, 2, 1, 1);
    this.shear3.setRotationPoint(-3.3F, 19.5F, -3.5F);
    this.shear3.setTextureSize(64, 32);
    this.shear3.mirror = true;
    setRotation(this.shear3, 0.0F, 0.0F, 0.349066F);
    this.shear4 = new ModelRenderer(this, 10, 24);
    this.shear4.addBox(-2.0F, 0.0F, -1.0F, 2, 1, 1);
    this.shear4.setRotationPoint(3.3F, 19.5F, -3.5F);
    this.shear4.setTextureSize(64, 32);
    this.shear4.mirror = true;
    setRotation(this.shear4, 0.0F, 0.0F, -0.349066F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    if (this.isChild) {
      float f6 = 2.0F;
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 5.0F * f5, 2.0F * f5);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
      GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
      this.body.render(f5);
      this.body2.render(f5);
      this.leg1.render(f5);
      this.leg2.render(f5);
      this.leg3.render(f5);
      this.leg4.render(f5);
      this.leg5.render(f5);
      this.leg6.render(f5);
      this.leg7.render(f5);
      this.leg8.render(f5);
      this.shear1.render(f5);
      this.shear2.render(f5);
      this.shear3.render(f5);
      this.shear4.render(f5);
      GL11.glPopMatrix();
    } else {
      this.body.render(f5);
      this.body2.render(f5);
      this.leg1.render(f5);
      this.leg2.render(f5);
      this.leg3.render(f5);
      this.leg4.render(f5);
      this.leg5.render(f5);
      this.leg6.render(f5);
      this.leg7.render(f5);
      this.leg8.render(f5);
      this.shear1.render(f5);
      this.shear2.render(f5);
      this.shear3.render(f5);
      this.shear4.render(f5);
    } 
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    this.leg1.rotateAngleX = -0.261799F + 0.7853982F * MathHelper.cos(par1) * par2;
    this.leg2.rotateAngleX = -0.261799F - 0.7853982F * MathHelper.cos(par1) * par2;
    this.leg3.rotateAngleX = -0.7853982F * MathHelper.cos(par1) * par2;
    this.leg4.rotateAngleX = 0.7853982F * MathHelper.cos(par1) * par2;
    this.leg5.rotateAngleX = 0.261799F + 0.7853982F * MathHelper.cos(par1) * par2;
    this.leg6.rotateAngleX = 0.261799F - 0.7853982F * MathHelper.cos(par1) * par2;
    this.leg7.rotateAngleX = 0.645772F - 0.7853982F * MathHelper.cos(par1) * par2;
    this.leg8.rotateAngleX = 0.645772F + 0.7853982F * MathHelper.cos(par1) * par2;
  }
}

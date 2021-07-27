package alcoholmod.Mathioks.Summon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCrocodile extends ModelBase {
  ModelRenderer body;
  
  ModelRenderer leg1;
  
  ModelRenderer leg2;
  
  ModelRenderer leg3;
  
  ModelRenderer leg4;
  
  ModelRenderer upperhead;
  
  ModelRenderer lowerhead;
  
  ModelRenderer tail;
  
  ModelRenderer rug;
  
  ModelRenderer tailrug;
  
  ModelRenderer stick;
  
  public ModelCrocodile() {
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.body = new ModelRenderer(this, 0, 0);
    this.body.addBox(0.0F, 0.0F, 0.0F, 7, 3, 14);
    this.body.setRotationPoint(-3.5F, 20.0F, -7.0F);
    this.body.setTextureSize(64, 64);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.leg1 = new ModelRenderer(this, 56, 0);
    this.leg1.addBox(-2.0F, 0.0F, 0.0F, 2, 4, 2);
    this.leg1.setRotationPoint(-2.9F, 21.0F, -6.0F);
    this.leg1.setTextureSize(64, 64);
    this.leg1.mirror = true;
    setRotation(this.leg1, 0.0F, 0.0F, 0.1745329F);
    this.leg2 = new ModelRenderer(this, 56, 6);
    this.leg2.addBox(-2.0F, 0.0F, 0.0F, 2, 4, 2);
    this.leg2.setRotationPoint(-2.9F, 21.0F, 5.0F);
    this.leg2.setTextureSize(64, 64);
    this.leg2.mirror = true;
    setRotation(this.leg2, 0.0F, 0.0F, 0.1745329F);
    this.leg3 = new ModelRenderer(this, 56, 12);
    this.leg3.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2);
    this.leg3.setRotationPoint(3.1F, 21.0F, -6.0F);
    this.leg3.setTextureSize(64, 64);
    this.leg3.mirror = true;
    setRotation(this.leg3, 0.0F, 0.0F, -0.1745329F);
    this.leg4 = new ModelRenderer(this, 56, 18);
    this.leg4.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2);
    this.leg4.setRotationPoint(3.1F, 21.0F, 5.0F);
    this.leg4.setTextureSize(64, 64);
    this.leg4.mirror = true;
    setRotation(this.leg4, 0.0F, 0.0F, -0.1745329F);
    this.upperhead = new ModelRenderer(this, 0, 17);
    this.upperhead.addBox(-3.0F, -1.0F, -9.0F, 6, 2, 9);
    this.upperhead.setRotationPoint(0.0F, 21.5F, -7.0F);
    this.upperhead.setTextureSize(64, 64);
    this.upperhead.mirror = true;
    setRotation(this.upperhead, 0.0F, 0.0F, 0.0F);
    this.lowerhead = new ModelRenderer(this, 0, 28);
    this.lowerhead.addBox(-3.0F, 1.0F, -9.0F, 6, 1, 9);
    this.lowerhead.setRotationPoint(0.0F, 21.5F, -7.0F);
    this.lowerhead.setTextureSize(64, 64);
    this.lowerhead.mirror = true;
    setRotation(this.lowerhead, 0.0F, 0.0F, 0.0F);
    this.tail = new ModelRenderer(this, 0, 39);
    this.tail.addBox(-2.0F, -1.0F, 0.0F, 4, 2, 12);
    this.tail.setRotationPoint(0.0F, 22.0F, 6.0F);
    this.tail.setTextureSize(64, 64);
    this.tail.mirror = true;
    setRotation(this.tail, -0.10472F, 0.0F, 0.0F);
    this.rug = new ModelRenderer(this, 36, 11);
    this.rug.addBox(0.0F, 0.0F, 0.0F, 0, 1, 14);
    this.rug.setRotationPoint(0.0F, 19.0F, -7.0F);
    this.rug.setTextureSize(64, 64);
    this.rug.mirror = true;
    setRotation(this.rug, -0.034907F, 0.0F, 0.0F);
    this.tailrug = new ModelRenderer(this, 37, 22);
    this.tailrug.addBox(0.0F, -1.0F, 0.0F, 0, 1, 12);
    this.tailrug.setRotationPoint(0.0F, 21.0F, 6.0F);
    this.tailrug.setTextureSize(64, 64);
    this.tailrug.mirror = true;
    setRotation(this.tailrug, -0.1396263F, 0.0F, 0.0F);
    this.stick = new ModelRenderer(this, 40, 42);
    this.stick.addBox(-0.5F, -2.0F, -8.0F, 1, 4, 1);
    this.stick.setRotationPoint(0.0F, 21.5F, -7.0F);
    this.stick.setTextureSize(64, 64);
    this.stick.mirror = true;
    setRotation(this.stick, -0.0872665F, 0.0F, 0.0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    this.body.render(par7);
    this.leg1.render(par7);
    this.leg2.render(par7);
    this.leg3.render(par7);
    this.leg4.render(par7);
    this.upperhead.render(par7);
    this.lowerhead.render(par7);
    this.tail.render(par7);
    this.rug.render(par7);
    this.tailrug.render(par7);
    this.stick.render(par7);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    this.upperhead.rotateAngleY = par4 / 57.295776F;
    this.lowerhead.rotateAngleY = par4 / 57.295776F;
    this.stick.rotateAngleY = par4 / 57.295776F;
    this.leg1.rotateAngleX = MathHelper.cos(par1 * 1.5F) * 0.7F * par2;
    this.leg2.rotateAngleX = MathHelper.cos(par1 * 1.5F) * -0.7F * par2;
    this.leg3.rotateAngleX = MathHelper.cos(par1 * 1.5F) * -0.7F * par2;
    this.leg4.rotateAngleX = MathHelper.cos(par1 * 1.5F) * 0.7F * par2;
    this.tail.rotateAngleY = MathHelper.cos(par1 * 1.0F) * 0.5F * par2;
    this.tailrug.rotateAngleY = MathHelper.cos(par1 * 1.0F) * 0.5F * par2;
  }
}

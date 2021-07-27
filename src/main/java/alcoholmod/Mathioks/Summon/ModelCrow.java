package alcoholmod.Mathioks.Summon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCrow extends ModelBase {
  ModelRenderer body;
  
  ModelRenderer head;
  
  ModelRenderer snavel;
  
  ModelRenderer wing1;
  
  ModelRenderer wing2;
  
  ModelRenderer achterwingmid;
  
  ModelRenderer achterwinglinks;
  
  ModelRenderer achterwingrechts;
  
  ModelRenderer leg1;
  
  ModelRenderer leg2;
  
  public ModelCrow() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.body = new ModelRenderer(this, 0, 0);
    this.body.addBox(0.0F, 0.0F, 0.0F, 4, 3, 8);
    this.body.setRotationPoint(-2.0F, 19.5F, -4.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 29, 0);
    this.head.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3);
    this.head.setRotationPoint(-1.5F, 19.5F, -7.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.snavel = new ModelRenderer(this, 55, 0);
    this.snavel.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
    this.snavel.setRotationPoint(-0.5F, 21.0F, -9.0F);
    this.snavel.setTextureSize(64, 32);
    this.snavel.mirror = true;
    setRotation(this.snavel, 0.0F, 0.0F, 0.0F);
    this.wing1 = new ModelRenderer(this, 0, 26);
    this.wing1.addBox(0.0F, 0.0F, 0.0F, 10, 0, 6);
    this.wing1.setRotationPoint(1.5F, 19.6F, -4.0F);
    this.wing1.setTextureSize(64, 32);
    this.wing1.mirror = true;
    setRotation(this.wing1, 0.0F, -0.1745329F, 0.0F);
    this.wing2 = new ModelRenderer(this, 0, 17);
    this.wing2.addBox(-9.0F, 0.0F, 0.0F, 10, 0, 6);
    this.wing2.setRotationPoint(-1.5F, 19.6F, -4.0F);
    this.wing2.setTextureSize(64, 32);
    this.wing2.mirror = true;
    setRotation(this.wing2, 0.0F, 0.1745329F, 0.0F);
    this.achterwingmid = new ModelRenderer(this, 29, 10);
    this.achterwingmid.addBox(0.0F, 0.0F, 0.0F, 2, 0, 5);
    this.achterwingmid.setRotationPoint(-1.0F, 19.5F, 3.0F);
    this.achterwingmid.setTextureSize(64, 32);
    this.achterwingmid.mirror = true;
    setRotation(this.achterwingmid, 0.0872665F, 0.0F, 0.0F);
    this.achterwinglinks = new ModelRenderer(this, 33, 24);
    this.achterwinglinks.addBox(-1.0F, 0.0F, 0.0F, 2, 0, 5);
    this.achterwinglinks.setRotationPoint(0.0F, 19.5F, 3.0F);
    this.achterwinglinks.setTextureSize(64, 32);
    this.achterwinglinks.mirror = true;
    setRotation(this.achterwinglinks, 0.0872665F, 0.349066F, 0.0F);
    this.achterwingrechts = new ModelRenderer(this, 49, 20);
    this.achterwingrechts.addBox(-1.0F, 0.0F, 0.0F, 2, 0, 5);
    this.achterwingrechts.setRotationPoint(0.0F, 19.5F, 3.0F);
    this.achterwingrechts.setTextureSize(64, 32);
    this.achterwingrechts.mirror = true;
    setRotation(this.achterwingrechts, 0.0872665F, -0.349066F, 0.0F);
    this.leg1 = new ModelRenderer(this, 50, 6);
    this.leg1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
    this.leg1.setRotationPoint(-1.6F, 21.5F, 2.0F);
    this.leg1.setTextureSize(64, 32);
    this.leg1.mirror = true;
    setRotation(this.leg1, -0.6981317F, 0.0F, 0.0F);
    this.leg2 = new ModelRenderer(this, 50, 12);
    this.leg2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
    this.leg2.setRotationPoint(0.6F, 21.5F, 2.0F);
    this.leg2.setTextureSize(64, 32);
    this.leg2.mirror = true;
    setRotation(this.leg2, -0.6981317F, 0.0F, 0.0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    this.body.render(par7);
    this.head.render(par7);
    this.snavel.render(par7);
    this.wing1.render(par7);
    this.wing2.render(par7);
    this.achterwingmid.render(par7);
    this.achterwinglinks.render(par7);
    this.achterwingrechts.render(par7);
    this.leg1.render(par7);
    this.leg2.render(par7);
    this.wing1.rotateAngleZ = MathHelper.cos(par2 * 0.3332F) * 0.7F * par3;
    this.wing2.rotateAngleZ = MathHelper.cos(par2 * 0.3332F) * -0.7F * par3;
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    setRotationAngles(f, f1, f2, f3, f4, f5, (Entity)null);
    this.wing1.rotateAngleZ = MathHelper.cos(f * 0.3332F) * 0.7F * f1;
    this.wing2.rotateAngleZ = MathHelper.cos(f * 0.3332F) * -0.7F * f1;
  }
}

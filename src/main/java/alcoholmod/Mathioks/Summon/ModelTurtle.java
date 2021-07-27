package alcoholmod.Mathioks.Summon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelTurtle extends ModelBase {
  ModelRenderer body;
  
  ModelRenderer shell;
  
  ModelRenderer leg2;
  
  ModelRenderer leg1;
  
  ModelRenderer leg3;
  
  ModelRenderer leg4;
  
  ModelRenderer head;
  
  ModelRenderer body2;
  
  public ModelTurtle() {
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.body = new ModelRenderer(this, 0, 0);
    this.body.addBox(0.0F, 0.0F, 0.0F, 10, 8, 11);
    this.body.setRotationPoint(-5.0F, 13.0F, -5.5F);
    this.body.setTextureSize(64, 64);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.shell = new ModelRenderer(this, 0, 19);
    this.shell.addBox(0.0F, 0.0F, 0.0F, 11, 3, 12);
    this.shell.setRotationPoint(-5.5F, 18.0F, -6.0F);
    this.shell.setTextureSize(64, 64);
    this.shell.mirror = true;
    setRotation(this.shell, 0.0F, 0.0F, 0.0F);
    this.leg2 = new ModelRenderer(this, 48, 0);
    this.leg2.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3);
    this.leg2.setRotationPoint(3.5F, 20.0F, -4.0F);
    this.leg2.setTextureSize(64, 64);
    this.leg2.mirror = true;
    setRotation(this.leg2, 0.0F, 0.0F, 0.0F);
    this.leg1 = new ModelRenderer(this, 48, 7);
    this.leg1.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3);
    this.leg1.setRotationPoint(-3.5F, 20.0F, -4.0F);
    this.leg1.setTextureSize(64, 64);
    this.leg1.mirror = true;
    setRotation(this.leg1, 0.0F, 0.0F, 0.0F);
    this.leg3 = new ModelRenderer(this, 48, 14);
    this.leg3.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3);
    this.leg3.setRotationPoint(3.5F, 20.0F, 4.0F);
    this.leg3.setTextureSize(64, 64);
    this.leg3.mirror = true;
    setRotation(this.leg3, 0.0F, 0.0F, 0.0F);
    this.leg4 = new ModelRenderer(this, 48, 21);
    this.leg4.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3);
    this.leg4.setRotationPoint(-3.5F, 20.0F, 4.0F);
    this.leg4.setTextureSize(64, 64);
    this.leg4.mirror = true;
    setRotation(this.leg4, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 48, 28);
    this.head.addBox(-1.5F, -1.5F, -5.0F, 3, 3, 5);
    this.head.setRotationPoint(0.0F, 20.0F, -5.0F);
    this.head.setTextureSize(64, 64);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.body2 = new ModelRenderer(this, 0, 34);
    this.body2.addBox(0.0F, 0.0F, 0.0F, 9, 2, 10);
    this.body2.setRotationPoint(-4.5F, 20.0F, -5.0F);
    this.body2.setTextureSize(64, 64);
    this.body2.mirror = true;
    setRotation(this.body2, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    if (this.isChild) {
      float f6 = 2.0F;
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 9.0F * par7, 0.0F * par7);
      GL11.glScalef(1.3F / f6, 1.3F / f6, 1.3F / f6);
      this.head.render(par7);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(1.3F / f6, 1.3F / f6, 1.3F / f6);
      GL11.glTranslatef(0.0F, 13.0F * par7, 0.0F);
      this.body.render(par7);
      this.shell.render(par7);
      this.leg2.render(par7);
      this.leg1.render(par7);
      this.leg3.render(par7);
      this.leg4.render(par7);
      this.body2.render(par7);
      GL11.glPopMatrix();
    } else {
      this.body.render(par7);
      this.shell.render(par7);
      this.leg2.render(par7);
      this.leg1.render(par7);
      this.leg3.render(par7);
      this.leg4.render(par7);
      this.head.render(par7);
      this.body2.render(par7);
    } 
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    this.head.rotateAngleX = par5 / 57.295776F;
    this.head.rotateAngleY = par4 / 57.295776F;
    this.leg1.rotateAngleX = MathHelper.cos(par1 * 1.5F) * 0.7F * par2;
    this.leg2.rotateAngleX = MathHelper.cos(par1 * 1.5F) * -0.7F * par2;
    this.leg3.rotateAngleX = MathHelper.cos(par1 * 1.5F) * 0.7F * par2;
    this.leg4.rotateAngleX = MathHelper.cos(par1 * 1.5F) * -0.7F * par2;
  }
}

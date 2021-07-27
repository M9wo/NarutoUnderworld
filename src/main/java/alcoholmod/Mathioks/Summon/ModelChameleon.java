package alcoholmod.Mathioks.Summon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelChameleon extends ModelBase {
  public ModelRenderer body;
  
  public ModelRenderer head;
  
  ModelRenderer tail;
  
  ModelRenderer leg1;
  
  ModelRenderer leg2;
  
  ModelRenderer leg3;
  
  ModelRenderer leg4;
  
  ModelRenderer headhorn;
  
  public ModelChameleon() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.body = new ModelRenderer(this, 0, 0);
    this.body.addBox(0.0F, 0.0F, 0.0F, 4, 3, 8);
    this.body.setRotationPoint(-2.0F, 19.5F, -4.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 24, 0);
    this.head.addBox(-1.5F, -1.5F, -3.0F, 3, 3, 3);
    this.head.setRotationPoint(0.0F, 21.0F, -4.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.tail = new ModelRenderer(this, 0, 11);
    this.tail.addBox(-1.0F, -3.0F, 0.0F, 2, 4, 4);
    this.tail.setRotationPoint(0.0F, 21.0F, 3.0F);
    this.tail.setTextureSize(64, 32);
    this.tail.mirror = true;
    setRotation(this.tail, 0.0872665F, 0.0F, 0.0F);
    this.leg1 = new ModelRenderer(this, 40, 0);
    this.leg1.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1);
    this.leg1.setRotationPoint(1.3F, 21.0F, -4.0F);
    this.leg1.setTextureSize(64, 32);
    this.leg1.mirror = true;
    setRotation(this.leg1, 0.0F, 0.0F, 0.6981317F);
    this.leg2 = new ModelRenderer(this, 40, 2);
    this.leg2.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1);
    this.leg2.setRotationPoint(1.3F, 21.0F, 3.0F);
    this.leg2.setTextureSize(64, 32);
    this.leg2.mirror = true;
    setRotation(this.leg2, 0.0F, 0.0F, 0.6981317F);
    this.leg3 = new ModelRenderer(this, 40, 4);
    this.leg3.addBox(-4.0F, 0.0F, 0.0F, 4, 1, 1);
    this.leg3.setRotationPoint(-1.3F, 21.0F, -4.0F);
    this.leg3.setTextureSize(64, 32);
    this.leg3.mirror = true;
    setRotation(this.leg3, 0.0F, 0.0F, -0.6981317F);
    this.leg4 = new ModelRenderer(this, 40, 6);
    this.leg4.addBox(-4.0F, 0.0F, 0.0F, 4, 1, 1);
    this.leg4.setRotationPoint(-1.3F, 21.0F, 3.0F);
    this.leg4.setTextureSize(64, 32);
    this.leg4.mirror = true;
    setRotation(this.leg4, 0.0F, 0.0F, -0.6981317F);
    this.headhorn = new ModelRenderer(this, 52, 0);
    this.headhorn.addBox(-0.5F, -2.5F, -1.5F, 1, 2, 2);
    this.headhorn.setRotationPoint(0.0F, 20.8F, -3.8F);
    this.headhorn.setTextureSize(64, 32);
    this.headhorn.mirror = true;
    setRotation(this.headhorn, 0.5759587F, 0.0F, 0.0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    if (this.isChild) {
      float f6 = 2.0F;
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 1.0F * par7, 2.0F * par7);
      this.head.render(par7);
      this.headhorn.render(par7);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
      GL11.glTranslatef(0.0F, 24.0F * par7, 0.0F);
      this.body.render(par7);
      this.tail.render(par7);
      this.leg1.render(par7);
      this.leg2.render(par7);
      this.leg3.render(par7);
      this.leg4.render(par7);
      GL11.glPopMatrix();
    } else {
      this.body.render(par7);
      this.head.render(par7);
      this.tail.render(par7);
      this.leg1.render(par7);
      this.leg2.render(par7);
      this.leg3.render(par7);
      this.leg4.render(par7);
      this.headhorn.render(par7);
    } 
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    this.head.rotateAngleY = par5 / 57.295776F;
    this.headhorn.rotateAngleY = par5 / 57.295776F;
    this.leg1.rotateAngleY = MathHelper.cos(par1 * 1.5F) * 0.7F * par2;
    this.leg2.rotateAngleY = MathHelper.cos(par1 * 1.5F) * -0.7F * par2;
    this.leg3.rotateAngleY = MathHelper.cos(par1 * 1.5F) * 0.7F * par2;
    this.leg4.rotateAngleY = MathHelper.cos(par1 * 1.5F) * -0.7F * par2;
    this.tail.rotateAngleX = 0.0872665F + MathHelper.cos(par1 * 1.0F) * 0.2F * par2;
  }
}

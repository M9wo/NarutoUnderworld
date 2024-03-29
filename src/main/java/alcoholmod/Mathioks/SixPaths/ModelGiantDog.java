package alcoholmod.Mathioks.SixPaths;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelGiantDog extends ModelBase {
  public ModelRenderer wolfHeadMain;
  
  public ModelRenderer wolfBody;
  
  public ModelRenderer wolfLeg1;
  
  public ModelRenderer wolfLeg2;
  
  public ModelRenderer wolfLeg3;
  
  public ModelRenderer wolfLeg4;
  
  public ModelRenderer wolfTail;
  
  public ModelRenderer wolfMane;
  
  public ModelRenderer WolfHead2;
  
  public ModelRenderer WolfHead3;
  
  public ModelRenderer neck1;
  
  public ModelRenderer neck2;
  
  public ModelGiantDog() {
    float f = 0.0F;
    float f1 = 13.5F;
    this.wolfHeadMain = new ModelRenderer(this, 0, 0);
    this.wolfHeadMain.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4, f);
    this.wolfHeadMain.setRotationPoint(-1.0F, f1, -7.0F);
    this.wolfBody = new ModelRenderer(this, 18, 14);
    this.wolfBody.addBox(-4.0F, -2.0F, -3.0F, 6, 9, 6, f);
    this.wolfBody.setRotationPoint(0.0F, 14.0F, 2.0F);
    this.wolfMane = new ModelRenderer(this, 21, 0);
    this.wolfMane.addBox(-4.0F, -3.0F, -3.0F, 8, 6, 7, f);
    this.wolfMane.setRotationPoint(-1.0F, 14.0F, 2.0F);
    this.wolfLeg1 = new ModelRenderer(this, 0, 18);
    this.wolfLeg1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
    this.wolfLeg1.setRotationPoint(-2.5F, 16.0F, 7.0F);
    this.wolfLeg2 = new ModelRenderer(this, 0, 18);
    this.wolfLeg2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
    this.wolfLeg2.setRotationPoint(0.5F, 16.0F, 7.0F);
    this.wolfLeg3 = new ModelRenderer(this, 0, 18);
    this.wolfLeg3.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
    this.wolfLeg3.setRotationPoint(-2.5F, 16.0F, -4.0F);
    this.wolfLeg4 = new ModelRenderer(this, 0, 18);
    this.wolfLeg4.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
    this.wolfLeg4.setRotationPoint(0.5F, 16.0F, -4.0F);
    this.wolfTail = new ModelRenderer(this, 9, 18);
    this.wolfTail.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
    this.wolfTail.setRotationPoint(-1.0F, 12.0F, 8.0F);
    this.neck1 = new ModelRenderer(this, 18, 16);
    this.neck1.addBox(1.0F, 0.0F, -1.0F, 4, 4, 9);
    this.neck1.setRotationPoint(3.0F, 9.0F, -12.0F);
    setRotation(this.neck1, -0.2974289F, -0.669215F, 0.0F);
    this.neck2 = new ModelRenderer(this, 18, 15);
    this.neck2.addBox(1.0F, 0.0F, -1.0F, 4, 4, 10);
    this.neck2.setRotationPoint(-10.0F, 9.0F, -8.0F);
    setRotation(this.neck2, -0.297422F, 0.6692116F, 0.0F);
    this.wolfHeadMain.setTextureOffset(16, 14).addBox(-3.0F, -5.0F, 0.0F, 2, 2, 1, f);
    this.wolfHeadMain.setTextureOffset(16, 14).addBox(1.0F, -5.0F, 0.0F, 2, 2, 1, f);
    this.wolfHeadMain.setTextureOffset(0, 10).addBox(-1.5F, 0.0F, -5.0F, 3, 3, 4, f);
    this.WolfHead2 = new ModelRenderer(this, 0, 0);
    this.WolfHead2.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4);
    this.WolfHead2.setRotationPoint(6.0F, 10.5F, -11.0F);
    this.WolfHead2.setTextureSize(64, 32);
    this.WolfHead2.mirror = true;
    this.WolfHead2.setTextureOffset(16, 14).addBox(1.0F, -5.0F, 0.0F, 2, 2, 1, f);
    this.WolfHead2.setTextureOffset(16, 14).addBox(-3.0F, -5.0F, 0.0F, 2, 2, 1, f);
    this.WolfHead2.setTextureOffset(0, 10).addBox(-2.0F, 0.0F, -5.0F, 3, 3, 4, f);
    this.WolfHead3 = new ModelRenderer(this, 0, 0);
    this.WolfHead3.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4);
    this.WolfHead3.setRotationPoint(-8.0F, 10.5F, -11.0F);
    this.WolfHead3.setTextureSize(64, 32);
    this.WolfHead3.mirror = true;
    this.WolfHead3.setTextureOffset(16, 14).addBox(-3.0F, -5.0F, 0.0F, 2, 2, 1, f);
    this.WolfHead3.setTextureOffset(16, 14).addBox(1.0F, -5.0F, 0.0F, 2, 2, 1, f);
    this.WolfHead3.setTextureOffset(0, 10).addBox(-2.0F, 0.0F, -5.0F, 3, 3, 4, f);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    if (this.isChild) {
      float var8 = 2.0F;
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 5.0F * par7, 2.0F * par7);
      this.wolfHeadMain.renderWithRotation(par7);
      this.WolfHead2.renderWithRotation(par7);
      this.WolfHead3.renderWithRotation(par7);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(1.0F / var8, 1.0F / var8, 1.0F / var8);
      GL11.glTranslatef(0.0F, 24.0F * par7, 0.0F);
      this.wolfBody.render(par7);
      this.wolfLeg1.render(par7);
      this.wolfLeg2.render(par7);
      this.wolfLeg3.render(par7);
      this.wolfLeg4.render(par7);
      this.wolfTail.renderWithRotation(par7);
      this.wolfMane.render(par7);
      this.WolfHead2.render(par7);
      this.WolfHead3.render(par7);
      this.neck1.render(par7);
      this.neck2.render(par7);
      GL11.glPopMatrix();
    } else {
      this.wolfHeadMain.renderWithRotation(par7);
      this.WolfHead2.renderWithRotation(par7);
      this.WolfHead3.renderWithRotation(par7);
      this.wolfBody.render(par7);
      this.wolfLeg1.render(par7);
      this.wolfLeg2.render(par7);
      this.wolfLeg3.render(par7);
      this.wolfLeg4.render(par7);
      this.wolfTail.renderWithRotation(par7);
      this.wolfMane.render(par7);
      this.WolfHead2.render(par7);
      this.WolfHead3.render(par7);
      this.neck1.render(par7);
      this.neck2.render(par7);
    } 
  }
  
  public void setLivingAnimations(EntityLivingBase par1EntityLivingBase, float par2, float par3, float par4) {
    EntityGiantDog var5 = (EntityGiantDog)par1EntityLivingBase;
    if (var5.isAngry()) {
      this.wolfTail.rotateAngleY = 0.0F;
    } else {
      this.wolfTail.rotateAngleY = MathHelper.cos(par2 * 0.6662F) * 1.4F * par3;
    } 
    if (var5.isSitting()) {
      this.wolfMane.setRotationPoint(-1.0F, 16.0F, -3.0F);
      this.wolfMane.rotateAngleX = 1.256637F;
      this.wolfMane.rotateAngleY = 0.0F;
      this.wolfBody.setRotationPoint(0.0F, 18.0F, 0.0F);
      this.wolfBody.rotateAngleX = 0.7853982F;
      this.wolfTail.setRotationPoint(-1.0F, 21.0F, 6.0F);
      this.wolfLeg1.setRotationPoint(-2.5F, 22.0F, 2.0F);
      this.wolfLeg1.rotateAngleX = 4.712389F;
      this.wolfLeg2.setRotationPoint(0.5F, 22.0F, 2.0F);
      this.wolfLeg2.rotateAngleX = 4.712389F;
      this.wolfLeg3.rotateAngleX = 5.811947F;
      this.wolfLeg3.setRotationPoint(-2.49F, 17.0F, -4.0F);
      this.wolfLeg4.rotateAngleX = 5.811947F;
      this.wolfLeg4.setRotationPoint(0.51F, 17.0F, -4.0F);
    } else {
      this.wolfBody.setRotationPoint(0.0F, 14.0F, 2.0F);
      this.wolfBody.rotateAngleX = 1.570796F;
      this.wolfMane.setRotationPoint(-1.0F, 14.0F, -3.0F);
      this.wolfMane.rotateAngleX = this.wolfBody.rotateAngleX;
      this.wolfTail.setRotationPoint(-1.0F, 12.0F, 8.0F);
      this.wolfLeg1.setRotationPoint(-2.5F, 16.0F, 7.0F);
      this.wolfLeg2.setRotationPoint(0.5F, 16.0F, 7.0F);
      this.wolfLeg3.setRotationPoint(-2.5F, 16.0F, -4.0F);
      this.wolfLeg4.setRotationPoint(0.5F, 16.0F, -4.0F);
      this.wolfLeg1.rotateAngleX = MathHelper.cos(par2 * 0.6662F) * 1.4F * par3;
      this.wolfLeg2.rotateAngleX = MathHelper.cos(par2 * 0.6662F + 3.141593F) * 1.4F * par3;
      this.wolfLeg3.rotateAngleX = MathHelper.cos(par2 * 0.6662F + 3.141593F) * 1.4F * par3;
      this.wolfLeg4.rotateAngleX = MathHelper.cos(par2 * 0.6662F) * 1.4F * par3;
    } 
    this.wolfHeadMain.rotateAngleZ = var5.getInterestedAngle(par4) + var5.getShakeAngle(par4, 0.0F);
    this.WolfHead2.rotateAngleZ = var5.getInterestedAngle(par4) + var5.getShakeAngle(par4, 0.0F);
    this.WolfHead3.rotateAngleZ = var5.getInterestedAngle(par4) + var5.getShakeAngle(par4, 0.0F);
    this.wolfMane.rotateAngleZ = var5.getShakeAngle(par4, -0.08F);
    this.wolfBody.rotateAngleZ = var5.getShakeAngle(par4, -0.16F);
    this.wolfTail.rotateAngleZ = var5.getShakeAngle(par4, -0.2F);
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
    this.wolfHeadMain.rotateAngleX = par5 / 57.295776F;
    this.wolfHeadMain.rotateAngleY = par4 / 57.295776F;
    this.WolfHead2.rotateAngleX = par5 / 57.295776F;
    this.WolfHead2.rotateAngleY = par4 / 57.295776F;
    this.WolfHead3.rotateAngleX = par5 / 57.295776F;
    this.WolfHead3.rotateAngleY = par4 / 57.295776F;
  }
}

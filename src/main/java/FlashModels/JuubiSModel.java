package FlashModels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class JuubiSModel extends ModelBase {
  public ModelRenderer juubi9;
  
  public ModelRenderer juubi45;
  
  public ModelRenderer juubi1;
  
  public ModelRenderer juubi46;
  
  public ModelRenderer juubi4;
  
  public ModelRenderer juubi75;
  
  public ModelRenderer juubi3;
  
  public ModelRenderer juubi6;
  
  public ModelRenderer juubi5;
  
  public ModelRenderer juubi47;
  
  public ModelRenderer juubi8;
  
  public ModelRenderer juubi7;
  
  public ModelRenderer juubi76;
  
  public ModelRenderer juubi40;
  
  public ModelRenderer juubi18;
  
  public ModelRenderer juubi19;
  
  public ModelRenderer juubi12;
  
  public ModelRenderer juubi13;
  
  public ModelRenderer juubi10;
  
  public ModelRenderer juubi11;
  
  public ModelRenderer juubi16;
  
  public ModelRenderer juubi17;
  
  public ModelRenderer juubi15;
  
  public ModelRenderer juubi50;
  
  public ModelRenderer juubi51;
  
  public ModelRenderer juubi21;
  
  public ModelRenderer juubi22;
  
  public ModelRenderer juubi26;
  
  public ModelRenderer juubi20;
  
  public ModelRenderer juubi32;
  
  public ModelRenderer juubi33;
  
  public ModelRenderer juubi72;
  
  public ModelRenderer juubi73;
  
  public ModelRenderer juubi66;
  
  public ModelRenderer juubi67;
  
  public ModelRenderer juubi36;
  
  public ModelRenderer juubi71;
  
  public ModelRenderer juubi70;
  
  public ModelRenderer juubi37;
  
  public ModelRenderer juubi44;
  
  public ModelRenderer juubi41;
  
  public JuubiSModel() {
    this.textureWidth = 512;
    this.textureHeight = 512;
    this.juubi1 = new ModelRenderer(this, 204, 0);
    this.juubi1.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi1.addBox(0.0F, 24.9F, -12.7F, 5, 28, 5, 0.0F);
    setRotateAngle(this.juubi1, 2.1642082F, 0.0F, 0.0F);
    this.juubi5 = new ModelRenderer(this, 0, 32);
    this.juubi5.setRotationPoint(3.6F, 10.8F, 19.0F);
    this.juubi5.addBox(0.0F, 0.0F, 0.0F, 5, 13, 5, 0.0F);
    setRotateAngle(this.juubi5, 0.0F, 0.0F, -0.034906585F);
    this.juubi17 = new ModelRenderer(this, 64, 0);
    this.juubi17.setRotationPoint(-4.6F, -22.0F, -16.0F);
    this.juubi17.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
    setRotateAngle(this.juubi17, -0.40142572F, -0.5235988F, 0.0F);
    this.juubi21 = new ModelRenderer(this, 64, 0);
    this.juubi21.setRotationPoint(3.0F, -22.0F, -15.0F);
    this.juubi21.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
    setRotateAngle(this.juubi21, -0.40142572F, 0.5235988F, 0.0F);
    this.juubi73 = new ModelRenderer(this, 204, 0);
    this.juubi73.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi73.addBox(0.0F, 24.9F, -12.7F, 5, 38, 5, 0.0F);
    setRotateAngle(this.juubi73, 1.7453293F, 0.41887903F, -0.05235988F);
    this.juubi41 = new ModelRenderer(this, 204, 0);
    this.juubi41.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi41.addBox(0.0F, 24.9F, -12.7F, 5, 28, 5, 0.0F);
    setRotateAngle(this.juubi41, 2.1642082F, -0.2268928F, -0.36651915F);
    this.juubi44 = new ModelRenderer(this, 204, 0);
    this.juubi44.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi44.addBox(0.0F, 0.0F, 0.0F, 5, 28, 5, 0.0F);
    setRotateAngle(this.juubi44, 1.2566371F, -0.40142572F, -0.31415927F);
    this.juubi16 = new ModelRenderer(this, 64, 96);
    this.juubi16.setRotationPoint(-4.5F, -17.0F, -25.0F);
    this.juubi16.addBox(0.0F, 0.0F, 0.0F, 9, 10, 9, 0.0F);
    this.juubi72 = new ModelRenderer(this, 204, 0);
    this.juubi72.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi72.addBox(0.0F, 0.0F, 0.0F, 5, 28, 5, 0.0F);
    setRotateAngle(this.juubi72, 1.2740904F, 0.41887903F, -0.05235988F);
    this.juubi47 = new ModelRenderer(this, 204, 0);
    this.juubi47.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi47.addBox(0.0F, 24.9F, -12.7F, 5, 28, 5, 0.0F);
    setRotateAngle(this.juubi47, 1.727876F, -0.08726646F, -0.10471976F);
    this.juubi76 = new ModelRenderer(this, 204, 0);
    this.juubi76.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi76.addBox(0.0F, 24.9F, -12.7F, 5, 28, 5, 0.0F);
    setRotateAngle(this.juubi76, 2.2514746F, -0.5934119F, -0.20943952F);
    this.juubi67 = new ModelRenderer(this, 0, 96);
    this.juubi67.setRotationPoint(14.5F, 1.5F, -11.0F);
    this.juubi67.addBox(-0.5F, 16.0F, -0.5F, 6, 6, 6, 0.0F);
    setRotateAngle(this.juubi67, -0.38397244F, 0.0F, -0.08726646F);
    this.juubi8 = new ModelRenderer(this, 0, 32);
    this.juubi8.setRotationPoint(-8.6F, 9.8F, 19.0F);
    this.juubi8.addBox(0.0F, 0.0F, 0.0F, 5, 13, 5, 0.0F);
    setRotateAngle(this.juubi8, 0.0F, 0.0F, 0.034906585F);
    this.juubi51 = new ModelRenderer(this, 204, 0);
    this.juubi51.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi51.addBox(0.0F, 24.9F, -12.7F, 5, 28, 5, 0.0F);
    setRotateAngle(this.juubi51, 1.727876F, 0.6981317F, -0.10471976F);
    this.juubi19 = new ModelRenderer(this, 64, 0);
    this.juubi19.setRotationPoint(-1.0F, -22.0F, -28.0F);
    this.juubi19.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
    setRotateAngle(this.juubi19, 0.40142572F, 0.0F, 0.0F);
    this.juubi33 = new ModelRenderer(this, 204, 0);
    this.juubi33.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi33.addBox(0.0F, 0.0F, 0.0F, 5, 28, 5, 0.0F);
    setRotateAngle(this.juubi33, 1.6929693F, 0.0F, 0.0F);
    this.juubi13 = new ModelRenderer(this, 0, 64);
    this.juubi13.setRotationPoint(-19.5F, 1.5F, -11.0F);
    this.juubi13.addBox(0.0F, 0.0F, 0.0F, 5, 16, 5, 0.0F);
    setRotateAngle(this.juubi13, -0.38397244F, 0.0F, 0.08726646F);
    this.juubi40 = new ModelRenderer(this, 204, 0);
    this.juubi40.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi40.addBox(0.0F, 0.0F, 0.0F, 5, 28, 5, 0.0F);
    setRotateAngle(this.juubi40, 1.6929693F, -0.2268928F, -0.36651915F);
    this.juubi10 = new ModelRenderer(this, 0, 64);
    this.juubi10.setRotationPoint(-8.1F, -4.8F, 21.0F);
    this.juubi10.addBox(0.0F, 0.0F, 0.0F, 5, 16, 5, 0.0F);
    setRotateAngle(this.juubi10, -0.12217305F, 0.0F, 0.034906585F);
    this.juubi15 = new ModelRenderer(this, 0, 0);
    this.juubi15.setRotationPoint(-3.5F, -5.0F, -16.0F);
    this.juubi15.addBox(0.0F, 0.0F, 0.0F, 7, 16, 7, 0.0F);
    setRotateAngle(this.juubi15, 1.5707964F, 0.0F, 0.0F);
    this.juubi9 = new ModelRenderer(this, 0, 0);
    this.juubi9.setRotationPoint(-9.0F, 22.7F, 15.0F);
    this.juubi9.addBox(0.0F, 0.0F, 0.0F, 5, 2, 9, 0.0F);
    this.juubi7 = new ModelRenderer(this, 0, 0);
    this.juubi7.setRotationPoint(4.0F, 22.7F, 15.0F);
    this.juubi7.addBox(0.0F, 0.0F, 0.0F, 5, 2, 9, 0.0F);
    this.juubi20 = new ModelRenderer(this, 64, 0);
    this.juubi20.setRotationPoint(-1.0F, -22.0F, -15.0F);
    this.juubi20.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
    setRotateAngle(this.juubi20, -0.40142572F, 0.0F, 0.0F);
    this.juubi32 = new ModelRenderer(this, 0, 64);
    this.juubi32.setRotationPoint(3.0F, -4.8F, 21.0F);
    this.juubi32.addBox(0.0F, 0.0F, 0.0F, 5, 16, 5, 0.0F);
    setRotateAngle(this.juubi32, -0.12217305F, 0.0F, -0.034906585F);
    this.juubi22 = new ModelRenderer(this, 64, 0);
    this.juubi22.setRotationPoint(3.5F, -22.0F, -27.5F);
    this.juubi22.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
    setRotateAngle(this.juubi22, 0.41887903F, -0.43633232F, 0.0F);
    this.juubi75 = new ModelRenderer(this, 204, 0);
    this.juubi75.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi75.addBox(0.0F, 0.0F, 0.0F, 5, 28, 5, 0.0F);
    setRotateAngle(this.juubi75, 1.7802359F, -0.5934119F, -0.20943952F);
    this.juubi50 = new ModelRenderer(this, 204, 0);
    this.juubi50.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi50.addBox(0.0F, 0.0F, 0.0F, 5, 28, 5, 0.0F);
    setRotateAngle(this.juubi50, 1.2566371F, 0.6981317F, -0.10471976F);
    this.juubi12 = new ModelRenderer(this, 0, 64);
    this.juubi12.setRotationPoint(-10.0F, -11.0F, -9.0F);
    this.juubi12.addBox(0.0F, 0.0F, 0.0F, 5, 16, 5, 0.0F);
    setRotateAngle(this.juubi12, -0.12217305F, 0.0F, 0.6457718F);
    this.juubi4 = new ModelRenderer(this, 128, 0);
    this.juubi4.setRotationPoint(-7.0F, -13.0F, 19.0F);
    this.juubi4.addBox(0.0F, 0.0F, 0.0F, 14, 9, 9, 0.0F);
    this.juubi11 = new ModelRenderer(this, 0, 64);
    this.juubi11.setRotationPoint(6.0F, -8.0F, -9.0F);
    this.juubi11.addBox(0.0F, 0.0F, 0.0F, 5, 16, 5, 0.0F);
    setRotateAngle(this.juubi11, -0.12217305F, 0.0F, -0.6457718F);
    this.juubi26 = new ModelRenderer(this, 64, 16);
    this.juubi26.setRotationPoint(-10.0F, -3.5F, -12.5F);
    this.juubi26.addBox(0.0F, 0.0F, 0.0F, 20, 16, 10, 0.0F);
    setRotateAngle(this.juubi26, 1.5707964F, 0.0F, 0.0F);
    this.juubi70 = new ModelRenderer(this, 204, 0);
    this.juubi70.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi70.addBox(0.0F, 0.0F, 0.0F, 5, 28, 5, 0.0F);
    setRotateAngle(this.juubi70, 1.850049F, 0.43633232F, 0.2617994F);
    this.juubi6 = new ModelRenderer(this, 0, 96);
    this.juubi6.setRotationPoint(-19.5F, 1.5F, -11.0F);
    this.juubi6.addBox(-0.5F, 16.0F, -0.5F, 6, 6, 6, 0.0F);
    setRotateAngle(this.juubi6, -0.38397244F, 0.0F, 0.08726646F);
    this.juubi3 = new ModelRenderer(this, 64, 48);
    this.juubi3.setRotationPoint(-6.0F, -4.0F, 3.0F);
    this.juubi3.addBox(0.0F, 0.0F, 0.0F, 12, 16, 9, 0.0F);
    setRotateAngle(this.juubi3, 1.5707964F, 0.0F, 0.0F);
    this.juubi46 = new ModelRenderer(this, 204, 0);
    this.juubi46.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi46.addBox(0.0F, 0.0F, 0.0F, 5, 28, 5, 0.0F);
    setRotateAngle(this.juubi46, 1.2566371F, -0.08726646F, -0.10471976F);
    this.juubi71 = new ModelRenderer(this, 204, 0);
    this.juubi71.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi71.addBox(0.0F, 24.9F, -12.7F, 5, 38, 5, 0.0F);
    setRotateAngle(this.juubi71, 2.3212879F, 0.43633232F, 0.2617994F);
    this.juubi37 = new ModelRenderer(this, 204, 0);
    this.juubi37.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi37.addBox(0.0F, 24.9F, -12.7F, 5, 38, 5, 0.0F);
    setRotateAngle(this.juubi37, 2.1642082F, 0.15707964F, 0.2617994F);
    this.juubi45 = new ModelRenderer(this, 204, 0);
    this.juubi45.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi45.addBox(0.0F, 24.9F, -12.7F, 5, 28, 5, 0.0F);
    setRotateAngle(this.juubi45, 1.727876F, -0.40142572F, -0.31415927F);
    this.juubi18 = new ModelRenderer(this, 64, 0);
    this.juubi18.setRotationPoint(-5.0F, -22.0F, -27.0F);
    this.juubi18.addBox(0.0F, 0.0F, 0.0F, 2, 6, 2, 0.0F);
    setRotateAngle(this.juubi18, 0.40142572F, 0.34906584F, 0.0F);
    this.juubi66 = new ModelRenderer(this, 0, 64);
    this.juubi66.setRotationPoint(14.5F, 1.5F, -11.0F);
    this.juubi66.addBox(0.0F, 0.0F, 0.0F, 5, 16, 5, 0.0F);
    setRotateAngle(this.juubi66, -0.38397244F, 0.0F, -0.08726646F);
    this.juubi36 = new ModelRenderer(this, 204, 0);
    this.juubi36.setRotationPoint(-3.0F, -6.0F, 28.0F);
    this.juubi36.addBox(0.0F, 0.0F, 0.0F, 5, 28, 5, 0.0F);
    setRotateAngle(this.juubi36, 1.6929693F, 0.15707964F, 0.2617994F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    this.juubi1.render(f5);
    this.juubi5.render(f5);
    this.juubi17.render(f5);
    this.juubi21.render(f5);
    this.juubi73.render(f5);
    this.juubi41.render(f5);
    this.juubi44.render(f5);
    this.juubi16.render(f5);
    this.juubi72.render(f5);
    this.juubi47.render(f5);
    this.juubi76.render(f5);
    this.juubi67.render(f5);
    this.juubi8.render(f5);
    this.juubi51.render(f5);
    this.juubi19.render(f5);
    this.juubi33.render(f5);
    this.juubi13.render(f5);
    this.juubi40.render(f5);
    this.juubi10.render(f5);
    this.juubi15.render(f5);
    this.juubi9.render(f5);
    this.juubi7.render(f5);
    this.juubi20.render(f5);
    this.juubi32.render(f5);
    this.juubi22.render(f5);
    this.juubi75.render(f5);
    this.juubi50.render(f5);
    this.juubi12.render(f5);
    GL11.glPushMatrix();
    GL11.glTranslatef(this.juubi4.offsetX, this.juubi4.offsetY, this.juubi4.offsetZ);
    GL11.glTranslatef(this.juubi4.rotationPointX * f5, this.juubi4.rotationPointY * f5, this.juubi4.rotationPointZ * f5);
    GL11.glScaled(1.1D, 1.0D, 1.0D);
    GL11.glTranslatef(-this.juubi4.offsetX, -this.juubi4.offsetY, -this.juubi4.offsetZ);
    GL11.glTranslatef(-this.juubi4.rotationPointX * f5, -this.juubi4.rotationPointY * f5, -this.juubi4.rotationPointZ * f5);
    this.juubi4.render(f5);
    GL11.glPopMatrix();
    this.juubi11.render(f5);
    this.juubi26.render(f5);
    this.juubi70.render(f5);
    this.juubi6.render(f5);
    this.juubi3.render(f5);
    this.juubi46.render(f5);
    this.juubi71.render(f5);
    this.juubi37.render(f5);
    this.juubi45.render(f5);
    this.juubi18.render(f5);
    this.juubi66.render(f5);
    this.juubi36.render(f5);
  }
  
  public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
  }
}

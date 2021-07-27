package alcoholmod.Mathioks.NickModels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class PuppetNickModel extends ModelBiped {
  public ModelRenderer MainBody;
  
  public ModelRenderer Head;
  
  public ModelRenderer LegbaseR;
  
  public ModelRenderer LegbaseL;
  
  public ModelRenderer ArmBRdo;
  
  public ModelRenderer ArmBRup;
  
  public ModelRenderer ArmBLdo;
  
  public ModelRenderer ArmBLup;
  
  public ModelRenderer Neck;
  
  public ModelRenderer LegC1R;
  
  public ModelRenderer LegP2R;
  
  public ModelRenderer LegC2R;
  
  public ModelRenderer LegP3R;
  
  public ModelRenderer LegC1L;
  
  public ModelRenderer LegP2L;
  
  public ModelRenderer LegC2L;
  
  public ModelRenderer LegP3L;
  
  public ModelRenderer ArmC1Rdo;
  
  public ModelRenderer ArmP2Rdo;
  
  public ModelRenderer ArmC1Rup;
  
  public ModelRenderer ArmP2Rup;
  
  public ModelRenderer ArmC1Ldo;
  
  public ModelRenderer ArmP2Ldo;
  
  public ModelRenderer ArmC1Lup;
  
  public ModelRenderer ArmP2Lup;
  
  public PuppetNickModel() {
    this.textureWidth = 128;
    this.textureHeight = 64;
    this.MainBody = new ModelRenderer((ModelBase)this, 0, 0);
    this.MainBody.setRotationPoint(-1.2F, 5.8F, -2.3F);
    this.MainBody.addBox(0.0F, 0.0F, 0.0F, 5, 9, 3, 0.3F);
    this.ArmBLdo = new ModelRenderer((ModelBase)this, 18, 8);
    this.ArmBLdo.setRotationPoint(3.1F, 4.8F, 0.3F);
    this.ArmBLdo.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
    setRotateAngle(this.ArmBLdo, 0.3642502F, 0.13665928F, -0.68294734F);
    this.LegbaseL = new ModelRenderer((ModelBase)this, 41, 14);
    this.LegbaseL.setRotationPoint(3.2F, 9.0F, -0.2F);
    this.LegbaseL.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
    setRotateAngle(this.LegbaseL, 0.31869712F, 0.0F, 0.0F);
    this.ArmC1Rdo = new ModelRenderer((ModelBase)this, 27, 26);
    this.ArmC1Rdo.setRotationPoint(0.5F, 4.5F, 0.5F);
    this.ArmC1Rdo.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    setRotateAngle(this.ArmC1Rdo, 0.22759093F, 0.27314404F, 0.0F);
    this.ArmP2Rdo = new ModelRenderer((ModelBase)this, 32, 24);
    this.ArmP2Rdo.setRotationPoint(-0.5F, 1.6F, -0.5F);
    this.ArmP2Rdo.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
    setRotateAngle(this.ArmP2Rdo, 0.27314404F, 0.091106184F, -0.045553092F);
    this.ArmBLup = new ModelRenderer((ModelBase)this, 18, 0);
    this.ArmBLup.setRotationPoint(4.2F, 1.7F, -0.1F);
    this.ArmBLup.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
    setRotateAngle(this.ArmBLup, 0.3642502F, -0.22759093F, -0.95609134F);
    this.LegC2R = new ModelRenderer((ModelBase)this, 42, 10);
    this.LegC2R.setRotationPoint(0.6F, 3.5F, 0.5F);
    this.LegC2R.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    setRotateAngle(this.LegC2R, 0.22759093F, 0.0F, 0.0F);
    this.LegP3L = new ModelRenderer((ModelBase)this, 47, 21);
    this.LegP3L.setRotationPoint(-0.6F, 1.8F, -0.6F);
    this.LegP3L.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
    setRotateAngle(this.LegP3L, 0.5009095F, 0.0F, 0.0F);
    this.LegC1R = new ModelRenderer((ModelBase)this, 50, 3);
    this.LegC1R.setRotationPoint(0.5F, 3.6F, 0.6F);
    this.LegC1R.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    setRotateAngle(this.LegC1R, 0.22759093F, 0.0F, 0.0F);
    this.LegP3R = new ModelRenderer((ModelBase)this, 48, 8);
    this.LegP3R.setRotationPoint(-0.6F, 1.8F, -0.6F);
    this.LegP3R.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
    setRotateAngle(this.LegP3R, 0.5009095F, 0.0F, 0.0F);
    this.LegP2R = new ModelRenderer((ModelBase)this, 55, 2);
    this.LegP2R.setRotationPoint(-0.6F, 1.2F, -0.7F);
    this.LegP2R.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
    setRotateAngle(this.LegP2R, 0.13665928F, 0.0F, 0.0F);
    this.LegC1L = new ModelRenderer((ModelBase)this, 50, 16);
    this.LegC1L.setRotationPoint(0.5F, 3.6F, 0.6F);
    this.LegC1L.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    setRotateAngle(this.LegC1L, 0.22759093F, 0.0F, 0.0F);
    this.ArmP2Rup = new ModelRenderer((ModelBase)this, 32, 16);
    this.ArmP2Rup.setRotationPoint(-0.5F, 1.6F, -0.5F);
    this.ArmP2Rup.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
    setRotateAngle(this.ArmP2Rup, 0.4553564F, 0.13665928F, -0.045553092F);
    this.ArmC1Ldo = new ModelRenderer((ModelBase)this, 27, 11);
    this.ArmC1Ldo.setRotationPoint(0.5F, 4.5F, 0.5F);
    this.ArmC1Ldo.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    setRotateAngle(this.ArmC1Ldo, 0.22759093F, -0.18203785F, 0.0F);
    this.ArmC1Rup = new ModelRenderer((ModelBase)this, 27, 18);
    this.ArmC1Rup.setRotationPoint(0.5F, 4.5F, 0.5F);
    this.ArmC1Rup.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    setRotateAngle(this.ArmC1Rup, 0.22759093F, 0.13665928F, 0.0F);
    this.LegbaseR = new ModelRenderer((ModelBase)this, 41, 2);
    this.LegbaseR.setRotationPoint(-0.2F, 9.0F, -0.2F);
    this.LegbaseR.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
    setRotateAngle(this.LegbaseR, 0.31869712F, 0.0F, 0.0F);
    this.ArmP2Lup = new ModelRenderer((ModelBase)this, 32, 1);
    this.ArmP2Lup.setRotationPoint(-0.5F, 1.6F, -0.5F);
    this.ArmP2Lup.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
    setRotateAngle(this.ArmP2Lup, 0.27314404F, 0.091106184F, -0.045553092F);
    this.LegP2L = new ModelRenderer((ModelBase)this, 55, 14);
    this.LegP2L.setRotationPoint(-0.6F, 1.2F, -0.7F);
    this.LegP2L.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
    setRotateAngle(this.LegP2L, 0.13665928F, 0.0F, 0.0F);
    this.Head = new ModelRenderer((ModelBase)this, 56, 29);
    this.Head.setRotationPoint(-1.7F, -1.6F, -1.1F);
    this.Head.addBox(0.0F, 0.0F, 0.0F, 15, 20, 12, 0.0F);
    setRotateAngle(this.Head, -0.13665928F, 0.0F, 0.0F);
    this.ArmBRup = new ModelRenderer((ModelBase)this, 18, 16);
    this.ArmBRup.setRotationPoint(-0.1F, 0.2F, 0.4F);
    this.ArmBRup.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
    setRotateAngle(this.ArmBRup, 0.3642502F, 0.22759093F, 1.2292354F);
    this.ArmBRdo = new ModelRenderer((ModelBase)this, 18, 24);
    this.ArmBRdo.setRotationPoint(-0.1F, 3.1F, 0.6F);
    this.ArmBRdo.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
    setRotateAngle(this.ArmBRdo, 0.27314404F, 0.0F, 0.8196066F);
    this.ArmC1Lup = new ModelRenderer((ModelBase)this, 27, 2);
    this.ArmC1Lup.setRotationPoint(0.5F, 4.5F, 0.5F);
    this.ArmC1Lup.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    setRotateAngle(this.ArmC1Lup, 0.22759093F, 0.0F, 0.0F);
    this.LegC2L = new ModelRenderer((ModelBase)this, 41, 21);
    this.LegC2L.setRotationPoint(0.6F, 3.5F, 0.5F);
    this.LegC2L.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    setRotateAngle(this.LegC2L, 0.22759093F, 0.0F, 0.0F);
    this.ArmP2Ldo = new ModelRenderer((ModelBase)this, 32, 9);
    this.ArmP2Ldo.setRotationPoint(-0.5F, 1.6F, -0.5F);
    this.ArmP2Ldo.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
    setRotateAngle(this.ArmP2Ldo, 0.27314404F, 0.091106184F, -0.045553092F);
    this.Neck = new ModelRenderer((ModelBase)this, 2, 22);
    this.Neck.setRotationPoint(1.5F, -2.2F, 1.2F);
    this.Neck.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
    setRotateAngle(this.Neck, -0.18203785F, 0.0F, 0.0F);
    this.MainBody.addChild(this.ArmBLdo);
    this.MainBody.addChild(this.LegbaseL);
    this.ArmBRdo.addChild(this.ArmC1Rdo);
    this.ArmC1Rdo.addChild(this.ArmP2Rdo);
    this.MainBody.addChild(this.ArmBLup);
    this.LegP2R.addChild(this.LegC2R);
    this.LegC2L.addChild(this.LegP3L);
    this.LegbaseR.addChild(this.LegC1R);
    this.LegC2R.addChild(this.LegP3R);
    this.LegC1R.addChild(this.LegP2R);
    this.LegbaseL.addChild(this.LegC1L);
    this.ArmC1Rup.addChild(this.ArmP2Rup);
    this.ArmBLdo.addChild(this.ArmC1Ldo);
    this.ArmBRup.addChild(this.ArmC1Rup);
    this.MainBody.addChild(this.LegbaseR);
    this.ArmC1Lup.addChild(this.ArmP2Lup);
    this.LegC1L.addChild(this.LegP2L);
    this.MainBody.addChild(this.ArmBRup);
    this.MainBody.addChild(this.ArmBRdo);
    this.ArmBLup.addChild(this.ArmC1Lup);
    this.LegP2L.addChild(this.LegC2L);
    this.ArmC1Ldo.addChild(this.ArmP2Ldo);
    this.MainBody.addChild(this.Neck);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    GL11.glPushMatrix();
    GL11.glTranslatef(this.MainBody.offsetX, this.MainBody.offsetY, this.MainBody.offsetZ);
    GL11.glTranslatef(this.MainBody.rotationPointX * f5, this.MainBody.rotationPointY * f5, this.MainBody.rotationPointZ * f5);
    GL11.glScaled(1.0D, 1.0D, 1.1D);
    GL11.glTranslatef(-this.MainBody.offsetX, -this.MainBody.offsetY, -this.MainBody.offsetZ);
    GL11.glTranslatef(-this.MainBody.rotationPointX * f5, -this.MainBody.rotationPointY * f5, -this.MainBody.rotationPointZ * f5);
    this.MainBody.render(f5);
    GL11.glPopMatrix();
    GL11.glPushMatrix();
    GL11.glTranslatef(this.Head.offsetX, this.Head.offsetY, this.Head.offsetZ);
    GL11.glTranslatef(this.Head.rotationPointX * f5, this.Head.rotationPointY * f5, this.Head.rotationPointZ * f5);
    GL11.glScaled(0.4D, 0.3D, 0.4D);
    GL11.glTranslatef(-this.Head.offsetX, -this.Head.offsetY, -this.Head.offsetZ);
    GL11.glTranslatef(-this.Head.rotationPointX * f5, -this.Head.rotationPointY * f5, -this.Head.rotationPointZ * f5);
    this.Head.render(f5);
    GL11.glPopMatrix();
  }
  
  public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
  }
}

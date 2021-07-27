package alcoholmod.Mathioks.NickModels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class KazekagePuppetModel extends ModelBiped {
  public ModelRenderer Torso;
  
  public ModelRenderer ArmBL;
  
  public ModelRenderer Head;
  
  public ModelRenderer ShoulderL;
  
  public ModelRenderer ShoulderR;
  
  public ModelRenderer Neck;
  
  public ModelRenderer ArmBR;
  
  public ModelRenderer ArmR;
  
  public ModelRenderer ArmL;
  
  public KazekagePuppetModel() {
    this.textureWidth = 128;
    this.textureHeight = 128;
    this.Head = new ModelRenderer((ModelBase)this, 20, 50);
    this.Head.setRotationPoint(-1.2F, -2.6F, 1.5F);
    this.Head.addBox(-5.0F, -9.4F, -5.1F, 10, 12, 10, -2.6F);
    setRotateAngle(this.Head, 0.18203785F, 0.0F, 0.0F);
    this.Neck = new ModelRenderer((ModelBase)this, 0, 64);
    this.Neck.setRotationPoint(3.3F, -2.9F, -0.8F);
    this.Neck.addBox(0.0F, 0.0F, 0.0F, 3, 4, 4, 0.0F);
    setRotateAngle(this.Neck, 0.18203785F, 0.0F, 0.0F);
    this.ArmR = new ModelRenderer((ModelBase)this, 71, 31);
    this.ArmR.setRotationPoint(1.7F, 1.5F, 0.0F);
    this.ArmR.addBox(0.0F, 0.0F, 0.0F, 3, 10, 4, 0.0F);
    setRotateAngle(this.ArmR, 0.0F, 0.0F, -0.5462881F);
    this.ShoulderL = new ModelRenderer((ModelBase)this, 0, 36);
    this.ShoulderL.setRotationPoint(5.1F, 0.5F, -0.1F);
    this.ShoulderL.addBox(0.0F, 0.0F, 0.0F, 2, 4, 4, 0.0F);
    setRotateAngle(this.ShoulderL, 0.0F, 0.18203785F, -1.3203416F);
    this.ArmBR = new ModelRenderer((ModelBase)this, 56, 39);
    this.ArmBR.setRotationPoint(0.4F, -0.6F, 3.9F);
    this.ArmBR.addBox(0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F);
    setRotateAngle(this.ArmBR, 0.0F, 3.1415927F, -0.5462881F);
    this.ShoulderR = new ModelRenderer((ModelBase)this, 43, 36);
    this.ShoulderR.setRotationPoint(3.6F, -1.4F, -0.5F);
    this.ShoulderR.addBox(0.0F, 0.0F, 0.0F, 2, 5, 4, 0.0F);
    setRotateAngle(this.ShoulderR, 0.0F, -0.18203785F, 1.3203416F);
    this.ArmL = new ModelRenderer((ModelBase)this, 30, 31);
    this.ArmL.setRotationPoint(1.3F, 1.1F, 0.0F);
    this.ArmL.addBox(0.0F, 0.0F, 0.0F, 2, 10, 4, 0.0F);
    setRotateAngle(this.ArmL, 0.0F, 0.0F, -0.5462881F);
    this.Torso = new ModelRenderer((ModelBase)this, 0, 75);
    this.Torso.setRotationPoint(-5.9F, 0.0F, 0.1F);
    this.Torso.addBox(0.0F, 0.0F, 0.0F, 9, 20, 4, 0.0F);
    this.ArmBL = new ModelRenderer((ModelBase)this, 13, 39);
    this.ArmBL.setRotationPoint(2.9F, -0.7F, 0.0F);
    this.ArmBL.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
    setRotateAngle(this.ArmBL, 0.0F, 0.0F, 0.5462881F);
    this.Torso.addChild(this.Neck);
    this.ArmBR.addChild(this.ArmR);
    this.Torso.addChild(this.ShoulderL);
    this.Torso.addChild(this.ArmBR);
    this.Torso.addChild(this.ShoulderR);
    this.ArmBL.addChild(this.ArmL);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    GL11.glPushMatrix();
    GL11.glTranslatef(this.Head.offsetX, this.Head.offsetY, this.Head.offsetZ);
    GL11.glTranslatef(this.Head.rotationPointX * f5, this.Head.rotationPointY * f5, this.Head.rotationPointZ * f5);
    GL11.glScaled(1.1D, 1.0D, 1.0D);
    GL11.glTranslatef(-this.Head.offsetX, -this.Head.offsetY, -this.Head.offsetZ);
    GL11.glTranslatef(-this.Head.rotationPointX * f5, -this.Head.rotationPointY * f5, -this.Head.rotationPointZ * f5);
    this.Head.render(f5);
    GL11.glPopMatrix();
    this.Torso.render(f5);
    this.ArmBL.render(f5);
  }
  
  public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
  }
}

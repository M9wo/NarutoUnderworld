package lc208.nam.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public abstract class CustomPlayerModel extends ModelBiped {
  public int color = -1;
  
  public abstract void pre();
  
  public abstract void post();
  
  public abstract void partHead();
  
  public abstract void partBody();
  
  public abstract void partRightArm();
  
  public abstract void partLeftArm();
  
  public abstract void partRightLeg();
  
  public abstract void partLeftLeg();
  
  public void render(Entity entity, float x, float y, float z, float yaw, float pitch, float parTicks) {
    super.render(entity, x, y, z, yaw, pitch, parTicks);
    GL11.glPushMatrix();
    if (this.color != -1) {
      float red = (this.color >> 16 & 0xFF) / 255.0F;
      float blue = (this.color >> 8 & 0xFF) / 255.0F;
      float green = (this.color & 0xFF) / 255.0F;
      GL11.glColor3f(red, blue, green);
    } 
    pre();
    float f6 = 2.0F;
    GL11.glPushMatrix();
    if (this.isChild) {
      GL11.glScalef(1.5F / f6, 1.5F / f6, 1.5F / f6);
      GL11.glTranslatef(0.0F, 16.0F * parTicks, 0.0F);
    } 
    GL11.glTranslatef(this.bipedHead.rotationPointX * parTicks, this.bipedHead.rotationPointY * parTicks, this.bipedHead.rotationPointZ * parTicks);
    GL11.glRotatef(this.bipedHead.rotateAngleZ * 57.295776F, 0.0F, 0.0F, 1.0F);
    GL11.glRotatef(this.bipedHead.rotateAngleY * 57.295776F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(this.bipedHead.rotateAngleX * 57.295776F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    partHead();
    GL11.glPopMatrix();
    if (this.isChild) {
      GL11.glPushMatrix();
      GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
      GL11.glTranslatef(0.0F, 24.0F * parTicks, 0.0F);
    } 
    GL11.glPushMatrix();
    GL11.glTranslatef(this.bipedBody.rotationPointX * parTicks, this.bipedBody.rotationPointY * parTicks, this.bipedBody.rotationPointZ * parTicks);
    GL11.glRotatef(this.bipedBody.rotateAngleZ * 57.295776F, 0.0F, 0.0F, 1.0F);
    GL11.glRotatef(this.bipedBody.rotateAngleY * 57.295776F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(this.bipedBody.rotateAngleX * 57.295776F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    partBody();
    GL11.glPopMatrix();
    GL11.glPushMatrix();
    GL11.glTranslatef(this.bipedRightArm.rotationPointX * parTicks, this.bipedRightArm.rotationPointY * parTicks, this.bipedRightArm.rotationPointZ * parTicks);
    GL11.glRotatef(this.bipedRightArm.rotateAngleZ * 57.295776F, 0.0F, 0.0F, 1.0F);
    GL11.glRotatef(this.bipedRightArm.rotateAngleY * 57.295776F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(this.bipedRightArm.rotateAngleX * 57.295776F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    partRightArm();
    GL11.glPopMatrix();
    GL11.glPushMatrix();
    GL11.glTranslatef(this.bipedLeftArm.rotationPointX * parTicks, this.bipedLeftArm.rotationPointY * parTicks, this.bipedLeftArm.rotationPointZ * parTicks);
    GL11.glRotatef(this.bipedLeftArm.rotateAngleZ * 57.295776F, 0.0F, 0.0F, 1.0F);
    GL11.glRotatef(this.bipedLeftArm.rotateAngleY * 57.295776F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(this.bipedLeftArm.rotateAngleX * 57.295776F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    partLeftArm();
    GL11.glPopMatrix();
    GL11.glPushMatrix();
    GL11.glTranslatef(this.bipedRightLeg.rotationPointX * parTicks, this.bipedRightLeg.rotationPointY * parTicks, this.bipedRightLeg.rotationPointZ * parTicks);
    GL11.glRotatef(this.bipedRightLeg.rotateAngleZ * 57.295776F, 0.0F, 0.0F, 1.0F);
    GL11.glRotatef(this.bipedRightLeg.rotateAngleY * 57.295776F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(this.bipedRightLeg.rotateAngleX * 57.295776F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    partRightLeg();
    GL11.glPopMatrix();
    GL11.glPushMatrix();
    GL11.glTranslatef(this.bipedLeftLeg.rotationPointX * parTicks, this.bipedLeftLeg.rotationPointY * parTicks, this.bipedLeftLeg.rotationPointZ * parTicks);
    GL11.glRotatef(this.bipedLeftLeg.rotateAngleZ * 57.295776F, 0.0F, 0.0F, 1.0F);
    GL11.glRotatef(this.bipedLeftLeg.rotateAngleY * 57.295776F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(this.bipedLeftLeg.rotateAngleX * 57.295776F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    partLeftLeg();
    GL11.glPopMatrix();
    if (this.isChild)
      GL11.glPopMatrix(); 
    post();
    GL11.glColor3f(1.0F, 1.0F, 1.0F);
    GL11.glPopMatrix();
  }
}

package alcoholmod.Mathioks.FinalBijuu;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelKyuubi1Tail2 extends ModelBase {
  private float wingspeed = 0.8F;
  
  ModelRenderer lfLegLower;
  
  ModelRenderer rtLegLower;
  
  ModelRenderer head;
  
  ModelRenderer chest;
  
  ModelRenderer lfArmUpper;
  
  ModelRenderer rtArmLower;
  
  ModelRenderer lfLegUpper;
  
  ModelRenderer rtLegUpper;
  
  ModelRenderer body;
  
  ModelRenderer rtArmUpper;
  
  ModelRenderer lfArmLower;
  
  public ModelKyuubi1Tail2(float f1) {
    this.wingspeed = f1;
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.lfLegLower = new ModelRenderer(this, 0, 16);
    this.lfLegLower.addBox(-2.0F, 0.0F, -3.0F, 4, 6, 4);
    this.lfLegLower.setRotationPoint(-3.0F, 18.0F, 2.0F);
    this.lfLegLower.setTextureSize(64, 32);
    this.lfLegLower.mirror = false;
    setRotation(this.lfLegLower, -0.446143F, 0.0F, 0.0F);
    this.rtLegLower = new ModelRenderer(this, 0, 16);
    this.rtLegLower.addBox(-2.0F, -1.0F, -3.0F, 4, 7, 4);
    this.rtLegLower.setRotationPoint(3.0F, 18.0F, 4.0F);
    this.rtLegLower.setTextureSize(64, 32);
    this.rtLegLower.mirror = false;
    setRotation(this.rtLegLower, -0.1487144F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
    this.head.setRotationPoint(0.0F, 0.0F, 6.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = false;
    setRotation(this.head, 0.223071F, 3.141593F, 0.0F);
    this.chest = new ModelRenderer(this, 12, 16);
    this.chest.addBox(-4.0F, 0.0F, -2.0F, 8, 7, 6);
    this.chest.setRotationPoint(0.0F, 0.0F, 5.0F);
    this.chest.setTextureSize(64, 32);
    this.chest.mirror = false;
    setRotation(this.chest, -0.8551081F, 0.0F, 0.0F);
    this.lfArmUpper = new ModelRenderer(this, 16, 16);
    this.lfArmUpper.addBox(-3.0F, -2.0F, -2.0F, 4, 7, 4);
    this.lfArmUpper.setRotationPoint(-5.0F, 2.0F, 3.0F);
    this.lfArmUpper.setTextureSize(64, 32);
    this.lfArmUpper.mirror = false;
    setRotation(this.lfArmUpper, 0.0F, 0.0F, 0.3020292F);
    this.rtArmLower = new ModelRenderer(this, 40, 16);
    this.rtArmLower.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4);
    this.rtArmLower.setRotationPoint(7.0F, 6.0F, 2.0F);
    this.rtArmLower.setTextureSize(64, 32);
    this.rtArmLower.mirror = false;
    setRotation(this.rtArmLower, 0.4833219F, 0.0F, 0.0F);
    this.lfLegUpper = new ModelRenderer(this, 0, 16);
    this.lfLegUpper.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4);
    this.lfLegUpper.setRotationPoint(-2.0F, 12.0F, 0.0F);
    this.lfLegUpper.setTextureSize(64, 32);
    this.lfLegUpper.mirror = false;
    setRotation(this.lfLegUpper, 0.260246F, 0.0F, 0.26025F);
    this.rtLegUpper = new ModelRenderer(this, 0, 16);
    this.rtLegUpper.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4);
    this.rtLegUpper.setRotationPoint(2.0F, 12.0F, 0.0F);
    this.rtLegUpper.setTextureSize(64, 32);
    this.rtLegUpper.mirror = false;
    setRotation(this.rtLegUpper, 0.5948578F, 0.0F, -0.260246F);
    this.body = new ModelRenderer(this, 12, 16);
    this.body.addBox(-4.0F, 0.0F, -3.0F, 8, 7, 6);
    this.body.setRotationPoint(0.0F, 5.0F, 1.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = false;
    setRotation(this.body, -0.2974289F, 0.0F, 0.0F);
    this.rtArmUpper = new ModelRenderer(this, 16, 16);
    this.rtArmUpper.addBox(-1.0F, -2.0F, -2.0F, 4, 7, 4);
    this.rtArmUpper.setRotationPoint(5.0F, 2.0F, 2.0F);
    this.rtArmUpper.setTextureSize(64, 32);
    this.rtArmUpper.mirror = false;
    setRotation(this.rtArmUpper, 0.0F, 0.0F, -0.302028F);
    this.lfArmLower = new ModelRenderer(this, 40, 16);
    this.lfArmLower.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4);
    this.lfArmLower.setRotationPoint(-7.0F, 6.0F, 2.0F);
    this.lfArmLower.setTextureSize(64, 32);
    this.lfArmLower.mirror = false;
    setRotation(this.lfArmLower, 0.4833219F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    EntityPlayer e = (EntityPlayer)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    if (f1 > 0.1D) {
      newangle = MathHelper.cos(f2 * 1.1F * this.wingspeed) * 3.141593F * 0.2F * f1;
    } else {
      newangle = 0.0F;
    } 
    this.rtLegUpper.rotateAngleX = 0.59F + newangle;
    this.rtLegLower.rotateAngleX = -0.15F + newangle;
    this.rtLegLower.rotationPointZ = (float)(Math.sin((0.59F + newangle)) * 8.0D);
    this.lfLegUpper.rotateAngleX = 0.26F - newangle;
    this.lfLegLower.rotateAngleX = -0.44F - newangle;
    this.lfLegLower.rotationPointZ = (float)(Math.sin((0.26F - newangle)) * 8.0D);
    newangle = MathHelper.cos(f2 * 1.1F * this.wingspeed) * 3.141593F * 0.08F * f1;
    newangle += MathHelper.cos(f2 * 0.5F * this.wingspeed) * 3.141593F * 0.01F;
    this.rtArmUpper.rotateAngleX = newangle;
    this.rtArmLower.rotateAngleX = 0.48F + newangle;
    this.rtArmLower.rotationPointZ = (float)(Math.sin(newangle) * 8.0D);
    this.lfArmUpper.rotateAngleX = -newangle;
    this.lfArmLower.rotateAngleX = 0.48F - newangle;
    this.lfArmLower.rotationPointZ = (float)(Math.sin(-newangle) * 8.0D);
    float pi4 = 0.7853975F;
    this.head.rotateAngleY = (float)Math.toRadians(f3) + pi4 * 4.0F;
    GL11.glPushMatrix();
    GL11.glEnable(2977);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    GL11.glTranslatef(0.0F, 0.0F, 0.0F);
    GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
    GL11.glTranslatef(0.0F, 0.0F, 0.0F);
    this.lfLegLower.render(f5);
    this.rtLegLower.render(f5);
    this.head.render(f5);
    this.chest.render(f5);
    this.lfArmUpper.render(f5);
    this.rtArmLower.render(f5);
    this.lfLegUpper.render(f5);
    this.rtLegUpper.render(f5);
    this.body.render(f5);
    this.rtArmUpper.render(f5);
    this.lfArmLower.render(f5);
    GL11.glDisable(3042);
    GL11.glPopMatrix();
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }
}

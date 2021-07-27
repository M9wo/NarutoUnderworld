package alcoholmod.Mathioks.Jutsu;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class ModelWoodBunshin extends ModelBase {
  public ModelRenderer bipedHead;
  
  public ModelRenderer bipedHeadwear;
  
  public ModelRenderer bipedBody;
  
  public ModelRenderer bipedRightArm;
  
  public ModelRenderer bipedLeftArm;
  
  public ModelRenderer bipedRightLeg;
  
  public ModelRenderer bipedLeftLeg;
  
  public ModelRenderer bipedEars;
  
  public ModelRenderer bipedCloak;
  
  public int heldItemLeft;
  
  public int heldItemRight;
  
  public ModelWoodBunshin() {
    this(0.0F);
  }
  
  public ModelWoodBunshin(float par1) {
    this(par1, 0.0F, 64, 32);
  }
  
  public ModelWoodBunshin(float par1, float par2, int par3, int par4) {
    this.textureWidth = par3;
    this.textureHeight = par4;
    this.bipedCloak = new ModelRenderer(this, 0, 0);
    this.bipedCloak.addBox(-5.0F, 0.0F, -1.0F, 10, 16, 1, par1);
    this.bipedEars = new ModelRenderer(this, 24, 0);
    this.bipedEars.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, par1);
    this.bipedHead = new ModelRenderer(this, 0, 0);
    this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, par1);
    this.bipedHead.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
    this.bipedHeadwear = new ModelRenderer(this, 32, 0);
    this.bipedHeadwear.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, par1 + 0.5F);
    this.bipedHeadwear.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
    this.bipedBody = new ModelRenderer(this, 16, 16);
    this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, par1);
    this.bipedBody.setRotationPoint(0.0F, 0.0F + par2, 0.0F);
    this.bipedRightArm = new ModelRenderer(this, 40, 16);
    this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, par1);
    this.bipedRightArm.setRotationPoint(-5.0F, 2.0F + par2, 0.0F);
    this.bipedLeftArm = new ModelRenderer(this, 40, 16);
    this.bipedLeftArm.mirror = true;
    this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, par1);
    this.bipedLeftArm.setRotationPoint(5.0F, 2.0F + par2, 0.0F);
    this.bipedRightLeg = new ModelRenderer(this, 0, 16);
    this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, par1);
    this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F + par2, 0.0F);
    this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
    this.bipedLeftLeg.mirror = true;
    this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, par1);
    this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F + par2, 0.0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    if (this.isChild) {
      float f6 = 2.0F;
      GL11.glPushMatrix();
      GL11.glScalef(0.75F, 0.75F, 0.75F);
      GL11.glTranslatef(0.0F, 16.0F * par7, 0.0F);
      this.bipedHead.render(par7);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      GL11.glTranslatef(0.0F, 24.0F * par7, 0.0F);
      this.bipedBody.render(par7);
      this.bipedRightArm.render(par7);
      this.bipedLeftArm.render(par7);
      this.bipedRightLeg.render(par7);
      this.bipedLeftLeg.render(par7);
      this.bipedHeadwear.render(par7);
      GL11.glPopMatrix();
    } else {
      this.bipedHead.render(par7);
      this.bipedBody.render(par7);
      this.bipedRightArm.render(par7);
      this.bipedLeftArm.render(par7);
      this.bipedRightLeg.render(par7);
      this.bipedLeftLeg.render(par7);
      this.bipedHeadwear.render(par7);
    } 
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    this.bipedHead.rotateAngleY = par4 / 57.295776F;
    this.bipedHead.rotateAngleX = par5 / 57.295776F;
    this.bipedHeadwear.rotateAngleY = this.bipedHead.rotateAngleY;
    this.bipedHeadwear.rotateAngleX = this.bipedHead.rotateAngleX;
    this.bipedRightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + 3.141593F) * 2.0F * par2 * 0.5F;
    this.bipedLeftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
    this.bipedRightArm.rotateAngleZ = 0.0F;
    this.bipedLeftArm.rotateAngleZ = 0.0F;
    this.bipedRightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    this.bipedLeftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + 3.141593F) * 1.4F * par2;
    this.bipedRightLeg.rotateAngleY = 0.0F;
    this.bipedLeftLeg.rotateAngleY = 0.0F;
    if (this.isRiding) {
      ModelRenderer modelRenderer = this.bipedRightArm;
      modelRenderer.rotateAngleX += -0.6283186F;
      modelRenderer = this.bipedLeftArm;
      modelRenderer.rotateAngleX += -0.6283186F;
      this.bipedRightLeg.rotateAngleX = -1.256637F;
      this.bipedLeftLeg.rotateAngleX = -1.256637F;
      this.bipedRightLeg.rotateAngleY = 0.3141593F;
      this.bipedLeftLeg.rotateAngleY = -0.3141593F;
    } 
    if (this.heldItemLeft != 0)
      this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - 0.3141593F * this.heldItemLeft; 
    if (this.heldItemRight != 0)
      this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - 0.3141593F * this.heldItemRight; 
    this.bipedRightArm.rotateAngleY = 0.0F;
    this.bipedLeftArm.rotateAngleY = 0.0F;
    if (this.onGround > -9990.0F) {
      float f6 = this.onGround;
      this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * 3.141593F * 2.0F) * 0.2F;
      this.bipedRightArm.rotationPointZ = MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
      this.bipedRightArm.rotationPointX = -MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
      this.bipedLeftArm.rotationPointZ = -MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
      this.bipedLeftArm.rotationPointX = MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
      ModelRenderer modelRenderer = this.bipedRightArm;
      modelRenderer.rotateAngleY += this.bipedBody.rotateAngleY;
      modelRenderer = this.bipedLeftArm;
      modelRenderer.rotateAngleY += this.bipedBody.rotateAngleY;
      modelRenderer = this.bipedLeftArm;
      modelRenderer.rotateAngleX += this.bipedBody.rotateAngleY;
      f6 = 1.0F - this.onGround;
      f6 *= f6;
      f6 *= f6;
      f6 = 1.0F - f6;
      float f7 = MathHelper.sin(f6 * 3.141593F);
      float f8 = MathHelper.sin(this.onGround * 3.141593F) * -(this.bipedHead.rotateAngleX - 0.7F) * 0.75F;
      this.bipedRightArm.rotateAngleX = (float)(this.bipedRightArm.rotateAngleX - f7 * 1.2D + f8);
      modelRenderer = this.bipedRightArm;
      modelRenderer.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
      this.bipedRightArm.rotateAngleZ = MathHelper.sin(this.onGround * 3.141593F) * -0.4F;
    } 
    ModelRenderer var10000 = this.bipedRightArm;
    var10000.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
    var10000 = this.bipedLeftArm;
    var10000.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
    var10000 = this.bipedRightArm;
    var10000.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
    var10000 = this.bipedLeftArm;
    var10000.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
  }
  
  public void renderEars(float par1) {
    this.bipedEars.rotateAngleY = this.bipedHead.rotateAngleY;
    this.bipedEars.rotateAngleX = this.bipedHead.rotateAngleX;
    this.bipedEars.rotationPointX = 0.0F;
    this.bipedEars.rotationPointY = 0.0F;
    this.bipedEars.render(par1);
  }
  
  public void renderCloak(float par1) {
    this.bipedCloak.render(par1);
  }
}

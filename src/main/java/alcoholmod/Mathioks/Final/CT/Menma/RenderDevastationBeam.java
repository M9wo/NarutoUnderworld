package alcoholmod.Mathioks.Final.CT.Menma;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderDevastationBeam extends Render {
  int red = 255;
  
  int green = 35;
  
  int blue = 255;
  
  int alpha = 255;
  
  private static final ResourceLocation arrowTextures = new ResourceLocation("textures/entity/endercrystal/endercrystal_beam.png");
  
  public void doRender(EntityDevastationBeam par1EntityLaserBlast, double par2, double par4, double par6, float par8, float par9) {
    GL11.glPushMatrix();
    GL11.glTranslatef((float)par2, (float)par4, (float)par6);
    GL11.glRotatef(par1EntityLaserBlast.prevRotationYaw + (par1EntityLaserBlast.rotationYaw - par1EntityLaserBlast.prevRotationYaw) * par9 - 90.0F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(par1EntityLaserBlast.prevRotationPitch + (par1EntityLaserBlast.rotationPitch - par1EntityLaserBlast.prevRotationPitch) * par9, 0.0F, 0.0F, 1.0F);
    GL11.glScaled(3.5D, 3.5D, 3.5D);
    GL11.glDisable(3553);
    GL11.glDisable(2896);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 1);
    GL11.glEnable(32826);
    Tessellator tessellator = Tessellator.instance;
    tessellator.startDrawingQuads();
    tessellator.setColorRGBA(this.red, this.green, this.blue, this.alpha);
    tessellator.addVertexWithUV(-8.0D, -2.0D, 0.0D, par2, par4);
    tessellator.draw();
    byte b0 = 0;
    float f2 = 0.0F;
    float f3 = 0.5F;
    float f4 = (0 + b0 * 10) / 32.0F;
    float f5 = (5 + b0 * 10) / 32.0F;
    float f10 = 0.02625F;
    GL11.glEnable(32826);
    if (par9 > 0.0F) {
      float f12 = -MathHelper.sin(par9 * 3.0F) * par9;
      GL11.glRotatef(f12, 0.0F, 0.0F, 1.0F);
    } 
    GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
    GL11.glScalef(f10, f10, f10);
    GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
    for (int i = 0; i < 4; i++) {
      GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
      GL11.glNormal3f(0.0F, 0.0F, f10);
      tessellator.startDrawingQuads();
      tessellator.setColorRGBA(this.red, this.green, this.blue, this.alpha);
      tessellator.addVertexWithUV(-8.0D, -2.0D, 0.0D, f2, f4);
      tessellator.addVertexWithUV(8.0D, -2.0D, 0.0D, f3, f4);
      tessellator.addVertexWithUV(8.0D, 2.0D, 0.0D, f3, f5);
      tessellator.addVertexWithUV(-8.0D, 2.0D, 0.0D, f2, f5);
      tessellator.draw();
    } 
    tessellator.setColorRGBA(this.red, this.green, this.blue, this.alpha);
    GL11.glDisable(32826);
    GL11.glEnable(3042);
    GL11.glEnable(2896);
    GL11.glEnable(3553);
    GL11.glPopMatrix();
  }
  
  protected ResourceLocation getEntityTexture(EntityDevastationBeam par1EntityLaserBlast) {
    return arrowTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity par1Entity) {
    return getEntityTexture((EntityDevastationBeam)par1Entity);
  }
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    doRender((EntityDevastationBeam)par1Entity, par2, par4, par6, par8, par9);
  }
}

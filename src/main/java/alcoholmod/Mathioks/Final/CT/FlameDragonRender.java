package alcoholmod.Mathioks.Final.CT;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class FlameDragonRender extends Render {
  private static final ResourceLocation texture = new ResourceLocation("tm:textures/susano/animine/tech/body.png");
  
  private static final ResourceLocation texture2 = new ResourceLocation("tm:textures/susano/animine/tech/flame.png");
  
  private static final ResourceLocation modelpath = new ResourceLocation("tm:textures/susano/animine/tech/Dragon.obj");
  
  private static final IModelCustom model = AdvancedModelLoader.loadModel(modelpath);
  
  public void flameDragonRender(FlameDragonEntity par1EntityArrow, double par2, double par4, double par6, float par8, float par9) {
    GL11.glPushMatrix();
    GL11.glTranslatef((float)par2, (float)par4 + 0.7F, (float)par6);
    GL11.glRotatef(par1EntityArrow.prevRotationYaw + (par1EntityArrow.rotationYaw - par1EntityArrow.prevRotationYaw) * par9 - 180.0F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(par1EntityArrow.prevRotationPitch + (par1EntityArrow.rotationPitch - par1EntityArrow.prevRotationPitch) * par9 + 0.0F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
    GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
    float f4 = 4.0F;
    GL11.glScalef(4.0F, 4.0F, 4.0F);
    bindTexture(texture);
    model.renderPart("cube.015");
    bindTexture(texture2);
    model.renderPart("cube.008_cube.016");
    GL11.glPopMatrix();
  }
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    flameDragonRender((FlameDragonEntity)par1Entity, par2, par4, par6, par8, par9);
  }
  
  protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
    return texture;
  }
}

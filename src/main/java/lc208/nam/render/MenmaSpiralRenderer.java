package lc208.nam.render;

import alcoholmod.Mathioks.Final.CT.Menma.SpirallingRingEntity;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class MenmaSpiralRenderer extends RenderEntity {
  private static final ResourceLocation texture = new ResourceLocation("am:textures/entity/sferatexture.png");
  
  private static final ResourceLocation menma = new ResourceLocation("am:textures/entity/sfera.obj");
  
  private static final IModelCustom model = AdvancedModelLoader.loadModel(menma);
  
  public void doRender(Entity entity, double v, double v1, double v2, float v3, float v4) {
    render((SpirallingRingEntity)entity, v, v1, v2, v3, v4);
  }
  
  public void render(SpirallingRingEntity par1EntityArrow, double par2, double par4, double par6, float par8, float par9) {
    GL11.glPushMatrix();
    GL11.glTranslatef((float)par2, (float)par4 + 0.3F, (float)par6);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    GL11.glRotatef(par1EntityArrow.prevRotationYaw + (par1EntityArrow.rotationYaw - par1EntityArrow.prevRotationYaw) * par9 + 180.0F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(par1EntityArrow.prevRotationPitch + (par1EntityArrow.rotationPitch - par1EntityArrow.prevRotationPitch) * par9 + 180.0F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
    GL11.glScalef(0.3F, 0.3F, 0.3F);
    bindTexture(texture);
    model.renderAll();
    GL11.glDisable(3042);
    GL11.glPopMatrix();
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return texture;
  }
}

package lc208.nam.render;

import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class FumaShurikenRenderer extends RenderEntity {
  private static final ResourceLocation texture = new ResourceLocation("am:textures/entity/fstexture.png");
  
  private static final ResourceLocation shuriken = new ResourceLocation("am:textures/entity/Fshuriken.obj");
  
  private static final IModelCustom model = AdvancedModelLoader.loadModel(shuriken);
  
  public void doRender(Entity entity, double v, double v1, double v2, float v3, float v4) {
    render(entity, v, v1, v2, v3, v4);
  }
  
  public void render(Entity par1EntityArrow, double par2, double par4, double par6, float par8, float par9) {
    bindTexture(texture);
    GL11.glPushMatrix();
    GL11.glTranslatef((float)par2, (float)par4 + 0.8F, (float)par6);
    GL11.glScalef(2.0F, 2.0F, 2.0F);
    if (par1EntityArrow.prevPosY == par1EntityArrow.posY && par1EntityArrow.prevPosX == par1EntityArrow.posX && par1EntityArrow.prevPosZ == par1EntityArrow.posZ) {
      GL11.glRotatef(par1EntityArrow.prevRotationYaw - par1EntityArrow.rotationYaw - par1EntityArrow.getEntityData().getFloat("pvY"), 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(-45.0F, 0.0F, 1.0F, 0.0F);
    } else {
      GL11.glRotatef(par1EntityArrow.prevRotationYaw - par1EntityArrow.rotationYaw - this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
      par1EntityArrow.getEntityData().setFloat("pvY", this.renderManager.playerViewY);
    } 
    GL11.glRotatef(par1EntityArrow.prevRotationPitch + (par1EntityArrow.rotationPitch - par1EntityArrow.prevRotationPitch) * par9, 0.0F, 0.0F, 1.0F);
    GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
    GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
    model.renderAll();
    GL11.glPopMatrix();
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return texture;
  }
}

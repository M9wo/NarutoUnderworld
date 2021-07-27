package alcoholmod.Mathioks.Final.CT.Menma;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RasenShurikenRender extends Render {
  private static final ResourceLocation texture = new ResourceLocation("tm:textures/susano/animine/tech/rasshur.png");
  
  private static final ResourceLocation texture2 = new ResourceLocation("tm:textures/susano/animine/tech/rasengan.png");
  
  private static final ResourceLocation modelpath = new ResourceLocation("tm:textures/susano/animine/tech/rasshur.obj");
  
  private static final IModelCustom model = AdvancedModelLoader.loadModel(modelpath);
  
  private static float angel = 0.0F;
  
  public void flameDragonRender(RasenShurikenEntity par1EntityArrow, double par2, double par4, double par6, float par8, float par9) {
    GL11.glPushMatrix();
    GL11.glScalef(0.5F, 0.5F, 0.5F);
    GL11.glTranslatef((float)par2, (float)par4, (float)par6);
    GL11.glRotatef(par1EntityArrow.prevRotationYaw + (par1EntityArrow.rotationYaw - par1EntityArrow.prevRotationYaw) * par9 + 180.0F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(par1EntityArrow.prevRotationPitch + (par1EntityArrow.rotationPitch - par1EntityArrow.prevRotationPitch) * par9 + 180.0F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
    angel--;
    GL11.glRotatef(angel, 0.0F, 1.0F, 0.0F);
    GL11.glDisable(2896);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    bindTexture(texture);
    model.renderOnly(new String[] { "Sphere.002_Sphere.004" });
    GL11.glDisable(3042);
    bindTexture(texture2);
    model.renderAllExcept(new String[] { "Sphere.002_Sphere.004" });
    GL11.glPopMatrix();
  }
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    flameDragonRender((RasenShurikenEntity)par1Entity, par2, par4, par6, par8, par9);
  }
  
  protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
    return texture;
  }
}

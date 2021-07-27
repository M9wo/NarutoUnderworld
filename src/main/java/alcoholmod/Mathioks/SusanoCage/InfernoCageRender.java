package alcoholmod.Mathioks.SusanoCage;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class InfernoCageRender extends Render {
  private static final ResourceLocation cowTextures = new ResourceLocation("tm:textures/entity/ffff.png");
  
  protected ModelBase ModelSlowBeam = new InfernoCageModel();
  
  public void flameDragonRender(InfernoCageEntity par1EntityArrow, double par2, double par4, double par6, float par8, float par9) {
    GL11.glPushMatrix();
    GL11.glTranslatef((float)par2, (float)par4 + 1.3F, (float)par6);
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
    float f4 = 1.0F;
    GL11.glScalef(f4, f4, f4);
    bindEntityTexture((Entity)par1EntityArrow);
    GL11.glScalef(1.0F, 1.0F, 1.0F);
    this.ModelSlowBeam.render((Entity)par1EntityArrow, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
    GL11.glPopMatrix();
  }
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    flameDragonRender((InfernoCageEntity)par1Entity, par2, par4, par6, par8, par9);
  }
  
  protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
    return cowTextures;
  }
}

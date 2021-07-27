package UltimateSusanoo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderUltimateSusanoo extends RenderBiped {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/UltimateSusanoo.png");
  
  private static final ResourceLocation armorTex = new ResourceLocation("tm:textures/entity/susanoo_armor.png");
  
  public RenderUltimateSusanoo(ModelBase par1ModelBase, float par2) {
    super((ModelBiped)par1ModelBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(EntityUltimateSusanoo Entity) {
    return mobTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((EntityUltimateSusanoo)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glEnable(3042);
    GL11.glTranslatef(0.0F, 28.0F, 1.3F);
    ((EntityUltimateSusanoo)par1EntityLivingBase).getClass();
    float sc = 1.0F;
    GL11.glScalef(sc, sc, sc);
  }
  
  protected void postRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glDisable(3042);
  }
}

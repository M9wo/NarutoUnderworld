package CompleteSusanoo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderCompleteSusanoo extends RenderBiped {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/SusanoComplete.png");
  
  private static final ResourceLocation armorTex = new ResourceLocation("tm:textures/entity/susanoo_armor.png");
  
  public RenderCompleteSusanoo(ModelBase par1ModelBase, float par2) {
    super((ModelBiped)par1ModelBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(EntityCompleteSusanoo Entity) {
    return mobTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((EntityCompleteSusanoo)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glEnable(3042);
    GL11.glTranslatef(0.0F, 8.5F, 0.0F);
    ((EntityCompleteSusanoo)par1EntityLivingBase).getClass();
    float sc = 2.0F;
    GL11.glScalef(sc, sc, sc);
  }
  
  protected void postRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glDisable(3042);
  }
}

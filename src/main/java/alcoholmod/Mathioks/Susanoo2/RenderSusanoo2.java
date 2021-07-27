package alcoholmod.Mathioks.Susanoo2;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderSusanoo2 extends RenderBiped {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/susanooBrent.png");
  
  private static final ResourceLocation armorTex = new ResourceLocation("tm:textures/entity/susanoo_armor.png");
  
  public RenderSusanoo2(ModelBase par1ModelBase, float par2) {
    super((ModelBiped)par1ModelBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(EntitySusanoo2 Entity2) {
    return mobTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity2) {
    return getEntityTexture((EntitySusanoo2)entity2);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glTranslatef(0.0F, 0.0F, 0.0F);
    ((EntitySusanoo2)par1EntityLivingBase).getClass();
    float sc = 4.0F;
    GL11.glScalef(sc, sc, sc);
  }
}

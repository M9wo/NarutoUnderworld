package alcoholmod.Mathioks.Rinnegan;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderSusanoo3 extends RenderBiped {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/susanooRinnegan.png");
  
  private static final ResourceLocation armorTex = new ResourceLocation("tm:textures/entity/susanoo_armor.png");
  
  public RenderSusanoo3(ModelBase par1ModelBase, float par2) {
    super((ModelBiped)par1ModelBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(EntitySusanoo3 Entity) {
    return mobTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((EntitySusanoo3)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glTranslatef(0.0F, 0.0F, 0.0F);
    ((EntitySusanoo3)par1EntityLivingBase).getClass();
    float sc = 4.0F;
    GL11.glScalef(sc, sc, sc);
  }
}

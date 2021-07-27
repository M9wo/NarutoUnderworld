package alcoholmod.Mathioks.Mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderEntityNarutoMob05 extends RenderLiving {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/hidan.png");
  
  public RenderEntityNarutoMob05(ModelBase par1ModelBase, float par2) {
    super(par1ModelBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(EntityNarutoMob05 entity) {
    return mobTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((EntityNarutoMob05)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(1.0F, 1.0F, 1.0F);
  }
}

package alcoholmod.Mathioks.Mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderSasukeEntityMob extends RenderLiving {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/Sasuke2.png");
  
  public RenderSasukeEntityMob(ModelBiped par1ModelBase, float par2) {
    super((ModelBase)par1ModelBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(SasukeEntityMob entity) {
    return mobTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((SasukeEntityMob)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(1.0F, 1.0F, 1.0F);
  }
}

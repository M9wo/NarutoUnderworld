package alcoholmod.Mathioks.SixPaths;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderGiantRhino extends RenderLiving {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/dfg.png");
  
  public RenderGiantRhino(ModelBase par1ModelBase, float par2) {
    super(par1ModelBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(EntityGiantRhino Entity) {
    return mobTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((EntityGiantRhino)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(4.0F, 4.0F, 4.0F);
  }
}

package alcoholmod.Mathioks.NPC;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderTsunade extends RenderBiped {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/NPC/Tsunade.png");
  
  protected ResourceLocation getEntityTexture(EntityTsunade p_110775_1_) {
    return mobTextures;
  }
  
  public RenderTsunade(ModelBiped ZabuzaModel, float par2) {
    super(ZabuzaModel, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((EntityTsunade)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(1.0F, 1.0F, 1.0F);
  }
}

package alcoholmod.Mathioks.Boss;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class AkatsukiKisameRender extends RenderBiped {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/kisame.png");
  
  public AkatsukiKisameRender(ModelBiped akatsukiKisameModel, float par2) {
    super(akatsukiKisameModel, par2);
  }
  
  protected ResourceLocation getEntityTexture(AkatsukiKisame Entity) {
    return mobTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((AkatsukiKisame)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(1.0F, 1.0F, 1.0F);
  }
}

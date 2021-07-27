package alcoholmod.Mathioks.Final.Summons.Entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class SummonKatsuyuRender extends RenderLiving {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/Summons/KatsuyuSlugTexturemap.png");
  
  public SummonKatsuyuRender(ModelBase par1ModelBase, float par2) {
    super(par1ModelBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(SummonKatsuyuEntity Entity) {
    return mobTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((SummonKatsuyuEntity)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(3.5F, 3.5F, 3.5F);
  }
}

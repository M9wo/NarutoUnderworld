package alcoholmod.Mathioks.Mob;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderEntityNarutoMob06 extends RenderBiped {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/HinataSkin2.png");
  
  public RenderEntityNarutoMob06(ModelBiped par1ModelBase, float par2) {
    super(par1ModelBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(EntityNarutoMob06 Entity) {
    return mobTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((EntityNarutoMob06)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(0.9F, 0.9F, 0.9F);
  }
}

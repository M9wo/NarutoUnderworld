package alcoholmod.Mathioks.Final.Summons.Entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class Ninken7Render extends RenderLiving {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/Ninhound7.png");
  
  public Ninken7Render(ModelBase par1ModelBase, float par2) {
    super(par1ModelBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(Ninken7Entity Entity) {
    return mobTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((Ninken7Entity)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(2.0F, 2.0F, 2.0F);
  }
}

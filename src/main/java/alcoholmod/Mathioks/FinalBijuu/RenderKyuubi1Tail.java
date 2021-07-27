package alcoholmod.Mathioks.FinalBijuu;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderKyuubi1Tail extends RenderLiving {
  protected ModelKyuubi1Tail model;
  
  private float scale = 1.0F;
  
  private static final ResourceLocation texture = new ResourceLocation("orespawn", "Kyuubi.png");
  
  public RenderKyuubi1Tail(ModelKyuubi1Tail par1ModelBase, float par2, float par3) {
    super(par1ModelBase, par2 * par3);
    this.model = (ModelKyuubi1Tail)this.mainModel;
    this.scale = par3;
  }
  
  protected void preRenderScale(EntityKyuubi1Tail par1Entity, float par2) {
    GL11.glScalef(this.scale, this.scale, this.scale);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLiving, float par2) {
    preRenderScale((EntityKyuubi1Tail)par1EntityLiving, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return texture;
  }
}

package alcoholmod.Mathioks.FinalBijuu;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class Render10Tails extends RenderLiving {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/10)Juubi1Form.png");
  
  public Render10Tails(ModelBase par1ModelBase, float par2) {
    super(par1ModelBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity10Tails Entity) {
    return mobTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((Entity10Tails)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glTranslatef(0.0F, 0.0F, 15.0F);
    GL11.glScalef(3.0F, 3.0F, 3.0F);
  }
}
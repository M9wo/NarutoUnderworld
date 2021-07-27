package alcoholmod.Mathioks.NPC;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class ChuninExamGeninRender extends RenderBiped {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/NPC/ChuninExamGenin.png");
  
  private static final ResourceLocation mobTextures2 = new ResourceLocation("tm:textures/entity/NPC/ChuninExamGenin.png");
  
  private static final ResourceLocation mobTextures3 = new ResourceLocation("tm:textures/entity/NPC/ChuninExamGenin.png");
  
  private static final ResourceLocation mobTextures4 = new ResourceLocation("tm:textures/entity/NPC/ChuninExamGenin.png");
  
  protected ResourceLocation getEntityTexture(ChuninExamGeninEntity p_110775_1_) {
    switch (p_110775_1_.getTameSkin()) {
      default:
        return mobTextures;
      case 1:
        return mobTextures2;
      case 2:
        return mobTextures3;
      case 3:
        break;
    } 
    return mobTextures4;
  }
  
  public ChuninExamGeninRender(ModelBiped ZabuzaModel, float par2) {
    super(ZabuzaModel, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((ChuninExamGeninEntity)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(1.0F, 1.0F, 1.0F);
  }
}

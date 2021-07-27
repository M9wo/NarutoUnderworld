package alcoholmod.Mathioks.NPC;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class EntityRaikageRender extends RenderBiped {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/NPC/Raikage.png");
  
  private static final ResourceLocation mobTextures2 = new ResourceLocation("tm:textures/entity/NPC/Raikage.png");
  
  private static final ResourceLocation mobTextures3 = new ResourceLocation("tm:textures/entity/NPC/Raikage.png");
  
  private static final ResourceLocation mobTextures4 = new ResourceLocation("tm:textures/entity/NPC/Raikage.png");
  
  private static final ResourceLocation mobTextures5 = new ResourceLocation("tm:textures/entity/NPC/Raikage.png");
  
  protected ResourceLocation getEntityTexture(EntityRaikage p_110775_1_) {
    switch (p_110775_1_.getTameSkin()) {
      default:
        return mobTextures;
      case 1:
        return mobTextures2;
      case 2:
        return mobTextures3;
      case 3:
        return mobTextures4;
      case 4:
        break;
    } 
    return mobTextures5;
  }
  
  public EntityRaikageRender(ModelBiped ZabuzaModel, float par2) {
    super(ZabuzaModel, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((EntityRaikage)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(1.1F, 1.1F, 1.1F);
  }
}

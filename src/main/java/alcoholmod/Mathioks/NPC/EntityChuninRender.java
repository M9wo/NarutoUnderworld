package alcoholmod.Mathioks.NPC;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class EntityChuninRender extends RenderBiped {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/NPC/SunaChunin1.png");
  
  private static final ResourceLocation mobTextures2 = new ResourceLocation("tm:textures/entity/NPC/SunaChunin2.png");
  
  private static final ResourceLocation mobTextures3 = new ResourceLocation("tm:textures/entity/NPC/SunaChunin3.png");
  
  private static final ResourceLocation mobTextures4 = new ResourceLocation("tm:textures/entity/NPC/SunaChunin4.png");
  
  private static final ResourceLocation mobTextures5 = new ResourceLocation("tm:textures/entity/NPC/SunaChunin5.png");
  
  private static final ResourceLocation mobTextures6 = new ResourceLocation("tm:textures/entity/NPC/SunaChunin6.png");
  
  private static final ResourceLocation mobTextures7 = new ResourceLocation("tm:textures/entity/NPC/SunaChunin7.png");
  
  protected ResourceLocation getEntityTexture(EntityChunin p_110775_1_) {
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
        return mobTextures5;
      case 5:
        return mobTextures6;
      case 6:
        break;
    } 
    return mobTextures6;
  }
  
  public EntityChuninRender(ModelBiped ZabuzaModel, float par2) {
    super(ZabuzaModel, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((EntityChunin)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(1.0F, 1.0F, 1.0F);
  }
}

package alcoholmod.Mathioks.NPC;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class EntityNPCRender extends RenderBiped {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/NPC/sandShinobi3.png");
  
  private static final ResourceLocation mobTextures2 = new ResourceLocation("tm:textures/entity/NPC/sandShinobi2.png");
  
  private static final ResourceLocation mobTextures3 = new ResourceLocation("tm:textures/entity/NPC/sandShinobi1.png");
  
  private static final ResourceLocation mobTextures4 = new ResourceLocation("tm:textures/entity/NPC/sandShinobi4.png");
  
  private static final ResourceLocation mobTextures5 = new ResourceLocation("tm:textures/entity/NPC/Genin Extra0.png");
  
  private static final ResourceLocation mobTextures6 = new ResourceLocation("tm:textures/entity/NPC/Genin Extra1.png");
  
  private static final ResourceLocation mobTextures7 = new ResourceLocation("tm:textures/entity/NPC/Genin Extra2.png");
  
  private static final ResourceLocation mobTextures8 = new ResourceLocation("tm:textures/entity/NPC/Genin Extra3.png");
  
  private static final ResourceLocation mobTextures9 = new ResourceLocation("tm:textures/entity/NPC/Genin Extra4.png");
  
  private static final ResourceLocation mobTextures10 = new ResourceLocation("tm:textures/entity/NPC/Genin Extra5.png");
  
  private static final ResourceLocation mobTextures11 = new ResourceLocation("tm:textures/entity/NPC/Dosu.png");
  
  private static final ResourceLocation mobTextures12 = new ResourceLocation("tm:textures/entity/NPC/Zaku.png");
  
  private static final ResourceLocation mobTextures13 = new ResourceLocation("tm:textures/entity/NPC/Kin.png");
  
  protected ResourceLocation getEntityTexture(EntityNPC p_110775_1_) {
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
        return mobTextures7;
      case 7:
        return mobTextures8;
      case 8:
        return mobTextures9;
      case 9:
        return mobTextures10;
      case 10:
        return mobTextures11;
      case 11:
        return mobTextures12;
      case 12:
        break;
    } 
    return mobTextures13;
  }
  
  public EntityNPCRender(ModelBiped ZabuzaModel, float par2) {
    super(ZabuzaModel, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((EntityNPC)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(1.0F, 1.0F, 1.0F);
  }
}

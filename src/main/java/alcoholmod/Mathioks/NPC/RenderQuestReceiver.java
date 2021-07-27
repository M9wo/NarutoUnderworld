package alcoholmod.Mathioks.NPC;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderQuestReceiver extends RenderBiped {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/QuestGiver/Tazuna.png");
  
  private static final ResourceLocation mobTextures2 = new ResourceLocation("tm:textures/entity/QuestGiver/Jugo Taka.png");
  
  private static final ResourceLocation mobTextures3 = new ResourceLocation("tm:textures/entity/QuestGiver/Chef Brown Hair.png");
  
  private static final ResourceLocation mobTextures4 = new ResourceLocation("tm:textures/entity/QuestGiver/Chef Girl 2.png");
  
  private static final ResourceLocation mobTextures5 = new ResourceLocation("tm:textures/entity/QuestGiver/Elderly Woman.png");
  
  private static final ResourceLocation mobTextures6 = new ResourceLocation("tm:textures/entity/NPC/RaiJonin.png");
  
  private static final ResourceLocation mobTextures7 = new ResourceLocation("tm:textures/entity/NPC/LeafJonin.png");
  
  private static final ResourceLocation mobTextures8 = new ResourceLocation("tm:textures/entity/NPC/MizuJonin.png");
  
  private static final ResourceLocation mobTextures9 = new ResourceLocation("tm:textures/entity/NPC/RockJonin.png");
  
  private static final ResourceLocation mobTextures10 = new ResourceLocation("tm:textures/entity/NPC/SunaJonin.png");
  
  protected ResourceLocation getEntityTexture(EntityQuestReceiver p_110775_1_) {
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
        break;
    } 
    return mobTextures10;
  }
  
  public RenderQuestReceiver(ModelBiped ZabuzaModel, float par2) {
    super(ZabuzaModel, par2);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((EntityQuestReceiver)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(1.0F, 1.0F, 1.0F);
  }
}

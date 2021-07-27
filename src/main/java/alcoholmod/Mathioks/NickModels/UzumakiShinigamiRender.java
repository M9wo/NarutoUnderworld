package alcoholmod.Mathioks.NickModels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class UzumakiShinigamiRender extends RenderBiped {
  private static final ResourceLocation Player_Texture = new ResourceLocation("tm:textures/entity/Shinigami-texture.png");
  
  public UzumakiShinigamiRender(ModelBiped p_i1262_1_, float p_i1262_2_) {
    super(p_i1262_1_, p_i1262_2_);
  }
  
  public UzumakiShinigamiRender(UzumakiShinigamiModel model, float size) {
    super(model, size);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    UzumakiShinigamiEntity clone = (UzumakiShinigamiEntity)entity;
    return Player_Texture;
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glTranslatef(0.0F, 1.8F, 1.5F);
    GL11.glScalef(0.94F, 0.94F, 0.94F);
  }
}

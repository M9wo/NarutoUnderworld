package alcoholmod.Mathioks.SmoshXDDDModels;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class ShukakuFRender extends RenderLiving {
  private static final ResourceLocation Player_Texture = new ResourceLocation("tm:textures/entity/ShukakuF.png");
  
  public ShukakuFRender(ModelBiped p_i1262_1_, float p_i1262_2_) {
    super((ModelBase)p_i1262_1_, p_i1262_2_);
  }
  
  public ShukakuFRender(ShukakuFModel model, float size) {
    super(model, size);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    ShukakuFEntity clone = (ShukakuFEntity)entity;
    return Player_Texture;
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(0.94F, 0.94F, 0.94F);
  }
}

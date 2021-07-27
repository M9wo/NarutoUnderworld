package newSusanoo;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class NewRenderSusanoo extends RenderBiped {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/susano'otexturetry1.png");
  
  private static final ResourceLocation armorTex = new ResourceLocation("tm:textures/entity/susanoo_armor.png");
  
  public NewRenderSusanoo(ModelBase par1ModelBase, float par2) {
    super((ModelBiped)par1ModelBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(NewEntitySusanoo Entity) {
    return mobTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((NewEntitySusanoo)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glEnable(3042);
    GL11.glTranslatef(0.0F, 6.6F, 0.0F);
    ((NewEntitySusanoo)par1EntityLivingBase).getClass();
    float sc = 4.0F;
    GL11.glScalef(sc, sc, sc);
  }
  
  protected void postRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glDisable(3042);
  }
}

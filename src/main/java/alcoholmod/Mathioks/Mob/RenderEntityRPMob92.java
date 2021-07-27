package alcoholmod.Mathioks.Mob;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderEntityRPMob92 extends RenderBiped {
  private static final ResourceLocation Player_Texture = new ResourceLocation("tm:textures/entity/SasukeYoung.png");
  
  public RenderEntityRPMob92(ModelBiped par1ModelBase, float par2) {
    super(par1ModelBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(EntityRPMob92 Entity) {
    return Player_Texture;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    EntityRPMob92 clone = (EntityRPMob92)entity;
    return Player_Texture;
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(0.95F, 0.95F, 0.95F);
  }
}

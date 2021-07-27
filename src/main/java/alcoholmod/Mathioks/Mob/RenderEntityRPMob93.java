package alcoholmod.Mathioks.Mob;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderEntityRPMob93 extends RenderBiped {
  private static final ResourceLocation Player_Texture = new ResourceLocation("tm:textures/entity/NarutoYoungFlat.png");
  
  public RenderEntityRPMob93(ModelBiped par1ModelBase, float par2) {
    super(par1ModelBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(EntityRPMob93 Entity) {
    return Player_Texture;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    EntityRPMob93 clone = (EntityRPMob93)entity;
    return Player_Texture;
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(0.93F, 0.93F, 0.93F);
  }
}

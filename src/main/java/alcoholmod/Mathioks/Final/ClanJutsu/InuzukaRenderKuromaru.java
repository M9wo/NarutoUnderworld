package alcoholmod.Mathioks.Final.ClanJutsu;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class InuzukaRenderKuromaru extends RenderLiving {
  private static final ResourceLocation mobTextures = new ResourceLocation("tm:textures/entity/Kuromaru.png");
  
  public InuzukaRenderKuromaru(ModelBase par1ModelBase, float par2) {
    super(par1ModelBase, par2);
  }
  
  protected ResourceLocation getEntityTexture(InuzukaEntityKuromaru Entity) {
    return mobTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    return getEntityTexture((InuzukaEntityKuromaru)entity);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    if (((InuzukaEntityKuromaru)par1EntityLivingBase).getTameSkin() == 0) {
      GL11.glScalef(0.6F, 0.6F, 0.6F);
    } else if (((InuzukaEntityKuromaru)par1EntityLivingBase).getTameSkin() == 1) {
      GL11.glScalef(0.9F, 0.9F, 0.9F);
    } else if (((InuzukaEntityKuromaru)par1EntityLivingBase).getTameSkin() == 2) {
      GL11.glScalef(1.1F, 1.1F, 1.1F);
    } else if (((InuzukaEntityKuromaru)par1EntityLivingBase).getTameSkin() == 3) {
      GL11.glScalef(1.5F, 1.5F, 1.5F);
    } 
  }
}

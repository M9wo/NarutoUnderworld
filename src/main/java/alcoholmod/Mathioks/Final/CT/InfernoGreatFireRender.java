package alcoholmod.Mathioks.Final.CT;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import newSusanoo.NewEntitySusanoo;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class InfernoGreatFireRender extends Render {
  private static final ResourceLocation texture = new ResourceLocation("tm:textures/susano/animine/tech/amaterasu.png");
  
  private static final ResourceLocation texture2 = new ResourceLocation("tm:textures/susano/animine/tech/fire.png");
  
  private static final ResourceLocation modelpath = new ResourceLocation("tm:textures/susano/animine/tech/amaterasu.obj");
  
  private static final IModelCustom model = AdvancedModelLoader.loadModel(modelpath);
  
  private static final String __OBFID = "CL_00001035";
  
  private float func_82400_a(float p_82400_1_, float p_82400_2_, float p_82400_3_) {
    float f3;
    for (f3 = p_82400_2_ - p_82400_1_; f3 < -180.0F; f3 += 360.0F);
    while (f3 >= 180.0F)
      f3 -= 360.0F; 
    return p_82400_1_ + p_82400_3_ * f3;
  }
  
  public void doRender(InfernoGreatFireEntity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
    GL11.glPushMatrix();
    GL11.glDisable(2884);
    float f2 = func_82400_a(p_76986_1_.prevRotationYaw, p_76986_1_.rotationYaw, p_76986_9_);
    float f3 = p_76986_1_.prevRotationPitch + (p_76986_1_.rotationPitch - p_76986_1_.prevRotationPitch) * p_76986_9_;
    GL11.glTranslatef((float)p_76986_2_, (float)p_76986_4_, (float)p_76986_6_);
    float f4 = 0.5625F;
    GL11.glEnable(32826);
    GL11.glScalef(4.0F, 4.0F, 4.0F);
    GL11.glEnable(3008);
    bindTexture(texture2);
    model.renderOnly(new String[] { "Sphere_Sphere.002" });
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    bindTexture(texture);
    model.renderAllExcept(new String[] { "Sphere_Sphere.002" });
    GL11.glDisable(3042);
    GL11.glPopMatrix();
  }
  
  protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
    return texture;
  }
  
  public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
    doRender((InfernoGreatFireEntity)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glEnable(3042);
    GL11.glTranslatef(0.0F, 0.0F, 0.0F);
    ((NewEntitySusanoo)par1EntityLivingBase).getClass();
    float sc = 1.0F;
    GL11.glScalef(sc, sc, sc);
  }
  
  protected void postRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glDisable(3042);
  }
}

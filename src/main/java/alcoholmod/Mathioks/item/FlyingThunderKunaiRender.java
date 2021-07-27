package alcoholmod.Mathioks.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class FlyingThunderKunaiRender extends RenderArrow {
  private static final ResourceLocation texture0 = new ResourceLocation("am:textures/entity/Flytexture0.png");
  
  private static final ResourceLocation texture1 = new ResourceLocation("am:textures/entity/Flytexture1.png");
  
  private static final ResourceLocation modelLoc = new ResourceLocation("am:textures/entity/FlyKun.obj");
  
  private static final IModelCustom model = AdvancedModelLoader.loadModel(modelLoc);
  
  public void renderKunai(FlyingThunderKunaiEntity par1EntityArrow, double par2, double par4, double par6, float par8, float par9) {
    GL11.glPushMatrix();
    GL11.glTranslatef((float)par2, (float)par4, (float)par6);
    GL11.glScalef(1.0F, 1.0F, 1.0F);
    if (par1EntityArrow.prevPosY == par1EntityArrow.posY && par1EntityArrow.prevPosX == par1EntityArrow.posX && par1EntityArrow.prevPosZ == par1EntityArrow.posZ) {
      GL11.glRotatef(par1EntityArrow.prevRotationYaw - par1EntityArrow.rotationYaw - par1EntityArrow.getEntityData().getFloat("pvY"), 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
    } else {
      GL11.glRotatef(par1EntityArrow.prevRotationYaw - par1EntityArrow.rotationYaw - this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
      par1EntityArrow.getEntityData().setFloat("pvY", this.renderManager.playerViewY);
    } 
    GL11.glRotatef(par1EntityArrow.prevRotationPitch + (par1EntityArrow.rotationPitch - par1EntityArrow.prevRotationPitch) * par9, 0.0F, 0.0F, 1.0F);
    GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
    GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
    (Minecraft.getMinecraft()).renderEngine.bindTexture(texture0);
    model.renderAllExcept(new String[] { "hexadecagon.004" });
    (Minecraft.getMinecraft()).renderEngine.bindTexture(texture1);
    model.renderOnly(new String[] { "hexadecagon.004" });
    GL11.glPopMatrix();
  }
  
  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
    renderKunai((FlyingThunderKunaiEntity)par1Entity, par2, par4, par6, par8, par9);
  }
  
  protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
    return null;
  }
}

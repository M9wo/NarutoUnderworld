package lc208.nam.render.customplayer;

import lc208.nam.render.CustomPlayerModel;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class NekoCustomModel extends CustomPlayerModel {
  public static final ResourceLocation NekoModelLocation2 = new ResourceLocation("am:textures/entity/ushi.obj");
  
  private static final IModelCustom UshiModel = AdvancedModelLoader.loadModel(NekoModelLocation2);
  
  public static final ResourceLocation NekoModelTexture = new ResourceLocation("am:textures/entity/nekotexture.png");
  
  public static final ResourceLocation NekoModelLocation = new ResourceLocation("am:textures/entity/hvost.obj");
  
  private static final IModelCustom HvostModel = AdvancedModelLoader.loadModel(NekoModelLocation);
  
  public void pre() {
    GL11.glDisable(2896);
  }
  
  public void post() {
    GL11.glEnable(2896);
  }
  
  public void partHead() {
    GL11.glTranslatef(0.0F, -1.5F, 0.0F);
    (Minecraft.getMinecraft()).renderEngine.bindTexture(NekoModelTexture);
    UshiModel.renderAll();
  }
  
  public void partBody() {
    GL11.glTranslatef(0.0F, -1.5F, 0.0F);
    (Minecraft.getMinecraft()).renderEngine.bindTexture(NekoModelTexture);
    HvostModel.renderAll();
  }
  
  public void partRightArm() {}
  
  public void partLeftArm() {}
  
  public void partRightLeg() {}
  
  public void partLeftLeg() {}
}

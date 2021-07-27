package lc208.nam.render.customarmor;

import lc208.nam.render.CustomArmorModel;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class AkatsukiCustomArmor extends CustomArmorModel {
  private IModelCustom model = AdvancedModelLoader.loadModel(new ResourceLocation("am:textures/entity/Akatsuki.obj"));
  
  private ResourceLocation textureloc = new ResourceLocation("am:textures/entity/akatsuki.png");
  
  private int partType;
  
  public AkatsukiCustomArmor(int partType) {
    this.partType = partType;
  }
  
  public void pre() {
    GL11.glEnable(3042);
    GL11.glDisable(2896);
    GL11.glBlendFunc(770, 771);
  }
  
  public void post() {
    GL11.glEnable(2896);
    GL11.glDisable(3042);
  }
  
  public void partHead() {
    if (this.partType == 0) {
      GL11.glTranslatef(0.0F, -1.5F, 0.0F);
      (Minecraft.getMinecraft()).renderEngine.bindTexture(this.textureloc);
      this.model.renderAll();
    } 
  }
  
  public void partBody() {}
  
  public void partRightArm() {}
  
  public void partLeftArm() {}
  
  public void partRightLeg() {}
  
  public void partLeftLeg() {}
}

package lc208.nam.render;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class ItemMenmaSpiralRenderer implements IItemRenderer {
  public static final ResourceLocation texture = new ResourceLocation("am:textures/entity/sferatexture.png");
  
  public static final ResourceLocation sphere = new ResourceLocation("am:textures/entity/sfera.obj");
  
  private static final IModelCustom model = AdvancedModelLoader.loadModel(sphere);
  
  public boolean handleRenderType(ItemStack item, IItemRenderer.ItemRenderType type) {
    switch (type) {
      case EQUIPPED:
      case EQUIPPED_FIRST_PERSON:
        return true;
    } 
    return false;
  }
  
  public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType type, ItemStack item, IItemRenderer.ItemRendererHelper helper) {
    return false;
  }
  
  public void renderItem(IItemRenderer.ItemRenderType type, ItemStack item, Object... data) {
    switch (type) {
      case EQUIPPED:
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glScalef(0.7F, 0.7F, 0.7F);
        GL11.glTranslatef(0.62F, 0.0F, 0.0F);
        (Minecraft.getMinecraft()).renderEngine.bindTexture(texture);
        model.renderAll();
        GL11.glDisable(3042);
        GL11.glPopMatrix();
        break;
      case EQUIPPED_FIRST_PERSON:
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glScalef(0.3F, 0.3F, 0.3F);
        GL11.glTranslatef(2.0F, 1.5F, 0.0F);
        (Minecraft.getMinecraft()).renderEngine.bindTexture(texture);
        model.renderAll();
        GL11.glDisable(3042);
        GL11.glPopMatrix();
        break;
    } 
  }
}

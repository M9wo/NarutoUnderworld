package lc208.nam.render;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class ItemFumaShurikenRenderer implements IItemRenderer {
  public static final ResourceLocation texture = new ResourceLocation("am:textures/entity/fstexture.png");
  
  public static final ResourceLocation shuriken = new ResourceLocation("am:textures/entity/Fshuriken.obj");
  
  private static final IModelCustom model = AdvancedModelLoader.loadModel(shuriken);
  
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
      case EQUIPPED_FIRST_PERSON:
        GL11.glPushMatrix();
        (Minecraft.getMinecraft()).renderEngine.bindTexture(texture);
        GL11.glRotatef(270.0F, 1.0F, 0.0F, 0.0F);
        GL11.glTranslatef(0.8F, 1.0F, 0.3F);
        GL11.glScalef(2.0F, 2.0F, 2.0F);
        model.renderAll();
        GL11.glPopMatrix();
        break;
    } 
  }
}

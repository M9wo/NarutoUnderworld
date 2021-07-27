package lc208.nam.render;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class ItemShurikenRenderer implements IItemRenderer {
  public static final ResourceLocation texture = new ResourceLocation("am:textures/entity/stexture.png");
  
  public static final ResourceLocation shuriken = new ResourceLocation("am:textures/entity/Shuriken.obj");
  
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
        GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(-0.7F, 0.1F, 0.4F);
        GL11.glRotatef(30.0F, 0.0F, 1.0F, 0.0F);
        GL11.glScalef(0.5F, 0.5F, 0.5F);
        GL11.glScalef(0.5F, 0.5F, 0.5F);
        model.renderAll();
        GL11.glPopMatrix();
        break;
    } 
  }
}

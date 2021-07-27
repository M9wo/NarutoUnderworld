package lc208.nam.render;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class ItemKunaiJutsuRenderer implements IItemRenderer {
  public static final ResourceLocation texture = new ResourceLocation("am:textures/entity/kunaitexture.png");
  
  public static final ResourceLocation kunai = new ResourceLocation("am:textures/entity/kunai.obj");
  
  private static final IModelCustom model = AdvancedModelLoader.loadModel(kunai);
  
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
        (Minecraft.getMinecraft()).renderEngine.bindTexture(texture);
        GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
        GL11.glTranslatef(-0.4F, 0.26F, -0.16F);
        GL11.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(-15.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(-15.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(15.0F, 0.0F, 1.0F, 0.0F);
        GL11.glScalef(1.6F, 1.6F, 1.6F);
        model.renderAll();
        GL11.glPopMatrix();
        break;
      case EQUIPPED_FIRST_PERSON:
        GL11.glPushMatrix();
        (Minecraft.getMinecraft()).renderEngine.bindTexture(texture);
        GL11.glTranslatef(0.6F, 0.6F, 0.0F);
        GL11.glRotatef(-45.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
        model.renderAll();
        GL11.glPopMatrix();
        break;
    } 
  }
}

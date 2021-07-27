package lc208.nam.render;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class ItemFlyKunaiRenderer implements IItemRenderer {
  private static final ResourceLocation texture0 = new ResourceLocation("am:textures/entity/Flytexture0.png");
  
  private static final ResourceLocation texture1 = new ResourceLocation("am:textures/entity/Flytexture1.png");
  
  private static final ResourceLocation modelLoc = new ResourceLocation("am:textures/entity/FlyKun.obj");
  
  private static final IModelCustom model = AdvancedModelLoader.loadModel(modelLoc);
  
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
        GL11.glRotatef(-45.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
        GL11.glTranslatef(-0.07F, 0.7F, 0.0F);
        (Minecraft.getMinecraft()).renderEngine.bindTexture(texture0);
        model.renderAllExcept(new String[] { "hexadecagon.004" });
        (Minecraft.getMinecraft()).renderEngine.bindTexture(texture1);
        model.renderOnly(new String[] { "hexadecagon.004" });
        GL11.glPopMatrix();
        break;
      case EQUIPPED_FIRST_PERSON:
        GL11.glPushMatrix();
        GL11.glTranslatef(0.6F, 0.6F, 0.0F);
        GL11.glRotatef(-45.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(-10.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
        (Minecraft.getMinecraft()).renderEngine.bindTexture(texture0);
        model.renderAllExcept(new String[] { "hexadecagon.004" });
        (Minecraft.getMinecraft()).renderEngine.bindTexture(texture1);
        model.renderOnly(new String[] { "hexadecagon.004" });
        GL11.glPopMatrix();
        break;
    } 
  }
}

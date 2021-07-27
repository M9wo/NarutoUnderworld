package lc208.nam.render;

import alcoholmod.Mathioks.proxys.ClientProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ItemRasenganRender implements IItemRenderer {
  public static final ResourceLocation texture = new ResourceLocation("tm:textures/susano/animine/tech/rasengan.png");
  
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
        GL11.glScalef(0.4F, 0.4F, 0.4F);
        GL11.glTranslatef(1.0F, 0.0F, 0.0F);
        GL11.glDisable(2896);
        (Minecraft.getMinecraft()).renderEngine.bindTexture(texture);
        ClientProxy.model.renderAll();
        GL11.glPopMatrix();
        break;
      case EQUIPPED_FIRST_PERSON:
        GL11.glPushMatrix();
        GL11.glScalef(0.4F, 0.4F, 0.4F);
        GL11.glTranslatef(0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(1.0F, 0.0F, 0.0F);
        GL11.glDisable(2896);
        (Minecraft.getMinecraft()).renderEngine.bindTexture(texture);
        ClientProxy.model.renderAll();
        GL11.glPopMatrix();
        break;
    } 
  }
}

package alcoholmod.Mathioks.SevenSwordsmen;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ScytheHidanRender implements IItemRenderer {
  protected ScytheHidanModel model = new ScytheHidanModel();
  
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
        (Minecraft.getMinecraft()).renderEngine.bindTexture(new ResourceLocation("tm", "textures/items/ScytheHidan.png"));
        GL11.glRotatef(230.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(190.0F, 180.0F, 0.0F, 0.0F);
        GL11.glRotatef(200.0F, 0.0F, 0.0F, 0.0F);
        GL11.glTranslatef(0.6F, -0.8F, -0.1F);
        GL11.glScaled(1.3D, 1.3D, 1.3D);
        this.model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
        break;
    } 
  }
}

package alcoholmod.Mathioks.SevenSwordsmen;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class RenderShakujoObito implements IItemRenderer {
  protected ModelShakujoObito model = new ModelShakujoObito();
  
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
        (Minecraft.getMinecraft()).renderEngine.bindTexture(new ResourceLocation("tm", "textures/items/ShakujoObito.png"));
        GL11.glRotatef(100.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(80.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(100.0F, 0.0F, 0.0F, 1.0F);
        GL11.glTranslatef(-0.2F, 0.0F, 0.0F);
        this.model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
        break;
    } 
  }
}

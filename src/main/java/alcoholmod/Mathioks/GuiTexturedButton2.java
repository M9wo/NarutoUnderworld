package alcoholmod.Mathioks;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiTexturedButton2 extends GuiButton {
  public ResourceLocation texture;
  
  public GuiTexturedButton2(int id, int x, int y, ResourceLocation texture) {
    super(id, x, y, 82, 15, "");
    this.texture = texture;
    this.width = 82;
    this.height = 15;
  }
  
  public void drawButton(Minecraft mc, int x, int y) {
    if (this.visible) {
      FontRenderer fontrenderer = mc.fontRenderer;
      mc.getTextureManager().bindTexture(this.texture);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_146123_n = (x >= this.xPosition && y >= this.yPosition && x < this.xPosition + this.width && y < this.yPosition + this.height);
      int k = getHoverState(this.field_146123_n);
      GL11.glEnable(3042);
      OpenGlHelper.glBlendFunc(770, 771, 1, 0);
      GL11.glBlendFunc(770, 771);
      drawTexturedModalRect(this.xPosition, this.yPosition, 0, k * 20, this.width + 1, this.height);
      mouseDragged(mc, x, y);
    } 
  }
}

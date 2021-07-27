package alcoholmod.Mathioks.SevenSwordsmen;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class KabutowariRender implements IItemRenderer {
  protected KabutowariModel model = new KabutowariModel();
  
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
        (Minecraft.getMinecraft()).renderEngine.bindTexture(new ResourceLocation("tm", "textures/items/Kabutowari1.png"));
        GL11.glRotatef(260.0F, -130.0F, -450.0F, 1.0F);
        GL11.glRotatef(-40.0F, -360.0F, 200.0F, 1.0F);
        GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
        GL11.glTranslatef(-0.3F, -0.1F, 0.3F);
        GL11.glScaled(1.3D, 1.3D, 1.3D);
        this.model.render((Entity)data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
        break;
    } 
  }
}

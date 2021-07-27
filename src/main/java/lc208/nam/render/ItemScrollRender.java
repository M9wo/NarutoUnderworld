package lc208.nam.render;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class ItemScrollRender implements IItemRenderer {
  IModelCustom scrollmodel = AdvancedModelLoader.loadModel(new ResourceLocation("am:textures/items/scrolls/scroll.obj"));
  
  ResourceLocation cyan = new ResourceLocation("am:textures/items/scrolls/cyan.png");
  
  ResourceLocation green = new ResourceLocation("am:textures/items/scrolls/green.png");
  
  ResourceLocation red = new ResourceLocation("am:textures/items/scrolls/red.png");
  
  ResourceLocation yellow = new ResourceLocation("am:textures/items/scrolls/yellow.png");
  
  private int scrolltype;
  
  public ItemScrollRender(int scrolltype) {
    this.scrolltype = scrolltype;
  }
  
  public boolean handleRenderType(ItemStack item, IItemRenderer.ItemRenderType type) {
    return true;
  }
  
  public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType type, ItemStack item, IItemRenderer.ItemRendererHelper helper) {
    return true;
  }
  
  public void bindTexture() {
    switch (this.scrolltype) {
      case 1:
        (Minecraft.getMinecraft()).renderEngine.bindTexture(this.cyan);
        break;
      case 2:
        (Minecraft.getMinecraft()).renderEngine.bindTexture(this.green);
        break;
      case 3:
        (Minecraft.getMinecraft()).renderEngine.bindTexture(this.red);
        break;
      case 4:
        (Minecraft.getMinecraft()).renderEngine.bindTexture(this.yellow);
        break;
    } 
  }
  
  public void renderItem(IItemRenderer.ItemRenderType type, ItemStack item, Object... data) {
    switch (type) {
      case EQUIPPED:
        GL11.glPushMatrix();
        bindTexture();
        GL11.glTranslatef(0.0F, 0.8F, 0.0F);
        GL11.glTranslatef(0.0F, 0.0F, 1.0F);
        GL11.glTranslatef(1.0F, 0.0F, 0.0F);
        GL11.glTranslatef(-0.4F, 0.0F, -0.6F);
        GL11.glScalef(0.2F, 0.2F, 0.2F);
        GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(30.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(1.0F, 0.0F, 0.0F);
        GL11.glTranslatef(0.0F, -0.8F, -0.5F);
        GL11.glTranslatef(-1.8F, 0.0F, 1.8F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        this.scrollmodel.renderAll();
        GL11.glDisable(3042);
        GL11.glPopMatrix();
        break;
      case EQUIPPED_FIRST_PERSON:
        GL11.glPushMatrix();
        bindTexture();
        GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(-45.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
        GL11.glTranslatef(5.0F, 5.0F, 0.0F);
        GL11.glRotatef(30.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
        GL11.glScalef(0.5F, 0.5F, 0.5F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        this.scrollmodel.renderAll();
        GL11.glDisable(3042);
        GL11.glPopMatrix();
        break;
      case INVENTORY:
        GL11.glPushMatrix();
        bindTexture();
        GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(-45.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(-20.0F, 1.0F, 0.0F, 0.0F);
        GL11.glScalef(0.2F, 0.2F, 0.2F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        this.scrollmodel.renderAll();
        GL11.glDisable(3042);
        GL11.glPopMatrix();
        break;
      case ENTITY:
        GL11.glPushMatrix();
        bindTexture();
        GL11.glTranslatef(0.0F, 0.8F, 0.0F);
        GL11.glTranslatef(0.0F, 0.0F, 1.0F);
        GL11.glTranslatef(1.0F, 0.0F, 0.0F);
        GL11.glTranslatef(-0.4F, 0.0F, -0.6F);
        GL11.glScalef(0.1F, 0.1F, 0.1F);
        GL11.glRotatef(30.0F, 1.0F, 0.0F, 0.0F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        this.scrollmodel.renderAll();
        GL11.glDisable(3042);
        GL11.glPopMatrix();
        break;
    } 
  }
}

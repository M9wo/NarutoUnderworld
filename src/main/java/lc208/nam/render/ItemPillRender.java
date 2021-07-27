package lc208.nam.render;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class ItemPillRender implements IItemRenderer {
  IModelCustom pillmodel = AdvancedModelLoader.loadModel(new ResourceLocation("am:textures/items/pill/pill.obj"));
  
  ResourceLocation blue = new ResourceLocation("am:textures/items/pill/blue.png");
  
  ResourceLocation brown = new ResourceLocation("am:textures/items/pill/brown.png");
  
  ResourceLocation green = new ResourceLocation("am:textures/items/pill/green.png");
  
  ResourceLocation orange = new ResourceLocation("am:textures/items/pill/orange.png");
  
  ResourceLocation purple = new ResourceLocation("am:textures/items/pill/purple.png");
  
  ResourceLocation red = new ResourceLocation("am:textures/items/pill/red.png");
  
  ResourceLocation yellow = new ResourceLocation("am:textures/items/pill/yellow.png");
  
  private int pilltype;
  
  public ItemPillRender(int pilltype) {
    this.pilltype = pilltype;
  }
  
  public boolean handleRenderType(ItemStack item, IItemRenderer.ItemRenderType type) {
    return true;
  }
  
  public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType type, ItemStack item, IItemRenderer.ItemRendererHelper helper) {
    return true;
  }
  
  public void bindTexture() {
    switch (this.pilltype) {
      case 1:
        (Minecraft.getMinecraft()).renderEngine.bindTexture(this.blue);
        break;
      case 2:
        (Minecraft.getMinecraft()).renderEngine.bindTexture(this.brown);
        break;
      case 3:
        (Minecraft.getMinecraft()).renderEngine.bindTexture(this.green);
        break;
      case 4:
        (Minecraft.getMinecraft()).renderEngine.bindTexture(this.orange);
        break;
      case 5:
        (Minecraft.getMinecraft()).renderEngine.bindTexture(this.purple);
        break;
      case 6:
        (Minecraft.getMinecraft()).renderEngine.bindTexture(this.red);
        break;
      case 7:
        (Minecraft.getMinecraft()).renderEngine.bindTexture(this.yellow);
        break;
    } 
  }
  
  public void renderItem(IItemRenderer.ItemRenderType type, ItemStack item, Object... data) {
    switch (type) {
      case EQUIPPED:
        GL11.glPushMatrix();
        bindTexture();
        GL11.glScalef(0.8F, 0.8F, 0.8F);
        GL11.glRotatef(-45.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-30.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(0.5F, 1.8F, 0.0F);
        GL11.glTranslatef(0.0F, -0.4F, 0.0F);
        GL11.glTranslatef(-0.5F, 0.0F, 0.5F);
        GL11.glScalef(0.8F, 0.8F, 0.8F);
        this.pillmodel.renderAllExcept(new String[] { "Sphere.001" });
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.7F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        this.pillmodel.renderOnly(new String[] { "Sphere.001" });
        GL11.glDisable(3042);
        GL11.glPopMatrix();
        break;
      case EQUIPPED_FIRST_PERSON:
        GL11.glPushMatrix();
        bindTexture();
        GL11.glScalef(0.5F, 0.5F, 0.5F);
        GL11.glRotatef(120.0F, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(0.0F, 2.0F, 0.0F);
        GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(30.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(-10.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(0.0F, 0.0F, 1.5F);
        GL11.glTranslatef(0.0F, 0.0F, -2.0F);
        GL11.glTranslatef(-1.0F, 0.0F, 0.0F);
        this.pillmodel.renderAllExcept(new String[] { "Sphere.001" });
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.7F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        this.pillmodel.renderOnly(new String[] { "Sphere.001" });
        GL11.glDisable(3042);
        GL11.glPopMatrix();
        break;
      case INVENTORY:
        GL11.glPushMatrix();
        bindTexture();
        GL11.glScalef(0.8F, 0.8F, 0.8F);
        this.pillmodel.renderAllExcept(new String[] { "Sphere.001" });
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.7F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        this.pillmodel.renderOnly(new String[] { "Sphere.001" });
        GL11.glDisable(3042);
        GL11.glPopMatrix();
        break;
      case ENTITY:
        GL11.glPushMatrix();
        bindTexture();
        GL11.glScalef(0.5F, 0.5F, 0.5F);
        this.pillmodel.renderAllExcept(new String[] { "Sphere.001" });
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.7F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        this.pillmodel.renderOnly(new String[] { "Sphere.001" });
        GL11.glDisable(3042);
        GL11.glPopMatrix();
        break;
    } 
  }
}

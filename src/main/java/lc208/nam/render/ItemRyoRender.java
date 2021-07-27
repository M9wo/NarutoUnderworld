package lc208.nam.render;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class ItemRyoRender implements IItemRenderer {
  IModelCustom ryomodel = AdvancedModelLoader.loadModel(new ResourceLocation("am:textures/items/money/money.obj"));
  
  ResourceLocation gold = new ResourceLocation("am:textures/items/money/gold.png");
  
  ResourceLocation silver = new ResourceLocation("am:textures/items/money/silver.png");
  
  ResourceLocation copper = new ResourceLocation("am:textures/items/money/copper.png");
  
  private int moneytype;
  
  public ItemRyoRender(int moneytype) {
    this.moneytype = moneytype;
  }
  
  public boolean handleRenderType(ItemStack item, IItemRenderer.ItemRenderType type) {
    return true;
  }
  
  public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType type, ItemStack item, IItemRenderer.ItemRendererHelper helper) {
    return true;
  }
  
  public void bindTexture() {
    switch (this.moneytype) {
      case 1:
        (Minecraft.getMinecraft()).renderEngine.bindTexture(this.gold);
        break;
      case 2:
        (Minecraft.getMinecraft()).renderEngine.bindTexture(this.silver);
        break;
      case 3:
        (Minecraft.getMinecraft()).renderEngine.bindTexture(this.copper);
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
        GL11.glScalef(0.8F, 0.8F, 0.8F);
        GL11.glRotatef(30.0F, 1.0F, 0.0F, 0.0F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        this.ryomodel.renderAll();
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
        GL11.glScalef(3.0F, 3.0F, 3.0F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        this.ryomodel.renderAll();
        GL11.glDisable(3042);
        GL11.glPopMatrix();
        break;
      case INVENTORY:
        GL11.glPushMatrix();
        bindTexture();
        GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(-45.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(-20.0F, 1.0F, 0.0F, 0.0F);
        GL11.glScalef(0.8F, 0.8F, 0.8F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        this.ryomodel.renderAll();
        GL11.glDisable(3042);
        GL11.glPopMatrix();
        break;
      case ENTITY:
        GL11.glPushMatrix();
        bindTexture();
        GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(-45.0F, 0.0F, 0.0F, 1.0F);
        GL11.glScalef(0.5F, 0.5F, 0.5F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        this.ryomodel.renderAll();
        GL11.glDisable(3042);
        GL11.glPopMatrix();
        break;
    } 
  }
}

package alcoholmod.Mathioks.FinalUtilities;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiItemInventory extends GuiContainer {
  private float xSize_lo;
  
  private float ySize_lo;
  
  private static final ResourceLocation iconLocation = new ResourceLocation("JutsuBookmod", "textures/gui/JutsuBook.png");
  
  private final JutsuBook inventory;
  
  public GuiItemInventory(ContainerItem containerItem) {
    super(containerItem);
    this.inventory = containerItem.inventory;
  }
  
  public void drawScreen(int par1, int par2, float par3) {
    super.drawScreen(par1, par2, par3);
    this.xSize_lo = par1;
    this.ySize_lo = par2;
  }
  
  protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    this.mc.getTextureManager().bindTexture(iconLocation);
    int k = (this.width - this.xSize) / 2;
    int l = (this.height - this.ySize) / 2;
    drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
    drawPlayerModel(k + 51, l + 75, 30, (k + 51) - this.xSize_lo, (l + 75 - 50) - this.ySize_lo, (EntityLivingBase)this.mc.thePlayer);
  }
  
  public static void drawPlayerModel(int x, int y, int scale, float yaw, float pitch, EntityLivingBase entity) {
    GL11.glEnable(2903);
    GL11.glPushMatrix();
    GL11.glTranslatef(x, y, 50.0F);
    GL11.glScalef(-scale, scale, scale);
    GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
    float f2 = entity.renderYawOffset;
    float f3 = entity.rotationYaw;
    float f4 = entity.rotationPitch;
    float f5 = entity.prevRotationYawHead;
    float f6 = entity.rotationYawHead;
    GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
    RenderHelper.enableStandardItemLighting();
    GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(-((float)Math.atan((pitch / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
    entity.renderYawOffset = (float)Math.atan((yaw / 40.0F)) * 20.0F;
    entity.rotationYaw = (float)Math.atan((yaw / 40.0F)) * 40.0F;
    entity.rotationPitch = -((float)Math.atan((pitch / 40.0F))) * 20.0F;
    entity.rotationYawHead = entity.rotationYaw;
    entity.prevRotationYawHead = entity.rotationYaw;
    GL11.glTranslatef(0.0F, entity.yOffset, 0.0F);
    RenderManager.instance.playerViewY = 180.0F;
    RenderManager.instance.renderEntityWithPosYaw((Entity)entity, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
    entity.renderYawOffset = f2;
    entity.rotationYaw = f3;
    entity.rotationPitch = f4;
    entity.prevRotationYawHead = f5;
    entity.rotationYawHead = f6;
    GL11.glPopMatrix();
    RenderHelper.disableStandardItemLighting();
    GL11.glDisable(32826);
    OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
    GL11.glDisable(3553);
    OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
  }
}

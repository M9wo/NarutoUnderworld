package alcoholmod.Mathioks.DimensionKamui;

import cpw.mods.fml.relauncher.ReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraftforge.client.IRenderHandler;
import org.lwjgl.opengl.GL11;

public class SkyRenderer extends IRenderHandler {
  private int starGLCallList;
  
  private int glSkyList;
  
  private int glSkyList2;
  
  public SkyRenderer() {
    RenderGlobal renderGlobal = (Minecraft.getMinecraft()).renderGlobal;
    this.glSkyList2 = (this.glSkyList = (this.starGLCallList = ((Integer)ReflectionHelper.getPrivateValue(RenderGlobal.class, renderGlobal, new String[] { "starGLCallList" })).intValue()) + 1) + 1;
  }
  
  @SideOnly(Side.CLIENT)
  public void render(float partialTicks, WorldClient world, Minecraft mc) {
    GL11.glDisable(3553);
    Vec3 vec3 = world.getSkyColor((Entity)mc.renderViewEntity, partialTicks);
    float f1 = (float)vec3.xCoord;
    float f2 = (float)vec3.yCoord;
    float f3 = (float)vec3.zCoord;
    if (mc.gameSettings.anaglyph) {
      float f5 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
      float f6 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
      float f11 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
      f1 = f5;
      f2 = f6;
      f3 = f11;
    } 
    GL11.glColor3f(f1, f2, f3);
    Tessellator tessellator1 = Tessellator.instance;
    GL11.glDepthMask(false);
    GL11.glEnable(2912);
    GL11.glColor3f(f1, f2, f3);
    GL11.glCallList(this.glSkyList);
    GL11.glDisable(2912);
    GL11.glDisable(3008);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    RenderHelper.disableStandardItemLighting();
    float[] afloat = world.provider.calcSunriseSunsetColors(world.getCelestialAngle(partialTicks), partialTicks);
    if (afloat != null) {
      GL11.glDisable(3553);
      GL11.glShadeModel(7425);
      GL11.glPushMatrix();
      GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef((MathHelper.sin(world.getCelestialAngleRadians(partialTicks)) < 0.0F) ? 180.0F : 0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
      float f5 = afloat[0];
      float f6 = afloat[1];
      float f11 = afloat[2];
      if (mc.gameSettings.anaglyph) {
        float f14 = (f5 * 30.0F + f6 * 59.0F + f11 * 11.0F) / 100.0F;
        float f15 = (f5 * 30.0F + f6 * 70.0F) / 100.0F;
        float f19 = (f5 * 30.0F + f11 * 70.0F) / 100.0F;
        f5 = f14;
        f6 = f15;
        f11 = f19;
      } 
      tessellator1.startDrawing(6);
      tessellator1.setColorRGBA_F(f5, f6, f11, afloat[3]);
      tessellator1.addVertex(0.0D, 100.0D, 0.0D);
      byte b0 = 16;
      tessellator1.setColorRGBA_F(afloat[0], afloat[1], afloat[2], 0.0F);
      for (int i = 0; i <= b0; i++) {
        float f19 = i * 3.1415927F * 2.0F / b0;
        float f14 = MathHelper.sin(f19);
        float f15 = MathHelper.cos(f19);
        tessellator1.addVertex((f14 * 120.0F), (f15 * 120.0F), (-f15 * 40.0F * afloat[3]));
      } 
      tessellator1.draw();
      GL11.glPopMatrix();
      GL11.glShadeModel(7424);
    } 
    GL11.glEnable(3553);
    GL11.glBlendFunc(770, 1);
    GL11.glPushMatrix();
    float f4 = 1.0F - world.getRainStrength(partialTicks);
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    GL11.glColor4f(1.0F, 1.0F, 1.0F, f4);
    GL11.glTranslatef(f7, f8, f9);
    GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(world.getCelestialAngle(partialTicks) * 360.0F, 1.0F, 0.0F, 0.0F);
    float f10 = 20.0F;
    mc.renderEngine.bindTexture(new ResourceLocation("tm:textures/enviroment/sun.png"));
    tessellator1.startDrawingQuads();
    tessellator1.addVertexWithUV(-f10, 100.0D, -f10, 0.0D, 0.0D);
    tessellator1.addVertexWithUV(f10, 100.0D, -f10, 1.0D, 0.0D);
    tessellator1.addVertexWithUV(f10, 100.0D, f10, 1.0D, 1.0D);
    tessellator1.addVertexWithUV(-f10, 100.0D, f10, 0.0D, 1.0D);
    tessellator1.draw();
    f10 = 15.0F;
    mc.renderEngine.bindTexture(new ResourceLocation("tm:textures/enviroment/moon_phases.png"));
    int k = world.getMoonPhase();
    int l = k % 4;
    int j = k / 4 % 2;
    float f12 = (l + 0) / 4.0F;
    float f13 = (j + 0) / 2.0F;
    float f16 = (l + 1) / 4.0F;
    float f17 = (j + 1) / 2.0F;
    tessellator1.startDrawingQuads();
    tessellator1.addVertexWithUV(-f10, -100.0D, f10, f16, f17);
    tessellator1.addVertexWithUV(f10, -100.0D, f10, f12, f17);
    tessellator1.addVertexWithUV(f10, -100.0D, -f10, f12, f13);
    tessellator1.addVertexWithUV(-f10, -100.0D, -f10, f16, f13);
    tessellator1.draw();
    GL11.glDisable(3553);
    float f18 = world.getStarBrightness(partialTicks) * f4;
    if (f18 > 0.0F) {
      GL11.glColor4f(f18, f18, f18, f18);
      GL11.glCallList(this.starGLCallList);
    } 
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glDisable(3042);
    GL11.glEnable(3008);
    GL11.glEnable(2912);
    GL11.glPopMatrix();
    GL11.glDisable(3553);
    GL11.glColor3f(0.0F, 0.0F, 0.0F);
    double d0 = (mc.thePlayer.getPosition(partialTicks)).yCoord - world.getHorizon();
    if (d0 < 0.0D) {
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 12.0F, 0.0F);
      GL11.glCallList(this.glSkyList2);
      GL11.glPopMatrix();
      f8 = 1.0F;
      f9 = -((float)(d0 + 65.0D));
      f10 = -f8;
      tessellator1.startDrawingQuads();
      tessellator1.setColorRGBA_I(0, 255);
      tessellator1.addVertex(-f8, f9, f8);
      tessellator1.addVertex(f8, f9, f8);
      tessellator1.addVertex(f8, f10, f8);
      tessellator1.addVertex(-f8, f10, f8);
      tessellator1.addVertex(-f8, f10, -f8);
      tessellator1.addVertex(f8, f10, -f8);
      tessellator1.addVertex(f8, f9, -f8);
      tessellator1.addVertex(-f8, f9, -f8);
      tessellator1.addVertex(f8, f10, -f8);
      tessellator1.addVertex(f8, f10, f8);
      tessellator1.addVertex(f8, f9, f8);
      tessellator1.addVertex(f8, f9, -f8);
      tessellator1.addVertex(-f8, f9, -f8);
      tessellator1.addVertex(-f8, f9, f8);
      tessellator1.addVertex(-f8, f10, f8);
      tessellator1.addVertex(-f8, f10, -f8);
      tessellator1.addVertex(-f8, f10, -f8);
      tessellator1.addVertex(-f8, f10, f8);
      tessellator1.addVertex(f8, f10, f8);
      tessellator1.addVertex(f8, f10, -f8);
      tessellator1.draw();
    } 
    if (world.provider.isSkyColored()) {
      GL11.glColor3f(0.24000001F, f2 * 0.2F + 0.04F, f3 * 0.6F + 0.1F);
    } else {
      GL11.glColor3f(f1, f2, f3);
    } 
    GL11.glPushMatrix();
    GL11.glTranslatef(0.0F, -((float)(d0 - 16.0D)), 0.0F);
    GL11.glCallList(this.glSkyList2);
    GL11.glPopMatrix();
    GL11.glEnable(3553);
    GL11.glDepthMask(true);
  }
}

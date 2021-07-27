package alcoholmod.Mathioks.TransformationsRealPackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class ByakuganTrack extends EntityFX {
  public static Queue queuedRenders = new ArrayDeque();
  
  public static Queue queuedDepthIgnoringRenders = new ArrayDeque();
  
  float f;
  
  float f1;
  
  float f2;
  
  float f3;
  
  float f4;
  
  float f5;
  
  boolean depthTest = false;
  
  public ByakuganTrack(World parWorld, double parX, double parY, double parZ, double parMotionX, double parMotionY, double parMotionZ, float red, float green, float blue) {
    super(parWorld, parX, parY, parZ, parMotionX, parMotionY, parMotionZ);
    float f = this.rand.nextFloat() * 0.1F + 0.2F;
    this.particleRed = red;
    this.particleGreen = green;
    this.particleBlue = blue;
    setSize(0.02F, 0.02F);
    this.particleScale *= this.rand.nextFloat() * 0.8F + 0.5F;
    this.motionX *= 0.01999999955296516D;
    this.motionY *= 0.01999999955296516D;
    this.motionZ *= 0.01999999955296516D;
    this.particleMaxAge = (int)(20.0D / (Math.random() * 0.8D + 0.2D));
    this.noClip = true;
  }
  
  public static void dispatchQueuedRenders(Tessellator tessellator) {
    (Minecraft.getMinecraft()).renderEngine.bindTexture(new ResourceLocation("tm:textures/entity/Byakugan.png"));
    if (!queuedRenders.isEmpty()) {
      tessellator.startDrawingQuads();
      Iterator<ByakuganTrack> var1 = queuedRenders.iterator();
      while (var1.hasNext()) {
        ByakuganTrack wisp = var1.next();
        wisp.renderQueued(tessellator, true);
      } 
      tessellator.draw();
    } 
    if (!queuedDepthIgnoringRenders.isEmpty()) {
      GL11.glDisable(2929);
      tessellator.startDrawingQuads();
      Iterator<ByakuganTrack> var1 = queuedDepthIgnoringRenders.iterator();
      while (var1.hasNext()) {
        ByakuganTrack wisp = var1.next();
        wisp.renderQueued(tessellator, false);
      } 
      tessellator.draw();
      GL11.glEnable(2929);
    } 
    queuedRenders.clear();
    queuedDepthIgnoringRenders.clear();
  }
  
  private void renderQueued(Tessellator tessellator, boolean depthEnabled) {
    float f10 = 0.5F * this.particleScale;
    float f11 = (float)(this.prevPosX + (this.posX - this.prevPosX) * this.f - EntityFX.interpPosX);
    float f12 = (float)(this.prevPosY + (this.posY - this.prevPosY) * this.f - EntityFX.interpPosY);
    float f13 = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * this.f - EntityFX.interpPosZ);
    tessellator.setColorRGBA_F(this.particleRed, this.particleGreen, this.particleBlue, 0.5F);
    tessellator.addVertexWithUV((f11 - this.f1 * f10 - this.f4 * f10), (f12 - this.f2 * f10), (f13 - this.f3 * f10 - this.f5 * f10), 0.0D, 1.0D);
    tessellator.addVertexWithUV((f11 - this.f1 * f10 + this.f4 * f10), (f12 + this.f2 * f10), (f13 - this.f3 * f10 + this.f5 * f10), 1.0D, 1.0D);
    tessellator.addVertexWithUV((f11 + this.f1 * f10 + this.f4 * f10), (f12 + this.f2 * f10), (f13 + this.f3 * f10 + this.f5 * f10), 1.0D, 0.0D);
    tessellator.addVertexWithUV((f11 + this.f1 * f10 - this.f4 * f10), (f12 - this.f2 * f10), (f13 + this.f3 * f10 - this.f5 * f10), 0.0D, 0.0D);
  }
  
  public void renderParticle(Tessellator tessellator, float f, float f1, float f2, float f3, float f4, float f5) {
    this.f = f;
    this.f1 = f1;
    this.f2 = f2;
    this.f3 = f3;
    this.f4 = f4;
    this.f5 = f5;
    if (this.depthTest) {
      queuedRenders.add(this);
    } else {
      queuedDepthIgnoringRenders.add(this);
    } 
  }
  
  public void onUpdate() {
    this.prevPosX = this.posX;
    this.prevPosY = this.posY;
    this.prevPosZ = this.posZ;
    moveEntity(this.motionX, this.motionY, this.motionZ);
    this.motionX *= 0.99D;
    this.motionY *= 0.99D;
    this.motionZ *= 0.99D;
    if (this.particleMaxAge-- <= 0)
      setDead(); 
  }
}

package alcoholmod.Mathioks.ChangeHeight;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.EntityRenderer;

public class EntityRendererAlt extends EntityRenderer {
  private final Minecraft mc;
  
  private float offsetY = 30.0F;
  
  public EntityRendererAlt(Minecraft mc) {
    super(mc, mc.getResourceManager());
    this.mc = mc;
  }
  
  public void updateCameraAndRender(float partialTick) {
    if (this.mc.thePlayer != null && !this.mc.thePlayer.isPlayerSleeping()) {
      EntityClientPlayerMP var10000 = this.mc.thePlayer;
      var10000.yOffset -= this.offsetY;
      super.updateCameraAndRender(partialTick);
      this.mc.thePlayer.yOffset = 1.62F;
    } else {
      super.updateCameraAndRender(partialTick);
    } 
  }
  
  public void getMouseOver(float partialTick) {
    if (this.mc.thePlayer != null && !this.mc.thePlayer.isPlayerSleeping()) {
      EntityClientPlayerMP var10000 = this.mc.thePlayer;
      var10000.posY += this.offsetY;
      var10000 = this.mc.thePlayer;
      var10000.prevPosY += this.offsetY;
      var10000 = this.mc.thePlayer;
      var10000.lastTickPosY += this.offsetY;
      super.getMouseOver(partialTick);
      var10000 = this.mc.thePlayer;
      var10000.posY -= this.offsetY;
      var10000 = this.mc.thePlayer;
      var10000.prevPosY -= this.offsetY;
      var10000 = this.mc.thePlayer;
      var10000.lastTickPosY -= this.offsetY;
    } else {
      super.getMouseOver(partialTick);
    } 
  }
}

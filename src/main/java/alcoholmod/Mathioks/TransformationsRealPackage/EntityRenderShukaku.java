package alcoholmod.Mathioks.TransformationsRealPackage;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.entity.Entity;

public class EntityRenderShukaku extends EntityRenderer {
  private final Minecraft mc;
  
  private float offsetY = 5.0F;
  
  private Entity pointedEntity;
  
  public EntityRenderShukaku(Minecraft mc) {
    super(mc, mc.getResourceManager());
    this.mc = mc;
  }
  
  public EntityRenderShukaku(Minecraft mc, float offset) {
    super(mc, mc.getResourceManager());
    this.mc = mc;
    this.offsetY = offset;
  }
  
  public void updateCameraAndRender(float partialTick) {
    if (this.mc.thePlayer != null && !this.mc.thePlayer.isPlayerSleeping()) {
      if ((!this.mc.thePlayer.isSneaking() && !this.mc.thePlayer.isSprinting()) || this.offsetY != 5.0F) {
        EntityClientPlayerMP var10000 = this.mc.thePlayer;
        var10000.yOffset -= this.offsetY;
        var10000 = this.mc.thePlayer;
        var10000.eyeHeight += this.offsetY;
      } 
      super.updateCameraAndRender(partialTick);
      this.mc.thePlayer.yOffset = 1.62F;
      this.mc.thePlayer.eyeHeight = this.mc.thePlayer.getDefaultEyeHeight();
    } else {
      super.updateCameraAndRender(partialTick);
    } 
  }
  
  public void getMouseOver(float partialTicks) {
    if (this.mc.thePlayer != null && !this.mc.thePlayer.isPlayerSleeping()) {
      if ((!this.mc.thePlayer.isSneaking() && !this.mc.thePlayer.isSprinting()) || this.offsetY != 5.0F) {
        EntityClientPlayerMP var10000 = this.mc.thePlayer;
        var10000.posY += this.offsetY;
        var10000 = this.mc.thePlayer;
        var10000.prevPosY += this.offsetY;
        var10000 = this.mc.thePlayer;
        var10000.lastTickPosY += this.offsetY;
      } 
      super.getMouseOver(partialTicks);
      if ((!this.mc.thePlayer.isSneaking() && !this.mc.thePlayer.isSprinting()) || this.offsetY != 5.0F) {
        EntityClientPlayerMP var10000 = this.mc.thePlayer;
        var10000.posY -= this.offsetY;
        var10000 = this.mc.thePlayer;
        var10000.prevPosY -= this.offsetY;
        var10000 = this.mc.thePlayer;
        var10000.lastTickPosY -= this.offsetY;
      } 
    } else {
      super.getMouseOver(partialTicks);
    } 
  }
}

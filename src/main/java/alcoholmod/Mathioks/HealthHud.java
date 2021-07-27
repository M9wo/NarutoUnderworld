package alcoholmod.Mathioks;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ForgeHooks;

public class HealthHud extends Gui {
  private Minecraft mc = Minecraft.getMinecraft();
  
  protected final Random rand = new Random();
  
  public HealthHud(Minecraft mc) {}
  
  private void bind(ResourceLocation res) {
    this.mc.getTextureManager().bindTexture(res);
  }
  
  @SubscribeEvent
  public void modifyAirHUD(RenderGameOverlayEvent.Pre event) {
    if (event != null && 
      event.type != null && 
      event.type.equals(RenderGameOverlayEvent.ElementType.AIR)) {
      event.setCanceled(true);
      this.mc.mcProfiler.startSection("air");
      ScaledResolution res = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
      int width = res.getScaledWidth();
      int height = res.getScaledHeight();
      int left = width / 2 + 91;
      int top = height - 49;
      if (this.mc.thePlayer.isInsideOfMaterial(Material.water)) {
        int level = ForgeHooks.getTotalArmorValue((EntityPlayer)this.mc.thePlayer);
        if (level > 0)
          top -= 9; 
        int air = this.mc.thePlayer.getAir();
        int full = MathHelper.ceiling_double_int((air - 2) * 10.0D / 300.0D);
        int partial = MathHelper.ceiling_double_int(air * 10.0D / 300.0D) - full;
        for (int i = 0; i < full + partial; i++)
          drawTexturedModalRect(left - i * 8 - 9, top, (i < full) ? 16 : 25, 18, 9, 9); 
      } 
      this.mc.mcProfiler.endSection();
    } 
  }
  
  @SubscribeEvent
  public void modifyArmorHUD(RenderGameOverlayEvent.Pre event) {
    if (event == null || 
      event.type == null || 
      event.type.equals(RenderGameOverlayEvent.ElementType.ARMOR));
  }
  
  @SubscribeEvent
  public void modifyHealthHUD(RenderGameOverlayEvent.Pre evt) {
    if (evt != null && 
      evt.type != null && 
      evt.type.equals(RenderGameOverlayEvent.ElementType.HEALTH))
      evt.setCanceled(true); 
  }
}

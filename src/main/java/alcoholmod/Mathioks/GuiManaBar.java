package alcoholmod.Mathioks;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiManaBar extends Gui {
  private Minecraft mc;
  
  public static final ResourceLocation Empty = new ResourceLocation("tm:textures/GUI/Chakra_bar.png");
  
  public static final ResourceLocation Empty2 = new ResourceLocation("tm:textures/GUI/Chakra_bar3.png");
  
  public GuiManaBar(Minecraft mc) {
    this.mc = mc;
  }
  
  @SubscribeEvent(priority = EventPriority.NORMAL)
  public void onRenderExperienceBar(RenderGameOverlayEvent event) {
    if (!event.isCancelable() && event.type == RenderGameOverlayEvent.ElementType.EXPERIENCE) {
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer);
      if (props != null && props.getMaxMana() != 0) {
        int xPos = 2;
        int yPos = 234;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        this.mc.getTextureManager().bindTexture(Empty);
        int var10000 = (int)(props.getCurrentMana() * (200 / props.getMaxMana()));
        int manabarwidth = props.getCurrentMana() / 30;
        double current = props.getCurrentMana();
        double max = props.getMaxMana();
        int barwidth = (int)(110.0D * current / max);
        int manabarwidth2 = (int)props.getCurrentMana();
        drawTexturedModalRect(xPos, yPos, 0, 0, barwidth + 5, 4);
        drawTexturedModalRect(xPos + 4, yPos + 1, 4, 4, barwidth, 5);
        this.mc.fontRenderer.drawStringWithShadow(manabarwidth2 + "/" + props.getMaxMana(), xPos + 15, yPos - 8, 3655397);
        if (props != null && props.getMaxSenjutsu() != 0) {
          int xPos2 = 340;
          int yPos2 = 234;
          GL11.glColor4f(100.0F, 100.0F, 100.0F, 1.0F);
          this.mc.getTextureManager().bindTexture(Empty2);
          var10000 = (int)(props.getCurrentSenjutsu() * (200 / props.getMaxSenjutsu()));
          int manabarwidthSen = props.getCurrentSenjutsu() / 30;
          double currentSen = props.getCurrentSenjutsu();
          double maxSen = props.getMaxSenjutsu();
          int barwidthSen = (int)(110.0D * currentSen / maxSen);
          int senjutsubarwidth = props.getCurrentSenjutsu() / 30;
          int senjutsubarwidth2 = (int)props.getCurrentSenjutsu();
          drawTexturedModalRect(xPos2, yPos2, 0, 0, barwidthSen + 5, 4);
          drawTexturedModalRect(xPos2 + 4, yPos2 + 1, 4, 4, barwidthSen, 5);
          this.mc.fontRenderer.drawStringWithShadow(senjutsubarwidth2 + "/" + props.getMaxSenjutsu(), xPos2 + 15, yPos2 - 8, 3911249);
        } 
      } 
    } 
  }
}

package lc208.nam.hooks;

import alcoholmod.Mathioks.ExtendedPlayer;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import flash.stardustmod.client.gui.GuiParty;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import lc208.nam.hooklib.asm.Hook;
import lc208.nam.hooklib.asm.ReturnCondition;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.blockartistry.mod.DynSurround.ModOptions;
import org.blockartistry.mod.DynSurround.client.hud.PotionHUD;
import org.lwjgl.opengl.GL11;

public class HooksGui extends GuiScreen {
  private static final ResourceLocation TEXTURE = new ResourceLocation("textures/gui/container/inventory.png");
  
  @SideOnly(Side.CLIENT)
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static void doRender(PotionHUD hud, RenderGameOverlayEvent event) {
    if (!event.isCancelable() && event.type == RenderGameOverlayEvent.ElementType.EXPERIENCE) {
      float GUITOP = ModOptions.potionHudTopOffset;
      float GUILEFT = ModOptions.potionHudLeftOffset;
      float SCALE = ModOptions.potionHudScale;
      Minecraft mc = Minecraft.getMinecraft();
      FontRenderer font = mc.fontRenderer;
      EntityClientPlayerMP entityClientPlayerMP = (Minecraft.getMinecraft()).thePlayer;
      int guiLeft = 23;
      int guiTop = 95;
      Collection<PotionEffect> collection = entityClientPlayerMP.getActivePotionEffects();
      if (!collection.isEmpty()) {
        GL11.glPushMatrix();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 255.0F);
        GL11.glDisable(2896);
        GL11.glTranslatef(GUILEFT, GUITOP, 0.0F);
        GL11.glScalef(SCALE, SCALE, SCALE);
        int k = 33;
        if (collection.size() > 7)
          k = 198 / (collection.size() - 1); 
        for (Iterator<PotionEffect> iterator = collection.iterator(); iterator.hasNext(); guiTop += k) {
          PotionEffect potioneffect = iterator.next();
          Potion potion = Potion.potionTypes[potioneffect.getPotionID()];
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 255.0F);
          mc.getTextureManager().bindTexture(TEXTURE);
          hud.drawTexturedModalRect(guiLeft, guiTop, 0, 166, 140, 32);
          if (potion.hasStatusIcon()) {
            int l = potion.getStatusIconIndex();
            hud.drawTexturedModalRect(guiLeft + 6, guiTop + 7, 0 + l % 8 * 18, 198 + l / 8 * 18, 18, 18);
          } 
          try {
            potion.renderInventoryEffect(guiLeft, guiTop, potioneffect, mc);
          } catch (Exception exception) {}
          if (potion.shouldRenderInvText(potioneffect)) {
            String s1 = I18n.format(potion.getName(), new Object[0]);
            if (potioneffect.getAmplifier() == 1) {
              s1 = s1 + " " + I18n.format("enchantment.level.2", new Object[0]);
            } else if (potioneffect.getAmplifier() == 2) {
              s1 = s1 + " " + I18n.format("enchantment.level.3", new Object[0]);
            } else if (potioneffect.getAmplifier() == 3) {
              s1 = s1 + " " + I18n.format("enchantment.level.4", new Object[0]);
            } 
            font.drawStringWithShadow(s1, guiLeft + 10 + 18, guiTop + 6, -1);
            String s = Potion.getDurationString(potioneffect);
            font.drawStringWithShadow(s, guiLeft + 10 + 18, guiTop + 6 + 10, -1);
          } 
        } 
        GL11.glPopMatrix();
      } 
    } 
  }
  
  private static final Minecraft mc = Minecraft.getMinecraft();
  
  static HooksGui h = new HooksGui();
  
  private static final ResourceLocation textures = new ResourceLocation("stardust:textures/gui/party.png");
  
  private static final int bar_width = 200;
  
  private static final int bar_height = 16;
  
  private static final ResourceLocation background = new ResourceLocation("stardust:textures/gui/bijuu/bg.png");
  
  private static ResourceLocation kurama = new ResourceLocation("stardust:textures/gui/bijuu/kurama.png");
  
  private static final ResourceLocation gyuki = new ResourceLocation("stardust:textures/gui/bijuu/gyuki.png");
  
  private static final ResourceLocation chomei = new ResourceLocation("stardust:textures/gui/bijuu/chomei.png");
  
  private static final ResourceLocation saiken = new ResourceLocation("stardust:textures/gui/bijuu/saiken.png");
  
  private static final ResourceLocation kokuo = new ResourceLocation("stardust:textures/gui/bijuu/kokuo.png");
  
  private static final ResourceLocation songoku = new ResourceLocation("stardust:textures/gui/bijuu/songoku.png");
  
  private static final ResourceLocation isobu = new ResourceLocation("stardust:textures/gui/bijuu/isobu.png");
  
  private static final ResourceLocation matatabi = new ResourceLocation("stardust:textures/gui/bijuu/matatabi.png");
  
  private static final ResourceLocation shukaku = new ResourceLocation("stardust:textures/gui/bijuu/shukaku.png");
  
  @SideOnly(Side.CLIENT)
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static void onRenderExperienceBar(GuiParty gui, RenderGameOverlayEvent event) {
    if (!event.isCancelable() && event.type == RenderGameOverlayEvent.ElementType.EXPERIENCE) {
      kurama = new ResourceLocation("stardust:textures/gui/bijuu/kurama.png");
      EntityClientPlayerMP entityClientPlayerMP = mc.thePlayer;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityClientPlayerMP);
      ExtendedPlayer propsMa = ExtendedPlayer.get((EntityPlayer)entityClientPlayerMP);
      int xPos = 12;
      int yPos = 12;
      GL11.glPushMatrix();
      GL11.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glScalef(0.41F, 0.41F, 1.0F);
      GL11.glTranslatef(xPos, yPos, 1.0F);
      mc.renderEngine.bindTexture(textures);
      mc.ingameGUI.drawTexturedModalRect(0, 0, 0, 0, 256, 108);
      mc.ingameGUI.drawTexturedModalRect(256, 8, 0, 108, 40, 100);
      float oneUnitHealth = 200.0F / mc.thePlayer.getMaxHealth();
      int currentWidthHealth = (int)(oneUnitHealth * mc.thePlayer.getHealth());
      if (currentWidthHealth > 200)
        currentWidthHealth = 200; 
      float oneUnitChakra = 200.0F / propsMa.getMaxMana();
      int currentWidthChakra = (int)(oneUnitChakra * propsMa.getCurrentMana());
      if (currentWidthChakra > 200)
        currentWidthChakra = 200; 
      float oneUnitSen = 200.0F / propsMa.getMaxSenjutsu();
      int currentWidthSen = (int)(oneUnitSen * propsMa.getCurrentSenjutsu());
      if (currentWidthSen > 200)
        currentWidthSen = 200; 
      float oneUnitExp = 212.0F / (propsMa.getLevel() / 4 + 1);
      int currentWidthExp = (int)(oneUnitExp * propsMa.getChakraExperience());
      if (currentWidthExp > 212)
        currentWidthExp = 212; 
      mc.ingameGUI.drawTexturedModalRect(89, 15, 40, 128, currentWidthHealth, 16);
      mc.ingameGUI.drawTexturedModalRect(89, 37, 40, 144, currentWidthChakra, 16);
      mc.ingameGUI.drawTexturedModalRect(89, 59, 40, 160, currentWidthSen, 16);
      mc.ingameGUI.drawTexturedModalRect(22, 82, 40, 108, currentWidthExp, 20);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(0.72F, 0.36F, 1.0F);
      GL11.glTranslatef(16.0F, 31.0F, 12.0F);
      AbstractClientPlayer abstractClientPlayer = (AbstractClientPlayer)entityClientPlayerMP;
      ResourceLocation skin = abstractClientPlayer.getLocationSkin();
      if (entityClientPlayerMP.getGameProfile() != null) {
        Map map = mc.func_152342_ad().func_152788_a(mc.thePlayer.getGameProfile());
        if (map.containsKey(MinecraftProfileTexture.Type.SKIN))
          skin = mc.func_152342_ad().func_152792_a((MinecraftProfileTexture)map.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN); 
      } 
      mc.renderEngine.bindTexture(skin);
      mc.ingameGUI.drawTexturedModalRect(0, 0, 32, 64, 32, 64);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      if (propsMa.getBijuuKind() > 0) {
        mc.renderEngine.bindTexture(background);
        mc.ingameGUI.drawTexturedModalRect(130, 8, 0, 0, 24, 24);
        GL11.glTranslatef(132.0F, 10.0F, 1.0F);
        GL11.glScalef(0.078F, 0.078F, 1.0F);
        if (propsMa.getBijuuKind() == 1) {
          mc.renderEngine.bindTexture(shukaku);
        } else if (propsMa.getBijuuKind() == 2) {
          mc.renderEngine.bindTexture(matatabi);
        } else if (propsMa.getBijuuKind() == 3) {
          mc.renderEngine.bindTexture(isobu);
        } else if (propsMa.getBijuuKind() == 4) {
          mc.renderEngine.bindTexture(songoku);
        } else if (propsMa.getBijuuKind() == 5) {
          mc.renderEngine.bindTexture(kokuo);
        } else if (propsMa.getBijuuKind() == 6) {
          mc.renderEngine.bindTexture(saiken);
        } else if (propsMa.getBijuuKind() == 7) {
          mc.renderEngine.bindTexture(chomei);
        } else if (propsMa.getBijuuKind() == 8) {
          mc.renderEngine.bindTexture(gyuki);
        } else if (propsMa.getBijuuKind() == 9) {
          mc.renderEngine.bindTexture(kurama);
        } 
        mc.ingameGUI.drawTexturedModalRect(0, 0, 0, 0, 256, 256);
      } 
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glScalef(0.7F, 0.7F, 1.0F);
      String health = "" + EnumChatFormatting.WHITE + mc.thePlayer.getHealth() + "/" + mc.thePlayer.getMaxHealth();
      String currSize = "" + EnumChatFormatting.WHITE + propsMa.getCurrentMana() + "/" + propsMa.getMaxMana();
      String size = "" + EnumChatFormatting.WHITE + propsMa.getCurrentSenjutsu() + "/" + propsMa.getMaxSenjutsu();
      String exp = "" + EnumChatFormatting.WHITE + EnumChatFormatting.BOLD + propsMa.getChakraExperience() + "/" + (propsMa.getLevel() / 4 + 1);
      String lvl = "" + EnumChatFormatting.WHITE + EnumChatFormatting.BOLD + propsMa.getLevel();
      mc.ingameGUI.drawString(mc.fontRenderer, health, 120 - mc.fontRenderer.getStringWidth(health) / 2, 16, 16777215);
      mc.ingameGUI.drawString(mc.fontRenderer, currSize, 120 - mc.fontRenderer.getStringWidth(currSize) / 2, 29, 16777215);
      mc.ingameGUI.drawString(mc.fontRenderer, size, 120 - mc.fontRenderer.getStringWidth(size) / 2, 41, 16777215);
      mc.ingameGUI.drawString(mc.fontRenderer, exp, 85 - mc.fontRenderer.getStringWidth(exp) / 2, 57, 16777215);
      mc.ingameGUI.drawString(mc.fontRenderer, lvl, 155 - mc.fontRenderer.getStringWidth(lvl) / 2, 57, 16777215);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      int currS = propsMa.getBijuuScale() - 1;
      if (currS > 4) {
        currSize = "4";
      } else {
        currSize = "" + currS;
      } 
      size = currSize + "/" + (int)propsMa.getSize();
      if (propsMa.getBijuuKind() > 0)
        mc.ingameGUI.drawString(mc.fontRenderer, size, 140, 28, 16777215); 
      GL11.glPopMatrix();
    } 
  }
}

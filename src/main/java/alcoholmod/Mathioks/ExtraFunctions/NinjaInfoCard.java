package alcoholmod.Mathioks.ExtraFunctions;

import alcoholmod.Mathioks.ExtendedPlayer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class NinjaInfoCard extends GuiScreen {
  int guiWidth = 256;
  
  int guiHeight = 190;
  
  int guiHeight2 = 33;
  
  int tabWidth = 14;
  
  int tabHeight = 14;
  
  int iconWidth = 16;
  
  int iconHeight = 16;
  
  int landWidth = 45;
  
  int guiX;
  
  int guiY;
  
  private boolean missions;
  
  public String Player;
  
  public int Affiliation;
  
  public int Land;
  
  public int Clan;
  
  GuiButton testButton;
  
  private ResourceLocation Empty;
  
  private ResourceLocation texture;
  
  private ResourceLocation texture2;
  
  private ResourceLocation PowerUp;
  
  private ResourceLocation Flip;
  
  private ResourceLocation Top;
  
  private ResourceLocation windrelease;
  
  private ResourceLocation firerelease;
  
  private ResourceLocation waterrelease;
  
  private ResourceLocation lightningrelease;
  
  private ResourceLocation earthrelease;
  
  private ResourceLocation yinrelease;
  
  private ResourceLocation yangrelease;
  
  private ResourceLocation yinyanrelease;
  
  private ResourceLocation boilrelease;
  
  private ResourceLocation woodrelease;
  
  private ResourceLocation scorchrelease;
  
  private ResourceLocation icerelease;
  
  private ResourceLocation steelrelease;
  
  private ResourceLocation crystalrelease;
  
  private ResourceLocation lavarelease;
  
  private ResourceLocation explosionrelease;
  
  private ResourceLocation magnetrelease;
  
  private ResourceLocation stormrelease;
  
  private ResourceLocation dustrelease;
  
  private ResourceLocation shikotsumyaku;
  
  private ResourceLocation byakugan;
  
  private ResourceLocation tenseigan;
  
  private ResourceLocation sharinganinfo;
  
  private ResourceLocation mangekyousharingan;
  
  private ResourceLocation rinnegan;
  
  private ResourceLocation ketsuryugan;
  
  private ResourceLocation uchiha;
  
  private ResourceLocation uzumaki;
  
  private ResourceLocation aburame;
  
  private ResourceLocation akimichi;
  
  private ResourceLocation hatake;
  
  private ResourceLocation hozuki;
  
  private ResourceLocation hyuga;
  
  private ResourceLocation iburi;
  
  private ResourceLocation inuzuka;
  
  private ResourceLocation jugo;
  
  private ResourceLocation kaguya;
  
  private ResourceLocation kurama;
  
  private ResourceLocation tsuchigumo;
  
  private ResourceLocation nara;
  
  private ResourceLocation otsutsuki;
  
  private ResourceLocation hagoromo;
  
  private ResourceLocation sarutobi;
  
  private ResourceLocation fuma;
  
  private ResourceLocation senju;
  
  private ResourceLocation yuki;
  
  private ResourceLocation yamanaka;
  
  private ResourceLocation lee;
  
  private ResourceLocation chinoike;
  
  private ResourceLocation shirogane;
  
  private ResourceLocation akatsuki;
  
  private ResourceLocation ame;
  
  private ResourceLocation getsu;
  
  private ResourceLocation hoshi;
  
  private ResourceLocation ishi;
  
  private ResourceLocation iwa;
  
  private ResourceLocation jomae;
  
  private ResourceLocation kiri;
  
  private ResourceLocation konoha;
  
  private ResourceLocation kumo;
  
  private ResourceLocation kusa;
  
  private ResourceLocation nadeshiko;
  
  private ResourceLocation oto;
  
  private ResourceLocation ryuchi;
  
  private ResourceLocation shimos;
  
  private ResourceLocation suna;
  
  private ResourceLocation taki;
  
  private ResourceLocation takumi;
  
  private ResourceLocation tani;
  
  private ResourceLocation toad;
  
  private ResourceLocation yuga;
  
  private ResourceLocation yukigakure;
  
  private ResourceLocation yume;
  
  private ResourceLocation shikotsu;
  
  private ResourceLocation earth;
  
  private ResourceLocation fire;
  
  private ResourceLocation iron;
  
  private ResourceLocation lightning;
  
  private ResourceLocation sky;
  
  private ResourceLocation snow;
  
  private ResourceLocation sound;
  
  private ResourceLocation water;
  
  private ResourceLocation wind;
  
  private ResourceLocation D;
  
  private ResourceLocation B;
  
  private ResourceLocation C;
  
  private ResourceLocation A;
  
  private ResourceLocation S;
  
  private ResourceLocation SS;
  
  public NinjaInfoCard() {
    this.guiX = (this.width - this.guiWidth) / 2;
    this.guiY = (this.height - this.guiHeight) / 2;
    this.missions = false;
    this.Player = "";
    this.Affiliation = 0;
    this.Land = 0;
    this.Clan = 0;
    this.Empty = new ResourceLocation("tm:textures/GUI/Chakra_bar2.png");
    this.texture = new ResourceLocation("tm:textures/GUI/InfoCard/NinjaCard2.png");
    this.texture2 = new ResourceLocation("tm:textures/GUI/NinjaCard3.png");
    this.PowerUp = new ResourceLocation("tm:textures/GUI/NinjaCardUp.png");
    this.Flip = new ResourceLocation("tm:textures/GUI/NinjaCardFlip.png");
    this.Top = new ResourceLocation("tm:textures/GUI/NinjaCardTop.png");
    this.windrelease = new ResourceLocation("tm:textures/GUI/WIND3.png");
    this.firerelease = new ResourceLocation("tm:textures/GUI/fire.png");
    this.waterrelease = new ResourceLocation("tm:textures/GUI/water.png");
    this.lightningrelease = new ResourceLocation("tm:textures/GUI/lightning.png");
    this.earthrelease = new ResourceLocation("tm:textures/GUI/earth.png");
    this.yinrelease = new ResourceLocation("tm:textures/GUI/yin.png");
    this.yangrelease = new ResourceLocation("tm:textures/GUI/yang.png");
    this.yinyanrelease = new ResourceLocation("tm:textures/GUI/yinyang.png");
    this.boilrelease = new ResourceLocation("tm:textures/GUI/boil.png");
    this.woodrelease = new ResourceLocation("tm:textures/GUI/wood.png");
    this.scorchrelease = new ResourceLocation("tm:textures/GUI/scorch.png");
    this.icerelease = new ResourceLocation("tm:textures/GUI/ice.png");
    this.steelrelease = new ResourceLocation("tm:textures/GUI/steel.png");
    this.crystalrelease = new ResourceLocation("tm:textures/GUI/crystal.png");
    this.lavarelease = new ResourceLocation("tm:textures/GUI/lava.png");
    this.explosionrelease = new ResourceLocation("tm:textures/GUI/explosion.png");
    this.magnetrelease = new ResourceLocation("tm:textures/GUI/magnet.png");
    this.stormrelease = new ResourceLocation("tm:textures/GUI/storm.png");
    this.dustrelease = new ResourceLocation("tm:textures/GUI/dust.png");
    this.shikotsumyaku = new ResourceLocation("tm:textures/GUI/shikotsumyaku.png");
    this.byakugan = new ResourceLocation("tm:textures/GUI/Byakugan.png");
    this.tenseigan = new ResourceLocation("tm:textures/GUI/Tenseigan.png");
    this.sharinganinfo = new ResourceLocation("tm:textures/GUI/sharinganicon.png");
    this.mangekyousharingan = new ResourceLocation("tm:textures/GUI/mangekyouSharingan.png");
    this.rinnegan = new ResourceLocation("tm:textures/GUI/rinnegan.png");
    this.ketsuryugan = new ResourceLocation("tm:textures/GUI/Ketsuryugan.png");
    this.uchiha = new ResourceLocation("tm:textures/GUI/uchiha.png");
    this.uzumaki = new ResourceLocation("tm:textures/GUI/uzumaki.png");
    this.aburame = new ResourceLocation("tm:textures/GUI/aburame.png");
    this.akimichi = new ResourceLocation("tm:textures/GUI/akimichi.png");
    this.hatake = new ResourceLocation("tm:textures/GUI/hatake.png");
    this.hozuki = new ResourceLocation("tm:textures/GUI/hozuki.png");
    this.hyuga = new ResourceLocation("tm:textures/GUI/hyuga.png");
    this.iburi = new ResourceLocation("tm:textures/GUI/iburi.png");
    this.inuzuka = new ResourceLocation("tm:textures/GUI/inuzuka.png");
    this.jugo = new ResourceLocation("tm:textures/GUI/jugo.png");
    this.kaguya = new ResourceLocation("tm:textures/GUI/kaguya.png");
    this.kurama = new ResourceLocation("tm:textures/GUI/kurama.png");
    this.tsuchigumo = new ResourceLocation("tm:textures/GUI/tsuchigumo.png");
    this.nara = new ResourceLocation("tm:textures/GUI/nara.png");
    this.otsutsuki = new ResourceLocation("tm:textures/GUI/otsutsuki.png");
    this.hagoromo = new ResourceLocation("tm:textures/GUI/hagoromo.png");
    this.sarutobi = new ResourceLocation("tm:textures/GUI/sarutobi.png");
    this.fuma = new ResourceLocation("tm:textures/GUI/fuma.png");
    this.senju = new ResourceLocation("tm:textures/GUI/senju.png");
    this.yuki = new ResourceLocation("tm:textures/GUI/yuki.png");
    this.yamanaka = new ResourceLocation("tm:textures/GUI/yamanaka.png");
    this.lee = new ResourceLocation("tm:textures/GUI/shimura.png");
    this.chinoike = new ResourceLocation("tm:textures/GUI/Chinoike.png");
    this.shirogane = new ResourceLocation("tm:textures/GUI/shirogane.png");
    this.akatsuki = new ResourceLocation("tm:textures/GUI/affiliation/akatsuki.png");
    this.ame = new ResourceLocation("tm:textures/GUI/affiliation/ame.png");
    this.getsu = new ResourceLocation("tm:textures/GUI/affiliation/getsu.png");
    this.hoshi = new ResourceLocation("tm:textures/GUI/affiliation/hoshi.png");
    this.ishi = new ResourceLocation("tm:textures/GUI/affiliation/ishi.png");
    this.iwa = new ResourceLocation("tm:textures/GUI/affiliation/iwa.png");
    this.jomae = new ResourceLocation("tm:textures/GUI/affiliation/jomae.png");
    this.kiri = new ResourceLocation("tm:textures/GUI/affiliation/kiri.png");
    this.konoha = new ResourceLocation("tm:textures/GUI/affiliation/konoha.png");
    this.kumo = new ResourceLocation("tm:textures/GUI/affiliation/kumo.png");
    this.kusa = new ResourceLocation("tm:textures/GUI/affiliation/kusa.png");
    this.nadeshiko = new ResourceLocation("tm:textures/GUI/affiliation/nadeshiko.png");
    this.oto = new ResourceLocation("tm:textures/GUI/affiliation/oto.png");
    this.ryuchi = new ResourceLocation("tm:textures/GUI/affiliation/ryuchi.png");
    this.shimos = new ResourceLocation("tm:textures/GUI/affiliation/shimk.png");
    this.suna = new ResourceLocation("tm:textures/GUI/affiliation/suna.png");
    this.taki = new ResourceLocation("tm:textures/GUI/affiliation/taki.png");
    this.takumi = new ResourceLocation("tm:textures/GUI/affiliation/takumi.png");
    this.tani = new ResourceLocation("tm:textures/GUI/affiliation/tani.png");
    this.toad = new ResourceLocation("tm:textures/GUI/affiliation/toad.png");
    this.yuga = new ResourceLocation("tm:textures/GUI/affiliation/yuga.png");
    this.yukigakure = new ResourceLocation("tm:textures/GUI/affiliation/yuki.png");
    this.yume = new ResourceLocation("tm:textures/GUI/affiliation/yume.png");
    this.shikotsu = new ResourceLocation("tm:textures/GUI/affiliation/shikotsu.png");
    this.earth = new ResourceLocation("tm:textures/GUI/land/earth.png");
    this.fire = new ResourceLocation("tm:textures/GUI/land/fire.png");
    this.iron = new ResourceLocation("tm:textures/GUI/land/iron.png");
    this.lightning = new ResourceLocation("tm:textures/GUI/land/lightning.png");
    this.sky = new ResourceLocation("tm:textures/GUI/land/sky.png");
    this.snow = new ResourceLocation("tm:textures/GUI/land/snow.png");
    this.sound = new ResourceLocation("tm:textures/GUI/land/sound.png");
    this.water = new ResourceLocation("tm:textures/GUI/land/water.png");
    this.wind = new ResourceLocation("tm:textures/GUI/land/wind.png");
    this.D = new ResourceLocation("tm:textures/GUI/D.png");
    this.B = new ResourceLocation("tm:textures/GUI/B.png");
    this.C = new ResourceLocation("tm:textures/GUI/C.png");
    this.A = new ResourceLocation("tm:textures/GUI/A.png");
    this.S = new ResourceLocation("tm:textures/GUI/S.png");
    this.SS = new ResourceLocation("tm:textures/GUI/SS.png");
  }
  
  public void drawScreen(int x, int y, float ticks) {
    int guiX = (this.width - this.guiWidth) / 2;
    int guiY = (this.height - this.guiHeight) / 2;
    int guiY2 = (this.height - this.guiHeight2) / 2;
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    drawDefaultBackground();
    this.mc.renderEngine.bindTexture(this.texture);
    drawTexturedModalRect(guiX, guiY, 0, 0, this.guiWidth, this.guiHeight);
    ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer);
    if (!this.missions) {
      if (this.Land == 1) {
        this.mc.renderEngine.bindTexture(this.earth);
        drawTexturedModalRect(guiX + 117, guiY + 1, 0, 0, this.landWidth, this.landWidth);
      } 
      if (this.Land == 2) {
        this.mc.renderEngine.bindTexture(this.fire);
        drawTexturedModalRect(guiX + 117, guiY + 1, 0, 0, this.landWidth, this.landWidth);
      } 
      if (this.Land == 3) {
        this.mc.renderEngine.bindTexture(this.iron);
        drawTexturedModalRect(guiX + 117, guiY + 1, 0, 0, this.landWidth, this.landWidth);
      } 
      if (this.Land == 4) {
        this.mc.renderEngine.bindTexture(this.lightning);
        drawTexturedModalRect(guiX + 117, guiY + 1, 0, 0, this.landWidth, this.landWidth);
      } 
      if (this.Land == 5) {
        this.mc.renderEngine.bindTexture(this.sky);
        drawTexturedModalRect(guiX + 117, guiY + 1, 0, 0, this.landWidth, this.landWidth);
      } 
      if (this.Land == 6) {
        this.mc.renderEngine.bindTexture(this.snow);
        drawTexturedModalRect(guiX + 117, guiY + 1, 0, 0, this.landWidth, this.landWidth);
      } 
      if (this.Land == 7) {
        this.mc.renderEngine.bindTexture(this.sound);
        drawTexturedModalRect(guiX + 117, guiY + 1, 0, 0, this.landWidth, this.landWidth);
      } 
      if (this.Land == 8) {
        this.mc.renderEngine.bindTexture(this.water);
        drawTexturedModalRect(guiX + 117, guiY + 1, 0, 0, this.landWidth, this.landWidth);
      } 
      if (this.Land == 9) {
        this.mc.renderEngine.bindTexture(this.wind);
        drawTexturedModalRect(guiX + 117, guiY + 1, 0, 0, this.landWidth, this.landWidth);
      } 
      if (this.Affiliation == 1) {
        this.mc.renderEngine.bindTexture(this.akatsuki);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 2) {
        this.mc.renderEngine.bindTexture(this.ame);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 3) {
        this.mc.renderEngine.bindTexture(this.getsu);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 4) {
        this.mc.renderEngine.bindTexture(this.hoshi);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 5) {
        this.mc.renderEngine.bindTexture(this.ishi);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 6) {
        this.mc.renderEngine.bindTexture(this.iwa);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 7) {
        this.mc.renderEngine.bindTexture(this.jomae);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 8) {
        this.mc.renderEngine.bindTexture(this.kiri);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 9) {
        this.mc.renderEngine.bindTexture(this.konoha);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 10) {
        this.mc.renderEngine.bindTexture(this.kumo);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 11) {
        this.mc.renderEngine.bindTexture(this.kusa);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 12) {
        this.mc.renderEngine.bindTexture(this.nadeshiko);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 13) {
        this.mc.renderEngine.bindTexture(this.oto);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 14) {
        this.mc.renderEngine.bindTexture(this.ryuchi);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 15) {
        this.mc.renderEngine.bindTexture(this.shimos);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 16) {
        this.mc.renderEngine.bindTexture(this.suna);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 17) {
        this.mc.renderEngine.bindTexture(this.taki);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 18) {
        this.mc.renderEngine.bindTexture(this.takumi);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 19) {
        this.mc.renderEngine.bindTexture(this.tani);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 20) {
        this.mc.renderEngine.bindTexture(this.toad);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 21) {
        this.mc.renderEngine.bindTexture(this.yuga);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 22) {
        this.mc.renderEngine.bindTexture(this.yuki);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 23) {
        this.mc.renderEngine.bindTexture(this.yume);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (this.Affiliation == 24) {
        this.mc.renderEngine.bindTexture(this.shikotsu);
        drawTexturedModalRect(guiX + 75, guiY + 8, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 1) {
        this.mc.renderEngine.bindTexture(this.uchiha);
        drawTexturedModalRect(guiX + 152, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 2) {
        this.mc.renderEngine.bindTexture(this.uzumaki);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 3) {
        this.mc.renderEngine.bindTexture(this.aburame);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 4) {
        this.mc.renderEngine.bindTexture(this.akimichi);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 5) {
        this.mc.renderEngine.bindTexture(this.hatake);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 6) {
        this.mc.renderEngine.bindTexture(this.hozuki);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 7) {
        this.mc.renderEngine.bindTexture(this.hyuga);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 8) {
        this.mc.renderEngine.bindTexture(this.iburi);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 9) {
        this.mc.renderEngine.bindTexture(this.inuzuka);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 10) {
        this.mc.renderEngine.bindTexture(this.jugo);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 11) {
        this.mc.renderEngine.bindTexture(this.kaguya);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 12) {
        this.mc.renderEngine.bindTexture(this.kurama);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 13) {
        this.mc.renderEngine.bindTexture(this.tsuchigumo);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 14) {
        this.mc.renderEngine.bindTexture(this.nara);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 15) {
        this.mc.renderEngine.bindTexture(this.otsutsuki);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 16) {
        this.mc.renderEngine.bindTexture(this.hagoromo);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 17) {
        this.mc.renderEngine.bindTexture(this.sarutobi);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 18) {
        this.mc.renderEngine.bindTexture(this.fuma);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 19) {
        this.mc.renderEngine.bindTexture(this.senju);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 20) {
        this.mc.renderEngine.bindTexture(this.yuki);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 21) {
        this.mc.renderEngine.bindTexture(this.yamanaka);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 22) {
        this.mc.renderEngine.bindTexture(this.lee);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 23) {
        this.mc.renderEngine.bindTexture(this.chinoike);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClan() == 24) {
        this.mc.renderEngine.bindTexture(this.shirogane);
        drawTexturedModalRect(guiX + 150, guiY + 7, 0, 0, this.iconWidth, this.iconHeight);
      } 
      this.fontRendererObj.drawString("Ninjutsu", guiX + 10, guiY + 10, 0);
      this.fontRendererObj.drawString("Taijutsu", guiX + 10, guiY + 25, 0);
      this.fontRendererObj.drawString("Genjutsu", guiX + 10, guiY + 40, 0);
      this.fontRendererObj.drawString("Kenjutsu", guiX + 10, guiY + 55, 0);
      this.fontRendererObj.drawString("Shurikenjutsu", guiX + 10, guiY + 70, 0);
      this.fontRendererObj.drawString("Summoning", guiX + 10, guiY + 85, 0);
      this.fontRendererObj.drawString("Kinjutsu", guiX + 10, guiY + 100, 0);
      this.fontRendererObj.drawString("Senjutsu", guiX + 10, guiY + 115, 0);
      this.fontRendererObj.drawString("Medical", guiX + 10, guiY + 130, 0);
      this.fontRendererObj.drawString("Speed", guiX + 10, guiY + 145, 0);
      this.fontRendererObj.drawString("Intelligence", guiX + 10, guiY + 160, 0);
      this.fontRendererObj.drawString("Total:", guiX + 10, guiY + 175, 0);
      this.fontRendererObj.drawString("" + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getHealth(), guiX + 90, guiY + 130, 0);
      this.fontRendererObj.drawString("" + (int)(ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getSpeed() * 200.0D - 20.0D), guiX + 90, guiY + 145, 0);
      this.fontRendererObj.drawString("" + (int)(ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getKenjutsu() * 50.0D - 50.0D), guiX + 90, guiY + 55, 0);
      this.fontRendererObj.drawString("" + (int)(ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getTaijutsu() * 50.0D - 50.0D), guiX + 90, guiY + 25, 0);
      this.fontRendererObj.drawString("" + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getGenjutsu(), guiX + 90, guiY + 40, 0);
      this.fontRendererObj.drawString("" + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getIntelligence(), guiX + 90, guiY + 160, 0);
      this.fontRendererObj.drawString("" + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getKinjutsu(), guiX + 90, guiY + 100, 0);
      this.fontRendererObj.drawString("" + (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getMaxMana() / 5 - 5), guiX + 90, guiY + 10, 0);
      this.fontRendererObj.drawString("" + (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getMaxSenjutsu() / 5), guiX + 90, guiY + 115, 0);
      this.fontRendererObj.drawString("" + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClanName(), guiX + 167, guiY + 10, 0);
      this.fontRendererObj.drawString("" + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getRankName(), guiX + 160, guiY + 38, 0);
      this.fontRendererObj.drawString("" + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getShurikenjutsu(), guiX + 90, guiY + 70, 0);
      this.fontRendererObj.drawString("" + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getSummoning(), guiX + 90, guiY + 85, 0);
      this.fontRendererObj.drawString("" + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getAffiliationName(), guiX + 193, guiY + 25, 0);
      this.fontRendererObj.drawString("Lvl: " + props.getLevel(), guiX + 130, guiY + 175, 0);
      this.fontRendererObj.drawString("Skill: " + props.getSkillPoints(), guiX + 195, guiY + 175, 0);
      this.fontRendererObj.drawString("" + (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getHealth() + (int)(ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getSpeed() * 200.0D - 20.0D) + (int)(ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getKenjutsu() * 50.0D - 50.0D) + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getShurikenjutsu() + (int)(ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getTaijutsu() * 50.0D - 50.0D) + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getGenjutsu() + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getSummoning() + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getIntelligence() + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getKinjutsu() + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getMaxMana() / 5 - 5 + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getMaxSenjutsu() / 5), guiX + 90, guiY + 175, 0);
    } 
    if (this.missions) {
      this.mc.renderEngine.bindTexture(this.D);
      drawTexturedModalRect(guiX + 10, guiY + 60, 0, 0, this.iconWidth, this.iconHeight);
      this.mc.renderEngine.bindTexture(this.C);
      drawTexturedModalRect(guiX + 10, guiY + 60 + this.iconHeight + 5, 0, 0, this.iconWidth, this.iconHeight);
      this.mc.renderEngine.bindTexture(this.B);
      drawTexturedModalRect(guiX + 10, guiY + 60 + this.iconHeight * 2 + 10, 0, 0, this.iconWidth, this.iconHeight);
      this.mc.renderEngine.bindTexture(this.A);
      drawTexturedModalRect(guiX + 10, guiY + 60 + this.iconHeight * 3 + 15, 0, 0, this.iconWidth, this.iconHeight);
      this.mc.renderEngine.bindTexture(this.S);
      drawTexturedModalRect(guiX + 10, guiY + 60 + this.iconHeight * 4 + 20, 0, 0, this.iconWidth, this.iconHeight);
      this.mc.renderEngine.bindTexture(this.SS);
      drawTexturedModalRect(guiX + 10, guiY + 60 + this.iconHeight * 5 + 25, 0, 0, this.iconWidth + 3, this.iconHeight + 1);
      this.fontRendererObj.drawString("Missions:", guiX + 10, guiY + 50, 0);
      this.fontRendererObj.drawString(": " + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getDQuests(), guiX + 35, guiY + 65, 0);
      this.fontRendererObj.drawString(": " + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getCQuests(), guiX + 35, guiY + 65 + this.iconHeight + 5, 0);
      this.fontRendererObj.drawString(": " + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getBQuests(), guiX + 35, guiY + 65 + this.iconHeight * 2 + 10, 0);
      this.fontRendererObj.drawString(": " + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getAQuests(), guiX + 35, guiY + 65 + this.iconHeight * 3 + 15, 0);
      this.fontRendererObj.drawString(": " + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getSQuests(), guiX + 35, guiY + 65 + this.iconHeight * 4 + 20, 0);
      this.fontRendererObj.drawString(": " + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getSSQuests(), guiX + 35, guiY + 65 + this.iconHeight * 5 + 25, 0);
    } 
    super.drawScreen(x, y, ticks);
  }
  
  public boolean doesGuiPauseGame() {
    return false;
  }
}

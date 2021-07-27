package alcoholmod.Mathioks.ExtraFunctions;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.GuiTexturedButton;
import alcoholmod.Mathioks.GuiTexturedButton2;
import alcoholmod.Mathioks.PacketDispatcher;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import lc208.tools;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;

public class GuiTest extends GuiScreen {
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
  
  private GuiTexturedButton button2;
  
  private GuiTexturedButton button3;
  
  private GuiTexturedButton button4;
  
  private GuiTexturedButton button5;
  
  private GuiTexturedButton button6;
  
  private GuiTexturedButton button7;
  
  private GuiTexturedButton button8;
  
  private GuiTexturedButton button9;
  
  private GuiTexturedButton button10;
  
  private GuiTexturedButton2 button11;
  
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
  
  private ResourceLocation jougan;
  
  private ResourceLocation sharinganinfo;
  
  private ResourceLocation mangekyousharingan;
  
  private ResourceLocation mangekyousharinganBaru;
  
  private ResourceLocation mangekyousharinganItachi;
  
  private ResourceLocation mangekyousharinganIzuna;
  
  private ResourceLocation mangekyousharinganMadara;
  
  private ResourceLocation mangekyousharinganNaka;
  
  private ResourceLocation mangekyousharinganNaori;
  
  private ResourceLocation mangekyousharinganObito;
  
  private ResourceLocation mangekyousharinganRai;
  
  private ResourceLocation mangekyousharinganSasuke;
  
  private ResourceLocation mangekyousharinganShin;
  
  private ResourceLocation mangekyousharinganShisui;
  
  private ResourceLocation eternalmangekyousharingan;
  
  private ResourceLocation eternalmangekyousharinganBaru;
  
  private ResourceLocation eternalmangekyousharinganItachi;
  
  private ResourceLocation eternalmangekyousharinganIzuna;
  
  private ResourceLocation eternalmangekyousharinganMadara;
  
  private ResourceLocation eternalmangekyousharinganNaka;
  
  private ResourceLocation eternalmangekyousharinganNaori;
  
  private ResourceLocation eternalmangekyousharinganObito;
  
  private ResourceLocation eternalmangekyousharinganRai;
  
  private ResourceLocation eternalmangekyousharinganSasuke;
  
  private ResourceLocation eternalmangekyousharinganShin;
  
  private ResourceLocation eternalmangekyousharinganShisui;
  
  private ResourceLocation mangekyousharinganMentroz;
  
  private ResourceLocation mangekyousharinganDragozai;
  
  private ResourceLocation mangekyousharinganCoralSensei;
  
  private ResourceLocation mangekyousharinganMcNASTY;
  
  private ResourceLocation mangekyousharinganCharlie;
  
  private ResourceLocation mangekyousharinganGrimbite;
  
  private ResourceLocation mangekyousharinganha1den;
  
  private ResourceLocation mangekyousharinganjanglolroflmao;
  
  private ResourceLocation mangekyousharinganJORDAN;
  
  private ResourceLocation mangekyousharinganL0rdMadaraUchiha;
  
  private ResourceLocation mangekyousharinganTomtomcaty;
  
  private ResourceLocation mangekyousharinganFujimoto;
  
  private ResourceLocation mangekyousharinganYunus;
  
  private ResourceLocation eternalmangekyousharinganMentroz;
  
  private ResourceLocation eternalmangekyousharinganDragozai;
  
  private ResourceLocation eternalmangekyousharinganCoralSensei;
  
  private ResourceLocation eternalmangekyousharinganMcNASTY;
  
  private ResourceLocation eternalmangekyousharinganCharlie;
  
  private ResourceLocation eternalmangekyousharinganGrimbite;
  
  private ResourceLocation eternalmangekyousharinganha1den;
  
  private ResourceLocation eternalmangekyousharinganjanglolroflmao;
  
  private ResourceLocation eternalmangekyousharinganJORDAN;
  
  private ResourceLocation eternalmangekyousharinganL0rdMadaraUchiha;
  
  private ResourceLocation eternalmangekyousharinganTomtomcaty;
  
  private ResourceLocation eternalmangekyousharinganFujimoto;
  
  private ResourceLocation eternalmangekyousharinganYunus;
  
  private ResourceLocation sharinganCandrom;
  
  private ResourceLocation mangekyousharinganCandrom;
  
  private ResourceLocation eternalmangekyousharinganCandrom;
  
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
  
  private ResourceLocation neko;
  
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
  
  private ResourceLocation Test;
  
  private ResourceLocation CardFlip;
  
  boolean Clicked1;
  
  boolean Clicked2;
  
  public GuiTest() {
    this.guiX = (this.width - this.guiWidth) / 2;
    this.guiY = (this.height - this.guiHeight) / 2;
    this.missions = false;
    this.Empty = new ResourceLocation("am:textures/GUI/Chakra_bar2.png");
    this.texture = new ResourceLocation("am:textures/GUI/NinjaCard2.png");
    this.texture2 = new ResourceLocation("am:textures/GUI/NinjaCard3.png");
    this.PowerUp = new ResourceLocation("am:textures/GUI/NinjaCardUp.png");
    this.Flip = new ResourceLocation("tm:textures/GUI/NinjaCardFlip.png");
    this.Top = new ResourceLocation("am:textures/GUI/NinjaCardTop.png");
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
    this.jougan = new ResourceLocation("tm:textures/GUI/apollo/jougan.png");
    this.sharinganinfo = new ResourceLocation("tm:textures/GUI/sharinganicon.png");
    this.mangekyousharingan = new ResourceLocation("tm:textures/GUI/mangekyouSharingan.png");
    this.mangekyousharinganBaru = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganBaru.png");
    this.mangekyousharinganItachi = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganItachi.png");
    this.mangekyousharinganIzuna = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganIzuna.png");
    this.mangekyousharinganMadara = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganMadara.png");
    this.mangekyousharinganNaka = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganNaka.png");
    this.mangekyousharinganNaori = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganNaori.png");
    this.mangekyousharinganObito = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganObito.png");
    this.mangekyousharinganRai = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganRai.png");
    this.mangekyousharinganSasuke = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganSasuke.png");
    this.mangekyousharinganShin = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganShin.png");
    this.mangekyousharinganShisui = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganShisui.png");
    this.eternalmangekyousharingan = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharingan.png");
    this.eternalmangekyousharinganBaru = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganBaru.png");
    this.eternalmangekyousharinganItachi = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganItachi.png");
    this.eternalmangekyousharinganIzuna = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganIzuna.png");
    this.eternalmangekyousharinganMadara = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganMadara.png");
    this.eternalmangekyousharinganNaka = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganNaka.png");
    this.eternalmangekyousharinganNaori = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganNaori.png");
    this.eternalmangekyousharinganObito = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganObito.png");
    this.eternalmangekyousharinganRai = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganRai.png");
    this.eternalmangekyousharinganSasuke = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganSasuke.png");
    this.eternalmangekyousharinganShin = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganShin.png");
    this.eternalmangekyousharinganShisui = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganShisui.png");
    this.mangekyousharinganMentroz = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganMentroz.png");
    this.mangekyousharinganDragozai = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganDragozai.png");
    this.mangekyousharinganCoralSensei = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganCoralSensei.png");
    this.mangekyousharinganMcNASTY = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganMcNASTY.png");
    this.mangekyousharinganCharlie = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganCharlie.png");
    this.mangekyousharinganGrimbite = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganGrimbite.png");
    this.mangekyousharinganha1den = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganha1den.png");
    this.mangekyousharinganjanglolroflmao = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganjanglolroflmao.png");
    this.mangekyousharinganJORDAN = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganJORDAN.png");
    this.mangekyousharinganL0rdMadaraUchiha = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganL0rdMadaraUchiha.png");
    this.mangekyousharinganTomtomcaty = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganTomtomcaty.png");
    this.mangekyousharinganFujimoto = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganFujimoto.png");
    this.mangekyousharinganYunus = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganYunus.png");
    this.eternalmangekyousharinganMentroz = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganMentroz.png");
    this.eternalmangekyousharinganDragozai = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganDragozai.png");
    this.eternalmangekyousharinganCoralSensei = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganCoralSensei.png");
    this.eternalmangekyousharinganMcNASTY = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganMcNASTY.png");
    this.eternalmangekyousharinganCharlie = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganCharlie.png");
    this.eternalmangekyousharinganGrimbite = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganGrimbite.png");
    this.eternalmangekyousharinganha1den = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganha1den.png");
    this.eternalmangekyousharinganjanglolroflmao = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganjanglolroflmao.png");
    this.eternalmangekyousharinganJORDAN = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganJORDAN.png");
    this.eternalmangekyousharinganL0rdMadaraUchiha = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganL0rdMadaraUchiha.png");
    this.eternalmangekyousharinganTomtomcaty = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganTomtomcaty.png");
    this.eternalmangekyousharinganFujimoto = new ResourceLocation("tm:textures/GUI/apollo/eternalMangekyouSharinganFujimoto.png");
    this.eternalmangekyousharinganYunus = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganYunus.png");
    this.sharinganCandrom = new ResourceLocation("tm:textures/GUI/apollo/sharinganCandrom.png");
    this.mangekyousharinganCandrom = new ResourceLocation("tm:textures/GUI/apollo/mangekyouSharinganCandrom.png");
    this.eternalmangekyousharinganCandrom = new ResourceLocation("tm:textures/GUI/apollo/eternalmangekyouSharinganCandrom.png");
    this.rinnegan = new ResourceLocation("tm:textures/GUI/rinnegan.png");
    this.ketsuryugan = new ResourceLocation("tm:textures/GUI/Ketsuryugan.png");
    this.uchiha = new ResourceLocation("am:textures/GUI/uchiha.png");
    this.uzumaki = new ResourceLocation("am:textures/GUI/uzumaki.png");
    this.aburame = new ResourceLocation("am:textures/GUI/aburame.png");
    this.akimichi = new ResourceLocation("tm:textures/GUI/akimichi.png");
    this.hatake = new ResourceLocation("am:textures/GUI/hatake.png");
    this.hozuki = new ResourceLocation("am:textures/GUI/hozuki.png");
    this.hyuga = new ResourceLocation("am:textures/GUI/hyuga.png");
    this.iburi = new ResourceLocation("am:textures/GUI/iburi.png");
    this.inuzuka = new ResourceLocation("am:textures/GUI/inuzuka.png");
    this.jugo = new ResourceLocation("am:textures/GUI/jugo.png");
    this.kaguya = new ResourceLocation("am:textures/GUI/kaguya.png");
    this.kurama = new ResourceLocation("am:textures/GUI/kurama.png");
    this.tsuchigumo = new ResourceLocation("am:textures/GUI/tsuchigumo.png");
    this.nara = new ResourceLocation("am:textures/GUI/nara.png");
    this.otsutsuki = new ResourceLocation("tm:textures/GUI/otsutsuki.png");
    this.hagoromo = new ResourceLocation("tm:textures/GUI/hagoromo.png");
    this.sarutobi = new ResourceLocation("am:textures/GUI/sarutobi.png");
    this.fuma = new ResourceLocation("am:textures/GUI/fuma.png");
    this.neko = new ResourceLocation("am:textures/GUI/neko.png");
    this.yuki = new ResourceLocation("am:textures/GUI/yuki.png");
    this.yamanaka = new ResourceLocation("am:textures/GUI/yamanaka.png");
    this.lee = new ResourceLocation("am:textures/GUI/shimura.png");
    this.chinoike = new ResourceLocation("am:textures/GUI/Chinoike.png");
    this.shirogane = new ResourceLocation("am:textures/GUI/shirogane.png");
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
    this.Test = new ResourceLocation("am:textures/GUI/NinjaCardUp.png");
    this.CardFlip = new ResourceLocation("tm:textures/GUI/NinjaCardFlip.png");
    this.Clicked1 = false;
    this.Clicked2 = false;
  }
  
  public void initGui() {
    int guiX = (this.width - this.guiWidth) / 2;
    int guiY = (this.height - this.guiHeight) / 2;
    this.buttonList.clear();
    this.buttonList.add(new GuiTexturedButton(0, guiX - 14, guiY + 5, this.PowerUp));
    this.buttonList.add(new GuiTexturedButton(1, guiX - 14, guiY + 20, this.PowerUp));
    this.buttonList.add(new GuiTexturedButton(2, guiX - 14, guiY + 35, this.PowerUp));
    this.buttonList.add(new GuiTexturedButton(4, guiX - 14, guiY + 50, this.PowerUp));
    this.buttonList.add(new GuiTexturedButton(5, guiX - 14, guiY + 65, this.PowerUp));
    this.buttonList.add(new GuiTexturedButton(6, guiX - 14, guiY + 80, this.PowerUp));
    this.buttonList.add(new GuiTexturedButton(7, guiX - 14, guiY + 95, this.PowerUp));
    this.buttonList.add(new GuiTexturedButton(8, guiX - 14, guiY + 110, this.PowerUp));
    this.buttonList.add(new GuiTexturedButton(9, guiX - 14, guiY + 125, this.PowerUp));
    super.initGui();
  }
  
  public void drawScreen(int x, int y, float ticks) {
    int guiX = (this.width - this.guiWidth) / 2;
    int guiY = (this.height - this.guiHeight) / 2;
    int guiY2 = (this.height - this.guiHeight2) / 2;
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    drawDefaultBackground();
    this.mc.renderEngine.bindTexture(this.texture);
    drawTexturedModalRect(guiX, guiY, 0, 0, this.guiWidth, this.guiHeight);
    this.mc.renderEngine.bindTexture(this.texture2);
    drawTexturedModalRect(guiX, guiY2 + 105, 0, 0, this.guiWidth, this.guiHeight2);
    this.mc.renderEngine.bindTexture(this.Top);
    GL11.glPushMatrix();
    GL11.glScalef(1.086F, 1.086F, 1.086F);
    drawTexturedModalRect(guiX - 19, guiY - 22, 0, 0, 256, 30);
    GL11.glPopMatrix();
    GL11.glPushMatrix();
    GL11.glScalef(1.0F, 1.0F, 1.0F);
    GL11.glPopMatrix();
    ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer);
    if (!this.missions) {
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
        this.mc.renderEngine.bindTexture(this.neko);
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
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getWindRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.windrelease);
        drawTexturedModalRect(guiX + 125, guiY + 60, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getFireRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.firerelease);
        drawTexturedModalRect(guiX + 125 + 20 * props.getWindRelease(), guiY + 60, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getWaterRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.waterrelease);
        drawTexturedModalRect(guiX + 125 + 20 * props.getWindRelease() + 20 * props.getFireRelease(), guiY + 60, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getLightningRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.lightningrelease);
        drawTexturedModalRect(guiX + 125 + 20 * props.getWindRelease() + 20 * props.getFireRelease() + 20 * props.getWaterRelease(), guiY + 60, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getEarthRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.earthrelease);
        drawTexturedModalRect(guiX + 125 + 20 * props.getWindRelease() + 20 * props.getFireRelease() + 20 * props.getWaterRelease() + 20 * props.getLightningRelease(), guiY + 60, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getYinRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.yinrelease);
        if (props.getFireRelease() == 1 && props.getWindRelease() == 1 && props.getEarthRelease() == 1 && props.getLightningRelease() == 1 && props.getWaterRelease() == 1) {
          drawTexturedModalRect(guiX + 125, guiY + 80, 0, 0, this.iconWidth, this.iconHeight);
        } else {
          drawTexturedModalRect(guiX + 125 + 20 * props.getWindRelease() + 20 * props.getFireRelease() + 20 * props.getWaterRelease() + 20 * props.getLightningRelease() + 20 * props.getEarthRelease(), guiY + 60, 0, 0, this.iconWidth, this.iconHeight);
        } 
      } 
      if (props.getYangRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.yangrelease);
        if (props.getFireRelease() + props.getWindRelease() + props.getEarthRelease() + props.getLightningRelease() + props.getWaterRelease() + props.getYinRelease() >= 5) {
          if (props.getFireRelease() + props.getWindRelease() + props.getEarthRelease() + props.getLightningRelease() + props.getWaterRelease() + props.getYinRelease() == 6) {
            drawTexturedModalRect(guiX + 125 + 20 * props.getYinRelease(), guiY + 80, 0, 0, this.iconWidth, this.iconHeight);
          } else {
            drawTexturedModalRect(guiX + 125, guiY + 80, 0, 0, this.iconWidth, this.iconHeight);
          } 
        } else {
          drawTexturedModalRect(guiX + 125 + 20 * props.getWindRelease() + 20 * props.getFireRelease() + 20 * props.getWaterRelease() + 20 * props.getLightningRelease() + 20 * props.getEarthRelease() + 20 * props.getYinRelease(), guiY + 60, 0, 0, this.iconWidth, this.iconHeight);
        } 
      } 
      if (props.getYinyangRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.yinyanrelease);
        if (props.getFireRelease() + props.getWindRelease() + props.getEarthRelease() + props.getLightningRelease() + props.getWaterRelease() + props.getYinRelease() + props.getYangRelease() >= 5) {
          if (props.getFireRelease() + props.getWindRelease() + props.getEarthRelease() + props.getLightningRelease() + props.getWaterRelease() + props.getYinRelease() + props.getYangRelease() == 5)
            drawTexturedModalRect(guiX + 125, guiY + 80, 0, 0, this.iconWidth, this.iconHeight); 
          if (props.getFireRelease() + props.getWindRelease() + props.getEarthRelease() + props.getLightningRelease() + props.getWaterRelease() + props.getYinRelease() + props.getYangRelease() == 6)
            drawTexturedModalRect(guiX + 125 + 20, guiY + 80, 0, 0, this.iconWidth, this.iconHeight); 
          if (props.getFireRelease() + props.getWindRelease() + props.getEarthRelease() + props.getLightningRelease() + props.getWaterRelease() + props.getYinRelease() + props.getYangRelease() == 7)
            drawTexturedModalRect(guiX + 125 + 40, guiY + 80, 0, 0, this.iconWidth, this.iconHeight); 
        } else {
          drawTexturedModalRect(guiX + 125 + 20 * props.getWindRelease() + 20 * props.getFireRelease() + 20 * props.getWaterRelease() + 20 * props.getLightningRelease() + 20 * props.getEarthRelease() + 20 * props.getYinRelease() + 20 * props.getYangRelease(), guiY + 60, 0, 0, this.iconWidth, this.iconHeight);
        } 
      } 
      if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getboilRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.boilrelease);
        drawTexturedModalRect(guiX + 125, guiY + 110, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getwoodRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.woodrelease);
        drawTexturedModalRect(guiX + 125 + 20 * props.getboilRelease(), guiY + 110, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getsteelRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.steelrelease);
        drawTexturedModalRect(guiX + 125 + 20 * props.getboilRelease() + 20 * props.getwoodRelease(), guiY + 110, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getcrystalRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.crystalrelease);
        drawTexturedModalRect(guiX + 125 + 20 * props.getboilRelease() + 20 * props.getwoodRelease() + 20 * props.getsteelRelease(), guiY + 110, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getscorchRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.scorchrelease);
        drawTexturedModalRect(guiX + 125 + 20 * props.getboilRelease() + 20 * props.getwoodRelease() + 20 * props.getsteelRelease() + 20 * props.getcrystalRelease(), guiY + 110, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getshikotsumyaku() == 1) {
        this.mc.renderEngine.bindTexture(this.shikotsumyaku);
        drawTexturedModalRect(guiX + 125 + 20 * props.getboilRelease() + 20 * props.getwoodRelease() + 20 * props.getsteelRelease() + 20 * props.getcrystalRelease() + 20 * props.getscorchRelease(), guiY + 110, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.geticeRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.icerelease);
        drawTexturedModalRect(guiX + 125, guiY + 130, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getlavaRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.lavarelease);
        drawTexturedModalRect(guiX + 125 + 20 * props.geticeRelease(), guiY + 130, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getstormRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.stormrelease);
        drawTexturedModalRect(guiX + 125 + 20 * props.geticeRelease() + 20 * props.getlavaRelease(), guiY + 130, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getmagnetRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.magnetrelease);
        drawTexturedModalRect(guiX + 125 + 20 * props.geticeRelease() + 20 * props.getlavaRelease() + 20 * props.getstormRelease(), guiY + 130, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getexplosionRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.explosionrelease);
        drawTexturedModalRect(guiX + 125 + 20 * props.geticeRelease() + 20 * props.getlavaRelease() + 20 * props.getstormRelease() + 20 * props.getmagnetRelease(), guiY + 130, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getdustRelease() == 1) {
        this.mc.renderEngine.bindTexture(this.dustrelease);
        drawTexturedModalRect(guiX + 125 + 20 * props.geticeRelease() + 20 * props.getlavaRelease() + 20 * props.getstormRelease() + 20 * props.getmagnetRelease() + 20 * props.getexplosionRelease(), guiY + 130, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getbyakugan() == 1) {
        this.mc.renderEngine.bindTexture(this.byakugan);
        drawTexturedModalRect(guiX + 125, guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.gettenseigan() == 1) {
        this.mc.renderEngine.bindTexture(this.tenseigan);
        drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
      } 
      if (props.getsharinganicon() == 1)
        if (props.getmangekyouSharingan() == 50) {
          this.mc.renderEngine.bindTexture(this.sharinganCandrom);
          drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
        } else {
          this.mc.renderEngine.bindTexture(this.sharinganinfo);
          drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
        }  
      if (props.getmangekyouSharingan() >= 1) {
        if (props.getSharinganSize() == 1.0D)
          if (props.getmangekyouSharingan() == 3) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganSasuke);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 4) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganItachi);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 5) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganShisui);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 6) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganObito);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 7) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganIzuna);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 8) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganNaori);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 10) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganMadara);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 11) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganBaru);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 12) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganRai);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 13) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganNaka);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 15) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganShin);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 20) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganMentroz);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 21) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganDragozai);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 22) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganCoralSensei);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 23) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganMcNASTY);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 24) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganCharlie);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 25) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganGrimbite);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 26) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganha1den);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 27) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganjanglolroflmao);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 28) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganJORDAN);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 29) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganL0rdMadaraUchiha);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 30) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganTomtomcaty);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 31) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganFujimoto);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 32) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganYunus);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 50) {
            this.mc.renderEngine.bindTexture(this.mangekyousharinganCandrom);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else {
            this.mc.renderEngine.bindTexture(this.mangekyousharingan);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          }  
        if (props.getSharinganSize() == 2.0D || props.getSharinganSize() == 3.0D)
          if (props.getmangekyouSharingan() == 3) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganSasuke);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 4) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganSasuke);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 5) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganObito);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 6) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganObito);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 7) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganMadara);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 8) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganNaka);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 10) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganMadara);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 11) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganBaru);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 12) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganRai);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 13) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganNaka);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 15) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganShin);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 20) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganMentroz);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 21) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganDragozai);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 22) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganCoralSensei);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 23) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganMcNASTY);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 24) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganCharlie);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 25) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganGrimbite);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 26) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganha1den);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 27) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganjanglolroflmao);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 28) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganJORDAN);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 29) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganL0rdMadaraUchiha);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 30) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganTomtomcaty);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 31) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganFujimoto);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 32) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganYunus);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else if (props.getmangekyouSharingan() == 50) {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharinganCandrom);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          } else {
            this.mc.renderEngine.bindTexture(this.eternalmangekyousharingan);
            drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
          }  
      } 
      if (props.getrinnegan() == 1) {
        this.mc.renderEngine.bindTexture(this.rinnegan);
        if (props.getmangekyouSharingan() >= 1) {
          drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon() + 20, guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
        } else {
          drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
        } 
      } 
      if (props.getKetsuryugan() == 1) {
        this.mc.renderEngine.bindTexture(this.ketsuryugan);
        if (props.getmangekyouSharingan() >= 1) {
          drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon() + 20 + 20 * props.getrinnegan(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
        } else {
          drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon() + 20 * props.getrinnegan(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
        } 
      } 
      if (props.getJougan() >= 1) {
        this.mc.renderEngine.bindTexture(this.jougan);
        if (props.getmangekyouSharingan() >= 1) {
          drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon() + 20 + 20 * props.getrinnegan() + 20 * props.getKetsuryugan(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
        } else {
          drawTexturedModalRect(guiX + 125 + 20 * props.getbyakugan() + 20 * props.gettenseigan() + 20 * props.getsharinganicon() + 20 * props.getrinnegan() + 20 * props.getKetsuryugan(), guiY + 150, 0, 0, this.iconWidth, this.iconHeight);
        } 
      } 
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("gui.nin"), guiX + 10, guiY + 10, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("gui.tai"), guiX + 10, guiY + 25, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("gui.gen"), guiX + 10, guiY + 40, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("gui.sur"), guiX + 10, guiY + 55, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("gui.sum"), guiX + 10, guiY + 70, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("gui.kin"), guiX + 10, guiY + 85, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("gui.sen"), guiX + 10, guiY + 100, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("gui.med"), guiX + 10, guiY + 115, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("gui.spd"), guiX + 10, guiY + 130, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("gui.int"), guiX + 10, guiY + 145, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("gui.all"), guiX + 10, guiY + 160, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("gui.cla"), guiX + 125, guiY + 10, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("gui.ran"), guiX + 125, guiY + 30, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("gui.nat"), guiX + 125, guiY + 50, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + StatCollector.translateToLocal("gui.kkg"), guiX + 125, guiY + 100, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getHealth(), guiX + 90, guiY + 115, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + (int)(ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getSpeed() * 200.0D - 20.0D), guiX + 90, guiY + 130, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + (int)(ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getTaijutsu() * 50.0D - 50.0D), guiX + 90, guiY + 25, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getGenjutsu(), guiX + 90, guiY + 40, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getIntelligence(), guiX + 90, guiY + 145, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getKinjutsu(), guiX + 90, guiY + 85, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getMaxMana() / 5 - 5), guiX + 90, guiY + 10, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getMaxSenjutsu() / 5), guiX + 90, guiY + 100, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + tools.translateClan(ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getClanName()), guiX + 167, guiY + 10, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + tools.translateRank(ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getRankName()), guiX + 160, guiY + 30, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getShurikenjutsu(), guiX + 90, guiY + 55, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getSummoning(), guiX + 90, guiY + 70, 0);
      this.mc.fontRenderer.drawString("" + EnumChatFormatting.BOLD + (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getHealth() + (int)(ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getSpeed() * 200.0D - 20.0D) + (int)(ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getKenjutsu() * 50.0D - 50.0D) + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getShurikenjutsu() + (int)(ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getTaijutsu() * 50.0D - 50.0D) + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getGenjutsu() + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getSummoning() + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getIntelligence() + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getKinjutsu() + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getMaxMana() / 5 - 5 + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getMaxSenjutsu() / 5), guiX + 90, guiY + 160, 0);
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
      this.mc.fontRenderer.drawString("Missions:", guiX + 10, guiY + 50, 0);
      this.mc.fontRenderer.drawString(": " + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getDQuests(), guiX + 35, guiY + 65, 0);
      this.mc.fontRenderer.drawString(": " + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getCQuests(), guiX + 35, guiY + 65 + this.iconHeight + 5, 0);
      this.mc.fontRenderer.drawString(": " + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getBQuests(), guiX + 35, guiY + 65 + this.iconHeight * 2 + 10, 0);
      this.mc.fontRenderer.drawString(": " + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getAQuests(), guiX + 35, guiY + 65 + this.iconHeight * 3 + 15, 0);
      this.mc.fontRenderer.drawString(": " + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getSQuests(), guiX + 35, guiY + 65 + this.iconHeight * 4 + 20, 0);
      this.mc.fontRenderer.drawString(": " + ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getSSQuests(), guiX + 35, guiY + 65 + this.iconHeight * 5 + 25, 0);
    } 
    String EXP = EnumChatFormatting.WHITE + "" + EnumChatFormatting.BOLD + "EXP: " + props.getChakraExperience() + "/" + (props.getLevel() / 4 + 1);
    String LVL = EnumChatFormatting.WHITE + "" + EnumChatFormatting.BOLD + "LVL: " + props.getLevel();
    String JP = EnumChatFormatting.WHITE + "" + EnumChatFormatting.BOLD + "JP: " + props.getJutsuPoints();
    String SP = EnumChatFormatting.WHITE + "" + EnumChatFormatting.BOLD + "SP: " + props.getSkillPoints();
    this.mc.fontRenderer.drawString(EXP, guiX + 30 - EXP.length() - 5, guiY + 188, 0);
    this.mc.fontRenderer.drawString(JP, guiX + 200 - JP.length() - 4, guiY + 188, 0);
    this.mc.fontRenderer.drawString(LVL, guiX + 100 - LVL.length() - 5, guiY + 188, 0);
    this.mc.fontRenderer.drawString(SP, guiX + 150 - SP.length() - 4, guiY + 188, 0);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glDisable(2896);
    this.mc.getTextureManager().bindTexture(this.Empty);
    double p1 = props.getChakraExperience();
    double p2 = (props.getLevel() / 4 + 1);
    int p3 = (int)(241.0D * p1 / p2);
    drawTexturedModalRect(guiX + 15, guiY + 197, 0, 0, this.iconWidth + 225, 7);
    drawTexturedModalRect(guiX + 15, guiY + 199, 0, 7, p3, 8);
    initGui();
    super.drawScreen(x, y, ticks);
  }
  
  protected void actionPerformed(GuiButton button) {
    ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer);
    switch (button.id) {
      case 0:
        if (!this.missions && 
          props.getSkillPoints() >= 1) {
          props.setNinjutsu(props.getNinjutsu() + 5);
          props.setCurrentMana(props.getCurrentMana() + 5);
          PacketDispatcher.sendToServer((IMessage)new AddNinjutsuMessage());
          props.setSkillPoints(props.getSkillPoints() - 1);
          PacketDispatcher.sendToServer((IMessage)new SubtractSkillPointMessage());
        } 
        break;
      case 1:
        if (!this.missions && props.getTaijutsu() <= 11.0D && 
          props.getSkillPoints() >= 1) {
          props.setTaijutsu(props.getTaijutsu() + 0.02D);
          PacketDispatcher.sendToServer((IMessage)new AddTaijutsuMessage());
          props.setSkillPoints(props.getSkillPoints() - 1);
          PacketDispatcher.sendToServer((IMessage)new SubtractSkillPointMessage());
        } 
        break;
      case 2:
        if (!this.missions && props.getGenjutsu() <= 199 && 
          props.getSkillPoints() >= 1) {
          props.setGenjutsu(props.getGenjutsu() + 1);
          PacketDispatcher.sendToServer((IMessage)new AddGenjutsuMessage());
          props.setSkillPoints(props.getSkillPoints() - 1);
          PacketDispatcher.sendToServer((IMessage)new SubtractSkillPointMessage());
        } 
        break;
      case 4:
        if (!this.missions && props.getShurikenjutsu() <= 99 && 
          props.getSkillPoints() >= 1) {
          props.setShurikenjutsu(props.getShurikenjutsu() + 1);
          PacketDispatcher.sendToServer((IMessage)new AddShurikenjutsuMessage());
          props.setSkillPoints(props.getSkillPoints() - 1);
          PacketDispatcher.sendToServer((IMessage)new SubtractSkillPointMessage());
        } 
        break;
      case 5:
        if (!this.missions && props.getSummoning() <= 299 && 
          props.getSkillPoints() >= 1) {
          props.setSummoning(props.getSummoning() + 1);
          PacketDispatcher.sendToServer((IMessage)new AddSummoningMessage());
          props.setSkillPoints(props.getSkillPoints() - 1);
          PacketDispatcher.sendToServer((IMessage)new SubtractSkillPointMessage());
        } 
        break;
      case 6:
        if (!this.missions && props.getKinjutsu() <= 99 && 
          props.getSkillPoints() >= 1) {
          props.setKinjutsu(props.getKinjutsu() + 1);
          PacketDispatcher.sendToServer((IMessage)new AddKinjutsuMessage());
          props.setSkillPoints(props.getSkillPoints() - 1);
          PacketDispatcher.sendToServer((IMessage)new SubtractSkillPointMessage());
        } 
        break;
      case 7:
        if (!this.missions && props.getSenjutsu() <= 2995 && 
          props.getSkillPoints() >= 1) {
          props.setSenjutsu(props.getSenjutsu() + 5);
          PacketDispatcher.sendToServer((IMessage)new AddSenjutsuMessage());
          props.setCurrentSenjutsu(props.getCurrentSenjutsu() + 5);
          PacketDispatcher.sendToServer((IMessage)new AddSenjutsuMessage());
          props.setSkillPoints(props.getSkillPoints() - 1);
          PacketDispatcher.sendToServer((IMessage)new SubtractSkillPointMessage());
        } 
        break;
      case 8:
        if (!this.missions && props.getHealth() <= 499 && 
          props.getSkillPoints() >= 1) {
          props.setHealth(props.getHealth() + 1);
          PacketDispatcher.sendToServer((IMessage)new AddHealthMessage());
          props.setSkillPoints(props.getSkillPoints() - 1);
          PacketDispatcher.sendToServer((IMessage)new SubtractSkillPointMessage());
        } 
        break;
      case 9:
        if (!this.missions && props.getSpeed() <= 0.2D && 
          props.getSkillPoints() >= 1) {
          props.setSpeed(props.getSpeed() + 0.005D);
          PacketDispatcher.sendToServer((IMessage)new AddSpeedMessage());
          props.setSkillPoints(props.getSkillPoints() - 1);
          PacketDispatcher.sendToServer((IMessage)new SubtractSkillPointMessage());
        } 
        break;
      case 10:
        if (!this.missions) {
          this.missions = true;
          break;
        } 
        if (this.missions)
          this.missions = false; 
        break;
    } 
    super.actionPerformed(button);
  }
  
  protected void mouseClicked(int x, int y, int button) {
    super.mouseClicked(x, y, button);
    if (this.guiWidth + 6 > x || x > this.guiWidth + 6 + this.tabWidth || this.guiHeight + 7 > y || y <= this.guiHeight + 7 + this.tabHeight);
    this.Clicked1 = true;
    this.Clicked2 = false;
    drawTexturedModalRect(this.guiX + 60, this.guiY + 7, 0, 184, this.tabWidth, this.tabHeight);
    if (this.guiWidth + 6 > x || x > this.guiWidth + 6 + this.tabWidth || this.guiHeight + 27 > y || y <= this.guiHeight + 27 + this.tabHeight);
    this.Clicked1 = false;
    this.Clicked2 = true;
    drawTexturedModalRect(this.guiX + 60, this.guiY + 27, 0, 168, this.tabWidth, this.tabHeight);
  }
  
  public boolean doesGuiPauseGame() {
    return false;
  }
}

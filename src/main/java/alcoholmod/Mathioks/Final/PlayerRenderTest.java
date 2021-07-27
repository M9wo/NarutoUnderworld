package alcoholmod.Mathioks.Final;

import SixPathsMode.ModelSixPaths;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.Transformations.CurseMark2Model;
import alcoholmod.Mathioks.Final.Transformations.CursedSealRank2HandsModel;
import alcoholmod.Mathioks.Final.Transformations.ModelAshuraMode;
import alcoholmod.Mathioks.Final.Transformations.SageModeModel;
import alcoholmod.Mathioks.FinalBijuu.ModelMatatabi;
import alcoholmod.Mathioks.FinalBijuu.ModelSaiken;
import alcoholmod.Mathioks.Jinshuriki.JinshurikiUnleashedModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

public class PlayerRenderTest extends RenderPlayer {
  public ResourceLocation matatabi = new ResourceLocation("tm:textures/entity/Matatabi.png");
  
  public ResourceLocation saiken = new ResourceLocation("tm:textures/entity/Seiken.png");
  
  public ResourceLocation Jinshuuriki = new ResourceLocation("tm:textures/entity/BijuuForm.png");
  
  public ResourceLocation CurseSeal = new ResourceLocation("tm:textures/entity/CurseSeal.png");
  
  public ResourceLocation CurseSealJH = new ResourceLocation("tm:textures/entity/CurseSealJH.png");
  
  public ResourceLocation CurseSealBf = new ResourceLocation("tm:textures/entity/CurseMark.png");
  
  public ResourceLocation SageMode = new ResourceLocation("tm:textures/entity/sage.png");
  
  public ResourceLocation SageClothes = new ResourceLocation("tm:textures/entity/SageModeS.png");
  
  public ResourceLocation Hidan = new ResourceLocation("tm:textures/entity/HidanTrans.png");
  
  public ResourceLocation Hashirama = new ResourceLocation("tm:textures/entity/HashiramaStyle.png");
  
  public ResourceLocation Otsutsuki = new ResourceLocation("tm:textures/entity/Otsutsuki.png");
  
  public ResourceLocation Tsunade = new ResourceLocation("tm:textures/entity/TsunadeCrest.png");
  
  public ResourceLocation TailedBeastMode = new ResourceLocation("tm:textures/entity/TailedBeastMode.png");
  
  public ResourceLocation CurseSeal2Mode = new ResourceLocation("tm:textures/entity/New.png");
  
  public ResourceLocation CurseSeal2Mode1 = new ResourceLocation("tm:textures/entity/CurseEarthLow.png");
  
  public ResourceLocation SixPaths = new ResourceLocation("tm:textures/entity/6paths.png");
  
  public ResourceLocation SixPaths1 = new ResourceLocation("tm:textures/entity/6PathMode.png");
  
  public ResourceLocation ZetsuMode = new ResourceLocation("tm:textures/entity/ZetsuMode.png");
  
  public ResourceLocation ashuraMode = new ResourceLocation("tm:textures/entity/ashura.png");
  
  public ResourceLocation Sharingan = new ResourceLocation("tm:textures/dojutsu/sharingan.png");
  
  public ResourceLocation Sharingan1 = new ResourceLocation("tm:textures/dojutsu/sharingan2TO.png");
  
  public ResourceLocation Sharingan2 = new ResourceLocation("tm:textures/dojutsu/sharingan1TO.png");
  
  public ResourceLocation Rinnegan1 = new ResourceLocation("tm:textures/dojutsu/sharingan shisui x rinnegan.png");
  
  public ResourceLocation Senjutsu = new ResourceLocation("tm:textures/dojutsu/Senjutsu.png");
  
  public ResourceLocation Rinnegan2 = new ResourceLocation("tm:textures/dojutsu/Ryuuho Rinne-Sharingan.png");
  
  public ResourceLocation Sharingan7 = new ResourceLocation("tm:textures/dojutsu/Ryuuho Mangekyo.png");
  
  public ResourceLocation Sharingan8 = new ResourceLocation("tm:textures/dojutsu/Ryuuho Eternal Mangekyou.png");
  
  public ResourceLocation Rinnegan3 = new ResourceLocation("tm:textures/dojutsu/Rinnegan.png");
  
  public ResourceLocation Sharingan10 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan shisui.png");
  
  public ResourceLocation Sharingan11 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Shin.png");
  
  public ResourceLocation Sharingan12 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan sasuke.png");
  
  public ResourceLocation Sharingan13 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Rai.png");
  
  public ResourceLocation Sharingan14 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Naori.png");
  
  public ResourceLocation Sharingan15 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Naka.png");
  
  public ResourceLocation Sharingan16 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Madara.png");
  
  public ResourceLocation Sharingan17 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Kakashi&Obito.png");
  
  public ResourceLocation Sharingan18 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Izuna.png");
  
  public ResourceLocation Sharingan19 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan itachi.png");
  
  public ResourceLocation Sharingan20 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Indra.png");
  
  public ResourceLocation Sharingan21 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan eternel Sasuke.png");
  
  public ResourceLocation Sharingan22 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan eternel Madara.png");
  
  public ResourceLocation Sharingan23 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan eternel Itachi.png");
  
  public ResourceLocation Rinnegan4 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan eternel & rinnegan Sasuke.png");
  
  public ResourceLocation Sharingan25 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Baru.png");
  
  public ResourceLocation Sharingan26 = new ResourceLocation("tm:textures/dojutsu/Eternal Shin.png");
  
  public ResourceLocation Sharingan27 = new ResourceLocation("tm:textures/dojutsu/Eternal Rai.png");
  
  public ResourceLocation Sharingan28 = new ResourceLocation("tm:textures/dojutsu/Eternal Naori.png");
  
  public ResourceLocation Sharingan29 = new ResourceLocation("tm:textures/dojutsu/Eternal Naka.png");
  
  public ResourceLocation Sharingan30 = new ResourceLocation("tm:textures/dojutsu/Eternal Mangekyou Sharingan Shisui.png");
  
  public ResourceLocation Sharingan31 = new ResourceLocation("tm:textures/dojutsu/Eternal Mangekyou Sharingan Obito.png");
  
  public ResourceLocation Sharingan32 = new ResourceLocation("tm:textures/dojutsu/Eternal Mangekyou Sharingan Izuna.png");
  
  public ResourceLocation Sharingan33 = new ResourceLocation("tm:textures/dojutsu/Eternal Indra.png");
  
  public ResourceLocation Sharingan34 = new ResourceLocation("tm:textures/dojutsu/Eternal Baru.png");
  
  public ResourceLocation Byakugan = new ResourceLocation("tm:textures/dojutsu/byakugan.png");
  
  public ModelMatatabi tutModel;
  
  public ModelSaiken tutModel2;
  
  public JinshurikiUnleashedModel tutModel3;
  
  public ModelBiped tutModel4;
  
  public CursedSealRank2HandsModel tutModel5;
  
  public SageModeModel tutModel6;
  
  public CurseMark2Model tutModel7;
  
  public ModelSixPaths tutModel8;
  
  public ModelAshuraMode tutModel9;
  
  public PlayerRenderTest() {
    this.mainModel = (ModelBase)new ModelBiped(0.0F);
    this.modelBipedMain = (ModelBiped)this.mainModel;
    this.modelArmorChestplate = new ModelBiped(1.0F);
    this.modelArmor = new ModelBiped(0.5F);
    this.tutModel = new ModelMatatabi();
    this.tutModel2 = new ModelSaiken();
    this.tutModel3 = new JinshurikiUnleashedModel();
    this.tutModel4 = new ModelBiped(0.5F);
    this.tutModel5 = new CursedSealRank2HandsModel();
    this.tutModel6 = new SageModeModel();
    this.tutModel7 = new CurseMark2Model();
    this.tutModel8 = new ModelSixPaths();
    this.tutModel9 = new ModelAshuraMode();
  }
  
  public void renderModel(EntityLivingBase entity, float par2, float par3, float par4, float par5, float par6, float par7) {
    super.renderModel(entity, par2, par3, par4, par5, par6, par7);
    ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entity);
  }
}

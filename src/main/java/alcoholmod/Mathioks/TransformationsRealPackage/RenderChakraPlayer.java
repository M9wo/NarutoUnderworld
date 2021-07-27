package alcoholmod.Mathioks.TransformationsRealPackage;

import CompleteSusanoo.EmptyModel;
import CompleteSusanoo.EmptyModelBiped;
import FlashModels.JuubiFModel;
import FlashModels.JuubiSModel;
import FlashModels.SeparateArmTextures;
import FlashModels.sixpathsorbs;
import FlashModels.sixpathsshield;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.Transformations.CurseMark2Model;
import alcoholmod.Mathioks.Final.Transformations.CursedSealRank2HandsModel;
import alcoholmod.Mathioks.Final.Transformations.ModelAshuraMode;
import alcoholmod.Mathioks.Final.Transformations.SageModeModel;
import alcoholmod.Mathioks.FinalBijuu.Model10Tails;
import alcoholmod.Mathioks.FinalBijuu.ModelChomei;
import alcoholmod.Mathioks.FinalBijuu.ModelGyuki;
import alcoholmod.Mathioks.FinalBijuu.ModelIsobu;
import alcoholmod.Mathioks.FinalBijuu.ModelJuubi;
import alcoholmod.Mathioks.FinalBijuu.ModelKokuo;
import alcoholmod.Mathioks.FinalBijuu.ModelKyuubi;
import alcoholmod.Mathioks.FinalBijuu.ModelKyuubi1Tail;
import alcoholmod.Mathioks.FinalBijuu.ModelKyuubi1Tail2;
import alcoholmod.Mathioks.FinalBijuu.ModelMatatabi;
import alcoholmod.Mathioks.FinalBijuu.ModelSaiken;
import alcoholmod.Mathioks.FinalBijuu.ModelShukaku;
import alcoholmod.Mathioks.FinalBijuu.ModelSonGoku;
import alcoholmod.Mathioks.SmoshXDDDModels.ChomeiFModel;
import alcoholmod.Mathioks.SmoshXDDDModels.ChomeiSModel;
import alcoholmod.Mathioks.SmoshXDDDModels.GokuFModel;
import alcoholmod.Mathioks.SmoshXDDDModels.GokuSModel;
import alcoholmod.Mathioks.SmoshXDDDModels.GyukiFModel;
import alcoholmod.Mathioks.SmoshXDDDModels.GyukiSModel;
import alcoholmod.Mathioks.SmoshXDDDModels.IsobuFModel;
import alcoholmod.Mathioks.SmoshXDDDModels.IsobuSModel;
import alcoholmod.Mathioks.SmoshXDDDModels.KokuoFModel;
import alcoholmod.Mathioks.SmoshXDDDModels.KokuoSModel;
import alcoholmod.Mathioks.SmoshXDDDModels.KuramaFModel;
import alcoholmod.Mathioks.SmoshXDDDModels.KuramaSModel;
import alcoholmod.Mathioks.SmoshXDDDModels.MatatabiFModel;
import alcoholmod.Mathioks.SmoshXDDDModels.MatatabiSModel;
import alcoholmod.Mathioks.SmoshXDDDModels.SaikenFModel;
import alcoholmod.Mathioks.SmoshXDDDModels.SaikenSModel;
import alcoholmod.Mathioks.SmoshXDDDModels.ShukakuFModel;
import alcoholmod.Mathioks.SmoshXDDDModels.ShukakuSModel;
import alcoholmod.Mathioks.SusanoCage.SasukeSusanoCageModel;
import alcoholmod.Mathioks.SusanooArmor.MathioksSusanoArmorModel;
import alcoholmod.Mathioks.SusanooArmor.SasukeSusanoArmorModel;
import alcoholmod.Mathioks.SusanooComplete.IndraSusanoCompleteModel;
import alcoholmod.Mathioks.SusanooComplete.ItachiSusanoCompleteModel;
import alcoholmod.Mathioks.SusanooComplete.MadaraSusanoCompleteModel;
import alcoholmod.Mathioks.SusanooComplete.MathioksSusanoCompleteModel;
import alcoholmod.Mathioks.SusanooComplete.ObitoSusanoCompleteModel;
import alcoholmod.Mathioks.SusanooComplete.SasukeSusanoCompleteModel;
import alcoholmod.Mathioks.SusanooComplete.ShisuiSusanoCompleteModel;
import alcoholmod.Mathioks.SusanooPerfect.MathioksSusanoPerfectModel;
import alcoholmod.Mathioks.SusanooPerfect.SasukeSusanoPerfectModel;
import alcoholmod.Mathioks.SusanooPerfect.SusanoPerfectBeastModel;
import alcoholmod.Mathioks.SusanooSkeleton.IndraSusanoSkeletonModel;
import alcoholmod.Mathioks.SusanooSkeleton.ItachiSusanoSkeletonModel;
import alcoholmod.Mathioks.SusanooSkeleton.MadaraSusanoSkeletonModel;
import alcoholmod.Mathioks.SusanooSkeleton.ObitoSusanoSkeletonModel;
import alcoholmod.Mathioks.SusanooSkeleton.SasukeSusanoSkeletonModel;
import alcoholmod.Mathioks.SusanooSkeleton.ShisuiSusanoSkeletonModel;
import alcoholmod.Mathioks.UltimatePowers.ModelTenseigan;
import lc208.nam.render.customplayer.NekoCustomModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class RenderChakraPlayer extends RenderPlayer {
  private static final ResourceLocation TenTailsJinchuuriki = new ResourceLocation("tm:textures/forms/ten_tails_jinch.png");
  
  private static final ResourceLocation SixPathsOrbs6 = new ResourceLocation("tm:textures/forms/sixpathsorbs6.png");
  
  private static final ResourceLocation SixPathsOrbs5 = new ResourceLocation("tm:textures/forms/sixpathsorbs5.png");
  
  private static final ResourceLocation SixPathsOrbs4 = new ResourceLocation("tm:textures/forms/sixpathsorbs4.png");
  
  private static final ResourceLocation SixPathsOrbs3 = new ResourceLocation("tm:textures/forms/sixpathsorbs3.png");
  
  private static final ResourceLocation SixPathsOrbs2 = new ResourceLocation("tm:textures/forms/sixpathsorbs2.png");
  
  private static final ResourceLocation SixPathsOrbs1 = new ResourceLocation("tm:textures/forms/sixpathsorbs1.png");
  
  private static final ResourceLocation SixPathsOrbs0 = new ResourceLocation("tm:textures/forms/sixpathsorbs0.png");
  
  private static final ResourceLocation SixPathsShield = new ResourceLocation("tm:textures/forms/sixpathsshield.png");
  
  private static final ResourceLocation SixPathsSageMode = new ResourceLocation("tm:textures/forms/sixpathssagemode.png");
  
  private static final ResourceLocation SixPathsSageModeEyes = new ResourceLocation("tm:textures/forms/sixpathssagemodeeyes.png");
  
  private static final ResourceLocation GateOfOpening = new ResourceLocation("tm:textures/forms/Gate_Of_Opening.png");
  
  private static final ResourceLocation GateOfHealing = new ResourceLocation("tm:textures/forms/Gate_of_Healing.png");
  
  private static final ResourceLocation GateOfLife = new ResourceLocation("tm:textures/forms/Gate_of_Life.png");
  
  private static final ResourceLocation GateOfPain = new ResourceLocation("tm:textures/forms/Gate_of_Pain.png");
  
  private static final ResourceLocation GateOfLimit = new ResourceLocation("tm:textures/forms/Gate_of_Limit.png");
  
  private static final ResourceLocation GateOfView = new ResourceLocation("tm:textures/forms/Gate_of_View.png");
  
  private static final ResourceLocation GateOfWonder = new ResourceLocation("tm:textures/forms/Gate_of_Wonder.png");
  
  private static final ResourceLocation GateOfDeath = new ResourceLocation("tm:textures/forms/Gate_of_Death.png");
  
  private static final ResourceLocation ByakugouOn = new ResourceLocation("tm:textures/forms/byakugoON.png");
  
  private static final ResourceLocation ByakugouOff = new ResourceLocation("tm:textures/forms/byakugoOFF.png");
  
  private static final ResourceLocation Jougan = new ResourceLocation("tm:textures/dojutsu/apollo/jougan.png");
  
  private static final ResourceLocation RedJougan = new ResourceLocation("tm:textures/dojutsu/apollo/jougan2.png");
  
  private static final ResourceLocation KarmaSealJigen1 = new ResourceLocation("tm:textures/forms/karmajigen1.png");
  
  private static final ResourceLocation KarmaSealJigen2 = new ResourceLocation("tm:textures/forms/karmajigen2.png");
  
  private static final ResourceLocation KarmaSealJigen2_2 = new ResourceLocation("tm:textures/forms/karmajigen2_2.png");
  
  private static final ResourceLocation KarmaSealBoruto1 = new ResourceLocation("tm:textures/forms/karmaboruto1.png");
  
  private static final ResourceLocation KarmaSealBoruto2 = new ResourceLocation("tm:textures/forms/karmaboruto2.png");
  
  private static final ResourceLocation KarmaSealBoruto2_2 = new ResourceLocation("tm:textures/forms/karmaboruto2_2.png");
  
  private static final ResourceLocation KarmaSealKawaki1 = new ResourceLocation("tm:textures/forms/karmakawaki1.png");
  
  private static final ResourceLocation KarmaSealKawaki2 = new ResourceLocation("tm:textures/forms/karmakawaki2.png");
  
  private static final ResourceLocation KarmaSealKawaki2_2 = new ResourceLocation("tm:textures/forms/karmakawaki2_2.png");
  
  private static final ResourceLocation Candrom1Tomoe = new ResourceLocation("tm:textures/dojutsu/apollo/Candrom_1Tomoe.png");
  
  private static final ResourceLocation Candrom2Tomoe = new ResourceLocation("tm:textures/dojutsu/apollo/Candrom_2Tomoe.png");
  
  private static final ResourceLocation Candrom3Tomoe = new ResourceLocation("tm:textures/dojutsu/apollo/Candrom_3Tomoe.png");
  
  private static final ResourceLocation CandromMS = new ResourceLocation("tm:textures/dojutsu/apollo/Mangekyou_Candrom.png");
  
  private static final ResourceLocation CandromEMS = new ResourceLocation("tm:textures/dojutsu/apollo/EternalMangekyou_Candrom.png");
  
  private static final ResourceLocation CandromSusanoCage = new ResourceLocation("tm:textures/susano/apollo/CandromSusanoCage.png");
  
  private static final ResourceLocation CandromSusanoSkeleton = new ResourceLocation("tm:textures/susano/apollo/CandromSusanoSkeleton.png");
  
  private static final ResourceLocation CandromSusanoComplete = new ResourceLocation("tm:textures/susano/apollo/CandromSusanoComplete.png");
  
  private static final ResourceLocation CandromSusanoArmor = new ResourceLocation("tm:textures/susano/apollo/CandromSusanoArmor.png");
  
  private static final ResourceLocation MSDragozai = new ResourceLocation("tm:textures/dojutsu/apollo/Mangekyou_Dragozai.png");
  
  private static final ResourceLocation EMSDragozai = new ResourceLocation("tm:textures/dojutsu/apollo/EternalMangekyou_Dragozai.png");
  
  private static final ResourceLocation MSCoralSensei = new ResourceLocation("tm:textures/dojutsu/apollo/Mangekyou_CoralSensei.png");
  
  private static final ResourceLocation EMSCoralSensei = new ResourceLocation("tm:textures/dojutsu/apollo/EternalMangekyou_CoralSensei.png");
  
  private static final ResourceLocation MSMentroz = new ResourceLocation("tm:textures/dojutsu/apollo/Mangekyou_Mentroz.png");
  
  private static final ResourceLocation EMSMentroz = new ResourceLocation("tm:textures/dojutsu/apollo/EternalMangekyou_Mentroz.png");
  
  private static final ResourceLocation MSMcNASTY = new ResourceLocation("tm:textures/dojutsu/apollo/Mangekyou_McNASTY.png");
  
  private static final ResourceLocation EMSMcNASTY = new ResourceLocation("tm:textures/dojutsu/apollo/EternalMangekyou_McNASTY.png");
  
  private static final ResourceLocation MSCharlie = new ResourceLocation("tm:textures/dojutsu/apollo/Mangekyou_Charlie.png");
  
  private static final ResourceLocation EMSCharlie = new ResourceLocation("tm:textures/dojutsu/apollo/EternalMangekyou_Charlie.png");
  
  private static final ResourceLocation MSGrimbite = new ResourceLocation("tm:textures/dojutsu/apollo/Mangekyou_Grimbite.png");
  
  private static final ResourceLocation EMSGrimbite = new ResourceLocation("tm:textures/dojutsu/apollo/EternalMangekyou_Grimbite.png");
  
  private static final ResourceLocation MSha1den = new ResourceLocation("tm:textures/dojutsu/apollo/Mangekyou_ha1den.png");
  
  private static final ResourceLocation EMSha1den = new ResourceLocation("tm:textures/dojutsu/apollo/EternalMangekyou_ha1den.png");
  
  private static final ResourceLocation MSjanglolroflmao = new ResourceLocation("tm:textures/dojutsu/apollo/Mangekyou_janglolroflmao.png");
  
  private static final ResourceLocation EMSjanglolroflmao = new ResourceLocation("tm:textures/dojutsu/apollo/EternalMangekyou_janglolroflmao.png");
  
  private static final ResourceLocation MSJORDAN = new ResourceLocation("tm:textures/dojutsu/apollo/Mangekyou_JORDAN.png");
  
  private static final ResourceLocation EMSJORDAN = new ResourceLocation("tm:textures/dojutsu/apollo/EternalMangekyou_JORDAN.png");
  
  private static final ResourceLocation MSL0rdMadaraUchiha = new ResourceLocation("tm:textures/dojutsu/apollo/Mangekyou_L0rdMadaraUchiha.png");
  
  private static final ResourceLocation EMSL0rdMadaraUchiha = new ResourceLocation("tm:textures/dojutsu/apollo/EternalMangekyou_L0rdMadaraUchiha.png");
  
  private static final ResourceLocation MSTomtomcaty = new ResourceLocation("tm:textures/dojutsu/apollo/Mangekyou_Tomtomcaty.png");
  
  private static final ResourceLocation EMSTomtomcaty = new ResourceLocation("tm:textures/dojutsu/apollo/EternalMangekyou_Tomtomcaty.png");
  
  private static final ResourceLocation MSFujimoto = new ResourceLocation("tm:textures/dojutsu/apollo/Mangekyou_Fujimoto.png");
  
  private static final ResourceLocation EMSFujimoto = new ResourceLocation("tm:textures/dojutsu/apollo/EternalMangekyou_Fujimoto.png");
  
  private static final ResourceLocation MSYunus = new ResourceLocation("tm:textures/dojutsu/apollo/Mangekyou_Yunus.png");
  
  private static final ResourceLocation EMSYunus = new ResourceLocation("tm:textures/dojutsu/apollo/EternalMangekyou_Yunus.png");
  
  private static final ResourceLocation MSGreg = new ResourceLocation("tm:textures/dojutsu/stardust/Mangekyou_Greg.png");
  
  private static final ResourceLocation EMSGreg = new ResourceLocation("tm:textures/dojutsu/stardust/EternalMangekyou_Greg.png");
  
  private static final ResourceLocation MSZiggy = new ResourceLocation("tm:textures/dojutsu/stardust/Mangekyou_Ziggy.png");
  
  private static final ResourceLocation EMSZiggy = new ResourceLocation("tm:textures/dojutsu/stardust/EternalMangekyou_Ziggy.png");
  
  private static final ResourceLocation MSShiro = new ResourceLocation("tm:textures/dojutsu/stardust/Mangekyou_Shiro.png");
  
  private static final ResourceLocation EMSShiro = new ResourceLocation("tm:textures/dojutsu/stardust/EternalMangekyou_Shiro.png");
  
  private static final ResourceLocation MSGrim = new ResourceLocation("tm:textures/dojutsu/stardust/Mangekyou_Grim.png");
  
  private static final ResourceLocation EMSGrim = new ResourceLocation("tm:textures/dojutsu/stardust/EternalMangekyou_Grim.png");
  
  private static final ResourceLocation RinneganCandrom3Tomoe = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Candrom_3Tomoe_Rinnegan.png");
  
  private static final ResourceLocation RinneganBaru = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Baru.png");
  
  private static final ResourceLocation RinneganCandrom = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Candrom.png");
  
  private static final ResourceLocation RinneganCharlie = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Charlie.png");
  
  private static final ResourceLocation RinneganCoralSensei = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_CoralSensei.png");
  
  private static final ResourceLocation RinneganDragozai = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Dragozai.png");
  
  private static final ResourceLocation RinneganGrimbite = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Grimbite.png");
  
  private static final ResourceLocation Rinneganha1den = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_ha1den.png");
  
  private static final ResourceLocation RinneganIndra = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Indra.png");
  
  private static final ResourceLocation RinneganItachi = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Itachi.png");
  
  private static final ResourceLocation RinneganIzuna = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Izuna.png");
  
  private static final ResourceLocation Rinneganjanglolroflmao = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_janglolroflmao.png");
  
  private static final ResourceLocation RinneganJORDAN = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_JORDAN.png");
  
  private static final ResourceLocation RinneganL0rdMadaraUchiha = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_L0rdMadaraUchiha.png");
  
  private static final ResourceLocation RinneganMadara = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Madara.png");
  
  private static final ResourceLocation RinneganMcNASTY = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_McNASTY.png");
  
  private static final ResourceLocation RinneganMentroz = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Mentroz.png");
  
  private static final ResourceLocation RinneganNaka = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Naka.png");
  
  private static final ResourceLocation RinneganNaori = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Naori.png");
  
  private static final ResourceLocation RinneganNick = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Nick.png");
  
  private static final ResourceLocation RinneganObito = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Obito.png");
  
  private static final ResourceLocation RinneganRai = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Rai.png");
  
  private static final ResourceLocation RinneganRyuuho = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Ryuuho.png");
  
  private static final ResourceLocation RinneganSasuke = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Sasuke.png");
  
  private static final ResourceLocation RinneganShin = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Shin.png");
  
  private static final ResourceLocation RinneganShisui = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Shisui.png");
  
  private static final ResourceLocation RinneganTomtomcaty = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Tomtomcaty.png");
  
  private static final ResourceLocation RinneganFujimoto = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Fujimoto.png");
  
  private static final ResourceLocation RinneganYunus = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Yunus.png");
  
  private static final ResourceLocation Rinnegan = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan.png");
  
  private static final ResourceLocation RinneganSharingan = new ResourceLocation("tm:textures/dojutsu/apollo/Rinnegan/Rinnegan_Sharingan.png");
  
  private static final ResourceLocation RinneganGreg = new ResourceLocation("tm:textures/dojutsu/stardust/Rinnegan/Rinnegan_Greg.png");
  
  private static final ResourceLocation RinneganZiggy = new ResourceLocation("tm:textures/dojutsu/stardust/Rinnegan/Rinnegan_Ziggy.png");
  
  private static final ResourceLocation RinneganShiro = new ResourceLocation("tm:textures/dojutsu/stardust/Rinnegan/Rinnegan_Shiro.png");
  
  private static final ResourceLocation RinneganGrim = new ResourceLocation("tm:textures/dojutsu/stardust/Rinnegan/Rinnegan_Grim.png");
  
  private static final ResourceLocation CharlieSusanoCage = new ResourceLocation("tm:textures/susano/apollo/CharlieSusanoCage.png");
  
  private static final ResourceLocation CharlieSusanoSkeleton = new ResourceLocation("tm:textures/susano/apollo/CharlieSusanoSkeleton.png");
  
  private static final ResourceLocation CharlieSusanoComplete = new ResourceLocation("tm:textures/susano/apollo/CharlieSusanoComplete.png");
  
  private static final ResourceLocation CharlieSusanoArmor = new ResourceLocation("tm:textures/susano/apollo/CharlieSusanoArmor.png");
  
  private static final ResourceLocation CoralSenseiSusanoCage = new ResourceLocation("tm:textures/susano/apollo/CoralSenseiSusanoCage.png");
  
  private static final ResourceLocation CoralSenseiSusanoSkeleton = new ResourceLocation("tm:textures/susano/apollo/CoralSenseiSusanoSkeleton.png");
  
  private static final ResourceLocation CoralSenseiSusanoComplete = new ResourceLocation("tm:textures/susano/apollo/CoralSenseiSusanoComplete.png");
  
  private static final ResourceLocation CoralSenseiSusanoArmor = new ResourceLocation("tm:textures/susano/apollo/CoralSenseiSusanoArmor.png");
  
  private static final ResourceLocation DragozaiSusanoCage = new ResourceLocation("tm:textures/susano/apollo/DragozaiSusanoCage.png");
  
  private static final ResourceLocation DragozaiSusanoSkeleton = new ResourceLocation("tm:textures/susano/apollo/DragozaiSusanoSkeleton.png");
  
  private static final ResourceLocation DragozaiSusanoComplete = new ResourceLocation("tm:textures/susano/apollo/DragozaiSusanoComplete.png");
  
  private static final ResourceLocation DragozaiSusanoArmor = new ResourceLocation("tm:textures/susano/apollo/DragozaiSusanoArmor.png");
  
  private static final ResourceLocation GrimbiteSusanoCage = new ResourceLocation("tm:textures/susano/apollo/GrimbiteSusanoCage.png");
  
  private static final ResourceLocation GrimbiteSusanoSkeleton = new ResourceLocation("tm:textures/susano/apollo/GrimbiteSusanoSkeleton.png");
  
  private static final ResourceLocation GrimbiteSusanoComplete = new ResourceLocation("tm:textures/susano/apollo/GrimbiteSusanoComplete.png");
  
  private static final ResourceLocation GrimbiteSusanoArmor = new ResourceLocation("tm:textures/susano/apollo/GrimbiteSusanoArmor.png");
  
  private static final ResourceLocation ha1denSusanoCage = new ResourceLocation("tm:textures/susano/apollo/ha1denSusanoCage.png");
  
  private static final ResourceLocation ha1denSusanoSkeleton = new ResourceLocation("tm:textures/susano/apollo/ha1denSusanoSkeleton.png");
  
  private static final ResourceLocation ha1denSusanoComplete = new ResourceLocation("tm:textures/susano/apollo/ha1denSusanoComplete.png");
  
  private static final ResourceLocation ha1denSusanoArmor = new ResourceLocation("tm:textures/susano/apollo/ha1denSusanoArmor.png");
  
  private static final ResourceLocation janglolroflmaoSusanoCage = new ResourceLocation("tm:textures/susano/apollo/janglolroflmaoSusanoCage.png");
  
  private static final ResourceLocation janglolroflmaoSusanoSkeleton = new ResourceLocation("tm:textures/susano/apollo/janglolroflmaoSusanoSkeleton.png");
  
  private static final ResourceLocation janglolroflmaoSusanoComplete = new ResourceLocation("tm:textures/susano/apollo/janglolroflmaoSusanoComplete.png");
  
  private static final ResourceLocation janglolroflmaoSusanoArmor = new ResourceLocation("tm:textures/susano/apollo/janglolroflmaoSusanoArmor.png");
  
  private static final ResourceLocation JORDANSusanoCage = new ResourceLocation("tm:textures/susano/apollo/JORDANSusanoCage.png");
  
  private static final ResourceLocation JORDANSusanoSkeleton = new ResourceLocation("tm:textures/susano/apollo/JORDANSusanoSkeleton.png");
  
  private static final ResourceLocation JORDANSusanoComplete = new ResourceLocation("tm:textures/susano/apollo/JORDANSusanoComplete.png");
  
  private static final ResourceLocation JORDANSusanoArmor = new ResourceLocation("tm:textures/susano/apollo/JORDANSusanoArmor.png");
  
  private static final ResourceLocation L0rdMadaraUchihaSusanoCage = new ResourceLocation("tm:textures/susano/apollo/L0rdMadaraUchihaSusanoCage.png");
  
  private static final ResourceLocation L0rdMadaraUchihaSusanoSkeleton = new ResourceLocation("tm:textures/susano/apollo/L0rdMadaraUchihaSusanoSkeleton.png");
  
  private static final ResourceLocation L0rdMadaraUchihaSusanoComplete = new ResourceLocation("tm:textures/susano/apollo/L0rdMadaraUchihaSusanoComplete.png");
  
  private static final ResourceLocation L0rdMadaraUchihaSusanoArmor = new ResourceLocation("tm:textures/susano/apollo/L0rdMadaraUchihaSusanoArmor.png");
  
  private static final ResourceLocation McNASTYSusanoCage = new ResourceLocation("tm:textures/susano/apollo/McNASTYSusanoCage.png");
  
  private static final ResourceLocation McNASTYSusanoSkeleton = new ResourceLocation("tm:textures/susano/apollo/McNASTYSusanoSkeleton.png");
  
  private static final ResourceLocation McNASTYSusanoComplete = new ResourceLocation("tm:textures/susano/apollo/McNASTYSusanoComplete.png");
  
  private static final ResourceLocation McNASTYSusanoArmor = new ResourceLocation("tm:textures/susano/apollo/McNASTYSusanoArmor.png");
  
  private static final ResourceLocation MentrozSusanoCage = new ResourceLocation("tm:textures/susano/apollo/MentrozSusanoCage.png");
  
  private static final ResourceLocation MentrozSusanoSkeleton = new ResourceLocation("tm:textures/susano/apollo/MentrozSusanoSkeleton.png");
  
  private static final ResourceLocation MentrozSusanoComplete = new ResourceLocation("tm:textures/susano/apollo/MentrozSusanoComplete.png");
  
  private static final ResourceLocation MentrozSusanoArmor = new ResourceLocation("tm:textures/susano/apollo/MentrozSusanoArmor.png");
  
  private static final ResourceLocation TomtomcatySusanoCage = new ResourceLocation("tm:textures/susano/apollo/TomtomcatySusanoCage.png");
  
  private static final ResourceLocation TomtomcatySusanoSkeleton = new ResourceLocation("tm:textures/susano/apollo/TomtomcatySusanoSkeleton.png");
  
  private static final ResourceLocation TomtomcatySusanoComplete = new ResourceLocation("tm:textures/susano/apollo/TomtomcatySusanoComplete.png");
  
  private static final ResourceLocation TomtomcatySusanoArmor = new ResourceLocation("tm:textures/susano/apollo/TomtomcatySusanoArmor.png");
  
  private static final ResourceLocation FujimotoSusanoCage = new ResourceLocation("tm:textures/susano/apollo/FujimotoSusanoCage.png");
  
  private static final ResourceLocation FujimotoSusanoSkeleton = new ResourceLocation("tm:textures/susano/apollo/FujimotoSusanoSkeleton.png");
  
  private static final ResourceLocation FujimotoSusanoComplete = new ResourceLocation("tm:textures/susano/apollo/FujimotoSusanoComplete.png");
  
  private static final ResourceLocation FujimotoSusanoArmor = new ResourceLocation("tm:textures/susano/apollo/FujimotoSusanoArmor.png");
  
  private static final ResourceLocation YunusSusanoCage = new ResourceLocation("tm:textures/susano/apollo/YunusSusanoCage.png");
  
  private static final ResourceLocation YunusSusanoSkeleton = new ResourceLocation("tm:textures/susano/apollo/YunusSusanoSkeleton.png");
  
  private static final ResourceLocation YunusSusanoComplete = new ResourceLocation("tm:textures/susano/apollo/YunusSusanoComplete.png");
  
  private static final ResourceLocation YunusSusanoArmor = new ResourceLocation("tm:textures/susano/apollo/YunusSusanoArmor.png");
  
  private static final ResourceLocation Matatabi = new ResourceLocation("tm:textures/entity/Matatabi.png");
  
  private static final ResourceLocation textureRed = new ResourceLocation("tm:textures/entity/Matatabi.png");
  
  private static final ResourceLocation textureKillerwolf = new ResourceLocation("tm:textures/entity/Matatabi.png");
  
  private static final ResourceLocation ashuraMode = new ResourceLocation("tm:textures/entity/ashura.png");
  
  private static final ResourceLocation Sharingan = new ResourceLocation("tm:textures/dojutsu/sharingan.png");
  
  private static final ResourceLocation CurseSeal = new ResourceLocation("tm:textures/entity/CurseSeal.png");
  
  private static final ResourceLocation CurseSealpt2 = new ResourceLocation("tm:textures/entity/CurseMarkPT2.png");
  
  private static final ResourceLocation CurseSealJH = new ResourceLocation("tm:textures/entity/CurseSeal.png");
  
  private static final ResourceLocation CurseSealBf = new ResourceLocation("tm:textures/entity/CurseMark.png");
  
  private static final ResourceLocation SageMode = new ResourceLocation("tm:textures/entity/sage.png");
  
  private static final ResourceLocation SageClothes = new ResourceLocation("tm:textures/entity/SageModeS.png");
  
  private static final ResourceLocation Hidan = new ResourceLocation("tm:textures/entity/DeathPossession.png");
  
  private static final ResourceLocation Hashirama = new ResourceLocation("tm:textures/entity/HashiramaStyle.png");
  
  private static final ResourceLocation Otsutsuki = new ResourceLocation("tm:textures/entity/Otsutsuki.png");
  
  private static final ResourceLocation Tsunade = new ResourceLocation("tm:textures/entity/TsunadeCrest.png");
  
  private static final ResourceLocation CurseSeal2Mode = new ResourceLocation("tm:textures/entity/New.png");
  
  private static final ResourceLocation CurseSeal2Mode1 = new ResourceLocation("tm:textures/entity/CurseEarthLow.png");
  
  private static final ResourceLocation ZetsuMode = new ResourceLocation("tm:textures/entity/ZetsuMode.png");
  
  private static final ResourceLocation CurseSealUkon1 = new ResourceLocation("tm:textures/entity/CurseMarkUkon1.png");
  
  private static final ResourceLocation CurseSealUkon2 = new ResourceLocation("tm:textures/entity/CurseMarkUkon2.png");
  
  private static final ResourceLocation CurseSealTayuya1 = new ResourceLocation("tm:textures/entity/CurseMarkTayuya1.png");
  
  private static final ResourceLocation CurseSealTayuya2 = new ResourceLocation("tm:textures/entity/CurseMarkTayuya2.png");
  
  private static final ResourceLocation CurseSealJirobo1 = new ResourceLocation("tm:textures/entity/CurseMarkJirobo1.png");
  
  private static final ResourceLocation CurseSealJirobo2 = new ResourceLocation("tm:textures/entity/CurseMarkJirobo2.png");
  
  private static final ResourceLocation CurseSealKidomaru1 = new ResourceLocation("tm:textures/entity/CurseMarkKidomaru1.png");
  
  private static final ResourceLocation CurseSealKidomaru2 = new ResourceLocation("tm:textures/entity/CurseMarkKidomaru2.png");
  
  private static final ResourceLocation CurseSealKimimaro = new ResourceLocation("tm:textures/entity/CurseOriLow.png");
  
  private static final ResourceLocation Sharingan1 = new ResourceLocation("tm:textures/dojutsu/sharingan2TO.png");
  
  private static final ResourceLocation Sharingan2 = new ResourceLocation("tm:textures/dojutsu/sharingan1TO.png");
  
  private static final ResourceLocation Rinnegan1 = new ResourceLocation("tm:textures/dojutsu/sharingan shisui x rinnegan.png");
  
  private static final ResourceLocation Senjutsu = new ResourceLocation("tm:textures/dojutsu/Senjutsu.png");
  
  private static final ResourceLocation SenjutsuSlug = new ResourceLocation("tm:textures/dojutsu/SlugSage.png");
  
  private static final ResourceLocation SenjutsuSnake = new ResourceLocation("tm:textures/dojutsu/snakeSage.png");
  
  private static final ResourceLocation Rinnegan2 = new ResourceLocation("tm:textures/dojutsu/Ryuuho Rinne-Sharingan.png");
  
  private static final ResourceLocation Sharingan7 = new ResourceLocation("tm:textures/dojutsu/Ryuuho Mangekyo.png");
  
  private static final ResourceLocation Sharingan8 = new ResourceLocation("tm:textures/dojutsu/Ryuuho Eternal Mangekyou.png");
  
  private static final ResourceLocation Rinnegan3 = new ResourceLocation("tm:textures/dojutsu/Rinnegan.png");
  
  private static final ResourceLocation Rinnegan5 = new ResourceLocation("tm:textures/dojutsu/Rinnegan2.png");
  
  private static final ResourceLocation Sharingan10 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan shisui.png");
  
  private static final ResourceLocation Sharingan11 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Shin.png");
  
  private static final ResourceLocation Sharingan12 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan sasuke.png");
  
  private static final ResourceLocation Sharingan13 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Rai.png");
  
  private static final ResourceLocation Sharingan14 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Naori.png");
  
  private static final ResourceLocation Sharingan15 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Naka.png");
  
  private static final ResourceLocation Sharingan16 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Madara.png");
  
  private static final ResourceLocation Sharingan17 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Kakashi&Obito.png");
  
  private static final ResourceLocation Sharingan18 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Izuna.png");
  
  private static final ResourceLocation Sharingan19 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan itachi.png");
  
  private static final ResourceLocation Sharingan20 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Indra.png");
  
  private static final ResourceLocation Sharingan22 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan eternel Madara.png");
  
  private static final ResourceLocation Sharingan23 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan eternel Itachi.png");
  
  private static final ResourceLocation Rinnegan4 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan eternel & rinnegan Sasuke.png");
  
  private static final ResourceLocation Sharingan24 = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan Baru.png");
  
  private static final ResourceLocation Sharingan25 = new ResourceLocation("tm:textures/dojutsu/Eternal Shin.png");
  
  private static final ResourceLocation Sharingan26 = new ResourceLocation("tm:textures/dojutsu/Eternal Rai.png");
  
  private static final ResourceLocation Sharingan28 = new ResourceLocation("tm:textures/dojutsu/Eternal Naka.png");
  
  private static final ResourceLocation Sharingan29 = new ResourceLocation("tm:textures/dojutsu/Eternal Mangekyou Sharingan Shisui.png");
  
  private static final ResourceLocation Sharingan30 = new ResourceLocation("tm:textures/dojutsu/Eternal Mangekyou Sharingan Obito.png");
  
  private static final ResourceLocation Sharingan31 = new ResourceLocation("tm:textures/dojutsu/Eternal Mangekyou Sharingan Izuna.png");
  
  private static final ResourceLocation Sharingan32 = new ResourceLocation("tm:textures/dojutsu/Eternal Indra.png");
  
  private static final ResourceLocation Sharingan33 = new ResourceLocation("tm:textures/dojutsu/Eternal Baru.png");
  
  private static final ResourceLocation Byakugan = new ResourceLocation("tm:textures/dojutsu/byakugan.png");
  
  private static final ResourceLocation ByakuganActive = new ResourceLocation("tm:textures/dojutsu/byakuganActive.png");
  
  private static final ResourceLocation SnakeMode = new ResourceLocation("tm:textures/dojutsu/snake.png");
  
  private static final ResourceLocation Tenseigan = new ResourceLocation("tm:textures/dojutsu/tenseigan.png");
  
  private static final ResourceLocation TenseiganMode = new ResourceLocation("tm:textures/entity/Tens.png");
  
  private static final ResourceLocation TenseiganModePlayer = new ResourceLocation("tm:textures/entity/Tens2.png");
  
  private static final ResourceLocation RinneSharingan = new ResourceLocation("tm:textures/dojutsu/rinne-Sharingan.png");
  
  private static final ResourceLocation Burentos = new ResourceLocation("tm:textures/dojutsu/Brent.png");
  
  private static final ResourceLocation BurentosE = new ResourceLocation("tm:textures/dojutsu/BrentEternal.png");
  
  private static final ResourceLocation BurentosR = new ResourceLocation("tm:textures/dojutsu/BrentRin.png");
  
  private static final ResourceLocation Ketsuryugan = new ResourceLocation("tm:textures/dojutsu/ketsuryugan.png");
  
  private static final ResourceLocation SharinganMathioks = new ResourceLocation("tm:textures/dojutsu/Mathioks.png");
  
  private static final ResourceLocation SharinganEternalMathioks = new ResourceLocation("tm:textures/dojutsu/Eternal_Mathioks.png");
  
  private static final ResourceLocation RinneganMathioks = new ResourceLocation("tm:textures/dojutsu/Mangekyo sharingan rinnegan Mathioks2.png");
  
  private static final ResourceLocation MangekyouNick = new ResourceLocation("tm:textures/dojutsu/Mangekyou Nick.png");
  
  private static final ResourceLocation EternalNick = new ResourceLocation("tm:textures/dojutsu/Eternal Nick.png");
  
  private static final ResourceLocation SusanoCageSasuke = new ResourceLocation("tm:textures/susano/SusanoCageSasuke.png");
  
  private static final ResourceLocation SusanoSkeletonSasuke = new ResourceLocation("tm:textures/susano/SusanoSkeletonSasuke.png");
  
  private static final ResourceLocation SusanoCompleteSasuke = new ResourceLocation("tm:textures/susano/SusanoCompleteSasuke.png");
  
  private static final ResourceLocation SusanoArmorSasuke = new ResourceLocation("tm:textures/susano/SusanoArmorSasuke.png");
  
  private static final ResourceLocation SusanoPerfectSasuke = new ResourceLocation("tm:textures/susano/SusanoPerfectSasuke.png");
  
  private static final ResourceLocation SusanoCageItachi = new ResourceLocation("tm:textures/susano/ItachiSusanoCage.png");
  
  private static final ResourceLocation SusanoSkeletonItachi = new ResourceLocation("tm:textures/susano/ItachiSusanoSkeleton.png");
  
  private static final ResourceLocation SusanoCompleteItachi = new ResourceLocation("tm:textures/susano/ItachiSusanoComplete.png");
  
  private static final ResourceLocation SusanoArmorItachi = new ResourceLocation("tm:textures/susano/ItachiSusanoArmor.png");
  
  private static final ResourceLocation SusanoPerfectItachi = new ResourceLocation("tm:textures/susano/ItachiSusanoPerfect.png");
  
  private static final ResourceLocation SusanoCageShisui = new ResourceLocation("tm:textures/susano/ShisuiSusanoCage.png");
  
  private static final ResourceLocation SusanoSkeletonShisui = new ResourceLocation("tm:textures/susano/ShisuiSusanoSkeleton.png");
  
  private static final ResourceLocation SusanoCompleteShisui = new ResourceLocation("tm:textures/susano/ShisuiSusanoComplete.png");
  
  private static final ResourceLocation SusanoArmorShisui = new ResourceLocation("tm:textures/susano/ShisuiSusanoArmor.png");
  
  private static final ResourceLocation SusanoPerfectShisui = new ResourceLocation("tm:textures/susano/ShisuiSusanoPerfect.png");
  
  private static final ResourceLocation SusanoCageObito = new ResourceLocation("tm:textures/susano/ObitoSusanoCage.png");
  
  private static final ResourceLocation SusanoSkeletonObito = new ResourceLocation("tm:textures/susano/ObitoSusanoSkeleton.png");
  
  private static final ResourceLocation SusanoCompleteObito = new ResourceLocation("tm:textures/susano/ObitoSusanoComplete.png");
  
  private static final ResourceLocation SusanoArmorObito = new ResourceLocation("tm:textures/susano/ObitoSusanoArmor.png");
  
  private static final ResourceLocation SusanoPerfectObito = new ResourceLocation("tm:textures/susano/ObitoSusanoPerfect.png");
  
  private static final ResourceLocation SusanoCageMadara = new ResourceLocation("tm:textures/susano/MadaraSusanoCage.png");
  
  private static final ResourceLocation SusanoSkeletonMadara = new ResourceLocation("tm:textures/susano/MadaraSusanoSkeleton.png");
  
  private static final ResourceLocation SusanoCompleteMadara = new ResourceLocation("tm:textures/susano/MadaraSusanoComplete.png");
  
  private static final ResourceLocation SusanoArmorMadara = new ResourceLocation("tm:textures/susano/MadaraSusanoArmor.png");
  
  private static final ResourceLocation SusanoPerfectMadara = new ResourceLocation("tm:textures/susano/MadaraSusanoPerfect.png");
  
  private static final ResourceLocation SusanoCageIzuna = new ResourceLocation("tm:textures/susano/IzunaSusanoCage.png");
  
  private static final ResourceLocation SusanoSkeletonIzuna = new ResourceLocation("tm:textures/susano/IzunaSusanoSkeleton.png");
  
  private static final ResourceLocation SusanoCompleteIzuna = new ResourceLocation("tm:textures/susano/IzunaSusanoComplete.png");
  
  private static final ResourceLocation SusanoArmorIzuna = new ResourceLocation("tm:textures/susano/IzunaSusanoArmor.png");
  
  private static final ResourceLocation SusanoPerfectIzuna = new ResourceLocation("tm:textures/susano/IzunaSusanoPerfect.png");
  
  private static final ResourceLocation SusanoCageIndra = new ResourceLocation("tm:textures/susano/IndraSusanoCage.png");
  
  private static final ResourceLocation SusanoSkeletonIndra = new ResourceLocation("tm:textures/susano/IndraSusanoSkeleton.png");
  
  private static final ResourceLocation SusanoCompleteIndra = new ResourceLocation("tm:textures/susano/IndraSusanoComplete.png");
  
  private static final ResourceLocation SusanoArmorIndra = new ResourceLocation("tm:textures/susano/IndraSusanoArmor.png");
  
  private static final ResourceLocation SusanoPerfectIndra = new ResourceLocation("tm:textures/susano/IndraSusanoPerfect.png");
  
  private static final ResourceLocation SusanoCageShin = new ResourceLocation("tm:textures/susano/ShinSusanoCage.png");
  
  private static final ResourceLocation SusanoSkeletonShin = new ResourceLocation("tm:textures/susano/ShinSusanoSkeleton.png");
  
  private static final ResourceLocation SusanoCompleteShin = new ResourceLocation("tm:textures/susano/ShinSusanoComplete.png");
  
  private static final ResourceLocation SusanoArmorShin = new ResourceLocation("tm:textures/susano/ShinSusanoArmor.png");
  
  private static final ResourceLocation SusanoPerfectShin = new ResourceLocation("tm:textures/susano/ShinSusanoPerfect.png");
  
  private static final ResourceLocation SusanoCageNaori = new ResourceLocation("tm:textures/susano/NaoriSusanoCage.png");
  
  private static final ResourceLocation SusanoSkeletonNaori = new ResourceLocation("tm:textures/susano/NaoriSusanoSkeleton.png");
  
  private static final ResourceLocation SusanoCompleteNaori = new ResourceLocation("tm:textures/susano/NaoriSusanoComplete.png");
  
  private static final ResourceLocation SusanoArmorNaori = new ResourceLocation("tm:textures/susano/NaoriSusanoArmor.png");
  
  private static final ResourceLocation SusanoPerfectNaori = new ResourceLocation("tm:textures/susano/NaoriSusanoPerfect.png");
  
  private static final ResourceLocation SusanoCageBaru = new ResourceLocation("tm:textures/susano/BaruSusanoCage.png");
  
  private static final ResourceLocation SusanoSkeletonBaru = new ResourceLocation("tm:textures/susano/BaruSusanoSkeleton.png");
  
  private static final ResourceLocation SusanoCompleteBaru = new ResourceLocation("tm:textures/susano/BaruSusanoComplete.png");
  
  private static final ResourceLocation SusanoArmorBaru = new ResourceLocation("tm:textures/susano/BaruSusanoArmor.png");
  
  private static final ResourceLocation SusanoPerfectBaru = new ResourceLocation("tm:textures/susano/BaruSusanoPerfect.png");
  
  private static final ResourceLocation SusanoCageRai = new ResourceLocation("tm:textures/susano/RaiSusanoCage.png");
  
  private static final ResourceLocation SusanoSkeletonRai = new ResourceLocation("tm:textures/susano/RaiSusanoSkeleton.png");
  
  private static final ResourceLocation SusanoCompleteRai = new ResourceLocation("tm:textures/susano/RaiSusanoComplete.png");
  
  private static final ResourceLocation SusanoArmorRai = new ResourceLocation("tm:textures/susano/RaiSusanoArmor.png");
  
  private static final ResourceLocation SusanoPerfectRai = new ResourceLocation("tm:textures/susano/RaiSusanoPerfect.png");
  
  private static final ResourceLocation SusanoCageNaka = new ResourceLocation("tm:textures/susano/NakaSusanoCage.png");
  
  private static final ResourceLocation SusanoSkeletonNaka = new ResourceLocation("tm:textures/susano/NakaSusanoSkeleton.png");
  
  private static final ResourceLocation SusanoCompleteNaka = new ResourceLocation("tm:textures/susano/NakaSusanoComplete.png");
  
  private static final ResourceLocation SusanoArmorNaka = new ResourceLocation("tm:textures/susano/NakaSusanoArmor.png");
  
  private static final ResourceLocation SusanoPerfectNaka = new ResourceLocation("tm:textures/susano/NakaSusanoPerfect.png");
  
  private static final ResourceLocation SusanoCageRyuuho = new ResourceLocation("tm:textures/susano/RyuuhoSusanoCage.png");
  
  private static final ResourceLocation SusanoSkeletonRyuuho = new ResourceLocation("tm:textures/susano/RyuuhoSusanoSkeleton.png");
  
  private static final ResourceLocation SusanoCompleteRyuuho = new ResourceLocation("tm:textures/susano/RyuuhoSusanoComplete.png");
  
  private static final ResourceLocation SusanoArmorRyuuho = new ResourceLocation("tm:textures/susano/RyuuhoSusanoArmor.png");
  
  private static final ResourceLocation SusanoPerfectRyuuho = new ResourceLocation("tm:textures/susano/RyuuhoSusanoPerfect.png");
  
  private static final ResourceLocation SusanoCageBrent = new ResourceLocation("tm:textures/susano/BrentSusanoCage.png");
  
  private static final ResourceLocation SusanoSkeletonBrent = new ResourceLocation("tm:textures/susano/BrentSusanoSkeleton.png");
  
  private static final ResourceLocation SusanoCompleteBrent = new ResourceLocation("tm:textures/susano/BrentSusanoComplete.png");
  
  private static final ResourceLocation SusanoArmorBrent = new ResourceLocation("tm:textures/susano/BrentSusanoArmor.png");
  
  private static final ResourceLocation SusanoPerfectBrent = new ResourceLocation("tm:textures/susano/BrentSusanoPerfect.png");
  
  private static final ResourceLocation SusanoCageMathioks = new ResourceLocation("tm:textures/susano/MathioksSusanoCage.png");
  
  private static final ResourceLocation SusanoSkeletonMathioks = new ResourceLocation("tm:textures/susano/MathioksSusanoSkeleton.png");
  
  private static final ResourceLocation SusanoCompleteMathioks = new ResourceLocation("tm:textures/susano/MathioksSusanoComplete.png");
  
  private static final ResourceLocation SusanoArmorMathioks = new ResourceLocation("tm:textures/susano/MathioksSusanoArmor.png");
  
  private static final ResourceLocation SusanoPerfectMathioks = new ResourceLocation("tm:textures/susano/MathioksSusanoPerfect.png");
  
  private static final ResourceLocation SusanoPerfectBeastMathioks = new ResourceLocation("tm:textures/susano/MathioksSusanoTailedBeast.png");
  
  private static final ResourceLocation Bijuu4Tails = new ResourceLocation("tm:textures/entity/BijuuForm.png");
  
  private static final ResourceLocation Shukaku = new ResourceLocation("tm:textures/entity/Shukaku.png");
  
  private static final ResourceLocation matatabi = new ResourceLocation("tm:textures/entity/Matatabi.png");
  
  private static final ResourceLocation Isobu = new ResourceLocation("tm:textures/entity/Isobu.png");
  
  private static final ResourceLocation SonGoku = new ResourceLocation("tm:textures/entity/SonGoku.png");
  
  private static final ResourceLocation Kokuo = new ResourceLocation("tm:textures/entity/Kokuo.png");
  
  private static final ResourceLocation Saiken = new ResourceLocation("tm:textures/entity/Seiken.png");
  
  private static final ResourceLocation Chomei = new ResourceLocation("tm:textures/entity/Chomei.png");
  
  private static final ResourceLocation Gyuki = new ResourceLocation("tm:textures/entity/Gyuki.png");
  
  private static final ResourceLocation Kurama = new ResourceLocation("tm:textures/entity/Kurama.png");
  
  private static final ResourceLocation Juubi = new ResourceLocation("tm:textures/entity/Juubi.png");
  
  private static final ResourceLocation JuubiForm = new ResourceLocation("tm:textures/entity/10)Juubi1Form.png");
  
  private static final ResourceLocation TailedBeastMode = new ResourceLocation("tm:textures/entity/TailedBeastMode.png");
  
  private static final ResourceLocation SixPaths = new ResourceLocation("tm:textures/entity/6paths.png");
  
  private static final ResourceLocation SixPaths1 = new ResourceLocation("tm:textures/entity/6PathMode.png");
  
  private static final ResourceLocation OneTailTrans = new ResourceLocation("tm:textures/entity/1tailTrans.png");
  
  private static final ResourceLocation FourTailTrans = new ResourceLocation("tm:textures/entity/BijuuFormori.png");
  
  private static final ResourceLocation ShukakuF = new ResourceLocation("tm:textures/entity/ShukakuF.png");
  
  private static final ResourceLocation ShukakuS = new ResourceLocation("tm:textures/entity/ShukakuS.png");
  
  private static final ResourceLocation MatatabiF = new ResourceLocation("tm:textures/entity/MatatabiF.png");
  
  private static final ResourceLocation MatatabiS = new ResourceLocation("tm:textures/entity/MatatabiS.png");
  
  private static final ResourceLocation IsobuF = new ResourceLocation("tm:textures/entity/IsobuF.png");
  
  private static final ResourceLocation IsobuS = new ResourceLocation("tm:textures/entity/IsobuS.png");
  
  private static final ResourceLocation GokuF = new ResourceLocation("tm:textures/entity/GokuF.png");
  
  private static final ResourceLocation GokuS = new ResourceLocation("tm:textures/entity/GokuS.png");
  
  private static final ResourceLocation KokuoF = new ResourceLocation("tm:textures/entity/KokuoF.png");
  
  private static final ResourceLocation KokuoS = new ResourceLocation("tm:textures/entity/KokuoS.png");
  
  private static final ResourceLocation SaikenF = new ResourceLocation("tm:textures/entity/SaikenF.png");
  
  private static final ResourceLocation SaikenS = new ResourceLocation("tm:textures/entity/SaikenS.png");
  
  private static final ResourceLocation ChomeiF = new ResourceLocation("tm:textures/entity/ChomeiF.png");
  
  private static final ResourceLocation ChomeiS = new ResourceLocation("tm:textures/entity/ChomeiS.png");
  
  private static final ResourceLocation GyukiF = new ResourceLocation("tm:textures/entity/GyukiF.png");
  
  private static final ResourceLocation GyukiS = new ResourceLocation("tm:textures/entity/GyukiS.png");
  
  private static final ResourceLocation KuramaF = new ResourceLocation("tm:textures/entity/KuramaF.png");
  
  private static final ResourceLocation KuramaS = new ResourceLocation("tm:textures/entity/KuramaS.png");
  
  private static final ResourceLocation JuubiF = new ResourceLocation("tm:textures/entity/JuubiFModel.png");
  
  private static final ResourceLocation JuubiS = new ResourceLocation("tm:textures/entity/JuubiSModel.png");
  
  private static final ResourceLocation FullBringer1 = new ResourceLocation("tm:textures/entity/IchigoFullbring.png");
  
  public static final ResourceLocation textureSaske = new ResourceLocation("tm:textures/susano/animine/rebra/Saske.png");
  
  public static final ResourceLocation textureShisui = new ResourceLocation("tm:textures/susano/animine/rebra/Shisui.png");
  
  public static final ResourceLocation textureMadara = new ResourceLocation("tm:textures/susano/animine/rebra/Madara.png");
  
  public static final ResourceLocation textureObito = new ResourceLocation("tm:textures/susano/animine/rebra/Obito.png");
  
  public static final ResourceLocation textureItachi = new ResourceLocation("tm:textures/susano/animine/rebra/Itachi.png");
  
  public static final ResourceLocation Rebra = new ResourceLocation("tm:textures/susano/animine/rebra/r.obj");
  
  private static final IModelCustom Rebramodel = AdvancedModelLoader.loadModel(Rebra);
  
  public static final ResourceLocation textureSaske2 = new ResourceLocation("tm:textures/susano/animine/rebra2/sasuke/sasuke.png");
  
  public static final ResourceLocation textureShisui2 = new ResourceLocation("tm:textures/susano/animine/rebra2/shisui/shisui.png");
  
  public static final ResourceLocation textureMadara2 = new ResourceLocation("tm:textures/susano/animine/rebra2/madara/madara.png");
  
  public static final ResourceLocation textureObito2 = new ResourceLocation("tm:textures/susano/animine/rebra2/obito/obito.png");
  
  public static final ResourceLocation textureItachi2 = new ResourceLocation("tm:textures/susano/animine/rebra2/itachi/itachi.png");
  
  public static final ResourceLocation SaskeRebra2 = new ResourceLocation("tm:textures/susano/animine/rebra2/sasuke/sasuke.obj");
  
  public static final ResourceLocation ItachiRebra2 = new ResourceLocation("tm:textures/susano/animine/rebra2/itachi/itachi.obj");
  
  public static final ResourceLocation ObitoRebra2 = new ResourceLocation("tm:textures/susano/animine/rebra2/obito/obito.obj");
  
  public static final ResourceLocation MadaraRebra2 = new ResourceLocation("tm:textures/susano/animine/rebra2/madara/madara.obj");
  
  public static final ResourceLocation ShisuiRebra2 = new ResourceLocation("tm:textures/susano/animine/rebra2/shisui/shisui.obj");
  
  private static final IModelCustom SaskeRebra2model = AdvancedModelLoader.loadModel(SaskeRebra2);
  
  private static final IModelCustom MadaraRebra2model = AdvancedModelLoader.loadModel(MadaraRebra2);
  
  private static final IModelCustom ObitoRebra2model = AdvancedModelLoader.loadModel(ObitoRebra2);
  
  private static final IModelCustom ItachiRebra2model = AdvancedModelLoader.loadModel(ItachiRebra2);
  
  private static final IModelCustom ShisuiRebra2model = AdvancedModelLoader.loadModel(ShisuiRebra2);
  
  public static final ResourceLocation textureSaske3 = new ResourceLocation("tm:textures/susano/animine/skeleton/saske/tstage3.png");
  
  public static final ResourceLocation textureShisui3 = new ResourceLocation("tm:textures/susano/animine/skeleton/shisui/tstage3.png");
  
  public static final ResourceLocation textureShisui32 = new ResourceLocation("tm:textures/susano/animine/skeleton/shisui/tstage32.png");
  
  public static final ResourceLocation textureMadara3 = new ResourceLocation("tm:textures/susano/animine/skeleton/madara/tstage3.png");
  
  public static final ResourceLocation textureMadara32 = new ResourceLocation("tm:textures/susano/animine/skeleton/madara/tstage32.png");
  
  public static final ResourceLocation textureObito3 = new ResourceLocation("tm:textures/susano/animine/skeleton/obito/tstage3.png");
  
  public static final ResourceLocation textureItachi3 = new ResourceLocation("tm:textures/susano/animine/skeleton/itachi/tstage3.png");
  
  public static final ResourceLocation SaskeRebra3 = new ResourceLocation("tm:textures/susano/animine/skeleton/saske/stage3.obj");
  
  public static final ResourceLocation ItachiRebra3 = new ResourceLocation("tm:textures/susano/animine/skeleton/itachi/stage3.obj");
  
  public static final ResourceLocation ObitoRebra3 = new ResourceLocation("tm:textures/susano/animine/skeleton/obito/stage3.obj");
  
  public static final ResourceLocation MadaraRebra3 = new ResourceLocation("tm:textures/susano/animine/skeleton/madara/stage3.obj");
  
  public static final ResourceLocation ShisuiRebra3 = new ResourceLocation("tm:textures/susano/animine/skeleton/shisui/stage3.obj");
  
  public static final ResourceLocation NekoModelLocation = new ResourceLocation("am:textures/entity/hvost.obj");
  
  public static final ResourceLocation NekoModelLocation2 = new ResourceLocation("am:textures/entity/ushi.obj");
  
  public static final ResourceLocation NekoModelTexture = new ResourceLocation("am:textures/entity/nekotexture.png");
  
  private static final IModelCustom SaskeRebra3model = AdvancedModelLoader.loadModel(SaskeRebra3);
  
  private static final IModelCustom MadaraRebra3model = AdvancedModelLoader.loadModel(MadaraRebra3);
  
  private static final IModelCustom ObitoRebra3model = AdvancedModelLoader.loadModel(ObitoRebra3);
  
  private static final IModelCustom ItachiRebra3model = AdvancedModelLoader.loadModel(ItachiRebra3);
  
  private static final IModelCustom ShisuiRebra3model = AdvancedModelLoader.loadModel(ShisuiRebra3);
  
  private static final IModelCustom UshiModel = AdvancedModelLoader.loadModel(NekoModelLocation2);
  
  private static final IModelCustom HvostModel = AdvancedModelLoader.loadModel(NekoModelLocation);
  
  public SeparateArmTextures SeparateArmTextModel = new SeparateArmTextures(0.001F);
  
  public NekoCustomModel nekoCustomModel = new NekoCustomModel();
  
  private boolean textureSwitch = false;
  
  public ModelAshuraMode tutModel9 = new ModelAshuraMode();
  
  public ModelBiped tutModel4 = new ModelBiped(0.001F);
  
  public ModelBiped extendedModel = new ModelBiped(0.002F);
  
  public ModelBiped extendedModel2 = new ModelBiped(0.003F);
  
  public SageModeModel tutModel6 = new SageModeModel();
  
  public sixpathsorbs tutModel8 = new sixpathsorbs();
  
  public sixpathsshield tutModel69 = new sixpathsshield();
  
  public ModelBiped modelCurse = new ModelBiped(0.001F);
  
  public SasukeSusanoCageModel SusanoCageModelSasuke = new SasukeSusanoCageModel();
  
  public SasukeSusanoSkeletonModel SusanoSkeletonModelSasuke = new SasukeSusanoSkeletonModel();
  
  public SasukeSusanoCompleteModel SusanoCompleteModelSasuke = new SasukeSusanoCompleteModel();
  
  public SasukeSusanoArmorModel SusanoArmorModelSasuke = new SasukeSusanoArmorModel();
  
  public SasukeSusanoPerfectModel SusanoPerfectModelSasuke = new SasukeSusanoPerfectModel();
  
  public ItachiSusanoSkeletonModel SusanoSkeletonModelItachi = new ItachiSusanoSkeletonModel();
  
  public ItachiSusanoCompleteModel SusanoCompleteModelItachi = new ItachiSusanoCompleteModel();
  
  public ShisuiSusanoSkeletonModel SusanoSkeletonModelShisui = new ShisuiSusanoSkeletonModel();
  
  public ShisuiSusanoCompleteModel SusanoCompleteModelShisui = new ShisuiSusanoCompleteModel();
  
  public ObitoSusanoSkeletonModel SusanoSkeletonModelObito = new ObitoSusanoSkeletonModel();
  
  public ObitoSusanoCompleteModel SusanoCompleteModelObito = new ObitoSusanoCompleteModel();
  
  public MadaraSusanoSkeletonModel SusanoSkeletonModelMadara = new MadaraSusanoSkeletonModel();
  
  public MadaraSusanoCompleteModel SusanoCompleteModelMadara = new MadaraSusanoCompleteModel();
  
  public IndraSusanoSkeletonModel SusanoSkeletonModelIndra = new IndraSusanoSkeletonModel();
  
  public IndraSusanoCompleteModel SusanoCompleteModelIndra = new IndraSusanoCompleteModel();
  
  public MathioksSusanoCompleteModel MathioksSusanoCompleteModel = new MathioksSusanoCompleteModel();
  
  public MathioksSusanoArmorModel MathioksSusanoArmorModel = new MathioksSusanoArmorModel();
  
  public MathioksSusanoPerfectModel MathioksSusanoPerfectModel = new MathioksSusanoPerfectModel();
  
  public SusanoPerfectBeastModel SusanoPerfectBeastModel = new SusanoPerfectBeastModel();
  
  public ModelBiped TheModel = new ModelBiped(0.0F);
  
  public CursedSealRank2HandsModel CurseSealModel = new CursedSealRank2HandsModel();
  
  public EmptyModel empty = new EmptyModel();
  
  public ModelBijuuChakraMode Bijuu4TailsModel = new ModelBijuuChakraMode();
  
  public ModelShukaku ShukakuModel = new ModelShukaku();
  
  public ModelMatatabi MatatabiModel = new ModelMatatabi();
  
  public ModelIsobu IsobuModel = new ModelIsobu();
  
  public ModelSonGoku SonGokuModel = new ModelSonGoku();
  
  public ModelKokuo KokuoModel = new ModelKokuo();
  
  public ModelSaiken SaikenModel = new ModelSaiken();
  
  public ModelChomei ChomeiModel = new ModelChomei();
  
  public ModelKyuubi KuramaModel = new ModelKyuubi();
  
  public ModelJuubi JuubiModel = new ModelJuubi();
  
  public Model10Tails TenTailsModel = new Model10Tails();
  
  public EmptyModelBiped emptyBiped = new EmptyModelBiped();
  
  public CurseMark2Model modelCurse2 = new CurseMark2Model();
  
  public ModelKyuubi1Tail OneTailModel = new ModelKyuubi1Tail(0.8F);
  
  public ModelKyuubi1Tail2 OneTailModel2 = new ModelKyuubi1Tail2(0.8F);
  
  public ModelTenseigan TenseiganModel = new ModelTenseigan();
  
  public ShukakuFModel ShukakuFModel = new ShukakuFModel();
  
  public ShukakuSModel ShukakuSModel = new ShukakuSModel();
  
  public MatatabiFModel MatatabiFModel = new MatatabiFModel();
  
  public MatatabiSModel MatatabiSModel = new MatatabiSModel();
  
  public IsobuFModel IsobuFModel = new IsobuFModel();
  
  public IsobuSModel IsobuSModel = new IsobuSModel();
  
  public GokuFModel GokuFModel = new GokuFModel();
  
  public GokuSModel GokuSModel = new GokuSModel();
  
  public KokuoFModel KokuoFModel = new KokuoFModel();
  
  public KokuoSModel KokuoSModel = new KokuoSModel();
  
  public SaikenFModel SaikenFModel = new SaikenFModel();
  
  public SaikenSModel SaikenSModel = new SaikenSModel();
  
  public ChomeiFModel ChomeiFModel = new ChomeiFModel();
  
  public ChomeiSModel ChomeiSModel = new ChomeiSModel();
  
  public GyukiFModel GyukiFModel = new GyukiFModel();
  
  public GyukiSModel GyukiSModel = new GyukiSModel();
  
  public KuramaFModel KuramaFModel = new KuramaFModel();
  
  public KuramaSModel KuramaSModel = new KuramaSModel();
  
  public JuubiFModel JuubiFModel = new JuubiFModel();
  
  public JuubiSModel JuubiSModel = new JuubiSModel();
  
  public CursedSealRank2HandsModel tutModel5;
  
  public CurseMark2Model tutModel7;
  
  public ModelGyuki GyukiModel;

  @Override
  protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
    return this.getEntityTexture((AbstractClientPlayer)p_110775_1_);
  }

  @Override
  protected ResourceLocation getEntityTexture(AbstractClientPlayer p_110775_1_) {
    return p_110775_1_.getLocationSkin();
  }

  public RenderChakraPlayer() {
    this.renderManager = RenderManager.instance;
  }
  public void renderModel(EntityLivingBase entity, float par2, float par3, float par4, float par5, float par6, float par7) {
    super.renderModel(entity, par2, par3, par4, par5, par6, par7);
    EntityPlayer player = (EntityPlayer)entity;
    ExtendedPlayer props = ExtendedPlayer.get(player);
    if (this.mainModel instanceof ModelBiped && props.getBijuuFormActive() && props.getTransformed()) {
      if (props.getBijuuScale() > 2)
        this.mainModel = (ModelBase)this.empty; 
      if (props.getBijuuScale() == 2)
        this.mainModel = (ModelBase)this.OneTailModel2; 
    } else if (this.mainModel instanceof ModelKyuubi1Tail2 && props.getBijuuFormActive() && props.getTransformed() && props.getBijuuScale() > 2) {
      this.mainModel = (ModelBase)this.empty;
    } else if (this.mainModel instanceof EmptyModel && props.getBijuuFormActive() && props.getTransformed() && props.getBijuuScale() == 2) {
      this.mainModel = (ModelBase)this.OneTailModel2;
    } else if ((this.mainModel instanceof EmptyModel || this.mainModel instanceof ModelKyuubi1Tail2) && props.getCurseSealTransformed()) {
      this.mainModel = (ModelBase)this.modelBipedMain;
    } 
    if (props.getTransformed() && props.getDeathPossession() == 2)
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(Hidan);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(Hidan);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getDeathPossession() == 7)
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(FullBringer1);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(FullBringer1);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getSageActive() && (props.getSageVersion() == 2 || props.getSageVersion() == 4 || props.getSageVersion() == 5))
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(Senjutsu);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(Senjutsu);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.isNekomode()) {
      GL11.glPushMatrix();
      NekoCustomModel nekoCustomModel = this.nekoCustomModel;
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      ((ModelBiped)nekoCustomModel).onGround = this.mainModel.onGround;
      ((ModelBiped)nekoCustomModel).isRiding = this.mainModel.isRiding;
      ((ModelBiped)nekoCustomModel).isChild = this.mainModel.isChild;
      if (this.mainModel instanceof ModelBiped) {
        ((ModelBiped)nekoCustomModel).heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
        ((ModelBiped)nekoCustomModel).heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
        ((ModelBiped)nekoCustomModel).isSneak = ((ModelBiped)this.mainModel).isSneak;
        ((ModelBiped)nekoCustomModel).aimedBow = ((ModelBiped)this.mainModel).aimedBow;
      } 
      nekoCustomModel.setLivingAnimations(entity, par2, par3, 0.0F);
      nekoCustomModel.render((Entity)entity, par2, par3, par4, par5, par6, par7);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
    } 
    if (props.getTransformed() && props.getSageActive() && props.getSageVersion() == 4)
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(SageClothes);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(SageClothes);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getSageVersion() == 4 && props.getSageActive())
      for (int i = 0; i < 4; i++) {
        SageModeModel modelBase = this.tutModel6;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(SageMode);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(SageMode);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getSageActive() && props.getSageVersion() == 1)
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(SenjutsuSnake);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(SenjutsuSnake);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getSageActive() && props.getSageVersion() == 3)
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(SenjutsuSlug);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(SenjutsuSlug);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getByakuganActive() && props.getByakuganSize() == 1)
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.tutModel4;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(ByakuganActive);
        modelBiped.bipedHead.showModel = (i == 0);
        modelBiped.bipedHeadwear.showModel = (i == 0);
        modelBiped.bipedBody.showModel = (i == 1 || i == 2);
        modelBiped.bipedRightArm.showModel = (i == 1);
        modelBiped.bipedLeftArm.showModel = (i == 1);
        modelBiped.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelBiped.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(ByakuganActive);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getKetsuryuganActive())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.tutModel4;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(Ketsuryugan);
        modelBiped.bipedHead.showModel = (i == 0);
        modelBiped.bipedHeadwear.showModel = (i == 0);
        modelBiped.bipedBody.showModel = (i == 1 || i == 2);
        modelBiped.bipedRightArm.showModel = (i == 1);
        modelBiped.bipedLeftArm.showModel = (i == 1);
        modelBiped.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelBiped.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(Ketsuryugan);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getCurseSeal() == 2 && props.getCurseSealActive())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(CurseSealBf);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(CurseSealBf);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getCurseSeal() == 3 && props.getCurseSealActive())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(CurseSealpt2);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(CurseSealpt2);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getCurseSeal() == 3 && props.getCurseSealActive())
      for (int i = 0; i < 4; i++) {
        CursedSealRank2HandsModel modelBase = this.CurseSealModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(CurseSealJH);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(CurseSealJH);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getCurseSeal() == 5 && props.getCurseSealActive()) {
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(CurseSeal2Mode1);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(CurseSeal2Mode1);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      } 
    } else if (props.getTransformed() && props.getCurseSeal() == 6 && props.getCurseSealActive()) {
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(CurseSealKimimaro);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(CurseSealKimimaro);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      } 
    } 
    if (props.getTransformed() && props.getCurseSeal() == 6 && props.getCurseSealActive())
      for (int i = 0; i < 4; i++) {
        CurseMark2Model modelBase = this.modelCurse2;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(CurseSeal2Mode);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(CurseSeal2Mode);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getCurseSeal() == 8 && props.getCurseSealActive())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(CurseSealTayuya1);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(CurseSealTayuya1);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getCurseSeal() == 9 && props.getCurseSealActive())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(CurseSealTayuya2);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(CurseSealTayuya2);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getCurseSeal() == 11 && props.getCurseSealActive())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(CurseSealKidomaru1);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(CurseSealKidomaru1);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getCurseSeal() == 12 && props.getCurseSealActive())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(CurseSealKidomaru2);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(CurseSealKidomaru2);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getCurseSeal() == 14 && props.getCurseSealActive())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(CurseSealJirobo1);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(CurseSealJirobo1);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getCurseSeal() == 15 && props.getCurseSealActive())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(CurseSealJirobo2);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(CurseSealJirobo2);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getCurseSeal() == 17 && props.getCurseSealActive())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(CurseSealUkon1);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(CurseSealUkon1);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getCurseSeal() == 18 && props.getCurseSealActive())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.modelCurse;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(CurseSealUkon2);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(CurseSealUkon2);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getSixPaths() && props.getSixPathsMode() && !props.getSixPathsShield())
      for (int i = 0; i < 4; i++) {
        sixpathsorbs modelBase = this.tutModel8;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getSixPathsOrbs() == 0)
          bindTexture(SixPathsOrbs0); 
        if (props.getSixPathsOrbs() == 1)
          bindTexture(SixPathsOrbs1); 
        if (props.getSixPathsOrbs() == 2)
          bindTexture(SixPathsOrbs2); 
        if (props.getSixPathsOrbs() == 3)
          bindTexture(SixPathsOrbs3); 
        if (props.getSixPathsOrbs() == 4)
          bindTexture(SixPathsOrbs4); 
        if (props.getSixPathsOrbs() == 5)
          bindTexture(SixPathsOrbs5); 
        if (props.getSixPathsOrbs() == 6)
          bindTexture(SixPathsOrbs6); 
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        if (props.getSixPathsOrbs() == 0)
          bindTexture(SixPathsOrbs0); 
        if (props.getSixPathsOrbs() == 1)
          bindTexture(SixPathsOrbs1); 
        if (props.getSixPathsOrbs() == 2)
          bindTexture(SixPathsOrbs2); 
        if (props.getSixPathsOrbs() == 3)
          bindTexture(SixPathsOrbs3); 
        if (props.getSixPathsOrbs() == 4)
          bindTexture(SixPathsOrbs4); 
        if (props.getSixPathsOrbs() == 5)
          bindTexture(SixPathsOrbs5); 
        if (props.getSixPathsOrbs() == 6)
          bindTexture(SixPathsOrbs6); 
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getSixPaths() && props.getSixPathsMode() && props.getSixPathsShield() && props.getSixPathsOrbs() == 0)
      for (int i = 0; i < 4; i++) {
        sixpathsshield modelBase = this.tutModel69;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(SixPathsShield);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(SixPathsShield);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getSusanoA() && props.getSharinganActive() && props.getSusanoTransformed() && props.getSusanoActive() == 1 && props.getSharingan() >= 4 && props.getSharingan() != 100 && props.getSharingan() != 101 && props.getSharingan() != 102 && props.getSharingan() != 150 && props.getSharingan() != 151)
      for (int i = 0; i < 4; i++) {
        SasukeSusanoCageModel modelBase = this.SusanoCageModelSasuke;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getSharingan() == 4 || props.getSharingan() == 5 || props.getSharingan() == 6 || props.getSharingan() == 174) {
          GL11.glPushMatrix();
          GL11.glEnable(3042);
          GL11.glBlendFunc(770, 771);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
          GL11.glScalef(4.0F, 4.0F, 4.0F);
          GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
          GL11.glTranslated(0.0D, 0.15D, 0.0D);
          bindTexture(textureSaske);
          Rebramodel.renderAll();
          GL11.glDisable(3042);
          GL11.glPopMatrix();
        } else if (props.getSharingan() == 7 || props.getSharingan() == 8 || props.getSharingan() == 9 || props.getSharingan() == 160 || props.getSharingan() == 92 || props.getSharingan() == 93 || props.getSharingan() == 183) {
          GL11.glPushMatrix();
          GL11.glEnable(3042);
          GL11.glBlendFunc(770, 771);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
          GL11.glScalef(4.0F, 4.0F, 4.0F);
          GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
          GL11.glTranslated(0.0D, 0.15D, 0.0D);
          bindTexture(textureItachi);
          Rebramodel.renderAll();
          GL11.glDisable(3042);
          GL11.glPopMatrix();
        } else if (props.getSharingan() == 10 || props.getSharingan() == 11 || props.getSharingan() == 12 || props.getSharingan() == 176) {
          GL11.glPushMatrix();
          GL11.glEnable(3042);
          GL11.glBlendFunc(770, 771);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
          GL11.glScalef(4.0F, 4.0F, 4.0F);
          GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
          GL11.glTranslated(0.0D, 0.15D, 0.0D);
          bindTexture(textureShisui);
          Rebramodel.renderAll();
          GL11.glDisable(3042);
          GL11.glPopMatrix();
        } else if (props.getSharingan() == 13 || props.getSharingan() == 14 || props.getSharingan() == 15 || props.getSharingan() == 171) {
          GL11.glPushMatrix();
          GL11.glEnable(3042);
          GL11.glBlendFunc(770, 771);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
          GL11.glScalef(4.0F, 4.0F, 4.0F);
          GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
          GL11.glTranslated(0.0D, 0.15D, 0.0D);
          bindTexture(textureObito);
          Rebramodel.renderAll();
          GL11.glDisable(3042);
          GL11.glPopMatrix();
        } else if (props.getSharingan() == 16 || props.getSharingan() == 17 || props.getSharingan() == 40 || props.getSharingan() == 165) {
          GL11.glPushMatrix();
          GL11.glEnable(3042);
          GL11.glBlendFunc(770, 771);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
          GL11.glScalef(4.0F, 4.0F, 4.0F);
          GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
          GL11.glTranslated(0.0D, 0.15D, 0.0D);
          bindTexture(textureMadara);
          Rebramodel.renderAll();
          GL11.glDisable(3042);
          GL11.glPopMatrix();
        } else {
          if (props.getSharingan() == 18 || props.getSharingan() == 19 || props.getSharingan() == 41 || props.getSharingan() == 161 || props.getSharingan() == 86 || props.getSharingan() == 87 || props.getSharingan() == 88 || props.getSharingan() == 89 || props.getSharingan() == 180 || props.getSharingan() == 181)
            bindTexture(SusanoCageIzuna); 
          if (props.getSharingan() == 20 || props.getSharingan() == 21 || props.getSharingan() == 42 || props.getSharingan() == 159)
            bindTexture(SusanoCageIndra); 
          if (props.getSharingan() == 22 || props.getSharingan() == 23 || props.getSharingan() == 43 || props.getSharingan() == 175)
            bindTexture(SusanoCageShin); 
          if (props.getSharingan() == 24 || props.getSharingan() == 25 || props.getSharingan() == 44 || props.getSharingan() == 169)
            bindTexture(SusanoCageNaori); 
          if (props.getSharingan() == 26 || props.getSharingan() == 27 || props.getSharingan() == 45 || props.getSharingan() == 152)
            bindTexture(SusanoCageBaru); 
          if (props.getSharingan() == 28 || props.getSharingan() == 29 || props.getSharingan() == 46 || props.getSharingan() == 172)
            bindTexture(SusanoCageRai); 
          if (props.getSharingan() == 30 || props.getSharingan() == 31 || props.getSharingan() == 47 || props.getSharingan() == 168)
            bindTexture(SusanoCageNaka); 
          if (props.getSharingan() == 32 || props.getSharingan() == 33 || props.getSharingan() == 34 || props.getSharingan() == 173 || props.getSharingan() == 90 || props.getSharingan() == 91 || props.getSharingan() == 182)
            bindTexture(SusanoCageRyuuho); 
          if (props.getSharingan() == 35 || props.getSharingan() == 36 || props.getSharingan() == 37)
            bindTexture(SusanoCageBrent); 
          if (props.getSharingan() == 48 || props.getSharingan() == 49 || props.getSharingan() == 50)
            bindTexture(SusanoCageMathioks); 
          if (props.getSharingan() == 60 || props.getSharingan() == 61 || props.getSharingan() == 167)
            bindTexture(MentrozSusanoCage); 
          if (props.getSharingan() == 62 || props.getSharingan() == 63 || props.getSharingan() == 156)
            bindTexture(DragozaiSusanoCage); 
          if (props.getSharingan() == 64 || props.getSharingan() == 65 || props.getSharingan() == 155)
            bindTexture(CoralSenseiSusanoCage); 
          if (props.getSharingan() == 66 || props.getSharingan() == 67 || props.getSharingan() == 166)
            bindTexture(McNASTYSusanoCage); 
          if (props.getSharingan() == 68 || props.getSharingan() == 69 || props.getSharingan() == 154)
            bindTexture(CharlieSusanoCage); 
          if (props.getSharingan() == 70 || props.getSharingan() == 71 || props.getSharingan() == 157)
            bindTexture(GrimbiteSusanoCage); 
          if (props.getSharingan() == 72 || props.getSharingan() == 73 || props.getSharingan() == 158)
            bindTexture(ha1denSusanoCage); 
          if (props.getSharingan() == 74 || props.getSharingan() == 75 || props.getSharingan() == 162)
            bindTexture(janglolroflmaoSusanoCage); 
          if (props.getSharingan() == 76 || props.getSharingan() == 77 || props.getSharingan() == 163)
            bindTexture(JORDANSusanoCage); 
          if (props.getSharingan() == 78 || props.getSharingan() == 79 || props.getSharingan() == 164)
            bindTexture(L0rdMadaraUchihaSusanoCage); 
          if (props.getSharingan() == 80 || props.getSharingan() == 81 || props.getSharingan() == 177)
            bindTexture(TomtomcatySusanoCage); 
          if (props.getSharingan() == 82 || props.getSharingan() == 83 || props.getSharingan() == 178)
            bindTexture(FujimotoSusanoCage); 
          if (props.getSharingan() == 84 || props.getSharingan() == 85 || props.getSharingan() == 179)
            bindTexture(YunusSusanoCage); 
          if (props.getSharingan() == 103 || props.getSharingan() == 104 || props.getSharingan() == 153)
            bindTexture(CandromSusanoCage); 
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelBiped);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          if (props.getSharingan() == 7 || props.getSharingan() == 8 || props.getSharingan() == 9 || props.getSharingan() == 160 || props.getSharingan() == 92 || props.getSharingan() == 93 || props.getSharingan() == 183)
            bindTexture(SusanoCageItachi); 
          if (props.getSharingan() == 10 || props.getSharingan() == 11 || props.getSharingan() == 12 || props.getSharingan() == 176)
            bindTexture(SusanoCageShisui); 
          if (props.getSharingan() == 13 || props.getSharingan() == 14 || props.getSharingan() == 15 || props.getSharingan() == 171)
            bindTexture(SusanoCageObito); 
          if (props.getSharingan() == 16 || props.getSharingan() == 17 || props.getSharingan() == 40 || props.getSharingan() == 165)
            bindTexture(SusanoCageMadara); 
          if (props.getSharingan() == 18 || props.getSharingan() == 19 || props.getSharingan() == 41 || props.getSharingan() == 161 || props.getSharingan() == 86 || props.getSharingan() == 87 || props.getSharingan() == 88 || props.getSharingan() == 89 || props.getSharingan() == 180 || props.getSharingan() == 181)
            bindTexture(SusanoCageIzuna); 
          if (props.getSharingan() == 20 || props.getSharingan() == 21 || props.getSharingan() == 42 || props.getSharingan() == 159)
            bindTexture(SusanoCageIndra); 
          if (props.getSharingan() == 22 || props.getSharingan() == 23 || props.getSharingan() == 43 || props.getSharingan() == 175)
            bindTexture(SusanoCageShin); 
          if (props.getSharingan() == 24 || props.getSharingan() == 25 || props.getSharingan() == 44 || props.getSharingan() == 169)
            bindTexture(SusanoCageNaori); 
          if (props.getSharingan() == 26 || props.getSharingan() == 27 || props.getSharingan() == 45 || props.getSharingan() == 152)
            bindTexture(SusanoCageBaru); 
          if (props.getSharingan() == 28 || props.getSharingan() == 29 || props.getSharingan() == 46 || props.getSharingan() == 172)
            bindTexture(SusanoCageRai); 
          if (props.getSharingan() == 30 || props.getSharingan() == 31 || props.getSharingan() == 47 || props.getSharingan() == 168)
            bindTexture(SusanoCageNaka); 
          if (props.getSharingan() == 32 || props.getSharingan() == 33 || props.getSharingan() == 34 || props.getSharingan() == 173 || props.getSharingan() == 90 || props.getSharingan() == 91 || props.getSharingan() == 182)
            bindTexture(SusanoCageRyuuho); 
          if (props.getSharingan() == 35 || props.getSharingan() == 36 || props.getSharingan() == 37)
            bindTexture(SusanoCageBrent); 
          if (props.getSharingan() == 48 || props.getSharingan() == 49 || props.getSharingan() == 50)
            bindTexture(SusanoCageMathioks); 
          if (props.getSharingan() == 60 || props.getSharingan() == 61 || props.getSharingan() == 167)
            bindTexture(MentrozSusanoCage); 
          if (props.getSharingan() == 62 || props.getSharingan() == 63 || props.getSharingan() == 156)
            bindTexture(DragozaiSusanoCage); 
          if (props.getSharingan() == 64 || props.getSharingan() == 65 || props.getSharingan() == 155)
            bindTexture(CoralSenseiSusanoCage); 
          if (props.getSharingan() == 66 || props.getSharingan() == 67 || props.getSharingan() == 166)
            bindTexture(McNASTYSusanoCage); 
          if (props.getSharingan() == 68 || props.getSharingan() == 69 || props.getSharingan() == 154)
            bindTexture(CharlieSusanoCage); 
          if (props.getSharingan() == 70 || props.getSharingan() == 71 || props.getSharingan() == 157)
            bindTexture(GrimbiteSusanoCage); 
          if (props.getSharingan() == 72 || props.getSharingan() == 73 || props.getSharingan() == 158)
            bindTexture(ha1denSusanoCage); 
          if (props.getSharingan() == 74 || props.getSharingan() == 75 || props.getSharingan() == 162)
            bindTexture(janglolroflmaoSusanoCage); 
          if (props.getSharingan() == 76 || props.getSharingan() == 77 || props.getSharingan() == 163)
            bindTexture(JORDANSusanoCage); 
          if (props.getSharingan() == 78 || props.getSharingan() == 79 || props.getSharingan() == 164)
            bindTexture(L0rdMadaraUchihaSusanoCage); 
          if (props.getSharingan() == 80 || props.getSharingan() == 81 || props.getSharingan() == 177)
            bindTexture(TomtomcatySusanoCage); 
          if (props.getSharingan() == 82 || props.getSharingan() == 83 || props.getSharingan() == 178)
            bindTexture(FujimotoSusanoCage); 
          if (props.getSharingan() == 84 || props.getSharingan() == 85 || props.getSharingan() == 179)
            bindTexture(YunusSusanoCage); 
          if (props.getSharingan() == 103 || props.getSharingan() == 104 || props.getSharingan() == 153)
            bindTexture(CandromSusanoCage); 
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.0F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
          GL11.glEnable(2896);
        } 
      }  
    if (props.getSusanoA() && props.getSharinganActive() && props.getSusanoTransformed() && props.getSusanoActive() == 2 && props.getSharingan() >= 4 && props.getSharingan() != 7 && props.getSharingan() != 8 && props.getSharingan() != 9 && props.getSharingan() != 100 && props.getSharingan() != 101 && props.getSharingan() != 102 && props.getSharingan() != 160 && props.getSharingan() != 150 && props.getSharingan() != 151)
      for (int i = 0; i < 4; i++) {
        SasukeSusanoSkeletonModel modelBase = this.SusanoSkeletonModelSasuke;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getSharingan() == 4 || props.getSharingan() == 5 || props.getSharingan() == 6 || props.getSharingan() == 174) {
          GL11.glPushMatrix();
          GL11.glEnable(3042);
          GL11.glBlendFunc(770, 771);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
          GL11.glScalef(4.0F, 4.0F, 4.0F);
          GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
          GL11.glTranslated(0.0D, 0.2D, -0.3D);
          bindTexture(textureSaske2);
          SaskeRebra2model.renderAll();
          GL11.glDisable(3042);
          GL11.glPopMatrix();
        } else if (props.getSharingan() == 7 || props.getSharingan() == 8 || props.getSharingan() == 9 || props.getSharingan() == 160 || props.getSharingan() == 92 || props.getSharingan() == 93 || props.getSharingan() == 183) {
          GL11.glPushMatrix();
          GL11.glEnable(3042);
          GL11.glBlendFunc(770, 771);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
          GL11.glScalef(4.0F, 4.0F, 4.0F);
          GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
          GL11.glTranslated(0.0D, 0.2D, -0.3D);
          bindTexture(textureItachi2);
          ItachiRebra2model.renderAll();
          GL11.glDisable(3042);
          GL11.glPopMatrix();
        } else if (props.getSharingan() == 10 || props.getSharingan() == 11 || props.getSharingan() == 12 || props.getSharingan() == 176) {
          GL11.glPushMatrix();
          GL11.glEnable(3042);
          GL11.glBlendFunc(770, 771);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
          GL11.glScalef(4.0F, 4.0F, 4.0F);
          GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
          GL11.glTranslated(0.0D, 0.2D, -0.3D);
          bindTexture(textureShisui2);
          ShisuiRebra2model.renderAll();
          GL11.glDisable(3042);
          GL11.glPopMatrix();
        } else if (props.getSharingan() == 13 || props.getSharingan() == 14 || props.getSharingan() == 15 || props.getSharingan() == 171) {
          GL11.glPushMatrix();
          GL11.glEnable(3042);
          GL11.glBlendFunc(770, 771);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
          GL11.glScalef(4.0F, 4.0F, 4.0F);
          GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
          GL11.glTranslated(0.0D, 0.2D, -0.3D);
          bindTexture(textureObito2);
          ObitoRebra2model.renderAll();
          GL11.glDisable(3042);
          GL11.glPopMatrix();
        } else if (props.getSharingan() == 16 || props.getSharingan() == 17 || props.getSharingan() == 40 || props.getSharingan() == 165) {
          GL11.glPushMatrix();
          GL11.glEnable(3042);
          GL11.glBlendFunc(770, 771);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
          GL11.glScalef(4.0F, 4.0F, 4.0F);
          GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
          GL11.glTranslated(0.0D, 0.2D, -0.3D);
          bindTexture(textureMadara2);
          MadaraRebra2model.renderAll();
          GL11.glDisable(3042);
          GL11.glPopMatrix();
        } else {
          if (props.getSharingan() == 4 || props.getSharingan() == 5 || props.getSharingan() == 6 || props.getSharingan() == 174)
            bindTexture(SusanoSkeletonSasuke); 
          if (props.getSharingan() == 7 || props.getSharingan() == 8 || props.getSharingan() == 9 || props.getSharingan() == 160 || props.getSharingan() == 92 || props.getSharingan() == 93 || props.getSharingan() == 183)
            bindTexture(SusanoSkeletonItachi); 
          if (props.getSharingan() == 10 || props.getSharingan() == 11 || props.getSharingan() == 12 || props.getSharingan() == 176)
            bindTexture(SusanoSkeletonShisui); 
          if (props.getSharingan() == 13 || props.getSharingan() == 14 || props.getSharingan() == 15 || props.getSharingan() == 171)
            bindTexture(SusanoSkeletonObito); 
          if (props.getSharingan() == 16 || props.getSharingan() == 17 || props.getSharingan() == 40 || props.getSharingan() == 165)
            bindTexture(SusanoSkeletonMadara); 
          if (props.getSharingan() == 18 || props.getSharingan() == 19 || props.getSharingan() == 41 || props.getSharingan() == 161 || props.getSharingan() == 86 || props.getSharingan() == 87 || props.getSharingan() == 88 || props.getSharingan() == 89 || props.getSharingan() == 180 || props.getSharingan() == 181)
            bindTexture(SusanoSkeletonIzuna); 
          if (props.getSharingan() == 20 || props.getSharingan() == 21 || props.getSharingan() == 42 || props.getSharingan() == 159)
            bindTexture(SusanoSkeletonIndra); 
          if (props.getSharingan() == 22 || props.getSharingan() == 23 || props.getSharingan() == 43 || props.getSharingan() == 175)
            bindTexture(SusanoSkeletonShin); 
          if (props.getSharingan() == 24 || props.getSharingan() == 25 || props.getSharingan() == 44 || props.getSharingan() == 169)
            bindTexture(SusanoSkeletonNaori); 
          if (props.getSharingan() == 26 || props.getSharingan() == 27 || props.getSharingan() == 45 || props.getSharingan() == 152)
            bindTexture(SusanoSkeletonBaru); 
          if (props.getSharingan() == 28 || props.getSharingan() == 29 || props.getSharingan() == 46 || props.getSharingan() == 172)
            bindTexture(SusanoSkeletonRai); 
          if (props.getSharingan() == 30 || props.getSharingan() == 31 || props.getSharingan() == 47 || props.getSharingan() == 168)
            bindTexture(SusanoSkeletonNaka); 
          if (props.getSharingan() == 32 || props.getSharingan() == 33 || props.getSharingan() == 34 || props.getSharingan() == 173 || props.getSharingan() == 90 || props.getSharingan() == 91 || props.getSharingan() == 182)
            bindTexture(SusanoSkeletonRyuuho); 
          if (props.getSharingan() == 35 || props.getSharingan() == 36 || props.getSharingan() == 37)
            bindTexture(SusanoSkeletonBrent); 
          if (props.getSharingan() == 48 || props.getSharingan() == 49 || props.getSharingan() == 50)
            bindTexture(SusanoSkeletonMathioks); 
          if (props.getSharingan() == 60 || props.getSharingan() == 61 || props.getSharingan() == 167)
            bindTexture(MentrozSusanoSkeleton); 
          if (props.getSharingan() == 62 || props.getSharingan() == 63 || props.getSharingan() == 156)
            bindTexture(DragozaiSusanoSkeleton); 
          if (props.getSharingan() == 64 || props.getSharingan() == 65 || props.getSharingan() == 155)
            bindTexture(CoralSenseiSusanoSkeleton); 
          if (props.getSharingan() == 66 || props.getSharingan() == 67 || props.getSharingan() == 166)
            bindTexture(McNASTYSusanoSkeleton); 
          if (props.getSharingan() == 68 || props.getSharingan() == 69 || props.getSharingan() == 154)
            bindTexture(CharlieSusanoSkeleton); 
          if (props.getSharingan() == 70 || props.getSharingan() == 71 || props.getSharingan() == 157)
            bindTexture(GrimbiteSusanoSkeleton); 
          if (props.getSharingan() == 72 || props.getSharingan() == 73 || props.getSharingan() == 158)
            bindTexture(ha1denSusanoSkeleton); 
          if (props.getSharingan() == 74 || props.getSharingan() == 75 || props.getSharingan() == 162)
            bindTexture(janglolroflmaoSusanoSkeleton); 
          if (props.getSharingan() == 76 || props.getSharingan() == 77 || props.getSharingan() == 163)
            bindTexture(JORDANSusanoSkeleton); 
          if (props.getSharingan() == 78 || props.getSharingan() == 79 || props.getSharingan() == 164)
            bindTexture(L0rdMadaraUchihaSusanoSkeleton); 
          if (props.getSharingan() == 80 || props.getSharingan() == 81 || props.getSharingan() == 177)
            bindTexture(TomtomcatySusanoSkeleton); 
          if (props.getSharingan() == 82 || props.getSharingan() == 83 || props.getSharingan() == 178)
            bindTexture(FujimotoSusanoSkeleton); 
          if (props.getSharingan() == 84 || props.getSharingan() == 85 || props.getSharingan() == 179)
            bindTexture(YunusSusanoSkeleton); 
          if (props.getSharingan() == 103 || props.getSharingan() == 104 || props.getSharingan() == 153)
            bindTexture(CandromSusanoSkeleton); 
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelBiped);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          if (props.getSharingan() == 4 || props.getSharingan() == 5 || props.getSharingan() == 6 || props.getSharingan() == 174)
            bindTexture(SusanoSkeletonSasuke); 
          if (props.getSharingan() == 7 || props.getSharingan() == 8 || props.getSharingan() == 9 || props.getSharingan() == 160 || props.getSharingan() == 92 || props.getSharingan() == 93 || props.getSharingan() == 183)
            bindTexture(SusanoSkeletonItachi); 
          if (props.getSharingan() == 10 || props.getSharingan() == 11 || props.getSharingan() == 12 || props.getSharingan() == 176)
            bindTexture(SusanoSkeletonShisui); 
          if (props.getSharingan() == 13 || props.getSharingan() == 14 || props.getSharingan() == 15 || props.getSharingan() == 171)
            bindTexture(SusanoSkeletonObito); 
          if (props.getSharingan() == 16 || props.getSharingan() == 17 || props.getSharingan() == 40 || props.getSharingan() == 165)
            bindTexture(SusanoSkeletonMadara); 
          if (props.getSharingan() == 18 || props.getSharingan() == 19 || props.getSharingan() == 41 || props.getSharingan() == 161 || props.getSharingan() == 86 || props.getSharingan() == 87 || props.getSharingan() == 88 || props.getSharingan() == 89 || props.getSharingan() == 180 || props.getSharingan() == 181)
            bindTexture(SusanoSkeletonIzuna); 
          if (props.getSharingan() == 20 || props.getSharingan() == 21 || props.getSharingan() == 42 || props.getSharingan() == 159)
            bindTexture(SusanoSkeletonIndra); 
          if (props.getSharingan() == 22 || props.getSharingan() == 23 || props.getSharingan() == 43 || props.getSharingan() == 175)
            bindTexture(SusanoSkeletonShin); 
          if (props.getSharingan() == 24 || props.getSharingan() == 25 || props.getSharingan() == 44 || props.getSharingan() == 169)
            bindTexture(SusanoSkeletonNaori); 
          if (props.getSharingan() == 26 || props.getSharingan() == 27 || props.getSharingan() == 45 || props.getSharingan() == 152)
            bindTexture(SusanoSkeletonBaru); 
          if (props.getSharingan() == 28 || props.getSharingan() == 29 || props.getSharingan() == 46 || props.getSharingan() == 172)
            bindTexture(SusanoSkeletonRai); 
          if (props.getSharingan() == 30 || props.getSharingan() == 31 || props.getSharingan() == 47 || props.getSharingan() == 168)
            bindTexture(SusanoSkeletonNaka); 
          if (props.getSharingan() == 32 || props.getSharingan() == 33 || props.getSharingan() == 34 || props.getSharingan() == 173 || props.getSharingan() == 90 || props.getSharingan() == 91 || props.getSharingan() == 182)
            bindTexture(SusanoSkeletonRyuuho); 
          if (props.getSharingan() == 35 || props.getSharingan() == 36 || props.getSharingan() == 37)
            bindTexture(SusanoSkeletonBrent); 
          if (props.getSharingan() == 48 || props.getSharingan() == 49 || props.getSharingan() == 50)
            bindTexture(SusanoSkeletonMathioks); 
          if (props.getSharingan() == 60 || props.getSharingan() == 61 || props.getSharingan() == 167)
            bindTexture(MentrozSusanoSkeleton); 
          if (props.getSharingan() == 62 || props.getSharingan() == 63 || props.getSharingan() == 156)
            bindTexture(DragozaiSusanoSkeleton); 
          if (props.getSharingan() == 64 || props.getSharingan() == 65 || props.getSharingan() == 155)
            bindTexture(CoralSenseiSusanoSkeleton); 
          if (props.getSharingan() == 66 || props.getSharingan() == 67 || props.getSharingan() == 166)
            bindTexture(McNASTYSusanoSkeleton); 
          if (props.getSharingan() == 68 || props.getSharingan() == 69 || props.getSharingan() == 154)
            bindTexture(CharlieSusanoSkeleton); 
          if (props.getSharingan() == 70 || props.getSharingan() == 71 || props.getSharingan() == 157)
            bindTexture(GrimbiteSusanoSkeleton); 
          if (props.getSharingan() == 72 || props.getSharingan() == 73 || props.getSharingan() == 158)
            bindTexture(ha1denSusanoSkeleton); 
          if (props.getSharingan() == 74 || props.getSharingan() == 75 || props.getSharingan() == 162)
            bindTexture(janglolroflmaoSusanoSkeleton); 
          if (props.getSharingan() == 76 || props.getSharingan() == 77 || props.getSharingan() == 163)
            bindTexture(JORDANSusanoSkeleton); 
          if (props.getSharingan() == 78 || props.getSharingan() == 79 || props.getSharingan() == 164)
            bindTexture(L0rdMadaraUchihaSusanoSkeleton); 
          if (props.getSharingan() == 80 || props.getSharingan() == 81 || props.getSharingan() == 177)
            bindTexture(TomtomcatySusanoSkeleton); 
          if (props.getSharingan() == 82 || props.getSharingan() == 83 || props.getSharingan() == 178)
            bindTexture(FujimotoSusanoSkeleton); 
          if (props.getSharingan() == 84 || props.getSharingan() == 85 || props.getSharingan() == 179)
            bindTexture(YunusSusanoSkeleton); 
          if (props.getSharingan() == 103 || props.getSharingan() == 104 || props.getSharingan() == 153)
            bindTexture(CandromSusanoSkeleton); 
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.0F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
          GL11.glEnable(2896);
        } 
      }  
    if (props.getSusanoA() && props.getSharinganActive() && props.getSusanoTransformed() && props.getSusanoActive() == 2 && (props.getSharingan() == 7 || props.getSharingan() == 8 || props.getSharingan() == 9 || props.getSharingan() == 160 || props.getSharingan() == 92 || props.getSharingan() == 93 || props.getSharingan() == 183))
      for (int i = 0; i < 4; i++) {
        GL11.glPushMatrix();
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
        GL11.glScalef(4.0F, 4.0F, 4.0F);
        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
        GL11.glTranslated(0.0D, 0.2D, -0.3D);
        bindTexture(textureItachi2);
        ItachiRebra2model.renderAll();
        GL11.glDisable(3042);
        GL11.glPopMatrix();
      }  
    if (props.getSusanoA() && props.getSharinganActive() && props.getSusanoTransformed() && props.getSusanoActive() == 4 && (props.getSharingan() == 48 || props.getSharingan() == 49 || props.getSharingan() == 103 || props.getSharingan() == 153 || (props.getSharingan() == 104 && props.getSharingan() != 100 && props.getSharingan() != 101 && props.getSharingan() != 102 && props.getSharingan() != 150 && props.getSharingan() != 151))) {
      GL11.glTranslatef(0.0F, 0.7F, 0.0F);
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      for (int i = 0; i < 4; i++) {
        MathioksSusanoArmorModel modelBase = this.MathioksSusanoArmorModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getSharingan() == 48 || props.getSharingan() == 49 || props.getSharingan() == 50)
          bindTexture(SusanoArmorMathioks); 
        if (props.getSharingan() == 103 || props.getSharingan() == 104 || props.getSharingan() == 153)
          bindTexture(CandromSusanoArmor); 
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        if (props.getSharingan() == 48 || props.getSharingan() == 49 || props.getSharingan() == 50)
          bindTexture(SusanoArmorMathioks); 
        if (props.getSharingan() == 103 || props.getSharingan() == 104 || props.getSharingan() == 153)
          bindTexture(CandromSusanoArmor); 
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      } 
    } 
    if (props.getSusanoA() && props.getSharinganActive() && props.getSusanoTransformed() && props.getSusanoActive() == 4 && props.getSharingan() >= 4 && props.getSharingan() != 48 && props.getSharingan() != 49 && props.getSharingan() != 50 && props.getSharingan() != 51 && props.getSharingan() != 52 && props.getSharingan() != 100 && props.getSharingan() != 101 && props.getSharingan() != 102 && props.getSharingan() != 150 && props.getSharingan() != 151 && props.getSharingan() != 153 && props.getSharingan() != 103 && props.getSharingan() != 104) {
      GL11.glScalef(0.7F, 0.7F, 0.7F);
      GL11.glTranslatef(0.0F, 1.0F, 0.0F);
      for (int i = 0; i < 4; i++) {
        SasukeSusanoCompleteModel modelBase = this.SusanoCompleteModelSasuke;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getSharingan() == 4 || props.getSharingan() == 5 || props.getSharingan() == 6 || props.getSharingan() == 20 || props.getSharingan() == 21 || props.getSharingan() == 42 || props.getSharingan() == 174 || props.getSharingan() == 159)
          bindTexture(SusanoArmorSasuke); 
        if (props.getSharingan() == 7 || props.getSharingan() == 8 || props.getSharingan() == 9 || props.getSharingan() == 160 || props.getSharingan() == 92 || props.getSharingan() == 93 || props.getSharingan() == 183)
          bindTexture(SusanoArmorItachi); 
        if (props.getSharingan() == 10 || props.getSharingan() == 11 || props.getSharingan() == 12 || props.getSharingan() == 176)
          bindTexture(SusanoArmorShisui); 
        if (props.getSharingan() == 13 || props.getSharingan() == 14 || props.getSharingan() == 15 || props.getSharingan() == 171)
          bindTexture(SusanoArmorObito); 
        if (props.getSharingan() == 16 || props.getSharingan() == 17 || props.getSharingan() == 40 || props.getSharingan() == 165)
          bindTexture(SusanoArmorMadara); 
        if (props.getSharingan() == 18 || props.getSharingan() == 19 || props.getSharingan() == 41 || props.getSharingan() == 161 || props.getSharingan() == 86 || props.getSharingan() == 87 || props.getSharingan() == 88 || props.getSharingan() == 89 || props.getSharingan() == 180 || props.getSharingan() == 181)
          bindTexture(SusanoArmorIzuna); 
        if (props.getSharingan() == 22 || props.getSharingan() == 23 || props.getSharingan() == 43 || props.getSharingan() == 175)
          bindTexture(SusanoArmorShin); 
        if (props.getSharingan() == 24 || props.getSharingan() == 25 || props.getSharingan() == 44 || props.getSharingan() == 169)
          bindTexture(SusanoArmorNaori); 
        if (props.getSharingan() == 26 || props.getSharingan() == 27 || props.getSharingan() == 45 || props.getSharingan() == 152)
          bindTexture(SusanoArmorBaru); 
        if (props.getSharingan() == 28 || props.getSharingan() == 29 || props.getSharingan() == 46 || props.getSharingan() == 172)
          bindTexture(SusanoArmorRai); 
        if (props.getSharingan() == 30 || props.getSharingan() == 31 || props.getSharingan() == 47 || props.getSharingan() == 168)
          bindTexture(SusanoArmorNaka); 
        if (props.getSharingan() == 32 || props.getSharingan() == 33 || props.getSharingan() == 34 || props.getSharingan() == 173 || props.getSharingan() == 90 || props.getSharingan() == 91 || props.getSharingan() == 182)
          bindTexture(SusanoArmorRyuuho); 
        if (props.getSharingan() == 35 || props.getSharingan() == 36 || props.getSharingan() == 37)
          bindTexture(SusanoArmorBrent); 
        if (props.getSharingan() == 60 || props.getSharingan() == 61 || props.getSharingan() == 167)
          bindTexture(MentrozSusanoArmor); 
        if (props.getSharingan() == 62 || props.getSharingan() == 63 || props.getSharingan() == 156)
          bindTexture(DragozaiSusanoArmor); 
        if (props.getSharingan() == 64 || props.getSharingan() == 65 || props.getSharingan() == 155)
          bindTexture(CoralSenseiSusanoArmor); 
        if (props.getSharingan() == 66 || props.getSharingan() == 67 || props.getSharingan() == 166)
          bindTexture(McNASTYSusanoArmor); 
        if (props.getSharingan() == 68 || props.getSharingan() == 69 || props.getSharingan() == 154)
          bindTexture(CharlieSusanoArmor); 
        if (props.getSharingan() == 70 || props.getSharingan() == 71 || props.getSharingan() == 157)
          bindTexture(GrimbiteSusanoArmor); 
        if (props.getSharingan() == 72 || props.getSharingan() == 73 || props.getSharingan() == 158)
          bindTexture(ha1denSusanoArmor); 
        if (props.getSharingan() == 74 || props.getSharingan() == 75 || props.getSharingan() == 162)
          bindTexture(janglolroflmaoSusanoArmor); 
        if (props.getSharingan() == 76 || props.getSharingan() == 77 || props.getSharingan() == 163)
          bindTexture(JORDANSusanoArmor); 
        if (props.getSharingan() == 78 || props.getSharingan() == 79 || props.getSharingan() == 164)
          bindTexture(L0rdMadaraUchihaSusanoArmor); 
        if (props.getSharingan() == 80 || props.getSharingan() == 81 || props.getSharingan() == 177)
          bindTexture(TomtomcatySusanoArmor); 
        if (props.getSharingan() == 82 || props.getSharingan() == 83 || props.getSharingan() == 178)
          bindTexture(FujimotoSusanoArmor); 
        if (props.getSharingan() == 84 || props.getSharingan() == 85 || props.getSharingan() == 179)
          bindTexture(YunusSusanoArmor); 
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        if (props.getSharingan() == 4 || props.getSharingan() == 5 || props.getSharingan() == 6 || props.getSharingan() == 20 || props.getSharingan() == 21 || props.getSharingan() == 42 || props.getSharingan() == 174 || props.getSharingan() == 159)
          bindTexture(SusanoArmorSasuke); 
        if (props.getSharingan() == 7 || props.getSharingan() == 8 || props.getSharingan() == 9 || props.getSharingan() == 160 || props.getSharingan() == 92 || props.getSharingan() == 93 || props.getSharingan() == 183)
          bindTexture(SusanoArmorItachi); 
        if (props.getSharingan() == 10 || props.getSharingan() == 11 || props.getSharingan() == 12 || props.getSharingan() == 176)
          bindTexture(SusanoArmorShisui); 
        if (props.getSharingan() == 13 || props.getSharingan() == 14 || props.getSharingan() == 15 || props.getSharingan() == 171)
          bindTexture(SusanoArmorObito); 
        if (props.getSharingan() == 16 || props.getSharingan() == 17 || props.getSharingan() == 40 || props.getSharingan() == 165)
          bindTexture(SusanoArmorMadara); 
        if (props.getSharingan() == 18 || props.getSharingan() == 19 || props.getSharingan() == 41 || props.getSharingan() == 161 || props.getSharingan() == 86 || props.getSharingan() == 87 || props.getSharingan() == 88 || props.getSharingan() == 89 || props.getSharingan() == 180 || props.getSharingan() == 181)
          bindTexture(SusanoArmorIzuna); 
        if (props.getSharingan() == 22 || props.getSharingan() == 23 || props.getSharingan() == 43 || props.getSharingan() == 175)
          bindTexture(SusanoArmorShin); 
        if (props.getSharingan() == 24 || props.getSharingan() == 25 || props.getSharingan() == 44 || props.getSharingan() == 169)
          bindTexture(SusanoArmorNaori); 
        if (props.getSharingan() == 26 || props.getSharingan() == 27 || props.getSharingan() == 45 || props.getSharingan() == 152)
          bindTexture(SusanoArmorBaru); 
        if (props.getSharingan() == 28 || props.getSharingan() == 29 || props.getSharingan() == 46 || props.getSharingan() == 172)
          bindTexture(SusanoArmorRai); 
        if (props.getSharingan() == 30 || props.getSharingan() == 31 || props.getSharingan() == 47 || props.getSharingan() == 168)
          bindTexture(SusanoArmorNaka); 
        if (props.getSharingan() == 32 || props.getSharingan() == 33 || props.getSharingan() == 34 || props.getSharingan() == 173 || props.getSharingan() == 90 || props.getSharingan() == 91 || props.getSharingan() == 182)
          bindTexture(SusanoArmorRyuuho); 
        if (props.getSharingan() == 35 || props.getSharingan() == 36 || props.getSharingan() == 37)
          bindTexture(SusanoArmorBrent); 
        if (props.getSharingan() == 60 || props.getSharingan() == 61 || props.getSharingan() == 167)
          bindTexture(MentrozSusanoArmor); 
        if (props.getSharingan() == 62 || props.getSharingan() == 63 || props.getSharingan() == 156)
          bindTexture(DragozaiSusanoArmor); 
        if (props.getSharingan() == 64 || props.getSharingan() == 65 || props.getSharingan() == 155)
          bindTexture(CoralSenseiSusanoArmor); 
        if (props.getSharingan() == 66 || props.getSharingan() == 67 || props.getSharingan() == 166)
          bindTexture(McNASTYSusanoArmor); 
        if (props.getSharingan() == 68 || props.getSharingan() == 69 || props.getSharingan() == 154)
          bindTexture(CharlieSusanoArmor); 
        if (props.getSharingan() == 70 || props.getSharingan() == 71 || props.getSharingan() == 157)
          bindTexture(GrimbiteSusanoArmor); 
        if (props.getSharingan() == 72 || props.getSharingan() == 73 || props.getSharingan() == 158)
          bindTexture(ha1denSusanoArmor); 
        if (props.getSharingan() == 74 || props.getSharingan() == 75 || props.getSharingan() == 162)
          bindTexture(janglolroflmaoSusanoArmor); 
        if (props.getSharingan() == 76 || props.getSharingan() == 77 || props.getSharingan() == 163)
          bindTexture(JORDANSusanoArmor); 
        if (props.getSharingan() == 78 || props.getSharingan() == 79 || props.getSharingan() == 164)
          bindTexture(L0rdMadaraUchihaSusanoArmor); 
        if (props.getSharingan() == 80 || props.getSharingan() == 81 || props.getSharingan() == 177)
          bindTexture(TomtomcatySusanoArmor); 
        if (props.getSharingan() == 82 || props.getSharingan() == 83 || props.getSharingan() == 178)
          bindTexture(FujimotoSusanoArmor); 
        if (props.getSharingan() == 84 || props.getSharingan() == 85 || props.getSharingan() == 179)
          bindTexture(YunusSusanoArmor); 
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glScalef(0.2F, 0.2F, 0.2F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glScalef(0.2F, 0.2F, 0.2F);
        GL11.glEnable(2896);
      } 
    } 
    if (props.getSusanoA() && props.getSharinganActive() && props.getSusanoTransformed() && props.getSusanoActive() == 3 && (props.getSharingan() == 5 || props.getSharingan() == 6 || props.getSharingan() == 4 || props.getSharingan() == 174))
      for (int i = 0; i < 4; i++) {
        GL11.glPushMatrix();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glScalef(4.0F, 4.0F, 4.0F);
        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
        GL11.glTranslated(0.06D, 0.1D, -0.4D);
        bindTexture(textureSaske3);
        SaskeRebra3model.renderAll();
        GL11.glDisable(3042);
        GL11.glPopMatrix();
      }  
    if (props.getSusanoA() && props.getSharinganActive() && props.getSusanoTransformed() && props.getSusanoActive() == 3 && (props.getSharingan() == 20 || props.getSharingan() == 21 || props.getSharingan() == 42 || props.getSharingan() == 48 || props.getSharingan() == 49 || props.getSharingan() == 50 || props.getSharingan() == 32 || props.getSharingan() == 33 || props.getSharingan() == 34 || props.getSharingan() == 60 || props.getSharingan() == 61 || props.getSharingan() == 62 || props.getSharingan() == 63 || props.getSharingan() == 64 || props.getSharingan() == 65 || props.getSharingan() == 68 || props.getSharingan() == 69 || props.getSharingan() == 74 || props.getSharingan() == 75 || props.getSharingan() == 78 || props.getSharingan() == 79 || props.getSharingan() == 80 || props.getSharingan() == 81 || props.getSharingan() == 103 || props.getSharingan() == 104 || props.getSharingan() == 173 || props.getSharingan() == 159 || props.getSharingan() == 167 || props.getSharingan() == 156 || props.getSharingan() == 155 || props.getSharingan() == 154 || props.getSharingan() == 162 || props.getSharingan() == 164 || props.getSharingan() == 177 || props.getSharingan() == 153)) {
      GL11.glScalef(0.7F, 0.7F, 0.7F);
      GL11.glTranslatef(0.0F, 1.0F, 0.0F);
      for (int i = 0; i < 4; i++) {
        IndraSusanoCompleteModel modelBase = this.SusanoCompleteModelIndra;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getSharingan() == 20 || props.getSharingan() == 21 || props.getSharingan() == 42 || props.getSharingan() == 159)
          bindTexture(SusanoCompleteIndra); 
        if (props.getSharingan() == 48 || props.getSharingan() == 49 || props.getSharingan() == 50)
          bindTexture(SusanoCompleteMathioks); 
        if (props.getSharingan() == 32 || props.getSharingan() == 33 || props.getSharingan() == 34 || props.getSharingan() == 173 || props.getSharingan() == 90 || props.getSharingan() == 91 || props.getSharingan() == 182)
          bindTexture(SusanoCompleteRyuuho); 
        if (props.getSharingan() == 60 || props.getSharingan() == 61 || props.getSharingan() == 167)
          bindTexture(MentrozSusanoComplete); 
        if (props.getSharingan() == 62 || props.getSharingan() == 63 || props.getSharingan() == 156)
          bindTexture(DragozaiSusanoComplete); 
        if (props.getSharingan() == 64 || props.getSharingan() == 65 || props.getSharingan() == 155)
          bindTexture(CoralSenseiSusanoComplete); 
        if (props.getSharingan() == 68 || props.getSharingan() == 69 || props.getSharingan() == 154)
          bindTexture(CharlieSusanoComplete); 
        if (props.getSharingan() == 74 || props.getSharingan() == 75 || props.getSharingan() == 162)
          bindTexture(janglolroflmaoSusanoComplete); 
        if (props.getSharingan() == 78 || props.getSharingan() == 79 || props.getSharingan() == 164)
          bindTexture(L0rdMadaraUchihaSusanoComplete); 
        if (props.getSharingan() == 80 || props.getSharingan() == 81 || props.getSharingan() == 177)
          bindTexture(TomtomcatySusanoComplete); 
        if (props.getSharingan() == 103 || props.getSharingan() == 104 || props.getSharingan() == 153)
          bindTexture(CandromSusanoComplete); 
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        if (props.getSharingan() == 20 || props.getSharingan() == 21 || props.getSharingan() == 42 || props.getSharingan() == 159)
          bindTexture(SusanoCompleteIndra); 
        if (props.getSharingan() == 48 || props.getSharingan() == 49 || props.getSharingan() == 50)
          bindTexture(SusanoCompleteMathioks); 
        if (props.getSharingan() == 32 || props.getSharingan() == 33 || props.getSharingan() == 34 || props.getSharingan() == 173 || props.getSharingan() == 90 || props.getSharingan() == 91 || props.getSharingan() == 182)
          bindTexture(SusanoCompleteRyuuho); 
        if (props.getSharingan() == 60 || props.getSharingan() == 61 || props.getSharingan() == 167)
          bindTexture(MentrozSusanoComplete); 
        if (props.getSharingan() == 62 || props.getSharingan() == 63 || props.getSharingan() == 156)
          bindTexture(DragozaiSusanoComplete); 
        if (props.getSharingan() == 64 || props.getSharingan() == 65 || props.getSharingan() == 155)
          bindTexture(CoralSenseiSusanoComplete); 
        if (props.getSharingan() == 68 || props.getSharingan() == 69 || props.getSharingan() == 154)
          bindTexture(CharlieSusanoComplete); 
        if (props.getSharingan() == 74 || props.getSharingan() == 75 || props.getSharingan() == 162)
          bindTexture(janglolroflmaoSusanoComplete); 
        if (props.getSharingan() == 78 || props.getSharingan() == 79 || props.getSharingan() == 164)
          bindTexture(L0rdMadaraUchihaSusanoComplete); 
        if (props.getSharingan() == 80 || props.getSharingan() == 81 || props.getSharingan() == 177)
          bindTexture(TomtomcatySusanoComplete); 
        if (props.getSharingan() == 103 || props.getSharingan() == 104 || props.getSharingan() == 153)
          bindTexture(CandromSusanoComplete); 
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glScalef(0.2F, 0.2F, 0.2F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glScalef(0.2F, 0.2F, 0.2F);
        GL11.glEnable(2896);
      } 
    } 
    if (props.getSusanoA() && props.getSharinganActive() && props.getSusanoTransformed() && props.getSusanoActive() == 3 && (props.getSharingan() == 7 || props.getSharingan() == 8 || props.getSharingan() == 9 || props.getSharingan() == 26 || props.getSharingan() == 27 || props.getSharingan() == 45 || props.getSharingan() == 30 || props.getSharingan() == 31 || props.getSharingan() == 47 || props.getSharingan() == 24 || props.getSharingan() == 25 || props.getSharingan() == 44 || props.getSharingan() == 28 || props.getSharingan() == 29 || props.getSharingan() == 46 || props.getSharingan() == 22 || props.getSharingan() == 23 || props.getSharingan() == 43 || props.getSharingan() == 10 || props.getSharingan() == 11 || props.getSharingan() == 12 || props.getSharingan() == 72 || props.getSharingan() == 73 || props.getSharingan() == 160 || props.getSharingan() == 152 || props.getSharingan() == 168 || props.getSharingan() == 169 || props.getSharingan() == 172 || props.getSharingan() == 175 || props.getSharingan() == 176 || props.getSharingan() == 158 || props.getSharingan() == 82 || props.getSharingan() == 83 || props.getSharingan() == 178 || props.getSharingan() == 84 || props.getSharingan() == 85 || props.getSharingan() == 179 || props.getSharingan() == 92 || props.getSharingan() == 93 || props.getSharingan() == 183)) {
      GL11.glScalef(0.7F, 0.7F, 0.7F);
      GL11.glTranslatef(0.0F, 1.0F, 0.0F);
      for (int i = 0; i < 4; i++) {
        ItachiSusanoCompleteModel modelBase = this.SusanoCompleteModelItachi;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getSharingan() == 7 || props.getSharingan() == 8 || props.getSharingan() == 9 || props.getSharingan() == 160 || props.getSharingan() == 92 || props.getSharingan() == 93 || props.getSharingan() == 183) {
          GL11.glPushMatrix();
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
          GL11.glEnable(3042);
          GL11.glBlendFunc(770, 771);
          GL11.glScalef(6.0F, 6.0F, 6.0F);
          GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
          GL11.glTranslated(0.0D, 0.3D, -0.2D);
          bindTexture(textureItachi3);
          ItachiRebra3model.renderAll();
          GL11.glDisable(3042);
          GL11.glPopMatrix();
        } else if (props.getSharingan() == 10 || props.getSharingan() == 11 || props.getSharingan() == 12 || props.getSharingan() == 176) {
          GL11.glPushMatrix();
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
          GL11.glEnable(3042);
          GL11.glBlendFunc(770, 771);
          GL11.glScalef(6.0F, 6.0F, 6.0F);
          GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
          GL11.glTranslated(0.0D, 0.3D, -0.2D);
          bindTexture(textureShisui32);
          ShisuiRebra3model.renderAllExcept(new String[] { "other" });
          bindTexture(textureShisui3);
          ShisuiRebra3model.renderOnly(new String[] { "other" });
          GL11.glDisable(3042);
          GL11.glPopMatrix();
        } else {
          if (props.getSharingan() == 26 || props.getSharingan() == 27 || props.getSharingan() == 45 || props.getSharingan() == 152)
            bindTexture(SusanoCompleteBaru); 
          if (props.getSharingan() == 30 || props.getSharingan() == 31 || props.getSharingan() == 47 || props.getSharingan() == 168)
            bindTexture(SusanoCompleteNaka); 
          if (props.getSharingan() == 24 || props.getSharingan() == 25 || props.getSharingan() == 44 || props.getSharingan() == 169)
            bindTexture(SusanoCompleteNaori); 
          if (props.getSharingan() == 28 || props.getSharingan() == 29 || props.getSharingan() == 46 || props.getSharingan() == 172)
            bindTexture(SusanoCompleteRai); 
          if (props.getSharingan() == 22 || props.getSharingan() == 23 || props.getSharingan() == 43 || props.getSharingan() == 175)
            bindTexture(SusanoCompleteShin); 
          if (props.getSharingan() == 10 || props.getSharingan() == 11 || props.getSharingan() == 12 || props.getSharingan() == 176)
            bindTexture(SusanoCompleteShisui); 
          if (props.getSharingan() == 72 || props.getSharingan() == 73 || props.getSharingan() == 158)
            bindTexture(ha1denSusanoComplete); 
          if (props.getSharingan() == 82 || props.getSharingan() == 83 || props.getSharingan() == 178)
            bindTexture(FujimotoSusanoComplete); 
          if (props.getSharingan() == 84 || props.getSharingan() == 85 || props.getSharingan() == 179)
            bindTexture(YunusSusanoComplete); 
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelBiped);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          if (props.getSharingan() == 7 || props.getSharingan() == 8 || props.getSharingan() == 9 || props.getSharingan() == 160 || props.getSharingan() == 92 || props.getSharingan() == 93 || props.getSharingan() == 183)
            bindTexture(SusanoCompleteItachi); 
          if (props.getSharingan() == 26 || props.getSharingan() == 27 || props.getSharingan() == 45 || props.getSharingan() == 152)
            bindTexture(SusanoCompleteBaru); 
          if (props.getSharingan() == 30 || props.getSharingan() == 31 || props.getSharingan() == 47 || props.getSharingan() == 168)
            bindTexture(SusanoCompleteNaka); 
          if (props.getSharingan() == 24 || props.getSharingan() == 25 || props.getSharingan() == 44 || props.getSharingan() == 169)
            bindTexture(SusanoCompleteNaori); 
          if (props.getSharingan() == 28 || props.getSharingan() == 29 || props.getSharingan() == 46 || props.getSharingan() == 172)
            bindTexture(SusanoCompleteRai); 
          if (props.getSharingan() == 22 || props.getSharingan() == 23 || props.getSharingan() == 43 || props.getSharingan() == 175)
            bindTexture(SusanoCompleteShin); 
          if (props.getSharingan() == 10 || props.getSharingan() == 11 || props.getSharingan() == 12 || props.getSharingan() == 176)
            bindTexture(SusanoCompleteShisui); 
          if (props.getSharingan() == 72 || props.getSharingan() == 73 || props.getSharingan() == 158)
            bindTexture(ha1denSusanoComplete); 
          if (props.getSharingan() == 82 || props.getSharingan() == 83 || props.getSharingan() == 178)
            bindTexture(FujimotoSusanoComplete); 
          if (props.getSharingan() == 84 || props.getSharingan() == 85 || props.getSharingan() == 179)
            bindTexture(YunusSusanoComplete); 
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.0F);
          GL11.glScalef(0.2F, 0.2F, 0.2F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
          GL11.glScalef(0.2F, 0.2F, 0.2F);
          GL11.glEnable(2896);
        } 
      } 
    } 
    if (props.getSusanoA() && props.getSharinganActive() && props.getSusanoTransformed() && props.getSusanoActive() == 3 && (props.getSharingan() == 16 || props.getSharingan() == 17 || props.getSharingan() == 40 || props.getSharingan() == 18 || props.getSharingan() == 19 || props.getSharingan() == 41 || props.getSharingan() == 51 || props.getSharingan() == 52 || props.getSharingan() == 66 || props.getSharingan() == 67 || props.getSharingan() == 70 || props.getSharingan() == 71 || props.getSharingan() == 76 || props.getSharingan() == 77 || props.getSharingan() == 165 || props.getSharingan() == 161 || props.getSharingan() == 157 || props.getSharingan() == 163 || props.getSharingan() == 166)) {
      GL11.glScalef(0.7F, 0.7F, 0.7F);
      GL11.glTranslatef(0.0F, 1.0F, 0.0F);
      for (int i = 0; i < 4; i++) {
        MadaraSusanoCompleteModel modelBase = this.SusanoCompleteModelMadara;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getSharingan() == 16 || props.getSharingan() == 17 || props.getSharingan() == 40 || props.getSharingan() == 165) {
          GL11.glPushMatrix();
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
          GL11.glEnable(3042);
          GL11.glBlendFunc(770, 771);
          GL11.glScalef(6.0F, 6.0F, 6.0F);
          GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
          GL11.glTranslated(0.0D, 0.3D, 0.0D);
          bindTexture(textureMadara3);
          MadaraRebra3model.renderAllExcept(new String[] { "weapon" });
          bindTexture(textureMadara32);
          MadaraRebra3model.renderOnly(new String[] { "weapon" });
          GL11.glDisable(3042);
          GL11.glPopMatrix();
        } else {
          if (props.getSharingan() == 16 || props.getSharingan() == 17 || props.getSharingan() == 40 || props.getSharingan() == 165)
            bindTexture(SusanoCompleteMadara); 
          if (props.getSharingan() == 18 || props.getSharingan() == 19 || props.getSharingan() == 41 || props.getSharingan() == 161 || props.getSharingan() == 86 || props.getSharingan() == 87 || props.getSharingan() == 88 || props.getSharingan() == 89 || props.getSharingan() == 180 || props.getSharingan() == 181)
            bindTexture(SusanoCompleteIzuna); 
          if (props.getSharingan() == 70 || props.getSharingan() == 71 || props.getSharingan() == 157)
            bindTexture(GrimbiteSusanoComplete); 
          if (props.getSharingan() == 76 || props.getSharingan() == 77 || props.getSharingan() == 163)
            bindTexture(JORDANSusanoComplete); 
          if (props.getSharingan() == 66 || props.getSharingan() == 67 || props.getSharingan() == 166)
            bindTexture(McNASTYSusanoComplete); 
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelBiped);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          if (props.getSharingan() == 16 || props.getSharingan() == 17 || props.getSharingan() == 40 || props.getSharingan() == 165)
            bindTexture(SusanoCompleteMadara); 
          if (props.getSharingan() == 18 || props.getSharingan() == 19 || props.getSharingan() == 41 || props.getSharingan() == 161 || props.getSharingan() == 86 || props.getSharingan() == 87 || props.getSharingan() == 88 || props.getSharingan() == 89 || props.getSharingan() == 180 || props.getSharingan() == 181)
            bindTexture(SusanoCompleteIzuna); 
          if (props.getSharingan() == 70 || props.getSharingan() == 71 || props.getSharingan() == 157)
            bindTexture(GrimbiteSusanoComplete); 
          if (props.getSharingan() == 76 || props.getSharingan() == 77 || props.getSharingan() == 163)
            bindTexture(JORDANSusanoComplete); 
          if (props.getSharingan() == 66 || props.getSharingan() == 67 || props.getSharingan() == 166)
            bindTexture(McNASTYSusanoComplete); 
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.0F);
          GL11.glScalef(0.2F, 0.2F, 0.2F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
          GL11.glScalef(0.2F, 0.2F, 0.2F);
          GL11.glEnable(2896);
        } 
      } 
    } 
    if (props.getSusanoA() && props.getSharinganActive() && props.getSusanoTransformed() && props.getSusanoActive() == 3 && (props.getSharingan() == 13 || props.getSharingan() == 14 || props.getSharingan() == 15 || props.getSharingan() == 35 || props.getSharingan() == 36 || props.getSharingan() == 37 || props.getSharingan() == 171)) {
      GL11.glScalef(0.7F, 0.7F, 0.7F);
      GL11.glTranslatef(0.0F, 1.0F, 0.0F);
      for (int i = 0; i < 4; i++) {
        ObitoSusanoCompleteModel modelBase = this.SusanoCompleteModelObito;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getSharingan() == 13 || props.getSharingan() == 14 || props.getSharingan() == 15 || props.getSharingan() == 171) {
          GL11.glPushMatrix();
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
          GL11.glEnable(3042);
          GL11.glBlendFunc(770, 771);
          GL11.glScalef(6.0F, 6.0F, 6.0F);
          GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
          GL11.glTranslated(0.0D, 0.3D, -0.15D);
          bindTexture(textureObito3);
          ObitoRebra3model.renderAll();
          GL11.glDisable(3042);
          GL11.glPopMatrix();
        } else {
          if (props.getSharingan() == 13 || props.getSharingan() == 14 || props.getSharingan() == 15 || props.getSharingan() == 171)
            bindTexture(SusanoCompleteObito); 
          if (props.getSharingan() == 35 || props.getSharingan() == 36 || props.getSharingan() == 37)
            bindTexture(SusanoCompleteBrent); 
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelBiped);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          if (props.getSharingan() == 13 || props.getSharingan() == 14 || props.getSharingan() == 15 || props.getSharingan() == 171)
            bindTexture(SusanoCompleteObito); 
          if (props.getSharingan() == 35 || props.getSharingan() == 36 || props.getSharingan() == 37)
            bindTexture(SusanoCompleteBrent); 
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.0F);
          GL11.glScalef(0.2F, 0.2F, 0.2F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
          GL11.glScalef(0.2F, 0.2F, 0.2F);
          GL11.glEnable(2896);
        } 
      } 
    } 
    if (props.getSusanoA() && props.getSharinganActive() && props.getSusanoTransformed() && props.getSusanoActive() == 5 && (props.getSharingan() == 5 || props.getSharingan() == 6 || props.getSharingan() == 4 || props.getSharingan() == 174)) {
      GL11.glScalef(0.6F, 0.6F, 0.6F);
      GL11.glTranslatef(0.0F, 21.0F, 0.0F);
      for (int i = 0; i < 4; i++) {
        SasukeSusanoPerfectModel modelBase = this.SusanoPerfectModelSasuke;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(SusanoPerfectSasuke);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(SusanoPerfectSasuke);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      } 
    } 
    if (props.getSusanoA() && props.getSharinganActive() && props.getSusanoTransformed() && props.getSusanoActive() == 5 && (props.getSharingan() == 48 || props.getSharingan() == 49 || props.getSharingan() == 50)) {
      GL11.glScalef(0.6F, 0.6F, 0.6F);
      GL11.glTranslatef(0.0F, 21.0F, 0.0F);
      for (int i = 0; i < 4; i++) {
        MathioksSusanoPerfectModel modelBase = this.MathioksSusanoPerfectModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getSharingan() == 48 || props.getSharingan() == 49 || props.getSharingan() == 50)
          bindTexture(SusanoPerfectMathioks); 
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        if (props.getSharingan() == 48 || props.getSharingan() == 49 || props.getSharingan() == 50)
          bindTexture(SusanoPerfectMathioks); 
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      } 
    } 
    if (props.getSusanoA() && props.getSharinganActive() && props.getSusanoTransformed() && props.getSusanoActive() == 6 && (props.getSharingan() == 48 || props.getSharingan() == 49 || props.getSharingan() == 50)) {
      GL11.glScalef(0.6F, 0.6F, 0.6F);
      GL11.glTranslatef(0.0F, 21.0F, 0.0F);
      for (int i = 0; i < 4; i++) {
        SusanoPerfectBeastModel modelBase = this.SusanoPerfectBeastModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(SusanoPerfectBeastMathioks);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(SusanoPerfectBeastMathioks);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      } 
    } 
    if (props.getTransformed() && props.getSharinganActive() && props.getSusanoActive() != 5)
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.tutModel4;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getSharingan() == 1)
          bindTexture(Sharingan2); 
        if (props.getSharingan() == 2)
          bindTexture(Sharingan1); 
        if (props.getSharingan() == 3)
          bindTexture(Sharingan); 
        if (props.getSharingan() == 4)
          bindTexture(Sharingan12); 
        if (props.getSharingan() == 5)
          bindTexture(Sharingan23); 
        if (props.getSharingan() == 6)
          bindTexture(Rinnegan4); 
        if (props.getSharingan() == 7)
          bindTexture(Sharingan19); 
        if (props.getSharingan() == 8)
          bindTexture(Sharingan23); 
        if (props.getSharingan() == 9)
          bindTexture(Rinnegan4); 
        if (props.getSharingan() == 10)
          bindTexture(Sharingan10); 
        if (props.getSharingan() == 11)
          bindTexture(Sharingan29); 
        if (props.getSharingan() == 12)
          bindTexture(Rinnegan1); 
        if (props.getSharingan() == 13)
          bindTexture(Sharingan17); 
        if (props.getSharingan() == 14)
          bindTexture(Sharingan30); 
        if (props.getSharingan() == 15)
          bindTexture(Rinnegan3); 
        if (props.getSharingan() == 16)
          bindTexture(Sharingan16); 
        if (props.getSharingan() == 17)
          bindTexture(Sharingan22); 
        if (props.getSharingan() == 40)
          bindTexture(Rinnegan3); 
        if (props.getSharingan() == 18)
          bindTexture(Sharingan18); 
        if (props.getSharingan() == 19)
          bindTexture(Sharingan31); 
        if (props.getSharingan() == 41)
          bindTexture(Rinnegan3); 
        if (props.getSharingan() == 20)
          bindTexture(Sharingan20); 
        if (props.getSharingan() == 21)
          bindTexture(Sharingan32); 
        if (props.getSharingan() == 42)
          bindTexture(Rinnegan3); 
        if (props.getSharingan() == 22)
          bindTexture(Sharingan11); 
        if (props.getSharingan() == 23)
          bindTexture(Sharingan25); 
        if (props.getSharingan() == 43)
          bindTexture(Rinnegan5); 
        if (props.getSharingan() == 24)
          bindTexture(Sharingan14); 
        if (props.getSharingan() == 25)
          bindTexture(Sharingan28); 
        if (props.getSharingan() == 44)
          bindTexture(Rinnegan5); 
        if (props.getSharingan() == 26)
          bindTexture(Sharingan24); 
        if (props.getSharingan() == 27)
          bindTexture(Sharingan33); 
        if (props.getSharingan() == 45)
          bindTexture(Rinnegan5); 
        if (props.getSharingan() == 28)
          bindTexture(Sharingan13); 
        if (props.getSharingan() == 29)
          bindTexture(Sharingan26); 
        if (props.getSharingan() == 46)
          bindTexture(Rinnegan5); 
        if (props.getSharingan() == 30)
          bindTexture(Sharingan15); 
        if (props.getSharingan() == 31)
          bindTexture(Sharingan28); 
        if (props.getSharingan() == 47)
          bindTexture(Rinnegan5); 
        if (props.getSharingan() == 32)
          bindTexture(Sharingan7); 
        if (props.getSharingan() == 33)
          bindTexture(Sharingan8); 
        if (props.getSharingan() == 34)
          bindTexture(Rinnegan2); 
        if (props.getSharingan() == 52)
          bindTexture(Burentos); 
        if (props.getSharingan() == 53)
          bindTexture(BurentosE); 
        if (props.getSharingan() == 54)
          bindTexture(BurentosR); 
        if (props.getSharingan() == 35)
          bindTexture(MangekyouNick); 
        if (props.getSharingan() == 36)
          bindTexture(EternalNick); 
        if (props.getSharingan() == 37)
          bindTexture(BurentosR); 
        if (props.getSharingan() == 38)
          bindTexture(Rinnegan5); 
        if (props.getSharingan() == 39)
          bindTexture(RinneSharingan); 
        if (props.getSharingan() == 48)
          bindTexture(SharinganMathioks); 
        if (props.getSharingan() == 49)
          bindTexture(SharinganEternalMathioks); 
        if (props.getSharingan() == 50)
          bindTexture(RinneganMathioks); 
        if (props.getSharingan() == 60)
          bindTexture(MSMentroz); 
        if (props.getSharingan() == 61)
          bindTexture(EMSMentroz); 
        if (props.getSharingan() == 62)
          bindTexture(MSDragozai); 
        if (props.getSharingan() == 63)
          bindTexture(EMSDragozai); 
        if (props.getSharingan() == 64)
          bindTexture(MSCoralSensei); 
        if (props.getSharingan() == 65)
          bindTexture(EMSCoralSensei); 
        if (props.getSharingan() == 66)
          bindTexture(MSMcNASTY); 
        if (props.getSharingan() == 67)
          bindTexture(EMSMcNASTY); 
        if (props.getSharingan() == 68)
          bindTexture(MSCharlie); 
        if (props.getSharingan() == 69)
          bindTexture(EMSCharlie); 
        if (props.getSharingan() == 70)
          bindTexture(MSGrimbite); 
        if (props.getSharingan() == 71)
          bindTexture(EMSGrimbite); 
        if (props.getSharingan() == 72)
          bindTexture(MSha1den); 
        if (props.getSharingan() == 73)
          bindTexture(EMSha1den); 
        if (props.getSharingan() == 74)
          bindTexture(MSjanglolroflmao); 
        if (props.getSharingan() == 75)
          bindTexture(EMSjanglolroflmao); 
        if (props.getSharingan() == 76)
          bindTexture(MSJORDAN); 
        if (props.getSharingan() == 77)
          bindTexture(EMSJORDAN); 
        if (props.getSharingan() == 78)
          bindTexture(MSL0rdMadaraUchiha); 
        if (props.getSharingan() == 79)
          bindTexture(EMSL0rdMadaraUchiha); 
        if (props.getSharingan() == 80)
          bindTexture(MSTomtomcaty); 
        if (props.getSharingan() == 81)
          bindTexture(EMSTomtomcaty); 
        if (props.getSharingan() == 82)
          bindTexture(MSFujimoto); 
        if (props.getSharingan() == 83)
          bindTexture(EMSFujimoto); 
        if (props.getSharingan() == 84)
          bindTexture(MSYunus); 
        if (props.getSharingan() == 85)
          bindTexture(EMSYunus); 
        if (props.getSharingan() == 86)
          bindTexture(MSGreg); 
        if (props.getSharingan() == 87)
          bindTexture(EMSGreg); 
        if (props.getSharingan() == 88)
          bindTexture(MSZiggy); 
        if (props.getSharingan() == 89)
          bindTexture(EMSZiggy); 
        if (props.getSharingan() == 90)
          bindTexture(MSShiro); 
        if (props.getSharingan() == 91)
          bindTexture(EMSShiro); 
        if (props.getSharingan() == 92)
          bindTexture(MSGrim); 
        if (props.getSharingan() == 93)
          bindTexture(EMSGrim); 
        if (props.getSharingan() == 100)
          bindTexture(Candrom1Tomoe); 
        if (props.getSharingan() == 101)
          bindTexture(Candrom2Tomoe); 
        if (props.getSharingan() == 102)
          bindTexture(Candrom3Tomoe); 
        if (props.getSharingan() == 103)
          bindTexture(CandromMS); 
        if (props.getSharingan() == 104)
          bindTexture(CandromEMS); 
        if (props.getSharingan() == 150)
          bindTexture(RinneganSharingan); 
        if (props.getSharingan() == 151)
          bindTexture(RinneganCandrom3Tomoe); 
        if (props.getSharingan() == 152)
          bindTexture(RinneganBaru); 
        if (props.getSharingan() == 153)
          bindTexture(RinneganCandrom); 
        if (props.getSharingan() == 154)
          bindTexture(RinneganCharlie); 
        if (props.getSharingan() == 155)
          bindTexture(RinneganCoralSensei); 
        if (props.getSharingan() == 156)
          bindTexture(RinneganDragozai); 
        if (props.getSharingan() == 157)
          bindTexture(RinneganGrimbite); 
        if (props.getSharingan() == 158)
          bindTexture(Rinneganha1den); 
        if (props.getSharingan() == 159)
          bindTexture(RinneganIndra); 
        if (props.getSharingan() == 160)
          bindTexture(RinneganItachi); 
        if (props.getSharingan() == 161)
          bindTexture(RinneganIzuna); 
        if (props.getSharingan() == 162)
          bindTexture(Rinneganjanglolroflmao); 
        if (props.getSharingan() == 163)
          bindTexture(RinneganJORDAN); 
        if (props.getSharingan() == 164)
          bindTexture(RinneganL0rdMadaraUchiha); 
        if (props.getSharingan() == 165)
          bindTexture(RinneganMadara); 
        if (props.getSharingan() == 166)
          bindTexture(RinneganMcNASTY); 
        if (props.getSharingan() == 167)
          bindTexture(RinneganMentroz); 
        if (props.getSharingan() == 168)
          bindTexture(RinneganNaka); 
        if (props.getSharingan() == 169)
          bindTexture(RinneganNaori); 
        if (props.getSharingan() == 170)
          bindTexture(RinneganNick); 
        if (props.getSharingan() == 171)
          bindTexture(RinneganObito); 
        if (props.getSharingan() == 172)
          bindTexture(RinneganRai); 
        if (props.getSharingan() == 173)
          bindTexture(RinneganRyuuho); 
        if (props.getSharingan() == 174)
          bindTexture(RinneganSasuke); 
        if (props.getSharingan() == 175)
          bindTexture(RinneganShin); 
        if (props.getSharingan() == 176)
          bindTexture(RinneganShisui); 
        if (props.getSharingan() == 177)
          bindTexture(RinneganTomtomcaty); 
        if (props.getSharingan() == 178)
          bindTexture(RinneganFujimoto); 
        if (props.getSharingan() == 179)
          bindTexture(RinneganYunus); 
        if (props.getSharingan() == 180)
          bindTexture(RinneganGreg); 
        if (props.getSharingan() == 181)
          bindTexture(RinneganZiggy); 
        if (props.getSharingan() == 182)
          bindTexture(RinneganShiro); 
        if (props.getSharingan() == 183)
          bindTexture(RinneganGrim); 
        modelBiped.bipedHead.showModel = (i == 0);
        modelBiped.bipedHeadwear.showModel = (i == 0);
        modelBiped.bipedBody.showModel = (i == 1 || i == 2);
        modelBiped.bipedRightArm.showModel = (i == 1);
        modelBiped.bipedLeftArm.showModel = (i == 1);
        modelBiped.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelBiped.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        if (props.getSharingan() == 1)
          bindTexture(Sharingan2); 
        if (props.getSharingan() == 2)
          bindTexture(Sharingan1); 
        if (props.getSharingan() == 3)
          bindTexture(Sharingan); 
        if (props.getSharingan() == 4)
          bindTexture(Sharingan12); 
        if (props.getSharingan() == 5)
          bindTexture(Sharingan23); 
        if (props.getSharingan() == 6)
          bindTexture(Rinnegan4); 
        if (props.getSharingan() == 7)
          bindTexture(Sharingan19); 
        if (props.getSharingan() == 8)
          bindTexture(Sharingan23); 
        if (props.getSharingan() == 9)
          bindTexture(Rinnegan4); 
        if (props.getSharingan() == 10)
          bindTexture(Sharingan10); 
        if (props.getSharingan() == 11)
          bindTexture(Sharingan29); 
        if (props.getSharingan() == 12)
          bindTexture(Rinnegan1); 
        if (props.getSharingan() == 13)
          bindTexture(Sharingan17); 
        if (props.getSharingan() == 14)
          bindTexture(Sharingan30); 
        if (props.getSharingan() == 15)
          bindTexture(Rinnegan3); 
        if (props.getSharingan() == 16)
          bindTexture(Sharingan16); 
        if (props.getSharingan() == 17)
          bindTexture(Sharingan22); 
        if (props.getSharingan() == 40)
          bindTexture(Rinnegan3); 
        if (props.getSharingan() == 18)
          bindTexture(Sharingan18); 
        if (props.getSharingan() == 19)
          bindTexture(Sharingan31); 
        if (props.getSharingan() == 41)
          bindTexture(Rinnegan3); 
        if (props.getSharingan() == 20)
          bindTexture(Sharingan20); 
        if (props.getSharingan() == 21)
          bindTexture(Sharingan32); 
        if (props.getSharingan() == 42)
          bindTexture(Rinnegan3); 
        if (props.getSharingan() == 22)
          bindTexture(Sharingan11); 
        if (props.getSharingan() == 23)
          bindTexture(Sharingan25); 
        if (props.getSharingan() == 43)
          bindTexture(Rinnegan5); 
        if (props.getSharingan() == 24)
          bindTexture(Sharingan14); 
        if (props.getSharingan() == 25)
          bindTexture(Sharingan28); 
        if (props.getSharingan() == 44)
          bindTexture(Rinnegan5); 
        if (props.getSharingan() == 26)
          bindTexture(Sharingan24); 
        if (props.getSharingan() == 27)
          bindTexture(Sharingan33); 
        if (props.getSharingan() == 45)
          bindTexture(Rinnegan5); 
        if (props.getSharingan() == 28)
          bindTexture(Sharingan13); 
        if (props.getSharingan() == 29)
          bindTexture(Sharingan26); 
        if (props.getSharingan() == 46)
          bindTexture(Rinnegan5); 
        if (props.getSharingan() == 30)
          bindTexture(Sharingan15); 
        if (props.getSharingan() == 31)
          bindTexture(Sharingan28); 
        if (props.getSharingan() == 47)
          bindTexture(Rinnegan5); 
        if (props.getSharingan() == 32)
          bindTexture(Sharingan7); 
        if (props.getSharingan() == 33)
          bindTexture(Sharingan8); 
        if (props.getSharingan() == 34)
          bindTexture(Rinnegan2); 
        if (props.getSharingan() == 52)
          bindTexture(Burentos); 
        if (props.getSharingan() == 53)
          bindTexture(BurentosE); 
        if (props.getSharingan() == 54)
          bindTexture(BurentosR); 
        if (props.getSharingan() == 35)
          bindTexture(MangekyouNick); 
        if (props.getSharingan() == 36)
          bindTexture(EternalNick); 
        if (props.getSharingan() == 37)
          bindTexture(BurentosR); 
        if (props.getSharingan() == 38)
          bindTexture(Rinnegan5); 
        if (props.getSharingan() == 39)
          bindTexture(RinneSharingan); 
        if (props.getSharingan() == 48)
          bindTexture(SharinganMathioks); 
        if (props.getSharingan() == 49)
          bindTexture(SharinganEternalMathioks); 
        if (props.getSharingan() == 50)
          bindTexture(RinneganMathioks); 
        if (props.getSharingan() == 60)
          bindTexture(MSMentroz); 
        if (props.getSharingan() == 61)
          bindTexture(EMSMentroz); 
        if (props.getSharingan() == 62)
          bindTexture(MSDragozai); 
        if (props.getSharingan() == 63)
          bindTexture(EMSDragozai); 
        if (props.getSharingan() == 64)
          bindTexture(MSCoralSensei); 
        if (props.getSharingan() == 65)
          bindTexture(EMSCoralSensei); 
        if (props.getSharingan() == 66)
          bindTexture(MSMcNASTY); 
        if (props.getSharingan() == 67)
          bindTexture(EMSMcNASTY); 
        if (props.getSharingan() == 68)
          bindTexture(MSCharlie); 
        if (props.getSharingan() == 69)
          bindTexture(EMSCharlie); 
        if (props.getSharingan() == 70)
          bindTexture(MSGrimbite); 
        if (props.getSharingan() == 71)
          bindTexture(EMSGrimbite); 
        if (props.getSharingan() == 72)
          bindTexture(MSha1den); 
        if (props.getSharingan() == 73)
          bindTexture(EMSha1den); 
        if (props.getSharingan() == 74)
          bindTexture(MSjanglolroflmao); 
        if (props.getSharingan() == 75)
          bindTexture(EMSjanglolroflmao); 
        if (props.getSharingan() == 76)
          bindTexture(MSJORDAN); 
        if (props.getSharingan() == 77)
          bindTexture(EMSJORDAN); 
        if (props.getSharingan() == 78)
          bindTexture(MSL0rdMadaraUchiha); 
        if (props.getSharingan() == 79)
          bindTexture(EMSL0rdMadaraUchiha); 
        if (props.getSharingan() == 80)
          bindTexture(MSTomtomcaty); 
        if (props.getSharingan() == 81)
          bindTexture(EMSTomtomcaty); 
        if (props.getSharingan() == 82)
          bindTexture(MSFujimoto); 
        if (props.getSharingan() == 83)
          bindTexture(EMSFujimoto); 
        if (props.getSharingan() == 84)
          bindTexture(MSYunus); 
        if (props.getSharingan() == 85)
          bindTexture(EMSYunus); 
        if (props.getSharingan() == 150)
          bindTexture(RinneganSharingan); 
        if (props.getSharingan() == 151)
          bindTexture(RinneganCandrom3Tomoe); 
        if (props.getSharingan() == 152)
          bindTexture(RinneganBaru); 
        if (props.getSharingan() == 153)
          bindTexture(RinneganCandrom); 
        if (props.getSharingan() == 154)
          bindTexture(RinneganCharlie); 
        if (props.getSharingan() == 155)
          bindTexture(RinneganCoralSensei); 
        if (props.getSharingan() == 156)
          bindTexture(RinneganDragozai); 
        if (props.getSharingan() == 157)
          bindTexture(RinneganGrimbite); 
        if (props.getSharingan() == 158)
          bindTexture(Rinneganha1den); 
        if (props.getSharingan() == 159)
          bindTexture(RinneganIndra); 
        if (props.getSharingan() == 160)
          bindTexture(RinneganItachi); 
        if (props.getSharingan() == 161)
          bindTexture(RinneganIzuna); 
        if (props.getSharingan() == 162)
          bindTexture(Rinneganjanglolroflmao); 
        if (props.getSharingan() == 163)
          bindTexture(RinneganJORDAN); 
        if (props.getSharingan() == 164)
          bindTexture(RinneganL0rdMadaraUchiha); 
        if (props.getSharingan() == 165)
          bindTexture(RinneganMadara); 
        if (props.getSharingan() == 166)
          bindTexture(RinneganMcNASTY); 
        if (props.getSharingan() == 167)
          bindTexture(RinneganMentroz); 
        if (props.getSharingan() == 168)
          bindTexture(RinneganNaka); 
        if (props.getSharingan() == 169)
          bindTexture(RinneganNaori); 
        if (props.getSharingan() == 170)
          bindTexture(RinneganNick); 
        if (props.getSharingan() == 171)
          bindTexture(RinneganObito); 
        if (props.getSharingan() == 172)
          bindTexture(RinneganRai); 
        if (props.getSharingan() == 173)
          bindTexture(RinneganRyuuho); 
        if (props.getSharingan() == 174)
          bindTexture(RinneganSasuke); 
        if (props.getSharingan() == 175)
          bindTexture(RinneganShin); 
        if (props.getSharingan() == 176)
          bindTexture(RinneganShisui); 
        if (props.getSharingan() == 177)
          bindTexture(RinneganTomtomcaty); 
        if (props.getSharingan() == 178)
          bindTexture(RinneganFujimoto); 
        if (props.getSharingan() == 179)
          bindTexture(RinneganYunus); 
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getByakuganActive() && props.getByakuganSize() == 3)
      for (int i = 0; i < 4; i++) {
        ModelTenseigan modelTenseigan = this.TenseiganModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(TenseiganMode);
        ((ModelBiped)modelTenseigan).bipedHead.showModel = (i == 0);
        ((ModelBiped)modelTenseigan).bipedHeadwear.isHidden = true;
        ((ModelBiped)modelTenseigan).bipedBody.showModel = (i == 1 || i == 2);
        ((ModelBiped)modelTenseigan).bipedRightArm.showModel = (i == 1);
        ((ModelBiped)modelTenseigan).bipedLeftArm.showModel = (i == 1);
        ((ModelBiped)modelTenseigan).bipedRightLeg.showModel = (i == 2 || i == 3);
        ((ModelBiped)modelTenseigan).bipedLeftLeg.showModel = (i == 2 || i == 3);
        ((ModelBiped)modelTenseigan).onGround = this.mainModel.onGround;
        ((ModelBiped)modelTenseigan).isRiding = this.mainModel.isRiding;
        ((ModelBiped)modelTenseigan).isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          ((ModelBiped)modelTenseigan).heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          ((ModelBiped)modelTenseigan).heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          ((ModelBiped)modelTenseigan).isSneak = ((ModelBiped)this.mainModel).isSneak;
          ((ModelBiped)modelTenseigan).aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelTenseigan.setLivingAnimations(entity, par2, par3, 0.0F);
        modelTenseigan.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(TenseiganMode);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelTenseigan.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getByakuganSize() == 3 && props.getByakuganActive())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.extendedModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(TenseiganModePlayer);
        modelBiped.bipedHead.showModel = (i == 0);
        modelBiped.bipedHeadwear.isHidden = true;
        modelBiped.bipedBody.showModel = (i == 1 || i == 2);
        modelBiped.bipedRightArm.showModel = (i == 1);
        modelBiped.bipedLeftArm.showModel = (i == 1);
        modelBiped.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelBiped.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(TenseiganModePlayer);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getByakuganActive() && (props.getByakuganSize() == 2 || props.getByakuganSize() == 3))
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.extendedModel2;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(Tenseigan);
        modelBiped.bipedHead.showModel = (i == 0);
        modelBiped.bipedHeadwear.showModel = (i == 0);
        modelBiped.bipedBody.showModel = (i == 1 || i == 2);
        modelBiped.bipedRightArm.showModel = (i == 1);
        modelBiped.bipedLeftArm.showModel = (i == 1);
        modelBiped.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelBiped.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(Tenseigan);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getByakuganActive() && props.getByakuganSize() == 2)
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.tutModel4;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
        bindTexture(Tenseigan);
        modelBiped.bipedHead.showModel = (i == 0);
        modelBiped.bipedHeadwear.showModel = (i == 0);
        modelBiped.bipedBody.showModel = (i == 1 || i == 2);
        modelBiped.bipedRightArm.showModel = (i == 1);
        modelBiped.bipedLeftArm.showModel = (i == 1);
        modelBiped.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelBiped.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(Tenseigan);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.5F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
        GL11.glEnable(2896);
      }  
    if (props.getBijuuScale() == 2 && props.getBijuuFormActive() && props.getTransformed())
      for (int i = 0; i < 4; i++) {
        ModelKyuubi1Tail modelBase = this.OneTailModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
        bindTexture(OneTailTrans);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelKyuubi1Tail2);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(OneTailTrans);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.5F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
        GL11.glEnable(2896);
      }  
    if (props.getBijuuScale() == 3 && props.getBijuuFormActive() && props.getTransformed()) {
      if (props.getBijuuKind() == 1)
        for (int i = 0; i < 4; i++) {
          ShukakuFModel modelBase = this.ShukakuFModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(ShukakuF);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(ShukakuF);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 2)
        for (int i = 0; i < 4; i++) {
          MatatabiFModel modelBase = this.MatatabiFModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(MatatabiF);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(MatatabiF);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 3)
        for (int i = 0; i < 4; i++) {
          IsobuFModel modelBase = this.IsobuFModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(IsobuF);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(IsobuF);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 4)
        for (int i = 0; i < 4; i++) {
          GokuFModel modelBase = this.GokuFModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(GokuF);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(GokuF);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 5)
        for (int i = 0; i < 4; i++) {
          KokuoFModel modelBase = this.KokuoFModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(KokuoF);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(KokuoF);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 6)
        for (int i = 0; i < 4; i++) {
          SaikenFModel modelBase = this.SaikenFModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(SaikenF);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(SaikenF);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 7)
        for (int i = 0; i < 4; i++) {
          ChomeiFModel modelBase = this.ChomeiFModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(ChomeiF);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(ChomeiF);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 8)
        for (int i = 0; i < 4; i++) {
          GyukiFModel modelBase = this.GyukiFModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(GyukiF);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(GyukiF);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 9)
        for (int i = 0; i < 4; i++) {
          KuramaFModel modelBase = this.KuramaFModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(KuramaF);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(KuramaF);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 10)
        for (int i = 0; i < 4; i++) {
          JuubiFModel modelBase = this.JuubiFModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(JuubiF);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(JuubiF);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
    } 
    if (props.getBijuuScale() == 4 && props.getBijuuFormActive() && props.getTransformed()) {
      if (props.getBijuuKind() == 1)
        for (int i = 0; i < 4; i++) {
          ShukakuSModel modelBase = this.ShukakuSModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(ShukakuS);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(ShukakuS);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 2)
        for (int i = 0; i < 4; i++) {
          MatatabiSModel modelBase = this.MatatabiSModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(MatatabiS);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(MatatabiS);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 3)
        for (int i = 0; i < 4; i++) {
          IsobuSModel modelBase = this.IsobuSModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(IsobuS);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(IsobuS);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 4)
        for (int i = 0; i < 4; i++) {
          GokuSModel modelBase = this.GokuSModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(GokuS);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(GokuS);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 5)
        for (int i = 0; i < 4; i++) {
          KokuoSModel modelBase = this.KokuoSModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(KokuoS);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(KokuoS);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 6)
        for (int i = 0; i < 4; i++) {
          SaikenSModel modelBase = this.SaikenSModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(SaikenS);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(SaikenS);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 7)
        for (int i = 0; i < 4; i++) {
          ChomeiSModel modelBase = this.ChomeiSModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(ChomeiS);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(ChomeiS);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 8)
        for (int i = 0; i < 4; i++) {
          GyukiSModel modelBase = this.GyukiSModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(GyukiS);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(GyukiS);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 9)
        for (int i = 0; i < 4; i++) {
          KuramaSModel modelBase = this.KuramaSModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(KuramaS);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(KuramaS);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
      if (props.getBijuuKind() == 10)
        for (int i = 0; i < 4; i++) {
          JuubiSModel modelBase = this.JuubiSModel;
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          bindTexture(JuubiS);
          modelBase.onGround = this.mainModel.onGround;
          modelBase.isRiding = this.mainModel.isRiding;
          modelBase.isChild = this.mainModel.isChild;
          if (this.mainModel instanceof ModelKyuubi1Tail2);
          modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(2896);
          bindTexture(JuubiS);
          GL11.glEnable(3008);
          GL11.glEnable(3042);
          GL11.glAlphaFunc(516, 0.5F);
          GL11.glBlendFunc(770, 771);
          float time = entity.ticksExisted / 10.0F;
          float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
          float r = 0.2F * sTime;
          float g = 1.0F * sTime;
          float b = 0.2F * sTime;
          modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
          GL11.glDisable(3042);
          GL11.glEnable(3008);
          GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);
          GL11.glEnable(2896);
        }  
    } 
    if (props.getBijuuScale() == 5 && props.getBijuuFormActive() && props.getTransformed())
      for (int i = 0; i < 4; i++) {
        ModelShukaku modelBase = this.ShukakuModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(Shukaku);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(Shukaku);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getBijuuScale() == 6 && props.getBijuuFormActive() && props.getTransformed())
      for (int i = 0; i < 4; i++) {
        ModelMatatabi modelBase = this.MatatabiModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(Matatabi);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(Matatabi);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getBijuuScale() == 7 && props.getBijuuFormActive() && props.getTransformed())
      for (int i = 0; i < 4; i++) {
        ModelIsobu modelBase = this.IsobuModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(Isobu);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(Isobu);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getBijuuScale() == 8 && props.getBijuuFormActive() && props.getTransformed())
      for (int i = 0; i < 4; i++) {
        ModelSonGoku modelBase = this.SonGokuModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(SonGoku);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(SonGoku);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getBijuuScale() == 9 && props.getBijuuFormActive() && props.getTransformed())
      for (int i = 0; i < 4; i++) {
        ModelKokuo modelBase = this.KokuoModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(Kokuo);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(Kokuo);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getBijuuScale() == 10 && props.getBijuuFormActive() && props.getTransformed())
      for (int i = 0; i < 4; i++) {
        ModelSaiken modelBase = this.SaikenModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(Saiken);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(Saiken);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getBijuuScale() == 11 && props.getBijuuFormActive() && props.getTransformed())
      for (int i = 0; i < 4; i++) {
        ModelChomei modelBase = this.ChomeiModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(Chomei);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(Chomei);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getBijuuScale() == 12 && props.getBijuuFormActive() && props.getTransformed())
      for (int i = 0; i < 4; i++) {
        ModelGyuki modelBase = this.GyukiModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(Gyuki);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(Gyuki);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getBijuuScale() == 13 && props.getBijuuFormActive() && props.getTransformed())
      for (int i = 0; i < 4; i++) {
        ModelKyuubi modelBase = this.KuramaModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(Kurama);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(Kurama);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getBijuuScale() == 14 && props.getBijuuFormActive() && props.getTransformed())
      for (int i = 0; i < 4; i++) {
        ModelJuubi modelBase = this.JuubiModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(Juubi);
        modelBase.onGround = this.mainModel.onGround;
        modelBase.isRiding = this.mainModel.isRiding;
        modelBase.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped);
        modelBase.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(Juubi);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBase.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getBijuuScale() == 15 && props.getBijuuFormActive() && props.getTransformed())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.tutModel4;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(TenTailsJinchuuriki);
        modelBiped.bipedHead.showModel = (i == 0);
        modelBiped.bipedHeadwear.showModel = (i == 0);
        modelBiped.bipedBody.showModel = (i == 1 || i == 2);
        modelBiped.bipedRightArm.showModel = (i == 1);
        modelBiped.bipedLeftArm.showModel = (i == 1);
        modelBiped.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelBiped.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(TenTailsJinchuuriki);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getSharinganSize() == 3.0D && !props.getSharinganActive() && props.getmangekyouSharingan() != 10 && props.getmangekyouSharingan() != 7)
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.tutModel4;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(Rinnegan);
        modelBiped.bipedHead.showModel = (i == 0);
        modelBiped.bipedHeadwear.showModel = (i == 0);
        modelBiped.bipedBody.showModel = (i == 1 || i == 2);
        modelBiped.bipedRightArm.showModel = (i == 1);
        modelBiped.bipedLeftArm.showModel = (i == 1);
        modelBiped.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelBiped.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(Rinnegan);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getByakugou() >= 1)
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.tutModel4;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getByakugou() == 1)
          bindTexture(ByakugouOff); 
        if (props.getByakugou() == 2)
          bindTexture(ByakugouOn); 
        modelBiped.bipedHead.showModel = (i == 0);
        modelBiped.bipedHeadwear.showModel = (i == 0);
        modelBiped.bipedBody.showModel = (i == 1 || i == 2);
        modelBiped.bipedRightArm.showModel = (i == 1);
        modelBiped.bipedLeftArm.showModel = (i == 1);
        modelBiped.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelBiped.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        if (props.getByakugou() == 1)
          bindTexture(ByakugouOff); 
        if (props.getByakugou() == 2)
          bindTexture(ByakugouOn); 
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getEightGatesStage() >= 1)
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.tutModel4;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getEightGatesStage() == 1)
          bindTexture(GateOfOpening); 
        if (props.getEightGatesStage() == 2)
          bindTexture(GateOfHealing); 
        if (props.getEightGatesStage() == 3)
          bindTexture(GateOfLife); 
        if (props.getEightGatesStage() == 4)
          bindTexture(GateOfPain); 
        if (props.getEightGatesStage() == 5)
          bindTexture(GateOfLimit); 
        if (props.getEightGatesStage() == 6)
          bindTexture(GateOfView); 
        if (props.getEightGatesStage() == 7)
          bindTexture(GateOfWonder); 
        if (props.getEightGatesStage() == 8)
          bindTexture(GateOfDeath); 
        modelBiped.bipedHead.showModel = (i == 0);
        modelBiped.bipedHeadwear.showModel = (i == 0);
        modelBiped.bipedBody.showModel = (i == 1 || i == 2);
        modelBiped.bipedRightArm.showModel = (i == 1);
        modelBiped.bipedLeftArm.showModel = (i == 1);
        modelBiped.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelBiped.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        if (props.getEightGatesStage() == 1)
          bindTexture(GateOfOpening); 
        if (props.getEightGatesStage() == 2)
          bindTexture(GateOfHealing); 
        if (props.getEightGatesStage() == 3)
          bindTexture(GateOfLife); 
        if (props.getEightGatesStage() == 4)
          bindTexture(GateOfPain); 
        if (props.getEightGatesStage() == 5)
          bindTexture(GateOfLimit); 
        if (props.getEightGatesStage() == 6)
          bindTexture(GateOfView); 
        if (props.getEightGatesStage() == 7)
          bindTexture(GateOfWonder); 
        if (props.getEightGatesStage() == 8)
          bindTexture(GateOfDeath); 
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getKarmaSealType() >= 1 && props.getKarmaSealType() != 3 && props.getKarmaSealSize() >= 1 && !props.getKarmaSealActive())
      for (int i = 0; i < 4; i++) {
        SeparateArmTextures modelSeparateArmTexturesModel = this.SeparateArmTextModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getKarmaSealType() == 1)
          bindTexture(KarmaSealBoruto1); 
        if (props.getKarmaSealType() == 2)
          bindTexture(KarmaSealKawaki1); 
        modelSeparateArmTexturesModel.bipedHead.showModel = (i == 0);
        modelSeparateArmTexturesModel.bipedHeadwear.showModel = (i == 0);
        modelSeparateArmTexturesModel.bipedBody.showModel = (i == 1 || i == 2);
        modelSeparateArmTexturesModel.bipedRightArm.showModel = (i == 1);
        modelSeparateArmTexturesModel.bipedLeftArm.showModel = (i == 1);
        modelSeparateArmTexturesModel.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelSeparateArmTexturesModel.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelSeparateArmTexturesModel.onGround = this.mainModel.onGround;
        modelSeparateArmTexturesModel.isRiding = this.mainModel.isRiding;
        modelSeparateArmTexturesModel.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelSeparateArmTexturesModel.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelSeparateArmTexturesModel.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelSeparateArmTexturesModel.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelSeparateArmTexturesModel.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelSeparateArmTexturesModel.setLivingAnimations(entity, par2, par3, 0.0F);
        modelSeparateArmTexturesModel.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        if (props.getKarmaSealType() == 1)
          bindTexture(KarmaSealBoruto1); 
        if (props.getKarmaSealType() == 2)
          bindTexture(KarmaSealKawaki1); 
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelSeparateArmTexturesModel.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getKarmaSealType() == 3 && props.getKarmaSealSize() >= 1 && !props.getKarmaSealActive())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.tutModel4;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(KarmaSealJigen1);
        modelBiped.bipedHead.showModel = (i == 0);
        modelBiped.bipedHeadwear.showModel = (i == 0);
        modelBiped.bipedBody.showModel = (i == 1 || i == 2);
        modelBiped.bipedRightArm.showModel = (i == 1);
        modelBiped.bipedLeftArm.showModel = (i == 1);
        modelBiped.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelBiped.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(KarmaSealJigen1);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getKarmaSealType() >= 1 && props.getKarmaSealSize() >= 1 && props.getKarmaSealActive())
      for (int i = 0; i < 4; i++) {
        SeparateArmTextures modelSeparateArmTexturesModel = this.SeparateArmTextModel;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getKarmaSealType() == 1)
          bindTexture(KarmaSealBoruto2); 
        if (props.getKarmaSealType() == 2)
          bindTexture(KarmaSealKawaki2); 
        if (props.getKarmaSealType() == 3)
          bindTexture(KarmaSealJigen2); 
        modelSeparateArmTexturesModel.bipedHead.showModel = (i == 0);
        modelSeparateArmTexturesModel.bipedHeadwear.showModel = (i == 0);
        modelSeparateArmTexturesModel.bipedBody.showModel = (i == 1 || i == 2);
        modelSeparateArmTexturesModel.bipedRightArm.showModel = (i == 1);
        modelSeparateArmTexturesModel.bipedLeftArm.showModel = (i == 1);
        modelSeparateArmTexturesModel.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelSeparateArmTexturesModel.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelSeparateArmTexturesModel.onGround = this.mainModel.onGround;
        modelSeparateArmTexturesModel.isRiding = this.mainModel.isRiding;
        modelSeparateArmTexturesModel.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelSeparateArmTexturesModel.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelSeparateArmTexturesModel.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelSeparateArmTexturesModel.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelSeparateArmTexturesModel.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelSeparateArmTexturesModel.setLivingAnimations(entity, par2, par3, 0.0F);
        modelSeparateArmTexturesModel.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        if (props.getKarmaSealType() == 1)
          bindTexture(KarmaSealBoruto2); 
        if (props.getKarmaSealType() == 2)
          bindTexture(KarmaSealKawaki2); 
        if (props.getKarmaSealType() == 3)
          bindTexture(KarmaSealJigen2); 
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelSeparateArmTexturesModel.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getKarmaSealType() >= 1 && props.getKarmaSealSize() >= 1 && props.getKarmaSealActive())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.tutModel4;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getKarmaSealType() == 1)
          bindTexture(KarmaSealBoruto2_2); 
        if (props.getKarmaSealType() == 2)
          bindTexture(KarmaSealKawaki2_2); 
        if (props.getKarmaSealType() == 3)
          bindTexture(KarmaSealJigen2_2); 
        modelBiped.bipedHead.showModel = (i == 0);
        modelBiped.bipedHeadwear.showModel = (i == 0);
        modelBiped.bipedBody.showModel = (i == 1 || i == 2);
        modelBiped.bipedRightArm.showModel = (i == 1);
        modelBiped.bipedLeftArm.showModel = (i == 1);
        modelBiped.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelBiped.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        if (props.getKarmaSealType() == 1)
          bindTexture(KarmaSealBoruto2_2); 
        if (props.getKarmaSealType() == 2)
          bindTexture(KarmaSealKawaki2_2); 
        if (props.getKarmaSealType() == 3)
          bindTexture(KarmaSealJigen2_2); 
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getJougan() >= 1 && props.getJouganActive())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.tutModel4;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        if (props.getJougan() == 1)
          bindTexture(Jougan); 
        if (props.getJougan() == 2)
          bindTexture(RedJougan); 
        modelBiped.bipedHead.showModel = (i == 0);
        modelBiped.bipedHeadwear.showModel = (i == 0);
        modelBiped.bipedBody.showModel = (i == 1 || i == 2);
        modelBiped.bipedRightArm.showModel = (i == 1);
        modelBiped.bipedLeftArm.showModel = (i == 1);
        modelBiped.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelBiped.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        if (props.getJougan() == 1)
          bindTexture(Jougan); 
        if (props.getJougan() == 2)
          bindTexture(RedJougan); 
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getSixPathsState())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.tutModel4;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(SixPathsSageMode);
        modelBiped.bipedHead.showModel = (i == 0);
        modelBiped.bipedHeadwear.showModel = (i == 0);
        modelBiped.bipedBody.showModel = (i == 1 || i == 2);
        modelBiped.bipedRightArm.showModel = (i == 1);
        modelBiped.bipedLeftArm.showModel = (i == 1);
        modelBiped.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelBiped.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(SixPathsSageMode);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
    if (props.getTransformed() && props.getSixPathsState() && !props.getSharinganActive() && !props.getKetsuryuganActive() && !props.getByakuganActive())
      for (int i = 0; i < 4; i++) {
        ModelBiped modelBiped = this.tutModel4;
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        bindTexture(SixPathsSageModeEyes);
        modelBiped.bipedHead.showModel = (i == 0);
        modelBiped.bipedHeadwear.showModel = (i == 0);
        modelBiped.bipedBody.showModel = (i == 1 || i == 2);
        modelBiped.bipedRightArm.showModel = (i == 1);
        modelBiped.bipedLeftArm.showModel = (i == 1);
        modelBiped.bipedRightLeg.showModel = (i == 2 || i == 3);
        modelBiped.bipedLeftLeg.showModel = (i == 2 || i == 3);
        modelBiped.onGround = this.mainModel.onGround;
        modelBiped.isRiding = this.mainModel.isRiding;
        modelBiped.isChild = this.mainModel.isChild;
        if (this.mainModel instanceof ModelBiped) {
          modelBiped.heldItemLeft = ((ModelBiped)this.mainModel).heldItemLeft;
          modelBiped.heldItemRight = ((ModelBiped)this.mainModel).heldItemRight;
          modelBiped.isSneak = ((ModelBiped)this.mainModel).isSneak;
          modelBiped.aimedBow = ((ModelBiped)this.mainModel).aimedBow;
        } 
        modelBiped.setLivingAnimations(entity, par2, par3, 0.0F);
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(2896);
        bindTexture(SixPathsSageModeEyes);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(516, 0.0F);
        GL11.glBlendFunc(770, 771);
        float time = entity.ticksExisted / 10.0F;
        float sTime = (float)Math.sin(time) * 0.5F + 0.5F;
        float r = 0.2F * sTime;
        float g = 1.0F * sTime;
        float b = 0.2F * sTime;
        modelBiped.render((Entity)entity, par2, par3, par4, par5, par6, par7);
        GL11.glDisable(3042);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(2896);
      }  
  }
}

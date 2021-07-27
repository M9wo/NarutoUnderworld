package alcoholmod.Mathioks.NickModels;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class NightGuyModel extends ModelBiped {

  private IModelCustom model = AdvancedModelLoader.loadModel(new ResourceLocation("am","models/obj/night_gai_bbmodel.obj"));

  private ResourceLocation texture = new ResourceLocation("am", "textures/obj/night_guy.png");

  public double[] modelScale = new double[] { 2.0D, 2.0D, 2.0D };
  
  public ModelRenderer HeadBback;
  
  public ModelRenderer HeadBDo;
  
  public ModelRenderer HeadBUp;
  
  public ModelRenderer HeadSP;
  
  public ModelRenderer Feather1;
  
  public ModelRenderer Feather2;
  
  public ModelRenderer Feather3;
  
  public ModelRenderer Feather4;
  
  public ModelRenderer Feather1Bb;
  
  public ModelRenderer Feather2Bb;
  
  public ModelRenderer Feather3Bb;
  
  public ModelRenderer Feather4Bb;
  
  public ModelRenderer Feather5Bb;
  
  public ModelRenderer Feather6Bb;
  
  public ModelRenderer Feather7Bb;
  
  public ModelRenderer Feather8Bb;
  
  public ModelRenderer Feather9Bb;
  
  public ModelRenderer Feather10Bb;
  
  public ModelRenderer Feather11Bb;
  
  public ModelRenderer Feather12Bb;
  
  public ModelRenderer Feather13Bb;
  
  public ModelRenderer Feather14Bb;
  
  public ModelRenderer Feather15Bb;
  
  public ModelRenderer Feather16Bb;
  
  public ModelRenderer Feather17Bb;
  
  public ModelRenderer Feather18Bb;
  
  public ModelRenderer Feather19Bb;
  
  public ModelRenderer Feather20Bb;
  
  public ModelRenderer Feather21Bb;
  
  public ModelRenderer Feather22Bb;
  
  public ModelRenderer Feather23Bb;
  
  public ModelRenderer Feather24Bb;
  
  public ModelRenderer Feather25Bb;
  
  public ModelRenderer Feather26Bb;
  
  public ModelRenderer Feather27Bb;
  
  public ModelRenderer Feather28Bb;
  
  public ModelRenderer Feather29Bb;
  
  public ModelRenderer Feather30Bb;
  
  public ModelRenderer HeadBLDo;
  
  public ModelRenderer HeadBRDo;
  
  public ModelRenderer ToothBot5;
  
  public ModelRenderer ToothBot6;
  
  public ModelRenderer ToothBot7;
  
  public ModelRenderer ToothBot8;
  
  public ModelRenderer ToothBot1;
  
  public ModelRenderer ToothBot2;
  
  public ModelRenderer ToothBot3;
  
  public ModelRenderer ToothBot4;
  
  public ModelRenderer ToothBot9;
  
  public ModelRenderer ToothBot10;
  
  public ModelRenderer ToothBot11;
  
  public ModelRenderer ToothBot12;
  
  public ModelRenderer HeadBLup;
  
  public ModelRenderer HeadBRup;
  
  public ModelRenderer SnoutFSP1;
  
  public ModelRenderer HeadBupSPbackB;
  
  public ModelRenderer NostrilLT;
  
  public ModelRenderer NostrilLL;
  
  public ModelRenderer NostrilLR;
  
  public ModelRenderer NostrilLBot;
  
  public ModelRenderer NostrilRT;
  
  public ModelRenderer NostrilRR;
  
  public ModelRenderer NostrilRBot;
  
  public ModelRenderer NostrilRL;
  
  public ModelRenderer MoustacheRB;
  
  public ModelRenderer MoustacheLB;
  
  public ModelRenderer FangBL;
  
  public ModelRenderer FangBR;
  
  public ModelRenderer ToothT5;
  
  public ModelRenderer ToothT6;
  
  public ModelRenderer HeadBLupSP1;
  
  public ModelRenderer ToothT1;
  
  public ModelRenderer ToothT2;
  
  public ModelRenderer ToothT3;
  
  public ModelRenderer ToothT4;
  
  public ModelRenderer HeadBLupSP2;
  
  public ModelRenderer HeadBLupSP3;
  
  public ModelRenderer HeadBRupSP1;
  
  public ModelRenderer ToothT7;
  
  public ModelRenderer ToothT8;
  
  public ModelRenderer ToothT9;
  
  public ModelRenderer ToothT10;
  
  public ModelRenderer HeadBRupSP2;
  
  public ModelRenderer HeadBRupSP3;
  
  public ModelRenderer SnoutFSP2;
  
  public ModelRenderer SnoutFSP3;
  
  public ModelRenderer SnoutFSP4;
  
  public ModelRenderer SnoutFSP5;
  
  public ModelRenderer HeadBupSPbackBL;
  
  public ModelRenderer HeadBupSPbackBR;
  
  public ModelRenderer NostrilLRSPBot;
  
  public ModelRenderer NostrilRLSPBot;
  
  public ModelRenderer MoustacheRSP;
  
  public ModelRenderer MoustacheRP1;
  
  public ModelRenderer MoustacheRP2;
  
  public ModelRenderer MoustacheRP3;
  
  public ModelRenderer MoustacheRP4;
  
  public ModelRenderer MoustacheRP5;
  
  public ModelRenderer MoustacheRP6;
  
  public ModelRenderer MoustacheRP7;
  
  public ModelRenderer MoustacheRP8;
  
  public ModelRenderer MoustacheRP9;
  
  public ModelRenderer MoustacheRP10;
  
  public ModelRenderer MoustacheLSP;
  
  public ModelRenderer MoustacheLP1;
  
  public ModelRenderer MoustacheLP2;
  
  public ModelRenderer MoustacheLP3;
  
  public ModelRenderer MoustacheLP4;
  
  public ModelRenderer MoustacheLP5;
  
  public ModelRenderer MoustacheLP6;
  
  public ModelRenderer MoustacheLP7;
  
  public ModelRenderer MoustacheLP8;
  
  public ModelRenderer MoustacheLP9;
  
  public ModelRenderer MoustacheLP10;
  
  public ModelRenderer FangP1L;
  
  public ModelRenderer FangLtip;
  
  public ModelRenderer FangP1R;
  
  public ModelRenderer FangRtip;
  
  public ModelRenderer HeadSPL;
  
  public ModelRenderer HeadSPR;
  
  public ModelRenderer HeadSPF;
  
  public ModelRenderer EyeRT;
  
  public ModelRenderer EyeRR;
  
  public ModelRenderer EyeRBot;
  
  public ModelRenderer EyeRL;
  
  public ModelRenderer EyeLT;
  
  public ModelRenderer EyeLL;
  
  public ModelRenderer EyeLR;
  
  public ModelRenderer EyeLBot;
  
  public ModelRenderer EyebrowRB;
  
  public ModelRenderer EyebrowLB;
  
  public ModelRenderer EyeBL;
  
  public ModelRenderer EyeBR;
  
  public ModelRenderer HeadSPUp;
  
  public ModelRenderer EyebrowRBSP;
  
  public ModelRenderer EyebrowRP1;
  
  public ModelRenderer EyebrowRP2;
  
  public ModelRenderer EyebrowRP3;
  
  public ModelRenderer EyebrowRP4;
  
  public ModelRenderer EyebrowRP5;
  
  public ModelRenderer EyebrowRP6;
  
  public ModelRenderer EyebrowRP7;
  
  public ModelRenderer EyebrowLBSP;
  
  public ModelRenderer EyebrowLP1;
  
  public ModelRenderer EyebrowLP2;
  
  public ModelRenderer EyebrowLP3;
  
  public ModelRenderer EyebrowLP4;
  
  public ModelRenderer EyebrowLP5;
  
  public ModelRenderer EyebrowLP6;
  
  public ModelRenderer EyebrowLP7;
  
  public ModelRenderer HeadSPRUp;
  
  public ModelRenderer HeadSPLUp;
  
  public ModelRenderer HeadSPUpB;
  
  public ModelRenderer Feather51Bb;
  
  public ModelRenderer Feather52Bb;
  
  public ModelRenderer Feather53Bb;
  
  public ModelRenderer Feather54Bb;
  
  public ModelRenderer Feather55Bb;
  
  public ModelRenderer Feather56Bb;
  
  public ModelRenderer Feather57Bb;
  
  public ModelRenderer Feather58Bb;
  
  public ModelRenderer Feather59Bb;
  
  public ModelRenderer Feather31Bb;
  
  public ModelRenderer Feather32Bb;
  
  public ModelRenderer Feather33Bb;
  
  public ModelRenderer Feather34Bb;
  
  public ModelRenderer Feather35Bb;
  
  public ModelRenderer Feather36Bb;
  
  public ModelRenderer Feather37Bb;
  
  public ModelRenderer Feather45Bb;
  
  public ModelRenderer Feather46Bb;
  
  public ModelRenderer Feather47Bb;
  
  public ModelRenderer Feather31B;
  
  public ModelRenderer Feather31P1;
  
  public ModelRenderer Feather31Tip;
  
  public ModelRenderer Feather32B;
  
  public ModelRenderer Feather32P1;
  
  public ModelRenderer Feather32Tip;
  
  public ModelRenderer Feather33B;
  
  public ModelRenderer Feather33P1;
  
  public ModelRenderer Feather33Tip;
  
  public ModelRenderer Feather34B;
  
  public ModelRenderer Feather34P1;
  
  public ModelRenderer Feather34Tip;
  
  public ModelRenderer Feather35B;
  
  public ModelRenderer Feather35P1;
  
  public ModelRenderer Feather35Tip;
  
  public ModelRenderer Feather36B;
  
  public ModelRenderer Feather36P1;
  
  public ModelRenderer Feather36Tip;
  
  public ModelRenderer Feather37B;
  
  public ModelRenderer Feather37P1;
  
  public ModelRenderer Feather37Tip;
  
  public ModelRenderer Feather45B;
  
  public ModelRenderer Feather45P1;
  
  public ModelRenderer Feather45Tip;
  
  public ModelRenderer Feather46B;
  
  public ModelRenderer Feather46P1;
  
  public ModelRenderer Feather46Tip;
  
  public ModelRenderer Feather47B;
  
  public ModelRenderer Feather47P1;
  
  public ModelRenderer Feather47Tip;
  
  public ModelRenderer Feather38Bb;
  
  public ModelRenderer Feather39Bb;
  
  public ModelRenderer Feather40Bb;
  
  public ModelRenderer Feather41Bb;
  
  public ModelRenderer Feather42Bb;
  
  public ModelRenderer Feather43Bb;
  
  public ModelRenderer Feather44Bb;
  
  public ModelRenderer Feather48Bb;
  
  public ModelRenderer Feather49Bb;
  
  public ModelRenderer Feather50Bb;
  
  public ModelRenderer Feather38B;
  
  public ModelRenderer Feather38P1;
  
  public ModelRenderer Feather38Tip;
  
  public ModelRenderer Feather39B;
  
  public ModelRenderer Feather39P1;
  
  public ModelRenderer Feather39Tip;
  
  public ModelRenderer Feather40B;
  
  public ModelRenderer Feather40P1;
  
  public ModelRenderer Feather40Tip;
  
  public ModelRenderer Feather41B;
  
  public ModelRenderer Feather41P1;
  
  public ModelRenderer Feather41Tip;
  
  public ModelRenderer Feather42B;
  
  public ModelRenderer Feather42P1;
  
  public ModelRenderer Feather42Tip;
  
  public ModelRenderer Feather43B;
  
  public ModelRenderer Feather43P1;
  
  public ModelRenderer Feather43Tip;
  
  public ModelRenderer Feather44B;
  
  public ModelRenderer Feather44P1;
  
  public ModelRenderer Feather44Tip;
  
  public ModelRenderer Feather48B;
  
  public ModelRenderer Feather48P1;
  
  public ModelRenderer Feather48Tip;
  
  public ModelRenderer Feather49B;
  
  public ModelRenderer Feather49P1;
  
  public ModelRenderer Feather49Tip;
  
  public ModelRenderer Feather50B;
  
  public ModelRenderer Feather50P1;
  
  public ModelRenderer Feather50Tip;
  
  public ModelRenderer BodyP1;
  
  public ModelRenderer FeatherIdcBb;
  
  public ModelRenderer FeatherIdcBb_1;
  
  public ModelRenderer FeatherIdcBb_2;
  
  public ModelRenderer FeatherIdcBb_3;
  
  public ModelRenderer FeatherIdcBb_4;
  
  public ModelRenderer FeatherIdcBb_5;
  
  public ModelRenderer FeatherIdcBb_6;
  
  public ModelRenderer FeatherIdcBb_7;
  
  public ModelRenderer FeatherIdcBb_8;
  
  public ModelRenderer FeatherIdcBb_9;
  
  public ModelRenderer FeatherIdcBb_10;
  
  public ModelRenderer FeatherIdcBb_11;
  
  public ModelRenderer FeatherIdcBb_12;
  
  public ModelRenderer FeatherIdcBb_13;
  
  public ModelRenderer FeatherIdcBb_14;
  
  public ModelRenderer FeatherIdcBb_15;
  
  public ModelRenderer FeatherIdcBb_16;
  
  public ModelRenderer FeatherIdcBb_17;
  
  public ModelRenderer FeatherIdcBb_18;
  
  public ModelRenderer FeatherIdcBb_19;
  
  public ModelRenderer FeatherIdcBb_20;
  
  public ModelRenderer FeatherIdcBb_21;
  
  public ModelRenderer FeatherIdcBb_22;
  
  public ModelRenderer FeatherIdcBb_23;
  
  public ModelRenderer FeatherIdcBb_24;
  
  public ModelRenderer FeatherIdcBb_25;
  
  public ModelRenderer FeatherIdcBb_26;
  
  public ModelRenderer FeatherIdcBb_27;
  
  public ModelRenderer FeatherIdcBb_28;
  
  public ModelRenderer FeatherIdcBb_29;
  
  public ModelRenderer FeatherIdcBb_30;
  
  public ModelRenderer FeatherIdcBb_31;
  
  public ModelRenderer FeatherIdcBb_32;
  
  public ModelRenderer FeatherIdcBb_33;
  
  public ModelRenderer FeatherIdcBb_34;
  
  public ModelRenderer FeatherIdcBb_35;
  
  public ModelRenderer FeatherIdcBb_36;
  
  public ModelRenderer FeatherIdcBb_37;
  
  public ModelRenderer FeatherIdcBb_38;
  
  public ModelRenderer FeatherIdcBb_39;
  
  public ModelRenderer FeatherIdcBb_40;
  
  public ModelRenderer FeatherIdcBb_41;
  
  public ModelRenderer Lazyness101;
  
  public ModelRenderer FeatherIdcBb_42;
  
  public ModelRenderer FeatherIdcBb_43;
  
  public ModelRenderer FeatherIdcBb_44;
  
  public ModelRenderer FeatherIdcBb_45;
  
  public ModelRenderer FeatherIdcBb_46;
  
  public ModelRenderer FeatherIdcBb_47;
  
  public ModelRenderer FeatherIdcBb_48;
  
  public ModelRenderer FeatherIdcBb_49;
  
  public ModelRenderer FeatherIdcBb_50;
  
  public ModelRenderer FeatherIdcBb_51;
  
  public ModelRenderer FeatherIdcBb_52;
  
  public ModelRenderer FeatherIdcBb_53;
  
  public ModelRenderer FeatherIdcBb_54;
  
  public ModelRenderer FeatherIdcBb_55;
  
  public ModelRenderer FeatherIdcBb_56;
  
  public ModelRenderer FeatherIdcBb_57;
  
  public ModelRenderer FeatherIdcBb_58;
  
  public ModelRenderer FeatherIdcBb_59;
  
  public ModelRenderer FeatherIdcBb_60;
  
  public ModelRenderer FeatherIdcBb_61;
  
  public ModelRenderer FeatherIdcBb_62;
  
  public ModelRenderer FeatherIdcBb_63;
  
  public ModelRenderer FeatherIdcBb_64;
  
  public ModelRenderer FeatherIdcBb_65;
  
  public ModelRenderer FeatherIdcBb_66;
  
  public ModelRenderer FeatherIdcBb_67;
  
  public ModelRenderer FeatherIdcBb_68;
  
  public ModelRenderer FeatherIdcBb_69;
  
  public ModelRenderer FeatherIdcBb_70;
  
  public ModelRenderer FeatherIdcBb_71;
  
  public ModelRenderer FeatherIdcBb_72;
  
  public ModelRenderer FeatherIdcBb_73;
  
  public ModelRenderer FeatherIdcBb_74;
  
  public ModelRenderer FeatherIdcBb_75;
  
  public ModelRenderer FeatherIdcBb_76;
  
  public ModelRenderer FeatherIdcBb_77;
  
  public ModelRenderer FeatherIdcBb_78;
  
  public ModelRenderer FeatherIdcBb_79;
  
  public ModelRenderer FeatherIdcBb_80;
  
  public ModelRenderer FeatherIdcBb_81;
  
  public ModelRenderer FeatherIdcBb_82;
  
  public ModelRenderer FeatherIdcBb_83;
  
  public ModelRenderer FeatherIdcBb_84;
  
  public ModelRenderer FeatherIdcBb_85;
  
  public ModelRenderer FeatherIdcBb_86;
  
  public ModelRenderer FeatherIdcBb_87;
  
  public ModelRenderer FeatherIdcBb_88;
  
  public ModelRenderer FeatherIdcBb_89;
  
  public ModelRenderer BodyP2;
  
  public ModelRenderer FeatherIdcB;
  
  public ModelRenderer FeatherIdcP1;
  
  public ModelRenderer FeatherIdcTip;
  
  public ModelRenderer FeatherIdcB_1;
  
  public ModelRenderer FeatherIdcP1_1;
  
  public ModelRenderer FeatherIdcTip_1;
  
  public ModelRenderer FeatherIdcB_2;
  
  public ModelRenderer FeatherIdcP1_2;
  
  public ModelRenderer FeatherIdcTip_2;
  
  public ModelRenderer FeatherIdcB_3;
  
  public ModelRenderer FeatherIdcP1_3;
  
  public ModelRenderer FeatherIdcTip_3;
  
  public ModelRenderer FeatherIdcB_4;
  
  public ModelRenderer FeatherIdcP1_4;
  
  public ModelRenderer FeatherIdcTip_4;
  
  public ModelRenderer FeatherIdcB_5;
  
  public ModelRenderer FeatherIdcP1_5;
  
  public ModelRenderer FeatherIdcTip_5;
  
  public ModelRenderer FeatherIdcB_6;
  
  public ModelRenderer FeatherIdcP1_6;
  
  public ModelRenderer FeatherIdcTip_6;
  
  public ModelRenderer FeatherIdcB_7;
  
  public ModelRenderer FeatherIdcP1_7;
  
  public ModelRenderer FeatherIdcTip_7;
  
  public ModelRenderer FeatherIdcB_8;
  
  public ModelRenderer FeatherIdcP1_8;
  
  public ModelRenderer FeatherIdcTip_8;
  
  public ModelRenderer FeatherIdcB_9;
  
  public ModelRenderer FeatherIdcP1_9;
  
  public ModelRenderer FeatherIdcTip_9;
  
  public ModelRenderer FeatherIdcB_10;
  
  public ModelRenderer FeatherIdcP1_10;
  
  public ModelRenderer FeatherIdcTip_10;
  
  public ModelRenderer FeatherIdcB_11;
  
  public ModelRenderer FeatherIdcP1_11;
  
  public ModelRenderer FeatherIdcTip_11;
  
  public ModelRenderer FeatherIdcB_12;
  
  public ModelRenderer FeatherIdcP1_12;
  
  public ModelRenderer FeatherIdcTip_12;
  
  public ModelRenderer FeatherIdcB_13;
  
  public ModelRenderer FeatherIdcP1_13;
  
  public ModelRenderer FeatherIdcTip_13;
  
  public ModelRenderer FeatherIdcB_14;
  
  public ModelRenderer FeatherIdcP1_14;
  
  public ModelRenderer FeatherIdcTip_14;
  
  public ModelRenderer FeatherIdcB_15;
  
  public ModelRenderer FeatherIdcP1_15;
  
  public ModelRenderer FeatherIdcTip_15;
  
  public ModelRenderer FeatherIdcB_16;
  
  public ModelRenderer FeatherIdcP1_16;
  
  public ModelRenderer FeatherIdcTip_16;
  
  public ModelRenderer FeatherIdcB_17;
  
  public ModelRenderer FeatherIdcP1_17;
  
  public ModelRenderer FeatherIdcTip_17;
  
  public ModelRenderer FeatherIdcB_18;
  
  public ModelRenderer FeatherIdcP1_18;
  
  public ModelRenderer FeatherIdcTip_18;
  
  public ModelRenderer FeatherIdcB_19;
  
  public ModelRenderer FeatherIdcP1_19;
  
  public ModelRenderer FeatherIdcTip_19;
  
  public ModelRenderer FeatherIdcB_20;
  
  public ModelRenderer FeatherIdcP1_20;
  
  public ModelRenderer FeatherIdcTip_20;
  
  public ModelRenderer FeatherIdcB_21;
  
  public ModelRenderer FeatherIdcP1_21;
  
  public ModelRenderer FeatherIdcTip_21;
  
  public ModelRenderer FeatherIdcB_22;
  
  public ModelRenderer FeatherIdcP1_22;
  
  public ModelRenderer FeatherIdcTip_22;
  
  public ModelRenderer FeatherIdcB_23;
  
  public ModelRenderer FeatherIdcP1_23;
  
  public ModelRenderer FeatherIdcTip_23;
  
  public ModelRenderer FeatherIdcB_24;
  
  public ModelRenderer FeatherIdcP1_24;
  
  public ModelRenderer FeatherIdcTip_24;
  
  public ModelRenderer FeatherIdcB_25;
  
  public ModelRenderer FeatherIdcP1_25;
  
  public ModelRenderer FeatherIdcTip_25;
  
  public ModelRenderer FeatherIdcB_26;
  
  public ModelRenderer FeatherIdcP1_26;
  
  public ModelRenderer FeatherIdcTip_26;
  
  public ModelRenderer FeatherIdcB_27;
  
  public ModelRenderer FeatherIdcP1_27;
  
  public ModelRenderer FeatherIdcTip_27;
  
  public ModelRenderer FeatherIdcB_28;
  
  public ModelRenderer FeatherIdcP1_28;
  
  public ModelRenderer FeatherIdcTip_28;
  
  public ModelRenderer FeatherIdcB_29;
  
  public ModelRenderer FeatherIdcP1_29;
  
  public ModelRenderer FeatherIdcTip_29;
  
  public ModelRenderer FeatherIdcB_30;
  
  public ModelRenderer FeatherIdcP1_30;
  
  public ModelRenderer FeatherIdcTip_30;
  
  public ModelRenderer FeatherIdcB_31;
  
  public ModelRenderer FeatherIdcP1_31;
  
  public ModelRenderer FeatherIdcTip_31;
  
  public ModelRenderer FeatherIdcB_32;
  
  public ModelRenderer FeatherIdcP1_32;
  
  public ModelRenderer FeatherIdcTip_32;
  
  public ModelRenderer FeatherIdcB_33;
  
  public ModelRenderer FeatherIdcP1_33;
  
  public ModelRenderer FeatherIdcTip_33;
  
  public ModelRenderer FeatherIdcB_34;
  
  public ModelRenderer FeatherIdcP1_34;
  
  public ModelRenderer FeatherIdcTip_34;
  
  public ModelRenderer FeatherIdcB_35;
  
  public ModelRenderer FeatherIdcP1_35;
  
  public ModelRenderer FeatherIdcTip_35;
  
  public ModelRenderer FeatherIdcB_36;
  
  public ModelRenderer FeatherIdcP1_36;
  
  public ModelRenderer FeatherIdcTip_36;
  
  public ModelRenderer FeatherIdcB_37;
  
  public ModelRenderer FeatherIdcP1_37;
  
  public ModelRenderer FeatherIdcTip_37;
  
  public ModelRenderer FeatherIdcB_38;
  
  public ModelRenderer FeatherIdcP1_38;
  
  public ModelRenderer FeatherIdcTip_38;
  
  public ModelRenderer FeatherIdcB_39;
  
  public ModelRenderer FeatherIdcP1_39;
  
  public ModelRenderer FeatherIdcTip_39;
  
  public ModelRenderer FeatherIdcB_40;
  
  public ModelRenderer FeatherIdcP1_40;
  
  public ModelRenderer FeatherIdcTip_40;
  
  public ModelRenderer FeatherIdcB_41;
  
  public ModelRenderer FeatherIdcP1_41;
  
  public ModelRenderer FeatherIdcTip_41;
  
  public ModelRenderer FeatherIdcBb_90;
  
  public ModelRenderer FeatherIdcBb_91;
  
  public ModelRenderer FeatherIdcBb_92;
  
  public ModelRenderer FeatherIdcBb_93;
  
  public ModelRenderer FeatherIdcBb_94;
  
  public ModelRenderer FeatherIdcBb_95;
  
  public ModelRenderer FeatherIdcBb_96;
  
  public ModelRenderer FeatherIdcBb_97;
  
  public ModelRenderer FeatherIdcBb_98;
  
  public ModelRenderer FeatherIdcBb_99;
  
  public ModelRenderer FeatherIdcBb_100;
  
  public ModelRenderer FeatherIdcBb_101;
  
  public ModelRenderer FeatherIdcBb_102;
  
  public ModelRenderer FeatherIdcBb_103;
  
  public ModelRenderer FeatherIdcBb_104;
  
  public ModelRenderer FeatherIdcBb_105;
  
  public ModelRenderer FeatherIdcBb_106;
  
  public ModelRenderer FeatherIdcBb_107;
  
  public ModelRenderer FeatherIdcBb_108;
  
  public ModelRenderer FeatherIdcBb_109;
  
  public ModelRenderer FeatherIdcBb_110;
  
  public ModelRenderer FeatherIdcBb_111;
  
  public ModelRenderer FeatherIdcBb_112;
  
  public ModelRenderer FeatherIdcBb_113;
  
  public ModelRenderer FeatherIdcBb_114;
  
  public ModelRenderer FeatherIdcBb_115;
  
  public ModelRenderer FeatherIdcBb_116;
  
  public ModelRenderer FeatherIdcBb_117;
  
  public ModelRenderer FeatherIdcBb_118;
  
  public ModelRenderer FeatherIdcBb_119;
  
  public ModelRenderer FeatherIdcBb_120;
  
  public ModelRenderer FeatherIdcBb_121;
  
  public ModelRenderer FeatherIdcBb_122;
  
  public ModelRenderer FeatherIdcBb_123;
  
  public ModelRenderer FeatherIdcBb_124;
  
  public ModelRenderer FeatherIdcBb_125;
  
  public ModelRenderer FeatherIdcBb_126;
  
  public ModelRenderer FeatherIdcBb_127;
  
  public ModelRenderer FeatherIdcBb_128;
  
  public ModelRenderer FeatherIdcBb_129;
  
  public ModelRenderer FeatherIdcBb_130;
  
  public ModelRenderer FeatherIdcBb_131;
  
  public ModelRenderer FeatherIdcB_42;
  
  public ModelRenderer FeatherIdcP1_42;
  
  public ModelRenderer FeatherIdcTip_42;
  
  public ModelRenderer FeatherIdcB_43;
  
  public ModelRenderer FeatherIdcP1_43;
  
  public ModelRenderer FeatherIdcTip_43;
  
  public ModelRenderer FeatherIdcB_44;
  
  public ModelRenderer FeatherIdcP1_44;
  
  public ModelRenderer FeatherIdcTip_44;
  
  public ModelRenderer FeatherIdcB_45;
  
  public ModelRenderer FeatherIdcP1_45;
  
  public ModelRenderer FeatherIdcTip_45;
  
  public ModelRenderer FeatherIdcB_46;
  
  public ModelRenderer FeatherIdcP1_46;
  
  public ModelRenderer FeatherIdcTip_46;
  
  public ModelRenderer FeatherIdcB_47;
  
  public ModelRenderer FeatherIdcP1_47;
  
  public ModelRenderer FeatherIdcTip_47;
  
  public ModelRenderer FeatherIdcB_48;
  
  public ModelRenderer FeatherIdcP1_48;
  
  public ModelRenderer FeatherIdcTip_48;
  
  public ModelRenderer FeatherIdcB_49;
  
  public ModelRenderer FeatherIdcP1_49;
  
  public ModelRenderer FeatherIdcTip_49;
  
  public ModelRenderer FeatherIdcB_50;
  
  public ModelRenderer FeatherIdcP1_50;
  
  public ModelRenderer FeatherIdcTip_50;
  
  public ModelRenderer FeatherIdcB_51;
  
  public ModelRenderer FeatherIdcP1_51;
  
  public ModelRenderer FeatherIdcTip_51;
  
  public ModelRenderer FeatherIdcB_52;
  
  public ModelRenderer FeatherIdcP1_52;
  
  public ModelRenderer FeatherIdcTip_52;
  
  public ModelRenderer FeatherIdcB_53;
  
  public ModelRenderer FeatherIdcP1_53;
  
  public ModelRenderer FeatherIdcTip_53;
  
  public ModelRenderer FeatherIdcB_54;
  
  public ModelRenderer FeatherIdcP1_54;
  
  public ModelRenderer FeatherIdcTip_54;
  
  public ModelRenderer FeatherIdcB_55;
  
  public ModelRenderer FeatherIdcP1_55;
  
  public ModelRenderer FeatherIdcTip_55;
  
  public ModelRenderer FeatherIdcB_56;
  
  public ModelRenderer FeatherIdcP1_56;
  
  public ModelRenderer FeatherIdcTip_56;
  
  public ModelRenderer FeatherIdcB_57;
  
  public ModelRenderer FeatherIdcP1_57;
  
  public ModelRenderer FeatherIdcTip_57;
  
  public ModelRenderer FeatherIdcB_58;
  
  public ModelRenderer FeatherIdcP1_58;
  
  public ModelRenderer FeatherIdcTip_58;
  
  public ModelRenderer FeatherIdcB_59;
  
  public ModelRenderer FeatherIdcP1_59;
  
  public ModelRenderer FeatherIdcTip_59;
  
  public ModelRenderer FeatherIdcB_60;
  
  public ModelRenderer FeatherIdcP1_60;
  
  public ModelRenderer FeatherIdcTip_60;
  
  public ModelRenderer FeatherIdcB_61;
  
  public ModelRenderer FeatherIdcP1_61;
  
  public ModelRenderer FeatherIdcTip_61;
  
  public ModelRenderer FeatherIdcB_62;
  
  public ModelRenderer FeatherIdcP1_62;
  
  public ModelRenderer FeatherIdcTip_62;
  
  public ModelRenderer FeatherIdcB_63;
  
  public ModelRenderer FeatherIdcP1_63;
  
  public ModelRenderer FeatherIdcTip_63;
  
  public ModelRenderer FeatherIdcB_64;
  
  public ModelRenderer FeatherIdcP1_64;
  
  public ModelRenderer FeatherIdcTip_64;
  
  public ModelRenderer FeatherIdcB_65;
  
  public ModelRenderer FeatherIdcP1_65;
  
  public ModelRenderer FeatherIdcTip_65;
  
  public ModelRenderer FeatherIdcB_66;
  
  public ModelRenderer FeatherIdcP1_66;
  
  public ModelRenderer FeatherIdcTip_66;
  
  public ModelRenderer FeatherIdcB_67;
  
  public ModelRenderer FeatherIdcP1_67;
  
  public ModelRenderer FeatherIdcTip_67;
  
  public ModelRenderer FeatherIdcB_68;
  
  public ModelRenderer FeatherIdcP1_68;
  
  public ModelRenderer FeatherIdcTip_68;
  
  public ModelRenderer FeatherIdcB_69;
  
  public ModelRenderer FeatherIdcP1_69;
  
  public ModelRenderer FeatherIdcTip_69;
  
  public ModelRenderer FeatherIdcB_70;
  
  public ModelRenderer FeatherIdcP1_70;
  
  public ModelRenderer FeatherIdcTip_70;
  
  public ModelRenderer FeatherIdcB_71;
  
  public ModelRenderer FeatherIdcP1_71;
  
  public ModelRenderer FeatherIdcTip_71;
  
  public ModelRenderer FeatherIdcB_72;
  
  public ModelRenderer FeatherIdcP1_72;
  
  public ModelRenderer FeatherIdcTip_72;
  
  public ModelRenderer FeatherIdcB_73;
  
  public ModelRenderer FeatherIdcP1_73;
  
  public ModelRenderer FeatherIdcTip_73;
  
  public ModelRenderer FeatherIdcB_74;
  
  public ModelRenderer FeatherIdcP1_74;
  
  public ModelRenderer FeatherIdcTip_74;
  
  public ModelRenderer FeatherIdcB_75;
  
  public ModelRenderer FeatherIdcP1_75;
  
  public ModelRenderer FeatherIdcTip_75;
  
  public ModelRenderer FeatherIdcB_76;
  
  public ModelRenderer FeatherIdcP1_76;
  
  public ModelRenderer FeatherIdcTip_76;
  
  public ModelRenderer FeatherIdcB_77;
  
  public ModelRenderer FeatherIdcP1_77;
  
  public ModelRenderer FeatherIdcTip_77;
  
  public ModelRenderer FeatherIdcB_78;
  
  public ModelRenderer FeatherIdcP1_78;
  
  public ModelRenderer FeatherIdcTip_78;
  
  public ModelRenderer FeatherIdcB_79;
  
  public ModelRenderer FeatherIdcP1_79;
  
  public ModelRenderer FeatherIdcTip_79;
  
  public ModelRenderer FeatherIdcB_80;
  
  public ModelRenderer FeatherIdcP1_80;
  
  public ModelRenderer FeatherIdcTip_80;
  
  public ModelRenderer FeatherIdcB_81;
  
  public ModelRenderer FeatherIdcP1_81;
  
  public ModelRenderer FeatherIdcTip_81;
  
  public ModelRenderer FeatherIdcB_82;
  
  public ModelRenderer FeatherIdcP1_82;
  
  public ModelRenderer FeatherIdcTip_82;
  
  public ModelRenderer FeatherIdcB_83;
  
  public ModelRenderer FeatherIdcP1_83;
  
  public ModelRenderer FeatherIdcTip_83;
  
  public ModelRenderer FeatherIdcB_84;
  
  public ModelRenderer FeatherIdcP1_84;
  
  public ModelRenderer FeatherIdcTip_84;
  
  public ModelRenderer FeatherIdcB_85;
  
  public ModelRenderer FeatherIdcP1_85;
  
  public ModelRenderer FeatherIdcTip_85;
  
  public ModelRenderer FeatherIdcB_86;
  
  public ModelRenderer FeatherIdcP1_86;
  
  public ModelRenderer FeatherIdcTip_86;
  
  public ModelRenderer FeatherIdcB_87;
  
  public ModelRenderer FeatherIdcP1_87;
  
  public ModelRenderer FeatherIdcTip_87;
  
  public ModelRenderer FeatherIdcB_88;
  
  public ModelRenderer FeatherIdcP1_88;
  
  public ModelRenderer FeatherIdcTip_88;
  
  public ModelRenderer FeatherIdcB_89;
  
  public ModelRenderer FeatherIdcP1_89;
  
  public ModelRenderer FeatherIdcTip_89;
  
  public ModelRenderer FeatherIdcB_90;
  
  public ModelRenderer FeatherIdcP1_90;
  
  public ModelRenderer FeatherIdcTip_90;
  
  public ModelRenderer FeatherIdcB_91;
  
  public ModelRenderer FeatherIdcP1_91;
  
  public ModelRenderer FeatherIdcTip_91;
  
  public ModelRenderer FeatherIdcB_92;
  
  public ModelRenderer FeatherIdcP1_92;
  
  public ModelRenderer FeatherIdcTip_92;
  
  public ModelRenderer FeatherIdcB_93;
  
  public ModelRenderer FeatherIdcP1_93;
  
  public ModelRenderer FeatherIdcTip_93;
  
  public ModelRenderer FeatherIdcB_94;
  
  public ModelRenderer FeatherIdcP1_94;
  
  public ModelRenderer FeatherIdcTip_94;
  
  public ModelRenderer FeatherIdcB_95;
  
  public ModelRenderer FeatherIdcP1_95;
  
  public ModelRenderer FeatherIdcTip_95;
  
  public ModelRenderer FeatherIdcB_96;
  
  public ModelRenderer FeatherIdcP1_96;
  
  public ModelRenderer FeatherIdcTip_96;
  
  public ModelRenderer FeatherIdcB_97;
  
  public ModelRenderer FeatherIdcP1_97;
  
  public ModelRenderer FeatherIdcTip_97;
  
  public ModelRenderer FeatherIdcB_98;
  
  public ModelRenderer FeatherIdcP1_98;
  
  public ModelRenderer FeatherIdcTip_98;
  
  public ModelRenderer FeatherIdcB_99;
  
  public ModelRenderer FeatherIdcP1_99;
  
  public ModelRenderer FeatherIdcTip_99;
  
  public ModelRenderer FeatherIdcB_100;
  
  public ModelRenderer FeatherIdcP1_100;
  
  public ModelRenderer FeatherIdcTip_100;
  
  public ModelRenderer FeatherIdcB_101;
  
  public ModelRenderer FeatherIdcP1_101;
  
  public ModelRenderer FeatherIdcTip_101;
  
  public ModelRenderer FeatherIdcB_102;
  
  public ModelRenderer FeatherIdcP1_102;
  
  public ModelRenderer FeatherIdcTip_102;
  
  public ModelRenderer FeatherIdcB_103;
  
  public ModelRenderer FeatherIdcP1_103;
  
  public ModelRenderer FeatherIdcTip_103;
  
  public ModelRenderer FeatherIdcB_104;
  
  public ModelRenderer FeatherIdcP1_104;
  
  public ModelRenderer FeatherIdcTip_104;
  
  public ModelRenderer FeatherIdcB_105;
  
  public ModelRenderer FeatherIdcP1_105;
  
  public ModelRenderer FeatherIdcTip_105;
  
  public ModelRenderer FeatherIdcB_106;
  
  public ModelRenderer FeatherIdcP1_106;
  
  public ModelRenderer FeatherIdcTip_106;
  
  public ModelRenderer FeatherIdcB_107;
  
  public ModelRenderer FeatherIdcP1_107;
  
  public ModelRenderer FeatherIdcTip_107;
  
  public ModelRenderer FeatherIdcB_108;
  
  public ModelRenderer FeatherIdcP1_108;
  
  public ModelRenderer FeatherIdcTip_108;
  
  public ModelRenderer FeatherIdcB_109;
  
  public ModelRenderer FeatherIdcP1_109;
  
  public ModelRenderer FeatherIdcTip_109;
  
  public ModelRenderer FeatherIdcB_110;
  
  public ModelRenderer FeatherIdcP1_110;
  
  public ModelRenderer FeatherIdcTip_110;
  
  public ModelRenderer FeatherIdcB_111;
  
  public ModelRenderer FeatherIdcP1_111;
  
  public ModelRenderer FeatherIdcTip_111;
  
  public ModelRenderer FeatherIdcB_112;
  
  public ModelRenderer FeatherIdcP1_112;
  
  public ModelRenderer FeatherIdcTip_112;
  
  public ModelRenderer FeatherIdcB_113;
  
  public ModelRenderer FeatherIdcP1_113;
  
  public ModelRenderer FeatherIdcTip_113;
  
  public ModelRenderer FeatherIdcB_114;
  
  public ModelRenderer FeatherIdcP1_114;
  
  public ModelRenderer FeatherIdcTip_114;
  
  public ModelRenderer FeatherIdcB_115;
  
  public ModelRenderer FeatherIdcP1_115;
  
  public ModelRenderer FeatherIdcTip_115;
  
  public ModelRenderer FeatherIdcB_116;
  
  public ModelRenderer FeatherIdcP1_116;
  
  public ModelRenderer FeatherIdcTip_116;
  
  public ModelRenderer FeatherIdcB_117;
  
  public ModelRenderer FeatherIdcP1_117;
  
  public ModelRenderer FeatherIdcTip_117;
  
  public ModelRenderer FeatherIdcB_118;
  
  public ModelRenderer FeatherIdcP1_118;
  
  public ModelRenderer FeatherIdcTip_118;
  
  public ModelRenderer FeatherIdcB_119;
  
  public ModelRenderer FeatherIdcP1_119;
  
  public ModelRenderer FeatherIdcTip_119;
  
  public ModelRenderer FeatherIdcB_120;
  
  public ModelRenderer FeatherIdcP1_120;
  
  public ModelRenderer FeatherIdcTip_120;
  
  public ModelRenderer FeatherIdcB_121;
  
  public ModelRenderer FeatherIdcP1_121;
  
  public ModelRenderer FeatherIdcTip_121;
  
  public ModelRenderer FeatherIdcB_122;
  
  public ModelRenderer FeatherIdcP1_122;
  
  public ModelRenderer FeatherIdcTip_122;
  
  public ModelRenderer FeatherIdcB_123;
  
  public ModelRenderer FeatherIdcP1_123;
  
  public ModelRenderer FeatherIdcTip_123;
  
  public ModelRenderer FeatherIdcB_124;
  
  public ModelRenderer FeatherIdcP1_124;
  
  public ModelRenderer FeatherIdcTip_124;
  
  public ModelRenderer FeatherIdcB_125;
  
  public ModelRenderer FeatherIdcP1_125;
  
  public ModelRenderer FeatherIdcTip_125;
  
  public ModelRenderer FeatherIdcB_126;
  
  public ModelRenderer FeatherIdcP1_126;
  
  public ModelRenderer FeatherIdcTip_126;
  
  public ModelRenderer FeatherIdcB_127;
  
  public ModelRenderer FeatherIdcP1_127;
  
  public ModelRenderer FeatherIdcTip_127;
  
  public ModelRenderer FeatherIdcB_128;
  
  public ModelRenderer FeatherIdcP1_128;
  
  public ModelRenderer FeatherIdcTip_128;
  
  public ModelRenderer FeatherIdcB_129;
  
  public ModelRenderer FeatherIdcP1_129;
  
  public ModelRenderer FeatherIdcTip_129;
  
  public ModelRenderer FeatherIdcB_130;
  
  public ModelRenderer FeatherIdcP1_130;
  
  public ModelRenderer FeatherIdcTip_130;
  
  public ModelRenderer FeatherIdcB_131;
  
  public ModelRenderer FeatherIdcP1_131;
  
  public ModelRenderer FeatherIdcTip_131;
  
  public ModelRenderer Feather51B;
  
  public ModelRenderer Feather51P1;
  
  public ModelRenderer Feather51Tip;
  
  public ModelRenderer Feather52B;
  
  public ModelRenderer Feather52P1;
  
  public ModelRenderer Feather52Tip;
  
  public ModelRenderer Feather53B;
  
  public ModelRenderer Feather53P1;
  
  public ModelRenderer Feather53Tip;
  
  public ModelRenderer Feather54B;
  
  public ModelRenderer Feather54P1;
  
  public ModelRenderer Feather54Tip;
  
  public ModelRenderer Feather55B;
  
  public ModelRenderer Feather55P1;
  
  public ModelRenderer Feather55Tip;
  
  public ModelRenderer Feather56B;
  
  public ModelRenderer Feather56P1;
  
  public ModelRenderer Feather56Tip;
  
  public ModelRenderer Feather57B;
  
  public ModelRenderer Feather57P1;
  
  public ModelRenderer Feather57Tip;
  
  public ModelRenderer Feather58B;
  
  public ModelRenderer Feather58P1;
  
  public ModelRenderer Feather58Tip;
  
  public ModelRenderer Feather59B;
  
  public ModelRenderer Feather59P1;
  
  public ModelRenderer Feather59Tip;
  
  public ModelRenderer Feather1B;
  
  public ModelRenderer Feather1P1;
  
  public ModelRenderer Feather1Tip;
  
  public ModelRenderer Feather2B;
  
  public ModelRenderer Feather2P1;
  
  public ModelRenderer Feather2Tip;
  
  public ModelRenderer Feather3B;
  
  public ModelRenderer Feather3P1;
  
  public ModelRenderer Feather3Tip;
  
  public ModelRenderer Feather4B;
  
  public ModelRenderer Feather4P1;
  
  public ModelRenderer Feather4Tip;
  
  public ModelRenderer Feather5B;
  
  public ModelRenderer Feather5P1;
  
  public ModelRenderer Feather5Tip;
  
  public ModelRenderer Feather6B;
  
  public ModelRenderer Feather6P1;
  
  public ModelRenderer Feather6Tip;
  
  public ModelRenderer Feather7B;
  
  public ModelRenderer Feather7P1;
  
  public ModelRenderer Feather7Tip;
  
  public ModelRenderer Feather8B;
  
  public ModelRenderer Feather8P1;
  
  public ModelRenderer Feather8Tip;
  
  public ModelRenderer Feather9B;
  
  public ModelRenderer Feather9P1;
  
  public ModelRenderer Feather9Tip;
  
  public ModelRenderer Feather10B;
  
  public ModelRenderer Feather10P1;
  
  public ModelRenderer Feather10Tip;
  
  public ModelRenderer Feather11B;
  
  public ModelRenderer Feather11P1;
  
  public ModelRenderer Feather11Tip;
  
  public ModelRenderer Feather12B;
  
  public ModelRenderer Feather12P1;
  
  public ModelRenderer Feather12Tip;
  
  public ModelRenderer Feather13B;
  
  public ModelRenderer Feather13P1;
  
  public ModelRenderer Feather13Tip;
  
  public ModelRenderer Feather14B;
  
  public ModelRenderer Feather14P1;
  
  public ModelRenderer Feather14Tip;
  
  public ModelRenderer Feather15B;
  
  public ModelRenderer Feather15P1;
  
  public ModelRenderer Feather15Tip;
  
  public ModelRenderer Feather16B;
  
  public ModelRenderer Feather16P1;
  
  public ModelRenderer Feather16Tip;
  
  public ModelRenderer Feather17B;
  
  public ModelRenderer Feather17P1;
  
  public ModelRenderer Feather17Tip;
  
  public ModelRenderer Feather18B;
  
  public ModelRenderer Feather18P1;
  
  public ModelRenderer Feather18Tip;
  
  public ModelRenderer Feather19B;
  
  public ModelRenderer Feather19P1;
  
  public ModelRenderer Feather19Tip;
  
  public ModelRenderer Feather20B;
  
  public ModelRenderer Feather20P1;
  
  public ModelRenderer Feather20Tip;
  
  public ModelRenderer Feather21B;
  
  public ModelRenderer Feather21P1;
  
  public ModelRenderer Feather21Tip;
  
  public ModelRenderer Feather22B;
  
  public ModelRenderer Feather22P1;
  
  public ModelRenderer Feather22Tip;
  
  public ModelRenderer Feather23B;
  
  public ModelRenderer Feather23P1;
  
  public ModelRenderer Feather23Tip;
  
  public ModelRenderer Feather24B;
  
  public ModelRenderer Feather24P1;
  
  public ModelRenderer Feather24Tip;
  
  public ModelRenderer Feather25B;
  
  public ModelRenderer Feather25P1;
  
  public ModelRenderer Feather25Tip;
  
  public ModelRenderer Feather26B;
  
  public ModelRenderer Feather26P1;
  
  public ModelRenderer Feather26Tip;
  
  public ModelRenderer Feather27B;
  
  public ModelRenderer Feather27P1;
  
  public ModelRenderer Feather27Tip;
  
  public ModelRenderer Feather28B;
  
  public ModelRenderer Feather28P1;
  
  public ModelRenderer Feather28Tip;
  
  public ModelRenderer Feather29B;
  
  public ModelRenderer Feather29P1;
  
  public ModelRenderer Feather29Tip;
  
  public ModelRenderer Feather30B;
  
  public ModelRenderer Feather30P1;
  
  public ModelRenderer Feather30Tip;
  
  public NightGuyModel() {
    this.textureWidth = 1500;
    this.textureHeight = 1500;
    this.FeatherIdcBb_125 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_125.setRotationPoint(0.0F, 0.0F, 198.0F);
    this.FeatherIdcBb_125.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_70 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_70.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_70.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_70, -0.7853982F, 0.0F, 0.0F);
    this.Feather15B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather15B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather15B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather15B, 0.0F, 0.83164936F, 0.0F);
    this.FeatherIdcP1_70 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_70.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_70.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_70, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_86 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_86.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_86.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.FeatherIdcTip_86, -0.7853982F, 0.0F, 0.0F);
    this.Feather7P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather7P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather7P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather7P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_66 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_66.setRotationPoint(227.0F, 2.0F, 36.1F);
    this.FeatherIdcBb_66.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_125 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_125.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_125.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_125, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_129 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_129.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_129.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_129, -0.7853982F, 0.0F, 0.0F);
    this.ToothT8 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothT8.setRotationPoint(0.0F, 60.0F, 50.0F);
    this.ToothT8.addBox(0.0F, 0.0F, 0.0F, 20, 31, 31, 0.0F);
    setRotateAngle(this.ToothT8, 0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_97 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_97.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_97.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_97, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_25 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_25.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_25.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_25, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_117 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_117.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_117.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_117, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcBb_32 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_32.setRotationPoint(0.0F, 199.0F, 172.0F);
    this.FeatherIdcBb_32.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_35 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_35.setRotationPoint(0.0F, 0.0F, 198.0F);
    this.FeatherIdcBb_35.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather19Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather19Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather19Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather19Tip, -0.7853982F, 0.0F, 0.0F);
    this.EyeRR = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyeRR.setRotationPoint(13.0F, 24.0F, -5.0F);
    this.EyeRR.addBox(0.0F, 0.0F, 0.0F, 6, 42, 5, 0.0F);
    this.FeatherIdcTip_42 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_42.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_42.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_42, -0.7853982F, 0.0F, 0.0F);
    this.Feather19Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather19Bb.setRotationPoint(262.1F, 39.0F, 68.0F);
    this.Feather19Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_131 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_131.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_131.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_131, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_68 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_68.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_68.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_68, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_104 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_104.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_104.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_104, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_19 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_19.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_19.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_19, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_19 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_19.setRotationPoint(0.0F, 199.0F, 74.0F);
    this.FeatherIdcBb_19.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_34 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_34.setRotationPoint(0.0F, 240.0F, 165.0F);
    this.FeatherIdcBb_34.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_62 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_62.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_62.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_62, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_75 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_75.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_75.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_75, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_25 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_25.setRotationPoint(0.0F, 161.0F, 117.0F);
    this.FeatherIdcBb_25.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_130 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_130.setRotationPoint(0.0F, 163.0F, 214.0F);
    this.FeatherIdcBb_130.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_102 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_102.setRotationPoint(0.0F, 198.0F, 24.0F);
    this.FeatherIdcBb_102.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_77 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_77.setRotationPoint(78.0F, 2.0F, 100.1F);
    this.FeatherIdcBb_77.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_28 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_28.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_28.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_28, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_49 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_49.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_49.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_49, 0.0F, -0.83164936F, 0.0F);
    this.NostrilRT = new ModelRenderer((ModelBase)this, 34, 583);
    this.NostrilRT.setRotationPoint(6.0F, 10.0F, -4.0F);
    this.NostrilRT.addBox(0.0F, 0.0F, 0.0F, 32, 8, 4, 0.0F);
    this.FeatherIdcTip_50 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_50.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_50.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_50, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_124 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_124.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_124.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_124, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_12 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_12.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_12.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_12, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_31 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_31.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_31.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_31, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_37 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_37.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_37.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_37, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_118 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_118.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_118.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_118, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcTip_100 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_100.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_100.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_100, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_79 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_79.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_79.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_79, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_46 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_46.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_46.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_46, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_21 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_21.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_21.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_21, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_20 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_20.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_20.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_20, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_81 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_81.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_81.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_81, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_104 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_104.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_104.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_104, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcBb_118 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_118.setRotationPoint(0.0F, 0.0F, 149.0F);
    this.FeatherIdcBb_118.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather30B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather30B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather30B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather30B, 0.0F, 0.83164936F, -0.62831855F);
    this.EyebrowLP4 = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowLP4.setRotationPoint(-21.0F, -4.2F, 0.0F);
    this.EyebrowLP4.addBox(0.0F, 0.0F, 0.0F, 23, 8, 8, 0.0F);
    setRotateAngle(this.EyebrowLP4, 0.0F, 0.0F, 0.18849556F);
    this.Feather25B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather25B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather25B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather25B, 0.0F, 0.83164936F, 0.0F);
    this.FeatherIdcBb_45 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_45.setRotationPoint(0.0F, 0.0F, 107.0F);
    this.FeatherIdcBb_45.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_94 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_94.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_94.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.FeatherIdcTip_94, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_38 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_38.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_38.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_38, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_98 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_98.setRotationPoint(0.0F, 41.0F, -9.0F);
    this.FeatherIdcBb_98.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather55B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather55B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather55B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather55B, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcP1_15 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_15.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_15.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_15, 0.0F, 0.50265485F, 0.0F);
    this.FangLtip = new ModelRenderer((ModelBase)this, 0, 0);
    this.FangLtip.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.FangLtip.addBox(0.0F, 0.0F, 0.0F, 11, 8, 8, 0.0F);
    setRotateAngle(this.FangLtip, 0.7819075F, -0.008028515F, 0.0F);
    this.FeatherIdcB_126 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_126.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_126.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_126, 0.0F, -1.1143928F, 1.5707964F);
    this.Feather51Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather51Bb.setRotationPoint(61.0F, 1.0F, 12.0F);
    this.Feather51Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_51 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_51.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_51.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_51, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_24 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_24.setRotationPoint(0.0F, 124.0F, 124.0F);
    this.FeatherIdcBb_24.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_74 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_74.setRotationPoint(227.0F, 2.0F, 100.1F);
    this.FeatherIdcBb_74.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_75 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_75.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_75.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_75, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcTip_131 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_131.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_131.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_131, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_3 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_3.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_3.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_3, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_14 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_14.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_14.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_14, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcBb_69 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_69.setRotationPoint(79.0F, 2.0F, 36.1F);
    this.FeatherIdcBb_69.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather29B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather29B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather29B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather29B, 0.0F, 0.83164936F, -0.62831855F);
    this.Feather2Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather2Bb.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather2Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Feather2Bb, 0.0F, 0.0F, -0.62831855F);
    this.Feather9Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather9Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather9Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather9Tip, -0.7853982F, 0.0F, 0.0F);
    this.Feather57Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather57Bb.setRotationPoint(58.0F, 0.0F, 85.0F);
    this.Feather57Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather31Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather31Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather31Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather31Tip, -0.7853982F, 0.0F, 0.0F);
    this.Feather6Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather6Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather6Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather6Tip, -0.7853982F, 0.0F, 0.0F);
    this.HeadSPL = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadSPL.setRotationPoint(-16.0F, 0.0F, -9.4F);
    this.HeadSPL.addBox(0.0F, 0.0F, 0.0F, 97, 140, 175, 0.0F);
    setRotateAngle(this.HeadSPL, 0.0F, -0.41818088F, 0.0F);
    this.Feather59Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather59Bb.setRotationPoint(154.0F, 0.0F, 84.0F);
    this.Feather59Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather2P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather2P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather2P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather2P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_24 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_24.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_24.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_24, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_39 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_39.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_39.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_39, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcBb_79 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_79.setRotationPoint(128.0F, 2.0F, 129.1F);
    this.FeatherIdcBb_79.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_91 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_91.setRotationPoint(1.9F, 0.0F, 13.8F);
    this.FeatherIdcP1_91.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_91, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcB_57 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_57.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_57.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_57, 0.0F, -0.83164936F, 0.0F);
    this.Feather35B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather35B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather35B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather35B, 0.0F, -0.83164936F, 0.0F);
    this.MoustacheLP7 = new ModelRenderer((ModelBase)this, 714, 684);
    this.MoustacheLP7.setRotationPoint(-21.72F, 0.0F, 10.23F);
    this.MoustacheLP7.addBox(0.0F, 0.0F, 0.0F, 24, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheLP7, 0.0F, 0.43982297F, 0.0F);
    this.FeatherIdcB_106 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_106.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_106.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_106, 0.0F, -1.1143928F, 1.5707964F);
    this.ToothBot4 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothBot4.setRotationPoint(64.0F, 0.0F, 4.0F);
    this.ToothBot4.addBox(0.0F, 0.0F, 0.0F, 20, 31, 31, 0.0F);
    setRotateAngle(this.ToothBot4, 0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_69 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_69.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_69.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_69, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_115 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_115.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_115.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_115, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcTip_59 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_59.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_59.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_59, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_72 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_72.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_72.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_72, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_104 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_104.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_104.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_104, -0.7853982F, 0.0F, 0.0F);
    this.Feather4 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather4.setRotationPoint(27.5F, 10.0F, -7.1F);
    this.Feather4.addBox(0.0F, 0.0F, 0.0F, 47, 24, 47, 0.0F);
    setRotateAngle(this.Feather4, 1.3194689F, -0.508938F, -0.81681406F);
    this.FeatherIdcBb_131 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_131.setRotationPoint(0.0F, 240.0F, 214.0F);
    this.FeatherIdcBb_131.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_33 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_33.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_33.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_33, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_93 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_93.setRotationPoint(1.9F, 0.0F, 13.8F);
    this.FeatherIdcP1_93.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_93, 0.0F, -0.50265485F, 0.0F);
    this.Feather17B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather17B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather17B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather17B, 0.0F, 0.83164936F, 0.0F);
    this.FeatherIdcB_2 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_2.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_2, 0.0F, -0.83164936F, 0.0F);
    this.Feather33Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather33Bb.setRotationPoint(0.0F, 0.0F, 52.0F);
    this.Feather33Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_22 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_22.setRotationPoint(0.0F, 41.0F, 90.0F);
    this.FeatherIdcBb_22.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_24 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_24.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_24.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_24, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_22 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_22.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_22.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_22, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_18 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_18.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_18.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_18, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_89 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_89.setRotationPoint(27.0F, -6.0F, -6.0F);
    this.FeatherIdcB_89.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.FeatherIdcB_89, 0.0F, -0.83164936F, 0.96342176F);
    this.FeatherIdcP1_79 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_79.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_79.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_79, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_103 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_103.setRotationPoint(0.0F, 235.0F, 16.0F);
    this.FeatherIdcBb_103.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather54P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather54P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather54P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather54P1, 0.0F, 0.50265485F, 0.0F);
    this.Feather44Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather44Bb.setRotationPoint(88.0F, 53.0F, 122.0F);
    this.Feather44Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_123 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_123.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_123.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_123, -0.7853982F, 0.0F, 0.0F);
    this.Feather48Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather48Bb.setRotationPoint(61.0F, 8.0F, 4.0F);
    this.Feather48Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_118 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_118.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_118.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_118, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_122 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_122.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_122.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_122, 0.0F, 0.50265485F, 0.0F);
    this.EyebrowLP1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowLP1.setRotationPoint(-33.7F, 0.0F, 15.3F);
    this.EyebrowLP1.addBox(0.0F, 0.0F, 0.0F, 37, 8, 8, 0.0F);
    setRotateAngle(this.EyebrowLP1, 0.0F, 0.4272566F, 0.0F);
    this.FeatherIdcBb_65 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_65.setRotationPoint(227.0F, 2.0F, 5.1F);
    this.FeatherIdcBb_65.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_41 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_41.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_41.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_41, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcBb_76 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_76.setRotationPoint(128.0F, 2.0F, 100.1F);
    this.FeatherIdcBb_76.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_26 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_26.setRotationPoint(0.0F, 196.0F, 124.0F);
    this.FeatherIdcBb_26.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_129 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_129.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_129.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_129, 0.0F, 0.50265485F, 0.0F);
    this.ToothT1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothT1.setRotationPoint(64.0F, 60.0F, 141.0F);
    this.ToothT1.addBox(0.0F, 0.0F, 0.0F, 20, 31, 31, 0.0F);
    setRotateAngle(this.ToothT1, 0.7853982F, 0.0F, 0.0F);
    this.Feather35P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather35P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather35P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather35P1, 0.0F, 0.50265485F, 0.0F);
    this.Feather31P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather31P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather31P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather31P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_54 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_54.setRotationPoint(78.0F, 2.0F, -62.0F);
    this.FeatherIdcBb_54.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_76 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_76.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_76.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_76, 0.0F, -0.83164936F, 0.0F);
    this.HeadSPR = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadSPR.setRotationPoint(28.7F, 0.0F, 30.0F);
    this.HeadSPR.addBox(0.0F, 0.0F, 0.0F, 97, 138, 164, 0.0F);
    setRotateAngle(this.HeadSPR, 0.0F, 0.41818088F, 0.0F);
    this.FeatherIdcP1_78 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_78.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_78.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_78, 0.0F, 0.50265485F, 0.0F);
    this.Feather33Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather33Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather33Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather33Tip, -0.7853982F, 0.0F, 0.0F);
    this.NostrilLRSPBot = new ModelRenderer((ModelBase)this, 23, 740);
    this.NostrilLRSPBot.setRotationPoint(3.0F, 27.3F, 0.0F);
    this.NostrilLRSPBot.addBox(0.0F, 0.0F, 0.0F, 7, 4, 6, 0.0F);
    setRotateAngle(this.NostrilLRSPBot, 0.0F, 0.0F, 0.8545132F);
    this.FeatherIdcP1_5 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_5.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_5.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_5, 0.0F, 0.50265485F, 0.0F);
    this.Feather11B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather11B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather11B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather11B, 0.0F, -0.83164936F, 0.0F);
    this.Feather33B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather33B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather33B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather33B, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_48 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_48.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_48.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_48, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_72 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_72.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_72.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_72, 0.0F, -0.83164936F, 0.0F);
    this.Feather8B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather8B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather8B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather8B, 0.0F, -0.83164936F, 0.0F);
    this.MoustacheRP8 = new ModelRenderer((ModelBase)this, 775, 584);
    this.MoustacheRP8.setRotationPoint(-23.0F, -9.8F, 0.0F);
    this.MoustacheRP8.addBox(0.0F, 0.0F, 0.0F, 28, 8, 8, 0.0F);
    setRotateAngle(this.MoustacheRP8, 0.0F, 0.0F, 0.37699112F);
    this.FeatherIdcB_110 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_110.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_110.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_110, 0.0F, -1.1143928F, 1.5707964F);
    this.ToothT4 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothT4.setRotationPoint(64.0F, 59.0F, 5.0F);
    this.ToothT4.addBox(0.0F, 0.0F, 0.0F, 20, 31, 31, 0.0F);
    setRotateAngle(this.ToothT4, 0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_85 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_85.setRotationPoint(79.0F, 2.0F, 158.1F);
    this.FeatherIdcBb_85.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather43B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather43B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather43B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather43B, 0.0F, 0.83164936F, 0.0F);
    this.FeatherIdcP1_86 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_86.setRotationPoint(0.0F, 0.0F, 21.0F);
    this.FeatherIdcP1_86.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_86, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_90 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_90.setRotationPoint(1.9F, 0.0F, 13.8F);
    this.FeatherIdcP1_90.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_90, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcTip_4 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_4.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_4.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_4, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_45 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_45.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_45.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_45, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_109 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_109.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_109.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_109, 0.0F, -1.1143928F, 1.5707964F);
    this.EyebrowLP6 = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowLP6.setRotationPoint(-19.3F, -6.7F, 0.0F);
    this.EyebrowLP6.addBox(0.0F, 0.0F, 0.0F, 23, 8, 8, 0.0F);
    setRotateAngle(this.EyebrowLP6, 0.0F, 0.0F, 0.31415927F);
    this.FeatherIdcB_85 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_85.setRotationPoint(27.0F, -6.0F, -6.0F);
    this.FeatherIdcB_85.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.FeatherIdcB_85, 0.0F, -0.83164936F, 0.96342176F);
    this.HeadBRupSP2 = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadBRupSP2.setRotationPoint(14.0F, -23.0F, 0.0F);
    this.HeadBRupSP2.addBox(0.0F, 0.0F, 0.0F, 82, 27, 187, 0.0F);
    setRotateAngle(this.HeadBRupSP2, 0.0F, 0.0F, 0.5466371F);
    this.FeatherIdcB_22 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_22.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_22.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_22, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_102 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_102.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_102.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_102, 0.0F, -1.1143928F, 1.5707964F);
    this.ToothBot10 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothBot10.setRotationPoint(0.0F, 0.0F, 51.0F);
    this.ToothBot10.addBox(0.0F, 0.0F, 0.0F, 20, 31, 31, 0.0F);
    setRotateAngle(this.ToothBot10, 0.7853982F, 0.0F, 0.0F);
    this.Feather41Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather41Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather41Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather41Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_13 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_13.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_13.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_13, 0.0F, -0.83164936F, 0.0F);
    this.Feather7Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather7Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather7Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather7Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB, 0.0F, -0.83164936F, 0.0F);
    this.Feather11Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather11Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather11Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather11Tip, -0.7853982F, 0.0F, 0.0F);
    this.ToothT6 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothT6.setRotationPoint(36.0F, 49.0F, 0.0F);
    this.ToothT6.addBox(0.0F, 0.0F, 0.0F, 16, 16, 9, 0.0F);
    setRotateAngle(this.ToothT6, 0.0F, 0.0F, 0.7853982F);
    this.FangP1R = new ModelRenderer((ModelBase)this, 0, 0);
    this.FangP1R.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.FangP1R.addBox(0.0F, 0.0F, 0.0F, 11, 24, 11, 0.0F);
    setRotateAngle(this.FangP1R, 0.25132743F, 0.0F, 0.0F);
    this.FangRtip = new ModelRenderer((ModelBase)this, 0, 0);
    this.FangRtip.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.FangRtip.addBox(0.0F, 0.0F, 0.0F, 11, 8, 8, 0.0F);
    setRotateAngle(this.FangRtip, 0.7819075F, -0.008028515F, 0.0F);
    this.Feather52P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather52P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather52P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather52P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_123 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_123.setRotationPoint(0.0F, 165.0F, 165.0F);
    this.FeatherIdcBb_123.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_2 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_2.setRotationPoint(0.0F, 79.9F, -47.9F);
    this.FeatherIdcBb_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_80 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_80.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_80.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_80, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_86 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_86.setRotationPoint(27.0F, -6.0F, -6.0F);
    this.FeatherIdcB_86.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.FeatherIdcB_86, 0.0F, -0.83164936F, 0.96342176F);
    this.Feather43P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather43P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather43P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather43P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcB_30 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_30.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_30.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_30, 0.0F, -0.83164936F, 0.0F);
    this.Feather55Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather55Bb.setRotationPoint(134.0F, 0.0F, 50.0F);
    this.Feather55Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_23 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_23.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_23.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_23, 0.0F, 0.50265485F, 0.0F);
    this.Feather22B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather22B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather22B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather22B, 0.0F, 0.83164936F, 0.0F);
    this.FeatherIdcBb_28 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_28.setRotationPoint(0.0F, 0.0F, 149.0F);
    this.FeatherIdcBb_28.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather13Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather13Bb.setRotationPoint(0.0F, 116.0F, 117.0F);
    this.Feather13Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_113 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_113.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_113.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_113, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_34 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_34.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_34.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_34, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_47 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_47.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_47.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_47, 0.0F, 0.50265485F, 0.0F);
    this.Feather3 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather3.setRotationPoint(18.5F, 6.0F, -20.0F);
    this.Feather3.addBox(0.0F, 0.0F, 0.0F, 47, 24, 47, 0.0F);
    setRotateAngle(this.Feather3, 1.3194689F, -0.508938F, -0.81681406F);
    this.EyebrowLP2 = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowLP2.setRotationPoint(-21.4F, 8.46F, 0.0F);
    this.EyebrowLP2.addBox(0.0F, 0.0F, 0.0F, 23, 8, 8, 0.0F);
    setRotateAngle(this.EyebrowLP2, 0.0F, 0.0F, -0.37699112F);
    this.ToothT10 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothT10.setRotationPoint(0.0F, 60.0F, 137.0F);
    this.ToothT10.addBox(0.0F, -0.1F, 0.0F, 20, 31, 31, 0.0F);
    setRotateAngle(this.ToothT10, 0.7853982F, 0.0F, 0.0F);
    this.Feather49Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather49Bb.setRotationPoint(61.0F, 8.0F, 53.0F);
    this.Feather49Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.ToothT3 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothT3.setRotationPoint(64.0F, 60.0F, 50.0F);
    this.ToothT3.addBox(0.0F, 0.0F, 0.0F, 20, 31, 31, 0.0F);
    setRotateAngle(this.ToothT3, 0.7853982F, 0.0F, 0.0F);
    this.Feather38Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather38Bb.setRotationPoint(86.0F, 0.0F, 12.0F);
    this.Feather38Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_12 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_12.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_12.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_12, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_32 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_32.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_32.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_32, 0.0F, -0.83164936F, 0.0F);
    this.MoustacheLP9 = new ModelRenderer((ModelBase)this, 852, 684);
    this.MoustacheLP9.setRotationPoint(-27.1F, 6.96F, 0.0F);
    this.MoustacheLP9.addBox(0.0F, 0.0F, 0.0F, 28, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheLP9, 0.0F, 0.0F, -0.25132743F);
    this.Feather37Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather37Bb.setRotationPoint(0.0F, 49.0F, 115.0F);
    this.Feather37Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_33 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_33.setRotationPoint(0.0F, 165.0F, 165.0F);
    this.FeatherIdcBb_33.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_105 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_105.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_105.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_105, 0.0F, 0.50265485F, 0.0F);
    this.Feather18B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather18B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather18B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather18B, 0.0F, 0.83164936F, 0.0F);
    this.FeatherIdcTip_47 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_47.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_47.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_47, -0.7853982F, 0.0F, 0.0F);
    this.MoustacheLP8 = new ModelRenderer((ModelBase)this, 777, 684);
    this.MoustacheLP8.setRotationPoint(-23.0F, -9.8F, 0.0F);
    this.MoustacheLP8.addBox(0.0F, 0.0F, 0.0F, 28, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheLP8, 0.0F, 0.0F, 0.37699112F);
    this.Feather10P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather10P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather10P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather10P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_129 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_129.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_129.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_129, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcBb_56 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_56.setRotationPoint(177.0F, 2.0F, -62.0F);
    this.FeatherIdcBb_56.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_131 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_131.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_131.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_131, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcP1_109 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_109.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_109.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_109, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_126 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_126.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_126.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_126, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_61 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_61.setRotationPoint(227.0F, 2.0F, -26.0F);
    this.FeatherIdcBb_61.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_54 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_54.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_54.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_54, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_71 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_71.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_71.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_71, 0.0F, 0.50265485F, 0.0F);
    this.Feather23Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather23Bb.setRotationPoint(262.1F, 37.0F, 120.0F);
    this.Feather23Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_108 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_108.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_108.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_108, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcTip_121 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_121.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_121.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_121, -0.7853982F, 0.0F, 0.0F);
    this.ToothBot8 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothBot8.setRotationPoint(12.0F, -11.0F, 0.0F);
    this.ToothBot8.addBox(0.0F, 0.0F, 0.0F, 16, 16, 9, 0.0F);
    setRotateAngle(this.ToothBot8, 0.0F, 0.0F, 0.7853982F);
    this.ToothBot3 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothBot3.setRotationPoint(64.0F, 0.0F, 48.0F);
    this.ToothBot3.addBox(0.0F, 0.0F, 0.0F, 20, 31, 31, 0.0F);
    setRotateAngle(this.ToothBot3, 0.7853982F, 0.0F, 0.0F);
    this.FangBR = new ModelRenderer((ModelBase)this, 0, 0);
    this.FangBR.setRotationPoint(12.0F, 56.0F, 0.0F);
    this.FangBR.addBox(0.0F, 0.0F, 0.0F, 11, 24, 11, 0.0F);
    setRotateAngle(this.FangBR, -0.12566371F, 0.0F, 0.0F);
    this.FeatherIdcP1_72 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_72.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_72.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_72, 0.0F, 0.50265485F, 0.0F);
    this.Feather54B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather54B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather54B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather54B, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcP1_55 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_55.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_55.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_55, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_15 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_15.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_15.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_15, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_41 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_41.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_41.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_41, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_65 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_65.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_65.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_65, 0.0F, 0.50265485F, 0.0F);
    this.Feather10B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather10B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather10B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather10B, 0.0F, -0.83164936F, 0.0F);
    this.Feather16Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather16Bb.setRotationPoint(262.1F, 74.0F, 11.0F);
    this.Feather16Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather45Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather45Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather45Tip.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.Feather45Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_3 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_3.setRotationPoint(0.0F, 124.0F, -30.0F);
    this.FeatherIdcBb_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_43 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_43.setRotationPoint(0.0F, 0.0F, 8.0F);
    this.FeatherIdcBb_43.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_30 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_30.setRotationPoint(0.0F, 40.0F, 140.0F);
    this.FeatherIdcBb_30.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.HeadBRupSP3 = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadBRupSP3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.HeadBRupSP3.addBox(0.0F, 0.0F, 0.0F, 27, 32, 187, 0.0F);
    setRotateAngle(this.HeadBRupSP3, 0.0F, 0.0F, -1.2817698F);
    this.EyebrowRP7 = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowRP7.setRotationPoint(-21.7F, 7.65F, 0.0F);
    this.EyebrowRP7.addBox(0.0F, 0.0F, 0.0F, 23, 8, 8, 0.0F);
    setRotateAngle(this.EyebrowRP7, 0.0F, 0.0F, -0.33929202F);
    this.Feather41P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather41P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather41P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather41P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcBb_21 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_21.setRotationPoint(0.0F, 0.0F, 100.0F);
    this.FeatherIdcBb_21.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather17Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather17Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather17Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather17Tip, -0.7853982F, 0.0F, 0.0F);
    this.BodyP1 = new ModelRenderer((ModelBase)this, 0, -1);
    this.BodyP1.mirror = true;
    this.BodyP1.setRotationPoint(0.0F, 0.0F, 44.0F);
    this.BodyP1.addBox(0.0F, 0.0F, 0.0F, 272, 279, 292, 0.0F);
    this.FeatherIdcBb_58 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_58.setRotationPoint(78.0F, 2.0F, -26.0F);
    this.FeatherIdcBb_58.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather53B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather53B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather53B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather53B, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcBb_8 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_8.setRotationPoint(0.0F, 41.0F, -9.0F);
    this.FeatherIdcBb_8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_65 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_65.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_65.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_65, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_61 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_61.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_61.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_61, 0.0F, 0.50265485F, 0.0F);
    this.Feather1P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather1P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather1P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather1P1, 0.0F, 0.50265485F, 0.0F);
    this.FangP1L = new ModelRenderer((ModelBase)this, 0, 0);
    this.FangP1L.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.FangP1L.addBox(0.0F, 0.0F, 0.0F, 11, 24, 11, 0.0F);
    setRotateAngle(this.FangP1L, 0.25132743F, 0.0F, 0.0F);
    this.Feather49Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather49Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather49Tip.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.Feather49Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_43 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_43.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_43.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_43, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_48 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_48.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_48.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_48, -0.7853982F, 0.0F, 0.0F);
    this.Feather7B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather7B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather7B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather7B, 0.0F, -0.83164936F, 0.0F);
    this.Feather6P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather6P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather6P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather6P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_40 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_40.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_40.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_40, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_124 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_124.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_124.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_124, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcP1_18 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_18.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_18.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_18, 0.0F, 0.50265485F, 0.0F);
    this.Feather29Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather29Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather29Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather29Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_115 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_115.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_115.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_115, -0.7853982F, 0.0F, 0.0F);
    this.Feather56B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather56B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather56B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather56B, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcTip_46 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_46.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_46.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_46, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_107 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_107.setRotationPoint(0.0F, 80.0F, 51.0F);
    this.FeatherIdcBb_107.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_57 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_57.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_57.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_57, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_81 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_81.setRotationPoint(226.0F, 2.0F, 129.1F);
    this.FeatherIdcBb_81.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_39 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_39.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_39.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_39, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_21 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_21.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_21.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_21, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_50 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_50.setRotationPoint(234.0F, 0.0F, 63.0F);
    this.FeatherIdcBb_50.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_77 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_77.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_77.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_77, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_109 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_109.setRotationPoint(0.0F, 199.0F, 74.0F);
    this.FeatherIdcBb_109.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_54 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_54.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_54.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_54, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_57 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_57.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_57.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_57, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_111 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_111.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_111.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_111, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcBb_99 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_99.setRotationPoint(0.0F, 80.0F, 3.0F);
    this.FeatherIdcBb_99.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_58 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_58.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_58.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_58, -0.7853982F, 0.0F, 0.0F);
    this.MoustacheLP10 = new ModelRenderer((ModelBase)this, 925, 684);
    this.MoustacheLP10.setRotationPoint(-26.0F, 10.5F, 0.0F);
    this.MoustacheLP10.addBox(0.0F, 0.0F, 0.0F, 28, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheLP10, 0.0F, 0.0F, -0.37699112F);
    this.FeatherIdcBb_52 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_52.setRotationPoint(234.0F, 0.0F, 158.0F);
    this.FeatherIdcBb_52.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_63 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_63.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_63.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_63, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_130 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_130.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_130.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_130, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcP1_59 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_59.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_59.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_59, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_36 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_36.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_36.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_36, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcBb_13 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_13.setRotationPoint(0.0F, 235.0F, 16.0F);
    this.FeatherIdcBb_13.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_36 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_36.setRotationPoint(0.0F, 79.0F, 198.0F);
    this.FeatherIdcBb_36.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_126 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_126.setRotationPoint(0.0F, 79.0F, 198.0F);
    this.FeatherIdcBb_126.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_75 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_75.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_75.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_75, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_99 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_99.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_99.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_99, 0.0F, 0.50265485F, 0.0F);
    this.Feather46P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather46P1.setRotationPoint(0.0F, 0.0F, 21.0F);
    this.Feather46P1.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.Feather46P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_3 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_3.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_3.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_3, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_10 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_10.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_10.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_10, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_62 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_62.setRotationPoint(78.0F, 2.0F, 5.1F);
    this.FeatherIdcBb_62.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_17 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_17.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_17.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_17, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_111 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_111.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_111.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_111, -0.7853982F, 0.0F, 0.0F);
    this.Feather12Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather12Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather12Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather12Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_6 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_6.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_6.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_6, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_114 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_114.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_114.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_114, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcP1_53 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_53.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_53.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_53, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_84 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_84.setRotationPoint(128.0F, 2.0F, 158.1F);
    this.FeatherIdcBb_84.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_119 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_119.setRotationPoint(0.0F, 79.0F, 149.0F);
    this.FeatherIdcBb_119.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather20B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather20B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather20B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather20B, 0.0F, 0.83164936F, 0.0F);
    this.FeatherIdcP1_84 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_84.setRotationPoint(0.0F, 0.0F, 21.0F);
    this.FeatherIdcP1_84.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_84, 0.0F, 0.50265485F, 0.0F);
    this.NostrilLT = new ModelRenderer((ModelBase)this, 34, 684);
    this.NostrilLT.setRotationPoint(59.0F, 10.0F, -4.0F);
    this.NostrilLT.addBox(0.0F, 0.0F, 0.0F, 32, 8, 4, 0.0F);
    this.FeatherIdcTip_81 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_81.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_81.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_81, -0.7853982F, 0.0F, 0.0F);
    this.Feather58B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather58B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather58B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather58B, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcB_26 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_26.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_26.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_26, 0.0F, -0.83164936F, 0.0F);
    this.HeadBUp = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadBUp.setRotationPoint(87.5F, 0.0F, -164.7F);
    this.HeadBUp.addBox(0.0F, 0.0F, 0.0F, 97, 60, 187, 0.0F);
    this.FeatherIdcTip_10 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_10.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_10.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_10, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_100 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_100.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_100.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_100, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcP1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_28 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_28.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_28.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_28, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_104 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_104.setRotationPoint(0.0F, 0.0F, 51.0F);
    this.FeatherIdcBb_104.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_88 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_88.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_88.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.FeatherIdcTip_88, -0.7853982F, 0.0F, 0.0F);
    this.Feather28Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather28Bb.setRotationPoint(249.1F, -9.0F, 48.0F);
    this.Feather28Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_105 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_105.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_105.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_105, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcTip_122 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_122.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_122.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_122, -0.7853982F, 0.0F, 0.0F);
    this.Lazyness101 = new ModelRenderer((ModelBase)this, 0, -1);
    this.Lazyness101.mirror = true;
    this.Lazyness101.setRotationPoint(272.0F, 279.0F, 0.0F);
    this.Lazyness101.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Lazyness101, 0.0F, 0.0F, 3.1415927F);
    this.FeatherIdcP1_116 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_116.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_116.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_116, 0.0F, 0.50265485F, 0.0F);
    this.HeadBRDo = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadBRDo.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.HeadBRDo.addBox(0.0F, 0.0F, 0.0F, 84, 32, 187, 0.0F);
    setRotateAngle(this.HeadBRDo, 0.0F, -0.48729593F, 0.0F);
    this.Feather19P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather19P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather19P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather19P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcP1_49 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_49.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_49.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_49, 0.0F, 0.50265485F, 0.0F);
    this.ToothBot2 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothBot2.setRotationPoint(64.0F, 0.0F, 91.0F);
    this.ToothBot2.addBox(0.0F, 0.0F, 0.0F, 20, 31, 31, 0.0F);
    setRotateAngle(this.ToothBot2, 0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_97 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_97.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_97.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_97, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcBb_10 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_10.setRotationPoint(0.0F, 124.0F, 24.0F);
    this.FeatherIdcBb_10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_95 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_95.setRotationPoint(0.0F, 197.0F, -30.0F);
    this.FeatherIdcBb_95.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather8Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather8Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather8Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather8Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_109 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_109.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_109.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_109, -0.7853982F, 0.0F, 0.0F);
    this.Feather23P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather23P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather23P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather23P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcB_43 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_43.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_43.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_43, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcTip_38 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_38.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_38.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_38, -0.7853982F, 0.0F, 0.0F);
    this.Feather3B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather3B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather3B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather3B, 0.0F, -0.83164936F, 0.0F);
    this.Feather27Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather27Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather27Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather27Tip, -0.7853982F, 0.0F, 0.0F);
    this.HeadBupSPbackBL = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadBupSPbackBL.setRotationPoint(1.0F, 0.0F, 29.0F);
    this.HeadBupSPbackBL.addBox(0.0F, 0.0F, 0.0F, 43, 30, 159, 0.0F);
    setRotateAngle(this.HeadBupSPbackBL, 0.0F, 0.42097342F, 0.0F);
    this.FeatherIdcTip_76 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_76.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_76.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_76, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_110 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_110.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_110.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_110, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_102 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_102.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_102.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_102, 0.0F, 0.50265485F, 0.0F);
    this.SnoutFSP2 = new ModelRenderer((ModelBase)this, 0, 0);
    this.SnoutFSP2.setRotationPoint(5.0F, -7.8F, 0.0F);
    this.SnoutFSP2.addBox(0.0F, 0.0F, 0.0F, 76, 8, 14, 0.0F);
    setRotateAngle(this.SnoutFSP2, -0.03769911F, 0.0F, 0.0F);
    this.FeatherIdcB_66 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_66.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_66.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_66, 0.0F, -0.83164936F, 0.0F);
    this.Feather26Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather26Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather26Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather26Tip, -0.7853982F, 0.0F, 0.0F);
    this.Feather34P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather34P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather34P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather34P1, 0.0F, 0.50265485F, 0.0F);
    this.MoustacheLP2 = new ModelRenderer((ModelBase)this, 346, 684);
    this.MoustacheLP2.setRotationPoint(-22.7F, -10.2F, 0.0F);
    this.MoustacheLP2.addBox(0.0F, 0.0F, 0.0F, 28, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheLP2, 0.0F, 0.0F, 0.39584067F);
    this.Feather30Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather30Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather30Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather30Tip, -0.7853982F, 0.0F, 0.0F);
    this.Feather43Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather43Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather43Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather43Tip, -0.7853982F, 0.0F, 0.0F);
    this.ToothT7 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothT7.setRotationPoint(0.0F, 60.0F, 5.0F);
    this.ToothT7.addBox(0.0F, 0.0F, 0.0F, 20, 31, 31, 0.0F);
    setRotateAngle(this.ToothT7, 0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_129 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_129.setRotationPoint(0.0F, 199.0F, 222.0F);
    this.FeatherIdcBb_129.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_110 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_110.setRotationPoint(0.0F, 237.0F, 64.0F);
    this.FeatherIdcBb_110.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_83 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_83.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_83.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_83, -0.7853982F, 0.0F, 0.0F);
    this.Feather44B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather44B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather44B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather44B, 0.0F, 0.83164936F, 0.0F);
    this.FeatherIdcP1_14 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_14.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_14.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_14, 0.0F, 0.50265485F, 0.0F);
    this.Feather22Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather22Bb.setRotationPoint(262.1F, 0.0F, 113.0F);
    this.Feather22Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.NostrilRR = new ModelRenderer((ModelBase)this, 102, 600);
    this.NostrilRR.setRotationPoint(6.0F, 10.0F, -4.0F);
    this.NostrilRR.addBox(0.0F, 0.0F, 0.0F, 8, 35, 4, 0.0F);
    this.Feather33P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather33P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather33P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather33P1, 0.0F, 0.50265485F, 0.0F);
    this.Feather17Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather17Bb.setRotationPoint(262.1F, 116.0F, 18.0F);
    this.Feather17Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_125 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_125.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_125.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_125, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_111 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_111.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_111.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_111, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_87 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_87.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_87.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.FeatherIdcTip_87, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_89 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_89.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_89.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.FeatherIdcTip_89, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_82 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_82.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_82.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_82, -0.7853982F, 0.0F, 0.0F);
    this.Feather5Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather5Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather5Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather5Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_89 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_89.setRotationPoint(0.0F, 0.0F, 21.0F);
    this.FeatherIdcP1_89.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_89, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_42 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_42.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_42.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_42, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_50 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_50.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_50.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_50, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcBb_78 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_78.setRotationPoint(78.0F, 2.0F, 129.1F);
    this.FeatherIdcBb_78.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather53Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather53Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather53Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather53Tip, -0.7853982F, 0.0F, 0.0F);
    this.EyebrowRP5 = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowRP5.setRotationPoint(-20.86F, 0.0F, -4.55F);
    this.EyebrowRP5.addBox(0.0F, 0.0F, 0.0F, 23, 8, 8, 0.0F);
    setRotateAngle(this.EyebrowRP5, 0.0F, -0.20734511F, 0.0F);
    this.FeatherIdcB_9 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_9.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_9.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_9, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_112 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_112.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_112.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_112, 0.0F, 0.50265485F, 0.0F);
    this.SnoutFSP5 = new ModelRenderer((ModelBase)this, 0, 0);
    this.SnoutFSP5.setRotationPoint(3.0F, -6.9F, 0.8F);
    this.SnoutFSP5.addBox(0.0F, 0.0F, 0.0F, 44, 7, 14, 0.0F);
    setRotateAngle(this.SnoutFSP5, -0.11309733F, 0.0F, 0.0F);
    this.ToothBot9 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothBot9.setRotationPoint(0.0F, 0.0F, 8.0F);
    this.ToothBot9.addBox(0.0F, 0.0F, 0.0F, 20, 31, 31, 0.0F);
    setRotateAngle(this.ToothBot9, 0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_98 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_98.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_98.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_98, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_96 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_96.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_96.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_96, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcP1_9 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_9.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_9.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_9, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_18 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_18.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_18.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_18, -0.7853982F, 0.0F, 0.0F);
    this.Feather18Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather18Bb.setRotationPoint(262.1F, 0.0F, 60.0F);
    this.Feather18Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.SnoutFSP4 = new ModelRenderer((ModelBase)this, 0, 0);
    this.SnoutFSP4.setRotationPoint(4.3F, -3.7F, 2.0F);
    this.SnoutFSP4.addBox(0.0F, 0.0F, 0.0F, 53, 4, 12, 0.0F);
    setRotateAngle(this.SnoutFSP4, -0.29530972F, 0.008028515F, 0.0F);
    this.Feather25Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather25Bb.setRotationPoint(262.1F, 116.0F, 120.0F);
    this.Feather25Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_7 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_7.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_7.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_7, -0.7853982F, 0.0F, 0.0F);
    this.Feather14Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather14Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather14Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather14Tip, -0.7853982F, 0.0F, 0.0F);
    this.MoustacheRP1 = new ModelRenderer((ModelBase)this, 265, 584);
    this.MoustacheRP1.setRotationPoint(-23.4F, 0.0F, 15.3F);
    this.MoustacheRP1.addBox(0.0F, 0.0F, 0.0F, 28, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheRP1, 0.0F, 0.57805306F, 0.0F);
    this.FeatherIdcB_51 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_51.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_51.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_51, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_13 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_13.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_13.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_13, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_94 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_94.setRotationPoint(1.9F, 0.0F, 13.8F);
    this.FeatherIdcP1_94.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_94, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcB_55 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_55.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_55.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_55, 0.0F, -0.83164936F, 0.0F);
    this.Feather40B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather40B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather40B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather40B, 0.0F, 0.83164936F, 0.0F);
    this.Feather5Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather5Bb.setRotationPoint(0.0F, 116.0F, 16.0F);
    this.Feather5Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.EyebrowLB = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowLB.setRotationPoint(120.0F, 23.0F, -8.0F);
    this.EyebrowLB.addBox(0.0F, 0.0F, 0.0F, 48, 8, 8, 0.0F);
    setRotateAngle(this.EyebrowLB, 3.1415927F, 3.1415927F, -0.16336282F);
    this.FeatherIdcBb_96 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_96.setRotationPoint(0.0F, 235.0F, -24.0F);
    this.FeatherIdcBb_96.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.ToothBot11 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothBot11.setRotationPoint(0.0F, 0.0F, 94.0F);
    this.ToothBot11.addBox(0.0F, 0.0F, 0.0F, 20, 31, 31, 0.0F);
    setRotateAngle(this.ToothBot11, 0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_40 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_40.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_40.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_40, -0.7853982F, 0.0F, 0.0F);
    this.Feather13Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather13Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather13Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather13Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_14 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_14.setRotationPoint(0.0F, 0.0F, 51.0F);
    this.FeatherIdcBb_14.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_35 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_35.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_35.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_35, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_59 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_59.setRotationPoint(126.0F, 2.0F, -26.0F);
    this.FeatherIdcBb_59.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.ToothBot12 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothBot12.setRotationPoint(0.0F, 0.0F, 137.0F);
    this.ToothBot12.addBox(0.0F, 0.0F, 0.0F, 20, 31, 31, 0.0F);
    setRotateAngle(this.ToothBot12, 0.7853982F, 0.0F, 0.0F);
    this.EyebrowRP1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowRP1.setRotationPoint(-33.7F, 0.0F, 15.3F);
    this.EyebrowRP1.addBox(0.0F, 0.0F, 0.0F, 37, 8, 8, 0.0F);
    setRotateAngle(this.EyebrowRP1, 0.0F, 0.4272566F, 0.0F);
    this.FeatherIdcTip_74 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_74.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_74.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_74, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_56 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_56.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_56.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_56, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcBb_29 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_29.setRotationPoint(0.0F, 79.0F, 149.0F);
    this.FeatherIdcBb_29.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_83 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_83.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_83.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_83, 0.0F, -0.83164936F, 0.0F);
    this.Feather46Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather46Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather46Tip.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.Feather46Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_122 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_122.setRotationPoint(0.0F, 199.0F, 172.0F);
    this.FeatherIdcBb_122.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_93 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_93.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_93.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.FeatherIdcTip_93, -0.7853982F, 0.0F, 0.0F);
    this.ToothT9 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothT9.setRotationPoint(0.0F, 60.0F, 94.0F);
    this.ToothT9.addBox(0.0F, 0.0F, 0.0F, 20, 31, 31, 0.0F);
    setRotateAngle(this.ToothT9, 0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_19 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_19.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_19.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_19, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_116 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_116.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_116.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_116, -0.7853982F, 0.0F, 0.0F);
    this.Feather30P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather30P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather30P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather30P1, 0.0F, -0.50265485F, 0.0F);
    this.Feather6Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather6Bb.setRotationPoint(0.0F, 0.0F, 53.0F);
    this.Feather6Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.NostrilLL = new ModelRenderer((ModelBase)this, 102, 700);
    this.NostrilLL.setRotationPoint(83.0F, 10.0F, -4.0F);
    this.NostrilLL.addBox(0.0F, 0.0F, 0.0F, 8, 35, 4, 0.0F);
    this.HeadSPLUp = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadSPLUp.setRotationPoint(41.2F, 0.0F, 43.2F);
    this.HeadSPLUp.addBox(0.0F, 0.0F, 0.0F, 98, 140, 160, 0.0F);
    setRotateAngle(this.HeadSPLUp, 0.0F, 0.46495572F, 0.0F);
    this.FeatherIdcB_60 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_60.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_60.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_60, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_95 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_95.setRotationPoint(1.9F, 0.0F, 13.8F);
    this.FeatherIdcP1_95.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_95, 0.0F, -0.50265485F, 0.0F);
    this.Feather24Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather24Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather24Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather24Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_78 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_78.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_78.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_78, -0.7853982F, 0.0F, 0.0F);
    this.MoustacheLP6 = new ModelRenderer((ModelBase)this, 649, 684);
    this.MoustacheLP6.setRotationPoint(-21.0F, -5.6F, 0.0F);
    this.MoustacheLP6.addBox(0.0F, 0.0F, 0.0F, 24, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheLP6, 0.0F, 0.0F, 0.25132743F);
    this.Feather39B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather39B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather39B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather39B, 0.0F, 0.83164936F, 0.0F);
    this.Feather19B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather19B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather19B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather19B, 0.0F, 0.83164936F, 0.0F);
    this.Feather22Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather22Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather22Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather22Tip, -0.7853982F, 0.0F, 0.0F);
    this.ToothT2 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothT2.setRotationPoint(64.0F, 60.0F, 96.0F);
    this.ToothT2.addBox(0.0F, 0.0F, 0.0F, 20, 31, 31, 0.0F);
    setRotateAngle(this.ToothT2, 0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_16 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_16.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_16.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_16, 0.0F, -0.83164936F, 0.0F);
    this.Feather31Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather31Bb.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather31Bb.addBox(0.0F, 0.0F, 0.1F, 1, 1, 1, 0.0F);
    this.Feather23B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather23B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather23B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather23B, 0.0F, 0.83164936F, 0.0F);
    this.Feather5B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather5B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather5B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather5B, 0.0F, -0.83164936F, 0.0F);
    this.HeadBLDo = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadBLDo.setRotationPoint(22.75F, 0.0F, 39.27F);
    this.HeadBLDo.addBox(0.0F, 0.0F, 0.0F, 84, 32, 187, 0.0F);
    setRotateAngle(this.HeadBLDo, 0.0F, 0.48729593F, 0.0F);
    this.FeatherIdcB_59 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_59.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_59.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_59, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_63 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_63.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_63.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_63, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_34 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_34.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_34.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_34, -0.7853982F, 0.0F, 0.0F);
    this.SnoutFSP1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.SnoutFSP1.setRotationPoint(6.0F, -6.9F, 2.5F);
    this.SnoutFSP1.addBox(0.0F, 0.0F, 0.0F, 84, 8, 14, 0.0F);
    setRotateAngle(this.SnoutFSP1, -0.32044244F, 0.0F, 0.0062831854F);
    this.FeatherIdcTip_127 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_127.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_127.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_127, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_60 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_60.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_60.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_60, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_126 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_126.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_126.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_126, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_53 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_53.setRotationPoint(235.0F, 0.0F, 210.0F);
    this.FeatherIdcBb_53.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather28B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather28B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather28B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather28B, 0.0F, 0.83164936F, -0.62831855F);
    this.FeatherIdcBb_91 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_91.setRotationPoint(0.0F, 37.0F, -59.0F);
    this.FeatherIdcBb_91.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_71 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_71.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_71.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_71, 0.0F, -0.83164936F, 0.0F);
    this.Feather36P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather36P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather36P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather36P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_58 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_58.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_58.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_58, 0.0F, -0.83164936F, 0.0F);
    this.Feather15P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather15P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather15P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather15P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcBb_120 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_120.setRotationPoint(0.0F, 40.0F, 140.0F);
    this.FeatherIdcBb_120.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_92 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_92.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_92.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.FeatherIdcB_92, 0.0F, 0.83164936F, -0.96342176F);
    this.Feather50B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather50B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather50B.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.Feather50B, 0.0F, 0.83164936F, -0.96342176F);
    this.FeatherIdcP1_87 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_87.setRotationPoint(0.0F, 0.0F, 21.0F);
    this.FeatherIdcP1_87.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_87, 0.0F, 0.50265485F, 0.0F);
    this.Feather17P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather17P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather17P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather17P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcTip_117 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_117.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_117.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_117, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_62 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_62.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_62.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_62, 0.0F, 0.50265485F, 0.0F);
    this.Feather14B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather14B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather14B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather14B, 0.0F, 0.83164936F, 0.0F);
    this.FeatherIdcBb_44 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_44.setRotationPoint(0.0F, 0.0F, 58.0F);
    this.FeatherIdcBb_44.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_114 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_114.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_114.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_114, -0.7853982F, 0.0F, 0.0F);
    this.EyeLL = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyeLL.setRotationPoint(114.0F, 24.1F, -5.0F);
    this.EyeLL.addBox(0.0F, 0.0F, 0.0F, 6, 42, 5, 0.0F);
    this.FeatherIdcTip_2 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_2.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_2.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_2, -0.7853982F, 0.0F, 0.0F);
    this.Feather9P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather9P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather9P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather9P1, 0.0F, 0.50265485F, 0.0F);
    this.Feather36Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather36Bb.setRotationPoint(0.0F, 47.0F, 66.1F);
    this.Feather36Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_1.setRotationPoint(0.0F, 37.0F, -59.0F);
    this.FeatherIdcBb_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather2 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather2.setRotationPoint(249.7F, 11.0F, -13.1F);
    this.Feather2.addBox(0.0F, 0.0F, 0.0F, 47, 24, 47, 0.0F);
    setRotateAngle(this.Feather2, 1.1938052F, -0.38327432F, -0.43982297F);
    this.Feather41Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather41Bb.setRotationPoint(91.0F, 48.0F, 28.0F);
    this.Feather41Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_10 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_10.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_10.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_10, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_120 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_120.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_120.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_120, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_87 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_87.setRotationPoint(27.0F, -6.0F, -6.0F);
    this.FeatherIdcB_87.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.FeatherIdcB_87, 0.0F, -0.83164936F, 0.96342176F);
    this.Feather29Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather29Bb.setRotationPoint(247.1F, -9.0F, 99.0F);
    this.Feather29Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather42B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather42B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather42B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather42B, 0.0F, 0.83164936F, 0.0F);
    this.FeatherIdcBb_116 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_116.setRotationPoint(0.0F, 196.0F, 124.0F);
    this.FeatherIdcBb_116.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_106 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_106.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_106.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_106, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_128 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_128.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_128.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_128, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_44 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_44.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_44.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_44, 0.0F, 0.50265485F, 0.0F);
    this.Feather55Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather55Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather55Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather55Tip, -0.7853982F, 0.0F, 0.0F);
    this.Feather41B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather41B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather41B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather41B, 0.0F, 0.83164936F, 0.0F);
    this.Feather48B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather48B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather48B.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.Feather48B, 0.0F, 0.83164936F, -0.96342176F);
    this.FeatherIdcTip_23 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_23.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_23.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_23, -0.7853982F, 0.0F, 0.0F);
    this.Feather22P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather22P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather22P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather22P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcTip_71 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_71.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_71.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_71, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_40 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_40.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_40.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_40, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_13 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_13.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_13.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_13, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_91 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_91.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_91.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.FeatherIdcB_91, 0.0F, 0.83164936F, -0.96342176F);
    this.Feather45B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather45B.setRotationPoint(27.0F, -6.0F, -6.0F);
    this.Feather45B.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.Feather45B, 0.0F, -0.83164936F, 0.96342176F);
    this.Feather48Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather48Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather48Tip.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.Feather48Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_11 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_11.setRotationPoint(0.0F, 159.0F, 15.0F);
    this.FeatherIdcBb_11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_75 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_75.setRotationPoint(176.0F, 2.0F, 100.1F);
    this.FeatherIdcBb_75.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_123 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_123.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_123.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_123, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_47 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_47.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_47.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_47, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_66 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_66.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_66.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_66, 0.0F, 0.50265485F, 0.0F);
    this.EyebrowLP5 = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowLP5.setRotationPoint(-21.76F, 0.0F, 1.65F);
    this.EyebrowLP5.addBox(0.0F, 0.0F, 0.0F, 23, 8, 8, 0.0F);
    setRotateAngle(this.EyebrowLP5, 0.0F, 0.07539822F, 0.0F);
    this.Feather32B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather32B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather32B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather32B, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcTip_92 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_92.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_92.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.FeatherIdcTip_92, -0.7853982F, 0.0F, 0.0F);
    this.Feather3P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather3P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather3P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather3P1, 0.0F, 0.50265485F, 0.0F);
    this.HeadBLupSP2 = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadBLupSP2.setRotationPoint(14.0F, -23.0F, 0.0F);
    this.HeadBLupSP2.addBox(0.0F, 0.0F, 0.0F, 82, 27, 187, 0.0F);
    setRotateAngle(this.HeadBLupSP2, 0.0F, 0.0F, 0.5466371F);
    this.MoustacheRP4 = new ModelRenderer((ModelBase)this, 507, 584);
    this.MoustacheRP4.setRotationPoint(-15.0F, 0.0F, 7.8F);
    this.MoustacheRP4.addBox(0.0F, 0.0F, 0.0F, 17, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheRP4, 0.0F, 0.47752208F, 0.0F);
    this.FeatherIdcP1_26 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_26.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_26.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_26, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_31 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_31.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_31.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_31, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_91 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_91.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_91.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.FeatherIdcTip_91, -0.7853982F, 0.0F, 0.0F);
    this.Feather42Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather42Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather42Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather42Tip, -0.7853982F, 0.0F, 0.0F);
    this.Feather51P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather51P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather51P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather51P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_36 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_36.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_36.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_36, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_85 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_85.setRotationPoint(0.0F, 0.0F, 21.0F);
    this.FeatherIdcP1_85.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_85, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_2 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_2.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_2.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_2, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_106 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_106.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_106.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_106, -0.7853982F, 0.0F, 0.0F);
    this.Feather58Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather58Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather58Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather58Tip, -0.7853982F, 0.0F, 0.0F);
    this.EyebrowLP3 = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowLP3.setRotationPoint(-19.32F, 0.0F, 12.43F);
    this.EyebrowLP3.addBox(0.0F, 0.0F, 0.0F, 23, 8, 8, 0.0F);
    setRotateAngle(this.EyebrowLP3, 0.0F, 0.57176983F, 0.0F);
    this.FeatherIdcP1_29 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_29.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_29.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_29, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_14 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_14.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_14.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_14, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_11 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_11.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_11.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_11, -0.7853982F, 0.0F, 0.0F);
    this.Feather52B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather52B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather52B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather52B, 0.0F, -1.1143928F, 1.5707964F);
    this.Feather42P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather42P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather42P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather42P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcB_123 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_123.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_123.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_123, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcB_44 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_44.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_44.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_44, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_52 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_52.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_52.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_52, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcBb_12 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_12.setRotationPoint(0.0F, 198.0F, 24.0F);
    this.FeatherIdcBb_12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.HeadSP = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadSP.setRotationPoint(87.5F, -114.5F, 15.0F);
    this.HeadSP.addBox(0.0F, 0.0F, 0.0F, 97, 99, 190, 0.0F);
    setRotateAngle(this.HeadSP, -0.47944194F, 0.0F, 0.0F);
    this.FeatherIdcB_73 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_73.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_73.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_73, 0.0F, -0.83164936F, 0.0F);
    this.ToothBot5 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothBot5.setRotationPoint(79.0F, -11.3F, 0.0F);
    this.ToothBot5.addBox(0.0F, 0.0F, 0.0F, 16, 16, 9, 0.0F);
    setRotateAngle(this.ToothBot5, 0.0F, 0.0F, 0.7853982F);
    this.FeatherIdcBb_105 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_105.setRotationPoint(0.0F, 41.0F, 42.0F);
    this.FeatherIdcBb_105.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather16P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather16P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather16P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather16P1, 0.0F, -0.50265485F, 0.0F);
    this.Feather14Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather14Bb.setRotationPoint(262.1F, 0.0F, 11.0F);
    this.Feather14Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_63 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_63.setRotationPoint(126.0F, 2.0F, 5.1F);
    this.FeatherIdcBb_63.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_48 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_48.setRotationPoint(234.0F, 0.0F, -37.0F);
    this.FeatherIdcBb_48.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather25Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather25Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather25Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather25Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_21 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_21.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_21.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_21, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcTip_30 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_30.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_30.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_30, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_6 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_6.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_6.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_6, -0.7853982F, 0.0F, 0.0F);
    this.Feather40Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather40Bb.setRotationPoint(83.0F, 0.0F, 55.0F);
    this.Feather40Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_103 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_103.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_103.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_103, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcB_17 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_17.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_17.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_17, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcBb_106 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_106.setRotationPoint(0.0F, 124.0F, 74.0F);
    this.FeatherIdcBb_106.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_43 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_43.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_43.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_43, 0.0F, 0.50265485F, 0.0F);
    this.Feather44Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather44Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather44Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather44Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_67 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_67.setRotationPoint(175.0F, 2.0F, 36.1F);
    this.FeatherIdcBb_67.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather40P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather40P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather40P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather40P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcP1_119 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_119.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_119.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_119, 0.0F, 0.50265485F, 0.0F);
    this.HeadBRup = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadBRup.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.HeadBRup.addBox(0.0F, 0.0F, 0.0F, 84, 60, 187, 0.0F);
    setRotateAngle(this.HeadBRup, 0.0F, -0.48729593F, 0.0F);
    this.FeatherIdcP1_16 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_16.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_16.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_16, 0.0F, 0.50265485F, 0.0F);
    this.EyebrowRP2 = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowRP2.setRotationPoint(-18.3F, -8.04F, 0.0F);
    this.EyebrowRP2.addBox(0.0F, 0.0F, 0.0F, 23, 8, 8, 0.0F);
    setRotateAngle(this.EyebrowRP2, 0.0F, 0.0F, 0.37699112F);
    this.FeatherIdcB_33 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_33.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_33.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_33, 0.0F, -0.83164936F, 0.0F);
    this.Feather26Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather26Bb.setRotationPoint(22.0F, -19.0F, 92.0F);
    this.Feather26Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather2Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather2Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather2Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather2Tip, -0.7853982F, 0.0F, 0.0F);
    this.Feather44P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather44P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather44P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather44P1, 0.0F, -0.50265485F, 0.0F);
    this.HeadBback = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadBback.setRotationPoint(-136.4F, -112.1F, 79.51F);
    this.HeadBback.addBox(0.0F, 0.0F, 0.0F, 272, 160, 194, 0.1F);
    this.FeatherIdcBb_127 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_127.setRotationPoint(0.0F, 36.0F, 191.0F);
    this.FeatherIdcBb_127.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather1.mirror = true;
    this.Feather1.setRotationPoint(233.0F, 5.0F, -23.0F);
    this.Feather1.addBox(0.0F, 0.0F, 0.0F, 47, 24, 47, 0.0F);
    setRotateAngle(this.Feather1, 1.1938052F, -0.38327432F, -0.43982297F);
    this.FeatherIdcP1_20 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_20.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_20.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_20, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_52 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_52.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_52.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_52, -0.7853982F, 0.0F, 0.0F);
    this.ToothBot6 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothBot6.setRotationPoint(57.0F, -11.0F, 0.0F);
    this.ToothBot6.addBox(0.0F, 0.0F, 0.0F, 16, 16, 9, 0.0F);
    setRotateAngle(this.ToothBot6, 0.0F, 0.0F, 0.7853982F);
    this.MoustacheLSP = new ModelRenderer((ModelBase)this, 106, 683);
    this.MoustacheLSP.setRotationPoint(50.1F, 5.7F, 0.0F);
    this.MoustacheLSP.addBox(0.0F, 0.0F, 0.0F, 6, 3, 8, 0.0F);
    setRotateAngle(this.MoustacheLSP, 0.0F, 0.0F, -0.6974336F);
    this.HeadBDo = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadBDo.setRotationPoint(87.5F, 128.0F, -165.0F);
    this.HeadBDo.addBox(0.0F, 0.0F, 0.0F, 97, 32, 187, 0.0F);
    this.Feather47Bb = new ModelRenderer((ModelBase)this, 0, -1);
    this.Feather47Bb.setRotationPoint(0.0F, 5.0F, 100.0F);
    this.Feather47Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_36 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_36.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_36.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_36, 0.0F, 0.50265485F, 0.0F);
    this.Feather56Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather56Bb.setRotationPoint(9.0F, 0.0F, 84.0F);
    this.Feather56Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_121 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_121.setRotationPoint(0.0F, 124.0F, 172.0F);
    this.FeatherIdcBb_121.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.SnoutFSP3 = new ModelRenderer((ModelBase)this, 0, 0);
    this.SnoutFSP3.setRotationPoint(7.4F, -7.2F, 2.5F);
    this.SnoutFSP3.addBox(0.0F, 0.0F, 0.0F, 62, 8, 14, 0.0F);
    setRotateAngle(this.SnoutFSP3, -0.31415927F, 0.0F, 0.0F);
    this.Feather43Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather43Bb.setRotationPoint(89.0F, 48.0F, 75.0F);
    this.Feather43Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.MoustacheRB = new ModelRenderer((ModelBase)this, 140, 584);
    this.MoustacheRB.setRotationPoint(-15.0F, 5.9F, -4.0F);
    this.MoustacheRB.addBox(0.0F, 0.0F, 0.0F, 52, 9, 8, 0.0F);
    this.FeatherIdcTip_44 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_44.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_44.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_44, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_64 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_64.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_64.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_64, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_50 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_50.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_50.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_50, 0.0F, 0.50265485F, 0.0F);
    this.Feather47B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather47B.setRotationPoint(27.0F, -6.0F, -6.0F);
    this.Feather47B.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.Feather47B, 0.0F, -0.83164936F, 0.96342176F);
    this.Feather53P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather53P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather53P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather53P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_46 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_46.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_46.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_46, 0.0F, 0.50265485F, 0.0F);
    this.MoustacheLP5 = new ModelRenderer((ModelBase)this, 569, 684);
    this.MoustacheLP5.setRotationPoint(-25.4F, 11.76F, 0.0F);
    this.MoustacheLP5.addBox(0.0F, 0.0F, 0.0F, 28, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheLP5, 0.0F, 0.0F, -0.43353978F);
    this.Feather45Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather45Bb.setRotationPoint(0.0F, 5.0F, 4.0F);
    this.Feather45Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.EyeLR = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyeLR.setRotationPoint(78.0F, 24.0F, -5.0F);
    this.EyeLR.addBox(0.0F, 0.0F, 0.0F, 6, 42, 5, 0.0F);
    this.Feather8P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather8P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather8P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather8P1, 0.0F, 0.50265485F, 0.0F);
    this.Feather37P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather37P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather37P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather37P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_119 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_119.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_119.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_119, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_55 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_55.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_55.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_55, -0.7853982F, 0.0F, 0.0F);
    this.HeadBLupSP1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadBLupSP1.setRotationPoint(66.6F, -20.7F, 184.7F);
    this.HeadBLupSP1.addBox(0.0F, 0.0F, 0.0F, 84, 27, 187, 0.0F);
    setRotateAngle(this.HeadBLupSP1, 0.0F, 3.1415927F, -0.7351327F);
    this.FeatherIdcBb_23 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_23.setRotationPoint(0.0F, 79.0F, 99.0F);
    this.FeatherIdcBb_23.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_111 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_111.setRotationPoint(0.0F, 0.0F, 100.0F);
    this.FeatherIdcBb_111.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_9 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_9.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_9.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_9, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_73 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_73.setRotationPoint(227.0F, 2.0F, 65.1F);
    this.FeatherIdcBb_73.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_64 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_64.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_64.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_64, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_127 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_127.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_127.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_127, 0.0F, -1.1143928F, 1.5707964F);
    this.Feather20Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather20Bb.setRotationPoint(262.1F, 72.0F, 60.0F);
    this.Feather20Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather34Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather34Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather34Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather34Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_29 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_29.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_29.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_29, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcBb_87 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_87.setRotationPoint(128.0F, 2.0F, 183.1F);
    this.FeatherIdcBb_87.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.MoustacheRSP = new ModelRenderer((ModelBase)this, 106, 583);
    this.MoustacheRSP.setRotationPoint(52.0F, 0.0F, 0.0F);
    this.MoustacheRSP.addBox(0.0F, 0.0F, 0.0F, 6, 3, 8, 0.0F);
    setRotateAngle(this.MoustacheRSP, 0.0F, 0.0F, 0.6974336F);
    this.FeatherIdcTip_112 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_112.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_112.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_112, -0.7853982F, 0.0F, 0.0F);
    this.EyeBR = new ModelRenderer((ModelBase)this, 1230, 100);
    this.EyeBR.setRotationPoint(19.0F, 30.0F, -2.0F);
    this.EyeBR.addBox(0.0F, 0.0F, 0.0F, 30, 30, 2, 0.0F);
    this.FeatherIdcTip_98 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_98.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_98.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_98, -0.7853982F, 0.0F, 0.0F);
    this.Feather32Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather32Bb.setRotationPoint(-9.0F, 44.0F, -21.0F);
    this.Feather32Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_25 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_25.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_25.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_25, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_1, 0.0F, -0.83164936F, 0.0F);
    this.MoustacheLP1 = new ModelRenderer((ModelBase)this, 265, 684);
    this.MoustacheLP1.setRotationPoint(-23.4F, 0.0F, 15.3F);
    this.MoustacheLP1.addBox(0.0F, 0.0F, 0.0F, 28, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheLP1, 0.0F, 0.57805306F, 0.0F);
    this.FeatherIdcTip_32 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_32.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_32.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_32, -0.7853982F, 0.0F, 0.0F);
    this.Feather57B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather57B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather57B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather57B, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcTip_67 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_67.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_67.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_67, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_95 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_95.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_95.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.FeatherIdcB_95, 0.0F, 0.83164936F, -0.96342176F);
    this.Feather40Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather40Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather40Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather40Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_7 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_7.setRotationPoint(0.0F, 0.0F, 3.0F);
    this.FeatherIdcBb_7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_117 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_117.setRotationPoint(0.0F, 236.0F, 117.0F);
    this.FeatherIdcBb_117.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_88 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_88.setRotationPoint(0.0F, 0.0F, 21.0F);
    this.FeatherIdcP1_88.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_88, 0.0F, 0.50265485F, 0.0F);
    this.Feather21P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather21P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather21P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather21P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcTip_66 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_66.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_66.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_66, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_118 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_118.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_118.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_118, -0.7853982F, 0.0F, 0.0F);
    this.Feather21Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather21Bb.setRotationPoint(262.1F, 116.0F, 68.0F);
    this.Feather21Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_68 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_68.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_68.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_68, -0.7853982F, 0.0F, 0.0F);
    this.Feather31B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather31B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather31B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather31B, 0.0F, -0.83164936F, 0.0F);
    this.HeadBLup = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadBLup.setRotationPoint(22.75F, 0.0F, 39.27F);
    this.HeadBLup.addBox(0.0F, 0.0F, 0.0F, 84, 60, 187, 0.0F);
    setRotateAngle(this.HeadBLup, 0.0F, 0.48729593F, 0.0F);
    this.FeatherIdcB_125 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_125.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_125.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_125, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcP1_58 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_58.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_58.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_58, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_23 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_23.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_23.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_23, 0.0F, -0.83164936F, 0.0F);
    this.Feather51B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather51B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather51B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather51B, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcP1_4 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_4.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_4.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_4, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_35 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_35.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_35.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_35, 0.0F, -0.83164936F, 0.0F);
    this.EyebrowRB = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowRB.setRotationPoint(10.0F, 15.0F, -8.0F);
    this.EyebrowRB.addBox(0.0F, 0.0F, 0.0F, 48, 8, 8, 0.0F);
    setRotateAngle(this.EyebrowRB, 0.0F, 0.0F, 0.16336282F);
    this.FeatherIdcBb_18 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_18.setRotationPoint(0.0F, 161.0F, 64.0F);
    this.FeatherIdcBb_18.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_30 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_30.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_30.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_30, 0.0F, 0.50265485F, 0.0F);
    this.Feather59P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather59P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather59P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather59P1, 0.0F, 0.50265485F, 0.0F);
    this.MoustacheRP2 = new ModelRenderer((ModelBase)this, 346, 584);
    this.MoustacheRP2.setRotationPoint(-22.7F, -10.2F, 0.0F);
    this.MoustacheRP2.addBox(0.0F, 0.0F, 0.0F, 28, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheRP2, 0.0F, 0.0F, 0.39584067F);
    this.Feather49B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather49B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather49B.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.Feather49B, 0.0F, 0.83164936F, -0.96342176F);
    this.FeatherIdcTip_51 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_51.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_51.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_51, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_107 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_107.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_107.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_107, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcB_70 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_70.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_70.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_70, 0.0F, -0.83164936F, 0.0F);
    this.EyeRL = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyeRL.setRotationPoint(49.0F, 24.0F, -5.0F);
    this.EyeRL.addBox(0.0F, 0.0F, 0.0F, 6, 42, 5, 0.0F);
    this.FeatherIdcBb_94 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_94.setRotationPoint(0.0F, 156.0F, -24.0F);
    this.FeatherIdcBb_94.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_121 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_121.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_121.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_121, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_31 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_31.setRotationPoint(0.0F, 124.0F, 172.0F);
    this.FeatherIdcBb_31.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_73 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_73.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_73.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_73, -0.7853982F, 0.0F, 0.0F);
    this.Feather50Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather50Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather50Tip.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.Feather50Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_84 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_84.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_84.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.FeatherIdcTip_84, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_39 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_39.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_39.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_39, -0.7853982F, 0.0F, 0.0F);
    this.Feather20Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather20Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather20Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather20Tip, -0.7853982F, 0.0F, 0.0F);
    this.MoustacheLP3 = new ModelRenderer((ModelBase)this, 424, 684);
    this.MoustacheLP3.setRotationPoint(-27.0F, 7.7F, 0.0F);
    this.MoustacheLP3.addBox(0.0F, 0.0F, 0.0F, 28, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheLP3, 0.0F, 0.0F, -0.27646014F);
    this.FeatherIdcB_27 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_27.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_27.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_27, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcBb_88 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_88.setRotationPoint(174.9F, 2.0F, 183.1F);
    this.FeatherIdcBb_88.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_56 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_56.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_56.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_56, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_4 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_4.setRotationPoint(0.0F, 156.0F, -24.0F);
    this.FeatherIdcBb_4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.EyeBL = new ModelRenderer((ModelBase)this, 1304, 100);
    this.EyeBL.setRotationPoint(84.0F, 30.1F, -2.0F);
    this.EyeBL.addBox(0.0F, 0.0F, 0.0F, 30, 30, 2, 0.0F);
    this.FeatherIdcTip_53 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_53.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_53.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_53, -0.7853982F, 0.0F, 0.0F);
    this.NostrilRLSPBot = new ModelRenderer((ModelBase)this, 23, 640);
    this.NostrilRLSPBot.setRotationPoint(3.4F, 32.6F, 0.0F);
    this.NostrilRLSPBot.addBox(0.0F, 0.0F, 0.0F, 7, 4, 6, 0.0F);
    setRotateAngle(this.NostrilRLSPBot, 0.0F, 0.0F, -0.8545132F);
    this.FeatherIdcB_61 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_61.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_61.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_61, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_93 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_93.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_93.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.FeatherIdcB_93, 0.0F, 0.83164936F, -0.96342176F);
    this.Feather46B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather46B.setRotationPoint(27.0F, -6.0F, -6.0F);
    this.Feather46B.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.Feather46B, 0.0F, -0.83164936F, 0.96342176F);
    this.Feather8Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather8Bb.setRotationPoint(0.0F, 77.0F, 53.0F);
    this.Feather8Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather38P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather38P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather38P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather38P1, 0.0F, -0.50265485F, 0.0F);
    this.Feather12P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather12P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather12P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather12P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_94 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_94.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_94.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.FeatherIdcB_94, 0.0F, 0.83164936F, -0.96342176F);
    this.FeatherIdcB_82 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_82.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_82.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_82, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_84 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_84.setRotationPoint(27.0F, -6.0F, -6.0F);
    this.FeatherIdcB_84.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.FeatherIdcB_84, 0.0F, -0.83164936F, 0.96342176F);
    this.Feather14P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather14P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather14P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather14P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcTip_69 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_69.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_69.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_69, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_88 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_88.setRotationPoint(27.0F, -6.0F, -6.0F);
    this.FeatherIdcB_88.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.FeatherIdcB_88, 0.0F, -0.83164936F, 0.96342176F);
    this.MoustacheLP4 = new ModelRenderer((ModelBase)this, 507, 684);
    this.MoustacheLP4.setRotationPoint(-15.0F, 0.0F, 7.8F);
    this.MoustacheLP4.addBox(0.0F, 0.0F, 0.0F, 17, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheLP4, 0.0F, 0.47752208F, 0.0F);
    this.Feather32P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather32P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather32P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather32P1, 0.0F, 0.50265485F, 0.0F);
    this.EyeLBot = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyeLBot.setRotationPoint(78.0F, 60.0F, -5.0F);
    this.EyeLBot.addBox(0.0F, 0.0F, 0.0F, 42, 6, 5, 0.0F);
    this.FeatherIdcB_19 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_19.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_19.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_19, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_73 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_73.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_73.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_73, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_35 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_35.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_35.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_35, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_81 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_81.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_81.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_81, 0.0F, -0.83164936F, 0.0F);
    this.Feather9Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather9Bb.setRotationPoint(0.0F, 117.0F, 69.0F);
    this.Feather9Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather50P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather50P1.setRotationPoint(1.9F, 0.0F, 13.8F);
    this.Feather50P1.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.Feather50P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcB_77 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_77.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_77.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_77, 0.0F, -0.83164936F, 0.0F);
    this.MoustacheRP5 = new ModelRenderer((ModelBase)this, 569, 584);
    this.MoustacheRP5.setRotationPoint(-25.4F, 11.76F, 0.0F);
    this.MoustacheRP5.addBox(0.0F, 0.0F, 0.0F, 28, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheRP5, 0.0F, 0.0F, -0.43353978F);
    this.FeatherIdcP1_17 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_17.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_17.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_17, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_101 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_101.setRotationPoint(0.0F, 159.0F, 15.0F);
    this.FeatherIdcBb_101.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_128 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_128.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_128.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_128, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcP1_6 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_6.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_6.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_6, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_124 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_124.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_124.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_124, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_100 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_100.setRotationPoint(0.0F, 124.0F, 24.0F);
    this.FeatherIdcBb_100.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_108 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_108.setRotationPoint(0.0F, 161.0F, 64.0F);
    this.FeatherIdcBb_108.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_80 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_80.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_80.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_80, -0.7853982F, 0.0F, 0.0F);
    this.HeadBLupSP3 = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadBLupSP3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.HeadBLupSP3.addBox(0.0F, 0.0F, 0.0F, 27, 31, 187, 0.0F);
    setRotateAngle(this.HeadBLupSP3, 0.0F, 0.0F, -1.2817698F);
    this.FeatherIdcB_101 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_101.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_101.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_101, 0.0F, -1.1143928F, 1.5707964F);
    this.Feather57Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather57Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather57Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather57Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_11 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_11.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_11.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_11, 0.0F, 0.50265485F, 0.0F);
    this.Feather1Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather1Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather1Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather1Tip, -0.7853982F, 0.0F, 0.0F);
    this.Feather37Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather37Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather37Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather37Tip, -0.7853982F, 0.0F, 0.0F);
    this.EyebrowLP7 = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowLP7.setRotationPoint(-21.7F, 7.65F, 0.0F);
    this.EyebrowLP7.addBox(0.0F, 0.0F, 0.0F, 23, 8, 8, 0.0F);
    setRotateAngle(this.EyebrowLP7, 0.0F, 0.0F, -0.33929202F);
    this.EyebrowRP4 = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowRP4.setRotationPoint(-22.1F, 4.4F, 0.0F);
    this.EyebrowRP4.addBox(0.0F, 0.0F, 0.0F, 23, 8, 8, 0.0F);
    setRotateAngle(this.EyebrowRP4, 0.0F, 0.0F, -0.18849556F);
    this.FeatherIdcBb_40 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_40.setRotationPoint(0.0F, 163.0F, 214.0F);
    this.FeatherIdcBb_40.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather54Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather54Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather54Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather54Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_49 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_49.setRotationPoint(234.0F, 0.0F, 14.0F);
    this.FeatherIdcBb_49.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_116 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_116.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_116.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_116, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcBb_55 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_55.setRotationPoint(129.0F, 2.0F, -62.0F);
    this.FeatherIdcBb_55.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather15Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather15Bb.setRotationPoint(262.1F, 37.0F, 18.0F);
    this.Feather15Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_27 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_27.setRotationPoint(0.0F, 236.0F, 117.0F);
    this.FeatherIdcBb_27.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.MoustacheRP3 = new ModelRenderer((ModelBase)this, 424, 584);
    this.MoustacheRP3.setRotationPoint(-27.0F, 7.7F, 0.0F);
    this.MoustacheRP3.addBox(0.0F, 0.0F, 0.0F, 28, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheRP3, 0.0F, 0.0F, -0.27646014F);
    this.FeatherIdcBb_80 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_80.setRotationPoint(175.0F, 2.0F, 129.1F);
    this.FeatherIdcBb_80.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_107 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_107.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_107.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_107, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_70 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_70.setRotationPoint(79.0F, 2.0F, 65.1F);
    this.FeatherIdcBb_70.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather34Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather34Bb.setRotationPoint(0.0F, 46.0F, 15.0F);
    this.Feather34Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_56 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_56.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_56.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_56, 0.0F, 0.50265485F, 0.0F);
    this.Feather24B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather24B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather24B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather24B, 0.0F, 0.83164936F, 0.0F);
    this.FeatherIdcBb_57 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_57.setRotationPoint(225.0F, 2.0F, -62.0F);
    this.FeatherIdcBb_57.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_86 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_86.setRotationPoint(79.0F, 2.0F, 183.1F);
    this.FeatherIdcBb_86.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_107 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_107.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_107.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_107, -0.7853982F, 0.0F, 0.0F);
    this.Feather24Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather24Bb.setRotationPoint(262.1F, 72.0F, 113.0F);
    this.Feather24Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_7 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_7.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_7.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_7, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcBb_92 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_92.setRotationPoint(0.0F, 79.9F, -47.9F);
    this.FeatherIdcBb_92.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_1.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_1.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_1, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_48 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_48.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_48.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_48, 0.0F, 0.50265485F, 0.0F);
    this.Feather38Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather38Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather38Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather38Tip, -0.7853982F, 0.0F, 0.0F);
    this.Feather1Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather1Bb.setRotationPoint(26.0F, -20.0F, 27.0F);
    this.Feather1Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_5 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_5.setRotationPoint(0.0F, 197.0F, -30.0F);
    this.FeatherIdcBb_5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_99 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_99.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_99.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_99, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcBb_112 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_112.setRotationPoint(0.0F, 41.0F, 90.0F);
    this.FeatherIdcBb_112.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_64 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_64.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_64.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_64, 0.0F, -0.83164936F, 0.0F);
    this.Feather39Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather39Bb.setRotationPoint(96.0F, 44.0F, -8.0F);
    this.Feather39Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_96 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_96.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_96.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_96, -0.7853982F, 0.0F, 0.0F);
    this.Feather25P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather25P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather25P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather25P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcTip_79 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_79.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_79.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_79, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_16 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_16.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_16.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_16, -0.7853982F, 0.0F, 0.0F);
    this.Feather23Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather23Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather23Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather23Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_6 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_6.setRotationPoint(0.0F, 235.0F, -24.0F);
    this.FeatherIdcBb_6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_110 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_110.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_110.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_110, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_64 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_64.setRotationPoint(177.0F, 2.0F, 5.1F);
    this.FeatherIdcBb_64.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_29 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_29.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_29.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_29, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_16 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_16.setRotationPoint(0.0F, 124.0F, 74.0F);
    this.FeatherIdcBb_16.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.HeadBupSPbackB = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadBupSPbackB.setRotationPoint(25.0F, -28.4F, 43.0F);
    this.HeadBupSPbackB.addBox(0.0F, 0.0F, 0.0F, 47, 30, 188, 0.0F);
    this.Feather27P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather27P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather27P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather27P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_108 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_108.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_108.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_108, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_31 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_31.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_31.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_31, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcTip_90 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_90.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_90.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.FeatherIdcTip_90, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_95 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_95.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_95.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.FeatherIdcTip_95, -0.7853982F, 0.0F, 0.0F);
    this.Feather16Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather16Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather16Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather16Tip, -0.7853982F, 0.0F, 0.0F);
    this.Feather27Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather27Bb.setRotationPoint(22.0F, -7.0F, 126.0F);
    this.Feather27Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather56Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather56Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather56Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather56Tip, -0.7853982F, 0.0F, 0.0F);
    this.Feather58Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather58Bb.setRotationPoint(106.0F, 0.0F, 84.0F);
    this.Feather58Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_122 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_122.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_122.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_122, 0.0F, -1.1143928F, 1.5707964F);
    this.Feather21Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather21Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather21Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather21Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_46 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_46.setRotationPoint(0.0F, 0.0F, 155.0F);
    this.FeatherIdcBb_46.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_89 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_89.setRotationPoint(226.0F, 2.0F, 183.1F);
    this.FeatherIdcBb_89.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_60 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_60.setRotationPoint(177.0F, 2.0F, -26.0F);
    this.FeatherIdcBb_60.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_65 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_65.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_65.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_65, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_76 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_76.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_76.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_76, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_15 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_15.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_15.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_15, -0.7853982F, 0.0F, 0.0F);
    this.Feather3Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather3Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather3Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather3Tip, -0.7853982F, 0.0F, 0.0F);
    this.EyeLT = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyeLT.setRotationPoint(78.0F, 24.0F, -5.0F);
    this.EyeLT.addBox(0.0F, 0.0F, 0.0F, 42, 6, 6, 0.0F);
    this.FeatherIdcB_98 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_98.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_98.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_98, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcP1_8 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_8.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_8.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_8, 0.0F, 0.50265485F, 0.0F);
    this.Feather50Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather50Bb.setRotationPoint(61.0F, 8.0F, 103.0F);
    this.Feather50Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_37 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_37.setRotationPoint(0.0F, 36.0F, 191.0F);
    this.FeatherIdcBb_37.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_83 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_83.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_83.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_83, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_51 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_51.setRotationPoint(234.0F, 0.0F, 110.0F);
    this.FeatherIdcBb_51.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_26 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_26.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_26.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_26, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_103 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_103.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_103.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_103, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_74 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_74.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_74.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_74, 0.0F, -0.83164936F, 0.0F);
    this.Feather26P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather26P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather26P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather26P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcB_3 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_3.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_3, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcTip_101 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_101.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_101.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_101, -0.7853982F, 0.0F, 0.0F);
    this.Feather10Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather10Bb.setRotationPoint(0.0F, 0.0F, 107.0F);
    this.Feather10Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_113 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_113.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_113.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_113, 0.0F, -1.1143928F, 1.5707964F);
    this.Feather37B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather37B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather37B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather37B, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_69 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_69.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_69.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_69, 0.0F, -0.83164936F, 0.0F);
    this.Feather58P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather58P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather58P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather58P1, 0.0F, 0.50265485F, 0.0F);
    this.Feather11Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather11Bb.setRotationPoint(0.0F, 42.0F, 116.9F);
    this.Feather11Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather2B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather2B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather2B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather2B, 0.0F, -0.83164936F, 0.62831855F);
    this.Feather52Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather52Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather52Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather52Tip, -0.7853982F, 0.0F, 0.0F);
    this.EyebrowLBSP = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowLBSP.setRotationPoint(44.0F, 2.0F, 0.0F);
    this.EyebrowLBSP.addBox(0.0F, 0.0F, 0.0F, 7, 7, 8, 0.0F);
    setRotateAngle(this.EyebrowLBSP, 0.0F, 0.0F, -0.56548667F);
    this.FeatherIdcBb_17 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_17.setRotationPoint(0.0F, 80.0F, 51.0F);
    this.FeatherIdcBb_17.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_63 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_63.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_63.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_63, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_113 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_113.setRotationPoint(0.0F, 79.0F, 99.0F);
    this.FeatherIdcBb_113.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_42 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_42.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_42.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_42, 0.0F, 0.50265485F, 0.0F);
    this.Feather4Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather4Bb.setRotationPoint(0.0F, 72.0F, 0.0F);
    this.Feather4Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_121 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_121.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_121.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_121, 0.0F, -1.1143928F, 1.5707964F);
    this.NostrilRL = new ModelRenderer((ModelBase)this, 20, 600);
    this.NostrilRL.setRotationPoint(30.6F, 9.75F, -4.0F);
    this.NostrilRL.addBox(0.0F, 0.0F, 0.0F, 11, 30, 4, 0.0F);
    this.FeatherIdcB_90 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_90.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_90.addBox(0.0F, 0.0F, 0.0F, 15, 31, 21, 0.0F);
    setRotateAngle(this.FeatherIdcB_90, 0.0F, 0.83164936F, -0.96342176F);
    this.FeatherIdcP1_100 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_100.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_100.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_100, 0.0F, 0.50265485F, 0.0F);
    this.Feather56P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather56P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather56P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather56P1, 0.0F, 0.50265485F, 0.0F);
    this.Feather4B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather4B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather4B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather4B, 0.0F, -0.83164936F, 0.0F);
    this.Feather46Bb = new ModelRenderer((ModelBase)this, 0, -1);
    this.Feather46Bb.setRotationPoint(0.0F, 5.0F, 52.0F);
    this.Feather46Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.EyeRBot = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyeRBot.setRotationPoint(13.0F, 60.0F, -5.0F);
    this.EyeRBot.addBox(0.0F, 0.0F, 0.0F, 42, 6, 5, 0.0F);
    this.FeatherIdcB_34 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_34.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_34.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_34, 0.0F, -0.83164936F, 0.0F);
    this.Feather15Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather15Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather15Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather15Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_20 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_20.setRotationPoint(0.0F, 237.0F, 64.0F);
    this.FeatherIdcBb_20.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_28 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_28.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_28.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_28, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_61 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_61.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_61.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_61, -0.7853982F, 0.0F, 0.0F);
    this.Feather47Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather47Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather47Tip.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.Feather47Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_12 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_12.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_12.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_12, 0.0F, 0.50265485F, 0.0F);
    this.MoustacheRP9 = new ModelRenderer((ModelBase)this, 852, 584);
    this.MoustacheRP9.setRotationPoint(-27.1F, 6.96F, 0.0F);
    this.MoustacheRP9.addBox(0.0F, 0.0F, 0.0F, 28, 8, 8, 0.0F);
    setRotateAngle(this.MoustacheRP9, 0.0F, 0.0F, -0.25132743F);
    this.MoustacheLB = new ModelRenderer((ModelBase)this, 140, 684);
    this.MoustacheLB.setRotationPoint(112.6F, 14.2F, -4.0F);
    this.MoustacheLB.addBox(0.0F, 0.0F, 0.0F, 52, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheLB, 3.1415927F, 3.1415927F, 0.0F);
    this.ToothBot1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothBot1.setRotationPoint(64.0F, 0.0F, 135.0F);
    this.ToothBot1.addBox(0.0F, 0.0F, 0.0F, 20, 31, 31, 0.0F);
    setRotateAngle(this.ToothBot1, 0.7853982F, 0.0F, 0.0F);
    this.Feather45P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather45P1.setRotationPoint(0.0F, 0.0F, 21.0F);
    this.Feather45P1.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.Feather45P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_24 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_24.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_24.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_24, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_103 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_103.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_103.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_103, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_78 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_78.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_78.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_78, 0.0F, -0.83164936F, 0.0F);
    this.Feather39Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather39Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather39Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather39Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_37 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_37.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_37.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_37, 0.0F, -0.83164936F, 0.0F);
    this.MoustacheRP6 = new ModelRenderer((ModelBase)this, 645, 584);
    this.MoustacheRP6.setRotationPoint(-21.0F, -5.6F, 0.0F);
    this.MoustacheRP6.addBox(0.0F, 0.0F, 0.0F, 24, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheRP6, 0.0F, 0.0F, 0.25132743F);
    this.FeatherIdcP1_115 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_115.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_115.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_115, 0.0F, 0.50265485F, 0.0F);
    this.Feather28P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather28P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather28P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather28P1, 0.0F, -0.50265485F, 0.0F);
    this.NostrilRBot = new ModelRenderer((ModelBase)this, 50, 640);
    this.NostrilRBot.setRotationPoint(6.0F, 37.0F, -4.0F);
    this.NostrilRBot.addBox(0.0F, 0.0F, 0.0F, 31, 8, 4, 0.0F);
    this.Feather27B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather27B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather27B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather27B, 0.0F, -0.83164936F, 0.62831855F);
    this.Feather4Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather4Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather4Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather4Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_99 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_99.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_99.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_99, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_45 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_45.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_45.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_45, -0.7853982F, 0.0F, 0.0F);
    this.Feather6B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather6B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather6B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather6B, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_67 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_67.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_67.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_67, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_68 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_68.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_68.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_68, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_101 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_101.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_101.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_101, 0.0F, 0.50265485F, 0.0F);
    this.HeadSPUpB = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadSPUpB.setRotationPoint(-71.5F, 0.0F, 142.5F);
    this.HeadSPUpB.addBox(0.0F, 0.0F, 0.0F, 272, 120, 45, 0.0F);
    this.FeatherIdcB_5 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_5.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_5.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_5, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcBb_90 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_90.setRotationPoint(0.0F, 0.0F, -46.0F);
    this.FeatherIdcBb_90.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_45 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_45.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_45.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_45, 0.0F, 0.50265485F, 0.0F);
    this.Feather18P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather18P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather18P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather18P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcTip_60 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_60.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_60.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_60, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_37 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_37.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_37.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_37, 0.0F, 0.50265485F, 0.0F);
    this.Feather20P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather20P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather20P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather20P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcP1_127 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_127.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_127.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_127, 0.0F, 0.50265485F, 0.0F);
    this.HeadBupSPbackBR = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadBupSPbackBR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.HeadBupSPbackBR.addBox(0.0F, 0.0F, 0.0F, 43, 30, 159, 0.0F);
    setRotateAngle(this.HeadBupSPbackBR, 0.0F, -0.42097342F, 0.0F);
    this.Feather4P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather4P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather4P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather4P1, 0.0F, 0.50265485F, 0.0F);
    this.Feather38B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather38B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather38B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather38B, 0.0F, 0.83164936F, 0.0F);
    this.FeatherIdcTip_54 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_54.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_54.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_54, -0.7853982F, 0.0F, 0.0F);
    this.Feather1B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather1B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather1B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather1B, 0.0F, -0.83164936F, 0.62831855F);
    this.Feather10Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather10Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather10Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather10Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_114 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_114.setRotationPoint(0.0F, 124.0F, 124.0F);
    this.FeatherIdcBb_114.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather59B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather59B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather59B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather59B, 0.0F, -1.1143928F, 1.5707964F);
    this.Feather13P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather13P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather13P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather13P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_97 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_97.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_97.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_97, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_27 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_27.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_27.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_27, -0.7853982F, 0.0F, 0.0F);
    this.Feather18Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather18Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather18Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather18Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_11 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_11.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_11.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_11, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_27 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_27.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_27.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_27, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_96 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_96.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_96.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_96, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcTip_120 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_120.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_120.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_120, -0.7853982F, 0.0F, 0.0F);
    this.Feather3Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather3Bb.setRotationPoint(0.0F, 40.0F, 15.0F);
    this.Feather3Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.EyebrowRP6 = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowRP6.setRotationPoint(-19.3F, -6.7F, 0.0F);
    this.EyebrowRP6.addBox(0.0F, 0.0F, 0.0F, 23, 8, 8, 0.0F);
    setRotateAngle(this.EyebrowRP6, 0.0F, 0.0F, 0.31415927F);
    this.FeatherIdcB_4 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_4.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_4, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcP1_82 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_82.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_82.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_82, 0.0F, 0.50265485F, 0.0F);
    this.Feather29P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather29P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather29P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather29P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcB_62 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_62.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_62.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_62, 0.0F, -0.83164936F, 0.0F);
    this.MoustacheRP7 = new ModelRenderer((ModelBase)this, 709, 584);
    this.MoustacheRP7.setRotationPoint(-21.72F, 0.0F, 10.23F);
    this.MoustacheRP7.addBox(0.0F, 0.0F, 0.0F, 24, 9, 9, 0.0F);
    setRotateAngle(this.MoustacheRP7, 0.0F, 0.43982297F, 0.0F);
    this.FeatherIdcBb_115 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_115.setRotationPoint(0.0F, 161.0F, 117.0F);
    this.FeatherIdcBb_115.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather5P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather5P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather5P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather5P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb.setRotationPoint(0.0F, 0.0F, -46.0F);
    this.FeatherIdcBb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather53Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather53Bb.setRotationPoint(33.0F, 0.0F, 50.0F);
    this.Feather53Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_20 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_20.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_20.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_20, -0.7853982F, 0.0F, 0.0F);
    this.HeadSPF = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadSPF.setRotationPoint(-16.1F, 0.0F, -9.4F);
    this.HeadSPF.addBox(0.0F, 0.0F, 0.0F, 133, 139, 95, 0.0F);
    this.FeatherIdcB_120 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_120.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_120.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_120, 0.0F, -1.1143928F, 1.5707964F);
    this.Feather12B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather12B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather12B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather12B, 0.0F, -0.83164936F, 0.0F);
    this.Feather39P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather39P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather39P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather39P1, 0.0F, -0.50265485F, 0.0F);
    this.EyeRT = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyeRT.setRotationPoint(13.0F, 24.0F, -5.0F);
    this.EyeRT.addBox(0.0F, 0.0F, 0.0F, 42, 6, 6, 0.0F);
    this.FeatherIdcBb_38 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_38.setRotationPoint(0.0F, 123.0F, 222.0F);
    this.FeatherIdcBb_38.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather28Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather28Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather28Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather28Tip, -0.7853982F, 0.0F, 0.0F);
    this.Feather35Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather35Bb.setRotationPoint(0.0F, 0.0F, 102.0F);
    this.Feather35Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_39 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_39.setRotationPoint(0.0F, 199.0F, 222.0F);
    this.FeatherIdcBb_39.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather35Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather35Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather35Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather35Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_22 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_22.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_22.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_22, -0.7853982F, 0.0F, 0.0F);
    this.NostrilLBot = new ModelRenderer((ModelBase)this, 51, 740);
    this.NostrilLBot.setRotationPoint(60.6F, 37.2F, -4.0F);
    this.NostrilLBot.addBox(0.0F, 0.0F, 0.0F, 31, 8, 4, 0.0F);
    this.FeatherIdcB_112 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_112.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_112.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_112, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcP1_32 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_32.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_32.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_32, 0.0F, 0.50265485F, 0.0F);
    this.Feather52Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather52Bb.setRotationPoint(109.0F, 1.0F, 12.0F);
    this.Feather52Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather34B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather34B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather34B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather34B, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_80 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_80.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_80.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_80, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcB_119 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_119.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_119.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_119, 0.0F, -1.1143928F, 1.5707964F);
    this.FeatherIdcP1_52 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_52.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_52.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_52, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_124 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_124.setRotationPoint(0.0F, 240.0F, 165.0F);
    this.FeatherIdcBb_124.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.BodyP2 = new ModelRenderer((ModelBase)this, 0, -1);
    this.BodyP2.mirror = true;
    this.BodyP2.setRotationPoint(0.0F, 0.0F, 290.0F);
    this.BodyP2.addBox(0.0F, 0.0F, 0.0F, 272, 278, 297, 0.0F);
    this.FeatherIdcP1_108 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_108.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_108.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_108, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_117 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_117.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_117.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_117, 0.0F, 0.50265485F, 0.0F);
    this.Feather30Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather30Bb.setRotationPoint(246.1F, -6.0F, 135.0F);
    this.Feather30Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_47 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_47.setRotationPoint(0.0F, 0.0F, 205.0F);
    this.FeatherIdcBb_47.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_41 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_41.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_41.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_41, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_33 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_33.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_33.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_33, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_105 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_105.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_105.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_105, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_130 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_130.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_130.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_130, 0.0F, 0.50265485F, 0.0F);
    this.EyebrowRP3 = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowRP3.setRotationPoint(-19.32F, 0.0F, 12.43F);
    this.EyebrowRP3.addBox(0.0F, 0.0F, 0.0F, 23, 8, 8, 0.0F);
    setRotateAngle(this.EyebrowRP3, 0.0F, 0.57176983F, 0.0F);
    this.Feather49P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather49P1.setRotationPoint(1.9F, 0.0F, 13.8F);
    this.Feather49P1.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.Feather49P1, 0.0F, -0.50265485F, 0.0F);
    this.FeatherIdcBb_41 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_41.setRotationPoint(0.0F, 240.0F, 214.0F);
    this.FeatherIdcBb_41.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_113 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_113.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_113.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_113, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_92 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_92.setRotationPoint(1.9F, 0.0F, 13.8F);
    this.FeatherIdcP1_92.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_92, 0.0F, -0.50265485F, 0.0F);
    this.Feather59Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather59Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather59Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather59Tip, -0.7853982F, 0.0F, 0.0F);
    this.NostrilLR = new ModelRenderer((ModelBase)this, 20, 700);
    this.NostrilLR.setRotationPoint(56.0F, 10.0F, -4.0F);
    this.NostrilLR.addBox(0.0F, 0.0F, 0.0F, 11, 30, 4, 0.0F);
    this.HeadSPRUp = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadSPRUp.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.HeadSPRUp.addBox(0.0F, 0.0F, 0.0F, 97, 140, 159, 0.0F);
    setRotateAngle(this.HeadSPRUp, 0.0F, -0.46495572F, 0.0F);
    this.EyebrowRBSP = new ModelRenderer((ModelBase)this, 0, 0);
    this.EyebrowRBSP.setRotationPoint(48.0F, 0.0F, 0.0F);
    this.EyebrowRBSP.addBox(0.0F, 0.0F, 0.0F, 7, 7, 8, 0.0F);
    setRotateAngle(this.EyebrowRBSP, 0.0F, 0.0F, 0.56548667F);
    this.FeatherIdcTip_130 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_130.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_130.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_130, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcTip_49 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_49.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_49.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_49, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_128 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_128.setRotationPoint(0.0F, 123.0F, 222.0F);
    this.FeatherIdcBb_128.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_8 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_8.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_8.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_8, 0.0F, -0.83164936F, 0.0F);
    this.Feather47P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather47P1.setRotationPoint(0.0F, 0.0F, 21.0F);
    this.Feather47P1.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.Feather47P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_71 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_71.setRotationPoint(127.0F, 2.0F, 65.1F);
    this.FeatherIdcBb_71.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_74 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_74.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_74.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_74, 0.0F, 0.50265485F, 0.0F);
    this.Feather36B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather36B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather36B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather36B, 0.0F, -0.83164936F, 0.0F);
    this.Feather48P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather48P1.setRotationPoint(1.9F, 0.0F, 13.8F);
    this.Feather48P1.addBox(0.0F, 0.0F, 0.0F, 15, 31, 45, 0.0F);
    setRotateAngle(this.Feather48P1, 0.0F, -0.50265485F, 0.0F);
    this.Feather11P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather11P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather11P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather11P1, 0.0F, 0.50265485F, 0.0F);
    this.Feather16B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather16B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather16B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather16B, 0.0F, 0.83164936F, 0.0F);
    this.FeatherIdcP1_114 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_114.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_114.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_114, 0.0F, 0.50265485F, 0.0F);
    this.Feather12Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather12Bb.setRotationPoint(0.0F, 79.0F, 107.0F);
    this.Feather12Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.ToothT5 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothT5.setRotationPoint(61.0F, 49.0F, 0.0F);
    this.ToothT5.addBox(0.0F, 0.0F, 0.0F, 16, 16, 9, 0.0F);
    setRotateAngle(this.ToothT5, 0.0F, 0.0F, 0.7853982F);
    this.FeatherIdcTip_25 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_25.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_25.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_25, -0.7853982F, 0.0F, 0.0F);
    this.Feather57P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather57P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather57P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather57P1, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcBb_42 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_42.setRotationPoint(0.0F, 0.0F, -40.0F);
    this.FeatherIdcBb_42.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.ToothBot7 = new ModelRenderer((ModelBase)this, 0, 0);
    this.ToothBot7.setRotationPoint(34.4F, -11.1F, 0.0F);
    this.ToothBot7.addBox(0.0F, 0.0F, 0.0F, 16, 16, 9, 0.0F);
    setRotateAngle(this.ToothBot7, 0.0F, 0.0F, 0.7853982F);
    this.Feather32Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather32Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather32Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather32Tip, -0.7853982F, 0.0F, 0.0F);
    this.Feather55P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather55P1.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.Feather55P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather55P1, 0.0F, 0.50265485F, 0.0F);
    this.HeadSPUp = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadSPUp.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.HeadSPUp.addBox(0.0F, 0.0F, 0.0F, 133, 120, 187, 0.0F);
    setRotateAngle(this.HeadSPUp, 0.47944194F, 0.0F, 0.0F);
    this.FeatherIdcBb_68 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_68.setRotationPoint(127.0F, 2.0F, 36.1F);
    this.FeatherIdcBb_68.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather54Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather54Bb.setRotationPoint(84.0F, 0.0F, 50.0F);
    this.Feather54Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcP1_7 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_7.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_7.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_7, 0.0F, 0.50265485F, 0.0F);
    this.FeatherIdcP1_67 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_67.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_67.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_67, 0.0F, 0.50265485F, 0.0F);
    this.MoustacheRP10 = new ModelRenderer((ModelBase)this, 925, 584);
    this.MoustacheRP10.setRotationPoint(-26.0F, 10.5F, 0.0F);
    this.MoustacheRP10.addBox(0.0F, 0.0F, 0.0F, 28, 8, 8, 0.0F);
    setRotateAngle(this.MoustacheRP10, 0.0F, 0.0F, -0.37699112F);
    this.FeatherIdcBb_97 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_97.setRotationPoint(0.0F, 0.0F, 3.0F);
    this.FeatherIdcBb_97.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_5 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_5.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_5.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_5, -0.7853982F, 0.0F, 0.0F);
    this.Feather9B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather9B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather9B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather9B, 0.0F, -0.83164936F, 0.0F);
    this.Feather21B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather21B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather21B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather21B, 0.0F, 0.83164936F, 0.0F);
    this.FeatherIdcBb_93 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_93.setRotationPoint(0.0F, 124.0F, -30.0F);
    this.FeatherIdcBb_93.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather36Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather36Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather36Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather36Tip, -0.7853982F, 0.0F, 0.0F);
    this.Feather51Tip = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather51Tip.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.Feather51Tip.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.Feather51Tip, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcBb_15 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_15.setRotationPoint(0.0F, 41.0F, 42.0F);
    this.FeatherIdcBb_15.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_102 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_102.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_102.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_102, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcB_38 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_38.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_38.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_38, 0.0F, -0.83164936F, 0.0F);
    this.Feather13B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather13B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather13B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather13B, 0.0F, -0.83164936F, 0.0F);
    this.FeatherIdcBb_82 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_82.setRotationPoint(226.0F, 2.0F, 158.1F);
    this.FeatherIdcBb_82.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather7Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather7Bb.setRotationPoint(0.0F, 40.0F, 65.0F);
    this.Feather7Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_72 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_72.setRotationPoint(174.0F, 2.0F, 65.1F);
    this.FeatherIdcBb_72.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcBb_9 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_9.setRotationPoint(0.0F, 80.0F, 3.0F);
    this.FeatherIdcBb_9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcTip_8 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_8.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_8.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_8, -0.7853982F, 0.0F, 0.0F);
    this.FeatherIdcP1_77 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcP1_77.setRotationPoint(0.0F, 0.0F, 12.0F);
    this.FeatherIdcP1_77.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.FeatherIdcP1_77, 0.0F, 0.50265485F, 0.0F);
    this.Feather24P1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather24P1.setRotationPoint(1.9F, 0.0F, 4.8F);
    this.Feather24P1.addBox(0.0F, 0.0F, 0.0F, 15, 44, 45, 0.0F);
    setRotateAngle(this.Feather24P1, 0.0F, -0.50265485F, 0.0F);
    this.FangBL = new ModelRenderer((ModelBase)this, 0, 0);
    this.FangBL.setRotationPoint(74.0F, 56.0F, 0.0F);
    this.FangBL.addBox(0.0F, 0.0F, 0.0F, 11, 24, 11, 0.0F);
    setRotateAngle(this.FangBL, -0.12566371F, 0.0F, 0.0F);
    this.FeatherIdcTip_85 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_85.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_85.addBox(0.0F, 0.0F, 0.0F, 15, 22, 22, 0.0F);
    setRotateAngle(this.FeatherIdcTip_85, -0.7853982F, 0.0F, 0.0F);
    this.Feather42Bb = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather42Bb.setRotationPoint(82.0F, 0.0F, 101.0F);
    this.Feather42Bb.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FeatherIdcB_53 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcB_53.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FeatherIdcB_53.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.FeatherIdcB_53, 0.0F, -0.83164936F, 0.0F);
    this.HeadBRupSP1 = new ModelRenderer((ModelBase)this, 0, 0);
    this.HeadBRupSP1.setRotationPoint(18.3F, -20.7F, -2.3F);
    this.HeadBRupSP1.addBox(0.0F, 0.0F, 0.0F, 84, 27, 187, 0.0F);
    setRotateAngle(this.HeadBRupSP1, 0.0F, 0.0F, 0.7351327F);
    this.FeatherIdcBb_83 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcBb_83.setRotationPoint(175.0F, 2.0F, 158.1F);
    this.FeatherIdcBb_83.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Feather26B = new ModelRenderer((ModelBase)this, 0, 0);
    this.Feather26B.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Feather26B.addBox(0.0F, 0.0F, 0.0F, 15, 44, 12, 0.0F);
    setRotateAngle(this.Feather26B, 0.0F, -0.83164936F, 0.62831855F);
    this.FeatherIdcTip_128 = new ModelRenderer((ModelBase)this, 0, 0);
    this.FeatherIdcTip_128.setRotationPoint(0.0F, 0.0F, 45.0F);
    this.FeatherIdcTip_128.addBox(0.0F, 0.0F, 0.0F, 15, 31, 31, 0.0F);
    setRotateAngle(this.FeatherIdcTip_128, -0.7853982F, 0.0F, 0.0F);
    this.Lazyness101.addChild(this.FeatherIdcBb_125);
    this.FeatherIdcP1_70.addChild(this.FeatherIdcTip_70);
    this.Feather15Bb.addChild(this.Feather15B);
    this.FeatherIdcB_70.addChild(this.FeatherIdcP1_70);
    this.FeatherIdcP1_86.addChild(this.FeatherIdcTip_86);
    this.Feather7B.addChild(this.Feather7P1);
    this.BodyP1.addChild(this.FeatherIdcBb_66);
    this.FeatherIdcP1_125.addChild(this.FeatherIdcTip_125);
    this.FeatherIdcP1_129.addChild(this.FeatherIdcTip_129);
    this.HeadBRup.addChild(this.ToothT8);
    this.FeatherIdcP1_97.addChild(this.FeatherIdcTip_97);
    this.FeatherIdcB_25.addChild(this.FeatherIdcP1_25);
    this.FeatherIdcBb_75.addChild(this.FeatherIdcB_117);
    this.BodyP1.addChild(this.FeatherIdcBb_32);
    this.BodyP1.addChild(this.FeatherIdcBb_35);
    this.Feather19P1.addChild(this.Feather19Tip);
    this.HeadSPF.addChild(this.EyeRR);
    this.FeatherIdcP1_42.addChild(this.FeatherIdcTip_42);
    this.HeadBback.addChild(this.Feather19Bb);
    this.FeatherIdcB_131.addChild(this.FeatherIdcP1_131);
    this.FeatherIdcBb_116.addChild(this.FeatherIdcB_68);
    this.FeatherIdcB_104.addChild(this.FeatherIdcP1_104);
    this.FeatherIdcP1_19.addChild(this.FeatherIdcTip_19);
    this.BodyP1.addChild(this.FeatherIdcBb_19);
    this.BodyP1.addChild(this.FeatherIdcBb_34);
    this.FeatherIdcP1_62.addChild(this.FeatherIdcTip_62);
    this.FeatherIdcP1_75.addChild(this.FeatherIdcTip_75);
    this.BodyP1.addChild(this.FeatherIdcBb_25);
    this.Lazyness101.addChild(this.FeatherIdcBb_130);
    this.Lazyness101.addChild(this.FeatherIdcBb_102);
    this.BodyP1.addChild(this.FeatherIdcBb_77);
    this.FeatherIdcBb_28.addChild(this.FeatherIdcB_28);
    this.FeatherIdcBb_97.addChild(this.FeatherIdcB_49);
    this.HeadBUp.addChild(this.NostrilRT);
    this.FeatherIdcP1_50.addChild(this.FeatherIdcTip_50);
    this.FeatherIdcP1_124.addChild(this.FeatherIdcTip_124);
    this.FeatherIdcP1_12.addChild(this.FeatherIdcTip_12);
    this.FeatherIdcB_31.addChild(this.FeatherIdcP1_31);
    this.FeatherIdcP1_37.addChild(this.FeatherIdcTip_37);
    this.FeatherIdcBb_76.addChild(this.FeatherIdcB_118);
    this.FeatherIdcP1_100.addChild(this.FeatherIdcTip_100);
    this.FeatherIdcBb_127.addChild(this.FeatherIdcB_79);
    this.FeatherIdcBb_94.addChild(this.FeatherIdcB_46);
    this.FeatherIdcB_21.addChild(this.FeatherIdcP1_21);
    this.FeatherIdcBb_20.addChild(this.FeatherIdcB_20);
    this.FeatherIdcB_81.addChild(this.FeatherIdcP1_81);
    this.FeatherIdcBb_62.addChild(this.FeatherIdcB_104);
    this.Lazyness101.addChild(this.FeatherIdcBb_118);
    this.Feather30Bb.addChild(this.Feather30B);
    this.EyebrowLP3.addChild(this.EyebrowLP4);
    this.Feather25Bb.addChild(this.Feather25B);
    this.BodyP1.addChild(this.FeatherIdcBb_45);
    this.FeatherIdcP1_94.addChild(this.FeatherIdcTip_94);
    this.FeatherIdcB_38.addChild(this.FeatherIdcP1_38);
    this.Lazyness101.addChild(this.FeatherIdcBb_98);
    this.Feather55Bb.addChild(this.Feather55B);
    this.FeatherIdcB_15.addChild(this.FeatherIdcP1_15);
    this.FangP1L.addChild(this.FangLtip);
    this.FeatherIdcBb_84.addChild(this.FeatherIdcB_126);
    this.HeadSPUp.addChild(this.Feather51Bb);
    this.FeatherIdcB_51.addChild(this.FeatherIdcP1_51);
    this.BodyP1.addChild(this.FeatherIdcBb_24);
    this.BodyP1.addChild(this.FeatherIdcBb_74);
    this.FeatherIdcBb_123.addChild(this.FeatherIdcB_75);
    this.FeatherIdcP1_131.addChild(this.FeatherIdcTip_131);
    this.FeatherIdcB_3.addChild(this.FeatherIdcP1_3);
    this.FeatherIdcBb_14.addChild(this.FeatherIdcB_14);
    this.BodyP1.addChild(this.FeatherIdcBb_69);
    this.Feather29Bb.addChild(this.Feather29B);
    this.HeadBback.addChild(this.Feather2Bb);
    this.Feather9P1.addChild(this.Feather9Tip);
    this.HeadSPUp.addChild(this.Feather57Bb);
    this.Feather31P1.addChild(this.Feather31Tip);
    this.Feather6P1.addChild(this.Feather6Tip);
    this.HeadSP.addChild(this.HeadSPL);
    this.HeadSPUp.addChild(this.Feather59Bb);
    this.Feather2B.addChild(this.Feather2P1);
    this.FeatherIdcP1_24.addChild(this.FeatherIdcTip_24);
    this.FeatherIdcBb_39.addChild(this.FeatherIdcB_39);
    this.BodyP1.addChild(this.FeatherIdcBb_79);
    this.FeatherIdcB_91.addChild(this.FeatherIdcP1_91);
    this.FeatherIdcBb_105.addChild(this.FeatherIdcB_57);
    this.Feather35Bb.addChild(this.Feather35B);
    this.MoustacheLP6.addChild(this.MoustacheLP7);
    this.FeatherIdcBb_64.addChild(this.FeatherIdcB_106);
    this.HeadBLDo.addChild(this.ToothBot4);
    this.FeatherIdcB_69.addChild(this.FeatherIdcP1_69);
    this.FeatherIdcBb_73.addChild(this.FeatherIdcB_115);
    this.FeatherIdcP1_59.addChild(this.FeatherIdcTip_59);
    this.FeatherIdcP1_72.addChild(this.FeatherIdcTip_72);
    this.FeatherIdcP1_104.addChild(this.FeatherIdcTip_104);
    this.HeadBback.addChild(this.Feather4);
    this.Lazyness101.addChild(this.FeatherIdcBb_131);
    this.FeatherIdcB_33.addChild(this.FeatherIdcP1_33);
    this.FeatherIdcB_93.addChild(this.FeatherIdcP1_93);
    this.Feather17Bb.addChild(this.Feather17B);
    this.FeatherIdcBb_2.addChild(this.FeatherIdcB_2);
    this.HeadSPRUp.addChild(this.Feather33Bb);
    this.BodyP1.addChild(this.FeatherIdcBb_22);
    this.FeatherIdcBb_24.addChild(this.FeatherIdcB_24);
    this.FeatherIdcB_22.addChild(this.FeatherIdcP1_22);
    this.FeatherIdcBb_18.addChild(this.FeatherIdcB_18);
    this.FeatherIdcBb_47.addChild(this.FeatherIdcB_89);
    this.FeatherIdcB_79.addChild(this.FeatherIdcP1_79);
    this.Lazyness101.addChild(this.FeatherIdcBb_103);
    this.Feather54B.addChild(this.Feather54P1);
    this.HeadSPLUp.addChild(this.Feather44Bb);
    this.FeatherIdcP1_123.addChild(this.FeatherIdcTip_123);
    this.HeadSPLUp.addChild(this.Feather48Bb);
    this.FeatherIdcB_118.addChild(this.FeatherIdcP1_118);
    this.FeatherIdcB_122.addChild(this.FeatherIdcP1_122);
    this.EyebrowLB.addChild(this.EyebrowLP1);
    this.BodyP1.addChild(this.FeatherIdcBb_65);
    this.FeatherIdcBb_41.addChild(this.FeatherIdcB_41);
    this.BodyP1.addChild(this.FeatherIdcBb_76);
    this.BodyP1.addChild(this.FeatherIdcBb_26);
    this.FeatherIdcB_129.addChild(this.FeatherIdcP1_129);
    this.HeadBLup.addChild(this.ToothT1);
    this.Feather35B.addChild(this.Feather35P1);
    this.Feather31B.addChild(this.Feather31P1);
    this.BodyP1.addChild(this.FeatherIdcBb_54);
    this.FeatherIdcBb_124.addChild(this.FeatherIdcB_76);
    this.HeadSP.addChild(this.HeadSPR);
    this.FeatherIdcB_78.addChild(this.FeatherIdcP1_78);
    this.Feather33P1.addChild(this.Feather33Tip);
    this.NostrilLR.addChild(this.NostrilLRSPBot);
    this.FeatherIdcB_5.addChild(this.FeatherIdcP1_5);
    this.Feather11Bb.addChild(this.Feather11B);
    this.Feather33Bb.addChild(this.Feather33B);
    this.FeatherIdcBb_96.addChild(this.FeatherIdcB_48);
    this.FeatherIdcBb_120.addChild(this.FeatherIdcB_72);
    this.Feather8Bb.addChild(this.Feather8B);
    this.MoustacheRP7.addChild(this.MoustacheRP8);
    this.FeatherIdcBb_68.addChild(this.FeatherIdcB_110);
    this.HeadBLup.addChild(this.ToothT4);
    this.BodyP1.addChild(this.FeatherIdcBb_85);
    this.Feather43Bb.addChild(this.Feather43B);
    this.FeatherIdcB_86.addChild(this.FeatherIdcP1_86);
    this.FeatherIdcB_90.addChild(this.FeatherIdcP1_90);
    this.FeatherIdcP1_4.addChild(this.FeatherIdcTip_4);
    this.FeatherIdcBb_93.addChild(this.FeatherIdcB_45);
    this.FeatherIdcBb_67.addChild(this.FeatherIdcB_109);
    this.EyebrowLP5.addChild(this.EyebrowLP6);
    this.FeatherIdcBb_43.addChild(this.FeatherIdcB_85);
    this.HeadBRupSP1.addChild(this.HeadBRupSP2);
    this.FeatherIdcBb_22.addChild(this.FeatherIdcB_22);
    this.FeatherIdcBb_60.addChild(this.FeatherIdcB_102);
    this.HeadBRDo.addChild(this.ToothBot10);
    this.Feather41P1.addChild(this.Feather41Tip);
    this.FeatherIdcBb_13.addChild(this.FeatherIdcB_13);
    this.Feather7P1.addChild(this.Feather7Tip);
    this.FeatherIdcBb.addChild(this.FeatherIdcB);
    this.Feather11P1.addChild(this.Feather11Tip);
    this.HeadBUp.addChild(this.ToothT6);
    this.FangBR.addChild(this.FangP1R);
    this.FangP1R.addChild(this.FangRtip);
    this.Feather52B.addChild(this.Feather52P1);
    this.Lazyness101.addChild(this.FeatherIdcBb_123);
    this.BodyP1.addChild(this.FeatherIdcBb_2);
    this.FeatherIdcB_80.addChild(this.FeatherIdcP1_80);
    this.FeatherIdcBb_44.addChild(this.FeatherIdcB_86);
    this.Feather43B.addChild(this.Feather43P1);
    this.FeatherIdcBb_30.addChild(this.FeatherIdcB_30);
    this.HeadSPUp.addChild(this.Feather55Bb);
    this.FeatherIdcB_23.addChild(this.FeatherIdcP1_23);
    this.Feather22Bb.addChild(this.Feather22B);
    this.BodyP1.addChild(this.FeatherIdcBb_28);
    this.HeadBback.addChild(this.Feather13Bb);
    this.FeatherIdcB_113.addChild(this.FeatherIdcP1_113);
    this.FeatherIdcB_34.addChild(this.FeatherIdcP1_34);
    this.FeatherIdcB_47.addChild(this.FeatherIdcP1_47);
    this.HeadBback.addChild(this.Feather3);
    this.EyebrowLP1.addChild(this.EyebrowLP2);
    this.HeadBRup.addChild(this.ToothT10);
    this.HeadSPLUp.addChild(this.Feather49Bb);
    this.HeadBLup.addChild(this.ToothT3);
    this.HeadSPLUp.addChild(this.Feather38Bb);
    this.FeatherIdcBb_12.addChild(this.FeatherIdcB_12);
    this.FeatherIdcBb_32.addChild(this.FeatherIdcB_32);
    this.MoustacheLP8.addChild(this.MoustacheLP9);
    this.HeadSPRUp.addChild(this.Feather37Bb);
    this.FeatherIdcP1.addChild(this.FeatherIdcTip);
    this.BodyP1.addChild(this.FeatherIdcBb_33);
    this.FeatherIdcB_105.addChild(this.FeatherIdcP1_105);
    this.Feather18Bb.addChild(this.Feather18B);
    this.FeatherIdcP1_47.addChild(this.FeatherIdcTip_47);
    this.MoustacheLP7.addChild(this.MoustacheLP8);
    this.Feather10B.addChild(this.Feather10P1);
    this.FeatherIdcBb_87.addChild(this.FeatherIdcB_129);
    this.BodyP1.addChild(this.FeatherIdcBb_56);
    this.FeatherIdcBb_89.addChild(this.FeatherIdcB_131);
    this.FeatherIdcB_109.addChild(this.FeatherIdcP1_109);
    this.FeatherIdcB_126.addChild(this.FeatherIdcP1_126);
    this.BodyP1.addChild(this.FeatherIdcBb_61);
    this.FeatherIdcBb_102.addChild(this.FeatherIdcB_54);
    this.FeatherIdcB_71.addChild(this.FeatherIdcP1_71);
    this.HeadBback.addChild(this.Feather23Bb);
    this.FeatherIdcBb_66.addChild(this.FeatherIdcB_108);
    this.FeatherIdcP1_121.addChild(this.FeatherIdcTip_121);
    this.HeadBDo.addChild(this.ToothBot8);
    this.HeadBLDo.addChild(this.ToothBot3);
    this.HeadBUp.addChild(this.FangBR);
    this.FeatherIdcB_72.addChild(this.FeatherIdcP1_72);
    this.Feather54Bb.addChild(this.Feather54B);
    this.FeatherIdcB_55.addChild(this.FeatherIdcP1_55);
    this.FeatherIdcBb_15.addChild(this.FeatherIdcB_15);
    this.FeatherIdcB_41.addChild(this.FeatherIdcP1_41);
    this.FeatherIdcB_65.addChild(this.FeatherIdcP1_65);
    this.Feather10Bb.addChild(this.Feather10B);
    this.HeadBback.addChild(this.Feather16Bb);
    this.Feather45P1.addChild(this.Feather45Tip);
    this.BodyP1.addChild(this.FeatherIdcBb_3);
    this.BodyP1.addChild(this.FeatherIdcBb_43);
    this.BodyP1.addChild(this.FeatherIdcBb_30);
    this.HeadBRupSP2.addChild(this.HeadBRupSP3);
    this.EyebrowRP6.addChild(this.EyebrowRP7);
    this.Feather41B.addChild(this.Feather41P1);
    this.BodyP1.addChild(this.FeatherIdcBb_21);
    this.Feather17P1.addChild(this.Feather17Tip);
    this.HeadSPUpB.addChild(this.BodyP1);
    this.BodyP1.addChild(this.FeatherIdcBb_58);
    this.Feather53Bb.addChild(this.Feather53B);
    this.BodyP1.addChild(this.FeatherIdcBb_8);
    this.FeatherIdcBb_113.addChild(this.FeatherIdcB_65);
    this.FeatherIdcB_61.addChild(this.FeatherIdcP1_61);
    this.Feather1B.addChild(this.Feather1P1);
    this.FangBL.addChild(this.FangP1L);
    this.Feather49P1.addChild(this.Feather49Tip);
    this.FeatherIdcP1_43.addChild(this.FeatherIdcTip_43);
    this.FeatherIdcP1_48.addChild(this.FeatherIdcTip_48);
    this.Feather7Bb.addChild(this.Feather7B);
    this.Feather6B.addChild(this.Feather6P1);
    this.FeatherIdcBb_40.addChild(this.FeatherIdcB_40);
    this.FeatherIdcBb_82.addChild(this.FeatherIdcB_124);
    this.FeatherIdcB_18.addChild(this.FeatherIdcP1_18);
    this.Feather29P1.addChild(this.Feather29Tip);
    this.FeatherIdcP1_115.addChild(this.FeatherIdcTip_115);
    this.Feather56Bb.addChild(this.Feather56B);
    this.FeatherIdcP1_46.addChild(this.FeatherIdcTip_46);
    this.Lazyness101.addChild(this.FeatherIdcBb_107);
    this.FeatherIdcP1_57.addChild(this.FeatherIdcTip_57);
    this.BodyP1.addChild(this.FeatherIdcBb_81);
    this.FeatherIdcB_39.addChild(this.FeatherIdcP1_39);
    this.FeatherIdcP1_21.addChild(this.FeatherIdcTip_21);
    this.BodyP1.addChild(this.FeatherIdcBb_50);
    this.FeatherIdcP1_77.addChild(this.FeatherIdcTip_77);
    this.Lazyness101.addChild(this.FeatherIdcBb_109);
    this.FeatherIdcB_54.addChild(this.FeatherIdcP1_54);
    this.FeatherIdcB_57.addChild(this.FeatherIdcP1_57);
    this.FeatherIdcBb_69.addChild(this.FeatherIdcB_111);
    this.Lazyness101.addChild(this.FeatherIdcBb_99);
    this.FeatherIdcP1_58.addChild(this.FeatherIdcTip_58);
    this.MoustacheLP9.addChild(this.MoustacheLP10);
    this.BodyP1.addChild(this.FeatherIdcBb_52);
    this.FeatherIdcBb_111.addChild(this.FeatherIdcB_63);
    this.FeatherIdcBb_88.addChild(this.FeatherIdcB_130);
    this.FeatherIdcB_59.addChild(this.FeatherIdcP1_59);
    this.FeatherIdcBb_36.addChild(this.FeatherIdcB_36);
    this.BodyP1.addChild(this.FeatherIdcBb_13);
    this.BodyP1.addChild(this.FeatherIdcBb_36);
    this.Lazyness101.addChild(this.FeatherIdcBb_126);
    this.FeatherIdcB_75.addChild(this.FeatherIdcP1_75);
    this.FeatherIdcB_99.addChild(this.FeatherIdcP1_99);
    this.Feather46B.addChild(this.Feather46P1);
    this.FeatherIdcP1_3.addChild(this.FeatherIdcTip_3);
    this.FeatherIdcB_10.addChild(this.FeatherIdcP1_10);
    this.BodyP1.addChild(this.FeatherIdcBb_62);
    this.FeatherIdcP1_17.addChild(this.FeatherIdcTip_17);
    this.FeatherIdcP1_111.addChild(this.FeatherIdcTip_111);
    this.Feather12P1.addChild(this.Feather12Tip);
    this.FeatherIdcBb_6.addChild(this.FeatherIdcB_6);
    this.FeatherIdcBb_72.addChild(this.FeatherIdcB_114);
    this.FeatherIdcB_53.addChild(this.FeatherIdcP1_53);
    this.BodyP1.addChild(this.FeatherIdcBb_84);
    this.Lazyness101.addChild(this.FeatherIdcBb_119);
    this.Feather20Bb.addChild(this.Feather20B);
    this.FeatherIdcB_84.addChild(this.FeatherIdcP1_84);
    this.HeadBUp.addChild(this.NostrilLT);
    this.FeatherIdcP1_81.addChild(this.FeatherIdcTip_81);
    this.Feather58Bb.addChild(this.Feather58B);
    this.FeatherIdcBb_26.addChild(this.FeatherIdcB_26);
    this.HeadBback.addChild(this.HeadBUp);
    this.FeatherIdcP1_10.addChild(this.FeatherIdcTip_10);
    this.FeatherIdcBb_58.addChild(this.FeatherIdcB_100);
    this.FeatherIdcB.addChild(this.FeatherIdcP1);
    this.FeatherIdcB_28.addChild(this.FeatherIdcP1_28);
    this.Lazyness101.addChild(this.FeatherIdcBb_104);
    this.FeatherIdcP1_88.addChild(this.FeatherIdcTip_88);
    this.HeadBback.addChild(this.Feather28Bb);
    this.FeatherIdcBb_63.addChild(this.FeatherIdcB_105);
    this.FeatherIdcP1_122.addChild(this.FeatherIdcTip_122);
    this.BodyP1.addChild(this.Lazyness101);
    this.FeatherIdcB_116.addChild(this.FeatherIdcP1_116);
    this.HeadBDo.addChild(this.HeadBRDo);
    this.Feather19B.addChild(this.Feather19P1);
    this.FeatherIdcB_49.addChild(this.FeatherIdcP1_49);
    this.HeadBLDo.addChild(this.ToothBot2);
    this.FeatherIdcBb_55.addChild(this.FeatherIdcB_97);
    this.BodyP1.addChild(this.FeatherIdcBb_10);
    this.Lazyness101.addChild(this.FeatherIdcBb_95);
    this.Feather8P1.addChild(this.Feather8Tip);
    this.FeatherIdcP1_109.addChild(this.FeatherIdcTip_109);
    this.Feather23B.addChild(this.Feather23P1);
    this.FeatherIdcBb_91.addChild(this.FeatherIdcB_43);
    this.FeatherIdcP1_38.addChild(this.FeatherIdcTip_38);
    this.Feather3Bb.addChild(this.Feather3B);
    this.Feather27P1.addChild(this.Feather27Tip);
    this.HeadBupSPbackB.addChild(this.HeadBupSPbackBL);
    this.FeatherIdcP1_76.addChild(this.FeatherIdcTip_76);
    this.FeatherIdcB_110.addChild(this.FeatherIdcP1_110);
    this.FeatherIdcB_102.addChild(this.FeatherIdcP1_102);
    this.SnoutFSP1.addChild(this.SnoutFSP2);
    this.FeatherIdcBb_114.addChild(this.FeatherIdcB_66);
    this.Feather26P1.addChild(this.Feather26Tip);
    this.Feather34B.addChild(this.Feather34P1);
    this.MoustacheLP1.addChild(this.MoustacheLP2);
    this.Feather30P1.addChild(this.Feather30Tip);
    this.Feather43P1.addChild(this.Feather43Tip);
    this.HeadBRup.addChild(this.ToothT7);
    this.Lazyness101.addChild(this.FeatherIdcBb_129);
    this.Lazyness101.addChild(this.FeatherIdcBb_110);
    this.FeatherIdcP1_83.addChild(this.FeatherIdcTip_83);
    this.Feather44Bb.addChild(this.Feather44B);
    this.FeatherIdcB_14.addChild(this.FeatherIdcP1_14);
    this.HeadBback.addChild(this.Feather22Bb);
    this.HeadBUp.addChild(this.NostrilRR);
    this.Feather33B.addChild(this.Feather33P1);
    this.HeadBback.addChild(this.Feather17Bb);
    this.FeatherIdcB_125.addChild(this.FeatherIdcP1_125);
    this.FeatherIdcB_111.addChild(this.FeatherIdcP1_111);
    this.FeatherIdcP1_87.addChild(this.FeatherIdcTip_87);
    this.FeatherIdcP1_89.addChild(this.FeatherIdcTip_89);
    this.FeatherIdcP1_82.addChild(this.FeatherIdcTip_82);
    this.Feather5P1.addChild(this.Feather5Tip);
    this.FeatherIdcB_89.addChild(this.FeatherIdcP1_89);
    this.FeatherIdcBb_90.addChild(this.FeatherIdcB_42);
    this.FeatherIdcBb_98.addChild(this.FeatherIdcB_50);
    this.BodyP1.addChild(this.FeatherIdcBb_78);
    this.Feather53P1.addChild(this.Feather53Tip);
    this.EyebrowRP4.addChild(this.EyebrowRP5);
    this.FeatherIdcBb_9.addChild(this.FeatherIdcB_9);
    this.FeatherIdcB_112.addChild(this.FeatherIdcP1_112);
    this.SnoutFSP4.addChild(this.SnoutFSP5);
    this.HeadBRDo.addChild(this.ToothBot9);
    this.FeatherIdcB_98.addChild(this.FeatherIdcP1_98);
    this.FeatherIdcBb_54.addChild(this.FeatherIdcB_96);
    this.FeatherIdcB_9.addChild(this.FeatherIdcP1_9);
    this.FeatherIdcP1_18.addChild(this.FeatherIdcTip_18);
    this.HeadBback.addChild(this.Feather18Bb);
    this.SnoutFSP3.addChild(this.SnoutFSP4);
    this.HeadBback.addChild(this.Feather25Bb);
    this.FeatherIdcP1_7.addChild(this.FeatherIdcTip_7);
    this.Feather14P1.addChild(this.Feather14Tip);
    this.MoustacheRB.addChild(this.MoustacheRP1);
    this.FeatherIdcBb_99.addChild(this.FeatherIdcB_51);
    this.FeatherIdcB_13.addChild(this.FeatherIdcP1_13);
    this.FeatherIdcB_94.addChild(this.FeatherIdcP1_94);
    this.FeatherIdcBb_103.addChild(this.FeatherIdcB_55);
    this.Feather40Bb.addChild(this.Feather40B);
    this.HeadBback.addChild(this.Feather5Bb);
    this.HeadSPF.addChild(this.EyebrowLB);
    this.Lazyness101.addChild(this.FeatherIdcBb_96);
    this.HeadBRDo.addChild(this.ToothBot11);
    this.FeatherIdcP1_40.addChild(this.FeatherIdcTip_40);
    this.Feather13P1.addChild(this.Feather13Tip);
    this.BodyP1.addChild(this.FeatherIdcBb_14);
    this.FeatherIdcB_35.addChild(this.FeatherIdcP1_35);
    this.BodyP1.addChild(this.FeatherIdcBb_59);
    this.HeadBRDo.addChild(this.ToothBot12);
    this.EyebrowRB.addChild(this.EyebrowRP1);
    this.FeatherIdcP1_74.addChild(this.FeatherIdcTip_74);
    this.FeatherIdcBb_104.addChild(this.FeatherIdcB_56);
    this.BodyP1.addChild(this.FeatherIdcBb_29);
    this.FeatherIdcBb_131.addChild(this.FeatherIdcB_83);
    this.Feather46P1.addChild(this.Feather46Tip);
    this.Lazyness101.addChild(this.FeatherIdcBb_122);
    this.FeatherIdcP1_93.addChild(this.FeatherIdcTip_93);
    this.HeadBRup.addChild(this.ToothT9);
    this.FeatherIdcB_19.addChild(this.FeatherIdcP1_19);
    this.FeatherIdcP1_116.addChild(this.FeatherIdcTip_116);
    this.Feather30B.addChild(this.Feather30P1);
    this.HeadBback.addChild(this.Feather6Bb);
    this.HeadBUp.addChild(this.NostrilLL);
    this.HeadSPUp.addChild(this.HeadSPLUp);
    this.FeatherIdcBb_108.addChild(this.FeatherIdcB_60);
    this.FeatherIdcB_95.addChild(this.FeatherIdcP1_95);
    this.Feather24P1.addChild(this.Feather24Tip);
    this.FeatherIdcP1_78.addChild(this.FeatherIdcTip_78);
    this.MoustacheLP5.addChild(this.MoustacheLP6);
    this.Feather39Bb.addChild(this.Feather39B);
    this.Feather19Bb.addChild(this.Feather19B);
    this.Feather22P1.addChild(this.Feather22Tip);
    this.HeadBLup.addChild(this.ToothT2);
    this.FeatherIdcBb_16.addChild(this.FeatherIdcB_16);
    this.HeadSPRUp.addChild(this.Feather31Bb);
    this.Feather23Bb.addChild(this.Feather23B);
    this.Feather5Bb.addChild(this.Feather5B);
    this.HeadBDo.addChild(this.HeadBLDo);
    this.FeatherIdcBb_107.addChild(this.FeatherIdcB_59);
    this.FeatherIdcB_63.addChild(this.FeatherIdcP1_63);
    this.FeatherIdcP1_34.addChild(this.FeatherIdcTip_34);
    this.HeadBUp.addChild(this.SnoutFSP1);
    this.FeatherIdcP1_127.addChild(this.FeatherIdcTip_127);
    this.FeatherIdcB_60.addChild(this.FeatherIdcP1_60);
    this.FeatherIdcP1_126.addChild(this.FeatherIdcTip_126);
    this.BodyP1.addChild(this.FeatherIdcBb_53);
    this.Feather28Bb.addChild(this.Feather28B);
    this.Lazyness101.addChild(this.FeatherIdcBb_91);
    this.FeatherIdcBb_119.addChild(this.FeatherIdcB_71);
    this.Feather36B.addChild(this.Feather36P1);
    this.FeatherIdcBb_106.addChild(this.FeatherIdcB_58);
    this.Feather15B.addChild(this.Feather15P1);
    this.Lazyness101.addChild(this.FeatherIdcBb_120);
    this.FeatherIdcBb_50.addChild(this.FeatherIdcB_92);
    this.Feather50Bb.addChild(this.Feather50B);
    this.FeatherIdcB_87.addChild(this.FeatherIdcP1_87);
    this.Feather17B.addChild(this.Feather17P1);
    this.FeatherIdcP1_117.addChild(this.FeatherIdcTip_117);
    this.FeatherIdcB_62.addChild(this.FeatherIdcP1_62);
    this.Feather14Bb.addChild(this.Feather14B);
    this.BodyP1.addChild(this.FeatherIdcBb_44);
    this.FeatherIdcP1_114.addChild(this.FeatherIdcTip_114);
    this.HeadSPF.addChild(this.EyeLL);
    this.FeatherIdcP1_2.addChild(this.FeatherIdcTip_2);
    this.Feather9B.addChild(this.Feather9P1);
    this.HeadSPRUp.addChild(this.Feather36Bb);
    this.BodyP1.addChild(this.FeatherIdcBb_1);
    this.HeadBback.addChild(this.Feather2);
    this.HeadSPLUp.addChild(this.Feather41Bb);
    this.FeatherIdcBb_10.addChild(this.FeatherIdcB_10);
    this.FeatherIdcB_120.addChild(this.FeatherIdcP1_120);
    this.FeatherIdcBb_45.addChild(this.FeatherIdcB_87);
    this.HeadBback.addChild(this.Feather29Bb);
    this.Feather42Bb.addChild(this.Feather42B);
    this.Lazyness101.addChild(this.FeatherIdcBb_116);
    this.FeatherIdcB_106.addChild(this.FeatherIdcP1_106);
    this.FeatherIdcB_128.addChild(this.FeatherIdcP1_128);
    this.FeatherIdcB_44.addChild(this.FeatherIdcP1_44);
    this.Feather55P1.addChild(this.Feather55Tip);
    this.Feather41Bb.addChild(this.Feather41B);
    this.Feather48Bb.addChild(this.Feather48B);
    this.FeatherIdcP1_23.addChild(this.FeatherIdcTip_23);
    this.Feather22B.addChild(this.Feather22P1);
    this.FeatherIdcP1_71.addChild(this.FeatherIdcTip_71);
    this.FeatherIdcB_40.addChild(this.FeatherIdcP1_40);
    this.FeatherIdcP1_13.addChild(this.FeatherIdcTip_13);
    this.FeatherIdcBb_49.addChild(this.FeatherIdcB_91);
    this.Feather45Bb.addChild(this.Feather45B);
    this.Feather48P1.addChild(this.Feather48Tip);
    this.BodyP1.addChild(this.FeatherIdcBb_11);
    this.BodyP1.addChild(this.FeatherIdcBb_75);
    this.FeatherIdcB_123.addChild(this.FeatherIdcP1_123);
    this.FeatherIdcBb_95.addChild(this.FeatherIdcB_47);
    this.FeatherIdcB_66.addChild(this.FeatherIdcP1_66);
    this.EyebrowLP4.addChild(this.EyebrowLP5);
    this.Feather32Bb.addChild(this.Feather32B);
    this.FeatherIdcP1_92.addChild(this.FeatherIdcTip_92);
    this.Feather3B.addChild(this.Feather3P1);
    this.HeadBLupSP1.addChild(this.HeadBLupSP2);
    this.MoustacheRP3.addChild(this.MoustacheRP4);
    this.FeatherIdcB_26.addChild(this.FeatherIdcP1_26);
    this.FeatherIdcP1_31.addChild(this.FeatherIdcTip_31);
    this.FeatherIdcP1_91.addChild(this.FeatherIdcTip_91);
    this.Feather42P1.addChild(this.Feather42Tip);
    this.Feather51B.addChild(this.Feather51P1);
    this.FeatherIdcP1_36.addChild(this.FeatherIdcTip_36);
    this.FeatherIdcB_85.addChild(this.FeatherIdcP1_85);
    this.FeatherIdcB_2.addChild(this.FeatherIdcP1_2);
    this.FeatherIdcP1_106.addChild(this.FeatherIdcTip_106);
    this.Feather58P1.addChild(this.Feather58Tip);
    this.EyebrowLP2.addChild(this.EyebrowLP3);
    this.FeatherIdcB_29.addChild(this.FeatherIdcP1_29);
    this.FeatherIdcP1_14.addChild(this.FeatherIdcTip_14);
    this.FeatherIdcP1_11.addChild(this.FeatherIdcTip_11);
    this.Feather52Bb.addChild(this.Feather52B);
    this.Feather42B.addChild(this.Feather42P1);
    this.FeatherIdcBb_81.addChild(this.FeatherIdcB_123);
    this.FeatherIdcBb_92.addChild(this.FeatherIdcB_44);
    this.FeatherIdcBb_100.addChild(this.FeatherIdcB_52);
    this.BodyP1.addChild(this.FeatherIdcBb_12);
    this.HeadBback.addChild(this.HeadSP);
    this.FeatherIdcBb_121.addChild(this.FeatherIdcB_73);
    this.HeadBDo.addChild(this.ToothBot5);
    this.Lazyness101.addChild(this.FeatherIdcBb_105);
    this.Feather16B.addChild(this.Feather16P1);
    this.HeadBback.addChild(this.Feather14Bb);
    this.BodyP1.addChild(this.FeatherIdcBb_63);
    this.BodyP1.addChild(this.FeatherIdcBb_48);
    this.Feather25P1.addChild(this.Feather25Tip);
    this.FeatherIdcBb_21.addChild(this.FeatherIdcB_21);
    this.FeatherIdcP1_30.addChild(this.FeatherIdcTip_30);
    this.FeatherIdcP1_6.addChild(this.FeatherIdcTip_6);
    this.HeadSPLUp.addChild(this.Feather40Bb);
    this.FeatherIdcBb_61.addChild(this.FeatherIdcB_103);
    this.FeatherIdcBb_17.addChild(this.FeatherIdcB_17);
    this.Lazyness101.addChild(this.FeatherIdcBb_106);
    this.FeatherIdcB_43.addChild(this.FeatherIdcP1_43);
    this.Feather44P1.addChild(this.Feather44Tip);
    this.BodyP1.addChild(this.FeatherIdcBb_67);
    this.Feather40B.addChild(this.Feather40P1);
    this.FeatherIdcB_119.addChild(this.FeatherIdcP1_119);
    this.HeadBUp.addChild(this.HeadBRup);
    this.FeatherIdcB_16.addChild(this.FeatherIdcP1_16);
    this.EyebrowRP1.addChild(this.EyebrowRP2);
    this.FeatherIdcBb_33.addChild(this.FeatherIdcB_33);
    this.HeadBback.addChild(this.Feather26Bb);
    this.Feather2P1.addChild(this.Feather2Tip);
    this.Feather44B.addChild(this.Feather44P1);
    this.Lazyness101.addChild(this.FeatherIdcBb_127);
    this.HeadBback.addChild(this.Feather1);
    this.FeatherIdcB_20.addChild(this.FeatherIdcP1_20);
    this.FeatherIdcP1_52.addChild(this.FeatherIdcTip_52);
    this.HeadBDo.addChild(this.ToothBot6);
    this.MoustacheLB.addChild(this.MoustacheLSP);
    this.HeadBback.addChild(this.HeadBDo);
    this.HeadSPRUp.addChild(this.Feather47Bb);
    this.FeatherIdcB_36.addChild(this.FeatherIdcP1_36);
    this.HeadSPUp.addChild(this.Feather56Bb);
    this.Lazyness101.addChild(this.FeatherIdcBb_121);
    this.SnoutFSP2.addChild(this.SnoutFSP3);
    this.HeadSPLUp.addChild(this.Feather43Bb);
    this.HeadBUp.addChild(this.MoustacheRB);
    this.FeatherIdcP1_44.addChild(this.FeatherIdcTip_44);
    this.FeatherIdcP1_64.addChild(this.FeatherIdcTip_64);
    this.FeatherIdcB_50.addChild(this.FeatherIdcP1_50);
    this.Feather47Bb.addChild(this.Feather47B);
    this.Feather53B.addChild(this.Feather53P1);
    this.FeatherIdcB_46.addChild(this.FeatherIdcP1_46);
    this.MoustacheLP4.addChild(this.MoustacheLP5);
    this.HeadSPRUp.addChild(this.Feather45Bb);
    this.HeadSPF.addChild(this.EyeLR);
    this.Feather8B.addChild(this.Feather8P1);
    this.Feather37B.addChild(this.Feather37P1);
    this.FeatherIdcP1_119.addChild(this.FeatherIdcTip_119);
    this.FeatherIdcP1_55.addChild(this.FeatherIdcTip_55);
    this.HeadBLup.addChild(this.HeadBLupSP1);
    this.BodyP1.addChild(this.FeatherIdcBb_23);
    this.Lazyness101.addChild(this.FeatherIdcBb_111);
    this.FeatherIdcP1_9.addChild(this.FeatherIdcTip_9);
    this.BodyP1.addChild(this.FeatherIdcBb_73);
    this.FeatherIdcB_64.addChild(this.FeatherIdcP1_64);
    this.FeatherIdcBb_85.addChild(this.FeatherIdcB_127);
    this.HeadBback.addChild(this.Feather20Bb);
    this.Feather34P1.addChild(this.Feather34Tip);
    this.FeatherIdcBb_29.addChild(this.FeatherIdcB_29);
    this.BodyP1.addChild(this.FeatherIdcBb_87);
    this.MoustacheRB.addChild(this.MoustacheRSP);
    this.FeatherIdcP1_112.addChild(this.FeatherIdcTip_112);
    this.HeadSPF.addChild(this.EyeBR);
    this.FeatherIdcP1_98.addChild(this.FeatherIdcTip_98);
    this.HeadSPRUp.addChild(this.Feather32Bb);
    this.FeatherIdcBb_25.addChild(this.FeatherIdcB_25);
    this.FeatherIdcBb_1.addChild(this.FeatherIdcB_1);
    this.MoustacheLB.addChild(this.MoustacheLP1);
    this.FeatherIdcP1_32.addChild(this.FeatherIdcTip_32);
    this.Feather57Bb.addChild(this.Feather57B);
    this.FeatherIdcP1_67.addChild(this.FeatherIdcTip_67);
    this.FeatherIdcBb_53.addChild(this.FeatherIdcB_95);
    this.Feather40P1.addChild(this.Feather40Tip);
    this.BodyP1.addChild(this.FeatherIdcBb_7);
    this.Lazyness101.addChild(this.FeatherIdcBb_117);
    this.FeatherIdcB_88.addChild(this.FeatherIdcP1_88);
    this.Feather21B.addChild(this.Feather21P1);
    this.FeatherIdcP1_66.addChild(this.FeatherIdcTip_66);
    this.FeatherIdcP1_118.addChild(this.FeatherIdcTip_118);
    this.HeadBback.addChild(this.Feather21Bb);
    this.FeatherIdcP1_68.addChild(this.FeatherIdcTip_68);
    this.Feather31Bb.addChild(this.Feather31B);
    this.HeadBUp.addChild(this.HeadBLup);
    this.FeatherIdcBb_83.addChild(this.FeatherIdcB_125);
    this.FeatherIdcB_58.addChild(this.FeatherIdcP1_58);
    this.FeatherIdcBb_23.addChild(this.FeatherIdcB_23);
    this.Feather51Bb.addChild(this.Feather51B);
    this.FeatherIdcB_4.addChild(this.FeatherIdcP1_4);
    this.FeatherIdcBb_35.addChild(this.FeatherIdcB_35);
    this.HeadSPF.addChild(this.EyebrowRB);
    this.BodyP1.addChild(this.FeatherIdcBb_18);
    this.FeatherIdcB_30.addChild(this.FeatherIdcP1_30);
    this.Feather59B.addChild(this.Feather59P1);
    this.MoustacheRP1.addChild(this.MoustacheRP2);
    this.Feather49Bb.addChild(this.Feather49B);
    this.FeatherIdcP1_51.addChild(this.FeatherIdcTip_51);
    this.FeatherIdcBb_65.addChild(this.FeatherIdcB_107);
    this.FeatherIdcBb_118.addChild(this.FeatherIdcB_70);
    this.HeadSPF.addChild(this.EyeRL);
    this.Lazyness101.addChild(this.FeatherIdcBb_94);
    this.FeatherIdcB_121.addChild(this.FeatherIdcP1_121);
    this.BodyP1.addChild(this.FeatherIdcBb_31);
    this.FeatherIdcP1_73.addChild(this.FeatherIdcTip_73);
    this.Feather50P1.addChild(this.Feather50Tip);
    this.FeatherIdcP1_84.addChild(this.FeatherIdcTip_84);
    this.FeatherIdcP1_39.addChild(this.FeatherIdcTip_39);
    this.Feather20P1.addChild(this.Feather20Tip);
    this.MoustacheLP2.addChild(this.MoustacheLP3);
    this.FeatherIdcBb_27.addChild(this.FeatherIdcB_27);
    this.BodyP1.addChild(this.FeatherIdcBb_88);
    this.FeatherIdcP1_56.addChild(this.FeatherIdcTip_56);
    this.BodyP1.addChild(this.FeatherIdcBb_4);
    this.HeadSPF.addChild(this.EyeBL);
    this.FeatherIdcP1_53.addChild(this.FeatherIdcTip_53);
    this.NostrilRL.addChild(this.NostrilRLSPBot);
    this.FeatherIdcBb_109.addChild(this.FeatherIdcB_61);
    this.FeatherIdcBb_51.addChild(this.FeatherIdcB_93);
    this.Feather46Bb.addChild(this.Feather46B);
    this.HeadBback.addChild(this.Feather8Bb);
    this.Feather38B.addChild(this.Feather38P1);
    this.Feather12B.addChild(this.Feather12P1);
    this.FeatherIdcBb_52.addChild(this.FeatherIdcB_94);
    this.FeatherIdcBb_130.addChild(this.FeatherIdcB_82);
    this.FeatherIdcBb_42.addChild(this.FeatherIdcB_84);
    this.Feather14B.addChild(this.Feather14P1);
    this.FeatherIdcP1_69.addChild(this.FeatherIdcTip_69);
    this.FeatherIdcBb_46.addChild(this.FeatherIdcB_88);
    this.MoustacheLP3.addChild(this.MoustacheLP4);
    this.Feather32B.addChild(this.Feather32P1);
    this.HeadSPF.addChild(this.EyeLBot);
    this.FeatherIdcBb_19.addChild(this.FeatherIdcB_19);
    this.FeatherIdcB_73.addChild(this.FeatherIdcP1_73);
    this.FeatherIdcP1_35.addChild(this.FeatherIdcTip_35);
    this.FeatherIdcBb_129.addChild(this.FeatherIdcB_81);
    this.HeadBback.addChild(this.Feather9Bb);
    this.Feather50B.addChild(this.Feather50P1);
    this.FeatherIdcBb_125.addChild(this.FeatherIdcB_77);
    this.MoustacheRP4.addChild(this.MoustacheRP5);
    this.FeatherIdcB_17.addChild(this.FeatherIdcP1_17);
    this.Lazyness101.addChild(this.FeatherIdcBb_101);
    this.FeatherIdcBb_86.addChild(this.FeatherIdcB_128);
    this.FeatherIdcB_6.addChild(this.FeatherIdcP1_6);
    this.FeatherIdcB_124.addChild(this.FeatherIdcP1_124);
    this.Lazyness101.addChild(this.FeatherIdcBb_100);
    this.Lazyness101.addChild(this.FeatherIdcBb_108);
    this.FeatherIdcP1_80.addChild(this.FeatherIdcTip_80);
    this.HeadBLupSP2.addChild(this.HeadBLupSP3);
    this.FeatherIdcBb_59.addChild(this.FeatherIdcB_101);
    this.Feather57P1.addChild(this.Feather57Tip);
    this.FeatherIdcB_11.addChild(this.FeatherIdcP1_11);
    this.Feather1P1.addChild(this.Feather1Tip);
    this.Feather37P1.addChild(this.Feather37Tip);
    this.EyebrowLP6.addChild(this.EyebrowLP7);
    this.EyebrowRP3.addChild(this.EyebrowRP4);
    this.BodyP1.addChild(this.FeatherIdcBb_40);
    this.Feather54P1.addChild(this.Feather54Tip);
    this.BodyP1.addChild(this.FeatherIdcBb_49);
    this.FeatherIdcBb_74.addChild(this.FeatherIdcB_116);
    this.BodyP1.addChild(this.FeatherIdcBb_55);
    this.HeadBback.addChild(this.Feather15Bb);
    this.BodyP1.addChild(this.FeatherIdcBb_27);
    this.MoustacheRP2.addChild(this.MoustacheRP3);
    this.BodyP1.addChild(this.FeatherIdcBb_80);
    this.FeatherIdcB_107.addChild(this.FeatherIdcP1_107);
    this.BodyP1.addChild(this.FeatherIdcBb_70);
    this.HeadSPRUp.addChild(this.Feather34Bb);
    this.FeatherIdcB_56.addChild(this.FeatherIdcP1_56);
    this.Feather24Bb.addChild(this.Feather24B);
    this.BodyP1.addChild(this.FeatherIdcBb_57);
    this.BodyP1.addChild(this.FeatherIdcBb_86);
    this.FeatherIdcP1_107.addChild(this.FeatherIdcTip_107);
    this.HeadBback.addChild(this.Feather24Bb);
    this.FeatherIdcBb_7.addChild(this.FeatherIdcB_7);
    this.Lazyness101.addChild(this.FeatherIdcBb_92);
    this.FeatherIdcP1_1.addChild(this.FeatherIdcTip_1);
    this.FeatherIdcB_48.addChild(this.FeatherIdcP1_48);
    this.Feather38P1.addChild(this.Feather38Tip);
    this.HeadBback.addChild(this.Feather1Bb);
    this.BodyP1.addChild(this.FeatherIdcBb_5);
    this.FeatherIdcBb_57.addChild(this.FeatherIdcB_99);
    this.Lazyness101.addChild(this.FeatherIdcBb_112);
    this.FeatherIdcBb_112.addChild(this.FeatherIdcB_64);
    this.HeadSPLUp.addChild(this.Feather39Bb);
    this.FeatherIdcP1_96.addChild(this.FeatherIdcTip_96);
    this.Feather25B.addChild(this.Feather25P1);
    this.FeatherIdcP1_79.addChild(this.FeatherIdcTip_79);
    this.FeatherIdcP1_16.addChild(this.FeatherIdcTip_16);
    this.Feather23P1.addChild(this.Feather23Tip);
    this.BodyP1.addChild(this.FeatherIdcBb_6);
    this.FeatherIdcP1_110.addChild(this.FeatherIdcTip_110);
    this.BodyP1.addChild(this.FeatherIdcBb_64);
    this.FeatherIdcP1_29.addChild(this.FeatherIdcTip_29);
    this.BodyP1.addChild(this.FeatherIdcBb_16);
    this.HeadBUp.addChild(this.HeadBupSPbackB);
    this.Feather27B.addChild(this.Feather27P1);
    this.FeatherIdcP1_108.addChild(this.FeatherIdcTip_108);
    this.FeatherIdcBb_31.addChild(this.FeatherIdcB_31);
    this.FeatherIdcP1_90.addChild(this.FeatherIdcTip_90);
    this.FeatherIdcP1_95.addChild(this.FeatherIdcTip_95);
    this.Feather16P1.addChild(this.Feather16Tip);
    this.HeadBback.addChild(this.Feather27Bb);
    this.Feather56P1.addChild(this.Feather56Tip);
    this.HeadSPUp.addChild(this.Feather58Bb);
    this.FeatherIdcBb_80.addChild(this.FeatherIdcB_122);
    this.Feather21P1.addChild(this.Feather21Tip);
    this.BodyP1.addChild(this.FeatherIdcBb_46);
    this.BodyP1.addChild(this.FeatherIdcBb_89);
    this.BodyP1.addChild(this.FeatherIdcBb_60);
    this.FeatherIdcP1_65.addChild(this.FeatherIdcTip_65);
    this.FeatherIdcB_76.addChild(this.FeatherIdcP1_76);
    this.FeatherIdcP1_15.addChild(this.FeatherIdcTip_15);
    this.Feather3P1.addChild(this.Feather3Tip);
    this.HeadSPF.addChild(this.EyeLT);
    this.FeatherIdcBb_56.addChild(this.FeatherIdcB_98);
    this.FeatherIdcB_8.addChild(this.FeatherIdcP1_8);
    this.HeadSPLUp.addChild(this.Feather50Bb);
    this.BodyP1.addChild(this.FeatherIdcBb_37);
    this.FeatherIdcB_83.addChild(this.FeatherIdcP1_83);
    this.BodyP1.addChild(this.FeatherIdcBb_51);
    this.FeatherIdcP1_26.addChild(this.FeatherIdcTip_26);
    this.FeatherIdcB_103.addChild(this.FeatherIdcP1_103);
    this.FeatherIdcBb_122.addChild(this.FeatherIdcB_74);
    this.Feather26B.addChild(this.Feather26P1);
    this.FeatherIdcBb_3.addChild(this.FeatherIdcB_3);
    this.FeatherIdcP1_101.addChild(this.FeatherIdcTip_101);
    this.HeadBback.addChild(this.Feather10Bb);
    this.FeatherIdcBb_71.addChild(this.FeatherIdcB_113);
    this.Feather37Bb.addChild(this.Feather37B);
    this.FeatherIdcBb_117.addChild(this.FeatherIdcB_69);
    this.Feather58B.addChild(this.Feather58P1);
    this.HeadBback.addChild(this.Feather11Bb);
    this.Feather2Bb.addChild(this.Feather2B);
    this.Feather52P1.addChild(this.Feather52Tip);
    this.EyebrowLB.addChild(this.EyebrowLBSP);
    this.BodyP1.addChild(this.FeatherIdcBb_17);
    this.FeatherIdcP1_63.addChild(this.FeatherIdcTip_63);
    this.Lazyness101.addChild(this.FeatherIdcBb_113);
    this.FeatherIdcB_42.addChild(this.FeatherIdcP1_42);
    this.HeadBback.addChild(this.Feather4Bb);
    this.FeatherIdcBb_79.addChild(this.FeatherIdcB_121);
    this.HeadBUp.addChild(this.NostrilRL);
    this.FeatherIdcBb_48.addChild(this.FeatherIdcB_90);
    this.FeatherIdcB_100.addChild(this.FeatherIdcP1_100);
    this.Feather56B.addChild(this.Feather56P1);
    this.Feather4Bb.addChild(this.Feather4B);
    this.HeadSPRUp.addChild(this.Feather46Bb);
    this.HeadSPF.addChild(this.EyeRBot);
    this.FeatherIdcBb_34.addChild(this.FeatherIdcB_34);
    this.Feather15P1.addChild(this.Feather15Tip);
    this.BodyP1.addChild(this.FeatherIdcBb_20);
    this.FeatherIdcP1_28.addChild(this.FeatherIdcTip_28);
    this.FeatherIdcP1_61.addChild(this.FeatherIdcTip_61);
    this.Feather47P1.addChild(this.Feather47Tip);
    this.FeatherIdcB_12.addChild(this.FeatherIdcP1_12);
    this.MoustacheRP8.addChild(this.MoustacheRP9);
    this.HeadBUp.addChild(this.MoustacheLB);
    this.HeadBLDo.addChild(this.ToothBot1);
    this.Feather45B.addChild(this.Feather45P1);
    this.FeatherIdcB_1.addChild(this.FeatherIdcP1_1);
    this.FeatherIdcB_24.addChild(this.FeatherIdcP1_24);
    this.FeatherIdcP1_103.addChild(this.FeatherIdcTip_103);
    this.FeatherIdcBb_126.addChild(this.FeatherIdcB_78);
    this.Feather39P1.addChild(this.Feather39Tip);
    this.FeatherIdcBb_37.addChild(this.FeatherIdcB_37);
    this.MoustacheRP5.addChild(this.MoustacheRP6);
    this.FeatherIdcB_115.addChild(this.FeatherIdcP1_115);
    this.Feather28B.addChild(this.Feather28P1);
    this.HeadBUp.addChild(this.NostrilRBot);
    this.Feather27Bb.addChild(this.Feather27B);
    this.Feather4P1.addChild(this.Feather4Tip);
    this.FeatherIdcP1_99.addChild(this.FeatherIdcTip_99);
    this.FeatherIdcP1_45.addChild(this.FeatherIdcTip_45);
    this.Feather6Bb.addChild(this.Feather6B);
    this.FeatherIdcBb_115.addChild(this.FeatherIdcB_67);
    this.FeatherIdcB_68.addChild(this.FeatherIdcP1_68);
    this.FeatherIdcB_101.addChild(this.FeatherIdcP1_101);
    this.HeadSPUp.addChild(this.HeadSPUpB);
    this.FeatherIdcBb_5.addChild(this.FeatherIdcB_5);
    this.Lazyness101.addChild(this.FeatherIdcBb_90);
    this.FeatherIdcB_45.addChild(this.FeatherIdcP1_45);
    this.Feather18B.addChild(this.Feather18P1);
    this.FeatherIdcP1_60.addChild(this.FeatherIdcTip_60);
    this.FeatherIdcB_37.addChild(this.FeatherIdcP1_37);
    this.Feather20B.addChild(this.Feather20P1);
    this.FeatherIdcB_127.addChild(this.FeatherIdcP1_127);
    this.HeadBupSPbackB.addChild(this.HeadBupSPbackBR);
    this.Feather4B.addChild(this.Feather4P1);
    this.Feather38Bb.addChild(this.Feather38B);
    this.FeatherIdcP1_54.addChild(this.FeatherIdcTip_54);
    this.Feather1Bb.addChild(this.Feather1B);
    this.Feather10P1.addChild(this.Feather10Tip);
    this.Lazyness101.addChild(this.FeatherIdcBb_114);
    this.Feather59Bb.addChild(this.Feather59B);
    this.Feather13B.addChild(this.Feather13P1);
    this.FeatherIdcB_97.addChild(this.FeatherIdcP1_97);
    this.FeatherIdcP1_27.addChild(this.FeatherIdcTip_27);
    this.Feather18P1.addChild(this.Feather18Tip);
    this.FeatherIdcBb_11.addChild(this.FeatherIdcB_11);
    this.FeatherIdcB_27.addChild(this.FeatherIdcP1_27);
    this.FeatherIdcB_96.addChild(this.FeatherIdcP1_96);
    this.FeatherIdcP1_120.addChild(this.FeatherIdcTip_120);
    this.HeadBback.addChild(this.Feather3Bb);
    this.EyebrowRP5.addChild(this.EyebrowRP6);
    this.FeatherIdcBb_4.addChild(this.FeatherIdcB_4);
    this.FeatherIdcB_82.addChild(this.FeatherIdcP1_82);
    this.Feather29B.addChild(this.Feather29P1);
    this.FeatherIdcBb_110.addChild(this.FeatherIdcB_62);
    this.MoustacheRP6.addChild(this.MoustacheRP7);
    this.Lazyness101.addChild(this.FeatherIdcBb_115);
    this.Feather5B.addChild(this.Feather5P1);
    this.BodyP1.addChild(this.FeatherIdcBb);
    this.HeadSPUp.addChild(this.Feather53Bb);
    this.FeatherIdcP1_20.addChild(this.FeatherIdcTip_20);
    this.HeadSP.addChild(this.HeadSPF);
    this.FeatherIdcBb_78.addChild(this.FeatherIdcB_120);
    this.Feather12Bb.addChild(this.Feather12B);
    this.Feather39B.addChild(this.Feather39P1);
    this.HeadSPF.addChild(this.EyeRT);
    this.BodyP1.addChild(this.FeatherIdcBb_38);
    this.Feather28P1.addChild(this.Feather28Tip);
    this.HeadSPRUp.addChild(this.Feather35Bb);
    this.BodyP1.addChild(this.FeatherIdcBb_39);
    this.Feather35P1.addChild(this.Feather35Tip);
    this.FeatherIdcP1_22.addChild(this.FeatherIdcTip_22);
    this.HeadBUp.addChild(this.NostrilLBot);
    this.FeatherIdcBb_70.addChild(this.FeatherIdcB_112);
    this.FeatherIdcB_32.addChild(this.FeatherIdcP1_32);
    this.HeadSPUp.addChild(this.Feather52Bb);
    this.Feather34Bb.addChild(this.Feather34B);
    this.FeatherIdcBb_128.addChild(this.FeatherIdcB_80);
    this.FeatherIdcBb_77.addChild(this.FeatherIdcB_119);
    this.FeatherIdcB_52.addChild(this.FeatherIdcP1_52);
    this.Lazyness101.addChild(this.FeatherIdcBb_124);
    this.BodyP1.addChild(this.BodyP2);
    this.FeatherIdcB_108.addChild(this.FeatherIdcP1_108);
    this.FeatherIdcB_117.addChild(this.FeatherIdcP1_117);
    this.HeadBback.addChild(this.Feather30Bb);
    this.BodyP1.addChild(this.FeatherIdcBb_47);
    this.FeatherIdcP1_41.addChild(this.FeatherIdcTip_41);
    this.FeatherIdcP1_33.addChild(this.FeatherIdcTip_33);
    this.FeatherIdcP1_105.addChild(this.FeatherIdcTip_105);
    this.FeatherIdcB_130.addChild(this.FeatherIdcP1_130);
    this.EyebrowRP2.addChild(this.EyebrowRP3);
    this.Feather49B.addChild(this.Feather49P1);
    this.BodyP1.addChild(this.FeatherIdcBb_41);
    this.FeatherIdcP1_113.addChild(this.FeatherIdcTip_113);
    this.FeatherIdcB_92.addChild(this.FeatherIdcP1_92);
    this.Feather59P1.addChild(this.Feather59Tip);
    this.HeadBUp.addChild(this.NostrilLR);
    this.HeadSPUp.addChild(this.HeadSPRUp);
    this.EyebrowRB.addChild(this.EyebrowRBSP);
    this.FeatherIdcP1_130.addChild(this.FeatherIdcTip_130);
    this.FeatherIdcP1_49.addChild(this.FeatherIdcTip_49);
    this.Lazyness101.addChild(this.FeatherIdcBb_128);
    this.FeatherIdcBb_8.addChild(this.FeatherIdcB_8);
    this.Feather47B.addChild(this.Feather47P1);
    this.BodyP1.addChild(this.FeatherIdcBb_71);
    this.FeatherIdcB_74.addChild(this.FeatherIdcP1_74);
    this.Feather36Bb.addChild(this.Feather36B);
    this.Feather48B.addChild(this.Feather48P1);
    this.Feather11B.addChild(this.Feather11P1);
    this.Feather16Bb.addChild(this.Feather16B);
    this.FeatherIdcB_114.addChild(this.FeatherIdcP1_114);
    this.HeadBback.addChild(this.Feather12Bb);
    this.HeadBUp.addChild(this.ToothT5);
    this.FeatherIdcP1_25.addChild(this.FeatherIdcTip_25);
    this.Feather57B.addChild(this.Feather57P1);
    this.BodyP1.addChild(this.FeatherIdcBb_42);
    this.HeadBDo.addChild(this.ToothBot7);
    this.Feather32P1.addChild(this.Feather32Tip);
    this.Feather55B.addChild(this.Feather55P1);
    this.HeadSPF.addChild(this.HeadSPUp);
    this.BodyP1.addChild(this.FeatherIdcBb_68);
    this.HeadSPUp.addChild(this.Feather54Bb);
    this.FeatherIdcB_7.addChild(this.FeatherIdcP1_7);
    this.FeatherIdcB_67.addChild(this.FeatherIdcP1_67);
    this.MoustacheRP9.addChild(this.MoustacheRP10);
    this.Lazyness101.addChild(this.FeatherIdcBb_97);
    this.FeatherIdcP1_5.addChild(this.FeatherIdcTip_5);
    this.Feather9Bb.addChild(this.Feather9B);
    this.Feather21Bb.addChild(this.Feather21B);
    this.Lazyness101.addChild(this.FeatherIdcBb_93);
    this.Feather36P1.addChild(this.Feather36Tip);
    this.Feather51P1.addChild(this.Feather51Tip);
    this.BodyP1.addChild(this.FeatherIdcBb_15);
    this.FeatherIdcP1_102.addChild(this.FeatherIdcTip_102);
    this.FeatherIdcBb_38.addChild(this.FeatherIdcB_38);
    this.Feather13Bb.addChild(this.Feather13B);
    this.BodyP1.addChild(this.FeatherIdcBb_82);
    this.HeadBback.addChild(this.Feather7Bb);
    this.BodyP1.addChild(this.FeatherIdcBb_72);
    this.BodyP1.addChild(this.FeatherIdcBb_9);
    this.FeatherIdcP1_8.addChild(this.FeatherIdcTip_8);
    this.FeatherIdcB_77.addChild(this.FeatherIdcP1_77);
    this.Feather24B.addChild(this.Feather24P1);
    this.HeadBUp.addChild(this.FangBL);
    this.FeatherIdcP1_85.addChild(this.FeatherIdcTip_85);
    this.HeadSPLUp.addChild(this.Feather42Bb);
    this.FeatherIdcBb_101.addChild(this.FeatherIdcB_53);
    this.HeadBRup.addChild(this.HeadBRupSP1);
    this.BodyP1.addChild(this.FeatherIdcBb_83);
    this.Feather26Bb.addChild(this.Feather26B);
    this.FeatherIdcP1_128.addChild(this.FeatherIdcTip_128);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    GL11.glPushMatrix();
    /*GL11.glScaled(1.0D / this.modelScale[0], 1.0D / this.modelScale[1], 1.0D / this.modelScale[2]);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F);*/
    GL11.glScalef(9.0f,9.0f,9.0f);
    GL11.glRotatef(180F, 0F, 0F, 1F);
    GL11.glTranslatef(0F,-0.5F,0F);
//    this.HeadBback.render(f5);
    Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
    model.renderAll();
//    GL11.glDisable(3042);
    GL11.glPopMatrix();
  }


  public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
  }
}

package alcoholmod.Mathioks.NickModels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class UzumakiShinigamiModel extends ModelBiped {
  public double[] modelScale = new double[] { 3.0D, 3.0D, 3.0D };
  
  public ModelRenderer Body;
  
  public ModelRenderer SleeveLB;
  
  public ModelRenderer SleeveRB;
  
  public ModelRenderer CollarR;
  
  public ModelRenderer CollarL;
  
  public ModelRenderer CollarSPR;
  
  public ModelRenderer CollarSPR2;
  
  public ModelRenderer CollarSPL;
  
  public ModelRenderer CollarSPL2;
  
  public ModelRenderer Neck;
  
  public ModelRenderer SleeveLSPB;
  
  public ModelRenderer SleeveSPLR;
  
  public ModelRenderer SleeveLSup;
  
  public ModelRenderer SleeveLSdo;
  
  public ModelRenderer SleeveLSF;
  
  public ModelRenderer SleeveLSB;
  
  public ModelRenderer ArmL;
  
  public ModelRenderer PalmL;
  
  public ModelRenderer FingerL1B;
  
  public ModelRenderer FingerL2B;
  
  public ModelRenderer FingerL3B;
  
  public ModelRenderer FingerL4B;
  
  public ModelRenderer ThumbLB;
  
  public ModelRenderer PrayerBead1;
  
  public ModelRenderer PrayerBead2;
  
  public ModelRenderer PrayerBead3;
  
  public ModelRenderer PrayerBead4;
  
  public ModelRenderer PrayerBead5;
  
  public ModelRenderer PrayerBead6;
  
  public ModelRenderer PrayerBead7;
  
  public ModelRenderer PrayerBead8;
  
  public ModelRenderer PrayerBead9;
  
  public ModelRenderer PrayerBead10;
  
  public ModelRenderer PrayerBead11;
  
  public ModelRenderer PrayerBead12;
  
  public ModelRenderer PrayerBead13;
  
  public ModelRenderer PrayerBead14;
  
  public ModelRenderer PrayerBead15;
  
  public ModelRenderer PrayerBead16;
  
  public ModelRenderer PrayerBead17;
  
  public ModelRenderer PrayerBead18;
  
  public ModelRenderer PrayerBead19;
  
  public ModelRenderer PrayerBead20;
  
  public ModelRenderer PrayerBead21;
  
  public ModelRenderer PrayerBead22;
  
  public ModelRenderer PrayerBead23;
  
  public ModelRenderer PrayerBead24;
  
  public ModelRenderer PrayerBead25;
  
  public ModelRenderer PrayerBead26;
  
  public ModelRenderer PrayerBead27;
  
  public ModelRenderer PrayerBeadString;
  
  public ModelRenderer PrayerBeadString_1;
  
  public ModelRenderer PrayerBeadString_2;
  
  public ModelRenderer PrayerBeadString_3;
  
  public ModelRenderer PrayerBeadString_4;
  
  public ModelRenderer PrayerBeadString_5;
  
  public ModelRenderer PrayerBeadString_6;
  
  public ModelRenderer PrayerBeadString_7;
  
  public ModelRenderer PrayerBeadString_8;
  
  public ModelRenderer PrayerBeadString_9;
  
  public ModelRenderer PrayerBeadString_10;
  
  public ModelRenderer PrayerBeadString_11;
  
  public ModelRenderer PrayerBeadString_12;
  
  public ModelRenderer PrayerBeadString_13;
  
  public ModelRenderer PrayerBeadString_14;
  
  public ModelRenderer PrayerBeadString_15;
  
  public ModelRenderer PrayerBeadString_16;
  
  public ModelRenderer PrayerBeadString_17;
  
  public ModelRenderer PrayerBeadString_18;
  
  public ModelRenderer FingerL1P1;
  
  public ModelRenderer FingerL2P1;
  
  public ModelRenderer FingerL3P1;
  
  public ModelRenderer FingerL4P1;
  
  public ModelRenderer ThumbLP1;
  
  public ModelRenderer SleeveRSPB;
  
  public ModelRenderer SleeveSPRL;
  
  public ModelRenderer SleeveRSup;
  
  public ModelRenderer SleeveRSdo;
  
  public ModelRenderer SleeveRSF;
  
  public ModelRenderer SleeveRSB;
  
  public ModelRenderer ArmR;
  
  public ModelRenderer PalmR;
  
  public ModelRenderer FingerR1B;
  
  public ModelRenderer FingerR2B;
  
  public ModelRenderer FingerR3B;
  
  public ModelRenderer FingerR4B;
  
  public ModelRenderer ThumbRB;
  
  public ModelRenderer FingerR1P1;
  
  public ModelRenderer FingerR2P1;
  
  public ModelRenderer FingerR3P1;
  
  public ModelRenderer FingerR4P1;
  
  public ModelRenderer ThumbRP1;
  
  public ModelRenderer Head;
  
  public ModelRenderer EyeRSP1;
  
  public ModelRenderer EyeRSP2;
  
  public ModelRenderer EyeRSP3;
  
  public ModelRenderer EyeRSP4;
  
  public ModelRenderer EyeRSP5;
  
  public ModelRenderer EyeRSP6;
  
  public ModelRenderer EyeRSP7;
  
  public ModelRenderer EyeRSP8;
  
  public ModelRenderer EyeLSP1;
  
  public ModelRenderer EyeLSP2;
  
  public ModelRenderer EyeLSP3;
  
  public ModelRenderer EyeLSP4;
  
  public ModelRenderer EyeLSP5;
  
  public ModelRenderer EyeLSP6;
  
  public ModelRenderer EyeLSP7;
  
  public ModelRenderer EyeLSP8;
  
  public ModelRenderer MouthBup;
  
  public ModelRenderer MouthBdo;
  
  public ModelRenderer MouthSPRup;
  
  public ModelRenderer MouthSPLup;
  
  public ModelRenderer MouthSPRdo;
  
  public ModelRenderer MouthSPLdo;
  
  public ModelRenderer NoseB;
  
  public ModelRenderer KnifeB;
  
  public ModelRenderer HornRB;
  
  public ModelRenderer HornLB;
  
  public ModelRenderer HairB;
  
  public ModelRenderer Tooth2;
  
  public ModelRenderer Tooth3;
  
  public ModelRenderer Tooth3_1;
  
  public ModelRenderer Tooth4;
  
  public ModelRenderer Tooth5;
  
  public ModelRenderer Tooth6;
  
  public ModelRenderer MouthSPupup;
  
  public ModelRenderer Tooth9;
  
  public ModelRenderer Tooth10;
  
  public ModelRenderer Tooth11;
  
  public ModelRenderer Tooth12;
  
  public ModelRenderer Tooth13;
  
  public ModelRenderer Tooth14;
  
  public ModelRenderer Tooth1;
  
  public ModelRenderer Tooth7;
  
  public ModelRenderer Tooth8;
  
  public ModelRenderer Tooth7_1;
  
  public ModelRenderer NoseSPRup;
  
  public ModelRenderer NoseSPRR;
  
  public ModelRenderer NoseSPRF;
  
  public ModelRenderer NoseSPLup;
  
  public ModelRenderer NoseSPLL;
  
  public ModelRenderer NoseSPLF;
  
  public ModelRenderer KnifeBlade;
  
  public ModelRenderer KnifeTipup;
  
  public ModelRenderer KnifeTipSP1;
  
  public ModelRenderer KnifeFiller1;
  
  public ModelRenderer KnifeTipSP7;
  
  public ModelRenderer KnifeTipSP2;
  
  public ModelRenderer KnifeTipSP3;
  
  public ModelRenderer KnifeTipSP4;
  
  public ModelRenderer KnifeTipSP5;
  
  public ModelRenderer KnifeTipSP6;
  
  public ModelRenderer KnifeFiller2;
  
  public ModelRenderer HornRP1;
  
  public ModelRenderer HornRTip;
  
  public ModelRenderer HornLP1;
  
  public ModelRenderer HornLTip;
  
  public ModelRenderer HairSP;
  
  public ModelRenderer HairSP_1;
  
  public ModelRenderer HairSP_2;
  
  public ModelRenderer HairSP_3;
  
  public ModelRenderer HairSP_4;
  
  public ModelRenderer HairSP_5;
  
  public ModelRenderer HairSP_6;
  
  public ModelRenderer HairSP_7;
  
  public ModelRenderer HairSP_8;
  
  public ModelRenderer HairSP_9;
  
  public ModelRenderer HairSP_10;
  
  public ModelRenderer HairSP_11;
  
  public ModelRenderer HairSP_12;
  
  public ModelRenderer HairSP_13;
  
  public ModelRenderer HairSP_14;
  
  public ModelRenderer HairSP_15;
  
  public ModelRenderer HairSP_16;
  
  public ModelRenderer HairSP_17;
  
  public ModelRenderer HairSP_18;
  
  public ModelRenderer HairSP_19;
  
  public ModelRenderer HairSP_20;
  
  public ModelRenderer HairSP_21;
  
  public ModelRenderer HairSP_22;
  
  public ModelRenderer HairSP_23;
  
  public ModelRenderer HairSP_24;
  
  public ModelRenderer HairSP_25;
  
  public ModelRenderer HairSP_26;
  
  public UzumakiShinigamiModel() {
    this.textureWidth = 1000;
    this.textureHeight = 1500;
    this.PrayerBead25 = new ModelRenderer((ModelBase)this, 211, 70);
    this.PrayerBead25.setRotationPoint(-30.0F, 18.0F, -1.0F);
    this.PrayerBead25.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.CollarR = new ModelRenderer((ModelBase)this, 13, 250);
    this.CollarR.setRotationPoint(25.0F, 0.0F, -2.0F);
    this.CollarR.addBox(0.0F, 0.0F, 0.0F, 39, 6, 10, 0.0F);
    setRotateAngle(this.CollarR, 0.0F, 0.0F, 0.7853982F);
    this.EyeRSP8 = new ModelRenderer((ModelBase)this, 227, 1045);
    this.EyeRSP8.setRotationPoint(10.02F, 9.67F, -0.6F);
    this.EyeRSP8.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    setRotateAngle(this.EyeRSP8, 0.0F, 0.0F, -2.4253094F);
    this.PrayerBead22 = new ModelRenderer((ModelBase)this, 165, 70);
    this.PrayerBead22.setRotationPoint(6.0F, 25.0F, 2.0F);
    this.PrayerBead22.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.FingerR3B = new ModelRenderer((ModelBase)this, 738, 126);
    this.FingerR3B.setRotationPoint(8.6F, -10.0F, 7.0F);
    this.FingerR3B.addBox(0.0F, 0.0F, 0.0F, 5, 13, 5, 0.0F);
    setRotateAngle(this.FingerR3B, 0.0F, 0.0F, 0.71628314F);
    this.HairSP_9 = new ModelRenderer((ModelBase)this, 52, 1287);
    this.HairSP_9.setRotationPoint(10.9F, 7.03F, 5.2F);
    this.HairSP_9.addBox(0.0F, 0.0F, 0.0F, 25, 7, 26, 0.0F);
    setRotateAngle(this.HairSP_9, 0.0F, 0.42097342F, 3.1415927F);
    this.PrayerBeadString_9 = new ModelRenderer((ModelBase)this, 73, 101);
    this.PrayerBeadString_9.setRotationPoint(0.0F, -7.0F, -1.0F);
    this.PrayerBeadString_9.addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_9, -0.45867252F, -1.4388494F, 0.44610617F);
    this.CollarSPL2 = new ModelRenderer((ModelBase)this, 72, 238);
    this.CollarSPL2.setRotationPoint(79.26F, 0.24F, -2.0F);
    this.CollarSPL2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F);
    this.FingerL4B = new ModelRenderer((ModelBase)this, 598, 748);
    this.FingerL4B.setRotationPoint(3.8F, -7.1F, 19.0F);
    this.FingerL4B.addBox(0.0F, 0.0F, 0.0F, 5, 8, 5, 0.0F);
    setRotateAngle(this.FingerL4B, 0.0F, 0.0F, 0.47752208F);
    this.HairSP_25 = new ModelRenderer((ModelBase)this, 414, 1389);
    this.HairSP_25.setRotationPoint(0.0F, 16.0F, 3.4F);
    this.HairSP_25.addBox(0.0F, 0.0F, 0.0F, 32, 41, 7, 0.0F);
    setRotateAngle(this.HairSP_25, -1.0555751F, 0.0F, 0.0F);
    this.CollarSPR = new ModelRenderer((ModelBase)this, 26, 238);
    this.CollarSPR.setRotationPoint(21.0F, 0.0F, -2.0F);
    this.CollarSPR.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
    this.KnifeFiller2 = new ModelRenderer((ModelBase)this, 270, 1142);
    this.KnifeFiller2.setRotationPoint(1.5F, 0.1F, 0.0F);
    this.KnifeFiller2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    this.Tooth1 = new ModelRenderer((ModelBase)this, 226, 1114);
    this.Tooth1.setRotationPoint(1.0F, 1.3F, 0.02F);
    this.Tooth1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth1, 0.0F, 0.0F, 0.7853982F);
    this.HairSP_17 = new ModelRenderer((ModelBase)this, 292, 1400);
    this.HairSP_17.setRotationPoint(23.0F, 0.0F, 0.0F);
    this.HairSP_17.addBox(0.0F, 0.0F, 0.0F, 32, 7, 12, 0.0F);
    setRotateAngle(this.HairSP_17, 0.0F, -0.8733628F, 0.0F);
    this.MouthSPupup = new ModelRenderer((ModelBase)this, 180, 1104);
    this.MouthSPupup.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.MouthSPupup.addBox(0.0F, 0.0F, 0.0F, 9, 2, 4, 0.0F);
    setRotateAngle(this.MouthSPupup, 0.45867252F, 0.0F, 0.0F);
    this.EyeLSP4 = new ModelRenderer((ModelBase)this, 192, 1069);
    this.EyeLSP4.setRotationPoint(24.81F, 7.02F, -0.6F);
    this.EyeLSP4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    setRotateAngle(this.EyeLSP4, 0.0F, 0.0F, 0.8545132F);
    this.FingerL3B = new ModelRenderer((ModelBase)this, 598, 768);
    this.FingerL3B.setRotationPoint(8.6F, -10.0F, 13.0F);
    this.FingerL3B.addBox(0.0F, 0.0F, 0.0F, 5, 13, 5, 0.0F);
    setRotateAngle(this.FingerL3B, 0.0F, 0.0F, 0.71628314F);
    this.HairSP_13 = new ModelRenderer((ModelBase)this, 283, 1236);
    this.HairSP_13.setRotationPoint(6.0F, 0.0F, 0.0F);
    this.HairSP_13.addBox(0.0F, 0.0F, 0.0F, 26, 7, 29, 0.0F);
    setRotateAngle(this.HairSP_13, 0.0F, 0.0F, 1.1686724F);
    this.PrayerBead15 = new ModelRenderer((ModelBase)this, 66, 70);
    this.PrayerBead15.setRotationPoint(-1.0F, -5.0F, 13.0F);
    this.PrayerBead15.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.FingerL4P1 = new ModelRenderer((ModelBase)this, 626, 748);
    this.FingerL4P1.setRotationPoint(6.0F, -6.8F, 0.0F);
    this.FingerL4P1.addBox(0.0F, 0.0F, 0.0F, 5, 9, 5, 0.0F);
    setRotateAngle(this.FingerL4P1, 0.0F, 0.0F, 0.71628314F);
    this.SleeveSPRL = new ModelRenderer((ModelBase)this, 333, 143);
    this.SleeveSPRL.setRotationPoint(41.8F, 65.0F, 0.0F);
    this.SleeveSPRL.addBox(0.0F, 0.0F, 0.0F, 49, 21, 50, 0.0F);
    setRotateAngle(this.SleeveSPRL, 0.0F, 0.0F, 1.049292F);
    this.EyeRSP7 = new ModelRenderer((ModelBase)this, 218, 1045);
    this.EyeRSP7.setRotationPoint(8.1F, 10.23F, -0.6F);
    this.EyeRSP7.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    setRotateAngle(this.EyeRSP7, 0.0F, 0.0F, -1.8535397F);
    this.Tooth14 = new ModelRenderer((ModelBase)this, 255, 1127);
    this.Tooth14.setRotationPoint(8.3F, -0.7F, 0.02F);
    this.Tooth14.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth14, 0.0F, 0.0F, 0.7853982F);
    this.HairSP_23 = new ModelRenderer((ModelBase)this, 241, 1271);
    this.HairSP_23.setRotationPoint(-0.4F, 2.8F, 0.0F);
    this.HairSP_23.addBox(0.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F);
    setRotateAngle(this.HairSP_23, 0.0F, 0.0F, -0.6346017F);
    this.PrayerBead5 = new ModelRenderer((ModelBase)this, 52, 81);
    this.PrayerBead5.setRotationPoint(6.0F, 11.0F, 13.0F);
    this.PrayerBead5.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.ThumbRP1 = new ModelRenderer((ModelBase)this, 760, 201);
    this.ThumbRP1.setRotationPoint(2.92F, -7.4F, 0.0F);
    this.ThumbRP1.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
    setRotateAngle(this.ThumbRP1, 0.0F, 0.0F, 0.37699112F);
    this.EyeLSP5 = new ModelRenderer((ModelBase)this, 194, 1069);
    this.EyeLSP5.setRotationPoint(24.24F, 7.87F, -0.6F);
    this.EyeLSP5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    setRotateAngle(this.EyeLSP5, 0.0F, 0.0F, 1.3823007F);
    this.FingerR4P1 = new ModelRenderer((ModelBase)this, 763, 108);
    this.FingerR4P1.setRotationPoint(6.0F, -6.8F, 0.0F);
    this.FingerR4P1.addBox(0.0F, 0.0F, 0.0F, 5, 9, 5, 0.0F);
    setRotateAngle(this.FingerR4P1, 0.0F, 0.0F, 0.71628314F);
    this.FingerR2P1 = new ModelRenderer((ModelBase)this, 767, 152);
    this.FingerR2P1.setRotationPoint(4.6F, -7.7F, 0.0F);
    this.FingerR2P1.addBox(0.0F, 0.0F, 0.0F, 5, 9, 5, 0.0F);
    setRotateAngle(this.FingerR2P1, 0.0F, 0.0F, 0.53407073F);
    this.KnifeTipSP5 = new ModelRenderer((ModelBase)this, 301, 1152);
    this.KnifeTipSP5.setRotationPoint(0.81F, 0.01F, 0.0F);
    this.KnifeTipSP5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
    setRotateAngle(this.KnifeTipSP5, 0.0F, 0.0F, -0.16196655F);
    this.PrayerBeadString = new ModelRenderer((ModelBase)this, 72, 94);
    this.PrayerBeadString.setRotationPoint(1.0F, -7.0F, -2.0F);
    this.PrayerBeadString.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString, 0.0F, 0.087964594F, 0.69115037F);
    this.FingerL1B = new ModelRenderer((ModelBase)this, 597, 820);
    this.FingerL1B.setRotationPoint(3.3F, -12.0F, 0.0F);
    this.FingerL1B.addBox(0.0F, 0.0F, 0.0F, 5, 13, 5, 0.0F);
    setRotateAngle(this.FingerL1B, 0.0F, 0.0F, 0.25132743F);
    this.MouthSPLdo = new ModelRenderer((ModelBase)this, 208, 1124);
    this.MouthSPLdo.setRotationPoint(20.0F, 27.0F, -2.0F);
    this.MouthSPLdo.addBox(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
    setRotateAngle(this.MouthSPLdo, 0.0F, -0.7288495F, 0.0F);
    this.PrayerBead17 = new ModelRenderer((ModelBase)this, 93, 70);
    this.PrayerBead17.setRotationPoint(-2.0F, -0.7F, 24.0F);
    this.PrayerBead17.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.NoseSPLL = new ModelRenderer((ModelBase)this, 222, 1093);
    this.NoseSPLL.setRotationPoint(3.8F, 4.0F, 0.0F);
    this.NoseSPLL.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
    this.SleeveLSPB = new ModelRenderer((ModelBase)this, 230, 648);
    this.SleeveLSPB.setRotationPoint(48.0F, 0.0F, -7.0F);
    this.SleeveLSPB.addBox(0.0F, 0.0F, 0.0F, 19, 137, 64, 0.0F);
    this.ThumbLP1 = new ModelRenderer((ModelBase)this, 628, 848);
    this.ThumbLP1.setRotationPoint(2.92F, -7.4F, 0.0F);
    this.ThumbLP1.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
    setRotateAngle(this.ThumbLP1, 0.0F, 0.0F, 0.37699112F);
    this.HornLB = new ModelRenderer((ModelBase)this, 132, 1044);
    this.HornLB.setRotationPoint(29.0F, -0.4F, -2.0F);
    this.HornLB.addBox(0.0F, 0.0F, 0.0F, 4, 7, 4, 0.0F);
    setRotateAngle(this.HornLB, 0.48380527F, -0.7288495F, 0.19477874F);
    this.SleeveRSdo = new ModelRenderer((ModelBase)this, 500, 519);
    this.SleeveRSdo.setRotationPoint(0.0F, 130.0F, 0.0F);
    this.SleeveRSdo.addBox(0.0F, 0.0F, 0.0F, 61, 8, 64, 0.0F);
    this.PalmR = new ModelRenderer((ModelBase)this, 875, 51);
    this.PalmR.setRotationPoint(48.0F, -4.0F, -2.0F);
    this.PalmR.addBox(0.0F, 0.0F, 0.0F, 6, 24, 24, 0.0F);
    this.FingerR1P1 = new ModelRenderer((ModelBase)this, 767, 178);
    this.FingerR1P1.setRotationPoint(4.6F, -7.7F, 0.0F);
    this.FingerR1P1.addBox(0.0F, 0.0F, 0.0F, 5, 9, 5, 0.0F);
    setRotateAngle(this.FingerR1P1, 0.0F, 0.0F, 0.53407073F);
    this.MouthBdo = new ModelRenderer((ModelBase)this, 182, 1124);
    this.MouthBdo.setRotationPoint(11.0F, 27.0F, -2.0F);
    this.MouthBdo.addBox(0.0F, 0.0F, 0.0F, 9, 2, 2, 0.0F);
    this.SleeveRSB = new ModelRenderer((ModelBase)this, 561, 220);
    this.SleeveRSB.setRotationPoint(0.0F, 0.0F, 56.0F);
    this.SleeveRSB.addBox(0.0F, 0.0F, 0.0F, 61, 138, 8, 0.0F);
    this.EyeLSP7 = new ModelRenderer((ModelBase)this, 210, 1069);
    this.EyeLSP7.setRotationPoint(21.3F, 8.23F, -0.6F);
    this.EyeLSP7.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    setRotateAngle(this.EyeLSP7, 0.0F, 0.0F, 1.8535397F);
    this.HairSP_5 = new ModelRenderer((ModelBase)this, 172, 1259);
    this.HairSP_5.setRotationPoint(-2.1F, 6.8F, -4.1F);
    this.HairSP_5.addBox(0.0F, 0.0F, 0.0F, 9, 34, 3, 0.0F);
    this.PrayerBead6 = new ModelRenderer((ModelBase)this, 69, 81);
    this.PrayerBead6.setRotationPoint(6.0F, 17.0F, 19.0F);
    this.PrayerBead6.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.PrayerBead16 = new ModelRenderer((ModelBase)this, 80, 70);
    this.PrayerBead16.setRotationPoint(-2.0F, -4.0F, 21.0F);
    this.PrayerBead16.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.NoseSPRF = new ModelRenderer((ModelBase)this, 186, 1093);
    this.NoseSPRF.setRotationPoint(-1.8F, 4.0F, 0.0F);
    this.NoseSPRF.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    this.Tooth3 = new ModelRenderer((ModelBase)this, 240, 1114);
    this.Tooth3.setRotationPoint(2.4F, 1.2F, 0.02F);
    this.Tooth3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth3, 0.0F, 0.0F, 0.7853982F);
    this.Tooth12 = new ModelRenderer((ModelBase)this, 245, 1127);
    this.Tooth12.setRotationPoint(5.4F, -0.7F, 0.02F);
    this.Tooth12.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth12, 0.0F, 0.0F, 0.7853982F);
    this.Body = new ModelRenderer((ModelBase)this, 4, 272);
    this.Body.setRotationPoint(-48.0F, -124.0F, -28.0F);
    this.Body.addBox(0.0F, 0.0F, 0.0F, 96, 176, 56, 0.0F);
    this.PrayerBead14 = new ModelRenderer((ModelBase)this, 53, 70);
    this.PrayerBead14.setRotationPoint(-1.0F, -7.0F, 6.0F);
    this.PrayerBead14.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.EyeRSP2 = new ModelRenderer((ModelBase)this, 169, 1046);
    this.EyeRSP2.setRotationPoint(1.61F, 4.96F, -0.6F);
    this.EyeRSP2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    this.PrayerBeadString_7 = new ModelRenderer((ModelBase)this, 59, 92);
    this.PrayerBeadString_7.setRotationPoint(-10.0F, 25.0F, 25.0F);
    this.PrayerBeadString_7.addBox(0.0F, 0.0F, 0.0F, 1, 15, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_7, 0.0F, 0.0F, 2.2116811F);
    this.SleeveRSF = new ModelRenderer((ModelBase)this, 560, 370);
    this.SleeveRSF.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.SleeveRSF.addBox(0.0F, 0.0F, 0.0F, 61, 138, 8, 0.0F);
    this.NoseSPRup = new ModelRenderer((ModelBase)this, 184, 1086);
    this.NoseSPRup.setRotationPoint(-1.8F, 4.0F, 0.0F);
    this.NoseSPRup.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
    this.PrayerBead23 = new ModelRenderer((ModelBase)this, 180, 70);
    this.PrayerBead23.setRotationPoint(-5.0F, 25.0F, -4.0F);
    this.PrayerBead23.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.HairSP_14 = new ModelRenderer((ModelBase)this, 283, 1287);
    this.HairSP_14.setRotationPoint(15.0F, 0.03F, 5.2F);
    this.HairSP_14.addBox(0.0F, 0.0F, 0.0F, 25, 7, 26, 0.0F);
    setRotateAngle(this.HairSP_14, 0.0F, 0.42097342F, 0.0F);
    this.SleeveLSF = new ModelRenderer((ModelBase)this, 447, 671);
    this.SleeveLSF.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.SleeveLSF.addBox(0.0F, 0.0F, 0.0F, 61, 138, 8, 0.0F);
    this.PrayerBead24 = new ModelRenderer((ModelBase)this, 196, 70);
    this.PrayerBead24.setRotationPoint(-23.0F, 25.0F, -2.0F);
    this.PrayerBead24.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.PrayerBead10 = new ModelRenderer((ModelBase)this, 130, 81);
    this.PrayerBead10.setRotationPoint(-18.0F, 20.0F, 24.0F);
    this.PrayerBead10.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.HornRP1 = new ModelRenderer((ModelBase)this, 35, 1025);
    this.HornRP1.setRotationPoint(0.0F, -7.0F, 0.0F);
    this.HornRP1.addBox(0.0F, 0.0F, 0.0F, 4, 7, 4, 0.0F);
    this.SleeveLSdo = new ModelRenderer((ModelBase)this, 196, 854);
    this.SleeveLSdo.setRotationPoint(0.0F, 130.0F, 0.0F);
    this.SleeveLSdo.addBox(0.0F, 0.0F, 0.0F, 61, 8, 64, 0.0F);
    this.PrayerBead20 = new ModelRenderer((ModelBase)this, 133, 70);
    this.PrayerBead20.setRotationPoint(6.0F, 18.0F, 12.0F);
    this.PrayerBead20.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.EyeLSP1 = new ModelRenderer((ModelBase)this, 170, 1061);
    this.EyeLSP1.setRotationPoint(16.0F, 5.0F, -0.6F);
    this.EyeLSP1.addBox(0.0F, 0.0F, 0.0F, 11, 2, 1, 0.0F);
    setRotateAngle(this.EyeLSP1, 0.0F, 0.0F, -0.18849556F);
    this.HairB = new ModelRenderer((ModelBase)this, 153, 1195);
    this.HairB.setRotationPoint(-1.0F, -5.0F, 0.0F);
    this.HairB.addBox(0.0F, 0.0F, 0.0F, 32, 5, 29, 0.0F);
    this.EyeLSP3 = new ModelRenderer((ModelBase)this, 183, 1069);
    this.EyeLSP3.setRotationPoint(25.44F, 5.79F, -0.6F);
    this.EyeLSP3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    setRotateAngle(this.EyeLSP3, 0.0F, 0.0F, 0.54035395F);
    this.KnifeB = new ModelRenderer((ModelBase)this, 168, 1140);
    this.KnifeB.setRotationPoint(8.0F, 22.5F, -4.4F);
    this.KnifeB.addBox(0.0F, 0.0F, 0.0F, 16, 4, 4, 0.0F);
    this.PrayerBeadString_3 = new ModelRenderer((ModelBase)this, 29, 94);
    this.PrayerBeadString_3.setRotationPoint(7.0F, 12.0F, 14.9F);
    this.PrayerBeadString_3.addBox(0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_3, 0.7602654F, 0.0F, 0.0F);
    this.PrayerBead7 = new ModelRenderer((ModelBase)this, 85, 81);
    this.PrayerBead7.setRotationPoint(4.0F, 22.0F, 24.0F);
    this.PrayerBead7.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.PrayerBeadString_15 = new ModelRenderer((ModelBase)this, 141, 92);
    this.PrayerBeadString_15.setRotationPoint(7.0F, 26.0F, 3.0F);
    this.PrayerBeadString_15.addBox(0.0F, 0.0F, 0.0F, 1, 12, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_15, -1.6210618F, 1.0555751F, 0.0F);
    this.HairSP_16 = new ModelRenderer((ModelBase)this, 292, 1365);
    this.HairSP_16.setRotationPoint(28.0F, 0.0F, 0.0F);
    this.HairSP_16.addBox(0.0F, 0.0F, 0.0F, 23, 7, 19, 0.0F);
    setRotateAngle(this.HairSP_16, 0.0F, -0.69115037F, 0.0F);
    this.ArmR = new ModelRenderer((ModelBase)this, 730, 61);
    this.ArmR.setRotationPoint(18.0F, 5.0F, 23.0F);
    this.ArmR.addBox(0.0F, 0.0F, 0.0F, 49, 19, 20, 0.0F);
    this.Tooth13 = new ModelRenderer((ModelBase)this, 250, 1127);
    this.Tooth13.setRotationPoint(6.8F, -0.7F, 0.02F);
    this.Tooth13.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth13, 0.0F, 0.0F, 0.7853982F);
    this.SleeveLSup = new ModelRenderer((ModelBase)this, 197, 935);
    this.SleeveLSup.setRotationPoint(0.0F, -0.2F, 0.0F);
    this.SleeveLSup.addBox(0.0F, 0.0F, 0.0F, 61, 5, 64, 0.0F);
    this.PrayerBeadString_2 = new ModelRenderer((ModelBase)this, 23, 94);
    this.PrayerBeadString_2.setRotationPoint(9.0F, 7.0F, 8.0F);
    this.PrayerBeadString_2.addBox(0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_2, 0.7602654F, 0.0F, 0.37699112F);
    this.HairSP_6 = new ModelRenderer((ModelBase)this, 198, 1270);
    this.HairSP_6.setRotationPoint(7.9F, 7.0F, -4.1F);
    this.HairSP_6.addBox(0.0F, 0.0F, 0.0F, 3, 12, 3, 0.0F);
    setRotateAngle(this.HairSP_6, 0.0F, 0.0F, 0.57176983F);
    this.MouthSPRup = new ModelRenderer((ModelBase)this, 166, 1114);
    this.MouthSPRup.setRotationPoint(8.8F, 20.0F, 0.0F);
    this.MouthSPRup.addBox(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
    setRotateAngle(this.MouthSPRup, 0.0F, 0.7288495F, 0.0F);
    this.PrayerBead12 = new ModelRenderer((ModelBase)this, 149, 81);
    this.PrayerBead12.setRotationPoint(-34.0F, 10.0F, 23.0F);
    this.PrayerBead12.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.PrayerBead1 = new ModelRenderer((ModelBase)this, 37, 71);
    this.PrayerBead1.setRotationPoint(-2.0F, -8.0F, -3.0F);
    this.PrayerBead1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.PrayerBead27 = new ModelRenderer((ModelBase)this, 240, 70);
    this.PrayerBead27.setRotationPoint(-39.0F, 6.0F, -1.0F);
    this.PrayerBead27.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.PrayerBeadString_5 = new ModelRenderer((ModelBase)this, 45, 94);
    this.PrayerBeadString_5.setRotationPoint(4.0F, 23.0F, 25.0F);
    this.PrayerBeadString_5.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_5, 0.0F, 0.0F, 1.2126547F);
    this.Tooth2 = new ModelRenderer((ModelBase)this, 233, 1114);
    this.Tooth2.setRotationPoint(0.8F, 1.2F, 0.02F);
    this.Tooth2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth2, 0.0F, 0.0F, 0.7853982F);
    this.NoseSPLF = new ModelRenderer((ModelBase)this, 214, 1093);
    this.NoseSPLF.setRotationPoint(2.8F, 4.0F, 0.0F);
    this.NoseSPLF.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    this.HornLP1 = new ModelRenderer((ModelBase)this, 131, 1025);
    this.HornLP1.setRotationPoint(0.0F, -7.0F, 0.0F);
    this.HornLP1.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
    this.HairSP_11 = new ModelRenderer((ModelBase)this, 63, 1365);
    this.HairSP_11.setRotationPoint(28.0F, 0.0F, 0.0F);
    this.HairSP_11.addBox(0.0F, 0.0F, 0.0F, 23, 7, 19, 0.0F);
    setRotateAngle(this.HairSP_11, 0.0F, -0.69115037F, 0.0F);
    this.Tooth8 = new ModelRenderer((ModelBase)this, 225, 1127);
    this.Tooth8.setRotationPoint(1.0F, -0.7F, 0.02F);
    this.Tooth8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth8, 0.0F, 0.0F, 0.7853982F);
    this.KnifeFiller1 = new ModelRenderer((ModelBase)this, 254, 1141);
    this.KnifeFiller1.setRotationPoint(15.0F, 0.3F, 0.01F);
    this.KnifeFiller1.addBox(0.0F, 0.0F, 0.0F, 2, 3, 4, 0.0F);
    this.KnifeTipSP4 = new ModelRenderer((ModelBase)this, 287, 1152);
    this.KnifeTipSP4.setRotationPoint(0.82F, 0.02F, 0.0F);
    this.KnifeTipSP4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
    setRotateAngle(this.KnifeTipSP4, 0.0F, 0.0F, -0.16196655F);
    this.HairSP_24 = new ModelRenderer((ModelBase)this, 414, 1351);
    this.HairSP_24.setRotationPoint(0.0F, 39.0F, 0.0F);
    this.HairSP_24.addBox(0.0F, 0.0F, 0.0F, 32, 22, 7, 0.0F);
    setRotateAngle(this.HairSP_24, 1.0555751F, 0.0F, 0.0F);
    this.HairSP_1 = new ModelRenderer((ModelBase)this, 283, 1191);
    this.HairSP_1.setRotationPoint(32.0F, 0.0F, 0.0F);
    this.HairSP_1.addBox(0.0F, 0.0F, 0.0F, 6, 8, 29, 0.0F);
    setRotateAngle(this.HairSP_1, 0.0F, 0.0F, 0.40212387F);
    this.Tooth3_1 = new ModelRenderer((ModelBase)this, 245, 1114);
    this.Tooth3_1.setRotationPoint(3.9F, 1.2F, 0.02F);
    this.Tooth3_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth3_1, 0.0F, 0.0F, 0.7853982F);
    this.PrayerBead21 = new ModelRenderer((ModelBase)this, 150, 70);
    this.PrayerBead21.setRotationPoint(6.0F, 21.0F, 7.0F);
    this.PrayerBead21.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.HornLTip = new ModelRenderer((ModelBase)this, 132, 1015);
    this.HornLTip.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.HornLTip.addBox(0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F);
    setRotateAngle(this.HornLTip, 0.7853982F, 0.0F, 0.0F);
    this.NoseB = new ModelRenderer((ModelBase)this, 196, 1082);
    this.NoseB.setRotationPoint(14.0F, 10.0F, 0.0F);
    this.NoseB.addBox(0.0F, 0.0F, 0.0F, 3, 6, 3, 0.0F);
    setRotateAngle(this.NoseB, -0.28902653F, 0.0F, 0.0F);
    this.FingerR4B = new ModelRenderer((ModelBase)this, 737, 108);
    this.FingerR4B.setRotationPoint(3.8F, -7.1F, 0.0F);
    this.FingerR4B.addBox(0.0F, 0.0F, 0.0F, 5, 8, 5, 0.0F);
    setRotateAngle(this.FingerR4B, 0.0F, 0.0F, 0.47752208F);
    this.PalmL = new ModelRenderer((ModelBase)this, 744, 691);
    this.PalmL.setRotationPoint(48.0F, -4.0F, -2.0F);
    this.PalmL.addBox(0.0F, 0.0F, 0.0F, 6, 24, 24, 0.0F);
    this.PrayerBeadString_17 = new ModelRenderer((ModelBase)this, 147, 93);
    this.PrayerBeadString_17.setRotationPoint(-3.0F, 26.0F, -2.0F);
    this.PrayerBeadString_17.addBox(0.0F, 0.0F, 0.0F, 1, 19, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_17, -1.595929F, 1.6524777F, 0.0F);
    this.HairSP_3 = new ModelRenderer((ModelBase)this, 414, 1272);
    this.HairSP_3.setRotationPoint(0.0F, 0.0F, 29.0F);
    this.HairSP_3.addBox(0.0F, 0.0F, 0.0F, 32, 8, 6, 0.0F);
    setRotateAngle(this.HairSP_3, -0.50265485F, -0.008726646F, 0.0F);
    this.CollarSPL = new ModelRenderer((ModelBase)this, 84, 238);
    this.CollarSPL.setRotationPoint(76.0F, 0.0F, -2.0F);
    this.CollarSPL.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
    this.SleeveRB = new ModelRenderer((ModelBase)this, 327, 12);
    this.SleeveRB.setRotationPoint(0.0F, 0.0F, 53.0F);
    this.SleeveRB.addBox(0.0F, 0.0F, 0.0F, 54, 76, 50, 0.0F);
    setRotateAngle(this.SleeveRB, 0.0F, 3.1415927F, -0.06283186F);
    this.PrayerBeadString_12 = new ModelRenderer((ModelBase)this, 114, 94);
    this.PrayerBeadString_12.setRotationPoint(0.0F, 1.0F, 25.0F);
    this.PrayerBeadString_12.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_12, 0.0F, 0.0F, -0.8859291F);
    this.MouthSPRdo = new ModelRenderer((ModelBase)this, 166, 1124);
    this.MouthSPRdo.setRotationPoint(8.8F, 27.0F, 0.0F);
    this.MouthSPRdo.addBox(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
    setRotateAngle(this.MouthSPRdo, 0.0F, 0.7288495F, 0.0F);
    this.EyeLSP6 = new ModelRenderer((ModelBase)this, 201, 1069);
    this.EyeLSP6.setRotationPoint(22.72F, 8.2F, -0.6F);
    this.EyeLSP6.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    setRotateAngle(this.EyeLSP6, 0.0F, 0.0F, 1.6084955F);
    this.HairSP_19 = new ModelRenderer((ModelBase)this, 220, 1283);
    this.HairSP_19.setRotationPoint(0.0F, 14.2F, 0.6F);
    this.HairSP_19.addBox(0.0F, 0.0F, 0.0F, 6, 7, 3, 0.0F);
    setRotateAngle(this.HairSP_19, -0.6346017F, 0.0F, 0.0F);
    this.Tooth7 = new ModelRenderer((ModelBase)this, 265, 1114);
    this.Tooth7.setRotationPoint(2.0F, 1.2F, 0.02F);
    this.Tooth7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth7, 0.0F, 0.0F, 0.6963864F);
    this.CollarL = new ModelRenderer((ModelBase)this, 121, 221);
    this.CollarL.setRotationPoint(76.0F, 0.0F, -2.0F);
    this.CollarL.addBox(0.0F, 0.0F, 0.0F, 6, 42, 4, 0.0F);
    setRotateAngle(this.CollarL, 0.0F, 0.0F, 0.7853982F);
    this.NoseSPLup = new ModelRenderer((ModelBase)this, 211, 1086);
    this.NoseSPLup.setRotationPoint(2.8F, 4.0F, 0.0F);
    this.NoseSPLup.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
    this.KnifeTipSP3 = new ModelRenderer((ModelBase)this, 273, 1150);
    this.KnifeTipSP3.setRotationPoint(0.8F, 0.02F, 0.0F);
    this.KnifeTipSP3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
    setRotateAngle(this.KnifeTipSP3, 0.0F, 0.0F, -0.16196655F);
    this.PrayerBeadString_14 = new ModelRenderer((ModelBase)this, 132, 95);
    this.PrayerBeadString_14.setRotationPoint(7.0F, 19.0F, 12.0F);
    this.PrayerBeadString_14.addBox(0.0F, 0.0F, 0.0F, 1, 12, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_14, -0.9110619F, 0.0F, 0.0F);
    this.PrayerBead8 = new ModelRenderer((ModelBase)this, 101, 81);
    this.PrayerBead8.setRotationPoint(-4.0F, 24.0F, 24.0F);
    this.PrayerBead8.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.Tooth11 = new ModelRenderer((ModelBase)this, 240, 1127);
    this.Tooth11.setRotationPoint(3.9F, -0.7F, 0.02F);
    this.Tooth11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth11, 0.0F, 0.0F, 0.7853982F);
    this.PrayerBead3 = new ModelRenderer((ModelBase)this, 22, 81);
    this.PrayerBead3.setRotationPoint(8.0F, 0.0F, 0.0F);
    this.PrayerBead3.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.PrayerBeadString_1 = new ModelRenderer((ModelBase)this, 16, 93);
    this.PrayerBeadString_1.setRotationPoint(9.0F, 1.0F, 2.0F);
    this.PrayerBeadString_1.addBox(0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_1, 0.7602654F, 0.0F, 0.0F);
    this.HornRB = new ModelRenderer((ModelBase)this, 36, 1043);
    this.HornRB.setRotationPoint(-3.2F, 0.6F, 0.9F);
    this.HornRB.addBox(0.0F, 0.0F, 0.0F, 4, 7, 4, 0.0F);
    setRotateAngle(this.HornRB, 0.49008846F, 0.71628314F, -0.16964601F);
    this.Tooth5 = new ModelRenderer((ModelBase)this, 255, 1114);
    this.Tooth5.setRotationPoint(6.8F, 1.2F, 0.02F);
    this.Tooth5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth5, 0.0F, 0.0F, 0.7853982F);
    this.FingerL1P1 = new ModelRenderer((ModelBase)this, 626, 820);
    this.FingerL1P1.setRotationPoint(4.6F, -7.7F, 0.0F);
    this.FingerL1P1.addBox(0.0F, 0.0F, 0.0F, 5, 9, 5, 0.0F);
    setRotateAngle(this.FingerL1P1, 0.0F, 0.0F, 0.53407073F);
    this.PrayerBeadString_4 = new ModelRenderer((ModelBase)this, 37, 93);
    this.PrayerBeadString_4.setRotationPoint(7.0F, 18.0F, 20.9F);
    this.PrayerBeadString_4.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_4, 0.7602654F, 0.0F, 0.33300883F);
    this.PrayerBeadString_6 = new ModelRenderer((ModelBase)this, 53, 94);
    this.PrayerBeadString_6.setRotationPoint(-4.0F, 25.0F, 25.0F);
    this.PrayerBeadString_6.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_6, 0.0F, 0.0F, 1.5707964F);
    this.SleeveRSPB = new ModelRenderer((ModelBase)this, 550, 13);
    this.SleeveRSPB.setRotationPoint(48.0F, 0.0F, -7.0F);
    this.SleeveRSPB.addBox(0.0F, 0.0F, 0.0F, 19, 138, 64, 0.0F);
    this.ThumbRB = new ModelRenderer((ModelBase)this, 737, 198);
    this.ThumbRB.setRotationPoint(2.0F, 11.0F, 25.0F);
    this.ThumbRB.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
    setRotateAngle(this.ThumbRB, -0.5969026F, 0.0F, 0.18849556F);
    this.EyeRSP5 = new ModelRenderer((ModelBase)this, 200, 1045);
    this.EyeRSP5.setRotationPoint(4.15F, 9.95F, -0.6F);
    this.EyeRSP5.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    setRotateAngle(this.EyeRSP5, 0.0F, 0.0F, -1.3823007F);
    this.PrayerBead26 = new ModelRenderer((ModelBase)this, 226, 70);
    this.PrayerBead26.setRotationPoint(-35.0F, 12.0F, -1.0F);
    this.PrayerBead26.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.KnifeTipSP7 = new ModelRenderer((ModelBase)this, 326, 1152);
    this.KnifeTipSP7.setRotationPoint(4.4F, 0.0F, 0.0F);
    this.KnifeTipSP7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
    this.HairSP_4 = new ModelRenderer((ModelBase)this, 414, 1296);
    this.HairSP_4.setRotationPoint(0.0F, 2.9F, 27.7F);
    this.HairSP_4.addBox(0.0F, 0.0F, 0.0F, 32, 39, 7, 0.0F);
    this.PrayerBead11 = new ModelRenderer((ModelBase)this, 130, 81);
    this.PrayerBead11.setRotationPoint(-25.0F, 15.0F, 24.0F);
    this.PrayerBead11.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.KnifeTipSP6 = new ModelRenderer((ModelBase)this, 315, 1152);
    this.KnifeTipSP6.setRotationPoint(0.8F, 0.02F, 0.0F);
    this.KnifeTipSP6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
    setRotateAngle(this.KnifeTipSP6, 0.0F, 0.0F, -0.16196655F);
    this.PrayerBeadString_16 = new ModelRenderer((ModelBase)this, 9, 92);
    this.PrayerBeadString_16.setRotationPoint(5.0F, -2.9F, -2.0F);
    this.PrayerBeadString_16.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_16, 0.7602654F, 0.747699F, 0.0F);
    this.MouthSPLup = new ModelRenderer((ModelBase)this, 208, 1114);
    this.MouthSPLup.setRotationPoint(20.0F, 20.0F, -2.0F);
    this.MouthSPLup.addBox(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
    setRotateAngle(this.MouthSPLup, 0.0F, -0.7288495F, 0.0F);
    this.PrayerBeadString_8 = new ModelRenderer((ModelBase)this, 65, 89);
    this.PrayerBeadString_8.setRotationPoint(-23.0F, 17.0F, 25.0F);
    this.PrayerBeadString_8.addBox(0.0F, 0.0F, 0.0F, 1, 30, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_8, -0.10053097F, 0.0F, 2.2116811F);
    this.MouthBup = new ModelRenderer((ModelBase)this, 183, 1114);
    this.MouthBup.setRotationPoint(11.0F, 20.0F, -2.0F);
    this.MouthBup.addBox(0.0F, 0.0F, 0.0F, 9, 2, 2, 0.0F);
    this.HairSP_7 = new ModelRenderer((ModelBase)this, 195, 1259);
    this.HairSP_7.setRotationPoint(6.5F, 6.8F, -4.1F);
    this.HairSP_7.addBox(0.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F);
    this.SleeveLB = new ModelRenderer((ModelBase)this, 15, 664);
    this.SleeveLB.setRotationPoint(96.0F, 0.0F, 3.0F);
    this.SleeveLB.addBox(0.0F, 0.0F, 0.0F, 54, 76, 50, 0.0F);
    setRotateAngle(this.SleeveLB, 0.0F, 0.0F, 0.06283186F);
    this.PrayerBead4 = new ModelRenderer((ModelBase)this, 37, 81);
    this.PrayerBead4.setRotationPoint(8.0F, 5.0F, 6.0F);
    this.PrayerBead4.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.PrayerBeadString_11 = new ModelRenderer((ModelBase)this, 106, 94);
    this.PrayerBeadString_11.setRotationPoint(-1.0F, -3.0F, 23.0F);
    this.PrayerBeadString_11.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_11, 0.31415927F, 0.0F, 0.0F);
    this.EyeRSP3 = new ModelRenderer((ModelBase)this, 179, 1045);
    this.EyeRSP3.setRotationPoint(1.61F, 6.94F, -0.6F);
    this.EyeRSP3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    setRotateAngle(this.EyeRSP3, 0.0F, 0.0F, -0.54035395F);
    this.EyeRSP4 = new ModelRenderer((ModelBase)this, 189, 1045);
    this.EyeRSP4.setRotationPoint(2.64F, 8.64F, -0.6F);
    this.EyeRSP4.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    setRotateAngle(this.EyeRSP4, 0.0F, 0.0F, -0.8545132F);
    this.FingerL3P1 = new ModelRenderer((ModelBase)this, 626, 768);
    this.FingerL3P1.setRotationPoint(5.2F, -7.4F, 0.0F);
    this.FingerL3P1.addBox(0.0F, 0.0F, 0.0F, 5, 9, 5, 0.0F);
    setRotateAngle(this.FingerL3P1, 0.0F, 0.0F, 0.61575216F);
    this.PrayerBead19 = new ModelRenderer((ModelBase)this, 119, 70);
    this.PrayerBead19.setRotationPoint(6.0F, 10.0F, 20.0F);
    this.PrayerBead19.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.FingerL2P1 = new ModelRenderer((ModelBase)this, 626, 796);
    this.FingerL2P1.setRotationPoint(4.6F, -7.7F, 0.0F);
    this.FingerL2P1.addBox(0.0F, 0.0F, 0.0F, 5, 9, 5, 0.0F);
    setRotateAngle(this.FingerL2P1, 0.0F, 0.0F, 0.53407073F);
    this.HairSP_18 = new ModelRenderer((ModelBase)this, 220, 1259);
    this.HairSP_18.setRotationPoint(28.0F, 8.0F, 0.0F);
    this.HairSP_18.addBox(0.0F, 0.0F, 0.0F, 6, 16, 3, 0.0F);
    setRotateAngle(this.HairSP_18, 0.5466371F, 0.0F, 0.0F);
    this.SleeveRSup = new ModelRenderer((ModelBase)this, 506, 596);
    this.SleeveRSup.setRotationPoint(0.0F, -0.2F, 0.0F);
    this.SleeveRSup.addBox(0.0F, 0.0F, 0.0F, 61, 5, 64, 0.0F);
    this.Neck = new ModelRenderer((ModelBase)this, 65, 1128);
    this.Neck.setRotationPoint(42.0F, -15.0F, 18.0F);
    this.Neck.addBox(0.0F, 0.0F, 0.0F, 17, 15, 17, 0.0F);
    this.ArmL = new ModelRenderer((ModelBase)this, 596, 700);
    this.ArmL.setRotationPoint(18.0F, 5.0F, 23.0F);
    this.ArmL.addBox(0.0F, 0.0F, 0.0F, 49, 19, 20, 0.0F);
    this.EyeRSP1 = new ModelRenderer((ModelBase)this, 169, 1038);
    this.EyeRSP1.setRotationPoint(2.0F, 3.0F, -0.6F);
    this.EyeRSP1.addBox(0.0F, 0.0F, 0.0F, 11, 2, 1, 0.0F);
    setRotateAngle(this.EyeRSP1, 0.0F, 0.0F, 0.18849556F);
    this.HairSP_12 = new ModelRenderer((ModelBase)this, 63, 1400);
    this.HairSP_12.setRotationPoint(23.0F, 0.0F, 0.0F);
    this.HairSP_12.addBox(0.0F, 0.0F, 0.0F, 32, 7, 12, 0.0F);
    setRotateAngle(this.HairSP_12, 0.0F, -0.8733628F, 0.0F);
    this.PrayerBead9 = new ModelRenderer((ModelBase)this, 115, 81);
    this.PrayerBead9.setRotationPoint(-12.0F, 24.0F, 24.0F);
    this.PrayerBead9.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.HairSP_15 = new ModelRenderer((ModelBase)this, 288, 1329);
    this.HairSP_15.setRotationPoint(8.0F, 0.02F, 18.0F);
    this.HairSP_15.addBox(0.0F, 0.0F, 0.0F, 28, 7, 19, 0.0F);
    setRotateAngle(this.HairSP_15, 0.0F, 1.1435397F, 0.0F);
    this.HairSP_8 = new ModelRenderer((ModelBase)this, 48, 1236);
    this.HairSP_8.setRotationPoint(-10.2F, 24.0F, 0.0F);
    this.HairSP_8.addBox(0.0F, 0.0F, 0.0F, 26, 6, 29, 0.0F);
    setRotateAngle(this.HairSP_8, 0.0F, 0.0F, -1.1686724F);
    this.HairSP_21 = new ModelRenderer((ModelBase)this, 220, 1298);
    this.HairSP_21.setRotationPoint(0.0F, 7.0F, 0.0F);
    this.HairSP_21.addBox(0.0F, 0.0F, 0.0F, 6, 12, 3, 0.0F);
    setRotateAngle(this.HairSP_21, 0.67858404F, 0.0F, 0.03141593F);
    this.FingerL2B = new ModelRenderer((ModelBase)this, 597, 793);
    this.FingerL2B.setRotationPoint(5.7F, -12.1F, 7.0F);
    this.FingerL2B.addBox(0.0F, 0.0F, 0.0F, 5, 13, 5, 0.0F);
    setRotateAngle(this.FingerL2B, 0.0F, 0.0F, 0.41469023F);
    this.EyeLSP2 = new ModelRenderer((ModelBase)this, 172, 1069);
    this.EyeLSP2.setRotationPoint(25.16F, 4.86F, -0.6F);
    this.EyeLSP2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    this.EyeLSP8 = new ModelRenderer((ModelBase)this, 220, 1069);
    this.EyeLSP8.setRotationPoint(20.32F, 8.27F, -0.6F);
    this.EyeLSP8.addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    setRotateAngle(this.EyeLSP8, 0.0F, 0.0F, 2.4253094F);
    this.HairSP_20 = new ModelRenderer((ModelBase)this, 241, 1259);
    this.HairSP_20.setRotationPoint(4.0F, 0.0F, 0.0F);
    this.HairSP_20.addBox(0.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F);
    this.HairSP = new ModelRenderer((ModelBase)this, 69, 1191);
    this.HairSP.setRotationPoint(-5.6F, 2.3F, 0.0F);
    this.HairSP.addBox(0.0F, 0.0F, 0.0F, 6, 8, 29, 0.0F);
    setRotateAngle(this.HairSP, 0.0F, 0.0F, -0.40212387F);
    this.FingerR2B = new ModelRenderer((ModelBase)this, 739, 152);
    this.FingerR2B.setRotationPoint(5.7F, -12.1F, 13.0F);
    this.FingerR2B.addBox(0.0F, 0.0F, 0.0F, 5, 13, 5, 0.0F);
    setRotateAngle(this.FingerR2B, 0.0F, 0.0F, 0.41469023F);
    this.PrayerBead13 = new ModelRenderer((ModelBase)this, 164, 81);
    this.PrayerBead13.setRotationPoint(-40.0F, 5.0F, 23.0F);
    this.PrayerBead13.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.SleeveSPLR = new ModelRenderer((ModelBase)this, 19, 808);
    this.SleeveSPLR.setRotationPoint(41.8F, 65.0F, 0.0F);
    this.SleeveSPLR.addBox(0.0F, 0.0F, 0.0F, 49, 21, 50, 0.0F);
    setRotateAngle(this.SleeveSPLR, 0.0F, 0.0F, 1.049292F);
    this.SleeveLSB = new ModelRenderer((ModelBase)this, 447, 833);
    this.SleeveLSB.setRotationPoint(0.0F, 0.0F, 56.0F);
    this.SleeveLSB.addBox(0.0F, 0.0F, 0.0F, 61, 138, 8, 0.0F);
    this.NoseSPRR = new ModelRenderer((ModelBase)this, 177, 1092);
    this.NoseSPRR.setRotationPoint(-1.8F, 4.0F, 0.0F);
    this.NoseSPRR.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
    this.HornRTip = new ModelRenderer((ModelBase)this, 35, 1015);
    this.HornRTip.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.HornRTip.addBox(0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F);
    setRotateAngle(this.HornRTip, 0.7853982F, 0.0F, 0.0F);
    this.Tooth7_1 = new ModelRenderer((ModelBase)this, 260, 1127);
    this.Tooth7_1.setRotationPoint(2.0F, -0.6F, 0.02F);
    this.Tooth7_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth7_1, 0.0F, 0.0F, 0.6963864F);
    this.HairSP_10 = new ModelRenderer((ModelBase)this, 59, 1329);
    this.HairSP_10.setRotationPoint(8.0F, 0.0F, 18.0F);
    this.HairSP_10.addBox(0.0F, 0.0F, 0.0F, 28, 7, 19, 0.0F);
    setRotateAngle(this.HairSP_10, -0.0062831854F, 1.1435397F, 0.0F);
    this.FingerR1B = new ModelRenderer((ModelBase)this, 737, 172);
    this.FingerR1B.setRotationPoint(3.3F, -12.0F, 19.0F);
    this.FingerR1B.addBox(0.0F, 0.0F, 0.0F, 5, 13, 5, 0.0F);
    setRotateAngle(this.FingerR1B, 0.0F, 0.0F, 0.25132743F);
    this.EyeRSP6 = new ModelRenderer((ModelBase)this, 210, 1045);
    this.EyeRSP6.setRotationPoint(6.11F, 10.3F, -0.6F);
    this.EyeRSP6.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    setRotateAngle(this.EyeRSP6, 0.0F, 0.0F, -1.6084955F);
    this.KnifeTipSP2 = new ModelRenderer((ModelBase)this, 262, 1150);
    this.KnifeTipSP2.setRotationPoint(0.8F, 0.02F, 0.0F);
    this.KnifeTipSP2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
    setRotateAngle(this.KnifeTipSP2, 0.0F, 0.0F, -0.16196655F);
    this.PrayerBead18 = new ModelRenderer((ModelBase)this, 106, 70);
    this.PrayerBead18.setRotationPoint(5.0F, 5.0F, 24.0F);
    this.PrayerBead18.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.Tooth4 = new ModelRenderer((ModelBase)this, 250, 1114);
    this.Tooth4.setRotationPoint(5.4F, 1.2F, 0.02F);
    this.Tooth4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth4, 0.0F, 0.0F, 0.7853982F);
    this.HairSP_26 = new ModelRenderer((ModelBase)this, 174, 1299);
    this.HairSP_26.setRotationPoint(4.6F, 29.8F, 0.0F);
    this.HairSP_26.addBox(0.0F, 0.0F, 0.0F, 6, 6, 3, 0.0F);
    setRotateAngle(this.HairSP_26, 0.0F, 0.0F, 0.7853982F);
    this.Tooth9 = new ModelRenderer((ModelBase)this, 230, 1127);
    this.Tooth9.setRotationPoint(0.8F, -0.7F, 0.02F);
    this.Tooth9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth9, 0.0F, 0.0F, 0.7853982F);
    this.HairSP_22 = new ModelRenderer((ModelBase)this, 223, 1317);
    this.HairSP_22.setRotationPoint(3.0F, 9.1F, 0.0F);
    this.HairSP_22.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
    setRotateAngle(this.HairSP_22, 0.0F, 0.0F, 0.7853982F);
    this.Tooth10 = new ModelRenderer((ModelBase)this, 235, 1127);
    this.Tooth10.setRotationPoint(2.4F, -0.7F, 0.02F);
    this.Tooth10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth10, 0.0F, 0.0F, 0.7853982F);
    this.PrayerBeadString_13 = new ModelRenderer((ModelBase)this, 124, 93);
    this.PrayerBeadString_13.setRotationPoint(7.0F, 7.0F, 24.0F);
    this.PrayerBeadString_13.addBox(0.0F, 0.0F, 0.0F, 1, 17, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_13, -0.7099999F, 0.0F, 0.0F);
    this.FingerR3P1 = new ModelRenderer((ModelBase)this, 764, 126);
    this.FingerR3P1.setRotationPoint(5.2F, -7.4F, 0.0F);
    this.FingerR3P1.addBox(0.0F, 0.0F, 0.0F, 5, 9, 5, 0.0F);
    setRotateAngle(this.FingerR3P1, 0.0F, 0.0F, 0.61575216F);
    this.HairSP_2 = new ModelRenderer((ModelBase)this, 177, 1240);
    this.HairSP_2.setRotationPoint(-2.1F, 0.0F, 0.0F);
    this.HairSP_2.addBox(0.0F, 0.0F, 0.0F, 36, 8, 3, 0.0F);
    setRotateAngle(this.HairSP_2, -0.5466371F, 0.0F, 0.0F);
    this.PrayerBeadString_18 = new ModelRenderer((ModelBase)this, 157, 93);
    this.PrayerBeadString_18.setRotationPoint(-22.0F, 26.0F, 0.0F);
    this.PrayerBeadString_18.addBox(0.0F, 0.0F, 0.0F, 1, 31, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_18, -1.595929F, 1.6399114F, 0.84823F);
    this.Head = new ModelRenderer((ModelBase)this, 40, 1057);
    this.Head.setRotationPoint(-6.0F, -31.0F, -5.0F);
    this.Head.addBox(0.0F, 0.0F, 0.0F, 29, 31, 29, 0.0F);
    this.CollarSPR2 = new ModelRenderer((ModelBase)this, 13, 237);
    this.CollarSPR2.setRotationPoint(20.76F, 0.24F, -2.0F);
    this.CollarSPR2.addBox(0.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F);
    this.Tooth6 = new ModelRenderer((ModelBase)this, 260, 1114);
    this.Tooth6.setRotationPoint(8.3F, 1.2F, 0.02F);
    this.Tooth6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth6, 0.0F, 0.0F, 0.7853982F);
    this.PrayerBeadString_10 = new ModelRenderer((ModelBase)this, 71, 110);
    this.PrayerBeadString_10.setRotationPoint(1.0F, -6.0F, 8.0F);
    this.PrayerBeadString_10.addBox(0.0F, 0.0F, 0.0F, 16, 1, 1, 0.0F);
    setRotateAngle(this.PrayerBeadString_10, -0.2576106F, -1.765575F, -1.0932742F);
    this.KnifeTipup = new ModelRenderer((ModelBase)this, 284, 1141);
    this.KnifeTipup.setRotationPoint(14.3F, 0.01F, 0.01F);
    this.KnifeTipup.addBox(0.0F, 0.0F, 0.0F, 5, 1, 4, 0.0F);
    this.ThumbLB = new ModelRenderer((ModelBase)this, 600, 848);
    this.ThumbLB.setRotationPoint(2.0F, 13.0F, -6.0F);
    this.ThumbLB.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
    setRotateAngle(this.ThumbLB, 0.5969026F, 0.0F, 0.18849556F);
    this.PrayerBead2 = new ModelRenderer((ModelBase)this, 22, 71);
    this.PrayerBead2.setRotationPoint(4.0F, -4.0F, -3.0F);
    this.PrayerBead2.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
    this.KnifeBlade = new ModelRenderer((ModelBase)this, 210, 1141);
    this.KnifeBlade.setRotationPoint(16.0F, 0.0F, 0.0F);
    this.KnifeBlade.addBox(0.0F, 0.0F, 0.0F, 15, 4, 4, 0.0F);
    this.KnifeTipSP1 = new ModelRenderer((ModelBase)this, 249, 1150);
    this.KnifeTipSP1.setRotationPoint(14.82F, 3.01F, 0.0F);
    this.KnifeTipSP1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
    setRotateAngle(this.KnifeTipSP1, 0.0F, 0.0F, -0.16196655F);
    this.PalmL.addChild(this.PrayerBead25);
    this.Body.addChild(this.CollarR);
    this.Head.addChild(this.EyeRSP8);
    this.PalmL.addChild(this.PrayerBead22);
    this.PalmR.addChild(this.FingerR3B);
    this.HairSP_8.addChild(this.HairSP_9);
    this.PalmL.addChild(this.PrayerBeadString_9);
    this.Body.addChild(this.CollarSPL2);
    this.PalmL.addChild(this.FingerL4B);
    this.HairSP_24.addChild(this.HairSP_25);
    this.Body.addChild(this.CollarSPR);
    this.KnifeFiller1.addChild(this.KnifeFiller2);
    this.MouthSPRup.addChild(this.Tooth1);
    this.HairSP_16.addChild(this.HairSP_17);
    this.MouthBup.addChild(this.MouthSPupup);
    this.Head.addChild(this.EyeLSP4);
    this.PalmL.addChild(this.FingerL3B);
    this.HairSP_1.addChild(this.HairSP_13);
    this.PalmL.addChild(this.PrayerBead15);
    this.FingerL4B.addChild(this.FingerL4P1);
    this.SleeveRB.addChild(this.SleeveSPRL);
    this.Head.addChild(this.EyeRSP7);
    this.MouthBdo.addChild(this.Tooth14);
    this.HairSP_20.addChild(this.HairSP_23);
    this.PalmL.addChild(this.PrayerBead5);
    this.ThumbRB.addChild(this.ThumbRP1);
    this.Head.addChild(this.EyeLSP5);
    this.FingerR4B.addChild(this.FingerR4P1);
    this.FingerR2B.addChild(this.FingerR2P1);
    this.KnifeTipSP4.addChild(this.KnifeTipSP5);
    this.PalmL.addChild(this.PrayerBeadString);
    this.PalmL.addChild(this.FingerL1B);
    this.Head.addChild(this.MouthSPLdo);
    this.PalmL.addChild(this.PrayerBead17);
    this.NoseB.addChild(this.NoseSPLL);
    this.SleeveLB.addChild(this.SleeveLSPB);
    this.ThumbLB.addChild(this.ThumbLP1);
    this.Head.addChild(this.HornLB);
    this.SleeveRSPB.addChild(this.SleeveRSdo);
    this.ArmR.addChild(this.PalmR);
    this.FingerR1B.addChild(this.FingerR1P1);
    this.Head.addChild(this.MouthBdo);
    this.SleeveRSPB.addChild(this.SleeveRSB);
    this.Head.addChild(this.EyeLSP7);
    this.HairB.addChild(this.HairSP_5);
    this.PalmL.addChild(this.PrayerBead6);
    this.PalmL.addChild(this.PrayerBead16);
    this.NoseB.addChild(this.NoseSPRF);
    this.MouthBup.addChild(this.Tooth3);
    this.MouthBdo.addChild(this.Tooth12);
    this.PalmL.addChild(this.PrayerBead14);
    this.Head.addChild(this.EyeRSP2);
    this.PalmL.addChild(this.PrayerBeadString_7);
    this.SleeveRSPB.addChild(this.SleeveRSF);
    this.NoseB.addChild(this.NoseSPRup);
    this.PalmL.addChild(this.PrayerBead23);
    this.HairSP_13.addChild(this.HairSP_14);
    this.SleeveLSPB.addChild(this.SleeveLSF);
    this.PalmL.addChild(this.PrayerBead24);
    this.PalmL.addChild(this.PrayerBead10);
    this.HornRB.addChild(this.HornRP1);
    this.SleeveLSPB.addChild(this.SleeveLSdo);
    this.PalmL.addChild(this.PrayerBead20);
    this.Head.addChild(this.EyeLSP1);
    this.Head.addChild(this.HairB);
    this.Head.addChild(this.EyeLSP3);
    this.Head.addChild(this.KnifeB);
    this.PalmL.addChild(this.PrayerBeadString_3);
    this.PalmL.addChild(this.PrayerBead7);
    this.PalmL.addChild(this.PrayerBeadString_15);
    this.HairSP_15.addChild(this.HairSP_16);
    this.SleeveRSPB.addChild(this.ArmR);
    this.MouthBdo.addChild(this.Tooth13);
    this.SleeveLSPB.addChild(this.SleeveLSup);
    this.PalmL.addChild(this.PrayerBeadString_2);
    this.HairB.addChild(this.HairSP_6);
    this.Head.addChild(this.MouthSPRup);
    this.PalmL.addChild(this.PrayerBead12);
    this.PalmL.addChild(this.PrayerBead1);
    this.PalmL.addChild(this.PrayerBead27);
    this.PalmL.addChild(this.PrayerBeadString_5);
    this.MouthBup.addChild(this.Tooth2);
    this.NoseB.addChild(this.NoseSPLF);
    this.HornLB.addChild(this.HornLP1);
    this.HairSP_10.addChild(this.HairSP_11);
    this.MouthSPRdo.addChild(this.Tooth8);
    this.KnifeBlade.addChild(this.KnifeFiller1);
    this.KnifeTipSP3.addChild(this.KnifeTipSP4);
    this.HairSP_4.addChild(this.HairSP_24);
    this.HairB.addChild(this.HairSP_1);
    this.MouthBup.addChild(this.Tooth3_1);
    this.PalmL.addChild(this.PrayerBead21);
    this.HornLP1.addChild(this.HornLTip);
    this.Head.addChild(this.NoseB);
    this.PalmR.addChild(this.FingerR4B);
    this.ArmL.addChild(this.PalmL);
    this.PalmL.addChild(this.PrayerBeadString_17);
    this.HairB.addChild(this.HairSP_3);
    this.Body.addChild(this.CollarSPL);
    this.Body.addChild(this.SleeveRB);
    this.PalmL.addChild(this.PrayerBeadString_12);
    this.Head.addChild(this.MouthSPRdo);
    this.Head.addChild(this.EyeLSP6);
    this.HairSP_18.addChild(this.HairSP_19);
    this.MouthSPLup.addChild(this.Tooth7);
    this.Body.addChild(this.CollarL);
    this.NoseB.addChild(this.NoseSPLup);
    this.KnifeTipSP2.addChild(this.KnifeTipSP3);
    this.PalmL.addChild(this.PrayerBeadString_14);
    this.PalmL.addChild(this.PrayerBead8);
    this.MouthBdo.addChild(this.Tooth11);
    this.PalmL.addChild(this.PrayerBead3);
    this.PalmL.addChild(this.PrayerBeadString_1);
    this.Head.addChild(this.HornRB);
    this.MouthBup.addChild(this.Tooth5);
    this.FingerL1B.addChild(this.FingerL1P1);
    this.PalmL.addChild(this.PrayerBeadString_4);
    this.PalmL.addChild(this.PrayerBeadString_6);
    this.SleeveRB.addChild(this.SleeveRSPB);
    this.PalmR.addChild(this.ThumbRB);
    this.Head.addChild(this.EyeRSP5);
    this.PalmL.addChild(this.PrayerBead26);
    this.KnifeTipup.addChild(this.KnifeTipSP7);
    this.HairB.addChild(this.HairSP_4);
    this.PalmL.addChild(this.PrayerBead11);
    this.KnifeTipSP5.addChild(this.KnifeTipSP6);
    this.PalmL.addChild(this.PrayerBeadString_16);
    this.Head.addChild(this.MouthSPLup);
    this.PalmL.addChild(this.PrayerBeadString_8);
    this.Head.addChild(this.MouthBup);
    this.HairB.addChild(this.HairSP_7);
    this.Body.addChild(this.SleeveLB);
    this.PalmL.addChild(this.PrayerBead4);
    this.PalmL.addChild(this.PrayerBeadString_11);
    this.Head.addChild(this.EyeRSP3);
    this.Head.addChild(this.EyeRSP4);
    this.FingerL3B.addChild(this.FingerL3P1);
    this.PalmL.addChild(this.PrayerBead19);
    this.FingerL2B.addChild(this.FingerL2P1);
    this.HairSP_2.addChild(this.HairSP_18);
    this.SleeveRSPB.addChild(this.SleeveRSup);
    this.Body.addChild(this.Neck);
    this.SleeveLSPB.addChild(this.ArmL);
    this.Head.addChild(this.EyeRSP1);
    this.HairSP_11.addChild(this.HairSP_12);
    this.PalmL.addChild(this.PrayerBead9);
    this.HairSP_14.addChild(this.HairSP_15);
    this.HairSP.addChild(this.HairSP_8);
    this.HairSP_19.addChild(this.HairSP_21);
    this.PalmL.addChild(this.FingerL2B);
    this.Head.addChild(this.EyeLSP2);
    this.Head.addChild(this.EyeLSP8);
    this.HairSP_18.addChild(this.HairSP_20);
    this.HairB.addChild(this.HairSP);
    this.PalmR.addChild(this.FingerR2B);
    this.PalmL.addChild(this.PrayerBead13);
    this.SleeveLB.addChild(this.SleeveSPLR);
    this.SleeveLSPB.addChild(this.SleeveLSB);
    this.NoseB.addChild(this.NoseSPRR);
    this.HornRP1.addChild(this.HornRTip);
    this.MouthSPLdo.addChild(this.Tooth7_1);
    this.HairSP_9.addChild(this.HairSP_10);
    this.PalmR.addChild(this.FingerR1B);
    this.Head.addChild(this.EyeRSP6);
    this.KnifeTipSP1.addChild(this.KnifeTipSP2);
    this.PalmL.addChild(this.PrayerBead18);
    this.MouthBup.addChild(this.Tooth4);
    this.HairSP_5.addChild(this.HairSP_26);
    this.MouthBdo.addChild(this.Tooth9);
    this.HairSP_21.addChild(this.HairSP_22);
    this.MouthBdo.addChild(this.Tooth10);
    this.PalmL.addChild(this.PrayerBeadString_13);
    this.FingerR3B.addChild(this.FingerR3P1);
    this.HairB.addChild(this.HairSP_2);
    this.PalmL.addChild(this.PrayerBeadString_18);
    this.Neck.addChild(this.Head);
    this.Body.addChild(this.CollarSPR2);
    this.MouthBup.addChild(this.Tooth6);
    this.PalmL.addChild(this.PrayerBeadString_10);
    this.KnifeBlade.addChild(this.KnifeTipup);
    this.PalmL.addChild(this.ThumbLB);
    this.PalmL.addChild(this.PrayerBead2);
    this.KnifeB.addChild(this.KnifeBlade);
    this.KnifeBlade.addChild(this.KnifeTipSP1);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    GL11.glPushMatrix();
    GL11.glScaled(1.0D / this.modelScale[0], 1.0D / this.modelScale[1], 1.0D / this.modelScale[2]);
    this.Body.render(f5);
    GL11.glPopMatrix();
  }
  
  public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
  }
}

package alcoholmod.Mathioks.NickModels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class GedoMazoModel extends ModelBiped {
  public ModelRenderer Torso;
  
  public ModelRenderer LegLB;
  
  public ModelRenderer SPRobe;
  
  public ModelRenderer LegRB;
  
  public ModelRenderer RootRAB;
  
  public ModelRenderer RootLAB;
  
  public ModelRenderer RootLNB;
  
  public ModelRenderer RootLNB_1;
  
  public ModelRenderer RootBB;
  
  public ModelRenderer ArmR;
  
  public ModelRenderer ArmL;
  
  public ModelRenderer Neck;
  
  public ModelRenderer SPNeckR;
  
  public ModelRenderer SPNeckL;
  
  public ModelRenderer LegLP1;
  
  public ModelRenderer HeelL;
  
  public ModelRenderer ChainLL;
  
  public ModelRenderer FootL;
  
  public ModelRenderer shapeupL;
  
  public ModelRenderer Toe1L;
  
  public ModelRenderer Toe3L;
  
  public ModelRenderer Toe2L;
  
  public ModelRenderer Toe4L;
  
  public ModelRenderer SPRobe2R;
  
  public ModelRenderer SPRobe2L;
  
  public ModelRenderer SPCenter;
  
  public ModelRenderer LegRP1;
  
  public ModelRenderer HeelR;
  
  public ModelRenderer ChainLR;
  
  public ModelRenderer FootR;
  
  public ModelRenderer shapeupR;
  
  public ModelRenderer Toe1R;
  
  public ModelRenderer Toe4R;
  
  public ModelRenderer Toe3R;
  
  public ModelRenderer Toe2R;
  
  public ModelRenderer RootRAP1;
  
  public ModelRenderer RootRAP2;
  
  public ModelRenderer RootRAP3;
  
  public ModelRenderer RootRAP4;
  
  public ModelRenderer RootRAP5;
  
  public ModelRenderer RootLAP1;
  
  public ModelRenderer RootANP2;
  
  public ModelRenderer RootLAP3;
  
  public ModelRenderer RootLAP4;
  
  public ModelRenderer RootLAP5;
  
  public ModelRenderer RootLNP1;
  
  public ModelRenderer RootLNP2;
  
  public ModelRenderer RootLNP3;
  
  public ModelRenderer RootLNP4;
  
  public ModelRenderer RootLNP5;
  
  public ModelRenderer RootLNP1_1;
  
  public ModelRenderer RootLNP2_1;
  
  public ModelRenderer RootLNP3_1;
  
  public ModelRenderer RootLNP4_1;
  
  public ModelRenderer RootRNP5;
  
  public ModelRenderer RootBP1;
  
  public ModelRenderer RootRBB;
  
  public ModelRenderer RootLBB;
  
  public ModelRenderer RootBP2;
  
  public ModelRenderer RootRUBB;
  
  public ModelRenderer RootLUBB;
  
  public ModelRenderer RootUBB;
  
  public ModelRenderer RootRUBP1;
  
  public ModelRenderer RootRUBP2;
  
  public ModelRenderer RootRUBP3;
  
  public ModelRenderer RootRUBP4;
  
  public ModelRenderer RootRUBP5;
  
  public ModelRenderer RootLUBP1;
  
  public ModelRenderer RootLUBP2;
  
  public ModelRenderer RootLUBP3;
  
  public ModelRenderer RootLUBP4;
  
  public ModelRenderer RootLUBP5;
  
  public ModelRenderer RootUBP1;
  
  public ModelRenderer RootUBP2;
  
  public ModelRenderer RootUBP3;
  
  public ModelRenderer RootUBP4;
  
  public ModelRenderer RootUBP5;
  
  public ModelRenderer RootRBP1;
  
  public ModelRenderer RootRBP2;
  
  public ModelRenderer RootRBP3;
  
  public ModelRenderer RootRBP4;
  
  public ModelRenderer RootRBP5;
  
  public ModelRenderer RootLBP1;
  
  public ModelRenderer RootLBP2;
  
  public ModelRenderer RootLBP3;
  
  public ModelRenderer RootLBP4;
  
  public ModelRenderer RootLBP5;
  
  public ModelRenderer ForeArmR;
  
  public ModelRenderer PalmR;
  
  public ModelRenderer SPpalmR;
  
  public ModelRenderer HandCuffsR;
  
  public ModelRenderer Finger1RB;
  
  public ModelRenderer ThumbRB;
  
  public ModelRenderer Finger2RB;
  
  public ModelRenderer Finger3RB;
  
  public ModelRenderer Finger4RB;
  
  public ModelRenderer Finger1RP1;
  
  public ModelRenderer Finger1RE;
  
  public ModelRenderer ThumbRE;
  
  public ModelRenderer Finger2RP1;
  
  public ModelRenderer Finger2RE;
  
  public ModelRenderer Finger3RP1;
  
  public ModelRenderer Finger3RE;
  
  public ModelRenderer Finger4RP1;
  
  public ModelRenderer Finger4RE;
  
  public ModelRenderer ForeArmL;
  
  public ModelRenderer PalmL;
  
  public ModelRenderer SPpalmL;
  
  public ModelRenderer HandCuffsL;
  
  public ModelRenderer Finger1LB;
  
  public ModelRenderer ThumbLB;
  
  public ModelRenderer Finger2LB;
  
  public ModelRenderer Finger3LB;
  
  public ModelRenderer Finger4LB;
  
  public ModelRenderer Finger1LP1;
  
  public ModelRenderer Finger1LE;
  
  public ModelRenderer ThumbLE;
  
  public ModelRenderer Finger2LP1;
  
  public ModelRenderer Finger2LE;
  
  public ModelRenderer Finger3LP1;
  
  public ModelRenderer Finger3LE;
  
  public ModelRenderer Finger4LP1;
  
  public ModelRenderer Finger4LE;
  
  public ModelRenderer Head;
  
  public ModelRenderer HeadCB;
  
  public ModelRenderer FaceMU;
  
  public ModelRenderer HeadCP1;
  
  public ModelRenderer HeadCP2;
  
  public ModelRenderer HeadCP3;
  
  public ModelRenderer HeadCP4;
  
  public ModelRenderer MouthBase;
  
  public ModelRenderer MouthR;
  
  public ModelRenderer MouthL;
  
  public ModelRenderer Tooth1U;
  
  public ModelRenderer Tooth2U;
  
  public ModelRenderer Tooth3U;
  
  public ModelRenderer Tooth4U;
  
  public ModelRenderer VisorB;
  
  public ModelRenderer Tooth1D;
  
  public ModelRenderer Tooth2D;
  
  public ModelRenderer Tooth3D;
  
  public ModelRenderer Tooth4D;
  
  public ModelRenderer EyeTLL;
  
  public ModelRenderer EyeTL;
  
  public ModelRenderer EyeBLL;
  
  public ModelRenderer EyeBL;
  
  public ModelRenderer EyeC;
  
  public ModelRenderer EyeTR;
  
  public ModelRenderer EyeBR;
  
  public ModelRenderer EyeBRR;
  
  public ModelRenderer EyeTRR;
  
  public GedoMazoModel() {
    this.textureWidth = 800;
    this.textureHeight = 800;
    this.RootLNP1 = new ModelRenderer((ModelBase)this, 92, 611);
    this.RootLNP1.setRotationPoint(-10.0F, 0.4F, 3.4F);
    this.RootLNP1.addBox(0.0F, 0.0F, 0.0F, 12, 18, 19, 0.0F);
    setRotateAngle(this.RootLNP1, 0.050265484F, 0.30455995F, 0.0F);
    this.RootLBP2 = new ModelRenderer((ModelBase)this, 545, 524);
    this.RootLBP2.setRotationPoint(-10.9F, -0.1F, 2.0F);
    this.RootLBP2.addBox(0.0F, 0.0F, 0.0F, 13, 18, 18, 0.0F);
    setRotateAngle(this.RootLBP2, 0.1017527F, 0.16318828F, 0.09878564F);
    this.RootRBP4 = new ModelRenderer((ModelBase)this, 357, 720);
    this.RootRBP4.setRotationPoint(-8.4F, 1.2F, 0.6F);
    this.RootRBP4.addBox(0.0F, 0.0F, 0.0F, 10, 16, 16, 0.0F);
    setRotateAngle(this.RootRBP4, 0.069115035F, 0.0970403F, 0.0F);
    this.EyeTRR = new ModelRenderer((ModelBase)this, 588, 287);
    this.EyeTRR.setRotationPoint(22.8F, 0.7F, -1.0F);
    this.EyeTRR.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
    this.Toe1L = new ModelRenderer((ModelBase)this, 425, 294);
    this.Toe1L.setRotationPoint(16.96F, 1.4F, -2.8F);
    this.Toe1L.addBox(0.0F, 0.0F, 0.0F, 4, 4, 6, 0.0F);
    setRotateAngle(this.Toe1L, -0.18203785F, 0.0F, 0.0F);
    this.RootLAP4 = new ModelRenderer((ModelBase)this, 280, 665);
    this.RootLAP4.setRotationPoint(-8.4F, 1.2F, 0.6F);
    this.RootLAP4.addBox(0.0F, 0.0F, 0.0F, 10, 16, 16, 0.0F);
    setRotateAngle(this.RootLAP4, 0.069115035F, 0.0970403F, 0.0F);
    this.RootLUBP2 = new ModelRenderer((ModelBase)this, 543, 567);
    this.RootLUBP2.setRotationPoint(-10.9F, -0.1F, 2.0F);
    this.RootLUBP2.addBox(0.0F, 0.0F, 0.0F, 13, 18, 18, 0.0F);
    setRotateAngle(this.RootLUBP2, 0.1017527F, 0.16318828F, 0.09878564F);
    this.ForeArmL = new ModelRenderer((ModelBase)this, 63, 318);
    this.ForeArmL.setRotationPoint(0.0F, 37.5F, 0.0F);
    this.ForeArmL.addBox(0.0F, 0.0F, 0.0F, 13, 32, 11, 0.0F);
    setRotateAngle(this.ForeArmL, -0.17453292F, 0.0F, -0.033161256F);
    this.Finger4LE = new ModelRenderer((ModelBase)this, 265, 387);
    this.Finger4LE.setRotationPoint(0.0F, 2.6F, 0.2F);
    this.Finger4LE.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
    setRotateAngle(this.Finger4LE, -0.31869712F, 0.0F, 0.0F);
    this.Tooth1U = new ModelRenderer((ModelBase)this, 537, 363);
    this.Tooth1U.setRotationPoint(9.5F, 11.6F, 0.04F);
    this.Tooth1U.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    setRotateAngle(this.Tooth1U, 0.0F, 0.0F, 0.7853982F);
    this.LegRB = new ModelRenderer((ModelBase)this, 251, 63);
    this.LegRB.setRotationPoint(0.2F, 91.4F, 0.2F);
    this.LegRB.addBox(0.0F, 0.0F, 0.0F, 18, 31, 18, 0.0F);
    setRotateAngle(this.LegRB, -0.091106184F, 0.0F, 0.0F);
    this.Toe3L = new ModelRenderer((ModelBase)this, 373, 292);
    this.Toe3L.setRotationPoint(6.4F, 0.0F, -4.2F);
    this.Toe3L.addBox(0.0F, 0.0F, 0.0F, 5, 5, 6, 0.0F);
    setRotateAngle(this.Toe3L, -0.18203785F, 0.0F, 0.0F);
    this.PalmL = new ModelRenderer((ModelBase)this, 179, 325);
    this.PalmL.setRotationPoint(0.0F, 30.2F, 13.0F);
    this.PalmL.addBox(0.0F, 0.0F, 0.0F, 13, 14, 7, 0.0F);
    setRotateAngle(this.PalmL, -0.17575465F, 1.5707964F, 0.0F);
    this.FootR = new ModelRenderer((ModelBase)this, 248, 243);
    this.FootR.setRotationPoint(0.0F, -4.1F, -16.9F);
    this.FootR.addBox(0.0F, 0.0F, 0.0F, 21, 7, 19, 0.0F);
    setRotateAngle(this.FootR, -0.22759093F, 0.0F, 0.0F);
    this.SPRobe2R = new ModelRenderer((ModelBase)this, 201, 249);
    this.SPRobe2R.setRotationPoint(0.0F, 21.9F, 0.0F);
    this.SPRobe2R.addBox(0.0F, 0.0F, 0.0F, 7, 16, 2, 0.0F);
    setRotateAngle(this.SPRobe2R, -0.091106184F, 0.0F, -0.4098033F);
    this.Finger3LE = new ModelRenderer((ModelBase)this, 266, 372);
    this.Finger3LE.setRotationPoint(0.0F, 2.1F, 0.4F);
    this.Finger3LE.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
    setRotateAngle(this.Finger3LE, -0.41469023F, 0.0F, 0.0F);
    this.EyeTLL = new ModelRenderer((ModelBase)this, 523, 288);
    this.EyeTLL.setRotationPoint(1.3F, 0.7F, -1.0F);
    this.EyeTLL.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
    this.HeelR = new ModelRenderer((ModelBase)this, 257, 217);
    this.HeelR.setRotationPoint(-1.4F, 32.9F, 8.8F);
    this.HeelR.addBox(0.0F, 0.0F, 0.0F, 21, 7, 10, 0.0F);
    setRotateAngle(this.HeelR, 0.13665928F, 0.0F, 0.0F);
    this.SPpalmL = new ModelRenderer((ModelBase)this, 183, 350);
    this.SPpalmL.setRotationPoint(8.5F, 29.3F, 11.1F);
    this.SPpalmL.addBox(0.0F, 0.0F, 0.0F, 11, 13, 5, 0.0F);
    setRotateAngle(this.SPpalmL, -0.6092944F, 1.5582299F, -0.0F);
    this.LegRP1 = new ModelRenderer((ModelBase)this, 250, 122);
    this.LegRP1.setRotationPoint(0.0F, 31.0F, 0.0F);
    this.LegRP1.addBox(0.0F, 0.0F, 0.0F, 18, 33, 18, 0.0F);
    setRotateAngle(this.LegRP1, 0.18221237F, 0.0F, 0.0F);
    this.FaceMU = new ModelRenderer((ModelBase)this, 535, 310);
    this.FaceMU.setRotationPoint(0.0F, 0.0F, -1.0F);
    this.FaceMU.addBox(0.0F, 0.0F, 0.0F, 25, 13, 1, 0.0F);
    this.RootLAP5 = new ModelRenderer((ModelBase)this, 336, 668);
    this.RootLAP5.setRotationPoint(-4.6F, 0.3F, 0.5F);
    this.RootLAP5.addBox(0.0F, 0.0F, 0.0F, 4, 15, 15, 0.0F);
    setRotateAngle(this.RootLAP5, 0.026529005F, 0.06283186F, 0.0F);
    this.RootRAP2 = new ModelRenderer((ModelBase)this, 162, 524);
    this.RootRAP2.setRotationPoint(-10.9F, -0.1F, 2.0F);
    this.RootRAP2.addBox(0.0F, 0.0F, 0.0F, 13, 18, 18, 0.0F);
    setRotateAngle(this.RootRAP2, 0.1017527F, 0.16318828F, 0.09878564F);
    this.RootLAP1 = new ModelRenderer((ModelBase)this, 96, 659);
    this.RootLAP1.setRotationPoint(-10.0F, 0.4F, 3.4F);
    this.RootLAP1.addBox(0.0F, 0.0F, 0.0F, 12, 19, 19, 0.0F);
    setRotateAngle(this.RootLAP1, 0.050265484F, 0.30455995F, 0.0F);
    this.RootLAP3 = new ModelRenderer((ModelBase)this, 226, 663);
    this.RootLAP3.setRotationPoint(-8.3F, 0.8F, 0.3F);
    this.RootLAP3.addBox(0.0F, 0.0F, 0.0F, 9, 17, 17, 0.0F);
    setRotateAngle(this.RootLAP3, 0.061261058F, 0.03141593F, 0.06283186F);
    this.ArmL = new ModelRenderer((ModelBase)this, 5, 313);
    this.ArmL.setRotationPoint(54.4F, 13.9F, 2.4F);
    this.ArmL.addBox(0.0F, 0.0F, 0.0F, 13, 39, 11, 0.0F);
    setRotateAngle(this.ArmL, 0.07225663F, -0.16964601F, -0.13823007F);
    this.EyeTL = new ModelRenderer((ModelBase)this, 538, 287);
    this.EyeTL.setRotationPoint(5.6F, 0.7F, -1.0F);
    this.EyeTL.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
    this.Toe2L = new ModelRenderer((ModelBase)this, 399, 293);
    this.Toe2L.setRotationPoint(11.8F, 0.2F, -3.6F);
    this.Toe2L.addBox(0.0F, 0.0F, 0.0F, 5, 5, 6, 0.0F);
    setRotateAngle(this.Toe2L, -0.22759093F, 0.0F, 0.0F);
    this.VisorB = new ModelRenderer((ModelBase)this, 508, 247);
    this.VisorB.setRotationPoint(-1.0F, 2.2F, -1.0F);
    this.VisorB.addBox(0.0F, 0.0F, 0.0F, 27, 8, 28, 0.0F);
    this.RootBB = new ModelRenderer((ModelBase)this, 316, 307);
    this.RootBB.setRotationPoint(2.5F, 29.5F, 19.2F);
    this.RootBB.addBox(0.0F, 0.0F, 0.0F, 46, 52, 13, 0.0F);
    this.RootLUBP4 = new ModelRenderer((ModelBase)this, 663, 571);
    this.RootLUBP4.setRotationPoint(-8.4F, 1.2F, 0.6F);
    this.RootLUBP4.addBox(0.0F, 0.0F, 0.0F, 10, 16, 16, 0.0F);
    setRotateAngle(this.RootLUBP4, 0.069115035F, 0.0970403F, 0.0F);
    this.SPpalmR = new ModelRenderer((ModelBase)this, 184, 455);
    this.SPpalmR.setRotationPoint(5.7F, 29.4F, -0.8F);
    this.SPpalmR.addBox(0.0F, 0.0F, 0.0F, 13, 13, 5, 0.0F);
    setRotateAngle(this.SPpalmR, -0.52761304F, -1.5707964F, 0.0F);
    this.RootLNB = new ModelRenderer((ModelBase)this, 3, 608);
    this.RootLNB.setRotationPoint(48.1F, -15.5F, 0.8F);
    this.RootLNB.addBox(0.0F, 0.0F, 0.0F, 23, 19, 21, 0.0F);
    setRotateAngle(this.RootLNB, 0.3298672F, 0.029496064F, 1.5557865F);
    this.RootBP1 = new ModelRenderer((ModelBase)this, 321, 376);
    this.RootBP1.setRotationPoint(1.7F, 2.0F, 2.5F);
    this.RootBP1.addBox(0.0F, 0.0F, 0.0F, 42, 48, 13, 0.0F);
    setRotateAngle(this.RootBP1, 0.18203785F, 0.0F, 0.0F);
    this.RootUBP1 = new ModelRenderer((ModelBase)this, 477, 611);
    this.RootUBP1.setRotationPoint(-10.0F, 0.4F, 3.4F);
    this.RootUBP1.addBox(0.0F, 0.0F, 0.0F, 12, 19, 19, 0.0F);
    setRotateAngle(this.RootUBP1, 0.0F, 0.29757863F, 0.0F);
    this.Tooth2U = new ModelRenderer((ModelBase)this, 545, 364);
    this.Tooth2U.setRotationPoint(11.8F, 12.3F, 0.04F);
    this.Tooth2U.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth2U, 0.0F, 0.0F, 0.7853982F);
    this.shapeupR = new ModelRenderer((ModelBase)this, 262, 277);
    this.shapeupR.setRotationPoint(0.0F, 1.6F, -3.7F);
    this.shapeupR.addBox(0.0F, 0.0F, 0.0F, 21, 6, 4, 0.0F);
    setRotateAngle(this.shapeupR, 0.4098033F, 0.0F, 0.0F);
    this.RootRUBP2 = new ModelRenderer((ModelBase)this, 545, 663);
    this.RootRUBP2.setRotationPoint(-10.9F, -0.1F, 2.0F);
    this.RootRUBP2.addBox(0.0F, 0.0F, 0.0F, 13, 18, 18, 0.0F);
    setRotateAngle(this.RootRUBP2, 0.1017527F, 0.16318828F, 0.09878564F);
    this.RootBP2 = new ModelRenderer((ModelBase)this, 325, 442);
    this.RootBP2.setRotationPoint(2.7F, 1.6F, 4.9F);
    this.RootBP2.addBox(0.0F, 0.0F, 0.0F, 38, 44, 15, 0.0F);
    setRotateAngle(this.RootBP2, 0.13665928F, 0.0F, 0.0F);
    this.EyeTR = new ModelRenderer((ModelBase)this, 571, 287);
    this.EyeTR.setRotationPoint(18.4F, 0.7F, -1.0F);
    this.EyeTR.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
    this.Finger2RE = new ModelRenderer((ModelBase)this, 273, 459);
    this.Finger2RE.setRotationPoint(0.0F, 2.7F, 0.2F);
    this.Finger2RE.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
    setRotateAngle(this.Finger2RE, -0.32672563F, 0.0F, 0.0F);
    this.Torso = new ModelRenderer((ModelBase)this, 93, 98);
    this.Torso.setRotationPoint(-26.0F, -139.3F, -5.2F);
    this.Torso.addBox(0.0F, 0.0F, 0.1F, 52, 93, 20, 0.0F);
    this.RootLBP1 = new ModelRenderer((ModelBase)this, 481, 522);
    this.RootLBP1.setRotationPoint(-10.0F, 0.4F, 3.4F);
    this.RootLBP1.addBox(0.0F, 0.0F, 0.0F, 12, 19, 19, 0.0F);
    setRotateAngle(this.RootLBP1, 0.050265484F, 0.30455995F, 0.043982297F);
    this.RootLAB = new ModelRenderer((ModelBase)this, 2, 655);
    this.RootLAB.setRotationPoint(65.9F, 14.9F, 0.0F);
    this.RootLAB.addBox(0.0F, 0.0F, 0.0F, 23, 20, 22, 0.0F);
    setRotateAngle(this.RootLAB, 0.0F, 0.03176499F, 2.4130921F);
    this.RootLBP4 = new ModelRenderer((ModelBase)this, 665, 528);
    this.RootLBP4.setRotationPoint(-8.4F, 1.2F, 0.6F);
    this.RootLBP4.addBox(0.0F, 0.0F, 0.0F, 10, 16, 16, 0.0F);
    setRotateAngle(this.RootLBP4, 0.069115035F, 0.0970403F, 0.0F);
    this.RootLBP5 = new ModelRenderer((ModelBase)this, 721, 530);
    this.RootLBP5.setRotationPoint(-4.6F, 0.3F, 0.5F);
    this.RootLBP5.addBox(0.0F, 0.0F, 0.0F, 4, 15, 15, 0.0F);
    setRotateAngle(this.RootLBP5, 0.026529005F, 0.06283186F, 0.0F);
    this.Finger2RP1 = new ModelRenderer((ModelBase)this, 251, 459);
    this.Finger2RP1.setRotationPoint(0.0F, 4.3F, 0.3F);
    this.Finger2RP1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    setRotateAngle(this.Finger2RP1, -0.45710173F, 0.0F, 0.0F);
    this.RootLNP2_1 = new ModelRenderer((ModelBase)this, 160, 567);
    this.RootLNP2_1.setRotationPoint(-12.3F, 0.8F, 3.5F);
    this.RootLNP2_1.addBox(0.0F, 0.0F, 0.0F, 13, 17, 18, 0.0F);
    setRotateAngle(this.RootLNP2_1, -0.05148721F, 0.16318828F, -0.09878564F);
    this.Toe1R = new ModelRenderer((ModelBase)this, 246, 294);
    this.Toe1R.setRotationPoint(0.04F, 1.4F, -2.8F);
    this.Toe1R.addBox(0.0F, 0.0F, 0.0F, 4, 4, 6, 0.0F);
    setRotateAngle(this.Toe1R, -0.18203785F, 0.0F, 0.0F);
    this.RootLNP3_1 = new ModelRenderer((ModelBase)this, 225, 569);
    this.RootLNP3_1.setRotationPoint(-8.3F, -0.2F, 1.4F);
    this.RootLNP3_1.addBox(0.0F, 0.0F, 0.0F, 9, 16, 17, 0.0F);
    setRotateAngle(this.RootLNP3_1, -0.061261058F, 0.03141593F, -0.06283186F);
    this.RootRBP3 = new ModelRenderer((ModelBase)this, 301, 718);
    this.RootRBP3.setRotationPoint(-8.3F, 0.8F, 0.3F);
    this.RootRBP3.addBox(0.0F, 0.0F, 0.0F, 9, 17, 17, 0.0F);
    setRotateAngle(this.RootRBP3, 0.061261058F, 0.03141593F, 0.06283186F);
    this.Finger3LP1 = new ModelRenderer((ModelBase)this, 246, 370);
    this.Finger3LP1.setRotationPoint(0.0F, 3.2F, 1.0F);
    this.Finger3LP1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    setRotateAngle(this.Finger3LP1, -0.7272787F, 0.0052359877F, 0.0F);
    this.RootRAP5 = new ModelRenderer((ModelBase)this, 339, 529);
    this.RootRAP5.setRotationPoint(-4.6F, 0.3F, 0.5F);
    this.RootRAP5.addBox(0.0F, 0.2F, 0.0F, 4, 15, 15, 0.0F);
    setRotateAngle(this.RootRAP5, 0.028274333F, 0.12217305F, 0.0F);
    this.FootL = new ModelRenderer((ModelBase)this, 357, 242);
    this.FootL.setRotationPoint(0.0F, -4.1F, -16.9F);
    this.FootL.addBox(0.0F, 0.0F, 0.0F, 21, 7, 19, 0.0F);
    setRotateAngle(this.FootL, -0.22759093F, 0.0F, 0.0F);
    this.ForeArmR = new ModelRenderer((ModelBase)this, 62, 418);
    this.ForeArmR.setRotationPoint(0.0F, 37.1F, 0.2F);
    this.ForeArmR.addBox(0.0F, 0.0F, 0.0F, 13, 32, 11, 0.0F);
    setRotateAngle(this.ForeArmR, -0.1743584F, 0.0F, -0.02443461F);
    this.Tooth3D = new ModelRenderer((ModelBase)this, 552, 371);
    this.Tooth3D.setRotationPoint(5.3F, 0.0F, 0.04F);
    this.Tooth3D.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth3D, 0.0F, 0.0F, -0.7853982F);
    this.Tooth2D = new ModelRenderer((ModelBase)this, 546, 371);
    this.Tooth2D.setRotationPoint(3.6F, 0.0F, 0.04F);
    this.Tooth2D.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth2D, 0.0F, 0.0F, -0.7853982F);
    this.ThumbRB = new ModelRenderer((ModelBase)this, 224, 430);
    this.ThumbRB.setRotationPoint(3.0F, 6.2F, 1.1F);
    this.ThumbRB.addBox(0.0F, 0.0F, 0.0F, 6, 4, 4, 0.0F);
    setRotateAngle(this.ThumbRB, -0.0062831854F, 0.0F, 2.3659682F);
    this.RootUBP3 = new ModelRenderer((ModelBase)this, 608, 616);
    this.RootUBP3.setRotationPoint(-10.6F, 0.5F, 1.6F);
    this.RootUBP3.addBox(0.0F, 0.0F, 0.0F, 14, 17, 17, 0.0F);
    setRotateAngle(this.RootUBP3, 0.0F, 0.03141593F, 0.0F);
    this.EyeBL = new ModelRenderer((ModelBase)this, 538, 297);
    this.EyeBL.setRotationPoint(5.6F, 4.3F, -1.0F);
    this.EyeBL.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
    this.LegLB = new ModelRenderer((ModelBase)this, 365, 64);
    this.LegLB.setRotationPoint(33.8F, 91.5F, 0.2F);
    this.LegLB.addBox(0.0F, 0.0F, 0.0F, 18, 31, 18, 0.0F);
    setRotateAngle(this.LegLB, -0.091106184F, 0.0F, 0.0F);
    this.Finger4RP1 = new ModelRenderer((ModelBase)this, 251, 490);
    this.Finger4RP1.setRotationPoint(0.4F, 5.4F, 0.6F);
    this.Finger4RP1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    setRotateAngle(this.Finger4RP1, -0.51487213F, 0.0F, 0.17592919F);
    this.Finger4LP1 = new ModelRenderer((ModelBase)this, 245, 387);
    this.Finger4LP1.setRotationPoint(-0.4F, 4.9F, 0.6F);
    this.Finger4LP1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    setRotateAngle(this.Finger4LP1, -0.5462881F, -0.0F, -0.14451326F);
    this.Finger3LB = new ModelRenderer((ModelBase)this, 227, 369);
    this.Finger3LB.setRotationPoint(0.3F, 13.6F, 0.0F);
    this.Finger3LB.addBox(0.0F, 0.0F, 0.0F, 4, 6, 4, 0.0F);
    setRotateAngle(this.Finger3LB, -0.32044244F, 0.0F, 0.0F);
    this.RootLNB_1 = new ModelRenderer((ModelBase)this, 3, 562);
    this.RootLNB_1.setRotationPoint(18.0F, -11.0F, 5.9F);
    this.RootLNB_1.addBox(0.0F, 0.0F, 0.0F, 23, 19, 21, 0.0F);
    setRotateAngle(this.RootLNB_1, -0.101054564F, 0.18029252F, 1.5351917F);
    this.RootUBB = new ModelRenderer((ModelBase)this, 383, 606);
    this.RootUBB.setRotationPoint(5.1F, 28.9F, 18.2F);
    this.RootUBB.addBox(0.0F, 0.0F, 0.0F, 23, 20, 22, 0.0F);
    setRotateAngle(this.RootUBB, 1.1004301F, 1.4758505F, -0.06283186F);
    this.RootRAB = new ModelRenderer((ModelBase)this, 3, 518);
    this.RootRAB.setRotationPoint(0.1F, 0.3F, 0.0F);
    this.RootRAB.addBox(0.0F, 0.0F, 0.0F, 23, 20, 22, 0.0F);
    setRotateAngle(this.RootRAB, 0.0F, 0.03176499F, 0.5588544F);
    this.Finger1RE = new ModelRenderer((ModelBase)this, 272, 443);
    this.Finger1RE.setRotationPoint(0.0F, 2.9F, 0.2F);
    this.Finger1RE.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
    setRotateAngle(this.Finger1RE, -0.28902653F, 0.0F, 0.0F);
    this.RootRUBP1 = new ModelRenderer((ModelBase)this, 479, 661);
    this.RootRUBP1.setRotationPoint(-10.0F, 0.4F, 3.4F);
    this.RootRUBP1.addBox(0.0F, 0.0F, 0.0F, 12, 19, 19, 0.0F);
    setRotateAngle(this.RootRUBP1, 0.050265484F, 0.30455995F, 0.043982297F);
    this.RootLBB = new ModelRenderer((ModelBase)this, 386, 516);
    this.RootLBB.setRotationPoint(38.2F, 50.8F, 3.4F);
    this.RootLBB.addBox(0.0F, 0.0F, 0.0F, 23, 20, 22, 0.0F);
    setRotateAngle(this.RootLBB, 0.0F, 0.5462881F, -2.4130921F);
    this.EyeC = new ModelRenderer((ModelBase)this, 554, 293);
    this.EyeC.setRotationPoint(11.6F, 2.2F, -1.0F);
    this.EyeC.addBox(0.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F);
    this.Finger4RB = new ModelRenderer((ModelBase)this, 225, 486);
    this.Finger4RB.setRotationPoint(9.3F, 9.0F, 0.0F);
    this.Finger4RB.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
    setRotateAngle(this.Finger4RB, 0.0F, 0.0F, -0.51644295F);
    this.RootLUBB = new ModelRenderer((ModelBase)this, 383, 561);
    this.RootLUBB.setRotationPoint(48.7F, 38.9F, 0.4F);
    this.RootLUBB.addBox(0.0F, 0.0F, 0.0F, 23, 20, 22, 0.0F);
    setRotateAngle(this.RootLUBB, 0.043982297F, 0.33737215F, -3.1415927F);
    this.Finger2RB = new ModelRenderer((ModelBase)this, 224, 459);
    this.Finger2RB.setRotationPoint(4.6F, 13.4F, 0.0F);
    this.Finger2RB.addBox(0.0F, 0.0F, 0.0F, 4, 6, 4, 0.0F);
    setRotateAngle(this.Finger2RB, -0.17592919F, 0.0F, 0.0F);
    this.ThumbLB = new ModelRenderer((ModelBase)this, 224, 326);
    this.ThumbLB.setRotationPoint(9.2F, 8.3F, 4.0F);
    this.ThumbLB.addBox(0.0F, 0.0F, 0.0F, 7, 4, 4, 0.0F);
    setRotateAngle(this.ThumbLB, 0.0062831854F, 3.1415927F, -2.388134F);
    this.RootLNP2 = new ModelRenderer((ModelBase)this, 159, 612);
    this.RootLNP2.setRotationPoint(-10.9F, -0.1F, 2.0F);
    this.RootLNP2.addBox(0.0F, 0.0F, 0.0F, 13, 17, 18, 0.0F);
    setRotateAngle(this.RootLNP2, 0.1017527F, 0.16318828F, 0.09878564F);
    this.RootRNP5 = new ModelRenderer((ModelBase)this, 337, 574);
    this.RootRNP5.setRotationPoint(-4.6F, 0.3F, 1.3F);
    this.RootRNP5.addBox(0.0F, 0.0F, 0.0F, 5, 13, 15, 0.0F);
    setRotateAngle(this.RootRNP5, -0.026529005F, 0.06283186F, 0.0F);
    this.EyeBR = new ModelRenderer((ModelBase)this, 571, 298);
    this.EyeBR.setRotationPoint(18.4F, 4.3F, -1.0F);
    this.EyeBR.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
    this.ChainLR = new ModelRenderer((ModelBase)this, 247, 185);
    this.ChainLR.setRotationPoint(-0.8F, 16.1F, -1.1F);
    this.ChainLR.addBox(0.0F, 0.0F, 0.0F, 20, 3, 20, 0.0F);
    this.RootRBP2 = new ModelRenderer((ModelBase)this, 234, 717);
    this.RootRBP2.setRotationPoint(-10.9F, -0.1F, 2.0F);
    this.RootRBP2.addBox(0.0F, 0.0F, 0.0F, 13, 18, 18, 0.0F);
    setRotateAngle(this.RootRBP2, 0.1017527F, 0.16318828F, 0.09878564F);
    this.RootUBP5 = new ModelRenderer((ModelBase)this, 734, 619);
    this.RootUBP5.setRotationPoint(-7.3F, 0.3F, 0.5F);
    this.RootUBP5.addBox(0.0F, 0.0F, 0.0F, 9, 15, 15, 0.0F);
    setRotateAngle(this.RootUBP5, 0.0F, 0.043982297F, 0.0F);
    this.HandCuffsL = new ModelRenderer((ModelBase)this, 116, 336);
    this.HandCuffsL.setRotationPoint(-1.0F, 27.6F, -1.0F);
    this.HandCuffsL.addBox(0.0F, 0.0F, 0.0F, 15, 3, 13, 0.0F);
    this.RootANP2 = new ModelRenderer((ModelBase)this, 161, 661);
    this.RootANP2.setRotationPoint(-10.9F, -0.1F, 2.0F);
    this.RootANP2.addBox(0.0F, 0.0F, 0.0F, 13, 18, 18, 0.0F);
    setRotateAngle(this.RootANP2, 0.1017527F, 0.16318828F, 0.09878564F);
    this.Finger1LE = new ModelRenderer((ModelBase)this, 264, 340);
    this.Finger1LE.setRotationPoint(0.0F, 2.9F, 0.2F);
    this.Finger1LE.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
    setRotateAngle(this.Finger1LE, -0.28902653F, 0.0F, 0.0F);
    this.SPRobe = new ModelRenderer((ModelBase)this, 113, 219);
    this.SPRobe.setRotationPoint(0.02F, 91.0F, 18.12F);
    this.SPRobe.addBox(0.0F, 0.0F, 0.0F, 52, 22, 2, 0.0F);
    this.RootRBP5 = new ModelRenderer((ModelBase)this, 413, 722);
    this.RootRBP5.setRotationPoint(-4.6F, 0.3F, 0.5F);
    this.RootRBP5.addBox(0.0F, 0.0F, 0.0F, 4, 15, 15, 0.0F);
    setRotateAngle(this.RootRBP5, 0.026529005F, 0.06283186F, 0.0F);
    this.ArmR = new ModelRenderer((ModelBase)this, 6, 411);
    this.ArmR.setRotationPoint(-13.9F, 13.9F, 2.4F);
    this.ArmR.addBox(0.0F, 0.0F, 0.0F, 13, 39, 11, 0.0F);
    setRotateAngle(this.ArmR, 0.07225663F, 0.16964601F, 0.13823007F);
    this.HandCuffsR = new ModelRenderer((ModelBase)this, 117, 437);
    this.HandCuffsR.setRotationPoint(-1.0F, 27.9F, -1.0F);
    this.HandCuffsR.addBox(0.0F, 0.0F, 0.0F, 15, 3, 13, 0.0F);
    this.ThumbLE = new ModelRenderer((ModelBase)this, 251, 326);
    this.ThumbLE.setRotationPoint(4.5F, 0.88F, 0.0F);
    this.ThumbLE.addBox(0.0F, 0.0F, 0.0F, 7, 4, 4, 0.0F);
    setRotateAngle(this.ThumbLE, 0.0F, 0.0F, -0.6848672F);
    this.shapeupL = new ModelRenderer((ModelBase)this, 374, 276);
    this.shapeupL.setRotationPoint(0.0F, 1.6F, -3.7F);
    this.shapeupL.addBox(0.0F, 0.0F, 0.0F, 21, 6, 4, 0.0F);
    setRotateAngle(this.shapeupL, 0.4098033F, 0.0F, 0.0F);
    this.Finger1LB = new ModelRenderer((ModelBase)this, 225, 339);
    this.Finger1LB.setRotationPoint(8.9F, 13.2F, 0.2F);
    this.Finger1LB.addBox(0.0F, 0.0F, 0.0F, 4, 6, 4, 0.0F);
    setRotateAngle(this.Finger1LB, -0.18849556F, 0.0F, 0.0F);
    this.ChainLL = new ModelRenderer((ModelBase)this, 359, 185);
    this.ChainLL.setRotationPoint(-0.8F, 16.1F, -1.1F);
    this.ChainLL.addBox(0.0F, 0.0F, 0.0F, 20, 3, 20, 0.0F);
    this.EyeBRR = new ModelRenderer((ModelBase)this, 588, 299);
    this.EyeBRR.setRotationPoint(22.7F, 4.4F, -1.0F);
    this.EyeBRR.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
    this.HeadCP3 = new ModelRenderer((ModelBase)this, 523, 57);
    this.HeadCP3.setRotationPoint(0.0F, -4.7F, 1.7F);
    this.HeadCP3.addBox(0.0F, 0.0F, 0.0F, 25, 5, 9, 0.0F);
    setRotateAngle(this.HeadCP3, -0.33754668F, 0.0F, 0.0F);
    this.Finger4LB = new ModelRenderer((ModelBase)this, 227, 384);
    this.Finger4LB.setRotationPoint(-0.2F, 7.5F, 0.0F);
    this.Finger4LB.addBox(0.0F, 0.0F, 0.0F, 4, 7, 4, 0.0F);
    setRotateAngle(this.Finger4LB, 0.0F, 0.0F, 0.50579643F);
    this.RootRBB = new ModelRenderer((ModelBase)this, 76, 710);
    this.RootRBB.setRotationPoint(-5.4F, 15.0F, 0.6F);
    this.RootRBB.addBox(0.0F, 0.0F, 0.0F, 23, 20, 22, 0.0F);
    setRotateAngle(this.RootRBB, -0.4098033F, -0.091106184F, 0.0F);
    this.EyeBLL = new ModelRenderer((ModelBase)this, 524, 298);
    this.EyeBLL.setRotationPoint(1.2F, 4.3F, -1.0F);
    this.EyeBLL.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
    this.Finger3RB = new ModelRenderer((ModelBase)this, 224, 473);
    this.Finger3RB.setRotationPoint(9.0F, 13.6F, 0.0F);
    this.Finger3RB.addBox(0.0F, 0.0F, 0.0F, 4, 6, 4, 0.0F);
    setRotateAngle(this.Finger3RB, -0.32044244F, 0.0F, 0.0F);
    this.Finger2LP1 = new ModelRenderer((ModelBase)this, 245, 355);
    this.Finger2LP1.setRotationPoint(0.0F, 4.3F, 0.3F);
    this.Finger2LP1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    setRotateAngle(this.Finger2LP1, -0.45710173F, 0.0F, 0.0F);
    this.RootRUBP4 = new ModelRenderer((ModelBase)this, 665, 667);
    this.RootRUBP4.setRotationPoint(-8.4F, 1.2F, 0.6F);
    this.RootRUBP4.addBox(0.0F, 0.0F, 0.0F, 10, 16, 16, 0.0F);
    setRotateAngle(this.RootRUBP4, 0.069115035F, 0.0970403F, 0.0F);
    this.RootUBP4 = new ModelRenderer((ModelBase)this, 673, 618);
    this.RootUBP4.setRotationPoint(-11.3F, 0.5F, 1.5F);
    this.RootUBP4.addBox(0.0F, 0.0F, 0.0F, 13, 16, 16, 0.0F);
    setRotateAngle(this.RootUBP4, 0.0F, 0.0970403F, 0.0F);
    this.Toe2R = new ModelRenderer((ModelBase)this, 269, 292);
    this.Toe2R.setRotationPoint(4.5F, 0.0F, -3.6F);
    this.Toe2R.addBox(0.0F, 0.0F, 0.0F, 5, 5, 6, 0.0F);
    setRotateAngle(this.Toe2R, -0.22130775F, 6.981317E-4F, 0.0F);
    this.SPNeckR = new ModelRenderer((ModelBase)this, 456, 212);
    this.SPNeckR.setRotationPoint(6.1F, 0.0F, 0.24F);
    this.SPNeckR.addBox(0.0F, 0.0F, 0.0F, 18, 9, 13, 0.0F);
    setRotateAngle(this.SPNeckR, 0.0F, 0.0F, -0.68294734F);
    this.Finger4RE = new ModelRenderer((ModelBase)this, 273, 491);
    this.Finger4RE.setRotationPoint(0.0F, 2.6F, 0.2F);
    this.Finger4RE.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
    setRotateAngle(this.Finger4RE, -0.31869712F, 0.0F, 0.0F);
    this.RootLUBP1 = new ModelRenderer((ModelBase)this, 476, 565);
    this.RootLUBP1.setRotationPoint(-10.0F, 0.4F, 3.4F);
    this.RootLUBP1.addBox(0.0F, 0.0F, 0.0F, 12, 19, 19, 0.0F);
    setRotateAngle(this.RootLUBP1, 0.050265484F, 0.30455995F, 0.043982297F);
    this.HeadCB = new ModelRenderer((ModelBase)this, 525, 120);
    this.HeadCB.setRotationPoint(0.02F, -4.0F, 5.0F);
    this.HeadCB.addBox(0.0F, 0.0F, 0.0F, 25, 7, 9, 0.0F);
    setRotateAngle(this.HeadCB, -0.95609134F, 0.0F, 0.0F);
    this.HeadCP2 = new ModelRenderer((ModelBase)this, 523, 76);
    this.HeadCP2.setRotationPoint(0.0F, -6.4F, 2.5F);
    this.HeadCP2.addBox(0.0F, 0.0F, 0.0F, 25, 7, 9, 0.0F);
    setRotateAngle(this.HeadCP2, -0.37070793F, 0.0F, 0.0F);
    this.RootRBP1 = new ModelRenderer((ModelBase)this, 168, 714);
    this.RootRBP1.setRotationPoint(-10.0F, 0.4F, 3.4F);
    this.RootRBP1.addBox(0.0F, 0.0F, 0.0F, 12, 19, 19, 0.0F);
    setRotateAngle(this.RootRBP1, 0.050265484F, 0.30455995F, 0.043982297F);
    this.Tooth3U = new ModelRenderer((ModelBase)this, 551, 364);
    this.Tooth3U.setRotationPoint(13.3F, 12.3F, 0.04F);
    this.Tooth3U.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Tooth3U, 0.0F, 0.0F, 0.7853982F);
    this.Toe3R = new ModelRenderer((ModelBase)this, 295, 293);
    this.Toe3R.setRotationPoint(9.9F, 0.0F, -4.2F);
    this.Toe3R.addBox(0.0F, 0.0F, 0.1F, 5, 5, 6, 0.0F);
    setRotateAngle(this.Toe3R, -0.18203785F, 0.0F, 0.0F);
    this.MouthR = new ModelRenderer((ModelBase)this, 536, 329);
    this.MouthR.setRotationPoint(0.0F, 12.0F, 0.04F);
    this.MouthR.addBox(0.0F, 0.0F, 0.0F, 8, 12, 1, 0.0F);
    this.RootUBP2 = new ModelRenderer((ModelBase)this, 543, 614);
    this.RootUBP2.setRotationPoint(-11.8F, 0.4F, 2.5F);
    this.RootUBP2.addBox(0.0F, 0.0F, 0.0F, 13, 18, 18, 0.0F);
    setRotateAngle(this.RootUBP2, 0.0F, 0.16318828F, 0.0F);
    this.SPRobe2L = new ModelRenderer((ModelBase)this, 89, 250);
    this.SPRobe2L.setRotationPoint(45.5F, 19.1F, -0.1F);
    this.SPRobe2L.addBox(0.0F, 0.0F, 0.0F, 7, 16, 2, 0.0F);
    setRotateAngle(this.SPRobe2L, -0.091106184F, 0.0F, 0.4098033F);
    this.RootLNP4_1 = new ModelRenderer((ModelBase)this, 280, 573);
    this.RootLNP4_1.setRotationPoint(-8.6F, 1.0F, 1.9F);
    this.RootLNP4_1.addBox(0.0F, 0.0F, 0.0F, 10, 14, 16, 0.0F);
    setRotateAngle(this.RootLNP4_1, -0.069115035F, 0.0970403F, 0.0F);
    this.HeadCP4 = new ModelRenderer((ModelBase)this, 521, 36);
    this.HeadCP4.setRotationPoint(0.0F, -3.3F, 2.2F);
    this.HeadCP4.addBox(0.0F, 0.0F, 0.0F, 25, 4, 9, 0.0F);
    setRotateAngle(this.HeadCP4, -0.59829885F, 0.0F, 0.0F);
    this.Finger3RP1 = new ModelRenderer((ModelBase)this, 251, 473);
    this.Finger3RP1.setRotationPoint(0.0F, 3.2F, 1.0F);
    this.Finger3RP1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    setRotateAngle(this.Finger3RP1, -0.6895796F, 0.0F, 0.0F);
    this.Head = new ModelRenderer((ModelBase)this, 510, 141);
    this.Head.setRotationPoint(-3.7F, -23.5F, -5.4F);
    this.Head.addBox(0.0F, 0.0F, 0.0F, 25, 24, 25, 0.0F);
    this.RootLUBP5 = new ModelRenderer((ModelBase)this, 720, 573);
    this.RootLUBP5.setRotationPoint(-4.6F, 0.3F, 0.5F);
    this.RootLUBP5.addBox(0.0F, 0.0F, 0.0F, 4, 15, 15, 0.0F);
    setRotateAngle(this.RootLUBP5, 0.026529005F, 0.06283186F, 0.0F);
    this.Finger1RP1 = new ModelRenderer((ModelBase)this, 251, 443);
    this.Finger1RP1.setRotationPoint(0.0F, 4.4F, 0.3F);
    this.Finger1RP1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    setRotateAngle(this.Finger1RP1, -0.3817035F, 0.0F, 0.0F);
    this.Neck = new ModelRenderer((ModelBase)this, 528, 203);
    this.Neck.setRotationPoint(19.0F, -15.0F, 0.2F);
    this.Neck.addBox(0.0F, 0.0F, 0.0F, 17, 15, 17, 0.0F);
    this.RootLNP1_1 = new ModelRenderer((ModelBase)this, 95, 565);
    this.RootLNP1_1.setRotationPoint(-10.0F, -0.4F, 3.8F);
    this.RootLNP1_1.addBox(0.0F, 0.0F, 0.0F, 12, 18, 19, 0.0F);
    setRotateAngle(this.RootLNP1_1, -0.050265484F, 0.30455995F, 0.0F);
    this.LegLP1 = new ModelRenderer((ModelBase)this, 362, 121);
    this.LegLP1.setRotationPoint(0.0F, 31.0F, 0.0F);
    this.LegLP1.addBox(0.0F, 0.0F, 0.0F, 18, 33, 18, 0.0F);
    setRotateAngle(this.LegLP1, 0.18221237F, 0.0F, 0.0F);
    this.RootLBP3 = new ModelRenderer((ModelBase)this, 610, 526);
    this.RootLBP3.setRotationPoint(-8.3F, 0.8F, 0.3F);
    this.RootLBP3.addBox(0.0F, 0.0F, 0.0F, 9, 17, 17, 0.0F);
    setRotateAngle(this.RootLBP3, 0.061261058F, 0.03141593F, 0.06283186F);
    this.SPCenter = new ModelRenderer((ModelBase)this, 116, 249);
    this.SPCenter.setRotationPoint(6.6F, 20.7F, 0.1F);
    this.SPCenter.addBox(0.0F, 0.0F, 0.0F, 39, 16, 2, 0.0F);
    setRotateAngle(this.SPCenter, -0.091106184F, 0.0F, 0.0F);
    this.Toe4R = new ModelRenderer((ModelBase)this, 319, 292);
    this.Toe4R.setRotationPoint(15.5F, 0.0F, -4.7F);
    this.Toe4R.addBox(0.0F, 0.0F, 0.0F, 5, 5, 6, 0.0F);
    setRotateAngle(this.Toe4R, -0.13665928F, 0.0F, 0.0F);
    this.RootRUBB = new ModelRenderer((ModelBase)this, 384, 657);
    this.RootRUBB.setRotationPoint(-5.8F, 0.0F, -4.2F);
    this.RootRUBB.addBox(0.0F, 0.0F, 0.0F, 23, 20, 22, 0.0F);
    setRotateAngle(this.RootRUBB, 0.0F, 0.29827678F, 0.012217305F);
    this.Finger1RB = new ModelRenderer((ModelBase)this, 224, 443);
    this.Finger1RB.setRotationPoint(0.0F, 12.9F, 0.2F);
    this.Finger1RB.addBox(0.0F, 0.0F, 0.0F, 4, 6, 4, 0.0F);
    setRotateAngle(this.Finger1RB, -0.18849556F, 0.0F, 0.0F);
    this.Tooth4U = new ModelRenderer((ModelBase)this, 558, 364);
    this.Tooth4U.setRotationPoint(15.5F, 11.6F, 0.04F);
    this.Tooth4U.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    setRotateAngle(this.Tooth4U, 0.0F, 0.0F, 0.7853982F);
    this.Finger2LE = new ModelRenderer((ModelBase)this, 265, 355);
    this.Finger2LE.setRotationPoint(0.0F, 2.7F, 0.2F);
    this.Finger2LE.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
    setRotateAngle(this.Finger2LE, -0.32672563F, 0.0F, 0.0F);
    this.Finger3RE = new ModelRenderer((ModelBase)this, 273, 473);
    this.Finger3RE.setRotationPoint(0.0F, 2.1F, 0.4F);
    this.Finger3RE.addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
    setRotateAngle(this.Finger3RE, -0.45238933F, 0.0F, 0.0F);
    this.RootRUBP3 = new ModelRenderer((ModelBase)this, 610, 665);
    this.RootRUBP3.setRotationPoint(-8.3F, 0.8F, 0.3F);
    this.RootRUBP3.addBox(0.0F, 0.0F, 0.0F, 9, 17, 17, 0.0F);
    setRotateAngle(this.RootRUBP3, 0.061261058F, 0.03141593F, 0.06283186F);
    this.Toe4L = new ModelRenderer((ModelBase)this, 348, 292);
    this.Toe4L.setRotationPoint(1.0F, 0.0F, -4.7F);
    this.Toe4L.addBox(0.0F, 0.0F, 0.0F, 5, 5, 6, 0.0F);
    setRotateAngle(this.Toe4L, -0.13665928F, 0.0F, 0.0F);
    this.Finger1LP1 = new ModelRenderer((ModelBase)this, 245, 340);
    this.Finger1LP1.setRotationPoint(0.0F, 4.4F, 0.3F);
    this.Finger1LP1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    setRotateAngle(this.Finger1LP1, -0.3817035F, 0.0F, 0.0F);
    this.Tooth1D = new ModelRenderer((ModelBase)this, 538, 370);
    this.Tooth1D.setRotationPoint(0.6F, 0.1F, 0.04F);
    this.Tooth1D.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    setRotateAngle(this.Tooth1D, 0.0F, 0.0F, -0.7853982F);
    this.SPNeckL = new ModelRenderer((ModelBase)this, 602, 212);
    this.SPNeckL.setRotationPoint(34.5F, -11.2F, 0.23F);
    this.SPNeckL.addBox(0.0F, 0.0F, 0.0F, 18, 9, 13, 0.0F);
    setRotateAngle(this.SPNeckL, 0.0F, 0.0F, 0.68294734F);
    this.MouthBase = new ModelRenderer((ModelBase)this, 551, 353);
    this.MouthBase.setRotationPoint(7.5F, 21.0F, 0.0F);
    this.MouthBase.addBox(0.0F, 0.0F, 0.0F, 10, 3, 1, 0.0F);
    this.MouthL = new ModelRenderer((ModelBase)this, 568, 329);
    this.MouthL.setRotationPoint(17.0F, 12.0F, 0.04F);
    this.MouthL.addBox(0.0F, 0.0F, 0.0F, 8, 12, 1, 0.0F);
    this.Tooth4D = new ModelRenderer((ModelBase)this, 559, 370);
    this.Tooth4D.setRotationPoint(6.7F, 0.0F, 0.04F);
    this.Tooth4D.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    setRotateAngle(this.Tooth4D, 0.0F, 0.0F, -0.7853982F);
    this.RootRAP3 = new ModelRenderer((ModelBase)this, 226, 526);
    this.RootRAP3.setRotationPoint(-8.3F, 0.8F, 0.3F);
    this.RootRAP3.addBox(0.0F, 0.0F, 0.0F, 9, 17, 17, 0.0F);
    setRotateAngle(this.RootRAP3, 0.061261058F, 0.03141593F, 0.06283186F);
    this.PalmR = new ModelRenderer((ModelBase)this, 180, 428);
    this.PalmR.setRotationPoint(12.7F, 30.8F, -0.6F);
    this.PalmR.addBox(0.0F, 0.0F, 0.0F, 13, 14, 7, 0.0F);
    setRotateAngle(this.PalmR, -0.18203785F, -1.5707964F, 0.0F);
    this.ThumbRE = new ModelRenderer((ModelBase)this, 249, 430);
    this.ThumbRE.setRotationPoint(3.5F, 0.88F, 0.0F);
    this.ThumbRE.addBox(0.0F, 0.0F, 0.0F, 7, 4, 4, 0.0F);
    setRotateAngle(this.ThumbRE, 0.0F, 0.0F, -0.6848672F);
    this.RootLNP4 = new ModelRenderer((ModelBase)this, 281, 617);
    this.RootLNP4.setRotationPoint(-8.4F, 1.2F, 0.6F);
    this.RootLNP4.addBox(0.0F, 0.0F, 0.0F, 10, 14, 16, 0.0F);
    setRotateAngle(this.RootLNP4, 0.069115035F, 0.0970403F, 0.0F);
    this.HeelL = new ModelRenderer((ModelBase)this, 367, 217);
    this.HeelL.setRotationPoint(-1.4F, 32.9F, 8.8F);
    this.HeelL.addBox(0.0F, 0.0F, 0.0F, 21, 7, 10, 0.0F);
    setRotateAngle(this.HeelL, 0.13665928F, 0.0F, 0.0F);
    this.RootLNP3 = new ModelRenderer((ModelBase)this, 225, 615);
    this.RootLNP3.setRotationPoint(-8.3F, 0.8F, 0.3F);
    this.RootLNP3.addBox(0.0F, 0.0F, 0.0F, 9, 16, 17, 0.0F);
    setRotateAngle(this.RootLNP3, 0.061261058F, 0.03141593F, 0.06283186F);
    this.HeadCP1 = new ModelRenderer((ModelBase)this, 523, 97);
    this.HeadCP1.setRotationPoint(0.0F, -5.7F, 1.8F);
    this.HeadCP1.addBox(0.0F, 0.0F, 0.0F, 25, 6, 9, 0.0F);
    setRotateAngle(this.HeadCP1, -0.30787608F, 0.0F, 0.0F);
    this.RootRAP4 = new ModelRenderer((ModelBase)this, 281, 527);
    this.RootRAP4.setRotationPoint(-8.4F, 1.2F, 0.6F);
    this.RootRAP4.addBox(0.0F, 0.0F, 0.0F, 10, 16, 16, 0.0F);
    setRotateAngle(this.RootRAP4, 0.069115035F, 0.0970403F, 0.0F);
    this.Finger2LB = new ModelRenderer((ModelBase)this, 226, 353);
    this.Finger2LB.setRotationPoint(4.7F, 12.8F, 0.0F);
    this.Finger2LB.addBox(0.0F, 0.0F, 0.0F, 4, 6, 4, 0.0F);
    setRotateAngle(this.Finger2LB, -0.17592919F, 0.0F, 0.0F);
    this.RootRAP1 = new ModelRenderer((ModelBase)this, 97, 522);
    this.RootRAP1.setRotationPoint(-10.0F, 0.4F, 3.4F);
    this.RootRAP1.addBox(0.0F, 0.0F, 0.0F, 12, 19, 19, 0.0F);
    setRotateAngle(this.RootRAP1, 0.050265484F, 0.30455995F, 0.043982297F);
    this.RootRUBP5 = new ModelRenderer((ModelBase)this, 722, 668);
    this.RootRUBP5.setRotationPoint(-4.6F, 0.3F, 0.5F);
    this.RootRUBP5.addBox(0.0F, 0.0F, 0.0F, 4, 15, 15, 0.0F);
    setRotateAngle(this.RootRUBP5, 0.026529005F, 0.06283186F, 0.0F);
    this.RootLUBP3 = new ModelRenderer((ModelBase)this, 607, 569);
    this.RootLUBP3.setRotationPoint(-8.3F, 0.8F, 0.3F);
    this.RootLUBP3.addBox(0.0F, 0.0F, 0.0F, 9, 17, 17, 0.0F);
    setRotateAngle(this.RootLUBP3, 0.061261058F, 0.03141593F, 0.06283186F);
    this.RootLNP5 = new ModelRenderer((ModelBase)this, 335, 619);
    this.RootLNP5.setRotationPoint(-4.6F, 0.3F, 0.5F);
    this.RootLNP5.addBox(0.0F, 0.0F, 0.0F, 5, 13, 15, 0.0F);
    setRotateAngle(this.RootLNP5, 0.026529005F, 0.06283186F, 0.0F);
    this.RootLNB.addChild(this.RootLNP1);
    this.RootLBP1.addChild(this.RootLBP2);
    this.RootRBP3.addChild(this.RootRBP4);
    this.VisorB.addChild(this.EyeTRR);
    this.shapeupL.addChild(this.Toe1L);
    this.RootLAP3.addChild(this.RootLAP4);
    this.RootLUBP1.addChild(this.RootLUBP2);
    this.ArmL.addChild(this.ForeArmL);
    this.Finger4LP1.addChild(this.Finger4LE);
    this.FaceMU.addChild(this.Tooth1U);
    this.Torso.addChild(this.LegRB);
    this.shapeupL.addChild(this.Toe3L);
    this.ForeArmL.addChild(this.PalmL);
    this.HeelR.addChild(this.FootR);
    this.SPRobe.addChild(this.SPRobe2R);
    this.Finger3LP1.addChild(this.Finger3LE);
    this.VisorB.addChild(this.EyeTLL);
    this.LegRP1.addChild(this.HeelR);
    this.ForeArmL.addChild(this.SPpalmL);
    this.LegRB.addChild(this.LegRP1);
    this.Head.addChild(this.FaceMU);
    this.RootLAP4.addChild(this.RootLAP5);
    this.RootRAP1.addChild(this.RootRAP2);
    this.RootLAB.addChild(this.RootLAP1);
    this.RootANP2.addChild(this.RootLAP3);
    this.Torso.addChild(this.ArmL);
    this.VisorB.addChild(this.EyeTL);
    this.shapeupL.addChild(this.Toe2L);
    this.FaceMU.addChild(this.VisorB);
    this.Torso.addChild(this.RootBB);
    this.RootLUBP3.addChild(this.RootLUBP4);
    this.ForeArmR.addChild(this.SPpalmR);
    this.Torso.addChild(this.RootLNB);
    this.RootBB.addChild(this.RootBP1);
    this.RootUBB.addChild(this.RootUBP1);
    this.FaceMU.addChild(this.Tooth2U);
    this.FootR.addChild(this.shapeupR);
    this.RootRUBP1.addChild(this.RootRUBP2);
    this.RootBP1.addChild(this.RootBP2);
    this.VisorB.addChild(this.EyeTR);
    this.Finger2RP1.addChild(this.Finger2RE);
    this.RootLBB.addChild(this.RootLBP1);
    this.Torso.addChild(this.RootLAB);
    this.RootLBP3.addChild(this.RootLBP4);
    this.RootLBP4.addChild(this.RootLBP5);
    this.Finger2RB.addChild(this.Finger2RP1);
    this.RootLNP1_1.addChild(this.RootLNP2_1);
    this.shapeupR.addChild(this.Toe1R);
    this.RootLNP2_1.addChild(this.RootLNP3_1);
    this.RootRBP2.addChild(this.RootRBP3);
    this.Finger3LB.addChild(this.Finger3LP1);
    this.RootRAP4.addChild(this.RootRAP5);
    this.HeelL.addChild(this.FootL);
    this.ArmR.addChild(this.ForeArmR);
    this.MouthBase.addChild(this.Tooth3D);
    this.MouthBase.addChild(this.Tooth2D);
    this.PalmR.addChild(this.ThumbRB);
    this.RootUBP2.addChild(this.RootUBP3);
    this.VisorB.addChild(this.EyeBL);
    this.Torso.addChild(this.LegLB);
    this.Finger4RB.addChild(this.Finger4RP1);
    this.Finger4LB.addChild(this.Finger4LP1);
    this.PalmL.addChild(this.Finger3LB);
    this.Torso.addChild(this.RootLNB_1);
    this.RootBP2.addChild(this.RootUBB);
    this.Torso.addChild(this.RootRAB);
    this.Finger1RP1.addChild(this.Finger1RE);
    this.RootRUBB.addChild(this.RootRUBP1);
    this.RootBB.addChild(this.RootLBB);
    this.VisorB.addChild(this.EyeC);
    this.PalmR.addChild(this.Finger4RB);
    this.RootBP2.addChild(this.RootLUBB);
    this.PalmR.addChild(this.Finger2RB);
    this.PalmL.addChild(this.ThumbLB);
    this.RootLNP1.addChild(this.RootLNP2);
    this.RootLNP4_1.addChild(this.RootRNP5);
    this.VisorB.addChild(this.EyeBR);
    this.LegRP1.addChild(this.ChainLR);
    this.RootRBP1.addChild(this.RootRBP2);
    this.RootUBP4.addChild(this.RootUBP5);
    this.ForeArmL.addChild(this.HandCuffsL);
    this.RootLAP1.addChild(this.RootANP2);
    this.Finger1LP1.addChild(this.Finger1LE);
    this.Torso.addChild(this.SPRobe);
    this.RootRBP4.addChild(this.RootRBP5);
    this.Torso.addChild(this.ArmR);
    this.ForeArmR.addChild(this.HandCuffsR);
    this.ThumbLB.addChild(this.ThumbLE);
    this.FootL.addChild(this.shapeupL);
    this.PalmL.addChild(this.Finger1LB);
    this.LegLP1.addChild(this.ChainLL);
    this.VisorB.addChild(this.EyeBRR);
    this.HeadCP2.addChild(this.HeadCP3);
    this.PalmL.addChild(this.Finger4LB);
    this.RootBB.addChild(this.RootRBB);
    this.VisorB.addChild(this.EyeBLL);
    this.PalmR.addChild(this.Finger3RB);
    this.Finger2LB.addChild(this.Finger2LP1);
    this.RootRUBP3.addChild(this.RootRUBP4);
    this.RootUBP3.addChild(this.RootUBP4);
    this.shapeupR.addChild(this.Toe2R);
    this.Torso.addChild(this.SPNeckR);
    this.Finger4RP1.addChild(this.Finger4RE);
    this.RootLUBB.addChild(this.RootLUBP1);
    this.Head.addChild(this.HeadCB);
    this.HeadCP1.addChild(this.HeadCP2);
    this.RootRBB.addChild(this.RootRBP1);
    this.FaceMU.addChild(this.Tooth3U);
    this.shapeupR.addChild(this.Toe3R);
    this.FaceMU.addChild(this.MouthR);
    this.RootUBP1.addChild(this.RootUBP2);
    this.SPRobe.addChild(this.SPRobe2L);
    this.RootLNP3_1.addChild(this.RootLNP4_1);
    this.HeadCP3.addChild(this.HeadCP4);
    this.Finger3RB.addChild(this.Finger3RP1);
    this.Neck.addChild(this.Head);
    this.RootLUBP4.addChild(this.RootLUBP5);
    this.Finger1RB.addChild(this.Finger1RP1);
    this.Torso.addChild(this.Neck);
    this.RootLNB_1.addChild(this.RootLNP1_1);
    this.LegLB.addChild(this.LegLP1);
    this.RootLBP2.addChild(this.RootLBP3);
    this.SPRobe.addChild(this.SPCenter);
    this.shapeupR.addChild(this.Toe4R);
    this.RootBP2.addChild(this.RootRUBB);
    this.PalmR.addChild(this.Finger1RB);
    this.FaceMU.addChild(this.Tooth4U);
    this.Finger2LP1.addChild(this.Finger2LE);
    this.Finger3RP1.addChild(this.Finger3RE);
    this.RootRUBP2.addChild(this.RootRUBP3);
    this.shapeupL.addChild(this.Toe4L);
    this.Finger1LB.addChild(this.Finger1LP1);
    this.MouthBase.addChild(this.Tooth1D);
    this.Torso.addChild(this.SPNeckL);
    this.FaceMU.addChild(this.MouthBase);
    this.FaceMU.addChild(this.MouthL);
    this.MouthBase.addChild(this.Tooth4D);
    this.RootRAP2.addChild(this.RootRAP3);
    this.ForeArmR.addChild(this.PalmR);
    this.ThumbRB.addChild(this.ThumbRE);
    this.RootLNP3.addChild(this.RootLNP4);
    this.LegLP1.addChild(this.HeelL);
    this.RootLNP2.addChild(this.RootLNP3);
    this.HeadCB.addChild(this.HeadCP1);
    this.RootRAP3.addChild(this.RootRAP4);
    this.PalmL.addChild(this.Finger2LB);
    this.RootRAB.addChild(this.RootRAP1);
    this.RootRUBP4.addChild(this.RootRUBP5);
    this.RootLUBP2.addChild(this.RootLUBP3);
    this.RootLNP4.addChild(this.RootLNP5);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    GL11.glPushMatrix();
    GL11.glTranslatef(this.Torso.offsetX, this.Torso.offsetY, this.Torso.offsetZ);
    GL11.glTranslatef(this.Torso.rotationPointX * f5, this.Torso.rotationPointY * f5, this.Torso.rotationPointZ * f5);
    GL11.glScaled(1.0D, 1.0D, 1.1D);
    GL11.glTranslatef(-this.Torso.offsetX, -this.Torso.offsetY, -this.Torso.offsetZ);
    GL11.glTranslatef(-this.Torso.rotationPointX * f5, -this.Torso.rotationPointY * f5, -this.Torso.rotationPointZ * f5);
    this.Torso.render(f5);
    GL11.glPopMatrix();
  }
  
  public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
  }
}

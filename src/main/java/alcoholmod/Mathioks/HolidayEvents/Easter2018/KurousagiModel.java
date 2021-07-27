package alcoholmod.Mathioks.HolidayEvents.Easter2018;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class KurousagiModel extends ModelBiped {
  public double[] modelScale = new double[] { 3.0D, 3.0D, 3.0D };
  
  public ModelRenderer MainBody;
  
  public ModelRenderer Neck;
  
  public ModelRenderer BodySP1;
  
  public ModelRenderer LegRB;
  
  public ModelRenderer LegLB;
  
  public ModelRenderer TailBit;
  
  public ModelRenderer ShoulderR;
  
  public ModelRenderer ShoulderL;
  
  public ModelRenderer HeadB;
  
  public ModelRenderer TopLip;
  
  public ModelRenderer BotLip;
  
  public ModelRenderer TopLipSPup;
  
  public ModelRenderer EarRB;
  
  public ModelRenderer EarLB;
  
  public ModelRenderer EyeRTop;
  
  public ModelRenderer EyeLTop;
  
  public ModelRenderer Nose;
  
  public ModelRenderer ToothR;
  
  public ModelRenderer ToothL;
  
  public ModelRenderer BotLipUp;
  
  public ModelRenderer FaceFiller;
  
  public ModelRenderer EarRP1;
  
  public ModelRenderer EarLP1;
  
  public ModelRenderer EyeRP1;
  
  public ModelRenderer EyeLP1;
  
  public ModelRenderer BodySP2;
  
  public ModelRenderer BodySP3;
  
  public ModelRenderer BodySP4;
  
  public ModelRenderer BodySP5;
  
  public ModelRenderer BodySP6;
  
  public ModelRenderer BodySP7;
  
  public ModelRenderer BodySP8;
  
  public ModelRenderer BodySP9;
  
  public ModelRenderer BodySP10;
  
  public ModelRenderer BodySP11;
  
  public ModelRenderer BodySP12;
  
  public ModelRenderer BodySP13Top;
  
  public ModelRenderer LegRP1;
  
  public ModelRenderer LegRSP1;
  
  public ModelRenderer FootRB;
  
  public ModelRenderer FootRP1;
  
  public ModelRenderer ToeR1;
  
  public ModelRenderer ToeR2;
  
  public ModelRenderer LegRSP2;
  
  public ModelRenderer LegRSP3;
  
  public ModelRenderer LegRSP4;
  
  public ModelRenderer LegRSP5;
  
  public ModelRenderer LegRSP6;
  
  public ModelRenderer LegRSP7;
  
  public ModelRenderer LegRSP8;
  
  public ModelRenderer LegRSP9;
  
  public ModelRenderer LegRSP10;
  
  public ModelRenderer LegRSP11;
  
  public ModelRenderer LegLP1;
  
  public ModelRenderer LegLSP1;
  
  public ModelRenderer FootLB;
  
  public ModelRenderer FootLP1;
  
  public ModelRenderer ToeL2;
  
  public ModelRenderer ToeL1;
  
  public ModelRenderer LegLSP2;
  
  public ModelRenderer LegLSP3;
  
  public ModelRenderer LegLSP4;
  
  public ModelRenderer LegLSP5;
  
  public ModelRenderer LegLSP6;
  
  public ModelRenderer LegLSP7;
  
  public ModelRenderer LegLSP8;
  
  public ModelRenderer LegLSP9;
  
  public ModelRenderer LegLSP10;
  
  public ModelRenderer LegLSP11;
  
  public ModelRenderer TailFluff;
  
  public ModelRenderer ArmRB;
  
  public ModelRenderer ArmRP1;
  
  public ModelRenderer HandRPalm;
  
  public ModelRenderer Finger1RB;
  
  public ModelRenderer Finger2RB;
  
  public ModelRenderer Finger3RB;
  
  public ModelRenderer HandRSPPalm;
  
  public ModelRenderer ThumbRB;
  
  public ModelRenderer HugeKnifeHandle;
  
  public ModelRenderer Finger1RP1;
  
  public ModelRenderer Finger1RP2;
  
  public ModelRenderer Finger2RP1;
  
  public ModelRenderer Finger2RP2;
  
  public ModelRenderer Finger3RP1;
  
  public ModelRenderer Finger3RP2;
  
  public ModelRenderer ThumbRP1;
  
  public ModelRenderer ThumbRP2;
  
  public ModelRenderer HugeKnifeHandleEnd;
  
  public ModelRenderer HugeKnifeBladeB;
  
  public ModelRenderer BladeSP1;
  
  public ModelRenderer BladeFiller1;
  
  public ModelRenderer HugeKnifeBladeBR;
  
  public ModelRenderer BladeSP2;
  
  public ModelRenderer BladeSP1Sharp;
  
  public ModelRenderer BladeSP3;
  
  public ModelRenderer BladeSP2Sharp;
  
  public ModelRenderer BladeSP4;
  
  public ModelRenderer BladeSP3Sharp;
  
  public ModelRenderer BladeSP5;
  
  public ModelRenderer BladeSP4Sharp;
  
  public ModelRenderer BladeSP6;
  
  public ModelRenderer BladeSP5Sharp;
  
  public ModelRenderer BladeSP7;
  
  public ModelRenderer BladeSP6Sharp;
  
  public ModelRenderer BladeSP8;
  
  public ModelRenderer BladeSP7Sharp;
  
  public ModelRenderer BladeSP9;
  
  public ModelRenderer BladeSP8Sharp;
  
  public ModelRenderer BladeSP10;
  
  public ModelRenderer BladeSP9Sharp;
  
  public ModelRenderer BladeSP11;
  
  public ModelRenderer BladeSP10Sharp;
  
  public ModelRenderer BladeFiller2;
  
  public ModelRenderer BladeFiller3;
  
  public ModelRenderer BladeFiller1R;
  
  public ModelRenderer BladeSP1R;
  
  public ModelRenderer BladeFiller2R;
  
  public ModelRenderer BladeFiller3R;
  
  public ModelRenderer BladeSP2R;
  
  public ModelRenderer BladeSP3R;
  
  public ModelRenderer BladeSP4R;
  
  public ModelRenderer BladeSP5R;
  
  public ModelRenderer BladeSP6R;
  
  public ModelRenderer BladeSP7R;
  
  public ModelRenderer BladeSP8R;
  
  public ModelRenderer BladeSP9R;
  
  public ModelRenderer BladeSP10R;
  
  public ModelRenderer BladeSP11R;
  
  public ModelRenderer ArmLB;
  
  public ModelRenderer ArmLP1;
  
  public ModelRenderer HandLPalm;
  
  public ModelRenderer Finger1LB;
  
  public ModelRenderer Finger2LB;
  
  public ModelRenderer HandLSPPalm;
  
  public ModelRenderer Finger3LB;
  
  public ModelRenderer ThumbLB;
  
  public ModelRenderer Finger1LP1;
  
  public ModelRenderer Finger1LP2;
  
  public ModelRenderer Finger2LP1;
  
  public ModelRenderer Finger2LP2;
  
  public ModelRenderer Finger3LP1;
  
  public ModelRenderer Finger3LP2;
  
  public ModelRenderer ThumbLP1;
  
  public ModelRenderer ThumbLP2;
  
  public KurousagiModel() {
    this.textureWidth = 300;
    this.textureHeight = 300;
    this.BladeSP1R = new ModelRenderer((ModelBase)this, 192, 191);
    this.BladeSP1R.setRotationPoint(0.0F, 1.03F, 0.27F);
    this.BladeSP1R.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP1R, -0.27646014F, 0.0F, 0.0F);
    this.ThumbRB = new ModelRenderer((ModelBase)this, 62, 152);
    this.ThumbRB.setRotationPoint(2.14F, 1.0F, 0.42F);
    this.ThumbRB.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.ThumbRB, 0.0F, 0.0F, -0.43982297F);
    this.BladeSP9Sharp = new ModelRenderer((ModelBase)this, 246, 156);
    this.BladeSP9Sharp.setRotationPoint(0.72F, 0.3F, -0.11F);
    this.BladeSP9Sharp.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP9Sharp, 0.0F, 0.0F, 0.7853982F);
    this.ToeR1 = new ModelRenderer((ModelBase)this, 95, 114);
    this.ToeR1.setRotationPoint(0.0F, 0.0F, -1.0F);
    this.ToeR1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    this.LegRSP2 = new ModelRenderer((ModelBase)this, 129, 120);
    this.LegRSP2.setRotationPoint(0.0F, 1.34F, -0.22F);
    this.LegRSP2.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
    setRotateAngle(this.LegRSP2, 1.2566371F, 0.0F, 0.0F);
    this.BladeSP4 = new ModelRenderer((ModelBase)this, 211, 150);
    this.BladeSP4.setRotationPoint(0.0F, 0.0F, 1.87F);
    this.BladeSP4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP4, 0.13194689F, 0.0F, 0.0F);
    this.LegRSP3 = new ModelRenderer((ModelBase)this, 114, 119);
    this.LegRSP3.setRotationPoint(0.0F, 1.77F, -0.97F);
    this.LegRSP3.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
    setRotateAngle(this.LegRSP3, 1.3508848F, 0.0F, 0.0F);
    this.LegRSP8 = new ModelRenderer((ModelBase)this, 49, 119);
    this.LegRSP8.setRotationPoint(0.0F, 0.01F, 0.01F);
    this.LegRSP8.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
    setRotateAngle(this.LegRSP8, 1.4451326F, 0.0F, 0.0F);
    this.LegRB = new ModelRenderer((ModelBase)this, 17, 103);
    this.LegRB.setRotationPoint(-0.6F, 18.0F, 3.0F);
    this.LegRB.addBox(0.0F, 0.0F, 0.0F, 4, 9, 5, 0.0F);
    setRotateAngle(this.LegRB, -0.7874926F, 0.0F, 0.0F);
    this.ThumbLP2 = new ModelRenderer((ModelBase)this, 71, 183);
    this.ThumbLP2.setRotationPoint(0.1F, 0.5F, 0.0F);
    this.ThumbLP2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.ThumbLP2, 0.0F, 0.0F, 0.49637163F);
    this.BotLipUp = new ModelRenderer((ModelBase)this, 106, 64);
    this.BotLipUp.setRotationPoint(0.0F, -1.0F, 0.0F);
    this.BotLipUp.addBox(0.0F, 0.0F, 0.0F, 7, 1, 5, 0.0F);
    this.LegLSP5 = new ModelRenderer((ModelBase)this, 88, 143);
    this.LegLSP5.setRotationPoint(0.0F, 2.97F, 0.58F);
    this.LegLSP5.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
    setRotateAngle(this.LegLSP5, 1.4325663F, 0.0F, 0.0F);
    this.ArmRP1 = new ModelRenderer((ModelBase)this, 30, 152);
    this.ArmRP1.setRotationPoint(0.0F, 6.5F, 1.29F);
    this.ArmRP1.addBox(0.0F, 0.0F, 0.0F, 3, 8, 3, 0.0F);
    setRotateAngle(this.ArmRP1, -0.9361946F, -0.0062831854F, 0.0F);
    this.BladeFiller2 = new ModelRenderer((ModelBase)this, 155, 163);
    this.BladeFiller2.setRotationPoint(0.0F, 0.8F, 1.5F);
    this.BladeFiller2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F);
    this.Finger2LB = new ModelRenderer((ModelBase)this, 61, 191);
    this.Finger2LB.setRotationPoint(0.0F, 1.0F, 1.2F);
    this.Finger2LB.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.Finger1RB = new ModelRenderer((ModelBase)this, 62, 155);
    this.Finger1RB.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.Finger1RB.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Finger1RB, 0.0F, 0.0F, -0.15079644F);
    this.BladeSP10R = new ModelRenderer((ModelBase)this, 256, 191);
    this.BladeSP10R.setRotationPoint(0.0F, 0.0F, 1.87F);
    this.BladeSP10R.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP10R, 0.13194689F, 0.0F, 0.0F);
    this.ArmLP1 = new ModelRenderer((ModelBase)this, 28, 184);
    this.ArmLP1.setRotationPoint(3.0F, 8.99F, 2.99F);
    this.ArmLP1.addBox(0.0F, 0.0F, 0.0F, 3, 8, 3, 0.0F);
    setRotateAngle(this.ArmLP1, -2.205398F, 0.0F, 3.1415927F);
    this.Finger3RB = new ModelRenderer((ModelBase)this, 62, 161);
    this.Finger3RB.setRotationPoint(0.0F, 1.0F, 2.4F);
    this.Finger3RB.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Finger3RB, 0.0F, 0.0F, -0.15079644F);
    this.ThumbRP1 = new ModelRenderer((ModelBase)this, 67, 152);
    this.ThumbRP1.setRotationPoint(0.12F, 0.49F, 0.0F);
    this.ThumbRP1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.ThumbRP1, 0.0F, 0.0F, 0.5215044F);
    this.BladeFiller2R = new ModelRenderer((ModelBase)this, 158, 209);
    this.BladeFiller2R.setRotationPoint(0.0F, 0.8F, 1.5F);
    this.BladeFiller2R.addBox(0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F);
    this.LegLSP11 = new ModelRenderer((ModelBase)this, 16, 143);
    this.LegLSP11.setRotationPoint(0.0F, 0.0F, 1.0F);
    this.LegLSP11.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
    setRotateAngle(this.LegLSP11, -0.11309733F, 0.0F, 0.0F);
    this.BodySP11 = new ModelRenderer((ModelBase)this, 64, 25);
    this.BodySP11.setRotationPoint(0.0F, -0.96F, 0.3F);
    this.BodySP11.addBox(0.0F, 0.0F, 0.0F, 11, 1, 3, 0.0F);
    setRotateAngle(this.BodySP11, -0.31415927F, 0.0F, 0.0F);
    this.EyeRTop = new ModelRenderer((ModelBase)this, 108, 13);
    this.EyeRTop.setRotationPoint(-0.4F, 0.6F, 0.0F);
    this.EyeRTop.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    this.EyeLP1 = new ModelRenderer((ModelBase)this, 119, 17);
    this.EyeLP1.setRotationPoint(0.0F, 0.5F, 0.5F);
    this.EyeLP1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.BladeSP4R = new ModelRenderer((ModelBase)this, 213, 191);
    this.BladeSP4R.setRotationPoint(0.0F, 0.0F, 1.87F);
    this.BladeSP4R.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP4R, 0.13194689F, 0.0F, 0.0F);
    this.ArmRB = new ModelRenderer((ModelBase)this, 16, 151);
    this.ArmRB.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.ArmRB.addBox(0.0F, 0.0F, 0.0F, 3, 9, 3, 0.0F);
    setRotateAngle(this.ArmRB, 0.0F, 0.0F, 0.28274333F);
    this.BladeSP3 = new ModelRenderer((ModelBase)this, 204, 150);
    this.BladeSP3.setRotationPoint(0.0F, 0.0F, 1.87F);
    this.BladeSP3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP3, -0.07539822F, 0.0F, 0.0F);
    this.TailBit = new ModelRenderer((ModelBase)this, 32, 61);
    this.TailBit.setRotationPoint(5.0F, 22.0F, 9.0F);
    this.TailBit.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.TailBit, -0.6220353F, 0.0F, 0.0F);
    this.LegRSP7 = new ModelRenderer((ModelBase)this, 60, 119);
    this.LegRSP7.setRotationPoint(0.0F, 2.87F, -0.93F);
    this.LegRSP7.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
    setRotateAngle(this.LegRSP7, 1.4451326F, 0.0F, 0.0F);
    this.FootLP1 = new ModelRenderer((ModelBase)this, 80, 135);
    this.FootLP1.setRotationPoint(0.0F, -0.4F, -2.0F);
    this.FootLP1.addBox(0.0F, 0.0F, 0.0F, 5, 2, 3, 0.0F);
    setRotateAngle(this.FootLP1, -0.19477874F, 0.0F, 0.0F);
    this.BladeSP4Sharp = new ModelRenderer((ModelBase)this, 211, 156);
    this.BladeSP4Sharp.setRotationPoint(0.72F, 0.3F, -0.07F);
    this.BladeSP4Sharp.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP4Sharp, 0.0F, 0.0F, 0.7853982F);
    this.Finger1RP1 = new ModelRenderer((ModelBase)this, 67, 155);
    this.Finger1RP1.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.Finger1RP1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Finger1RP1, 0.0F, 0.0F, -0.5215044F);
    this.LegLB = new ModelRenderer((ModelBase)this, 17, 126);
    this.LegLB.setRotationPoint(7.6F, 18.0F, 3.0F);
    this.LegLB.addBox(0.0F, 0.0F, 0.0F, 4, 9, 5, 0.0F);
    setRotateAngle(this.LegLB, -0.7979645F, 0.0062831854F, 0.0F);
    this.BladeSP11 = new ModelRenderer((ModelBase)this, 260, 151);
    this.BladeSP11.setRotationPoint(0.0F, 0.4F, 1.4F);
    this.BladeSP11.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.BladeSP11, 0.8545132F, 0.0F, 0.0F);
    this.BladeSP8R = new ModelRenderer((ModelBase)this, 242, 191);
    this.BladeSP8R.setRotationPoint(0.0F, 0.0F, 1.87F);
    this.BladeSP8R.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP8R, 0.13194689F, 0.0F, 0.0F);
    this.BladeSP6R = new ModelRenderer((ModelBase)this, 228, 191);
    this.BladeSP6R.setRotationPoint(0.0F, 0.0F, 1.87F);
    this.BladeSP6R.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP6R, 0.13194689F, 0.0F, 0.0F);
    this.LegLSP9 = new ModelRenderer((ModelBase)this, 39, 143);
    this.LegLSP9.setRotationPoint(0.0F, 0.01F, 0.98F);
    this.LegLSP9.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
    setRotateAngle(this.LegLSP9, -0.31415927F, 0.0F, 0.0F);
    this.EyeRP1 = new ModelRenderer((ModelBase)this, 109, 18);
    this.EyeRP1.setRotationPoint(0.0F, 0.5F, 0.5F);
    this.EyeRP1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.ThumbLP1 = new ModelRenderer((ModelBase)this, 66, 183);
    this.ThumbLP1.setRotationPoint(0.12F, 0.49F, 0.0F);
    this.ThumbLP1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.ThumbLP1, 0.0F, 0.0F, 0.5215044F);
    this.TopLip = new ModelRenderer((ModelBase)this, 107, 40);
    this.TopLip.setRotationPoint(0.0F, 2.7F, -4.22F);
    this.TopLip.addBox(0.0F, 0.0F, 0.0F, 7, 2, 6, 0.0F);
    this.FootRB = new ModelRenderer((ModelBase)this, 55, 109);
    this.FootRB.setRotationPoint(-0.5F, 10.9F, -1.0F);
    this.FootRB.addBox(0.0F, 0.0F, 0.0F, 5, 2, 6, 0.0F);
    this.BladeSP6 = new ModelRenderer((ModelBase)this, 225, 150);
    this.BladeSP6.setRotationPoint(0.0F, 0.0F, 1.87F);
    this.BladeSP6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP6, 0.13194689F, 0.0F, 0.0F);
    this.HandLSPPalm = new ModelRenderer((ModelBase)this, 55, 191);
    this.HandLSPPalm.setRotationPoint(0.0F, 0.39F, 2.12F);
    this.HandLSPPalm.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.HandLSPPalm, 0.33929202F, 0.0F, 0.0F);
    this.BladeSP10Sharp = new ModelRenderer((ModelBase)this, 253, 156);
    this.BladeSP10Sharp.setRotationPoint(0.72F, 0.3F, -0.2F);
    this.BladeSP10Sharp.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP10Sharp, 0.0F, 0.0F, 0.7853982F);
    this.ThumbLB = new ModelRenderer((ModelBase)this, 61, 183);
    this.ThumbLB.setRotationPoint(2.24F, 1.0F, 1.58F);
    this.ThumbLB.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.ThumbLB, 0.0F, 0.0F, -0.43982297F);
    this.BladeSP5 = new ModelRenderer((ModelBase)this, 218, 150);
    this.BladeSP5.setRotationPoint(0.0F, 0.0F, 1.87F);
    this.BladeSP5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP5, 0.13194689F, 0.0F, 0.0F);
    this.Finger2RP1 = new ModelRenderer((ModelBase)this, 67, 158);
    this.Finger2RP1.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.Finger2RP1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Finger2RP1, 0.0F, 0.0F, -0.5215044F);
    this.HugeKnifeHandleEnd = new ModelRenderer((ModelBase)this, 80, 157);
    this.HugeKnifeHandleEnd.setRotationPoint(-0.5F, -0.5F, -1.0F);
    this.HugeKnifeHandleEnd.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    this.BodySP13Top = new ModelRenderer((ModelBase)this, 63, 6);
    this.BodySP13Top.setRotationPoint(0.0F, -7.69F, -0.06F);
    this.BodySP13Top.addBox(0.0F, 0.0F, 0.0F, 11, 8, 3, 0.0F);
    setRotateAngle(this.BodySP13Top, 0.0062831854F, 0.0F, 0.0F);
    this.LegLSP4 = new ModelRenderer((ModelBase)this, 104, 143);
    this.LegLSP4.setRotationPoint(0.0F, 0.02F, 0.0F);
    this.LegLSP4.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
    setRotateAngle(this.LegLSP4, 1.4514158F, 0.0F, 0.0F);
    this.BladeSP1Sharp = new ModelRenderer((ModelBase)this, 190, 156);
    this.BladeSP1Sharp.setRotationPoint(0.72F, 0.3F, 0.0F);
    this.BladeSP1Sharp.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP1Sharp, 0.0F, 0.0F, 0.7853982F);
    this.BladeSP11R = new ModelRenderer((ModelBase)this, 263, 192);
    this.BladeSP11R.setRotationPoint(0.0F, 0.4F, 1.4F);
    this.BladeSP11R.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.BladeSP11R, 0.8545132F, 0.0F, 0.0F);
    this.EarLB = new ModelRenderer((ModelBase)this, 154, 35);
    this.EarLB.setRotationPoint(7.1F, -4.7F, 10.9F);
    this.EarLB.addBox(0.0F, 0.0F, 0.0F, 1, 8, 2, 0.0F);
    setRotateAngle(this.EarLB, -0.83391833F, 0.25132743F, 0.0F);
    this.LegRSP9 = new ModelRenderer((ModelBase)this, 38, 119);
    this.LegRSP9.setRotationPoint(0.0F, 0.01F, 0.98F);
    this.LegRSP9.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
    setRotateAngle(this.LegRSP9, -0.31415927F, 0.0F, 0.0F);
    this.Finger3RP1 = new ModelRenderer((ModelBase)this, 67, 161);
    this.Finger3RP1.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.Finger3RP1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Finger3RP1, 0.0F, 0.0F, -0.5215044F);
    this.Finger3LP2 = new ModelRenderer((ModelBase)this, 71, 187);
    this.Finger3LP2.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.Finger3LP2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Finger3LP2, 0.0F, 0.0F, -0.49637163F);
    this.LegLSP7 = new ModelRenderer((ModelBase)this, 62, 143);
    this.LegLSP7.setRotationPoint(0.0F, 2.87F, -0.93F);
    this.LegLSP7.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
    setRotateAngle(this.LegLSP7, 1.4451326F, 0.0F, 0.0F);
    this.BladeSP7Sharp = new ModelRenderer((ModelBase)this, 232, 156);
    this.BladeSP7Sharp.setRotationPoint(0.72F, 0.25F, -0.36F);
    this.BladeSP7Sharp.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
    setRotateAngle(this.BladeSP7Sharp, 0.0F, 0.0F, 0.7853982F);
    this.BladeFiller1 = new ModelRenderer((ModelBase)this, 152, 146);
    this.BladeFiller1.setRotationPoint(0.0F, 1.6F, 3.0F);
    this.BladeFiller1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 15, 0.0F);
    this.BodySP9 = new ModelRenderer((ModelBase)this, 64, 40);
    this.BodySP9.setRotationPoint(0.0F, -0.96F, 0.3F);
    this.BodySP9.addBox(0.0F, 0.0F, 0.0F, 11, 1, 3, 0.0F);
    setRotateAngle(this.BodySP9, -0.31415927F, 0.0F, 0.0F);
    this.HandRPalm = new ModelRenderer((ModelBase)this, 43, 159);
    this.HandRPalm.setRotationPoint(0.0F, 8.0F, 0.0F);
    this.HandRPalm.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
    setRotateAngle(this.HandRPalm, 0.33300883F, 0.0F, 0.0F);
    this.ShoulderR = new ModelRenderer((ModelBase)this, 0, 105);
    this.ShoulderR.setRotationPoint(-1.4F, 0.0F, 3.0F);
    this.ShoulderR.addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
    this.Finger1LP1 = new ModelRenderer((ModelBase)this, 66, 194);
    this.Finger1LP1.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.Finger1LP1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Finger1LP1, 0.0F, 0.0F, -0.45238933F);
    this.BladeSP7R = new ModelRenderer((ModelBase)this, 235, 191);
    this.BladeSP7R.setRotationPoint(0.0F, 0.0F, 1.87F);
    this.BladeSP7R.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP7R, 0.13194689F, 0.0F, 0.0F);
    this.BladeFiller3 = new ModelRenderer((ModelBase)this, 160, 177);
    this.BladeFiller3.setRotationPoint(0.0F, 0.7F, 2.6F);
    this.BladeFiller3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F);
    this.Finger1LP2 = new ModelRenderer((ModelBase)this, 71, 194);
    this.Finger1LP2.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.Finger1LP2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Finger1LP2, 0.0F, 0.0F, -0.49637163F);
    this.BladeSP10 = new ModelRenderer((ModelBase)this, 253, 150);
    this.BladeSP10.setRotationPoint(0.0F, 0.0F, 1.87F);
    this.BladeSP10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP10, 0.13194689F, 0.0F, 0.0F);
    this.BodySP7 = new ModelRenderer((ModelBase)this, 64, 54);
    this.BodySP7.setRotationPoint(0.0F, -0.96F, 0.3F);
    this.BodySP7.addBox(0.0F, 0.0F, 0.0F, 11, 1, 3, 0.0F);
    setRotateAngle(this.BodySP7, -0.31415927F, 0.0F, 0.0F);
    this.Finger1LB = new ModelRenderer((ModelBase)this, 61, 194);
    this.Finger1LB.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.Finger1LB.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.BladeSP3R = new ModelRenderer((ModelBase)this, 206, 191);
    this.BladeSP3R.setRotationPoint(0.0F, 0.0F, 1.87F);
    this.BladeSP3R.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP3R, -0.07539822F, 0.0F, 0.0F);
    this.FootLB = new ModelRenderer((ModelBase)this, 55, 132);
    this.FootLB.setRotationPoint(-0.5F, 10.9F, -1.0F);
    this.FootLB.addBox(0.0F, 0.0F, 0.0F, 5, 2, 6, 0.0F);
    this.LegLSP3 = new ModelRenderer((ModelBase)this, 115, 143);
    this.LegLSP3.setRotationPoint(0.0F, 1.77F, -0.97F);
    this.LegLSP3.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
    setRotateAngle(this.LegLSP3, 1.3508848F, 0.0F, 0.0F);
    this.EarRB = new ModelRenderer((ModelBase)this, 140, 34);
    this.EarRB.setRotationPoint(-0.7F, -3.3F, 9.0F);
    this.EarRB.addBox(0.0F, 0.0F, 0.0F, 1, 8, 2, 0.0F);
    setRotateAngle(this.EarRB, -0.8356636F, -0.25132743F, 0.0F);
    this.HandLPalm = new ModelRenderer((ModelBase)this, 41, 191);
    this.HandLPalm.setRotationPoint(0.0F, 7.0F, 0.15F);
    this.HandLPalm.addBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F);
    setRotateAngle(this.HandLPalm, -0.33300883F, 0.0F, 0.0F);
    this.BladeSP8Sharp = new ModelRenderer((ModelBase)this, 239, 155);
    this.BladeSP8Sharp.setRotationPoint(0.72F, 0.3F, 0.0F);
    this.BladeSP8Sharp.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP8Sharp, 0.0F, 0.0F, 0.7853982F);
    this.BladeSP2Sharp = new ModelRenderer((ModelBase)this, 197, 156);
    this.BladeSP2Sharp.setRotationPoint(0.72F, 0.3F, 0.0F);
    this.BladeSP2Sharp.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP2Sharp, 0.0F, 0.0F, 0.7853982F);
    this.BladeSP5Sharp = new ModelRenderer((ModelBase)this, 218, 156);
    this.BladeSP5Sharp.setRotationPoint(0.72F, 0.3F, -0.17F);
    this.BladeSP5Sharp.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP5Sharp, 0.0F, 0.0F, 0.7853982F);
    this.BladeSP8 = new ModelRenderer((ModelBase)this, 239, 150);
    this.BladeSP8.setRotationPoint(0.0F, 0.0F, 1.87F);
    this.BladeSP8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP8, 0.13194689F, 0.0F, 0.0F);
    this.HandRSPPalm = new ModelRenderer((ModelBase)this, 56, 161);
    this.HandRSPPalm.setRotationPoint(0.0F, 0.39F, 2.12F);
    this.HandRSPPalm.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.HandRSPPalm, 0.33929202F, 0.0F, 0.0F);
    this.Finger1RP2 = new ModelRenderer((ModelBase)this, 72, 155);
    this.Finger1RP2.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.Finger1RP2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Finger1RP2, 0.0F, 0.0F, -0.49637163F);
    this.BotLip = new ModelRenderer((ModelBase)this, 106, 73);
    this.BotLip.setRotationPoint(0.0F, 5.9F, -3.7F);
    this.BotLip.addBox(0.0F, 0.0F, 0.0F, 7, 1, 5, 0.0F);
    this.TailFluff = new ModelRenderer((ModelBase)this, 31, 54);
    this.TailFluff.setRotationPoint(-0.5F, -0.4F, 0.7F);
    this.TailFluff.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    this.Finger3LP1 = new ModelRenderer((ModelBase)this, 66, 187);
    this.Finger3LP1.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.Finger3LP1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Finger3LP1, 0.0F, 0.0F, -0.4272566F);
    this.BladeSP9 = new ModelRenderer((ModelBase)this, 246, 150);
    this.BladeSP9.setRotationPoint(0.0F, 0.0F, 1.87F);
    this.BladeSP9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP9, 0.13194689F, 0.0F, 0.0F);
    this.HugeKnifeHandle = new ModelRenderer((ModelBase)this, 88, 153);
    this.HugeKnifeHandle.setRotationPoint(1.3F, 1.0F, -1.0F);
    this.HugeKnifeHandle.addBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F);
    this.LegLSP10 = new ModelRenderer((ModelBase)this, 28, 143);
    this.LegLSP10.setRotationPoint(0.0F, 0.01F, 1.0F);
    this.LegLSP10.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
    setRotateAngle(this.LegLSP10, -0.30787608F, 0.0F, 0.0F);
    this.HeadB = new ModelRenderer((ModelBase)this, 139, 53);
    this.HeadB.setRotationPoint(-1.0F, -7.0F, -1.0F);
    this.HeadB.addBox(0.0F, 0.0F, 0.0F, 7, 7, 7, 0.0F);
    this.LegLP1 = new ModelRenderer((ModelBase)this, 37, 125);
    this.LegLP1.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.LegLP1.addBox(0.0F, 0.0F, 0.0F, 4, 11, 4, 0.0F);
    setRotateAngle(this.LegLP1, 0.6723008F, 0.0F, 0.0F);
    this.BodySP6 = new ModelRenderer((ModelBase)this, 64, 60);
    this.BodySP6.setRotationPoint(0.0F, -0.99F, 0.19F);
    this.BodySP6.addBox(0.0F, 0.0F, 0.0F, 11, 1, 3, 0.0F);
    setRotateAngle(this.BodySP6, -0.20106193F, 0.0F, 0.0F);
    this.ThumbRP2 = new ModelRenderer((ModelBase)this, 72, 152);
    this.ThumbRP2.setRotationPoint(0.1F, 0.5F, 0.0F);
    this.ThumbRP2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.ThumbRP2, 0.0F, 0.0F, 0.49637163F);
    this.EarLP1 = new ModelRenderer((ModelBase)this, 154, 21);
    this.EarLP1.setRotationPoint(0.0F, -3.8F, 3.3F);
    this.EarLP1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F);
    setRotateAngle(this.EarLP1, -0.7225663F, 0.0F, 0.0F);
    this.ToeR2 = new ModelRenderer((ModelBase)this, 95, 110);
    this.ToeR2.setRotationPoint(3.1F, 0.0F, -1.0F);
    this.ToeR2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    this.Finger3LB = new ModelRenderer((ModelBase)this, 61, 187);
    this.Finger3LB.setRotationPoint(0.0F, 1.0F, 2.4F);
    this.Finger3LB.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    this.FaceFiller = new ModelRenderer((ModelBase)this, 111, 36);
    this.FaceFiller.setRotationPoint(0.0F, 1.0F, 2.0F);
    this.FaceFiller.addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
    this.LegRSP5 = new ModelRenderer((ModelBase)this, 87, 119);
    this.LegRSP5.setRotationPoint(0.0F, 2.97F, 0.58F);
    this.LegRSP5.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
    setRotateAngle(this.LegRSP5, 1.4325663F, 0.0F, 0.0F);
    this.LegLSP6 = new ModelRenderer((ModelBase)this, 77, 143);
    this.LegLSP6.setRotationPoint(0.0F, 1.31F, -0.15F);
    this.LegLSP6.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
    setRotateAngle(this.LegLSP6, 1.3508848F, 0.0F, 0.0F);
    this.BodySP2 = new ModelRenderer((ModelBase)this, 64, 88);
    this.BodySP2.setRotationPoint(0.0F, -0.91F, -0.24F);
    this.BodySP2.addBox(0.0F, 0.0F, 0.0F, 11, 1, 3, 0.0F);
    setRotateAngle(this.BodySP2, 0.25132743F, 0.0F, 0.0F);
    this.BodySP3 = new ModelRenderer((ModelBase)this, 64, 81);
    this.BodySP3.setRotationPoint(0.0F, -1.91F, -0.18F);
    this.BodySP3.addBox(0.0F, 0.0F, 0.0F, 11, 2, 3, 0.0F);
    setRotateAngle(this.BodySP3, 0.087964594F, 0.0F, 0.0F);
    this.Finger2LP2 = new ModelRenderer((ModelBase)this, 71, 191);
    this.Finger2LP2.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.Finger2LP2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Finger2LP2, 0.0F, 0.0F, -0.49637163F);
    this.TopLipSPup = new ModelRenderer((ModelBase)this, 109, 25);
    this.TopLipSPup.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.TopLipSPup.addBox(0.0F, 0.0F, 0.0F, 7, 5, 2, 0.0F);
    setRotateAngle(this.TopLipSPup, -0.9990265F, 0.0F, 0.0F);
    this.BodySP12 = new ModelRenderer((ModelBase)this, 64, 19);
    this.BodySP12.setRotationPoint(0.0F, -0.96F, 0.12F);
    this.BodySP12.addBox(0.0F, 0.0F, 0.0F, 11, 1, 3, 0.0F);
    setRotateAngle(this.BodySP12, -0.10681415F, 0.0F, 0.0F);
    this.BladeSP3Sharp = new ModelRenderer((ModelBase)this, 204, 156);
    this.BladeSP3Sharp.setRotationPoint(0.72F, 0.3F, 0.0F);
    this.BladeSP3Sharp.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP3Sharp, 0.0F, 0.0F, 0.7853982F);
    this.LegRP1 = new ModelRenderer((ModelBase)this, 36, 103);
    this.LegRP1.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.LegRP1.addBox(0.0F, 0.0F, 0.0F, 4, 11, 4, 0.0F);
    setRotateAngle(this.LegRP1, 0.6723008F, 0.0F, 0.0F);
    this.LegRSP11 = new ModelRenderer((ModelBase)this, 16, 119);
    this.LegRSP11.setRotationPoint(0.0F, 0.0F, 1.0F);
    this.LegRSP11.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
    setRotateAngle(this.LegRSP11, -0.11309733F, 0.0F, 0.0F);
    this.BladeSP2 = new ModelRenderer((ModelBase)this, 197, 150);
    this.BladeSP2.setRotationPoint(0.0F, 0.0F, 1.86F);
    this.BladeSP2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP2, -0.07539822F, 0.0F, 0.0F);
    this.BladeFiller1R = new ModelRenderer((ModelBase)this, 155, 190);
    this.BladeFiller1R.setRotationPoint(0.0F, 1.6F, 3.0F);
    this.BladeFiller1R.addBox(0.0F, 0.0F, 0.0F, 1, 1, 15, 0.0F);
    this.BladeSP5R = new ModelRenderer((ModelBase)this, 220, 191);
    this.BladeSP5R.setRotationPoint(0.0F, 0.0F, 1.87F);
    this.BladeSP5R.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP5R, 0.13194689F, 0.0F, 0.0F);
    this.BodySP1 = new ModelRenderer((ModelBase)this, 64, 94);
    this.BodySP1.setRotationPoint(0.0F, 8.0F, -0.24F);
    this.BodySP1.addBox(0.0F, 0.0F, 0.0F, 11, 1, 3, 0.0F);
    setRotateAngle(this.BodySP1, 0.25132743F, 0.0F, 0.0F);
    this.LegRSP4 = new ModelRenderer((ModelBase)this, 102, 119);
    this.LegRSP4.setRotationPoint(0.0F, 0.02F, 0.0F);
    this.LegRSP4.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
    setRotateAngle(this.LegRSP4, 1.4514158F, 0.0F, 0.0F);
    this.BodySP4 = new ModelRenderer((ModelBase)this, 64, 74);
    this.BodySP4.setRotationPoint(0.0F, -1.86F, 0.14F);
    this.BodySP4.addBox(0.0F, 0.0F, 0.0F, 11, 2, 4, 0.0F);
    setRotateAngle(this.BodySP4, -0.069115035F, 0.0F, 0.0F);
    this.LegLSP1 = new ModelRenderer((ModelBase)this, 142, 144);
    this.LegLSP1.setRotationPoint(0.0F, 1.66F, 3.9F);
    this.LegLSP1.addBox(0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F);
    setRotateAngle(this.LegLSP1, 0.9864601F, 0.0F, 0.0F);
    this.MainBody = new ModelRenderer((ModelBase)this, 15, 68);
    this.MainBody.setRotationPoint(-5.5F, 35.0F, -7.0F);
    this.MainBody.addBox(0.0F, 0.0F, 0.0F, 11, 23, 9, 0.0F);
    setRotateAngle(this.MainBody, 0.34557518F, 0.0F, 0.0F);
    this.Finger2RB = new ModelRenderer((ModelBase)this, 62, 158);
    this.Finger2RB.setRotationPoint(0.0F, 1.0F, 1.2F);
    this.Finger2RB.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Finger2RB, 0.0F, 0.0F, -0.15079644F);
    this.BladeSP1 = new ModelRenderer((ModelBase)this, 190, 150);
    this.BladeSP1.setRotationPoint(0.0F, 1.03F, 0.27F);
    this.BladeSP1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP1, -0.27646014F, 0.0F, 0.0F);
    this.HugeKnifeBladeBR = new ModelRenderer((ModelBase)this, 110, 190);
    this.HugeKnifeBladeBR.setRotationPoint(0.4F, 0.0F, 0.0F);
    this.HugeKnifeBladeBR.addBox(0.0F, 0.0F, 0.0F, 1, 2, 19, 0.0F);
    this.BladeSP7 = new ModelRenderer((ModelBase)this, 232, 150);
    this.BladeSP7.setRotationPoint(0.0F, 0.0F, 1.87F);
    this.BladeSP7.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP7, 0.13194689F, 0.0F, 0.0F);
    this.BladeSP6Sharp = new ModelRenderer((ModelBase)this, 225, 156);
    this.BladeSP6Sharp.setRotationPoint(0.72F, 0.3F, -0.3F);
    this.BladeSP6Sharp.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP6Sharp, 0.0F, 0.0F, 0.7853982F);
    this.ToothR = new ModelRenderer((ModelBase)this, 116, 55);
    this.ToothR.setRotationPoint(2.5F, 1.6F, 0.1F);
    this.ToothR.addBox(0.0F, 0.0F, 0.0F, 1, 1, 0, 0.0F);
    this.EyeLTop = new ModelRenderer((ModelBase)this, 118, 13);
    this.EyeLTop.setRotationPoint(6.4F, 0.6F, 0.0F);
    this.EyeLTop.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    this.LegRSP10 = new ModelRenderer((ModelBase)this, 27, 119);
    this.LegRSP10.setRotationPoint(0.0F, 0.01F, 1.0F);
    this.LegRSP10.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
    setRotateAngle(this.LegRSP10, -0.30787608F, 0.0F, 0.0F);
    this.BodySP8 = new ModelRenderer((ModelBase)this, 64, 46);
    this.BodySP8.setRotationPoint(0.0F, -0.96F, 0.3F);
    this.BodySP8.addBox(0.0F, 0.0F, 0.0F, 11, 1, 5, 0.0F);
    setRotateAngle(this.BodySP8, -0.31415927F, 0.0F, 0.0F);
    this.Finger3RP2 = new ModelRenderer((ModelBase)this, 72, 161);
    this.Finger3RP2.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.Finger3RP2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Finger3RP2, 0.0F, 0.0F, -0.49637163F);
    this.Finger2RP2 = new ModelRenderer((ModelBase)this, 72, 158);
    this.Finger2RP2.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.Finger2RP2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Finger2RP2, 0.0F, 0.0F, -0.49637163F);
    this.EarRP1 = new ModelRenderer((ModelBase)this, 139, 22);
    this.EarRP1.setRotationPoint(0.0F, -3.8F, 3.3F);
    this.EarRP1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F);
    setRotateAngle(this.EarRP1, -0.7225663F, 0.0F, 0.0F);
    this.BodySP5 = new ModelRenderer((ModelBase)this, 64, 67);
    this.BodySP5.setRotationPoint(0.0F, -0.97F, 0.25F);
    this.BodySP5.addBox(0.0F, 0.0F, 0.01F, 11, 1, 3, 0.0F);
    setRotateAngle(this.BodySP5, -0.24504423F, 0.0F, 0.0F);
    this.ToeL1 = new ModelRenderer((ModelBase)this, 96, 133);
    this.ToeL1.setRotationPoint(0.0F, 0.0F, -1.0F);
    this.ToeL1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    this.ToothL = new ModelRenderer((ModelBase)this, 121, 55);
    this.ToothL.setRotationPoint(3.5F, 1.1F, 0.2F);
    this.ToothL.addBox(0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F);
    this.LegRSP6 = new ModelRenderer((ModelBase)this, 76, 119);
    this.LegRSP6.setRotationPoint(0.0F, 1.31F, -0.15F);
    this.LegRSP6.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
    setRotateAngle(this.LegRSP6, 1.3508848F, 0.0F, 0.0F);
    this.LegLSP2 = new ModelRenderer((ModelBase)this, 130, 144);
    this.LegLSP2.setRotationPoint(0.0F, 1.34F, -0.22F);
    this.LegLSP2.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
    setRotateAngle(this.LegLSP2, 1.2566371F, 0.0F, 0.0F);
    this.ArmLB = new ModelRenderer((ModelBase)this, 14, 183);
    this.ArmLB.setRotationPoint(-0.9F, 0.8F, 0.0F);
    this.ArmLB.addBox(0.0F, 0.0F, 0.0F, 3, 9, 3, 0.0F);
    setRotateAngle(this.ArmLB, 0.0F, 0.0F, -0.27925268F);
    this.ShoulderL = new ModelRenderer((ModelBase)this, 0, 130);
    this.ShoulderL.setRotationPoint(10.4F, 0.0F, 3.0F);
    this.ShoulderL.addBox(0.0F, 0.0F, 0.0F, 2, 3, 3, 0.0F);
    this.BladeSP9R = new ModelRenderer((ModelBase)this, 249, 191);
    this.BladeSP9R.setRotationPoint(0.0F, 0.0F, 1.87F);
    this.BladeSP9R.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP9R, 0.13194689F, 0.0F, 0.0F);
    this.Neck = new ModelRenderer((ModelBase)this, 108, 86);
    this.Neck.setRotationPoint(3.0F, -1.99F, 2.5F);
    this.Neck.addBox(0.0F, 0.0F, 0.0F, 5, 3, 5, 0.0F);
    this.LegRSP1 = new ModelRenderer((ModelBase)this, 140, 120);
    this.LegRSP1.setRotationPoint(0.0F, 1.66F, 3.9F);
    this.LegRSP1.addBox(0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F);
    setRotateAngle(this.LegRSP1, 0.9864601F, 0.0F, 0.0F);
    this.LegLSP8 = new ModelRenderer((ModelBase)this, 50, 143);
    this.LegLSP8.setRotationPoint(0.0F, 0.01F, 0.01F);
    this.LegLSP8.addBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F);
    setRotateAngle(this.LegLSP8, 1.4451326F, 0.0F, 0.0F);
    this.FootRP1 = new ModelRenderer((ModelBase)this, 78, 112);
    this.FootRP1.setRotationPoint(0.0F, -0.4F, -2.0F);
    this.FootRP1.addBox(0.0F, 0.0F, 0.0F, 5, 2, 3, 0.0F);
    setRotateAngle(this.FootRP1, -0.19687314F, 0.0F, 0.0F);
    this.BladeFiller3R = new ModelRenderer((ModelBase)this, 162, 223);
    this.BladeFiller3R.setRotationPoint(0.0F, 0.7F, 2.6F);
    this.BladeFiller3R.addBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F);
    this.BladeSP2R = new ModelRenderer((ModelBase)this, 199, 191);
    this.BladeSP2R.setRotationPoint(0.0F, 0.0F, 1.86F);
    this.BladeSP2R.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    setRotateAngle(this.BladeSP2R, -0.07539822F, 0.0F, 0.0F);
    this.BodySP10 = new ModelRenderer((ModelBase)this, 64, 32);
    this.BodySP10.setRotationPoint(0.0F, -0.96F, 0.3F);
    this.BodySP10.addBox(0.0F, 0.0F, 0.0F, 11, 1, 3, 0.0F);
    setRotateAngle(this.BodySP10, -0.31415927F, 0.0F, 0.0F);
    this.Nose = new ModelRenderer((ModelBase)this, 115, 51);
    this.Nose.setRotationPoint(2.0F, 0.73F, -0.3F);
    this.Nose.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
    this.ToeL2 = new ModelRenderer((ModelBase)this, 97, 137);
    this.ToeL2.setRotationPoint(3.1F, 0.0F, -1.0F);
    this.ToeL2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    this.Finger2LP1 = new ModelRenderer((ModelBase)this, 66, 191);
    this.Finger2LP1.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.Finger2LP1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    setRotateAngle(this.Finger2LP1, 0.0F, 0.0F, -0.44610617F);
    this.HugeKnifeBladeB = new ModelRenderer((ModelBase)this, 109, 149);
    this.HugeKnifeBladeB.setRotationPoint(0.0F, -0.4F, 8.0F);
    this.HugeKnifeBladeB.addBox(0.0F, 0.0F, 0.0F, 1, 2, 19, 0.0F);
    this.HugeKnifeBladeBR.addChild(this.BladeSP1R);
    this.HandRPalm.addChild(this.ThumbRB);
    this.BladeSP9.addChild(this.BladeSP9Sharp);
    this.FootRP1.addChild(this.ToeR1);
    this.LegRSP1.addChild(this.LegRSP2);
    this.BladeSP3.addChild(this.BladeSP4);
    this.LegRSP2.addChild(this.LegRSP3);
    this.LegRSP7.addChild(this.LegRSP8);
    this.MainBody.addChild(this.LegRB);
    this.ThumbLP1.addChild(this.ThumbLP2);
    this.BotLip.addChild(this.BotLipUp);
    this.LegLSP4.addChild(this.LegLSP5);
    this.ArmRB.addChild(this.ArmRP1);
    this.BladeFiller1.addChild(this.BladeFiller2);
    this.HandLPalm.addChild(this.Finger2LB);
    this.HandRPalm.addChild(this.Finger1RB);
    this.BladeSP9R.addChild(this.BladeSP10R);
    this.ArmLB.addChild(this.ArmLP1);
    this.HandRPalm.addChild(this.Finger3RB);
    this.ThumbRB.addChild(this.ThumbRP1);
    this.BladeFiller1R.addChild(this.BladeFiller2R);
    this.LegLSP10.addChild(this.LegLSP11);
    this.BodySP10.addChild(this.BodySP11);
    this.HeadB.addChild(this.EyeRTop);
    this.EyeLTop.addChild(this.EyeLP1);
    this.BladeSP3R.addChild(this.BladeSP4R);
    this.ShoulderR.addChild(this.ArmRB);
    this.BladeSP2.addChild(this.BladeSP3);
    this.MainBody.addChild(this.TailBit);
    this.LegRSP6.addChild(this.LegRSP7);
    this.FootLB.addChild(this.FootLP1);
    this.BladeSP4.addChild(this.BladeSP4Sharp);
    this.Finger1RB.addChild(this.Finger1RP1);
    this.MainBody.addChild(this.LegLB);
    this.BladeSP10.addChild(this.BladeSP11);
    this.BladeSP7R.addChild(this.BladeSP8R);
    this.BladeSP5R.addChild(this.BladeSP6R);
    this.LegLSP8.addChild(this.LegLSP9);
    this.EyeRTop.addChild(this.EyeRP1);
    this.ThumbLB.addChild(this.ThumbLP1);
    this.HeadB.addChild(this.TopLip);
    this.LegRP1.addChild(this.FootRB);
    this.BladeSP5.addChild(this.BladeSP6);
    this.HandLPalm.addChild(this.HandLSPPalm);
    this.BladeSP10.addChild(this.BladeSP10Sharp);
    this.HandLPalm.addChild(this.ThumbLB);
    this.BladeSP4.addChild(this.BladeSP5);
    this.Finger2RB.addChild(this.Finger2RP1);
    this.HugeKnifeHandle.addChild(this.HugeKnifeHandleEnd);
    this.BodySP12.addChild(this.BodySP13Top);
    this.LegLSP3.addChild(this.LegLSP4);
    this.BladeSP1.addChild(this.BladeSP1Sharp);
    this.BladeSP10R.addChild(this.BladeSP11R);
    this.HeadB.addChild(this.EarLB);
    this.LegRSP8.addChild(this.LegRSP9);
    this.Finger3RB.addChild(this.Finger3RP1);
    this.Finger3LP1.addChild(this.Finger3LP2);
    this.LegLSP6.addChild(this.LegLSP7);
    this.BladeSP7.addChild(this.BladeSP7Sharp);
    this.HugeKnifeBladeB.addChild(this.BladeFiller1);
    this.BodySP8.addChild(this.BodySP9);
    this.ArmRP1.addChild(this.HandRPalm);
    this.MainBody.addChild(this.ShoulderR);
    this.Finger1LB.addChild(this.Finger1LP1);
    this.BladeSP6R.addChild(this.BladeSP7R);
    this.BladeFiller2.addChild(this.BladeFiller3);
    this.Finger1LP1.addChild(this.Finger1LP2);
    this.BladeSP9.addChild(this.BladeSP10);
    this.BodySP6.addChild(this.BodySP7);
    this.HandLPalm.addChild(this.Finger1LB);
    this.BladeSP2R.addChild(this.BladeSP3R);
    this.LegLP1.addChild(this.FootLB);
    this.LegLSP2.addChild(this.LegLSP3);
    this.HeadB.addChild(this.EarRB);
    this.ArmLP1.addChild(this.HandLPalm);
    this.BladeSP8.addChild(this.BladeSP8Sharp);
    this.BladeSP2.addChild(this.BladeSP2Sharp);
    this.BladeSP5.addChild(this.BladeSP5Sharp);
    this.BladeSP7.addChild(this.BladeSP8);
    this.HandRPalm.addChild(this.HandRSPPalm);
    this.Finger1RP1.addChild(this.Finger1RP2);
    this.HeadB.addChild(this.BotLip);
    this.TailBit.addChild(this.TailFluff);
    this.Finger3LB.addChild(this.Finger3LP1);
    this.BladeSP8.addChild(this.BladeSP9);
    this.HandRPalm.addChild(this.HugeKnifeHandle);
    this.LegLSP9.addChild(this.LegLSP10);
    this.Neck.addChild(this.HeadB);
    this.LegLB.addChild(this.LegLP1);
    this.BodySP5.addChild(this.BodySP6);
    this.ThumbRP1.addChild(this.ThumbRP2);
    this.EarLB.addChild(this.EarLP1);
    this.FootRP1.addChild(this.ToeR2);
    this.HandLPalm.addChild(this.Finger3LB);
    this.TopLipSPup.addChild(this.FaceFiller);
    this.LegRSP4.addChild(this.LegRSP5);
    this.LegLSP5.addChild(this.LegLSP6);
    this.BodySP1.addChild(this.BodySP2);
    this.BodySP2.addChild(this.BodySP3);
    this.Finger2LP1.addChild(this.Finger2LP2);
    this.HeadB.addChild(this.TopLipSPup);
    this.BodySP11.addChild(this.BodySP12);
    this.BladeSP3.addChild(this.BladeSP3Sharp);
    this.LegRB.addChild(this.LegRP1);
    this.LegRSP10.addChild(this.LegRSP11);
    this.BladeSP1.addChild(this.BladeSP2);
    this.HugeKnifeBladeBR.addChild(this.BladeFiller1R);
    this.BladeSP4R.addChild(this.BladeSP5R);
    this.MainBody.addChild(this.BodySP1);
    this.LegRSP3.addChild(this.LegRSP4);
    this.BodySP3.addChild(this.BodySP4);
    this.LegLB.addChild(this.LegLSP1);
    this.HandRPalm.addChild(this.Finger2RB);
    this.HugeKnifeBladeB.addChild(this.BladeSP1);
    this.HugeKnifeBladeB.addChild(this.HugeKnifeBladeBR);
    this.BladeSP6.addChild(this.BladeSP7);
    this.BladeSP6.addChild(this.BladeSP6Sharp);
    this.TopLip.addChild(this.ToothR);
    this.HeadB.addChild(this.EyeLTop);
    this.LegRSP9.addChild(this.LegRSP10);
    this.BodySP7.addChild(this.BodySP8);
    this.Finger3RP1.addChild(this.Finger3RP2);
    this.Finger2RP1.addChild(this.Finger2RP2);
    this.EarRB.addChild(this.EarRP1);
    this.BodySP4.addChild(this.BodySP5);
    this.FootLP1.addChild(this.ToeL1);
    this.TopLip.addChild(this.ToothL);
    this.LegRSP5.addChild(this.LegRSP6);
    this.LegLSP1.addChild(this.LegLSP2);
    this.ShoulderL.addChild(this.ArmLB);
    this.MainBody.addChild(this.ShoulderL);
    this.BladeSP8R.addChild(this.BladeSP9R);
    this.MainBody.addChild(this.Neck);
    this.LegRB.addChild(this.LegRSP1);
    this.LegLSP7.addChild(this.LegLSP8);
    this.FootRB.addChild(this.FootRP1);
    this.BladeFiller2R.addChild(this.BladeFiller3R);
    this.BladeSP1R.addChild(this.BladeSP2R);
    this.BodySP9.addChild(this.BodySP10);
    this.TopLip.addChild(this.Nose);
    this.FootLP1.addChild(this.ToeL2);
    this.Finger2LB.addChild(this.Finger2LP1);
    this.HugeKnifeHandle.addChild(this.HugeKnifeBladeB);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    GL11.glPushMatrix();
    GL11.glScaled(1.0D / this.modelScale[0], 1.0D / this.modelScale[1], 1.0D / this.modelScale[2]);
    this.MainBody.render(f5);
    GL11.glPopMatrix();
  }
  
  public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
  }
}

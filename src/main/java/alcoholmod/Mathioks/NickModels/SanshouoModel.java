package alcoholmod.Mathioks.NickModels;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SanshouoModel extends ModelBiped {
  public ModelRenderer TorsoBack;
  
  public ModelRenderer Shapeup1;
  
  public ModelRenderer Torso;
  
  public ModelRenderer LegBLB;
  
  public ModelRenderer LegBRB;
  
  public ModelRenderer Shapeup2;
  
  public ModelRenderer TailJB;
  
  public ModelRenderer TailB1;
  
  public ModelRenderer TailB2;
  
  public ModelRenderer TailB3;
  
  public ModelRenderer TailP1J;
  
  public ModelRenderer TailP1;
  
  public ModelRenderer TailP2J;
  
  public ModelRenderer TailP2;
  
  public ModelRenderer TailP3J;
  
  public ModelRenderer TailP3;
  
  public ModelRenderer TailP4J;
  
  public ModelRenderer TailP4;
  
  public ModelRenderer TailP5J;
  
  public ModelRenderer TailP5spike;
  
  public ModelRenderer spikeshapeup1;
  
  public ModelRenderer spikeshapeup2;
  
  public ModelRenderer spikefiller1;
  
  public ModelRenderer spikefiller2;
  
  public ModelRenderer HeadB;
  
  public ModelRenderer LegFRB;
  
  public ModelRenderer LegFLB;
  
  public ModelRenderer BumbCF;
  
  public ModelRenderer Curve;
  
  public ModelRenderer HeadB2;
  
  public ModelRenderer Teeth;
  
  public ModelRenderer TeethSP;
  
  public ModelRenderer MouthRoof;
  
  public ModelRenderer TopCurve;
  
  public ModelRenderer Fillerh;
  
  public ModelRenderer JointFRB;
  
  public ModelRenderer LegFRP;
  
  public ModelRenderer LegFRE;
  
  public ModelRenderer JointFLB;
  
  public ModelRenderer LegFLP;
  
  public ModelRenderer LegFLE;
  
  public ModelRenderer BumpB;
  
  public ModelRenderer BumCB;
  
  public ModelRenderer JointBLB;
  
  public ModelRenderer LegBLP;
  
  public ModelRenderer LegBLE;
  
  public ModelRenderer JointBRB;
  
  public ModelRenderer LegBRP;
  
  public ModelRenderer LegBRE;
  
  public SanshouoModel() {
    this.textureWidth = 160;
    this.textureHeight = 128;
    this.TailP1J = new ModelRenderer((ModelBase)this, 42, 66);
    this.TailP1J.setRotationPoint(0.5F, 0.2F, 2.6F);
    this.TailP1J.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
    setRotateAngle(this.TailP1J, 0.091106184F, 0.0F, 0.0F);
    this.TailP3J = new ModelRenderer((ModelBase)this, 94, 66);
    this.TailP3J.setRotationPoint(0.5F, 0.5F, 2.3F);
    this.TailP3J.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
    setRotateAngle(this.TailP3J, 0.22759093F, 0.0F, 0.0F);
    this.JointBRB = new ModelRenderer((ModelBase)this, 61, 3);
    this.JointBRB.setRotationPoint(-1.1F, -0.5F, -0.5F);
    this.JointBRB.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    this.TailP1 = new ModelRenderer((ModelBase)this, 53, 64);
    this.TailP1.setRotationPoint(-0.6F, -0.5F, 0.7F);
    this.TailP1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
    setRotateAngle(this.TailP1, 0.22759093F, 0.0F, 0.0F);
    this.LegBRE = new ModelRenderer((ModelBase)this, 43, 3);
    this.LegBRE.setRotationPoint(-0.4F, 7.4F, -1.5F);
    this.LegBRE.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
    setRotateAngle(this.LegBRE, 0.0F, 0.0F, -0.31869712F);
    this.TeethSP = new ModelRenderer((ModelBase)this, 100, 38);
    this.TeethSP.setRotationPoint(3.5F, -0.01F, 0.0F);
    this.TeethSP.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
    this.spikeshapeup1 = new ModelRenderer((ModelBase)this, 14, 79);
    this.spikeshapeup1.setRotationPoint(-0.01F, 3.15F, 0.49F);
    this.spikeshapeup1.addBox(0.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
    setRotateAngle(this.spikeshapeup1, 0.5462881F, 0.0F, 0.0F);
    this.LegFLP = new ModelRenderer((ModelBase)this, 119, 3);
    this.LegFLP.setRotationPoint(1.4F, 0.4F, 0.5F);
    this.LegFLP.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
    this.TailB1 = new ModelRenderer((ModelBase)this, 13, 65);
    this.TailB1.setRotationPoint(-0.7F, -0.2F, 0.6F);
    this.TailB1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F);
    setRotateAngle(this.TailB1, 0.13665928F, 0.0F, 0.0F);
    this.spikefiller2 = new ModelRenderer((ModelBase)this, 56, 90);
    this.spikefiller2.setRotationPoint(0.0F, 0.5F, 3.8F);
    this.spikefiller2.addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
    this.HeadB2 = new ModelRenderer((ModelBase)this, 42, 54);
    this.HeadB2.setRotationPoint(0.0F, 0.9F, -0.3F);
    this.HeadB2.addBox(0.0F, 0.0F, 0.0F, 5, 5, 2, 0.0F);
    setRotateAngle(this.HeadB2, 0.56199604F, 0.0F, 0.0F);
    this.LegBRP = new ModelRenderer((ModelBase)this, 55, 1);
    this.LegBRP.setRotationPoint(0.4F, 0.4F, 0.5F);
    this.LegBRP.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
    this.LegBLE = new ModelRenderer((ModelBase)this, 139, 13);
    this.LegBLE.setRotationPoint(7.6F, -0.5F, -1.7F);
    this.LegBLE.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
    setRotateAngle(this.LegBLE, 0.0F, 0.0F, 0.5009095F);
    this.spikefiller1 = new ModelRenderer((ModelBase)this, 39, 86);
    this.spikefiller1.setRotationPoint(0.01F, 1.1F, 0.3F);
    this.spikefiller1.addBox(0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F);
    setRotateAngle(this.spikefiller1, 0.3642502F, 0.0F, 0.0F);
    this.TopCurve = new ModelRenderer((ModelBase)this, 57, 37);
    this.TopCurve.setRotationPoint(0.01F, 0.0F, 1.0F);
    this.TopCurve.addBox(0.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F);
    setRotateAngle(this.TopCurve, -0.63739425F, 0.0F, 0.0F);
    this.LegFLB = new ModelRenderer((ModelBase)this, 99, 3);
    this.LegFLB.setRotationPoint(8.1F, -0.6F, 2.0F);
    this.LegFLB.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
    setRotateAngle(this.LegFLB, 0.0F, 0.0F, 1.0471976F);
    this.Curve = new ModelRenderer((ModelBase)this, 58, 55);
    this.Curve.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Curve.addBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F);
    setRotateAngle(this.Curve, 1.0016445F, 0.0F, 0.0F);
    this.TailJB = new ModelRenderer((ModelBase)this, 2, 66);
    this.TailJB.setRotationPoint(1.2F, 0.8F, 1.6F);
    this.TailJB.addBox(0.0F, 0.0F, -0.4F, 3, 3, 2, 0.0F);
    setRotateAngle(this.TailJB, 0.22759093F, 0.0F, 0.0F);
    this.TorsoBack = new ModelRenderer((ModelBase)this, 40, 24);
    this.TorsoBack.setRotationPoint(-2.5F, 16.9F, -0.2F);
    this.TorsoBack.addBox(0.0F, 0.0F, 0.0F, 5, 5, 5, 0.0F);
    this.LegFLE = new ModelRenderer((ModelBase)this, 139, 3);
    this.LegFLE.setRotationPoint(7.6F, -0.5F, -1.7F);
    this.LegFLE.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
    setRotateAngle(this.LegFLE, 0.0F, 0.0F, 0.5009095F);
    this.LegBRB = new ModelRenderer((ModelBase)this, 71, 5);
    this.LegBRB.setRotationPoint(-4.4F, -0.3F, 2.5F);
    this.LegBRB.addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
    setRotateAngle(this.LegBRB, 0.0F, 0.0F, 0.3630285F);
    this.TailB2 = new ModelRenderer((ModelBase)this, 26, 73);
    this.TailB2.setRotationPoint(0.01F, 3.18F, 1.43F);
    this.TailB2.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
    setRotateAngle(this.TailB2, 0.59184116F, 0.0F, 0.0F);
    this.LegBLB = new ModelRenderer((ModelBase)this, 99, 13);
    this.LegBLB.setRotationPoint(8.0F, -0.5F, 2.9F);
    this.LegBLB.addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
    setRotateAngle(this.LegBLB, 0.0F, 0.0F, 1.0471976F);
    this.JointFRB = new ModelRenderer((ModelBase)this, 60, 14);
    this.JointFRB.setRotationPoint(-1.1F, -0.5F, -0.5F);
    this.JointFRB.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    this.JointFLB = new ModelRenderer((ModelBase)this, 107, 2);
    this.JointFLB.setRotationPoint(-0.4F, -1.6F, -0.5F);
    this.JointFLB.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    this.HeadB = new ModelRenderer((ModelBase)this, 66, 54);
    this.HeadB.setRotationPoint(-0.01F, 3.97F, -5.6F);
    this.HeadB.addBox(0.0F, 0.0F, 0.0F, 5, 1, 6, 0.0F);
    this.LegFRE = new ModelRenderer((ModelBase)this, 43, 14);
    this.LegFRE.setRotationPoint(-0.4F, 7.4F, -1.5F);
    this.LegFRE.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
    setRotateAngle(this.LegFRE, 0.0F, 0.0F, -0.31869712F);
    this.BumbCF = new ModelRenderer((ModelBase)this, 8, 115);
    this.BumbCF.setRotationPoint(0.5F, 0.0F, 2.2F);
    this.BumbCF.addBox(0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F);
    setRotateAngle(this.BumbCF, 0.68294734F, 0.0F, 0.0F);
    this.TailP2 = new ModelRenderer((ModelBase)this, 79, 64);
    this.TailP2.setRotationPoint(-0.5F, -0.3F, 1.0F);
    this.TailP2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
    setRotateAngle(this.TailP2, 0.13665928F, 0.0F, 0.0F);
    this.spikeshapeup2 = new ModelRenderer((ModelBase)this, 14, 90);
    this.spikeshapeup2.setRotationPoint(-0.01F, 0.0F, 0.0F);
    this.spikeshapeup2.addBox(0.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
    setRotateAngle(this.spikeshapeup2, 0.091106184F, 0.0F, 0.0F);
    this.Shapeup1 = new ModelRenderer((ModelBase)this, 24, 28);
    this.Shapeup1.setRotationPoint(-0.01F, 0.0F, 5.0F);
    this.Shapeup1.addBox(0.0F, 0.0F, 0.0F, 5, 5, 1, 0.0F);
    setRotateAngle(this.Shapeup1, -0.13665928F, 0.0F, 0.0F);
    this.Shapeup2 = new ModelRenderer((ModelBase)this, 9, 27);
    this.Shapeup2.setRotationPoint(0.02F, 0.0F, 1.0F);
    this.Shapeup2.addBox(0.0F, 0.0F, 0.0F, 5, 5, 2, 0.0F);
    setRotateAngle(this.Shapeup2, -0.27314404F, 0.0F, 0.0F);
    this.TailP2J = new ModelRenderer((ModelBase)this, 68, 66);
    this.TailP2J.setRotationPoint(0.5F, 0.5F, 2.3F);
    this.TailP2J.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
    setRotateAngle(this.TailP2J, 0.22759093F, 0.0F, 0.0F);
    this.TailP4J = new ModelRenderer((ModelBase)this, 120, 66);
    this.TailP4J.setRotationPoint(0.5F, 0.6F, 2.2F);
    this.TailP4J.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
    setRotateAngle(this.TailP4J, 0.27314404F, 0.0F, 0.0F);
    this.TailB3 = new ModelRenderer((ModelBase)this, 26, 65);
    this.TailB3.setRotationPoint(-0.02F, -2.4F, 0.0F);
    this.TailB3.addBox(0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F);
    this.BumCB = new ModelRenderer((ModelBase)this, 46, 114);
    this.BumCB.setRotationPoint(0.01F, 0.0F, 7.0F);
    this.BumCB.addBox(0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F);
    setRotateAngle(this.BumCB, -0.59184116F, 0.0F, 0.0F);
    this.MouthRoof = new ModelRenderer((ModelBase)this, 58, 41);
    this.MouthRoof.setRotationPoint(-0.22F, -0.3F, 0.96F);
    this.MouthRoof.addBox(0.0F, 0.0F, 0.0F, 5, 6, 1, 0.0F);
    this.Teeth = new ModelRenderer((ModelBase)this, 89, 38);
    this.Teeth.setRotationPoint(0.2F, 0.3F, 1.3F);
    this.Teeth.addBox(0.0F, 0.0F, 0.0F, 4, 6, 1, 0.0F);
    this.Fillerh = new ModelRenderer((ModelBase)this, 42, 39);
    this.Fillerh.setRotationPoint(0.01F, 1.2F, 0.6F);
    this.Fillerh.addBox(0.0F, 0.0F, 0.0F, 5, 5, 2, 0.0F);
    this.JointBLB = new ModelRenderer((ModelBase)this, 107, 14);
    this.JointBLB.setRotationPoint(-0.4F, -1.6F, -0.5F);
    this.JointBLB.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    this.LegFRP = new ModelRenderer((ModelBase)this, 55, 11);
    this.LegFRP.setRotationPoint(0.4F, 0.4F, 0.5F);
    this.LegFRP.addBox(0.0F, 0.0F, 0.0F, 1, 8, 1, 0.0F);
    this.TailP5spike = new ModelRenderer((ModelBase)this, 2, 88);
    this.TailP5spike.setRotationPoint(-0.41F, -0.6F, 1.1F);
    this.TailP5spike.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F);
    setRotateAngle(this.TailP5spike, 0.18203785F, 0.0F, 0.0F);
    this.TailP5J = new ModelRenderer((ModelBase)this, 147, 66);
    this.TailP5J.setRotationPoint(0.5F, 0.7F, 2.2F);
    this.TailP5J.addBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F);
    setRotateAngle(this.TailP5J, 0.27314404F, 0.0F, 0.0F);
    this.LegBLP = new ModelRenderer((ModelBase)this, 119, 15);
    this.LegBLP.setRotationPoint(1.4F, 0.4F, 0.5F);
    this.LegBLP.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
    this.TailP4 = new ModelRenderer((ModelBase)this, 131, 64);
    this.TailP4.setRotationPoint(-0.6F, -0.4F, 0.8F);
    this.TailP4.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
    setRotateAngle(this.TailP4, 0.31869712F, 0.0F, 0.0F);
    this.LegFRB = new ModelRenderer((ModelBase)this, 71, 14);
    this.LegFRB.setRotationPoint(-4.2F, -0.5F, 2.0F);
    this.LegFRB.addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
    setRotateAngle(this.LegFRB, 0.0F, 0.0F, 0.3642502F);
    this.TailP3 = new ModelRenderer((ModelBase)this, 105, 64);
    this.TailP3.setRotationPoint(-0.4F, -0.3F, 1.1F);
    this.TailP3.addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
    setRotateAngle(this.TailP3, 0.27314404F, 0.0F, 0.0F);
    this.BumpB = new ModelRenderer((ModelBase)this, 22, 109);
    this.BumpB.setRotationPoint(0.0F, 0.0F, 2.0F);
    this.BumpB.addBox(0.0F, 0.0F, 0.0F, 4, 2, 7, 0.0F);
    setRotateAngle(this.BumpB, -0.68294734F, 0.0F, 0.0F);
    this.Torso = new ModelRenderer((ModelBase)this, 62, 93);
    this.Torso.setRotationPoint(0.01F, 0.0F, -9.7F);
    this.Torso.addBox(0.0F, 0.0F, 0.0F, 5, 5, 10, 0.0F);
    this.TailB3.addChild(this.TailP1J);
    this.TailP2.addChild(this.TailP3J);
    this.LegBRB.addChild(this.JointBRB);
    this.TailP1J.addChild(this.TailP1);
    this.LegBRP.addChild(this.LegBRE);
    this.Teeth.addChild(this.TeethSP);
    this.TailP5spike.addChild(this.spikeshapeup1);
    this.JointFLB.addChild(this.LegFLP);
    this.TailJB.addChild(this.TailB1);
    this.TailP5spike.addChild(this.spikefiller2);
    this.Curve.addChild(this.HeadB2);
    this.JointBRB.addChild(this.LegBRP);
    this.LegBLP.addChild(this.LegBLE);
    this.TailP5spike.addChild(this.spikefiller1);
    this.MouthRoof.addChild(this.TopCurve);
    this.Torso.addChild(this.LegFLB);
    this.HeadB.addChild(this.Curve);
    this.Shapeup2.addChild(this.TailJB);
    this.LegFLP.addChild(this.LegFLE);
    this.TorsoBack.addChild(this.LegBRB);
    this.TailB1.addChild(this.TailB2);
    this.TorsoBack.addChild(this.LegBLB);
    this.LegFRB.addChild(this.JointFRB);
    this.LegFLB.addChild(this.JointFLB);
    this.Torso.addChild(this.HeadB);
    this.LegFRP.addChild(this.LegFRE);
    this.Torso.addChild(this.BumbCF);
    this.TailP2J.addChild(this.TailP2);
    this.TailP5spike.addChild(this.spikeshapeup2);
    this.TorsoBack.addChild(this.Shapeup1);
    this.Shapeup1.addChild(this.Shapeup2);
    this.TailP1.addChild(this.TailP2J);
    this.TailP3.addChild(this.TailP4J);
    this.TailB2.addChild(this.TailB3);
    this.BumpB.addChild(this.BumCB);
    this.Teeth.addChild(this.MouthRoof);
    this.HeadB2.addChild(this.Teeth);
    this.MouthRoof.addChild(this.Fillerh);
    this.LegBLB.addChild(this.JointBLB);
    this.JointFRB.addChild(this.LegFRP);
    this.TailP5J.addChild(this.TailP5spike);
    this.TailP4.addChild(this.TailP5J);
    this.JointBLB.addChild(this.LegBLP);
    this.TailP4J.addChild(this.TailP4);
    this.Torso.addChild(this.LegFRB);
    this.TailP3J.addChild(this.TailP3);
    this.BumbCF.addChild(this.BumpB);
    this.TorsoBack.addChild(this.Torso);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    this.TorsoBack.render(f5);
  }
  
  public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
  }
}

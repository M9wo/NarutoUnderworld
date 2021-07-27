package alcoholmod.Mathioks.TransformationsRealPackage;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBijuuChakraMode2 extends ModelBase {
  public ModelRenderer Body;
  
  public ModelRenderer Body2;
  
  public ModelRenderer ArmRight1;
  
  public ModelRenderer ArmLeft1;
  
  public ModelRenderer Neck;
  
  public ModelRenderer LegRight1;
  
  public ModelRenderer LegLeft1;
  
  public ModelRenderer Tail11;
  
  public ModelRenderer Tail12;
  
  public ModelRenderer Tail13;
  
  public ModelRenderer Tail14;
  
  public ModelRenderer LegRight2;
  
  public ModelRenderer LegLeft2;
  
  public ModelRenderer Tail21;
  
  public ModelRenderer Tail31;
  
  public ModelRenderer Tail41;
  
  public ModelRenderer Tail22;
  
  public ModelRenderer Tail32;
  
  public ModelRenderer Tail42;
  
  public ModelRenderer Tail23;
  
  public ModelRenderer Tail33;
  
  public ModelRenderer Tail43;
  
  public ModelRenderer Tail24;
  
  public ModelRenderer Tail34;
  
  public ModelRenderer Tail44;
  
  public ModelRenderer ArmRight2;
  
  public ModelRenderer ArmLeft2;
  
  public ModelRenderer Head;
  
  public ModelRenderer EarLeft1;
  
  public ModelRenderer EarRight1;
  
  public ModelRenderer EarLeft2;
  
  public ModelRenderer EarLeft3;
  
  public ModelRenderer EarLeft4;
  
  public ModelRenderer EarRight2;
  
  public ModelRenderer EarRight3;
  
  public ModelRenderer EarRight4;
  
  public ModelBijuuChakraMode2() {
    this.textureWidth = 80;
    this.textureHeight = 80;
    this.Tail12 = new ModelRenderer(this, 28, 8);
    this.Tail12.setRotationPoint(-1.1F, 1.7F, 4.7F);
    this.Tail12.addBox(-1.2F, -1.5F, 0.0F, 3, 3, 7, 0.0F);
    setRotateAngle(this.Tail12, 0.27314404F, -0.7740535F, 0.0F);
    this.Body2 = new ModelRenderer(this, 1, 65);
    this.Body2.setRotationPoint(0.5F, 0.6F, 6.4F);
    this.Body2.addBox(-4.0F, 0.0F, -2.0F, 7, 7, 8, 0.0F);
    setRotateAngle(this.Body2, 0.026529005F, -0.020071287F, 0.0F);
    this.Tail41 = new ModelRenderer(this, 29, 32);
    this.Tail41.setRotationPoint(1.3F, 1.1F, 6.3F);
    this.Tail41.addBox(-0.7F, -0.7F, 0.0F, 2, 2, 7, 0.0F);
    setRotateAngle(this.Tail41, 0.011519173F, -0.005410521F, 0.0F);
    this.Tail24 = new ModelRenderer(this, 50, 69);
    this.Tail24.setRotationPoint(-0.2F, -0.2F, 6.6F);
    this.Tail24.addBox(-1.7F, -1.7F, 0.0F, 4, 4, 7, 0.0F);
    setRotateAngle(this.Tail24, 0.23247786F, -3.1003275E-17F, 0.0062831854F);
    this.ArmRight1 = new ModelRenderer(this, 48, 22);
    this.ArmRight1.mirror = true;
    this.ArmRight1.setRotationPoint(-2.4F, 1.9F, 1.4F);
    this.ArmRight1.addBox(-2.2F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
    setRotateAngle(this.ArmRight1, -0.27017698F, 0.0F, 0.7740535F);
    this.EarRight2 = new ModelRenderer(this, 52, 44);
    this.EarRight2.setRotationPoint(0.1F, -1.8F, 0.2F);
    this.EarRight2.addBox(-1.5F, -4.1F, -1.5F, 3, 4, 3, 0.0F);
    setRotateAngle(this.EarRight2, -0.015882496F, -0.0029670596F, 0.0F);
    this.Tail14 = new ModelRenderer(this, 28, 8);
    this.Tail14.setRotationPoint(-1.6F, 3.5F, 5.5F);
    this.Tail14.addBox(-1.3F, -1.3F, 0.0F, 3, 3, 7, 0.0F);
    setRotateAngle(this.Tail14, -0.5009095F, -0.5462881F, 0.0F);
    this.EarRight4 = new ModelRenderer(this, 47, 51);
    this.EarRight4.setRotationPoint(0.1F, -1.3F, 0.2F);
    this.EarRight4.addBox(-0.4F, -2.1F, -0.6F, 1, 2, 1, 0.0F);
    setRotateAngle(this.EarRight4, -0.015882496F, -0.0029670596F, 0.0F);
    this.Tail21 = new ModelRenderer(this, 50, 69);
    this.Tail21.setRotationPoint(0.2F, -0.1F, 5.6F);
    this.Tail21.addBox(-2.1F, -2.0F, 0.5F, 4, 4, 7, 0.0F);
    setRotateAngle(this.Tail21, 0.008901179F, -0.005410521F, 0.0F);
    this.Tail22 = new ModelRenderer(this, 50, 69);
    this.Tail22.setRotationPoint(-1.7F, -1.8F, 4.6F);
    this.Tail22.addBox(0.0F, 0.0F, 0.0F, 4, 4, 7, 0.0F);
    setRotateAngle(this.Tail22, -1.5501637E-16F, 0.0F, 0.0F);
    this.EarLeft1 = new ModelRenderer(this, 26, 50);
    this.EarLeft1.setRotationPoint(-2.2F, -8.2F, -3.2F);
    this.EarLeft1.addBox(-1.0F, -1.9F, -0.5F, 2, 3, 2, 0.0F);
    setRotateAngle(this.EarLeft1, -0.18203785F, 0.045553092F, -0.27314404F);
    this.ArmLeft2 = new ModelRenderer(this, 48, 52);
    this.ArmLeft2.mirror = true;
    this.ArmLeft2.setRotationPoint(4.3F, 6.4F, 0.0F);
    this.ArmLeft2.addBox(-5.7F, 1.4F, -2.0F, 4, 8, 4, 0.0F);
    setRotateAngle(this.ArmLeft2, 0.0F, 0.0F, 0.4553564F);
    this.LegLeft1 = new ModelRenderer(this, 0, 16);
    this.LegLeft1.setRotationPoint(1.4F, 1.4F, 3.6F);
    this.LegLeft1.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
    setRotateAngle(this.LegLeft1, 1.240131E-15F, 0.0F, -0.5431465F);
    this.Tail33 = new ModelRenderer(this, 28, 8);
    this.Tail33.setRotationPoint(0.0F, -0.4F, 6.5F);
    this.Tail33.addBox(-1.5F, -1.4F, 0.0F, 3, 3, 7, 0.0F);
    setRotateAngle(this.Tail33, 0.0F, -1.240131E-16F, 0.0F);
    this.Tail34 = new ModelRenderer(this, 28, 8);
    this.Tail34.setRotationPoint(0.2F, 0.0F, 5.8F);
    this.Tail34.addBox(-1.4F, -1.2F, 0.0F, 3, 3, 7, 0.0F);
    setRotateAngle(this.Tail34, 0.0F, -8.99095E-16F, 0.0F);
    this.EarLeft2 = new ModelRenderer(this, 52, 44);
    this.EarLeft2.setRotationPoint(0.1F, -0.9F, 0.2F);
    this.EarLeft2.addBox(-1.6F, -4.2F, -1.2F, 3, 4, 3, 0.0F);
    setRotateAngle(this.EarLeft2, -0.015882496F, 0.0029670596F, 0.0F);
    this.EarLeft4 = new ModelRenderer(this, 47, 51);
    this.EarLeft4.setRotationPoint(0.0F, -5.7F, 0.1F);
    this.EarLeft4.addBox(-0.3F, -2.3F, -0.5F, 1, 2, 1, 0.0F);
    setRotateAngle(this.EarLeft4, -0.015882496F, 0.0029670596F, 0.0F);
    this.Tail43 = new ModelRenderer(this, 28, 32);
    this.Tail43.setRotationPoint(0.0F, 0.2F, 4.6F);
    this.Tail43.addBox(-1.0F, -1.1F, 0.0F, 2, 2, 7, 0.0F);
    setRotateAngle(this.Tail43, 0.0F, 1.5501637E-16F, 0.0F);
    this.Tail23 = new ModelRenderer(this, 50, 69);
    this.Tail23.setRotationPoint(0.0F, 0.0F, 6.1F);
    this.Tail23.addBox(-2.0F, -2.2F, 0.0F, 4, 4, 7, 0.0F);
    setRotateAngle(this.Tail23, 0.4098033F, -4.6504915E-16F, 0.0F);
    this.LegLeft2 = new ModelRenderer(this, 26, 20);
    this.LegLeft2.setRotationPoint(0.2F, 6.5F, 0.3F);
    this.LegLeft2.addBox(-2.1F, -1.7F, -0.5F, 4, 4, 7, 0.0F);
    setRotateAngle(this.LegLeft2, -1.6093681F, -0.0062831854F, 0.33754668F);
    this.LegRight2 = new ModelRenderer(this, 42, 11);
    this.LegRight2.setRotationPoint(-0.1F, 6.2F, 0.1F);
    this.LegRight2.addBox(-2.0F, -2.0F, 0.3F, 4, 4, 7, 0.0F);
    setRotateAngle(this.LegRight2, -1.5653858F, 0.007853982F, -0.34557518F);
    this.Tail31 = new ModelRenderer(this, 28, 8);
    this.Tail31.setRotationPoint(-1.8F, -1.4F, 6.6F);
    this.Tail31.addBox(0.2F, 0.0F, 0.0F, 3, 3, 7, 0.0F);
    setRotateAngle(this.Tail31, 0.008203047F, -0.015882496F, 8.726646E-4F);
    this.Tail44 = new ModelRenderer(this, 28, 32);
    this.Tail44.setRotationPoint(-0.1F, 0.1F, 6.9F);
    this.Tail44.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F);
    setRotateAngle(this.Tail44, 0.0F, -2.480262E-16F, 0.0F);
    this.Neck = new ModelRenderer(this, 32, 72);
    this.Neck.setRotationPoint(1.6F, -0.7F, -1.5F);
    this.Neck.addBox(-4.0F, 0.0F, -2.0F, 5, 4, 4, 0.0F);
    setRotateAngle(this.Neck, -0.59184116F, -0.0F, 0.0F);
    this.EarRight1 = new ModelRenderer(this, 25, 50);
    this.EarRight1.setRotationPoint(2.5F, -7.5F, -2.7F);
    this.EarRight1.addBox(-1.0F, -3.0F, -0.8F, 2, 3, 2, 0.0F);
    setRotateAngle(this.EarRight1, -0.18203785F, -0.0029670596F, 0.4553564F);
    this.Tail11 = new ModelRenderer(this, 28, 8);
    this.Tail11.setRotationPoint(-0.5F, 2.0F, 5.4F);
    this.Tail11.addBox(-1.4F, -1.6F, 0.0F, 3, 3, 7, 0.0F);
    setRotateAngle(this.Tail11, 0.59184116F, 0.70476395F, 0.091106184F);
    this.Tail32 = new ModelRenderer(this, 28, 8);
    this.Tail32.setRotationPoint(1.9F, 1.7F, 5.9F);
    this.Tail32.addBox(-1.3F, -1.2F, 0.0F, 3, 3, 7, 0.0F);
    setRotateAngle(this.Tail32, 0.0F, 2.480262E-16F, 0.0F);
    this.EarRight3 = new ModelRenderer(this, 39, 45);
    this.EarRight3.setRotationPoint(-0.2F, -4.1F, -0.1F);
    this.EarRight3.addBox(-0.9F, -1.8F, -0.8F, 2, 2, 2, 0.0F);
    setRotateAngle(this.EarRight3, -0.015882496F, -0.0029670596F, 0.0F);
    this.Tail42 = new ModelRenderer(this, 29, 32);
    this.Tail42.setRotationPoint(0.1F, -0.1F, 7.1F);
    this.Tail42.addBox(-1.1F, -0.8F, 0.0F, 2, 2, 7, 0.0F);
    setRotateAngle(this.Tail42, 0.0F, 0.049218286F, 0.0F);
    this.Tail13 = new ModelRenderer(this, 28, 8);
    this.Tail13.setRotationPoint(0.1F, 2.8F, 5.6F);
    this.Tail13.addBox(-1.2F, -1.6F, 0.0F, 3, 3, 7, 0.0F);
    setRotateAngle(this.Tail13, -0.59184116F, 0.68294734F, 0.0F);
    this.ArmLeft1 = new ModelRenderer(this, 48, 33);
    this.ArmLeft1.mirror = true;
    this.ArmLeft1.setRotationPoint(2.5F, 1.9F, 1.5F);
    this.ArmLeft1.addBox(-1.9F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
    setRotateAngle(this.ArmLeft1, -0.26703537F, 0.0062831854F, -0.78033674F);
    this.LegRight1 = new ModelRenderer(this, 48, 0);
    this.LegRight1.setRotationPoint(-2.3F, 1.1F, 3.4F);
    this.LegRight1.addBox(-2.0F, 0.0F, -2.0F, 4, 7, 4, 0.0F);
    setRotateAngle(this.LegRight1, -0.014660765F, 0.0F, 0.5462881F);
    this.Body = new ModelRenderer(this, 0, 31);
    this.Body.setRotationPoint(0.0F, 10.3F, -4.0F);
    this.Body.addBox(-4.0F, 0.0F, -2.0F, 8, 7, 10, 0.0F);
    setRotateAngle(this.Body, 0.02321288F, 0.0F, 0.0F);
    this.EarLeft3 = new ModelRenderer(this, 39, 45);
    this.EarLeft3.setRotationPoint(0.0F, 0.5F, 0.1F);
    this.EarLeft3.addBox(-1.0F, -6.5F, -0.9F, 2, 2, 2, 0.0F);
    setRotateAngle(this.EarLeft3, -0.015882496F, 0.0029670596F, 0.0F);
    this.ArmRight2 = new ModelRenderer(this, 32, 52);
    this.ArmRight2.mirror = true;
    this.ArmRight2.setRotationPoint(-0.3F, 5.4F, -0.1F);
    this.ArmRight2.addBox(-2.4F, 0.7F, -2.0F, 4, 8, 4, 0.0F);
    setRotateAngle(this.ArmRight2, 0.0F, 0.0F, -0.4553564F);
    this.Head = new ModelRenderer(this, 0, 48);
    this.Head.setRotationPoint(-1.6F, 3.1F, -0.5F);
    this.Head.addBox(-4.0F, -8.0F, -7.1F, 8, 8, 8, 0.0F);
    setRotateAngle(this.Head, 0.5462881F, 0.0F, -0.0F);
    this.Body2.addChild(this.Tail12);
    this.Body.addChild(this.Body2);
    this.Tail31.addChild(this.Tail41);
    this.Tail14.addChild(this.Tail24);
    this.Body.addChild(this.ArmRight1);
    this.EarRight1.addChild(this.EarRight2);
    this.Body2.addChild(this.Tail14);
    this.EarRight3.addChild(this.EarRight4);
    this.Tail11.addChild(this.Tail21);
    this.Tail12.addChild(this.Tail22);
    this.Head.addChild(this.EarLeft1);
    this.ArmLeft1.addChild(this.ArmLeft2);
    this.Body2.addChild(this.LegLeft1);
    this.Tail23.addChild(this.Tail33);
    this.Tail24.addChild(this.Tail34);
    this.EarLeft1.addChild(this.EarLeft2);
    this.EarLeft3.addChild(this.EarLeft4);
    this.Tail33.addChild(this.Tail43);
    this.Tail13.addChild(this.Tail23);
    this.LegLeft1.addChild(this.LegLeft2);
    this.LegRight1.addChild(this.LegRight2);
    this.Tail21.addChild(this.Tail31);
    this.Tail34.addChild(this.Tail44);
    this.Body.addChild(this.Neck);
    this.Head.addChild(this.EarRight1);
    this.Body2.addChild(this.Tail11);
    this.Tail22.addChild(this.Tail32);
    this.EarRight2.addChild(this.EarRight3);
    this.Tail32.addChild(this.Tail42);
    this.Body2.addChild(this.Tail13);
    this.Body.addChild(this.ArmLeft1);
    this.Body2.addChild(this.LegRight1);
    this.EarLeft2.addChild(this.EarLeft3);
    this.ArmRight1.addChild(this.ArmRight2);
    this.Neck.addChild(this.Head);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    this.Body.render(f5);
  }
  
  public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
  }
}

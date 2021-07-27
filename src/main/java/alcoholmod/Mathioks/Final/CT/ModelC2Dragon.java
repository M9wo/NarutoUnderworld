package alcoholmod.Mathioks.Final.CT;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class ModelC2Dragon extends ModelBase {
  private ModelRenderer head;
  
  private ModelRenderer spine;
  
  private ModelRenderer jaw;
  
  private ModelRenderer body;
  
  private ModelRenderer rearLeg;
  
  private ModelRenderer frontLeg;
  
  private ModelRenderer rearLegTip;
  
  private ModelRenderer frontLegTip;
  
  private ModelRenderer rearFoot;
  
  private ModelRenderer frontFoot;
  
  private ModelRenderer wing;
  
  private ModelRenderer wingTip;
  
  private float partialTicks;
  
  private static final String __OBFID = "CL_00000870";
  
  public ModelC2Dragon() {
    this.textureWidth = 256;
    this.textureHeight = 256;
    setTextureOffset("body.body", 0, 0);
    setTextureOffset("wing.skin", -56, 88);
    setTextureOffset("wingtip.skin", -56, 144);
    setTextureOffset("rearleg.main", 0, 0);
    setTextureOffset("rearfoot.main", 112, 0);
    setTextureOffset("rearlegtip.main", 196, 0);
    setTextureOffset("head.upperhead", 112, 30);
    setTextureOffset("wing.bone", 112, 88);
    setTextureOffset("head.upperlip", 176, 44);
    setTextureOffset("jaw.jaw", 176, 65);
    setTextureOffset("frontleg.main", 112, 104);
    setTextureOffset("wingtip.bone", 112, 136);
    setTextureOffset("frontfoot.main", 144, 104);
    setTextureOffset("neck.box", 192, 104);
    setTextureOffset("frontlegtip.main", 226, 138);
    setTextureOffset("body.scale", 220, 53);
    setTextureOffset("head.scale", 0, 0);
    setTextureOffset("neck.scale", 48, 0);
    setTextureOffset("head.nostril", 112, 0);
    float f1 = -16.0F;
    this.head = new ModelRenderer(this, "head");
    this.head.addBox("upperlip", -6.0F, -1.0F, -8.0F + f1, 12, 5, 16);
    this.head.addBox("upperhead", -8.0F, -8.0F, 6.0F + f1, 16, 16, 16);
    this.head.mirror = true;
    this.head.addBox("scale", -5.0F, -12.0F, 12.0F + f1, 2, 4, 6);
    this.head.addBox("nostril", -5.0F, -3.0F, -6.0F + f1, 2, 2, 4);
    this.head.mirror = false;
    this.head.addBox("scale", 3.0F, -12.0F, 12.0F + f1, 2, 4, 6);
    this.head.addBox("nostril", 3.0F, -3.0F, -6.0F + f1, 2, 2, 4);
    this.jaw = new ModelRenderer(this, "jaw");
    this.jaw.setRotationPoint(0.0F, 4.0F, 8.0F + f1);
    this.jaw.addBox("jaw", -6.0F, 0.0F, -16.0F, 12, 4, 16);
    this.head.addChild(this.jaw);
    this.spine = new ModelRenderer(this, "neck");
    this.spine.addBox("box", -5.0F, -5.0F, -5.0F, 10, 10, 10);
    this.spine.addBox("scale", -1.0F, -9.0F, -3.0F, 2, 4, 6);
    this.body = new ModelRenderer(this, "body");
    this.body.setRotationPoint(0.0F, 4.0F, 8.0F);
    this.body.addBox("body", -12.0F, 0.0F, -16.0F, 24, 24, 64);
    this.body.addBox("scale", -1.0F, -6.0F, -10.0F, 2, 6, 12);
    this.body.addBox("scale", -1.0F, -6.0F, 10.0F, 2, 6, 12);
    this.body.addBox("scale", -1.0F, -6.0F, 30.0F, 2, 6, 12);
    this.wing = new ModelRenderer(this, "wing");
    this.wing.setRotationPoint(-12.0F, 5.0F, 2.0F);
    this.wing.addBox("bone", -56.0F, -4.0F, -4.0F, 56, 8, 8);
    this.wing.addBox("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
    this.wingTip = new ModelRenderer(this, "wingtip");
    this.wingTip.setRotationPoint(-56.0F, 0.0F, 0.0F);
    this.wingTip.addBox("bone", -56.0F, -2.0F, -2.0F, 56, 4, 4);
    this.wingTip.addBox("skin", -56.0F, 0.0F, 2.0F, 56, 0, 56);
    this.wing.addChild(this.wingTip);
    this.frontLeg = new ModelRenderer(this, "frontleg");
    this.frontLeg.setRotationPoint(-12.0F, 20.0F, 2.0F);
    this.frontLeg.addBox("main", -4.0F, -4.0F, -4.0F, 8, 24, 8);
    this.frontLegTip = new ModelRenderer(this, "frontlegtip");
    this.frontLegTip.setRotationPoint(0.0F, 20.0F, -1.0F);
    this.frontLegTip.addBox("main", -3.0F, -1.0F, -3.0F, 6, 24, 6);
    this.frontLeg.addChild(this.frontLegTip);
    this.frontFoot = new ModelRenderer(this, "frontfoot");
    this.frontFoot.setRotationPoint(0.0F, 23.0F, 0.0F);
    this.frontFoot.addBox("main", -4.0F, 0.0F, -12.0F, 8, 4, 16);
    this.frontLegTip.addChild(this.frontFoot);
    this.rearLeg = new ModelRenderer(this, "rearleg");
    this.rearLeg.setRotationPoint(-16.0F, 16.0F, 42.0F);
    this.rearLeg.addBox("main", -8.0F, -4.0F, -8.0F, 16, 32, 16);
    this.rearLegTip = new ModelRenderer(this, "rearlegtip");
    this.rearLegTip.setRotationPoint(0.0F, 32.0F, -4.0F);
    this.rearLegTip.addBox("main", -6.0F, -2.0F, 0.0F, 12, 32, 12);
    this.rearLeg.addChild(this.rearLegTip);
    this.rearFoot = new ModelRenderer(this, "rearfoot");
    this.rearFoot.setRotationPoint(0.0F, 31.0F, 4.0F);
    this.rearFoot.addBox("main", -9.0F, 0.0F, -20.0F, 18, 6, 24);
    this.rearLegTip.addChild(this.rearFoot);
  }
  
  public void setLivingAnimations(EntityLivingBase p_78086_1_, float p_78086_2_, float p_78086_3_, float p_78086_4_) {
    this.partialTicks = p_78086_4_;
  }
  
  public void render(Entity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_) {
    GL11.glPushMatrix();
    EntityC2Dragon entitydragon = (EntityC2Dragon)p_78088_1_;
    float f6 = entitydragon.prevAnimTime + (entitydragon.animTime - entitydragon.prevAnimTime) * this.partialTicks;
    this.jaw.rotateAngleX = (float)(Math.sin((f6 * 3.1415927F * 2.0F)) + 1.0D) * 0.2F;
    float f7 = (float)(Math.sin((f6 * 3.1415927F * 2.0F - 1.0F)) + 1.0D);
    f7 = (f7 * f7 * 1.0F + f7 * 2.0F) * 0.05F;
    GL11.glTranslatef(0.0F, f7 - 2.0F, -3.0F);
    GL11.glRotatef(f7 * 2.0F, 1.0F, 0.0F, 0.0F);
    float f8 = -30.0F;
    float f10 = 0.0F;
    float f11 = 1.5F;
    f8 += 2.0F;
    float f14 = f6 * 3.1415927F * 2.0F;
    f8 = 20.0F;
    float f9 = -12.0F;
    this.head.rotationPointY = f8;
    this.head.rotationPointZ = f9;
    this.head.rotationPointX = f10;
    this.head.render(p_78088_7_);
    GL11.glPushMatrix();
    GL11.glTranslatef(0.0F, 1.0F, 0.0F);
    GL11.glTranslatef(0.0F, -1.0F, 0.0F);
    this.body.rotateAngleZ = 0.0F;
    this.body.render(p_78088_7_);
    for (int j = 0; j < 2; j++) {
      GL11.glEnable(2884);
      float f15 = f6 * 3.1415927F * 2.0F;
      this.wing.rotateAngleX = 0.125F - (float)Math.cos(f15) * 0.2F;
      this.wing.rotateAngleY = 0.25F;
      this.wing.rotateAngleZ = (float)(Math.sin(f15) + 0.125D) * 0.8F;
      this.wingTip.rotateAngleZ = -((float)(Math.sin((f15 + 2.0F)) + 0.5D)) * 0.75F;
      this.rearLeg.rotateAngleX = 1.0F + f7 * 0.1F;
      this.rearLegTip.rotateAngleX = 0.5F + f7 * 0.1F;
      this.rearFoot.rotateAngleX = 0.75F + f7 * 0.1F;
      this.frontLeg.rotateAngleX = 1.3F + f7 * 0.1F;
      this.frontLegTip.rotateAngleX = -0.5F - f7 * 0.1F;
      this.frontFoot.rotateAngleX = 0.75F + f7 * 0.1F;
      this.wing.render(p_78088_7_);
      this.frontLeg.render(p_78088_7_);
      this.rearLeg.render(p_78088_7_);
      GL11.glScalef(-1.0F, 1.0F, 1.0F);
      if (j == 0)
        GL11.glCullFace(1028); 
    } 
    GL11.glPopMatrix();
    GL11.glCullFace(1029);
    GL11.glDisable(2884);
    float f16 = -((float)Math.sin((f6 * 3.1415927F * 2.0F))) * 0.0F;
    f14 = f6 * 3.1415927F * 2.0F;
    f8 = 10.0F;
    f9 = 60.0F;
    f10 = 0.0F;
    GL11.glPopMatrix();
  }
  
  private float updateRotations(double p_78214_1_) {
    while (p_78214_1_ >= 180.0D)
      p_78214_1_ -= 360.0D; 
    while (p_78214_1_ < -180.0D)
      p_78214_1_ += 360.0D; 
    return (float)p_78214_1_;
  }
}

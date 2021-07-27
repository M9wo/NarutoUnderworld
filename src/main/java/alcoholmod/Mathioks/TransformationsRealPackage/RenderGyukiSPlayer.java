package alcoholmod.Mathioks.TransformationsRealPackage;

import alcoholmod.Mathioks.SmoshXDDDModels.GyukiFModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderGyukiSPlayer extends RendererLivingEntity {
  private static final ResourceLocation Shukaku = new ResourceLocation("tm:textures/entity/GyukiS.png");
  
  private static Minecraft mc = Minecraft.getMinecraft();
  
  public RenderGyukiSPlayer() {
    super((ModelBase)new GyukiFModel(), 0.5F);
    this.renderManager = RenderManager.instance;
  }
  
  protected ResourceLocation getEntityTexture(Entity par1Entity) {
    return Shukaku;
  }
  
  protected void renderEquippedItems(AbstractClientPlayer p_77029_1_, float p_77029_2_) {
    GL11.glColor3f(1.0F, 1.0F, 1.0F);
    renderArrowsStuckInEntity((EntityLivingBase)p_77029_1_, p_77029_2_);
  }
  
  public GyukiFModel getPlayerModel() {
    return (GyukiFModel)this.mainModel;
  }
  
  public void doRender(AbstractClientPlayer entity, double x, double y, double z, float entityYaw, float partialTicks) {
    GL11.glPushMatrix();
    if (this.renderManager.livingPlayer == entity)
      GL11.glTranslatef(0.0F, -1.65F, 0.0F); 
    GL11.glColor3f(1.0F, 1.0F, 1.0F);
    double d0 = y + 1.0D;
    if (entity.isSneaking() && !(entity instanceof net.minecraft.client.entity.EntityPlayerSP))
      d0 = y - 1.0D; 
    setModelVisibilities(entity);
    super.doRender((EntityLivingBase)entity, x, d0, z, entityYaw, partialTicks);
    GL11.glPopMatrix();
  }
  
  private void setModelVisibilities(AbstractClientPlayer clientPlayer) {
    GyukiFModel modelplayer = getPlayerModel();
  }
  
  protected void func_96449_a(AbstractClientPlayer p_96449_1_, double p_96449_2_, double p_96449_4_, double p_96449_6_, String p_96449_8_, float p_96449_9_, double p_96449_10_) {
    if (p_96449_10_ < 100.0D) {
      Scoreboard scoreboard = p_96449_1_.getWorldScoreboard();
      ScoreObjective scoreobjective = scoreboard.func_96539_a(2);
      if (scoreobjective != null) {
        Score score = scoreboard.func_96529_a(p_96449_1_.getCommandSenderName(), scoreobjective);
        if (p_96449_1_.isPlayerSleeping()) {
          func_147906_a((Entity)p_96449_1_, score.getScorePoints() + " " + scoreobjective.getDisplayName(), p_96449_2_, p_96449_4_ - 1.5D, p_96449_6_, 64);
        } else {
          func_147906_a((Entity)p_96449_1_, score.getScorePoints() + " " + scoreobjective.getDisplayName(), p_96449_2_, p_96449_4_, p_96449_6_, 64);
        } 
        p_96449_4_ += ((getFontRendererFromRenderManager()).FONT_HEIGHT * 1.15F * p_96449_9_);
      } 
    } 
    func_96449_a((EntityLivingBase)p_96449_1_, p_96449_2_, p_96449_4_, p_96449_6_, p_96449_8_, p_96449_9_, p_96449_10_);
  }
  
  protected void renderLivingAt(AbstractClientPlayer p_77039_1_, double p_77039_2_, double p_77039_4_, double p_77039_6_) {
    if (p_77039_1_.isEntityAlive() && p_77039_1_.isPlayerSleeping()) {
      super.renderLivingAt((EntityLivingBase)p_77039_1_, p_77039_2_ + p_77039_1_.field_71079_bU, p_77039_4_ + p_77039_1_.field_71082_cx, p_77039_6_ + p_77039_1_.field_71089_bV);
    } else {
      super.renderLivingAt((EntityLivingBase)p_77039_1_, p_77039_2_, p_77039_4_, p_77039_6_);
    } 
  }
  
  protected void func_180595_a(AbstractClientPlayer p_180595_1_, float p_180595_2_, float p_180595_3_, float p_180595_4_) {
    if (p_180595_1_.isEntityAlive() && p_180595_1_.isPlayerSleeping()) {
      GL11.glRotatef(p_180595_1_.getBedOrientationInDegrees(), 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(getDeathMaxRotation((EntityLivingBase)p_180595_1_), 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(270.0F, 0.0F, 1.0F, 0.0F);
    } else {
      super.rotateCorpse((EntityLivingBase)p_180595_1_, p_180595_2_, p_180595_3_, p_180595_4_);
    } 
  }
  
  protected void preRenderCallback(EntityLivingBase p_77041_1_, float p_77041_2_) {
    GL11.glTranslatef(0.0F, 1.0F, 0.0F);
  }
  
  protected void renderEquippedItems(EntityLivingBase p_77029_1_, float p_77029_2_) {
    renderEquippedItems((AbstractClientPlayer)p_77029_1_, p_77029_2_);
  }
  
  protected void rotateCorpse(EntityLivingBase p_77043_1_, float p_77043_2_, float p_77043_3_, float p_77043_4_) {
    func_180595_a((AbstractClientPlayer)p_77043_1_, p_77043_2_, p_77043_3_, p_77043_4_);
  }
  
  protected void renderLivingAt(EntityLivingBase p_77039_1_, double p_77039_2_, double p_77039_4_, double p_77039_6_) {
    renderLivingAt((AbstractClientPlayer)p_77039_1_, p_77039_2_, p_77039_4_, p_77039_6_);
  }
  
  public void doRender(EntityLivingBase entity, double x, double y, double z, float p_76986_8_, float partialTicks) {
    doRender((AbstractClientPlayer)entity, x, y, z, p_76986_8_, partialTicks);
  }
  
  public ModelBase getMainModel() {
    return (ModelBase)getPlayerModel();
  }
  
  protected void func_177069_a(Entity p_177069_1_, double p_177069_2_, double p_177069_4_, double p_177069_6_, String p_177069_8_, float p_177069_9_, double p_177069_10_) {
    func_96449_a((AbstractClientPlayer)p_177069_1_, p_177069_2_, p_177069_4_, p_177069_6_, p_177069_8_, p_177069_9_, p_177069_10_);
  }
  
  public void doRender(Entity entity, double x, double y, double z, float p_76986_8_, float partialTicks) {
    doRender((AbstractClientPlayer)entity, x, y, z, p_76986_8_, partialTicks);
  }
}

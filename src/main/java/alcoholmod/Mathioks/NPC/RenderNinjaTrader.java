package alcoholmod.Mathioks.NPC;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderNinjaTrader extends RenderBiped {
  private static final ResourceLocation villagerTextures = new ResourceLocation("tm:textures/entity/ninja_boy.png");
  
  private static final ResourceLocation farmerVillagerTextures = new ResourceLocation("tm:textures/entity/Iruka.png");
  
  private static final ResourceLocation librarianVillagerTextures = new ResourceLocation("tm:textures/entity/shizune.png");
  
  private static final ResourceLocation priestVillagerTextures = new ResourceLocation("tm:textures/entity/ino_Clothing.png");
  
  private static final ResourceLocation smithVillagerTextures = new ResourceLocation("tm:textures/entity/tenten.png");
  
  private static final ResourceLocation butcherVillagerTextures = new ResourceLocation("tm:textures/entity/Ichiraku.png");
  
  protected ModelBiped villagerModel;
  
  private static final String __OBFID = "CL_00001032";
  
  public RenderNinjaTrader() {
    super(new ModelBiped(0.0F), 0.5F);
    this.villagerModel = (ModelBiped)this.mainModel;
  }
  
  protected int shouldRenderPass(EntityVillager p_77032_1_, int p_77032_2_, float p_77032_3_) {
    return -1;
  }
  
  public void doRender(EntityVillager p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
    super.doRender((EntityLiving)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
  }
  
  protected ResourceLocation getEntityTexture(EntityVillager p_110775_1_) {
    switch (p_110775_1_.getProfession()) {
      case 0:
        return farmerVillagerTextures;
      case 1:
        return librarianVillagerTextures;
      case 2:
        return priestVillagerTextures;
      case 3:
        return smithVillagerTextures;
      case 4:
        return butcherVillagerTextures;
    } 
    return villagerTextures;
  }
  
  protected void renderEquippedItems(EntityVillager p_77029_1_, float p_77029_2_) {
    renderEquippedItems((EntityLiving)p_77029_1_, p_77029_2_);
  }
  
  protected void preRenderCallback(EntityVillager p_77041_1_, float p_77041_2_) {
    float f1 = 0.9375F;
    if (p_77041_1_.getGrowingAge() < 0) {
      f1 = (float)(f1 * 0.5D);
      this.shadowSize = 0.25F;
    } else {
      this.shadowSize = 0.5F;
    } 
    GL11.glScalef(f1, f1, f1);
  }
  
  public void doRender(EntityLiving p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
    doRender((EntityVillager)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
  }
  
  protected void preRenderCallback(EntityLivingBase p_77041_1_, float p_77041_2_) {
    preRenderCallback((EntityVillager)p_77041_1_, p_77041_2_);
  }
  
  protected int shouldRenderPass(EntityLivingBase p_77032_1_, int p_77032_2_, float p_77032_3_) {
    return shouldRenderPass((EntityVillager)p_77032_1_, p_77032_2_, p_77032_3_);
  }
  
  protected void renderEquippedItems(EntityLivingBase p_77029_1_, float p_77029_2_) {
    renderEquippedItems((EntityVillager)p_77029_1_, p_77029_2_);
  }
  
  public void doRender(EntityLivingBase p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
    doRender((EntityVillager)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
  }
  
  protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
    return getEntityTexture((EntityVillager)p_110775_1_);
  }
  
  public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
    doRender((EntityVillager)p_76986_1_, p_76986_2_, p_76986_4_, p_76986_6_, p_76986_8_, p_76986_9_);
  }
}

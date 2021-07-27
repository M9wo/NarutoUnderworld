package alcoholmod.Mathioks.TransformationsRealPackage;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMap;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapData;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.event.RenderBlockOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class ItemRendererTransform {
  private static final ResourceLocation wolfTexture = new ResourceLocation("tm:textures/entity/bijuuArmRender.png");
  
  private static final ResourceLocation textureBlack = new ResourceLocation("howlingmoon:textures/mob/werewolf_black.png");
  
  private static final ResourceLocation textureRed = new ResourceLocation("howlingmoon:textures/mob/werewolf_red.png");
  
  private static final ResourceLocation textureKillerwolf = new ResourceLocation("howlingmoon:textures/mob/werewolf_killerwolf.png");
  
  private static final ResourceLocation RES_ITEM_GLINT = new ResourceLocation("textures/misc/enchanted_item_glint.png");
  
  private static final ResourceLocation RES_MAP_BACKGROUND = new ResourceLocation("textures/map/map_background.png");
  
  private static final ResourceLocation RES_UNDERWATER_OVERLAY = new ResourceLocation("textures/misc/underwater.png");
  
  private Minecraft mc;
  
  private ItemStack itemToRender;
  
  private float equippedProgress;
  
  private float prevEquippedProgress;
  
  private RenderBlocks renderBlocksIr = new RenderBlocks();
  
  private int equippedItemSlot = -1;
  
  RenderChakraPlayer renderwerewolfplayer;
  
  public ItemRendererTransform(Minecraft p_i1247_1_) {
    this.mc = p_i1247_1_;
    this.renderwerewolfplayer = new RenderChakraPlayer();
    this.renderwerewolfplayer.setRenderManager(RenderManager.instance);
  }
  
  public void renderItem(EntityLivingBase p_78443_1_, ItemStack p_78443_2_, int p_78443_3_) {
    renderItem(p_78443_1_, p_78443_2_, p_78443_3_, IItemRenderer.ItemRenderType.EQUIPPED);
  }
  
  public void renderItem(EntityLivingBase p_78443_1_, ItemStack p_78443_2_, int p_78443_3_, IItemRenderer.ItemRenderType type) {
    GL11.glPushMatrix();
    TextureManager texturemanager = this.mc.getTextureManager();
    Item item = p_78443_2_.getItem();
    Block block = Block.getBlockFromItem(item);
    if (p_78443_2_ != null && block != null && block.getRenderBlockPass() != 0) {
      GL11.glEnable(3042);
      GL11.glEnable(2884);
      OpenGlHelper.glBlendFunc(770, 771, 1, 0);
    } 
    IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer(p_78443_2_, type);
    if (customRenderer != null) {
      texturemanager.bindTexture(texturemanager.getResourceLocation(p_78443_2_.getItemSpriteNumber()));
      ForgeHooksClient.renderEquippedItem(type, customRenderer, this.renderBlocksIr, p_78443_1_, p_78443_2_);
    } else if (p_78443_2_.getItemSpriteNumber() == 0 && item instanceof net.minecraft.item.ItemBlock && RenderBlocks.renderItemIn3d(block.getRenderType())) {
      texturemanager.bindTexture(texturemanager.getResourceLocation(0));
      if (p_78443_2_ != null && block != null && block.getRenderBlockPass() != 0) {
        GL11.glDepthMask(false);
        this.renderBlocksIr.renderBlockAsItem(block, p_78443_2_.getItemDamage(), 1.0F);
        GL11.glDepthMask(true);
      } else {
        this.renderBlocksIr.renderBlockAsItem(block, p_78443_2_.getItemDamage(), 1.0F);
      } 
    } else {
      IIcon iicon = p_78443_1_.getItemIcon(p_78443_2_, p_78443_3_);
      if (iicon == null) {
        GL11.glPopMatrix();
        return;
      } 
      texturemanager.bindTexture(texturemanager.getResourceLocation(p_78443_2_.getItemSpriteNumber()));
      TextureUtil.func_152777_a(false, false, 1.0F);
      Tessellator tessellator = Tessellator.instance;
      float f = iicon.getMinU();
      float f1 = iicon.getMaxU();
      float f2 = iicon.getMinV();
      float f3 = iicon.getMaxV();
      float f4 = 0.0F;
      float f5 = 0.3F;
      GL11.glEnable(32826);
      GL11.glTranslatef(-f4, -f5, 0.0F);
      float f6 = 1.5F;
      GL11.glScalef(f6, f6, f6);
      GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
      renderItemIn2D(tessellator, f1, f2, f, f3, iicon.getIconWidth(), iicon.getIconHeight(), 0.0625F);
      if (p_78443_2_.hasEffect(p_78443_3_)) {
        GL11.glDepthFunc(514);
        GL11.glDisable(2896);
        texturemanager.bindTexture(RES_ITEM_GLINT);
        GL11.glEnable(3042);
        OpenGlHelper.glBlendFunc(768, 1, 1, 0);
        float f7 = 0.76F;
        GL11.glColor4f(0.5F * f7, 0.25F * f7, 0.8F * f7, 1.0F);
        GL11.glMatrixMode(5890);
        GL11.glPushMatrix();
        float f8 = 0.125F;
        GL11.glScalef(f8, f8, f8);
        float f9 = (float)(Minecraft.getSystemTime() % 3000L) / 3000.0F * 8.0F;
        GL11.glTranslatef(f9, 0.0F, 0.0F);
        GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
        renderItemIn2D(tessellator, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glScalef(f8, f8, f8);
        f9 = (float)(Minecraft.getSystemTime() % 4873L) / 4873.0F * 8.0F;
        GL11.glTranslatef(-f9, 0.0F, 0.0F);
        GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
        renderItemIn2D(tessellator, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
        GL11.glPopMatrix();
        GL11.glMatrixMode(5888);
        GL11.glDisable(3042);
        GL11.glEnable(2896);
        GL11.glDepthFunc(515);
      } 
      GL11.glDisable(32826);
      texturemanager.bindTexture(texturemanager.getResourceLocation(p_78443_2_.getItemSpriteNumber()));
      TextureUtil.func_147945_b();
    } 
    if (p_78443_2_ != null && block != null && block.getRenderBlockPass() != 0)
      GL11.glDisable(3042); 
    GL11.glPopMatrix();
  }
  
  public static void renderItemIn2D(Tessellator p_78439_0_, float p_78439_1_, float p_78439_2_, float p_78439_3_, float p_78439_4_, int p_78439_5_, int p_78439_6_, float p_78439_7_) {
    p_78439_0_.startDrawingQuads();
    p_78439_0_.setNormal(0.0F, 0.0F, 1.0F);
    p_78439_0_.addVertexWithUV(0.0D, 0.0D, 0.0D, p_78439_1_, p_78439_4_);
    p_78439_0_.addVertexWithUV(1.0D, 0.0D, 0.0D, p_78439_3_, p_78439_4_);
    p_78439_0_.addVertexWithUV(1.0D, 1.0D, 0.0D, p_78439_3_, p_78439_2_);
    p_78439_0_.addVertexWithUV(0.0D, 1.0D, 0.0D, p_78439_1_, p_78439_2_);
    p_78439_0_.draw();
    p_78439_0_.startDrawingQuads();
    p_78439_0_.setNormal(0.0F, 0.0F, -1.0F);
    p_78439_0_.addVertexWithUV(0.0D, 1.0D, (0.0F - p_78439_7_), p_78439_1_, p_78439_2_);
    p_78439_0_.addVertexWithUV(1.0D, 1.0D, (0.0F - p_78439_7_), p_78439_3_, p_78439_2_);
    p_78439_0_.addVertexWithUV(1.0D, 0.0D, (0.0F - p_78439_7_), p_78439_3_, p_78439_4_);
    p_78439_0_.addVertexWithUV(0.0D, 0.0D, (0.0F - p_78439_7_), p_78439_1_, p_78439_4_);
    p_78439_0_.draw();
    float f5 = 0.5F * (p_78439_1_ - p_78439_3_) / p_78439_5_;
    float f6 = 0.5F * (p_78439_4_ - p_78439_2_) / p_78439_6_;
    p_78439_0_.startDrawingQuads();
    p_78439_0_.setNormal(-1.0F, 0.0F, 0.0F);
    int k;
    for (k = 0; k < p_78439_5_; k++) {
      float f7 = (k / p_78439_5_);
      float f8 = p_78439_1_ + (p_78439_3_ - p_78439_1_) * f7 - f5;
      p_78439_0_.addVertexWithUV(f7, 0.0D, (0.0F - p_78439_7_), f8, p_78439_4_);
      p_78439_0_.addVertexWithUV(f7, 0.0D, 0.0D, f8, p_78439_4_);
      p_78439_0_.addVertexWithUV(f7, 1.0D, 0.0D, f8, p_78439_2_);
      p_78439_0_.addVertexWithUV(f7, 1.0D, (0.0F - p_78439_7_), f8, p_78439_2_);
    } 
    p_78439_0_.draw();
    p_78439_0_.startDrawingQuads();
    p_78439_0_.setNormal(1.0F, 0.0F, 0.0F);
    for (k = 0; k < p_78439_5_; k++) {
      float f7 = (k / p_78439_5_);
      float f8 = p_78439_1_ + (p_78439_3_ - p_78439_1_) * f7 - f5;
      float f9 = f7 + 1.0F / p_78439_5_;
      p_78439_0_.addVertexWithUV(f9, 1.0D, (0.0F - p_78439_7_), f8, p_78439_2_);
      p_78439_0_.addVertexWithUV(f9, 1.0D, 0.0D, f8, p_78439_2_);
      p_78439_0_.addVertexWithUV(f9, 0.0D, 0.0D, f8, p_78439_4_);
      p_78439_0_.addVertexWithUV(f9, 0.0D, (0.0F - p_78439_7_), f8, p_78439_4_);
    } 
    p_78439_0_.draw();
    p_78439_0_.startDrawingQuads();
    p_78439_0_.setNormal(0.0F, 1.0F, 0.0F);
    for (k = 0; k < p_78439_6_; k++) {
      float f7 = (k / p_78439_6_);
      float f8 = p_78439_4_ + (p_78439_2_ - p_78439_4_) * f7 - f6;
      float f9 = f7 + 1.0F / p_78439_6_;
      p_78439_0_.addVertexWithUV(0.0D, f9, 0.0D, p_78439_1_, f8);
      p_78439_0_.addVertexWithUV(1.0D, f9, 0.0D, p_78439_3_, f8);
      p_78439_0_.addVertexWithUV(1.0D, f9, (0.0F - p_78439_7_), p_78439_3_, f8);
      p_78439_0_.addVertexWithUV(0.0D, f9, (0.0F - p_78439_7_), p_78439_1_, f8);
    } 
    p_78439_0_.draw();
    p_78439_0_.startDrawingQuads();
    p_78439_0_.setNormal(0.0F, -1.0F, 0.0F);
    for (k = 0; k < p_78439_6_; k++) {
      float f7 = (k / p_78439_6_);
      float f8 = p_78439_4_ + (p_78439_2_ - p_78439_4_) * f7 - f6;
      p_78439_0_.addVertexWithUV(1.0D, f7, 0.0D, p_78439_3_, f8);
      p_78439_0_.addVertexWithUV(0.0D, f7, 0.0D, p_78439_1_, f8);
      p_78439_0_.addVertexWithUV(0.0D, f7, (0.0F - p_78439_7_), p_78439_1_, f8);
      p_78439_0_.addVertexWithUV(1.0D, f7, (0.0F - p_78439_7_), p_78439_3_, f8);
    } 
    p_78439_0_.draw();
  }
  
  public void renderItemInFirstPerson(float p_78440_1_) {
    float f1 = this.prevEquippedProgress + (this.equippedProgress - this.prevEquippedProgress) * p_78440_1_;
    EntityClientPlayerMP entityclientplayermp = this.mc.thePlayer;
    float f2 = entityclientplayermp.prevRotationPitch + (entityclientplayermp.rotationPitch - entityclientplayermp.prevRotationPitch) * p_78440_1_;
    GL11.glPushMatrix();
    GL11.glRotatef(f2, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(entityclientplayermp.prevRotationYaw + (entityclientplayermp.rotationYaw - entityclientplayermp.prevRotationYaw) * p_78440_1_, 0.0F, 1.0F, 0.0F);
    RenderHelper.enableStandardItemLighting();
    GL11.glPopMatrix();
    float f3 = entityclientplayermp.prevRenderArmPitch + (entityclientplayermp.renderArmPitch - entityclientplayermp.prevRenderArmPitch) * p_78440_1_;
    float f4 = entityclientplayermp.prevRenderArmYaw + (entityclientplayermp.renderArmYaw - entityclientplayermp.prevRenderArmYaw) * p_78440_1_;
    GL11.glRotatef((entityclientplayermp.rotationPitch - f3) * 0.1F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef((entityclientplayermp.rotationYaw - f4) * 0.1F, 0.0F, 1.0F, 0.0F);
    ItemStack itemstack = this.itemToRender;
    if (itemstack != null && itemstack.getItem() instanceof net.minecraft.item.ItemCloth) {
      GL11.glEnable(3042);
      OpenGlHelper.glBlendFunc(770, 771, 1, 0);
    } 
    int i = this.mc.theWorld.getLightBrightnessForSkyBlocks(MathHelper.floor_double(entityclientplayermp.posX), MathHelper.floor_double(entityclientplayermp.posY), MathHelper.floor_double(entityclientplayermp.posZ), 0);
    int j = i % 65536;
    int k = i / 65536;
    OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, j / 1.0F, k / 1.0F);
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    if (itemstack != null) {
      int l = itemstack.getItem().getColorFromItemStack(itemstack, 0);
      float f5 = (l >> 16 & 0xFF) / 255.0F;
      float f6 = (l >> 8 & 0xFF) / 255.0F;
      float f7 = (l & 0xFF) / 255.0F;
      GL11.glColor4f(f5, f6, f7, 1.0F);
    } else {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    } 
    if (itemstack != null && itemstack.getItem() instanceof ItemMap) {
      GL11.glPushMatrix();
      float f13 = 0.8F;
      float f5 = entityclientplayermp.getSwingProgress(p_78440_1_);
      float f6 = MathHelper.sin(f5 * 3.141593F);
      float f7 = MathHelper.sin(MathHelper.sqrt_float(f5) * 3.141593F);
      GL11.glTranslatef(-f7 * 0.4F, MathHelper.sin(MathHelper.sqrt_float(f5) * 3.141593F * 2.0F) * 0.2F, -f6 * 0.2F);
      f5 = 1.0F - f2 / 45.0F + 0.1F;
      if (f5 < 0.0F)
        f5 = 0.0F; 
      if (f5 > 1.0F)
        f5 = 1.0F; 
      f5 = -MathHelper.cos(f5 * 3.141593F) * 0.5F + 0.5F;
      GL11.glTranslatef(0.0F, 0.0F * f13 - (1.0F - f1) * 1.2F - f5 * 0.5F + 0.04F, -0.9F * f13);
      GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(f5 * -85.0F, 0.0F, 0.0F, 1.0F);
      GL11.glEnable(32826);
      this.mc.getTextureManager().bindTexture(entityclientplayermp.getLocationSkin());
      for (int i1 = 0; i1 < 2; i1++) {
        int x = i1 * 2 - 1;
        GL11.glPushMatrix();
        GL11.glTranslatef(-0.0F, -0.6F, 1.1F * x);
        GL11.glRotatef((-45 * x), 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(59.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef((-65 * x), 0.0F, 1.0F, 0.0F);
        Render render = RenderManager.instance.getEntityRenderObject((Entity)this.mc.thePlayer);
        RenderPlayer renderplayer = (RenderPlayer)render;
        float f12 = 1.0F;
        GL11.glScalef(f12, f12, f12);
        renderplayer.renderFirstPersonArm((EntityPlayer)this.mc.thePlayer);
        GL11.glPopMatrix();
      } 
      f6 = entityclientplayermp.getSwingProgress(p_78440_1_);
      f7 = MathHelper.sin(f6 * f6 * 3.141593F);
      float f8 = MathHelper.sin(MathHelper.sqrt_float(f6) * 3.141593F);
      GL11.glRotatef(-f7 * 20.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-f8 * 20.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(-f8 * 80.0F, 1.0F, 0.0F, 0.0F);
      float f9 = 0.38F;
      GL11.glScalef(f9, f9, f9);
      GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef(-1.0F, -1.0F, 0.0F);
      float f10 = 0.015625F;
      GL11.glScalef(f10, f10, f10);
      this.mc.getTextureManager().bindTexture(RES_MAP_BACKGROUND);
      Tessellator tessellator = Tessellator.instance;
      GL11.glNormal3f(0.0F, 0.0F, -1.0F);
      tessellator.startDrawingQuads();
      byte b0 = 7;
      tessellator.addVertexWithUV((0 - b0), (128 + b0), 0.0D, 0.0D, 1.0D);
      tessellator.addVertexWithUV((128 + b0), (128 + b0), 0.0D, 1.0D, 1.0D);
      tessellator.addVertexWithUV((128 + b0), (0 - b0), 0.0D, 1.0D, 0.0D);
      tessellator.addVertexWithUV((0 - b0), (0 - b0), 0.0D, 0.0D, 0.0D);
      tessellator.draw();
      IItemRenderer custom = MinecraftForgeClient.getItemRenderer(itemstack, IItemRenderer.ItemRenderType.FIRST_PERSON_MAP);
      MapData mapdata = ((ItemMap)itemstack.getItem()).getMapData(itemstack, (World)this.mc.theWorld);
      if (custom == null) {
        if (mapdata != null)
          this.mc.entityRenderer.getMapItemRenderer().func_148250_a(mapdata, false); 
      } else {
        custom.renderItem(IItemRenderer.ItemRenderType.FIRST_PERSON_MAP, itemstack, new Object[] { this.mc.thePlayer, this.mc.getTextureManager(), mapdata });
      } 
      GL11.glPopMatrix();
    } else if (itemstack != null) {
      GL11.glPushMatrix();
      float f13 = 0.8F;
      if (entityclientplayermp.getItemInUseCount() > 0) {
        EnumAction enumaction = itemstack.getItemUseAction();
        if (enumaction == EnumAction.eat || enumaction == EnumAction.drink) {
          float f10 = entityclientplayermp.getItemInUseCount() - p_78440_1_ + 1.0F;
          float f11 = 1.0F - f10 / itemstack.getMaxItemUseDuration();
          float f12 = 1.0F - f11;
          f12 = f12 * f12 * f12;
          f12 = f12 * f12 * f12;
          f12 = f12 * f12 * f12;
          float f9 = 1.0F - f12;
          GL11.glTranslatef(0.0F, MathHelper.abs(MathHelper.cos(f10 / 4.0F * 3.141593F) * 0.1F) * (float)((double)f11 > 0.2D ? 1 : 0), 0.0F);
          GL11.glTranslatef(f9 * 0.6F, -f9 * 0.5F, 0.0F);
          GL11.glRotatef(f9 * 90.0F, 0.0F, 1.0F, 0.0F);
          GL11.glRotatef(f9 * 10.0F, 1.0F, 0.0F, 0.0F);
          GL11.glRotatef(f9 * 30.0F, 0.0F, 0.0F, 1.0F);
        } 
      } else {
        float f9 = entityclientplayermp.getSwingProgress(p_78440_1_);
        float f10 = MathHelper.sin(f9 * 3.141593F);
        float f11 = MathHelper.sin(MathHelper.sqrt_float(f9) * 3.141593F);
        GL11.glTranslatef(-f11 * 0.4F, MathHelper.sin(MathHelper.sqrt_float(f9) * 3.141593F * 2.0F) * 0.2F, -f10 * 0.2F);
      } 
      GL11.glTranslatef(0.7F * f13, -0.65F * f13 - (1.0F - f1) * 0.6F, -0.9F * f13);
      GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
      GL11.glEnable(32826);
      float f5 = entityclientplayermp.getSwingProgress(p_78440_1_);
      float f6 = MathHelper.sin(f5 * f5 * 3.141593F);
      float f7 = MathHelper.sin(MathHelper.sqrt_float(f5) * 3.141593F);
      GL11.glRotatef(-f6 * 20.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-f7 * 20.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(-f7 * 80.0F, 1.0F, 0.0F, 0.0F);
      float f8 = 0.4F;
      GL11.glScalef(f8, f8, f8);
      if (entityclientplayermp.getItemInUseCount() > 0) {
        EnumAction enumaction1 = itemstack.getItemUseAction();
        if (enumaction1 == EnumAction.block) {
          GL11.glTranslatef(-0.5F, 0.2F, 0.0F);
          GL11.glRotatef(30.0F, 0.0F, 1.0F, 0.0F);
          GL11.glRotatef(-80.0F, 1.0F, 0.0F, 0.0F);
          GL11.glRotatef(60.0F, 0.0F, 1.0F, 0.0F);
        } else if (enumaction1 == EnumAction.bow) {
          GL11.glRotatef(-18.0F, 0.0F, 0.0F, 1.0F);
          GL11.glRotatef(-12.0F, 0.0F, 1.0F, 0.0F);
          GL11.glRotatef(-8.0F, 1.0F, 0.0F, 0.0F);
          GL11.glTranslatef(-0.9F, 0.2F, 0.0F);
          float f10 = itemstack.getMaxItemUseDuration() - entityclientplayermp.getItemInUseCount() - p_78440_1_ + 1.0F;
          float f11 = f10 / 20.0F;
          f11 = (f11 * f11 + f11 * 2.0F) / 3.0F;
          if (f11 > 1.0F)
            f11 = 1.0F; 
          if (f11 > 0.1F)
            GL11.glTranslatef(0.0F, MathHelper.sin((f10 - 0.1F) * 1.3F) * 0.01F * (f11 - 0.1F), 0.0F); 
          GL11.glTranslatef(0.0F, 0.0F, f11 * 0.1F);
          GL11.glRotatef(-335.0F, 0.0F, 0.0F, 1.0F);
          GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
          GL11.glTranslatef(0.0F, 0.5F, 0.0F);
          float f12 = 1.0F + f11 * 0.2F;
          GL11.glScalef(1.0F, 1.0F, f12);
          GL11.glTranslatef(0.0F, -0.5F, 0.0F);
          GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
          GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
        } 
      } 
      if (itemstack.getItem().shouldRotateAroundWhenRendering())
        GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F); 
      if (itemstack.getItem().requiresMultipleRenderPasses()) {
        renderItem((EntityLivingBase)entityclientplayermp, itemstack, 0, IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON);
        for (int x = 1; x < itemstack.getItem().getRenderPasses(itemstack.getItemDamage()); x++) {
          int k1 = itemstack.getItem().getColorFromItemStack(itemstack, x);
          float f11 = (k1 >> 16 & 0xFF) / 255.0F;
          float f12 = (k1 >> 8 & 0xFF) / 255.0F;
          GL11.glColor4f(1.0F * f11, 1.0F * f12, 1.0F * f12, 1.0F);
          renderItem((EntityLivingBase)entityclientplayermp, itemstack, x, IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON);
        } 
      } else {
        renderItem((EntityLivingBase)entityclientplayermp, itemstack, 0, IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON);
      } 
      GL11.glPopMatrix();
    } else if (!entityclientplayermp.isInvisible()) {
      GL11.glPushMatrix();
      float f13 = 0.8F;
      float f5 = entityclientplayermp.getSwingProgress(p_78440_1_);
      float f6 = MathHelper.sin(f5 * 3.141593F);
      float f7 = MathHelper.sin(MathHelper.sqrt_float(f5) * 3.141593F);
      GL11.glTranslatef(-f7 * 0.3F, MathHelper.sin(MathHelper.sqrt_float(f5) * 3.141593F * 2.0F) * 0.4F, -f6 * 0.4F);
      GL11.glTranslatef(0.8F * f13, -0.75F * f13 - (1.0F - f1) * 0.6F, -0.9F * f13);
      GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
      GL11.glEnable(32826);
      f5 = entityclientplayermp.getSwingProgress(p_78440_1_);
      f6 = MathHelper.sin(f5 * f5 * 3.141593F);
      f7 = MathHelper.sin(MathHelper.sqrt_float(f5) * 3.141593F);
      GL11.glRotatef(f7 * 70.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-f6 * 20.0F, 0.0F, 0.0F, 1.0F);
      this.mc.getTextureManager().bindTexture(entityclientplayermp.getLocationSkin());
      GL11.glTranslatef(-1.0F, 3.6F, 3.5F);
      GL11.glRotatef(120.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(200.0F, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
      GL11.glScalef(1.0F, 1.0F, 1.0F);
      GL11.glTranslatef(5.6F, 0.0F, 0.0F);
      this.mc.renderEngine.bindTexture(wolfTexture);
      float f8 = 1.0F;
      GL11.glScalef(f8, f8, f8);
      this.renderwerewolfplayer.renderFirstPersonArm((EntityPlayer)this.mc.thePlayer);
      GL11.glPopMatrix();
    } 
    if (itemstack != null && itemstack.getItem() instanceof net.minecraft.item.ItemCloth)
      GL11.glDisable(3042); 
    GL11.glDisable(32826);
    RenderHelper.disableStandardItemLighting();
  }
  
  public void renderOverlays(float p_78447_1_) {
    GL11.glDisable(3008);
    if (this.mc.thePlayer.isBurning() && !MinecraftForge.EVENT_BUS.post((Event)new RenderBlockOverlayEvent((EntityPlayer)this.mc.thePlayer, p_78447_1_, RenderBlockOverlayEvent.OverlayType.FIRE, (Block)Blocks.fire, MathHelper.floor_double(this.mc.thePlayer.posX), MathHelper.floor_double(this.mc.thePlayer.posY), MathHelper.floor_double(this.mc.thePlayer.posZ))))
      renderFireInFirstPerson(p_78447_1_); 
    if (this.mc.thePlayer.isEntityInsideOpaqueBlock()) {
      int i = MathHelper.floor_double(this.mc.thePlayer.posX);
      int j = MathHelper.floor_double(this.mc.thePlayer.posY);
      int k = MathHelper.floor_double(this.mc.thePlayer.posZ);
      Block block = this.mc.theWorld.getBlock(i, j, k);
      int block2_X = i;
      int block2_Y = j;
      int block2_Z = k;
      if (this.mc.theWorld.getBlock(i, j, k).isNormalCube()) {
        if (!MinecraftForge.EVENT_BUS.post((Event)new RenderBlockOverlayEvent((EntityPlayer)this.mc.thePlayer, p_78447_1_, RenderBlockOverlayEvent.OverlayType.BLOCK, block, i, j, k)))
          renderInsideOfBlock(p_78447_1_, block.getBlockTextureFromSide(2)); 
      } else {
        for (int l = 0; l < 8; l++) {
          float f1 = (((l >> 0) % 2) - 0.5F) * this.mc.thePlayer.width * 0.9F;
          float f2 = (((l >> 1) % 2) - 0.5F) * this.mc.thePlayer.height * 0.2F;
          float f3 = (((l >> 2) % 2) - 0.5F) * this.mc.thePlayer.width * 0.9F;
          int i1 = MathHelper.floor_float(i + f1);
          int j1 = MathHelper.floor_float(j + f2);
          int k1 = MathHelper.floor_float(k + f3);
          if (this.mc.theWorld.getBlock(i1, j1, k1).isNormalCube()) {
            block = this.mc.theWorld.getBlock(i1, j1, k1);
            block2_X = i;
            block2_Y = j;
            block2_Z = k;
          } 
        } 
      } 
      if (block.getMaterial() != Material.air && !MinecraftForge.EVENT_BUS.post((Event)new RenderBlockOverlayEvent((EntityPlayer)this.mc.thePlayer, p_78447_1_, RenderBlockOverlayEvent.OverlayType.BLOCK, block, block2_X, block2_Y, block2_Z)))
        renderInsideOfBlock(p_78447_1_, block.getBlockTextureFromSide(2)); 
    } 
    if (this.mc.thePlayer.isInsideOfMaterial(Material.water) && !MinecraftForge.EVENT_BUS.post((Event)new RenderBlockOverlayEvent((EntityPlayer)this.mc.thePlayer, p_78447_1_, RenderBlockOverlayEvent.OverlayType.WATER, Blocks.water, MathHelper.floor_double(this.mc.thePlayer.posX), MathHelper.floor_double(this.mc.thePlayer.posY), MathHelper.floor_double(this.mc.thePlayer.posZ))))
      renderWarpedTextureOverlay(p_78447_1_); 
    GL11.glEnable(3008);
  }
  
  private void renderInsideOfBlock(float p_78446_1_, IIcon p_78446_2_) {
    this.mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
    Tessellator tessellator = Tessellator.instance;
    float f1 = 0.1F;
    GL11.glColor4f(f1, f1, f1, 0.5F);
    GL11.glPushMatrix();
    float f2 = -1.0F;
    float f3 = 1.0F;
    float f4 = -1.0F;
    float f5 = 1.0F;
    float f6 = -0.5F;
    float f7 = p_78446_2_.getMinU();
    float f8 = p_78446_2_.getMaxU();
    float f9 = p_78446_2_.getMinV();
    float f10 = p_78446_2_.getMaxV();
    tessellator.startDrawingQuads();
    tessellator.addVertexWithUV(f2, f4, f6, f8, f10);
    tessellator.addVertexWithUV(f3, f4, f6, f7, f10);
    tessellator.addVertexWithUV(f3, f5, f6, f7, f9);
    tessellator.addVertexWithUV(f2, f5, f6, f8, f9);
    tessellator.draw();
    GL11.glPopMatrix();
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
  }
  
  private void renderWarpedTextureOverlay(float p_78448_1_) {
    this.mc.getTextureManager().bindTexture(RES_UNDERWATER_OVERLAY);
    Tessellator tessellator = Tessellator.instance;
    float f1 = this.mc.thePlayer.getBrightness(p_78448_1_);
    GL11.glColor4f(f1, f1, f1, 0.5F);
    GL11.glEnable(3042);
    OpenGlHelper.glBlendFunc(770, 771, 1, 0);
    GL11.glPushMatrix();
    float f2 = 4.0F;
    float f3 = -1.0F;
    float f4 = 1.0F;
    float f5 = -1.0F;
    float f6 = 1.0F;
    float f7 = -0.5F;
    float f8 = -this.mc.thePlayer.rotationYaw / 64.0F;
    float f9 = this.mc.thePlayer.rotationPitch / 64.0F;
    tessellator.startDrawingQuads();
    tessellator.addVertexWithUV(f3, f5, f7, (f2 + f8), (f2 + f9));
    tessellator.addVertexWithUV(f4, f5, f7, (0.0F + f8), (f2 + f9));
    tessellator.addVertexWithUV(f4, f6, f7, (0.0F + f8), (0.0F + f9));
    tessellator.addVertexWithUV(f3, f6, f7, (f2 + f8), (0.0F + f9));
    tessellator.draw();
    GL11.glPopMatrix();
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glDisable(3042);
  }
  
  private void renderFireInFirstPerson(float p_78442_1_) {
    Tessellator tessellator = Tessellator.instance;
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.9F);
    GL11.glEnable(3042);
    OpenGlHelper.glBlendFunc(770, 771, 1, 0);
    float f1 = 1.0F;
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glDisable(3042);
  }
  
  public void updateEquippedItem() {
    this.prevEquippedProgress = this.equippedProgress;
    EntityClientPlayerMP entityclientplayermp = this.mc.thePlayer;
    ItemStack itemstack = entityclientplayermp.inventory.getCurrentItem();
    boolean flag = (this.equippedItemSlot == entityclientplayermp.inventory.currentItem && itemstack == this.itemToRender);
    if (this.itemToRender == null && itemstack == null)
      flag = true; 
    if (itemstack != null && this.itemToRender != null && itemstack != this.itemToRender && itemstack.getItem() == this.itemToRender.getItem() && itemstack.getItemDamage() == this.itemToRender.getItemDamage()) {
      this.itemToRender = itemstack;
      flag = true;
    } 
    float f = 0.4F;
    float f1 = flag ? 1.0F : 0.0F;
    float f2 = f1 - this.equippedProgress;
    if (f2 < -f)
      f2 = -f; 
    if (f2 > f)
      f2 = f; 
    this.equippedProgress += f2;
    if (this.equippedProgress < 0.1F) {
      this.itemToRender = itemstack;
      this.equippedItemSlot = entityclientplayermp.inventory.currentItem;
    } 
  }
  
  public void resetEquippedProgress() {
    this.equippedProgress = 0.0F;
  }
  
  public void resetEquippedProgress2() {
    this.equippedProgress = 0.0F;
  }
}

package alcoholmod.Mathioks.TransformationsRealPackage;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

public class ChakraTransformEventHandler {
  private Render renderCustomModel;
  
  private Minecraft mc = Minecraft.getMinecraft();
  
  public final ItemRendererTransform itemRendererWerewolf;
  
  private EntityRenderer rendererBeast;
  
  private EntityRenderer rendererDire;
  
  private EntityRenderer prevRenderer;
  
  private EntityRenderer rendererShukaku;
  
  private EntityRenderer rendererMatatabi;
  
  private EntityRenderer rendererIsobu;
  
  private EntityRenderer rendererSonGoku;
  
  private EntityRenderer rendererKokuo;
  
  private EntityRenderer rendererSaiken;
  
  private EntityRenderer rendererChomei;
  
  private EntityRenderer rendererGyuki;
  
  private EntityRenderer rendererKurama;
  
  private EntityRenderer rendererJuubi;
  
  private float ySize;
  
  private int curModel;
  
  public ChakraTransformEventHandler() {
    this.itemRendererWerewolf = new ItemRendererTransform(this.mc);
    this.renderCustomModel = (Render)new RenderChakraPlayer();
    this.curModel = 0;
    this.ySize = -1.0F;
  }
  
  @SubscribeEvent
  public void onRenderPlayerPre(RenderPlayerEvent.Pre pre) {
    EntityPlayer player = pre.entityPlayer;
    ExtendedPlayer props = ExtendedPlayer.get(player);
    if ((props.getTransformed() || props.getCurseSealTransformed() || props.getTransformed()) && !(pre.renderer instanceof RenderChakraPlayer)) {
      pre.setCanceled(true);
      if (this.curModel != props.getBijuuScale()) {
        this.curModel = props.getBijuuScale();
        if (this.curModel >= 3 && this.curModel != 15) {
          if (this.curModel == 3) {
            if (props.getBijuuKind() == 1)
              this.renderCustomModel = (Render)new RenderShukakuFPlayer(); 
            if (props.getBijuuKind() == 2)
              this.renderCustomModel = (Render)new RenderMatatabiFPlayer(); 
            if (props.getBijuuKind() == 3)
              this.renderCustomModel = (Render)new RenderIsobuFPlayer(); 
            if (props.getBijuuKind() == 4)
              this.renderCustomModel = (Render)new RenderGokuFPlayer(); 
            if (props.getBijuuKind() == 5)
              this.renderCustomModel = (Render)new RenderKokuoFPlayer(); 
            if (props.getBijuuKind() == 6)
              this.renderCustomModel = (Render)new RenderSaikenFPlayer(); 
            if (props.getBijuuKind() == 7)
              this.renderCustomModel = (Render)new RenderChomeiFPlayer(); 
            if (props.getBijuuKind() == 8)
              this.renderCustomModel = (Render)new RenderGyukiFPlayer(); 
            if (props.getBijuuKind() == 9)
              this.renderCustomModel = (Render)new RenderBijuu4TailsPlayer(); 
            if (props.getBijuuKind() == 10)
              this.renderCustomModel = (Render)new RenderJuubiFPlayer(); 
          } else if (this.curModel == 4) {
            if (props.getBijuuKind() == 1)
              this.renderCustomModel = (Render)new RenderShukakuSPlayer(); 
            if (props.getBijuuKind() == 2)
              this.renderCustomModel = (Render)new RenderMatatabiSPlayer(); 
            if (props.getBijuuKind() == 3)
              this.renderCustomModel = (Render)new RenderIsobuSPlayer(); 
            if (props.getBijuuKind() == 4)
              this.renderCustomModel = (Render)new RenderGokuSPlayer(); 
            if (props.getBijuuKind() == 5)
              this.renderCustomModel = (Render)new RenderKokuoSPlayer(); 
            if (props.getBijuuKind() == 6)
              this.renderCustomModel = (Render)new RenderSaikenSPlayer(); 
            if (props.getBijuuKind() == 7)
              this.renderCustomModel = (Render)new RenderChomeiSPlayer(); 
            if (props.getBijuuKind() == 8)
              this.renderCustomModel = (Render)new RenderGyukiSPlayer(); 
            if (props.getBijuuKind() == 9)
              this.renderCustomModel = (Render)new RenderBijuuPlayer(); 
            if (props.getBijuuKind() == 10)
              this.renderCustomModel = (Render)new RenderJuubiSPlayer(); 
          } else if (this.curModel == 5) {
            this.renderCustomModel = (Render)new RenderShukakuPlayer();
          } else if (this.curModel == 6) {
            this.renderCustomModel = (Render)new RenderMatatabiPlayer();
          } else if (this.curModel == 7) {
            this.renderCustomModel = (Render)new RenderIsobuPlayer();
          } else if (this.curModel == 8) {
            this.renderCustomModel = (Render)new RenderSonGokuPlayer();
          } else if (this.curModel == 9) {
            this.renderCustomModel = (Render)new RenderKokuoPlayer();
          } else if (this.curModel == 10) {
            this.renderCustomModel = (Render)new RenderSaikenPlayer();
          } else if (this.curModel == 11) {
            this.renderCustomModel = (Render)new RenderChomeiPlayer();
          } else if (this.curModel == 12) {
            this.renderCustomModel = (Render)new RenderGyukiPlayer();
          } else if (this.curModel == 13) {
            this.renderCustomModel = (Render)new RenderKuramaPlayer();
          } else if (this.curModel == 14) {
            this.renderCustomModel = (Render)new RenderJuubiPlayer();
          } else if (this.curModel == 15) {
            this.renderCustomModel = (Render)new RenderChakraPlayer();
          } 
        } else {
          this.renderCustomModel = (Render)new RenderChakraPlayer();
        } 
      } 
      if (player != this.mc.thePlayer) {
        double d0 = pre.entityPlayer.lastTickPosX + (pre.entityPlayer.posX - pre.entityPlayer.lastTickPosX) * pre.partialRenderTick;
        double d1 = pre.entityPlayer.lastTickPosY + (pre.entityPlayer.posY - pre.entityPlayer.lastTickPosY) * pre.partialRenderTick;
        double d2 = pre.entityPlayer.lastTickPosZ + (pre.entityPlayer.posZ - pre.entityPlayer.lastTickPosZ) * pre.partialRenderTick;
        double d3 = this.mc.thePlayer.lastTickPosX + (this.mc.thePlayer.posX - this.mc.thePlayer.lastTickPosX) * pre.partialRenderTick;
        double d4 = this.mc.thePlayer.lastTickPosY + (this.mc.thePlayer.posY - this.mc.thePlayer.lastTickPosY) * pre.partialRenderTick;
        double d5 = this.mc.thePlayer.lastTickPosZ + (this.mc.thePlayer.posZ - this.mc.thePlayer.lastTickPosZ) * pre.partialRenderTick;
        this.renderCustomModel.doRender(pre.entity, d0 - d3, d1 - d4, d2 - d5, 0.0F, pre.partialRenderTick);
      } else {
        this.renderCustomModel.doRender(pre.entity, 0.0D, 0.0D, 0.0D, 0.0F, pre.partialRenderTick);
      } 
    } 
  }
  
  @SubscribeEvent
  public void onRenderWerewolfPaw(RenderHandEvent event) {
    if (ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getTransformed() && ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getBijuuFormActive() && ExtendedPlayer.get((EntityPlayer)this.mc.thePlayer).getBijuuScale() != 15) {
      event.setCanceled(true);
      EntityClientPlayerMP entityClientPlayerMP = (Minecraft.getMinecraft()).thePlayer;
      EntityRenderer playerRender = (Minecraft.getMinecraft()).entityRenderer;
      GL11.glClear(256);
      float p_78476_1_ = event.partialTicks;
      int p_78476_2_ = event.renderPass;
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      float f1 = 0.07F;
      if (this.mc.gameSettings.anaglyph)
        GL11.glTranslatef(-(p_78476_2_ * 2 - 1) * f1, 0.0F, 0.0F); 
      float farPlaneDistance = (this.mc.gameSettings.renderDistanceChunks * 16);
      Project.gluPerspective(getFOVModifier(p_78476_1_, false), (this.mc.displayWidth / this.mc.displayHeight), 0.05F, farPlaneDistance * 2.0F);
      if (this.mc.playerController.enableEverythingIsScrewedUpMode()) {
        float f2 = 0.6666667F;
        GL11.glScalef(1.0F, f2, 1.0F);
      } 
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      if (this.mc.gameSettings.anaglyph)
        GL11.glTranslatef((p_78476_2_ * 2 - 1) * 0.1F, 0.0F, 0.0F); 
      GL11.glPushMatrix();
      if (this.mc.gameSettings.viewBobbing)
        setupViewBobbing(p_78476_1_); 
      if (this.mc.gameSettings.thirdPersonView == 0 && !this.mc.renderViewEntity.isPlayerSleeping() && !this.mc.gameSettings.hideGUI && !this.mc.playerController.enableEverythingIsScrewedUpMode()) {
        playerRender.enableLightmap(p_78476_1_);
        this.itemRendererWerewolf.updateEquippedItem();
        this.itemRendererWerewolf.renderItemInFirstPerson(p_78476_1_);
        playerRender.disableLightmap(p_78476_1_);
      } 
      GL11.glPopMatrix();
      if (this.mc.gameSettings.thirdPersonView == 0 && !this.mc.renderViewEntity.isPlayerSleeping())
        playerRender.itemRenderer.renderOverlays(p_78476_1_); 
      if (this.mc.gameSettings.viewBobbing)
        setupViewBobbing(p_78476_1_); 
    } 
  }
  
  @SubscribeEvent
  public void onRenderOverlay(RenderGameOverlayEvent event) {
    if (event.isCancelable() || event.type != RenderGameOverlayEvent.ElementType.EXPERIENCE || this.mc.thePlayer.isInsideOfMaterial(Material.water) || this.mc.thePlayer.capabilities.isCreativeMode);
  }
  
  @SubscribeEvent
  public void onRenderWorldLast(RenderWorldLastEvent event) {
    Tessellator tessellator = Tessellator.instance;
    boolean isLightingEnabled = GL11.glGetBoolean(2896);
    GL11.glDepthMask(false);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 1);
    GL11.glAlphaFunc(516, 0.003921569F);
    if (isLightingEnabled)
      GL11.glDisable(2896); 
    ByakuganTrack.dispatchQueuedRenders(tessellator);
    if (isLightingEnabled)
      GL11.glEnable(2896); 
    GL11.glAlphaFunc(516, 0.1F);
    GL11.glDisable(3042);
    GL11.glDepthMask(true);
  }
  
  private void setupViewBobbing(float p_78475_1_) {
    if (this.mc.renderViewEntity instanceof EntityPlayer) {
      EntityPlayer entityplayer = (EntityPlayer)this.mc.renderViewEntity;
      float f1 = entityplayer.distanceWalkedModified - entityplayer.prevDistanceWalkedModified;
      float f2 = -(entityplayer.distanceWalkedModified + f1 * p_78475_1_);
      float f3 = entityplayer.prevCameraYaw + (entityplayer.cameraYaw - entityplayer.prevCameraYaw) * p_78475_1_;
      float f4 = entityplayer.prevCameraPitch + (entityplayer.cameraPitch - entityplayer.prevCameraPitch) * p_78475_1_;
      GL11.glTranslatef(MathHelper.sin(f2 * 3.141593F) * f3 * 0.5F, -Math.abs(MathHelper.cos(f2 * 3.141593F) * f3), 0.0F);
      GL11.glRotatef(MathHelper.sin(f2 * 3.141593F) * f3 * 3.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(Math.abs(MathHelper.cos(f2 * 3.141593F - 0.2F) * f3) * 5.0F, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(f4, 1.0F, 0.0F, 0.0F);
    } 
  }
  
  @SubscribeEvent
  public void renderTick(TickEvent.RenderTickEvent event) {
    if (this.mc.theWorld != null) {
      EntityClientPlayerMP entityClientPlayerMP = this.mc.thePlayer;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityClientPlayerMP);
      if (props.getTransformed() && props.getBijuuScale() == 5) {
        if (this.rendererShukaku == null)
          this.rendererShukaku = new EntityRenderBijuu(this.mc, 8.0F); 
        if (this.mc.entityRenderer != this.rendererShukaku) {
          if (this.prevRenderer == null)
            this.prevRenderer = this.mc.entityRenderer; 
          this.mc.entityRenderer = this.rendererShukaku;
        } 
      } else if (props.getTransformed() && props.getBijuuScale() == 6) {
        if (this.rendererMatatabi == null)
          this.rendererMatatabi = new EntityRenderBijuu(this.mc, 4.0F); 
        if (this.mc.entityRenderer != this.rendererMatatabi) {
          if (this.prevRenderer == null)
            this.prevRenderer = this.mc.entityRenderer; 
          this.mc.entityRenderer = this.rendererMatatabi;
        } 
      } else if (props.getTransformed() && props.getBijuuScale() == 7) {
        if (this.rendererIsobu == null)
          this.rendererIsobu = new EntityRenderBijuu(this.mc, 2.5F); 
        if (this.mc.entityRenderer != this.rendererIsobu) {
          if (this.prevRenderer == null)
            this.prevRenderer = this.mc.entityRenderer; 
          this.mc.entityRenderer = this.rendererIsobu;
        } 
      } else if (props.getTransformed() && props.getBijuuScale() == 8) {
        if (this.rendererSonGoku == null)
          this.rendererSonGoku = new EntityRenderBijuu(this.mc, 7.5F); 
        if (this.mc.entityRenderer != this.rendererSonGoku) {
          if (this.prevRenderer == null)
            this.prevRenderer = this.mc.entityRenderer; 
          this.mc.entityRenderer = this.rendererSonGoku;
        } 
      } else if (props.getTransformed() && props.getBijuuScale() == 9) {
        if (this.rendererKokuo == null)
          this.rendererKokuo = new EntityRenderBijuu(this.mc, 4.5F); 
        if (this.mc.entityRenderer != this.rendererKokuo) {
          if (this.prevRenderer == null)
            this.prevRenderer = this.mc.entityRenderer; 
          this.mc.entityRenderer = this.rendererKokuo;
        } 
      } else if (props.getTransformed() && props.getBijuuScale() == 10) {
        if (this.rendererSaiken == null)
          this.rendererSaiken = new EntityRenderBijuu(this.mc, 6.0F); 
        if (this.mc.entityRenderer != this.rendererSaiken) {
          if (this.prevRenderer == null)
            this.prevRenderer = this.mc.entityRenderer; 
          this.mc.entityRenderer = this.rendererSaiken;
        } 
      } else if (props.getTransformed() && props.getBijuuScale() == 11) {
        if (this.rendererChomei == null)
          this.rendererChomei = new EntityRenderBijuu(this.mc, 10.0F); 
        if (this.mc.entityRenderer != this.rendererChomei) {
          if (this.prevRenderer == null)
            this.prevRenderer = this.mc.entityRenderer; 
          this.mc.entityRenderer = this.rendererChomei;
        } 
      } else if (props.getTransformed() && props.getBijuuScale() == 12) {
        if (this.rendererGyuki == null)
          this.rendererGyuki = new EntityRenderBijuu(this.mc, 7.0F); 
        if (this.mc.entityRenderer != this.rendererGyuki) {
          if (this.prevRenderer == null)
            this.prevRenderer = this.mc.entityRenderer; 
          this.mc.entityRenderer = this.rendererGyuki;
        } 
      } else if (props.getTransformed() && props.getBijuuScale() == 13) {
        if (this.rendererKurama == null)
          this.rendererKurama = new EntityRenderBijuu(this.mc, 4.0F); 
        if (this.mc.entityRenderer != this.rendererKurama) {
          if (this.prevRenderer == null)
            this.prevRenderer = this.mc.entityRenderer; 
          this.mc.entityRenderer = this.rendererKurama;
        } 
      } else if (props.getTransformed() && props.getBijuuScale() == 14) {
        if (this.rendererJuubi == null)
          this.rendererJuubi = new EntityRenderBijuu(this.mc, 14.0F); 
        if (this.mc.entityRenderer != this.rendererJuubi) {
          if (this.prevRenderer == null)
            this.prevRenderer = this.mc.entityRenderer; 
          this.mc.entityRenderer = this.rendererJuubi;
        } 
      } else if (props.getTransformed() && props.getBijuuScale() == 3) {
        if (this.rendererDire == null)
          if (props.getBijuuKind() == 10) {
            this.rendererDire = new EntityRenderBijuu(this.mc, 2.4F);
          } else {
            this.rendererDire = new EntityRenderBijuu(this.mc, -0.8F);
          }  
        if (this.mc.entityRenderer != this.rendererDire) {
          if (this.prevRenderer == null)
            this.prevRenderer = this.mc.entityRenderer; 
          this.mc.entityRenderer = this.rendererDire;
        } 
      } else if (props.getTransformed() && props.getBijuuScale() == 4) {
        if (this.rendererDire == null)
          if (props.getBijuuKind() == 10) {
            this.rendererDire = new EntityRenderBijuu(this.mc, 2.4F);
          } else {
            this.rendererDire = new EntityRenderBijuu(this.mc, -0.4F);
          }  
        if (this.mc.entityRenderer != this.rendererDire) {
          if (this.prevRenderer == null)
            this.prevRenderer = this.mc.entityRenderer; 
          this.mc.entityRenderer = this.rendererDire;
        } 
      } else if (props.getTransformed() && props.getSusanoActive() >= 5) {
        if (this.rendererBeast == null)
          this.rendererBeast = new EntityRenderBijuu(this.mc, 10.0F); 
        if (this.mc.entityRenderer != this.rendererBeast) {
          if (this.prevRenderer == null)
            this.prevRenderer = this.mc.entityRenderer; 
          this.mc.entityRenderer = this.rendererBeast;
        } 
      } else if (this.prevRenderer != null && this.mc.entityRenderer != this.prevRenderer) {
        this.mc.entityRenderer = this.prevRenderer;
      } 
    } 
  }
  
  private float getFOVModifier(float p_78481_1_, boolean p_78481_2_) {
    EntityLivingBase entityplayer = this.mc.renderViewEntity;
    float f1 = 70.0F;
    if (entityplayer.getHealth() <= 0.0F) {
      float f2 = entityplayer.deathTime + p_78481_1_;
      f1 /= (1.0F - 500.0F / (f2 + 500.0F)) * 2.0F + 1.0F;
    } 
    Block block = ActiveRenderInfo.getBlockAtEntityViewpoint((World)this.mc.theWorld, entityplayer, p_78481_1_);
    if (block.getMaterial() == Material.water)
      f1 = f1 * 60.0F / 70.0F; 
    return f1;
  }
}

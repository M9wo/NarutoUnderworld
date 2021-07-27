package lc208.nam.hooks;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lc208.nam.hooklib.asm.Hook;
import lc208.nam.hooklib.asm.ReturnCondition;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import org.lwjgl.opengl.GL11;

public class HooksEnch {
  @SideOnly(Side.CLIENT)
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static boolean hasEffect(ItemStack is) {
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static boolean hasEffect(ItemStack is, int pass) {
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static boolean hasEffect(Item item, ItemStack p_77636_1_) {
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static boolean hasEffect(Item item, ItemStack par1ItemStack, int pass) {
    return false;
  }
  
  private static final ResourceLocation RES_ITEM_GLINT = new ResourceLocation("textures/misc/enchanted_item_glint.png");
  
  private static RenderBlocks renderBlocksIr = new RenderBlocks();
  
  @SideOnly(Side.CLIENT)
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static void renderItem(ItemRenderer renderer, EntityLivingBase p_78443_1_, ItemStack p_78443_2_, int p_78443_3_, IItemRenderer.ItemRenderType type) {
    GL11.glPushMatrix();
    TextureManager texturemanager = Minecraft.getMinecraft().getTextureManager();
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
      ForgeHooksClient.renderEquippedItem(type, customRenderer, renderBlocksIr, p_78443_1_, p_78443_2_);
    } else if (p_78443_2_.getItemSpriteNumber() == 0 && item instanceof net.minecraft.item.ItemBlock && RenderBlocks.renderItemIn3d(block.getRenderType())) {
      texturemanager.bindTexture(texturemanager.getResourceLocation(0));
      if (p_78443_2_ != null && block != null && block.getRenderBlockPass() != 0) {
        GL11.glDepthMask(false);
        renderBlocksIr.renderBlockAsItem(block, p_78443_2_.getItemDamage(), 1.0F);
        GL11.glDepthMask(true);
      } else {
        renderBlocksIr.renderBlockAsItem(block, p_78443_2_.getItemDamage(), 1.0F);
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
      ItemRenderer.renderItemIn2D(tessellator, f1, f2, f, f3, iicon.getIconWidth(), iicon.getIconHeight(), 0.0625F);
      GL11.glDisable(32826);
      texturemanager.bindTexture(texturemanager.getResourceLocation(p_78443_2_.getItemSpriteNumber()));
      TextureUtil.func_147945_b();
    } 
    if (p_78443_2_ != null && block != null && block.getRenderBlockPass() != 0)
      GL11.glDisable(3042); 
    GL11.glPopMatrix();
  }
  
  @SideOnly(Side.CLIENT)
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static void renderItem(ItemRenderer renderer, EntityLivingBase p_78443_1_, ItemStack p_78443_2_, int p_78443_3_) {
    renderItem(renderer, p_78443_1_, p_78443_2_, p_78443_3_, IItemRenderer.ItemRenderType.EQUIPPED);
  }
  
  @SideOnly(Side.CLIENT)
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static int shouldRenderPass(RenderPlayer rp, AbstractClientPlayer p_77032_1_, int p_77032_2_, float p_77032_3_) {
    ItemStack itemstack = p_77032_1_.inventory.armorItemInSlot(3 - p_77032_2_);
    RenderPlayerEvent.SetArmorModel event = new RenderPlayerEvent.SetArmorModel((EntityPlayer)p_77032_1_, rp, 3 - p_77032_2_, p_77032_3_, itemstack);
    MinecraftForge.EVENT_BUS.post((Event)event);
    if (event.result != -1)
      return event.result; 
    if (itemstack != null) {
      Item item = itemstack.getItem();
      if (item instanceof ItemArmor) {
        ItemArmor itemarmor = (ItemArmor)item;
        rp.bindTexture(RenderBiped.getArmorResource((Entity)p_77032_1_, itemstack, p_77032_2_, (String)null));
        ModelBiped modelbiped = (p_77032_2_ == 2) ? rp.modelArmor : rp.modelArmorChestplate;
        modelbiped.bipedHead.showModel = (p_77032_2_ == 0);
        modelbiped.bipedHeadwear.showModel = (p_77032_2_ == 0);
        modelbiped.bipedBody.showModel = (p_77032_2_ == 1 || p_77032_2_ == 2);
        modelbiped.bipedRightArm.showModel = (p_77032_2_ == 1);
        modelbiped.bipedLeftArm.showModel = (p_77032_2_ == 1);
        modelbiped.bipedRightLeg.showModel = (p_77032_2_ == 2 || p_77032_2_ == 3);
        modelbiped.bipedLeftLeg.showModel = (p_77032_2_ == 2 || p_77032_2_ == 3);
        modelbiped = ForgeHooksClient.getArmorModel((EntityLivingBase)p_77032_1_, itemstack, p_77032_2_, modelbiped);
        rp.setRenderPassModel((ModelBase)modelbiped);
        modelbiped.onGround = rp.modelBipedMain.onGround;
        modelbiped.isRiding = rp.modelBipedMain.isRiding;
        modelbiped.isChild = rp.modelBipedMain.isChild;
        int j = itemarmor.getColor(itemstack);
        if (j != -1) {
          float f1 = (j >> 16 & 0xFF) / 255.0F;
          float f2 = (j >> 8 & 0xFF) / 255.0F;
          float f3 = (j & 0xFF) / 255.0F;
          GL11.glColor3f(f1, f2, f3);
          return 16;
        } 
        GL11.glColor3f(1.0F, 1.0F, 1.0F);
        return 1;
      } 
    } 
    return -1;
  }
  
  @SideOnly(Side.CLIENT)
  @Hook(returnCondition = ReturnCondition.ALWAYS)
  public static int shouldRenderPass(RenderBiped rb, EntityLiving p_77032_1_, int p_77032_2_, float p_77032_3_) {
    ItemStack itemstack = p_77032_1_.func_130225_q(3 - p_77032_2_);
    if (itemstack != null) {
      Item item = itemstack.getItem();
      if (item instanceof ItemArmor) {
        ItemArmor itemarmor = (ItemArmor)item;
        rb.bindTexture(RenderBiped.getArmorResource((Entity)p_77032_1_, itemstack, p_77032_2_, null));
        ModelBiped modelbiped = (p_77032_2_ == 2) ? rb.field_82425_h : rb.field_82423_g;
        modelbiped.bipedHead.showModel = (p_77032_2_ == 0);
        modelbiped.bipedHeadwear.showModel = (p_77032_2_ == 0);
        modelbiped.bipedBody.showModel = (p_77032_2_ == 1 || p_77032_2_ == 2);
        modelbiped.bipedRightArm.showModel = (p_77032_2_ == 1);
        modelbiped.bipedLeftArm.showModel = (p_77032_2_ == 1);
        modelbiped.bipedRightLeg.showModel = (p_77032_2_ == 2 || p_77032_2_ == 3);
        modelbiped.bipedLeftLeg.showModel = (p_77032_2_ == 2 || p_77032_2_ == 3);
        modelbiped = ForgeHooksClient.getArmorModel((EntityLivingBase)p_77032_1_, itemstack, p_77032_2_, modelbiped);
        rb.setRenderPassModel((ModelBase)modelbiped);
        modelbiped.onGround = rb.modelBipedMain.onGround;
        modelbiped.isRiding = rb.modelBipedMain.isRiding;
        modelbiped.isChild = rb.modelBipedMain.isChild;
        int j = itemarmor.getColor(itemstack);
        if (j != -1) {
          float f1 = (j >> 16 & 0xFF) / 255.0F;
          float f2 = (j >> 8 & 0xFF) / 255.0F;
          float f3 = (j & 0xFF) / 255.0F;
          GL11.glColor3f(f1, f2, f3);
          return 16;
        } 
        GL11.glColor3f(1.0F, 1.0F, 1.0F);
        return 1;
      } 
    } 
    return -1;
  }
}

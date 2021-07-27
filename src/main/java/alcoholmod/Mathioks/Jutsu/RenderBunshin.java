package alcoholmod.Mathioks.Jutsu;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderBunshin extends RenderBiped {
  private static final ResourceLocation Player_Texture = new ResourceLocation("tm:textures/entity/steve.png");
  
  public RenderBunshin(ModelBiped p_i1262_1_, float p_i1262_2_) {
    super(p_i1262_1_, p_i1262_2_);
  }
  
  public RenderBunshin(ModelBunshin model, float size) {
    super(model, size);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    EntityBunshin clone = (EntityBunshin)entity;
    if (clone != null) {
      ResourceLocation resourcelocation = AbstractClientPlayer.locationStevePng;
      if (clone.hasCustomNameTag()) {
        resourcelocation = AbstractClientPlayer.getLocationSkin(clone.getCustomNameTag());
        AbstractClientPlayer.getDownloadImageSkin(resourcelocation, clone.getCustomNameTag());
      } else {
        resourcelocation = Player_Texture;
      } 
      (Minecraft.getMinecraft()).renderEngine.bindTexture(resourcelocation);
      return resourcelocation;
    } 
    return Player_Texture;
  }
  
  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
    GL11.glScalef(0.94F, 0.94F, 0.94F);
  }
}

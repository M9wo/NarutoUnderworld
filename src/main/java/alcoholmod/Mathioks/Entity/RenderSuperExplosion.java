package alcoholmod.Mathioks.Entity;

import alcoholmod.Mathioks.Final.SuperExplosionEntity;
import alcoholmod.Mathioks.Jutsu.ModelBunshin;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderSuperExplosion extends RenderBiped {
  private static final ResourceLocation Player_Texture = new ResourceLocation("mtm", "textures/entity/steve.png");
  
  Minecraft mc = Minecraft.getMinecraft();
  
  public RenderSuperExplosion(ModelBiped p_i1262_1_, float p_i1262_2_) {
    super(p_i1262_1_, p_i1262_2_);
  }
  
  public RenderSuperExplosion(ModelBunshin model, float size) {
    super((ModelBiped)model, size);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    SuperExplosionEntity clone = (SuperExplosionEntity)entity;
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
}

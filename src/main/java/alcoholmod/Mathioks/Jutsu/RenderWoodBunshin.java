package alcoholmod.Mathioks.Jutsu;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderWoodBunshin extends RenderLiving {
  private static final ResourceLocation Player_Texture = new ResourceLocation("tm:textures/entity/steve.png");
  
  Minecraft mc = Minecraft.getMinecraft();
  
  public RenderWoodBunshin(ModelBase p_i1262_1_, float p_i1262_2_) {
    super(p_i1262_1_, p_i1262_2_);
  }
  
  public RenderWoodBunshin(ModelWoodBunshin model, float size) {
    super(model, size);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    EntityWoodBunshin clone = (EntityWoodBunshin)entity;
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
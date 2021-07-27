package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.FinalBijuu.ModelMatatabiMob;
import alcoholmod.Mathioks.FinalBijuu.ModelShukakuMob;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderTailTest extends RenderPlayer {
  public boolean CanTransform = false;
  
  private static final ResourceLocation Kasenpie_texture = new ResourceLocation("tm", "textures/entity/Matatabi.png");
  
  private static final ResourceLocation Kasenpie_texture2 = new ResourceLocation("tm", "textures/entity/Shukaku.png");
  
  public RenderTailTest() {
    if (this.CanTransform) {
      this.mainModel = (ModelBase)new ModelMatatabiMob();
      this.modelBipedMain = (ModelBiped)this.mainModel;
      this.renderManager = RenderManager.instance;
    } else if (!this.CanTransform) {
      this.mainModel = (ModelBase)new ModelShukakuMob();
      this.modelBipedMain = (ModelBiped)this.mainModel;
      this.modelArmorChestplate = (ModelBiped)new ModelShukakuMob();
      this.modelArmor = (ModelBiped)new ModelShukakuMob();
      this.renderManager = RenderManager.instance;
    } 
  }
  
  protected ResourceLocation getEntityTexture(Entity par1Entity) {
    if (this.CanTransform)
      return Kasenpie_texture; 
    return !this.CanTransform ? Kasenpie_texture2 : null;
  }
}

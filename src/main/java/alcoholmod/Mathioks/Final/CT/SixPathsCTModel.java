package alcoholmod.Mathioks.Final.CT;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

@SideOnly(Side.CLIENT)
public class SixPathsCTModel extends ModelBase {
  public ModelRenderer core;
  
  public SixPathsCTModel() {
    this(0.0F);
  }
  
  public SixPathsCTModel(float par1) {
    this(par1, 0.0F, 64, 32);
  }
  
  public SixPathsCTModel(float par1, float par2, int par3, int par4) {
    this.textureWidth = par3;
    this.textureHeight = par4;
    this.core = new ModelRenderer(this, 0, 0);
    this.core.addBox(-2.0F, -2.0F, -2.0F, 4, 4, 4, par1);
    this.core.setRotationPoint(0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    this.core.render(par7);
  }
}

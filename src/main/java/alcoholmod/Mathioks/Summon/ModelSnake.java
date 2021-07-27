package alcoholmod.Mathioks.Summon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

public class ModelSnake extends ModelBase {
  ModelRenderer body;
  
  ModelRenderer body2;
  
  ModelRenderer body3;
  
  ModelRenderer neck;
  
  ModelRenderer head;
  
  ModelRenderer tongue;
  
  public ModelSnake() {
    this.textureWidth = 64;
    this.textureHeight = 32;
    this.body = new ModelRenderer(this, 0, 0);
    this.body.addBox(-1.5F, -1.5F, -4.5F, 3, 3, 9);
    this.body.setRotationPoint(0.0F, 22.5F, -5.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.body2 = new ModelRenderer(this, 24, 0);
    this.body2.addBox(-1.5F, -1.5F, -4.5F, 3, 3, 9);
    this.body2.setRotationPoint(0.0F, 22.5F, 3.0F);
    this.body2.setTextureSize(64, 32);
    this.body2.mirror = true;
    setRotation(this.body2, 0.0F, 0.0F, 0.0F);
    this.body3 = new ModelRenderer(this, 0, 12);
    this.body3.addBox(-1.5F, -1.5F, -4.5F, 3, 3, 9);
    this.body3.setRotationPoint(0.0F, 22.5F, 11.0F);
    this.body3.setTextureSize(64, 32);
    this.body3.mirror = true;
    setRotation(this.body3, 0.0F, 0.0F, 0.0F);
    this.neck = new ModelRenderer(this, 24, 12);
    this.neck.addBox(-1.5F, 0.0F, -8.5F, 3, 3, 5);
    this.neck.setRotationPoint(0.0F, 22.5F, -5.0F);
    this.neck.setTextureSize(64, 32);
    this.neck.mirror = true;
    setRotation(this.neck, -0.3665191F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 40, 12);
    this.head.addBox(-2.0F, -3.0F, -12.5F, 4, 3, 5);
    this.head.setRotationPoint(0.0F, 22.4F, -5.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.tongue = new ModelRenderer(this, 0, 24);
    this.tongue.addBox(-1.5F, -1.0F, -15.5F, 3, 0, 4);
    this.tongue.setRotationPoint(0.0F, 22.4F, -5.0F);
    this.tongue.setTextureSize(64, 32);
    this.tongue.mirror = true;
    setRotation(this.tongue, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
    super.render(par1Entity, par2, par3, par4, par5, par6, par7);
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    this.body.render(par7);
    this.body2.render(par7);
    this.body3.render(par7);
    this.neck.render(par7);
    this.head.render(par7);
    this.tongue.render(par7);
  }
  
  public void setLivingAnimations(EntityLivingBase par1EntityLivingBase, float par2, float par3, float par4) {
    EntitySnake par1EntityBoa = (EntitySnake)par1EntityLivingBase;
    if (par1EntityBoa.isRiding()) {
      this.body.setRotationPoint(3.0F, 41.0F, -3.0F);
      setRotation(this.body, 0.0F, 1.151917F, 0.0F);
      this.body2.setRotationPoint(4.0F, 41.0F, 3.0F);
      setRotation(this.body2, 0.0F, -0.5235987F, 0.0F);
      this.body3.setRotationPoint(-2.0F, 41.0F, 6.0F);
      setRotation(this.body3, 0.0F, -1.919862F, 0.0F);
      this.neck.setRotationPoint(3.0F, 41.0F, -5.0F);
      setRotation(this.neck, -0.3665191F, 1.832596F, 0.0F);
      this.head.setRotationPoint(2.0F, 40.9F, -7.0F);
      setRotation(this.head, 0.0F, 2.094395F, 0.0F);
      this.tongue.setRotationPoint(2.0F, 40.9F, -7.0F);
      setRotation(this.tongue, 0.0F, 2.094395F, 0.0F);
    } else {
      this.body.setRotationPoint(0.0F, 22.5F, -5.0F);
      setRotation(this.body, 0.0F, 0.0F, 0.0F);
      this.body2.setRotationPoint(0.0F, 22.5F, 3.0F);
      setRotation(this.body2, 0.0F, 0.0F, 0.0F);
      this.body3.setRotationPoint(0.0F, 22.5F, 11.0F);
      setRotation(this.body3, 0.0F, 0.0F, 0.0F);
      this.neck.setRotationPoint(0.0F, 22.5F, -5.0F);
      setRotation(this.neck, -0.3665191F, 0.0F, 0.0F);
      this.head.setRotationPoint(0.0F, 22.4F, -5.0F);
      setRotation(this.head, 0.0F, 0.0F, 0.0F);
      this.tongue.setRotationPoint(0.0F, 22.4F, -5.0F);
      setRotation(this.tongue, 0.0F, 0.0F, 0.0F);
    } 
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
    EntitySnake par1EntityBoa = (EntitySnake)par7Entity;
    if (par1EntityBoa.isRiding()) {
      this.tongue.rotateAngleX = 0.03F * MathHelper.sin(par3 * 10.0F + 1.0F) + 0.03F;
    } else {
      this.tongue.rotateAngleX = 0.03F * MathHelper.sin(par3 * 10.0F + 1.0F) + 0.03F;
      this.head.rotateAngleY = MathHelper.cos(par1 * 0.6F) * 0.4F * par2;
      this.tongue.rotateAngleY = MathHelper.cos(par1 * 0.6F) * 0.4F * par2;
      this.neck.rotateAngleY = MathHelper.cos(par1 * 0.6F) * 0.4F * par2;
      this.body.rotateAngleY = MathHelper.cos(par1 * 0.6F) * 0.7F * par2;
      this.body2.rotateAngleY = MathHelper.cos(par1 * 0.6F) * -0.7F * par2;
      this.body3.rotateAngleY = MathHelper.cos(par1 * 0.6F) * 0.7F * par2;
    } 
  }
}

package alcoholmod.Mathioks.item;

import alcoholmod.Mathioks.Final.KamuiTeleUtil;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.world.World;

public class FlyingThunderKunaiEntity extends EntityArrow {
  private int field_145791_d = -1;
  
  private int field_145792_e = -1;
  
  private int field_145789_f = -1;
  
  private Block field_145790_g;
  
  private int inData;
  
  private boolean inGround;
  
  public int canBePickedUp;
  
  public int arrowShake;
  
  public Entity shootingEntity;
  
  private int ticksInGround;
  
  private int ticksInAir;
  
  private double damage = 2.0D;
  
  private KamuiTeleUtil KamuiTeleUtil;
  
  private int knockbackStrength;
  
  private static final String __OBFID = "CL_00001715";
  
  public FlyingThunderKunaiEntity(World par1World) {
    super(par1World);
  }
  
  public FlyingThunderKunaiEntity(World par1World, double par2, double par4, double par6) {
    super(par1World, par2, par4, par6);
  }
  
  public FlyingThunderKunaiEntity(World par1World, EntityLivingBase par2EntityLiving, EntityLiving par3EntityLiving, float par4, float par5) {
    super(par1World, par2EntityLiving, (EntityLivingBase)par3EntityLiving, par4, par5);
  }
  
  public FlyingThunderKunaiEntity(World par1World, EntityLivingBase par2EntityLiving, float par3) {
    super(par1World, par2EntityLiving, par3);
  }
  
  public void setDamage(double p_70239_1_) {
    this.damage = p_70239_1_;
  }
  
  public void onCollideWithPlayer(EntityPlayer par1EntityPlayer) {
    if (!this.worldObj.isRemote);
  }
}

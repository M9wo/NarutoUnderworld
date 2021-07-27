package alcoholmod.Mathioks.UltimatePowers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

public abstract class SageModeEntityJutsu extends Entity {
  public EntityPlayer jutsusha;
  
  public int time;
  
  public int counter;
  
  public int counter1;
  
  public SageModeEntityJutsu(World par1World) {
    super(par1World);
    this.counter = 0;
    this.counter1 = 0;
  }
  
  public SageModeEntityJutsu(World world, EntityPlayer entity) {
    this(world);
    this.jutsusha = entity;
  }
  
  protected void entityInit() {}
  
  protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {}
  
  protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {}
  
  public boolean canBeCollidedWith() {
    return false;
  }
  
  public void onUpdate() {
    super.onUpdate();
    if (Keyboard.isKeyDown(24) && !this.worldObj.isRemote)
      setDead(); 
    if (!this.worldObj.isRemote)
      if (this.jutsusha == null) {
        setDead();
      } else if (this.time >= 9600) {
        this.time = 0;
        setDead();
      } else {
        this.time++;
        this.posX = this.jutsusha.posX;
        this.posY = this.jutsusha.posY;
        this.posZ = this.jutsusha.posZ;
        this.jutsusha.addPotionEffect(new PotionEffect(Potion.regeneration.id, 80, 4));
        this.jutsusha.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 80, 1));
        this.jutsusha.addPotionEffect(new PotionEffect(Potion.jump.id, 80, 1));
        this.jutsusha.addPotionEffect(new PotionEffect(Potion.resistance.id, 80, 2));
      }  
  }
  
  public boolean useExpLevel(int level) {
    if (!this.worldObj.isRemote && this.jutsusha instanceof EntityPlayer) {
      if (this.jutsusha.capabilities.isCreativeMode)
        return true; 
      if (this.jutsusha.experienceLevel >= level) {
        this.jutsusha.addExperienceLevel(-level);
        return true;
      } 
    } 
    return false;
  }
}

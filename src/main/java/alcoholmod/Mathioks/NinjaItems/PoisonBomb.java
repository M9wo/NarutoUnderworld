package alcoholmod.Mathioks.NinjaItems;

import alcoholmod.Mathioks.Entity.EntityPoisonBomb;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PoisonBomb extends Item {
  private static final String __OBFID = "CL_00000069";
  
  public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
    if (!p_77659_3_.capabilities.isCreativeMode)
      p_77659_1_.stackSize--; 
    p_77659_2_.playSoundAtEntity((Entity)p_77659_3_, "creeper.primed", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
    if (!p_77659_2_.isRemote) {
      p_77659_2_.spawnEntityInWorld((Entity)new EntityPoisonBomb(p_77659_2_, (EntityLivingBase)p_77659_3_));
      p_77659_2_.spawnEntityInWorld((Entity)new EntityPoisonBomb(p_77659_2_, (EntityLivingBase)p_77659_3_));
      p_77659_2_.spawnEntityInWorld((Entity)new EntityPoisonBomb(p_77659_2_, (EntityLivingBase)p_77659_3_));
    } 
    return p_77659_1_;
  }
}

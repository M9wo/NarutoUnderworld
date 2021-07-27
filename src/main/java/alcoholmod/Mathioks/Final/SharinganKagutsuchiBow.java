package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Final.CT.SharinganKagutsuchiArrowEntity;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class SharinganKagutsuchiBow extends JutsuItem {
  @SideOnly(Side.CLIENT)
  private static final String __OBFID = "CL_00001777";
  
  public SharinganKagutsuchiBow() {
    this.maxStackSize = 1;
    setMaxDamage(0);
  }
  
  public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_) {
    return p_77654_1_;
  }
  
  public int getMaxItemUseDuration(ItemStack p_77626_1_) {
    return 72000;
  }
  
  public EnumAction getItemUseAction(ItemStack p_77661_1_) {
    return EnumAction.bow;
  }
  
  public void onPlayerStoppedUsing(ItemStack p_77615_1_, World p_77615_2_, EntityPlayer p_77615_3_, int p_77615_4_) {
    int j = getMaxItemUseDuration(p_77615_1_) - p_77615_4_;
    ArrowLooseEvent event = new ArrowLooseEvent(p_77615_3_, p_77615_1_, j);
    MinecraftForge.EVENT_BUS.post((Event)event);
    if (!event.isCanceled()) {
      j = event.charge;
      float f = j / 10.0F;
      f = (f * f + f * 2.0F) / 3.0F;
      if (f >= 0.1D) {
        if (f > 1.0F)
          f = 1.0F; 
        SharinganKagutsuchiArrowEntity entityarrow = new SharinganKagutsuchiArrowEntity(p_77615_2_, (EntityLivingBase)p_77615_3_);
        p_77615_1_.damageItem(1, (EntityLivingBase)p_77615_3_);
        p_77615_2_.playSoundAtEntity((Entity)p_77615_3_, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);
        if (!p_77615_2_.isRemote)
          p_77615_2_.spawnEntityInWorld((Entity)entityarrow); 
      } 
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
    ArrowNockEvent event = new ArrowNockEvent(p_77659_3_, p_77659_1_);
    MinecraftForge.EVENT_BUS.post((Event)event);
    if (event.isCanceled())
      return event.result; 
    p_77659_3_.setItemInUse(p_77659_1_, getMaxItemUseDuration(p_77659_1_));
    return p_77659_1_;
  }
}

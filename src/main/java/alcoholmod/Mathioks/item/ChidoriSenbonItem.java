package alcoholmod.Mathioks.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ChidoriSenbonItem extends ItemSword {
  public ChidoriSenbonItem() {
    super(Item.ToolMaterial.IRON);
    this.maxStackSize = 64;
    setMaxDamage(-1);
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    if (!par3EntityPlayer.capabilities.isCreativeMode)
      par1ItemStack.stackSize--; 
    par2World.playSoundAtEntity((Entity)par3EntityPlayer, "random.bow", 0.5F, 0.4F / (Item.itemRand.nextFloat() * 0.4F + 0.8F));
    ChidoriSenbonEntity chidoriSenbonEntity = new ChidoriSenbonEntity(par2World, (EntityLivingBase)par3EntityPlayer, 2.0F);
    if (!par2World.isRemote)
      par2World.spawnEntityInWorld((Entity)chidoriSenbonEntity); 
    return par1ItemStack;
  }
  
  public EnumAction getItemUseAction(ItemStack par1ItemStack) {
    return EnumAction.block;
  }
}

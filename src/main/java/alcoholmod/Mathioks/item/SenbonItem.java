package alcoholmod.Mathioks.item;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class SenbonItem extends ItemSword {
  public SenbonItem() {
    super(Item.ToolMaterial.WOOD);
    this.maxStackSize = 64;
    setMaxDamage(-1);
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    ExtendedPlayer props = ExtendedPlayer.get(par3EntityPlayer);
    if (props.getShurikenjutsu() >= 5.0D) {
      if (!par3EntityPlayer.capabilities.isCreativeMode)
        par1ItemStack.stackSize--; 
      par2World.playSoundAtEntity((Entity)par3EntityPlayer, "random.bow", 0.5F, 0.4F / (Item.itemRand.nextFloat() * 0.4F + 0.8F));
      SenbonEntity senbonEntity = new SenbonEntity(par2World, (EntityLivingBase)par3EntityPlayer, 2.0F);
      if (!par2World.isRemote)
        par2World.spawnEntityInWorld((Entity)senbonEntity); 
    } 
    return par1ItemStack;
  }
  
  public EnumAction getItemUseAction(ItemStack par1ItemStack) {
    return EnumAction.block;
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    return true;
  }
  
  public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.DARK_AQUA + "Senbon, a weapon that utilizes Shurikenjutsu");
    par3List.add(EnumChatFormatting.DARK_AQUA + "It cannot be used for melee combat");
    par3List.add(EnumChatFormatting.GOLD + "Shurikenjutsu: 5");
  }
}

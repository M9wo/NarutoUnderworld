package alcoholmod.Mathioks.Weapons;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;

public class KatanaDiamondItem extends ItemSword {
  public KatanaDiamondItem(Item.ToolMaterial mat) {
    super(mat);
    setFull3D();
    setUnlocalizedName("katanaDiamondi");
    setCreativeTab(AlcoholMod.tabTools);
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconReg) {
    this.itemIcon = iconReg.registerIcon("tm:" + getUnlocalizedName().substring(getUnlocalizedName().indexOf(".") + 1));
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
    return true;
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    ExtendedPlayer props = ExtendedPlayer.get(player);
    boolean canAttack = false;
    if (props.getKenjutsu() < 3.5D)
      canAttack = true; 
    if (props.getKenjutsu() >= 3.5D)
      canAttack = false; 
    return canAttack;
  }
  
  public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
    if (entityLiving instanceof EntityPlayer) {
      boolean canSwing = false;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityLiving);
      if (props.getKenjutsu() < 3.5D)
        canSwing = true; 
      if (props.getKenjutsu() >= 3.5D)
        canSwing = false; 
      return canSwing;
    } 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.DARK_AQUA + "A Katana often used by Medium");
    par3List.add(EnumChatFormatting.DARK_AQUA + "level Kenjutsu practitioners");
    par3List.add(EnumChatFormatting.GOLD + "Kenjutsu: 125");
  }
}

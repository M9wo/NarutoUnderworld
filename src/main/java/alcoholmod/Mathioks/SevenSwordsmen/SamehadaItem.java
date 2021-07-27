package alcoholmod.Mathioks.SevenSwordsmen;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.ExtraFunctions.IExtendedReach;
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

public class SamehadaItem extends ItemSword implements IExtendedReach {
  public SamehadaItem(Item.ToolMaterial mat) {
    super(mat);
    setFull3D();
    setUnlocalizedName("SamehadaIcon");
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
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    ExtendedPlayer props = ExtendedPlayer.get(player);
    boolean canAttack = false;
    if (props.getKenjutsu() < 5.0D)
      canAttack = true; 
    if (props.getKenjutsu() >= 5.0D)
      canAttack = false; 
    return canAttack;
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
    if (par3EntityLivingBase instanceof EntityPlayer) {
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)par3EntityLivingBase);
      if (par2EntityLivingBase instanceof EntityPlayer) {
        ExtendedPlayer propsSource = ExtendedPlayer.get((EntityPlayer)par2EntityLivingBase);
        propsSource.setCurrentMana(propsSource.getCurrentMana() - 25);
        props.setCurrentMana(props.getCurrentMana() + 10);
      } else {
        props.setCurrentMana(props.getCurrentMana() + 10);
      } 
    } 
    return false;
  }
  
  public float getReach() {
    return 20.0F;
  }
  
  public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
    if (entityLiving instanceof EntityPlayer) {
      boolean canSwing = false;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityLiving);
      if (props.getKenjutsu() < 5.0D)
        canSwing = true; 
      if (props.getKenjutsu() >= 5.0D)
        canSwing = false; 
      return canSwing;
    } 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.DARK_AQUA + "One of the Legendary 7 Swords");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Steals chakra from opponent on hit");
    par3List.add(EnumChatFormatting.GOLD + "Kenjutsu: 200");
  }
}

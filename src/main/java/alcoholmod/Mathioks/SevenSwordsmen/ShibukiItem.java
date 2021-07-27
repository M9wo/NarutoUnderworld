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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ShibukiItem extends ItemSword implements IExtendedReach {
  public int explosionRadius = 3;
  
  public boolean Explode = false;
  
  public ShibukiItem(Item.ToolMaterial mat) {
    super(mat);
    setFull3D();
    setUnlocalizedName("shibuki");
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
    par3EntityLivingBase.addPotionEffect(new PotionEffect(Potion.resistance.id, 10, 10));
    this.Explode = true;
    return false;
  }
  
  public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) {
    if (this.Explode) {
      p_77663_2_.createExplosion(p_77663_3_, p_77663_3_.posX, p_77663_3_.posY, p_77663_3_.posZ, this.explosionRadius, false);
      this.Explode = false;
    } 
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
    par3List.add(EnumChatFormatting.GOLD + "Kenjutsu: 200");
  }
}

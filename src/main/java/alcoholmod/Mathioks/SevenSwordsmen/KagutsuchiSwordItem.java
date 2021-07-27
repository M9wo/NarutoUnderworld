package alcoholmod.Mathioks.SevenSwordsmen;

import alcoholmod.Mathioks.AlcoholMod;
import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.SharinganKagutsuchiSwordThrowEntity;
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
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class KagutsuchiSwordItem extends ItemSword {
  boolean isUsing;
  
  public KagutsuchiSwordItem(Item.ToolMaterial mat) {
    super(mat);
    setFull3D();
    setUnlocalizedName("KagutsuchiSwordi");
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
  
  public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity) {
    entity.setItemInUse(itemstack, getMaxItemUseDuration(itemstack));
    if (!entity.worldObj.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(entity);
      if (props.getCurrentMana() >= 35) {
        entity.worldObj.spawnEntityInWorld((Entity)new SharinganKagutsuchiSwordThrowEntity(entity.worldObj, (EntityLivingBase)entity));
        props.consumeMana(35);
      } 
    } 
    return itemstack;
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
    float var4 = 1.0F;
    int i = (int)(par2EntityLivingBase.prevPosX + (par2EntityLivingBase.posX - par2EntityLivingBase.prevPosX) * var4);
    int j = (int)(par2EntityLivingBase.prevPosY + (par2EntityLivingBase.posY - par2EntityLivingBase.prevPosY) * var4 + 1.62D - par2EntityLivingBase.yOffset);
    int k = (int)(par2EntityLivingBase.prevPosZ + (par2EntityLivingBase.posZ - par2EntityLivingBase.prevPosZ) * var4);
    par2EntityLivingBase.addVelocity((-MathHelper.sin(par3EntityLivingBase.rotationYaw * 3.141593F / 180.0F) * j * 0.5F) / 8.0D, 0.1D, (MathHelper.cos(par3EntityLivingBase.rotationYaw * 3.141593F / 180.0F) * j * 0.5F) / 8.0D);
    return true;
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    ExtendedPlayer props = ExtendedPlayer.get(player);
    boolean canAttack = false;
    if (props.getKenjutsu() < 3.0D)
      canAttack = true; 
    if (props.getKenjutsu() >= 3.0D)
      canAttack = false; 
    return canAttack;
  }
  
  public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
    if (entityLiving instanceof EntityPlayer) {
      boolean canSwing = false;
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityLiving);
      if (props.getKenjutsu() < 3.0D)
        canSwing = true; 
      if (props.getKenjutsu() >= 3.0D)
        canSwing = false; 
      return canSwing;
    } 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.DARK_AQUA + "A sword created through Kagutsuchi");
    par3List.add(EnumChatFormatting.DARK_AQUA + "manipulation on Amaterasu fire");
    par3List.add(EnumChatFormatting.GOLD + "Kenjutsu: 100");
  }
}

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

public class KunaiBombItem extends ItemSword {
  public KunaiBombItem(Item.ToolMaterial mat) {
    super(mat);
    this.maxStackSize = 64;
    setMaxDamage(-1);
  }
  
  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
    ExtendedPlayer props = ExtendedPlayer.get(par3EntityPlayer);
    if (props.getShurikenjutsu() >= 10.0D) {
      if (!par3EntityPlayer.capabilities.isCreativeMode)
        par1ItemStack.stackSize--; 
      par2World.playSoundAtEntity((Entity)par3EntityPlayer, "random.bow", 0.5F, 0.4F / (Item.itemRand.nextFloat() * 0.4F + 0.8F));
      KunaiBombEntity kunai = new KunaiBombEntity(par2World, (EntityLivingBase)par3EntityPlayer, 2.0F);
      if (!par2World.isRemote)
        par2World.spawnEntityInWorld((Entity)kunai); 
    } 
    return par1ItemStack;
  }
  
  public EnumAction getItemUseAction(ItemStack par1ItemStack) {
    return EnumAction.block;
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    ExtendedPlayer props = ExtendedPlayer.get(player);
    boolean canAttack = false;
    if (props.getKenjutsu() < 1.25D)
      canAttack = true; 
    if (props.getKenjutsu() >= 1.25D)
      canAttack = false; 
    return canAttack;
  }
  
  public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
    boolean canSwing = false;
    if (entityLiving instanceof EntityPlayer) {
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)entityLiving);
      if (props.getKenjutsu() < 1.25D)
        canSwing = true; 
      if (props.getKenjutsu() >= 1.25D)
        canSwing = false; 
      return canSwing;
    } 
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    par3List.add(EnumChatFormatting.DARK_AQUA + "a Kunai with a paper bomb strapped");
    par3List.add(EnumChatFormatting.DARK_AQUA + "onto it, explodes with a small delay");
    par3List.add(EnumChatFormatting.GOLD + "Kenjutsu: 15");
    par3List.add(EnumChatFormatting.GOLD + "Shurikenjutsu: 10");
  }
}

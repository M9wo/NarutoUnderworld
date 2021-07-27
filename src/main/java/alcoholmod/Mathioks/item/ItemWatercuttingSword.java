package alcoholmod.Mathioks.item;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class ItemWatercuttingSword extends ItemSword {
  private boolean isinair;
  
  public ItemWatercuttingSword(Item.ToolMaterial p_i45356_1_) {
    super(p_i45356_1_);
    setMaxDamage(10);
    isDamageable();
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 10 + props.getNinjutsu() / 600) {
        Par2World.spawnEntityInWorld((Entity)new EntitySmokeGun(Par2World, Par3EntityPlayer));
        Par1ItemStack.damageItem(1, (EntityLivingBase)Par3EntityPlayer);
        props.consumeMana(10 + props.getNinjutsu() / 600);
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    par3List.add(EnumChatFormatting.DARK_AQUA + "Attack your opponent with a");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Blade made out of water");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (10 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (5 + props.getNinjutsu() / 600));
  }
}

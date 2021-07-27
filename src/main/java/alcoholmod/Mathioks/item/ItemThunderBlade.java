package alcoholmod.Mathioks.item;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class ItemThunderBlade extends ItemSword {
  public ItemThunderBlade(Item.ToolMaterial p_i45356_1_) {
    super(p_i45356_1_);
    setMaxDamage(10);
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 10 + props.getNinjutsu() / 600) {
        Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 200, 2));
        Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 200, 6));
        Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 200, 5));
        Par1ItemStack.damageItem(2, (EntityLivingBase)Par3EntityPlayer);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "A blade made out of ligthning");
    par3List.add(EnumChatFormatting.DARK_AQUA + "nature chakra");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (10 + props.getNinjutsu() / 600));
  }
}

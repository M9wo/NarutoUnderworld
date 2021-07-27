package alcoholmod.Mathioks.item;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;

public class ItemSusanooSword extends ItemSword {
  private boolean isinair;
  
  public ItemSusanooSword(Item.ToolMaterial p_i45356_1_) {
    super(p_i45356_1_);
    setMaxDamage(10);
  }
  
  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
    par2EntityLivingBase.setFire(30);
    return this.isinair;
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
    if (!player.worldObj.isRemote)
      if (stack.stackTagCompound.getString("Owner").equals(player.getCommandSenderName())) {
        ExtendedPlayer props = ExtendedPlayer.get(player);
        if (props.getCurrentMana() >= 40 + props.getSenjutsu() / 600) {
          entity.attackEntityFrom(DamageSource.causePlayerDamage(player), (13 + props.getSenjutsu() / 200));
          if (entity instanceof EntityLivingBase) {
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 2, 100));
            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 2, 100));
          } 
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("Smoke Fist!"));
          props.consumeMana(30 + props.getNinjutsu() / 600);
        } else {
          player.addChatComponentMessage((IChatComponent)new ChatComponentText("You don't have enough Senjutsu"));
        } 
      } else {
        player.addChatComponentMessage((IChatComponent)new ChatComponentText("You Are not The owner of this Item"));
      }  
    return false;
  }
}

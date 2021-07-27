package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.Entity.EntityShacklingStakesTechnique;
import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class SharinganShacklingStakesTechnique extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public SharinganShacklingStakesTechnique() {
    setMaxDamage(200);
    isDamageable();
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getSharinganActive()) {
        if (props.getCurrentMana() >= 30 + props.getGenjutsu() / 600) {
          if (props.getGenjutsu() >= 35) {
            Par2World.spawnEntityInWorld((Entity)new EntityShacklingStakesTechnique(Par2World, (EntityLivingBase)Par3EntityPlayer));
            Par1ItemStack.stackTagCompound.setInteger("counter", 140);
            props.consumeMana(30 + props.getNinjutsu() / 600);
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Demonic Illusion: Shackling Stakes Technique"));
          } else {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough Genjutsu"));
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Genjutsu Needed: 35"));
          } 
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Sharingan needs to be active"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Cast a Genjutsu that engulfs the opponent");
    par3List.add(EnumChatFormatting.DARK_AQUA + "in an illusionary world, damaging them");
    par3List.add(EnumChatFormatting.DARK_AQUA + "through illusionary spikes entering their body");
    par3List.add(EnumChatFormatting.RED + "Can only be used when Sharingan is active");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (30 + props.getGenjutsu() / 600));
    par3List.add(EnumChatFormatting.GOLD + "Damage: " + (5 + props.getGenjutsu() / 6));
  }
}

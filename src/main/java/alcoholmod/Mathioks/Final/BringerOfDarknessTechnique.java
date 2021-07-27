package alcoholmod.Mathioks.Final;

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

public class BringerOfDarknessTechnique extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
    return false;
  }
  
  public BringerOfDarknessTechnique() {
    setMaxDamage(5100);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 150 + props.getGenjutsu() / 600) {
        if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.getItemDamage() == 0) {
          Par2World.spawnEntityInWorld((Entity)new EntityBringerOfDarknessTechnique(Par2World, (EntityLivingBase)Par3EntityPlayer));
          props.consumeMana(150 + props.getGenjutsu() / 600);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Bringer-Of-Darkness Technique"));
          return Par1ItemStack;
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra"));
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    par3List.add(EnumChatFormatting.DARK_AQUA + "A high-Skill Genjutsu blinding the opponent");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (150 + props.getGenjutsu() / 600));
    par3List.add(EnumChatFormatting.GOLD + "Cooldown: 35 Seconds");
    par3List.add(EnumChatFormatting.GOLD + "Seconds Blinded: " + (40 + props.getGenjutsu()));
  }
}

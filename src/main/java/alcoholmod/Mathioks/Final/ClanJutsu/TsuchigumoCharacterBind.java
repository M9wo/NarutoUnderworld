package alcoholmod.Mathioks.Final.ClanJutsu;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class TsuchigumoCharacterBind extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public TsuchigumoCharacterBind() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getCurrentMana() >= 40 && props.getClanName().contains("Tsuchigumo")) {
        if (props.getKinjutsu() >= 30) {
          Par2World.newExplosion((Entity)Par3EntityPlayer, Par3EntityPlayer.posX, Par3EntityPlayer.posY, Par3EntityPlayer.posZ, 4.0F, true, false);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Tsuchigumo Style: Character Bind Technique!"));
        } 
        props.consumeMana(40);
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create an explosion around the user");
    par3List.add(EnumChatFormatting.DARK_AQUA + "that creates fire.");
    par3List.add(EnumChatFormatting.GOLD + "Kinjutsu: 30");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + '(');
  }
}

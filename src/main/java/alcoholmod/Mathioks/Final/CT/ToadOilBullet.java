package alcoholmod.Mathioks.Final.CT;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.JutsuItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ToadOilBullet extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ToadOilBullet() {
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote)
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
        if (props.getCurrentMana() >= 30 + props.getNinjutsu() / 600) {
          Vec3 look = Par3EntityPlayer.getLookVec();
          ToadOilEntity fireball2 = new ToadOilEntity(Par2World);
          fireball2.setPosition(Par3EntityPlayer.posX + look.xCoord * 5.0D, Par3EntityPlayer.posY + look.yCoord * 5.0D, Par3EntityPlayer.posZ + look.zCoord * 5.0D);
          fireball2.motionX = look.xCoord * 1.2D;
          fireball2.motionY = look.yCoord * 1.2D;
          fireball2.motionZ = look.zCoord * 1.2D;
          Par2World.spawnEntityInWorld((Entity)fireball2);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Toad Oil Bullet Jutsu!!"));
          props.consumeMana(30 + props.getNinjutsu() / 600);
        } else {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You do not have enough chakra!"));
        } 
      } else {
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("You are not the owner of this jutsu"));
      }  
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "A jutsu based off of one of the legendary");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Sannin. Spit out a big ball of highly");
    par3List.add(EnumChatFormatting.DARK_AQUA + "flammable toad Oil that slows down the opponent");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (30 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + '\b');
  }
}

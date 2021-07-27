package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class FireReleaseFireBallJutsu extends JutsuItem {
  private boolean isinair;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public FireReleaseFireBallJutsu() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getFireRelease() == 1)
        if (props.getCurrentMana() >= 10 + props.getNinjutsu() / 600) {
          Vec3 look = Par3EntityPlayer.getLookVec();
          EntityLargeFireball fireball2 = new EntityLargeFireball(Par2World, (EntityLivingBase)Par3EntityPlayer, 1.0D, 1.0D, 1.0D);
          fireball2.setPosition(Par3EntityPlayer.posX + look.xCoord * 5.0D, Par3EntityPlayer.posY + look.yCoord * 5.0D, Par3EntityPlayer.posZ + look.zCoord * 5.0D);
          fireball2.accelerationX = look.xCoord * 0.3D;
          fireball2.accelerationY = look.yCoord * 0.3D;
          fireball2.accelerationZ = look.zCoord * 0.3D;
          Par2World.spawnEntityInWorld((Entity)fireball2);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Fire-Ball Jutsu!"));
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
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Breath out a fireball");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (10 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (6 + props.getNinjutsu() / 600));
  }
}

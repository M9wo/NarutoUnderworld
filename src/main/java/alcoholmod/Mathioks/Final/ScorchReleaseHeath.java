package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.ScorchReleaseHeathEntity;
import alcoholmod.Mathioks.Final.CT.ScorchReleaseHeathEntity2;
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

public class ScorchReleaseHeath extends JutsuItem {
  int counter;
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ScorchReleaseHeath() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getscorchRelease() == 1 && Par1ItemStack.stackTagCompound.getInteger("counter") == 0)
        if (props.getCurrentMana() >= 50 + props.getNinjutsu() / 600) {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Suns Heath Vortex Meadow!"));
          ScorchReleaseHeathEntity fireball2 = new ScorchReleaseHeathEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball2.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 1.0D, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball2);
          ScorchReleaseHeathEntity2 fireball1 = new ScorchReleaseHeathEntity2(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball1.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 10.0D, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball1);
          Par1ItemStack.stackTagCompound.setInteger("counter", 100);
          props.consumeMana(50 + props.getNinjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create 2 Scorching balls with");
    par3List.add(EnumChatFormatting.DARK_AQUA + "opposite wind propulsion");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (50 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Explosion + Damage: " + (10 + props.getNinjutsu() / 600));
  }
}
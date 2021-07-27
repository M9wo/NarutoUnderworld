package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.ScorchReleaseSetupEntity;
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

public class ScorchReleaseSetup extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ScorchReleaseSetup() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getscorchRelease() == 1 && Par1ItemStack.stackTagCompound.getInteger("counter") == 0)
        if (props.getCurrentMana() >= 15 + props.getNinjutsu() / 600) {
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Ring of Suns!"));
          ScorchReleaseSetupEntity fireball2 = new ScorchReleaseSetupEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball2.setPosition(Par3EntityPlayer.posX + 1.0D, Par3EntityPlayer.posY + 2.0D, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball2);
          ScorchReleaseSetupEntity fireball1 = new ScorchReleaseSetupEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball1.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 2.0D, Par3EntityPlayer.posZ + 1.0D);
          Par2World.spawnEntityInWorld((Entity)fireball1);
          ScorchReleaseSetupEntity fireball3 = new ScorchReleaseSetupEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball3.setPosition(Par3EntityPlayer.posX - 1.0D, Par3EntityPlayer.posY + 2.0D, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball3);
          ScorchReleaseSetupEntity fireball4 = new ScorchReleaseSetupEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball4.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 2.0D, Par3EntityPlayer.posZ - 1.0D);
          Par2World.spawnEntityInWorld((Entity)fireball4);
          Par1ItemStack.stackTagCompound.setInteger("counter", 54);
          props.consumeMana(15 + props.getNinjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create 4 scorching balls that go up");
    par3List.add(EnumChatFormatting.DARK_AQUA + "to generate wind, then fly forward");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (7 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (15 + props.getNinjutsu() / 600));
  }
}

package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import alcoholmod.Mathioks.Final.CT.ScorchReleaseMultipleSunsEntity;
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

public class ScorchReleaseMultipleFallingSuns extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public ScorchReleaseMultipleFallingSuns() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName()) && Par1ItemStack.stackTagCompound.getInteger("counter") == 0) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getscorchRelease() == 1)
        if (props.getCurrentMana() >= 45 + props.getNinjutsu() / 600) {
          Par1ItemStack.stackTagCompound.setInteger("counter", 400);
          Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Multiple Falling Suns!"));
          ScorchReleaseMultipleSunsEntity fireball2 = new ScorchReleaseMultipleSunsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball2.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 50.0D, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball2);
          ScorchReleaseMultipleSunsEntity fireball1 = new ScorchReleaseMultipleSunsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball1.setPosition(Par3EntityPlayer.posX + 10.0D, Par3EntityPlayer.posY + 50.0D, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball1);
          ScorchReleaseMultipleSunsEntity fireball3 = new ScorchReleaseMultipleSunsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball3.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 50.0D, Par3EntityPlayer.posZ + 10.0D);
          Par2World.spawnEntityInWorld((Entity)fireball3);
          ScorchReleaseMultipleSunsEntity fireball4 = new ScorchReleaseMultipleSunsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball4.setPosition(Par3EntityPlayer.posX + 10.0D, Par3EntityPlayer.posY + 50.0D, Par3EntityPlayer.posZ + 10.0D);
          Par2World.spawnEntityInWorld((Entity)fireball4);
          ScorchReleaseMultipleSunsEntity fireball5 = new ScorchReleaseMultipleSunsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball5.setPosition(Par3EntityPlayer.posX - 10.0D, Par3EntityPlayer.posY + 50.0D, Par3EntityPlayer.posZ);
          Par2World.spawnEntityInWorld((Entity)fireball5);
          ScorchReleaseMultipleSunsEntity fireball6 = new ScorchReleaseMultipleSunsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball6.setPosition(Par3EntityPlayer.posX, Par3EntityPlayer.posY + 50.0D, Par3EntityPlayer.posZ - 10.0D);
          Par2World.spawnEntityInWorld((Entity)fireball6);
          ScorchReleaseMultipleSunsEntity fireball7 = new ScorchReleaseMultipleSunsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball7.setPosition(Par3EntityPlayer.posX - 10.0D, Par3EntityPlayer.posY + 50.0D, Par3EntityPlayer.posZ - 10.0D);
          Par2World.spawnEntityInWorld((Entity)fireball7);
          ScorchReleaseMultipleSunsEntity fireball8 = new ScorchReleaseMultipleSunsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball8.setPosition(Par3EntityPlayer.posX + 10.0D, Par3EntityPlayer.posY + 50.0D, Par3EntityPlayer.posZ - 10.0D);
          Par2World.spawnEntityInWorld((Entity)fireball8);
          ScorchReleaseMultipleSunsEntity fireball9 = new ScorchReleaseMultipleSunsEntity(Par2World, (EntityLivingBase)Par3EntityPlayer);
          fireball9.setPosition(Par3EntityPlayer.posX - 10.0D, Par3EntityPlayer.posY + 50.0D, Par3EntityPlayer.posZ + 10.0D);
          Par2World.spawnEntityInWorld((Entity)fireball9);
          props.consumeMana(45 + props.getNinjutsu() / 600);
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create 9 small suns that drop down,");
    par3List.add(EnumChatFormatting.DARK_AQUA + "causing the area to be set ablaze");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (45 + props.getNinjutsu() / 600));
    par3List.add(EnumChatFormatting.DARK_RED + "Damage: " + (9 + props.getNinjutsu() / 600));
  }
}

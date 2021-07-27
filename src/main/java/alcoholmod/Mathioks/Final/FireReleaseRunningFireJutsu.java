package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class FireReleaseRunningFireJutsu extends JutsuItem {
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public FireReleaseRunningFireJutsu() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (props.getFireRelease() == 1 && props.getCurrentMana() >= 10 + props.getNinjutsu() / 600) {
        Par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 100, 1));
        int i = (int)Par3EntityPlayer.posX;
        int j = (int)Par3EntityPlayer.posY;
        int k = (int)Par3EntityPlayer.posZ;
        if (Par2World.isAirBlock(i - 3, j, k + 3))
          Par2World.setBlock(i - 3, j, k + 3, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 3, j, k + 2))
          Par2World.setBlock(i - 3, j, k + 2, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 3, j, k + 1))
          Par2World.setBlock(i - 3, j, k + 1, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 3, j, k))
          Par2World.setBlock(i - 3, j, k, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 3, j, k - 1))
          Par2World.setBlock(i - 3, j, k - 1, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 3, j, k - 2))
          Par2World.setBlock(i - 3, j, k - 2, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 3, j, k - 3))
          Par2World.setBlock(i - 3, j, k - 3, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 2, j, k + 3))
          Par2World.setBlock(i - 2, j, k + 3, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 2, j, k + 2))
          Par2World.setBlock(i - 2, j, k + 2, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 2, j, k + 1))
          Par2World.setBlock(i - 2, j, k + 1, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 2, j, k))
          Par2World.setBlock(i - 2, j, k, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 2, j, k - 1))
          Par2World.setBlock(i - 2, j, k - 1, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 2, j, k - 2))
          Par2World.setBlock(i - 2, j, k - 2, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 2, j, k - 3))
          Par2World.setBlock(i - 2, j, k - 3, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 1, j, k + 3))
          Par2World.setBlock(i - 1, j, k + 3, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 1, j, k + 2))
          Par2World.setBlock(i - 1, j, k + 2, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 1, j, k - 2))
          Par2World.setBlock(i - 1, j, k - 2, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i - 1, j, k - 3))
          Par2World.setBlock(i - 1, j, k - 3, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i, j, k + 3))
          Par2World.setBlock(i, j, k + 3, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i, j, k + 2))
          Par2World.setBlock(i, j, k + 2, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i, j, k - 2))
          Par2World.setBlock(i, j, k - 2, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i, j, k - 3))
          Par2World.setBlock(i, j, k - 3, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 1, j, k + 3))
          Par2World.setBlock(i + 1, j, k + 3, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 1, j, k + 2))
          Par2World.setBlock(i + 1, j, k + 2, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 1, j, k - 2))
          Par2World.setBlock(i + 1, j, k - 2, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 1, j, k - 3))
          Par2World.setBlock(i + 1, j, k - 3, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 2, j, k + 3))
          Par2World.setBlock(i + 2, j, k + 3, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 2, j, k + 2))
          Par2World.setBlock(i + 2, j, k + 2, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 2, j, k + 1))
          Par2World.setBlock(i + 2, j, k + 1, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 2, j, k))
          Par2World.setBlock(i + 2, j, k, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 2, j, k - 1))
          Par2World.setBlock(i + 2, j, k - 1, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 2, j, k - 2))
          Par2World.setBlock(i + 2, j, k - 2, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 2, j, k - 3))
          Par2World.setBlock(i + 2, j, k - 3, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 3, j, k + 3))
          Par2World.setBlock(i + 3, j, k + 3, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 3, j, k + 2))
          Par2World.setBlock(i + 3, j, k + 2, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 3, j, k + 1))
          Par2World.setBlock(i + 3, j, k + 1, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 3, j, k))
          Par2World.setBlock(i + 3, j, k, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 3, j, k - 1))
          Par2World.setBlock(i + 3, j, k - 1, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 3, j, k - 2))
          Par2World.setBlock(i + 3, j, k - 2, (Block)Blocks.fire); 
        if (Par2World.isAirBlock(i + 3, j, k - 3))
          Par2World.setBlock(i + 3, j, k - 3, (Block)Blocks.fire); 
        Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Fire Release: Running Fire!"));
        props.consumeMana(10 + props.getNinjutsu() / 600);
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Encircle yourself with fire");
    par3List.add(EnumChatFormatting.DARK_AQUA + "Gives the user a short Fire Resistance");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + (10 + props.getNinjutsu() / 600));
  }
}

package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.BlockSapling;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class WoodReleaseTallTrees extends JutsuItem {
  private boolean isinair;
  
  public int[][] blockPos = new int[40][3];
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public WoodReleaseTallTrees() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World Par2World, Entity Par3EntityPlayer, int par4, boolean par5) {
    if ((EntityPlayer)Par3EntityPlayer != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)Par3EntityPlayer).getCommandSenderName());
      par1ItemStack.stackTagCompound.setInteger("counter", 0);
      par1ItemStack.stackTagCompound.setInteger("counter1", 0);
      par1ItemStack.stackTagCompound.setInteger("counter2", 0);
      par1ItemStack.stackTagCompound.setInteger("counter3", 0);
    } 
  }
  
  public ItemStack onItemRightClick(ItemStack Par1ItemStack, World Par2World, EntityPlayer Par3EntityPlayer) {
    if (!Par2World.isRemote) {
      ExtendedPlayer props = ExtendedPlayer.get(Par3EntityPlayer);
      if (Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
        int counter1 = Par1ItemStack.stackTagCompound.getInteger("counter1");
        int counter2 = Par1ItemStack.stackTagCompound.getInteger("counter2");
        int counter3 = Par1ItemStack.stackTagCompound.getInteger("counter3");
        if (props.getwoodRelease() == 1 && props.getCurrentMana() >= 45) {
          int x = MathHelper.floor_double(Par3EntityPlayer.posX) - 15 + Par2World.rand.nextInt(30);
          int y = MathHelper.floor_double(Par3EntityPlayer.posY) - 2 + Par2World.rand.nextInt(4);
          int z = MathHelper.floor_double(Par3EntityPlayer.posZ) - 15 + Par2World.rand.nextInt(30);
          if (Par2World.isBlockNormalCubeDefault(x, y, z, false) && Par2World.isAirBlock(x, y + 1, z) && Par2World.isBlockNormalCubeDefault(x + 1, y, z, false) && Par2World.isAirBlock(x + 1, y + 1, z) && Par2World.isBlockNormalCubeDefault(x, y, z + 1, false) && Par2World.isAirBlock(x, y + 1, z + 1) && Par2World.isBlockNormalCubeDefault(x + 1, y, z + 1, false) && Par2World.isAirBlock(x + 1, y + 1, z + 1) && !Par2World.isRemote) {
            Par2World.setBlock(x, y, z, Blocks.dirt, 0, 4);
            Par2World.setBlock(x + 1, y, z, Blocks.dirt, 0, 4);
            Par2World.setBlock(x, y, z + 1, Blocks.dirt, 0, 4);
            Par2World.setBlock(x + 1, y, z + 1, Blocks.dirt, 0, 4);
            Par2World.setBlock(x, y + 1, z, Blocks.sapling, 3, 4);
            Par2World.setBlock(x + 1, y + 1, z, Blocks.sapling, 3, 4);
            Par2World.setBlock(x, y + 1, z + 1, Blocks.sapling, 3, 4);
            Par2World.setBlock(x + 1, y + 1, z + 1, Blocks.sapling, 3, 4);
            for (int i1 = 0; i1 <= 10; i1++)
              ((BlockSapling)Blocks.sapling).func_149878_d(Par2World, x, y + 1, z, Par2World.rand); 
            ((BlockSapling)Blocks.sapling).func_149878_d(Par2World, x, y + 1, z, Par2World.rand);
            props.consumeMana(45);
          } 
        } 
      } 
    } 
    return Par1ItemStack;
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
    ExtendedPlayer props = ExtendedPlayer.get(par2EntityPlayer);
    if (par1ItemStack.stackTagCompound != null)
      par3List.add(EnumChatFormatting.AQUA + "Owner: " + par1ItemStack.stackTagCompound.getString("Owner")); 
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create Tall Trees");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + '-');
  }
}

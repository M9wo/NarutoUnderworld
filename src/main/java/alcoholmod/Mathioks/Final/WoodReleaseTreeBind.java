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
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class WoodReleaseTreeBind extends JutsuItem {
  private boolean isinair;
  
  public int[][] blockPos = new int[40][3];
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public WoodReleaseTreeBind() {
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
    int counter1 = par1ItemStack.stackTagCompound.getInteger("counter1");
    int counter2 = par1ItemStack.stackTagCompound.getInteger("counter2");
    if (counter1 > 0) {
      counter1--;
      par1ItemStack.stackTagCompound.setInteger("counter1", counter1);
    } else if (counter2 > 0) {
      counter2--;
      par1ItemStack.stackTagCompound.setInteger("counter2", counter2);
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
          if (counter2 == 0) {
            Par3EntityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText("Wood Release: Tree Bind Flourishing Burial!!"));
            counter2 += 200;
            Par1ItemStack.stackTagCompound.setInteger("counter2", counter2);
            props.consumeMana(1);
          } 
          for (int i = 0; i <= 5; i++) {
            int x = MathHelper.floor_double(Par3EntityPlayer.posX) - 15 + Par2World.rand.nextInt(30);
            int y = MathHelper.floor_double(Par3EntityPlayer.posY) - 2 + Par2World.rand.nextInt(4);
            int z = MathHelper.floor_double(Par3EntityPlayer.posZ) - 15 + Par2World.rand.nextInt(30);
            if (Par2World.isBlockNormalCubeDefault(x, y, z, false) && Par2World.isAirBlock(x, y + 1, z)) {
              if (!Par2World.isRemote) {
                Par2World.setBlock(x, y, z, Blocks.dirt, 0, 2);
                Par2World.setBlock(x, y + 1, z, Blocks.sapling, 0, 2);
                for (int i0 = 0; i0 <= 10; i0++)
                  ((BlockSapling)Blocks.sapling).func_149878_d(Par2World, x, y + 1, z, Par2World.rand); 
              } 
              counter3++;
              Par1ItemStack.stackTagCompound.setInteger("counter3", counter3);
              if (counter3 >= 29) {
                props.consumeMana(1);
                counter3 = 0;
                Par1ItemStack.stackTagCompound.setInteger("counter3", counter3);
              } 
            } 
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
    par3List.add(EnumChatFormatting.DARK_AQUA + "Create binding trees");
    par3List.add(EnumChatFormatting.GOLD + "Chakra Cost: " + '-');
  }
}

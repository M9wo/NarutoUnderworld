package alcoholmod.Mathioks.Final;

import alcoholmod.Mathioks.ExtendedPlayer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class WoodReleaseNativity extends JutsuItem {
  private boolean isinair;
  
  public int[][] blockPos = new int[40][3];
  
  @SideOnly(Side.CLIENT)
  public EnumRarity getRarity(ItemStack par1ItemStack) {
    return EnumRarity.epic;
  }
  
  public WoodReleaseNativity() {
    setMaxDamage(3700);
    this.maxStackSize = 1;
  }
  
  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
    if ((EntityPlayer)par3Entity != null && par1ItemStack.stackTagCompound == null) {
      par1ItemStack.stackTagCompound = new NBTTagCompound();
      par1ItemStack.stackTagCompound.setString("Owner", ((EntityPlayer)par3Entity).getCommandSenderName());
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
      if (props.getwoodRelease() == 1 && Par1ItemStack.stackTagCompound.getString("Owner").equals(Par3EntityPlayer.getCommandSenderName())) {
        int counter = Par1ItemStack.stackTagCompound.getInteger("counter");
        int counter1 = Par1ItemStack.stackTagCompound.getInteger("counter1");
        int counter2 = Par1ItemStack.stackTagCompound.getInteger("counter2");
        int counter3 = Par1ItemStack.stackTagCompound.getInteger("counter3");
        if (props.getwoodRelease() == 1 && props.getCurrentMana() >= 45) {
          makeWindingWood(Par2World, (EntityLivingBase)Par3EntityPlayer, counter);
          counter++;
          Par1ItemStack.stackTagCompound.setInteger("counter", counter);
          props.consumeMana(5);
        } 
      } 
    } 
    return Par1ItemStack;
  }
  
  public void makeWindingWood(World world, EntityLivingBase entity, int count) {
    if (!world.isRemote)
      for (int i = 0; i < 40; i++) {
        if (count != 0) {
          int i0 = this.blockPos[i][0];
          int i1 = this.blockPos[i][1];
          int i2 = this.blockPos[i][2];
          switch (world.rand.nextInt(13)) {
            case 0:
              i1--;
              break;
            case 1:
              i1--;
              break;
            case 2:
              i0++;
              break;
            case 3:
              i0++;
              break;
            case 4:
              i0--;
              break;
            case 5:
              i0--;
              break;
            case 6:
              i2++;
              break;
            case 7:
              i2++;
              break;
            case 8:
              i2--;
              break;
            case 9:
              i2--;
              break;
            case 10:
              i1++;
              break;
            case 11:
              i1++;
              break;
            case 12:
              i1++;
              break;
          } 
          this.blockPos[i][0] = i0;
          this.blockPos[i][1] = i1;
          this.blockPos[i][2] = i2;
        } else {
          int i0 = MathHelper.floor_double(entity.posX);
          int i1 = MathHelper.floor_double(entity.posY);
          int i2;
          for (i2 = MathHelper.floor_double(entity.posZ); world.isAirBlock(i0, i1, i2); i1--);
          this.blockPos[i][0] = i0 - 40 + world.rand.nextInt(80);
          this.blockPos[i][1] = i1;
          this.blockPos[i][2] = i2 - 40 + world.rand.nextInt(80);
        } 
        world.setBlock(this.blockPos[i][0], this.blockPos[i][1], this.blockPos[i][2], Blocks.log, 0, 2);
        world.setBlock(this.blockPos[i][0] + 1, this.blockPos[i][1], this.blockPos[i][2], Blocks.log, 0, 2);
        world.setBlock(this.blockPos[i][0], this.blockPos[i][1], this.blockPos[i][2] + 1, Blocks.log, 0, 2);
        world.setBlock(this.blockPos[i][0] + 1, this.blockPos[i][1], this.blockPos[i][2] + 1, Blocks.log, 0, 2);
        if (world.rand.nextInt(7) == 0)
          for (byte b = 0; b < 6; b++) {
            for (byte b1 = 0; b1 < 6; b1++) {
              for (byte b2 = 0; b2 < 6; b2++) {
                if (world.rand.nextBoolean() && world.isAirBlock(this.blockPos[i][0] - 2 + b, this.blockPos[i][1] - 2 + b1, this.blockPos[i][2] - 2 + b2))
                  world.setBlock(this.blockPos[i][0] - 2 + b, this.blockPos[i][1] - 2 + b1, this.blockPos[i][2] - 2 + b2, (Block)Blocks.leaves, 0, 2); 
              } 
            } 
          }  
      }  
  }
}
